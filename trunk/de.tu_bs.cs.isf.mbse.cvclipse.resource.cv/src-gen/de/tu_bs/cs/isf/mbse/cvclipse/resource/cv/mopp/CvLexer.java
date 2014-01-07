// $ANTLR 3.4

	package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CvLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int EMAIL=4;
    public static final int FOUR_DIGIT=5;
    public static final int LINEBREAK=6;
    public static final int QUOTED_34_34=7;
    public static final int SL_COMMENT=8;
    public static final int TEXT=9;
    public static final int TWITTER=10;
    public static final int TWO_DIGIT=11;
    public static final int WHITESPACE=12;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CvLexer() {} 
    public CvLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CvLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Cv.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:15:7: ( ',' )
            // Cv.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:16:7: ( '-' )
            // Cv.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:17:7: ( '/' )
            // Cv.g:17:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:18:7: ( ':' )
            // Cv.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:19:7: ( 'attention' )
            // Cv.g:19:9: 'attention'
            {
            match("attention"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:20:7: ( 'banking' )
            // Cv.g:20:9: 'banking'
            {
            match("banking"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:21:7: ( 'birthdate' )
            // Cv.g:21:9: 'birthdate'
            {
            match("birthdate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:22:7: ( 'birthname' )
            // Cv.g:22:9: 'birthname'
            {
            match("birthname"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:23:7: ( 'birthplace' )
            // Cv.g:23:9: 'birthplace'
            {
            match("birthplace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:24:7: ( 'black' )
            // Cv.g:24:9: 'black'
            {
            match("black"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:25:7: ( 'block' )
            // Cv.g:25:9: 'block'
            {
            match("block"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:26:7: ( 'blue' )
            // Cv.g:26:9: 'blue'
            {
            match("blue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:27:7: ( 'casual' )
            // Cv.g:27:9: 'casual'
            {
            match("casual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:28:7: ( 'city' )
            // Cv.g:28:9: 'city'
            {
            match("city"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:29:7: ( 'classic' )
            // Cv.g:29:9: 'classic'
            {
            match("classic"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:30:7: ( 'closing' )
            // Cv.g:30:9: 'closing'
            {
            match("closing"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:31:7: ( 'color' )
            // Cv.g:31:9: 'color'
            {
            match("color"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:32:7: ( 'company' )
            // Cv.g:32:9: 'company'
            {
            match("company"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:33:7: ( 'country' )
            // Cv.g:33:9: 'country'
            {
            match("country"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:34:7: ( 'cv' )
            // Cv.g:34:9: 'cv'
            {
            match("cv"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:35:7: ( 'date' )
            // Cv.g:35:9: 'date'
            {
            match("date"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:36:7: ( 'email' )
            // Cv.g:36:9: 'email'
            {
            match("email"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:37:7: ( 'enclosure' )
            // Cv.g:37:9: 'enclosure'
            {
            match("enclosure"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:38:7: ( 'english' )
            // Cv.g:38:9: 'english'
            {
            match("english"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:39:7: ( 'fax' )
            // Cv.g:39:9: 'fax'
            {
            match("fax"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:40:7: ( 'firstname' )
            // Cv.g:40:9: 'firstname'
            {
            match("firstname"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:41:7: ( 'french' )
            // Cv.g:41:9: 'french'
            {
            match("french"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:42:7: ( 'german' )
            // Cv.g:42:9: 'german'
            {
            match("german"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:43:7: ( 'github' )
            // Cv.g:43:9: 'github'
            {
            match("github"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:44:7: ( 'green' )
            // Cv.g:44:9: 'green'
            {
            match("green"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:45:7: ( 'grey' )
            // Cv.g:45:9: 'grey'
            {
            match("grey"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:46:7: ( 'languages' )
            // Cv.g:46:9: 'languages'
            {
            match("languages"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:47:7: ( 'letter' )
            // Cv.g:47:9: 'letter'
            {
            match("letter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:48:7: ( 'linkedin' )
            // Cv.g:48:9: 'linkedin'
            {
            match("linkedin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:49:7: ( 'list' )
            // Cv.g:49:9: 'list'
            {
            match("list"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:50:7: ( 'marital status' )
            // Cv.g:50:9: 'marital status'
            {
            match("marital status"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:51:7: ( 'mobile' )
            // Cv.g:51:9: 'mobile'
            {
            match("mobile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:52:7: ( 'nationality' )
            // Cv.g:52:9: 'nationality'
            {
            match("nationality"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:53:7: ( 'oldstyle' )
            // Cv.g:53:9: 'oldstyle'
            {
            match("oldstyle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:54:7: ( 'opening' )
            // Cv.g:54:9: 'opening'
            {
            match("opening"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:55:7: ( 'options' )
            // Cv.g:55:9: 'options'
            {
            match("options"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:56:7: ( 'orange' )
            // Cv.g:56:9: 'orange'
            {
            match("orange"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:57:7: ( 'personal' )
            // Cv.g:57:9: 'personal'
            {
            match("personal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:58:7: ( 'phone' )
            // Cv.g:58:9: 'phone'
            {
            match("phone"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:59:7: ( 'picture' )
            // Cv.g:59:9: 'picture'
            {
            match("picture"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:60:7: ( 'place' )
            // Cv.g:60:9: 'place'
            {
            match("place"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:61:7: ( 'purple' )
            // Cv.g:61:9: 'purple'
            {
            match("purple"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:62:7: ( 'recipient' )
            // Cv.g:62:9: 'recipient'
            {
            match("recipient"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:63:7: ( 'red' )
            // Cv.g:63:9: 'red'
            {
            match("red"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:64:7: ( 'spanish' )
            // Cv.g:64:9: 'spanish'
            {
            match("spanish"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:65:7: ( 'street' )
            // Cv.g:65:9: 'street'
            {
            match("street"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:66:7: ( 'style' )
            // Cv.g:66:9: 'style'
            {
            match("style"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:67:7: ( 'surname' )
            // Cv.g:67:9: 'surname'
            {
            match("surname"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:68:7: ( 'text' )
            // Cv.g:68:9: 'text'
            {
            match("text"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:69:7: ( 'title' )
            // Cv.g:69:9: 'title'
            {
            match("title"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:70:7: ( 'twitter' )
            // Cv.g:70:9: 'twitter'
            {
            match("twitter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:71:7: ( 'website' )
            // Cv.g:71:9: 'website'
            {
            match("website"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:72:7: ( '|' )
            // Cv.g:72:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5979:11: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Cv.g:5980:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Cv.g:5980:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Cv.g:5980:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Cv.g:5980:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Cv.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "EMAIL"
    public final void mEMAIL() throws RecognitionException {
        try {
            int _type = EMAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5983:6: ( ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"' ) )
            // Cv.g:5984:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"' )
            {
            // Cv.g:5984:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"' )
            // Cv.g:5984:3: '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"'
            {
            match('\"'); 

            // Cv.g:5984:6: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Cv.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match('@'); 

            // Cv.g:5984:55: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Cv.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // Cv.g:5984:104: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Cv.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EMAIL"

    // $ANTLR start "TWITTER"
    public final void mTWITTER() throws RecognitionException {
        try {
            int _type = TWITTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5986:8: ( ( '\"' '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"' ) )
            // Cv.g:5987:2: ( '\"' '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"' )
            {
            // Cv.g:5987:2: ( '\"' '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"' )
            // Cv.g:5987:3: '\"' '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '\"'
            {
            match('\"'); 

            match('@'); 

            // Cv.g:5987:9: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Cv.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TWITTER"

    // $ANTLR start "TWO_DIGIT"
    public final void mTWO_DIGIT() throws RecognitionException {
        try {
            int _type = TWO_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5989:10: ( ( ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // Cv.g:5990:2: ( ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // Cv.g:5990:2: ( ( '0' .. '9' ) ( '0' .. '9' ) )
            // Cv.g:5990:3: ( '0' .. '9' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TWO_DIGIT"

    // $ANTLR start "FOUR_DIGIT"
    public final void mFOUR_DIGIT() throws RecognitionException {
        try {
            int _type = FOUR_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5992:11: ( ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // Cv.g:5993:2: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // Cv.g:5993:2: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            // Cv.g:5993:3: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOUR_DIGIT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5995:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Cv.g:5996:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Cv.g:5996:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Cv.g:5996:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Cv.g:5996:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Cv.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5999:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Cv.g:6000:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:6003:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Cv.g:6004:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Cv.g:6004:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Cv.g:6004:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Cv.g:6004:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='\n') ) {
                    alt7=1;
                }
                else {
                    alt7=2;
                }
            }
            else if ( (LA7_0=='\n') ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Cv.g:6004:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Cv.g:6004:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Cv.g:6004:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:6007:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Cv.g:6008:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Cv.g:6008:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Cv.g:6008:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Cv.g:6008:3: ( '\"' )
            // Cv.g:6008:4: '\"'
            {
            match('\"'); 

            }


            // Cv.g:6008:8: (~ ( '\"' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Cv.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // Cv.g:6008:17: ( '\"' )
            // Cv.g:6008:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Cv.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | SL_COMMENT | EMAIL | TWITTER | TWO_DIGIT | FOUR_DIGIT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt9=67;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // Cv.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // Cv.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // Cv.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // Cv.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // Cv.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // Cv.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // Cv.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // Cv.g:1:52: T__20
                {
                mT__20(); 


                }
                break;
            case 9 :
                // Cv.g:1:58: T__21
                {
                mT__21(); 


                }
                break;
            case 10 :
                // Cv.g:1:64: T__22
                {
                mT__22(); 


                }
                break;
            case 11 :
                // Cv.g:1:70: T__23
                {
                mT__23(); 


                }
                break;
            case 12 :
                // Cv.g:1:76: T__24
                {
                mT__24(); 


                }
                break;
            case 13 :
                // Cv.g:1:82: T__25
                {
                mT__25(); 


                }
                break;
            case 14 :
                // Cv.g:1:88: T__26
                {
                mT__26(); 


                }
                break;
            case 15 :
                // Cv.g:1:94: T__27
                {
                mT__27(); 


                }
                break;
            case 16 :
                // Cv.g:1:100: T__28
                {
                mT__28(); 


                }
                break;
            case 17 :
                // Cv.g:1:106: T__29
                {
                mT__29(); 


                }
                break;
            case 18 :
                // Cv.g:1:112: T__30
                {
                mT__30(); 


                }
                break;
            case 19 :
                // Cv.g:1:118: T__31
                {
                mT__31(); 


                }
                break;
            case 20 :
                // Cv.g:1:124: T__32
                {
                mT__32(); 


                }
                break;
            case 21 :
                // Cv.g:1:130: T__33
                {
                mT__33(); 


                }
                break;
            case 22 :
                // Cv.g:1:136: T__34
                {
                mT__34(); 


                }
                break;
            case 23 :
                // Cv.g:1:142: T__35
                {
                mT__35(); 


                }
                break;
            case 24 :
                // Cv.g:1:148: T__36
                {
                mT__36(); 


                }
                break;
            case 25 :
                // Cv.g:1:154: T__37
                {
                mT__37(); 


                }
                break;
            case 26 :
                // Cv.g:1:160: T__38
                {
                mT__38(); 


                }
                break;
            case 27 :
                // Cv.g:1:166: T__39
                {
                mT__39(); 


                }
                break;
            case 28 :
                // Cv.g:1:172: T__40
                {
                mT__40(); 


                }
                break;
            case 29 :
                // Cv.g:1:178: T__41
                {
                mT__41(); 


                }
                break;
            case 30 :
                // Cv.g:1:184: T__42
                {
                mT__42(); 


                }
                break;
            case 31 :
                // Cv.g:1:190: T__43
                {
                mT__43(); 


                }
                break;
            case 32 :
                // Cv.g:1:196: T__44
                {
                mT__44(); 


                }
                break;
            case 33 :
                // Cv.g:1:202: T__45
                {
                mT__45(); 


                }
                break;
            case 34 :
                // Cv.g:1:208: T__46
                {
                mT__46(); 


                }
                break;
            case 35 :
                // Cv.g:1:214: T__47
                {
                mT__47(); 


                }
                break;
            case 36 :
                // Cv.g:1:220: T__48
                {
                mT__48(); 


                }
                break;
            case 37 :
                // Cv.g:1:226: T__49
                {
                mT__49(); 


                }
                break;
            case 38 :
                // Cv.g:1:232: T__50
                {
                mT__50(); 


                }
                break;
            case 39 :
                // Cv.g:1:238: T__51
                {
                mT__51(); 


                }
                break;
            case 40 :
                // Cv.g:1:244: T__52
                {
                mT__52(); 


                }
                break;
            case 41 :
                // Cv.g:1:250: T__53
                {
                mT__53(); 


                }
                break;
            case 42 :
                // Cv.g:1:256: T__54
                {
                mT__54(); 


                }
                break;
            case 43 :
                // Cv.g:1:262: T__55
                {
                mT__55(); 


                }
                break;
            case 44 :
                // Cv.g:1:268: T__56
                {
                mT__56(); 


                }
                break;
            case 45 :
                // Cv.g:1:274: T__57
                {
                mT__57(); 


                }
                break;
            case 46 :
                // Cv.g:1:280: T__58
                {
                mT__58(); 


                }
                break;
            case 47 :
                // Cv.g:1:286: T__59
                {
                mT__59(); 


                }
                break;
            case 48 :
                // Cv.g:1:292: T__60
                {
                mT__60(); 


                }
                break;
            case 49 :
                // Cv.g:1:298: T__61
                {
                mT__61(); 


                }
                break;
            case 50 :
                // Cv.g:1:304: T__62
                {
                mT__62(); 


                }
                break;
            case 51 :
                // Cv.g:1:310: T__63
                {
                mT__63(); 


                }
                break;
            case 52 :
                // Cv.g:1:316: T__64
                {
                mT__64(); 


                }
                break;
            case 53 :
                // Cv.g:1:322: T__65
                {
                mT__65(); 


                }
                break;
            case 54 :
                // Cv.g:1:328: T__66
                {
                mT__66(); 


                }
                break;
            case 55 :
                // Cv.g:1:334: T__67
                {
                mT__67(); 


                }
                break;
            case 56 :
                // Cv.g:1:340: T__68
                {
                mT__68(); 


                }
                break;
            case 57 :
                // Cv.g:1:346: T__69
                {
                mT__69(); 


                }
                break;
            case 58 :
                // Cv.g:1:352: T__70
                {
                mT__70(); 


                }
                break;
            case 59 :
                // Cv.g:1:358: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 60 :
                // Cv.g:1:369: EMAIL
                {
                mEMAIL(); 


                }
                break;
            case 61 :
                // Cv.g:1:375: TWITTER
                {
                mTWITTER(); 


                }
                break;
            case 62 :
                // Cv.g:1:383: TWO_DIGIT
                {
                mTWO_DIGIT(); 


                }
                break;
            case 63 :
                // Cv.g:1:393: FOUR_DIGIT
                {
                mFOUR_DIGIT(); 


                }
                break;
            case 64 :
                // Cv.g:1:404: TEXT
                {
                mTEXT(); 


                }
                break;
            case 65 :
                // Cv.g:1:409: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 66 :
                // Cv.g:1:420: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 67 :
                // Cv.g:1:430: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\33\1\35\1\uffff\20\30\2\uffff\1\30\6\uffff\10\30\1\127"+
        "\37\30\3\uffff\1\177\15\30\1\uffff\4\30\1\u0091\26\30\1\u00a9\10"+
        "\30\2\uffff\1\30\1\uffff\5\30\1\u00ba\1\30\1\u00bc\5\30\1\u00c2"+
        "\3\30\1\uffff\5\30\1\u00cb\3\30\1\u00cf\15\30\1\uffff\4\30\1\u00e1"+
        "\3\30\2\uffff\1\u00e7\3\30\1\u00ed\1\u00ee\1\uffff\1\30\1\uffff"+
        "\2\30\1\u00f2\2\30\1\uffff\1\u00f5\6\30\1\u00fc\1\uffff\3\30\1\uffff"+
        "\10\30\1\u0108\1\30\1\u010a\4\30\1\u010f\1\30\1\uffff\1\u0111\2"+
        "\30\3\uffff\5\30\2\uffff\1\u011a\2\30\1\uffff\2\30\1\uffff\3\30"+
        "\1\u0122\1\u0123\1\u0124\1\uffff\1\30\1\u0126\2\30\1\u0129\4\30"+
        "\1\u012e\1\30\1\uffff\1\30\1\uffff\1\u0131\2\30\1\u0134\1\uffff"+
        "\1\30\1\uffff\2\30\1\uffff\1\30\1\u013a\3\30\1\uffff\1\u013e\1\u013f"+
        "\1\u0140\1\u0141\1\30\1\u0143\1\30\3\uffff\1\30\1\uffff\2\30\1\uffff"+
        "\2\30\1\u014a\1\u014b\1\uffff\1\30\1\u014d\1\uffff\1\30\1\u014f"+
        "\1\uffff\1\u0150\1\u0151\1\u0152\1\uffff\1\30\1\uffff\3\30\4\uffff"+
        "\1\30\1\uffff\2\30\1\u015b\1\uffff\1\30\1\u015d\2\uffff\1\u015e"+
        "\1\uffff\1\30\5\uffff\1\u0160\1\u0161\1\u0162\1\30\1\u0164\1\u0165"+
        "\1\u0166\1\uffff\1\30\2\uffff\1\u0168\3\uffff\1\u0169\3\uffff\1"+
        "\30\2\uffff\1\u016b\1\uffff";
    static final String DFA9_eofS =
        "\u016c\uffff";
    static final String DFA9_minS =
        "\1\11\1\uffff\1\55\1\57\1\uffff\1\164\3\141\1\155\1\141\1\145\3"+
        "\141\1\154\2\145\1\160\2\145\1\uffff\1\0\1\60\6\uffff\1\164\1\156"+
        "\1\162\1\141\1\163\1\164\1\141\1\154\1\55\1\164\1\141\1\143\1\170"+
        "\1\162\1\145\1\162\1\164\1\145\1\156\1\164\1\156\1\162\1\142\1\164"+
        "\1\144\1\145\1\141\1\162\1\157\1\143\1\141\1\162\1\143\1\141\2\162"+
        "\1\170\1\164\1\151\1\142\2\0\1\uffff\1\55\1\145\1\153\1\164\2\143"+
        "\1\145\1\165\1\171\2\163\1\157\1\160\1\156\1\uffff\1\145\1\151\2"+
        "\154\1\55\1\163\1\156\1\155\1\150\1\145\1\147\1\164\1\153\1\164"+
        "\3\151\1\163\1\156\1\151\1\156\1\163\1\156\1\164\1\143\1\160\1\151"+
        "\1\55\1\156\1\145\1\154\1\156\1\164\1\154\1\164\1\163\2\0\1\60\1"+
        "\uffff\1\156\1\151\1\150\2\153\1\55\1\141\1\55\1\163\1\151\1\162"+
        "\1\141\1\164\1\55\1\154\1\157\1\151\1\uffff\1\164\1\143\1\141\1"+
        "\165\1\156\1\55\1\165\2\145\1\55\1\164\1\154\1\157\1\164\1\151\1"+
        "\157\1\147\1\157\1\145\1\165\1\145\1\154\1\160\1\uffff\1\151\2\145"+
        "\1\141\1\55\1\145\1\164\1\151\1\uffff\1\0\1\55\1\164\1\156\1\144"+
        "\2\55\1\uffff\1\154\1\uffff\1\151\1\156\1\55\1\156\1\162\1\uffff"+
        "\1\55\2\163\1\156\1\150\1\156\1\142\1\55\1\uffff\1\141\1\162\1\144"+
        "\1\uffff\1\141\1\145\1\156\1\171\2\156\1\145\1\156\1\55\1\162\1"+
        "\55\1\145\1\151\1\163\1\164\1\55\1\155\1\uffff\1\55\1\145\1\164"+
        "\1\uffff\1\0\1\uffff\1\151\1\147\2\141\1\154\2\uffff\1\55\1\143"+
        "\1\147\1\uffff\2\171\1\uffff\1\165\1\150\1\141\3\55\1\uffff\1\147"+
        "\1\55\1\151\1\154\1\55\1\141\1\154\1\147\1\163\1\55\1\141\1\uffff"+
        "\1\145\1\uffff\1\55\1\145\1\150\1\55\1\uffff\1\145\1\uffff\1\162"+
        "\1\145\1\0\1\157\1\55\1\164\1\155\1\141\1\uffff\4\55\1\162\1\55"+
        "\1\155\3\uffff\1\145\1\uffff\1\156\1\40\1\uffff\1\154\1\145\2\55"+
        "\1\uffff\1\154\1\55\1\uffff\1\156\1\55\1\uffff\3\55\1\uffff\1\156"+
        "\1\uffff\2\145\1\143\4\uffff\1\145\1\uffff\1\145\1\163\1\55\1\uffff"+
        "\1\151\1\55\2\uffff\1\55\1\uffff\1\164\5\uffff\3\55\1\145\3\55\1"+
        "\uffff\1\164\2\uffff\1\55\3\uffff\1\55\3\uffff\1\171\2\uffff\1\55"+
        "\1\uffff";
    static final String DFA9_maxS =
        "\1\174\1\uffff\1\172\1\57\1\uffff\1\164\1\154\1\166\1\141\1\156"+
        "\2\162\1\151\1\157\1\141\1\162\1\165\1\145\1\165\1\167\1\145\1\uffff"+
        "\1\uffff\1\71\6\uffff\1\164\1\156\1\162\1\165\1\163\1\164\1\157"+
        "\1\165\1\172\1\164\1\141\1\147\1\170\1\162\1\145\1\162\1\164\1\145"+
        "\1\156\1\164\1\163\1\162\1\142\1\164\1\144\1\164\1\141\1\162\1\157"+
        "\1\143\1\141\1\162\1\144\1\141\1\171\1\162\1\170\1\164\1\151\1\142"+
        "\2\uffff\1\uffff\1\172\1\145\1\153\1\164\2\143\1\145\1\165\1\171"+
        "\2\163\1\157\1\160\1\156\1\uffff\1\145\1\151\2\154\1\172\1\163\1"+
        "\156\1\155\1\150\1\171\1\147\1\164\1\153\1\164\3\151\1\163\1\156"+
        "\1\151\1\156\1\163\1\156\1\164\1\143\1\160\1\151\1\172\1\156\1\145"+
        "\1\154\1\156\1\164\1\154\1\164\1\163\2\uffff\1\71\1\uffff\1\156"+
        "\1\151\1\150\2\153\1\172\1\141\1\172\1\163\1\151\1\162\1\141\1\164"+
        "\1\172\1\154\1\157\1\151\1\uffff\1\164\1\143\1\141\1\165\1\156\1"+
        "\172\1\165\2\145\1\172\1\164\1\154\1\157\1\164\1\151\1\157\1\147"+
        "\1\157\1\145\1\165\1\145\1\154\1\160\1\uffff\1\151\2\145\1\141\1"+
        "\172\1\145\1\164\1\151\1\uffff\1\uffff\1\172\1\164\1\156\1\160\2"+
        "\172\1\uffff\1\154\1\uffff\1\151\1\156\1\172\1\156\1\162\1\uffff"+
        "\1\172\2\163\1\156\1\150\1\156\1\142\1\172\1\uffff\1\141\1\162\1"+
        "\144\1\uffff\1\141\1\145\1\156\1\171\2\156\1\145\1\156\1\172\1\162"+
        "\1\172\1\145\1\151\1\163\1\164\1\172\1\155\1\uffff\1\172\1\145\1"+
        "\164\1\uffff\1\uffff\1\uffff\1\151\1\147\2\141\1\154\2\uffff\1\172"+
        "\1\143\1\147\1\uffff\2\171\1\uffff\1\165\1\150\1\141\3\172\1\uffff"+
        "\1\147\1\172\1\151\1\154\1\172\1\141\1\154\1\147\1\163\1\172\1\141"+
        "\1\uffff\1\145\1\uffff\1\172\1\145\1\150\1\172\1\uffff\1\145\1\uffff"+
        "\1\162\1\145\1\uffff\1\157\1\172\1\164\1\155\1\141\1\uffff\4\172"+
        "\1\162\1\172\1\155\3\uffff\1\145\1\uffff\1\156\1\40\1\uffff\1\154"+
        "\1\145\2\172\1\uffff\1\154\1\172\1\uffff\1\156\1\172\1\uffff\3\172"+
        "\1\uffff\1\156\1\uffff\2\145\1\143\4\uffff\1\145\1\uffff\1\145\1"+
        "\163\1\172\1\uffff\1\151\1\172\2\uffff\1\172\1\uffff\1\164\5\uffff"+
        "\3\172\1\145\3\172\1\uffff\1\164\2\uffff\1\172\3\uffff\1\172\3\uffff"+
        "\1\171\2\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\20\uffff\1\72\2\uffff\1\100\1\101\1\102"+
        "\1\2\1\73\1\3\52\uffff\1\103\16\uffff\1\24\47\uffff\1\76\21\uffff"+
        "\1\31\27\uffff\1\61\10\uffff\1\75\7\uffff\1\14\1\uffff\1\16\5\uffff"+
        "\1\25\10\uffff\1\37\3\uffff\1\43\21\uffff\1\66\3\uffff\1\75\1\uffff"+
        "\1\77\5\uffff\1\12\1\13\3\uffff\1\21\2\uffff\1\26\6\uffff\1\36\13"+
        "\uffff\1\54\1\uffff\1\56\4\uffff\1\64\1\uffff\1\67\10\uffff\1\15"+
        "\7\uffff\1\33\1\34\1\35\1\uffff\1\41\2\uffff\1\45\4\uffff\1\52\2"+
        "\uffff\1\57\2\uffff\1\63\3\uffff\1\74\1\uffff\1\6\3\uffff\1\17\1"+
        "\20\1\22\1\23\1\uffff\1\30\3\uffff\1\44\2\uffff\1\50\1\51\1\uffff"+
        "\1\55\1\uffff\1\62\1\65\1\70\1\71\1\74\7\uffff\1\42\1\uffff\1\47"+
        "\1\53\1\uffff\1\5\1\7\1\10\1\uffff\1\27\1\32\1\40\1\uffff\1\60\1"+
        "\11\1\uffff\1\46";
    static final String DFA9_specialS =
        "\26\uffff\1\2\57\uffff\1\1\1\7\64\uffff\1\0\1\3\65\uffff\1\5\62"+
        "\uffff\1\4\55\uffff\1\6\127\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\31\1\32\1\uffff\1\31\1\32\22\uffff\1\31\1\uffff\1\26\11\uffff"+
            "\1\1\1\2\1\uffff\1\3\12\27\1\4\6\uffff\32\30\4\uffff\1\30\1"+
            "\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\30\1\14\1\15\1\16\1"+
            "\17\1\20\1\30\1\21\1\22\1\23\2\30\1\24\3\30\1\uffff\1\25",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\34",
            "",
            "\1\36",
            "\1\37\7\uffff\1\40\2\uffff\1\41",
            "\1\42\7\uffff\1\43\2\uffff\1\44\2\uffff\1\45\6\uffff\1\46",
            "\1\47",
            "\1\50\1\51",
            "\1\52\7\uffff\1\53\10\uffff\1\54",
            "\1\55\3\uffff\1\56\10\uffff\1\57",
            "\1\60\3\uffff\1\61\3\uffff\1\62",
            "\1\63\15\uffff\1\64",
            "\1\65",
            "\1\66\3\uffff\1\67\1\uffff\1\70",
            "\1\71\2\uffff\1\72\1\73\2\uffff\1\74\10\uffff\1\75",
            "\1\76",
            "\1\77\3\uffff\1\100\1\101",
            "\1\102\3\uffff\1\103\15\uffff\1\104",
            "\1\105",
            "",
            "\55\110\1\107\2\110\12\107\6\110\1\106\32\107\4\110\1\107\1"+
            "\110\32\107\uff85\110",
            "\12\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\15\uffff\1\116\5\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122\15\uffff\1\123",
            "\1\124\1\125\7\uffff\1\126",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\130",
            "\1\131",
            "\1\132\3\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\4\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\16\uffff\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162\1\163",
            "\1\164",
            "\1\165\6\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\55\110\1\174\2\110\12\174\7\110\32\174\4\110\1\174\1\110\32"+
            "\174\uff85\110",
            "\55\110\1\107\2\110\12\107\6\110\1\175\32\107\4\110\1\107\1"+
            "\110\32\107\uff85\110",
            "",
            "\1\30\2\uffff\12\176\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\23\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\42\110\1\u00b2\12\110\1\174\2\110\12\174\7\110\32\174\4\110"+
            "\1\174\1\110\32\174\uff85\110",
            "\55\110\1\u00b3\2\110\12\u00b3\7\110\32\u00b3\4\110\1\u00b3"+
            "\1\110\32\u00b3\uff85\110",
            "\12\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00bb",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\55\110\1\u00b3\1\u00e6\1\110\12\u00b3\7\110\32\u00b3\4\110"+
            "\1\u00b3\1\110\32\u00b3\uff85\110",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea\11\uffff\1\u00eb\1\uffff\1\u00ec",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0109",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0110",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0112",
            "\1\u0113",
            "",
            "\55\110\1\u0114\2\110\12\u0114\7\110\32\u0114\4\110\1\u0114"+
            "\1\110\32\u0114\uff85\110",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0125",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0127",
            "\1\u0128",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u012f",
            "",
            "\1\u0130",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0132",
            "\1\u0133",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\42\110\1\u0138\12\110\1\u0114\2\110\12\u0114\7\110\32\u0114"+
            "\4\110\1\u0114\1\110\32\u0114\uff85\110",
            "\1\u0139",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0142",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0144",
            "",
            "",
            "",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u014c",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u014e",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "",
            "",
            "",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u015c",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u015f",
            "",
            "",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0163",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0167",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\1\u016a",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | SL_COMMENT | EMAIL | TWITTER | TWO_DIGIT | FOUR_DIGIT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_124 = input.LA(1);

                        s = -1;
                        if ( (LA9_124=='\"') ) {s = 178;}

                        else if ( (LA9_124=='-'||(LA9_124 >= '0' && LA9_124 <= '9')||(LA9_124 >= 'A' && LA9_124 <= 'Z')||LA9_124=='_'||(LA9_124 >= 'a' && LA9_124 <= 'z')) ) {s = 124;}

                        else if ( ((LA9_124 >= '\u0000' && LA9_124 <= '!')||(LA9_124 >= '#' && LA9_124 <= ',')||(LA9_124 >= '.' && LA9_124 <= '/')||(LA9_124 >= ':' && LA9_124 <= '@')||(LA9_124 >= '[' && LA9_124 <= '^')||LA9_124=='`'||(LA9_124 >= '{' && LA9_124 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_70 = input.LA(1);

                        s = -1;
                        if ( (LA9_70=='-'||(LA9_70 >= '0' && LA9_70 <= '9')||(LA9_70 >= 'A' && LA9_70 <= 'Z')||LA9_70=='_'||(LA9_70 >= 'a' && LA9_70 <= 'z')) ) {s = 124;}

                        else if ( ((LA9_70 >= '\u0000' && LA9_70 <= ',')||(LA9_70 >= '.' && LA9_70 <= '/')||(LA9_70 >= ':' && LA9_70 <= '@')||(LA9_70 >= '[' && LA9_70 <= '^')||LA9_70=='`'||(LA9_70 >= '{' && LA9_70 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_22 = input.LA(1);

                        s = -1;
                        if ( (LA9_22=='@') ) {s = 70;}

                        else if ( (LA9_22=='-'||(LA9_22 >= '0' && LA9_22 <= '9')||(LA9_22 >= 'A' && LA9_22 <= 'Z')||LA9_22=='_'||(LA9_22 >= 'a' && LA9_22 <= 'z')) ) {s = 71;}

                        else if ( ((LA9_22 >= '\u0000' && LA9_22 <= ',')||(LA9_22 >= '.' && LA9_22 <= '/')||(LA9_22 >= ':' && LA9_22 <= '?')||(LA9_22 >= '[' && LA9_22 <= '^')||LA9_22=='`'||(LA9_22 >= '{' && LA9_22 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_125 = input.LA(1);

                        s = -1;
                        if ( (LA9_125=='-'||(LA9_125 >= '0' && LA9_125 <= '9')||(LA9_125 >= 'A' && LA9_125 <= 'Z')||LA9_125=='_'||(LA9_125 >= 'a' && LA9_125 <= 'z')) ) {s = 179;}

                        else if ( ((LA9_125 >= '\u0000' && LA9_125 <= ',')||(LA9_125 >= '.' && LA9_125 <= '/')||(LA9_125 >= ':' && LA9_125 <= '@')||(LA9_125 >= '[' && LA9_125 <= '^')||LA9_125=='`'||(LA9_125 >= '{' && LA9_125 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_230 = input.LA(1);

                        s = -1;
                        if ( (LA9_230=='-'||(LA9_230 >= '0' && LA9_230 <= '9')||(LA9_230 >= 'A' && LA9_230 <= 'Z')||LA9_230=='_'||(LA9_230 >= 'a' && LA9_230 <= 'z')) ) {s = 276;}

                        else if ( ((LA9_230 >= '\u0000' && LA9_230 <= ',')||(LA9_230 >= '.' && LA9_230 <= '/')||(LA9_230 >= ':' && LA9_230 <= '@')||(LA9_230 >= '[' && LA9_230 <= '^')||LA9_230=='`'||(LA9_230 >= '{' && LA9_230 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_179 = input.LA(1);

                        s = -1;
                        if ( (LA9_179=='.') ) {s = 230;}

                        else if ( (LA9_179=='-'||(LA9_179 >= '0' && LA9_179 <= '9')||(LA9_179 >= 'A' && LA9_179 <= 'Z')||LA9_179=='_'||(LA9_179 >= 'a' && LA9_179 <= 'z')) ) {s = 179;}

                        else if ( ((LA9_179 >= '\u0000' && LA9_179 <= ',')||LA9_179=='/'||(LA9_179 >= ':' && LA9_179 <= '@')||(LA9_179 >= '[' && LA9_179 <= '^')||LA9_179=='`'||(LA9_179 >= '{' && LA9_179 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_276 = input.LA(1);

                        s = -1;
                        if ( (LA9_276=='\"') ) {s = 312;}

                        else if ( (LA9_276=='-'||(LA9_276 >= '0' && LA9_276 <= '9')||(LA9_276 >= 'A' && LA9_276 <= 'Z')||LA9_276=='_'||(LA9_276 >= 'a' && LA9_276 <= 'z')) ) {s = 276;}

                        else if ( ((LA9_276 >= '\u0000' && LA9_276 <= '!')||(LA9_276 >= '#' && LA9_276 <= ',')||(LA9_276 >= '.' && LA9_276 <= '/')||(LA9_276 >= ':' && LA9_276 <= '@')||(LA9_276 >= '[' && LA9_276 <= '^')||LA9_276=='`'||(LA9_276 >= '{' && LA9_276 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_71 = input.LA(1);

                        s = -1;
                        if ( (LA9_71=='@') ) {s = 125;}

                        else if ( (LA9_71=='-'||(LA9_71 >= '0' && LA9_71 <= '9')||(LA9_71 >= 'A' && LA9_71 <= 'Z')||LA9_71=='_'||(LA9_71 >= 'a' && LA9_71 <= 'z')) ) {s = 71;}

                        else if ( ((LA9_71 >= '\u0000' && LA9_71 <= ',')||(LA9_71 >= '.' && LA9_71 <= '/')||(LA9_71 >= ':' && LA9_71 <= '?')||(LA9_71 >= '[' && LA9_71 <= '^')||LA9_71=='`'||(LA9_71 >= '{' && LA9_71 <= '\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}