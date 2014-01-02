/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

public class CvOutlinePageCollapseAllAction extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.AbstractCvOutlinePageAction {
	
	public CvOutlinePageCollapseAllAction(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
