/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

public class CvOutlinePageAutoExpandAction extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.AbstractCvOutlinePageAction {
	
	public CvOutlinePageAutoExpandAction(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
