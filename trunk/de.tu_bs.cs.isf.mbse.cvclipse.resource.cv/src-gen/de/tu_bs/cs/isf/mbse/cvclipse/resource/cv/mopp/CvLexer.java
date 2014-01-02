// $ANTLR 3.4

	package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CvLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int EMAIL=4;
    public static final int FOUR_DIGIT=5;
    public static final int LINEBREAK=6;
    public static final int QUOTED_34_34=7;
    public static final int TEXT=8;
    public static final int TWITTER=9;
    public static final int TWO_DIGIT=10;
    public static final int WHITESPACE=11;

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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "EMAIL"
    public final void mEMAIL() throws RecognitionException {
        try {
            int _type = EMAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Cv.g:5979:6: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Cv.g:5980:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Cv.g:5980:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Cv.g:5980:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Cv.g:5980:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match('@'); 

            // Cv.g:5980:52: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
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


            match('.'); 

            // Cv.g:5980:101: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
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
            // Cv.g:5982:8: ( ( '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Cv.g:5983:2: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Cv.g:5983:2: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Cv.g:5983:3: '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            match('@'); 

            // Cv.g:5983:6: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
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
            // Cv.g:5985:10: ( ( ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // Cv.g:5986:2: ( ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // Cv.g:5986:2: ( ( '0' .. '9' ) ( '0' .. '9' ) )
            // Cv.g:5986:3: ( '0' .. '9' ) ( '0' .. '9' )
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
            // Cv.g:5988:11: ( ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ) )
            // Cv.g:5989:2: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            {
            // Cv.g:5989:2: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
            // Cv.g:5989:3: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
            // Cv.g:5991:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Cv.g:5992:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Cv.g:5992:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Cv.g:5992:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Cv.g:5992:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
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
            // Cv.g:5995:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Cv.g:5996:2: ( ( ' ' | '\\t' | '\\f' ) )
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
            // Cv.g:5999:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Cv.g:6000:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Cv.g:6000:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Cv.g:6000:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Cv.g:6000:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='\n') ) {
                    alt6=1;
                }
                else {
                    alt6=2;
                }
            }
            else if ( (LA6_0=='\n') ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Cv.g:6000:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Cv.g:6000:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Cv.g:6000:20: '\\n'
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
            // Cv.g:6003:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Cv.g:6004:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Cv.g:6004:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Cv.g:6004:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Cv.g:6004:3: ( '\"' )
            // Cv.g:6004:4: '\"'
            {
            match('\"'); 

            }


            // Cv.g:6004:8: (~ ( '\"' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    break loop7;
                }
            } while (true);


            // Cv.g:6004:17: ( '\"' )
            // Cv.g:6004:18: '\"'
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
        // Cv.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | EMAIL | TWITTER | TWO_DIGIT | FOUR_DIGIT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt8=66;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // Cv.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // Cv.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // Cv.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // Cv.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // Cv.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // Cv.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // Cv.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // Cv.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // Cv.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // Cv.g:1:64: T__21
                {
                mT__21(); 


                }
                break;
            case 11 :
                // Cv.g:1:70: T__22
                {
                mT__22(); 


                }
                break;
            case 12 :
                // Cv.g:1:76: T__23
                {
                mT__23(); 


                }
                break;
            case 13 :
                // Cv.g:1:82: T__24
                {
                mT__24(); 


                }
                break;
            case 14 :
                // Cv.g:1:88: T__25
                {
                mT__25(); 


                }
                break;
            case 15 :
                // Cv.g:1:94: T__26
                {
                mT__26(); 


                }
                break;
            case 16 :
                // Cv.g:1:100: T__27
                {
                mT__27(); 


                }
                break;
            case 17 :
                // Cv.g:1:106: T__28
                {
                mT__28(); 


                }
                break;
            case 18 :
                // Cv.g:1:112: T__29
                {
                mT__29(); 


                }
                break;
            case 19 :
                // Cv.g:1:118: T__30
                {
                mT__30(); 


                }
                break;
            case 20 :
                // Cv.g:1:124: T__31
                {
                mT__31(); 


                }
                break;
            case 21 :
                // Cv.g:1:130: T__32
                {
                mT__32(); 


                }
                break;
            case 22 :
                // Cv.g:1:136: T__33
                {
                mT__33(); 


                }
                break;
            case 23 :
                // Cv.g:1:142: T__34
                {
                mT__34(); 


                }
                break;
            case 24 :
                // Cv.g:1:148: T__35
                {
                mT__35(); 


                }
                break;
            case 25 :
                // Cv.g:1:154: T__36
                {
                mT__36(); 


                }
                break;
            case 26 :
                // Cv.g:1:160: T__37
                {
                mT__37(); 


                }
                break;
            case 27 :
                // Cv.g:1:166: T__38
                {
                mT__38(); 


                }
                break;
            case 28 :
                // Cv.g:1:172: T__39
                {
                mT__39(); 


                }
                break;
            case 29 :
                // Cv.g:1:178: T__40
                {
                mT__40(); 


                }
                break;
            case 30 :
                // Cv.g:1:184: T__41
                {
                mT__41(); 


                }
                break;
            case 31 :
                // Cv.g:1:190: T__42
                {
                mT__42(); 


                }
                break;
            case 32 :
                // Cv.g:1:196: T__43
                {
                mT__43(); 


                }
                break;
            case 33 :
                // Cv.g:1:202: T__44
                {
                mT__44(); 


                }
                break;
            case 34 :
                // Cv.g:1:208: T__45
                {
                mT__45(); 


                }
                break;
            case 35 :
                // Cv.g:1:214: T__46
                {
                mT__46(); 


                }
                break;
            case 36 :
                // Cv.g:1:220: T__47
                {
                mT__47(); 


                }
                break;
            case 37 :
                // Cv.g:1:226: T__48
                {
                mT__48(); 


                }
                break;
            case 38 :
                // Cv.g:1:232: T__49
                {
                mT__49(); 


                }
                break;
            case 39 :
                // Cv.g:1:238: T__50
                {
                mT__50(); 


                }
                break;
            case 40 :
                // Cv.g:1:244: T__51
                {
                mT__51(); 


                }
                break;
            case 41 :
                // Cv.g:1:250: T__52
                {
                mT__52(); 


                }
                break;
            case 42 :
                // Cv.g:1:256: T__53
                {
                mT__53(); 


                }
                break;
            case 43 :
                // Cv.g:1:262: T__54
                {
                mT__54(); 


                }
                break;
            case 44 :
                // Cv.g:1:268: T__55
                {
                mT__55(); 


                }
                break;
            case 45 :
                // Cv.g:1:274: T__56
                {
                mT__56(); 


                }
                break;
            case 46 :
                // Cv.g:1:280: T__57
                {
                mT__57(); 


                }
                break;
            case 47 :
                // Cv.g:1:286: T__58
                {
                mT__58(); 


                }
                break;
            case 48 :
                // Cv.g:1:292: T__59
                {
                mT__59(); 


                }
                break;
            case 49 :
                // Cv.g:1:298: T__60
                {
                mT__60(); 


                }
                break;
            case 50 :
                // Cv.g:1:304: T__61
                {
                mT__61(); 


                }
                break;
            case 51 :
                // Cv.g:1:310: T__62
                {
                mT__62(); 


                }
                break;
            case 52 :
                // Cv.g:1:316: T__63
                {
                mT__63(); 


                }
                break;
            case 53 :
                // Cv.g:1:322: T__64
                {
                mT__64(); 


                }
                break;
            case 54 :
                // Cv.g:1:328: T__65
                {
                mT__65(); 


                }
                break;
            case 55 :
                // Cv.g:1:334: T__66
                {
                mT__66(); 


                }
                break;
            case 56 :
                // Cv.g:1:340: T__67
                {
                mT__67(); 


                }
                break;
            case 57 :
                // Cv.g:1:346: T__68
                {
                mT__68(); 


                }
                break;
            case 58 :
                // Cv.g:1:352: T__69
                {
                mT__69(); 


                }
                break;
            case 59 :
                // Cv.g:1:358: EMAIL
                {
                mEMAIL(); 


                }
                break;
            case 60 :
                // Cv.g:1:364: TWITTER
                {
                mTWITTER(); 


                }
                break;
            case 61 :
                // Cv.g:1:372: TWO_DIGIT
                {
                mTWO_DIGIT(); 


                }
                break;
            case 62 :
                // Cv.g:1:382: FOUR_DIGIT
                {
                mFOUR_DIGIT(); 


                }
                break;
            case 63 :
                // Cv.g:1:393: TEXT
                {
                mTEXT(); 


                }
                break;
            case 64 :
                // Cv.g:1:398: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 65 :
                // Cv.g:1:409: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 66 :
                // Cv.g:1:419: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\2\uffff\1\34\2\uffff\20\37\1\uffff\1\37\1\uffff\1\37\5\uffff\1"+
        "\37\1\uffff\7\37\1\125\37\37\1\173\15\37\1\uffff\4\37\1\u008d\26"+
        "\37\1\u00a5\11\37\1\uffff\5\37\1\u00b4\1\37\1\u00b6\5\37\1\u00bc"+
        "\3\37\1\uffff\5\37\1\u00c5\3\37\1\u00c9\15\37\1\uffff\4\37\1\u00db"+
        "\3\37\1\u00df\3\37\1\u00e5\1\u00e6\1\uffff\1\37\1\uffff\2\37\1\u00ea"+
        "\2\37\1\uffff\1\u00ed\6\37\1\u00f4\1\uffff\3\37\1\uffff\10\37\1"+
        "\u0100\1\37\1\u0102\4\37\1\u0107\1\37\1\uffff\1\u0109\2\37\1\uffff"+
        "\5\37\2\uffff\1\u0111\2\37\1\uffff\2\37\1\uffff\3\37\1\u0119\1\u011a"+
        "\1\u011b\1\uffff\1\37\1\u011d\2\37\1\u0120\4\37\1\u0125\1\37\1\uffff"+
        "\1\37\1\uffff\1\u0128\2\37\1\u012b\1\uffff\1\37\1\uffff\3\37\1\u0130"+
        "\3\37\1\uffff\1\u0134\1\u0135\1\u0136\1\u0137\1\37\1\u0139\1\37"+
        "\3\uffff\1\37\1\uffff\2\37\1\uffff\2\37\1\u0140\1\u0141\1\uffff"+
        "\1\37\1\u0143\1\uffff\1\37\1\u0145\1\uffff\1\u0146\1\u0147\1\u0148"+
        "\1\37\1\uffff\3\37\4\uffff\1\37\1\uffff\2\37\1\u0150\1\uffff\1\37"+
        "\1\u0152\2\uffff\1\u0153\1\uffff\1\37\4\uffff\1\u0155\1\u0156\1"+
        "\u0157\1\37\1\u0159\1\u015a\1\u015b\1\uffff\1\37\2\uffff\1\u015d"+
        "\3\uffff\1\u015e\3\uffff\1\37\2\uffff\1\u0160\1\uffff";
    static final String DFA8_eofS =
        "\u0161\uffff";
    static final String DFA8_minS =
        "\1\11\1\uffff\1\55\2\uffff\20\55\1\uffff\1\55\1\uffff\1\55\5\uffff"+
        "\1\55\1\uffff\65\55\1\uffff\45\55\1\uffff\21\55\1\uffff\27\55\1"+
        "\uffff\16\55\1\uffff\1\55\1\uffff\5\55\1\uffff\10\55\1\uffff\3\55"+
        "\1\uffff\21\55\1\uffff\3\55\1\uffff\5\55\2\uffff\3\55\1\uffff\2"+
        "\55\1\uffff\6\55\1\uffff\13\55\1\uffff\1\55\1\uffff\4\55\1\uffff"+
        "\1\55\1\uffff\7\55\1\uffff\7\55\3\uffff\1\55\1\uffff\1\55\1\40\1"+
        "\uffff\4\55\1\uffff\2\55\1\uffff\2\55\1\uffff\4\55\1\uffff\3\55"+
        "\4\uffff\1\55\1\uffff\3\55\1\uffff\2\55\2\uffff\1\55\1\uffff\1\55"+
        "\4\uffff\7\55\1\uffff\1\55\2\uffff\1\55\3\uffff\1\55\3\uffff\1\55"+
        "\2\uffff\1\55\1\uffff";
    static final String DFA8_maxS =
        "\1\174\1\uffff\1\172\2\uffff\20\172\1\uffff\1\172\1\uffff\1\172"+
        "\5\uffff\1\172\1\uffff\65\172\1\uffff\45\172\1\uffff\21\172\1\uffff"+
        "\27\172\1\uffff\16\172\1\uffff\1\172\1\uffff\5\172\1\uffff\10\172"+
        "\1\uffff\3\172\1\uffff\21\172\1\uffff\3\172\1\uffff\5\172\2\uffff"+
        "\3\172\1\uffff\2\172\1\uffff\6\172\1\uffff\13\172\1\uffff\1\172"+
        "\1\uffff\4\172\1\uffff\1\172\1\uffff\7\172\1\uffff\7\172\3\uffff"+
        "\1\172\1\uffff\2\172\1\uffff\4\172\1\uffff\2\172\1\uffff\2\172\1"+
        "\uffff\4\172\1\uffff\3\172\4\uffff\1\172\1\uffff\3\172\1\uffff\2"+
        "\172\2\uffff\1\172\1\uffff\1\172\4\uffff\7\172\1\uffff\1\172\2\uffff"+
        "\1\172\3\uffff\1\172\3\uffff\1\172\2\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\20\uffff\1\72\1\uffff\1\74\1\uffff"+
        "\1\100\1\101\1\102\1\2\1\73\1\uffff\1\77\65\uffff\1\24\45\uffff"+
        "\1\75\21\uffff\1\31\27\uffff\1\61\16\uffff\1\14\1\uffff\1\16\5\uffff"+
        "\1\25\10\uffff\1\37\3\uffff\1\43\21\uffff\1\66\3\uffff\1\76\5\uffff"+
        "\1\12\1\13\3\uffff\1\21\2\uffff\1\26\6\uffff\1\36\13\uffff\1\54"+
        "\1\uffff\1\56\4\uffff\1\64\1\uffff\1\67\7\uffff\1\15\7\uffff\1\33"+
        "\1\34\1\35\1\uffff\1\41\2\uffff\1\45\4\uffff\1\52\2\uffff\1\57\2"+
        "\uffff\1\63\4\uffff\1\6\3\uffff\1\17\1\20\1\22\1\23\1\uffff\1\30"+
        "\3\uffff\1\44\2\uffff\1\50\1\51\1\uffff\1\55\1\uffff\1\62\1\65\1"+
        "\70\1\71\7\uffff\1\42\1\uffff\1\47\1\53\1\uffff\1\5\1\7\1\10\1\uffff"+
        "\1\27\1\32\1\40\1\uffff\1\60\1\11\1\uffff\1\46";
    static final String DFA8_specialS =
        "\u0161\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\31\1\32\1\uffff\1\31\1\32\22\uffff\1\31\1\uffff\1\33\11\uffff"+
            "\1\1\1\2\1\uffff\1\3\12\26\1\4\5\uffff\1\27\32\30\4\uffff\1"+
            "\30\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\30\1\14\1\15\1"+
            "\16\1\17\1\20\1\30\1\21\1\22\1\23\2\30\1\24\3\30\1\uffff\1\25",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\36\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\40\7\30\1\41\2\30\1\42\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\43\7\30\1\44\2\30\1\45\2\30\1\46\6\30\1\47\4\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\50\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\14\30\1\51\1\52\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\53\7\30\1\54\10\30\1\55\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\56\3\30\1\57\10\30\1\60\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\61\3\30\1\62\3\30\1\63\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\64\15\30\1\65\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\66\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\67\3\30\1\70\1\30\1\71\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\72\2\30\1\73\1\74\2\30\1\75\10\30\1\76\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\77\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\17\30\1\100\3\30\1\101\1\102\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\103\3\30\1\104\15\30\1\105\3\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\106\25\30",
            "",
            "\1\30\2\uffff\12\107\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\110\6\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\111\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\112\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\113\15\30\1\114\5\30\1\115\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\116\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\117\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\120\15\30\1\121\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\122\1\123\7\30\1\124\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\126\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\127\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\130\3\30\1\131\23\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\27\30\1\132\2\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\133\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\134\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\135\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\136\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\137\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\140\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\141\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\142\4\30\1\143\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\144\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\30\1\145\30\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\146\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\3\30\1\147\26\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\150\16\30\1\151\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\152\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\153\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\16\30\1\154\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\155\27\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\156\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\157\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\160\1\161\26\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\162\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\163\6\30\1\164\1\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\165\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\27\30\1\166\2\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\167\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\170\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\30\1\171\30\30",
            "\1\30\2\uffff\12\172\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\174\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\12\30\1\175\17\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\176\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\177\27\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\u0080\27\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u0081\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\24\30\1\u0082\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\30\30\1\u0083\1\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u0084\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u0085\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\16\30\1\u0086\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\17\30\1\u0087\12\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u0088\14\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u0089\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u008a\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u008b\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u008c\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u008e\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u008f\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\14\30\1\u0090\15\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\7\30\1\u0091\22\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u0092\23\30\1\u0093\1\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\6\30\1\u0094\23\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u0095\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\12\30\1\u0096\17\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u0097\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u0098\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u0099\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u009a\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u009b\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u009c\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u009d\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u009e\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u009f\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00a0\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00a1\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\u00a2\27\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\17\30\1\u00a3\12\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00a4\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00a6\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00a7\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u00a8\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00a9\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00aa\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u00ab\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00ac\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u00ad\7\30",
            "\1\30\2\uffff\12\u00ae\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00af\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00b0\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\7\30\1\u00b1\22\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\12\30\1\u00b2\17\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\12\30\1\u00b3\17\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u00b5\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u00b7\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00b8\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\u00b9\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u00ba\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00bb\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u00bd\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\16\30\1\u00be\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00bf\21\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00c0\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\u00c1\27\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u00c2\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\24\30\1\u00c3\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00c4\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\24\30\1\u00c6\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00c7\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00c8\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00ca\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u00cb\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\16\30\1\u00cc\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00cd\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00ce\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\16\30\1\u00cf\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\6\30\1\u00d0\23\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\16\30\1\u00d1\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00d2\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\24\30\1\u00d3\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00d4\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u00d5\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\17\30\1\u00d6\12\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00d7\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00d8\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00d9\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u00da\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00dc\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00dd\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00de\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u00e0\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00e1\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\3\30\1\u00e2\11\30\1\u00e3\1\30\1\u00e4\12\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u00e7\16\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u00e8\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00e9\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00eb\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\u00ec\10\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u00ee\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u00ef\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00f0\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\7\30\1\u00f1\22\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00f2\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\30\1\u00f3\30\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u00f5\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\u00f6\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\3\30\1\u00f7\26\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u00f8\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00f9\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00fa\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\30\30\1\u00fb\1\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00fc\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00fd\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u00fe\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u00ff\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\u0101\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u0103\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u0104\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u0105\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u0106\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\14\30\1\u0108\15\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u010a\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u010b\6\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u010c\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\6\30\1\u010d\23\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u010e\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u010f\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u0110\16\30",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\u0112\27\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\6\30\1\u0113\23\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\30\30\1\u0114\1\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\30\30\1\u0115\1\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\24\30\1\u0116\5\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\7\30\1\u0117\22\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u0118\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\6\30\1\u011c\23\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u011e\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u011f\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u0121\31\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u0122\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\6\30\1\u0123\23\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u0124\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u0126\31\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u0127\25\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u0129\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\7\30\1\u012a\22\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u012c\25\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\u012d\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u012e\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\16\30\1\u012f\13\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u0131\6\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\14\30\1\u0132\15\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\1\u0133\31\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\21\30\1\u0138\10\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\14\30\1\u013a\15\30",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u013b\25\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u013c\14\30",
            "\1\u013d\14\uffff\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff"+
            "\1\30\1\uffff\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u013e\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u013f\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\13\30\1\u0142\16\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u0144\14\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\15\30\1\u0149\14\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u014a\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u014b\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\2\30\1\u014c\27\30",
            "",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u014d\25\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u014e\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\22\30\1\u014f\7\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\10\30\1\u0151\21\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u0154\6\30",
            "",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\4\30\1\u0158\25\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\23\30\1\u015c\6\30",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\30\30\1\u015f\1\30",
            "",
            "",
            "\1\30\2\uffff\12\30\6\uffff\1\35\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | EMAIL | TWITTER | TWO_DIGIT | FOUR_DIGIT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}