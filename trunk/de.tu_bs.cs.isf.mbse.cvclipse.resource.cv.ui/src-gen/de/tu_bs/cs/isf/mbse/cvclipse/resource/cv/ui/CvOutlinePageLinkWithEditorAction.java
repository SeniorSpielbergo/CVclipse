/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

public class CvOutlinePageLinkWithEditorAction extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.AbstractCvOutlinePageAction {
	
	public CvOutlinePageLinkWithEditorAction(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
