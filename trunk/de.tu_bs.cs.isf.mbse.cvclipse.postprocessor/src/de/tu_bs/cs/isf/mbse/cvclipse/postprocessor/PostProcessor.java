package de.tu_bs.cs.isf.mbse.cvclipse.postprocessor;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;

import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.Block;
import de.tu_bs.cs.isf.mbse.cvclipse.Item;
import de.tu_bs.cs.isf.mbse.cvclipse.Language;
import de.tu_bs.cs.isf.mbse.cvclipse.Text;
import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptionProvider;
import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions;
import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvResourcePostProcessor;
import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvResourcePostProcessorProvider;
import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResource;

public class PostProcessor implements ICvOptionProvider,
ICvResourcePostProcessorProvider,
ICvResourcePostProcessor {

	public PostProcessor() {
	}

	@Override
	public Map<?, ?> getOptions() {
		return Collections.singletonMap(ICvOptions.RESOURCE_POSTPROCESSOR_PROVIDER, this); 
	}

	@Override
	public void process(CvResource resource) {
		Application app = (Application) resource.getContents().get(0);
		parseStyle(app.getLetter().getClosing());
		parseStyle(app.getLetter().getEnclosure());
		parseStyle(app.getLetter().getOpening());
		parseStyle(app.getLetter().getText());

		for(Block b : app.getCv().getBlocks()) {
			parseStyle(b.getTitle());
			for(Item i : b.getItems()) {
				parseStyle(i.getRightContent());
			}
		}
	}

	private void parseStyle(EMap<Language,Text> textMap) {
		for(Language l : textMap.keySet()) {
			String s = textMap.get(l).getContent();
			s = s.replace("<bold>", "\\textbf{");
			s = s.replace("</bold>", "}");
			s = s.replace("<italic>", "\\textit{");
			s = s.replace("</italic>", "}");
			textMap.get(l).setContent(s);
		}
	}

	@Override
	public void terminate() {

	}

	@Override
	public ICvResourcePostProcessor getResourcePostProcessor() {
		return this;
	}

}
