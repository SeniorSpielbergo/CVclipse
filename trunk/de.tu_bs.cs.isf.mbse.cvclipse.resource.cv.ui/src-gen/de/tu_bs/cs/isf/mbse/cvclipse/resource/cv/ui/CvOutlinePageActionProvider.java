/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

public class CvOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
