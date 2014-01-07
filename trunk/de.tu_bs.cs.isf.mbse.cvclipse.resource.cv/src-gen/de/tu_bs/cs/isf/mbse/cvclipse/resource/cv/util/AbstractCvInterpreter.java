/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractCvInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvInterpreterListener> listeners = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.CV) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_CV((de.tu_bs.cs.isf.mbse.cvclipse.CV) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.Letter) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter((de.tu_bs.cs.isf.mbse.cvclipse.Letter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.Application) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Application((de.tu_bs.cs.isf.mbse.cvclipse.Application) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation((de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.EducationBlock) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_EducationBlock((de.tu_bs.cs.isf.mbse.cvclipse.EducationBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.HobbyBlock) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_HobbyBlock((de.tu_bs.cs.isf.mbse.cvclipse.HobbyBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.LanguageBlock) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_LanguageBlock((de.tu_bs.cs.isf.mbse.cvclipse.LanguageBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.ListBlock) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock((de.tu_bs.cs.isf.mbse.cvclipse.ListBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalTrainingBlock) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ProfessionalTrainingBlock((de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalTrainingBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.Block) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Block((de.tu_bs.cs.isf.mbse.cvclipse.Block) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.BoldText) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_BoldText((de.tu_bs.cs.isf.mbse.cvclipse.BoldText) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.ItalicText) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ItalicText((de.tu_bs.cs.isf.mbse.cvclipse.ItalicText) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.BoldItalicText) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_BoldItalicText((de.tu_bs.cs.isf.mbse.cvclipse.BoldItalicText) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.Text) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Text((de.tu_bs.cs.isf.mbse.cvclipse.Text) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalExperienceBlock) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ProfessionalExperienceBlock((de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalExperienceBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock((de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.LineBreak) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_LineBreak((de.tu_bs.cs.isf.mbse.cvclipse.LineBreak) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.DateItem) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem((de.tu_bs.cs.isf.mbse.cvclipse.DateItem) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.TextItem) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem((de.tu_bs.cs.isf.mbse.cvclipse.TextItem) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.Item) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Item((de.tu_bs.cs.isf.mbse.cvclipse.Item) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.Date) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Date((de.tu_bs.cs.isf.mbse.cvclipse.Date) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof java.util.Map.Entry<?,?>) {
			result = interprete_java_util_Map_Entry((java.util.Map.Entry<?,?>) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_CV(de.tu_bs.cs.isf.mbse.cvclipse.CV cV, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter(de.tu_bs.cs.isf.mbse.cvclipse.Letter letter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Application(de.tu_bs.cs.isf.mbse.cvclipse.Application application, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation personalInformation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Block(de.tu_bs.cs.isf.mbse.cvclipse.Block block, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Text(de.tu_bs.cs.isf.mbse.cvclipse.Text text, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_BoldText(de.tu_bs.cs.isf.mbse.cvclipse.BoldText boldText, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ItalicText(de.tu_bs.cs.isf.mbse.cvclipse.ItalicText italicText, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_BoldItalicText(de.tu_bs.cs.isf.mbse.cvclipse.BoldItalicText boldItalicText, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_EducationBlock(de.tu_bs.cs.isf.mbse.cvclipse.EducationBlock educationBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_HobbyBlock(de.tu_bs.cs.isf.mbse.cvclipse.HobbyBlock hobbyBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ProfessionalExperienceBlock(de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalExperienceBlock professionalExperienceBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_LanguageBlock(de.tu_bs.cs.isf.mbse.cvclipse.LanguageBlock languageBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock(de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock itemBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock(de.tu_bs.cs.isf.mbse.cvclipse.ListBlock listBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_LineBreak(de.tu_bs.cs.isf.mbse.cvclipse.LineBreak lineBreak, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Item(de.tu_bs.cs.isf.mbse.cvclipse.Item item, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_ProfessionalTrainingBlock(de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalTrainingBlock professionalTrainingBlock, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem(de.tu_bs.cs.isf.mbse.cvclipse.DateItem dateItem, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem(de.tu_bs.cs.isf.mbse.cvclipse.TextItem textItem, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_cvclipse_Date(de.tu_bs.cs.isf.mbse.cvclipse.Date date, ContextType context) {
		return null;
	}
	
	public ResultType interprete_java_util_Map_Entry(java.util.Map.Entry<?,?> languageToTextMapEntry, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
