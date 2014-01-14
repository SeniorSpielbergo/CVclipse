package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

import java.io.File;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBuilder;

public class CvBuilder implements ICvBuilder {
	
	public boolean isBuildingNeeded(URI uri) {
		return true;
	}
	
	public IStatus build(CvResource resource, IProgressMonitor monitor) {
		EList<EObject> contents = resource.getContents();
		
		if (resource.getErrors().size() == 0) {
			if (contents.get(0) instanceof Application) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				File file = new File(workspace.getRoot().getLocation() + resource.getURI().toString().replace("platform:/resource", ""));
				M2T m2t = new M2T();
				m2t.generate(file.getParent(), file.getName().replace(".cv", ""));
			}
		}
		return Status.CANCEL_STATUS;
	}
	
	/**
	 * Handles the deletion of the given resource.
	 */
	public IStatus handleDeletion(URI uri, IProgressMonitor monitor) {
		return Status.OK_STATUS;
	}
	
}
