// $ANTLR 3.4

	package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CvParser extends CvANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "QUOTED_34_34", "SL_COMMENT", "TEXT", "WHITESPACE", "','", "'-'", "'/'", "':'", "'attention'", "'banking'", "'birthdate'", "'birthname'", "'birthplace'", "'black'", "'block'", "'blue'", "'casual'", "'city'", "'classic'", "'closing'", "'color'", "'company'", "'country'", "'cv'", "'date'", "'email'", "'enclosure'", "'english'", "'fax'", "'firstname'", "'french'", "'german'", "'github'", "'green'", "'grey'", "'languages'", "'letter'", "'linkedin'", "'list'", "'marital status'", "'mobile'", "'nationality'", "'oldstyle'", "'opening'", "'options'", "'orange'", "'personal'", "'phone'", "'picture'", "'place'", "'purple'", "'recipient'", "'red'", "'spanish'", "'street'", "'style'", "'surname'", "'text'", "'title'", "'twitter'", "'website'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int LINEBREAK=4;
    public static final int QUOTED_34_34=5;
    public static final int SL_COMMENT=6;
    public static final int TEXT=7;
    public static final int WHITESPACE=8;

    // delegates
    public CvANTLRParserBase[] getDelegates() {
        return new CvANTLRParserBase[] {};
    }

    // delegators


    public CvParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CvParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(87 + 1);
         

    }

    public String[] getTokenNames() { return CvParser.tokenNames; }
    public String getGrammarFileName() { return "Cv.g"; }


    	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolverFactory tokenResolverFactory = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal> expectedElements = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvProblem() {
    					public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity getSeverity() {
    						return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity.ERROR;
    					}
    					public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType getType() {
    						return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement terminal = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvFollowSetProvider.TERMINALS[terminalID];
    		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[] containmentFeatures = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvFollowSetProvider.LINKS[ids[i]];
    		}
    		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvContainmentTrace containmentTrace = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal expectedElement = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource) {
    				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource) {
    				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource) {
    				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new CvParser(new org.antlr.runtime3_4_0.CommonTokenStream(new CvLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new CvParser(new org.antlr.runtime3_4_0.CommonTokenStream(new CvLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public CvParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((CvLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((CvLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.Application.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.Letter.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.CV.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.ListBlock.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.TextItem.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.DateItem.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.Date.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date();
    			}
    			if (type.getInstanceClass() == java.util.Map.Entry.class) {
    				return parse_java_util_Map_Entry();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.cvclipse.Text.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text();
    			}
    		}
    		throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>>();
    		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvParseResult parseResult = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal>();
    		java.util.List<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal> newFollowSet = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 216;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvPair<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvPair<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[]> newFollowerPair : newFollowers) {
    							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvContainmentTrace containmentTrace = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvContainmentTrace(null, newFollowerPair.getRight());
    							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal newFollowTerminal = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Cv.g:529:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        de.tu_bs.cs.isf.mbse.cvclipse.Application c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Cv.g:530:2: ( (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application ) EOF )
            // Cv.g:531:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Cv.g:536:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application )
            // Cv.g:537:3: c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application
            {
            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_in_start82);
            c0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application"
    // Cv.g:545:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application returns [de.tu_bs.cs.isf.mbse.cvclipse.Application element = null] : a0= 'options' (a1= 'languages' a2= ':' ( (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' ) ) ( (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) ) )* ) ( (a16= 'style' a17= ':' ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) ) ) )? ( (a24= 'color' a25= ':' ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) ) ) )? ( (a35= 'place' a36= ':' (a37= QUOTED_34_34 ) ) )? ( (a38= 'date' a39= ':' (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )? ( (a41_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation ) ) ( ( (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter ) | (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV ) ) )* ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.Application parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.Application element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a24=null;
        Token a25=null;
        Token a26=null;
        Token a27=null;
        Token a28=null;
        Token a29=null;
        Token a30=null;
        Token a31=null;
        Token a32=null;
        Token a35=null;
        Token a36=null;
        Token a37=null;
        Token a38=null;
        Token a39=null;
        de.tu_bs.cs.isf.mbse.cvclipse.Date a40_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation a41_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.Letter a42_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.CV a43_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Cv.g:548:2: (a0= 'options' (a1= 'languages' a2= ':' ( (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' ) ) ( (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) ) )* ) ( (a16= 'style' a17= ':' ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) ) ) )? ( (a24= 'color' a25= ':' ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) ) ) )? ( (a35= 'place' a36= ':' (a37= QUOTED_34_34 ) ) )? ( (a38= 'date' a39= ':' (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )? ( (a41_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation ) ) ( ( (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter ) | (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV ) ) )* )
            // Cv.g:549:2: a0= 'options' (a1= 'languages' a2= ':' ( (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' ) ) ( (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) ) )* ) ( (a16= 'style' a17= ':' ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) ) ) )? ( (a24= 'color' a25= ':' ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) ) ) )? ( (a35= 'place' a36= ':' (a37= QUOTED_34_34 ) ) )? ( (a38= 'date' a39= ':' (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )? ( (a41_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation ) ) ( ( (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter ) | (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV ) ) )*
            {
            a0=(Token)match(input,49,FOLLOW_49_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1]);
            	}

            // Cv.g:563:2: (a1= 'languages' a2= ':' ( (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' ) ) ( (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) ) )* )
            // Cv.g:564:3: a1= 'languages' a2= ':' ( (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' ) ) ( (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) ) )*
            {
            a1=(Token)match(input,40,FOLLOW_40_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[2]);
            		}

            a2=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application150); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[3]);
            		}

            // Cv.g:592:3: ( (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' ) )
            // Cv.g:593:4: (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' )
            {
            // Cv.g:593:4: (a3= 'german' |a4= 'english' |a5= 'french' |a6= 'spanish' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            case 58:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // Cv.g:594:5: a3= 'german'
                    {
                    a3=(Token)match(input,36,FOLLOW_36_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application178); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    						startIncompleteElement(element);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    					// set value of enumeration attribute
                    					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.GERMAN_VALUE).getInstance();
                    					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
                    					completedElement(value, false);
                    				}

                    }
                    break;
                case 2 :
                    // Cv.g:607:10: a4= 'english'
                    {
                    a4=(Token)match(input,32,FOLLOW_32_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application195); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    						startIncompleteElement(element);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    					// set value of enumeration attribute
                    					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.ENGLISH_VALUE).getInstance();
                    					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
                    					completedElement(value, false);
                    				}

                    }
                    break;
                case 3 :
                    // Cv.g:620:10: a5= 'french'
                    {
                    a5=(Token)match(input,35,FOLLOW_35_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application212); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    						startIncompleteElement(element);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    					// set value of enumeration attribute
                    					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.FRENCH_VALUE).getInstance();
                    					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
                    					completedElement(value, false);
                    				}

                    }
                    break;
                case 4 :
                    // Cv.g:633:10: a6= 'spanish'
                    {
                    a6=(Token)match(input,58,FOLLOW_58_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application229); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    						startIncompleteElement(element);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    					// set value of enumeration attribute
                    					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.SPANISH_VALUE).getInstance();
                    					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
                    					completedElement(value, false);
                    				}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[4]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[5]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[6]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[7]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[8]);
            			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[9]);
            		}

            // Cv.g:658:3: ( (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Cv.g:659:4: (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) )
            	    {
            	    // Cv.g:659:4: (a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) ) )
            	    // Cv.g:660:5: a9= ',' ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) )
            	    {
            	    a9=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application266); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[10]);
            	    				}

            	    // Cv.g:674:5: ( (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' ) )
            	    // Cv.g:675:6: (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' )
            	    {
            	    // Cv.g:675:6: (a10= 'german' |a11= 'english' |a12= 'french' |a13= 'spanish' )
            	    int alt2=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt2=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // Cv.g:676:7: a10= 'german'
            	            {
            	            a10=(Token)match(input,36,FOLLOW_36_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application304); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            							if (element == null) {
            	            								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            	            								startIncompleteElement(element);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	            							// set value of enumeration attribute
            	            							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.GERMAN_VALUE).getInstance();
            	            							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
            	            							completedElement(value, false);
            	            						}

            	            }
            	            break;
            	        case 2 :
            	            // Cv.g:689:14: a11= 'english'
            	            {
            	            a11=(Token)match(input,32,FOLLOW_32_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application325); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            							if (element == null) {
            	            								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            	            								startIncompleteElement(element);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	            							// set value of enumeration attribute
            	            							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.ENGLISH_VALUE).getInstance();
            	            							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
            	            							completedElement(value, false);
            	            						}

            	            }
            	            break;
            	        case 3 :
            	            // Cv.g:702:14: a12= 'french'
            	            {
            	            a12=(Token)match(input,35,FOLLOW_35_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application346); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            							if (element == null) {
            	            								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            	            								startIncompleteElement(element);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	            							// set value of enumeration attribute
            	            							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.FRENCH_VALUE).getInstance();
            	            							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
            	            							completedElement(value, false);
            	            						}

            	            }
            	            break;
            	        case 4 :
            	            // Cv.g:715:14: a13= 'spanish'
            	            {
            	            a13=(Token)match(input,58,FOLLOW_58_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application367); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            							if (element == null) {
            	            								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            	            								startIncompleteElement(element);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	            							// set value of enumeration attribute
            	            							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.SPANISH_VALUE).getInstance();
            	            							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
            	            							completedElement(value, false);
            	            						}

            	            }
            	            break;

            	    }


            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[11]);
            	    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[12]);
            	    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[13]);
            	    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[14]);
            	    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[15]);
            	    					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[16]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[17]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[18]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[19]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[20]);
            			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[21]);
            			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[22]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[24]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[25]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[26]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[27]);
            	}

            // Cv.g:762:2: ( (a16= 'style' a17= ':' ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==60) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Cv.g:763:3: (a16= 'style' a17= ':' ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) ) )
                    {
                    // Cv.g:763:3: (a16= 'style' a17= ':' ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) ) )
                    // Cv.g:764:4: a16= 'style' a17= ':' ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) )
                    {
                    a16=(Token)match(input,60,FOLLOW_60_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application437); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[28]);
                    			}

                    a17=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application457); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[29]);
                    			}

                    // Cv.g:792:4: ( (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' ) )
                    // Cv.g:793:5: (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' )
                    {
                    // Cv.g:793:5: (a18= 'casual' |a19= 'classic' |a20= 'oldstyle' |a21= 'banking' )
                    int alt4=4;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt4=1;
                        }
                        break;
                    case 23:
                        {
                        alt4=2;
                        }
                        break;
                    case 47:
                        {
                        alt4=3;
                        }
                        break;
                    case 14:
                        {
                        alt4=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }

                    switch (alt4) {
                        case 1 :
                            // Cv.g:794:6: a18= 'casual'
                            {
                            a18=(Token)match(input,21,FOLLOW_21_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application490); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyle().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Style.CASUAL_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 2 :
                            // Cv.g:807:12: a19= 'classic'
                            {
                            a19=(Token)match(input,23,FOLLOW_23_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application509); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyle().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Style.CLASSIC_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 3 :
                            // Cv.g:820:12: a20= 'oldstyle'
                            {
                            a20=(Token)match(input,47,FOLLOW_47_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application528); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyle().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Style.OLDSTYLE_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 4 :
                            // Cv.g:833:12: a21= 'banking'
                            {
                            a21=(Token)match(input,14,FOLLOW_14_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application547); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyle().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Style.BANKING_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[30]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[31]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[32]);
                    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[33]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[35]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[36]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[37]);
            	}

            // Cv.g:866:2: ( (a24= 'color' a25= ':' ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Cv.g:867:3: (a24= 'color' a25= ':' ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) ) )
                    {
                    // Cv.g:867:3: (a24= 'color' a25= ':' ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) ) )
                    // Cv.g:868:4: a24= 'color' a25= ':' ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) )
                    {
                    a24=(Token)match(input,25,FOLLOW_25_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application600); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[38]);
                    			}

                    a25=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application620); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a25, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[39]);
                    			}

                    // Cv.g:896:4: ( (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' ) )
                    // Cv.g:897:5: (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' )
                    {
                    // Cv.g:897:5: (a26= 'blue' |a27= 'orange' |a28= 'green' |a29= 'red' |a30= 'purple' |a31= 'grey' |a32= 'black' )
                    int alt6=7;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt6=1;
                        }
                        break;
                    case 50:
                        {
                        alt6=2;
                        }
                        break;
                    case 38:
                        {
                        alt6=3;
                        }
                        break;
                    case 57:
                        {
                        alt6=4;
                        }
                        break;
                    case 55:
                        {
                        alt6=5;
                        }
                        break;
                    case 39:
                        {
                        alt6=6;
                        }
                        break;
                    case 18:
                        {
                        alt6=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;

                    }

                    switch (alt6) {
                        case 1 :
                            // Cv.g:898:6: a26= 'blue'
                            {
                            a26=(Token)match(input,20,FOLLOW_20_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application653); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColor().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Color.BLUE_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 2 :
                            // Cv.g:911:12: a27= 'orange'
                            {
                            a27=(Token)match(input,50,FOLLOW_50_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application672); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColor().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Color.ORANGE_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 3 :
                            // Cv.g:924:12: a28= 'green'
                            {
                            a28=(Token)match(input,38,FOLLOW_38_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application691); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a28, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColor().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Color.GREEN_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 4 :
                            // Cv.g:937:12: a29= 'red'
                            {
                            a29=(Token)match(input,57,FOLLOW_57_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application710); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColor().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Color.RED_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 5 :
                            // Cv.g:950:12: a30= 'purple'
                            {
                            a30=(Token)match(input,55,FOLLOW_55_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application729); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColor().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Color.PURPLE_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 6 :
                            // Cv.g:963:12: a31= 'grey'
                            {
                            a31=(Token)match(input,39,FOLLOW_39_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application748); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a31, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColor().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Color.GREY_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 7 :
                            // Cv.g:976:12: a32= 'black'
                            {
                            a32=(Token)match(input,18,FOLLOW_18_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application767); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
                            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
                            						// set value of enumeration attribute
                            						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColor().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Color.BLACK_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[40]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[41]);
                    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[42]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[43]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[44]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[45]);
            	}

            // Cv.g:1007:2: ( (a35= 'place' a36= ':' (a37= QUOTED_34_34 ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Cv.g:1008:3: (a35= 'place' a36= ':' (a37= QUOTED_34_34 ) )
                    {
                    // Cv.g:1008:3: (a35= 'place' a36= ':' (a37= QUOTED_34_34 ) )
                    // Cv.g:1009:4: a35= 'place' a36= ':' (a37= QUOTED_34_34 )
                    {
                    a35=(Token)match(input,54,FOLLOW_54_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application820); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a35, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[46]);
                    			}

                    a36=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application840); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_4_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a36, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[47]);
                    			}

                    // Cv.g:1037:4: (a37= QUOTED_34_34 )
                    // Cv.g:1038:5: a37= QUOTED_34_34
                    {
                    a37=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application866); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    						startIncompleteElement(element);
                    					}
                    					if (a37 != null) {
                    						de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                    						tokenResolver.setOptions(getOptions());
                    						de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a37.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PLACE), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a37).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a37).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a37).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a37).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PLACE), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_4_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a37, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[48]);
                    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[49]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[50]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[51]);
            	}

            // Cv.g:1082:2: ( (a38= 'date' a39= ':' (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Cv.g:1083:3: (a38= 'date' a39= ':' (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) )
                    {
                    // Cv.g:1083:3: (a38= 'date' a39= ':' (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) )
                    // Cv.g:1084:4: a38= 'date' a39= ':' (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date )
                    {
                    a38=(Token)match(input,29,FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application921); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a38, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[52]);
                    			}

                    a39=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application941); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a39, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[53]);
                    			}

                    // Cv.g:1112:4: (a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date )
                    // Cv.g:1113:5: a40_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application967);
                    a40_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
                    						startIncompleteElement(element);
                    					}
                    					if (a40_0 != null) {
                    						if (a40_0 != null) {
                    							Object value = a40_0;
                    							element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__DATE), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_5_0_0_2, a40_0, true);
                    						copyLocalizationInfos(a40_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[54]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[55]);
            	}

            // Cv.g:1145:2: ( (a41_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation ) )
            // Cv.g:1146:3: (a41_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation )
            {
            // Cv.g:1146:3: (a41_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation )
            // Cv.g:1147:4: a41_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation
            {
            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application1017);
            a41_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            				if (terminateParsing) {
            					throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            				}
            				if (element == null) {
            					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            					startIncompleteElement(element);
            				}
            				if (a41_0 != null) {
            					if (a41_0 != null) {
            						Object value = a41_0;
            						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PERSONAL_INFORMATION), value);
            						completedElement(value, true);
            					}
            					collectHiddenTokens(element);
            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_6_0_0_0, a41_0, true);
            					copyLocalizationInfos(a41_0, element);
            				}
            			}

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[56]);
            			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[57]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[58]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[59]);
            	}

            // Cv.g:1180:2: ( ( (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter ) | (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28||LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Cv.g:1181:3: ( (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter ) | (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV ) )
            	    {
            	    // Cv.g:1181:3: ( (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter ) | (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==41) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==28) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // Cv.g:1182:4: (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter )
            	            {
            	            // Cv.g:1182:4: (a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter )
            	            // Cv.g:1183:5: a42_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter
            	            {
            	            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application1062);
            	            a42_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a42_0 != null) {
            	            						if (a42_0 != null) {
            	            							Object value = a42_0;
            	            							element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LETTER), value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_7_0_0_0, a42_0, true);
            	            						copyLocalizationInfos(a42_0, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[60]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[61]);
            	            			}

            	            }
            	            break;
            	        case 2 :
            	            // Cv.g:1210:8: (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV )
            	            {
            	            // Cv.g:1210:8: (a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV )
            	            // Cv.g:1211:5: a43_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV
            	            {
            	            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application1104);
            	            a43_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (terminateParsing) {
            	            						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            					}
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
            	            						startIncompleteElement(element);
            	            					}
            	            					if (a43_0 != null) {
            	            						if (a43_0 != null) {
            	            							Object value = a43_0;
            	            							element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__CV), value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_7_0_1_0, a43_0, true);
            	            						copyLocalizationInfos(a43_0, element);
            	            					}
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[62]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[63]);
            	            			}

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[64]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[65]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation"
    // Cv.g:1247:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation returns [de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element = null] : a0= 'personal' ( ( (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) ) | (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) ) | (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) ) | (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) ) | (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) | (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* ) | (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* ) | (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) ) | (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) ) | (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) | (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) ) | (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) ) | (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) ) | (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) ) | (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) ) | (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) ) | (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) ) | (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) ) ) )* ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a16=null;
        Token a17=null;
        Token a19=null;
        Token a21=null;
        Token a22=null;
        Token a24=null;
        Token a26=null;
        Token a27=null;
        Token a28=null;
        Token a29=null;
        Token a30=null;
        Token a31=null;
        Token a32=null;
        Token a33=null;
        Token a35=null;
        Token a37=null;
        Token a38=null;
        Token a39=null;
        Token a40=null;
        Token a41=null;
        Token a42=null;
        Token a43=null;
        Token a44=null;
        Token a45=null;
        Token a46=null;
        Token a47=null;
        Token a48=null;
        Token a49=null;
        Token a50=null;
        Token a51=null;
        Token a52=null;
        Token a53=null;
        Token a54=null;
        Token a55=null;
        Token a56=null;
        Token a57=null;
        Token a58=null;
        Token a59=null;
        Token a60=null;
        de.tu_bs.cs.isf.mbse.cvclipse.Date a15_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a18_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a20_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a23_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a25_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a34_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a36_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Cv.g:1250:2: (a0= 'personal' ( ( (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) ) | (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) ) | (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) ) | (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) ) | (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) | (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* ) | (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* ) | (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) ) | (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) ) | (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) | (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) ) | (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) ) | (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) ) | (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) ) | (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) ) | (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) ) | (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) ) | (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) ) ) )* )
            // Cv.g:1251:2: a0= 'personal' ( ( (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) ) | (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) ) | (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) ) | (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) ) | (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) | (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* ) | (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* ) | (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) ) | (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) ) | (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) | (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) ) | (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) ) | (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) ) | (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) ) | (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) ) | (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) ) | (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) ) | (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) ) ) )*
            {
            a0=(Token)match(input,51,FOLLOW_51_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1160); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[66]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[67]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[68]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[69]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[70]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[71]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[72]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[73]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[74]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[75]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[76]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[77]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[78]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[79]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[81]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[82]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[83]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[84]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[85]);
            	}

            // Cv.g:1284:2: ( ( (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) ) | (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) ) | (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) ) | (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) ) | (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) | (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* ) | (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* ) | (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) ) | (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) ) | (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) | (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) ) | (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) ) | (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) ) | (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) ) | (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) ) | (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) ) | (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) ) | (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= 15 && LA16_0 <= 17)||LA16_0==22||LA16_0==27||LA16_0==30||(LA16_0 >= 33 && LA16_0 <= 34)||LA16_0==37||LA16_0==42||(LA16_0 >= 44 && LA16_0 <= 46)||LA16_0==52||LA16_0==59||LA16_0==61||(LA16_0 >= 64 && LA16_0 <= 65)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Cv.g:1285:3: ( (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) ) | (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) ) | (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) ) | (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) ) | (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) | (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* ) | (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* ) | (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) ) | (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) ) | (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) | (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) ) | (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) ) | (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) ) | (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) ) | (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) ) | (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) ) | (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) ) | (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) ) )
            	    {
            	    // Cv.g:1285:3: ( (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) ) | (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) ) | (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) ) | (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) ) | (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) | (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* ) | (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* ) | (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) ) | (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) ) | (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) | (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) ) | (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) ) | (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) ) | (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) ) | (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) ) | (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) ) | (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) ) | (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) ) )
            	    int alt15=18;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt15=5;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt15=6;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt15=7;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt15=8;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt15=9;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt15=10;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt15=11;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt15=12;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt15=13;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt15=14;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt15=15;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt15=16;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt15=17;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt15=18;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // Cv.g:1286:4: (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:1286:4: (a1= 'firstname' a2= ':' (a3= QUOTED_34_34 ) )
            	            // Cv.g:1287:5: a1= 'firstname' a2= ':' (a3= QUOTED_34_34 )
            	            {
            	            a1=(Token)match(input,34,FOLLOW_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1189); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_0_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[86]);
            	            				}

            	            a2=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1212); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_0_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[87]);
            	            				}

            	            // Cv.g:1315:5: (a3= QUOTED_34_34 )
            	            // Cv.g:1316:6: a3= QUOTED_34_34
            	            {
            	            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1242); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a3 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_0_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[88]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[89]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[90]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[91]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[92]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[93]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[94]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[95]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[96]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[97]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[98]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[99]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[100]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[101]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[102]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[103]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[104]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[105]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[106]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[107]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[108]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[109]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[110]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[111]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[112]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[113]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[114]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[115]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[116]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[117]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[118]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[119]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[120]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[121]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[122]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[123]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[124]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[125]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[126]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[127]);
            	            			}

            	            }
            	            break;
            	        case 2 :
            	            // Cv.g:1396:8: (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:1396:8: (a4= 'surname' a5= ':' (a6= QUOTED_34_34 ) )
            	            // Cv.g:1397:5: a4= 'surname' a5= ':' (a6= QUOTED_34_34 )
            	            {
            	            a4=(Token)match(input,61,FOLLOW_61_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1308); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_1_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[128]);
            	            				}

            	            a5=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1331); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_1_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[129]);
            	            				}

            	            // Cv.g:1425:5: (a6= QUOTED_34_34 )
            	            // Cv.g:1426:6: a6= QUOTED_34_34
            	            {
            	            a6=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1361); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a6 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__SURNAME), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__SURNAME), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_1_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[130]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[131]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[132]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[133]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[134]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[135]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[136]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[137]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[138]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[139]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[140]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[141]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[142]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[143]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[144]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[145]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[146]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[147]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[148]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[149]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[150]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[151]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[152]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[153]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[154]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[155]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[156]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[157]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[158]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[159]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[160]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[161]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[162]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[163]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[164]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[165]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[166]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[167]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[168]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[169]);
            	            			}

            	            }
            	            break;
            	        case 3 :
            	            // Cv.g:1506:8: (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:1506:8: (a7= 'birthname' a8= ':' (a9= QUOTED_34_34 ) )
            	            // Cv.g:1507:5: a7= 'birthname' a8= ':' (a9= QUOTED_34_34 )
            	            {
            	            a7=(Token)match(input,16,FOLLOW_16_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1427); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_2_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[170]);
            	            				}

            	            a8=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1450); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_2_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[171]);
            	            				}

            	            // Cv.g:1535:5: (a9= QUOTED_34_34 )
            	            // Cv.g:1536:6: a9= QUOTED_34_34
            	            {
            	            a9=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1480); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a9 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_2_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[172]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[173]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[174]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[175]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[176]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[177]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[178]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[179]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[180]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[181]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[182]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[183]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[184]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[185]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[186]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[187]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[188]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[189]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[190]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[191]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[192]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[193]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[194]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[195]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[196]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[197]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[198]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[199]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[200]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[201]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[202]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[203]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[204]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[205]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[206]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[207]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[208]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[209]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[210]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[211]);
            	            			}

            	            }
            	            break;
            	        case 4 :
            	            // Cv.g:1616:8: (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:1616:8: (a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 ) )
            	            // Cv.g:1617:5: a10= 'birthplace' a11= ':' (a12= QUOTED_34_34 )
            	            {
            	            a10=(Token)match(input,17,FOLLOW_17_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1546); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_3_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[212]);
            	            				}

            	            a11=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1569); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_3_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[213]);
            	            				}

            	            // Cv.g:1645:5: (a12= QUOTED_34_34 )
            	            // Cv.g:1646:6: a12= QUOTED_34_34
            	            {
            	            a12=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1599); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a12 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_3_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a12, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[214]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[215]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[216]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[217]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[218]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[219]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[220]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[221]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[222]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[223]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[224]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[225]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[226]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[227]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[228]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[229]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[230]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[231]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[232]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[233]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[234]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[235]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[236]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[237]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[238]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[239]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[240]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[241]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[242]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[243]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[244]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[245]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[246]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[247]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[248]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[249]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[250]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[251]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[252]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[253]);
            	            			}

            	            }
            	            break;
            	        case 5 :
            	            // Cv.g:1726:8: (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) )
            	            {
            	            // Cv.g:1726:8: (a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) )
            	            // Cv.g:1727:5: a13= 'birthdate' a14= ':' (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date )
            	            {
            	            a13=(Token)match(input,15,FOLLOW_15_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1665); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_4_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[254]);
            	            				}

            	            a14=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1688); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_4_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[255]);
            	            				}

            	            // Cv.g:1755:5: (a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date )
            	            // Cv.g:1756:6: a15_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date
            	            {
            	            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1718);
            	            a15_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a15_0 != null) {
            	            							if (a15_0 != null) {
            	            								Object value = a15_0;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE), value);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_4_0_0_0_2, a15_0, true);
            	            							copyLocalizationInfos(a15_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[256]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[257]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[258]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[259]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[260]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[261]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[262]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[263]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[264]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[265]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[266]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[267]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[268]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[269]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[270]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[271]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[272]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[273]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[274]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[275]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[276]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[277]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[278]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[279]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[280]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[281]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[282]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[283]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[284]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[285]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[286]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[287]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[288]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[289]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[290]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[291]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[292]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[293]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[294]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[295]);
            	            			}

            	            }
            	            break;
            	        case 6 :
            	            // Cv.g:1826:8: (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* )
            	            {
            	            // Cv.g:1826:8: (a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )* )
            	            // Cv.g:1827:5: a16= 'marital status' a17= ':' (a18_0= parse_java_util_Map_Entry ) ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )*
            	            {
            	            a16=(Token)match(input,44,FOLLOW_44_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1778); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[296]);
            	            				}

            	            a17=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1801); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[297]);
            	            				}

            	            // Cv.g:1855:5: (a18_0= parse_java_util_Map_Entry )
            	            // Cv.g:1856:6: a18_0= parse_java_util_Map_Entry
            	            {
            	            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1831);
            	            a18_0=parse_java_util_Map_Entry();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a18_0 != null) {
            	            							if (a18_0 != null) {
            	            								Object value = a18_0;
            	            								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS), a18_0);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_2, a18_0, true);
            	            							copyLocalizationInfos(a18_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[298]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[299]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[300]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[301]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[302]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[303]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[304]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[305]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[306]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[307]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[308]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[309]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[310]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[311]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[312]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[313]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[314]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[315]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[316]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[317]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[318]);
            	            				}

            	            // Cv.g:1901:5: ( (a19= ',' (a20_0= parse_java_util_Map_Entry ) ) )*
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==9) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // Cv.g:1902:6: (a19= ',' (a20_0= parse_java_util_Map_Entry ) )
            	            	    {
            	            	    // Cv.g:1902:6: (a19= ',' (a20_0= parse_java_util_Map_Entry ) )
            	            	    // Cv.g:1903:7: a19= ',' (a20_0= parse_java_util_Map_Entry )
            	            	    {
            	            	    a19=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1879); if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    							if (element == null) {
            	            	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            	    								startIncompleteElement(element);
            	            	    							}
            	            	    							collectHiddenTokens(element);
            	            	    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_3_0_0_0, null, true);
            	            	    							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
            	            	    						}

            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[319]);
            	            	    						}

            	            	    // Cv.g:1917:7: (a20_0= parse_java_util_Map_Entry )
            	            	    // Cv.g:1918:8: a20_0= parse_java_util_Map_Entry
            	            	    {
            	            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1917);
            	            	    a20_0=parse_java_util_Map_Entry();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    								if (terminateParsing) {
            	            	    									throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            	    								}
            	            	    								if (element == null) {
            	            	    									element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            	    									startIncompleteElement(element);
            	            	    								}
            	            	    								if (a20_0 != null) {
            	            	    									if (a20_0 != null) {
            	            	    										Object value = a20_0;
            	            	    										addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS), a20_0);
            	            	    										completedElement(value, true);
            	            	    									}
            	            	    									collectHiddenTokens(element);
            	            	    									retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_3_0_0_1, a20_0, true);
            	            	    									copyLocalizationInfos(a20_0, element);
            	            	    								}
            	            	    							}

            	            	    }


            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[320]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[321]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[322]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[323]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[324]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[325]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[326]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[327]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[328]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[329]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[330]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[331]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[332]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[333]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[334]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[335]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[336]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[337]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[338]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[339]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[340]);
            	            	    						}

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop12;
            	                }
            	            } while (true);


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[341]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[342]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[343]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[344]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[345]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[346]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[347]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[348]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[349]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[350]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[351]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[352]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[353]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[354]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[355]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[356]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[357]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[358]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[359]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[360]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[361]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[362]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[363]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[364]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[365]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[366]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[367]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[368]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[369]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[370]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[371]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[372]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[373]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[374]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[375]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[376]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[377]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[378]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[379]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[380]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[381]);
            	            			}

            	            }
            	            break;
            	        case 7 :
            	            // Cv.g:2016:8: (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* )
            	            {
            	            // Cv.g:2016:8: (a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )* )
            	            // Cv.g:2017:5: a21= 'nationality' a22= ':' (a23_0= parse_java_util_Map_Entry ) ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )*
            	            {
            	            a21=(Token)match(input,46,FOLLOW_46_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2015); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[382]);
            	            				}

            	            a22=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2038); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[383]);
            	            				}

            	            // Cv.g:2045:5: (a23_0= parse_java_util_Map_Entry )
            	            // Cv.g:2046:6: a23_0= parse_java_util_Map_Entry
            	            {
            	            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2068);
            	            a23_0=parse_java_util_Map_Entry();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a23_0 != null) {
            	            							if (a23_0 != null) {
            	            								Object value = a23_0;
            	            								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY), a23_0);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_2, a23_0, true);
            	            							copyLocalizationInfos(a23_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[384]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[385]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[386]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[387]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[388]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[389]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[390]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[391]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[392]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[393]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[394]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[395]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[396]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[397]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[398]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[399]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[400]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[401]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[402]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[403]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[404]);
            	            				}

            	            // Cv.g:2091:5: ( (a24= ',' (a25_0= parse_java_util_Map_Entry ) ) )*
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==9) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // Cv.g:2092:6: (a24= ',' (a25_0= parse_java_util_Map_Entry ) )
            	            	    {
            	            	    // Cv.g:2092:6: (a24= ',' (a25_0= parse_java_util_Map_Entry ) )
            	            	    // Cv.g:2093:7: a24= ',' (a25_0= parse_java_util_Map_Entry )
            	            	    {
            	            	    a24=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2116); if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    							if (element == null) {
            	            	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            	    								startIncompleteElement(element);
            	            	    							}
            	            	    							collectHiddenTokens(element);
            	            	    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_3_0_0_0, null, true);
            	            	    							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
            	            	    						}

            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[405]);
            	            	    						}

            	            	    // Cv.g:2107:7: (a25_0= parse_java_util_Map_Entry )
            	            	    // Cv.g:2108:8: a25_0= parse_java_util_Map_Entry
            	            	    {
            	            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2154);
            	            	    a25_0=parse_java_util_Map_Entry();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    								if (terminateParsing) {
            	            	    									throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            	    								}
            	            	    								if (element == null) {
            	            	    									element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            	    									startIncompleteElement(element);
            	            	    								}
            	            	    								if (a25_0 != null) {
            	            	    									if (a25_0 != null) {
            	            	    										Object value = a25_0;
            	            	    										addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY), a25_0);
            	            	    										completedElement(value, true);
            	            	    									}
            	            	    									collectHiddenTokens(element);
            	            	    									retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_3_0_0_1, a25_0, true);
            	            	    									copyLocalizationInfos(a25_0, element);
            	            	    								}
            	            	    							}

            	            	    }


            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[406]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[407]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[408]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[409]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[410]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[411]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[412]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[413]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[414]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[415]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[416]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[417]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[418]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[419]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[420]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[421]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[422]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[423]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[424]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[425]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[426]);
            	            	    						}

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop13;
            	                }
            	            } while (true);


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[427]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[428]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[429]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[430]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[431]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[432]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[433]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[434]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[435]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[436]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[437]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[438]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[439]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[440]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[441]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[442]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[443]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[444]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[445]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[446]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[447]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[448]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[449]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[450]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[451]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[452]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[453]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[454]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[455]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[456]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[457]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[458]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[459]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[460]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[461]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[462]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[463]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[464]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[465]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[466]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[467]);
            	            			}

            	            }
            	            break;
            	        case 8 :
            	            // Cv.g:2206:8: (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:2206:8: (a26= 'street' a27= ':' (a28= QUOTED_34_34 ) )
            	            // Cv.g:2207:5: a26= 'street' a27= ':' (a28= QUOTED_34_34 )
            	            {
            	            a26=(Token)match(input,59,FOLLOW_59_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2252); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_7_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[468]);
            	            				}

            	            a27=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2275); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_7_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[469]);
            	            				}

            	            // Cv.g:2235:5: (a28= QUOTED_34_34 )
            	            // Cv.g:2236:6: a28= QUOTED_34_34
            	            {
            	            a28=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2305); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a28 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a28.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__STREET), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a28).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a28).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a28).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a28).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__STREET), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_7_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a28, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[470]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[471]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[472]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[473]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[474]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[475]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[476]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[477]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[478]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[479]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[480]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[481]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[482]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[483]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[484]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[485]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[486]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[487]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[488]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[489]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[490]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[491]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[492]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[493]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[494]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[495]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[496]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[497]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[498]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[499]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[500]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[501]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[502]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[503]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[504]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[505]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[506]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[507]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[508]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[509]);
            	            			}

            	            }
            	            break;
            	        case 9 :
            	            // Cv.g:2316:8: (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:2316:8: (a29= 'city' a30= ':' (a31= QUOTED_34_34 ) )
            	            // Cv.g:2317:5: a29= 'city' a30= ':' (a31= QUOTED_34_34 )
            	            {
            	            a29=(Token)match(input,22,FOLLOW_22_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2371); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_8_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[510]);
            	            				}

            	            a30=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2394); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_8_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[511]);
            	            				}

            	            // Cv.g:2345:5: (a31= QUOTED_34_34 )
            	            // Cv.g:2346:6: a31= QUOTED_34_34
            	            {
            	            a31=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2424); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a31 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a31.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__CITY), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a31).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a31).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a31).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a31).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__CITY), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_8_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a31, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[512]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[513]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[514]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[515]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[516]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[517]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[518]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[519]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[520]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[521]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[522]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[523]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[524]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[525]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[526]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[527]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[528]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[529]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[530]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[531]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[532]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[533]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[534]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[535]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[536]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[537]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[538]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[539]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[540]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[541]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[542]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[543]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[544]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[545]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[546]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[547]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[548]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[549]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[550]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[551]);
            	            			}

            	            }
            	            break;
            	        case 10 :
            	            // Cv.g:2426:8: (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* )
            	            {
            	            // Cv.g:2426:8: (a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* )
            	            // Cv.g:2427:5: a32= 'country' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )*
            	            {
            	            a32=(Token)match(input,27,FOLLOW_27_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2490); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[552]);
            	            				}

            	            a33=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2513); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a33, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[553]);
            	            				}

            	            // Cv.g:2455:5: (a34_0= parse_java_util_Map_Entry )
            	            // Cv.g:2456:6: a34_0= parse_java_util_Map_Entry
            	            {
            	            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2543);
            	            a34_0=parse_java_util_Map_Entry();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a34_0 != null) {
            	            							if (a34_0 != null) {
            	            								Object value = a34_0;
            	            								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__COUNTRY), a34_0);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_2, a34_0, true);
            	            							copyLocalizationInfos(a34_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[554]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[555]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[556]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[557]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[558]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[559]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[560]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[561]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[562]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[563]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[564]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[565]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[566]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[567]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[568]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[569]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[570]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[571]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[572]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[573]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[574]);
            	            				}

            	            // Cv.g:2501:5: ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )*
            	            loop14:
            	            do {
            	                int alt14=2;
            	                int LA14_0 = input.LA(1);

            	                if ( (LA14_0==9) ) {
            	                    alt14=1;
            	                }


            	                switch (alt14) {
            	            	case 1 :
            	            	    // Cv.g:2502:6: (a35= ',' (a36_0= parse_java_util_Map_Entry ) )
            	            	    {
            	            	    // Cv.g:2502:6: (a35= ',' (a36_0= parse_java_util_Map_Entry ) )
            	            	    // Cv.g:2503:7: a35= ',' (a36_0= parse_java_util_Map_Entry )
            	            	    {
            	            	    a35=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2591); if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    							if (element == null) {
            	            	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            	    								startIncompleteElement(element);
            	            	    							}
            	            	    							collectHiddenTokens(element);
            	            	    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_3_0_0_0, null, true);
            	            	    							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a35, element);
            	            	    						}

            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[575]);
            	            	    						}

            	            	    // Cv.g:2517:7: (a36_0= parse_java_util_Map_Entry )
            	            	    // Cv.g:2518:8: a36_0= parse_java_util_Map_Entry
            	            	    {
            	            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2629);
            	            	    a36_0=parse_java_util_Map_Entry();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    								if (terminateParsing) {
            	            	    									throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            	    								}
            	            	    								if (element == null) {
            	            	    									element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            	    									startIncompleteElement(element);
            	            	    								}
            	            	    								if (a36_0 != null) {
            	            	    									if (a36_0 != null) {
            	            	    										Object value = a36_0;
            	            	    										addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__COUNTRY), a36_0);
            	            	    										completedElement(value, true);
            	            	    									}
            	            	    									collectHiddenTokens(element);
            	            	    									retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_3_0_0_1, a36_0, true);
            	            	    									copyLocalizationInfos(a36_0, element);
            	            	    								}
            	            	    							}

            	            	    }


            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[576]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[577]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[578]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[579]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[580]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[581]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[582]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[583]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[584]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[585]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[586]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[587]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[588]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[589]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[590]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[591]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[592]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[593]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[594]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[595]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[596]);
            	            	    						}

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop14;
            	                }
            	            } while (true);


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[597]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[598]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[599]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[600]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[601]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[602]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[603]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[604]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[605]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[606]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[607]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[608]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[609]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[610]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[611]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[612]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[613]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[614]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[615]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[616]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[617]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[618]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[619]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[620]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[621]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[622]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[623]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[624]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[625]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[626]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[627]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[628]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[629]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[630]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[631]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[632]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[633]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[634]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[635]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[636]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[637]);
            	            			}

            	            }
            	            break;
            	        case 11 :
            	            // Cv.g:2616:8: (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:2616:8: (a37= 'email' a38= ':' (a39= QUOTED_34_34 ) )
            	            // Cv.g:2617:5: a37= 'email' a38= ':' (a39= QUOTED_34_34 )
            	            {
            	            a37=(Token)match(input,30,FOLLOW_30_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2727); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_10_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a37, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[638]);
            	            				}

            	            a38=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2750); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_10_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a38, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[639]);
            	            				}

            	            // Cv.g:2645:5: (a39= QUOTED_34_34 )
            	            // Cv.g:2646:6: a39= QUOTED_34_34
            	            {
            	            a39=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2780); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a39 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a39.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__EMAIL), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a39).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a39).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a39).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a39).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__EMAIL), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_10_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a39, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[640]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[641]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[642]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[643]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[644]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[645]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[646]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[647]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[648]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[649]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[650]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[651]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[652]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[653]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[654]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[655]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[656]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[657]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[658]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[659]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[660]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[661]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[662]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[663]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[664]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[665]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[666]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[667]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[668]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[669]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[670]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[671]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[672]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[673]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[674]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[675]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[676]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[677]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[678]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[679]);
            	            			}

            	            }
            	            break;
            	        case 12 :
            	            // Cv.g:2726:8: (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:2726:8: (a40= 'phone' a41= ':' (a42= QUOTED_34_34 ) )
            	            // Cv.g:2727:5: a40= 'phone' a41= ':' (a42= QUOTED_34_34 )
            	            {
            	            a40=(Token)match(input,52,FOLLOW_52_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2846); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_11_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a40, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[680]);
            	            				}

            	            a41=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2869); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_11_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a41, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[681]);
            	            				}

            	            // Cv.g:2755:5: (a42= QUOTED_34_34 )
            	            // Cv.g:2756:6: a42= QUOTED_34_34
            	            {
            	            a42=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2899); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a42 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a42.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__PHONE), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a42).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a42).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a42).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a42).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__PHONE), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_11_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a42, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[682]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[683]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[684]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[685]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[686]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[687]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[688]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[689]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[690]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[691]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[692]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[693]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[694]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[695]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[696]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[697]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[698]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[699]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[700]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[701]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[702]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[703]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[704]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[705]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[706]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[707]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[708]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[709]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[710]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[711]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[712]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[713]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[714]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[715]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[716]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[717]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[718]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[719]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[720]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[721]);
            	            			}

            	            }
            	            break;
            	        case 13 :
            	            // Cv.g:2836:8: (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:2836:8: (a43= 'mobile' a44= ':' (a45= QUOTED_34_34 ) )
            	            // Cv.g:2837:5: a43= 'mobile' a44= ':' (a45= QUOTED_34_34 )
            	            {
            	            a43=(Token)match(input,45,FOLLOW_45_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2965); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_12_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a43, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[722]);
            	            				}

            	            a44=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2988); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_12_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a44, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[723]);
            	            				}

            	            // Cv.g:2865:5: (a45= QUOTED_34_34 )
            	            // Cv.g:2866:6: a45= QUOTED_34_34
            	            {
            	            a45=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3018); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a45 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a45.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MOBILE), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a45).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a45).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a45).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a45).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MOBILE), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_12_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a45, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[724]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[725]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[726]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[727]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[728]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[729]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[730]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[731]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[732]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[733]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[734]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[735]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[736]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[737]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[738]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[739]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[740]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[741]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[742]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[743]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[744]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[745]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[746]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[747]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[748]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[749]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[750]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[751]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[752]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[753]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[754]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[755]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[756]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[757]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[758]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[759]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[760]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[761]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[762]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[763]);
            	            			}

            	            }
            	            break;
            	        case 14 :
            	            // Cv.g:2946:8: (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:2946:8: (a46= 'fax' a47= ':' (a48= QUOTED_34_34 ) )
            	            // Cv.g:2947:5: a46= 'fax' a47= ':' (a48= QUOTED_34_34 )
            	            {
            	            a46=(Token)match(input,33,FOLLOW_33_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3084); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_13_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a46, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[764]);
            	            				}

            	            a47=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3107); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_13_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a47, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[765]);
            	            				}

            	            // Cv.g:2975:5: (a48= QUOTED_34_34 )
            	            // Cv.g:2976:6: a48= QUOTED_34_34
            	            {
            	            a48=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3137); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a48 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a48.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FAX), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a48).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a48).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a48).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a48).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FAX), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_13_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a48, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[766]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[767]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[768]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[769]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[770]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[771]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[772]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[773]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[774]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[775]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[776]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[777]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[778]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[779]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[780]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[781]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[782]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[783]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[784]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[785]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[786]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[787]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[788]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[789]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[790]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[791]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[792]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[793]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[794]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[795]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[796]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[797]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[798]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[799]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[800]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[801]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[802]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[803]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[804]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[805]);
            	            			}

            	            }
            	            break;
            	        case 15 :
            	            // Cv.g:3056:8: (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3056:8: (a49= 'website' a50= ':' (a51= QUOTED_34_34 ) )
            	            // Cv.g:3057:5: a49= 'website' a50= ':' (a51= QUOTED_34_34 )
            	            {
            	            a49=(Token)match(input,65,FOLLOW_65_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3203); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_14_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a49, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[806]);
            	            				}

            	            a50=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3226); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_14_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a50, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[807]);
            	            				}

            	            // Cv.g:3085:5: (a51= QUOTED_34_34 )
            	            // Cv.g:3086:6: a51= QUOTED_34_34
            	            {
            	            a51=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3256); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a51 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a51.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__WEBSITE), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a51).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a51).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a51).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a51).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__WEBSITE), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_14_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a51, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[808]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[809]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[810]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[811]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[812]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[813]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[814]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[815]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[816]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[817]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[818]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[819]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[820]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[821]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[822]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[823]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[824]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[825]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[826]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[827]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[828]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[829]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[830]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[831]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[832]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[833]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[834]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[835]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[836]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[837]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[838]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[839]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[840]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[841]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[842]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[843]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[844]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[845]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[846]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[847]);
            	            			}

            	            }
            	            break;
            	        case 16 :
            	            // Cv.g:3166:8: (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3166:8: (a52= 'github' a53= ':' (a54= QUOTED_34_34 ) )
            	            // Cv.g:3167:5: a52= 'github' a53= ':' (a54= QUOTED_34_34 )
            	            {
            	            a52=(Token)match(input,37,FOLLOW_37_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3322); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_15_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a52, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[848]);
            	            				}

            	            a53=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3345); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_15_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a53, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[849]);
            	            				}

            	            // Cv.g:3195:5: (a54= QUOTED_34_34 )
            	            // Cv.g:3196:6: a54= QUOTED_34_34
            	            {
            	            a54=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3375); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a54 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a54.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__GITHUB), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a54).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a54).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a54).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a54).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__GITHUB), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_15_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a54, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[850]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[851]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[852]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[853]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[854]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[855]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[856]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[857]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[858]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[859]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[860]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[861]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[862]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[863]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[864]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[865]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[866]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[867]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[868]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[869]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[870]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[871]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[872]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[873]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[874]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[875]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[876]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[877]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[878]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[879]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[880]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[881]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[882]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[883]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[884]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[885]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[886]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[887]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[888]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[889]);
            	            			}

            	            }
            	            break;
            	        case 17 :
            	            // Cv.g:3276:8: (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3276:8: (a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 ) )
            	            // Cv.g:3277:5: a55= 'linkedin' a56= ':' (a57= QUOTED_34_34 )
            	            {
            	            a55=(Token)match(input,42,FOLLOW_42_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3441); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_16_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a55, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[890]);
            	            				}

            	            a56=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3464); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_16_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a56, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[891]);
            	            				}

            	            // Cv.g:3305:5: (a57= QUOTED_34_34 )
            	            // Cv.g:3306:6: a57= QUOTED_34_34
            	            {
            	            a57=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3494); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a57 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a57.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a57).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a57).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a57).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a57).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_16_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a57, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[892]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[893]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[894]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[895]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[896]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[897]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[898]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[899]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[900]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[901]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[902]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[903]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[904]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[905]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[906]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[907]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[908]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[909]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[910]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[911]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[912]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[913]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[914]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[915]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[916]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[917]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[918]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[919]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[920]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[921]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[922]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[923]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[924]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[925]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[926]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[927]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[928]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[929]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[930]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[931]);
            	            			}

            	            }
            	            break;
            	        case 18 :
            	            // Cv.g:3386:8: (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3386:8: (a58= 'twitter' a59= ':' (a60= QUOTED_34_34 ) )
            	            // Cv.g:3387:5: a58= 'twitter' a59= ':' (a60= QUOTED_34_34 )
            	            {
            	            a58=(Token)match(input,64,FOLLOW_64_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3560); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_17_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a58, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[932]);
            	            				}

            	            a59=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3583); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_17_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a59, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[933]);
            	            				}

            	            // Cv.g:3415:5: (a60= QUOTED_34_34 )
            	            // Cv.g:3416:6: a60= QUOTED_34_34
            	            {
            	            a60=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3613); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a60 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a60.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__TWITTER), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a60).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a60).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a60).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a60).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__TWITTER), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_17_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a60, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[934]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[935]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[936]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[937]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[938]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[939]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[940]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[941]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[942]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[943]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[944]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[945]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[946]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[947]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[948]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[949]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[950]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[951]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[952]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[953]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[954]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[955]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[956]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[957]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[958]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[959]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[960]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[961]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[962]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[963]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[964]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[965]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[966]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[967]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[968]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[969]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[970]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[971]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[972]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[973]);
            	            			}

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[974]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[975]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[976]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[977]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[978]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[979]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[980]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[981]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[982]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[983]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[984]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[985]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[986]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[987]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[988]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[989]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[990]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[991]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[992]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[993]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter"
    // Cv.g:3523:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter returns [de.tu_bs.cs.isf.mbse.cvclipse.Letter element = null] : a0= 'letter' a1= 'recipient' ( ( (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) ) | (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) ) | (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) ) | (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) ) | (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) ) | (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* ) | (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* ) | (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* ) | (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) ) )* ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.Letter parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.Letter element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a20=null;
        Token a22=null;
        Token a23=null;
        Token a25=null;
        Token a27=null;
        Token a28=null;
        Token a30=null;
        Token a32=null;
        Token a33=null;
        Token a35=null;
        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a19_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a21_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a24_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a26_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a29_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a31_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a34_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a36_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Cv.g:3526:2: (a0= 'letter' a1= 'recipient' ( ( (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) ) | (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) ) | (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) ) | (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) ) | (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) ) | (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* ) | (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* ) | (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* ) | (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) ) )* )
            // Cv.g:3527:2: a0= 'letter' a1= 'recipient' ( ( (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) ) | (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) ) | (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) ) | (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) ) | (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) ) | (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* ) | (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* ) | (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* ) | (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) ) )*
            {
            a0=(Token)match(input,41,FOLLOW_41_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3693); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[994]);
            	}

            a1=(Token)match(input,56,FOLLOW_56_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3707); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[995]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[996]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[997]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[998]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[999]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1000]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1001]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1002]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1003]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1004]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1005]);
            	}

            // Cv.g:3565:2: ( ( (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) ) | (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) ) | (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) ) | (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) ) | (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) ) | (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* ) | (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* ) | (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* ) | (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13||LA22_0==22||LA22_0==24||(LA22_0 >= 26 && LA22_0 <= 27)||LA22_0==31||LA22_0==48||LA22_0==59||LA22_0==62) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Cv.g:3566:3: ( (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) ) | (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) ) | (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) ) | (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) ) | (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) ) | (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* ) | (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* ) | (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* ) | (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) )
            	    {
            	    // Cv.g:3566:3: ( (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) ) | (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) ) | (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) ) | (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) ) | (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) ) | (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* ) | (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* ) | (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* ) | (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* ) )
            	    int alt21=9;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt21=6;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt21=7;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt21=8;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt21=9;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // Cv.g:3567:4: (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3567:4: (a2= 'company' a3= ':' (a4= QUOTED_34_34 ) )
            	            // Cv.g:3568:5: a2= 'company' a3= ':' (a4= QUOTED_34_34 )
            	            {
            	            a2=(Token)match(input,26,FOLLOW_26_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3736); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_0_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1006]);
            	            				}

            	            a3=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3759); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_0_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1007]);
            	            				}

            	            // Cv.g:3596:5: (a4= QUOTED_34_34 )
            	            // Cv.g:3597:6: a4= QUOTED_34_34
            	            {
            	            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3789); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a4 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COMPANY), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COMPANY), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_0_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1008]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1009]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1010]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1011]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1012]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1013]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1014]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1015]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1016]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1017]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1018]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1019]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1020]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1021]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1022]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1023]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1024]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1025]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1026]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1027]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1028]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1029]);
            	            			}

            	            }
            	            break;
            	        case 2 :
            	            // Cv.g:3659:8: (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3659:8: (a5= 'street' a6= ':' (a7= QUOTED_34_34 ) )
            	            // Cv.g:3660:5: a5= 'street' a6= ':' (a7= QUOTED_34_34 )
            	            {
            	            a5=(Token)match(input,59,FOLLOW_59_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3855); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_1_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1030]);
            	            				}

            	            a6=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3878); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_1_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1031]);
            	            				}

            	            // Cv.g:3688:5: (a7= QUOTED_34_34 )
            	            // Cv.g:3689:6: a7= QUOTED_34_34
            	            {
            	            a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3908); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a7 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_STREET), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_STREET), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_1_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1032]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1033]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1034]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1035]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1036]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1037]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1038]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1039]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1040]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1041]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1042]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1043]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1044]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1045]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1046]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1047]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1048]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1049]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1050]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1051]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1052]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1053]);
            	            			}

            	            }
            	            break;
            	        case 3 :
            	            // Cv.g:3751:8: (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3751:8: (a8= 'city' a9= ':' (a10= QUOTED_34_34 ) )
            	            // Cv.g:3752:5: a8= 'city' a9= ':' (a10= QUOTED_34_34 )
            	            {
            	            a8=(Token)match(input,22,FOLLOW_22_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3974); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_2_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1054]);
            	            				}

            	            a9=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3997); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_2_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1055]);
            	            				}

            	            // Cv.g:3780:5: (a10= QUOTED_34_34 )
            	            // Cv.g:3781:6: a10= QUOTED_34_34
            	            {
            	            a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4027); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a10 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_CITY), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_CITY), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_2_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1056]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1057]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1058]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1059]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1060]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1061]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1062]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1063]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1064]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1065]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1066]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1067]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1068]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1069]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1070]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1071]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1072]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1073]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1074]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1075]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1076]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1077]);
            	            			}

            	            }
            	            break;
            	        case 4 :
            	            // Cv.g:3843:8: (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3843:8: (a11= 'country' a12= ':' (a13= QUOTED_34_34 ) )
            	            // Cv.g:3844:5: a11= 'country' a12= ':' (a13= QUOTED_34_34 )
            	            {
            	            a11=(Token)match(input,27,FOLLOW_27_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4093); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_3_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1078]);
            	            				}

            	            a12=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4116); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_3_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1079]);
            	            				}

            	            // Cv.g:3872:5: (a13= QUOTED_34_34 )
            	            // Cv.g:3873:6: a13= QUOTED_34_34
            	            {
            	            a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4146); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a13 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COUNTRY), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COUNTRY), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_3_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1080]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1081]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1082]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1083]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1084]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1085]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1086]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1087]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1088]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1089]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1090]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1091]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1092]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1093]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1094]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1095]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1096]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1097]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1098]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1099]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1100]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1101]);
            	            			}

            	            }
            	            break;
            	        case 5 :
            	            // Cv.g:3935:8: (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) )
            	            {
            	            // Cv.g:3935:8: (a14= 'attention' a15= ':' (a16= QUOTED_34_34 ) )
            	            // Cv.g:3936:5: a14= 'attention' a15= ':' (a16= QUOTED_34_34 )
            	            {
            	            a14=(Token)match(input,13,FOLLOW_13_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4212); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_4_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1102]);
            	            				}

            	            a15=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4235); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_4_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1103]);
            	            				}

            	            // Cv.g:3964:5: (a16= QUOTED_34_34 )
            	            // Cv.g:3965:6: a16= QUOTED_34_34
            	            {
            	            a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4265); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a16 != null) {
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            	            							tokenResolver.setOptions(getOptions());
            	            							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            	            							tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_ATTENTION), result);
            	            							Object resolvedObject = result.getResolvedToken();
            	            							if (resolvedObject == null) {
            	            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
            	            							}
            	            							java.lang.String resolved = (java.lang.String) resolvedObject;
            	            							if (resolved != null) {
            	            								Object value = resolved;
            	            								element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_ATTENTION), value);
            	            								completedElement(value, false);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_4_0_0_0_2, resolved, true);
            	            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1104]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1105]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1106]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1107]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1108]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1109]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1110]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1111]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1112]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1113]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1114]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1115]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1116]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1117]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1118]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1119]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1120]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1121]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1122]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1123]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1124]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1125]);
            	            			}

            	            }
            	            break;
            	        case 6 :
            	            // Cv.g:4027:8: (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* )
            	            {
            	            // Cv.g:4027:8: (a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )* )
            	            // Cv.g:4028:5: a17= 'opening' a18= ':' (a19_0= parse_java_util_Map_Entry ) ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )*
            	            {
            	            a17=(Token)match(input,48,FOLLOW_48_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4331); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1126]);
            	            				}

            	            a18=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4354); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1127]);
            	            				}

            	            // Cv.g:4056:5: (a19_0= parse_java_util_Map_Entry )
            	            // Cv.g:4057:6: a19_0= parse_java_util_Map_Entry
            	            {
            	            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4384);
            	            a19_0=parse_java_util_Map_Entry();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a19_0 != null) {
            	            							if (a19_0 != null) {
            	            								Object value = a19_0;
            	            								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__OPENING), a19_0);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_2, a19_0, true);
            	            							copyLocalizationInfos(a19_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1128]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1129]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1130]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1131]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1132]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1133]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1134]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1135]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1136]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1137]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1138]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1139]);
            	            				}

            	            // Cv.g:4093:5: ( (a20= ',' (a21_0= parse_java_util_Map_Entry ) ) )*
            	            loop17:
            	            do {
            	                int alt17=2;
            	                int LA17_0 = input.LA(1);

            	                if ( (LA17_0==9) ) {
            	                    alt17=1;
            	                }


            	                switch (alt17) {
            	            	case 1 :
            	            	    // Cv.g:4094:6: (a20= ',' (a21_0= parse_java_util_Map_Entry ) )
            	            	    {
            	            	    // Cv.g:4094:6: (a20= ',' (a21_0= parse_java_util_Map_Entry ) )
            	            	    // Cv.g:4095:7: a20= ',' (a21_0= parse_java_util_Map_Entry )
            	            	    {
            	            	    a20=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4432); if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    							if (element == null) {
            	            	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    								startIncompleteElement(element);
            	            	    							}
            	            	    							collectHiddenTokens(element);
            	            	    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_3_0_0_0, null, true);
            	            	    							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            	            	    						}

            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1140]);
            	            	    						}

            	            	    // Cv.g:4109:7: (a21_0= parse_java_util_Map_Entry )
            	            	    // Cv.g:4110:8: a21_0= parse_java_util_Map_Entry
            	            	    {
            	            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4470);
            	            	    a21_0=parse_java_util_Map_Entry();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    								if (terminateParsing) {
            	            	    									throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            	    								}
            	            	    								if (element == null) {
            	            	    									element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    									startIncompleteElement(element);
            	            	    								}
            	            	    								if (a21_0 != null) {
            	            	    									if (a21_0 != null) {
            	            	    										Object value = a21_0;
            	            	    										addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__OPENING), a21_0);
            	            	    										completedElement(value, true);
            	            	    									}
            	            	    									collectHiddenTokens(element);
            	            	    									retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_3_0_0_1, a21_0, true);
            	            	    									copyLocalizationInfos(a21_0, element);
            	            	    								}
            	            	    							}

            	            	    }


            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1141]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1142]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1143]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1144]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1145]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1146]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1147]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1148]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1149]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1150]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1151]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1152]);
            	            	    						}

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop17;
            	                }
            	            } while (true);


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1153]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1154]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1155]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1156]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1157]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1158]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1159]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1160]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1161]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1162]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1163]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1164]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1165]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1166]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1167]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1168]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1169]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1170]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1171]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1172]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1173]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1174]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1175]);
            	            			}

            	            }
            	            break;
            	        case 7 :
            	            // Cv.g:4181:8: (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* )
            	            {
            	            // Cv.g:4181:8: (a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )* )
            	            // Cv.g:4182:5: a22= 'text' a23= ':' (a24_0= parse_java_util_Map_Entry ) ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )*
            	            {
            	            a22=(Token)match(input,62,FOLLOW_62_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4568); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1176]);
            	            				}

            	            a23=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4591); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1177]);
            	            				}

            	            // Cv.g:4210:5: (a24_0= parse_java_util_Map_Entry )
            	            // Cv.g:4211:6: a24_0= parse_java_util_Map_Entry
            	            {
            	            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4621);
            	            a24_0=parse_java_util_Map_Entry();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a24_0 != null) {
            	            							if (a24_0 != null) {
            	            								Object value = a24_0;
            	            								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__TEXT), a24_0);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_2, a24_0, true);
            	            							copyLocalizationInfos(a24_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1178]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1179]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1180]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1181]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1182]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1183]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1184]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1185]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1186]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1187]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1188]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1189]);
            	            				}

            	            // Cv.g:4247:5: ( (a25= ',' (a26_0= parse_java_util_Map_Entry ) ) )*
            	            loop18:
            	            do {
            	                int alt18=2;
            	                int LA18_0 = input.LA(1);

            	                if ( (LA18_0==9) ) {
            	                    alt18=1;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // Cv.g:4248:6: (a25= ',' (a26_0= parse_java_util_Map_Entry ) )
            	            	    {
            	            	    // Cv.g:4248:6: (a25= ',' (a26_0= parse_java_util_Map_Entry ) )
            	            	    // Cv.g:4249:7: a25= ',' (a26_0= parse_java_util_Map_Entry )
            	            	    {
            	            	    a25=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4669); if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    							if (element == null) {
            	            	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    								startIncompleteElement(element);
            	            	    							}
            	            	    							collectHiddenTokens(element);
            	            	    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_3_0_0_0, null, true);
            	            	    							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a25, element);
            	            	    						}

            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1190]);
            	            	    						}

            	            	    // Cv.g:4263:7: (a26_0= parse_java_util_Map_Entry )
            	            	    // Cv.g:4264:8: a26_0= parse_java_util_Map_Entry
            	            	    {
            	            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4707);
            	            	    a26_0=parse_java_util_Map_Entry();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    								if (terminateParsing) {
            	            	    									throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            	    								}
            	            	    								if (element == null) {
            	            	    									element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    									startIncompleteElement(element);
            	            	    								}
            	            	    								if (a26_0 != null) {
            	            	    									if (a26_0 != null) {
            	            	    										Object value = a26_0;
            	            	    										addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__TEXT), a26_0);
            	            	    										completedElement(value, true);
            	            	    									}
            	            	    									collectHiddenTokens(element);
            	            	    									retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_3_0_0_1, a26_0, true);
            	            	    									copyLocalizationInfos(a26_0, element);
            	            	    								}
            	            	    							}

            	            	    }


            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1191]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1192]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1193]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1194]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1195]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1196]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1197]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1198]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1199]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1200]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1201]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1202]);
            	            	    						}

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop18;
            	                }
            	            } while (true);


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1203]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1204]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1205]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1206]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1207]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1208]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1209]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1210]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1211]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1212]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1213]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1214]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1215]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1216]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1217]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1218]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1219]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1220]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1221]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1222]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1223]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1224]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1225]);
            	            			}

            	            }
            	            break;
            	        case 8 :
            	            // Cv.g:4335:8: (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* )
            	            {
            	            // Cv.g:4335:8: (a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )* )
            	            // Cv.g:4336:5: a27= 'closing' a28= ':' (a29_0= parse_java_util_Map_Entry ) ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )*
            	            {
            	            a27=(Token)match(input,24,FOLLOW_24_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4805); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1226]);
            	            				}

            	            a28=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4828); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a28, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1227]);
            	            				}

            	            // Cv.g:4364:5: (a29_0= parse_java_util_Map_Entry )
            	            // Cv.g:4365:6: a29_0= parse_java_util_Map_Entry
            	            {
            	            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4858);
            	            a29_0=parse_java_util_Map_Entry();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a29_0 != null) {
            	            							if (a29_0 != null) {
            	            								Object value = a29_0;
            	            								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__CLOSING), a29_0);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_2, a29_0, true);
            	            							copyLocalizationInfos(a29_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1228]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1229]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1230]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1231]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1232]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1233]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1234]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1235]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1236]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1237]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1238]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1239]);
            	            				}

            	            // Cv.g:4401:5: ( (a30= ',' (a31_0= parse_java_util_Map_Entry ) ) )*
            	            loop19:
            	            do {
            	                int alt19=2;
            	                int LA19_0 = input.LA(1);

            	                if ( (LA19_0==9) ) {
            	                    alt19=1;
            	                }


            	                switch (alt19) {
            	            	case 1 :
            	            	    // Cv.g:4402:6: (a30= ',' (a31_0= parse_java_util_Map_Entry ) )
            	            	    {
            	            	    // Cv.g:4402:6: (a30= ',' (a31_0= parse_java_util_Map_Entry ) )
            	            	    // Cv.g:4403:7: a30= ',' (a31_0= parse_java_util_Map_Entry )
            	            	    {
            	            	    a30=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4906); if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    							if (element == null) {
            	            	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    								startIncompleteElement(element);
            	            	    							}
            	            	    							collectHiddenTokens(element);
            	            	    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_3_0_0_0, null, true);
            	            	    							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
            	            	    						}

            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1240]);
            	            	    						}

            	            	    // Cv.g:4417:7: (a31_0= parse_java_util_Map_Entry )
            	            	    // Cv.g:4418:8: a31_0= parse_java_util_Map_Entry
            	            	    {
            	            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4944);
            	            	    a31_0=parse_java_util_Map_Entry();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    								if (terminateParsing) {
            	            	    									throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            	    								}
            	            	    								if (element == null) {
            	            	    									element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    									startIncompleteElement(element);
            	            	    								}
            	            	    								if (a31_0 != null) {
            	            	    									if (a31_0 != null) {
            	            	    										Object value = a31_0;
            	            	    										addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__CLOSING), a31_0);
            	            	    										completedElement(value, true);
            	            	    									}
            	            	    									collectHiddenTokens(element);
            	            	    									retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_3_0_0_1, a31_0, true);
            	            	    									copyLocalizationInfos(a31_0, element);
            	            	    								}
            	            	    							}

            	            	    }


            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1241]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1242]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1243]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1244]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1245]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1246]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1247]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1248]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1249]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1250]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1251]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1252]);
            	            	    						}

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop19;
            	                }
            	            } while (true);


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1253]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1254]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1255]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1256]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1257]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1258]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1259]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1260]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1261]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1262]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1263]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1264]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1265]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1266]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1267]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1268]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1269]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1270]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1271]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1272]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1273]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1274]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1275]);
            	            			}

            	            }
            	            break;
            	        case 9 :
            	            // Cv.g:4489:8: (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* )
            	            {
            	            // Cv.g:4489:8: (a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )* )
            	            // Cv.g:4490:5: a32= 'enclosure' a33= ':' (a34_0= parse_java_util_Map_Entry ) ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )*
            	            {
            	            a32=(Token)match(input,31,FOLLOW_31_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5042); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_0, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1276]);
            	            				}

            	            a33=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5065); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            					if (element == null) {
            	            						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            						startIncompleteElement(element);
            	            					}
            	            					collectHiddenTokens(element);
            	            					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_1, null, true);
            	            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a33, element);
            	            				}

            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1277]);
            	            				}

            	            // Cv.g:4518:5: (a34_0= parse_java_util_Map_Entry )
            	            // Cv.g:4519:6: a34_0= parse_java_util_Map_Entry
            	            {
            	            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5095);
            	            a34_0=parse_java_util_Map_Entry();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (terminateParsing) {
            	            							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            						}
            	            						if (element == null) {
            	            							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            							startIncompleteElement(element);
            	            						}
            	            						if (a34_0 != null) {
            	            							if (a34_0 != null) {
            	            								Object value = a34_0;
            	            								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__ENCLOSURE), a34_0);
            	            								completedElement(value, true);
            	            							}
            	            							collectHiddenTokens(element);
            	            							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_2, a34_0, true);
            	            							copyLocalizationInfos(a34_0, element);
            	            						}
            	            					}

            	            }


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1278]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1279]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1280]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1281]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1282]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1283]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1284]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1285]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1286]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1287]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1288]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1289]);
            	            				}

            	            // Cv.g:4555:5: ( (a35= ',' (a36_0= parse_java_util_Map_Entry ) ) )*
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==9) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // Cv.g:4556:6: (a35= ',' (a36_0= parse_java_util_Map_Entry ) )
            	            	    {
            	            	    // Cv.g:4556:6: (a35= ',' (a36_0= parse_java_util_Map_Entry ) )
            	            	    // Cv.g:4557:7: a35= ',' (a36_0= parse_java_util_Map_Entry )
            	            	    {
            	            	    a35=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5143); if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    							if (element == null) {
            	            	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    								startIncompleteElement(element);
            	            	    							}
            	            	    							collectHiddenTokens(element);
            	            	    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_3_0_0_0, null, true);
            	            	    							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a35, element);
            	            	    						}

            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1290]);
            	            	    						}

            	            	    // Cv.g:4571:7: (a36_0= parse_java_util_Map_Entry )
            	            	    // Cv.g:4572:8: a36_0= parse_java_util_Map_Entry
            	            	    {
            	            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5181);
            	            	    a36_0=parse_java_util_Map_Entry();

            	            	    state._fsp--;
            	            	    if (state.failed) return element;

            	            	    if ( state.backtracking==0 ) {
            	            	    								if (terminateParsing) {
            	            	    									throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	            	    								}
            	            	    								if (element == null) {
            	            	    									element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
            	            	    									startIncompleteElement(element);
            	            	    								}
            	            	    								if (a36_0 != null) {
            	            	    									if (a36_0 != null) {
            	            	    										Object value = a36_0;
            	            	    										addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__ENCLOSURE), a36_0);
            	            	    										completedElement(value, true);
            	            	    									}
            	            	    									collectHiddenTokens(element);
            	            	    									retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_3_0_0_1, a36_0, true);
            	            	    									copyLocalizationInfos(a36_0, element);
            	            	    								}
            	            	    							}

            	            	    }


            	            	    if ( state.backtracking==0 ) {
            	            	    							// expected elements (follow set)
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1291]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1292]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1293]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1294]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1295]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1296]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1297]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1298]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1299]);
            	            	    							addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1300]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1301]);
            	            	    							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1302]);
            	            	    						}

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop20;
            	                }
            	            } while (true);


            	            if ( state.backtracking==0 ) {
            	            					// expected elements (follow set)
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1303]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1304]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1305]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1306]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1307]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1308]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1309]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1310]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1311]);
            	            					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1312]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1313]);
            	            					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1314]);
            	            				}

            	            }


            	            if ( state.backtracking==0 ) {
            	            				// expected elements (follow set)
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1315]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1316]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1317]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1318]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1319]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1320]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1321]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1322]);
            	            				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1323]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1324]);
            	            				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1325]);
            	            			}

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1326]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1327]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1328]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1329]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1330]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1331]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1332]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1333]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1334]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1335]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1336]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV"
    // Cv.g:4661:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV returns [de.tu_bs.cs.isf.mbse.cvclipse.CV element = null] : a0= 'cv' a1= 'picture' a2= ':' ( (a3= QUOTED_34_34 ) )? ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block ) )+ ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.CV parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.CV element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        de.tu_bs.cs.isf.mbse.cvclipse.Block a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Cv.g:4664:2: (a0= 'cv' a1= 'picture' a2= ':' ( (a3= QUOTED_34_34 ) )? ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block ) )+ )
            // Cv.g:4665:2: a0= 'cv' a1= 'picture' a2= ':' ( (a3= QUOTED_34_34 ) )? ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block ) )+
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5293); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1337]);
            	}

            a1=(Token)match(input,53,FOLLOW_53_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5307); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1338]);
            	}

            a2=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5321); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1339]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1340]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1341]);
            	}

            // Cv.g:4709:2: ( (a3= QUOTED_34_34 ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==QUOTED_34_34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Cv.g:4710:3: (a3= QUOTED_34_34 )
                    {
                    // Cv.g:4710:3: (a3= QUOTED_34_34 )
                    // Cv.g:4711:4: a3= QUOTED_34_34
                    {
                    a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5344); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
                    					startIncompleteElement(element);
                    				}
                    				if (a3 != null) {
                    					de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                    					tokenResolver.setOptions(getOptions());
                    					de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__PICTURE), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
                    					}
                    					java.lang.String resolved = (java.lang.String) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__PICTURE), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_3, resolved, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1342]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1343]);
            	}

            // Cv.g:4748:2: ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19||LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Cv.g:4749:3: (a4_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block )
            	    {
            	    // Cv.g:4749:3: (a4_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block )
            	    // Cv.g:4750:4: a4_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5383);
            	    a4_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a4_0 != null) {
            	    					if (a4_0 != null) {
            	    						Object value = a4_0;
            	    						addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__BLOCKS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_4, a4_0, true);
            	    					copyLocalizationInfos(a4_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1344]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1345]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1346]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1347]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock"
    // Cv.g:4781:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock returns [de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock element = null] : a0= 'block' a1= 'title' a2= ':' (a3_0= parse_java_util_Map_Entry ) ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )* ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+ ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a3_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a5_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.Item a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Cv.g:4784:2: (a0= 'block' a1= 'title' a2= ':' (a3_0= parse_java_util_Map_Entry ) ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )* ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+ )
            // Cv.g:4785:2: a0= 'block' a1= 'title' a2= ':' (a3_0= parse_java_util_Map_Entry ) ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )* ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5424); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1348]);
            	}

            a1=(Token)match(input,63,FOLLOW_63_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5438); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1349]);
            	}

            a2=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5452); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1350]);
            	}

            // Cv.g:4827:2: (a3_0= parse_java_util_Map_Entry )
            // Cv.g:4828:3: a3_0= parse_java_util_Map_Entry
            {
            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5470);
            a3_0=parse_java_util_Map_Entry();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
            				startIncompleteElement(element);
            			}
            			if (a3_0 != null) {
            				if (a3_0 != null) {
            					Object value = a3_0;
            					addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__TITLE), a3_0);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1351]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1352]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1353]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1354]);
            	}

            // Cv.g:4856:2: ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==9) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Cv.g:4857:3: (a4= ',' (a5_0= parse_java_util_Map_Entry ) )
            	    {
            	    // Cv.g:4857:3: (a4= ',' (a5_0= parse_java_util_Map_Entry ) )
            	    // Cv.g:4858:4: a4= ',' (a5_0= parse_java_util_Map_Entry )
            	    {
            	    a4=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5497); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1355]);
            	    			}

            	    // Cv.g:4872:4: (a5_0= parse_java_util_Map_Entry )
            	    // Cv.g:4873:5: a5_0= parse_java_util_Map_Entry
            	    {
            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5523);
            	    a5_0=parse_java_util_Map_Entry();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__TITLE), a5_0);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1356]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1357]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1358]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1359]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1360]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1361]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1362]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1363]);
            	}

            // Cv.g:4911:2: ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==TEXT||LA26_0==32||(LA26_0 >= 35 && LA26_0 <= 36)||LA26_0==58||LA26_0==66) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Cv.g:4912:3: ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) )
            	    {
            	    // Cv.g:4912:3: ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) )
            	    // Cv.g:4913:4: (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item )
            	    {
            	    // Cv.g:4913:4: (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item )
            	    // Cv.g:4914:5: a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5579);
            	    a6_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6_0 != null) {
            	    						if (a6_0 != null) {
            	    							Object value = a6_0;
            	    							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__ITEMS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_5_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1364]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1365]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1366]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1367]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1368]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1369]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1370]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1371]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1372]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1373]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1374]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1375]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1376]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1377]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock"
    // Cv.g:4960:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock returns [de.tu_bs.cs.isf.mbse.cvclipse.ListBlock element = null] : a0= 'list' a1= 'title' a2= ':' (a3_0= parse_java_util_Map_Entry ) ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )* ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+ ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.ListBlock parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.ListBlock element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a3_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a5_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.Item a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Cv.g:4963:2: (a0= 'list' a1= 'title' a2= ':' (a3_0= parse_java_util_Map_Entry ) ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )* ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+ )
            // Cv.g:4964:2: a0= 'list' a1= 'title' a2= ':' (a3_0= parse_java_util_Map_Entry ) ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )* ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+
            {
            a0=(Token)match(input,43,FOLLOW_43_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5635); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1378]);
            	}

            a1=(Token)match(input,63,FOLLOW_63_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5649); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1379]);
            	}

            a2=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5663); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1380]);
            	}

            // Cv.g:5006:2: (a3_0= parse_java_util_Map_Entry )
            // Cv.g:5007:3: a3_0= parse_java_util_Map_Entry
            {
            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5681);
            a3_0=parse_java_util_Map_Entry();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
            				startIncompleteElement(element);
            			}
            			if (a3_0 != null) {
            				if (a3_0 != null) {
            					Object value = a3_0;
            					addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__TITLE), a3_0);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1381]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1382]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1383]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1384]);
            	}

            // Cv.g:5035:2: ( (a4= ',' (a5_0= parse_java_util_Map_Entry ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==9) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Cv.g:5036:3: (a4= ',' (a5_0= parse_java_util_Map_Entry ) )
            	    {
            	    // Cv.g:5036:3: (a4= ',' (a5_0= parse_java_util_Map_Entry ) )
            	    // Cv.g:5037:4: a4= ',' (a5_0= parse_java_util_Map_Entry )
            	    {
            	    a4=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5708); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1385]);
            	    			}

            	    // Cv.g:5051:4: (a5_0= parse_java_util_Map_Entry )
            	    // Cv.g:5052:5: a5_0= parse_java_util_Map_Entry
            	    {
            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5734);
            	    a5_0=parse_java_util_Map_Entry();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__TITLE), a5_0);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1386]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1387]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1388]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1389]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1390]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1391]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1392]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1393]);
            	}

            // Cv.g:5090:2: ( ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==TEXT||LA28_0==32||(LA28_0 >= 35 && LA28_0 <= 36)||LA28_0==58||LA28_0==66) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Cv.g:5091:3: ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) )
            	    {
            	    // Cv.g:5091:3: ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item ) )
            	    // Cv.g:5092:4: (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item )
            	    {
            	    // Cv.g:5092:4: (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item )
            	    // Cv.g:5093:5: a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5790);
            	    a6_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6_0 != null) {
            	    						if (a6_0 != null) {
            	    							Object value = a6_0;
            	    							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__ITEMS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_5_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1394]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1395]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1396]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1397]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1398]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1399]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1400]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1401]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1402]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1403]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1404]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1405]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1406]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1407]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem"
    // Cv.g:5139:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem returns [de.tu_bs.cs.isf.mbse.cvclipse.TextItem element = null] : ( ( ( (a0_0= parse_java_util_Map_Entry ) ) ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )* ) )? a3= '|' (a4_0= parse_java_util_Map_Entry ) ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )* ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.TextItem parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.TextItem element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_StartIndex = input.index();

        Token a1=null;
        Token a3=null;
        Token a5=null;
        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a0_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a2_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a4_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Cv.g:5142:2: ( ( ( ( (a0_0= parse_java_util_Map_Entry ) ) ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )* ) )? a3= '|' (a4_0= parse_java_util_Map_Entry ) ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )* )
            // Cv.g:5143:2: ( ( ( (a0_0= parse_java_util_Map_Entry ) ) ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )* ) )? a3= '|' (a4_0= parse_java_util_Map_Entry ) ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )*
            {
            // Cv.g:5143:2: ( ( ( (a0_0= parse_java_util_Map_Entry ) ) ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )* ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32||(LA30_0 >= 35 && LA30_0 <= 36)||LA30_0==58) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Cv.g:5144:3: ( ( (a0_0= parse_java_util_Map_Entry ) ) ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )* )
                    {
                    // Cv.g:5144:3: ( ( (a0_0= parse_java_util_Map_Entry ) ) ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )* )
                    // Cv.g:5145:4: ( (a0_0= parse_java_util_Map_Entry ) ) ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )*
                    {
                    // Cv.g:5145:4: ( (a0_0= parse_java_util_Map_Entry ) )
                    // Cv.g:5146:5: (a0_0= parse_java_util_Map_Entry )
                    {
                    // Cv.g:5146:5: (a0_0= parse_java_util_Map_Entry )
                    // Cv.g:5147:6: a0_0= parse_java_util_Map_Entry
                    {
                    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem5868);
                    a0_0=parse_java_util_Map_Entry();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    						if (terminateParsing) {
                    							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
                    						}
                    						if (element == null) {
                    							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
                    							startIncompleteElement(element);
                    						}
                    						if (a0_0 != null) {
                    							if (a0_0 != null) {
                    								Object value = a0_0;
                    								addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__LEFT_CONTENT), a0_0);
                    								completedElement(value, true);
                    							}
                    							collectHiddenTokens(element);
                    							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_0_0_0_0_0_0_0, a0_0, true);
                    							copyLocalizationInfos(a0_0, element);
                    						}
                    					}

                    }


                    if ( state.backtracking==0 ) {
                    					// expected elements (follow set)
                    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1408]);
                    					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1409]);
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1410]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1411]);
                    			}

                    // Cv.g:5180:4: ( (a1= ',' (a2_0= parse_java_util_Map_Entry ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==9) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Cv.g:5181:5: (a1= ',' (a2_0= parse_java_util_Map_Entry ) )
                    	    {
                    	    // Cv.g:5181:5: (a1= ',' (a2_0= parse_java_util_Map_Entry ) )
                    	    // Cv.g:5182:6: a1= ',' (a2_0= parse_java_util_Map_Entry )
                    	    {
                    	    a1=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem5927); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_0_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getTextItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1412]);
                    	    					}

                    	    // Cv.g:5196:6: (a2_0= parse_java_util_Map_Entry )
                    	    // Cv.g:5197:7: a2_0= parse_java_util_Map_Entry
                    	    {
                    	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem5961);
                    	    a2_0=parse_java_util_Map_Entry();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a2_0 != null) {
                    	    								if (a2_0 != null) {
                    	    									Object value = a2_0;
                    	    									addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__LEFT_CONTENT), a2_0);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_0_0_0_1_0_0_1, a2_0, true);
                    	    								copyLocalizationInfos(a2_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1413]);
                    	    						addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1414]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1415]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1416]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1417]);
            	}

            a3=(Token)match(input,66,FOLLOW_66_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6035); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getTextItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1418]);
            	}

            // Cv.g:5252:2: (a4_0= parse_java_util_Map_Entry )
            // Cv.g:5253:3: a4_0= parse_java_util_Map_Entry
            {
            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6053);
            a4_0=parse_java_util_Map_Entry();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
            				startIncompleteElement(element);
            			}
            			if (a4_0 != null) {
            				if (a4_0 != null) {
            					Object value = a4_0;
            					addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__RIGHT_CONTENT), a4_0);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_2, a4_0, true);
            				copyLocalizationInfos(a4_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1419]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1420]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1421]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1422]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1423]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1424]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1425]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1426]);
            	}

            // Cv.g:5285:2: ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==9) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Cv.g:5286:3: (a5= ',' (a6_0= parse_java_util_Map_Entry ) )
            	    {
            	    // Cv.g:5286:3: (a5= ',' (a6_0= parse_java_util_Map_Entry ) )
            	    // Cv.g:5287:4: a5= ',' (a6_0= parse_java_util_Map_Entry )
            	    {
            	    a5=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6080); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getTextItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1427]);
            	    			}

            	    // Cv.g:5301:4: (a6_0= parse_java_util_Map_Entry )
            	    // Cv.g:5302:5: a6_0= parse_java_util_Map_Entry
            	    {
            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6106);
            	    a6_0=parse_java_util_Map_Entry();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6_0 != null) {
            	    						if (a6_0 != null) {
            	    							Object value = a6_0;
            	    							addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__RIGHT_CONTENT), a6_0);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_3_0_0_1, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1428]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1429]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1430]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1431]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1432]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1433]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1434]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1435]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1436]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1437]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1438]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1439]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1440]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1441]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1442]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1443]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem"
    // Cv.g:5350:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem returns [de.tu_bs.cs.isf.mbse.cvclipse.DateItem element = null] : (a0_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ( (a1= '-' (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )? a3= '|' (a4_0= parse_java_util_Map_Entry ) ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )* ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.DateItem parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.DateItem element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_StartIndex = input.index();

        Token a1=null;
        Token a3=null;
        Token a5=null;
        de.tu_bs.cs.isf.mbse.cvclipse.Date a0_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.Date a2_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a4_0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Cv.g:5353:2: ( (a0_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ( (a1= '-' (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )? a3= '|' (a4_0= parse_java_util_Map_Entry ) ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )* )
            // Cv.g:5354:2: (a0_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ( (a1= '-' (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )? a3= '|' (a4_0= parse_java_util_Map_Entry ) ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )*
            {
            // Cv.g:5354:2: (a0_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date )
            // Cv.g:5355:3: a0_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date
            {
            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6166);
            a0_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__BEGIN), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1444]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1445]);
            	}

            // Cv.g:5381:2: ( (a1= '-' (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==10) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Cv.g:5382:3: (a1= '-' (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) )
                    {
                    // Cv.g:5382:3: (a1= '-' (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date ) )
                    // Cv.g:5383:4: a1= '-' (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date )
                    {
                    a1=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6193); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDateItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1446]);
                    			}

                    // Cv.g:5397:4: (a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date )
                    // Cv.g:5398:5: a2_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6219);
                    a2_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
                    						startIncompleteElement(element);
                    					}
                    					if (a2_0 != null) {
                    						if (a2_0 != null) {
                    							Object value = a2_0;
                    							element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__END), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_1_0_0_1, a2_0, true);
                    						copyLocalizationInfos(a2_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1447]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1448]);
            	}

            a3=(Token)match(input,66,FOLLOW_66_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6260); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDateItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1449]);
            	}

            // Cv.g:5444:2: (a4_0= parse_java_util_Map_Entry )
            // Cv.g:5445:3: a4_0= parse_java_util_Map_Entry
            {
            pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6278);
            a4_0=parse_java_util_Map_Entry();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
            				startIncompleteElement(element);
            			}
            			if (a4_0 != null) {
            				if (a4_0 != null) {
            					Object value = a4_0;
            					addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__RIGHT_CONTENT), a4_0);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_3, a4_0, true);
            				copyLocalizationInfos(a4_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1450]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1451]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1452]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1453]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1454]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1455]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1456]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1457]);
            	}

            // Cv.g:5477:2: ( (a5= ',' (a6_0= parse_java_util_Map_Entry ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==9) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Cv.g:5478:3: (a5= ',' (a6_0= parse_java_util_Map_Entry ) )
            	    {
            	    // Cv.g:5478:3: (a5= ',' (a6_0= parse_java_util_Map_Entry ) )
            	    // Cv.g:5479:4: a5= ',' (a6_0= parse_java_util_Map_Entry )
            	    {
            	    a5=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6305); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDateItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1458]);
            	    			}

            	    // Cv.g:5493:4: (a6_0= parse_java_util_Map_Entry )
            	    // Cv.g:5494:5: a6_0= parse_java_util_Map_Entry
            	    {
            	    pushFollow(FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6331);
            	    a6_0=parse_java_util_Map_Entry();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6_0 != null) {
            	    						if (a6_0 != null) {
            	    							Object value = a6_0;
            	    							addMapEntry(element, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__RIGHT_CONTENT), a6_0);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_4_0_0_1, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1459]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1460]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1461]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1462]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1463]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1464]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1465]);
            	    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1466]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1467]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1468]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1469]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1470]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1471]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1472]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1473]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1474]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date"
    // Cv.g:5542:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date returns [de.tu_bs.cs.isf.mbse.cvclipse.Date element = null] : (a0= TEXT ) a1= '/' (a2= TEXT ) ( (a3= '/' (a4= TEXT ) ) )? ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.Date parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.Date element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Cv.g:5545:2: ( (a0= TEXT ) a1= '/' (a2= TEXT ) ( (a3= '/' (a4= TEXT ) ) )? )
            // Cv.g:5546:2: (a0= TEXT ) a1= '/' (a2= TEXT ) ( (a3= '/' (a4= TEXT ) ) )?
            {
            // Cv.g:5546:2: (a0= TEXT )
            // Cv.g:5547:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6391); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__YEAR), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__YEAR), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_8_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1475]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6412); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_8_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1476]);
            	}

            // Cv.g:5596:2: (a2= TEXT )
            // Cv.g:5597:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6430); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__MONTH), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__MONTH), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_8_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1477]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1478]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1479]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1480]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1481]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1482]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1483]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1484]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1485]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1486]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1487]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1488]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1489]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1490]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1491]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1492]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1493]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1494]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1495]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1496]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1497]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1498]);
            	}

            // Cv.g:5653:2: ( (a3= '/' (a4= TEXT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==11) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Cv.g:5654:3: (a3= '/' (a4= TEXT ) )
                    {
                    // Cv.g:5654:3: (a3= '/' (a4= TEXT ) )
                    // Cv.g:5655:4: a3= '/' (a4= TEXT )
                    {
                    a3=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6460); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_8_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1499]);
                    			}

                    // Cv.g:5669:4: (a4= TEXT )
                    // Cv.g:5670:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6486); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
                    						startIncompleteElement(element);
                    					}
                    					if (a4 != null) {
                    						de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__DAY), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__DAY), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_8_0_0_3_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1500]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1501]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1502]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1503]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1504]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1505]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1506]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1507]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1508]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1509]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1510]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1511]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1512]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1513]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1514]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1515]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1516]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1517]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1518]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1519]);
                    				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1520]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1521]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1522]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1523]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1524]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1525]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1526]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1527]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1528]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1529]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1530]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1531]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1532]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1533]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1534]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1535]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1536]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1537]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1538]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1539]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1540]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1541]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date"



    // $ANTLR start "parse_java_util_Map_Entry"
    // Cv.g:5754:1: parse_java_util_Map_Entry returns [de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject element = null] : ( (a0= 'german' |a1= 'english' |a2= 'french' |a3= 'spanish' ) ) (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text ) ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject parse_java_util_Map_Entry() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject element =  null;

        int parse_java_util_Map_Entry_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        de.tu_bs.cs.isf.mbse.cvclipse.Text a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Cv.g:5757:2: ( ( (a0= 'german' |a1= 'english' |a2= 'french' |a3= 'spanish' ) ) (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text ) )
            // Cv.g:5758:2: ( (a0= 'german' |a1= 'english' |a2= 'french' |a3= 'spanish' ) ) (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text )
            {
            // Cv.g:5758:2: ( (a0= 'german' |a1= 'english' |a2= 'french' |a3= 'spanish' ) )
            // Cv.g:5759:3: (a0= 'german' |a1= 'english' |a2= 'french' |a3= 'spanish' )
            {
            // Cv.g:5759:3: (a0= 'german' |a1= 'english' |a2= 'french' |a3= 'spanish' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt35=1;
                }
                break;
            case 32:
                {
                alt35=2;
                }
                break;
            case 35:
                {
                alt35=3;
                }
                break;
            case 58:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // Cv.g:5760:4: a0= 'german'
                    {
                    a0=(Token)match(input,36,FOLLOW_36_in_parse_java_util_Map_Entry6556); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.GERMAN_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Cv.g:5773:8: a1= 'english'
                    {
                    a1=(Token)match(input,32,FOLLOW_32_in_parse_java_util_Map_Entry6571); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.ENGLISH_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Cv.g:5786:8: a2= 'french'
                    {
                    a2=(Token)match(input,35,FOLLOW_35_in_parse_java_util_Map_Entry6586); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.FRENCH_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Cv.g:5799:8: a3= 'spanish'
                    {
                    a3=(Token)match(input,58,FOLLOW_58_in_parse_java_util_Map_Entry6601); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguage().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Language.SPANISH_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguageToTextMapEntry(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1542]);
            	}

            // Cv.g:5819:2: (a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text )
            // Cv.g:5820:3: a6_0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text
            {
            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text_in_parse_java_util_Map_Entry6626);
            a6_0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
            				startIncompleteElement(element);
            			}
            			if (a6_0 != null) {
            				if (a6_0 != null) {
            					Object value = a6_0;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__VALUE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_1, a6_0, true);
            				copyLocalizationInfos(a6_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1543]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1544]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1545]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1546]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1547]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1548]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1549]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1550]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1551]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1552]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1553]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1554]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1555]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1556]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1557]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1558]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1559]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1560]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1561]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1562]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1563]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1564]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1565]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1566]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1567]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1568]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1569]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1570]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1571]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1572]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1573]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1574]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1575]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1576]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1577]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1578]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1579]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1580]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1581]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_java_util_Map_Entry_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_java_util_Map_Entry"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text"
    // Cv.g:5885:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text returns [de.tu_bs.cs.isf.mbse.cvclipse.Text element = null] : (a0= QUOTED_34_34 ) ;
    public final de.tu_bs.cs.isf.mbse.cvclipse.Text parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.Text element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Cv.g:5888:2: ( (a0= QUOTED_34_34 ) )
            // Cv.g:5889:2: (a0= QUOTED_34_34 )
            {
            // Cv.g:5889:2: (a0= QUOTED_34_34 )
            // Cv.g:5890:3: a0= QUOTED_34_34
            {
            a0=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text6663); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createText();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT__CONTENT), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT__CONTENT), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_10_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1582]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1583]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1584]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1585]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1586]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1587]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1588]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1589]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1590]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1591]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1592]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1593]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1594]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1595]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1596]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1597]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1598]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1599]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1600]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1601]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1602]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1603]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1604]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1605]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1606]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1607]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1608]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1609]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1610]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1611]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1612]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1613]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1614]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1615]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1616]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1617]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1618]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1619]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1620]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block"
    // Cv.g:5965:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block returns [de.tu_bs.cs.isf.mbse.cvclipse.Block element = null] : (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock |c1= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock );
    public final de.tu_bs.cs.isf.mbse.cvclipse.Block parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.Block element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block_StartIndex = input.index();

        de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock c0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.ListBlock c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Cv.g:5966:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock |c1= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            else if ( (LA36_0==43) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // Cv.g:5967:2: c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block6695);
                    c0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Cv.g:5968:4: c1= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block6705);
                    c1=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item"
    // Cv.g:5972:1: parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item returns [de.tu_bs.cs.isf.mbse.cvclipse.Item element = null] : (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem |c1= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem );
    public final de.tu_bs.cs.isf.mbse.cvclipse.Item parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.cvclipse.Item element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item_StartIndex = input.index();

        de.tu_bs.cs.isf.mbse.cvclipse.TextItem c0 =null;

        de.tu_bs.cs.isf.mbse.cvclipse.DateItem c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Cv.g:5973:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem |c1= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32||(LA37_0 >= 35 && LA37_0 <= 36)||LA37_0==58||LA37_0==66) ) {
                alt37=1;
            }
            else if ( (LA37_0==TEXT) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // Cv.g:5974:2: c0= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item6726);
                    c0=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Cv.g:5975:4: c1= parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item6736);
                    c1=parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application115 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application133 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application150 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_36_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application178 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_32_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application195 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_35_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application212 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_58_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application229 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application266 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_36_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application304 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_32_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application325 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_35_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application346 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_58_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application367 = new BitSet(new long[]{0x1048000022000200L});
    public static final BitSet FOLLOW_60_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application437 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application457 = new BitSet(new long[]{0x0000800000A04000L});
    public static final BitSet FOLLOW_21_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application490 = new BitSet(new long[]{0x0048000022000000L});
    public static final BitSet FOLLOW_23_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application509 = new BitSet(new long[]{0x0048000022000000L});
    public static final BitSet FOLLOW_47_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application528 = new BitSet(new long[]{0x0048000022000000L});
    public static final BitSet FOLLOW_14_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application547 = new BitSet(new long[]{0x0048000022000000L});
    public static final BitSet FOLLOW_25_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application620 = new BitSet(new long[]{0x028400C000140000L});
    public static final BitSet FOLLOW_20_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application653 = new BitSet(new long[]{0x0048000020000000L});
    public static final BitSet FOLLOW_50_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application672 = new BitSet(new long[]{0x0048000020000000L});
    public static final BitSet FOLLOW_38_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application691 = new BitSet(new long[]{0x0048000020000000L});
    public static final BitSet FOLLOW_57_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application710 = new BitSet(new long[]{0x0048000020000000L});
    public static final BitSet FOLLOW_55_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application729 = new BitSet(new long[]{0x0048000020000000L});
    public static final BitSet FOLLOW_39_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application748 = new BitSet(new long[]{0x0048000020000000L});
    public static final BitSet FOLLOW_18_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application767 = new BitSet(new long[]{0x0048000020000000L});
    public static final BitSet FOLLOW_54_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application820 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application840 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application866 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application921 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application941 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application967 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application1017 = new BitSet(new long[]{0x0000020010000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application1062 = new BitSet(new long[]{0x0000020010000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application1104 = new BitSet(new long[]{0x0000020010000002L});
    public static final BitSet FOLLOW_51_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1160 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1189 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1242 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_61_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1361 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_16_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1427 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1480 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_17_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1599 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_15_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1665 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1688 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1718 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_44_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1778 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1801 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1831 = new BitSet(new long[]{0x2810742648438202L,0x0000000000000003L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1879 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation1917 = new BitSet(new long[]{0x2810742648438202L,0x0000000000000003L});
    public static final BitSet FOLLOW_46_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2015 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2038 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2068 = new BitSet(new long[]{0x2810742648438202L,0x0000000000000003L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2116 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2154 = new BitSet(new long[]{0x2810742648438202L,0x0000000000000003L});
    public static final BitSet FOLLOW_59_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2305 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_22_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2424 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_27_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2490 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2513 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2543 = new BitSet(new long[]{0x2810742648438202L,0x0000000000000003L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2591 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2629 = new BitSet(new long[]{0x2810742648438202L,0x0000000000000003L});
    public static final BitSet FOLLOW_30_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2727 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2780 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_52_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2846 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2899 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_45_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2965 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation2988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3018 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_33_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3084 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3137 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_65_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3203 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3256 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_37_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3375 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_42_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3494 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3560 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation3613 = new BitSet(new long[]{0x2810742648438002L,0x0000000000000003L});
    public static final BitSet FOLLOW_41_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3693 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3707 = new BitSet(new long[]{0x480100008D402002L});
    public static final BitSet FOLLOW_26_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3736 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3789 = new BitSet(new long[]{0x480100008D402002L});
    public static final BitSet FOLLOW_59_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3855 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3908 = new BitSet(new long[]{0x480100008D402002L});
    public static final BitSet FOLLOW_22_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3974 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter3997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4027 = new BitSet(new long[]{0x480100008D402002L});
    public static final BitSet FOLLOW_27_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4093 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4146 = new BitSet(new long[]{0x480100008D402002L});
    public static final BitSet FOLLOW_13_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4265 = new BitSet(new long[]{0x480100008D402002L});
    public static final BitSet FOLLOW_48_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4331 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4354 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4384 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4432 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4470 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_62_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4591 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4621 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4669 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4707 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_24_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4828 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4858 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4906 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter4944 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_31_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5042 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5065 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5095 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5143 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter5181 = new BitSet(new long[]{0x480100008D402202L});
    public static final BitSet FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5293 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5307 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5321 = new BitSet(new long[]{0x0000080000080020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5344 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV5383 = new BitSet(new long[]{0x0000080000080002L});
    public static final BitSet FOLLOW_19_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5424 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5438 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5452 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5470 = new BitSet(new long[]{0x0400001900000280L,0x0000000000000004L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5497 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5523 = new BitSet(new long[]{0x0400001900000280L,0x0000000000000004L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock5579 = new BitSet(new long[]{0x0400001900000082L,0x0000000000000004L});
    public static final BitSet FOLLOW_43_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5635 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5649 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5663 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5681 = new BitSet(new long[]{0x0400001900000280L,0x0000000000000004L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5708 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5734 = new BitSet(new long[]{0x0400001900000280L,0x0000000000000004L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock5790 = new BitSet(new long[]{0x0400001900000082L,0x0000000000000004L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem5868 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000004L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem5927 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem5961 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6035 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6053 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6080 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem6106 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6166 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000004L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6193 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6260 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6278 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6305 = new BitSet(new long[]{0x0400001900000000L});
    public static final BitSet FOLLOW_parse_java_util_Map_Entry_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem6331 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6412 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6430 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6460 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_parse_java_util_Map_Entry6556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32_in_parse_java_util_Map_Entry6571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35_in_parse_java_util_Map_Entry6586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_58_in_parse_java_util_Map_Entry6601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text_in_parse_java_util_Map_Entry6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_in_parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item6736 = new BitSet(new long[]{0x0000000000000002L});

}