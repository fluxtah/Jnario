package org.jnario.spec.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=12;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMENT_RICH_TEXT_END=14;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=5;
    public static final int T__90=90;
    public static final int RULE_RICH_TEXT_END=13;
    public static final int RULE_DECIMAL=7;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=16;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=8;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=10;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_RICH_TEXT=9;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=6;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=17;
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
    public static final int RULE_RICH_TEXT_INBETWEEN=11;
    public static final int RULE_WS=18;

    // delegates
    // delegators

    public InternalSpecLexer() {;} 
    public InternalSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:11:7: ( '=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:12:7: ( '||' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:12:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:13:7: ( '&&' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:13:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:14:7: ( 'extends' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:14:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:15:7: ( 'super' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:15:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:16:7: ( 'fact' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:16:9: 'fact'
            {
            match("fact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:17:7: ( 'facts' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:17:9: 'facts'
            {
            match("facts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:18:7: ( 'each' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:18:9: 'each'
            {
            match("each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:19:7: ( ';' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:20:7: ( 'throws' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:20:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:21:7: ( 'public' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:21:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:22:7: ( 'private' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:22:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:23:7: ( 'protected' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:23:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:24:7: ( 'package' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:24:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25:7: ( 'abstract' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:25:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:26:7: ( 'static' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:26:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27:7: ( 'dispatch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:27:9: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:28:7: ( 'final' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:28:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:29:7: ( 'val' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:29:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:30:7: ( 'var' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:30:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:31:7: ( 'def' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:31:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32:7: ( 'override' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32:9: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:33:7: ( 'create' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:33:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:34:7: ( 'annotation' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:34:9: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:35:7: ( 'class' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:35:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:36:7: ( 'enum' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:36:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:37:7: ( 'extension' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:37:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:38:7: ( 'implements' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:38:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:39:7: ( 'import' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:39:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:40:7: ( 'interface' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:40:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:41:7: ( '+=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:41:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:42:7: ( '-=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:42:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:43:7: ( '==' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:43:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:44:7: ( '!=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:44:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:45:7: ( '===' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:45:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:46:7: ( '!==' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:46:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:47:7: ( '>=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:47:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:48:7: ( '<=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:48:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:49:7: ( '>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:49:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:50:7: ( '<' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:50:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:51:7: ( '->' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:51:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:52:7: ( '..<' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:52:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:53:7: ( '..' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:53:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:54:7: ( '=>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:54:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:55:7: ( '<>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:55:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:56:7: ( '?:' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:56:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:57:7: ( '<=>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:57:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:58:7: ( '+' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:58:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:59:7: ( '-' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:59:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:60:7: ( '*' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:60:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:61:7: ( '**' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:61:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:62:7: ( '/' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:62:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:63:7: ( '%' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:63:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:64:7: ( '!' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:64:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:65:7: ( '.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:65:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:66:7: ( 'false' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:66:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:67:7: ( '{' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:67:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:68:7: ( '}' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:68:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:69:7: ( '(' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:69:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:70:7: ( ')' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:70:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:71:7: ( ',' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:71:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:72:7: ( '[' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:72:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:73:7: ( ']' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:73:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:74:7: ( '?' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:74:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:75:7: ( 'before' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:75:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:76:7: ( 'after' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:76:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:77:7: ( '|' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:77:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:78:7: ( 'should' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:78:9: 'should'
            {
            match("should"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:79:7: ( 'throw' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:79:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:80:7: ( 'instanceof' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:80:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:81:7: ( 'not' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:81:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:82:7: ( 'assert' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:82:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:83:7: ( ':' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:83:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:84:7: ( 'FOR' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:84:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:85:7: ( 'ENDFOR' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:85:9: 'ENDFOR'
            {
            match("ENDFOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:86:7: ( 'BEFORE' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:86:9: 'BEFORE'
            {
            match("BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:87:7: ( 'SEPARATOR' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:87:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:88:7: ( 'AFTER' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:88:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:89:7: ( 'IF' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:89:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:90:7: ( 'ENDIF' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:90:9: 'ENDIF'
            {
            match("ENDIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:91:8: ( 'ELSE' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:91:10: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:92:8: ( 'ELSEIF' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:92:10: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:93:8: ( '@' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:93:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:94:8: ( 'as' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:94:10: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:95:8: ( '#' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:95:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:96:8: ( 'if' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:96:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:97:8: ( 'else' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:97:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:98:8: ( 'switch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:98:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:99:8: ( 'default' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:99:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:100:8: ( 'case' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:100:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:101:8: ( 'for' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:101:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:102:8: ( 'while' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:102:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:103:8: ( 'do' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:103:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:104:8: ( '::' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:104:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:105:8: ( 'new' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:105:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:106:8: ( 'null' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:106:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:107:8: ( 'typeof' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:107:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:108:8: ( 'return' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:108:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:109:8: ( 'try' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:109:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:110:8: ( 'finally' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:110:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:111:8: ( 'catch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:111:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:112:8: ( '&' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:112:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:113:8: ( 'describe' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:113:10: 'describe'
            {
            match("describe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:114:8: ( 'pending' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:114:10: 'pending'
            {
            match("pending"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:115:8: ( 'all' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:115:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:116:8: ( 'context' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:116:10: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:117:8: ( '...' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:117:10: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:118:8: ( '?.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:118:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:119:8: ( '*.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:119:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:120:8: ( 'true' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:120:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32272:17: ( '/*' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '*/' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32272:19: '/*' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '*/'
            {
            match("/*"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32272:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='*') ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3=='/') ) {
                            alt1=2;
                        }
                        else if ( ((LA1_3>='\u0000' && LA1_3<='.')||(LA1_3>='0' && LA1_3<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<=')')||(LA1_1>='+' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0=='\\') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32272:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:27: ( RULE_IN_RICH_STRING )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        int LA2_4 = input.LA(3);

                        if ( ((LA2_4>='\u0000' && LA2_4<='&')||(LA2_4>='(' && LA2_4<='\u00AA')||(LA2_4>='\u00AC' && LA2_4<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='&')||(LA2_1>='(' && LA2_1<='\u00AA')||(LA2_1>='\u00AC' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\u00AA')||(LA2_0>='\u00AC' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\'') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\'') ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3=='\'') ) {
                        alt5=1;
                    }
                    else {
                        alt5=2;}
                }
                else {
                    alt5=2;}
            }
            else {
                alt5=2;}
            switch (alt5) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:58: ( '\\'' ( '\\'' )? )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\'') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:64: ( '\\'' )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0=='\'') ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32274:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:33: ( RULE_IN_RICH_STRING )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\'') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='\'') ) {
                        int LA6_4 = input.LA(3);

                        if ( ((LA6_4>='\u0000' && LA6_4<='&')||(LA6_4>='(' && LA6_4<='\u00AA')||(LA6_4>='\u00AC' && LA6_4<='\uFFFF')) ) {
                            alt6=1;
                        }


                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='&')||(LA6_1>='(' && LA6_1<='\u00AA')||(LA6_1>='\u00AC' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\u00AA')||(LA6_0>='\u00AC' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:54: ( '\\'' ( '\\'' )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\'') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:60: ( '\\'' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\'') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32276:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:31: ( RULE_IN_RICH_STRING )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\'') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\'') ) {
                        int LA9_4 = input.LA(3);

                        if ( ((LA9_4>='\u0000' && LA9_4<='&')||(LA9_4>='(' && LA9_4<='\u00AA')||(LA9_4>='\u00AC' && LA9_4<='\uFFFF')) ) {
                            alt9=1;
                        }


                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='&')||(LA9_1>='(' && LA9_1<='\u00AA')||(LA9_1>='\u00AC' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\u00AA')||(LA9_0>='\u00AC' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\'') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='\'') ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3=='\'') ) {
                        alt12=1;
                    }
                    else {
                        alt12=2;}
                }
                else {
                    alt12=2;}
            }
            else {
                alt12=2;}
            switch (alt12) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:62: ( '\\'' ( '\\'' )? )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\'') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:68: ( '\\'' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='\'') ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32278:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:37: ( RULE_IN_RICH_STRING )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\'') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='\'') ) {
                        int LA13_4 = input.LA(3);

                        if ( ((LA13_4>='\u0000' && LA13_4<='&')||(LA13_4>='(' && LA13_4<='\u00AA')||(LA13_4>='\u00AC' && LA13_4<='\uFFFF')) ) {
                            alt13=1;
                        }


                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='&')||(LA13_1>='(' && LA13_1<='\u00AA')||(LA13_1>='\u00AC' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='\u00AA')||(LA13_0>='\u00AC' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:58: ( '\\'' ( '\\'' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:64: ( '\\'' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\'') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32280:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:51: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:68: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:79: ( RULE_IN_RICH_STRING )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\'') ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1=='\'') ) {
                                int LA18_4 = input.LA(3);

                                if ( ((LA18_4>='\u0000' && LA18_4<='&')||(LA18_4>='(' && LA18_4<='\u00AA')||(LA18_4>='\u00AC' && LA18_4<='\uFFFF')) ) {
                                    alt18=1;
                                }


                            }
                            else if ( ((LA18_1>='\u0000' && LA18_1<='&')||(LA18_1>='(' && LA18_1<='\u00AA')||(LA18_1>='\u00AC' && LA18_1<='\uFFFF')) ) {
                                alt18=1;
                            }


                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\u00AA')||(LA18_0>='\u00AC' && LA18_0<='\uFFFF')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:100: ( '\\'' ( '\\'' )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\'') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:106: ( '\\'' )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0=='\'') ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32282:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:45: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }
            else {
                alt28=2;}
            switch (alt28) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:62: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:73: ( RULE_IN_RICH_STRING )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\'') ) {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1=='\'') ) {
                                int LA24_4 = input.LA(3);

                                if ( ((LA24_4>='\u0000' && LA24_4<='&')||(LA24_4>='(' && LA24_4<='\u00AA')||(LA24_4>='\u00AC' && LA24_4<='\uFFFF')) ) {
                                    alt24=1;
                                }


                            }
                            else if ( ((LA24_1>='\u0000' && LA24_1<='&')||(LA24_1>='(' && LA24_1<='\u00AA')||(LA24_1>='\u00AC' && LA24_1<='\uFFFF')) ) {
                                alt24=1;
                            }


                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='\u00AA')||(LA24_0>='\u00AC' && LA24_0<='\uFFFF')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\'') ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1=='\'') ) {
                            int LA27_3 = input.LA(3);

                            if ( (LA27_3=='\'') ) {
                                alt27=1;
                            }
                            else {
                                alt27=2;}
                        }
                        else {
                            alt27=2;}
                    }
                    else {
                        alt27=2;}
                    switch (alt27) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:104: ( '\\'' ( '\\'' )? )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0=='\'') ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:110: ( '\\'' )?
                                    int alt25=2;
                                    int LA25_0 = input.LA(1);

                                    if ( (LA25_0=='\'') ) {
                                        alt25=1;
                                    }
                                    switch (alt25) {
                                        case 1 :
                                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:110: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32284:123: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32286:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32286:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32286:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\'') ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1=='\'') ) {
                    alt29=1;
                }
                else if ( ((LA29_1>='\u0000' && LA29_1<='&')||(LA29_1>='(' && LA29_1<='\u00AA')||(LA29_1>='\u00AC' && LA29_1<='\uFFFF')) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='\u00AA')||(LA29_0>='\u00AC' && LA29_0<='\uFFFF')) ) {
                alt29=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32286:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32286:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32286:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:12: ( '0x' | '0X' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='0') ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1=='x') ) {
                    alt30=1;
                }
                else if ( (LA30_1=='X') ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='F')||LA31_0=='_'||(LA31_0>='a' && LA31_0<='f')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='#') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='B'||LA32_0=='b') ) {
                        alt32=1;
                    }
                    else if ( (LA32_0=='L'||LA32_0=='l') ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32288:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32290:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32290:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32290:21: ( '0' .. '9' | '_' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='0' && LA34_0<='9')||LA34_0=='_') ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='E'||LA36_0=='e') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:36: ( '+' | '-' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='+'||LA35_0=='-') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='B'||LA37_0=='b') ) {
                alt37=1;
            }
            else if ( (LA37_0=='D'||LA37_0=='F'||LA37_0=='L'||LA37_0=='d'||LA37_0=='f'||LA37_0=='l') ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32292:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32294:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32294:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32294:11: ( '^' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='^') ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32294:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32294:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='$'||(LA39_0>='0' && LA39_0<='9')||(LA39_0>='A' && LA39_0<='Z')||LA39_0=='_'||(LA39_0>='a' && LA39_0<='z')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\"') ) {
                alt42=1;
            }
            else if ( (LA42_0=='\'') ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\\') ) {
                            alt40=1;
                        }
                        else if ( ((LA40_0>='\u0000' && LA40_0<='!')||(LA40_0>='#' && LA40_0<='[')||(LA40_0>=']' && LA40_0<='\uFFFF')) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop41:
                    do {
                        int alt41=3;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0=='\\') ) {
                            alt41=1;
                        }
                        else if ( ((LA41_0>='\u0000' && LA41_0<='&')||(LA41_0>='(' && LA41_0<='[')||(LA41_0>=']' && LA41_0<='\uFFFF')) ) {
                            alt41=2;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32296:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='\u0000' && LA43_0<='\t')||(LA43_0>='\u000B' && LA43_0<='\f')||(LA43_0>='\u000E' && LA43_0<='\uFFFF')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:40: ( ( '\\r' )? '\\n' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\n'||LA45_0=='\r') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:41: ( '\\r' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='\r') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32298:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32300:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32300:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32300:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32302:16: ( . )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:32302:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | RULE_ML_COMMENT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt47=125;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:244: T__59
                {
                mT__59(); 

                }
                break;
            case 41 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:250: T__60
                {
                mT__60(); 

                }
                break;
            case 42 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:256: T__61
                {
                mT__61(); 

                }
                break;
            case 43 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:262: T__62
                {
                mT__62(); 

                }
                break;
            case 44 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:268: T__63
                {
                mT__63(); 

                }
                break;
            case 45 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:274: T__64
                {
                mT__64(); 

                }
                break;
            case 46 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:280: T__65
                {
                mT__65(); 

                }
                break;
            case 47 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:286: T__66
                {
                mT__66(); 

                }
                break;
            case 48 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:292: T__67
                {
                mT__67(); 

                }
                break;
            case 49 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:298: T__68
                {
                mT__68(); 

                }
                break;
            case 50 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:304: T__69
                {
                mT__69(); 

                }
                break;
            case 51 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:310: T__70
                {
                mT__70(); 

                }
                break;
            case 52 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:316: T__71
                {
                mT__71(); 

                }
                break;
            case 53 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:322: T__72
                {
                mT__72(); 

                }
                break;
            case 54 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:328: T__73
                {
                mT__73(); 

                }
                break;
            case 55 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:334: T__74
                {
                mT__74(); 

                }
                break;
            case 56 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:340: T__75
                {
                mT__75(); 

                }
                break;
            case 57 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:346: T__76
                {
                mT__76(); 

                }
                break;
            case 58 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:352: T__77
                {
                mT__77(); 

                }
                break;
            case 59 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:358: T__78
                {
                mT__78(); 

                }
                break;
            case 60 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:364: T__79
                {
                mT__79(); 

                }
                break;
            case 61 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:370: T__80
                {
                mT__80(); 

                }
                break;
            case 62 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:376: T__81
                {
                mT__81(); 

                }
                break;
            case 63 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:382: T__82
                {
                mT__82(); 

                }
                break;
            case 64 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:388: T__83
                {
                mT__83(); 

                }
                break;
            case 65 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:394: T__84
                {
                mT__84(); 

                }
                break;
            case 66 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:400: T__85
                {
                mT__85(); 

                }
                break;
            case 67 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:406: T__86
                {
                mT__86(); 

                }
                break;
            case 68 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:412: T__87
                {
                mT__87(); 

                }
                break;
            case 69 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:418: T__88
                {
                mT__88(); 

                }
                break;
            case 70 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:424: T__89
                {
                mT__89(); 

                }
                break;
            case 71 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:430: T__90
                {
                mT__90(); 

                }
                break;
            case 72 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:436: T__91
                {
                mT__91(); 

                }
                break;
            case 73 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:442: T__92
                {
                mT__92(); 

                }
                break;
            case 74 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:448: T__93
                {
                mT__93(); 

                }
                break;
            case 75 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:454: T__94
                {
                mT__94(); 

                }
                break;
            case 76 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:460: T__95
                {
                mT__95(); 

                }
                break;
            case 77 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:466: T__96
                {
                mT__96(); 

                }
                break;
            case 78 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:472: T__97
                {
                mT__97(); 

                }
                break;
            case 79 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:478: T__98
                {
                mT__98(); 

                }
                break;
            case 80 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:484: T__99
                {
                mT__99(); 

                }
                break;
            case 81 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:490: T__100
                {
                mT__100(); 

                }
                break;
            case 82 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:497: T__101
                {
                mT__101(); 

                }
                break;
            case 83 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:504: T__102
                {
                mT__102(); 

                }
                break;
            case 84 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:511: T__103
                {
                mT__103(); 

                }
                break;
            case 85 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:518: T__104
                {
                mT__104(); 

                }
                break;
            case 86 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:525: T__105
                {
                mT__105(); 

                }
                break;
            case 87 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:532: T__106
                {
                mT__106(); 

                }
                break;
            case 88 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:539: T__107
                {
                mT__107(); 

                }
                break;
            case 89 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:546: T__108
                {
                mT__108(); 

                }
                break;
            case 90 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:553: T__109
                {
                mT__109(); 

                }
                break;
            case 91 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:560: T__110
                {
                mT__110(); 

                }
                break;
            case 92 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:567: T__111
                {
                mT__111(); 

                }
                break;
            case 93 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:574: T__112
                {
                mT__112(); 

                }
                break;
            case 94 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:581: T__113
                {
                mT__113(); 

                }
                break;
            case 95 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:588: T__114
                {
                mT__114(); 

                }
                break;
            case 96 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:595: T__115
                {
                mT__115(); 

                }
                break;
            case 97 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:602: T__116
                {
                mT__116(); 

                }
                break;
            case 98 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:609: T__117
                {
                mT__117(); 

                }
                break;
            case 99 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:616: T__118
                {
                mT__118(); 

                }
                break;
            case 100 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:623: T__119
                {
                mT__119(); 

                }
                break;
            case 101 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:630: T__120
                {
                mT__120(); 

                }
                break;
            case 102 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:637: T__121
                {
                mT__121(); 

                }
                break;
            case 103 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:644: T__122
                {
                mT__122(); 

                }
                break;
            case 104 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:651: T__123
                {
                mT__123(); 

                }
                break;
            case 105 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:658: T__124
                {
                mT__124(); 

                }
                break;
            case 106 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:665: T__125
                {
                mT__125(); 

                }
                break;
            case 107 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:672: T__126
                {
                mT__126(); 

                }
                break;
            case 108 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:679: T__127
                {
                mT__127(); 

                }
                break;
            case 109 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:686: T__128
                {
                mT__128(); 

                }
                break;
            case 110 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:693: T__129
                {
                mT__129(); 

                }
                break;
            case 111 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:700: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 112 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:716: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 113 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:731: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 114 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:752: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 115 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:771: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 116 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:796: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 117 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:829: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 118 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:856: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 119 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:865: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 120 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:874: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 121 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:887: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 122 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:895: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 123 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:907: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 124 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:923: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 125 :
                // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/internal/InternalSpec.g:1:931: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA47_eotS =
        "\1\uffff\1\72\1\74\1\76\3\103\1\uffff\10\103\1\145\1\150\1\152\1"+
        "\154\1\157\1\161\1\164\1\167\1\172\10\uffff\2\103\1\u0088\6\103"+
        "\2\uffff\2\103\1\67\1\u0099\1\67\2\u009d\1\67\1\uffff\1\67\2\uffff"+
        "\1\u00a1\6\uffff\4\103\1\uffff\7\103\1\uffff\12\103\1\u00bb\3\103"+
        "\1\u00c0\10\103\1\u00cc\5\uffff\1\u00ce\3\uffff\1\u00d0\2\uffff"+
        "\1\u00d3\22\uffff\4\103\2\uffff\6\103\1\u00de\2\uffff\2\103\1\u0095"+
        "\1\uffff\2\u0099\2\uffff\1\u00e7\1\uffff\1\u009d\5\uffff\13\103"+
        "\1\u00f3\2\103\1\u00f6\12\103\1\uffff\1\u0101\1\103\1\u0104\1\103"+
        "\1\uffff\1\u0106\1\u0107\11\103\10\uffff\1\103\1\u0113\1\u0114\1"+
        "\103\1\u0116\5\103\1\uffff\2\103\1\u0121\2\u0099\1\u00e7\1\uffff"+
        "\1\u0126\1\uffff\1\103\1\u0128\1\u0129\1\u012a\4\103\1\u0130\2\103"+
        "\1\uffff\2\103\1\uffff\1\u0135\11\103\1\uffff\2\103\1\uffff\1\103"+
        "\2\uffff\3\103\1\u0145\7\103\2\uffff\1\u014d\1\uffff\2\103\1\u0151"+
        "\5\103\2\u0121\2\uffff\1\u0099\2\u0126\1\uffff\1\103\3\uffff\1\u015d"+
        "\3\103\1\u0161\1\uffff\1\u0162\1\u0164\1\u0166\1\103\1\uffff\7\103"+
        "\1\u016f\6\103\1\u0176\1\uffff\1\u0177\6\103\1\uffff\1\103\1\u017f"+
        "\1\103\1\uffff\2\103\1\u0183\1\u0184\1\103\2\u0121\2\u0126\2\103"+
        "\1\uffff\1\u018a\1\u018b\1\u018c\2\uffff\1\103\1\uffff\1\u018e\1"+
        "\uffff\1\u018f\1\u0190\6\103\1\uffff\1\u0197\4\103\1\u019c\2\uffff"+
        "\2\103\1\u019f\2\103\1\u01a2\1\u01a3\1\uffff\1\u01a4\1\u01a5\1\103"+
        "\2\uffff\1\u01a7\1\u0121\1\u0126\1\u01a8\1\103\3\uffff\1\u01aa\3"+
        "\uffff\1\u01ab\1\103\1\u01ad\1\u01ae\2\103\1\uffff\1\103\1\u01b2"+
        "\2\103\1\uffff\1\u01b5\1\103\1\uffff\2\103\4\uffff\1\103\2\uffff"+
        "\1\103\2\uffff\1\103\2\uffff\1\u01bc\1\103\1\u01be\1\uffff\1\u01bf"+
        "\1\u01c0\1\uffff\4\103\1\u01c5\1\u01c6\1\uffff\1\103\3\uffff\1\103"+
        "\1\u01c9\1\103\1\u01cb\2\uffff\1\u01cc\1\u01cd\1\uffff\1\u01ce\4"+
        "\uffff";
    static final String DFA47_eofS =
        "\u01cf\uffff";
    static final String DFA47_minS =
        "\1\0\1\75\1\174\1\46\1\141\1\150\1\141\1\uffff\1\150\1\141\1\142"+
        "\1\145\1\141\1\166\1\141\1\146\5\75\2\56\2\52\10\uffff\2\145\1\72"+
        "\1\117\1\114\2\105\2\106\2\uffff\1\150\1\145\2\0\1\u00ab\2\60\1"+
        "\44\1\uffff\1\0\2\uffff\1\75\6\uffff\1\164\1\143\1\165\1\163\1\uffff"+
        "\1\160\1\141\1\157\1\151\1\143\1\156\1\162\1\uffff\1\162\1\160\1"+
        "\165\1\142\1\151\1\143\1\156\1\163\1\156\1\164\1\44\1\154\1\163"+
        "\1\146\1\44\1\154\2\145\1\141\1\163\1\156\1\160\1\163\1\44\5\uffff"+
        "\1\75\3\uffff\1\76\2\uffff\1\56\22\uffff\1\146\1\164\1\167\1\154"+
        "\2\uffff\1\122\1\104\1\123\1\106\1\120\1\124\1\44\2\uffff\1\151"+
        "\1\164\1\47\1\uffff\2\0\2\uffff\1\0\1\uffff\1\60\5\uffff\1\145\1"+
        "\150\1\155\2\145\1\164\1\165\2\164\1\163\1\141\1\44\1\157\1\145"+
        "\1\44\1\145\1\154\1\166\1\164\1\153\1\144\1\164\1\157\2\145\1\uffff"+
        "\1\44\1\160\1\44\1\143\1\uffff\2\44\1\162\1\141\1\163\1\145\1\143"+
        "\1\164\1\154\1\145\1\164\10\uffff\1\157\2\44\1\154\1\44\1\106\1"+
        "\105\1\117\1\101\1\105\1\uffff\1\154\1\165\4\0\1\12\1\0\1\uffff"+
        "\1\156\3\44\1\162\1\151\1\154\1\143\1\44\1\145\1\154\1\uffff\1\167"+
        "\1\157\1\uffff\1\44\1\151\1\141\1\145\1\141\1\151\1\162\1\164\2"+
        "\162\1\uffff\1\141\1\165\1\uffff\1\162\2\uffff\1\162\1\164\1\163"+
        "\1\44\1\150\2\145\2\162\1\141\1\162\2\uffff\1\44\1\uffff\1\117\1"+
        "\106\1\44\3\122\1\145\1\162\2\0\2\uffff\3\0\1\uffff\1\144\3\uffff"+
        "\1\44\1\143\1\144\1\150\1\44\1\uffff\3\44\1\146\1\uffff\1\143\1"+
        "\164\1\143\1\147\1\156\2\141\1\44\2\164\1\154\2\151\1\145\1\44\1"+
        "\uffff\1\44\1\170\1\155\1\164\1\146\1\156\1\145\1\uffff\1\122\1"+
        "\44\1\106\1\uffff\1\105\1\101\2\44\1\156\4\0\1\163\1\151\1\uffff"+
        "\3\44\2\uffff\1\171\1\uffff\1\44\1\uffff\2\44\1\145\1\164\1\145"+
        "\1\147\1\143\1\164\1\uffff\1\44\1\143\1\164\1\142\1\144\1\44\2\uffff"+
        "\1\164\1\145\1\44\1\141\1\143\2\44\1\uffff\2\44\1\124\2\uffff\1"+
        "\44\2\0\1\44\1\157\3\uffff\1\44\3\uffff\1\44\1\145\2\44\1\164\1"+
        "\151\1\uffff\1\150\1\44\2\145\1\uffff\1\44\1\156\1\uffff\1\143\1"+
        "\145\4\uffff\1\117\2\uffff\1\156\2\uffff\1\144\2\uffff\1\44\1\157"+
        "\1\44\1\uffff\2\44\1\uffff\1\164\1\145\1\157\1\122\2\44\1\uffff"+
        "\1\156\3\uffff\1\163\1\44\1\146\1\44\2\uffff\2\44\1\uffff\1\44\4"+
        "\uffff";
    static final String DFA47_maxS =
        "\1\uffff\1\76\1\174\1\46\1\170\1\167\1\157\1\uffff\1\171\1\165\1"+
        "\163\1\157\1\141\1\166\1\162\1\156\1\75\1\76\2\75\1\76\1\56\1\72"+
        "\1\56\1\57\10\uffff\1\145\1\165\1\72\1\117\1\116\2\105\2\106\2\uffff"+
        "\1\150\1\145\2\uffff\1\u00ab\1\170\1\154\1\172\1\uffff\1\uffff\2"+
        "\uffff\1\75\6\uffff\1\164\1\143\1\165\1\163\1\uffff\1\160\1\141"+
        "\1\157\1\151\1\154\1\156\1\162\1\uffff\1\162\1\160\1\171\1\142\1"+
        "\157\1\143\1\156\1\163\1\156\1\164\1\172\1\154\2\163\1\172\1\162"+
        "\2\145\1\141\1\164\1\156\1\160\1\164\1\172\5\uffff\1\75\3\uffff"+
        "\1\76\2\uffff\1\74\22\uffff\1\146\1\164\1\167\1\154\2\uffff\1\122"+
        "\1\104\1\123\1\106\1\120\1\124\1\172\2\uffff\1\151\1\164\1\47\1"+
        "\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\154\5\uffff\1\145\1\150"+
        "\1\155\2\145\1\164\1\165\2\164\1\163\1\141\1\172\1\157\1\145\1\172"+
        "\1\145\1\154\1\166\1\164\1\153\1\144\1\164\1\157\2\145\1\uffff\1"+
        "\172\1\160\1\172\1\143\1\uffff\2\172\1\162\1\141\1\163\1\145\1\143"+
        "\1\164\1\157\1\145\1\164\10\uffff\1\157\2\172\1\154\1\172\1\111"+
        "\1\105\1\117\1\101\1\105\1\uffff\1\154\1\165\4\uffff\1\12\1\uffff"+
        "\1\uffff\1\156\3\172\1\162\1\151\1\154\1\143\1\172\1\145\1\154\1"+
        "\uffff\1\167\1\157\1\uffff\1\172\1\151\1\141\1\145\1\141\1\151\1"+
        "\162\1\164\2\162\1\uffff\1\141\1\165\1\uffff\1\162\2\uffff\1\162"+
        "\1\164\1\163\1\172\1\150\2\145\2\162\1\141\1\162\2\uffff\1\172\1"+
        "\uffff\1\117\1\106\1\172\3\122\1\145\1\162\2\uffff\2\uffff\3\uffff"+
        "\1\uffff\1\163\3\uffff\1\172\1\143\1\144\1\150\1\172\1\uffff\3\172"+
        "\1\146\1\uffff\1\143\1\164\1\143\1\147\1\156\2\141\1\172\2\164\1"+
        "\154\2\151\1\145\1\172\1\uffff\1\172\1\170\1\155\1\164\1\146\1\156"+
        "\1\145\1\uffff\1\122\1\172\1\106\1\uffff\1\105\1\101\2\172\1\156"+
        "\4\uffff\1\163\1\151\1\uffff\3\172\2\uffff\1\171\1\uffff\1\172\1"+
        "\uffff\2\172\1\145\1\164\1\145\1\147\1\143\1\164\1\uffff\1\172\1"+
        "\143\1\164\1\142\1\144\1\172\2\uffff\1\164\1\145\1\172\1\141\1\143"+
        "\2\172\1\uffff\2\172\1\124\2\uffff\1\172\2\uffff\1\172\1\157\3\uffff"+
        "\1\172\3\uffff\1\172\1\145\2\172\1\164\1\151\1\uffff\1\150\1\172"+
        "\2\145\1\uffff\1\172\1\156\1\uffff\1\143\1\145\4\uffff\1\117\2\uffff"+
        "\1\156\2\uffff\1\144\2\uffff\1\172\1\157\1\172\1\uffff\2\172\1\uffff"+
        "\1\164\1\145\1\157\1\122\2\172\1\uffff\1\156\3\uffff\1\163\1\172"+
        "\1\146\1\172\2\uffff\2\172\1\uffff\1\172\4\uffff";
    static final String DFA47_acceptS =
        "\7\uffff\1\11\21\uffff\1\65\1\71\1\72\1\73\1\74\1\75\1\76\1\77\11"+
        "\uffff\1\123\1\125\10\uffff\1\171\1\uffff\1\174\1\175\1\uffff\1"+
        "\54\1\1\1\2\1\103\1\3\1\146\4\uffff\1\171\7\uffff\1\11\30\uffff"+
        "\1\37\1\60\1\40\1\51\1\61\1\uffff\1\66\1\45\1\47\1\uffff\1\55\1"+
        "\50\1\uffff\1\67\1\56\1\154\1\100\1\63\1\155\1\62\1\157\1\173\1"+
        "\64\1\65\1\71\1\72\1\73\1\74\1\75\1\76\1\77\4\uffff\1\136\1\111"+
        "\7\uffff\1\123\1\125\3\uffff\1\172\2\uffff\1\163\1\162\1\uffff\1"+
        "\166\1\uffff\1\167\1\170\1\174\1\43\1\41\31\uffff\1\124\4\uffff"+
        "\1\135\13\uffff\1\126\1\44\1\42\1\57\1\46\1\52\1\153\1\53\12\uffff"+
        "\1\117\10\uffff\1\164\13\uffff\1\133\2\uffff\1\143\12\uffff\1\151"+
        "\2\uffff\1\25\1\uffff\1\23\1\24\13\uffff\1\107\1\137\1\uffff\1\112"+
        "\12\uffff\1\160\1\161\3\uffff\1\165\1\uffff\1\10\1\32\1\127\5\uffff"+
        "\1\6\4\uffff\1\156\17\uffff\1\132\7\uffff\1\140\3\uffff\1\121\13"+
        "\uffff\1\5\3\uffff\1\7\1\70\1\uffff\1\22\1\uffff\1\105\10\uffff"+
        "\1\102\6\uffff\1\31\1\145\7\uffff\1\120\3\uffff\1\116\1\134\5\uffff"+
        "\1\20\1\104\1\130\1\uffff\1\12\1\141\1\13\6\uffff\1\110\4\uffff"+
        "\1\27\2\uffff\1\35\2\uffff\1\101\1\113\1\122\1\114\1\uffff\1\142"+
        "\1\4\1\uffff\1\144\1\14\1\uffff\1\16\1\150\3\uffff\1\131\2\uffff"+
        "\1\152\6\uffff\1\17\1\uffff\1\21\1\147\1\26\4\uffff\1\33\1\15\2"+
        "\uffff\1\36\1\uffff\1\115\1\30\1\34\1\106";
    static final String DFA47_specialS =
        "\1\26\55\uffff\1\1\1\22\5\uffff\1\11\140\uffff\1\14\1\21\2\uffff"+
        "\1\17\106\uffff\1\15\1\0\1\24\1\2\1\uffff\1\20\70\uffff\1\13\1\10"+
        "\2\uffff\1\23\1\16\1\5\61\uffff\1\12\1\6\1\25\1\4\53\uffff\1\7\1"+
        "\3\107\uffff}>";
    static final String[] DFA47_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\22\1\65\1\53\1\64\1\31\1"+
            "\3\1\56\1\34\1\35\1\27\1\20\1\36\1\21\1\25\1\30\1\61\11\62\1"+
            "\43\1\7\1\24\1\1\1\23\1\26\1\52\1\50\1\46\2\64\1\45\1\44\2\64"+
            "\1\51\11\64\1\47\7\64\1\37\1\67\1\40\1\63\1\64\1\67\1\12\1\41"+
            "\1\16\1\13\1\4\1\6\2\64\1\17\4\64\1\42\1\15\1\11\1\64\1\55\1"+
            "\5\1\10\1\64\1\14\1\54\3\64\1\32\1\2\1\33\55\67\1\60\17\67\1"+
            "\57\uff44\67",
            "\1\70\1\71",
            "\1\73",
            "\1\75",
            "\1\100\12\uffff\1\102\1\uffff\1\101\11\uffff\1\77",
            "\1\106\13\uffff\1\105\1\104\1\uffff\1\107",
            "\1\110\7\uffff\1\111\5\uffff\1\112",
            "",
            "\1\114\11\uffff\1\116\6\uffff\1\115",
            "\1\121\3\uffff\1\122\14\uffff\1\120\2\uffff\1\117",
            "\1\123\3\uffff\1\125\5\uffff\1\127\1\uffff\1\124\4\uffff\1"+
            "\126",
            "\1\131\3\uffff\1\130\5\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\137\12\uffff\1\136\2\uffff\1\140\2\uffff\1\135",
            "\1\143\6\uffff\1\141\1\142",
            "\1\144",
            "\1\146\1\147",
            "\1\151",
            "\1\153",
            "\1\155\1\156",
            "\1\160",
            "\1\163\13\uffff\1\162",
            "\1\165\3\uffff\1\166",
            "\1\170\4\uffff\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0085\11\uffff\1\u0084\5\uffff\1\u0086",
            "\1\u0087",
            "\1\u0089",
            "\1\u008b\1\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\47\u0095\1\u0094\uffd8\u0095",
            "\47\u0097\1\u0096\u0083\u0097\1\u0098\uff54\u0097",
            "\1\u009a",
            "\12\u009c\10\uffff\1\u009e\1\uffff\3\u009e\5\uffff\1\u009e"+
            "\13\uffff\1\u009b\6\uffff\1\u009c\2\uffff\1\u009e\1\uffff\3"+
            "\u009e\5\uffff\1\u009e\13\uffff\1\u009b",
            "\12\u009c\10\uffff\1\u009e\1\uffff\3\u009e\5\uffff\1\u009e"+
            "\22\uffff\1\u009c\2\uffff\1\u009e\1\uffff\3\u009e\5\uffff\1"+
            "\u009e",
            "\1\103\34\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\0\u0095",
            "",
            "",
            "\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\10\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b1\3\uffff\1\u00b0",
            "\1\u00b2",
            "\1\u00b3\5\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\22\103\1\u00ba\7\103",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\14\uffff\1\u00bf",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00c1\5\uffff\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00cb\1\u00ca",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cd",
            "",
            "",
            "",
            "\1\u00cf",
            "",
            "",
            "\1\u00d2\15\uffff\1\u00d1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\47\u00e3\1\u00e2\u0083\u00e3\1\u0098\uff54\u00e3",
            "\47\u0097\1\u0096\u0083\u0097\1\u0098\uff54\u0097",
            "",
            "",
            "\12\u00e4\1\u00e6\2\u00e4\1\u00e5\ufff2\u00e4",
            "",
            "\12\u009c\10\uffff\1\u009e\1\uffff\3\u009e\5\uffff\1\u009e"+
            "\22\uffff\1\u009c\2\uffff\1\u009e\1\uffff\3\u009e\5\uffff\1"+
            "\u009e",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00f4",
            "\1\u00f5",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0102",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\1\u0103\31\103",
            "\1\u0105",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e\2\uffff\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0112",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0115",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0117\2\uffff\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\47\u0120\1\u011f\u0083\u0120\1\u0122\uff54\u0120",
            "\47\u0123\1\uffff\u0083\u0123\1\u0098\uff54\u0123",
            "\47\u0097\1\u0096\u0083\u0097\1\u0098\uff54\u0097",
            "\12\u00e4\1\u00e6\2\u00e4\1\u00e5\ufff2\u00e4",
            "\1\u00e6",
            "\47\u0125\1\u0124\u0083\u0125\1\u00e7\uff54\u0125",
            "",
            "\1\u0127",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\22\103\1\u012f\7\103",
            "\1\u0131",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "",
            "",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\103\13\uffff\12\103\7\uffff\10\103\1\u0150\21\103\4\uffff"+
            "\1\103\1\uffff\32\103",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\47\u0158\1\u0157\u0083\u0158\1\u0122\uff54\u0158",
            "\47\u0120\1\u011f\u0083\u0120\1\u0122\uff54\u0120",
            "",
            "",
            "\47\u0097\1\u0096\u0083\u0097\1\u0098\uff54\u0097",
            "\47\u015a\1\u0159\u0083\u015a\1\u00e7\uff54\u015a",
            "\47\u0125\1\u0124\u0083\u0125\1\u00e7\uff54\u0125",
            "",
            "\1\u015b\16\uffff\1\u015c",
            "",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\13\103\1\u0163\16\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\22\103\1\u0165\7\103",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0180",
            "",
            "\1\u0181",
            "\1\u0182",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0185",
            "\47\u0186\1\uffff\u0083\u0186\1\u0122\uff54\u0186",
            "\47\u0120\1\u011f\u0083\u0120\1\u0122\uff54\u0120",
            "\47\u0187\1\uffff\u0083\u0187\1\u00e7\uff54\u0187",
            "\47\u0125\1\u0124\u0083\u0125\1\u00e7\uff54\u0125",
            "\1\u0188",
            "\1\u0189",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u018d",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u019d",
            "\1\u019e",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01a0",
            "\1\u01a1",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01a6",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\47\u0120\1\u011f\u0083\u0120\1\u0122\uff54\u0120",
            "\47\u0125\1\u0124\u0083\u0125\1\u00e7\uff54\u0125",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01a9",
            "",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01ac",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01af",
            "\1\u01b0",
            "",
            "\1\u01b1",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01b6",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "",
            "",
            "",
            "\1\u01b9",
            "",
            "",
            "\1\u01ba",
            "",
            "",
            "\1\u01bb",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01bd",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u01c7",
            "",
            "",
            "",
            "\1\u01c8",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01ca",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    static class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | RULE_ML_COMMENT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_226 = input.LA(1);

                        s = -1;
                        if ( ((LA47_226>='\u0000' && LA47_226<='&')||(LA47_226>='(' && LA47_226<='\u00AA')||(LA47_226>='\u00AC' && LA47_226<='\uFFFF')) ) {s = 291;}

                        else if ( (LA47_226=='\u00AB') ) {s = 152;}

                        else s = 153;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_46 = input.LA(1);

                        s = -1;
                        if ( (LA47_46=='\'') ) {s = 148;}

                        else if ( ((LA47_46>='\u0000' && LA47_46<='&')||(LA47_46>='(' && LA47_46<='\uFFFF')) ) {s = 149;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_228 = input.LA(1);

                        s = -1;
                        if ( (LA47_228=='\r') ) {s = 229;}

                        else if ( (LA47_228=='\n') ) {s = 230;}

                        else if ( ((LA47_228>='\u0000' && LA47_228<='\t')||(LA47_228>='\u000B' && LA47_228<='\f')||(LA47_228>='\u000E' && LA47_228<='\uFFFF')) ) {s = 228;}

                        else s = 231;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_391 = input.LA(1);

                        s = -1;
                        if ( (LA47_391=='\'') ) {s = 292;}

                        else if ( (LA47_391=='\u00AB') ) {s = 231;}

                        else if ( ((LA47_391>='\u0000' && LA47_391<='&')||(LA47_391>='(' && LA47_391<='\u00AA')||(LA47_391>='\u00AC' && LA47_391<='\uFFFF')) ) {s = 293;}

                        else s = 294;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_346 = input.LA(1);

                        s = -1;
                        if ( (LA47_346=='\'') ) {s = 292;}

                        else if ( (LA47_346=='\u00AB') ) {s = 231;}

                        else if ( ((LA47_346>='\u0000' && LA47_346<='&')||(LA47_346>='(' && LA47_346<='\u00AA')||(LA47_346>='\u00AC' && LA47_346<='\uFFFF')) ) {s = 293;}

                        else s = 294;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_293 = input.LA(1);

                        s = -1;
                        if ( (LA47_293=='\'') ) {s = 292;}

                        else if ( (LA47_293=='\u00AB') ) {s = 231;}

                        else if ( ((LA47_293>='\u0000' && LA47_293<='&')||(LA47_293>='(' && LA47_293<='\u00AA')||(LA47_293>='\u00AC' && LA47_293<='\uFFFF')) ) {s = 293;}

                        else s = 294;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_344 = input.LA(1);

                        s = -1;
                        if ( (LA47_344=='\'') ) {s = 287;}

                        else if ( ((LA47_344>='\u0000' && LA47_344<='&')||(LA47_344>='(' && LA47_344<='\u00AA')||(LA47_344>='\u00AC' && LA47_344<='\uFFFF')) ) {s = 288;}

                        else if ( (LA47_344=='\u00AB') ) {s = 290;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_390 = input.LA(1);

                        s = -1;
                        if ( (LA47_390=='\'') ) {s = 287;}

                        else if ( ((LA47_390>='\u0000' && LA47_390<='&')||(LA47_390>='(' && LA47_390<='\u00AA')||(LA47_390>='\u00AC' && LA47_390<='\uFFFF')) ) {s = 288;}

                        else if ( (LA47_390=='\u00AB') ) {s = 290;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_288 = input.LA(1);

                        s = -1;
                        if ( (LA47_288=='\'') ) {s = 287;}

                        else if ( (LA47_288=='\u00AB') ) {s = 290;}

                        else if ( ((LA47_288>='\u0000' && LA47_288<='&')||(LA47_288>='(' && LA47_288<='\u00AA')||(LA47_288>='\u00AC' && LA47_288<='\uFFFF')) ) {s = 288;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_53 = input.LA(1);

                        s = -1;
                        if ( ((LA47_53>='\u0000' && LA47_53<='\uFFFF')) ) {s = 149;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_343 = input.LA(1);

                        s = -1;
                        if ( ((LA47_343>='\u0000' && LA47_343<='&')||(LA47_343>='(' && LA47_343<='\u00AA')||(LA47_343>='\u00AC' && LA47_343<='\uFFFF')) ) {s = 390;}

                        else if ( (LA47_343=='\u00AB') ) {s = 290;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_287 = input.LA(1);

                        s = -1;
                        if ( (LA47_287=='\'') ) {s = 343;}

                        else if ( ((LA47_287>='\u0000' && LA47_287<='&')||(LA47_287>='(' && LA47_287<='\u00AA')||(LA47_287>='\u00AC' && LA47_287<='\uFFFF')) ) {s = 344;}

                        else if ( (LA47_287=='\u00AB') ) {s = 290;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_150 = input.LA(1);

                        s = -1;
                        if ( (LA47_150=='\'') ) {s = 226;}

                        else if ( ((LA47_150>='\u0000' && LA47_150<='&')||(LA47_150>='(' && LA47_150<='\u00AA')||(LA47_150>='\u00AC' && LA47_150<='\uFFFF')) ) {s = 227;}

                        else if ( (LA47_150=='\u00AB') ) {s = 152;}

                        else s = 153;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA47_225 = input.LA(1);

                        s = -1;
                        if ( (LA47_225=='\'') ) {s = 287;}

                        else if ( ((LA47_225>='\u0000' && LA47_225<='&')||(LA47_225>='(' && LA47_225<='\u00AA')||(LA47_225>='\u00AC' && LA47_225<='\uFFFF')) ) {s = 288;}

                        else if ( (LA47_225=='\u00AB') ) {s = 290;}

                        else s = 289;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA47_292 = input.LA(1);

                        s = -1;
                        if ( (LA47_292=='\'') ) {s = 345;}

                        else if ( ((LA47_292>='\u0000' && LA47_292<='&')||(LA47_292>='(' && LA47_292<='\u00AA')||(LA47_292>='\u00AC' && LA47_292<='\uFFFF')) ) {s = 346;}

                        else if ( (LA47_292=='\u00AB') ) {s = 231;}

                        else s = 294;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA47_154 = input.LA(1);

                        s = -1;
                        if ( ((LA47_154>='\u0000' && LA47_154<='\t')||(LA47_154>='\u000B' && LA47_154<='\f')||(LA47_154>='\u000E' && LA47_154<='\uFFFF')) ) {s = 228;}

                        else if ( (LA47_154=='\r') ) {s = 229;}

                        else if ( (LA47_154=='\n') ) {s = 230;}

                        else s = 231;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA47_230 = input.LA(1);

                        s = -1;
                        if ( (LA47_230=='\'') ) {s = 292;}

                        else if ( ((LA47_230>='\u0000' && LA47_230<='&')||(LA47_230>='(' && LA47_230<='\u00AA')||(LA47_230>='\u00AC' && LA47_230<='\uFFFF')) ) {s = 293;}

                        else if ( (LA47_230=='\u00AB') ) {s = 231;}

                        else s = 294;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA47_151 = input.LA(1);

                        s = -1;
                        if ( (LA47_151=='\'') ) {s = 150;}

                        else if ( ((LA47_151>='\u0000' && LA47_151<='&')||(LA47_151>='(' && LA47_151<='\u00AA')||(LA47_151>='\u00AC' && LA47_151<='\uFFFF')) ) {s = 151;}

                        else if ( (LA47_151=='\u00AB') ) {s = 152;}

                        else s = 153;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA47_47 = input.LA(1);

                        s = -1;
                        if ( (LA47_47=='\'') ) {s = 150;}

                        else if ( ((LA47_47>='\u0000' && LA47_47<='&')||(LA47_47>='(' && LA47_47<='\u00AA')||(LA47_47>='\u00AC' && LA47_47<='\uFFFF')) ) {s = 151;}

                        else if ( (LA47_47=='\u00AB') ) {s = 152;}

                        else s = 153;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA47_291 = input.LA(1);

                        s = -1;
                        if ( (LA47_291=='\'') ) {s = 150;}

                        else if ( ((LA47_291>='\u0000' && LA47_291<='&')||(LA47_291>='(' && LA47_291<='\u00AA')||(LA47_291>='\u00AC' && LA47_291<='\uFFFF')) ) {s = 151;}

                        else if ( (LA47_291=='\u00AB') ) {s = 152;}

                        else s = 153;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA47_227 = input.LA(1);

                        s = -1;
                        if ( (LA47_227=='\'') ) {s = 150;}

                        else if ( (LA47_227=='\u00AB') ) {s = 152;}

                        else if ( ((LA47_227>='\u0000' && LA47_227<='&')||(LA47_227>='(' && LA47_227<='\u00AA')||(LA47_227>='\u00AC' && LA47_227<='\uFFFF')) ) {s = 151;}

                        else s = 153;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA47_345 = input.LA(1);

                        s = -1;
                        if ( ((LA47_345>='\u0000' && LA47_345<='&')||(LA47_345>='(' && LA47_345<='\u00AA')||(LA47_345>='\u00AC' && LA47_345<='\uFFFF')) ) {s = 391;}

                        else if ( (LA47_345=='\u00AB') ) {s = 231;}

                        else s = 294;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA47_0 = input.LA(1);

                        s = -1;
                        if ( (LA47_0=='=') ) {s = 1;}

                        else if ( (LA47_0=='|') ) {s = 2;}

                        else if ( (LA47_0=='&') ) {s = 3;}

                        else if ( (LA47_0=='e') ) {s = 4;}

                        else if ( (LA47_0=='s') ) {s = 5;}

                        else if ( (LA47_0=='f') ) {s = 6;}

                        else if ( (LA47_0==';') ) {s = 7;}

                        else if ( (LA47_0=='t') ) {s = 8;}

                        else if ( (LA47_0=='p') ) {s = 9;}

                        else if ( (LA47_0=='a') ) {s = 10;}

                        else if ( (LA47_0=='d') ) {s = 11;}

                        else if ( (LA47_0=='v') ) {s = 12;}

                        else if ( (LA47_0=='o') ) {s = 13;}

                        else if ( (LA47_0=='c') ) {s = 14;}

                        else if ( (LA47_0=='i') ) {s = 15;}

                        else if ( (LA47_0=='+') ) {s = 16;}

                        else if ( (LA47_0=='-') ) {s = 17;}

                        else if ( (LA47_0=='!') ) {s = 18;}

                        else if ( (LA47_0=='>') ) {s = 19;}

                        else if ( (LA47_0=='<') ) {s = 20;}

                        else if ( (LA47_0=='.') ) {s = 21;}

                        else if ( (LA47_0=='?') ) {s = 22;}

                        else if ( (LA47_0=='*') ) {s = 23;}

                        else if ( (LA47_0=='/') ) {s = 24;}

                        else if ( (LA47_0=='%') ) {s = 25;}

                        else if ( (LA47_0=='{') ) {s = 26;}

                        else if ( (LA47_0=='}') ) {s = 27;}

                        else if ( (LA47_0=='(') ) {s = 28;}

                        else if ( (LA47_0==')') ) {s = 29;}

                        else if ( (LA47_0==',') ) {s = 30;}

                        else if ( (LA47_0=='[') ) {s = 31;}

                        else if ( (LA47_0==']') ) {s = 32;}

                        else if ( (LA47_0=='b') ) {s = 33;}

                        else if ( (LA47_0=='n') ) {s = 34;}

                        else if ( (LA47_0==':') ) {s = 35;}

                        else if ( (LA47_0=='F') ) {s = 36;}

                        else if ( (LA47_0=='E') ) {s = 37;}

                        else if ( (LA47_0=='B') ) {s = 38;}

                        else if ( (LA47_0=='S') ) {s = 39;}

                        else if ( (LA47_0=='A') ) {s = 40;}

                        else if ( (LA47_0=='I') ) {s = 41;}

                        else if ( (LA47_0=='@') ) {s = 42;}

                        else if ( (LA47_0=='#') ) {s = 43;}

                        else if ( (LA47_0=='w') ) {s = 44;}

                        else if ( (LA47_0=='r') ) {s = 45;}

                        else if ( (LA47_0=='\'') ) {s = 46;}

                        else if ( (LA47_0=='\u00BB') ) {s = 47;}

                        else if ( (LA47_0=='\u00AB') ) {s = 48;}

                        else if ( (LA47_0=='0') ) {s = 49;}

                        else if ( ((LA47_0>='1' && LA47_0<='9')) ) {s = 50;}

                        else if ( (LA47_0=='^') ) {s = 51;}

                        else if ( (LA47_0=='$'||(LA47_0>='C' && LA47_0<='D')||(LA47_0>='G' && LA47_0<='H')||(LA47_0>='J' && LA47_0<='R')||(LA47_0>='T' && LA47_0<='Z')||LA47_0=='_'||(LA47_0>='g' && LA47_0<='h')||(LA47_0>='j' && LA47_0<='m')||LA47_0=='q'||LA47_0=='u'||(LA47_0>='x' && LA47_0<='z')) ) {s = 52;}

                        else if ( (LA47_0=='\"') ) {s = 53;}

                        else if ( ((LA47_0>='\t' && LA47_0<='\n')||LA47_0=='\r'||LA47_0==' ') ) {s = 54;}

                        else if ( ((LA47_0>='\u0000' && LA47_0<='\b')||(LA47_0>='\u000B' && LA47_0<='\f')||(LA47_0>='\u000E' && LA47_0<='\u001F')||LA47_0=='\\'||LA47_0=='`'||(LA47_0>='~' && LA47_0<='\u00AA')||(LA47_0>='\u00AC' && LA47_0<='\u00BA')||(LA47_0>='\u00BC' && LA47_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}