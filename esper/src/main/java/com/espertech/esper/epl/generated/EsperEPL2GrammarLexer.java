// $ANTLR 3.2 Sep 23, 2009 12:02:23 EsperEPL2Grammar.g 2012-01-10 20:19:49

  package com.espertech.esper.epl.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class EsperEPL2GrammarLexer extends Lexer {
    public static final int CRONTAB_LIMIT_EXPR=192;
    public static final int FLOAT_SUFFIX=375;
    public static final int STAR=319;
    public static final int DOT_EXPR=202;
    public static final int NUMERIC_PARAM_LIST=130;
    public static final int ISTREAM=60;
    public static final int MOD=336;
    public static final int OUTERJOIN_EXPR=174;
    public static final int LIB_FUNC_CHAIN=201;
    public static final int CREATE_COL_TYPE_LIST=255;
    public static final int MONTH_PART=207;
    public static final int MERGE_INS=274;
    public static final int BSR=358;
    public static final int LIB_FUNCTION=200;
    public static final int EOF=-1;
    public static final int TIMEPERIOD_MILLISECONDS=105;
    public static final int FULL_OUTERJOIN_EXPR=178;
    public static final int CREATE_CTX_NESTED=285;
    public static final int CREATE_CTX_FIXED=279;
    public static final int MATCHREC_PATTERN_CONCAT=298;
    public static final int INC=351;
    public static final int LNOT=347;
    public static final int RPAREN=311;
    public static final int CREATE=4;
    public static final int STRING_LITERAL=323;
    public static final int BSR_ASSIGN=359;
    public static final int CAST_EXPR=234;
    public static final int MATCHES=116;
    public static final int USING=120;
    public static final int STREAM_EXPR=173;
    public static final int TIMEPERIOD_SECONDS=102;
    public static final int NOT_EQUAL=328;
    public static final int METADATASQL=68;
    public static final int EVENT_FILTER_PROPERTY_EXPR=139;
    public static final int LAST_AGGREG=262;
    public static final int GOES=315;
    public static final int REGEXP=9;
    public static final int MATCHED=122;
    public static final int INITIATED=127;
    public static final int FOLLOWED_BY_EXPR=133;
    public static final int NEWKW=124;
    public static final int HOUR_PART=210;
    public static final int FOLLOWED_BY=338;
    public static final int MATCH_UNTIL_RANGE_CLOSED=253;
    public static final int MATCHREC_PATTERN_NESTED=300;
    public static final int RBRACK=308;
    public static final int GE=332;
    public static final int METHOD_JOIN_EXPR=249;
    public static final int ASC=57;
    public static final int IN_SET=6;
    public static final int CREATE_CTX_PART=280;
    public static final int EVENT_FILTER_EXPR=138;
    public static final int PATTERN_EVERY_DISTINCT_EXPR=137;
    public static final int CREATE_CTX_COAL=281;
    public static final int ELSE=30;
    public static final int MINUS_ASSIGN=352;
    public static final int EVENT_FILTER_NOT_IN=149;
    public static final int INSERTINTO_STREAM_NAME=222;
    public static final int NUM_DOUBLE=294;
    public static final int TIMEPERIOD_MILLISEC=103;
    public static final int UNARY_MINUS=203;
    public static final int LCURLY=313;
    public static final int RETAINUNION=64;
    public static final int DBWHERE_CLAUSE=220;
    public static final int MEDIAN=23;
    public static final int EVENTS=51;
    public static final int AND_EXPR=12;
    public static final int EVENT_FILTER_NOT_RANGE=147;
    public static final int GROUP=44;
    public static final int WS=367;
    public static final int SUBSELECT_GROUP_EXPR=226;
    public static final int FOLLOWED_BY_ITEM=134;
    public static final int YEAR_PART=206;
    public static final int ON_SELECT_INSERT_EXPR=244;
    public static final int TYPEOF=78;
    public static final int ESCAPECHAR=342;
    public static final int EXPRCOL=197;
    public static final int SL_COMMENT=368;
    public static final int NULL_TYPE=293;
    public static final int MATCH_UNTIL_RANGE_HALFOPEN=251;
    public static final int GT=330;
    public static final int BNOT=348;
    public static final int EVAL_IS_EXPR=165;
    public static final int WHERE_EXPR=158;
    public static final int END=33;
    public static final int INNERJOIN_EXPR=175;
    public static final int LAND=365;
    public static final int TERM_LIMIT_EXPR=195;
    public static final int NOT_REGEXP=217;
    public static final int MATCH_UNTIL_EXPR=250;
    public static final int EVENT_PROP_EXPR=182;
    public static final int LBRACK=307;
    public static final int MERGE_UPD=273;
    public static final int VIEW_EXPR=155;
    public static final int ANNOTATION=258;
    public static final int LONG_TYPE=288;
    public static final int EVENT_FILTER_PROPERTY_EXPR_ATOM=140;
    public static final int MATCHREC_PATTERN=296;
    public static final int ON_MERGE_EXPR=243;
    public static final int ATCHAR=341;
    public static final int TIMEPERIOD_SEC=100;
    public static final int TICKED_STRING_LITERAL=343;
    public static final int ON_SELECT_EXPR=241;
    public static final int MINUTE_PART=211;
    public static final int PATTERN_NOT_EXPR=136;
    public static final int SQL_NE=327;
    public static final int SUM=18;
    public static final int HexDigit=373;
    public static final int UPDATE_EXPR=265;
    public static final int LPAREN=310;
    public static final int IN_SUBSELECT_EXPR=228;
    public static final int AT=86;
    public static final int AS=17;
    public static final int OR_EXPR=11;
    public static final int BOOLEAN_TRUE=106;
    public static final int THEN=32;
    public static final int MATCHREC_INTERVAL=302;
    public static final int NOT_IN_RANGE=224;
    public static final int TIMEPERIOD_MONTH=90;
    public static final int OFFSET=110;
    public static final int AVG=19;
    public static final int LEFT=38;
    public static final int SECOND_PART=212;
    public static final int PREVIOUS=69;
    public static final int PREVIOUSWINDOW=72;
    public static final int MATCH_RECOGNIZE=112;
    public static final int PARTITIONITEM=286;
    public static final int IDENT=309;
    public static final int DATABASE_JOIN_EXPR=157;
    public static final int BXOR=326;
    public static final int PLUS=321;
    public static final int CASE2=29;
    public static final int MERGE_MAT=272;
    public static final int TIMEPERIOD_DAY=94;
    public static final int CREATE_SCHEMA_EXPR=267;
    public static final int EXISTS=74;
    public static final int EVENT_PROP_INDEXED=185;
    public static final int CREATE_INDEX_EXPR=235;
    public static final int TIMEPERIOD_MILLISECOND=104;
    public static final int ACCESS_AGG=264;
    public static final int CREATE_CTX_CATITEM=284;
    public static final int EVAL_NOTEQUALS_EXPR=164;
    public static final int MATCH_UNTIL_RANGE_HALFCLOSED=252;
    public static final int CREATE_VARIABLE_EXPR=248;
    public static final int LIKE=8;
    public static final int OUTER=35;
    public static final int MATCHREC_DEFINE=303;
    public static final int BY=43;
    public static final int RIGHT_OUTERJOIN_EXPR=177;
    public static final int NUMBERSETSTAR=257;
    public static final int LAST_OPERATOR=231;
    public static final int PATTERN_FILTER_EXPR=135;
    public static final int MERGE=121;
    public static final int FOLLOWMAX_END=340;
    public static final int MERGE_UNM=271;
    public static final int EVAL_AND_EXPR=161;
    public static final int LEFT_OUTERJOIN_EXPR=176;
    public static final int EPL_EXPR=295;
    public static final int GROUP_BY_EXPR=179;
    public static final int SET=83;
    public static final int RIGHT=39;
    public static final int HAVING=45;
    public static final int INSTANCEOF=77;
    public static final int MIN=21;
    public static final int EVENT_PROP_SIMPLE=183;
    public static final int MINUS=334;
    public static final int SEMI=366;
    public static final int INDEXCOL=198;
    public static final int STAR_ASSIGN=354;
    public static final int PREVIOUSCOUNT=71;
    public static final int VARIANT_LIST=270;
    public static final int FIRST_AGGREG=261;
    public static final int COLON=312;
    public static final int EVAL_EQUALS_GROUP_EXPR=167;
    public static final int BAND_ASSIGN=364;
    public static final int PREVIOUSTAIL=70;
    public static final int SCHEMA=62;
    public static final int CRONTAB_LIMIT_EXPR_PARAM=193;
    public static final int NOT_IN_SET=214;
    public static final int VALUE_NULL=108;
    public static final int EVENT_PROP_DYNAMIC_SIMPLE=186;
    public static final int SL=360;
    public static final int NOT_IN_SUBSELECT_EXPR=229;
    public static final int WHEN=31;
    public static final int GUARD_EXPR=153;
    public static final int RCURLY=314;
    public static final int SR=356;
    public static final int PLUS_ASSIGN=350;
    public static final int DAY_PART=209;
    public static final int EXISTS_SUBSELECT_EXPR=227;
    public static final int START=125;
    public static final int EVENT_FILTER_IN=148;
    public static final int DIV=335;
    public static final int OBJECT_PARAM_ORDERED_EXPR=132;
    public static final int EXPRESSIONDECL=123;
    public static final int WEEK_PART=208;
    public static final int BETWEEN=7;
    public static final int MILLISECOND_PART=213;
    public static final int OctalEscape=372;
    public static final int ROW_LIMIT_EXPR=109;
    public static final int FIRST=52;
    public static final int PRIOR=73;
    public static final int SELECTION_EXPR=170;
    public static final int LW=76;
    public static final int CAST=79;
    public static final int LOR=333;
    public static final int WILDCARD_SELECT=221;
    public static final int LT=329;
    public static final int EXPONENT=374;
    public static final int PATTERN_INCL_EXPR=156;
    public static final int CREATE_CTX=278;
    public static final int WHILE=119;
    public static final int ORDER_BY_EXPR=180;
    public static final int NEW_ITEM=276;
    public static final int BOOL_TYPE=292;
    public static final int ANNOTATION_ARRAY=259;
    public static final int MOD_ASSIGN=355;
    public static final int CASE=28;
    public static final int IN_SUBSELECT_QUERY_EXPR=230;
    public static final int COUNT=26;
    public static final int EQUALS=317;
    public static final int RETAININTERSECTION=65;
    public static final int TERMINATED=128;
    public static final int WINDOW_AGGREG=263;
    public static final int DIV_ASSIGN=349;
    public static final int SL_ASSIGN=361;
    public static final int TIMEPERIOD_WEEKS=93;
    public static final int PATTERN=66;
    public static final int CREATE_CTX_INIT=283;
    public static final int SQL=67;
    public static final int FULL=40;
    public static final int WEEKDAY=75;
    public static final int MATCHREC_AFTER_SKIP=301;
    public static final int ESCAPE=10;
    public static final int INSERT=54;
    public static final int ON_UPDATE_EXPR=242;
    public static final int ARRAY_EXPR=205;
    public static final int CREATE_COL_TYPE=256;
    public static final int LAST=53;
    public static final int BOOLEAN_FALSE=107;
    public static final int EVAL_NOTEQUALS_GROUP_EXPR=168;
    public static final int SELECT=27;
    public static final int INTO=55;
    public static final int EVAL_ISNOT_EXPR=166;
    public static final int EVENT_FILTER_BETWEEN=150;
    public static final int TIMEPERIOD_SECOND=101;
    public static final int COALESCE=22;
    public static final int FLOAT_TYPE=289;
    public static final int SUBSELECT_EXPR=225;
    public static final int ANNOTATION_VALUE=260;
    public static final int NUMERIC_PARAM_RANGE=129;
    public static final int CONCAT=199;
    public static final int CLASS_IDENT=152;
    public static final int MATCHREC_PATTERN_ALTER=299;
    public static final int ON_EXPR=238;
    public static final int CREATE_WINDOW_EXPR=236;
    public static final int PROPERTY_SELECTION_STREAM=142;
    public static final int ON_DELETE_EXPR=240;
    public static final int ON=41;
    public static final int NUM_LONG=344;
    public static final int TIME_PERIOD=204;
    public static final int DOUBLE_TYPE=290;
    public static final int DELETE=81;
    public static final int INT_TYPE=287;
    public static final int EVAL_BITWISE_EXPR=160;
    public static final int EVERY_EXPR=14;
    public static final int ORDER_ELEMENT_EXPR=181;
    public static final int TIMEPERIOD_HOURS=97;
    public static final int VARIABLE=84;
    public static final int SUBSTITUTION=233;
    public static final int UNTIL=85;
    public static final int STRING_TYPE=291;
    public static final int ON_SET_EXPR=247;
    public static final int MATCHREC_DEFINE_ITEM=304;
    public static final int NUM_INT=337;
    public static final int STDDEV=24;
    public static final int ON_EXPR_FROM=246;
    public static final int NUM_FLOAT=345;
    public static final int FROM=34;
    public static final int DISTINCT=46;
    public static final int PROPERTY_SELECTION_ELEMENT_EXPR=141;
    public static final int OUTPUT=50;
    public static final int EscapeSequence=370;
    public static final int WEEKDAY_OPERATOR=232;
    public static final int WHERE=16;
    public static final int DEC=353;
    public static final int INNER=36;
    public static final int NUMERIC_PARAM_FREQUENCY=131;
    public static final int BXOR_ASSIGN=362;
    public static final int ORDER=56;
    public static final int SNAPSHOT=82;
    public static final int AFTER_LIMIT_EXPR=191;
    public static final int EVENT_FILTER_PARAM=145;
    public static final int EVENT_PROP_DYNAMIC_MAPPED=188;
    public static final int IRSTREAM=61;
    public static final int UPDATE=111;
    public static final int MAX=20;
    public static final int FOR=118;
    public static final int ON_STREAM=239;
    public static final int DEFINE=114;
    public static final int TIMEPERIOD_YEARS=89;
    public static final int CONTEXT=126;
    public static final int TIMEPERIOD_DAYS=95;
    public static final int EVENT_FILTER_RANGE=146;
    public static final int INDEX=87;
    public static final int ML_COMMENT=369;
    public static final int CREATE_CTX_CAT=282;
    public static final int EVENT_PROP_DYNAMIC_INDEXED=187;
    public static final int BOR_ASSIGN=363;
    public static final int COMMA=316;
    public static final int PARTITION=115;
    public static final int IS=42;
    public static final int WHEN_LIMIT_EXPR=194;
    public static final int TIMEPERIOD_LIMIT_EXPR=190;
    public static final int SOME=49;
    public static final int TIMEPERIOD_HOUR=96;
    public static final int ALL=47;
    public static final int MATCHREC_MEASURE_ITEM=306;
    public static final int BOR=320;
    public static final int EQUAL=346;
    public static final int CREATE_SCHEMA_EXPR_VAR=269;
    public static final int EVENT_FILTER_NOT_BETWEEN=151;
    public static final int IN_RANGE=223;
    public static final int DOT=318;
    public static final int CURRENT_TIMESTAMP=80;
    public static final int MATCHREC_MEASURES=305;
    public static final int TIMEPERIOD_WEEK=92;
    public static final int EVERY_DISTINCT_EXPR=15;
    public static final int PROPERTY_WILDCARD_SELECT=143;
    public static final int INSERTINTO_EXPR=196;
    public static final int HAVING_EXPR=159;
    public static final int UNIDIRECTIONAL=63;
    public static final int MATCH_UNTIL_RANGE_BOUNDED=254;
    public static final int MERGE_DEL=275;
    public static final int EVAL_EQUALS_EXPR=163;
    public static final int TIMEPERIOD_MINUTES=99;
    public static final int RSTREAM=59;
    public static final int NOT_LIKE=216;
    public static final int EVENT_LIMIT_EXPR=189;
    public static final int TIMEPERIOD_MINUTE=98;
    public static final int NOT_BETWEEN=215;
    public static final int EVAL_OR_EXPR=162;
    public static final int ON_SELECT_INSERT_OUTPUT=245;
    public static final int AFTER=117;
    public static final int MEASURES=113;
    public static final int AGG_FILTER_EXPR=277;
    public static final int MATCHREC_PATTERN_ATOM=297;
    public static final int BAND=325;
    public static final int QUOTED_STRING_LITERAL=324;
    public static final int JOIN=37;
    public static final int ANY=48;
    public static final int NOT_EXPR=13;
    public static final int QUESTION=322;
    public static final int OBSERVER_EXPR=154;
    public static final int EVENT_FILTER_IDENT=144;
    public static final int CREATE_SCHEMA_EXPR_QUAL=268;
    public static final int EVENT_PROP_MAPPED=184;
    public static final int UnicodeEscape=371;
    public static final int TIMEPERIOD_YEAR=88;
    public static final int AVEDEV=25;
    public static final int DBSELECT_EXPR=218;
    public static final int TIMEPERIOD_MONTHS=91;
    public static final int FOLLOWMAX_BEGIN=339;
    public static final int SELECTION_ELEMENT_EXPR=171;
    public static final int CREATE_WINDOW_SELECT_EXPR=237;
    public static final int WINDOW=5;
    public static final int ON_SET_EXPR_ITEM=266;
    public static final int DESC=58;
    public static final int SELECTION_STREAM=172;
    public static final int SR_ASSIGN=357;
    public static final int DBFROM_CLAUSE=219;
    public static final int LE=331;
    public static final int EVAL_IDENT=169;

      protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);  
      }

      public void recoverFromMismatchedToken(IntStream intStream, RecognitionException recognitionException, int i, BitSet bitSet) throws RecognitionException {
        throw recognitionException;
      }

      public Object recoverFromMismatchedSet(IntStream intStream, RecognitionException recognitionException, BitSet bitSet) throws RecognitionException {
        throw recognitionException;
      }

      protected boolean recoverFromMismatchedElement(IntStream intStream, RecognitionException recognitionException, BitSet bitSet) {
        throw new RuntimeException("Error recovering from mismatched element", recognitionException);
      }
      
      public String getErrorMessage(RecognitionException e, String[] tokenNames) {
        if(e instanceof EarlyExitException)
            {
                throw new RuntimeException(e);
            }
        return super.getErrorMessage(e, tokenNames);
      }


    // delegates
    // delegators

    public EsperEPL2GrammarLexer() {;} 
    public EsperEPL2GrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EsperEPL2GrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "EsperEPL2Grammar.g"; }

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:32:8: ( 'create' )
            // EsperEPL2Grammar.g:32:10: 'create'
            {
            match("create"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "WINDOW"
    public final void mWINDOW() throws RecognitionException {
        try {
            int _type = WINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:33:8: ( 'window' )
            // EsperEPL2Grammar.g:33:10: 'window'
            {
            match("window"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WINDOW"

    // $ANTLR start "IN_SET"
    public final void mIN_SET() throws RecognitionException {
        try {
            int _type = IN_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:34:8: ( 'in' )
            // EsperEPL2Grammar.g:34:10: 'in'
            {
            match("in"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN_SET"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:35:9: ( 'between' )
            // EsperEPL2Grammar.g:35:11: 'between'
            {
            match("between"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:36:6: ( 'like' )
            // EsperEPL2Grammar.g:36:8: 'like'
            {
            match("like"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "REGEXP"
    public final void mREGEXP() throws RecognitionException {
        try {
            int _type = REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:37:8: ( 'regexp' )
            // EsperEPL2Grammar.g:37:10: 'regexp'
            {
            match("regexp"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:38:8: ( 'escape' )
            // EsperEPL2Grammar.g:38:10: 'escape'
            {
            match("escape"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "OR_EXPR"
    public final void mOR_EXPR() throws RecognitionException {
        try {
            int _type = OR_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:39:9: ( 'or' )
            // EsperEPL2Grammar.g:39:11: 'or'
            {
            match("or"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR_EXPR"

    // $ANTLR start "AND_EXPR"
    public final void mAND_EXPR() throws RecognitionException {
        try {
            int _type = AND_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:40:10: ( 'and' )
            // EsperEPL2Grammar.g:40:12: 'and'
            {
            match("and"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND_EXPR"

    // $ANTLR start "NOT_EXPR"
    public final void mNOT_EXPR() throws RecognitionException {
        try {
            int _type = NOT_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:41:10: ( 'not' )
            // EsperEPL2Grammar.g:41:12: 'not'
            {
            match("not"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EXPR"

    // $ANTLR start "EVERY_EXPR"
    public final void mEVERY_EXPR() throws RecognitionException {
        try {
            int _type = EVERY_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:42:12: ( 'every' )
            // EsperEPL2Grammar.g:42:14: 'every'
            {
            match("every"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVERY_EXPR"

    // $ANTLR start "EVERY_DISTINCT_EXPR"
    public final void mEVERY_DISTINCT_EXPR() throws RecognitionException {
        try {
            int _type = EVERY_DISTINCT_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:43:21: ( 'every-distinct' )
            // EsperEPL2Grammar.g:43:23: 'every-distinct'
            {
            match("every-distinct"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVERY_DISTINCT_EXPR"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:44:7: ( 'where' )
            // EsperEPL2Grammar.g:44:9: 'where'
            {
            match("where"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:45:4: ( 'as' )
            // EsperEPL2Grammar.g:45:6: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:46:5: ( 'sum' )
            // EsperEPL2Grammar.g:46:7: 'sum'
            {
            match("sum"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:47:5: ( 'avg' )
            // EsperEPL2Grammar.g:47:7: 'avg'
            {
            match("avg"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:48:5: ( 'max' )
            // EsperEPL2Grammar.g:48:7: 'max'
            {
            match("max"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:49:5: ( 'min' )
            // EsperEPL2Grammar.g:49:7: 'min'
            {
            match("min"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "COALESCE"
    public final void mCOALESCE() throws RecognitionException {
        try {
            int _type = COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:50:10: ( 'coalesce' )
            // EsperEPL2Grammar.g:50:12: 'coalesce'
            {
            match("coalesce"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COALESCE"

    // $ANTLR start "MEDIAN"
    public final void mMEDIAN() throws RecognitionException {
        try {
            int _type = MEDIAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:51:8: ( 'median' )
            // EsperEPL2Grammar.g:51:10: 'median'
            {
            match("median"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEDIAN"

    // $ANTLR start "STDDEV"
    public final void mSTDDEV() throws RecognitionException {
        try {
            int _type = STDDEV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:52:8: ( 'stddev' )
            // EsperEPL2Grammar.g:52:10: 'stddev'
            {
            match("stddev"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STDDEV"

    // $ANTLR start "AVEDEV"
    public final void mAVEDEV() throws RecognitionException {
        try {
            int _type = AVEDEV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:53:8: ( 'avedev' )
            // EsperEPL2Grammar.g:53:10: 'avedev'
            {
            match("avedev"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVEDEV"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:54:7: ( 'count' )
            // EsperEPL2Grammar.g:54:9: 'count'
            {
            match("count"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:55:8: ( 'select' )
            // EsperEPL2Grammar.g:55:10: 'select'
            {
            match("select"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:56:6: ( 'case' )
            // EsperEPL2Grammar.g:56:8: 'case'
            {
            match("case"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:57:6: ( 'else' )
            // EsperEPL2Grammar.g:57:8: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:58:6: ( 'when' )
            // EsperEPL2Grammar.g:58:8: 'when'
            {
            match("when"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:59:6: ( 'then' )
            // EsperEPL2Grammar.g:59:8: 'then'
            {
            match("then"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:60:5: ( 'end' )
            // EsperEPL2Grammar.g:60:7: 'end'
            {
            match("end"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:61:6: ( 'from' )
            // EsperEPL2Grammar.g:61:8: 'from'
            {
            match("from"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:62:7: ( 'outer' )
            // EsperEPL2Grammar.g:62:9: 'outer'
            {
            match("outer"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUTER"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:63:7: ( 'inner' )
            // EsperEPL2Grammar.g:63:9: 'inner'
            {
            match("inner"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:64:6: ( 'join' )
            // EsperEPL2Grammar.g:64:8: 'join'
            {
            match("join"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:65:6: ( 'left' )
            // EsperEPL2Grammar.g:65:8: 'left'
            {
            match("left"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:66:7: ( 'right' )
            // EsperEPL2Grammar.g:66:9: 'right'
            {
            match("right"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:67:6: ( 'full' )
            // EsperEPL2Grammar.g:67:8: 'full'
            {
            match("full"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULL"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:68:4: ( 'on' )
            // EsperEPL2Grammar.g:68:6: 'on'
            {
            match("on"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:69:4: ( 'is' )
            // EsperEPL2Grammar.g:69:6: 'is'
            {
            match("is"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:70:4: ( 'by' )
            // EsperEPL2Grammar.g:70:6: 'by'
            {
            match("by"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:71:7: ( 'group' )
            // EsperEPL2Grammar.g:71:9: 'group'
            {
            match("group"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:72:8: ( 'having' )
            // EsperEPL2Grammar.g:72:10: 'having'
            {
            match("having"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:73:10: ( 'distinct' )
            // EsperEPL2Grammar.g:73:12: 'distinct'
            {
            match("distinct"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:74:5: ( 'all' )
            // EsperEPL2Grammar.g:74:7: 'all'
            {
            match("all"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:75:5: ( 'any' )
            // EsperEPL2Grammar.g:75:7: 'any'
            {
            match("any"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY"

    // $ANTLR start "SOME"
    public final void mSOME() throws RecognitionException {
        try {
            int _type = SOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:76:6: ( 'some' )
            // EsperEPL2Grammar.g:76:8: 'some'
            {
            match("some"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOME"

    // $ANTLR start "OUTPUT"
    public final void mOUTPUT() throws RecognitionException {
        try {
            int _type = OUTPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:77:8: ( 'output' )
            // EsperEPL2Grammar.g:77:10: 'output'
            {
            match("output"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUTPUT"

    // $ANTLR start "EVENTS"
    public final void mEVENTS() throws RecognitionException {
        try {
            int _type = EVENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:78:8: ( 'events' )
            // EsperEPL2Grammar.g:78:10: 'events'
            {
            match("events"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVENTS"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:79:7: ( 'first' )
            // EsperEPL2Grammar.g:79:9: 'first'
            {
            match("first"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "LAST"
    public final void mLAST() throws RecognitionException {
        try {
            int _type = LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:80:6: ( 'last' )
            // EsperEPL2Grammar.g:80:8: 'last'
            {
            match("last"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAST"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:81:8: ( 'insert' )
            // EsperEPL2Grammar.g:81:10: 'insert'
            {
            match("insert"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:82:6: ( 'into' )
            // EsperEPL2Grammar.g:82:8: 'into'
            {
            match("into"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:83:7: ( 'order' )
            // EsperEPL2Grammar.g:83:9: 'order'
            {
            match("order"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:84:5: ( 'asc' )
            // EsperEPL2Grammar.g:84:7: 'asc'
            {
            match("asc"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:85:6: ( 'desc' )
            // EsperEPL2Grammar.g:85:8: 'desc'
            {
            match("desc"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "RSTREAM"
    public final void mRSTREAM() throws RecognitionException {
        try {
            int _type = RSTREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:86:9: ( 'rstream' )
            // EsperEPL2Grammar.g:86:11: 'rstream'
            {
            match("rstream"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSTREAM"

    // $ANTLR start "ISTREAM"
    public final void mISTREAM() throws RecognitionException {
        try {
            int _type = ISTREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:87:9: ( 'istream' )
            // EsperEPL2Grammar.g:87:11: 'istream'
            {
            match("istream"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISTREAM"

    // $ANTLR start "IRSTREAM"
    public final void mIRSTREAM() throws RecognitionException {
        try {
            int _type = IRSTREAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:88:10: ( 'irstream' )
            // EsperEPL2Grammar.g:88:12: 'irstream'
            {
            match("irstream"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IRSTREAM"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:89:8: ( 'schema' )
            // EsperEPL2Grammar.g:89:10: 'schema'
            {
            match("schema"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "UNIDIRECTIONAL"
    public final void mUNIDIRECTIONAL() throws RecognitionException {
        try {
            int _type = UNIDIRECTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:90:16: ( 'unidirectional' )
            // EsperEPL2Grammar.g:90:18: 'unidirectional'
            {
            match("unidirectional"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIDIRECTIONAL"

    // $ANTLR start "RETAINUNION"
    public final void mRETAINUNION() throws RecognitionException {
        try {
            int _type = RETAINUNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:91:13: ( 'retain-union' )
            // EsperEPL2Grammar.g:91:15: 'retain-union'
            {
            match("retain-union"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETAINUNION"

    // $ANTLR start "RETAININTERSECTION"
    public final void mRETAININTERSECTION() throws RecognitionException {
        try {
            int _type = RETAININTERSECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:92:20: ( 'retain-intersection' )
            // EsperEPL2Grammar.g:92:22: 'retain-intersection'
            {
            match("retain-intersection"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETAININTERSECTION"

    // $ANTLR start "PATTERN"
    public final void mPATTERN() throws RecognitionException {
        try {
            int _type = PATTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:93:9: ( 'pattern' )
            // EsperEPL2Grammar.g:93:11: 'pattern'
            {
            match("pattern"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATTERN"

    // $ANTLR start "SQL"
    public final void mSQL() throws RecognitionException {
        try {
            int _type = SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:94:5: ( 'sql' )
            // EsperEPL2Grammar.g:94:7: 'sql'
            {
            match("sql"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL"

    // $ANTLR start "METADATASQL"
    public final void mMETADATASQL() throws RecognitionException {
        try {
            int _type = METADATASQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:95:13: ( 'metadatasql' )
            // EsperEPL2Grammar.g:95:15: 'metadatasql'
            {
            match("metadatasql"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "METADATASQL"

    // $ANTLR start "PREVIOUS"
    public final void mPREVIOUS() throws RecognitionException {
        try {
            int _type = PREVIOUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:96:10: ( 'prev' )
            // EsperEPL2Grammar.g:96:12: 'prev'
            {
            match("prev"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREVIOUS"

    // $ANTLR start "PREVIOUSTAIL"
    public final void mPREVIOUSTAIL() throws RecognitionException {
        try {
            int _type = PREVIOUSTAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:97:14: ( 'prevtail' )
            // EsperEPL2Grammar.g:97:16: 'prevtail'
            {
            match("prevtail"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREVIOUSTAIL"

    // $ANTLR start "PREVIOUSCOUNT"
    public final void mPREVIOUSCOUNT() throws RecognitionException {
        try {
            int _type = PREVIOUSCOUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:98:15: ( 'prevcount' )
            // EsperEPL2Grammar.g:98:17: 'prevcount'
            {
            match("prevcount"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREVIOUSCOUNT"

    // $ANTLR start "PREVIOUSWINDOW"
    public final void mPREVIOUSWINDOW() throws RecognitionException {
        try {
            int _type = PREVIOUSWINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:99:16: ( 'prevwindow' )
            // EsperEPL2Grammar.g:99:18: 'prevwindow'
            {
            match("prevwindow"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREVIOUSWINDOW"

    // $ANTLR start "PRIOR"
    public final void mPRIOR() throws RecognitionException {
        try {
            int _type = PRIOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:100:7: ( 'prior' )
            // EsperEPL2Grammar.g:100:9: 'prior'
            {
            match("prior"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIOR"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:101:8: ( 'exists' )
            // EsperEPL2Grammar.g:101:10: 'exists'
            {
            match("exists"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "WEEKDAY"
    public final void mWEEKDAY() throws RecognitionException {
        try {
            int _type = WEEKDAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:102:9: ( 'weekday' )
            // EsperEPL2Grammar.g:102:11: 'weekday'
            {
            match("weekday"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WEEKDAY"

    // $ANTLR start "LW"
    public final void mLW() throws RecognitionException {
        try {
            int _type = LW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:103:4: ( 'lastweekday' )
            // EsperEPL2Grammar.g:103:6: 'lastweekday'
            {
            match("lastweekday"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LW"

    // $ANTLR start "INSTANCEOF"
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:104:12: ( 'instanceof' )
            // EsperEPL2Grammar.g:104:14: 'instanceof'
            {
            match("instanceof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTANCEOF"

    // $ANTLR start "TYPEOF"
    public final void mTYPEOF() throws RecognitionException {
        try {
            int _type = TYPEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:105:8: ( 'typeof' )
            // EsperEPL2Grammar.g:105:10: 'typeof'
            {
            match("typeof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPEOF"

    // $ANTLR start "CAST"
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:106:6: ( 'cast' )
            // EsperEPL2Grammar.g:106:8: 'cast'
            {
            match("cast"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAST"

    // $ANTLR start "CURRENT_TIMESTAMP"
    public final void mCURRENT_TIMESTAMP() throws RecognitionException {
        try {
            int _type = CURRENT_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:107:19: ( 'current_timestamp' )
            // EsperEPL2Grammar.g:107:21: 'current_timestamp'
            {
            match("current_timestamp"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_TIMESTAMP"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:108:8: ( 'delete' )
            // EsperEPL2Grammar.g:108:10: 'delete'
            {
            match("delete"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "SNAPSHOT"
    public final void mSNAPSHOT() throws RecognitionException {
        try {
            int _type = SNAPSHOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:109:10: ( 'snapshot' )
            // EsperEPL2Grammar.g:109:12: 'snapshot'
            {
            match("snapshot"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SNAPSHOT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:110:5: ( 'set' )
            // EsperEPL2Grammar.g:110:7: 'set'
            {
            match("set"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:111:10: ( 'variable' )
            // EsperEPL2Grammar.g:111:12: 'variable'
            {
            match("variable"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:112:7: ( 'until' )
            // EsperEPL2Grammar.g:112:9: 'until'
            {
            match("until"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:113:4: ( 'at' )
            // EsperEPL2Grammar.g:113:6: 'at'
            {
            match("at"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:114:7: ( 'index' )
            // EsperEPL2Grammar.g:114:9: 'index'
            {
            match("index"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "TIMEPERIOD_YEAR"
    public final void mTIMEPERIOD_YEAR() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:115:17: ( 'year' )
            // EsperEPL2Grammar.g:115:19: 'year'
            {
            match("year"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_YEAR"

    // $ANTLR start "TIMEPERIOD_YEARS"
    public final void mTIMEPERIOD_YEARS() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_YEARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:116:18: ( 'years' )
            // EsperEPL2Grammar.g:116:20: 'years'
            {
            match("years"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_YEARS"

    // $ANTLR start "TIMEPERIOD_MONTH"
    public final void mTIMEPERIOD_MONTH() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:117:18: ( 'month' )
            // EsperEPL2Grammar.g:117:20: 'month'
            {
            match("month"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_MONTH"

    // $ANTLR start "TIMEPERIOD_MONTHS"
    public final void mTIMEPERIOD_MONTHS() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_MONTHS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:118:19: ( 'months' )
            // EsperEPL2Grammar.g:118:21: 'months'
            {
            match("months"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_MONTHS"

    // $ANTLR start "TIMEPERIOD_WEEK"
    public final void mTIMEPERIOD_WEEK() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_WEEK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:119:17: ( 'week' )
            // EsperEPL2Grammar.g:119:19: 'week'
            {
            match("week"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_WEEK"

    // $ANTLR start "TIMEPERIOD_WEEKS"
    public final void mTIMEPERIOD_WEEKS() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_WEEKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:120:18: ( 'weeks' )
            // EsperEPL2Grammar.g:120:20: 'weeks'
            {
            match("weeks"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_WEEKS"

    // $ANTLR start "TIMEPERIOD_DAY"
    public final void mTIMEPERIOD_DAY() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:121:16: ( 'day' )
            // EsperEPL2Grammar.g:121:18: 'day'
            {
            match("day"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_DAY"

    // $ANTLR start "TIMEPERIOD_DAYS"
    public final void mTIMEPERIOD_DAYS() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_DAYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:122:17: ( 'days' )
            // EsperEPL2Grammar.g:122:19: 'days'
            {
            match("days"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_DAYS"

    // $ANTLR start "TIMEPERIOD_HOUR"
    public final void mTIMEPERIOD_HOUR() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:123:17: ( 'hour' )
            // EsperEPL2Grammar.g:123:19: 'hour'
            {
            match("hour"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_HOUR"

    // $ANTLR start "TIMEPERIOD_HOURS"
    public final void mTIMEPERIOD_HOURS() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_HOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:124:18: ( 'hours' )
            // EsperEPL2Grammar.g:124:20: 'hours'
            {
            match("hours"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_HOURS"

    // $ANTLR start "TIMEPERIOD_MINUTE"
    public final void mTIMEPERIOD_MINUTE() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_MINUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:125:19: ( 'minute' )
            // EsperEPL2Grammar.g:125:21: 'minute'
            {
            match("minute"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_MINUTE"

    // $ANTLR start "TIMEPERIOD_MINUTES"
    public final void mTIMEPERIOD_MINUTES() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_MINUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:126:20: ( 'minutes' )
            // EsperEPL2Grammar.g:126:22: 'minutes'
            {
            match("minutes"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_MINUTES"

    // $ANTLR start "TIMEPERIOD_SEC"
    public final void mTIMEPERIOD_SEC() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_SEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:127:16: ( 'sec' )
            // EsperEPL2Grammar.g:127:18: 'sec'
            {
            match("sec"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_SEC"

    // $ANTLR start "TIMEPERIOD_SECOND"
    public final void mTIMEPERIOD_SECOND() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_SECOND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:128:19: ( 'second' )
            // EsperEPL2Grammar.g:128:21: 'second'
            {
            match("second"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_SECOND"

    // $ANTLR start "TIMEPERIOD_SECONDS"
    public final void mTIMEPERIOD_SECONDS() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_SECONDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:129:20: ( 'seconds' )
            // EsperEPL2Grammar.g:129:22: 'seconds'
            {
            match("seconds"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_SECONDS"

    // $ANTLR start "TIMEPERIOD_MILLISEC"
    public final void mTIMEPERIOD_MILLISEC() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_MILLISEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:130:21: ( 'msec' )
            // EsperEPL2Grammar.g:130:23: 'msec'
            {
            match("msec"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_MILLISEC"

    // $ANTLR start "TIMEPERIOD_MILLISECOND"
    public final void mTIMEPERIOD_MILLISECOND() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_MILLISECOND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:131:24: ( 'millisecond' )
            // EsperEPL2Grammar.g:131:26: 'millisecond'
            {
            match("millisecond"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_MILLISECOND"

    // $ANTLR start "TIMEPERIOD_MILLISECONDS"
    public final void mTIMEPERIOD_MILLISECONDS() throws RecognitionException {
        try {
            int _type = TIMEPERIOD_MILLISECONDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:132:25: ( 'milliseconds' )
            // EsperEPL2Grammar.g:132:27: 'milliseconds'
            {
            match("milliseconds"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEPERIOD_MILLISECONDS"

    // $ANTLR start "BOOLEAN_TRUE"
    public final void mBOOLEAN_TRUE() throws RecognitionException {
        try {
            int _type = BOOLEAN_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:133:14: ( 'true' )
            // EsperEPL2Grammar.g:133:16: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN_TRUE"

    // $ANTLR start "BOOLEAN_FALSE"
    public final void mBOOLEAN_FALSE() throws RecognitionException {
        try {
            int _type = BOOLEAN_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:134:15: ( 'false' )
            // EsperEPL2Grammar.g:134:17: 'false'
            {
            match("false"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN_FALSE"

    // $ANTLR start "VALUE_NULL"
    public final void mVALUE_NULL() throws RecognitionException {
        try {
            int _type = VALUE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:135:12: ( 'null' )
            // EsperEPL2Grammar.g:135:14: 'null'
            {
            match("null"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUE_NULL"

    // $ANTLR start "ROW_LIMIT_EXPR"
    public final void mROW_LIMIT_EXPR() throws RecognitionException {
        try {
            int _type = ROW_LIMIT_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:136:16: ( 'limit' )
            // EsperEPL2Grammar.g:136:18: 'limit'
            {
            match("limit"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROW_LIMIT_EXPR"

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:137:8: ( 'offset' )
            // EsperEPL2Grammar.g:137:10: 'offset'
            {
            match("offset"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OFFSET"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:138:8: ( 'update' )
            // EsperEPL2Grammar.g:138:10: 'update'
            {
            match("update"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "MATCH_RECOGNIZE"
    public final void mMATCH_RECOGNIZE() throws RecognitionException {
        try {
            int _type = MATCH_RECOGNIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:139:17: ( 'match_recognize' )
            // EsperEPL2Grammar.g:139:19: 'match_recognize'
            {
            match("match_recognize"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATCH_RECOGNIZE"

    // $ANTLR start "MEASURES"
    public final void mMEASURES() throws RecognitionException {
        try {
            int _type = MEASURES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:140:10: ( 'measures' )
            // EsperEPL2Grammar.g:140:12: 'measures'
            {
            match("measures"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEASURES"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:141:8: ( 'define' )
            // EsperEPL2Grammar.g:141:10: 'define'
            {
            match("define"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "PARTITION"
    public final void mPARTITION() throws RecognitionException {
        try {
            int _type = PARTITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:142:11: ( 'partition' )
            // EsperEPL2Grammar.g:142:13: 'partition'
            {
            match("partition"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARTITION"

    // $ANTLR start "MATCHES"
    public final void mMATCHES() throws RecognitionException {
        try {
            int _type = MATCHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:143:9: ( 'matches' )
            // EsperEPL2Grammar.g:143:11: 'matches'
            {
            match("matches"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATCHES"

    // $ANTLR start "AFTER"
    public final void mAFTER() throws RecognitionException {
        try {
            int _type = AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:144:7: ( 'after' )
            // EsperEPL2Grammar.g:144:9: 'after'
            {
            match("after"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AFTER"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:145:5: ( 'for' )
            // EsperEPL2Grammar.g:145:7: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:146:7: ( 'while' )
            // EsperEPL2Grammar.g:146:9: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:147:7: ( 'using' )
            // EsperEPL2Grammar.g:147:9: 'using'
            {
            match("using"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "MERGE"
    public final void mMERGE() throws RecognitionException {
        try {
            int _type = MERGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:148:7: ( 'merge' )
            // EsperEPL2Grammar.g:148:9: 'merge'
            {
            match("merge"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MERGE"

    // $ANTLR start "MATCHED"
    public final void mMATCHED() throws RecognitionException {
        try {
            int _type = MATCHED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:149:9: ( 'matched' )
            // EsperEPL2Grammar.g:149:11: 'matched'
            {
            match("matched"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATCHED"

    // $ANTLR start "EXPRESSIONDECL"
    public final void mEXPRESSIONDECL() throws RecognitionException {
        try {
            int _type = EXPRESSIONDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:150:16: ( 'expression' )
            // EsperEPL2Grammar.g:150:18: 'expression'
            {
            match("expression"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPRESSIONDECL"

    // $ANTLR start "NEWKW"
    public final void mNEWKW() throws RecognitionException {
        try {
            int _type = NEWKW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:151:7: ( 'new' )
            // EsperEPL2Grammar.g:151:9: 'new'
            {
            match("new"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWKW"

    // $ANTLR start "START"
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:152:7: ( 'start' )
            // EsperEPL2Grammar.g:152:9: 'start'
            {
            match("start"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "START"

    // $ANTLR start "CONTEXT"
    public final void mCONTEXT() throws RecognitionException {
        try {
            int _type = CONTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:153:9: ( 'context' )
            // EsperEPL2Grammar.g:153:11: 'context'
            {
            match("context"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTEXT"

    // $ANTLR start "INITIATED"
    public final void mINITIATED() throws RecognitionException {
        try {
            int _type = INITIATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:154:11: ( 'initiated' )
            // EsperEPL2Grammar.g:154:13: 'initiated'
            {
            match("initiated"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INITIATED"

    // $ANTLR start "TERMINATED"
    public final void mTERMINATED() throws RecognitionException {
        try {
            int _type = TERMINATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:155:12: ( 'terminated' )
            // EsperEPL2Grammar.g:155:14: 'terminated'
            {
            match("terminated"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TERMINATED"

    // $ANTLR start "FOLLOWMAX_BEGIN"
    public final void mFOLLOWMAX_BEGIN() throws RecognitionException {
        try {
            int _type = FOLLOWMAX_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2061:17: ( '-[' )
            // EsperEPL2Grammar.g:2061:19: '-['
            {
            match("-["); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOLLOWMAX_BEGIN"

    // $ANTLR start "FOLLOWMAX_END"
    public final void mFOLLOWMAX_END() throws RecognitionException {
        try {
            int _type = FOLLOWMAX_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2062:17: ( ']>' )
            // EsperEPL2Grammar.g:2062:19: ']>'
            {
            match("]>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOLLOWMAX_END"

    // $ANTLR start "FOLLOWED_BY"
    public final void mFOLLOWED_BY() throws RecognitionException {
        try {
            int _type = FOLLOWED_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2063:14: ( '->' )
            // EsperEPL2Grammar.g:2063:16: '->'
            {
            match("->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOLLOWED_BY"

    // $ANTLR start "GOES"
    public final void mGOES() throws RecognitionException {
        try {
            int _type = GOES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2064:8: ( '=>' )
            // EsperEPL2Grammar.g:2064:10: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GOES"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2065:10: ( '=' )
            // EsperEPL2Grammar.g:2065:12: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "SQL_NE"
    public final void mSQL_NE() throws RecognitionException {
        try {
            int _type = SQL_NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2066:10: ( '<>' )
            // EsperEPL2Grammar.g:2066:12: '<>'
            {
            match("<>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL_NE"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2067:11: ( '?' )
            // EsperEPL2Grammar.g:2067:13: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2068:10: ( '(' )
            // EsperEPL2Grammar.g:2068:12: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2069:10: ( ')' )
            // EsperEPL2Grammar.g:2069:12: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2070:10: ( '[' )
            // EsperEPL2Grammar.g:2070:12: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2071:10: ( ']' )
            // EsperEPL2Grammar.g:2071:12: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2072:10: ( '{' )
            // EsperEPL2Grammar.g:2072:12: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2073:10: ( '}' )
            // EsperEPL2Grammar.g:2073:12: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2074:9: ( ':' )
            // EsperEPL2Grammar.g:2074:11: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2075:9: ( ',' )
            // EsperEPL2Grammar.g:2075:11: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2076:9: ( '==' )
            // EsperEPL2Grammar.g:2076:11: '=='
            {
            match("=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LNOT"
    public final void mLNOT() throws RecognitionException {
        try {
            int _type = LNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2077:8: ( '!' )
            // EsperEPL2Grammar.g:2077:10: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LNOT"

    // $ANTLR start "BNOT"
    public final void mBNOT() throws RecognitionException {
        try {
            int _type = BNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2078:8: ( '~' )
            // EsperEPL2Grammar.g:2078:10: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BNOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2079:12: ( '!=' )
            // EsperEPL2Grammar.g:2079:14: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2080:7: ( '/' )
            // EsperEPL2Grammar.g:2080:9: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DIV_ASSIGN"
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2081:13: ( '/=' )
            // EsperEPL2Grammar.g:2081:15: '/='
            {
            match("/="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV_ASSIGN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2082:8: ( '+' )
            // EsperEPL2Grammar.g:2082:10: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PLUS_ASSIGN"
    public final void mPLUS_ASSIGN() throws RecognitionException {
        try {
            int _type = PLUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2083:13: ( '+=' )
            // EsperEPL2Grammar.g:2083:15: '+='
            {
            match("+="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_ASSIGN"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2084:7: ( '++' )
            // EsperEPL2Grammar.g:2084:9: '++'
            {
            match("++"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2085:9: ( '-' )
            // EsperEPL2Grammar.g:2085:11: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MINUS_ASSIGN"
    public final void mMINUS_ASSIGN() throws RecognitionException {
        try {
            int _type = MINUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2086:15: ( '-=' )
            // EsperEPL2Grammar.g:2086:17: '-='
            {
            match("-="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_ASSIGN"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2087:7: ( '--' )
            // EsperEPL2Grammar.g:2087:9: '--'
            {
            match("--"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2088:8: ( '*' )
            // EsperEPL2Grammar.g:2088:10: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "STAR_ASSIGN"
    public final void mSTAR_ASSIGN() throws RecognitionException {
        try {
            int _type = STAR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2089:14: ( '*=' )
            // EsperEPL2Grammar.g:2089:16: '*='
            {
            match("*="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR_ASSIGN"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2090:7: ( '%' )
            // EsperEPL2Grammar.g:2090:9: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MOD_ASSIGN"
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2091:13: ( '%=' )
            // EsperEPL2Grammar.g:2091:15: '%='
            {
            match("%="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD_ASSIGN"

    // $ANTLR start "SR"
    public final void mSR() throws RecognitionException {
        try {
            int _type = SR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2092:6: ( '>>' )
            // EsperEPL2Grammar.g:2092:8: '>>'
            {
            match(">>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SR"

    // $ANTLR start "SR_ASSIGN"
    public final void mSR_ASSIGN() throws RecognitionException {
        try {
            int _type = SR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2093:12: ( '>>=' )
            // EsperEPL2Grammar.g:2093:14: '>>='
            {
            match(">>="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SR_ASSIGN"

    // $ANTLR start "BSR"
    public final void mBSR() throws RecognitionException {
        try {
            int _type = BSR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2094:7: ( '>>>' )
            // EsperEPL2Grammar.g:2094:9: '>>>'
            {
            match(">>>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSR"

    // $ANTLR start "BSR_ASSIGN"
    public final void mBSR_ASSIGN() throws RecognitionException {
        try {
            int _type = BSR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2095:13: ( '>>>=' )
            // EsperEPL2Grammar.g:2095:15: '>>>='
            {
            match(">>>="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSR_ASSIGN"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2096:6: ( '>=' )
            // EsperEPL2Grammar.g:2096:8: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2097:6: ( '>' )
            // EsperEPL2Grammar.g:2097:8: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "SL"
    public final void mSL() throws RecognitionException {
        try {
            int _type = SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2098:6: ( '<<' )
            // EsperEPL2Grammar.g:2098:8: '<<'
            {
            match("<<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL"

    // $ANTLR start "SL_ASSIGN"
    public final void mSL_ASSIGN() throws RecognitionException {
        try {
            int _type = SL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2099:12: ( '<<=' )
            // EsperEPL2Grammar.g:2099:14: '<<='
            {
            match("<<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_ASSIGN"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2100:6: ( '<=' )
            // EsperEPL2Grammar.g:2100:8: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2101:6: ( '<' )
            // EsperEPL2Grammar.g:2101:8: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "BXOR"
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2102:8: ( '^' )
            // EsperEPL2Grammar.g:2102:10: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BXOR"

    // $ANTLR start "BXOR_ASSIGN"
    public final void mBXOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BXOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2103:14: ( '^=' )
            // EsperEPL2Grammar.g:2103:16: '^='
            {
            match("^="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BXOR_ASSIGN"

    // $ANTLR start "BOR"
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2104:6: ( '|' )
            // EsperEPL2Grammar.g:2104:8: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOR"

    // $ANTLR start "BOR_ASSIGN"
    public final void mBOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2105:13: ( '|=' )
            // EsperEPL2Grammar.g:2105:15: '|='
            {
            match("|="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOR_ASSIGN"

    // $ANTLR start "LOR"
    public final void mLOR() throws RecognitionException {
        try {
            int _type = LOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2106:6: ( '||' )
            // EsperEPL2Grammar.g:2106:8: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOR"

    // $ANTLR start "BAND"
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2107:8: ( '&' )
            // EsperEPL2Grammar.g:2107:10: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAND"

    // $ANTLR start "BAND_ASSIGN"
    public final void mBAND_ASSIGN() throws RecognitionException {
        try {
            int _type = BAND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2108:14: ( '&=' )
            // EsperEPL2Grammar.g:2108:16: '&='
            {
            match("&="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAND_ASSIGN"

    // $ANTLR start "LAND"
    public final void mLAND() throws RecognitionException {
        try {
            int _type = LAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2109:8: ( '&&' )
            // EsperEPL2Grammar.g:2109:10: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAND"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2110:8: ( ';' )
            // EsperEPL2Grammar.g:2110:10: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2111:7: ( '.' )
            // EsperEPL2Grammar.g:2111:9: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "NUM_LONG"
    public final void mNUM_LONG() throws RecognitionException {
        try {
            int _type = NUM_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2112:10: ( '\\u18FF' )
            // EsperEPL2Grammar.g:2112:12: '\\u18FF'
            {
            match('\u18FF'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_LONG"

    // $ANTLR start "NUM_DOUBLE"
    public final void mNUM_DOUBLE() throws RecognitionException {
        try {
            int _type = NUM_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2113:12: ( '\\u18FE' )
            // EsperEPL2Grammar.g:2113:14: '\\u18FE'
            {
            match('\u18FE'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_DOUBLE"

    // $ANTLR start "NUM_FLOAT"
    public final void mNUM_FLOAT() throws RecognitionException {
        try {
            int _type = NUM_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2114:11: ( '\\u18FD' )
            // EsperEPL2Grammar.g:2114:13: '\\u18FD'
            {
            match('\u18FD'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_FLOAT"

    // $ANTLR start "ESCAPECHAR"
    public final void mESCAPECHAR() throws RecognitionException {
        try {
            int _type = ESCAPECHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2115:12: ( '\\\\' )
            // EsperEPL2Grammar.g:2115:14: '\\\\'
            {
            match('\\'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPECHAR"

    // $ANTLR start "ATCHAR"
    public final void mATCHAR() throws RecognitionException {
        try {
            int _type = ATCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2116:9: ( '@' )
            // EsperEPL2Grammar.g:2116:11: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATCHAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2119:4: ( ( ' ' | '\\t' | '\\f' | ( '\\r' | '\\n' ) )+ )
            // EsperEPL2Grammar.g:2119:6: ( ' ' | '\\t' | '\\f' | ( '\\r' | '\\n' ) )+
            {
            // EsperEPL2Grammar.g:2119:6: ( ' ' | '\\t' | '\\f' | ( '\\r' | '\\n' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||(LA1_0>='\f' && LA1_0<='\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // EsperEPL2Grammar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( state.backtracking==0 ) {
               _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2133:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // EsperEPL2Grammar.g:2133:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); if (state.failed) return ;

            // EsperEPL2Grammar.g:2134:3: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // EsperEPL2Grammar.g:2134:4: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // EsperEPL2Grammar.g:2134:19: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\r') ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // EsperEPL2Grammar.g:2134:20: '\\n'
                    {
                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // EsperEPL2Grammar.g:2134:25: '\\r' ( '\\n' )?
                    {
                    match('\r'); if (state.failed) return ;
                    // EsperEPL2Grammar.g:2134:29: ( '\\n' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\n') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // EsperEPL2Grammar.g:2134:30: '\\n'
                            {
                            match('\n'); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2140:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // EsperEPL2Grammar.g:2140:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // EsperEPL2Grammar.g:2140:14: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // EsperEPL2Grammar.g:2140:42: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); if (state.failed) return ;

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "TICKED_STRING_LITERAL"
    public final void mTICKED_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = TICKED_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2144:5: ( '`' ( EscapeSequence | ~ ( '\\`' | '\\\\' ) )* '`' )
            // EsperEPL2Grammar.g:2144:9: '`' ( EscapeSequence | ~ ( '\\`' | '\\\\' ) )* '`'
            {
            match('`'); if (state.failed) return ;
            // EsperEPL2Grammar.g:2144:13: ( EscapeSequence | ~ ( '\\`' | '\\\\' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='_')||(LA6_0>='a' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // EsperEPL2Grammar.g:2144:15: EscapeSequence
            	    {
            	    mEscapeSequence(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // EsperEPL2Grammar.g:2144:32: ~ ( '\\`' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('`'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TICKED_STRING_LITERAL"

    // $ANTLR start "QUOTED_STRING_LITERAL"
    public final void mQUOTED_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = QUOTED_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2148:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            // EsperEPL2Grammar.g:2148:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); if (state.failed) return ;
            // EsperEPL2Grammar.g:2148:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // EsperEPL2Grammar.g:2148:16: EscapeSequence
            	    {
            	    mEscapeSequence(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // EsperEPL2Grammar.g:2148:33: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_STRING_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2152:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // EsperEPL2Grammar.g:2152:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // EsperEPL2Grammar.g:2152:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // EsperEPL2Grammar.g:2152:14: EscapeSequence
            	    {
            	    mEscapeSequence(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // EsperEPL2Grammar.g:2152:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // EsperEPL2Grammar.g:2156:16: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | UnicodeEscape | OctalEscape | . ) )
            // EsperEPL2Grammar.g:2156:18: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | UnicodeEscape | OctalEscape | . )
            {
            match('\\'); if (state.failed) return ;
            // EsperEPL2Grammar.g:2157:3: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | UnicodeEscape | OctalEscape | . )
            int alt9=11;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='n') ) {
                alt9=1;
            }
            else if ( (LA9_0=='r') ) {
                alt9=2;
            }
            else if ( (LA9_0=='t') ) {
                alt9=3;
            }
            else if ( (LA9_0=='b') ) {
                alt9=4;
            }
            else if ( (LA9_0=='f') ) {
                alt9=5;
            }
            else if ( (LA9_0=='\"') ) {
                alt9=6;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=7;
            }
            else if ( (LA9_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt9=9;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt9=10;
                    }
                    break;
                default:
                    alt9=8;}

            }
            else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='a')||(LA9_0>='c' && LA9_0<='e')||(LA9_0>='g' && LA9_0<='m')||(LA9_0>='o' && LA9_0<='q')||LA9_0=='s'||(LA9_0>='u' && LA9_0<='\uFFFF')) ) {
                alt9=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // EsperEPL2Grammar.g:2157:5: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // EsperEPL2Grammar.g:2158:5: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // EsperEPL2Grammar.g:2159:5: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // EsperEPL2Grammar.g:2160:5: 'b'
                    {
                    match('b'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // EsperEPL2Grammar.g:2161:5: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // EsperEPL2Grammar.g:2162:5: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // EsperEPL2Grammar.g:2163:5: '\\''
                    {
                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // EsperEPL2Grammar.g:2164:5: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // EsperEPL2Grammar.g:2165:5: UnicodeEscape
                    {
                    mUnicodeEscape(); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // EsperEPL2Grammar.g:2166:5: OctalEscape
                    {
                    mOctalEscape(); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // EsperEPL2Grammar.g:2167:5: .
                    {
                    matchAny(); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // EsperEPL2Grammar.g:2173:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>='0' && LA10_1<='3')) ) {
                    int LA10_2 = input.LA(3);

                    if ( ((LA10_2>='0' && LA10_2<='7')) ) {
                        int LA10_5 = input.LA(4);

                        if ( ((LA10_5>='0' && LA10_5<='7')) ) {
                            alt10=1;
                        }
                        else {
                            alt10=2;}
                    }
                    else {
                        alt10=3;}
                }
                else if ( ((LA10_1>='4' && LA10_1<='7')) ) {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>='0' && LA10_3<='7')) ) {
                        alt10=2;
                    }
                    else {
                        alt10=3;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // EsperEPL2Grammar.g:2173:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // EsperEPL2Grammar.g:2173:14: ( '0' .. '3' )
                    // EsperEPL2Grammar.g:2173:15: '0' .. '3'
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    }

                    // EsperEPL2Grammar.g:2173:25: ( '0' .. '7' )
                    // EsperEPL2Grammar.g:2173:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // EsperEPL2Grammar.g:2173:36: ( '0' .. '7' )
                    // EsperEPL2Grammar.g:2173:37: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Grammar.g:2174:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // EsperEPL2Grammar.g:2174:14: ( '0' .. '7' )
                    // EsperEPL2Grammar.g:2174:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // EsperEPL2Grammar.g:2174:25: ( '0' .. '7' )
                    // EsperEPL2Grammar.g:2174:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // EsperEPL2Grammar.g:2175:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // EsperEPL2Grammar.g:2175:14: ( '0' .. '7' )
                    // EsperEPL2Grammar.g:2175:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // EsperEPL2Grammar.g:2179:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // EsperEPL2Grammar.g:2179:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // EsperEPL2Grammar.g:2183:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // EsperEPL2Grammar.g:2183:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); if (state.failed) return ;
            match('u'); if (state.failed) return ;
            mHexDigit(); if (state.failed) return ;
            mHexDigit(); if (state.failed) return ;
            mHexDigit(); if (state.failed) return ;
            mHexDigit(); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EsperEPL2Grammar.g:2190:2: ( ( 'a' .. 'z' | '_' | '$' ) ( 'a' .. 'z' | '_' | '0' .. '9' | '$' )* )
            // EsperEPL2Grammar.g:2190:4: ( 'a' .. 'z' | '_' | '$' ) ( 'a' .. 'z' | '_' | '0' .. '9' | '$' )*
            {
            if ( input.LA(1)=='$'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // EsperEPL2Grammar.g:2190:23: ( 'a' .. 'z' | '_' | '0' .. '9' | '$' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='$'||(LA11_0>='0' && LA11_0<='9')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // EsperEPL2Grammar.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "NUM_INT"
    public final void mNUM_INT() throws RecognitionException {
        try {
            int _type = NUM_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken f1=null;
            CommonToken f2=null;
            CommonToken f3=null;
            CommonToken f4=null;

            boolean isDecimal=false; Token t=null;
            // EsperEPL2Grammar.g:2197:5: ( '.' ( ( '0' .. '9' )+ ( EXPONENT )? (f1= FLOAT_SUFFIX )? )? | ( '0' ( ( 'x' ) ( HexDigit )+ | ( ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX ) )=> ( '0' .. '9' )+ | ( '0' .. '7' )+ )? | ( '1' .. '9' ) ( '0' .. '9' )* ) ( ( 'l' ) | {...}? ( '.' ( '0' .. '9' )* ( EXPONENT )? (f2= FLOAT_SUFFIX )? | EXPONENT (f3= FLOAT_SUFFIX )? | f4= FLOAT_SUFFIX ) )? )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='.') ) {
                alt28=1;
            }
            else if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // EsperEPL2Grammar.g:2197:9: '.' ( ( '0' .. '9' )+ ( EXPONENT )? (f1= FLOAT_SUFFIX )? )?
                    {
                    match('.'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = DOT;
                    }
                    // EsperEPL2Grammar.g:2198:13: ( ( '0' .. '9' )+ ( EXPONENT )? (f1= FLOAT_SUFFIX )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // EsperEPL2Grammar.g:2198:15: ( '0' .. '9' )+ ( EXPONENT )? (f1= FLOAT_SUFFIX )?
                            {
                            // EsperEPL2Grammar.g:2198:15: ( '0' .. '9' )+
                            int cnt12=0;
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // EsperEPL2Grammar.g:2198:16: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt12 >= 1 ) break loop12;
                            	    if (state.backtracking>0) {state.failed=true; return ;}
                                        EarlyExitException eee =
                                            new EarlyExitException(12, input);
                                        throw eee;
                                }
                                cnt12++;
                            } while (true);

                            // EsperEPL2Grammar.g:2198:27: ( EXPONENT )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='e') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // EsperEPL2Grammar.g:2198:28: EXPONENT
                                    {
                                    mEXPONENT(); if (state.failed) return ;

                                    }
                                    break;

                            }

                            // EsperEPL2Grammar.g:2198:39: (f1= FLOAT_SUFFIX )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0=='d'||LA14_0=='f') ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // EsperEPL2Grammar.g:2198:40: f1= FLOAT_SUFFIX
                                    {
                                    int f1Start2129 = getCharIndex();
                                    mFLOAT_SUFFIX(); if (state.failed) return ;
                                    f1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, f1Start2129, getCharIndex()-1);
                                    if ( state.backtracking==0 ) {
                                      t=f1;
                                    }

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              				if (t != null && t.getText().toUpperCase().indexOf('F')>=0) {
                                              	_type = NUM_FLOAT;
                              				}
                              				else {
                                              	_type = NUM_DOUBLE; // assume double
                              				}
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Grammar.g:2209:4: ( '0' ( ( 'x' ) ( HexDigit )+ | ( ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX ) )=> ( '0' .. '9' )+ | ( '0' .. '7' )+ )? | ( '1' .. '9' ) ( '0' .. '9' )* ) ( ( 'l' ) | {...}? ( '.' ( '0' .. '9' )* ( EXPONENT )? (f2= FLOAT_SUFFIX )? | EXPONENT (f3= FLOAT_SUFFIX )? | f4= FLOAT_SUFFIX ) )?
                    {
                    // EsperEPL2Grammar.g:2209:4: ( '0' ( ( 'x' ) ( HexDigit )+ | ( ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX ) )=> ( '0' .. '9' )+ | ( '0' .. '7' )+ )? | ( '1' .. '9' ) ( '0' .. '9' )* )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='0') ) {
                        alt21=1;
                    }
                    else if ( ((LA21_0>='1' && LA21_0<='9')) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // EsperEPL2Grammar.g:2209:6: '0' ( ( 'x' ) ( HexDigit )+ | ( ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX ) )=> ( '0' .. '9' )+ | ( '0' .. '7' )+ )?
                            {
                            match('0'); if (state.failed) return ;
                            if ( state.backtracking==0 ) {
                              isDecimal = true;
                            }
                            // EsperEPL2Grammar.g:2210:4: ( ( 'x' ) ( HexDigit )+ | ( ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX ) )=> ( '0' .. '9' )+ | ( '0' .. '7' )+ )?
                            int alt19=4;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0=='x') ) {
                                alt19=1;
                            }
                            else if ( ((LA19_0>='0' && LA19_0<='7')) ) {
                                int LA19_2 = input.LA(2);

                                if ( (synpred1_EsperEPL2Grammar()) ) {
                                    alt19=2;
                                }
                                else if ( (true) ) {
                                    alt19=3;
                                }
                            }
                            else if ( ((LA19_0>='8' && LA19_0<='9')) && (synpred1_EsperEPL2Grammar())) {
                                alt19=2;
                            }
                            switch (alt19) {
                                case 1 :
                                    // EsperEPL2Grammar.g:2210:6: ( 'x' ) ( HexDigit )+
                                    {
                                    // EsperEPL2Grammar.g:2210:6: ( 'x' )
                                    // EsperEPL2Grammar.g:2210:7: 'x'
                                    {
                                    match('x'); if (state.failed) return ;

                                    }

                                    // EsperEPL2Grammar.g:2211:5: ( HexDigit )+
                                    int cnt16=0;
                                    loop16:
                                    do {
                                        int alt16=2;
                                        switch ( input.LA(1) ) {
                                        case 'e':
                                            {
                                            int LA16_2 = input.LA(2);

                                            if ( ((LA16_2>='0' && LA16_2<='9')) ) {
                                                int LA16_5 = input.LA(3);

                                                if ( (!(((isDecimal)))) ) {
                                                    alt16=1;
                                                }


                                            }

                                            else {
                                                alt16=1;
                                            }

                                            }
                                            break;
                                        case 'd':
                                        case 'f':
                                            {
                                            int LA16_3 = input.LA(2);

                                            if ( (!(((isDecimal)))) ) {
                                                alt16=1;
                                            }


                                            }
                                            break;
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                        case 'A':
                                        case 'B':
                                        case 'C':
                                        case 'D':
                                        case 'E':
                                        case 'F':
                                        case 'a':
                                        case 'b':
                                        case 'c':
                                            {
                                            alt16=1;
                                            }
                                            break;

                                        }

                                        switch (alt16) {
                                    	case 1 :
                                    	    // EsperEPL2Grammar.g:2217:6: HexDigit
                                    	    {
                                    	    mHexDigit(); if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt16 >= 1 ) break loop16;
                                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                                EarlyExitException eee =
                                                    new EarlyExitException(16, input);
                                                throw eee;
                                        }
                                        cnt16++;
                                    } while (true);


                                    }
                                    break;
                                case 2 :
                                    // EsperEPL2Grammar.g:2221:5: ( ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX ) )=> ( '0' .. '9' )+
                                    {
                                    // EsperEPL2Grammar.g:2221:50: ( '0' .. '9' )+
                                    int cnt17=0;
                                    loop17:
                                    do {
                                        int alt17=2;
                                        int LA17_0 = input.LA(1);

                                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                                            alt17=1;
                                        }


                                        switch (alt17) {
                                    	case 1 :
                                    	    // EsperEPL2Grammar.g:2221:51: '0' .. '9'
                                    	    {
                                    	    matchRange('0','9'); if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt17 >= 1 ) break loop17;
                                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                                EarlyExitException eee =
                                                    new EarlyExitException(17, input);
                                                throw eee;
                                        }
                                        cnt17++;
                                    } while (true);


                                    }
                                    break;
                                case 3 :
                                    // EsperEPL2Grammar.g:2223:6: ( '0' .. '7' )+
                                    {
                                    // EsperEPL2Grammar.g:2223:6: ( '0' .. '7' )+
                                    int cnt18=0;
                                    loop18:
                                    do {
                                        int alt18=2;
                                        int LA18_0 = input.LA(1);

                                        if ( ((LA18_0>='0' && LA18_0<='7')) ) {
                                            alt18=1;
                                        }


                                        switch (alt18) {
                                    	case 1 :
                                    	    // EsperEPL2Grammar.g:2223:7: '0' .. '7'
                                    	    {
                                    	    matchRange('0','7'); if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt18 >= 1 ) break loop18;
                                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                                EarlyExitException eee =
                                                    new EarlyExitException(18, input);
                                                throw eee;
                                        }
                                        cnt18++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // EsperEPL2Grammar.g:2225:5: ( '1' .. '9' ) ( '0' .. '9' )*
                            {
                            // EsperEPL2Grammar.g:2225:5: ( '1' .. '9' )
                            // EsperEPL2Grammar.g:2225:6: '1' .. '9'
                            {
                            matchRange('1','9'); if (state.failed) return ;

                            }

                            // EsperEPL2Grammar.g:2225:16: ( '0' .. '9' )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // EsperEPL2Grammar.g:2225:17: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            if ( state.backtracking==0 ) {
                              isDecimal=true;
                            }

                            }
                            break;

                    }

                    // EsperEPL2Grammar.g:2227:3: ( ( 'l' ) | {...}? ( '.' ( '0' .. '9' )* ( EXPONENT )? (f2= FLOAT_SUFFIX )? | EXPONENT (f3= FLOAT_SUFFIX )? | f4= FLOAT_SUFFIX ) )?
                    int alt27=3;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='l') ) {
                        alt27=1;
                    }
                    else if ( (LA27_0=='.'||(LA27_0>='d' && LA27_0<='f')) ) {
                        alt27=2;
                    }
                    switch (alt27) {
                        case 1 :
                            // EsperEPL2Grammar.g:2227:5: ( 'l' )
                            {
                            // EsperEPL2Grammar.g:2227:5: ( 'l' )
                            // EsperEPL2Grammar.g:2227:6: 'l'
                            {
                            match('l'); if (state.failed) return ;

                            }

                            if ( state.backtracking==0 ) {
                               _type = NUM_LONG; 
                            }

                            }
                            break;
                        case 2 :
                            // EsperEPL2Grammar.g:2230:5: {...}? ( '.' ( '0' .. '9' )* ( EXPONENT )? (f2= FLOAT_SUFFIX )? | EXPONENT (f3= FLOAT_SUFFIX )? | f4= FLOAT_SUFFIX )
                            {
                            if ( !((isDecimal)) ) {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                throw new FailedPredicateException(input, "NUM_INT", "isDecimal");
                            }
                            // EsperEPL2Grammar.g:2231:13: ( '.' ( '0' .. '9' )* ( EXPONENT )? (f2= FLOAT_SUFFIX )? | EXPONENT (f3= FLOAT_SUFFIX )? | f4= FLOAT_SUFFIX )
                            int alt26=3;
                            switch ( input.LA(1) ) {
                            case '.':
                                {
                                alt26=1;
                                }
                                break;
                            case 'e':
                                {
                                alt26=2;
                                }
                                break;
                            case 'd':
                            case 'f':
                                {
                                alt26=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }

                            switch (alt26) {
                                case 1 :
                                    // EsperEPL2Grammar.g:2231:17: '.' ( '0' .. '9' )* ( EXPONENT )? (f2= FLOAT_SUFFIX )?
                                    {
                                    match('.'); if (state.failed) return ;
                                    // EsperEPL2Grammar.g:2231:21: ( '0' .. '9' )*
                                    loop22:
                                    do {
                                        int alt22=2;
                                        int LA22_0 = input.LA(1);

                                        if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                                            alt22=1;
                                        }


                                        switch (alt22) {
                                    	case 1 :
                                    	    // EsperEPL2Grammar.g:2231:22: '0' .. '9'
                                    	    {
                                    	    matchRange('0','9'); if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop22;
                                        }
                                    } while (true);

                                    // EsperEPL2Grammar.g:2231:33: ( EXPONENT )?
                                    int alt23=2;
                                    int LA23_0 = input.LA(1);

                                    if ( (LA23_0=='e') ) {
                                        alt23=1;
                                    }
                                    switch (alt23) {
                                        case 1 :
                                            // EsperEPL2Grammar.g:2231:34: EXPONENT
                                            {
                                            mEXPONENT(); if (state.failed) return ;

                                            }
                                            break;

                                    }

                                    // EsperEPL2Grammar.g:2231:45: (f2= FLOAT_SUFFIX )?
                                    int alt24=2;
                                    int LA24_0 = input.LA(1);

                                    if ( (LA24_0=='d'||LA24_0=='f') ) {
                                        alt24=1;
                                    }
                                    switch (alt24) {
                                        case 1 :
                                            // EsperEPL2Grammar.g:2231:46: f2= FLOAT_SUFFIX
                                            {
                                            int f2Start2393 = getCharIndex();
                                            mFLOAT_SUFFIX(); if (state.failed) return ;
                                            f2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, f2Start2393, getCharIndex()-1);
                                            if ( state.backtracking==0 ) {
                                              t=f2;
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // EsperEPL2Grammar.g:2232:17: EXPONENT (f3= FLOAT_SUFFIX )?
                                    {
                                    mEXPONENT(); if (state.failed) return ;
                                    // EsperEPL2Grammar.g:2232:26: (f3= FLOAT_SUFFIX )?
                                    int alt25=2;
                                    int LA25_0 = input.LA(1);

                                    if ( (LA25_0=='d'||LA25_0=='f') ) {
                                        alt25=1;
                                    }
                                    switch (alt25) {
                                        case 1 :
                                            // EsperEPL2Grammar.g:2232:27: f3= FLOAT_SUFFIX
                                            {
                                            int f3Start2420 = getCharIndex();
                                            mFLOAT_SUFFIX(); if (state.failed) return ;
                                            f3 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, f3Start2420, getCharIndex()-1);
                                            if ( state.backtracking==0 ) {
                                              t=f3;
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 3 :
                                    // EsperEPL2Grammar.g:2233:17: f4= FLOAT_SUFFIX
                                    {
                                    int f4Start2444 = getCharIndex();
                                    mFLOAT_SUFFIX(); if (state.failed) return ;
                                    f4 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, f4Start2444, getCharIndex()-1);
                                    if ( state.backtracking==0 ) {
                                      t=f4;
                                    }

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              			if (t != null && t.getText().toUpperCase() .indexOf('F') >= 0) {
                                              _type = NUM_FLOAT;
                              			}
                                          else {
                              	           	_type = NUM_DOUBLE; // assume double
                              			}
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_INT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // EsperEPL2Grammar.g:2250:2: ( ( 'e' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // EsperEPL2Grammar.g:2250:4: ( 'e' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            // EsperEPL2Grammar.g:2250:4: ( 'e' )
            // EsperEPL2Grammar.g:2250:5: 'e'
            {
            match('e'); if (state.failed) return ;

            }

            // EsperEPL2Grammar.g:2250:10: ( '+' | '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='+'||LA29_0=='-') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // EsperEPL2Grammar.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // EsperEPL2Grammar.g:2250:21: ( '0' .. '9' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // EsperEPL2Grammar.g:2250:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "FLOAT_SUFFIX"
    public final void mFLOAT_SUFFIX() throws RecognitionException {
        try {
            // EsperEPL2Grammar.g:2256:2: ( 'f' | 'd' )
            // EsperEPL2Grammar.g:
            {
            if ( input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT_SUFFIX"

    public void mTokens() throws RecognitionException {
        // EsperEPL2Grammar.g:1:8: ( CREATE | WINDOW | IN_SET | BETWEEN | LIKE | REGEXP | ESCAPE | OR_EXPR | AND_EXPR | NOT_EXPR | EVERY_EXPR | EVERY_DISTINCT_EXPR | WHERE | AS | SUM | AVG | MAX | MIN | COALESCE | MEDIAN | STDDEV | AVEDEV | COUNT | SELECT | CASE | ELSE | WHEN | THEN | END | FROM | OUTER | INNER | JOIN | LEFT | RIGHT | FULL | ON | IS | BY | GROUP | HAVING | DISTINCT | ALL | ANY | SOME | OUTPUT | EVENTS | FIRST | LAST | INSERT | INTO | ORDER | ASC | DESC | RSTREAM | ISTREAM | IRSTREAM | SCHEMA | UNIDIRECTIONAL | RETAINUNION | RETAININTERSECTION | PATTERN | SQL | METADATASQL | PREVIOUS | PREVIOUSTAIL | PREVIOUSCOUNT | PREVIOUSWINDOW | PRIOR | EXISTS | WEEKDAY | LW | INSTANCEOF | TYPEOF | CAST | CURRENT_TIMESTAMP | DELETE | SNAPSHOT | SET | VARIABLE | UNTIL | AT | INDEX | TIMEPERIOD_YEAR | TIMEPERIOD_YEARS | TIMEPERIOD_MONTH | TIMEPERIOD_MONTHS | TIMEPERIOD_WEEK | TIMEPERIOD_WEEKS | TIMEPERIOD_DAY | TIMEPERIOD_DAYS | TIMEPERIOD_HOUR | TIMEPERIOD_HOURS | TIMEPERIOD_MINUTE | TIMEPERIOD_MINUTES | TIMEPERIOD_SEC | TIMEPERIOD_SECOND | TIMEPERIOD_SECONDS | TIMEPERIOD_MILLISEC | TIMEPERIOD_MILLISECOND | TIMEPERIOD_MILLISECONDS | BOOLEAN_TRUE | BOOLEAN_FALSE | VALUE_NULL | ROW_LIMIT_EXPR | OFFSET | UPDATE | MATCH_RECOGNIZE | MEASURES | DEFINE | PARTITION | MATCHES | AFTER | FOR | WHILE | USING | MERGE | MATCHED | EXPRESSIONDECL | NEWKW | START | CONTEXT | INITIATED | TERMINATED | FOLLOWMAX_BEGIN | FOLLOWMAX_END | FOLLOWED_BY | GOES | EQUALS | SQL_NE | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | LCURLY | RCURLY | COLON | COMMA | EQUAL | LNOT | BNOT | NOT_EQUAL | DIV | DIV_ASSIGN | PLUS | PLUS_ASSIGN | INC | MINUS | MINUS_ASSIGN | DEC | STAR | STAR_ASSIGN | MOD | MOD_ASSIGN | SR | SR_ASSIGN | BSR | BSR_ASSIGN | GE | GT | SL | SL_ASSIGN | LE | LT | BXOR | BXOR_ASSIGN | BOR | BOR_ASSIGN | LOR | BAND | BAND_ASSIGN | LAND | SEMI | DOT | NUM_LONG | NUM_DOUBLE | NUM_FLOAT | ESCAPECHAR | ATCHAR | WS | SL_COMMENT | ML_COMMENT | TICKED_STRING_LITERAL | QUOTED_STRING_LITERAL | STRING_LITERAL | IDENT | NUM_INT )
        int alt31=188;
        switch ( input.LA(1) ) {
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA31_58 = input.LA(3);

                if ( (LA31_58=='e') ) {
                    int LA31_168 = input.LA(4);

                    if ( (LA31_168=='a') ) {
                        int LA31_273 = input.LA(5);

                        if ( (LA31_273=='t') ) {
                            int LA31_376 = input.LA(6);

                            if ( (LA31_376=='e') ) {
                                int LA31_469 = input.LA(7);

                                if ( (LA31_469=='$'||(LA31_469>='0' && LA31_469<='9')||LA31_469=='_'||(LA31_469>='a' && LA31_469<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=1;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA31_169 = input.LA(4);

                    if ( (LA31_169=='l') ) {
                        int LA31_274 = input.LA(5);

                        if ( (LA31_274=='e') ) {
                            int LA31_377 = input.LA(6);

                            if ( (LA31_377=='s') ) {
                                int LA31_470 = input.LA(7);

                                if ( (LA31_470=='c') ) {
                                    int LA31_544 = input.LA(8);

                                    if ( (LA31_544=='e') ) {
                                        int LA31_596 = input.LA(9);

                                        if ( (LA31_596=='$'||(LA31_596>='0' && LA31_596<='9')||LA31_596=='_'||(LA31_596>='a' && LA31_596<='z')) ) {
                                            alt31=187;
                                        }
                                        else {
                                            alt31=19;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'u':
                    {
                    int LA31_170 = input.LA(4);

                    if ( (LA31_170=='n') ) {
                        int LA31_275 = input.LA(5);

                        if ( (LA31_275=='t') ) {
                            int LA31_378 = input.LA(6);

                            if ( (LA31_378=='$'||(LA31_378>='0' && LA31_378<='9')||LA31_378=='_'||(LA31_378>='a' && LA31_378<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=23;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'n':
                    {
                    int LA31_171 = input.LA(4);

                    if ( (LA31_171=='t') ) {
                        int LA31_276 = input.LA(5);

                        if ( (LA31_276=='e') ) {
                            int LA31_379 = input.LA(6);

                            if ( (LA31_379=='x') ) {
                                int LA31_472 = input.LA(7);

                                if ( (LA31_472=='t') ) {
                                    int LA31_545 = input.LA(8);

                                    if ( (LA31_545=='$'||(LA31_545>='0' && LA31_545<='9')||LA31_545=='_'||(LA31_545>='a' && LA31_545<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=122;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'a':
                {
                int LA31_60 = input.LA(3);

                if ( (LA31_60=='s') ) {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA31_277 = input.LA(5);

                        if ( (LA31_277=='$'||(LA31_277>='0' && LA31_277<='9')||LA31_277=='_'||(LA31_277>='a' && LA31_277<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=25;}
                        }
                        break;
                    case 't':
                        {
                        int LA31_278 = input.LA(5);

                        if ( (LA31_278=='$'||(LA31_278>='0' && LA31_278<='9')||LA31_278=='_'||(LA31_278>='a' && LA31_278<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=75;}
                        }
                        break;
                    default:
                        alt31=187;}

                }
                else {
                    alt31=187;}
                }
                break;
            case 'u':
                {
                int LA31_61 = input.LA(3);

                if ( (LA31_61=='r') ) {
                    int LA31_173 = input.LA(4);

                    if ( (LA31_173=='r') ) {
                        int LA31_279 = input.LA(5);

                        if ( (LA31_279=='e') ) {
                            int LA31_382 = input.LA(6);

                            if ( (LA31_382=='n') ) {
                                int LA31_473 = input.LA(7);

                                if ( (LA31_473=='t') ) {
                                    int LA31_546 = input.LA(8);

                                    if ( (LA31_546=='_') ) {
                                        int LA31_598 = input.LA(9);

                                        if ( (LA31_598=='t') ) {
                                            int LA31_629 = input.LA(10);

                                            if ( (LA31_629=='i') ) {
                                                int LA31_648 = input.LA(11);

                                                if ( (LA31_648=='m') ) {
                                                    int LA31_661 = input.LA(12);

                                                    if ( (LA31_661=='e') ) {
                                                        int LA31_671 = input.LA(13);

                                                        if ( (LA31_671=='s') ) {
                                                            int LA31_678 = input.LA(14);

                                                            if ( (LA31_678=='t') ) {
                                                                int LA31_682 = input.LA(15);

                                                                if ( (LA31_682=='a') ) {
                                                                    int LA31_685 = input.LA(16);

                                                                    if ( (LA31_685=='m') ) {
                                                                        int LA31_688 = input.LA(17);

                                                                        if ( (LA31_688=='p') ) {
                                                                            int LA31_690 = input.LA(18);

                                                                            if ( (LA31_690=='$'||(LA31_690>='0' && LA31_690<='9')||LA31_690=='_'||(LA31_690>='a' && LA31_690<='z')) ) {
                                                                                alt31=187;
                                                                            }
                                                                            else {
                                                                                alt31=76;}
                                                                        }
                                                                        else {
                                                                            alt31=187;}
                                                                    }
                                                                    else {
                                                                        alt31=187;}
                                                                }
                                                                else {
                                                                    alt31=187;}
                                                            }
                                                            else {
                                                                alt31=187;}
                                                        }
                                                        else {
                                                            alt31=187;}
                                                    }
                                                    else {
                                                        alt31=187;}
                                                }
                                                else {
                                                    alt31=187;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA31_62 = input.LA(3);

                if ( (LA31_62=='n') ) {
                    int LA31_174 = input.LA(4);

                    if ( (LA31_174=='d') ) {
                        int LA31_280 = input.LA(5);

                        if ( (LA31_280=='o') ) {
                            int LA31_383 = input.LA(6);

                            if ( (LA31_383=='w') ) {
                                int LA31_474 = input.LA(7);

                                if ( (LA31_474=='$'||(LA31_474>='0' && LA31_474<='9')||LA31_474=='_'||(LA31_474>='a' && LA31_474<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=2;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'h':
                {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    switch ( input.LA(4) ) {
                    case 'r':
                        {
                        int LA31_281 = input.LA(5);

                        if ( (LA31_281=='e') ) {
                            int LA31_384 = input.LA(6);

                            if ( (LA31_384=='$'||(LA31_384>='0' && LA31_384<='9')||LA31_384=='_'||(LA31_384>='a' && LA31_384<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=13;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    case 'n':
                        {
                        int LA31_282 = input.LA(5);

                        if ( (LA31_282=='$'||(LA31_282>='0' && LA31_282<='9')||LA31_282=='_'||(LA31_282>='a' && LA31_282<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=27;}
                        }
                        break;
                    default:
                        alt31=187;}

                    }
                    break;
                case 'i':
                    {
                    int LA31_176 = input.LA(4);

                    if ( (LA31_176=='l') ) {
                        int LA31_283 = input.LA(5);

                        if ( (LA31_283=='e') ) {
                            int LA31_386 = input.LA(6);

                            if ( (LA31_386=='$'||(LA31_386>='0' && LA31_386<='9')||LA31_386=='_'||(LA31_386>='a' && LA31_386<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=115;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'e':
                {
                int LA31_64 = input.LA(3);

                if ( (LA31_64=='e') ) {
                    int LA31_177 = input.LA(4);

                    if ( (LA31_177=='k') ) {
                        switch ( input.LA(5) ) {
                        case 'd':
                            {
                            int LA31_387 = input.LA(6);

                            if ( (LA31_387=='a') ) {
                                int LA31_477 = input.LA(7);

                                if ( (LA31_477=='y') ) {
                                    int LA31_548 = input.LA(8);

                                    if ( (LA31_548=='$'||(LA31_548>='0' && LA31_548<='9')||LA31_548=='_'||(LA31_548>='a' && LA31_548<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=71;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                            }
                            break;
                        case 's':
                            {
                            int LA31_388 = input.LA(6);

                            if ( (LA31_388=='$'||(LA31_388>='0' && LA31_388<='9')||LA31_388=='_'||(LA31_388>='a' && LA31_388<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=89;}
                            }
                            break;
                        case '$':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt31=187;
                            }
                            break;
                        default:
                            alt31=88;}

                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA31_178 = input.LA(4);

                    if ( (LA31_178=='e') ) {
                        int LA31_285 = input.LA(5);

                        if ( (LA31_285=='r') ) {
                            int LA31_390 = input.LA(6);

                            if ( (LA31_390=='$'||(LA31_390>='0' && LA31_390<='9')||LA31_390=='_'||(LA31_390>='a' && LA31_390<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=32;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 's':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA31_286 = input.LA(5);

                        if ( (LA31_286=='r') ) {
                            int LA31_391 = input.LA(6);

                            if ( (LA31_391=='t') ) {
                                int LA31_480 = input.LA(7);

                                if ( (LA31_480=='$'||(LA31_480>='0' && LA31_480<='9')||LA31_480=='_'||(LA31_480>='a' && LA31_480<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=50;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    case 't':
                        {
                        int LA31_287 = input.LA(5);

                        if ( (LA31_287=='a') ) {
                            int LA31_392 = input.LA(6);

                            if ( (LA31_392=='n') ) {
                                int LA31_481 = input.LA(7);

                                if ( (LA31_481=='c') ) {
                                    int LA31_550 = input.LA(8);

                                    if ( (LA31_550=='e') ) {
                                        int LA31_600 = input.LA(9);

                                        if ( (LA31_600=='o') ) {
                                            int LA31_630 = input.LA(10);

                                            if ( (LA31_630=='f') ) {
                                                int LA31_649 = input.LA(11);

                                                if ( (LA31_649=='$'||(LA31_649>='0' && LA31_649<='9')||LA31_649=='_'||(LA31_649>='a' && LA31_649<='z')) ) {
                                                    alt31=187;
                                                }
                                                else {
                                                    alt31=73;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    default:
                        alt31=187;}

                    }
                    break;
                case 't':
                    {
                    int LA31_180 = input.LA(4);

                    if ( (LA31_180=='o') ) {
                        int LA31_288 = input.LA(5);

                        if ( (LA31_288=='$'||(LA31_288>='0' && LA31_288<='9')||LA31_288=='_'||(LA31_288>='a' && LA31_288<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=51;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'd':
                    {
                    int LA31_181 = input.LA(4);

                    if ( (LA31_181=='e') ) {
                        int LA31_289 = input.LA(5);

                        if ( (LA31_289=='x') ) {
                            int LA31_394 = input.LA(6);

                            if ( (LA31_394=='$'||(LA31_394>='0' && LA31_394<='9')||LA31_394=='_'||(LA31_394>='a' && LA31_394<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=83;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'i':
                    {
                    int LA31_182 = input.LA(4);

                    if ( (LA31_182=='t') ) {
                        int LA31_290 = input.LA(5);

                        if ( (LA31_290=='i') ) {
                            int LA31_395 = input.LA(6);

                            if ( (LA31_395=='a') ) {
                                int LA31_483 = input.LA(7);

                                if ( (LA31_483=='t') ) {
                                    int LA31_551 = input.LA(8);

                                    if ( (LA31_551=='e') ) {
                                        int LA31_601 = input.LA(9);

                                        if ( (LA31_601=='d') ) {
                                            int LA31_631 = input.LA(10);

                                            if ( (LA31_631=='$'||(LA31_631>='0' && LA31_631<='9')||LA31_631=='_'||(LA31_631>='a' && LA31_631<='z')) ) {
                                                alt31=187;
                                            }
                                            else {
                                                alt31=123;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case '$':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt31=187;
                    }
                    break;
                default:
                    alt31=3;}

                }
                break;
            case 's':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA31_184 = input.LA(4);

                    if ( (LA31_184=='r') ) {
                        int LA31_291 = input.LA(5);

                        if ( (LA31_291=='e') ) {
                            int LA31_396 = input.LA(6);

                            if ( (LA31_396=='a') ) {
                                int LA31_484 = input.LA(7);

                                if ( (LA31_484=='m') ) {
                                    int LA31_552 = input.LA(8);

                                    if ( (LA31_552=='$'||(LA31_552>='0' && LA31_552<='9')||LA31_552=='_'||(LA31_552>='a' && LA31_552<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=56;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case '$':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt31=187;
                    }
                    break;
                default:
                    alt31=38;}

                }
                break;
            case 'r':
                {
                int LA31_67 = input.LA(3);

                if ( (LA31_67=='s') ) {
                    int LA31_186 = input.LA(4);

                    if ( (LA31_186=='t') ) {
                        int LA31_292 = input.LA(5);

                        if ( (LA31_292=='r') ) {
                            int LA31_397 = input.LA(6);

                            if ( (LA31_397=='e') ) {
                                int LA31_485 = input.LA(7);

                                if ( (LA31_485=='a') ) {
                                    int LA31_553 = input.LA(8);

                                    if ( (LA31_553=='m') ) {
                                        int LA31_603 = input.LA(9);

                                        if ( (LA31_603=='$'||(LA31_603>='0' && LA31_603<='9')||LA31_603=='_'||(LA31_603>='a' && LA31_603<='z')) ) {
                                            alt31=187;
                                        }
                                        else {
                                            alt31=57;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA31_68 = input.LA(3);

                if ( (LA31_68=='t') ) {
                    int LA31_187 = input.LA(4);

                    if ( (LA31_187=='w') ) {
                        int LA31_293 = input.LA(5);

                        if ( (LA31_293=='e') ) {
                            int LA31_398 = input.LA(6);

                            if ( (LA31_398=='e') ) {
                                int LA31_486 = input.LA(7);

                                if ( (LA31_486=='n') ) {
                                    int LA31_554 = input.LA(8);

                                    if ( (LA31_554=='$'||(LA31_554>='0' && LA31_554<='9')||LA31_554=='_'||(LA31_554>='a' && LA31_554<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=4;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'y':
                {
                int LA31_69 = input.LA(3);

                if ( (LA31_69=='$'||(LA31_69>='0' && LA31_69<='9')||LA31_69=='_'||(LA31_69>='a' && LA31_69<='z')) ) {
                    alt31=187;
                }
                else {
                    alt31=39;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'l':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                switch ( input.LA(3) ) {
                case 'k':
                    {
                    int LA31_189 = input.LA(4);

                    if ( (LA31_189=='e') ) {
                        int LA31_294 = input.LA(5);

                        if ( (LA31_294=='$'||(LA31_294>='0' && LA31_294<='9')||LA31_294=='_'||(LA31_294>='a' && LA31_294<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=5;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'm':
                    {
                    int LA31_190 = input.LA(4);

                    if ( (LA31_190=='i') ) {
                        int LA31_295 = input.LA(5);

                        if ( (LA31_295=='t') ) {
                            int LA31_400 = input.LA(6);

                            if ( (LA31_400=='$'||(LA31_400>='0' && LA31_400<='9')||LA31_400=='_'||(LA31_400>='a' && LA31_400<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=105;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'e':
                {
                int LA31_71 = input.LA(3);

                if ( (LA31_71=='f') ) {
                    int LA31_191 = input.LA(4);

                    if ( (LA31_191=='t') ) {
                        int LA31_296 = input.LA(5);

                        if ( (LA31_296=='$'||(LA31_296>='0' && LA31_296<='9')||LA31_296=='_'||(LA31_296>='a' && LA31_296<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=34;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'a':
                {
                int LA31_72 = input.LA(3);

                if ( (LA31_72=='s') ) {
                    int LA31_192 = input.LA(4);

                    if ( (LA31_192=='t') ) {
                        switch ( input.LA(5) ) {
                        case 'w':
                            {
                            int LA31_402 = input.LA(6);

                            if ( (LA31_402=='e') ) {
                                int LA31_488 = input.LA(7);

                                if ( (LA31_488=='e') ) {
                                    int LA31_555 = input.LA(8);

                                    if ( (LA31_555=='k') ) {
                                        int LA31_605 = input.LA(9);

                                        if ( (LA31_605=='d') ) {
                                            int LA31_633 = input.LA(10);

                                            if ( (LA31_633=='a') ) {
                                                int LA31_651 = input.LA(11);

                                                if ( (LA31_651=='y') ) {
                                                    int LA31_663 = input.LA(12);

                                                    if ( (LA31_663=='$'||(LA31_663>='0' && LA31_663<='9')||LA31_663=='_'||(LA31_663>='a' && LA31_663<='z')) ) {
                                                        alt31=187;
                                                    }
                                                    else {
                                                        alt31=72;}
                                                }
                                                else {
                                                    alt31=187;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                            }
                            break;
                        case '$':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt31=187;
                            }
                            break;
                        default:
                            alt31=49;}

                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'r':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'g':
                    {
                    int LA31_193 = input.LA(4);

                    if ( (LA31_193=='e') ) {
                        int LA31_298 = input.LA(5);

                        if ( (LA31_298=='x') ) {
                            int LA31_404 = input.LA(6);

                            if ( (LA31_404=='p') ) {
                                int LA31_489 = input.LA(7);

                                if ( (LA31_489=='$'||(LA31_489>='0' && LA31_489<='9')||LA31_489=='_'||(LA31_489>='a' && LA31_489<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=6;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 't':
                    {
                    int LA31_194 = input.LA(4);

                    if ( (LA31_194=='a') ) {
                        int LA31_299 = input.LA(5);

                        if ( (LA31_299=='i') ) {
                            int LA31_405 = input.LA(6);

                            if ( (LA31_405=='n') ) {
                                int LA31_490 = input.LA(7);

                                if ( (LA31_490=='-') ) {
                                    int LA31_557 = input.LA(8);

                                    if ( (LA31_557=='u') ) {
                                        alt31=60;
                                    }
                                    else if ( (LA31_557=='i') ) {
                                        alt31=61;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 31, 557, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'i':
                {
                int LA31_74 = input.LA(3);

                if ( (LA31_74=='g') ) {
                    int LA31_195 = input.LA(4);

                    if ( (LA31_195=='h') ) {
                        int LA31_300 = input.LA(5);

                        if ( (LA31_300=='t') ) {
                            int LA31_406 = input.LA(6);

                            if ( (LA31_406=='$'||(LA31_406>='0' && LA31_406<='9')||LA31_406=='_'||(LA31_406>='a' && LA31_406<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=35;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 's':
                {
                int LA31_75 = input.LA(3);

                if ( (LA31_75=='t') ) {
                    int LA31_196 = input.LA(4);

                    if ( (LA31_196=='r') ) {
                        int LA31_301 = input.LA(5);

                        if ( (LA31_301=='e') ) {
                            int LA31_407 = input.LA(6);

                            if ( (LA31_407=='a') ) {
                                int LA31_492 = input.LA(7);

                                if ( (LA31_492=='m') ) {
                                    int LA31_558 = input.LA(8);

                                    if ( (LA31_558=='$'||(LA31_558>='0' && LA31_558<='9')||LA31_558=='_'||(LA31_558>='a' && LA31_558<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=55;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA31_76 = input.LA(3);

                if ( (LA31_76=='c') ) {
                    int LA31_197 = input.LA(4);

                    if ( (LA31_197=='a') ) {
                        int LA31_302 = input.LA(5);

                        if ( (LA31_302=='p') ) {
                            int LA31_408 = input.LA(6);

                            if ( (LA31_408=='e') ) {
                                int LA31_493 = input.LA(7);

                                if ( (LA31_493=='$'||(LA31_493>='0' && LA31_493<='9')||LA31_493=='_'||(LA31_493>='a' && LA31_493<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=7;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'v':
                {
                int LA31_77 = input.LA(3);

                if ( (LA31_77=='e') ) {
                    switch ( input.LA(4) ) {
                    case 'r':
                        {
                        int LA31_303 = input.LA(5);

                        if ( (LA31_303=='y') ) {
                            switch ( input.LA(6) ) {
                            case '-':
                                {
                                alt31=12;
                                }
                                break;
                            case '$':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                                {
                                alt31=187;
                                }
                                break;
                            default:
                                alt31=11;}

                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    case 'n':
                        {
                        int LA31_304 = input.LA(5);

                        if ( (LA31_304=='t') ) {
                            int LA31_410 = input.LA(6);

                            if ( (LA31_410=='s') ) {
                                int LA31_496 = input.LA(7);

                                if ( (LA31_496=='$'||(LA31_496>='0' && LA31_496<='9')||LA31_496=='_'||(LA31_496>='a' && LA31_496<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=47;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    default:
                        alt31=187;}

                }
                else {
                    alt31=187;}
                }
                break;
            case 'l':
                {
                int LA31_78 = input.LA(3);

                if ( (LA31_78=='s') ) {
                    int LA31_199 = input.LA(4);

                    if ( (LA31_199=='e') ) {
                        int LA31_305 = input.LA(5);

                        if ( (LA31_305=='$'||(LA31_305>='0' && LA31_305<='9')||LA31_305=='_'||(LA31_305>='a' && LA31_305<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=26;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'n':
                {
                int LA31_79 = input.LA(3);

                if ( (LA31_79=='d') ) {
                    int LA31_200 = input.LA(4);

                    if ( (LA31_200=='$'||(LA31_200>='0' && LA31_200<='9')||LA31_200=='_'||(LA31_200>='a' && LA31_200<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=29;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA31_201 = input.LA(4);

                    if ( (LA31_201=='s') ) {
                        int LA31_307 = input.LA(5);

                        if ( (LA31_307=='t') ) {
                            int LA31_412 = input.LA(6);

                            if ( (LA31_412=='s') ) {
                                int LA31_497 = input.LA(7);

                                if ( (LA31_497=='$'||(LA31_497>='0' && LA31_497<='9')||LA31_497=='_'||(LA31_497>='a' && LA31_497<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=70;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'p':
                    {
                    int LA31_202 = input.LA(4);

                    if ( (LA31_202=='r') ) {
                        int LA31_308 = input.LA(5);

                        if ( (LA31_308=='e') ) {
                            int LA31_413 = input.LA(6);

                            if ( (LA31_413=='s') ) {
                                int LA31_498 = input.LA(7);

                                if ( (LA31_498=='s') ) {
                                    int LA31_562 = input.LA(8);

                                    if ( (LA31_562=='i') ) {
                                        int LA31_609 = input.LA(9);

                                        if ( (LA31_609=='o') ) {
                                            int LA31_634 = input.LA(10);

                                            if ( (LA31_634=='n') ) {
                                                int LA31_652 = input.LA(11);

                                                if ( (LA31_652=='$'||(LA31_652>='0' && LA31_652<='9')||LA31_652=='_'||(LA31_652>='a' && LA31_652<='z')) ) {
                                                    alt31=187;
                                                }
                                                else {
                                                    alt31=119;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'o':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'd':
                    {
                    int LA31_203 = input.LA(4);

                    if ( (LA31_203=='e') ) {
                        int LA31_309 = input.LA(5);

                        if ( (LA31_309=='r') ) {
                            int LA31_414 = input.LA(6);

                            if ( (LA31_414=='$'||(LA31_414>='0' && LA31_414<='9')||LA31_414=='_'||(LA31_414>='a' && LA31_414<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=52;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case '$':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt31=187;
                    }
                    break;
                default:
                    alt31=8;}

                }
                break;
            case 'u':
                {
                int LA31_82 = input.LA(3);

                if ( (LA31_82=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA31_310 = input.LA(5);

                        if ( (LA31_310=='r') ) {
                            int LA31_415 = input.LA(6);

                            if ( (LA31_415=='$'||(LA31_415>='0' && LA31_415<='9')||LA31_415=='_'||(LA31_415>='a' && LA31_415<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=31;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    case 'p':
                        {
                        int LA31_311 = input.LA(5);

                        if ( (LA31_311=='u') ) {
                            int LA31_416 = input.LA(6);

                            if ( (LA31_416=='t') ) {
                                int LA31_501 = input.LA(7);

                                if ( (LA31_501=='$'||(LA31_501>='0' && LA31_501<='9')||LA31_501=='_'||(LA31_501>='a' && LA31_501<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=46;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    default:
                        alt31=187;}

                }
                else {
                    alt31=187;}
                }
                break;
            case 'n':
                {
                int LA31_83 = input.LA(3);

                if ( (LA31_83=='$'||(LA31_83>='0' && LA31_83<='9')||LA31_83=='_'||(LA31_83>='a' && LA31_83<='z')) ) {
                    alt31=187;
                }
                else {
                    alt31=37;}
                }
                break;
            case 'f':
                {
                int LA31_84 = input.LA(3);

                if ( (LA31_84=='f') ) {
                    int LA31_207 = input.LA(4);

                    if ( (LA31_207=='s') ) {
                        int LA31_312 = input.LA(5);

                        if ( (LA31_312=='e') ) {
                            int LA31_417 = input.LA(6);

                            if ( (LA31_417=='t') ) {
                                int LA31_502 = input.LA(7);

                                if ( (LA31_502=='$'||(LA31_502>='0' && LA31_502<='9')||LA31_502=='_'||(LA31_502>='a' && LA31_502<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=106;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'd':
                    {
                    int LA31_208 = input.LA(4);

                    if ( (LA31_208=='$'||(LA31_208>='0' && LA31_208<='9')||LA31_208=='_'||(LA31_208>='a' && LA31_208<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=9;}
                    }
                    break;
                case 'y':
                    {
                    int LA31_209 = input.LA(4);

                    if ( (LA31_209=='$'||(LA31_209>='0' && LA31_209<='9')||LA31_209=='_'||(LA31_209>='a' && LA31_209<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=44;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 's':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA31_210 = input.LA(4);

                    if ( (LA31_210=='$'||(LA31_210>='0' && LA31_210<='9')||LA31_210=='_'||(LA31_210>='a' && LA31_210<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=53;}
                    }
                    break;
                case '$':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '_':
                case 'a':
                case 'b':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt31=187;
                    }
                    break;
                default:
                    alt31=14;}

                }
                break;
            case 'v':
                {
                switch ( input.LA(3) ) {
                case 'g':
                    {
                    int LA31_212 = input.LA(4);

                    if ( (LA31_212=='$'||(LA31_212>='0' && LA31_212<='9')||LA31_212=='_'||(LA31_212>='a' && LA31_212<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=16;}
                    }
                    break;
                case 'e':
                    {
                    int LA31_213 = input.LA(4);

                    if ( (LA31_213=='d') ) {
                        int LA31_317 = input.LA(5);

                        if ( (LA31_317=='e') ) {
                            int LA31_418 = input.LA(6);

                            if ( (LA31_418=='v') ) {
                                int LA31_503 = input.LA(7);

                                if ( (LA31_503=='$'||(LA31_503>='0' && LA31_503<='9')||LA31_503=='_'||(LA31_503>='a' && LA31_503<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=22;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'l':
                {
                int LA31_88 = input.LA(3);

                if ( (LA31_88=='l') ) {
                    int LA31_214 = input.LA(4);

                    if ( (LA31_214=='$'||(LA31_214>='0' && LA31_214<='9')||LA31_214=='_'||(LA31_214>='a' && LA31_214<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=43;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 't':
                {
                int LA31_89 = input.LA(3);

                if ( (LA31_89=='$'||(LA31_89>='0' && LA31_89<='9')||LA31_89=='_'||(LA31_89>='a' && LA31_89<='z')) ) {
                    alt31=187;
                }
                else {
                    alt31=82;}
                }
                break;
            case 'f':
                {
                int LA31_90 = input.LA(3);

                if ( (LA31_90=='t') ) {
                    int LA31_216 = input.LA(4);

                    if ( (LA31_216=='e') ) {
                        int LA31_319 = input.LA(5);

                        if ( (LA31_319=='r') ) {
                            int LA31_419 = input.LA(6);

                            if ( (LA31_419=='$'||(LA31_419>='0' && LA31_419<='9')||LA31_419=='_'||(LA31_419>='a' && LA31_419<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=113;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA31_91 = input.LA(3);

                if ( (LA31_91=='t') ) {
                    int LA31_217 = input.LA(4);

                    if ( (LA31_217=='$'||(LA31_217>='0' && LA31_217<='9')||LA31_217=='_'||(LA31_217>='a' && LA31_217<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=10;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'u':
                {
                int LA31_92 = input.LA(3);

                if ( (LA31_92=='l') ) {
                    int LA31_218 = input.LA(4);

                    if ( (LA31_218=='l') ) {
                        int LA31_321 = input.LA(5);

                        if ( (LA31_321=='$'||(LA31_321>='0' && LA31_321<='9')||LA31_321=='_'||(LA31_321>='a' && LA31_321<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=104;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'e':
                {
                int LA31_93 = input.LA(3);

                if ( (LA31_93=='w') ) {
                    int LA31_219 = input.LA(4);

                    if ( (LA31_219=='$'||(LA31_219>='0' && LA31_219<='9')||LA31_219=='_'||(LA31_219>='a' && LA31_219<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=120;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA31_94 = input.LA(3);

                if ( (LA31_94=='m') ) {
                    int LA31_220 = input.LA(4);

                    if ( (LA31_220=='$'||(LA31_220>='0' && LA31_220<='9')||LA31_220=='_'||(LA31_220>='a' && LA31_220<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=15;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 't':
                {
                switch ( input.LA(3) ) {
                case 'd':
                    {
                    int LA31_221 = input.LA(4);

                    if ( (LA31_221=='d') ) {
                        int LA31_324 = input.LA(5);

                        if ( (LA31_324=='e') ) {
                            int LA31_421 = input.LA(6);

                            if ( (LA31_421=='v') ) {
                                int LA31_505 = input.LA(7);

                                if ( (LA31_505=='$'||(LA31_505>='0' && LA31_505<='9')||LA31_505=='_'||(LA31_505>='a' && LA31_505<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=21;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'a':
                    {
                    int LA31_222 = input.LA(4);

                    if ( (LA31_222=='r') ) {
                        int LA31_325 = input.LA(5);

                        if ( (LA31_325=='t') ) {
                            int LA31_422 = input.LA(6);

                            if ( (LA31_422=='$'||(LA31_422>='0' && LA31_422<='9')||LA31_422=='_'||(LA31_422>='a' && LA31_422<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=121;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA31_223 = input.LA(4);

                    if ( (LA31_223=='e') ) {
                        int LA31_326 = input.LA(5);

                        if ( (LA31_326=='c') ) {
                            int LA31_423 = input.LA(6);

                            if ( (LA31_423=='t') ) {
                                int LA31_507 = input.LA(7);

                                if ( (LA31_507=='$'||(LA31_507>='0' && LA31_507<='9')||LA31_507=='_'||(LA31_507>='a' && LA31_507<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=24;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 't':
                    {
                    int LA31_224 = input.LA(4);

                    if ( (LA31_224=='$'||(LA31_224>='0' && LA31_224<='9')||LA31_224=='_'||(LA31_224>='a' && LA31_224<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=79;}
                    }
                    break;
                case 'c':
                    {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA31_328 = input.LA(5);

                        if ( (LA31_328=='n') ) {
                            int LA31_424 = input.LA(6);

                            if ( (LA31_424=='d') ) {
                                switch ( input.LA(7) ) {
                                case 's':
                                    {
                                    int LA31_568 = input.LA(8);

                                    if ( (LA31_568=='$'||(LA31_568>='0' && LA31_568<='9')||LA31_568=='_'||(LA31_568>='a' && LA31_568<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=98;}
                                    }
                                    break;
                                case '$':
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    alt31=187;
                                    }
                                    break;
                                default:
                                    alt31=97;}

                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    case '$':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt31=187;
                        }
                        break;
                    default:
                        alt31=96;}

                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'o':
                {
                int LA31_97 = input.LA(3);

                if ( (LA31_97=='m') ) {
                    int LA31_226 = input.LA(4);

                    if ( (LA31_226=='e') ) {
                        int LA31_330 = input.LA(5);

                        if ( (LA31_330=='$'||(LA31_330>='0' && LA31_330<='9')||LA31_330=='_'||(LA31_330>='a' && LA31_330<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=45;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'c':
                {
                int LA31_98 = input.LA(3);

                if ( (LA31_98=='h') ) {
                    int LA31_227 = input.LA(4);

                    if ( (LA31_227=='e') ) {
                        int LA31_331 = input.LA(5);

                        if ( (LA31_331=='m') ) {
                            int LA31_426 = input.LA(6);

                            if ( (LA31_426=='a') ) {
                                int LA31_509 = input.LA(7);

                                if ( (LA31_509=='$'||(LA31_509>='0' && LA31_509<='9')||LA31_509=='_'||(LA31_509>='a' && LA31_509<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=58;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'q':
                {
                int LA31_99 = input.LA(3);

                if ( (LA31_99=='l') ) {
                    int LA31_228 = input.LA(4);

                    if ( (LA31_228=='$'||(LA31_228>='0' && LA31_228<='9')||LA31_228=='_'||(LA31_228>='a' && LA31_228<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=63;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'n':
                {
                int LA31_100 = input.LA(3);

                if ( (LA31_100=='a') ) {
                    int LA31_229 = input.LA(4);

                    if ( (LA31_229=='p') ) {
                        int LA31_333 = input.LA(5);

                        if ( (LA31_333=='s') ) {
                            int LA31_427 = input.LA(6);

                            if ( (LA31_427=='h') ) {
                                int LA31_510 = input.LA(7);

                                if ( (LA31_510=='o') ) {
                                    int LA31_571 = input.LA(8);

                                    if ( (LA31_571=='t') ) {
                                        int LA31_611 = input.LA(9);

                                        if ( (LA31_611=='$'||(LA31_611>='0' && LA31_611<='9')||LA31_611=='_'||(LA31_611>='a' && LA31_611<='z')) ) {
                                            alt31=187;
                                        }
                                        else {
                                            alt31=78;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'm':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'x':
                    {
                    int LA31_230 = input.LA(4);

                    if ( (LA31_230=='$'||(LA31_230>='0' && LA31_230<='9')||LA31_230=='_'||(LA31_230>='a' && LA31_230<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=17;}
                    }
                    break;
                case 't':
                    {
                    int LA31_231 = input.LA(4);

                    if ( (LA31_231=='c') ) {
                        int LA31_335 = input.LA(5);

                        if ( (LA31_335=='h') ) {
                            switch ( input.LA(6) ) {
                            case '_':
                                {
                                int LA31_511 = input.LA(7);

                                if ( (LA31_511=='r') ) {
                                    int LA31_572 = input.LA(8);

                                    if ( (LA31_572=='e') ) {
                                        int LA31_612 = input.LA(9);

                                        if ( (LA31_612=='c') ) {
                                            int LA31_636 = input.LA(10);

                                            if ( (LA31_636=='o') ) {
                                                int LA31_653 = input.LA(11);

                                                if ( (LA31_653=='g') ) {
                                                    int LA31_665 = input.LA(12);

                                                    if ( (LA31_665=='n') ) {
                                                        int LA31_673 = input.LA(13);

                                                        if ( (LA31_673=='i') ) {
                                                            int LA31_679 = input.LA(14);

                                                            if ( (LA31_679=='z') ) {
                                                                int LA31_683 = input.LA(15);

                                                                if ( (LA31_683=='e') ) {
                                                                    int LA31_686 = input.LA(16);

                                                                    if ( (LA31_686=='$'||(LA31_686>='0' && LA31_686<='9')||LA31_686=='_'||(LA31_686>='a' && LA31_686<='z')) ) {
                                                                        alt31=187;
                                                                    }
                                                                    else {
                                                                        alt31=108;}
                                                                }
                                                                else {
                                                                    alt31=187;}
                                                            }
                                                            else {
                                                                alt31=187;}
                                                        }
                                                        else {
                                                            alt31=187;}
                                                    }
                                                    else {
                                                        alt31=187;}
                                                }
                                                else {
                                                    alt31=187;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                                }
                                break;
                            case 'e':
                                {
                                switch ( input.LA(7) ) {
                                case 's':
                                    {
                                    int LA31_573 = input.LA(8);

                                    if ( (LA31_573=='$'||(LA31_573>='0' && LA31_573<='9')||LA31_573=='_'||(LA31_573>='a' && LA31_573<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=112;}
                                    }
                                    break;
                                case 'd':
                                    {
                                    int LA31_574 = input.LA(8);

                                    if ( (LA31_574=='$'||(LA31_574>='0' && LA31_574<='9')||LA31_574=='_'||(LA31_574>='a' && LA31_574<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=118;}
                                    }
                                    break;
                                default:
                                    alt31=187;}

                                }
                                break;
                            default:
                                alt31=187;}

                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'i':
                {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    switch ( input.LA(4) ) {
                    case 'u':
                        {
                        int LA31_336 = input.LA(5);

                        if ( (LA31_336=='t') ) {
                            int LA31_429 = input.LA(6);

                            if ( (LA31_429=='e') ) {
                                switch ( input.LA(7) ) {
                                case 's':
                                    {
                                    int LA31_575 = input.LA(8);

                                    if ( (LA31_575=='$'||(LA31_575>='0' && LA31_575<='9')||LA31_575=='_'||(LA31_575>='a' && LA31_575<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=95;}
                                    }
                                    break;
                                case '$':
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    alt31=187;
                                    }
                                    break;
                                default:
                                    alt31=94;}

                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                        }
                        break;
                    case '$':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt31=187;
                        }
                        break;
                    default:
                        alt31=18;}

                    }
                    break;
                case 'l':
                    {
                    int LA31_233 = input.LA(4);

                    if ( (LA31_233=='l') ) {
                        int LA31_338 = input.LA(5);

                        if ( (LA31_338=='i') ) {
                            int LA31_430 = input.LA(6);

                            if ( (LA31_430=='s') ) {
                                int LA31_514 = input.LA(7);

                                if ( (LA31_514=='e') ) {
                                    int LA31_577 = input.LA(8);

                                    if ( (LA31_577=='c') ) {
                                        int LA31_616 = input.LA(9);

                                        if ( (LA31_616=='o') ) {
                                            int LA31_637 = input.LA(10);

                                            if ( (LA31_637=='n') ) {
                                                int LA31_654 = input.LA(11);

                                                if ( (LA31_654=='d') ) {
                                                    switch ( input.LA(12) ) {
                                                    case 's':
                                                        {
                                                        int LA31_674 = input.LA(13);

                                                        if ( (LA31_674=='$'||(LA31_674>='0' && LA31_674<='9')||LA31_674=='_'||(LA31_674>='a' && LA31_674<='z')) ) {
                                                            alt31=187;
                                                        }
                                                        else {
                                                            alt31=101;}
                                                        }
                                                        break;
                                                    case '$':
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                    case '_':
                                                    case 'a':
                                                    case 'b':
                                                    case 'c':
                                                    case 'd':
                                                    case 'e':
                                                    case 'f':
                                                    case 'g':
                                                    case 'h':
                                                    case 'i':
                                                    case 'j':
                                                    case 'k':
                                                    case 'l':
                                                    case 'm':
                                                    case 'n':
                                                    case 'o':
                                                    case 'p':
                                                    case 'q':
                                                    case 'r':
                                                    case 't':
                                                    case 'u':
                                                    case 'v':
                                                    case 'w':
                                                    case 'x':
                                                    case 'y':
                                                    case 'z':
                                                        {
                                                        alt31=187;
                                                        }
                                                        break;
                                                    default:
                                                        alt31=100;}

                                                }
                                                else {
                                                    alt31=187;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'd':
                    {
                    int LA31_234 = input.LA(4);

                    if ( (LA31_234=='i') ) {
                        int LA31_339 = input.LA(5);

                        if ( (LA31_339=='a') ) {
                            int LA31_431 = input.LA(6);

                            if ( (LA31_431=='n') ) {
                                int LA31_515 = input.LA(7);

                                if ( (LA31_515=='$'||(LA31_515>='0' && LA31_515<='9')||LA31_515=='_'||(LA31_515>='a' && LA31_515<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=20;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 't':
                    {
                    int LA31_235 = input.LA(4);

                    if ( (LA31_235=='a') ) {
                        int LA31_340 = input.LA(5);

                        if ( (LA31_340=='d') ) {
                            int LA31_432 = input.LA(6);

                            if ( (LA31_432=='a') ) {
                                int LA31_516 = input.LA(7);

                                if ( (LA31_516=='t') ) {
                                    int LA31_579 = input.LA(8);

                                    if ( (LA31_579=='a') ) {
                                        int LA31_617 = input.LA(9);

                                        if ( (LA31_617=='s') ) {
                                            int LA31_638 = input.LA(10);

                                            if ( (LA31_638=='q') ) {
                                                int LA31_655 = input.LA(11);

                                                if ( (LA31_655=='l') ) {
                                                    int LA31_667 = input.LA(12);

                                                    if ( (LA31_667=='$'||(LA31_667>='0' && LA31_667<='9')||LA31_667=='_'||(LA31_667>='a' && LA31_667<='z')) ) {
                                                        alt31=187;
                                                    }
                                                    else {
                                                        alt31=64;}
                                                }
                                                else {
                                                    alt31=187;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'a':
                    {
                    int LA31_236 = input.LA(4);

                    if ( (LA31_236=='s') ) {
                        int LA31_341 = input.LA(5);

                        if ( (LA31_341=='u') ) {
                            int LA31_433 = input.LA(6);

                            if ( (LA31_433=='r') ) {
                                int LA31_517 = input.LA(7);

                                if ( (LA31_517=='e') ) {
                                    int LA31_580 = input.LA(8);

                                    if ( (LA31_580=='s') ) {
                                        int LA31_618 = input.LA(9);

                                        if ( (LA31_618=='$'||(LA31_618>='0' && LA31_618<='9')||LA31_618=='_'||(LA31_618>='a' && LA31_618<='z')) ) {
                                            alt31=187;
                                        }
                                        else {
                                            alt31=109;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'r':
                    {
                    int LA31_237 = input.LA(4);

                    if ( (LA31_237=='g') ) {
                        int LA31_342 = input.LA(5);

                        if ( (LA31_342=='e') ) {
                            int LA31_434 = input.LA(6);

                            if ( (LA31_434=='$'||(LA31_434>='0' && LA31_434<='9')||LA31_434=='_'||(LA31_434>='a' && LA31_434<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=117;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'o':
                {
                int LA31_104 = input.LA(3);

                if ( (LA31_104=='n') ) {
                    int LA31_238 = input.LA(4);

                    if ( (LA31_238=='t') ) {
                        int LA31_343 = input.LA(5);

                        if ( (LA31_343=='h') ) {
                            switch ( input.LA(6) ) {
                            case 's':
                                {
                                int LA31_519 = input.LA(7);

                                if ( (LA31_519=='$'||(LA31_519>='0' && LA31_519<='9')||LA31_519=='_'||(LA31_519>='a' && LA31_519<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=87;}
                                }
                                break;
                            case '$':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case '_':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                                {
                                alt31=187;
                                }
                                break;
                            default:
                                alt31=86;}

                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 's':
                {
                int LA31_105 = input.LA(3);

                if ( (LA31_105=='e') ) {
                    int LA31_239 = input.LA(4);

                    if ( (LA31_239=='c') ) {
                        int LA31_344 = input.LA(5);

                        if ( (LA31_344=='$'||(LA31_344>='0' && LA31_344<='9')||LA31_344=='_'||(LA31_344>='a' && LA31_344<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=99;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA31_106 = input.LA(3);

                if ( (LA31_106=='e') ) {
                    int LA31_240 = input.LA(4);

                    if ( (LA31_240=='n') ) {
                        int LA31_345 = input.LA(5);

                        if ( (LA31_345=='$'||(LA31_345>='0' && LA31_345<='9')||LA31_345=='_'||(LA31_345>='a' && LA31_345<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=28;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'y':
                {
                int LA31_107 = input.LA(3);

                if ( (LA31_107=='p') ) {
                    int LA31_241 = input.LA(4);

                    if ( (LA31_241=='e') ) {
                        int LA31_346 = input.LA(5);

                        if ( (LA31_346=='o') ) {
                            int LA31_438 = input.LA(6);

                            if ( (LA31_438=='f') ) {
                                int LA31_521 = input.LA(7);

                                if ( (LA31_521=='$'||(LA31_521>='0' && LA31_521<='9')||LA31_521=='_'||(LA31_521>='a' && LA31_521<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=74;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'r':
                {
                int LA31_108 = input.LA(3);

                if ( (LA31_108=='u') ) {
                    int LA31_242 = input.LA(4);

                    if ( (LA31_242=='e') ) {
                        int LA31_347 = input.LA(5);

                        if ( (LA31_347=='$'||(LA31_347>='0' && LA31_347<='9')||LA31_347=='_'||(LA31_347>='a' && LA31_347<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=102;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'e':
                {
                int LA31_109 = input.LA(3);

                if ( (LA31_109=='r') ) {
                    int LA31_243 = input.LA(4);

                    if ( (LA31_243=='m') ) {
                        int LA31_348 = input.LA(5);

                        if ( (LA31_348=='i') ) {
                            int LA31_440 = input.LA(6);

                            if ( (LA31_440=='n') ) {
                                int LA31_522 = input.LA(7);

                                if ( (LA31_522=='a') ) {
                                    int LA31_583 = input.LA(8);

                                    if ( (LA31_583=='t') ) {
                                        int LA31_619 = input.LA(9);

                                        if ( (LA31_619=='e') ) {
                                            int LA31_640 = input.LA(10);

                                            if ( (LA31_640=='d') ) {
                                                int LA31_656 = input.LA(11);

                                                if ( (LA31_656=='$'||(LA31_656>='0' && LA31_656<='9')||LA31_656=='_'||(LA31_656>='a' && LA31_656<='z')) ) {
                                                    alt31=187;
                                                }
                                                else {
                                                    alt31=124;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA31_110 = input.LA(3);

                if ( (LA31_110=='o') ) {
                    int LA31_244 = input.LA(4);

                    if ( (LA31_244=='m') ) {
                        int LA31_349 = input.LA(5);

                        if ( (LA31_349=='$'||(LA31_349>='0' && LA31_349<='9')||LA31_349=='_'||(LA31_349>='a' && LA31_349<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=30;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'u':
                {
                int LA31_111 = input.LA(3);

                if ( (LA31_111=='l') ) {
                    int LA31_245 = input.LA(4);

                    if ( (LA31_245=='l') ) {
                        int LA31_350 = input.LA(5);

                        if ( (LA31_350=='$'||(LA31_350>='0' && LA31_350<='9')||LA31_350=='_'||(LA31_350>='a' && LA31_350<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=36;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'i':
                {
                int LA31_112 = input.LA(3);

                if ( (LA31_112=='r') ) {
                    int LA31_246 = input.LA(4);

                    if ( (LA31_246=='s') ) {
                        int LA31_351 = input.LA(5);

                        if ( (LA31_351=='t') ) {
                            int LA31_443 = input.LA(6);

                            if ( (LA31_443=='$'||(LA31_443>='0' && LA31_443<='9')||LA31_443=='_'||(LA31_443>='a' && LA31_443<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=48;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'a':
                {
                int LA31_113 = input.LA(3);

                if ( (LA31_113=='l') ) {
                    int LA31_247 = input.LA(4);

                    if ( (LA31_247=='s') ) {
                        int LA31_352 = input.LA(5);

                        if ( (LA31_352=='e') ) {
                            int LA31_444 = input.LA(6);

                            if ( (LA31_444=='$'||(LA31_444>='0' && LA31_444<='9')||LA31_444=='_'||(LA31_444>='a' && LA31_444<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=103;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'o':
                {
                int LA31_114 = input.LA(3);

                if ( (LA31_114=='r') ) {
                    int LA31_248 = input.LA(4);

                    if ( (LA31_248=='$'||(LA31_248>='0' && LA31_248<='9')||LA31_248=='_'||(LA31_248>='a' && LA31_248<='z')) ) {
                        alt31=187;
                    }
                    else {
                        alt31=114;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'j':
            {
            int LA31_15 = input.LA(2);

            if ( (LA31_15=='o') ) {
                int LA31_115 = input.LA(3);

                if ( (LA31_115=='i') ) {
                    int LA31_249 = input.LA(4);

                    if ( (LA31_249=='n') ) {
                        int LA31_354 = input.LA(5);

                        if ( (LA31_354=='$'||(LA31_354>='0' && LA31_354<='9')||LA31_354=='_'||(LA31_354>='a' && LA31_354<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=33;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
            }
            else {
                alt31=187;}
            }
            break;
        case 'g':
            {
            int LA31_16 = input.LA(2);

            if ( (LA31_16=='r') ) {
                int LA31_116 = input.LA(3);

                if ( (LA31_116=='o') ) {
                    int LA31_250 = input.LA(4);

                    if ( (LA31_250=='u') ) {
                        int LA31_355 = input.LA(5);

                        if ( (LA31_355=='p') ) {
                            int LA31_446 = input.LA(6);

                            if ( (LA31_446=='$'||(LA31_446>='0' && LA31_446<='9')||LA31_446=='_'||(LA31_446>='a' && LA31_446<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=40;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
            }
            else {
                alt31=187;}
            }
            break;
        case 'h':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA31_117 = input.LA(3);

                if ( (LA31_117=='v') ) {
                    int LA31_251 = input.LA(4);

                    if ( (LA31_251=='i') ) {
                        int LA31_356 = input.LA(5);

                        if ( (LA31_356=='n') ) {
                            int LA31_447 = input.LA(6);

                            if ( (LA31_447=='g') ) {
                                int LA31_526 = input.LA(7);

                                if ( (LA31_526=='$'||(LA31_526>='0' && LA31_526<='9')||LA31_526=='_'||(LA31_526>='a' && LA31_526<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=41;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'o':
                {
                int LA31_118 = input.LA(3);

                if ( (LA31_118=='u') ) {
                    int LA31_252 = input.LA(4);

                    if ( (LA31_252=='r') ) {
                        switch ( input.LA(5) ) {
                        case 's':
                            {
                            int LA31_448 = input.LA(6);

                            if ( (LA31_448=='$'||(LA31_448>='0' && LA31_448<='9')||LA31_448=='_'||(LA31_448>='a' && LA31_448<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=93;}
                            }
                            break;
                        case '$':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt31=187;
                            }
                            break;
                        default:
                            alt31=92;}

                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA31_119 = input.LA(3);

                if ( (LA31_119=='s') ) {
                    int LA31_253 = input.LA(4);

                    if ( (LA31_253=='t') ) {
                        int LA31_358 = input.LA(5);

                        if ( (LA31_358=='i') ) {
                            int LA31_450 = input.LA(6);

                            if ( (LA31_450=='n') ) {
                                int LA31_528 = input.LA(7);

                                if ( (LA31_528=='c') ) {
                                    int LA31_585 = input.LA(8);

                                    if ( (LA31_585=='t') ) {
                                        int LA31_620 = input.LA(9);

                                        if ( (LA31_620=='$'||(LA31_620>='0' && LA31_620<='9')||LA31_620=='_'||(LA31_620>='a' && LA31_620<='z')) ) {
                                            alt31=187;
                                        }
                                        else {
                                            alt31=42;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA31_254 = input.LA(4);

                    if ( (LA31_254=='c') ) {
                        int LA31_359 = input.LA(5);

                        if ( (LA31_359=='$'||(LA31_359>='0' && LA31_359<='9')||LA31_359=='_'||(LA31_359>='a' && LA31_359<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=54;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'l':
                    {
                    int LA31_255 = input.LA(4);

                    if ( (LA31_255=='e') ) {
                        int LA31_360 = input.LA(5);

                        if ( (LA31_360=='t') ) {
                            int LA31_452 = input.LA(6);

                            if ( (LA31_452=='e') ) {
                                int LA31_529 = input.LA(7);

                                if ( (LA31_529=='$'||(LA31_529>='0' && LA31_529<='9')||LA31_529=='_'||(LA31_529>='a' && LA31_529<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=77;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'f':
                    {
                    int LA31_256 = input.LA(4);

                    if ( (LA31_256=='i') ) {
                        int LA31_361 = input.LA(5);

                        if ( (LA31_361=='n') ) {
                            int LA31_453 = input.LA(6);

                            if ( (LA31_453=='e') ) {
                                int LA31_530 = input.LA(7);

                                if ( (LA31_530=='$'||(LA31_530>='0' && LA31_530<='9')||LA31_530=='_'||(LA31_530>='a' && LA31_530<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=110;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'a':
                {
                int LA31_121 = input.LA(3);

                if ( (LA31_121=='y') ) {
                    switch ( input.LA(4) ) {
                    case 's':
                        {
                        int LA31_362 = input.LA(5);

                        if ( (LA31_362=='$'||(LA31_362>='0' && LA31_362<='9')||LA31_362=='_'||(LA31_362>='a' && LA31_362<='z')) ) {
                            alt31=187;
                        }
                        else {
                            alt31=91;}
                        }
                        break;
                    case '$':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt31=187;
                        }
                        break;
                    default:
                        alt31=90;}

                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'u':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA31_258 = input.LA(4);

                    if ( (LA31_258=='d') ) {
                        int LA31_364 = input.LA(5);

                        if ( (LA31_364=='i') ) {
                            int LA31_455 = input.LA(6);

                            if ( (LA31_455=='r') ) {
                                int LA31_531 = input.LA(7);

                                if ( (LA31_531=='e') ) {
                                    int LA31_588 = input.LA(8);

                                    if ( (LA31_588=='c') ) {
                                        int LA31_621 = input.LA(9);

                                        if ( (LA31_621=='t') ) {
                                            int LA31_642 = input.LA(10);

                                            if ( (LA31_642=='i') ) {
                                                int LA31_657 = input.LA(11);

                                                if ( (LA31_657=='o') ) {
                                                    int LA31_669 = input.LA(12);

                                                    if ( (LA31_669=='n') ) {
                                                        int LA31_677 = input.LA(13);

                                                        if ( (LA31_677=='a') ) {
                                                            int LA31_681 = input.LA(14);

                                                            if ( (LA31_681=='l') ) {
                                                                int LA31_684 = input.LA(15);

                                                                if ( (LA31_684=='$'||(LA31_684>='0' && LA31_684<='9')||LA31_684=='_'||(LA31_684>='a' && LA31_684<='z')) ) {
                                                                    alt31=187;
                                                                }
                                                                else {
                                                                    alt31=59;}
                                                            }
                                                            else {
                                                                alt31=187;}
                                                        }
                                                        else {
                                                            alt31=187;}
                                                    }
                                                    else {
                                                        alt31=187;}
                                                }
                                                else {
                                                    alt31=187;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 't':
                    {
                    int LA31_259 = input.LA(4);

                    if ( (LA31_259=='i') ) {
                        int LA31_365 = input.LA(5);

                        if ( (LA31_365=='l') ) {
                            int LA31_456 = input.LA(6);

                            if ( (LA31_456=='$'||(LA31_456>='0' && LA31_456<='9')||LA31_456=='_'||(LA31_456>='a' && LA31_456<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=81;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'p':
                {
                int LA31_123 = input.LA(3);

                if ( (LA31_123=='d') ) {
                    int LA31_260 = input.LA(4);

                    if ( (LA31_260=='a') ) {
                        int LA31_366 = input.LA(5);

                        if ( (LA31_366=='t') ) {
                            int LA31_457 = input.LA(6);

                            if ( (LA31_457=='e') ) {
                                int LA31_533 = input.LA(7);

                                if ( (LA31_533=='$'||(LA31_533>='0' && LA31_533<='9')||LA31_533=='_'||(LA31_533>='a' && LA31_533<='z')) ) {
                                    alt31=187;
                                }
                                else {
                                    alt31=107;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            case 's':
                {
                int LA31_124 = input.LA(3);

                if ( (LA31_124=='i') ) {
                    int LA31_261 = input.LA(4);

                    if ( (LA31_261=='n') ) {
                        int LA31_367 = input.LA(5);

                        if ( (LA31_367=='g') ) {
                            int LA31_458 = input.LA(6);

                            if ( (LA31_458=='$'||(LA31_458>='0' && LA31_458<='9')||LA31_458=='_'||(LA31_458>='a' && LA31_458<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=116;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA31_262 = input.LA(4);

                    if ( (LA31_262=='t') ) {
                        int LA31_368 = input.LA(5);

                        if ( (LA31_368=='e') ) {
                            int LA31_459 = input.LA(6);

                            if ( (LA31_459=='r') ) {
                                int LA31_535 = input.LA(7);

                                if ( (LA31_535=='n') ) {
                                    int LA31_590 = input.LA(8);

                                    if ( (LA31_590=='$'||(LA31_590>='0' && LA31_590<='9')||LA31_590=='_'||(LA31_590>='a' && LA31_590<='z')) ) {
                                        alt31=187;
                                    }
                                    else {
                                        alt31=62;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'r':
                    {
                    int LA31_263 = input.LA(4);

                    if ( (LA31_263=='t') ) {
                        int LA31_369 = input.LA(5);

                        if ( (LA31_369=='i') ) {
                            int LA31_460 = input.LA(6);

                            if ( (LA31_460=='t') ) {
                                int LA31_536 = input.LA(7);

                                if ( (LA31_536=='i') ) {
                                    int LA31_591 = input.LA(8);

                                    if ( (LA31_591=='o') ) {
                                        int LA31_623 = input.LA(9);

                                        if ( (LA31_623=='n') ) {
                                            int LA31_643 = input.LA(10);

                                            if ( (LA31_643=='$'||(LA31_643>='0' && LA31_643<='9')||LA31_643=='_'||(LA31_643>='a' && LA31_643<='z')) ) {
                                                alt31=187;
                                            }
                                            else {
                                                alt31=111;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA31_264 = input.LA(4);

                    if ( (LA31_264=='v') ) {
                        switch ( input.LA(5) ) {
                        case 't':
                            {
                            int LA31_461 = input.LA(6);

                            if ( (LA31_461=='a') ) {
                                int LA31_537 = input.LA(7);

                                if ( (LA31_537=='i') ) {
                                    int LA31_592 = input.LA(8);

                                    if ( (LA31_592=='l') ) {
                                        int LA31_624 = input.LA(9);

                                        if ( (LA31_624=='$'||(LA31_624>='0' && LA31_624<='9')||LA31_624=='_'||(LA31_624>='a' && LA31_624<='z')) ) {
                                            alt31=187;
                                        }
                                        else {
                                            alt31=66;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                            }
                            break;
                        case 'c':
                            {
                            int LA31_462 = input.LA(6);

                            if ( (LA31_462=='o') ) {
                                int LA31_538 = input.LA(7);

                                if ( (LA31_538=='u') ) {
                                    int LA31_593 = input.LA(8);

                                    if ( (LA31_593=='n') ) {
                                        int LA31_625 = input.LA(9);

                                        if ( (LA31_625=='t') ) {
                                            int LA31_645 = input.LA(10);

                                            if ( (LA31_645=='$'||(LA31_645>='0' && LA31_645<='9')||LA31_645=='_'||(LA31_645>='a' && LA31_645<='z')) ) {
                                                alt31=187;
                                            }
                                            else {
                                                alt31=67;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                            }
                            break;
                        case 'w':
                            {
                            int LA31_463 = input.LA(6);

                            if ( (LA31_463=='i') ) {
                                int LA31_539 = input.LA(7);

                                if ( (LA31_539=='n') ) {
                                    int LA31_594 = input.LA(8);

                                    if ( (LA31_594=='d') ) {
                                        int LA31_626 = input.LA(9);

                                        if ( (LA31_626=='o') ) {
                                            int LA31_646 = input.LA(10);

                                            if ( (LA31_646=='w') ) {
                                                int LA31_660 = input.LA(11);

                                                if ( (LA31_660=='$'||(LA31_660>='0' && LA31_660<='9')||LA31_660=='_'||(LA31_660>='a' && LA31_660<='z')) ) {
                                                    alt31=187;
                                                }
                                                else {
                                                    alt31=68;}
                                            }
                                            else {
                                                alt31=187;}
                                        }
                                        else {
                                            alt31=187;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                            }
                            break;
                        case '$':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 'u':
                        case 'v':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt31=187;
                            }
                            break;
                        default:
                            alt31=65;}

                    }
                    else {
                        alt31=187;}
                    }
                    break;
                case 'i':
                    {
                    int LA31_265 = input.LA(4);

                    if ( (LA31_265=='o') ) {
                        int LA31_371 = input.LA(5);

                        if ( (LA31_371=='r') ) {
                            int LA31_465 = input.LA(6);

                            if ( (LA31_465=='$'||(LA31_465>='0' && LA31_465<='9')||LA31_465=='_'||(LA31_465>='a' && LA31_465<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=69;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                    }
                    break;
                default:
                    alt31=187;}

                }
                break;
            default:
                alt31=187;}

            }
            break;
        case 'v':
            {
            int LA31_21 = input.LA(2);

            if ( (LA31_21=='a') ) {
                int LA31_127 = input.LA(3);

                if ( (LA31_127=='r') ) {
                    int LA31_266 = input.LA(4);

                    if ( (LA31_266=='i') ) {
                        int LA31_372 = input.LA(5);

                        if ( (LA31_372=='a') ) {
                            int LA31_466 = input.LA(6);

                            if ( (LA31_466=='b') ) {
                                int LA31_541 = input.LA(7);

                                if ( (LA31_541=='l') ) {
                                    int LA31_595 = input.LA(8);

                                    if ( (LA31_595=='e') ) {
                                        int LA31_627 = input.LA(9);

                                        if ( (LA31_627=='$'||(LA31_627>='0' && LA31_627<='9')||LA31_627=='_'||(LA31_627>='a' && LA31_627<='z')) ) {
                                            alt31=187;
                                        }
                                        else {
                                            alt31=80;}
                                    }
                                    else {
                                        alt31=187;}
                                }
                                else {
                                    alt31=187;}
                            }
                            else {
                                alt31=187;}
                        }
                        else {
                            alt31=187;}
                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
            }
            else {
                alt31=187;}
            }
            break;
        case 'y':
            {
            int LA31_22 = input.LA(2);

            if ( (LA31_22=='e') ) {
                int LA31_128 = input.LA(3);

                if ( (LA31_128=='a') ) {
                    int LA31_267 = input.LA(4);

                    if ( (LA31_267=='r') ) {
                        switch ( input.LA(5) ) {
                        case 's':
                            {
                            int LA31_467 = input.LA(6);

                            if ( (LA31_467=='$'||(LA31_467>='0' && LA31_467<='9')||LA31_467=='_'||(LA31_467>='a' && LA31_467<='z')) ) {
                                alt31=187;
                            }
                            else {
                                alt31=85;}
                            }
                            break;
                        case '$':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt31=187;
                            }
                            break;
                        default:
                            alt31=84;}

                    }
                    else {
                        alt31=187;}
                }
                else {
                    alt31=187;}
            }
            else {
                alt31=187;}
            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '[':
                {
                alt31=125;
                }
                break;
            case '>':
                {
                alt31=127;
                }
                break;
            case '=':
                {
                alt31=150;
                }
                break;
            case '-':
                {
                alt31=151;
                }
                break;
            default:
                alt31=149;}

            }
            break;
        case ']':
            {
            int LA31_24 = input.LA(2);

            if ( (LA31_24=='>') ) {
                alt31=126;
            }
            else {
                alt31=135;}
            }
            break;
        case '=':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt31=128;
                }
                break;
            case '=':
                {
                alt31=140;
                }
                break;
            default:
                alt31=129;}

            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt31=130;
                }
                break;
            case '<':
                {
                int LA31_140 = input.LA(3);

                if ( (LA31_140=='=') ) {
                    alt31=163;
                }
                else {
                    alt31=162;}
                }
                break;
            case '=':
                {
                alt31=164;
                }
                break;
            default:
                alt31=165;}

            }
            break;
        case '?':
            {
            alt31=131;
            }
            break;
        case '(':
            {
            alt31=132;
            }
            break;
        case ')':
            {
            alt31=133;
            }
            break;
        case '[':
            {
            alt31=134;
            }
            break;
        case '{':
            {
            alt31=136;
            }
            break;
        case '}':
            {
            alt31=137;
            }
            break;
        case ':':
            {
            alt31=138;
            }
            break;
        case ',':
            {
            alt31=139;
            }
            break;
        case '!':
            {
            int LA31_35 = input.LA(2);

            if ( (LA31_35=='=') ) {
                alt31=143;
            }
            else {
                alt31=141;}
            }
            break;
        case '~':
            {
            alt31=142;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt31=145;
                }
                break;
            case '/':
                {
                alt31=182;
                }
                break;
            case '*':
                {
                alt31=183;
                }
                break;
            default:
                alt31=144;}

            }
            break;
        case '+':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt31=147;
                }
                break;
            case '+':
                {
                alt31=148;
                }
                break;
            default:
                alt31=146;}

            }
            break;
        case '*':
            {
            int LA31_39 = input.LA(2);

            if ( (LA31_39=='=') ) {
                alt31=153;
            }
            else {
                alt31=152;}
            }
            break;
        case '%':
            {
            int LA31_40 = input.LA(2);

            if ( (LA31_40=='=') ) {
                alt31=155;
            }
            else {
                alt31=154;}
            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                switch ( input.LA(3) ) {
                case '=':
                    {
                    alt31=157;
                    }
                    break;
                case '>':
                    {
                    int LA31_271 = input.LA(4);

                    if ( (LA31_271=='=') ) {
                        alt31=159;
                    }
                    else {
                        alt31=158;}
                    }
                    break;
                default:
                    alt31=156;}

                }
                break;
            case '=':
                {
                alt31=160;
                }
                break;
            default:
                alt31=161;}

            }
            break;
        case '^':
            {
            int LA31_42 = input.LA(2);

            if ( (LA31_42=='=') ) {
                alt31=167;
            }
            else {
                alt31=166;}
            }
            break;
        case '|':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt31=169;
                }
                break;
            case '|':
                {
                alt31=170;
                }
                break;
            default:
                alt31=168;}

            }
            break;
        case '&':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt31=172;
                }
                break;
            case '&':
                {
                alt31=173;
                }
                break;
            default:
                alt31=171;}

            }
            break;
        case ';':
            {
            alt31=174;
            }
            break;
        case '.':
            {
            int LA31_46 = input.LA(2);

            if ( ((LA31_46>='0' && LA31_46<='9')) ) {
                alt31=188;
            }
            else {
                alt31=175;}
            }
            break;
        case '\u18FF':
            {
            alt31=176;
            }
            break;
        case '\u18FE':
            {
            alt31=177;
            }
            break;
        case '\u18FD':
            {
            alt31=178;
            }
            break;
        case '\\':
            {
            alt31=179;
            }
            break;
        case '@':
            {
            alt31=180;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt31=181;
            }
            break;
        case '`':
            {
            alt31=184;
            }
            break;
        case '\'':
            {
            alt31=185;
            }
            break;
        case '\"':
            {
            alt31=186;
            }
            break;
        case '$':
        case '_':
        case 'k':
        case 'q':
        case 'x':
        case 'z':
            {
            alt31=187;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt31=188;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 31, 0, input);

            throw nvae;
        }

        switch (alt31) {
            case 1 :
                // EsperEPL2Grammar.g:1:10: CREATE
                {
                mCREATE(); if (state.failed) return ;

                }
                break;
            case 2 :
                // EsperEPL2Grammar.g:1:17: WINDOW
                {
                mWINDOW(); if (state.failed) return ;

                }
                break;
            case 3 :
                // EsperEPL2Grammar.g:1:24: IN_SET
                {
                mIN_SET(); if (state.failed) return ;

                }
                break;
            case 4 :
                // EsperEPL2Grammar.g:1:31: BETWEEN
                {
                mBETWEEN(); if (state.failed) return ;

                }
                break;
            case 5 :
                // EsperEPL2Grammar.g:1:39: LIKE
                {
                mLIKE(); if (state.failed) return ;

                }
                break;
            case 6 :
                // EsperEPL2Grammar.g:1:44: REGEXP
                {
                mREGEXP(); if (state.failed) return ;

                }
                break;
            case 7 :
                // EsperEPL2Grammar.g:1:51: ESCAPE
                {
                mESCAPE(); if (state.failed) return ;

                }
                break;
            case 8 :
                // EsperEPL2Grammar.g:1:58: OR_EXPR
                {
                mOR_EXPR(); if (state.failed) return ;

                }
                break;
            case 9 :
                // EsperEPL2Grammar.g:1:66: AND_EXPR
                {
                mAND_EXPR(); if (state.failed) return ;

                }
                break;
            case 10 :
                // EsperEPL2Grammar.g:1:75: NOT_EXPR
                {
                mNOT_EXPR(); if (state.failed) return ;

                }
                break;
            case 11 :
                // EsperEPL2Grammar.g:1:84: EVERY_EXPR
                {
                mEVERY_EXPR(); if (state.failed) return ;

                }
                break;
            case 12 :
                // EsperEPL2Grammar.g:1:95: EVERY_DISTINCT_EXPR
                {
                mEVERY_DISTINCT_EXPR(); if (state.failed) return ;

                }
                break;
            case 13 :
                // EsperEPL2Grammar.g:1:115: WHERE
                {
                mWHERE(); if (state.failed) return ;

                }
                break;
            case 14 :
                // EsperEPL2Grammar.g:1:121: AS
                {
                mAS(); if (state.failed) return ;

                }
                break;
            case 15 :
                // EsperEPL2Grammar.g:1:124: SUM
                {
                mSUM(); if (state.failed) return ;

                }
                break;
            case 16 :
                // EsperEPL2Grammar.g:1:128: AVG
                {
                mAVG(); if (state.failed) return ;

                }
                break;
            case 17 :
                // EsperEPL2Grammar.g:1:132: MAX
                {
                mMAX(); if (state.failed) return ;

                }
                break;
            case 18 :
                // EsperEPL2Grammar.g:1:136: MIN
                {
                mMIN(); if (state.failed) return ;

                }
                break;
            case 19 :
                // EsperEPL2Grammar.g:1:140: COALESCE
                {
                mCOALESCE(); if (state.failed) return ;

                }
                break;
            case 20 :
                // EsperEPL2Grammar.g:1:149: MEDIAN
                {
                mMEDIAN(); if (state.failed) return ;

                }
                break;
            case 21 :
                // EsperEPL2Grammar.g:1:156: STDDEV
                {
                mSTDDEV(); if (state.failed) return ;

                }
                break;
            case 22 :
                // EsperEPL2Grammar.g:1:163: AVEDEV
                {
                mAVEDEV(); if (state.failed) return ;

                }
                break;
            case 23 :
                // EsperEPL2Grammar.g:1:170: COUNT
                {
                mCOUNT(); if (state.failed) return ;

                }
                break;
            case 24 :
                // EsperEPL2Grammar.g:1:176: SELECT
                {
                mSELECT(); if (state.failed) return ;

                }
                break;
            case 25 :
                // EsperEPL2Grammar.g:1:183: CASE
                {
                mCASE(); if (state.failed) return ;

                }
                break;
            case 26 :
                // EsperEPL2Grammar.g:1:188: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;
            case 27 :
                // EsperEPL2Grammar.g:1:193: WHEN
                {
                mWHEN(); if (state.failed) return ;

                }
                break;
            case 28 :
                // EsperEPL2Grammar.g:1:198: THEN
                {
                mTHEN(); if (state.failed) return ;

                }
                break;
            case 29 :
                // EsperEPL2Grammar.g:1:203: END
                {
                mEND(); if (state.failed) return ;

                }
                break;
            case 30 :
                // EsperEPL2Grammar.g:1:207: FROM
                {
                mFROM(); if (state.failed) return ;

                }
                break;
            case 31 :
                // EsperEPL2Grammar.g:1:212: OUTER
                {
                mOUTER(); if (state.failed) return ;

                }
                break;
            case 32 :
                // EsperEPL2Grammar.g:1:218: INNER
                {
                mINNER(); if (state.failed) return ;

                }
                break;
            case 33 :
                // EsperEPL2Grammar.g:1:224: JOIN
                {
                mJOIN(); if (state.failed) return ;

                }
                break;
            case 34 :
                // EsperEPL2Grammar.g:1:229: LEFT
                {
                mLEFT(); if (state.failed) return ;

                }
                break;
            case 35 :
                // EsperEPL2Grammar.g:1:234: RIGHT
                {
                mRIGHT(); if (state.failed) return ;

                }
                break;
            case 36 :
                // EsperEPL2Grammar.g:1:240: FULL
                {
                mFULL(); if (state.failed) return ;

                }
                break;
            case 37 :
                // EsperEPL2Grammar.g:1:245: ON
                {
                mON(); if (state.failed) return ;

                }
                break;
            case 38 :
                // EsperEPL2Grammar.g:1:248: IS
                {
                mIS(); if (state.failed) return ;

                }
                break;
            case 39 :
                // EsperEPL2Grammar.g:1:251: BY
                {
                mBY(); if (state.failed) return ;

                }
                break;
            case 40 :
                // EsperEPL2Grammar.g:1:254: GROUP
                {
                mGROUP(); if (state.failed) return ;

                }
                break;
            case 41 :
                // EsperEPL2Grammar.g:1:260: HAVING
                {
                mHAVING(); if (state.failed) return ;

                }
                break;
            case 42 :
                // EsperEPL2Grammar.g:1:267: DISTINCT
                {
                mDISTINCT(); if (state.failed) return ;

                }
                break;
            case 43 :
                // EsperEPL2Grammar.g:1:276: ALL
                {
                mALL(); if (state.failed) return ;

                }
                break;
            case 44 :
                // EsperEPL2Grammar.g:1:280: ANY
                {
                mANY(); if (state.failed) return ;

                }
                break;
            case 45 :
                // EsperEPL2Grammar.g:1:284: SOME
                {
                mSOME(); if (state.failed) return ;

                }
                break;
            case 46 :
                // EsperEPL2Grammar.g:1:289: OUTPUT
                {
                mOUTPUT(); if (state.failed) return ;

                }
                break;
            case 47 :
                // EsperEPL2Grammar.g:1:296: EVENTS
                {
                mEVENTS(); if (state.failed) return ;

                }
                break;
            case 48 :
                // EsperEPL2Grammar.g:1:303: FIRST
                {
                mFIRST(); if (state.failed) return ;

                }
                break;
            case 49 :
                // EsperEPL2Grammar.g:1:309: LAST
                {
                mLAST(); if (state.failed) return ;

                }
                break;
            case 50 :
                // EsperEPL2Grammar.g:1:314: INSERT
                {
                mINSERT(); if (state.failed) return ;

                }
                break;
            case 51 :
                // EsperEPL2Grammar.g:1:321: INTO
                {
                mINTO(); if (state.failed) return ;

                }
                break;
            case 52 :
                // EsperEPL2Grammar.g:1:326: ORDER
                {
                mORDER(); if (state.failed) return ;

                }
                break;
            case 53 :
                // EsperEPL2Grammar.g:1:332: ASC
                {
                mASC(); if (state.failed) return ;

                }
                break;
            case 54 :
                // EsperEPL2Grammar.g:1:336: DESC
                {
                mDESC(); if (state.failed) return ;

                }
                break;
            case 55 :
                // EsperEPL2Grammar.g:1:341: RSTREAM
                {
                mRSTREAM(); if (state.failed) return ;

                }
                break;
            case 56 :
                // EsperEPL2Grammar.g:1:349: ISTREAM
                {
                mISTREAM(); if (state.failed) return ;

                }
                break;
            case 57 :
                // EsperEPL2Grammar.g:1:357: IRSTREAM
                {
                mIRSTREAM(); if (state.failed) return ;

                }
                break;
            case 58 :
                // EsperEPL2Grammar.g:1:366: SCHEMA
                {
                mSCHEMA(); if (state.failed) return ;

                }
                break;
            case 59 :
                // EsperEPL2Grammar.g:1:373: UNIDIRECTIONAL
                {
                mUNIDIRECTIONAL(); if (state.failed) return ;

                }
                break;
            case 60 :
                // EsperEPL2Grammar.g:1:388: RETAINUNION
                {
                mRETAINUNION(); if (state.failed) return ;

                }
                break;
            case 61 :
                // EsperEPL2Grammar.g:1:400: RETAININTERSECTION
                {
                mRETAININTERSECTION(); if (state.failed) return ;

                }
                break;
            case 62 :
                // EsperEPL2Grammar.g:1:419: PATTERN
                {
                mPATTERN(); if (state.failed) return ;

                }
                break;
            case 63 :
                // EsperEPL2Grammar.g:1:427: SQL
                {
                mSQL(); if (state.failed) return ;

                }
                break;
            case 64 :
                // EsperEPL2Grammar.g:1:431: METADATASQL
                {
                mMETADATASQL(); if (state.failed) return ;

                }
                break;
            case 65 :
                // EsperEPL2Grammar.g:1:443: PREVIOUS
                {
                mPREVIOUS(); if (state.failed) return ;

                }
                break;
            case 66 :
                // EsperEPL2Grammar.g:1:452: PREVIOUSTAIL
                {
                mPREVIOUSTAIL(); if (state.failed) return ;

                }
                break;
            case 67 :
                // EsperEPL2Grammar.g:1:465: PREVIOUSCOUNT
                {
                mPREVIOUSCOUNT(); if (state.failed) return ;

                }
                break;
            case 68 :
                // EsperEPL2Grammar.g:1:479: PREVIOUSWINDOW
                {
                mPREVIOUSWINDOW(); if (state.failed) return ;

                }
                break;
            case 69 :
                // EsperEPL2Grammar.g:1:494: PRIOR
                {
                mPRIOR(); if (state.failed) return ;

                }
                break;
            case 70 :
                // EsperEPL2Grammar.g:1:500: EXISTS
                {
                mEXISTS(); if (state.failed) return ;

                }
                break;
            case 71 :
                // EsperEPL2Grammar.g:1:507: WEEKDAY
                {
                mWEEKDAY(); if (state.failed) return ;

                }
                break;
            case 72 :
                // EsperEPL2Grammar.g:1:515: LW
                {
                mLW(); if (state.failed) return ;

                }
                break;
            case 73 :
                // EsperEPL2Grammar.g:1:518: INSTANCEOF
                {
                mINSTANCEOF(); if (state.failed) return ;

                }
                break;
            case 74 :
                // EsperEPL2Grammar.g:1:529: TYPEOF
                {
                mTYPEOF(); if (state.failed) return ;

                }
                break;
            case 75 :
                // EsperEPL2Grammar.g:1:536: CAST
                {
                mCAST(); if (state.failed) return ;

                }
                break;
            case 76 :
                // EsperEPL2Grammar.g:1:541: CURRENT_TIMESTAMP
                {
                mCURRENT_TIMESTAMP(); if (state.failed) return ;

                }
                break;
            case 77 :
                // EsperEPL2Grammar.g:1:559: DELETE
                {
                mDELETE(); if (state.failed) return ;

                }
                break;
            case 78 :
                // EsperEPL2Grammar.g:1:566: SNAPSHOT
                {
                mSNAPSHOT(); if (state.failed) return ;

                }
                break;
            case 79 :
                // EsperEPL2Grammar.g:1:575: SET
                {
                mSET(); if (state.failed) return ;

                }
                break;
            case 80 :
                // EsperEPL2Grammar.g:1:579: VARIABLE
                {
                mVARIABLE(); if (state.failed) return ;

                }
                break;
            case 81 :
                // EsperEPL2Grammar.g:1:588: UNTIL
                {
                mUNTIL(); if (state.failed) return ;

                }
                break;
            case 82 :
                // EsperEPL2Grammar.g:1:594: AT
                {
                mAT(); if (state.failed) return ;

                }
                break;
            case 83 :
                // EsperEPL2Grammar.g:1:597: INDEX
                {
                mINDEX(); if (state.failed) return ;

                }
                break;
            case 84 :
                // EsperEPL2Grammar.g:1:603: TIMEPERIOD_YEAR
                {
                mTIMEPERIOD_YEAR(); if (state.failed) return ;

                }
                break;
            case 85 :
                // EsperEPL2Grammar.g:1:619: TIMEPERIOD_YEARS
                {
                mTIMEPERIOD_YEARS(); if (state.failed) return ;

                }
                break;
            case 86 :
                // EsperEPL2Grammar.g:1:636: TIMEPERIOD_MONTH
                {
                mTIMEPERIOD_MONTH(); if (state.failed) return ;

                }
                break;
            case 87 :
                // EsperEPL2Grammar.g:1:653: TIMEPERIOD_MONTHS
                {
                mTIMEPERIOD_MONTHS(); if (state.failed) return ;

                }
                break;
            case 88 :
                // EsperEPL2Grammar.g:1:671: TIMEPERIOD_WEEK
                {
                mTIMEPERIOD_WEEK(); if (state.failed) return ;

                }
                break;
            case 89 :
                // EsperEPL2Grammar.g:1:687: TIMEPERIOD_WEEKS
                {
                mTIMEPERIOD_WEEKS(); if (state.failed) return ;

                }
                break;
            case 90 :
                // EsperEPL2Grammar.g:1:704: TIMEPERIOD_DAY
                {
                mTIMEPERIOD_DAY(); if (state.failed) return ;

                }
                break;
            case 91 :
                // EsperEPL2Grammar.g:1:719: TIMEPERIOD_DAYS
                {
                mTIMEPERIOD_DAYS(); if (state.failed) return ;

                }
                break;
            case 92 :
                // EsperEPL2Grammar.g:1:735: TIMEPERIOD_HOUR
                {
                mTIMEPERIOD_HOUR(); if (state.failed) return ;

                }
                break;
            case 93 :
                // EsperEPL2Grammar.g:1:751: TIMEPERIOD_HOURS
                {
                mTIMEPERIOD_HOURS(); if (state.failed) return ;

                }
                break;
            case 94 :
                // EsperEPL2Grammar.g:1:768: TIMEPERIOD_MINUTE
                {
                mTIMEPERIOD_MINUTE(); if (state.failed) return ;

                }
                break;
            case 95 :
                // EsperEPL2Grammar.g:1:786: TIMEPERIOD_MINUTES
                {
                mTIMEPERIOD_MINUTES(); if (state.failed) return ;

                }
                break;
            case 96 :
                // EsperEPL2Grammar.g:1:805: TIMEPERIOD_SEC
                {
                mTIMEPERIOD_SEC(); if (state.failed) return ;

                }
                break;
            case 97 :
                // EsperEPL2Grammar.g:1:820: TIMEPERIOD_SECOND
                {
                mTIMEPERIOD_SECOND(); if (state.failed) return ;

                }
                break;
            case 98 :
                // EsperEPL2Grammar.g:1:838: TIMEPERIOD_SECONDS
                {
                mTIMEPERIOD_SECONDS(); if (state.failed) return ;

                }
                break;
            case 99 :
                // EsperEPL2Grammar.g:1:857: TIMEPERIOD_MILLISEC
                {
                mTIMEPERIOD_MILLISEC(); if (state.failed) return ;

                }
                break;
            case 100 :
                // EsperEPL2Grammar.g:1:877: TIMEPERIOD_MILLISECOND
                {
                mTIMEPERIOD_MILLISECOND(); if (state.failed) return ;

                }
                break;
            case 101 :
                // EsperEPL2Grammar.g:1:900: TIMEPERIOD_MILLISECONDS
                {
                mTIMEPERIOD_MILLISECONDS(); if (state.failed) return ;

                }
                break;
            case 102 :
                // EsperEPL2Grammar.g:1:924: BOOLEAN_TRUE
                {
                mBOOLEAN_TRUE(); if (state.failed) return ;

                }
                break;
            case 103 :
                // EsperEPL2Grammar.g:1:937: BOOLEAN_FALSE
                {
                mBOOLEAN_FALSE(); if (state.failed) return ;

                }
                break;
            case 104 :
                // EsperEPL2Grammar.g:1:951: VALUE_NULL
                {
                mVALUE_NULL(); if (state.failed) return ;

                }
                break;
            case 105 :
                // EsperEPL2Grammar.g:1:962: ROW_LIMIT_EXPR
                {
                mROW_LIMIT_EXPR(); if (state.failed) return ;

                }
                break;
            case 106 :
                // EsperEPL2Grammar.g:1:977: OFFSET
                {
                mOFFSET(); if (state.failed) return ;

                }
                break;
            case 107 :
                // EsperEPL2Grammar.g:1:984: UPDATE
                {
                mUPDATE(); if (state.failed) return ;

                }
                break;
            case 108 :
                // EsperEPL2Grammar.g:1:991: MATCH_RECOGNIZE
                {
                mMATCH_RECOGNIZE(); if (state.failed) return ;

                }
                break;
            case 109 :
                // EsperEPL2Grammar.g:1:1007: MEASURES
                {
                mMEASURES(); if (state.failed) return ;

                }
                break;
            case 110 :
                // EsperEPL2Grammar.g:1:1016: DEFINE
                {
                mDEFINE(); if (state.failed) return ;

                }
                break;
            case 111 :
                // EsperEPL2Grammar.g:1:1023: PARTITION
                {
                mPARTITION(); if (state.failed) return ;

                }
                break;
            case 112 :
                // EsperEPL2Grammar.g:1:1033: MATCHES
                {
                mMATCHES(); if (state.failed) return ;

                }
                break;
            case 113 :
                // EsperEPL2Grammar.g:1:1041: AFTER
                {
                mAFTER(); if (state.failed) return ;

                }
                break;
            case 114 :
                // EsperEPL2Grammar.g:1:1047: FOR
                {
                mFOR(); if (state.failed) return ;

                }
                break;
            case 115 :
                // EsperEPL2Grammar.g:1:1051: WHILE
                {
                mWHILE(); if (state.failed) return ;

                }
                break;
            case 116 :
                // EsperEPL2Grammar.g:1:1057: USING
                {
                mUSING(); if (state.failed) return ;

                }
                break;
            case 117 :
                // EsperEPL2Grammar.g:1:1063: MERGE
                {
                mMERGE(); if (state.failed) return ;

                }
                break;
            case 118 :
                // EsperEPL2Grammar.g:1:1069: MATCHED
                {
                mMATCHED(); if (state.failed) return ;

                }
                break;
            case 119 :
                // EsperEPL2Grammar.g:1:1077: EXPRESSIONDECL
                {
                mEXPRESSIONDECL(); if (state.failed) return ;

                }
                break;
            case 120 :
                // EsperEPL2Grammar.g:1:1092: NEWKW
                {
                mNEWKW(); if (state.failed) return ;

                }
                break;
            case 121 :
                // EsperEPL2Grammar.g:1:1098: START
                {
                mSTART(); if (state.failed) return ;

                }
                break;
            case 122 :
                // EsperEPL2Grammar.g:1:1104: CONTEXT
                {
                mCONTEXT(); if (state.failed) return ;

                }
                break;
            case 123 :
                // EsperEPL2Grammar.g:1:1112: INITIATED
                {
                mINITIATED(); if (state.failed) return ;

                }
                break;
            case 124 :
                // EsperEPL2Grammar.g:1:1122: TERMINATED
                {
                mTERMINATED(); if (state.failed) return ;

                }
                break;
            case 125 :
                // EsperEPL2Grammar.g:1:1133: FOLLOWMAX_BEGIN
                {
                mFOLLOWMAX_BEGIN(); if (state.failed) return ;

                }
                break;
            case 126 :
                // EsperEPL2Grammar.g:1:1149: FOLLOWMAX_END
                {
                mFOLLOWMAX_END(); if (state.failed) return ;

                }
                break;
            case 127 :
                // EsperEPL2Grammar.g:1:1163: FOLLOWED_BY
                {
                mFOLLOWED_BY(); if (state.failed) return ;

                }
                break;
            case 128 :
                // EsperEPL2Grammar.g:1:1175: GOES
                {
                mGOES(); if (state.failed) return ;

                }
                break;
            case 129 :
                // EsperEPL2Grammar.g:1:1180: EQUALS
                {
                mEQUALS(); if (state.failed) return ;

                }
                break;
            case 130 :
                // EsperEPL2Grammar.g:1:1187: SQL_NE
                {
                mSQL_NE(); if (state.failed) return ;

                }
                break;
            case 131 :
                // EsperEPL2Grammar.g:1:1194: QUESTION
                {
                mQUESTION(); if (state.failed) return ;

                }
                break;
            case 132 :
                // EsperEPL2Grammar.g:1:1203: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 133 :
                // EsperEPL2Grammar.g:1:1210: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 134 :
                // EsperEPL2Grammar.g:1:1217: LBRACK
                {
                mLBRACK(); if (state.failed) return ;

                }
                break;
            case 135 :
                // EsperEPL2Grammar.g:1:1224: RBRACK
                {
                mRBRACK(); if (state.failed) return ;

                }
                break;
            case 136 :
                // EsperEPL2Grammar.g:1:1231: LCURLY
                {
                mLCURLY(); if (state.failed) return ;

                }
                break;
            case 137 :
                // EsperEPL2Grammar.g:1:1238: RCURLY
                {
                mRCURLY(); if (state.failed) return ;

                }
                break;
            case 138 :
                // EsperEPL2Grammar.g:1:1245: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 139 :
                // EsperEPL2Grammar.g:1:1251: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 140 :
                // EsperEPL2Grammar.g:1:1257: EQUAL
                {
                mEQUAL(); if (state.failed) return ;

                }
                break;
            case 141 :
                // EsperEPL2Grammar.g:1:1263: LNOT
                {
                mLNOT(); if (state.failed) return ;

                }
                break;
            case 142 :
                // EsperEPL2Grammar.g:1:1268: BNOT
                {
                mBNOT(); if (state.failed) return ;

                }
                break;
            case 143 :
                // EsperEPL2Grammar.g:1:1273: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;

                }
                break;
            case 144 :
                // EsperEPL2Grammar.g:1:1283: DIV
                {
                mDIV(); if (state.failed) return ;

                }
                break;
            case 145 :
                // EsperEPL2Grammar.g:1:1287: DIV_ASSIGN
                {
                mDIV_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 146 :
                // EsperEPL2Grammar.g:1:1298: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 147 :
                // EsperEPL2Grammar.g:1:1303: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 148 :
                // EsperEPL2Grammar.g:1:1315: INC
                {
                mINC(); if (state.failed) return ;

                }
                break;
            case 149 :
                // EsperEPL2Grammar.g:1:1319: MINUS
                {
                mMINUS(); if (state.failed) return ;

                }
                break;
            case 150 :
                // EsperEPL2Grammar.g:1:1325: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 151 :
                // EsperEPL2Grammar.g:1:1338: DEC
                {
                mDEC(); if (state.failed) return ;

                }
                break;
            case 152 :
                // EsperEPL2Grammar.g:1:1342: STAR
                {
                mSTAR(); if (state.failed) return ;

                }
                break;
            case 153 :
                // EsperEPL2Grammar.g:1:1347: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 154 :
                // EsperEPL2Grammar.g:1:1359: MOD
                {
                mMOD(); if (state.failed) return ;

                }
                break;
            case 155 :
                // EsperEPL2Grammar.g:1:1363: MOD_ASSIGN
                {
                mMOD_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 156 :
                // EsperEPL2Grammar.g:1:1374: SR
                {
                mSR(); if (state.failed) return ;

                }
                break;
            case 157 :
                // EsperEPL2Grammar.g:1:1377: SR_ASSIGN
                {
                mSR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 158 :
                // EsperEPL2Grammar.g:1:1387: BSR
                {
                mBSR(); if (state.failed) return ;

                }
                break;
            case 159 :
                // EsperEPL2Grammar.g:1:1391: BSR_ASSIGN
                {
                mBSR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 160 :
                // EsperEPL2Grammar.g:1:1402: GE
                {
                mGE(); if (state.failed) return ;

                }
                break;
            case 161 :
                // EsperEPL2Grammar.g:1:1405: GT
                {
                mGT(); if (state.failed) return ;

                }
                break;
            case 162 :
                // EsperEPL2Grammar.g:1:1408: SL
                {
                mSL(); if (state.failed) return ;

                }
                break;
            case 163 :
                // EsperEPL2Grammar.g:1:1411: SL_ASSIGN
                {
                mSL_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 164 :
                // EsperEPL2Grammar.g:1:1421: LE
                {
                mLE(); if (state.failed) return ;

                }
                break;
            case 165 :
                // EsperEPL2Grammar.g:1:1424: LT
                {
                mLT(); if (state.failed) return ;

                }
                break;
            case 166 :
                // EsperEPL2Grammar.g:1:1427: BXOR
                {
                mBXOR(); if (state.failed) return ;

                }
                break;
            case 167 :
                // EsperEPL2Grammar.g:1:1432: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 168 :
                // EsperEPL2Grammar.g:1:1444: BOR
                {
                mBOR(); if (state.failed) return ;

                }
                break;
            case 169 :
                // EsperEPL2Grammar.g:1:1448: BOR_ASSIGN
                {
                mBOR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 170 :
                // EsperEPL2Grammar.g:1:1459: LOR
                {
                mLOR(); if (state.failed) return ;

                }
                break;
            case 171 :
                // EsperEPL2Grammar.g:1:1463: BAND
                {
                mBAND(); if (state.failed) return ;

                }
                break;
            case 172 :
                // EsperEPL2Grammar.g:1:1468: BAND_ASSIGN
                {
                mBAND_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 173 :
                // EsperEPL2Grammar.g:1:1480: LAND
                {
                mLAND(); if (state.failed) return ;

                }
                break;
            case 174 :
                // EsperEPL2Grammar.g:1:1485: SEMI
                {
                mSEMI(); if (state.failed) return ;

                }
                break;
            case 175 :
                // EsperEPL2Grammar.g:1:1490: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 176 :
                // EsperEPL2Grammar.g:1:1494: NUM_LONG
                {
                mNUM_LONG(); if (state.failed) return ;

                }
                break;
            case 177 :
                // EsperEPL2Grammar.g:1:1503: NUM_DOUBLE
                {
                mNUM_DOUBLE(); if (state.failed) return ;

                }
                break;
            case 178 :
                // EsperEPL2Grammar.g:1:1514: NUM_FLOAT
                {
                mNUM_FLOAT(); if (state.failed) return ;

                }
                break;
            case 179 :
                // EsperEPL2Grammar.g:1:1524: ESCAPECHAR
                {
                mESCAPECHAR(); if (state.failed) return ;

                }
                break;
            case 180 :
                // EsperEPL2Grammar.g:1:1535: ATCHAR
                {
                mATCHAR(); if (state.failed) return ;

                }
                break;
            case 181 :
                // EsperEPL2Grammar.g:1:1542: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 182 :
                // EsperEPL2Grammar.g:1:1545: SL_COMMENT
                {
                mSL_COMMENT(); if (state.failed) return ;

                }
                break;
            case 183 :
                // EsperEPL2Grammar.g:1:1556: ML_COMMENT
                {
                mML_COMMENT(); if (state.failed) return ;

                }
                break;
            case 184 :
                // EsperEPL2Grammar.g:1:1567: TICKED_STRING_LITERAL
                {
                mTICKED_STRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 185 :
                // EsperEPL2Grammar.g:1:1589: QUOTED_STRING_LITERAL
                {
                mQUOTED_STRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 186 :
                // EsperEPL2Grammar.g:1:1611: STRING_LITERAL
                {
                mSTRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 187 :
                // EsperEPL2Grammar.g:1:1626: IDENT
                {
                mIDENT(); if (state.failed) return ;

                }
                break;
            case 188 :
                // EsperEPL2Grammar.g:1:1632: NUM_INT
                {
                mNUM_INT(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_EsperEPL2Grammar
    public final void synpred1_EsperEPL2Grammar_fragment() throws RecognitionException {   
        // EsperEPL2Grammar.g:2221:5: ( ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX ) )
        // EsperEPL2Grammar.g:2221:6: ( '0' .. '9' )+ ( '.' | EXPONENT | FLOAT_SUFFIX )
        {
        // EsperEPL2Grammar.g:2221:6: ( '0' .. '9' )+
        int cnt32=0;
        loop32:
        do {
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>='0' && LA32_0<='9')) ) {
                alt32=1;
            }


            switch (alt32) {
        	case 1 :
        	    // EsperEPL2Grammar.g:2221:7: '0' .. '9'
        	    {
        	    matchRange('0','9'); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt32 >= 1 ) break loop32;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(32, input);
                    throw eee;
            }
            cnt32++;
        } while (true);

        // EsperEPL2Grammar.g:2221:18: ( '.' | EXPONENT | FLOAT_SUFFIX )
        int alt33=3;
        switch ( input.LA(1) ) {
        case '.':
            {
            alt33=1;
            }
            break;
        case 'e':
            {
            alt33=2;
            }
            break;
        case 'd':
        case 'f':
            {
            alt33=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 33, 0, input);

            throw nvae;
        }

        switch (alt33) {
            case 1 :
                // EsperEPL2Grammar.g:2221:19: '.'
                {
                match('.'); if (state.failed) return ;

                }
                break;
            case 2 :
                // EsperEPL2Grammar.g:2221:23: EXPONENT
                {
                mEXPONENT(); if (state.failed) return ;

                }
                break;
            case 3 :
                // EsperEPL2Grammar.g:2221:32: FLOAT_SUFFIX
                {
                mFLOAT_SUFFIX(); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_EsperEPL2Grammar

    public final boolean synpred1_EsperEPL2Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_EsperEPL2Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

}