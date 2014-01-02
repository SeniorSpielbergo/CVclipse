package de.tu_bs.cs.isf.mbse.cvclipse;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResourceFactory;

public class Generator {

	private static String folder = "/home/david/runtime-EclipseApplication/CV/";

	public static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
				).put("cv", new CvResourceFactory());

		ResourceSet rs = new ResourceSetImpl();
		File orig = new File(folder + "test.cv");
		URI uri = URI.createFileURI(orig.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
		Application model = (Application) resource.getContents().get(0);
		System.out.println(model.getStyle().getName());
	}

}
