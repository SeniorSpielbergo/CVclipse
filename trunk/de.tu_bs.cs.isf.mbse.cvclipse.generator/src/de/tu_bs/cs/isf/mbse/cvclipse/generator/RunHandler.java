package de.tu_bs.cs.isf.mbse.cvclipse.generator;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.handlers.HandlerUtil;

public class RunHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		showConsole();
		Console.clear();
		List<String> inputs = new LinkedList<String>();
		
		IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection("org.eclipse.jdt.ui.PackageExplorer");
		
		for(Object o : selection.toArray()){
			if(o instanceof IFile){
				IFile f = (IFile) o;
				
				if (f.getLocation().toFile().getName().endsWith(".cv")) {
					inputs.add(f.getLocation().toPortableString());
				}
			}
		}
		
		if (inputs.size() == 0) {
			showErrorDialog(event, "No *.cv file selected in package explorer.");
			return null;
		}
		
		M2T m2t = new M2T();
		for(String fileName : inputs) {
			File file = new File(fileName);
			m2t.generate(file.getParent(), file.getName().replace(".cv", ""));
		}
		
		return null;
	}

	private void showErrorDialog(ExecutionEvent event, String message) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"An error occured!",
				message);
	}
	
	private void showConsole() {
		IWorkbench wb = PlatformUI.getWorkbench();

		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();

		IConsole myConsole = Console.getConsole();
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			view = (IConsoleView) page.showView(id);
			view.display(myConsole);
		}
		catch (PartInitException e1) {
			e1.printStackTrace();
			return;
		}
	}

}
