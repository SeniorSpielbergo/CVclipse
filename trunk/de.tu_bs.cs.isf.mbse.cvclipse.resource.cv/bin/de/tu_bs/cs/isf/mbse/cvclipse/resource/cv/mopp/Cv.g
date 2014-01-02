grammar Cv;

options {
	superClass = CvANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Application returns [de.tu_bs.cs.isf.mbse.cvclipse.Application element = null]
@init{
}
:
	a0 = 'options' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1]);
	}
	
	(
		a1 = 'languages' {
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[2]);
		}
		
		a2 = ':' {
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[3]);
		}
		
		(
			(
				a3 = 'german' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
					// set value of enumeration attribute
					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.GERMAN_VALUE).getInstance();
					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
					completedElement(value, false);
				}
				|				a4 = 'english' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
					// set value of enumeration attribute
					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.ENGLISH_VALUE).getInstance();
					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
					completedElement(value, false);
				}
				|				a5 = 'french' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
					// set value of enumeration attribute
					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.FRENCH_VALUE).getInstance();
					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
					completedElement(value, false);
				}
				|				a6 = 'spanish' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_2, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
					// set value of enumeration attribute
					Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.SPANISH_VALUE).getInstance();
					addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[4]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[5]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[6]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[7]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[8]);
			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[9]);
		}
		
		(
			(
				a9 = ',' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[10]);
				}
				
				(
					(
						a10 = 'german' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
							// set value of enumeration attribute
							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.GERMAN_VALUE).getInstance();
							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
							completedElement(value, false);
						}
						|						a11 = 'english' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
							// set value of enumeration attribute
							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.ENGLISH_VALUE).getInstance();
							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
							completedElement(value, false);
						}
						|						a12 = 'french' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
							// set value of enumeration attribute
							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.FRENCH_VALUE).getInstance();
							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
							completedElement(value, false);
						}
						|						a13 = 'spanish' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_1_0_0_3_0_0_1, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
							// set value of enumeration attribute
							Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.SPANISH_VALUE).getInstance();
							addObjectToList(element, de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES, value);
							completedElement(value, false);
						}
					)
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[11]);
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[12]);
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[13]);
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[14]);
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[15]);
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[16]);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[17]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[18]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[19]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[20]);
			addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[21]);
			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[22]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[23]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[24]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[25]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[27]);
	}
	
	(
		(
			a16 = 'style' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[28]);
			}
			
			a17 = ':' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[29]);
			}
			
			(
				(
					a18 = 'casual' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyles().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Styles.CASUAL_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
						completedElement(value, false);
					}
					|					a19 = 'classic' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyles().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Styles.CLASSIC_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
						completedElement(value, false);
					}
					|					a20 = 'oldstyle' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyles().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Styles.OLDSTYLE_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
						completedElement(value, false);
					}
					|					a21 = 'banking' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_2_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getStyles().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Styles.BANKING_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE), value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[30]);
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[31]);
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[32]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[33]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[34]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[35]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[36]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[37]);
	}
	
	(
		(
			a24 = 'color' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[38]);
			}
			
			a25 = ':' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a25, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[39]);
			}
			
			(
				(
					a26 = 'blue' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColors().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Colors.BLUE_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
						completedElement(value, false);
					}
					|					a27 = 'orange' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColors().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Colors.ORANGE_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
						completedElement(value, false);
					}
					|					a28 = 'green' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a28, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColors().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Colors.GREEN_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
						completedElement(value, false);
					}
					|					a29 = 'red' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColors().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Colors.RED_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
						completedElement(value, false);
					}
					|					a30 = 'purple' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColors().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Colors.PURPLE_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
						completedElement(value, false);
					}
					|					a31 = 'grey' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a31, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColors().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Colors.GREY_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
						completedElement(value, false);
					}
					|					a32 = 'black' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_3_0_0_2, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
						// set value of enumeration attribute
						Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getColors().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Colors.BLACK_VALUE).getInstance();
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR), value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[40]);
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[41]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[42]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[44]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[45]);
	}
	
	(
		(
			a35 = 'place' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a35, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[46]);
			}
			
			a36 = ':' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a36, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[47]);
			}
			
			(
				a37 = QUOTED_34_34				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[48]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[49]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[50]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[51]);
	}
	
	(
		(
			a38 = 'date' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a38, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[52]);
			}
			
			a39 = ':' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createApplication();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_0_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a39, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[53]);
			}
			
			(
				a40_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[54]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[55]);
	}
	
	(
		(
			a41_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[56]);
			addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[57]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[58]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[59]);
	}
	
	(
		(
			(
				a42_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[60]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[61]);
			}
			
			
			|			(
				a43_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[62]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[63]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[65]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation returns [de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element = null]
@init{
}
:
	a0 = 'personal' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
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
	
	(
		(
			(
				a1 = 'firstname' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_0_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[86]);
				}
				
				a2 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_0_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[87]);
				}
				
				(
					a3 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a4 = 'surname' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_1_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[128]);
				}
				
				a5 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_1_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[129]);
				}
				
				(
					a6 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a7 = 'birthname' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_2_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[170]);
				}
				
				a8 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_2_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[171]);
				}
				
				(
					a9 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a10 = 'birthplace' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_3_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[212]);
				}
				
				a11 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_3_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[213]);
				}
				
				(
					a12 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a13 = 'birthdate' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_4_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[254]);
				}
				
				a14 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_4_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[255]);
				}
				
				(
					a15_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a16 = 'marital status' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[296]);
				}
				
				a17 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[297]);
				}
				
				(
					a18_0 = parse_java_util_Map_Entry					{
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
				)
				{
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
				
				(
					(
						a19 = ',' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_5_0_0_0_3_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[319]);
						}
						
						(
							a20_0 = parse_java_util_Map_Entry							{
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
						)
						{
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
						
					)
					
				)*				{
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
				
			)
			{
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
			
			
			|			(
				a21 = 'nationality' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[382]);
				}
				
				a22 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[383]);
				}
				
				(
					a23_0 = parse_java_util_Map_Entry					{
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
				)
				{
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
				
				(
					(
						a24 = ',' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_6_0_0_0_3_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[405]);
						}
						
						(
							a25_0 = parse_java_util_Map_Entry							{
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
						)
						{
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
						
					)
					
				)*				{
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
				
			)
			{
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
			
			
			|			(
				a26 = 'street' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_7_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[468]);
				}
				
				a27 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_7_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[469]);
				}
				
				(
					a28 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a29 = 'city' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_8_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[510]);
				}
				
				a30 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_8_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[511]);
				}
				
				(
					a31 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a32 = 'country' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[552]);
				}
				
				a33 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a33, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[553]);
				}
				
				(
					a34_0 = parse_java_util_Map_Entry					{
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
				)
				{
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
				
				(
					(
						a35 = ',' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_9_0_0_0_3_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a35, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[575]);
						}
						
						(
							a36_0 = parse_java_util_Map_Entry							{
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
						)
						{
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
						
					)
					
				)*				{
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
				
			)
			{
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
			
			
			|			(
				a37 = 'email' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_10_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a37, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[638]);
				}
				
				a38 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_10_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a38, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[639]);
				}
				
				(
					a39 = EMAIL					
					{
						if (terminateParsing) {
							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
						}
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
							startIncompleteElement(element);
						}
						if (a39 != null) {
							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("EMAIL");
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a40 = 'phone' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_11_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a40, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[680]);
				}
				
				a41 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_11_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a41, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[681]);
				}
				
				(
					a42 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a43 = 'mobile' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_12_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a43, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[722]);
				}
				
				a44 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_12_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a44, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[723]);
				}
				
				(
					a45 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a46 = 'fax' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_13_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a46, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[764]);
				}
				
				a47 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_13_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a47, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[765]);
				}
				
				(
					a48 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a49 = 'website' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_14_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a49, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[806]);
				}
				
				a50 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_14_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a50, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[807]);
				}
				
				(
					a51 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a52 = 'github' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_15_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a52, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[848]);
				}
				
				a53 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_15_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a53, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[849]);
				}
				
				(
					a54 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a55 = 'linkedin' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_16_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a55, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[890]);
				}
				
				a56 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_16_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a56, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[891]);
				}
				
				(
					a57 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a58 = 'twitter' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_17_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a58, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[932]);
				}
				
				a59 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_1_0_0_1_0_17_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a59, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[933]);
				}
				
				(
					a60 = TWITTER					
					{
						if (terminateParsing) {
							throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
						}
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createPersonalInformation();
							startIncompleteElement(element);
						}
						if (a60 != null) {
							de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TWITTER");
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
				)
				{
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
				
			)
			{
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
			
		)
		
	)*	{
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
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter returns [de.tu_bs.cs.isf.mbse.cvclipse.Letter element = null]
@init{
}
:
	a0 = 'letter' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[994]);
	}
	
	a1 = 'recipient' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
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
	
	(
		(
			(
				a2 = 'company' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_0_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1006]);
				}
				
				a3 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_0_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1007]);
				}
				
				(
					a4 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a5 = 'street' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_1_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1030]);
				}
				
				a6 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_1_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1031]);
				}
				
				(
					a7 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a8 = 'city' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_2_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1054]);
				}
				
				a9 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_2_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1055]);
				}
				
				(
					a10 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a11 = 'country' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_3_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1078]);
				}
				
				a12 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_3_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1079]);
				}
				
				(
					a13 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a14 = 'attention' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_4_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1102]);
				}
				
				a15 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_4_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1103]);
				}
				
				(
					a16 = QUOTED_34_34					
					{
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
				)
				{
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
				
			)
			{
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
			
			
			|			(
				a17 = 'opening' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1126]);
				}
				
				a18 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1127]);
				}
				
				(
					a19_0 = parse_java_util_Map_Entry					{
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
				)
				{
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
				
				(
					(
						a20 = ',' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_5_0_0_0_3_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1140]);
						}
						
						(
							a21_0 = parse_java_util_Map_Entry							{
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
						)
						{
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
						
					)
					
				)*				{
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
				
			)
			{
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
			
			
			|			(
				a22 = 'text' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1176]);
				}
				
				a23 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1177]);
				}
				
				(
					a24_0 = parse_java_util_Map_Entry					{
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
				)
				{
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
				
				(
					(
						a25 = ',' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_6_0_0_0_3_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a25, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1190]);
						}
						
						(
							a26_0 = parse_java_util_Map_Entry							{
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
						)
						{
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
						
					)
					
				)*				{
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
				
			)
			{
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
			
			
			|			(
				a27 = 'closing' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1226]);
				}
				
				a28 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a28, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1227]);
				}
				
				(
					a29_0 = parse_java_util_Map_Entry					{
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
				)
				{
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
				
				(
					(
						a30 = ',' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_7_0_0_0_3_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1240]);
						}
						
						(
							a31_0 = parse_java_util_Map_Entry							{
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
						)
						{
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
						
					)
					
				)*				{
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
				
			)
			{
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
			
			
			|			(
				a32 = 'enclosure' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1276]);
				}
				
				a33 = ':' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_1, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a33, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1277]);
				}
				
				(
					a34_0 = parse_java_util_Map_Entry					{
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
				)
				{
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
				
				(
					(
						a35 = ',' {
							if (element == null) {
								element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createLetter();
								startIncompleteElement(element);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_2_0_0_2_0_8_0_0_0_3_0_0_0, null, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a35, element);
						}
						{
							// expected elements (follow set)
							addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1290]);
						}
						
						(
							a36_0 = parse_java_util_Map_Entry							{
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
						)
						{
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
						
					)
					
				)*				{
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
				
			)
			{
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
			
		)
		
	)*	{
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
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_CV returns [de.tu_bs.cs.isf.mbse.cvclipse.CV element = null]
@init{
}
:
	a0 = 'cv' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1337]);
	}
	
	a1 = 'picture' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1338]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createCV();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1339]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1340]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1341]);
	}
	
	(
		(
			a3 = QUOTED_34_34			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1342]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1343]);
	}
	
	(
		(
			a4_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1344]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1345]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1346]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1347]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock returns [de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock element = null]
@init{
}
:
	a0 = 'block' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1348]);
	}
	
	a1 = 'title' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1349]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1350]);
	}
	
	(
		a3_0 = parse_java_util_Map_Entry		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1351]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1352]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1353]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1354]);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createItemBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_4_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1355]);
			}
			
			(
				a5_0 = parse_java_util_Map_Entry				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1356]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1357]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1358]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1359]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1360]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1361]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1362]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1363]);
	}
	
	(
		(
			(
				a6_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1364]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1365]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1366]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1367]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1368]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1369]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1370]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1371]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1372]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1373]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1374]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1375]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1376]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1377]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock returns [de.tu_bs.cs.isf.mbse.cvclipse.ListBlock element = null]
@init{
}
:
	a0 = 'list' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1378]);
	}
	
	a1 = 'title' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1379]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1380]);
	}
	
	(
		a3_0 = parse_java_util_Map_Entry		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1381]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1382]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1383]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1384]);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createListBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_5_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1385]);
			}
			
			(
				a5_0 = parse_java_util_Map_Entry				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1386]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1387]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1388]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1389]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1390]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1391]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1392]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1393]);
	}
	
	(
		(
			(
				a6_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1394]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1395]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1396]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1397]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1398]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1399]);
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1400]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1401]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1402]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1403]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1404]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1405]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1406]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1407]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem returns [de.tu_bs.cs.isf.mbse.cvclipse.TextItem element = null]
@init{
}
:
	(
		(
			(
				(
					a0_0 = parse_java_util_Map_Entry					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1408]);
					addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1409]);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1410]);
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1411]);
			}
			
			(
				(
					a1 = ',' {
						if (element == null) {
							element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_0_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getTextItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1412]);
					}
					
					(
						a2_0 = parse_java_util_Map_Entry						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1413]);
						addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1414]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1415]);
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1416]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1417]);
	}
	
	a3 = '|' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getTextItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1418]);
	}
	
	(
		a4_0 = parse_java_util_Map_Entry		{
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
	)
	{
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
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createTextItem();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_6_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getTextItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1427]);
			}
			
			(
				a6_0 = parse_java_util_Map_Entry				{
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
			)
			{
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
			
		)
		
	)*	{
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
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem returns [de.tu_bs.cs.isf.mbse.cvclipse.DateItem element = null]
@init{
}
:
	(
		a0_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1444]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1445]);
	}
	
	(
		(
			a1 = '-' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDateItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1446]);
			}
			
			(
				a2_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1447]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1448]);
	}
	
	a3 = '|' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDateItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1449]);
	}
	
	(
		a4_0 = parse_java_util_Map_Entry		{
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
	)
	{
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
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDateItem();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_7_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDateItem(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1458]);
			}
			
			(
				a6_0 = parse_java_util_Map_Entry				{
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
			)
			{
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
			
		)
		
	)*	{
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
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Date returns [de.tu_bs.cs.isf.mbse.cvclipse.Date element = null]
@init{
}
:
	(
		a0 = FOUR_DIGIT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FOUR_DIGIT");
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1475]);
	}
	
	a1 = '/' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1476]);
	}
	
	(
		a2 = TWO_DIGIT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TWO_DIGIT");
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
	)
	{
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
	
	(
		(
			a3 = '/' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_8_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1499]);
			}
			
			(
				a4 = TWO_DIGIT				
				{
					if (terminateParsing) {
						throw new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTerminateParsingException();
					}
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory.eINSTANCE.createDate();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TWO_DIGIT");
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
			)
			{
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
			
		)
		
	)?	{
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
	
;

parse_java_util_Map_Entry returns [de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject element = null]
@init{
}
:
	(
		(
			a0 = 'german' {
				if (element == null) {
					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.GERMAN_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
				completedElement(value, false);
			}
			|			a1 = 'english' {
				if (element == null) {
					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.ENGLISH_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
				completedElement(value, false);
			}
			|			a2 = 'french' {
				if (element == null) {
					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.FRENCH_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
				completedElement(value, false);
			}
			|			a3 = 'spanish' {
				if (element == null) {
					element = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvDummyEObject(de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.eINSTANCE.getLanguageToTextMapEntry(),"LanguageToTextMapEntry");
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvGrammarInformationProvider.CV_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguages().getEEnumLiteral(de.tu_bs.cs.isf.mbse.cvclipse.Languages.SPANISH_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY__KEY), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguageToTextMapEntry(), de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvExpectationConstants.EXPECTATIONS[1542]);
	}
	
	(
		a6_0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text		{
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
	)
	{
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
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Text returns [de.tu_bs.cs.isf.mbse.cvclipse.Text element = null]
@init{
}
:
	(
		a0 = QUOTED_34_34		
		{
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
	)
	{
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
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Block returns [de.tu_bs.cs.isf.mbse.cvclipse.Block element = null]
:
	c0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_de_tu_005fbs_cs_isf_mbse_cvclipse_Item returns [de.tu_bs.cs.isf.mbse.cvclipse.Item element = null]
:
	c0 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

EMAIL:
	('"'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+'@'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+'.'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+'"')
;
TWITTER:
	('"''@'('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+'"')
;
TWO_DIGIT:
	(('0'..'9')('0'..'9'))
;
FOUR_DIGIT:
	(('0'..'9')('0'..'9')('0'..'9')('0'..'9'))
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
	{ _channel = 99; }
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

