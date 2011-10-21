// $ANTLR 3.2 Sep 23, 2009 12:02:23 EsperEPL2Ast.g 2011-10-21 09:52:36

  package com.espertech.esper.epl.generated;
  import java.util.Stack;
  import org.apache.commons.logging.Log;
  import org.apache.commons.logging.LogFactory;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EsperEPL2Ast extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CREATE", "WINDOW", "IN_SET", "BETWEEN", "LIKE", "REGEXP", "ESCAPE", "OR_EXPR", "AND_EXPR", "NOT_EXPR", "EVERY_EXPR", "EVERY_DISTINCT_EXPR", "WHERE", "AS", "SUM", "AVG", "MAX", "MIN", "COALESCE", "MEDIAN", "STDDEV", "AVEDEV", "COUNT", "SELECT", "CASE", "CASE2", "ELSE", "WHEN", "THEN", "END", "FROM", "OUTER", "INNER", "JOIN", "LEFT", "RIGHT", "FULL", "ON", "IS", "BY", "GROUP", "HAVING", "DISTINCT", "ALL", "ANY", "SOME", "OUTPUT", "EVENTS", "FIRST", "LAST", "INSERT", "INTO", "ORDER", "ASC", "DESC", "RSTREAM", "ISTREAM", "IRSTREAM", "SCHEMA", "UNIDIRECTIONAL", "RETAINUNION", "RETAININTERSECTION", "PATTERN", "SQL", "METADATASQL", "PREVIOUS", "PREVIOUSTAIL", "PREVIOUSCOUNT", "PREVIOUSWINDOW", "PRIOR", "EXISTS", "WEEKDAY", "LW", "INSTANCEOF", "TYPEOF", "CAST", "CURRENT_TIMESTAMP", "DELETE", "SNAPSHOT", "SET", "VARIABLE", "UNTIL", "AT", "INDEX", "TIMEPERIOD_YEAR", "TIMEPERIOD_YEARS", "TIMEPERIOD_MONTH", "TIMEPERIOD_MONTHS", "TIMEPERIOD_WEEK", "TIMEPERIOD_WEEKS", "TIMEPERIOD_DAY", "TIMEPERIOD_DAYS", "TIMEPERIOD_HOUR", "TIMEPERIOD_HOURS", "TIMEPERIOD_MINUTE", "TIMEPERIOD_MINUTES", "TIMEPERIOD_SEC", "TIMEPERIOD_SECOND", "TIMEPERIOD_SECONDS", "TIMEPERIOD_MILLISEC", "TIMEPERIOD_MILLISECOND", "TIMEPERIOD_MILLISECONDS", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "VALUE_NULL", "ROW_LIMIT_EXPR", "OFFSET", "UPDATE", "MATCH_RECOGNIZE", "MEASURES", "DEFINE", "PARTITION", "MATCHES", "AFTER", "FOR", "WHILE", "USING", "MERGE", "MATCHED", "EXPRESSIONDECL", "NEWKW", "START", "CONTEXT", "INITIATED", "TERMINATED", "NUMERIC_PARAM_RANGE", "NUMERIC_PARAM_LIST", "NUMERIC_PARAM_FREQUENCY", "OBJECT_PARAM_ORDERED_EXPR", "FOLLOWED_BY_EXPR", "FOLLOWED_BY_ITEM", "PATTERN_FILTER_EXPR", "PATTERN_NOT_EXPR", "PATTERN_EVERY_DISTINCT_EXPR", "EVENT_FILTER_EXPR", "EVENT_FILTER_PROPERTY_EXPR", "EVENT_FILTER_PROPERTY_EXPR_ATOM", "PROPERTY_SELECTION_ELEMENT_EXPR", "PROPERTY_SELECTION_STREAM", "PROPERTY_WILDCARD_SELECT", "EVENT_FILTER_IDENT", "EVENT_FILTER_PARAM", "EVENT_FILTER_RANGE", "EVENT_FILTER_NOT_RANGE", "EVENT_FILTER_IN", "EVENT_FILTER_NOT_IN", "EVENT_FILTER_BETWEEN", "EVENT_FILTER_NOT_BETWEEN", "CLASS_IDENT", "GUARD_EXPR", "OBSERVER_EXPR", "VIEW_EXPR", "PATTERN_INCL_EXPR", "DATABASE_JOIN_EXPR", "WHERE_EXPR", "HAVING_EXPR", "EVAL_BITWISE_EXPR", "EVAL_AND_EXPR", "EVAL_OR_EXPR", "EVAL_EQUALS_EXPR", "EVAL_NOTEQUALS_EXPR", "EVAL_IS_EXPR", "EVAL_ISNOT_EXPR", "EVAL_EQUALS_GROUP_EXPR", "EVAL_NOTEQUALS_GROUP_EXPR", "EVAL_IDENT", "SELECTION_EXPR", "SELECTION_ELEMENT_EXPR", "SELECTION_STREAM", "STREAM_EXPR", "OUTERJOIN_EXPR", "INNERJOIN_EXPR", "LEFT_OUTERJOIN_EXPR", "RIGHT_OUTERJOIN_EXPR", "FULL_OUTERJOIN_EXPR", "GROUP_BY_EXPR", "ORDER_BY_EXPR", "ORDER_ELEMENT_EXPR", "EVENT_PROP_EXPR", "EVENT_PROP_SIMPLE", "EVENT_PROP_MAPPED", "EVENT_PROP_INDEXED", "EVENT_PROP_DYNAMIC_SIMPLE", "EVENT_PROP_DYNAMIC_INDEXED", "EVENT_PROP_DYNAMIC_MAPPED", "EVENT_LIMIT_EXPR", "TIMEPERIOD_LIMIT_EXPR", "AFTER_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR_PARAM", "WHEN_LIMIT_EXPR", "TERM_LIMIT_EXPR", "INSERTINTO_EXPR", "EXPRCOL", "INDEXCOL", "CONCAT", "LIB_FUNCTION", "LIB_FUNC_CHAIN", "DOT_EXPR", "UNARY_MINUS", "TIME_PERIOD", "ARRAY_EXPR", "YEAR_PART", "MONTH_PART", "WEEK_PART", "DAY_PART", "HOUR_PART", "MINUTE_PART", "SECOND_PART", "MILLISECOND_PART", "NOT_IN_SET", "NOT_BETWEEN", "NOT_LIKE", "NOT_REGEXP", "DBSELECT_EXPR", "DBFROM_CLAUSE", "DBWHERE_CLAUSE", "WILDCARD_SELECT", "INSERTINTO_STREAM_NAME", "IN_RANGE", "NOT_IN_RANGE", "SUBSELECT_EXPR", "SUBSELECT_GROUP_EXPR", "EXISTS_SUBSELECT_EXPR", "IN_SUBSELECT_EXPR", "NOT_IN_SUBSELECT_EXPR", "IN_SUBSELECT_QUERY_EXPR", "LAST_OPERATOR", "WEEKDAY_OPERATOR", "SUBSTITUTION", "CAST_EXPR", "CREATE_INDEX_EXPR", "CREATE_WINDOW_EXPR", "CREATE_WINDOW_SELECT_EXPR", "ON_EXPR", "ON_STREAM", "ON_DELETE_EXPR", "ON_SELECT_EXPR", "ON_UPDATE_EXPR", "ON_MERGE_EXPR", "ON_SELECT_INSERT_EXPR", "ON_SELECT_INSERT_OUTPUT", "ON_EXPR_FROM", "ON_SET_EXPR", "CREATE_VARIABLE_EXPR", "METHOD_JOIN_EXPR", "MATCH_UNTIL_EXPR", "MATCH_UNTIL_RANGE_HALFOPEN", "MATCH_UNTIL_RANGE_HALFCLOSED", "MATCH_UNTIL_RANGE_CLOSED", "MATCH_UNTIL_RANGE_BOUNDED", "CREATE_COL_TYPE_LIST", "CREATE_COL_TYPE", "NUMBERSETSTAR", "ANNOTATION", "ANNOTATION_ARRAY", "ANNOTATION_VALUE", "FIRST_AGGREG", "LAST_AGGREG", "WINDOW_AGGREG", "ACCESS_AGG", "UPDATE_EXPR", "ON_SET_EXPR_ITEM", "CREATE_SCHEMA_EXPR", "CREATE_SCHEMA_EXPR_QUAL", "CREATE_SCHEMA_EXPR_VAR", "VARIANT_LIST", "MERGE_UNM", "MERGE_MAT", "MERGE_UPD", "MERGE_INS", "MERGE_DEL", "NEW_ITEM", "AGG_FILTER_EXPR", "CREATE_CTX", "CREATE_CTX_FIXED", "CREATE_CTX_PART", "CREATE_CTX_CAT", "CREATE_CTX_INIT", "CREATE_CTX_CATITEM", "PARTITIONITEM", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "BOOL_TYPE", "NULL_TYPE", "NUM_DOUBLE", "EPL_EXPR", "MATCHREC_PATTERN", "MATCHREC_PATTERN_ATOM", "MATCHREC_PATTERN_CONCAT", "MATCHREC_PATTERN_ALTER", "MATCHREC_PATTERN_NESTED", "MATCHREC_AFTER_SKIP", "MATCHREC_INTERVAL", "MATCHREC_DEFINE", "MATCHREC_DEFINE_ITEM", "MATCHREC_MEASURES", "MATCHREC_MEASURE_ITEM", "IDENT", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "GOES", "COMMA", "EQUALS", "DOT", "LBRACK", "RBRACK", "STAR", "BOR", "PLUS", "QUESTION", "COLON", "STRING_LITERAL", "QUOTED_STRING_LITERAL", "BAND", "BXOR", "SQL_NE", "NOT_EQUAL", "LT", "GT", "LE", "GE", "LOR", "MINUS", "DIV", "MOD", "NUM_INT", "FOLLOWED_BY", "FOLLOWMAX_BEGIN", "FOLLOWMAX_END", "ATCHAR", "ESCAPECHAR", "TICKED_STRING_LITERAL", "NUM_LONG", "NUM_FLOAT", "EQUAL", "LNOT", "BNOT", "DIV_ASSIGN", "PLUS_ASSIGN", "INC", "MINUS_ASSIGN", "DEC", "STAR_ASSIGN", "MOD_ASSIGN", "SR", "SR_ASSIGN", "BSR", "BSR_ASSIGN", "SL", "SL_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LAND", "SEMI", "WS", "SL_COMMENT", "ML_COMMENT", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "EXPONENT", "FLOAT_SUFFIX", "EVAL_IS_GROUP_EXPR", "EVAL_ISNOT_GROUP_EXPR"
    };
    public static final int CRONTAB_LIMIT_EXPR=192;
    public static final int FLOAT_SUFFIX=373;
    public static final int STAR=316;
    public static final int DOT_EXPR=202;
    public static final int NUMERIC_PARAM_LIST=130;
    public static final int ISTREAM=60;
    public static final int MOD=334;
    public static final int OUTERJOIN_EXPR=174;
    public static final int LIB_FUNC_CHAIN=201;
    public static final int EVAL_ISNOT_GROUP_EXPR=375;
    public static final int CREATE_COL_TYPE_LIST=255;
    public static final int MONTH_PART=207;
    public static final int MERGE_INS=274;
    public static final int BSR=356;
    public static final int LIB_FUNCTION=200;
    public static final int EOF=-1;
    public static final int TIMEPERIOD_MILLISECONDS=105;
    public static final int FULL_OUTERJOIN_EXPR=178;
    public static final int CREATE_CTX_FIXED=279;
    public static final int MATCHREC_PATTERN_CONCAT=296;
    public static final int INC=349;
    public static final int LNOT=345;
    public static final int RPAREN=309;
    public static final int CREATE=4;
    public static final int STRING_LITERAL=321;
    public static final int BSR_ASSIGN=357;
    public static final int CAST_EXPR=234;
    public static final int MATCHES=116;
    public static final int USING=120;
    public static final int STREAM_EXPR=173;
    public static final int TIMEPERIOD_SECONDS=102;
    public static final int NOT_EQUAL=326;
    public static final int METADATASQL=68;
    public static final int EVENT_FILTER_PROPERTY_EXPR=139;
    public static final int LAST_AGGREG=262;
    public static final int GOES=310;
    public static final int REGEXP=9;
    public static final int MATCHED=122;
    public static final int INITIATED=127;
    public static final int FOLLOWED_BY_EXPR=133;
    public static final int NEWKW=124;
    public static final int HOUR_PART=210;
    public static final int FOLLOWED_BY=336;
    public static final int MATCH_UNTIL_RANGE_CLOSED=253;
    public static final int MATCHREC_PATTERN_NESTED=298;
    public static final int RBRACK=315;
    public static final int GE=330;
    public static final int METHOD_JOIN_EXPR=249;
    public static final int ASC=57;
    public static final int IN_SET=6;
    public static final int CREATE_CTX_PART=280;
    public static final int EVENT_FILTER_EXPR=138;
    public static final int PATTERN_EVERY_DISTINCT_EXPR=137;
    public static final int ELSE=30;
    public static final int MINUS_ASSIGN=350;
    public static final int EVENT_FILTER_NOT_IN=149;
    public static final int INSERTINTO_STREAM_NAME=222;
    public static final int NUM_DOUBLE=292;
    public static final int TIMEPERIOD_MILLISEC=103;
    public static final int UNARY_MINUS=203;
    public static final int LCURLY=306;
    public static final int RETAINUNION=64;
    public static final int DBWHERE_CLAUSE=220;
    public static final int MEDIAN=23;
    public static final int EVENTS=51;
    public static final int AND_EXPR=12;
    public static final int EVENT_FILTER_NOT_RANGE=147;
    public static final int GROUP=44;
    public static final int WS=365;
    public static final int SUBSELECT_GROUP_EXPR=226;
    public static final int FOLLOWED_BY_ITEM=134;
    public static final int YEAR_PART=206;
    public static final int ON_SELECT_INSERT_EXPR=244;
    public static final int TYPEOF=78;
    public static final int ESCAPECHAR=340;
    public static final int EXPRCOL=197;
    public static final int SL_COMMENT=366;
    public static final int NULL_TYPE=291;
    public static final int MATCH_UNTIL_RANGE_HALFOPEN=251;
    public static final int GT=328;
    public static final int BNOT=346;
    public static final int EVAL_IS_EXPR=165;
    public static final int WHERE_EXPR=158;
    public static final int END=33;
    public static final int INNERJOIN_EXPR=175;
    public static final int LAND=363;
    public static final int TERM_LIMIT_EXPR=195;
    public static final int NOT_REGEXP=217;
    public static final int MATCH_UNTIL_EXPR=250;
    public static final int EVENT_PROP_EXPR=182;
    public static final int LBRACK=314;
    public static final int MERGE_UPD=273;
    public static final int VIEW_EXPR=155;
    public static final int ANNOTATION=258;
    public static final int LONG_TYPE=286;
    public static final int EVENT_FILTER_PROPERTY_EXPR_ATOM=140;
    public static final int MATCHREC_PATTERN=294;
    public static final int ON_MERGE_EXPR=243;
    public static final int ATCHAR=339;
    public static final int TIMEPERIOD_SEC=100;
    public static final int TICKED_STRING_LITERAL=341;
    public static final int ON_SELECT_EXPR=241;
    public static final int MINUTE_PART=211;
    public static final int PATTERN_NOT_EXPR=136;
    public static final int SQL_NE=325;
    public static final int SUM=18;
    public static final int HexDigit=371;
    public static final int UPDATE_EXPR=265;
    public static final int LPAREN=308;
    public static final int IN_SUBSELECT_EXPR=228;
    public static final int AT=86;
    public static final int AS=17;
    public static final int OR_EXPR=11;
    public static final int BOOLEAN_TRUE=106;
    public static final int THEN=32;
    public static final int MATCHREC_INTERVAL=300;
    public static final int NOT_IN_RANGE=224;
    public static final int TIMEPERIOD_MONTH=90;
    public static final int OFFSET=110;
    public static final int AVG=19;
    public static final int LEFT=38;
    public static final int SECOND_PART=212;
    public static final int PREVIOUS=69;
    public static final int PREVIOUSWINDOW=72;
    public static final int MATCH_RECOGNIZE=112;
    public static final int PARTITIONITEM=284;
    public static final int IDENT=305;
    public static final int DATABASE_JOIN_EXPR=157;
    public static final int BXOR=324;
    public static final int PLUS=318;
    public static final int CASE2=29;
    public static final int MERGE_MAT=272;
    public static final int TIMEPERIOD_DAY=94;
    public static final int CREATE_SCHEMA_EXPR=267;
    public static final int EXISTS=74;
    public static final int EVENT_PROP_INDEXED=185;
    public static final int CREATE_INDEX_EXPR=235;
    public static final int TIMEPERIOD_MILLISECOND=104;
    public static final int ACCESS_AGG=264;
    public static final int CREATE_CTX_CATITEM=283;
    public static final int EVAL_NOTEQUALS_EXPR=164;
    public static final int MATCH_UNTIL_RANGE_HALFCLOSED=252;
    public static final int CREATE_VARIABLE_EXPR=248;
    public static final int LIKE=8;
    public static final int OUTER=35;
    public static final int MATCHREC_DEFINE=301;
    public static final int BY=43;
    public static final int RIGHT_OUTERJOIN_EXPR=177;
    public static final int NUMBERSETSTAR=257;
    public static final int LAST_OPERATOR=231;
    public static final int PATTERN_FILTER_EXPR=135;
    public static final int MERGE=121;
    public static final int FOLLOWMAX_END=338;
    public static final int MERGE_UNM=271;
    public static final int EVAL_AND_EXPR=161;
    public static final int LEFT_OUTERJOIN_EXPR=176;
    public static final int EPL_EXPR=293;
    public static final int GROUP_BY_EXPR=179;
    public static final int SET=83;
    public static final int RIGHT=39;
    public static final int HAVING=45;
    public static final int INSTANCEOF=77;
    public static final int MIN=21;
    public static final int EVENT_PROP_SIMPLE=183;
    public static final int MINUS=332;
    public static final int SEMI=364;
    public static final int INDEXCOL=198;
    public static final int STAR_ASSIGN=352;
    public static final int PREVIOUSCOUNT=71;
    public static final int VARIANT_LIST=270;
    public static final int FIRST_AGGREG=261;
    public static final int COLON=320;
    public static final int EVAL_EQUALS_GROUP_EXPR=167;
    public static final int BAND_ASSIGN=362;
    public static final int PREVIOUSTAIL=70;
    public static final int SCHEMA=62;
    public static final int CRONTAB_LIMIT_EXPR_PARAM=193;
    public static final int NOT_IN_SET=214;
    public static final int VALUE_NULL=108;
    public static final int EVENT_PROP_DYNAMIC_SIMPLE=186;
    public static final int SL=358;
    public static final int NOT_IN_SUBSELECT_EXPR=229;
    public static final int WHEN=31;
    public static final int GUARD_EXPR=153;
    public static final int SR=354;
    public static final int RCURLY=307;
    public static final int PLUS_ASSIGN=348;
    public static final int DAY_PART=209;
    public static final int EXISTS_SUBSELECT_EXPR=227;
    public static final int START=125;
    public static final int EVENT_FILTER_IN=148;
    public static final int DIV=333;
    public static final int OBJECT_PARAM_ORDERED_EXPR=132;
    public static final int EXPRESSIONDECL=123;
    public static final int WEEK_PART=208;
    public static final int BETWEEN=7;
    public static final int MILLISECOND_PART=213;
    public static final int OctalEscape=370;
    public static final int ROW_LIMIT_EXPR=109;
    public static final int FIRST=52;
    public static final int PRIOR=73;
    public static final int SELECTION_EXPR=170;
    public static final int EVAL_IS_GROUP_EXPR=374;
    public static final int LW=76;
    public static final int CAST=79;
    public static final int LOR=331;
    public static final int WILDCARD_SELECT=221;
    public static final int LT=327;
    public static final int EXPONENT=372;
    public static final int PATTERN_INCL_EXPR=156;
    public static final int CREATE_CTX=278;
    public static final int WHILE=119;
    public static final int ORDER_BY_EXPR=180;
    public static final int NEW_ITEM=276;
    public static final int BOOL_TYPE=290;
    public static final int ANNOTATION_ARRAY=259;
    public static final int MOD_ASSIGN=353;
    public static final int CASE=28;
    public static final int IN_SUBSELECT_QUERY_EXPR=230;
    public static final int COUNT=26;
    public static final int EQUALS=312;
    public static final int RETAININTERSECTION=65;
    public static final int TERMINATED=128;
    public static final int WINDOW_AGGREG=263;
    public static final int DIV_ASSIGN=347;
    public static final int SL_ASSIGN=359;
    public static final int TIMEPERIOD_WEEKS=93;
    public static final int PATTERN=66;
    public static final int CREATE_CTX_INIT=282;
    public static final int SQL=67;
    public static final int FULL=40;
    public static final int WEEKDAY=75;
    public static final int MATCHREC_AFTER_SKIP=299;
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
    public static final int FLOAT_TYPE=287;
    public static final int SUBSELECT_EXPR=225;
    public static final int ANNOTATION_VALUE=260;
    public static final int NUMERIC_PARAM_RANGE=129;
    public static final int CONCAT=199;
    public static final int CLASS_IDENT=152;
    public static final int MATCHREC_PATTERN_ALTER=297;
    public static final int ON_EXPR=238;
    public static final int CREATE_WINDOW_EXPR=236;
    public static final int PROPERTY_SELECTION_STREAM=142;
    public static final int ON_DELETE_EXPR=240;
    public static final int ON=41;
    public static final int NUM_LONG=342;
    public static final int TIME_PERIOD=204;
    public static final int DOUBLE_TYPE=288;
    public static final int DELETE=81;
    public static final int INT_TYPE=285;
    public static final int EVAL_BITWISE_EXPR=160;
    public static final int EVERY_EXPR=14;
    public static final int ORDER_ELEMENT_EXPR=181;
    public static final int TIMEPERIOD_HOURS=97;
    public static final int VARIABLE=84;
    public static final int SUBSTITUTION=233;
    public static final int UNTIL=85;
    public static final int STRING_TYPE=289;
    public static final int ON_SET_EXPR=247;
    public static final int MATCHREC_DEFINE_ITEM=302;
    public static final int NUM_INT=335;
    public static final int STDDEV=24;
    public static final int ON_EXPR_FROM=246;
    public static final int NUM_FLOAT=343;
    public static final int FROM=34;
    public static final int DISTINCT=46;
    public static final int PROPERTY_SELECTION_ELEMENT_EXPR=141;
    public static final int OUTPUT=50;
    public static final int EscapeSequence=368;
    public static final int WEEKDAY_OPERATOR=232;
    public static final int WHERE=16;
    public static final int DEC=351;
    public static final int INNER=36;
    public static final int NUMERIC_PARAM_FREQUENCY=131;
    public static final int BXOR_ASSIGN=360;
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
    public static final int ML_COMMENT=367;
    public static final int CREATE_CTX_CAT=281;
    public static final int EVENT_PROP_DYNAMIC_INDEXED=187;
    public static final int BOR_ASSIGN=361;
    public static final int COMMA=311;
    public static final int PARTITION=115;
    public static final int IS=42;
    public static final int WHEN_LIMIT_EXPR=194;
    public static final int TIMEPERIOD_LIMIT_EXPR=190;
    public static final int SOME=49;
    public static final int TIMEPERIOD_HOUR=96;
    public static final int ALL=47;
    public static final int MATCHREC_MEASURE_ITEM=304;
    public static final int BOR=317;
    public static final int EQUAL=344;
    public static final int CREATE_SCHEMA_EXPR_VAR=269;
    public static final int EVENT_FILTER_NOT_BETWEEN=151;
    public static final int IN_RANGE=223;
    public static final int DOT=313;
    public static final int CURRENT_TIMESTAMP=80;
    public static final int MATCHREC_MEASURES=303;
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
    public static final int MATCHREC_PATTERN_ATOM=295;
    public static final int BAND=323;
    public static final int QUOTED_STRING_LITERAL=322;
    public static final int JOIN=37;
    public static final int ANY=48;
    public static final int NOT_EXPR=13;
    public static final int QUESTION=319;
    public static final int OBSERVER_EXPR=154;
    public static final int EVENT_FILTER_IDENT=144;
    public static final int CREATE_SCHEMA_EXPR_QUAL=268;
    public static final int EVENT_PROP_MAPPED=184;
    public static final int UnicodeEscape=369;
    public static final int TIMEPERIOD_YEAR=88;
    public static final int AVEDEV=25;
    public static final int DBSELECT_EXPR=218;
    public static final int TIMEPERIOD_MONTHS=91;
    public static final int FOLLOWMAX_BEGIN=337;
    public static final int SELECTION_ELEMENT_EXPR=171;
    public static final int CREATE_WINDOW_SELECT_EXPR=237;
    public static final int WINDOW=5;
    public static final int ON_SET_EXPR_ITEM=266;
    public static final int DESC=58;
    public static final int SELECTION_STREAM=172;
    public static final int SR_ASSIGN=355;
    public static final int DBFROM_CLAUSE=219;
    public static final int LE=329;
    public static final int EVAL_IDENT=169;

    // delegates
    // delegators


        public EsperEPL2Ast(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public EsperEPL2Ast(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return EsperEPL2Ast.tokenNames; }
    public String getGrammarFileName() { return "EsperEPL2Ast.g"; }


      private static Log log = LogFactory.getLog(EsperEPL2Ast.class);

      // For pattern processing within EPL
      protected void endPattern() {};

      protected void pushStmtContext() {};
      protected void leaveNode(Tree node) {};
      protected void end() {};

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
      
      public void recover(org.antlr.runtime.IntStream intStream, org.antlr.runtime.RecognitionException recognitionException) {
        throw new RuntimeException("Error recovering from recognition exception", recognitionException);
      }



    // $ANTLR start "annotation"
    // EsperEPL2Ast.g:57:1: annotation[boolean isLeaveNode] : ^(a= ANNOTATION CLASS_IDENT ( elementValuePair )* ( elementValue )? ) ;
    public final void annotation(boolean isLeaveNode) throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:58:2: ( ^(a= ANNOTATION CLASS_IDENT ( elementValuePair )* ( elementValue )? ) )
            // EsperEPL2Ast.g:58:4: ^(a= ANNOTATION CLASS_IDENT ( elementValuePair )* ( elementValue )? )
            {
            a=(CommonTree)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation92); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_annotation94); 
            // EsperEPL2Ast.g:58:31: ( elementValuePair )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ANNOTATION_VALUE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // EsperEPL2Ast.g:58:31: elementValuePair
            	    {
            	    pushFollow(FOLLOW_elementValuePair_in_annotation96);
            	    elementValuePair();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // EsperEPL2Ast.g:58:49: ( elementValue )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CLASS_IDENT||(LA2_0>=ANNOTATION && LA2_0<=ANNOTATION_ARRAY)||(LA2_0>=INT_TYPE && LA2_0<=NULL_TYPE)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // EsperEPL2Ast.g:58:49: elementValue
                    {
                    pushFollow(FOLLOW_elementValue_in_annotation99);
                    elementValue();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
             if (isLeaveNode) leaveNode(a); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "elementValuePair"
    // EsperEPL2Ast.g:61:1: elementValuePair : ^(a= ANNOTATION_VALUE IDENT elementValue ) ;
    public final void elementValuePair() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:62:2: ( ^(a= ANNOTATION_VALUE IDENT elementValue ) )
            // EsperEPL2Ast.g:62:4: ^(a= ANNOTATION_VALUE IDENT elementValue )
            {
            a=(CommonTree)match(input,ANNOTATION_VALUE,FOLLOW_ANNOTATION_VALUE_in_elementValuePair117); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_elementValuePair119); 
            pushFollow(FOLLOW_elementValue_in_elementValuePair121);
            elementValue();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "elementValuePair"


    // $ANTLR start "elementValue"
    // EsperEPL2Ast.g:65:1: elementValue : ( annotation[false] | ^( ANNOTATION_ARRAY ( elementValue )* ) | constant[false] | CLASS_IDENT );
    public final void elementValue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:66:6: ( annotation[false] | ^( ANNOTATION_ARRAY ( elementValue )* ) | constant[false] | CLASS_IDENT )
            int alt4=4;
            switch ( input.LA(1) ) {
            case ANNOTATION:
                {
                alt4=1;
                }
                break;
            case ANNOTATION_ARRAY:
                {
                alt4=2;
                }
                break;
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt4=3;
                }
                break;
            case CLASS_IDENT:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // EsperEPL2Ast.g:66:11: annotation[false]
                    {
                    pushFollow(FOLLOW_annotation_in_elementValue148);
                    annotation(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:67:5: ^( ANNOTATION_ARRAY ( elementValue )* )
                    {
                    match(input,ANNOTATION_ARRAY,FOLLOW_ANNOTATION_ARRAY_in_elementValue156); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:67:24: ( elementValue )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==CLASS_IDENT||(LA3_0>=ANNOTATION && LA3_0<=ANNOTATION_ARRAY)||(LA3_0>=INT_TYPE && LA3_0<=NULL_TYPE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:67:24: elementValue
                        	    {
                        	    pushFollow(FOLLOW_elementValue_in_elementValue158);
                        	    elementValue();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop3;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:68:8: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_elementValue169);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:69:8: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_elementValue179); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "elementValue"


    // $ANTLR start "expressionDecl"
    // EsperEPL2Ast.g:75:1: expressionDecl : ^(e= EXPRESSIONDECL IDENT valueExpr ( expressionLambdaDecl )? ) ;
    public final void expressionDecl() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:76:2: ( ^(e= EXPRESSIONDECL IDENT valueExpr ( expressionLambdaDecl )? ) )
            // EsperEPL2Ast.g:76:4: ^(e= EXPRESSIONDECL IDENT valueExpr ( expressionLambdaDecl )? )
            {
            e=(CommonTree)match(input,EXPRESSIONDECL,FOLLOW_EXPRESSIONDECL_in_expressionDecl204); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_expressionDecl206); 
            pushFollow(FOLLOW_valueExpr_in_expressionDecl208);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:76:39: ( expressionLambdaDecl )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==GOES) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EsperEPL2Ast.g:76:39: expressionLambdaDecl
                    {
                    pushFollow(FOLLOW_expressionLambdaDecl_in_expressionDecl210);
                    expressionLambdaDecl();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
             leaveNode(e); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionDecl"


    // $ANTLR start "expressionLambdaDecl"
    // EsperEPL2Ast.g:79:1: expressionLambdaDecl : ^( GOES ( IDENT | exprCol ) ) ;
    public final void expressionLambdaDecl() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:80:2: ( ^( GOES ( IDENT | exprCol ) ) )
            // EsperEPL2Ast.g:80:4: ^( GOES ( IDENT | exprCol ) )
            {
            match(input,GOES,FOLLOW_GOES_in_expressionLambdaDecl227); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:80:11: ( IDENT | exprCol )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            else if ( (LA6_0==EXPRCOL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // EsperEPL2Ast.g:80:12: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_expressionLambdaDecl230); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:80:20: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_expressionLambdaDecl234);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionLambdaDecl"


    // $ANTLR start "startEPLExpressionRule"
    // EsperEPL2Ast.g:86:1: startEPLExpressionRule : ^( EPL_EXPR ( annotation[true] | expressionDecl )* eplExpressionRule ) ;
    public final void startEPLExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:87:2: ( ^( EPL_EXPR ( annotation[true] | expressionDecl )* eplExpressionRule ) )
            // EsperEPL2Ast.g:87:4: ^( EPL_EXPR ( annotation[true] | expressionDecl )* eplExpressionRule )
            {
            match(input,EPL_EXPR,FOLLOW_EPL_EXPR_in_startEPLExpressionRule251); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:87:15: ( annotation[true] | expressionDecl )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ANNOTATION) ) {
                    alt7=1;
                }
                else if ( (LA7_0==EXPRESSIONDECL) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // EsperEPL2Ast.g:87:16: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startEPLExpressionRule254);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // EsperEPL2Ast.g:87:35: expressionDecl
            	    {
            	    pushFollow(FOLLOW_expressionDecl_in_startEPLExpressionRule259);
            	    expressionDecl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_eplExpressionRule_in_startEPLExpressionRule263);
            eplExpressionRule();

            state._fsp--;


            match(input, Token.UP, null); 
             end(); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "startEPLExpressionRule"


    // $ANTLR start "eplExpressionRule"
    // EsperEPL2Ast.g:90:1: eplExpressionRule : ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? ) | createContextExpr );
    public final void eplExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:91:2: ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? ) | createContextExpr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CONTEXT||LA11_0==SELECTION_EXPR||LA11_0==INSERTINTO_EXPR||(LA11_0>=CREATE_INDEX_EXPR && LA11_0<=CREATE_WINDOW_EXPR)||LA11_0==ON_EXPR||LA11_0==CREATE_VARIABLE_EXPR||LA11_0==UPDATE_EXPR||LA11_0==CREATE_SCHEMA_EXPR) ) {
                alt11=1;
            }
            else if ( (LA11_0==CREATE_CTX) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // EsperEPL2Ast.g:91:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? )
                    {
                    // EsperEPL2Ast.g:91:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? )
                    // EsperEPL2Ast.g:91:5: ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )?
                    {
                    // EsperEPL2Ast.g:91:5: ( contextExpr )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==CONTEXT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // EsperEPL2Ast.g:91:5: contextExpr
                            {
                            pushFollow(FOLLOW_contextExpr_in_eplExpressionRule280);
                            contextExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:91:18: ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr )
                    int alt9=7;
                    switch ( input.LA(1) ) {
                    case SELECTION_EXPR:
                    case INSERTINTO_EXPR:
                        {
                        alt9=1;
                        }
                        break;
                    case CREATE_WINDOW_EXPR:
                        {
                        alt9=2;
                        }
                        break;
                    case CREATE_INDEX_EXPR:
                        {
                        alt9=3;
                        }
                        break;
                    case CREATE_VARIABLE_EXPR:
                        {
                        alt9=4;
                        }
                        break;
                    case CREATE_SCHEMA_EXPR:
                        {
                        alt9=5;
                        }
                        break;
                    case ON_EXPR:
                        {
                        alt9=6;
                        }
                        break;
                    case UPDATE_EXPR:
                        {
                        alt9=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // EsperEPL2Ast.g:91:19: selectExpr
                            {
                            pushFollow(FOLLOW_selectExpr_in_eplExpressionRule284);
                            selectExpr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:91:32: createWindowExpr
                            {
                            pushFollow(FOLLOW_createWindowExpr_in_eplExpressionRule288);
                            createWindowExpr();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // EsperEPL2Ast.g:91:51: createIndexExpr
                            {
                            pushFollow(FOLLOW_createIndexExpr_in_eplExpressionRule292);
                            createIndexExpr();

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // EsperEPL2Ast.g:91:69: createVariableExpr
                            {
                            pushFollow(FOLLOW_createVariableExpr_in_eplExpressionRule296);
                            createVariableExpr();

                            state._fsp--;


                            }
                            break;
                        case 5 :
                            // EsperEPL2Ast.g:91:90: createSchemaExpr
                            {
                            pushFollow(FOLLOW_createSchemaExpr_in_eplExpressionRule300);
                            createSchemaExpr();

                            state._fsp--;


                            }
                            break;
                        case 6 :
                            // EsperEPL2Ast.g:91:109: onExpr
                            {
                            pushFollow(FOLLOW_onExpr_in_eplExpressionRule304);
                            onExpr();

                            state._fsp--;


                            }
                            break;
                        case 7 :
                            // EsperEPL2Ast.g:91:118: updateExpr
                            {
                            pushFollow(FOLLOW_updateExpr_in_eplExpressionRule308);
                            updateExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:91:130: ( forExpr )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==FOR) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // EsperEPL2Ast.g:91:130: forExpr
                            {
                            pushFollow(FOLLOW_forExpr_in_eplExpressionRule311);
                            forExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:92:4: createContextExpr
                    {
                    pushFollow(FOLLOW_createContextExpr_in_eplExpressionRule318);
                    createContextExpr();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eplExpressionRule"


    // $ANTLR start "contextExpr"
    // EsperEPL2Ast.g:95:1: contextExpr : ^(i= CONTEXT IDENT ) ;
    public final void contextExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:96:2: ( ^(i= CONTEXT IDENT ) )
            // EsperEPL2Ast.g:96:4: ^(i= CONTEXT IDENT )
            {
            i=(CommonTree)match(input,CONTEXT,FOLLOW_CONTEXT_in_contextExpr333); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_contextExpr335); 
             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "contextExpr"


    // $ANTLR start "onExpr"
    // EsperEPL2Ast.g:99:1: onExpr : ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) ) ;
    public final void onExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:100:2: ( ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) ) )
            // EsperEPL2Ast.g:100:4: ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) )
            {
            i=(CommonTree)match(input,ON_EXPR,FOLLOW_ON_EXPR_in_onExpr354); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onStreamExpr_in_onExpr356);
            onStreamExpr();

            state._fsp--;

            // EsperEPL2Ast.g:101:3: ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr )
            int alt15=5;
            switch ( input.LA(1) ) {
            case ON_DELETE_EXPR:
                {
                alt15=1;
                }
                break;
            case ON_UPDATE_EXPR:
                {
                alt15=2;
                }
                break;
            case ON_SELECT_EXPR:
                {
                alt15=3;
                }
                break;
            case ON_SET_EXPR:
                {
                alt15=4;
                }
                break;
            case ON_MERGE_EXPR:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // EsperEPL2Ast.g:101:4: onDeleteExpr
                    {
                    pushFollow(FOLLOW_onDeleteExpr_in_onExpr361);
                    onDeleteExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:101:19: onUpdateExpr
                    {
                    pushFollow(FOLLOW_onUpdateExpr_in_onExpr365);
                    onUpdateExpr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:101:34: onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )?
                    {
                    pushFollow(FOLLOW_onSelectExpr_in_onExpr369);
                    onSelectExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:101:47: ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ON_SELECT_INSERT_EXPR) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // EsperEPL2Ast.g:101:48: ( onSelectInsertExpr )+ ( onSelectInsertOutput )?
                            {
                            // EsperEPL2Ast.g:101:48: ( onSelectInsertExpr )+
                            int cnt12=0;
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==ON_SELECT_INSERT_EXPR) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:101:48: onSelectInsertExpr
                            	    {
                            	    pushFollow(FOLLOW_onSelectInsertExpr_in_onExpr372);
                            	    onSelectInsertExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt12 >= 1 ) break loop12;
                                        EarlyExitException eee =
                                            new EarlyExitException(12, input);
                                        throw eee;
                                }
                                cnt12++;
                            } while (true);

                            // EsperEPL2Ast.g:101:68: ( onSelectInsertOutput )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==ON_SELECT_INSERT_OUTPUT) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // EsperEPL2Ast.g:101:68: onSelectInsertOutput
                                    {
                                    pushFollow(FOLLOW_onSelectInsertOutput_in_onExpr375);
                                    onSelectInsertOutput();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:101:94: onSetExpr
                    {
                    pushFollow(FOLLOW_onSetExpr_in_onExpr382);
                    onSetExpr();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:101:106: onMergeExpr
                    {
                    pushFollow(FOLLOW_onMergeExpr_in_onExpr386);
                    onMergeExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onExpr"


    // $ANTLR start "onStreamExpr"
    // EsperEPL2Ast.g:105:1: onStreamExpr : ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? ) ;
    public final void onStreamExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:106:2: ( ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? ) )
            // EsperEPL2Ast.g:106:4: ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? )
            {
            s=(CommonTree)match(input,ON_STREAM,FOLLOW_ON_STREAM_in_onStreamExpr408); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:106:18: ( eventFilterExpr[true] | patternInclusionExpression )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EVENT_FILTER_EXPR) ) {
                alt16=1;
            }
            else if ( (LA16_0==PATTERN_INCL_EXPR) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // EsperEPL2Ast.g:106:19: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_onStreamExpr411);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:106:43: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_onStreamExpr416);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:106:71: ( IDENT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // EsperEPL2Ast.g:106:71: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onStreamExpr419); 

                    }
                    break;

            }

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onStreamExpr"


    // $ANTLR start "onMergeExpr"
    // EsperEPL2Ast.g:109:1: onMergeExpr : ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? ) ;
    public final void onMergeExpr() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:110:2: ( ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:110:4: ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? )
            {
            m=(CommonTree)match(input,ON_MERGE_EXPR,FOLLOW_ON_MERGE_EXPR_in_onMergeExpr437); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr439); 
            // EsperEPL2Ast.g:110:28: ( IDENT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // EsperEPL2Ast.g:110:28: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr441); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:110:35: ( mergeItem )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=MERGE_UNM && LA19_0<=MERGE_MAT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // EsperEPL2Ast.g:110:35: mergeItem
            	    {
            	    pushFollow(FOLLOW_mergeItem_in_onMergeExpr444);
            	    mergeItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // EsperEPL2Ast.g:110:46: ( whereClause[true] )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WHERE_EXPR) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // EsperEPL2Ast.g:110:46: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onMergeExpr447);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onMergeExpr"


    // $ANTLR start "mergeItem"
    // EsperEPL2Ast.g:113:1: mergeItem : ( mergeMatched | mergeUnmatched ) ;
    public final void mergeItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:114:2: ( ( mergeMatched | mergeUnmatched ) )
            // EsperEPL2Ast.g:114:4: ( mergeMatched | mergeUnmatched )
            {
            // EsperEPL2Ast.g:114:4: ( mergeMatched | mergeUnmatched )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==MERGE_MAT) ) {
                alt21=1;
            }
            else if ( (LA21_0==MERGE_UNM) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // EsperEPL2Ast.g:114:5: mergeMatched
                    {
                    pushFollow(FOLLOW_mergeMatched_in_mergeItem463);
                    mergeMatched();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:114:20: mergeUnmatched
                    {
                    pushFollow(FOLLOW_mergeUnmatched_in_mergeItem467);
                    mergeUnmatched();

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeItem"


    // $ANTLR start "mergeMatched"
    // EsperEPL2Ast.g:117:1: mergeMatched : ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? ) ;
    public final void mergeMatched() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:118:2: ( ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? ) )
            // EsperEPL2Ast.g:118:4: ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? )
            {
            m=(CommonTree)match(input,MERGE_MAT,FOLLOW_MERGE_MAT_in_mergeMatched482); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:118:18: ( mergeMatchedItem )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=MERGE_UPD && LA22_0<=MERGE_DEL)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // EsperEPL2Ast.g:118:18: mergeMatchedItem
            	    {
            	    pushFollow(FOLLOW_mergeMatchedItem_in_mergeMatched484);
            	    mergeMatchedItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // EsperEPL2Ast.g:118:36: ( valueExpr )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=IN_SET && LA23_0<=REGEXP)||LA23_0==NOT_EXPR||(LA23_0>=SUM && LA23_0<=AVG)||(LA23_0>=COALESCE && LA23_0<=COUNT)||(LA23_0>=CASE && LA23_0<=CASE2)||(LA23_0>=PREVIOUS && LA23_0<=EXISTS)||(LA23_0>=INSTANCEOF && LA23_0<=CURRENT_TIMESTAMP)||LA23_0==NEWKW||(LA23_0>=EVAL_AND_EXPR && LA23_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA23_0==EVENT_PROP_EXPR||LA23_0==CONCAT||(LA23_0>=LIB_FUNC_CHAIN && LA23_0<=DOT_EXPR)||LA23_0==ARRAY_EXPR||(LA23_0>=NOT_IN_SET && LA23_0<=NOT_REGEXP)||(LA23_0>=IN_RANGE && LA23_0<=SUBSELECT_EXPR)||(LA23_0>=EXISTS_SUBSELECT_EXPR && LA23_0<=NOT_IN_SUBSELECT_EXPR)||LA23_0==SUBSTITUTION||(LA23_0>=FIRST_AGGREG && LA23_0<=WINDOW_AGGREG)||(LA23_0>=INT_TYPE && LA23_0<=NULL_TYPE)||(LA23_0>=STAR && LA23_0<=PLUS)||(LA23_0>=BAND && LA23_0<=BXOR)||(LA23_0>=LT && LA23_0<=GE)||(LA23_0>=MINUS && LA23_0<=MOD)||(LA23_0>=EVAL_IS_GROUP_EXPR && LA23_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // EsperEPL2Ast.g:118:36: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeMatched487);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeMatched"


    // $ANTLR start "mergeMatchedItem"
    // EsperEPL2Ast.g:121:1: mergeMatchedItem : ( ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? ) | ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE ) | mergeInsert );
    public final void mergeMatchedItem() throws RecognitionException {
        CommonTree m=null;
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:122:2: ( ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? ) | ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE ) | mergeInsert )
            int alt27=3;
            switch ( input.LA(1) ) {
            case MERGE_UPD:
                {
                alt27=1;
                }
                break;
            case MERGE_DEL:
                {
                alt27=2;
                }
                break;
            case MERGE_INS:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // EsperEPL2Ast.g:122:4: ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? )
                    {
                    m=(CommonTree)match(input,MERGE_UPD,FOLLOW_MERGE_UPD_in_mergeMatchedItem505); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:122:18: ( onSetAssignment )*
                        loop24:
                        do {
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==ON_SET_EXPR_ITEM) ) {
                                alt24=1;
                            }


                            switch (alt24) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:122:18: onSetAssignment
                        	    {
                        	    pushFollow(FOLLOW_onSetAssignment_in_mergeMatchedItem507);
                        	    onSetAssignment();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop24;
                            }
                        } while (true);

                        // EsperEPL2Ast.g:122:35: ( whereClause[false] )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==WHERE_EXPR) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // EsperEPL2Ast.g:122:35: whereClause[false]
                                {
                                pushFollow(FOLLOW_whereClause_in_mergeMatchedItem510);
                                whereClause(false);

                                state._fsp--;


                                }
                                break;

                        }

                         leaveNode(m); 

                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:123:4: ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE )
                    {
                    d=(CommonTree)match(input,MERGE_DEL,FOLLOW_MERGE_DEL_in_mergeMatchedItem523); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:123:18: ( whereClause[false] )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==WHERE_EXPR) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // EsperEPL2Ast.g:123:18: whereClause[false]
                            {
                            pushFollow(FOLLOW_whereClause_in_mergeMatchedItem525);
                            whereClause(false);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,INT_TYPE,FOLLOW_INT_TYPE_in_mergeMatchedItem529); 
                     leaveNode(d); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:124:4: mergeInsert
                    {
                    pushFollow(FOLLOW_mergeInsert_in_mergeMatchedItem537);
                    mergeInsert();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeMatchedItem"


    // $ANTLR start "mergeUnmatched"
    // EsperEPL2Ast.g:127:1: mergeUnmatched : ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? ) ;
    public final void mergeUnmatched() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:128:2: ( ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? ) )
            // EsperEPL2Ast.g:128:4: ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? )
            {
            m=(CommonTree)match(input,MERGE_UNM,FOLLOW_MERGE_UNM_in_mergeUnmatched551); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:128:18: ( mergeInsert )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MERGE_INS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // EsperEPL2Ast.g:128:18: mergeInsert
            	    {
            	    pushFollow(FOLLOW_mergeInsert_in_mergeUnmatched553);
            	    mergeInsert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            // EsperEPL2Ast.g:128:31: ( valueExpr )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=IN_SET && LA29_0<=REGEXP)||LA29_0==NOT_EXPR||(LA29_0>=SUM && LA29_0<=AVG)||(LA29_0>=COALESCE && LA29_0<=COUNT)||(LA29_0>=CASE && LA29_0<=CASE2)||(LA29_0>=PREVIOUS && LA29_0<=EXISTS)||(LA29_0>=INSTANCEOF && LA29_0<=CURRENT_TIMESTAMP)||LA29_0==NEWKW||(LA29_0>=EVAL_AND_EXPR && LA29_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA29_0==EVENT_PROP_EXPR||LA29_0==CONCAT||(LA29_0>=LIB_FUNC_CHAIN && LA29_0<=DOT_EXPR)||LA29_0==ARRAY_EXPR||(LA29_0>=NOT_IN_SET && LA29_0<=NOT_REGEXP)||(LA29_0>=IN_RANGE && LA29_0<=SUBSELECT_EXPR)||(LA29_0>=EXISTS_SUBSELECT_EXPR && LA29_0<=NOT_IN_SUBSELECT_EXPR)||LA29_0==SUBSTITUTION||(LA29_0>=FIRST_AGGREG && LA29_0<=WINDOW_AGGREG)||(LA29_0>=INT_TYPE && LA29_0<=NULL_TYPE)||(LA29_0>=STAR && LA29_0<=PLUS)||(LA29_0>=BAND && LA29_0<=BXOR)||(LA29_0>=LT && LA29_0<=GE)||(LA29_0>=MINUS && LA29_0<=MOD)||(LA29_0>=EVAL_IS_GROUP_EXPR && LA29_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // EsperEPL2Ast.g:128:31: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeUnmatched556);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeUnmatched"


    // $ANTLR start "mergeInsert"
    // EsperEPL2Ast.g:131:1: mergeInsert : ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? ) ;
    public final void mergeInsert() throws RecognitionException {
        CommonTree um=null;

        try {
            // EsperEPL2Ast.g:132:2: ( ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:132:4: ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? )
            {
            um=(CommonTree)match(input,MERGE_INS,FOLLOW_MERGE_INS_in_mergeInsert575); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_selectionList_in_mergeInsert577);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:132:33: ( CLASS_IDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CLASS_IDENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // EsperEPL2Ast.g:132:33: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_mergeInsert579); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:132:46: ( exprCol )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EXPRCOL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // EsperEPL2Ast.g:132:46: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_mergeInsert582);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:132:55: ( whereClause[false] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==WHERE_EXPR) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // EsperEPL2Ast.g:132:55: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_mergeInsert585);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(um); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeInsert"


    // $ANTLR start "updateExpr"
    // EsperEPL2Ast.g:135:1: updateExpr : ^(u= UPDATE_EXPR CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? ) ;
    public final void updateExpr() throws RecognitionException {
        CommonTree u=null;

        try {
            // EsperEPL2Ast.g:136:2: ( ^(u= UPDATE_EXPR CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:136:4: ^(u= UPDATE_EXPR CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? )
            {
            u=(CommonTree)match(input,UPDATE_EXPR,FOLLOW_UPDATE_EXPR_in_updateExpr605); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_updateExpr607); 
            // EsperEPL2Ast.g:136:32: ( IDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // EsperEPL2Ast.g:136:32: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_updateExpr609); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:136:39: ( onSetAssignment )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ON_SET_EXPR_ITEM) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // EsperEPL2Ast.g:136:39: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_updateExpr612);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            // EsperEPL2Ast.g:136:56: ( whereClause[false] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==WHERE_EXPR) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // EsperEPL2Ast.g:136:56: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_updateExpr615);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(u); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "updateExpr"


    // $ANTLR start "onDeleteExpr"
    // EsperEPL2Ast.g:139:1: onDeleteExpr : ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? ) ;
    public final void onDeleteExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:140:2: ( ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:140:4: ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? )
            {
            match(input,ON_DELETE_EXPR,FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr632); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onDeleteExpr634);
            onExprFrom();

            state._fsp--;

            // EsperEPL2Ast.g:140:32: ( whereClause[true] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==WHERE_EXPR) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // EsperEPL2Ast.g:140:33: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onDeleteExpr637);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onDeleteExpr"


    // $ANTLR start "onSelectExpr"
    // EsperEPL2Ast.g:143:1: onSelectExpr : ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? ) ;
    public final void onSelectExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:144:2: ( ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? ) )
            // EsperEPL2Ast.g:144:4: ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? )
            {
            s=(CommonTree)match(input,ON_SELECT_EXPR,FOLLOW_ON_SELECT_EXPR_in_onSelectExpr657); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:144:23: ( insertIntoExpr )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==INSERTINTO_EXPR) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // EsperEPL2Ast.g:144:23: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_onSelectExpr659);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:144:39: ( DISTINCT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==DISTINCT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // EsperEPL2Ast.g:144:39: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_onSelectExpr662); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_onSelectExpr665);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:144:63: ( onExprFrom )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ON_EXPR_FROM) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // EsperEPL2Ast.g:144:63: onExprFrom
                    {
                    pushFollow(FOLLOW_onExprFrom_in_onSelectExpr667);
                    onExprFrom();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:144:75: ( whereClause[true] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==WHERE_EXPR) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // EsperEPL2Ast.g:144:75: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSelectExpr670);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:144:94: ( groupByClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==GROUP_BY_EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // EsperEPL2Ast.g:144:94: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_onSelectExpr674);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:144:109: ( havingClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==HAVING_EXPR) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // EsperEPL2Ast.g:144:109: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_onSelectExpr677);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:144:123: ( orderByClause )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ORDER_BY_EXPR) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // EsperEPL2Ast.g:144:123: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_onSelectExpr680);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:144:138: ( rowLimitClause )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ROW_LIMIT_EXPR) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // EsperEPL2Ast.g:144:138: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_onSelectExpr683);
                    rowLimitClause();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSelectExpr"


    // $ANTLR start "onSelectInsertExpr"
    // EsperEPL2Ast.g:147:1: onSelectInsertExpr : ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? ) ;
    public final void onSelectInsertExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:148:2: ( ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:148:4: ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? )
            {
            pushStmtContext();
            match(input,ON_SELECT_INSERT_EXPR,FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr703); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_insertIntoExpr_in_onSelectInsertExpr705);
            insertIntoExpr();

            state._fsp--;

            pushFollow(FOLLOW_selectionList_in_onSelectInsertExpr707);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:148:78: ( whereClause[true] )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WHERE_EXPR) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // EsperEPL2Ast.g:148:78: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSelectInsertExpr709);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSelectInsertExpr"


    // $ANTLR start "onSelectInsertOutput"
    // EsperEPL2Ast.g:151:1: onSelectInsertOutput : ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) ) ;
    public final void onSelectInsertOutput() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:152:2: ( ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) ) )
            // EsperEPL2Ast.g:152:4: ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) )
            {
            match(input,ON_SELECT_INSERT_OUTPUT,FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput726); 

            match(input, Token.DOWN, null); 
            if ( input.LA(1)==ALL||input.LA(1)==FIRST ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSelectInsertOutput"


    // $ANTLR start "onSetExpr"
    // EsperEPL2Ast.g:155:1: onSetExpr : ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? ) ;
    public final void onSetExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:156:2: ( ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:156:4: ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? )
            {
            match(input,ON_SET_EXPR,FOLLOW_ON_SET_EXPR_in_onSetExpr746); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onSetAssignment_in_onSetExpr748);
            onSetAssignment();

            state._fsp--;

            // EsperEPL2Ast.g:156:34: ( onSetAssignment )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ON_SET_EXPR_ITEM) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // EsperEPL2Ast.g:156:35: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_onSetExpr751);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // EsperEPL2Ast.g:156:53: ( whereClause[false] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==WHERE_EXPR) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // EsperEPL2Ast.g:156:53: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSetExpr755);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSetExpr"


    // $ANTLR start "onUpdateExpr"
    // EsperEPL2Ast.g:159:1: onUpdateExpr : ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? ) ;
    public final void onUpdateExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:160:2: ( ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:160:4: ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? )
            {
            match(input,ON_UPDATE_EXPR,FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr770); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onUpdateExpr772);
            onExprFrom();

            state._fsp--;

            // EsperEPL2Ast.g:160:32: ( onSetAssignment )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==ON_SET_EXPR_ITEM) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // EsperEPL2Ast.g:160:32: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_onUpdateExpr774);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // EsperEPL2Ast.g:160:49: ( whereClause[false] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WHERE_EXPR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // EsperEPL2Ast.g:160:49: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_onUpdateExpr777);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onUpdateExpr"


    // $ANTLR start "onSetAssignment"
    // EsperEPL2Ast.g:163:1: onSetAssignment : ^( ON_SET_EXPR_ITEM eventPropertyExpr[false] valueExpr ) ;
    public final void onSetAssignment() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:164:2: ( ^( ON_SET_EXPR_ITEM eventPropertyExpr[false] valueExpr ) )
            // EsperEPL2Ast.g:164:4: ^( ON_SET_EXPR_ITEM eventPropertyExpr[false] valueExpr )
            {
            match(input,ON_SET_EXPR_ITEM,FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment792); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_onSetAssignment794);
            eventPropertyExpr(false);

            state._fsp--;

            pushFollow(FOLLOW_valueExpr_in_onSetAssignment797);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSetAssignment"


    // $ANTLR start "onExprFrom"
    // EsperEPL2Ast.g:167:1: onExprFrom : ^( ON_EXPR_FROM IDENT ( IDENT )? ) ;
    public final void onExprFrom() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:168:2: ( ^( ON_EXPR_FROM IDENT ( IDENT )? ) )
            // EsperEPL2Ast.g:168:4: ^( ON_EXPR_FROM IDENT ( IDENT )? )
            {
            match(input,ON_EXPR_FROM,FOLLOW_ON_EXPR_FROM_in_onExprFrom811); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onExprFrom813); 
            // EsperEPL2Ast.g:168:25: ( IDENT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==IDENT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // EsperEPL2Ast.g:168:26: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onExprFrom816); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onExprFrom"


    // $ANTLR start "createWindowExpr"
    // EsperEPL2Ast.g:171:1: createWindowExpr : ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? ) ;
    public final void createWindowExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:172:2: ( ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? ) )
            // EsperEPL2Ast.g:172:4: ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? )
            {
            i=(CommonTree)match(input,CREATE_WINDOW_EXPR,FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr834); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createWindowExpr836); 
            // EsperEPL2Ast.g:172:33: ( viewListExpr )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==VIEW_EXPR) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // EsperEPL2Ast.g:172:34: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_createWindowExpr839);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:172:49: ( RETAINUNION )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RETAINUNION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // EsperEPL2Ast.g:172:49: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_createWindowExpr843); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:172:62: ( RETAININTERSECTION )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RETAININTERSECTION) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // EsperEPL2Ast.g:172:62: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_createWindowExpr846); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:173:4: ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==CLASS_IDENT||LA55_0==CREATE_WINDOW_SELECT_EXPR) ) {
                alt55=1;
            }
            else if ( (LA55_0==CREATE_COL_TYPE_LIST) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // EsperEPL2Ast.g:174:5: ( ( createSelectionList )? CLASS_IDENT )
                    {
                    // EsperEPL2Ast.g:174:5: ( ( createSelectionList )? CLASS_IDENT )
                    // EsperEPL2Ast.g:174:6: ( createSelectionList )? CLASS_IDENT
                    {
                    // EsperEPL2Ast.g:174:6: ( createSelectionList )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==CREATE_WINDOW_SELECT_EXPR) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // EsperEPL2Ast.g:174:6: createSelectionList
                            {
                            pushFollow(FOLLOW_createSelectionList_in_createWindowExpr860);
                            createSelectionList();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createWindowExpr863); 

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:176:12: ( createColTypeList )
                    {
                    // EsperEPL2Ast.g:176:12: ( createColTypeList )
                    // EsperEPL2Ast.g:176:13: createColTypeList
                    {
                    pushFollow(FOLLOW_createColTypeList_in_createWindowExpr892);
                    createColTypeList();

                    state._fsp--;


                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:178:4: ( createWindowExprInsert )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==INSERT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // EsperEPL2Ast.g:178:4: createWindowExprInsert
                    {
                    pushFollow(FOLLOW_createWindowExprInsert_in_createWindowExpr903);
                    createWindowExprInsert();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createWindowExpr"


    // $ANTLR start "createIndexExpr"
    // EsperEPL2Ast.g:182:1: createIndexExpr : ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList ) ;
    public final void createIndexExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:183:2: ( ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList ) )
            // EsperEPL2Ast.g:183:4: ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList )
            {
            i=(CommonTree)match(input,CREATE_INDEX_EXPR,FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr923); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr925); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr927); 
            pushFollow(FOLLOW_indexColList_in_createIndexExpr929);
            indexColList();

            state._fsp--;

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createIndexExpr"


    // $ANTLR start "indexColList"
    // EsperEPL2Ast.g:186:1: indexColList : ^( INDEXCOL ( indexCol )+ ) ;
    public final void indexColList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:187:2: ( ^( INDEXCOL ( indexCol )+ ) )
            // EsperEPL2Ast.g:187:4: ^( INDEXCOL ( indexCol )+ )
            {
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexColList944); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:187:15: ( indexCol )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==INDEXCOL) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // EsperEPL2Ast.g:187:15: indexCol
            	    {
            	    pushFollow(FOLLOW_indexCol_in_indexColList946);
            	    indexCol();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "indexColList"


    // $ANTLR start "indexCol"
    // EsperEPL2Ast.g:190:1: indexCol : ^( INDEXCOL IDENT ( IDENT )? ) ;
    public final void indexCol() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:191:2: ( ^( INDEXCOL IDENT ( IDENT )? ) )
            // EsperEPL2Ast.g:191:4: ^( INDEXCOL IDENT ( IDENT )? )
            {
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexCol961); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_indexCol963); 
            // EsperEPL2Ast.g:191:21: ( IDENT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // EsperEPL2Ast.g:191:21: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_indexCol965); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "indexCol"


    // $ANTLR start "createWindowExprInsert"
    // EsperEPL2Ast.g:194:1: createWindowExprInsert : ^( INSERT ( valueExpr )? ) ;
    public final void createWindowExprInsert() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:195:2: ( ^( INSERT ( valueExpr )? ) )
            // EsperEPL2Ast.g:195:4: ^( INSERT ( valueExpr )? )
            {
            match(input,INSERT,FOLLOW_INSERT_in_createWindowExprInsert979); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:195:13: ( valueExpr )?
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=IN_SET && LA59_0<=REGEXP)||LA59_0==NOT_EXPR||(LA59_0>=SUM && LA59_0<=AVG)||(LA59_0>=COALESCE && LA59_0<=COUNT)||(LA59_0>=CASE && LA59_0<=CASE2)||(LA59_0>=PREVIOUS && LA59_0<=EXISTS)||(LA59_0>=INSTANCEOF && LA59_0<=CURRENT_TIMESTAMP)||LA59_0==NEWKW||(LA59_0>=EVAL_AND_EXPR && LA59_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA59_0==EVENT_PROP_EXPR||LA59_0==CONCAT||(LA59_0>=LIB_FUNC_CHAIN && LA59_0<=DOT_EXPR)||LA59_0==ARRAY_EXPR||(LA59_0>=NOT_IN_SET && LA59_0<=NOT_REGEXP)||(LA59_0>=IN_RANGE && LA59_0<=SUBSELECT_EXPR)||(LA59_0>=EXISTS_SUBSELECT_EXPR && LA59_0<=NOT_IN_SUBSELECT_EXPR)||LA59_0==SUBSTITUTION||(LA59_0>=FIRST_AGGREG && LA59_0<=WINDOW_AGGREG)||(LA59_0>=INT_TYPE && LA59_0<=NULL_TYPE)||(LA59_0>=STAR && LA59_0<=PLUS)||(LA59_0>=BAND && LA59_0<=BXOR)||(LA59_0>=LT && LA59_0<=GE)||(LA59_0>=MINUS && LA59_0<=MOD)||(LA59_0>=EVAL_IS_GROUP_EXPR && LA59_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt59=1;
                }
                switch (alt59) {
                    case 1 :
                        // EsperEPL2Ast.g:195:13: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_createWindowExprInsert981);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createWindowExprInsert"


    // $ANTLR start "createSelectionList"
    // EsperEPL2Ast.g:198:1: createSelectionList : ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* ) ;
    public final void createSelectionList() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:199:2: ( ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* ) )
            // EsperEPL2Ast.g:199:4: ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* )
            {
            s=(CommonTree)match(input,CREATE_WINDOW_SELECT_EXPR,FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList998); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1000);
            createSelectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:199:61: ( createSelectionListElement )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==SELECTION_ELEMENT_EXPR||LA60_0==WILDCARD_SELECT) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // EsperEPL2Ast.g:199:62: createSelectionListElement
            	    {
            	    pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1003);
            	    createSelectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSelectionList"


    // $ANTLR start "createColTypeList"
    // EsperEPL2Ast.g:202:1: createColTypeList : ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* ) ;
    public final void createColTypeList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:203:2: ( ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* ) )
            // EsperEPL2Ast.g:203:4: ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* )
            {
            match(input,CREATE_COL_TYPE_LIST,FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1022); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1024);
            createColTypeListElement();

            state._fsp--;

            // EsperEPL2Ast.g:203:52: ( createColTypeListElement )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==CREATE_COL_TYPE) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // EsperEPL2Ast.g:203:53: createColTypeListElement
            	    {
            	    pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1027);
            	    createColTypeListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createColTypeList"


    // $ANTLR start "createColTypeListElement"
    // EsperEPL2Ast.g:206:1: createColTypeListElement : ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? ) ;
    public final void createColTypeListElement() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:207:2: ( ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? ) )
            // EsperEPL2Ast.g:207:4: ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? )
            {
            match(input,CREATE_COL_TYPE,FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1042); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1044); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1046); 
            // EsperEPL2Ast.g:207:46: ( LBRACK )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LBRACK) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // EsperEPL2Ast.g:207:46: LBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_createColTypeListElement1048); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createColTypeListElement"


    // $ANTLR start "createSelectionListElement"
    // EsperEPL2Ast.g:210:1: createSelectionListElement : (w= WILDCARD_SELECT | ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) ) );
    public final void createSelectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:211:2: (w= WILDCARD_SELECT | ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==WILDCARD_SELECT) ) {
                alt65=1;
            }
            else if ( (LA65_0==SELECTION_ELEMENT_EXPR) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // EsperEPL2Ast.g:211:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1063); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:212:4: ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) )
                    {
                    s=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1073); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:212:31: ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==EVENT_PROP_EXPR) ) {
                        alt64=1;
                    }
                    else if ( ((LA64_0>=INT_TYPE && LA64_0<=NULL_TYPE)) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // EsperEPL2Ast.g:213:16: ( eventPropertyExpr[true] ( IDENT )? )
                            {
                            // EsperEPL2Ast.g:213:16: ( eventPropertyExpr[true] ( IDENT )? )
                            // EsperEPL2Ast.g:213:17: eventPropertyExpr[true] ( IDENT )?
                            {
                            pushFollow(FOLLOW_eventPropertyExpr_in_createSelectionListElement1093);
                            eventPropertyExpr(true);

                            state._fsp--;

                            // EsperEPL2Ast.g:213:41: ( IDENT )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==IDENT) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // EsperEPL2Ast.g:213:42: IDENT
                                    {
                                    match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1097); 

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:214:16: ( constant[true] IDENT )
                            {
                            // EsperEPL2Ast.g:214:16: ( constant[true] IDENT )
                            // EsperEPL2Ast.g:214:17: constant[true] IDENT
                            {
                            pushFollow(FOLLOW_constant_in_createSelectionListElement1119);
                            constant(true);

                            state._fsp--;

                            match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1122); 

                            }


                            }
                            break;

                    }

                     leaveNode(s); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSelectionListElement"


    // $ANTLR start "createVariableExpr"
    // EsperEPL2Ast.g:218:1: createVariableExpr : ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( valueExpr )? ) ;
    public final void createVariableExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:219:2: ( ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( valueExpr )? ) )
            // EsperEPL2Ast.g:219:4: ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( valueExpr )? )
            {
            i=(CommonTree)match(input,CREATE_VARIABLE_EXPR,FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1158); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createVariableExpr1160); 
            match(input,IDENT,FOLLOW_IDENT_in_createVariableExpr1162); 
            // EsperEPL2Ast.g:219:47: ( valueExpr )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=IN_SET && LA66_0<=REGEXP)||LA66_0==NOT_EXPR||(LA66_0>=SUM && LA66_0<=AVG)||(LA66_0>=COALESCE && LA66_0<=COUNT)||(LA66_0>=CASE && LA66_0<=CASE2)||(LA66_0>=PREVIOUS && LA66_0<=EXISTS)||(LA66_0>=INSTANCEOF && LA66_0<=CURRENT_TIMESTAMP)||LA66_0==NEWKW||(LA66_0>=EVAL_AND_EXPR && LA66_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA66_0==EVENT_PROP_EXPR||LA66_0==CONCAT||(LA66_0>=LIB_FUNC_CHAIN && LA66_0<=DOT_EXPR)||LA66_0==ARRAY_EXPR||(LA66_0>=NOT_IN_SET && LA66_0<=NOT_REGEXP)||(LA66_0>=IN_RANGE && LA66_0<=SUBSELECT_EXPR)||(LA66_0>=EXISTS_SUBSELECT_EXPR && LA66_0<=NOT_IN_SUBSELECT_EXPR)||LA66_0==SUBSTITUTION||(LA66_0>=FIRST_AGGREG && LA66_0<=WINDOW_AGGREG)||(LA66_0>=INT_TYPE && LA66_0<=NULL_TYPE)||(LA66_0>=STAR && LA66_0<=PLUS)||(LA66_0>=BAND && LA66_0<=BXOR)||(LA66_0>=LT && LA66_0<=GE)||(LA66_0>=MINUS && LA66_0<=MOD)||(LA66_0>=EVAL_IS_GROUP_EXPR && LA66_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // EsperEPL2Ast.g:219:48: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_createVariableExpr1165);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createVariableExpr"


    // $ANTLR start "createContextExpr"
    // EsperEPL2Ast.g:222:1: createContextExpr : ^(s= CREATE_CTX IDENT createContextDetail ) ;
    public final void createContextExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:223:2: ( ^(s= CREATE_CTX IDENT createContextDetail ) )
            // EsperEPL2Ast.g:223:4: ^(s= CREATE_CTX IDENT createContextDetail )
            {
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextExpr1185); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextExpr1187); 
            pushFollow(FOLLOW_createContextDetail_in_createContextExpr1189);
            createContextDetail();

            state._fsp--;

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextExpr"


    // $ANTLR start "createContextDetail"
    // EsperEPL2Ast.g:226:1: createContextDetail : ( ^( CREATE_CTX_FIXED crontabLimitParameterSet crontabLimitParameterSet ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_INIT ( createContextFilter | patternInclusionExpression ) timePeriod ) );
    public final void createContextDetail() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:227:2: ( ^( CREATE_CTX_FIXED crontabLimitParameterSet crontabLimitParameterSet ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_INIT ( createContextFilter | patternInclusionExpression ) timePeriod ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case CREATE_CTX_FIXED:
                {
                alt70=1;
                }
                break;
            case CREATE_CTX_PART:
                {
                alt70=2;
                }
                break;
            case CREATE_CTX_CAT:
                {
                alt70=3;
                }
                break;
            case CREATE_CTX_INIT:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // EsperEPL2Ast.g:227:4: ^( CREATE_CTX_FIXED crontabLimitParameterSet crontabLimitParameterSet )
                    {
                    match(input,CREATE_CTX_FIXED,FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1205); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_crontabLimitParameterSet_in_createContextDetail1207);
                    crontabLimitParameterSet();

                    state._fsp--;

                    pushFollow(FOLLOW_crontabLimitParameterSet_in_createContextDetail1209);
                    crontabLimitParameterSet();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:228:4: ^( CREATE_CTX_PART ( createContextPartitionItem )+ )
                    {
                    match(input,CREATE_CTX_PART,FOLLOW_CREATE_CTX_PART_in_createContextDetail1216); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:228:22: ( createContextPartitionItem )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==PARTITIONITEM) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:228:22: createContextPartitionItem
                    	    {
                    	    pushFollow(FOLLOW_createContextPartitionItem_in_createContextDetail1218);
                    	    createContextPartitionItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:229:4: ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] )
                    {
                    match(input,CREATE_CTX_CAT,FOLLOW_CREATE_CTX_CAT_in_createContextDetail1226); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:229:21: ( createContextCategoryItem )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==CREATE_CTX_CATITEM) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:229:21: createContextCategoryItem
                    	    {
                    	    pushFollow(FOLLOW_createContextCategoryItem_in_createContextDetail1228);
                    	    createContextCategoryItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    pushFollow(FOLLOW_eventFilterExpr_in_createContextDetail1231);
                    eventFilterExpr(false);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:230:4: ^( CREATE_CTX_INIT ( createContextFilter | patternInclusionExpression ) timePeriod )
                    {
                    match(input,CREATE_CTX_INIT,FOLLOW_CREATE_CTX_INIT_in_createContextDetail1239); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:230:22: ( createContextFilter | patternInclusionExpression )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==STREAM_EXPR) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==PATTERN_INCL_EXPR) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // EsperEPL2Ast.g:230:23: createContextFilter
                            {
                            pushFollow(FOLLOW_createContextFilter_in_createContextDetail1242);
                            createContextFilter();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:230:45: patternInclusionExpression
                            {
                            pushFollow(FOLLOW_patternInclusionExpression_in_createContextDetail1246);
                            patternInclusionExpression();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timePeriod_in_createContextDetail1249);
                    timePeriod();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextDetail"


    // $ANTLR start "createContextFilter"
    // EsperEPL2Ast.g:233:1: createContextFilter : ^( STREAM_EXPR eventFilterExpr[false] IDENT ) ;
    public final void createContextFilter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:234:2: ( ^( STREAM_EXPR eventFilterExpr[false] IDENT ) )
            // EsperEPL2Ast.g:234:4: ^( STREAM_EXPR eventFilterExpr[false] IDENT )
            {
            match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_createContextFilter1263); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextFilter1265);
            eventFilterExpr(false);

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_createContextFilter1268); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextFilter"


    // $ANTLR start "createContextPartitionItem"
    // EsperEPL2Ast.g:237:1: createContextPartitionItem : ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) ;
    public final void createContextPartitionItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:238:2: ( ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) )
            // EsperEPL2Ast.g:238:4: ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ )
            {
            match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_createContextPartitionItem1283); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextPartitionItem1285);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:238:43: ( eventPropertyExpr[false] )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==EVENT_PROP_EXPR) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // EsperEPL2Ast.g:238:43: eventPropertyExpr[false]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_createContextPartitionItem1288);
            	    eventPropertyExpr(false);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextPartitionItem"


    // $ANTLR start "createContextCategoryItem"
    // EsperEPL2Ast.g:241:1: createContextCategoryItem : ^( CREATE_CTX_CATITEM valueExpr IDENT ) ;
    public final void createContextCategoryItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:242:2: ( ^( CREATE_CTX_CATITEM valueExpr IDENT ) )
            // EsperEPL2Ast.g:242:4: ^( CREATE_CTX_CATITEM valueExpr IDENT )
            {
            match(input,CREATE_CTX_CATITEM,FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1305); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_createContextCategoryItem1307);
            valueExpr();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_createContextCategoryItem1309); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextCategoryItem"


    // $ANTLR start "createSchemaExpr"
    // EsperEPL2Ast.g:245:1: createSchemaExpr : ^(s= CREATE_SCHEMA_EXPR IDENT ( variantList | ( createColTypeList )? ) ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )? ( createSchemaQual )* ) ;
    public final void createSchemaExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:246:2: ( ^(s= CREATE_SCHEMA_EXPR IDENT ( variantList | ( createColTypeList )? ) ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )? ( createSchemaQual )* ) )
            // EsperEPL2Ast.g:246:4: ^(s= CREATE_SCHEMA_EXPR IDENT ( variantList | ( createColTypeList )? ) ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )? ( createSchemaQual )* )
            {
            s=(CommonTree)match(input,CREATE_SCHEMA_EXPR,FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1326); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1328); 
            // EsperEPL2Ast.g:246:33: ( variantList | ( createColTypeList )? )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==VARIANT_LIST) ) {
                alt73=1;
            }
            else if ( (LA73_0==UP||LA73_0==CREATE_COL_TYPE_LIST||(LA73_0>=CREATE_SCHEMA_EXPR_QUAL && LA73_0<=CREATE_SCHEMA_EXPR_VAR)) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // EsperEPL2Ast.g:246:34: variantList
                    {
                    pushFollow(FOLLOW_variantList_in_createSchemaExpr1331);
                    variantList();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:246:46: ( createColTypeList )?
                    {
                    // EsperEPL2Ast.g:246:46: ( createColTypeList )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==CREATE_COL_TYPE_LIST) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // EsperEPL2Ast.g:246:46: createColTypeList
                            {
                            pushFollow(FOLLOW_createColTypeList_in_createSchemaExpr1333);
                            createColTypeList();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:246:66: ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==CREATE_SCHEMA_EXPR_VAR) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // EsperEPL2Ast.g:246:67: ^( CREATE_SCHEMA_EXPR_VAR IDENT )
                    {
                    match(input,CREATE_SCHEMA_EXPR_VAR,FOLLOW_CREATE_SCHEMA_EXPR_VAR_in_createSchemaExpr1339); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1341); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:246:101: ( createSchemaQual )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==CREATE_SCHEMA_EXPR_QUAL) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // EsperEPL2Ast.g:246:101: createSchemaQual
            	    {
            	    pushFollow(FOLLOW_createSchemaQual_in_createSchemaExpr1346);
            	    createSchemaQual();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSchemaExpr"


    // $ANTLR start "createSchemaQual"
    // EsperEPL2Ast.g:249:1: createSchemaQual : ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) ;
    public final void createSchemaQual() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:250:2: ( ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) )
            // EsperEPL2Ast.g:250:4: ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol )
            {
            match(input,CREATE_SCHEMA_EXPR_QUAL,FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1364); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaQual1366); 
            pushFollow(FOLLOW_exprCol_in_createSchemaQual1368);
            exprCol();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSchemaQual"


    // $ANTLR start "variantList"
    // EsperEPL2Ast.g:253:1: variantList : ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) ;
    public final void variantList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:254:2: ( ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) )
            // EsperEPL2Ast.g:254:4: ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ )
            {
            match(input,VARIANT_LIST,FOLLOW_VARIANT_LIST_in_variantList1384); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:254:19: ( STAR | CLASS_IDENT )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==CLASS_IDENT||LA76_0==STAR) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // EsperEPL2Ast.g:
            	    {
            	    if ( input.LA(1)==CLASS_IDENT||input.LA(1)==STAR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "variantList"


    // $ANTLR start "selectExpr"
    // EsperEPL2Ast.g:257:1: selectExpr : ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? ;
    public final void selectExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:258:2: ( ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? )
            // EsperEPL2Ast.g:258:4: ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )?
            {
            // EsperEPL2Ast.g:258:4: ( insertIntoExpr )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==INSERTINTO_EXPR) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // EsperEPL2Ast.g:258:5: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_selectExpr1404);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_selectClause_in_selectExpr1410);
            selectClause();

            state._fsp--;

            pushFollow(FOLLOW_fromClause_in_selectExpr1415);
            fromClause();

            state._fsp--;

            // EsperEPL2Ast.g:261:3: ( matchRecogClause )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==MATCH_RECOGNIZE) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // EsperEPL2Ast.g:261:4: matchRecogClause
                    {
                    pushFollow(FOLLOW_matchRecogClause_in_selectExpr1420);
                    matchRecogClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:262:3: ( whereClause[true] )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==WHERE_EXPR) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // EsperEPL2Ast.g:262:4: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr1427);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:263:3: ( groupByClause )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==GROUP_BY_EXPR) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // EsperEPL2Ast.g:263:4: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_selectExpr1435);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:264:3: ( havingClause )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==HAVING_EXPR) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // EsperEPL2Ast.g:264:4: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_selectExpr1442);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:265:3: ( outputLimitExpr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=EVENT_LIMIT_EXPR && LA82_0<=CRONTAB_LIMIT_EXPR)||(LA82_0>=WHEN_LIMIT_EXPR && LA82_0<=TERM_LIMIT_EXPR)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // EsperEPL2Ast.g:265:4: outputLimitExpr
                    {
                    pushFollow(FOLLOW_outputLimitExpr_in_selectExpr1449);
                    outputLimitExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:266:3: ( orderByClause )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==ORDER_BY_EXPR) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // EsperEPL2Ast.g:266:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_selectExpr1456);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:267:3: ( rowLimitClause )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==ROW_LIMIT_EXPR) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // EsperEPL2Ast.g:267:4: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_selectExpr1463);
                    rowLimitClause();

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectExpr"


    // $ANTLR start "insertIntoExpr"
    // EsperEPL2Ast.g:270:1: insertIntoExpr : ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? ) ;
    public final void insertIntoExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:271:2: ( ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? ) )
            // EsperEPL2Ast.g:271:4: ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? )
            {
            i=(CommonTree)match(input,INSERTINTO_EXPR,FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1480); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:271:24: ( ISTREAM | RSTREAM )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RSTREAM && LA85_0<=ISTREAM)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=RSTREAM && input.LA(1)<=ISTREAM) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_insertIntoExpr1491); 
            // EsperEPL2Ast.g:271:57: ( exprCol )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==EXPRCOL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // EsperEPL2Ast.g:271:58: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_insertIntoExpr1494);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "insertIntoExpr"


    // $ANTLR start "exprCol"
    // EsperEPL2Ast.g:274:1: exprCol : ^( EXPRCOL IDENT ( IDENT )* ) ;
    public final void exprCol() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:275:2: ( ^( EXPRCOL IDENT ( IDENT )* ) )
            // EsperEPL2Ast.g:275:4: ^( EXPRCOL IDENT ( IDENT )* )
            {
            match(input,EXPRCOL,FOLLOW_EXPRCOL_in_exprCol1513); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_exprCol1515); 
            // EsperEPL2Ast.g:275:20: ( IDENT )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==IDENT) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // EsperEPL2Ast.g:275:21: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_exprCol1518); 

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprCol"


    // $ANTLR start "selectClause"
    // EsperEPL2Ast.g:278:1: selectClause : ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) ;
    public final void selectClause() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:279:2: ( ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) )
            // EsperEPL2Ast.g:279:4: ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList )
            {
            s=(CommonTree)match(input,SELECTION_EXPR,FOLLOW_SELECTION_EXPR_in_selectClause1536); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:279:23: ( RSTREAM | ISTREAM | IRSTREAM )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RSTREAM && LA88_0<=IRSTREAM)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=RSTREAM && input.LA(1)<=IRSTREAM) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:279:55: ( DISTINCT )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==DISTINCT) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // EsperEPL2Ast.g:279:55: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause1551); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_selectClause1554);
            selectionList();

            state._fsp--;

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "fromClause"
    // EsperEPL2Ast.g:282:1: fromClause : streamExpression ( streamExpression ( outerJoin )* )* ;
    public final void fromClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:283:2: ( streamExpression ( streamExpression ( outerJoin )* )* )
            // EsperEPL2Ast.g:283:4: streamExpression ( streamExpression ( outerJoin )* )*
            {
            pushFollow(FOLLOW_streamExpression_in_fromClause1568);
            streamExpression();

            state._fsp--;

            // EsperEPL2Ast.g:283:21: ( streamExpression ( outerJoin )* )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==STREAM_EXPR) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // EsperEPL2Ast.g:283:22: streamExpression ( outerJoin )*
            	    {
            	    pushFollow(FOLLOW_streamExpression_in_fromClause1571);
            	    streamExpression();

            	    state._fsp--;

            	    // EsperEPL2Ast.g:283:39: ( outerJoin )*
            	    loop90:
            	    do {
            	        int alt90=2;
            	        int LA90_0 = input.LA(1);

            	        if ( ((LA90_0>=INNERJOIN_EXPR && LA90_0<=FULL_OUTERJOIN_EXPR)) ) {
            	            alt90=1;
            	        }


            	        switch (alt90) {
            	    	case 1 :
            	    	    // EsperEPL2Ast.g:283:40: outerJoin
            	    	    {
            	    	    pushFollow(FOLLOW_outerJoin_in_fromClause1574);
            	    	    outerJoin();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop90;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "fromClause"


    // $ANTLR start "forExpr"
    // EsperEPL2Ast.g:286:1: forExpr : ^(f= FOR IDENT ( valueExpr )* ) ;
    public final void forExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:287:2: ( ^(f= FOR IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:287:4: ^(f= FOR IDENT ( valueExpr )* )
            {
            f=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forExpr1594); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_forExpr1596); 
            // EsperEPL2Ast.g:287:18: ( valueExpr )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=IN_SET && LA92_0<=REGEXP)||LA92_0==NOT_EXPR||(LA92_0>=SUM && LA92_0<=AVG)||(LA92_0>=COALESCE && LA92_0<=COUNT)||(LA92_0>=CASE && LA92_0<=CASE2)||(LA92_0>=PREVIOUS && LA92_0<=EXISTS)||(LA92_0>=INSTANCEOF && LA92_0<=CURRENT_TIMESTAMP)||LA92_0==NEWKW||(LA92_0>=EVAL_AND_EXPR && LA92_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA92_0==EVENT_PROP_EXPR||LA92_0==CONCAT||(LA92_0>=LIB_FUNC_CHAIN && LA92_0<=DOT_EXPR)||LA92_0==ARRAY_EXPR||(LA92_0>=NOT_IN_SET && LA92_0<=NOT_REGEXP)||(LA92_0>=IN_RANGE && LA92_0<=SUBSELECT_EXPR)||(LA92_0>=EXISTS_SUBSELECT_EXPR && LA92_0<=NOT_IN_SUBSELECT_EXPR)||LA92_0==SUBSTITUTION||(LA92_0>=FIRST_AGGREG && LA92_0<=WINDOW_AGGREG)||(LA92_0>=INT_TYPE && LA92_0<=NULL_TYPE)||(LA92_0>=STAR && LA92_0<=PLUS)||(LA92_0>=BAND && LA92_0<=BXOR)||(LA92_0>=LT && LA92_0<=GE)||(LA92_0>=MINUS && LA92_0<=MOD)||(LA92_0>=EVAL_IS_GROUP_EXPR && LA92_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // EsperEPL2Ast.g:287:18: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_forExpr1598);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

             leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "forExpr"


    // $ANTLR start "matchRecogClause"
    // EsperEPL2Ast.g:290:1: matchRecogClause : ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) ;
    public final void matchRecogClause() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:291:2: ( ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) )
            // EsperEPL2Ast.g:291:4: ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine )
            {
            m=(CommonTree)match(input,MATCH_RECOGNIZE,FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause1617); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:291:24: ( matchRecogPartitionBy )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==PARTITIONITEM) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // EsperEPL2Ast.g:291:24: matchRecogPartitionBy
                    {
                    pushFollow(FOLLOW_matchRecogPartitionBy_in_matchRecogClause1619);
                    matchRecogPartitionBy();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogMeasures_in_matchRecogClause1626);
            matchRecogMeasures();

            state._fsp--;

            // EsperEPL2Ast.g:293:4: ( ALL )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ALL) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // EsperEPL2Ast.g:293:4: ALL
                    {
                    match(input,ALL,FOLLOW_ALL_in_matchRecogClause1632); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:294:4: ( matchRecogMatchesAfterSkip )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==MATCHREC_AFTER_SKIP) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // EsperEPL2Ast.g:294:4: matchRecogMatchesAfterSkip
                    {
                    pushFollow(FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause1638);
                    matchRecogMatchesAfterSkip();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogPattern_in_matchRecogClause1644);
            matchRecogPattern();

            state._fsp--;

            // EsperEPL2Ast.g:296:4: ( matchRecogMatchesInterval )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==MATCHREC_INTERVAL) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // EsperEPL2Ast.g:296:4: matchRecogMatchesInterval
                    {
                    pushFollow(FOLLOW_matchRecogMatchesInterval_in_matchRecogClause1650);
                    matchRecogMatchesInterval();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogDefine_in_matchRecogClause1656);
            matchRecogDefine();

            state._fsp--;

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogClause"


    // $ANTLR start "matchRecogPartitionBy"
    // EsperEPL2Ast.g:300:1: matchRecogPartitionBy : ^(p= PARTITIONITEM ( valueExpr )+ ) ;
    public final void matchRecogPartitionBy() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:301:2: ( ^(p= PARTITIONITEM ( valueExpr )+ ) )
            // EsperEPL2Ast.g:301:4: ^(p= PARTITIONITEM ( valueExpr )+ )
            {
            p=(CommonTree)match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy1674); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:301:22: ( valueExpr )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=IN_SET && LA97_0<=REGEXP)||LA97_0==NOT_EXPR||(LA97_0>=SUM && LA97_0<=AVG)||(LA97_0>=COALESCE && LA97_0<=COUNT)||(LA97_0>=CASE && LA97_0<=CASE2)||(LA97_0>=PREVIOUS && LA97_0<=EXISTS)||(LA97_0>=INSTANCEOF && LA97_0<=CURRENT_TIMESTAMP)||LA97_0==NEWKW||(LA97_0>=EVAL_AND_EXPR && LA97_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA97_0==EVENT_PROP_EXPR||LA97_0==CONCAT||(LA97_0>=LIB_FUNC_CHAIN && LA97_0<=DOT_EXPR)||LA97_0==ARRAY_EXPR||(LA97_0>=NOT_IN_SET && LA97_0<=NOT_REGEXP)||(LA97_0>=IN_RANGE && LA97_0<=SUBSELECT_EXPR)||(LA97_0>=EXISTS_SUBSELECT_EXPR && LA97_0<=NOT_IN_SUBSELECT_EXPR)||LA97_0==SUBSTITUTION||(LA97_0>=FIRST_AGGREG && LA97_0<=WINDOW_AGGREG)||(LA97_0>=INT_TYPE && LA97_0<=NULL_TYPE)||(LA97_0>=STAR && LA97_0<=PLUS)||(LA97_0>=BAND && LA97_0<=BXOR)||(LA97_0>=LT && LA97_0<=GE)||(LA97_0>=MINUS && LA97_0<=MOD)||(LA97_0>=EVAL_IS_GROUP_EXPR && LA97_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // EsperEPL2Ast.g:301:22: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_matchRecogPartitionBy1676);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPartitionBy"


    // $ANTLR start "matchRecogMatchesAfterSkip"
    // EsperEPL2Ast.g:304:1: matchRecogMatchesAfterSkip : ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) ;
    public final void matchRecogMatchesAfterSkip() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:305:2: ( ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) )
            // EsperEPL2Ast.g:305:4: ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT )
            {
            match(input,MATCHREC_AFTER_SKIP,FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip1693); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1695); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1697); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1699); 
            if ( input.LA(1)==LAST||input.LA(1)==IDENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1707); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMatchesAfterSkip"


    // $ANTLR start "matchRecogMatchesInterval"
    // EsperEPL2Ast.g:308:1: matchRecogMatchesInterval : ^( MATCHREC_INTERVAL IDENT timePeriod ) ;
    public final void matchRecogMatchesInterval() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:309:2: ( ^( MATCHREC_INTERVAL IDENT timePeriod ) )
            // EsperEPL2Ast.g:309:4: ^( MATCHREC_INTERVAL IDENT timePeriod )
            {
            match(input,MATCHREC_INTERVAL,FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval1722); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesInterval1724); 
            pushFollow(FOLLOW_timePeriod_in_matchRecogMatchesInterval1726);
            timePeriod();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMatchesInterval"


    // $ANTLR start "matchRecogMeasures"
    // EsperEPL2Ast.g:312:1: matchRecogMeasures : ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) ;
    public final void matchRecogMeasures() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:313:2: ( ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) )
            // EsperEPL2Ast.g:313:4: ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURES,FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures1742); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:313:26: ( matchRecogMeasureListElement )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==MATCHREC_MEASURE_ITEM) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // EsperEPL2Ast.g:313:26: matchRecogMeasureListElement
                	    {
                	    pushFollow(FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures1744);
                	    matchRecogMeasureListElement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMeasures"


    // $ANTLR start "matchRecogMeasureListElement"
    // EsperEPL2Ast.g:316:1: matchRecogMeasureListElement : ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) ;
    public final void matchRecogMeasureListElement() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:317:2: ( ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) )
            // EsperEPL2Ast.g:317:4: ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURE_ITEM,FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement1761); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogMeasureListElement1763);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:317:40: ( IDENT )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==IDENT) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // EsperEPL2Ast.g:317:40: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_matchRecogMeasureListElement1765); 

                    }
                    break;

            }

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMeasureListElement"


    // $ANTLR start "matchRecogPattern"
    // EsperEPL2Ast.g:320:1: matchRecogPattern : ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) ;
    public final void matchRecogPattern() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:321:2: ( ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) )
            // EsperEPL2Ast.g:321:4: ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN,FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern1785); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:321:25: ( matchRecogPatternAlteration )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( ((LA100_0>=MATCHREC_PATTERN_CONCAT && LA100_0<=MATCHREC_PATTERN_ALTER)) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // EsperEPL2Ast.g:321:25: matchRecogPatternAlteration
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern1787);
            	    matchRecogPatternAlteration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPattern"


    // $ANTLR start "matchRecogPatternAlteration"
    // EsperEPL2Ast.g:324:1: matchRecogPatternAlteration : ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) );
    public final void matchRecogPatternAlteration() throws RecognitionException {
        CommonTree o=null;

        try {
            // EsperEPL2Ast.g:325:2: ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==MATCHREC_PATTERN_CONCAT) ) {
                alt102=1;
            }
            else if ( (LA102_0==MATCHREC_PATTERN_ALTER) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // EsperEPL2Ast.g:325:4: matchRecogPatternConcat
                    {
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1802);
                    matchRecogPatternConcat();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:326:4: ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ )
                    {
                    o=(CommonTree)match(input,MATCHREC_PATTERN_ALTER,FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration1810); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1812);
                    matchRecogPatternConcat();

                    state._fsp--;

                    // EsperEPL2Ast.g:326:55: ( matchRecogPatternConcat )+
                    int cnt101=0;
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==MATCHREC_PATTERN_CONCAT) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:326:55: matchRecogPatternConcat
                    	    {
                    	    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1814);
                    	    matchRecogPatternConcat();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt101 >= 1 ) break loop101;
                                EarlyExitException eee =
                                    new EarlyExitException(101, input);
                                throw eee;
                        }
                        cnt101++;
                    } while (true);

                     leaveNode(o); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternAlteration"


    // $ANTLR start "matchRecogPatternConcat"
    // EsperEPL2Ast.g:329:1: matchRecogPatternConcat : ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) ;
    public final void matchRecogPatternConcat() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:330:2: ( ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) )
            // EsperEPL2Ast.g:330:4: ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_CONCAT,FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat1832); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:330:32: ( matchRecogPatternUnary )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==MATCHREC_PATTERN_ATOM||LA103_0==MATCHREC_PATTERN_NESTED) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // EsperEPL2Ast.g:330:32: matchRecogPatternUnary
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat1834);
            	    matchRecogPatternUnary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
            } while (true);

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternConcat"


    // $ANTLR start "matchRecogPatternUnary"
    // EsperEPL2Ast.g:333:1: matchRecogPatternUnary : ( matchRecogPatternNested | matchRecogPatternAtom );
    public final void matchRecogPatternUnary() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:334:2: ( matchRecogPatternNested | matchRecogPatternAtom )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==MATCHREC_PATTERN_NESTED) ) {
                alt104=1;
            }
            else if ( (LA104_0==MATCHREC_PATTERN_ATOM) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // EsperEPL2Ast.g:334:4: matchRecogPatternNested
                    {
                    pushFollow(FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary1849);
                    matchRecogPatternNested();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:335:4: matchRecogPatternAtom
                    {
                    pushFollow(FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary1854);
                    matchRecogPatternAtom();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternUnary"


    // $ANTLR start "matchRecogPatternNested"
    // EsperEPL2Ast.g:338:1: matchRecogPatternNested : ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) ;
    public final void matchRecogPatternNested() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:339:2: ( ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) )
            // EsperEPL2Ast.g:339:4: ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_NESTED,FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested1869); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested1871);
            matchRecogPatternAlteration();

            state._fsp--;

            // EsperEPL2Ast.g:339:60: ( PLUS | STAR | QUESTION )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==STAR||(LA105_0>=PLUS && LA105_0<=QUESTION)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( input.LA(1)==STAR||(input.LA(1)>=PLUS && input.LA(1)<=QUESTION) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternNested"


    // $ANTLR start "matchRecogPatternAtom"
    // EsperEPL2Ast.g:342:1: matchRecogPatternAtom : ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) ;
    public final void matchRecogPatternAtom() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:343:2: ( ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) )
            // EsperEPL2Ast.g:343:4: ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_ATOM,FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom1902); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogPatternAtom1904); 
            // EsperEPL2Ast.g:343:36: ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==STAR||(LA107_0>=PLUS && LA107_0<=QUESTION)) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // EsperEPL2Ast.g:343:38: ( PLUS | STAR | QUESTION ) ( QUESTION )?
                    {
                    if ( input.LA(1)==STAR||(input.LA(1)>=PLUS && input.LA(1)<=QUESTION) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:343:63: ( QUESTION )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==QUESTION) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // EsperEPL2Ast.g:343:63: QUESTION
                            {
                            match(input,QUESTION,FOLLOW_QUESTION_in_matchRecogPatternAtom1920); 

                            }
                            break;

                    }


                    }
                    break;

            }

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternAtom"


    // $ANTLR start "matchRecogDefine"
    // EsperEPL2Ast.g:346:1: matchRecogDefine : ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) ;
    public final void matchRecogDefine() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:347:2: ( ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) )
            // EsperEPL2Ast.g:347:4: ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ )
            {
            p=(CommonTree)match(input,MATCHREC_DEFINE,FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine1942); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:347:24: ( matchRecogDefineItem )+
            int cnt108=0;
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==MATCHREC_DEFINE_ITEM) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // EsperEPL2Ast.g:347:24: matchRecogDefineItem
            	    {
            	    pushFollow(FOLLOW_matchRecogDefineItem_in_matchRecogDefine1944);
            	    matchRecogDefineItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt108 >= 1 ) break loop108;
                        EarlyExitException eee =
                            new EarlyExitException(108, input);
                        throw eee;
                }
                cnt108++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogDefine"


    // $ANTLR start "matchRecogDefineItem"
    // EsperEPL2Ast.g:350:1: matchRecogDefineItem : ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) ;
    public final void matchRecogDefineItem() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:351:2: ( ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) )
            // EsperEPL2Ast.g:351:4: ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr )
            {
            d=(CommonTree)match(input,MATCHREC_DEFINE_ITEM,FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem1961); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogDefineItem1963); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogDefineItem1965);
            valueExpr();

            state._fsp--;

             leaveNode(d); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogDefineItem"


    // $ANTLR start "selectionList"
    // EsperEPL2Ast.g:355:1: selectionList : selectionListElement ( selectionListElement )* ;
    public final void selectionList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:356:2: ( selectionListElement ( selectionListElement )* )
            // EsperEPL2Ast.g:356:4: selectionListElement ( selectionListElement )*
            {
            pushFollow(FOLLOW_selectionListElement_in_selectionList1982);
            selectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:356:25: ( selectionListElement )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( ((LA109_0>=SELECTION_ELEMENT_EXPR && LA109_0<=SELECTION_STREAM)||LA109_0==WILDCARD_SELECT) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // EsperEPL2Ast.g:356:26: selectionListElement
            	    {
            	    pushFollow(FOLLOW_selectionListElement_in_selectionList1985);
            	    selectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectionList"


    // $ANTLR start "selectionListElement"
    // EsperEPL2Ast.g:359:1: selectionListElement : (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void selectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:360:2: (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case WILDCARD_SELECT:
                {
                alt112=1;
                }
                break;
            case SELECTION_ELEMENT_EXPR:
                {
                alt112=2;
                }
                break;
            case SELECTION_STREAM:
                {
                alt112=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // EsperEPL2Ast.g:360:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_selectionListElement2001); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:361:4: ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2011); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_selectionListElement2013);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:361:41: ( IDENT )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==IDENT) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // EsperEPL2Ast.g:361:42: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2016); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:362:4: ^(s= SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,SELECTION_STREAM,FOLLOW_SELECTION_STREAM_in_selectionListElement2030); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2032); 
                    // EsperEPL2Ast.g:362:31: ( IDENT )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==IDENT) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // EsperEPL2Ast.g:362:32: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2035); 

                            }
                            break;

                    }

                     leaveNode(s); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectionListElement"


    // $ANTLR start "outerJoin"
    // EsperEPL2Ast.g:365:1: outerJoin : outerJoinIdent ;
    public final void outerJoin() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:366:2: ( outerJoinIdent )
            // EsperEPL2Ast.g:366:4: outerJoinIdent
            {
            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2054);
            outerJoinIdent();

            state._fsp--;


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outerJoin"


    // $ANTLR start "outerJoinIdent"
    // EsperEPL2Ast.g:369:1: outerJoinIdent : ( ^(tl= LEFT_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) | ^(tr= RIGHT_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) | ^(tf= FULL_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) | ^(i= INNERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) );
    public final void outerJoinIdent() throws RecognitionException {
        CommonTree tl=null;
        CommonTree tr=null;
        CommonTree tf=null;
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:370:2: ( ^(tl= LEFT_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) | ^(tr= RIGHT_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) | ^(tf= FULL_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) | ^(i= INNERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ) )
            int alt117=4;
            switch ( input.LA(1) ) {
            case LEFT_OUTERJOIN_EXPR:
                {
                alt117=1;
                }
                break;
            case RIGHT_OUTERJOIN_EXPR:
                {
                alt117=2;
                }
                break;
            case FULL_OUTERJOIN_EXPR:
                {
                alt117=3;
                }
                break;
            case INNERJOIN_EXPR:
                {
                alt117=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // EsperEPL2Ast.g:370:4: ^(tl= LEFT_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* )
                    {
                    tl=(CommonTree)match(input,LEFT_OUTERJOIN_EXPR,FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoinIdent2068); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2070);
                    eventPropertyExpr(true);

                    state._fsp--;

                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2073);
                    eventPropertyExpr(true);

                    state._fsp--;

                    // EsperEPL2Ast.g:370:77: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==EVENT_PROP_EXPR) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:370:78: eventPropertyExpr[true] eventPropertyExpr[true]
                    	    {
                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2077);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2080);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                     leaveNode(tl); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:371:4: ^(tr= RIGHT_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* )
                    {
                    tr=(CommonTree)match(input,RIGHT_OUTERJOIN_EXPR,FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoinIdent2095); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2097);
                    eventPropertyExpr(true);

                    state._fsp--;

                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2100);
                    eventPropertyExpr(true);

                    state._fsp--;

                    // EsperEPL2Ast.g:371:78: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==EVENT_PROP_EXPR) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:371:79: eventPropertyExpr[true] eventPropertyExpr[true]
                    	    {
                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2104);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2107);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);

                     leaveNode(tr); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:372:4: ^(tf= FULL_OUTERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* )
                    {
                    tf=(CommonTree)match(input,FULL_OUTERJOIN_EXPR,FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoinIdent2122); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2124);
                    eventPropertyExpr(true);

                    state._fsp--;

                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2127);
                    eventPropertyExpr(true);

                    state._fsp--;

                    // EsperEPL2Ast.g:372:77: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==EVENT_PROP_EXPR) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:372:78: eventPropertyExpr[true] eventPropertyExpr[true]
                    	    {
                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2131);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2134);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                     leaveNode(tf); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:373:4: ^(i= INNERJOIN_EXPR eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* )
                    {
                    i=(CommonTree)match(input,INNERJOIN_EXPR,FOLLOW_INNERJOIN_EXPR_in_outerJoinIdent2149); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2151);
                    eventPropertyExpr(true);

                    state._fsp--;

                    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2154);
                    eventPropertyExpr(true);

                    state._fsp--;

                    // EsperEPL2Ast.g:373:71: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==EVENT_PROP_EXPR) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:373:72: eventPropertyExpr[true] eventPropertyExpr[true]
                    	    {
                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2158);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2161);
                    	    eventPropertyExpr(true);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                     leaveNode(i); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outerJoinIdent"


    // $ANTLR start "streamExpression"
    // EsperEPL2Ast.g:376:1: streamExpression : ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) ;
    public final void streamExpression() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:377:2: ( ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:377:4: ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_streamExpression2182); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:377:20: ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression )
            int alt118=4;
            switch ( input.LA(1) ) {
            case EVENT_FILTER_EXPR:
                {
                alt118=1;
                }
                break;
            case PATTERN_INCL_EXPR:
                {
                alt118=2;
                }
                break;
            case DATABASE_JOIN_EXPR:
                {
                alt118=3;
                }
                break;
            case METHOD_JOIN_EXPR:
                {
                alt118=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // EsperEPL2Ast.g:377:21: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_streamExpression2185);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:377:45: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_streamExpression2190);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:377:74: databaseJoinExpression
                    {
                    pushFollow(FOLLOW_databaseJoinExpression_in_streamExpression2194);
                    databaseJoinExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:377:99: methodJoinExpression
                    {
                    pushFollow(FOLLOW_methodJoinExpression_in_streamExpression2198);
                    methodJoinExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:377:121: ( viewListExpr )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==VIEW_EXPR) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // EsperEPL2Ast.g:377:122: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_streamExpression2202);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:377:137: ( IDENT )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==IDENT) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // EsperEPL2Ast.g:377:138: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_streamExpression2207); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:377:146: ( UNIDIRECTIONAL )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==UNIDIRECTIONAL) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // EsperEPL2Ast.g:377:147: UNIDIRECTIONAL
                    {
                    match(input,UNIDIRECTIONAL,FOLLOW_UNIDIRECTIONAL_in_streamExpression2212); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:377:164: ( RETAINUNION | RETAININTERSECTION )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=RETAINUNION && LA122_0<=RETAININTERSECTION)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=RETAINUNION && input.LA(1)<=RETAININTERSECTION) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

             leaveNode(v); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "streamExpression"


    // $ANTLR start "eventFilterExpr"
    // EsperEPL2Ast.g:380:1: eventFilterExpr[boolean isLeaveNode] : ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) ;
    public final void eventFilterExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:381:2: ( ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:381:4: ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,EVENT_FILTER_EXPR,FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2241); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:381:27: ( IDENT )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==IDENT) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // EsperEPL2Ast.g:381:27: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_eventFilterExpr2243); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_eventFilterExpr2246); 
            // EsperEPL2Ast.g:381:46: ( propertyExpression )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // EsperEPL2Ast.g:381:46: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_eventFilterExpr2248);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:381:66: ( valueExpr )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( ((LA125_0>=IN_SET && LA125_0<=REGEXP)||LA125_0==NOT_EXPR||(LA125_0>=SUM && LA125_0<=AVG)||(LA125_0>=COALESCE && LA125_0<=COUNT)||(LA125_0>=CASE && LA125_0<=CASE2)||(LA125_0>=PREVIOUS && LA125_0<=EXISTS)||(LA125_0>=INSTANCEOF && LA125_0<=CURRENT_TIMESTAMP)||LA125_0==NEWKW||(LA125_0>=EVAL_AND_EXPR && LA125_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA125_0==EVENT_PROP_EXPR||LA125_0==CONCAT||(LA125_0>=LIB_FUNC_CHAIN && LA125_0<=DOT_EXPR)||LA125_0==ARRAY_EXPR||(LA125_0>=NOT_IN_SET && LA125_0<=NOT_REGEXP)||(LA125_0>=IN_RANGE && LA125_0<=SUBSELECT_EXPR)||(LA125_0>=EXISTS_SUBSELECT_EXPR && LA125_0<=NOT_IN_SUBSELECT_EXPR)||LA125_0==SUBSTITUTION||(LA125_0>=FIRST_AGGREG && LA125_0<=WINDOW_AGGREG)||(LA125_0>=INT_TYPE && LA125_0<=NULL_TYPE)||(LA125_0>=STAR && LA125_0<=PLUS)||(LA125_0>=BAND && LA125_0<=BXOR)||(LA125_0>=LT && LA125_0<=GE)||(LA125_0>=MINUS && LA125_0<=MOD)||(LA125_0>=EVAL_IS_GROUP_EXPR && LA125_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // EsperEPL2Ast.g:381:67: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_eventFilterExpr2252);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);

             if (isLeaveNode) leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eventFilterExpr"


    // $ANTLR start "propertyExpression"
    // EsperEPL2Ast.g:384:1: propertyExpression : ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) ;
    public final void propertyExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:385:2: ( ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) )
            // EsperEPL2Ast.g:385:4: ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* )
            {
            match(input,EVENT_FILTER_PROPERTY_EXPR,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2272); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:385:34: ( propertyExpressionAtom )*
                loop126:
                do {
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==EVENT_FILTER_PROPERTY_EXPR_ATOM) ) {
                        alt126=1;
                    }


                    switch (alt126) {
                	case 1 :
                	    // EsperEPL2Ast.g:385:34: propertyExpressionAtom
                	    {
                	    pushFollow(FOLLOW_propertyExpressionAtom_in_propertyExpression2274);
                	    propertyExpressionAtom();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop126;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyExpression"


    // $ANTLR start "propertyExpressionAtom"
    // EsperEPL2Ast.g:388:1: propertyExpressionAtom : ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( propertySelectionListElement )* eventPropertyExpr[false] ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) ;
    public final void propertyExpressionAtom() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:389:2: ( ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( propertySelectionListElement )* eventPropertyExpr[false] ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) )
            // EsperEPL2Ast.g:389:4: ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( propertySelectionListElement )* eventPropertyExpr[false] ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) )
            {
            a=(CommonTree)match(input,EVENT_FILTER_PROPERTY_EXPR_ATOM,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2293); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:389:41: ( propertySelectionListElement )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( ((LA127_0>=PROPERTY_SELECTION_ELEMENT_EXPR && LA127_0<=PROPERTY_WILDCARD_SELECT)) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // EsperEPL2Ast.g:389:41: propertySelectionListElement
            	    {
            	    pushFollow(FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2295);
            	    propertySelectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);

            pushFollow(FOLLOW_eventPropertyExpr_in_propertyExpressionAtom2298);
            eventPropertyExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:389:96: ( IDENT )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==IDENT) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // EsperEPL2Ast.g:389:96: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2301); 

                    }
                    break;

            }

            match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2305); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:389:116: ( valueExpr )?
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( ((LA129_0>=IN_SET && LA129_0<=REGEXP)||LA129_0==NOT_EXPR||(LA129_0>=SUM && LA129_0<=AVG)||(LA129_0>=COALESCE && LA129_0<=COUNT)||(LA129_0>=CASE && LA129_0<=CASE2)||(LA129_0>=PREVIOUS && LA129_0<=EXISTS)||(LA129_0>=INSTANCEOF && LA129_0<=CURRENT_TIMESTAMP)||LA129_0==NEWKW||(LA129_0>=EVAL_AND_EXPR && LA129_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA129_0==EVENT_PROP_EXPR||LA129_0==CONCAT||(LA129_0>=LIB_FUNC_CHAIN && LA129_0<=DOT_EXPR)||LA129_0==ARRAY_EXPR||(LA129_0>=NOT_IN_SET && LA129_0<=NOT_REGEXP)||(LA129_0>=IN_RANGE && LA129_0<=SUBSELECT_EXPR)||(LA129_0>=EXISTS_SUBSELECT_EXPR && LA129_0<=NOT_IN_SUBSELECT_EXPR)||LA129_0==SUBSTITUTION||(LA129_0>=FIRST_AGGREG && LA129_0<=WINDOW_AGGREG)||(LA129_0>=INT_TYPE && LA129_0<=NULL_TYPE)||(LA129_0>=STAR && LA129_0<=PLUS)||(LA129_0>=BAND && LA129_0<=BXOR)||(LA129_0>=LT && LA129_0<=GE)||(LA129_0>=MINUS && LA129_0<=MOD)||(LA129_0>=EVAL_IS_GROUP_EXPR && LA129_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt129=1;
                }
                switch (alt129) {
                    case 1 :
                        // EsperEPL2Ast.g:389:116: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2307);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
             leaveNode(a); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyExpressionAtom"


    // $ANTLR start "propertySelectionListElement"
    // EsperEPL2Ast.g:392:1: propertySelectionListElement : (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void propertySelectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:393:2: (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt132=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt132=1;
                }
                break;
            case PROPERTY_SELECTION_ELEMENT_EXPR:
                {
                alt132=2;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt132=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // EsperEPL2Ast.g:393:4: w= PROPERTY_WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2327); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:394:4: ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,PROPERTY_SELECTION_ELEMENT_EXPR,FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2337); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_propertySelectionListElement2339);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:394:50: ( IDENT )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==IDENT) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // EsperEPL2Ast.g:394:51: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2342); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:395:4: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2356); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2358); 
                    // EsperEPL2Ast.g:395:40: ( IDENT )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==IDENT) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // EsperEPL2Ast.g:395:41: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2361); 

                            }
                            break;

                    }

                     leaveNode(s); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertySelectionListElement"


    // $ANTLR start "patternInclusionExpression"
    // EsperEPL2Ast.g:398:1: patternInclusionExpression : ^(p= PATTERN_INCL_EXPR exprChoice ) ;
    public final void patternInclusionExpression() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:399:2: ( ^(p= PATTERN_INCL_EXPR exprChoice ) )
            // EsperEPL2Ast.g:399:4: ^(p= PATTERN_INCL_EXPR exprChoice )
            {
            p=(CommonTree)match(input,PATTERN_INCL_EXPR,FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2382); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_exprChoice_in_patternInclusionExpression2384);
            exprChoice();

            state._fsp--;

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternInclusionExpression"


    // $ANTLR start "databaseJoinExpression"
    // EsperEPL2Ast.g:402:1: databaseJoinExpression : ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) ;
    public final void databaseJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:403:2: ( ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) )
            // EsperEPL2Ast.g:403:4: ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? )
            {
            match(input,DATABASE_JOIN_EXPR,FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2401); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_databaseJoinExpression2403); 
            if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // EsperEPL2Ast.g:403:72: ( STRING_LITERAL | QUOTED_STRING_LITERAL )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=STRING_LITERAL && LA133_0<=QUOTED_STRING_LITERAL)) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "databaseJoinExpression"


    // $ANTLR start "methodJoinExpression"
    // EsperEPL2Ast.g:406:1: methodJoinExpression : ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) ;
    public final void methodJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:407:2: ( ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:407:4: ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* )
            {
            match(input,METHOD_JOIN_EXPR,FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2434); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_methodJoinExpression2436); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_methodJoinExpression2438); 
            // EsperEPL2Ast.g:407:41: ( valueExpr )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( ((LA134_0>=IN_SET && LA134_0<=REGEXP)||LA134_0==NOT_EXPR||(LA134_0>=SUM && LA134_0<=AVG)||(LA134_0>=COALESCE && LA134_0<=COUNT)||(LA134_0>=CASE && LA134_0<=CASE2)||(LA134_0>=PREVIOUS && LA134_0<=EXISTS)||(LA134_0>=INSTANCEOF && LA134_0<=CURRENT_TIMESTAMP)||LA134_0==NEWKW||(LA134_0>=EVAL_AND_EXPR && LA134_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA134_0==EVENT_PROP_EXPR||LA134_0==CONCAT||(LA134_0>=LIB_FUNC_CHAIN && LA134_0<=DOT_EXPR)||LA134_0==ARRAY_EXPR||(LA134_0>=NOT_IN_SET && LA134_0<=NOT_REGEXP)||(LA134_0>=IN_RANGE && LA134_0<=SUBSELECT_EXPR)||(LA134_0>=EXISTS_SUBSELECT_EXPR && LA134_0<=NOT_IN_SUBSELECT_EXPR)||LA134_0==SUBSTITUTION||(LA134_0>=FIRST_AGGREG && LA134_0<=WINDOW_AGGREG)||(LA134_0>=INT_TYPE && LA134_0<=NULL_TYPE)||(LA134_0>=STAR && LA134_0<=PLUS)||(LA134_0>=BAND && LA134_0<=BXOR)||(LA134_0>=LT && LA134_0<=GE)||(LA134_0>=MINUS && LA134_0<=MOD)||(LA134_0>=EVAL_IS_GROUP_EXPR && LA134_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // EsperEPL2Ast.g:407:42: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_methodJoinExpression2441);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "methodJoinExpression"


    // $ANTLR start "viewListExpr"
    // EsperEPL2Ast.g:410:1: viewListExpr : viewExpr ( viewExpr )* ;
    public final void viewListExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:411:2: ( viewExpr ( viewExpr )* )
            // EsperEPL2Ast.g:411:4: viewExpr ( viewExpr )*
            {
            pushFollow(FOLLOW_viewExpr_in_viewListExpr2455);
            viewExpr();

            state._fsp--;

            // EsperEPL2Ast.g:411:13: ( viewExpr )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==VIEW_EXPR) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // EsperEPL2Ast.g:411:14: viewExpr
            	    {
            	    pushFollow(FOLLOW_viewExpr_in_viewListExpr2458);
            	    viewExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "viewListExpr"


    // $ANTLR start "viewExpr"
    // EsperEPL2Ast.g:414:1: viewExpr : ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) ;
    public final void viewExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:415:2: ( ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            // EsperEPL2Ast.g:415:4: ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* )
            {
            n=(CommonTree)match(input,VIEW_EXPR,FOLLOW_VIEW_EXPR_in_viewExpr2475); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2477); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2479); 
            // EsperEPL2Ast.g:415:30: ( valueExprWithTime )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( ((LA136_0>=IN_SET && LA136_0<=REGEXP)||LA136_0==NOT_EXPR||(LA136_0>=SUM && LA136_0<=AVG)||(LA136_0>=COALESCE && LA136_0<=COUNT)||(LA136_0>=CASE && LA136_0<=CASE2)||LA136_0==LAST||(LA136_0>=PREVIOUS && LA136_0<=EXISTS)||(LA136_0>=LW && LA136_0<=CURRENT_TIMESTAMP)||LA136_0==NEWKW||(LA136_0>=NUMERIC_PARAM_RANGE && LA136_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA136_0>=EVAL_AND_EXPR && LA136_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA136_0==EVENT_PROP_EXPR||LA136_0==CONCAT||(LA136_0>=LIB_FUNC_CHAIN && LA136_0<=DOT_EXPR)||(LA136_0>=TIME_PERIOD && LA136_0<=ARRAY_EXPR)||(LA136_0>=NOT_IN_SET && LA136_0<=NOT_REGEXP)||(LA136_0>=IN_RANGE && LA136_0<=SUBSELECT_EXPR)||(LA136_0>=EXISTS_SUBSELECT_EXPR && LA136_0<=NOT_IN_SUBSELECT_EXPR)||(LA136_0>=LAST_OPERATOR && LA136_0<=SUBSTITUTION)||LA136_0==NUMBERSETSTAR||(LA136_0>=FIRST_AGGREG && LA136_0<=WINDOW_AGGREG)||(LA136_0>=INT_TYPE && LA136_0<=NULL_TYPE)||(LA136_0>=STAR && LA136_0<=PLUS)||(LA136_0>=BAND && LA136_0<=BXOR)||(LA136_0>=LT && LA136_0<=GE)||(LA136_0>=MINUS && LA136_0<=MOD)||(LA136_0>=EVAL_IS_GROUP_EXPR && LA136_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // EsperEPL2Ast.g:415:31: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_viewExpr2482);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);

             leaveNode(n); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "viewExpr"


    // $ANTLR start "whereClause"
    // EsperEPL2Ast.g:418:1: whereClause[boolean isLeaveNode] : ^(n= WHERE_EXPR valueExpr ) ;
    public final void whereClause(boolean isLeaveNode) throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:419:2: ( ^(n= WHERE_EXPR valueExpr ) )
            // EsperEPL2Ast.g:419:4: ^(n= WHERE_EXPR valueExpr )
            {
            n=(CommonTree)match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_whereClause2504); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_whereClause2506);
            valueExpr();

            state._fsp--;

             if (isLeaveNode) leaveNode(n); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "groupByClause"
    // EsperEPL2Ast.g:422:1: groupByClause : ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) ;
    public final void groupByClause() throws RecognitionException {
        CommonTree g=null;

        try {
            // EsperEPL2Ast.g:423:2: ( ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:423:4: ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* )
            {
            g=(CommonTree)match(input,GROUP_BY_EXPR,FOLLOW_GROUP_BY_EXPR_in_groupByClause2524); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_groupByClause2526);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:423:32: ( valueExpr )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( ((LA137_0>=IN_SET && LA137_0<=REGEXP)||LA137_0==NOT_EXPR||(LA137_0>=SUM && LA137_0<=AVG)||(LA137_0>=COALESCE && LA137_0<=COUNT)||(LA137_0>=CASE && LA137_0<=CASE2)||(LA137_0>=PREVIOUS && LA137_0<=EXISTS)||(LA137_0>=INSTANCEOF && LA137_0<=CURRENT_TIMESTAMP)||LA137_0==NEWKW||(LA137_0>=EVAL_AND_EXPR && LA137_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA137_0==EVENT_PROP_EXPR||LA137_0==CONCAT||(LA137_0>=LIB_FUNC_CHAIN && LA137_0<=DOT_EXPR)||LA137_0==ARRAY_EXPR||(LA137_0>=NOT_IN_SET && LA137_0<=NOT_REGEXP)||(LA137_0>=IN_RANGE && LA137_0<=SUBSELECT_EXPR)||(LA137_0>=EXISTS_SUBSELECT_EXPR && LA137_0<=NOT_IN_SUBSELECT_EXPR)||LA137_0==SUBSTITUTION||(LA137_0>=FIRST_AGGREG && LA137_0<=WINDOW_AGGREG)||(LA137_0>=INT_TYPE && LA137_0<=NULL_TYPE)||(LA137_0>=STAR && LA137_0<=PLUS)||(LA137_0>=BAND && LA137_0<=BXOR)||(LA137_0>=LT && LA137_0<=GE)||(LA137_0>=MINUS && LA137_0<=MOD)||(LA137_0>=EVAL_IS_GROUP_EXPR && LA137_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // EsperEPL2Ast.g:423:33: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_groupByClause2529);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            match(input, Token.UP, null); 
             leaveNode(g); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "groupByClause"


    // $ANTLR start "orderByClause"
    // EsperEPL2Ast.g:426:1: orderByClause : ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) ;
    public final void orderByClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:427:2: ( ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) )
            // EsperEPL2Ast.g:427:4: ^( ORDER_BY_EXPR orderByElement ( orderByElement )* )
            {
            match(input,ORDER_BY_EXPR,FOLLOW_ORDER_BY_EXPR_in_orderByClause2547); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_orderByElement_in_orderByClause2549);
            orderByElement();

            state._fsp--;

            // EsperEPL2Ast.g:427:35: ( orderByElement )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==ORDER_ELEMENT_EXPR) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // EsperEPL2Ast.g:427:36: orderByElement
            	    {
            	    pushFollow(FOLLOW_orderByElement_in_orderByClause2552);
            	    orderByElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "orderByElement"
    // EsperEPL2Ast.g:430:1: orderByElement : ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) ;
    public final void orderByElement() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:431:2: ( ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) )
            // EsperEPL2Ast.g:431:5: ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? )
            {
            e=(CommonTree)match(input,ORDER_ELEMENT_EXPR,FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement2572); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_orderByElement2574);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:431:38: ( ASC | DESC )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( ((LA139_0>=ASC && LA139_0<=DESC)) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

             leaveNode(e); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByElement"


    // $ANTLR start "havingClause"
    // EsperEPL2Ast.g:434:1: havingClause : ^(n= HAVING_EXPR valueExpr ) ;
    public final void havingClause() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:435:2: ( ^(n= HAVING_EXPR valueExpr ) )
            // EsperEPL2Ast.g:435:4: ^(n= HAVING_EXPR valueExpr )
            {
            n=(CommonTree)match(input,HAVING_EXPR,FOLLOW_HAVING_EXPR_in_havingClause2599); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_havingClause2601);
            valueExpr();

            state._fsp--;

             leaveNode(n); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "havingClause"


    // $ANTLR start "outputLimitExpr"
    // EsperEPL2Ast.g:438:1: outputLimitExpr : ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( TERMINATED )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( TERMINATED )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( TERMINATED )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( TERMINATED )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( outputLimitAfter )? ( TERMINATED )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( TERMINATED )? ) );
    public final void outputLimitExpr() throws RecognitionException {
        CommonTree e=null;
        CommonTree tp=null;
        CommonTree cron=null;
        CommonTree when=null;
        CommonTree term=null;
        CommonTree after=null;

        try {
            // EsperEPL2Ast.g:439:2: ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( TERMINATED )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( TERMINATED )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( TERMINATED )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( TERMINATED )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( outputLimitAfter )? ( TERMINATED )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( TERMINATED )? ) )
            int alt158=6;
            switch ( input.LA(1) ) {
            case EVENT_LIMIT_EXPR:
                {
                alt158=1;
                }
                break;
            case TIMEPERIOD_LIMIT_EXPR:
                {
                alt158=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR:
                {
                alt158=3;
                }
                break;
            case WHEN_LIMIT_EXPR:
                {
                alt158=4;
                }
                break;
            case TERM_LIMIT_EXPR:
                {
                alt158=5;
                }
                break;
            case AFTER_LIMIT_EXPR:
                {
                alt158=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // EsperEPL2Ast.g:439:4: ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( TERMINATED )? )
                    {
                    e=(CommonTree)match(input,EVENT_LIMIT_EXPR,FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr2619); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:439:25: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==ALL||(LA140_0>=FIRST && LA140_0<=LAST)||LA140_0==SNAPSHOT) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:439:52: ( number | IDENT )
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( ((LA141_0>=INT_TYPE && LA141_0<=DOUBLE_TYPE)) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==IDENT) ) {
                        alt141=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }
                    switch (alt141) {
                        case 1 :
                            // EsperEPL2Ast.g:439:53: number
                            {
                            pushFollow(FOLLOW_number_in_outputLimitExpr2633);
                            number();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:439:60: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_outputLimitExpr2635); 

                            }
                            break;

                    }

                    // EsperEPL2Ast.g:439:67: ( outputLimitAfter )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==AFTER) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // EsperEPL2Ast.g:439:67: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2638);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:439:85: ( TERMINATED )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==TERMINATED) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // EsperEPL2Ast.g:439:85: TERMINATED
                            {
                            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitExpr2641); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:440:7: ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( TERMINATED )? )
                    {
                    tp=(CommonTree)match(input,TIMEPERIOD_LIMIT_EXPR,FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr2658); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:440:34: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==ALL||(LA144_0>=FIRST && LA144_0<=LAST)||LA144_0==SNAPSHOT) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timePeriod_in_outputLimitExpr2671);
                    timePeriod();

                    state._fsp--;

                    // EsperEPL2Ast.g:440:72: ( outputLimitAfter )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==AFTER) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // EsperEPL2Ast.g:440:72: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2673);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:440:90: ( TERMINATED )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==TERMINATED) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // EsperEPL2Ast.g:440:90: TERMINATED
                            {
                            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitExpr2676); 

                            }
                            break;

                    }

                     leaveNode(tp); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:441:7: ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( TERMINATED )? )
                    {
                    cron=(CommonTree)match(input,CRONTAB_LIMIT_EXPR,FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr2692); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:441:33: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==ALL||(LA147_0>=FIRST && LA147_0<=LAST)||LA147_0==SNAPSHOT) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_crontabLimitParameterSet_in_outputLimitExpr2705);
                    crontabLimitParameterSet();

                    state._fsp--;

                    // EsperEPL2Ast.g:441:85: ( outputLimitAfter )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==AFTER) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // EsperEPL2Ast.g:441:85: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2707);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:441:103: ( TERMINATED )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==TERMINATED) ) {
                        alt149=1;
                    }
                    switch (alt149) {
                        case 1 :
                            // EsperEPL2Ast.g:441:103: TERMINATED
                            {
                            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitExpr2710); 

                            }
                            break;

                    }

                     leaveNode(cron); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:442:7: ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( TERMINATED )? )
                    {
                    when=(CommonTree)match(input,WHEN_LIMIT_EXPR,FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr2726); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:442:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==ALL||(LA150_0>=FIRST && LA150_0<=LAST)||LA150_0==SNAPSHOT) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_outputLimitExpr2739);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:442:67: ( onSetExpr )?
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==ON_SET_EXPR) ) {
                        alt151=1;
                    }
                    switch (alt151) {
                        case 1 :
                            // EsperEPL2Ast.g:442:67: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr2741);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:442:78: ( outputLimitAfter )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==AFTER) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // EsperEPL2Ast.g:442:78: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2744);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:442:96: ( TERMINATED )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==TERMINATED) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // EsperEPL2Ast.g:442:96: TERMINATED
                            {
                            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitExpr2747); 

                            }
                            break;

                    }

                     leaveNode(when); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:443:7: ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( outputLimitAfter )? ( TERMINATED )? )
                    {
                    term=(CommonTree)match(input,TERM_LIMIT_EXPR,FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr2763); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:443:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==ALL||(LA154_0>=FIRST && LA154_0<=LAST)||LA154_0==SNAPSHOT) ) {
                            alt154=1;
                        }
                        switch (alt154) {
                            case 1 :
                                // EsperEPL2Ast.g:
                                {
                                if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                    input.consume();
                                    state.errorRecovery=false;
                                }
                                else {
                                    MismatchedSetException mse = new MismatchedSetException(null,input);
                                    throw mse;
                                }


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:443:57: ( outputLimitAfter )?
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==AFTER) ) {
                            alt155=1;
                        }
                        switch (alt155) {
                            case 1 :
                                // EsperEPL2Ast.g:443:57: outputLimitAfter
                                {
                                pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2776);
                                outputLimitAfter();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:443:75: ( TERMINATED )?
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==TERMINATED) ) {
                            alt156=1;
                        }
                        switch (alt156) {
                            case 1 :
                                // EsperEPL2Ast.g:443:75: TERMINATED
                                {
                                match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitExpr2779); 

                                }
                                break;

                        }

                         leaveNode(term); 

                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:444:4: ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( TERMINATED )? )
                    {
                    after=(CommonTree)match(input,AFTER_LIMIT_EXPR,FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr2792); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2794);
                    outputLimitAfter();

                    state._fsp--;

                    // EsperEPL2Ast.g:444:46: ( TERMINATED )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==TERMINATED) ) {
                        alt157=1;
                    }
                    switch (alt157) {
                        case 1 :
                            // EsperEPL2Ast.g:444:46: TERMINATED
                            {
                            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitExpr2796); 

                            }
                            break;

                    }

                     leaveNode(after); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outputLimitExpr"


    // $ANTLR start "outputLimitAfter"
    // EsperEPL2Ast.g:447:1: outputLimitAfter : ^( AFTER ( timePeriod )? ( number )? ) ;
    public final void outputLimitAfter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:448:2: ( ^( AFTER ( timePeriod )? ( number )? ) )
            // EsperEPL2Ast.g:448:4: ^( AFTER ( timePeriod )? ( number )? )
            {
            match(input,AFTER,FOLLOW_AFTER_in_outputLimitAfter2812); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:448:12: ( timePeriod )?
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==TIME_PERIOD) ) {
                    alt159=1;
                }
                switch (alt159) {
                    case 1 :
                        // EsperEPL2Ast.g:448:12: timePeriod
                        {
                        pushFollow(FOLLOW_timePeriod_in_outputLimitAfter2814);
                        timePeriod();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:448:24: ( number )?
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( ((LA160_0>=INT_TYPE && LA160_0<=DOUBLE_TYPE)) ) {
                    alt160=1;
                }
                switch (alt160) {
                    case 1 :
                        // EsperEPL2Ast.g:448:24: number
                        {
                        pushFollow(FOLLOW_number_in_outputLimitAfter2817);
                        number();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outputLimitAfter"


    // $ANTLR start "rowLimitClause"
    // EsperEPL2Ast.g:451:1: rowLimitClause : ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) ;
    public final void rowLimitClause() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:452:2: ( ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) )
            // EsperEPL2Ast.g:452:4: ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? )
            {
            e=(CommonTree)match(input,ROW_LIMIT_EXPR,FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause2833); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:452:23: ( number | IDENT )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( ((LA161_0>=INT_TYPE && LA161_0<=DOUBLE_TYPE)) ) {
                alt161=1;
            }
            else if ( (LA161_0==IDENT) ) {
                alt161=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // EsperEPL2Ast.g:452:24: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause2836);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:452:31: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause2838); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:452:38: ( number | IDENT )?
            int alt162=3;
            int LA162_0 = input.LA(1);

            if ( ((LA162_0>=INT_TYPE && LA162_0<=DOUBLE_TYPE)) ) {
                alt162=1;
            }
            else if ( (LA162_0==IDENT) ) {
                alt162=2;
            }
            switch (alt162) {
                case 1 :
                    // EsperEPL2Ast.g:452:39: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause2842);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:452:46: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause2844); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:452:54: ( COMMA )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==COMMA) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // EsperEPL2Ast.g:452:54: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_rowLimitClause2848); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:452:61: ( OFFSET )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==OFFSET) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // EsperEPL2Ast.g:452:61: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_rowLimitClause2851); 

                    }
                    break;

            }

             leaveNode(e); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "rowLimitClause"


    // $ANTLR start "crontabLimitParameterSet"
    // EsperEPL2Ast.g:455:1: crontabLimitParameterSet : ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? ) ;
    public final void crontabLimitParameterSet() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:456:2: ( ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? ) )
            // EsperEPL2Ast.g:456:4: ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? )
            {
            match(input,CRONTAB_LIMIT_EXPR_PARAM,FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet2869); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2871);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2873);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2875);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2877);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2879);
            valueExprWithTime();

            state._fsp--;

            // EsperEPL2Ast.g:456:121: ( valueExprWithTime )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( ((LA165_0>=IN_SET && LA165_0<=REGEXP)||LA165_0==NOT_EXPR||(LA165_0>=SUM && LA165_0<=AVG)||(LA165_0>=COALESCE && LA165_0<=COUNT)||(LA165_0>=CASE && LA165_0<=CASE2)||LA165_0==LAST||(LA165_0>=PREVIOUS && LA165_0<=EXISTS)||(LA165_0>=LW && LA165_0<=CURRENT_TIMESTAMP)||LA165_0==NEWKW||(LA165_0>=NUMERIC_PARAM_RANGE && LA165_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA165_0>=EVAL_AND_EXPR && LA165_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA165_0==EVENT_PROP_EXPR||LA165_0==CONCAT||(LA165_0>=LIB_FUNC_CHAIN && LA165_0<=DOT_EXPR)||(LA165_0>=TIME_PERIOD && LA165_0<=ARRAY_EXPR)||(LA165_0>=NOT_IN_SET && LA165_0<=NOT_REGEXP)||(LA165_0>=IN_RANGE && LA165_0<=SUBSELECT_EXPR)||(LA165_0>=EXISTS_SUBSELECT_EXPR && LA165_0<=NOT_IN_SUBSELECT_EXPR)||(LA165_0>=LAST_OPERATOR && LA165_0<=SUBSTITUTION)||LA165_0==NUMBERSETSTAR||(LA165_0>=FIRST_AGGREG && LA165_0<=WINDOW_AGGREG)||(LA165_0>=INT_TYPE && LA165_0<=NULL_TYPE)||(LA165_0>=STAR && LA165_0<=PLUS)||(LA165_0>=BAND && LA165_0<=BXOR)||(LA165_0>=LT && LA165_0<=GE)||(LA165_0>=MINUS && LA165_0<=MOD)||(LA165_0>=EVAL_IS_GROUP_EXPR && LA165_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // EsperEPL2Ast.g:456:121: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2881);
                    valueExprWithTime();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "crontabLimitParameterSet"


    // $ANTLR start "relationalExpr"
    // EsperEPL2Ast.g:459:1: relationalExpr : ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) );
    public final void relationalExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:460:2: ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) )
            int alt166=4;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt166=1;
                }
                break;
            case GT:
                {
                alt166=2;
                }
                break;
            case LE:
                {
                alt166=3;
                }
                break;
            case GE:
                {
                alt166=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // EsperEPL2Ast.g:460:5: ^(n= LT relationalExprValue )
                    {
                    n=(CommonTree)match(input,LT,FOLLOW_LT_in_relationalExpr2898); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr2900);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:461:5: ^(n= GT relationalExprValue )
                    {
                    n=(CommonTree)match(input,GT,FOLLOW_GT_in_relationalExpr2913); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr2915);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:462:5: ^(n= LE relationalExprValue )
                    {
                    n=(CommonTree)match(input,LE,FOLLOW_LE_in_relationalExpr2928); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr2930);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:463:4: ^(n= GE relationalExprValue )
                    {
                    n=(CommonTree)match(input,GE,FOLLOW_GE_in_relationalExpr2942); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr2944);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "relationalExpr"


    // $ANTLR start "relationalExprValue"
    // EsperEPL2Ast.g:466:1: relationalExprValue : ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) ;
    public final void relationalExprValue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:467:2: ( ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) )
            // EsperEPL2Ast.g:467:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            {
            // EsperEPL2Ast.g:467:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            // EsperEPL2Ast.g:468:5: valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            {
            pushFollow(FOLLOW_valueExpr_in_relationalExprValue2966);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:469:6: ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( ((LA169_0>=IN_SET && LA169_0<=REGEXP)||LA169_0==NOT_EXPR||(LA169_0>=SUM && LA169_0<=AVG)||(LA169_0>=COALESCE && LA169_0<=COUNT)||(LA169_0>=CASE && LA169_0<=CASE2)||(LA169_0>=PREVIOUS && LA169_0<=EXISTS)||(LA169_0>=INSTANCEOF && LA169_0<=CURRENT_TIMESTAMP)||LA169_0==NEWKW||(LA169_0>=EVAL_AND_EXPR && LA169_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA169_0==EVENT_PROP_EXPR||LA169_0==CONCAT||(LA169_0>=LIB_FUNC_CHAIN && LA169_0<=DOT_EXPR)||LA169_0==ARRAY_EXPR||(LA169_0>=NOT_IN_SET && LA169_0<=NOT_REGEXP)||(LA169_0>=IN_RANGE && LA169_0<=SUBSELECT_EXPR)||(LA169_0>=EXISTS_SUBSELECT_EXPR && LA169_0<=NOT_IN_SUBSELECT_EXPR)||LA169_0==SUBSTITUTION||(LA169_0>=FIRST_AGGREG && LA169_0<=WINDOW_AGGREG)||(LA169_0>=INT_TYPE && LA169_0<=NULL_TYPE)||(LA169_0>=STAR && LA169_0<=PLUS)||(LA169_0>=BAND && LA169_0<=BXOR)||(LA169_0>=LT && LA169_0<=GE)||(LA169_0>=MINUS && LA169_0<=MOD)||(LA169_0>=EVAL_IS_GROUP_EXPR && LA169_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt169=1;
            }
            else if ( ((LA169_0>=ALL && LA169_0<=SOME)) ) {
                alt169=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }
            switch (alt169) {
                case 1 :
                    // EsperEPL2Ast.g:469:8: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_relationalExprValue2976);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:471:6: ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
                    {
                    if ( (input.LA(1)>=ALL && input.LA(1)<=SOME) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:471:21: ( ( valueExpr )* | subSelectGroupExpr )
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==UP||(LA168_0>=IN_SET && LA168_0<=REGEXP)||LA168_0==NOT_EXPR||(LA168_0>=SUM && LA168_0<=AVG)||(LA168_0>=COALESCE && LA168_0<=COUNT)||(LA168_0>=CASE && LA168_0<=CASE2)||(LA168_0>=PREVIOUS && LA168_0<=EXISTS)||(LA168_0>=INSTANCEOF && LA168_0<=CURRENT_TIMESTAMP)||LA168_0==NEWKW||(LA168_0>=EVAL_AND_EXPR && LA168_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA168_0==EVENT_PROP_EXPR||LA168_0==CONCAT||(LA168_0>=LIB_FUNC_CHAIN && LA168_0<=DOT_EXPR)||LA168_0==ARRAY_EXPR||(LA168_0>=NOT_IN_SET && LA168_0<=NOT_REGEXP)||(LA168_0>=IN_RANGE && LA168_0<=SUBSELECT_EXPR)||(LA168_0>=EXISTS_SUBSELECT_EXPR && LA168_0<=NOT_IN_SUBSELECT_EXPR)||LA168_0==SUBSTITUTION||(LA168_0>=FIRST_AGGREG && LA168_0<=WINDOW_AGGREG)||(LA168_0>=INT_TYPE && LA168_0<=NULL_TYPE)||(LA168_0>=STAR && LA168_0<=PLUS)||(LA168_0>=BAND && LA168_0<=BXOR)||(LA168_0>=LT && LA168_0<=GE)||(LA168_0>=MINUS && LA168_0<=MOD)||(LA168_0>=EVAL_IS_GROUP_EXPR && LA168_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt168=1;
                    }
                    else if ( (LA168_0==SUBSELECT_GROUP_EXPR) ) {
                        alt168=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 168, 0, input);

                        throw nvae;
                    }
                    switch (alt168) {
                        case 1 :
                            // EsperEPL2Ast.g:471:22: ( valueExpr )*
                            {
                            // EsperEPL2Ast.g:471:22: ( valueExpr )*
                            loop167:
                            do {
                                int alt167=2;
                                int LA167_0 = input.LA(1);

                                if ( ((LA167_0>=IN_SET && LA167_0<=REGEXP)||LA167_0==NOT_EXPR||(LA167_0>=SUM && LA167_0<=AVG)||(LA167_0>=COALESCE && LA167_0<=COUNT)||(LA167_0>=CASE && LA167_0<=CASE2)||(LA167_0>=PREVIOUS && LA167_0<=EXISTS)||(LA167_0>=INSTANCEOF && LA167_0<=CURRENT_TIMESTAMP)||LA167_0==NEWKW||(LA167_0>=EVAL_AND_EXPR && LA167_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA167_0==EVENT_PROP_EXPR||LA167_0==CONCAT||(LA167_0>=LIB_FUNC_CHAIN && LA167_0<=DOT_EXPR)||LA167_0==ARRAY_EXPR||(LA167_0>=NOT_IN_SET && LA167_0<=NOT_REGEXP)||(LA167_0>=IN_RANGE && LA167_0<=SUBSELECT_EXPR)||(LA167_0>=EXISTS_SUBSELECT_EXPR && LA167_0<=NOT_IN_SUBSELECT_EXPR)||LA167_0==SUBSTITUTION||(LA167_0>=FIRST_AGGREG && LA167_0<=WINDOW_AGGREG)||(LA167_0>=INT_TYPE && LA167_0<=NULL_TYPE)||(LA167_0>=STAR && LA167_0<=PLUS)||(LA167_0>=BAND && LA167_0<=BXOR)||(LA167_0>=LT && LA167_0<=GE)||(LA167_0>=MINUS && LA167_0<=MOD)||(LA167_0>=EVAL_IS_GROUP_EXPR && LA167_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt167=1;
                                }


                                switch (alt167) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:471:22: valueExpr
                            	    {
                            	    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3000);
                            	    valueExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop167;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:471:35: subSelectGroupExpr
                            {
                            pushFollow(FOLLOW_subSelectGroupExpr_in_relationalExprValue3005);
                            subSelectGroupExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "relationalExprValue"


    // $ANTLR start "evalExprChoice"
    // EsperEPL2Ast.g:476:1: evalExprChoice : ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr );
    public final void evalExprChoice() throws RecognitionException {
        CommonTree jo=null;
        CommonTree ja=null;
        CommonTree je=null;
        CommonTree ji=null;
        CommonTree jne=null;
        CommonTree jis=null;
        CommonTree jge=null;
        CommonTree jgi=null;
        CommonTree jgne=null;
        CommonTree jgni=null;
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:477:2: ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr )
            int alt172=12;
            switch ( input.LA(1) ) {
            case EVAL_OR_EXPR:
                {
                alt172=1;
                }
                break;
            case EVAL_AND_EXPR:
                {
                alt172=2;
                }
                break;
            case EVAL_EQUALS_EXPR:
                {
                alt172=3;
                }
                break;
            case EVAL_IS_EXPR:
                {
                alt172=4;
                }
                break;
            case EVAL_NOTEQUALS_EXPR:
                {
                alt172=5;
                }
                break;
            case EVAL_ISNOT_EXPR:
                {
                alt172=6;
                }
                break;
            case EVAL_EQUALS_GROUP_EXPR:
                {
                alt172=7;
                }
                break;
            case EVAL_IS_GROUP_EXPR:
                {
                alt172=8;
                }
                break;
            case EVAL_NOTEQUALS_GROUP_EXPR:
                {
                alt172=9;
                }
                break;
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt172=10;
                }
                break;
            case NOT_EXPR:
                {
                alt172=11;
                }
                break;
            case LT:
            case GT:
            case LE:
            case GE:
                {
                alt172=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 172, 0, input);

                throw nvae;
            }

            switch (alt172) {
                case 1 :
                    // EsperEPL2Ast.g:477:4: ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    jo=(CommonTree)match(input,EVAL_OR_EXPR,FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3031); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3033);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3035);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:477:42: ( valueExpr )*
                    loop170:
                    do {
                        int alt170=2;
                        int LA170_0 = input.LA(1);

                        if ( ((LA170_0>=IN_SET && LA170_0<=REGEXP)||LA170_0==NOT_EXPR||(LA170_0>=SUM && LA170_0<=AVG)||(LA170_0>=COALESCE && LA170_0<=COUNT)||(LA170_0>=CASE && LA170_0<=CASE2)||(LA170_0>=PREVIOUS && LA170_0<=EXISTS)||(LA170_0>=INSTANCEOF && LA170_0<=CURRENT_TIMESTAMP)||LA170_0==NEWKW||(LA170_0>=EVAL_AND_EXPR && LA170_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA170_0==EVENT_PROP_EXPR||LA170_0==CONCAT||(LA170_0>=LIB_FUNC_CHAIN && LA170_0<=DOT_EXPR)||LA170_0==ARRAY_EXPR||(LA170_0>=NOT_IN_SET && LA170_0<=NOT_REGEXP)||(LA170_0>=IN_RANGE && LA170_0<=SUBSELECT_EXPR)||(LA170_0>=EXISTS_SUBSELECT_EXPR && LA170_0<=NOT_IN_SUBSELECT_EXPR)||LA170_0==SUBSTITUTION||(LA170_0>=FIRST_AGGREG && LA170_0<=WINDOW_AGGREG)||(LA170_0>=INT_TYPE && LA170_0<=NULL_TYPE)||(LA170_0>=STAR && LA170_0<=PLUS)||(LA170_0>=BAND && LA170_0<=BXOR)||(LA170_0>=LT && LA170_0<=GE)||(LA170_0>=MINUS && LA170_0<=MOD)||(LA170_0>=EVAL_IS_GROUP_EXPR && LA170_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt170=1;
                        }


                        switch (alt170) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:477:43: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3038);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop170;
                        }
                    } while (true);

                     leaveNode(jo); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:478:4: ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    ja=(CommonTree)match(input,EVAL_AND_EXPR,FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3052); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3054);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3056);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:478:43: ( valueExpr )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( ((LA171_0>=IN_SET && LA171_0<=REGEXP)||LA171_0==NOT_EXPR||(LA171_0>=SUM && LA171_0<=AVG)||(LA171_0>=COALESCE && LA171_0<=COUNT)||(LA171_0>=CASE && LA171_0<=CASE2)||(LA171_0>=PREVIOUS && LA171_0<=EXISTS)||(LA171_0>=INSTANCEOF && LA171_0<=CURRENT_TIMESTAMP)||LA171_0==NEWKW||(LA171_0>=EVAL_AND_EXPR && LA171_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA171_0==EVENT_PROP_EXPR||LA171_0==CONCAT||(LA171_0>=LIB_FUNC_CHAIN && LA171_0<=DOT_EXPR)||LA171_0==ARRAY_EXPR||(LA171_0>=NOT_IN_SET && LA171_0<=NOT_REGEXP)||(LA171_0>=IN_RANGE && LA171_0<=SUBSELECT_EXPR)||(LA171_0>=EXISTS_SUBSELECT_EXPR && LA171_0<=NOT_IN_SUBSELECT_EXPR)||LA171_0==SUBSTITUTION||(LA171_0>=FIRST_AGGREG && LA171_0<=WINDOW_AGGREG)||(LA171_0>=INT_TYPE && LA171_0<=NULL_TYPE)||(LA171_0>=STAR && LA171_0<=PLUS)||(LA171_0>=BAND && LA171_0<=BXOR)||(LA171_0>=LT && LA171_0<=GE)||(LA171_0>=MINUS && LA171_0<=MOD)||(LA171_0>=EVAL_IS_GROUP_EXPR && LA171_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:478:44: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3059);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop171;
                        }
                    } while (true);

                     leaveNode(ja); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:479:4: ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr )
                    {
                    je=(CommonTree)match(input,EVAL_EQUALS_EXPR,FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3073); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3075);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3077);
                    valueExpr();

                    state._fsp--;

                     leaveNode(je); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:480:4: ^(ji= EVAL_IS_EXPR valueExpr valueExpr )
                    {
                    ji=(CommonTree)match(input,EVAL_IS_EXPR,FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3089); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3091);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3093);
                    valueExpr();

                    state._fsp--;

                     leaveNode(ji); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:481:4: ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr )
                    {
                    jne=(CommonTree)match(input,EVAL_NOTEQUALS_EXPR,FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3105); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3107);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3109);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:482:4: ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr )
                    {
                    jis=(CommonTree)match(input,EVAL_ISNOT_EXPR,FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3121); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3123);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3125);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jis); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:483:4: ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jge=(CommonTree)match(input,EVAL_EQUALS_GROUP_EXPR,FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3137); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3139);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jge); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:484:4: ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery )
                    {
                    jgi=(CommonTree)match(input,EVAL_IS_GROUP_EXPR,FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3151); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3153);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgi); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:485:4: ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jgne=(CommonTree)match(input,EVAL_NOTEQUALS_GROUP_EXPR,FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3165); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3167);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:486:4: ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery )
                    {
                    jgni=(CommonTree)match(input,EVAL_ISNOT_GROUP_EXPR,FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3179); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3181);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgni); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:487:4: ^(n= NOT_EXPR valueExpr )
                    {
                    n=(CommonTree)match(input,NOT_EXPR,FOLLOW_NOT_EXPR_in_evalExprChoice3193); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3195);
                    valueExpr();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:488:4: r= relationalExpr
                    {
                    pushFollow(FOLLOW_relationalExpr_in_evalExprChoice3206);
                    relationalExpr();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "evalExprChoice"


    // $ANTLR start "equalsSubquery"
    // EsperEPL2Ast.g:491:1: equalsSubquery : valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ;
    public final void equalsSubquery() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:492:2: ( valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            // EsperEPL2Ast.g:492:4: valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
            {
            pushFollow(FOLLOW_valueExpr_in_equalsSubquery3217);
            valueExpr();

            state._fsp--;

            if ( (input.LA(1)>=ALL && input.LA(1)<=SOME) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // EsperEPL2Ast.g:492:29: ( ( valueExpr )* | subSelectGroupExpr )
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==UP||(LA174_0>=IN_SET && LA174_0<=REGEXP)||LA174_0==NOT_EXPR||(LA174_0>=SUM && LA174_0<=AVG)||(LA174_0>=COALESCE && LA174_0<=COUNT)||(LA174_0>=CASE && LA174_0<=CASE2)||(LA174_0>=PREVIOUS && LA174_0<=EXISTS)||(LA174_0>=INSTANCEOF && LA174_0<=CURRENT_TIMESTAMP)||LA174_0==NEWKW||(LA174_0>=EVAL_AND_EXPR && LA174_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA174_0==EVENT_PROP_EXPR||LA174_0==CONCAT||(LA174_0>=LIB_FUNC_CHAIN && LA174_0<=DOT_EXPR)||LA174_0==ARRAY_EXPR||(LA174_0>=NOT_IN_SET && LA174_0<=NOT_REGEXP)||(LA174_0>=IN_RANGE && LA174_0<=SUBSELECT_EXPR)||(LA174_0>=EXISTS_SUBSELECT_EXPR && LA174_0<=NOT_IN_SUBSELECT_EXPR)||LA174_0==SUBSTITUTION||(LA174_0>=FIRST_AGGREG && LA174_0<=WINDOW_AGGREG)||(LA174_0>=INT_TYPE && LA174_0<=NULL_TYPE)||(LA174_0>=STAR && LA174_0<=PLUS)||(LA174_0>=BAND && LA174_0<=BXOR)||(LA174_0>=LT && LA174_0<=GE)||(LA174_0>=MINUS && LA174_0<=MOD)||(LA174_0>=EVAL_IS_GROUP_EXPR && LA174_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt174=1;
            }
            else if ( (LA174_0==SUBSELECT_GROUP_EXPR) ) {
                alt174=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }
            switch (alt174) {
                case 1 :
                    // EsperEPL2Ast.g:492:30: ( valueExpr )*
                    {
                    // EsperEPL2Ast.g:492:30: ( valueExpr )*
                    loop173:
                    do {
                        int alt173=2;
                        int LA173_0 = input.LA(1);

                        if ( ((LA173_0>=IN_SET && LA173_0<=REGEXP)||LA173_0==NOT_EXPR||(LA173_0>=SUM && LA173_0<=AVG)||(LA173_0>=COALESCE && LA173_0<=COUNT)||(LA173_0>=CASE && LA173_0<=CASE2)||(LA173_0>=PREVIOUS && LA173_0<=EXISTS)||(LA173_0>=INSTANCEOF && LA173_0<=CURRENT_TIMESTAMP)||LA173_0==NEWKW||(LA173_0>=EVAL_AND_EXPR && LA173_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA173_0==EVENT_PROP_EXPR||LA173_0==CONCAT||(LA173_0>=LIB_FUNC_CHAIN && LA173_0<=DOT_EXPR)||LA173_0==ARRAY_EXPR||(LA173_0>=NOT_IN_SET && LA173_0<=NOT_REGEXP)||(LA173_0>=IN_RANGE && LA173_0<=SUBSELECT_EXPR)||(LA173_0>=EXISTS_SUBSELECT_EXPR && LA173_0<=NOT_IN_SUBSELECT_EXPR)||LA173_0==SUBSTITUTION||(LA173_0>=FIRST_AGGREG && LA173_0<=WINDOW_AGGREG)||(LA173_0>=INT_TYPE && LA173_0<=NULL_TYPE)||(LA173_0>=STAR && LA173_0<=PLUS)||(LA173_0>=BAND && LA173_0<=BXOR)||(LA173_0>=LT && LA173_0<=GE)||(LA173_0>=MINUS && LA173_0<=MOD)||(LA173_0>=EVAL_IS_GROUP_EXPR && LA173_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt173=1;
                        }


                        switch (alt173) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:492:30: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_equalsSubquery3228);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop173;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:492:43: subSelectGroupExpr
                    {
                    pushFollow(FOLLOW_subSelectGroupExpr_in_equalsSubquery3233);
                    subSelectGroupExpr();

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "equalsSubquery"


    // $ANTLR start "valueExpr"
    // EsperEPL2Ast.g:495:1: valueExpr : ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:496:2: ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr )
            int alt175=18;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt175=1;
                }
                break;
            case SUBSTITUTION:
                {
                alt175=2;
                }
                break;
            case CONCAT:
            case STAR:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case MINUS:
            case DIV:
            case MOD:
                {
                alt175=3;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt175=4;
                }
                break;
            case NOT_EXPR:
            case EVAL_AND_EXPR:
            case EVAL_OR_EXPR:
            case EVAL_EQUALS_EXPR:
            case EVAL_NOTEQUALS_EXPR:
            case EVAL_IS_EXPR:
            case EVAL_ISNOT_EXPR:
            case EVAL_EQUALS_GROUP_EXPR:
            case EVAL_NOTEQUALS_GROUP_EXPR:
            case LT:
            case GT:
            case LE:
            case GE:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt175=5;
                }
                break;
            case SUM:
            case AVG:
            case COALESCE:
            case MEDIAN:
            case STDDEV:
            case AVEDEV:
            case COUNT:
            case PREVIOUS:
            case PREVIOUSTAIL:
            case PREVIOUSCOUNT:
            case PREVIOUSWINDOW:
            case PRIOR:
            case EXISTS:
            case INSTANCEOF:
            case TYPEOF:
            case CAST:
            case CURRENT_TIMESTAMP:
            case FIRST_AGGREG:
            case LAST_AGGREG:
            case WINDOW_AGGREG:
                {
                alt175=6;
                }
                break;
            case LIB_FUNC_CHAIN:
                {
                alt175=7;
                }
                break;
            case CASE:
            case CASE2:
                {
                alt175=8;
                }
                break;
            case IN_SET:
            case NOT_IN_SET:
            case IN_RANGE:
            case NOT_IN_RANGE:
                {
                alt175=9;
                }
                break;
            case BETWEEN:
            case NOT_BETWEEN:
                {
                alt175=10;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt175=11;
                }
                break;
            case REGEXP:
            case NOT_REGEXP:
                {
                alt175=12;
                }
                break;
            case ARRAY_EXPR:
                {
                alt175=13;
                }
                break;
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
                {
                alt175=14;
                }
                break;
            case SUBSELECT_EXPR:
                {
                alt175=15;
                }
                break;
            case EXISTS_SUBSELECT_EXPR:
                {
                alt175=16;
                }
                break;
            case DOT_EXPR:
                {
                alt175=17;
                }
                break;
            case NEWKW:
                {
                alt175=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }

            switch (alt175) {
                case 1 :
                    // EsperEPL2Ast.g:496:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_valueExpr3247);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:497:4: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_valueExpr3253);
                    substitution();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:498:5: arithmeticExpr
                    {
                    pushFollow(FOLLOW_arithmeticExpr_in_valueExpr3259);
                    arithmeticExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:499:5: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_valueExpr3266);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:500:7: evalExprChoice
                    {
                    pushFollow(FOLLOW_evalExprChoice_in_valueExpr3275);
                    evalExprChoice();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:501:4: builtinFunc
                    {
                    pushFollow(FOLLOW_builtinFunc_in_valueExpr3280);
                    builtinFunc();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:502:7: libFuncChain
                    {
                    pushFollow(FOLLOW_libFuncChain_in_valueExpr3288);
                    libFuncChain();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:503:4: caseExpr
                    {
                    pushFollow(FOLLOW_caseExpr_in_valueExpr3293);
                    caseExpr();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:504:4: inExpr
                    {
                    pushFollow(FOLLOW_inExpr_in_valueExpr3298);
                    inExpr();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:505:4: betweenExpr
                    {
                    pushFollow(FOLLOW_betweenExpr_in_valueExpr3304);
                    betweenExpr();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:506:4: likeExpr
                    {
                    pushFollow(FOLLOW_likeExpr_in_valueExpr3309);
                    likeExpr();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:507:4: regExpExpr
                    {
                    pushFollow(FOLLOW_regExpExpr_in_valueExpr3314);
                    regExpExpr();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // EsperEPL2Ast.g:508:4: arrayExpr
                    {
                    pushFollow(FOLLOW_arrayExpr_in_valueExpr3319);
                    arrayExpr();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:509:4: subSelectInExpr
                    {
                    pushFollow(FOLLOW_subSelectInExpr_in_valueExpr3324);
                    subSelectInExpr();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:510:5: subSelectRowExpr
                    {
                    pushFollow(FOLLOW_subSelectRowExpr_in_valueExpr3330);
                    subSelectRowExpr();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:511:5: subSelectExistsExpr
                    {
                    pushFollow(FOLLOW_subSelectExistsExpr_in_valueExpr3337);
                    subSelectExistsExpr();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:512:4: dotExpr
                    {
                    pushFollow(FOLLOW_dotExpr_in_valueExpr3342);
                    dotExpr();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:513:4: newExpr
                    {
                    pushFollow(FOLLOW_newExpr_in_valueExpr3347);
                    newExpr();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "valueExpr"


    // $ANTLR start "valueExprWithTime"
    // EsperEPL2Ast.g:516:1: valueExprWithTime : (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod );
    public final void valueExprWithTime() throws RecognitionException {
        CommonTree l=null;
        CommonTree lw=null;
        CommonTree ordered=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:517:2: (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod )
            int alt177=11;
            switch ( input.LA(1) ) {
            case LAST:
                {
                alt177=1;
                }
                break;
            case LW:
                {
                alt177=2;
                }
                break;
            case IN_SET:
            case BETWEEN:
            case LIKE:
            case REGEXP:
            case NOT_EXPR:
            case SUM:
            case AVG:
            case COALESCE:
            case MEDIAN:
            case STDDEV:
            case AVEDEV:
            case COUNT:
            case CASE:
            case CASE2:
            case PREVIOUS:
            case PREVIOUSTAIL:
            case PREVIOUSCOUNT:
            case PREVIOUSWINDOW:
            case PRIOR:
            case EXISTS:
            case INSTANCEOF:
            case TYPEOF:
            case CAST:
            case CURRENT_TIMESTAMP:
            case NEWKW:
            case EVAL_AND_EXPR:
            case EVAL_OR_EXPR:
            case EVAL_EQUALS_EXPR:
            case EVAL_NOTEQUALS_EXPR:
            case EVAL_IS_EXPR:
            case EVAL_ISNOT_EXPR:
            case EVAL_EQUALS_GROUP_EXPR:
            case EVAL_NOTEQUALS_GROUP_EXPR:
            case EVENT_PROP_EXPR:
            case CONCAT:
            case LIB_FUNC_CHAIN:
            case DOT_EXPR:
            case ARRAY_EXPR:
            case NOT_IN_SET:
            case NOT_BETWEEN:
            case NOT_LIKE:
            case NOT_REGEXP:
            case IN_RANGE:
            case NOT_IN_RANGE:
            case SUBSELECT_EXPR:
            case EXISTS_SUBSELECT_EXPR:
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
            case SUBSTITUTION:
            case FIRST_AGGREG:
            case LAST_AGGREG:
            case WINDOW_AGGREG:
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
            case STAR:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case LT:
            case GT:
            case LE:
            case GE:
            case MINUS:
            case DIV:
            case MOD:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt177=3;
                }
                break;
            case OBJECT_PARAM_ORDERED_EXPR:
                {
                alt177=4;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt177=5;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt177=6;
                }
                break;
            case LAST_OPERATOR:
                {
                alt177=7;
                }
                break;
            case WEEKDAY_OPERATOR:
                {
                alt177=8;
                }
                break;
            case NUMERIC_PARAM_LIST:
                {
                alt177=9;
                }
                break;
            case NUMBERSETSTAR:
                {
                alt177=10;
                }
                break;
            case TIME_PERIOD:
                {
                alt177=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }

            switch (alt177) {
                case 1 :
                    // EsperEPL2Ast.g:517:4: l= LAST
                    {
                    l=(CommonTree)match(input,LAST,FOLLOW_LAST_in_valueExprWithTime3360); 
                     leaveNode(l); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:518:4: lw= LW
                    {
                    lw=(CommonTree)match(input,LW,FOLLOW_LW_in_valueExprWithTime3369); 
                     leaveNode(lw); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:519:4: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3376);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:520:4: ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) )
                    {
                    ordered=(CommonTree)match(input,OBJECT_PARAM_ORDERED_EXPR,FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3384); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3386);
                    valueExpr();

                    state._fsp--;

                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     leaveNode(ordered); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:521:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_valueExprWithTime3401);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:522:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_valueExprWithTime3407);
                    frequencyOperator();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:523:4: lastOperator
                    {
                    pushFollow(FOLLOW_lastOperator_in_valueExprWithTime3412);
                    lastOperator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:524:4: weekDayOperator
                    {
                    pushFollow(FOLLOW_weekDayOperator_in_valueExprWithTime3417);
                    weekDayOperator();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:525:5: ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ )
                    {
                    l=(CommonTree)match(input,NUMERIC_PARAM_LIST,FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3427); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:525:29: ( numericParameterList )+
                    int cnt176=0;
                    loop176:
                    do {
                        int alt176=2;
                        int LA176_0 = input.LA(1);

                        if ( (LA176_0==NUMERIC_PARAM_RANGE||LA176_0==NUMERIC_PARAM_FREQUENCY||(LA176_0>=INT_TYPE && LA176_0<=NULL_TYPE)) ) {
                            alt176=1;
                        }


                        switch (alt176) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:525:29: numericParameterList
                    	    {
                    	    pushFollow(FOLLOW_numericParameterList_in_valueExprWithTime3429);
                    	    numericParameterList();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt176 >= 1 ) break loop176;
                                EarlyExitException eee =
                                    new EarlyExitException(176, input);
                                throw eee;
                        }
                        cnt176++;
                    } while (true);

                     leaveNode(l); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:526:4: s= NUMBERSETSTAR
                    {
                    s=(CommonTree)match(input,NUMBERSETSTAR,FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3440); 
                     leaveNode(s); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:527:4: timePeriod
                    {
                    pushFollow(FOLLOW_timePeriod_in_valueExprWithTime3447);
                    timePeriod();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "valueExprWithTime"


    // $ANTLR start "numericParameterList"
    // EsperEPL2Ast.g:530:1: numericParameterList : ( constant[true] | rangeOperator | frequencyOperator );
    public final void numericParameterList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:531:2: ( constant[true] | rangeOperator | frequencyOperator )
            int alt178=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt178=1;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt178=2;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt178=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 178, 0, input);

                throw nvae;
            }

            switch (alt178) {
                case 1 :
                    // EsperEPL2Ast.g:531:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_numericParameterList3460);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:532:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_numericParameterList3467);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:533:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_numericParameterList3473);
                    frequencyOperator();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericParameterList"


    // $ANTLR start "rangeOperator"
    // EsperEPL2Ast.g:536:1: rangeOperator : ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void rangeOperator() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:537:2: ( ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:537:4: ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            r=(CommonTree)match(input,NUMERIC_PARAM_RANGE,FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator3489); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:537:29: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt179=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt179=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt179=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt179=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 179, 0, input);

                throw nvae;
            }

            switch (alt179) {
                case 1 :
                    // EsperEPL2Ast.g:537:30: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator3492);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:537:45: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator3495);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:537:69: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator3498);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:537:83: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt180=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt180=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt180=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt180=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 180, 0, input);

                throw nvae;
            }

            switch (alt180) {
                case 1 :
                    // EsperEPL2Ast.g:537:84: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator3502);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:537:99: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator3505);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:537:123: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator3508);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(r); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "rangeOperator"


    // $ANTLR start "frequencyOperator"
    // EsperEPL2Ast.g:540:1: frequencyOperator : ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void frequencyOperator() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:541:2: ( ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:541:4: ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            f=(CommonTree)match(input,NUMERIC_PARAM_FREQUENCY,FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator3529); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:541:33: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt181=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt181=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt181=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt181=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;
            }

            switch (alt181) {
                case 1 :
                    // EsperEPL2Ast.g:541:34: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_frequencyOperator3532);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:541:49: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_frequencyOperator3535);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:541:73: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_frequencyOperator3538);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "frequencyOperator"


    // $ANTLR start "lastOperator"
    // EsperEPL2Ast.g:544:1: lastOperator : ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void lastOperator() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:545:2: ( ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:545:4: ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            l=(CommonTree)match(input,LAST_OPERATOR,FOLLOW_LAST_OPERATOR_in_lastOperator3557); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:545:23: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt182=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt182=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt182=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt182=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;
            }

            switch (alt182) {
                case 1 :
                    // EsperEPL2Ast.g:545:24: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_lastOperator3560);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:545:39: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_lastOperator3563);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:545:63: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_lastOperator3566);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(l); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "lastOperator"


    // $ANTLR start "weekDayOperator"
    // EsperEPL2Ast.g:548:1: weekDayOperator : ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void weekDayOperator() throws RecognitionException {
        CommonTree w=null;

        try {
            // EsperEPL2Ast.g:549:2: ( ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:549:4: ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            w=(CommonTree)match(input,WEEKDAY_OPERATOR,FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator3585); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:549:26: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt183=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt183=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt183=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt183=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;
            }

            switch (alt183) {
                case 1 :
                    // EsperEPL2Ast.g:549:27: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_weekDayOperator3588);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:549:42: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_weekDayOperator3591);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:549:66: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_weekDayOperator3594);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(w); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "weekDayOperator"


    // $ANTLR start "subSelectGroupExpr"
    // EsperEPL2Ast.g:552:1: subSelectGroupExpr : ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) ;
    public final void subSelectGroupExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:553:2: ( ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:553:4: ^(s= SUBSELECT_GROUP_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_GROUP_EXPR,FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr3615); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectGroupExpr3617);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectGroupExpr"


    // $ANTLR start "subSelectRowExpr"
    // EsperEPL2Ast.g:556:1: subSelectRowExpr : ^(s= SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectRowExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:557:2: ( ^(s= SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:557:4: ^(s= SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_EXPR,FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr3636); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectRowExpr3638);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 
            leaveNode(s);

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectRowExpr"


    // $ANTLR start "subSelectExistsExpr"
    // EsperEPL2Ast.g:560:1: subSelectExistsExpr : ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectExistsExpr() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:561:2: ( ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:561:4: ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            e=(CommonTree)match(input,EXISTS_SUBSELECT_EXPR,FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr3657); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectExistsExpr3659);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 
            leaveNode(e);

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectExistsExpr"


    // $ANTLR start "subSelectInExpr"
    // EsperEPL2Ast.g:564:1: subSelectInExpr : ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) );
    public final void subSelectInExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:565:2: ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) )
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==IN_SUBSELECT_EXPR) ) {
                alt184=1;
            }
            else if ( (LA184_0==NOT_IN_SUBSELECT_EXPR) ) {
                alt184=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 184, 0, input);

                throw nvae;
            }
            switch (alt184) {
                case 1 :
                    // EsperEPL2Ast.g:565:5: ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,IN_SUBSELECT_EXPR,FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr3678); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr3680);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3682);
                    subSelectInQueryExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(s); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:566:5: ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,NOT_IN_SUBSELECT_EXPR,FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr3694); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr3696);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3698);
                    subSelectInQueryExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(s); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectInExpr"


    // $ANTLR start "subSelectInQueryExpr"
    // EsperEPL2Ast.g:569:1: subSelectInQueryExpr : ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) ;
    public final void subSelectInQueryExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:570:2: ( ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:570:4: ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr )
            {
            pushStmtContext();
            i=(CommonTree)match(input,IN_SUBSELECT_QUERY_EXPR,FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr3717); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectInQueryExpr3719);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 
            leaveNode(i);

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectInQueryExpr"


    // $ANTLR start "subQueryExpr"
    // EsperEPL2Ast.g:573:1: subQueryExpr : ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? ;
    public final void subQueryExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:574:2: ( ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? )
            // EsperEPL2Ast.g:574:4: ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )?
            {
            // EsperEPL2Ast.g:574:4: ( DISTINCT )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==DISTINCT) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // EsperEPL2Ast.g:574:4: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_subQueryExpr3735); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_subQueryExpr3738);
            selectionList();

            state._fsp--;

            pushFollow(FOLLOW_subSelectFilterExpr_in_subQueryExpr3740);
            subSelectFilterExpr();

            state._fsp--;

            // EsperEPL2Ast.g:574:48: ( whereClause[true] )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==WHERE_EXPR) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // EsperEPL2Ast.g:574:49: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_subQueryExpr3743);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subQueryExpr"


    // $ANTLR start "subSelectFilterExpr"
    // EsperEPL2Ast.g:577:1: subSelectFilterExpr : ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) ;
    public final void subSelectFilterExpr() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:578:2: ( ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:578:4: ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_subSelectFilterExpr3761); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_subSelectFilterExpr3763);
            eventFilterExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:578:42: ( viewListExpr )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==VIEW_EXPR) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // EsperEPL2Ast.g:578:43: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_subSelectFilterExpr3767);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:578:58: ( IDENT )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==IDENT) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // EsperEPL2Ast.g:578:59: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_subSelectFilterExpr3772); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:578:67: ( RETAINUNION )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==RETAINUNION) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // EsperEPL2Ast.g:578:67: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_subSelectFilterExpr3776); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:578:80: ( RETAININTERSECTION )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==RETAININTERSECTION) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // EsperEPL2Ast.g:578:80: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr3779); 

                    }
                    break;

            }

             leaveNode(v); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectFilterExpr"


    // $ANTLR start "caseExpr"
    // EsperEPL2Ast.g:581:1: caseExpr : ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) );
    public final void caseExpr() throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:582:2: ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) )
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==CASE) ) {
                alt193=1;
            }
            else if ( (LA193_0==CASE2) ) {
                alt193=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 193, 0, input);

                throw nvae;
            }
            switch (alt193) {
                case 1 :
                    // EsperEPL2Ast.g:582:4: ^(c= CASE ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE,FOLLOW_CASE_in_caseExpr3799); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:582:13: ( valueExpr )*
                        loop191:
                        do {
                            int alt191=2;
                            int LA191_0 = input.LA(1);

                            if ( ((LA191_0>=IN_SET && LA191_0<=REGEXP)||LA191_0==NOT_EXPR||(LA191_0>=SUM && LA191_0<=AVG)||(LA191_0>=COALESCE && LA191_0<=COUNT)||(LA191_0>=CASE && LA191_0<=CASE2)||(LA191_0>=PREVIOUS && LA191_0<=EXISTS)||(LA191_0>=INSTANCEOF && LA191_0<=CURRENT_TIMESTAMP)||LA191_0==NEWKW||(LA191_0>=EVAL_AND_EXPR && LA191_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA191_0==EVENT_PROP_EXPR||LA191_0==CONCAT||(LA191_0>=LIB_FUNC_CHAIN && LA191_0<=DOT_EXPR)||LA191_0==ARRAY_EXPR||(LA191_0>=NOT_IN_SET && LA191_0<=NOT_REGEXP)||(LA191_0>=IN_RANGE && LA191_0<=SUBSELECT_EXPR)||(LA191_0>=EXISTS_SUBSELECT_EXPR && LA191_0<=NOT_IN_SUBSELECT_EXPR)||LA191_0==SUBSTITUTION||(LA191_0>=FIRST_AGGREG && LA191_0<=WINDOW_AGGREG)||(LA191_0>=INT_TYPE && LA191_0<=NULL_TYPE)||(LA191_0>=STAR && LA191_0<=PLUS)||(LA191_0>=BAND && LA191_0<=BXOR)||(LA191_0>=LT && LA191_0<=GE)||(LA191_0>=MINUS && LA191_0<=MOD)||(LA191_0>=EVAL_IS_GROUP_EXPR && LA191_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt191=1;
                            }


                            switch (alt191) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:582:14: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr3802);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop191;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                     leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:583:4: ^(c= CASE2 ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE2,FOLLOW_CASE2_in_caseExpr3815); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:583:14: ( valueExpr )*
                        loop192:
                        do {
                            int alt192=2;
                            int LA192_0 = input.LA(1);

                            if ( ((LA192_0>=IN_SET && LA192_0<=REGEXP)||LA192_0==NOT_EXPR||(LA192_0>=SUM && LA192_0<=AVG)||(LA192_0>=COALESCE && LA192_0<=COUNT)||(LA192_0>=CASE && LA192_0<=CASE2)||(LA192_0>=PREVIOUS && LA192_0<=EXISTS)||(LA192_0>=INSTANCEOF && LA192_0<=CURRENT_TIMESTAMP)||LA192_0==NEWKW||(LA192_0>=EVAL_AND_EXPR && LA192_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA192_0==EVENT_PROP_EXPR||LA192_0==CONCAT||(LA192_0>=LIB_FUNC_CHAIN && LA192_0<=DOT_EXPR)||LA192_0==ARRAY_EXPR||(LA192_0>=NOT_IN_SET && LA192_0<=NOT_REGEXP)||(LA192_0>=IN_RANGE && LA192_0<=SUBSELECT_EXPR)||(LA192_0>=EXISTS_SUBSELECT_EXPR && LA192_0<=NOT_IN_SUBSELECT_EXPR)||LA192_0==SUBSTITUTION||(LA192_0>=FIRST_AGGREG && LA192_0<=WINDOW_AGGREG)||(LA192_0>=INT_TYPE && LA192_0<=NULL_TYPE)||(LA192_0>=STAR && LA192_0<=PLUS)||(LA192_0>=BAND && LA192_0<=BXOR)||(LA192_0>=LT && LA192_0<=GE)||(LA192_0>=MINUS && LA192_0<=MOD)||(LA192_0>=EVAL_IS_GROUP_EXPR && LA192_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt192=1;
                            }


                            switch (alt192) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:583:15: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr3818);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop192;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                     leaveNode(c); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "caseExpr"


    // $ANTLR start "inExpr"
    // EsperEPL2Ast.g:586:1: inExpr : ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) );
    public final void inExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:587:2: ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) )
            int alt196=4;
            switch ( input.LA(1) ) {
            case IN_SET:
                {
                alt196=1;
                }
                break;
            case NOT_IN_SET:
                {
                alt196=2;
                }
                break;
            case IN_RANGE:
                {
                alt196=3;
                }
                break;
            case NOT_IN_RANGE:
                {
                alt196=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 196, 0, input);

                throw nvae;
            }

            switch (alt196) {
                case 1 :
                    // EsperEPL2Ast.g:587:4: ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_SET,FOLLOW_IN_SET_in_inExpr3838); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr3840);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr3848);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:587:51: ( valueExpr )*
                    loop194:
                    do {
                        int alt194=2;
                        int LA194_0 = input.LA(1);

                        if ( ((LA194_0>=IN_SET && LA194_0<=REGEXP)||LA194_0==NOT_EXPR||(LA194_0>=SUM && LA194_0<=AVG)||(LA194_0>=COALESCE && LA194_0<=COUNT)||(LA194_0>=CASE && LA194_0<=CASE2)||(LA194_0>=PREVIOUS && LA194_0<=EXISTS)||(LA194_0>=INSTANCEOF && LA194_0<=CURRENT_TIMESTAMP)||LA194_0==NEWKW||(LA194_0>=EVAL_AND_EXPR && LA194_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA194_0==EVENT_PROP_EXPR||LA194_0==CONCAT||(LA194_0>=LIB_FUNC_CHAIN && LA194_0<=DOT_EXPR)||LA194_0==ARRAY_EXPR||(LA194_0>=NOT_IN_SET && LA194_0<=NOT_REGEXP)||(LA194_0>=IN_RANGE && LA194_0<=SUBSELECT_EXPR)||(LA194_0>=EXISTS_SUBSELECT_EXPR && LA194_0<=NOT_IN_SUBSELECT_EXPR)||LA194_0==SUBSTITUTION||(LA194_0>=FIRST_AGGREG && LA194_0<=WINDOW_AGGREG)||(LA194_0>=INT_TYPE && LA194_0<=NULL_TYPE)||(LA194_0>=STAR && LA194_0<=PLUS)||(LA194_0>=BAND && LA194_0<=BXOR)||(LA194_0>=LT && LA194_0<=GE)||(LA194_0>=MINUS && LA194_0<=MOD)||(LA194_0>=EVAL_IS_GROUP_EXPR && LA194_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt194=1;
                        }


                        switch (alt194) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:587:52: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr3851);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop194;
                        }
                    } while (true);

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:588:4: ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_SET,FOLLOW_NOT_IN_SET_in_inExpr3870); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr3872);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr3880);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:588:55: ( valueExpr )*
                    loop195:
                    do {
                        int alt195=2;
                        int LA195_0 = input.LA(1);

                        if ( ((LA195_0>=IN_SET && LA195_0<=REGEXP)||LA195_0==NOT_EXPR||(LA195_0>=SUM && LA195_0<=AVG)||(LA195_0>=COALESCE && LA195_0<=COUNT)||(LA195_0>=CASE && LA195_0<=CASE2)||(LA195_0>=PREVIOUS && LA195_0<=EXISTS)||(LA195_0>=INSTANCEOF && LA195_0<=CURRENT_TIMESTAMP)||LA195_0==NEWKW||(LA195_0>=EVAL_AND_EXPR && LA195_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA195_0==EVENT_PROP_EXPR||LA195_0==CONCAT||(LA195_0>=LIB_FUNC_CHAIN && LA195_0<=DOT_EXPR)||LA195_0==ARRAY_EXPR||(LA195_0>=NOT_IN_SET && LA195_0<=NOT_REGEXP)||(LA195_0>=IN_RANGE && LA195_0<=SUBSELECT_EXPR)||(LA195_0>=EXISTS_SUBSELECT_EXPR && LA195_0<=NOT_IN_SUBSELECT_EXPR)||LA195_0==SUBSTITUTION||(LA195_0>=FIRST_AGGREG && LA195_0<=WINDOW_AGGREG)||(LA195_0>=INT_TYPE && LA195_0<=NULL_TYPE)||(LA195_0>=STAR && LA195_0<=PLUS)||(LA195_0>=BAND && LA195_0<=BXOR)||(LA195_0>=LT && LA195_0<=GE)||(LA195_0>=MINUS && LA195_0<=MOD)||(LA195_0>=EVAL_IS_GROUP_EXPR && LA195_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt195=1;
                        }


                        switch (alt195) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:588:56: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr3883);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop195;
                        }
                    } while (true);

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:589:4: ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_RANGE,FOLLOW_IN_RANGE_in_inExpr3902); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr3904);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr3912);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr3914);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:590:4: ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_RANGE,FOLLOW_NOT_IN_RANGE_in_inExpr3931); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr3933);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr3941);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr3943);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "inExpr"


    // $ANTLR start "betweenExpr"
    // EsperEPL2Ast.g:593:1: betweenExpr : ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) );
    public final void betweenExpr() throws RecognitionException {
        CommonTree b=null;

        try {
            // EsperEPL2Ast.g:594:2: ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) )
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==BETWEEN) ) {
                alt198=1;
            }
            else if ( (LA198_0==NOT_BETWEEN) ) {
                alt198=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 198, 0, input);

                throw nvae;
            }
            switch (alt198) {
                case 1 :
                    // EsperEPL2Ast.g:594:4: ^(b= BETWEEN valueExpr valueExpr valueExpr )
                    {
                    b=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenExpr3968); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr3970);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr3972);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr3974);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(b); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:595:4: ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* )
                    {
                    b=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenExpr3985); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr3987);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr3989);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:595:40: ( valueExpr )*
                    loop197:
                    do {
                        int alt197=2;
                        int LA197_0 = input.LA(1);

                        if ( ((LA197_0>=IN_SET && LA197_0<=REGEXP)||LA197_0==NOT_EXPR||(LA197_0>=SUM && LA197_0<=AVG)||(LA197_0>=COALESCE && LA197_0<=COUNT)||(LA197_0>=CASE && LA197_0<=CASE2)||(LA197_0>=PREVIOUS && LA197_0<=EXISTS)||(LA197_0>=INSTANCEOF && LA197_0<=CURRENT_TIMESTAMP)||LA197_0==NEWKW||(LA197_0>=EVAL_AND_EXPR && LA197_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA197_0==EVENT_PROP_EXPR||LA197_0==CONCAT||(LA197_0>=LIB_FUNC_CHAIN && LA197_0<=DOT_EXPR)||LA197_0==ARRAY_EXPR||(LA197_0>=NOT_IN_SET && LA197_0<=NOT_REGEXP)||(LA197_0>=IN_RANGE && LA197_0<=SUBSELECT_EXPR)||(LA197_0>=EXISTS_SUBSELECT_EXPR && LA197_0<=NOT_IN_SUBSELECT_EXPR)||LA197_0==SUBSTITUTION||(LA197_0>=FIRST_AGGREG && LA197_0<=WINDOW_AGGREG)||(LA197_0>=INT_TYPE && LA197_0<=NULL_TYPE)||(LA197_0>=STAR && LA197_0<=PLUS)||(LA197_0>=BAND && LA197_0<=BXOR)||(LA197_0>=LT && LA197_0<=GE)||(LA197_0>=MINUS && LA197_0<=MOD)||(LA197_0>=EVAL_IS_GROUP_EXPR && LA197_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt197=1;
                        }


                        switch (alt197) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:595:41: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_betweenExpr3992);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop197;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(b); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "betweenExpr"


    // $ANTLR start "likeExpr"
    // EsperEPL2Ast.g:598:1: likeExpr : ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) );
    public final void likeExpr() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:599:2: ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) )
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==LIKE) ) {
                alt201=1;
            }
            else if ( (LA201_0==NOT_LIKE) ) {
                alt201=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 201, 0, input);

                throw nvae;
            }
            switch (alt201) {
                case 1 :
                    // EsperEPL2Ast.g:599:4: ^(l= LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeExpr4012); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4014);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4016);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:599:33: ( valueExpr )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( ((LA199_0>=IN_SET && LA199_0<=REGEXP)||LA199_0==NOT_EXPR||(LA199_0>=SUM && LA199_0<=AVG)||(LA199_0>=COALESCE && LA199_0<=COUNT)||(LA199_0>=CASE && LA199_0<=CASE2)||(LA199_0>=PREVIOUS && LA199_0<=EXISTS)||(LA199_0>=INSTANCEOF && LA199_0<=CURRENT_TIMESTAMP)||LA199_0==NEWKW||(LA199_0>=EVAL_AND_EXPR && LA199_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA199_0==EVENT_PROP_EXPR||LA199_0==CONCAT||(LA199_0>=LIB_FUNC_CHAIN && LA199_0<=DOT_EXPR)||LA199_0==ARRAY_EXPR||(LA199_0>=NOT_IN_SET && LA199_0<=NOT_REGEXP)||(LA199_0>=IN_RANGE && LA199_0<=SUBSELECT_EXPR)||(LA199_0>=EXISTS_SUBSELECT_EXPR && LA199_0<=NOT_IN_SUBSELECT_EXPR)||LA199_0==SUBSTITUTION||(LA199_0>=FIRST_AGGREG && LA199_0<=WINDOW_AGGREG)||(LA199_0>=INT_TYPE && LA199_0<=NULL_TYPE)||(LA199_0>=STAR && LA199_0<=PLUS)||(LA199_0>=BAND && LA199_0<=BXOR)||(LA199_0>=LT && LA199_0<=GE)||(LA199_0>=MINUS && LA199_0<=MOD)||(LA199_0>=EVAL_IS_GROUP_EXPR && LA199_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // EsperEPL2Ast.g:599:34: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4019);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(l); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:600:4: ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeExpr4032); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4034);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4036);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:600:37: ( valueExpr )?
                    int alt200=2;
                    int LA200_0 = input.LA(1);

                    if ( ((LA200_0>=IN_SET && LA200_0<=REGEXP)||LA200_0==NOT_EXPR||(LA200_0>=SUM && LA200_0<=AVG)||(LA200_0>=COALESCE && LA200_0<=COUNT)||(LA200_0>=CASE && LA200_0<=CASE2)||(LA200_0>=PREVIOUS && LA200_0<=EXISTS)||(LA200_0>=INSTANCEOF && LA200_0<=CURRENT_TIMESTAMP)||LA200_0==NEWKW||(LA200_0>=EVAL_AND_EXPR && LA200_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA200_0==EVENT_PROP_EXPR||LA200_0==CONCAT||(LA200_0>=LIB_FUNC_CHAIN && LA200_0<=DOT_EXPR)||LA200_0==ARRAY_EXPR||(LA200_0>=NOT_IN_SET && LA200_0<=NOT_REGEXP)||(LA200_0>=IN_RANGE && LA200_0<=SUBSELECT_EXPR)||(LA200_0>=EXISTS_SUBSELECT_EXPR && LA200_0<=NOT_IN_SUBSELECT_EXPR)||LA200_0==SUBSTITUTION||(LA200_0>=FIRST_AGGREG && LA200_0<=WINDOW_AGGREG)||(LA200_0>=INT_TYPE && LA200_0<=NULL_TYPE)||(LA200_0>=STAR && LA200_0<=PLUS)||(LA200_0>=BAND && LA200_0<=BXOR)||(LA200_0>=LT && LA200_0<=GE)||(LA200_0>=MINUS && LA200_0<=MOD)||(LA200_0>=EVAL_IS_GROUP_EXPR && LA200_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt200=1;
                    }
                    switch (alt200) {
                        case 1 :
                            // EsperEPL2Ast.g:600:38: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4039);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(l); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "likeExpr"


    // $ANTLR start "regExpExpr"
    // EsperEPL2Ast.g:603:1: regExpExpr : ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) );
    public final void regExpExpr() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:604:2: ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) )
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==REGEXP) ) {
                alt202=1;
            }
            else if ( (LA202_0==NOT_REGEXP) ) {
                alt202=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 202, 0, input);

                throw nvae;
            }
            switch (alt202) {
                case 1 :
                    // EsperEPL2Ast.g:604:4: ^(r= REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,REGEXP,FOLLOW_REGEXP_in_regExpExpr4058); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4060);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4062);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(r); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:605:4: ^(r= NOT_REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,NOT_REGEXP,FOLLOW_NOT_REGEXP_in_regExpExpr4073); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4075);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4077);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(r); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "regExpExpr"


    // $ANTLR start "builtinFunc"
    // EsperEPL2Ast.g:608:1: builtinFunc : ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) );
    public final void builtinFunc() throws RecognitionException {
        CommonTree f=null;
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:609:2: ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) )
            int alt228=20;
            switch ( input.LA(1) ) {
            case SUM:
                {
                alt228=1;
                }
                break;
            case AVG:
                {
                alt228=2;
                }
                break;
            case COUNT:
                {
                alt228=3;
                }
                break;
            case MEDIAN:
                {
                alt228=4;
                }
                break;
            case STDDEV:
                {
                alt228=5;
                }
                break;
            case AVEDEV:
                {
                alt228=6;
                }
                break;
            case LAST_AGGREG:
                {
                alt228=7;
                }
                break;
            case FIRST_AGGREG:
                {
                alt228=8;
                }
                break;
            case WINDOW_AGGREG:
                {
                alt228=9;
                }
                break;
            case COALESCE:
                {
                alt228=10;
                }
                break;
            case PREVIOUS:
                {
                alt228=11;
                }
                break;
            case PREVIOUSTAIL:
                {
                alt228=12;
                }
                break;
            case PREVIOUSCOUNT:
                {
                alt228=13;
                }
                break;
            case PREVIOUSWINDOW:
                {
                alt228=14;
                }
                break;
            case PRIOR:
                {
                alt228=15;
                }
                break;
            case INSTANCEOF:
                {
                alt228=16;
                }
                break;
            case TYPEOF:
                {
                alt228=17;
                }
                break;
            case CAST:
                {
                alt228=18;
                }
                break;
            case EXISTS:
                {
                alt228=19;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt228=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 228, 0, input);

                throw nvae;
            }

            switch (alt228) {
                case 1 :
                    // EsperEPL2Ast.g:609:5: ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,SUM,FOLLOW_SUM_in_builtinFunc4096); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:609:13: ( DISTINCT )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==DISTINCT) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // EsperEPL2Ast.g:609:14: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4099); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4103);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:609:35: ( aggregationFilterExpr )?
                    int alt204=2;
                    int LA204_0 = input.LA(1);

                    if ( (LA204_0==AGG_FILTER_EXPR) ) {
                        alt204=1;
                    }
                    switch (alt204) {
                        case 1 :
                            // EsperEPL2Ast.g:609:35: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4105);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:610:4: ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVG,FOLLOW_AVG_in_builtinFunc4117); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:610:12: ( DISTINCT )?
                    int alt205=2;
                    int LA205_0 = input.LA(1);

                    if ( (LA205_0==DISTINCT) ) {
                        alt205=1;
                    }
                    switch (alt205) {
                        case 1 :
                            // EsperEPL2Ast.g:610:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4120); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4124);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:610:34: ( aggregationFilterExpr )?
                    int alt206=2;
                    int LA206_0 = input.LA(1);

                    if ( (LA206_0==AGG_FILTER_EXPR) ) {
                        alt206=1;
                    }
                    switch (alt206) {
                        case 1 :
                            // EsperEPL2Ast.g:610:34: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4126);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:611:4: ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_builtinFunc4138); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:611:14: ( ( DISTINCT )? valueExpr )?
                        int alt208=2;
                        int LA208_0 = input.LA(1);

                        if ( ((LA208_0>=IN_SET && LA208_0<=REGEXP)||LA208_0==NOT_EXPR||(LA208_0>=SUM && LA208_0<=AVG)||(LA208_0>=COALESCE && LA208_0<=COUNT)||(LA208_0>=CASE && LA208_0<=CASE2)||LA208_0==DISTINCT||(LA208_0>=PREVIOUS && LA208_0<=EXISTS)||(LA208_0>=INSTANCEOF && LA208_0<=CURRENT_TIMESTAMP)||LA208_0==NEWKW||(LA208_0>=EVAL_AND_EXPR && LA208_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA208_0==EVENT_PROP_EXPR||LA208_0==CONCAT||(LA208_0>=LIB_FUNC_CHAIN && LA208_0<=DOT_EXPR)||LA208_0==ARRAY_EXPR||(LA208_0>=NOT_IN_SET && LA208_0<=NOT_REGEXP)||(LA208_0>=IN_RANGE && LA208_0<=SUBSELECT_EXPR)||(LA208_0>=EXISTS_SUBSELECT_EXPR && LA208_0<=NOT_IN_SUBSELECT_EXPR)||LA208_0==SUBSTITUTION||(LA208_0>=FIRST_AGGREG && LA208_0<=WINDOW_AGGREG)||(LA208_0>=INT_TYPE && LA208_0<=NULL_TYPE)||(LA208_0>=STAR && LA208_0<=PLUS)||(LA208_0>=BAND && LA208_0<=BXOR)||(LA208_0>=LT && LA208_0<=GE)||(LA208_0>=MINUS && LA208_0<=MOD)||(LA208_0>=EVAL_IS_GROUP_EXPR && LA208_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt208=1;
                        }
                        switch (alt208) {
                            case 1 :
                                // EsperEPL2Ast.g:611:15: ( DISTINCT )? valueExpr
                                {
                                // EsperEPL2Ast.g:611:15: ( DISTINCT )?
                                int alt207=2;
                                int LA207_0 = input.LA(1);

                                if ( (LA207_0==DISTINCT) ) {
                                    alt207=1;
                                }
                                switch (alt207) {
                                    case 1 :
                                        // EsperEPL2Ast.g:611:16: DISTINCT
                                        {
                                        match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4142); 

                                        }
                                        break;

                                }

                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4146);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:611:39: ( aggregationFilterExpr )?
                        int alt209=2;
                        int LA209_0 = input.LA(1);

                        if ( (LA209_0==AGG_FILTER_EXPR) ) {
                            alt209=1;
                        }
                        switch (alt209) {
                            case 1 :
                                // EsperEPL2Ast.g:611:39: aggregationFilterExpr
                                {
                                pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4150);
                                aggregationFilterExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:612:4: ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,MEDIAN,FOLLOW_MEDIAN_in_builtinFunc4162); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:612:15: ( DISTINCT )?
                    int alt210=2;
                    int LA210_0 = input.LA(1);

                    if ( (LA210_0==DISTINCT) ) {
                        alt210=1;
                    }
                    switch (alt210) {
                        case 1 :
                            // EsperEPL2Ast.g:612:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4165); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4169);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:612:37: ( aggregationFilterExpr )?
                    int alt211=2;
                    int LA211_0 = input.LA(1);

                    if ( (LA211_0==AGG_FILTER_EXPR) ) {
                        alt211=1;
                    }
                    switch (alt211) {
                        case 1 :
                            // EsperEPL2Ast.g:612:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4171);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:613:4: ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,STDDEV,FOLLOW_STDDEV_in_builtinFunc4183); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:613:15: ( DISTINCT )?
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==DISTINCT) ) {
                        alt212=1;
                    }
                    switch (alt212) {
                        case 1 :
                            // EsperEPL2Ast.g:613:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4186); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4190);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:613:37: ( aggregationFilterExpr )?
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==AGG_FILTER_EXPR) ) {
                        alt213=1;
                    }
                    switch (alt213) {
                        case 1 :
                            // EsperEPL2Ast.g:613:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4192);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:614:4: ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVEDEV,FOLLOW_AVEDEV_in_builtinFunc4204); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:614:15: ( DISTINCT )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==DISTINCT) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // EsperEPL2Ast.g:614:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4207); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4211);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:614:37: ( aggregationFilterExpr )?
                    int alt215=2;
                    int LA215_0 = input.LA(1);

                    if ( (LA215_0==AGG_FILTER_EXPR) ) {
                        alt215=1;
                    }
                    switch (alt215) {
                        case 1 :
                            // EsperEPL2Ast.g:614:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4213);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:615:4: ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,LAST_AGGREG,FOLLOW_LAST_AGGREG_in_builtinFunc4225); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:615:20: ( DISTINCT )?
                        int alt216=2;
                        int LA216_0 = input.LA(1);

                        if ( (LA216_0==DISTINCT) ) {
                            alt216=1;
                        }
                        switch (alt216) {
                            case 1 :
                                // EsperEPL2Ast.g:615:21: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4228); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:615:32: ( accessValueExpr )?
                        int alt217=2;
                        int LA217_0 = input.LA(1);

                        if ( (LA217_0==ACCESS_AGG) ) {
                            alt217=1;
                        }
                        switch (alt217) {
                            case 1 :
                                // EsperEPL2Ast.g:615:32: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4232);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:615:49: ( valueExpr )?
                        int alt218=2;
                        int LA218_0 = input.LA(1);

                        if ( ((LA218_0>=IN_SET && LA218_0<=REGEXP)||LA218_0==NOT_EXPR||(LA218_0>=SUM && LA218_0<=AVG)||(LA218_0>=COALESCE && LA218_0<=COUNT)||(LA218_0>=CASE && LA218_0<=CASE2)||(LA218_0>=PREVIOUS && LA218_0<=EXISTS)||(LA218_0>=INSTANCEOF && LA218_0<=CURRENT_TIMESTAMP)||LA218_0==NEWKW||(LA218_0>=EVAL_AND_EXPR && LA218_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA218_0==EVENT_PROP_EXPR||LA218_0==CONCAT||(LA218_0>=LIB_FUNC_CHAIN && LA218_0<=DOT_EXPR)||LA218_0==ARRAY_EXPR||(LA218_0>=NOT_IN_SET && LA218_0<=NOT_REGEXP)||(LA218_0>=IN_RANGE && LA218_0<=SUBSELECT_EXPR)||(LA218_0>=EXISTS_SUBSELECT_EXPR && LA218_0<=NOT_IN_SUBSELECT_EXPR)||LA218_0==SUBSTITUTION||(LA218_0>=FIRST_AGGREG && LA218_0<=WINDOW_AGGREG)||(LA218_0>=INT_TYPE && LA218_0<=NULL_TYPE)||(LA218_0>=STAR && LA218_0<=PLUS)||(LA218_0>=BAND && LA218_0<=BXOR)||(LA218_0>=LT && LA218_0<=GE)||(LA218_0>=MINUS && LA218_0<=MOD)||(LA218_0>=EVAL_IS_GROUP_EXPR && LA218_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt218=1;
                        }
                        switch (alt218) {
                            case 1 :
                                // EsperEPL2Ast.g:615:49: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4235);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:616:4: ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,FIRST_AGGREG,FOLLOW_FIRST_AGGREG_in_builtinFunc4247); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:616:21: ( DISTINCT )?
                        int alt219=2;
                        int LA219_0 = input.LA(1);

                        if ( (LA219_0==DISTINCT) ) {
                            alt219=1;
                        }
                        switch (alt219) {
                            case 1 :
                                // EsperEPL2Ast.g:616:22: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4250); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:616:33: ( accessValueExpr )?
                        int alt220=2;
                        int LA220_0 = input.LA(1);

                        if ( (LA220_0==ACCESS_AGG) ) {
                            alt220=1;
                        }
                        switch (alt220) {
                            case 1 :
                                // EsperEPL2Ast.g:616:33: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4254);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:616:50: ( valueExpr )?
                        int alt221=2;
                        int LA221_0 = input.LA(1);

                        if ( ((LA221_0>=IN_SET && LA221_0<=REGEXP)||LA221_0==NOT_EXPR||(LA221_0>=SUM && LA221_0<=AVG)||(LA221_0>=COALESCE && LA221_0<=COUNT)||(LA221_0>=CASE && LA221_0<=CASE2)||(LA221_0>=PREVIOUS && LA221_0<=EXISTS)||(LA221_0>=INSTANCEOF && LA221_0<=CURRENT_TIMESTAMP)||LA221_0==NEWKW||(LA221_0>=EVAL_AND_EXPR && LA221_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA221_0==EVENT_PROP_EXPR||LA221_0==CONCAT||(LA221_0>=LIB_FUNC_CHAIN && LA221_0<=DOT_EXPR)||LA221_0==ARRAY_EXPR||(LA221_0>=NOT_IN_SET && LA221_0<=NOT_REGEXP)||(LA221_0>=IN_RANGE && LA221_0<=SUBSELECT_EXPR)||(LA221_0>=EXISTS_SUBSELECT_EXPR && LA221_0<=NOT_IN_SUBSELECT_EXPR)||LA221_0==SUBSTITUTION||(LA221_0>=FIRST_AGGREG && LA221_0<=WINDOW_AGGREG)||(LA221_0>=INT_TYPE && LA221_0<=NULL_TYPE)||(LA221_0>=STAR && LA221_0<=PLUS)||(LA221_0>=BAND && LA221_0<=BXOR)||(LA221_0>=LT && LA221_0<=GE)||(LA221_0>=MINUS && LA221_0<=MOD)||(LA221_0>=EVAL_IS_GROUP_EXPR && LA221_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt221=1;
                        }
                        switch (alt221) {
                            case 1 :
                                // EsperEPL2Ast.g:616:50: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4257);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:617:4: ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? )
                    {
                    f=(CommonTree)match(input,WINDOW_AGGREG,FOLLOW_WINDOW_AGGREG_in_builtinFunc4269); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:617:22: ( DISTINCT )?
                        int alt222=2;
                        int LA222_0 = input.LA(1);

                        if ( (LA222_0==DISTINCT) ) {
                            alt222=1;
                        }
                        switch (alt222) {
                            case 1 :
                                // EsperEPL2Ast.g:617:23: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4272); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:617:34: ( accessValueExpr )?
                        int alt223=2;
                        int LA223_0 = input.LA(1);

                        if ( (LA223_0==ACCESS_AGG) ) {
                            alt223=1;
                        }
                        switch (alt223) {
                            case 1 :
                                // EsperEPL2Ast.g:617:34: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4276);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:618:5: ^(f= COALESCE valueExpr valueExpr ( valueExpr )* )
                    {
                    f=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtinFunc4289); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4291);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4293);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:618:38: ( valueExpr )*
                    loop224:
                    do {
                        int alt224=2;
                        int LA224_0 = input.LA(1);

                        if ( ((LA224_0>=IN_SET && LA224_0<=REGEXP)||LA224_0==NOT_EXPR||(LA224_0>=SUM && LA224_0<=AVG)||(LA224_0>=COALESCE && LA224_0<=COUNT)||(LA224_0>=CASE && LA224_0<=CASE2)||(LA224_0>=PREVIOUS && LA224_0<=EXISTS)||(LA224_0>=INSTANCEOF && LA224_0<=CURRENT_TIMESTAMP)||LA224_0==NEWKW||(LA224_0>=EVAL_AND_EXPR && LA224_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA224_0==EVENT_PROP_EXPR||LA224_0==CONCAT||(LA224_0>=LIB_FUNC_CHAIN && LA224_0<=DOT_EXPR)||LA224_0==ARRAY_EXPR||(LA224_0>=NOT_IN_SET && LA224_0<=NOT_REGEXP)||(LA224_0>=IN_RANGE && LA224_0<=SUBSELECT_EXPR)||(LA224_0>=EXISTS_SUBSELECT_EXPR && LA224_0<=NOT_IN_SUBSELECT_EXPR)||LA224_0==SUBSTITUTION||(LA224_0>=FIRST_AGGREG && LA224_0<=WINDOW_AGGREG)||(LA224_0>=INT_TYPE && LA224_0<=NULL_TYPE)||(LA224_0>=STAR && LA224_0<=PLUS)||(LA224_0>=BAND && LA224_0<=BXOR)||(LA224_0>=LT && LA224_0<=GE)||(LA224_0>=MINUS && LA224_0<=MOD)||(LA224_0>=EVAL_IS_GROUP_EXPR && LA224_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt224=1;
                        }


                        switch (alt224) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:618:39: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_builtinFunc4296);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop224;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:619:5: ^(f= PREVIOUS valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_builtinFunc4311); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4313);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:619:28: ( valueExpr )?
                    int alt225=2;
                    int LA225_0 = input.LA(1);

                    if ( ((LA225_0>=IN_SET && LA225_0<=REGEXP)||LA225_0==NOT_EXPR||(LA225_0>=SUM && LA225_0<=AVG)||(LA225_0>=COALESCE && LA225_0<=COUNT)||(LA225_0>=CASE && LA225_0<=CASE2)||(LA225_0>=PREVIOUS && LA225_0<=EXISTS)||(LA225_0>=INSTANCEOF && LA225_0<=CURRENT_TIMESTAMP)||LA225_0==NEWKW||(LA225_0>=EVAL_AND_EXPR && LA225_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA225_0==EVENT_PROP_EXPR||LA225_0==CONCAT||(LA225_0>=LIB_FUNC_CHAIN && LA225_0<=DOT_EXPR)||LA225_0==ARRAY_EXPR||(LA225_0>=NOT_IN_SET && LA225_0<=NOT_REGEXP)||(LA225_0>=IN_RANGE && LA225_0<=SUBSELECT_EXPR)||(LA225_0>=EXISTS_SUBSELECT_EXPR && LA225_0<=NOT_IN_SUBSELECT_EXPR)||LA225_0==SUBSTITUTION||(LA225_0>=FIRST_AGGREG && LA225_0<=WINDOW_AGGREG)||(LA225_0>=INT_TYPE && LA225_0<=NULL_TYPE)||(LA225_0>=STAR && LA225_0<=PLUS)||(LA225_0>=BAND && LA225_0<=BXOR)||(LA225_0>=LT && LA225_0<=GE)||(LA225_0>=MINUS && LA225_0<=MOD)||(LA225_0>=EVAL_IS_GROUP_EXPR && LA225_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt225=1;
                    }
                    switch (alt225) {
                        case 1 :
                            // EsperEPL2Ast.g:619:28: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4315);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:620:5: ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUSTAIL,FOLLOW_PREVIOUSTAIL_in_builtinFunc4328); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4330);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:620:32: ( valueExpr )?
                    int alt226=2;
                    int LA226_0 = input.LA(1);

                    if ( ((LA226_0>=IN_SET && LA226_0<=REGEXP)||LA226_0==NOT_EXPR||(LA226_0>=SUM && LA226_0<=AVG)||(LA226_0>=COALESCE && LA226_0<=COUNT)||(LA226_0>=CASE && LA226_0<=CASE2)||(LA226_0>=PREVIOUS && LA226_0<=EXISTS)||(LA226_0>=INSTANCEOF && LA226_0<=CURRENT_TIMESTAMP)||LA226_0==NEWKW||(LA226_0>=EVAL_AND_EXPR && LA226_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA226_0==EVENT_PROP_EXPR||LA226_0==CONCAT||(LA226_0>=LIB_FUNC_CHAIN && LA226_0<=DOT_EXPR)||LA226_0==ARRAY_EXPR||(LA226_0>=NOT_IN_SET && LA226_0<=NOT_REGEXP)||(LA226_0>=IN_RANGE && LA226_0<=SUBSELECT_EXPR)||(LA226_0>=EXISTS_SUBSELECT_EXPR && LA226_0<=NOT_IN_SUBSELECT_EXPR)||LA226_0==SUBSTITUTION||(LA226_0>=FIRST_AGGREG && LA226_0<=WINDOW_AGGREG)||(LA226_0>=INT_TYPE && LA226_0<=NULL_TYPE)||(LA226_0>=STAR && LA226_0<=PLUS)||(LA226_0>=BAND && LA226_0<=BXOR)||(LA226_0>=LT && LA226_0<=GE)||(LA226_0>=MINUS && LA226_0<=MOD)||(LA226_0>=EVAL_IS_GROUP_EXPR && LA226_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt226=1;
                    }
                    switch (alt226) {
                        case 1 :
                            // EsperEPL2Ast.g:620:32: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4332);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 13 :
                    // EsperEPL2Ast.g:621:5: ^(f= PREVIOUSCOUNT valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSCOUNT,FOLLOW_PREVIOUSCOUNT_in_builtinFunc4345); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4347);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:622:5: ^(f= PREVIOUSWINDOW valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSWINDOW,FOLLOW_PREVIOUSWINDOW_in_builtinFunc4359); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4361);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:623:5: ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,PRIOR,FOLLOW_PRIOR_in_builtinFunc4373); 

                    match(input, Token.DOWN, null); 
                    c=(CommonTree)match(input,NUM_INT,FOLLOW_NUM_INT_in_builtinFunc4377); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4379);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    leaveNode(c); leaveNode(f);

                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:624:5: ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* )
                    {
                    f=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_builtinFunc4392); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4394);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4396); 
                    // EsperEPL2Ast.g:624:42: ( CLASS_IDENT )*
                    loop227:
                    do {
                        int alt227=2;
                        int LA227_0 = input.LA(1);

                        if ( (LA227_0==CLASS_IDENT) ) {
                            alt227=1;
                        }


                        switch (alt227) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:624:43: CLASS_IDENT
                    	    {
                    	    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4399); 

                    	    }
                    	    break;

                    	default :
                    	    break loop227;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:625:5: ^(f= TYPEOF valueExpr )
                    {
                    f=(CommonTree)match(input,TYPEOF,FOLLOW_TYPEOF_in_builtinFunc4413); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4415);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:626:5: ^(f= CAST valueExpr CLASS_IDENT )
                    {
                    f=(CommonTree)match(input,CAST,FOLLOW_CAST_in_builtinFunc4427); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4429);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4431); 

                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 19 :
                    // EsperEPL2Ast.g:627:5: ^(f= EXISTS eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_builtinFunc4443); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4445);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 20 :
                    // EsperEPL2Ast.g:628:4: ^(f= CURRENT_TIMESTAMP )
                    {
                    f=(CommonTree)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4457); 



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "builtinFunc"


    // $ANTLR start "aggregationFilterExpr"
    // EsperEPL2Ast.g:631:1: aggregationFilterExpr : ^( AGG_FILTER_EXPR valueExpr ) ;
    public final void aggregationFilterExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:632:2: ( ^( AGG_FILTER_EXPR valueExpr ) )
            // EsperEPL2Ast.g:632:4: ^( AGG_FILTER_EXPR valueExpr )
            {
            match(input,AGG_FILTER_EXPR,FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr4474); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_aggregationFilterExpr4476);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "aggregationFilterExpr"


    // $ANTLR start "accessValueExpr"
    // EsperEPL2Ast.g:635:1: accessValueExpr : ^( ACCESS_AGG accessValueExprChoice ) ;
    public final void accessValueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:636:2: ( ^( ACCESS_AGG accessValueExprChoice ) )
            // EsperEPL2Ast.g:636:5: ^( ACCESS_AGG accessValueExprChoice )
            {
            match(input,ACCESS_AGG,FOLLOW_ACCESS_AGG_in_accessValueExpr4490); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accessValueExprChoice_in_accessValueExpr4492);
            accessValueExprChoice();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "accessValueExpr"


    // $ANTLR start "accessValueExprChoice"
    // EsperEPL2Ast.g:639:1: accessValueExprChoice : ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr );
    public final void accessValueExprChoice() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:640:2: ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr )
            int alt230=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt230=1;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt230=2;
                }
                break;
            case IN_SET:
            case BETWEEN:
            case LIKE:
            case REGEXP:
            case NOT_EXPR:
            case SUM:
            case AVG:
            case COALESCE:
            case MEDIAN:
            case STDDEV:
            case AVEDEV:
            case COUNT:
            case CASE:
            case CASE2:
            case PREVIOUS:
            case PREVIOUSTAIL:
            case PREVIOUSCOUNT:
            case PREVIOUSWINDOW:
            case PRIOR:
            case EXISTS:
            case INSTANCEOF:
            case TYPEOF:
            case CAST:
            case CURRENT_TIMESTAMP:
            case NEWKW:
            case EVAL_AND_EXPR:
            case EVAL_OR_EXPR:
            case EVAL_EQUALS_EXPR:
            case EVAL_NOTEQUALS_EXPR:
            case EVAL_IS_EXPR:
            case EVAL_ISNOT_EXPR:
            case EVAL_EQUALS_GROUP_EXPR:
            case EVAL_NOTEQUALS_GROUP_EXPR:
            case EVENT_PROP_EXPR:
            case CONCAT:
            case LIB_FUNC_CHAIN:
            case DOT_EXPR:
            case ARRAY_EXPR:
            case NOT_IN_SET:
            case NOT_BETWEEN:
            case NOT_LIKE:
            case NOT_REGEXP:
            case IN_RANGE:
            case NOT_IN_RANGE:
            case SUBSELECT_EXPR:
            case EXISTS_SUBSELECT_EXPR:
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
            case SUBSTITUTION:
            case FIRST_AGGREG:
            case LAST_AGGREG:
            case WINDOW_AGGREG:
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
            case STAR:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case LT:
            case GT:
            case LE:
            case GE:
            case MINUS:
            case DIV:
            case MOD:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt230=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 230, 0, input);

                throw nvae;
            }

            switch (alt230) {
                case 1 :
                    // EsperEPL2Ast.g:640:4: PROPERTY_WILDCARD_SELECT
                    {
                    match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice4507); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:640:31: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice4514); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice4516); 
                    // EsperEPL2Ast.g:640:67: ( IDENT )?
                    int alt229=2;
                    int LA229_0 = input.LA(1);

                    if ( (LA229_0==IDENT) ) {
                        alt229=1;
                    }
                    switch (alt229) {
                        case 1 :
                            // EsperEPL2Ast.g:640:67: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice4518); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:640:77: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_accessValueExprChoice4524);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "accessValueExprChoice"


    // $ANTLR start "arrayExpr"
    // EsperEPL2Ast.g:643:1: arrayExpr : ^(a= ARRAY_EXPR ( valueExpr )* ) ;
    public final void arrayExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:644:2: ( ^(a= ARRAY_EXPR ( valueExpr )* ) )
            // EsperEPL2Ast.g:644:4: ^(a= ARRAY_EXPR ( valueExpr )* )
            {
            a=(CommonTree)match(input,ARRAY_EXPR,FOLLOW_ARRAY_EXPR_in_arrayExpr4540); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:644:19: ( valueExpr )*
                loop231:
                do {
                    int alt231=2;
                    int LA231_0 = input.LA(1);

                    if ( ((LA231_0>=IN_SET && LA231_0<=REGEXP)||LA231_0==NOT_EXPR||(LA231_0>=SUM && LA231_0<=AVG)||(LA231_0>=COALESCE && LA231_0<=COUNT)||(LA231_0>=CASE && LA231_0<=CASE2)||(LA231_0>=PREVIOUS && LA231_0<=EXISTS)||(LA231_0>=INSTANCEOF && LA231_0<=CURRENT_TIMESTAMP)||LA231_0==NEWKW||(LA231_0>=EVAL_AND_EXPR && LA231_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA231_0==EVENT_PROP_EXPR||LA231_0==CONCAT||(LA231_0>=LIB_FUNC_CHAIN && LA231_0<=DOT_EXPR)||LA231_0==ARRAY_EXPR||(LA231_0>=NOT_IN_SET && LA231_0<=NOT_REGEXP)||(LA231_0>=IN_RANGE && LA231_0<=SUBSELECT_EXPR)||(LA231_0>=EXISTS_SUBSELECT_EXPR && LA231_0<=NOT_IN_SUBSELECT_EXPR)||LA231_0==SUBSTITUTION||(LA231_0>=FIRST_AGGREG && LA231_0<=WINDOW_AGGREG)||(LA231_0>=INT_TYPE && LA231_0<=NULL_TYPE)||(LA231_0>=STAR && LA231_0<=PLUS)||(LA231_0>=BAND && LA231_0<=BXOR)||(LA231_0>=LT && LA231_0<=GE)||(LA231_0>=MINUS && LA231_0<=MOD)||(LA231_0>=EVAL_IS_GROUP_EXPR && LA231_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt231=1;
                    }


                    switch (alt231) {
                	case 1 :
                	    // EsperEPL2Ast.g:644:20: valueExpr
                	    {
                	    pushFollow(FOLLOW_valueExpr_in_arrayExpr4543);
                	    valueExpr();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop231;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             leaveNode(a); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayExpr"


    // $ANTLR start "arithmeticExpr"
    // EsperEPL2Ast.g:647:1: arithmeticExpr : ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) );
    public final void arithmeticExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:648:2: ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) )
            int alt233=9;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt233=1;
                }
                break;
            case MINUS:
                {
                alt233=2;
                }
                break;
            case DIV:
                {
                alt233=3;
                }
                break;
            case STAR:
                {
                alt233=4;
                }
                break;
            case MOD:
                {
                alt233=5;
                }
                break;
            case BAND:
                {
                alt233=6;
                }
                break;
            case BOR:
                {
                alt233=7;
                }
                break;
            case BXOR:
                {
                alt233=8;
                }
                break;
            case CONCAT:
                {
                alt233=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 233, 0, input);

                throw nvae;
            }

            switch (alt233) {
                case 1 :
                    // EsperEPL2Ast.g:648:5: ^(a= PLUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_arithmeticExpr4564); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4566);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4568);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:649:5: ^(a= MINUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_arithmeticExpr4580); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4582);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4584);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:650:5: ^(a= DIV valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,DIV,FOLLOW_DIV_in_arithmeticExpr4596); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4598);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4600);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:651:4: ^(a= STAR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,STAR,FOLLOW_STAR_in_arithmeticExpr4611); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4613);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4615);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:652:5: ^(a= MOD valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MOD,FOLLOW_MOD_in_arithmeticExpr4627); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4629);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4631);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:653:4: ^(a= BAND valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BAND,FOLLOW_BAND_in_arithmeticExpr4642); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4644);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4646);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:654:4: ^(a= BOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BOR,FOLLOW_BOR_in_arithmeticExpr4657); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4659);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4661);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:655:4: ^(a= BXOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BXOR,FOLLOW_BXOR_in_arithmeticExpr4672); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4674);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4676);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:656:5: ^(a= CONCAT valueExpr valueExpr ( valueExpr )* )
                    {
                    a=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_arithmeticExpr4688); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4690);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4692);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:656:36: ( valueExpr )*
                    loop232:
                    do {
                        int alt232=2;
                        int LA232_0 = input.LA(1);

                        if ( ((LA232_0>=IN_SET && LA232_0<=REGEXP)||LA232_0==NOT_EXPR||(LA232_0>=SUM && LA232_0<=AVG)||(LA232_0>=COALESCE && LA232_0<=COUNT)||(LA232_0>=CASE && LA232_0<=CASE2)||(LA232_0>=PREVIOUS && LA232_0<=EXISTS)||(LA232_0>=INSTANCEOF && LA232_0<=CURRENT_TIMESTAMP)||LA232_0==NEWKW||(LA232_0>=EVAL_AND_EXPR && LA232_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA232_0==EVENT_PROP_EXPR||LA232_0==CONCAT||(LA232_0>=LIB_FUNC_CHAIN && LA232_0<=DOT_EXPR)||LA232_0==ARRAY_EXPR||(LA232_0>=NOT_IN_SET && LA232_0<=NOT_REGEXP)||(LA232_0>=IN_RANGE && LA232_0<=SUBSELECT_EXPR)||(LA232_0>=EXISTS_SUBSELECT_EXPR && LA232_0<=NOT_IN_SUBSELECT_EXPR)||LA232_0==SUBSTITUTION||(LA232_0>=FIRST_AGGREG && LA232_0<=WINDOW_AGGREG)||(LA232_0>=INT_TYPE && LA232_0<=NULL_TYPE)||(LA232_0>=STAR && LA232_0<=PLUS)||(LA232_0>=BAND && LA232_0<=BXOR)||(LA232_0>=LT && LA232_0<=GE)||(LA232_0>=MINUS && LA232_0<=MOD)||(LA232_0>=EVAL_IS_GROUP_EXPR && LA232_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt232=1;
                        }


                        switch (alt232) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:656:37: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4695);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop232;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "arithmeticExpr"


    // $ANTLR start "dotExpr"
    // EsperEPL2Ast.g:659:1: dotExpr : ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) ;
    public final void dotExpr() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:660:2: ( ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) )
            // EsperEPL2Ast.g:660:4: ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* )
            {
            d=(CommonTree)match(input,DOT_EXPR,FOLLOW_DOT_EXPR_in_dotExpr4715); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dotExpr4717);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:660:27: ( libFunctionWithClass )*
            loop234:
            do {
                int alt234=2;
                int LA234_0 = input.LA(1);

                if ( (LA234_0==LIB_FUNCTION) ) {
                    alt234=1;
                }


                switch (alt234) {
            	case 1 :
            	    // EsperEPL2Ast.g:660:27: libFunctionWithClass
            	    {
            	    pushFollow(FOLLOW_libFunctionWithClass_in_dotExpr4719);
            	    libFunctionWithClass();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop234;
                }
            } while (true);


            match(input, Token.UP, null); 
             leaveNode(d); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "dotExpr"


    // $ANTLR start "newExpr"
    // EsperEPL2Ast.g:663:1: newExpr : ^(n= NEWKW ( newAssign )* ) ;
    public final void newExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:663:9: ( ^(n= NEWKW ( newAssign )* ) )
            // EsperEPL2Ast.g:663:11: ^(n= NEWKW ( newAssign )* )
            {
            n=(CommonTree)match(input,NEWKW,FOLLOW_NEWKW_in_newExpr4737); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:663:21: ( newAssign )*
                loop235:
                do {
                    int alt235=2;
                    int LA235_0 = input.LA(1);

                    if ( (LA235_0==NEW_ITEM) ) {
                        alt235=1;
                    }


                    switch (alt235) {
                	case 1 :
                	    // EsperEPL2Ast.g:663:21: newAssign
                	    {
                	    pushFollow(FOLLOW_newAssign_in_newExpr4739);
                	    newAssign();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop235;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             leaveNode(n); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "newExpr"


    // $ANTLR start "newAssign"
    // EsperEPL2Ast.g:666:1: newAssign : ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) ;
    public final void newAssign() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:667:2: ( ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) )
            // EsperEPL2Ast.g:667:4: ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? )
            {
            match(input,NEW_ITEM,FOLLOW_NEW_ITEM_in_newAssign4755); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_newAssign4757);
            eventPropertyExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:667:40: ( valueExpr )?
            int alt236=2;
            int LA236_0 = input.LA(1);

            if ( ((LA236_0>=IN_SET && LA236_0<=REGEXP)||LA236_0==NOT_EXPR||(LA236_0>=SUM && LA236_0<=AVG)||(LA236_0>=COALESCE && LA236_0<=COUNT)||(LA236_0>=CASE && LA236_0<=CASE2)||(LA236_0>=PREVIOUS && LA236_0<=EXISTS)||(LA236_0>=INSTANCEOF && LA236_0<=CURRENT_TIMESTAMP)||LA236_0==NEWKW||(LA236_0>=EVAL_AND_EXPR && LA236_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA236_0==EVENT_PROP_EXPR||LA236_0==CONCAT||(LA236_0>=LIB_FUNC_CHAIN && LA236_0<=DOT_EXPR)||LA236_0==ARRAY_EXPR||(LA236_0>=NOT_IN_SET && LA236_0<=NOT_REGEXP)||(LA236_0>=IN_RANGE && LA236_0<=SUBSELECT_EXPR)||(LA236_0>=EXISTS_SUBSELECT_EXPR && LA236_0<=NOT_IN_SUBSELECT_EXPR)||LA236_0==SUBSTITUTION||(LA236_0>=FIRST_AGGREG && LA236_0<=WINDOW_AGGREG)||(LA236_0>=INT_TYPE && LA236_0<=NULL_TYPE)||(LA236_0>=STAR && LA236_0<=PLUS)||(LA236_0>=BAND && LA236_0<=BXOR)||(LA236_0>=LT && LA236_0<=GE)||(LA236_0>=MINUS && LA236_0<=MOD)||(LA236_0>=EVAL_IS_GROUP_EXPR && LA236_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt236=1;
            }
            switch (alt236) {
                case 1 :
                    // EsperEPL2Ast.g:667:40: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_newAssign4760);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "newAssign"


    // $ANTLR start "libFuncChain"
    // EsperEPL2Ast.g:670:1: libFuncChain : ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) ;
    public final void libFuncChain() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:671:2: ( ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) )
            // EsperEPL2Ast.g:671:6: ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* )
            {
            l=(CommonTree)match(input,LIB_FUNC_CHAIN,FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain4778); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_libFuncChain4780);
            libFunctionWithClass();

            state._fsp--;

            // EsperEPL2Ast.g:671:46: ( libOrPropFunction )*
            loop237:
            do {
                int alt237=2;
                int LA237_0 = input.LA(1);

                if ( (LA237_0==EVENT_PROP_EXPR||LA237_0==LIB_FUNCTION) ) {
                    alt237=1;
                }


                switch (alt237) {
            	case 1 :
            	    // EsperEPL2Ast.g:671:46: libOrPropFunction
            	    {
            	    pushFollow(FOLLOW_libOrPropFunction_in_libFuncChain4782);
            	    libOrPropFunction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop237;
                }
            } while (true);


            match(input, Token.UP, null); 
             leaveNode(l); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libFuncChain"


    // $ANTLR start "libFunctionWithClass"
    // EsperEPL2Ast.g:674:1: libFunctionWithClass : ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) ;
    public final void libFunctionWithClass() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:675:2: ( ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) )
            // EsperEPL2Ast.g:675:6: ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? )
            {
            l=(CommonTree)match(input,LIB_FUNCTION,FOLLOW_LIB_FUNCTION_in_libFunctionWithClass4802); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:675:23: ( CLASS_IDENT )?
            int alt238=2;
            int LA238_0 = input.LA(1);

            if ( (LA238_0==CLASS_IDENT) ) {
                alt238=1;
            }
            switch (alt238) {
                case 1 :
                    // EsperEPL2Ast.g:675:24: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_libFunctionWithClass4805); 

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_libFunctionWithClass4809); 
            // EsperEPL2Ast.g:675:44: ( DISTINCT )?
            int alt239=2;
            int LA239_0 = input.LA(1);

            if ( (LA239_0==DISTINCT) ) {
                alt239=1;
            }
            switch (alt239) {
                case 1 :
                    // EsperEPL2Ast.g:675:45: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_libFunctionWithClass4812); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:675:56: ( libFunctionArgItem )*
            loop240:
            do {
                int alt240=2;
                int LA240_0 = input.LA(1);

                if ( ((LA240_0>=IN_SET && LA240_0<=REGEXP)||LA240_0==NOT_EXPR||(LA240_0>=SUM && LA240_0<=AVG)||(LA240_0>=COALESCE && LA240_0<=COUNT)||(LA240_0>=CASE && LA240_0<=CASE2)||LA240_0==LAST||(LA240_0>=PREVIOUS && LA240_0<=EXISTS)||(LA240_0>=LW && LA240_0<=CURRENT_TIMESTAMP)||LA240_0==NEWKW||(LA240_0>=NUMERIC_PARAM_RANGE && LA240_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA240_0>=EVAL_AND_EXPR && LA240_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA240_0==EVENT_PROP_EXPR||LA240_0==CONCAT||(LA240_0>=LIB_FUNC_CHAIN && LA240_0<=DOT_EXPR)||(LA240_0>=TIME_PERIOD && LA240_0<=ARRAY_EXPR)||(LA240_0>=NOT_IN_SET && LA240_0<=NOT_REGEXP)||(LA240_0>=IN_RANGE && LA240_0<=SUBSELECT_EXPR)||(LA240_0>=EXISTS_SUBSELECT_EXPR && LA240_0<=NOT_IN_SUBSELECT_EXPR)||(LA240_0>=LAST_OPERATOR && LA240_0<=SUBSTITUTION)||LA240_0==NUMBERSETSTAR||(LA240_0>=FIRST_AGGREG && LA240_0<=WINDOW_AGGREG)||(LA240_0>=INT_TYPE && LA240_0<=NULL_TYPE)||LA240_0==GOES||(LA240_0>=STAR && LA240_0<=PLUS)||(LA240_0>=BAND && LA240_0<=BXOR)||(LA240_0>=LT && LA240_0<=GE)||(LA240_0>=MINUS && LA240_0<=MOD)||(LA240_0>=EVAL_IS_GROUP_EXPR && LA240_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt240=1;
                }


                switch (alt240) {
            	case 1 :
            	    // EsperEPL2Ast.g:675:56: libFunctionArgItem
            	    {
            	    pushFollow(FOLLOW_libFunctionArgItem_in_libFunctionWithClass4816);
            	    libFunctionArgItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop240;
                }
            } while (true);

            // EsperEPL2Ast.g:675:76: ( LPAREN )?
            int alt241=2;
            int LA241_0 = input.LA(1);

            if ( (LA241_0==LPAREN) ) {
                alt241=1;
            }
            switch (alt241) {
                case 1 :
                    // EsperEPL2Ast.g:675:76: LPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_libFunctionWithClass4819); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libFunctionWithClass"


    // $ANTLR start "libFunctionArgItem"
    // EsperEPL2Ast.g:678:1: libFunctionArgItem : ( expressionLambdaDecl | valueExprWithTime );
    public final void libFunctionArgItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:679:2: ( expressionLambdaDecl | valueExprWithTime )
            int alt242=2;
            int LA242_0 = input.LA(1);

            if ( (LA242_0==GOES) ) {
                alt242=1;
            }
            else if ( ((LA242_0>=IN_SET && LA242_0<=REGEXP)||LA242_0==NOT_EXPR||(LA242_0>=SUM && LA242_0<=AVG)||(LA242_0>=COALESCE && LA242_0<=COUNT)||(LA242_0>=CASE && LA242_0<=CASE2)||LA242_0==LAST||(LA242_0>=PREVIOUS && LA242_0<=EXISTS)||(LA242_0>=LW && LA242_0<=CURRENT_TIMESTAMP)||LA242_0==NEWKW||(LA242_0>=NUMERIC_PARAM_RANGE && LA242_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA242_0>=EVAL_AND_EXPR && LA242_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA242_0==EVENT_PROP_EXPR||LA242_0==CONCAT||(LA242_0>=LIB_FUNC_CHAIN && LA242_0<=DOT_EXPR)||(LA242_0>=TIME_PERIOD && LA242_0<=ARRAY_EXPR)||(LA242_0>=NOT_IN_SET && LA242_0<=NOT_REGEXP)||(LA242_0>=IN_RANGE && LA242_0<=SUBSELECT_EXPR)||(LA242_0>=EXISTS_SUBSELECT_EXPR && LA242_0<=NOT_IN_SUBSELECT_EXPR)||(LA242_0>=LAST_OPERATOR && LA242_0<=SUBSTITUTION)||LA242_0==NUMBERSETSTAR||(LA242_0>=FIRST_AGGREG && LA242_0<=WINDOW_AGGREG)||(LA242_0>=INT_TYPE && LA242_0<=NULL_TYPE)||(LA242_0>=STAR && LA242_0<=PLUS)||(LA242_0>=BAND && LA242_0<=BXOR)||(LA242_0>=LT && LA242_0<=GE)||(LA242_0>=MINUS && LA242_0<=MOD)||(LA242_0>=EVAL_IS_GROUP_EXPR && LA242_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt242=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 242, 0, input);

                throw nvae;
            }
            switch (alt242) {
                case 1 :
                    // EsperEPL2Ast.g:679:4: expressionLambdaDecl
                    {
                    pushFollow(FOLLOW_expressionLambdaDecl_in_libFunctionArgItem4833);
                    expressionLambdaDecl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:679:27: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_libFunctionArgItem4837);
                    valueExprWithTime();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libFunctionArgItem"


    // $ANTLR start "libOrPropFunction"
    // EsperEPL2Ast.g:682:1: libOrPropFunction : ( eventPropertyExpr[false] | libFunctionWithClass );
    public final void libOrPropFunction() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:683:2: ( eventPropertyExpr[false] | libFunctionWithClass )
            int alt243=2;
            int LA243_0 = input.LA(1);

            if ( (LA243_0==EVENT_PROP_EXPR) ) {
                alt243=1;
            }
            else if ( (LA243_0==LIB_FUNCTION) ) {
                alt243=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 243, 0, input);

                throw nvae;
            }
            switch (alt243) {
                case 1 :
                    // EsperEPL2Ast.g:683:7: eventPropertyExpr[false]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_libOrPropFunction4852);
                    eventPropertyExpr(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:684:7: libFunctionWithClass
                    {
                    pushFollow(FOLLOW_libFunctionWithClass_in_libOrPropFunction4862);
                    libFunctionWithClass();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libOrPropFunction"


    // $ANTLR start "startPatternExpressionRule"
    // EsperEPL2Ast.g:690:1: startPatternExpressionRule : ( annotation[true] )* exprChoice ;
    public final void startPatternExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:691:2: ( ( annotation[true] )* exprChoice )
            // EsperEPL2Ast.g:691:4: ( annotation[true] )* exprChoice
            {
            // EsperEPL2Ast.g:691:4: ( annotation[true] )*
            loop244:
            do {
                int alt244=2;
                int LA244_0 = input.LA(1);

                if ( (LA244_0==ANNOTATION) ) {
                    alt244=1;
                }


                switch (alt244) {
            	case 1 :
            	    // EsperEPL2Ast.g:691:4: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startPatternExpressionRule4877);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop244;
                }
            } while (true);

            pushFollow(FOLLOW_exprChoice_in_startPatternExpressionRule4881);
            exprChoice();

            state._fsp--;

             endPattern(); end(); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "startPatternExpressionRule"


    // $ANTLR start "exprChoice"
    // EsperEPL2Ast.g:694:1: exprChoice : ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) );
    public final void exprChoice() throws RecognitionException {
        CommonTree a=null;
        CommonTree n=null;
        CommonTree g=null;
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:695:2: ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) )
            int alt249=7;
            switch ( input.LA(1) ) {
            case PATTERN_FILTER_EXPR:
            case OBSERVER_EXPR:
                {
                alt249=1;
                }
                break;
            case OR_EXPR:
            case AND_EXPR:
            case FOLLOWED_BY_EXPR:
                {
                alt249=2;
                }
                break;
            case EVERY_EXPR:
                {
                alt249=3;
                }
                break;
            case EVERY_DISTINCT_EXPR:
                {
                alt249=4;
                }
                break;
            case PATTERN_NOT_EXPR:
                {
                alt249=5;
                }
                break;
            case GUARD_EXPR:
                {
                alt249=6;
                }
                break;
            case MATCH_UNTIL_EXPR:
                {
                alt249=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 249, 0, input);

                throw nvae;
            }

            switch (alt249) {
                case 1 :
                    // EsperEPL2Ast.g:695:5: atomicExpr
                    {
                    pushFollow(FOLLOW_atomicExpr_in_exprChoice4895);
                    atomicExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:696:4: patternOp
                    {
                    pushFollow(FOLLOW_patternOp_in_exprChoice4900);
                    patternOp();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:697:5: ^(a= EVERY_EXPR exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_EXPR,FOLLOW_EVERY_EXPR_in_exprChoice4910); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice4912);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:698:5: ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_DISTINCT_EXPR,FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice4926); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distinctExpressions_in_exprChoice4928);
                    distinctExpressions();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_exprChoice4930);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:699:5: ^(n= PATTERN_NOT_EXPR exprChoice )
                    {
                    n=(CommonTree)match(input,PATTERN_NOT_EXPR,FOLLOW_PATTERN_NOT_EXPR_in_exprChoice4944); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice4946);
                    exprChoice();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:700:5: ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) )
                    {
                    g=(CommonTree)match(input,GUARD_EXPR,FOLLOW_GUARD_EXPR_in_exprChoice4960); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice4962);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:700:32: ( IDENT IDENT ( valueExprWithTime )* | valueExpr )
                    int alt246=2;
                    int LA246_0 = input.LA(1);

                    if ( (LA246_0==IDENT) ) {
                        alt246=1;
                    }
                    else if ( ((LA246_0>=IN_SET && LA246_0<=REGEXP)||LA246_0==NOT_EXPR||(LA246_0>=SUM && LA246_0<=AVG)||(LA246_0>=COALESCE && LA246_0<=COUNT)||(LA246_0>=CASE && LA246_0<=CASE2)||(LA246_0>=PREVIOUS && LA246_0<=EXISTS)||(LA246_0>=INSTANCEOF && LA246_0<=CURRENT_TIMESTAMP)||LA246_0==NEWKW||(LA246_0>=EVAL_AND_EXPR && LA246_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA246_0==EVENT_PROP_EXPR||LA246_0==CONCAT||(LA246_0>=LIB_FUNC_CHAIN && LA246_0<=DOT_EXPR)||LA246_0==ARRAY_EXPR||(LA246_0>=NOT_IN_SET && LA246_0<=NOT_REGEXP)||(LA246_0>=IN_RANGE && LA246_0<=SUBSELECT_EXPR)||(LA246_0>=EXISTS_SUBSELECT_EXPR && LA246_0<=NOT_IN_SUBSELECT_EXPR)||LA246_0==SUBSTITUTION||(LA246_0>=FIRST_AGGREG && LA246_0<=WINDOW_AGGREG)||(LA246_0>=INT_TYPE && LA246_0<=NULL_TYPE)||(LA246_0>=STAR && LA246_0<=PLUS)||(LA246_0>=BAND && LA246_0<=BXOR)||(LA246_0>=LT && LA246_0<=GE)||(LA246_0>=MINUS && LA246_0<=MOD)||(LA246_0>=EVAL_IS_GROUP_EXPR && LA246_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt246=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 246, 0, input);

                        throw nvae;
                    }
                    switch (alt246) {
                        case 1 :
                            // EsperEPL2Ast.g:700:33: IDENT IDENT ( valueExprWithTime )*
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice4965); 
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice4967); 
                            // EsperEPL2Ast.g:700:45: ( valueExprWithTime )*
                            loop245:
                            do {
                                int alt245=2;
                                int LA245_0 = input.LA(1);

                                if ( ((LA245_0>=IN_SET && LA245_0<=REGEXP)||LA245_0==NOT_EXPR||(LA245_0>=SUM && LA245_0<=AVG)||(LA245_0>=COALESCE && LA245_0<=COUNT)||(LA245_0>=CASE && LA245_0<=CASE2)||LA245_0==LAST||(LA245_0>=PREVIOUS && LA245_0<=EXISTS)||(LA245_0>=LW && LA245_0<=CURRENT_TIMESTAMP)||LA245_0==NEWKW||(LA245_0>=NUMERIC_PARAM_RANGE && LA245_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA245_0>=EVAL_AND_EXPR && LA245_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA245_0==EVENT_PROP_EXPR||LA245_0==CONCAT||(LA245_0>=LIB_FUNC_CHAIN && LA245_0<=DOT_EXPR)||(LA245_0>=TIME_PERIOD && LA245_0<=ARRAY_EXPR)||(LA245_0>=NOT_IN_SET && LA245_0<=NOT_REGEXP)||(LA245_0>=IN_RANGE && LA245_0<=SUBSELECT_EXPR)||(LA245_0>=EXISTS_SUBSELECT_EXPR && LA245_0<=NOT_IN_SUBSELECT_EXPR)||(LA245_0>=LAST_OPERATOR && LA245_0<=SUBSTITUTION)||LA245_0==NUMBERSETSTAR||(LA245_0>=FIRST_AGGREG && LA245_0<=WINDOW_AGGREG)||(LA245_0>=INT_TYPE && LA245_0<=NULL_TYPE)||(LA245_0>=STAR && LA245_0<=PLUS)||(LA245_0>=BAND && LA245_0<=BXOR)||(LA245_0>=LT && LA245_0<=GE)||(LA245_0>=MINUS && LA245_0<=MOD)||(LA245_0>=EVAL_IS_GROUP_EXPR && LA245_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt245=1;
                                }


                                switch (alt245) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:700:45: valueExprWithTime
                            	    {
                            	    pushFollow(FOLLOW_valueExprWithTime_in_exprChoice4969);
                            	    valueExprWithTime();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop245;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:700:66: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_exprChoice4974);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(g); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:701:4: ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? )
                    {
                    m=(CommonTree)match(input,MATCH_UNTIL_EXPR,FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice4988); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:701:26: ( matchUntilRange )?
                    int alt247=2;
                    int LA247_0 = input.LA(1);

                    if ( ((LA247_0>=MATCH_UNTIL_RANGE_HALFOPEN && LA247_0<=MATCH_UNTIL_RANGE_BOUNDED)) ) {
                        alt247=1;
                    }
                    switch (alt247) {
                        case 1 :
                            // EsperEPL2Ast.g:701:26: matchUntilRange
                            {
                            pushFollow(FOLLOW_matchUntilRange_in_exprChoice4990);
                            matchUntilRange();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_exprChoice_in_exprChoice4993);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:701:54: ( exprChoice )?
                    int alt248=2;
                    int LA248_0 = input.LA(1);

                    if ( ((LA248_0>=OR_EXPR && LA248_0<=AND_EXPR)||(LA248_0>=EVERY_EXPR && LA248_0<=EVERY_DISTINCT_EXPR)||LA248_0==FOLLOWED_BY_EXPR||(LA248_0>=PATTERN_FILTER_EXPR && LA248_0<=PATTERN_NOT_EXPR)||(LA248_0>=GUARD_EXPR && LA248_0<=OBSERVER_EXPR)||LA248_0==MATCH_UNTIL_EXPR) ) {
                        alt248=1;
                    }
                    switch (alt248) {
                        case 1 :
                            // EsperEPL2Ast.g:701:54: exprChoice
                            {
                            pushFollow(FOLLOW_exprChoice_in_exprChoice4995);
                            exprChoice();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(m); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprChoice"


    // $ANTLR start "distinctExpressions"
    // EsperEPL2Ast.g:705:1: distinctExpressions : ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) ;
    public final void distinctExpressions() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:706:2: ( ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) )
            // EsperEPL2Ast.g:706:4: ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ )
            {
            match(input,PATTERN_EVERY_DISTINCT_EXPR,FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5016); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:706:35: ( valueExprWithTime )+
            int cnt250=0;
            loop250:
            do {
                int alt250=2;
                int LA250_0 = input.LA(1);

                if ( ((LA250_0>=IN_SET && LA250_0<=REGEXP)||LA250_0==NOT_EXPR||(LA250_0>=SUM && LA250_0<=AVG)||(LA250_0>=COALESCE && LA250_0<=COUNT)||(LA250_0>=CASE && LA250_0<=CASE2)||LA250_0==LAST||(LA250_0>=PREVIOUS && LA250_0<=EXISTS)||(LA250_0>=LW && LA250_0<=CURRENT_TIMESTAMP)||LA250_0==NEWKW||(LA250_0>=NUMERIC_PARAM_RANGE && LA250_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA250_0>=EVAL_AND_EXPR && LA250_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA250_0==EVENT_PROP_EXPR||LA250_0==CONCAT||(LA250_0>=LIB_FUNC_CHAIN && LA250_0<=DOT_EXPR)||(LA250_0>=TIME_PERIOD && LA250_0<=ARRAY_EXPR)||(LA250_0>=NOT_IN_SET && LA250_0<=NOT_REGEXP)||(LA250_0>=IN_RANGE && LA250_0<=SUBSELECT_EXPR)||(LA250_0>=EXISTS_SUBSELECT_EXPR && LA250_0<=NOT_IN_SUBSELECT_EXPR)||(LA250_0>=LAST_OPERATOR && LA250_0<=SUBSTITUTION)||LA250_0==NUMBERSETSTAR||(LA250_0>=FIRST_AGGREG && LA250_0<=WINDOW_AGGREG)||(LA250_0>=INT_TYPE && LA250_0<=NULL_TYPE)||(LA250_0>=STAR && LA250_0<=PLUS)||(LA250_0>=BAND && LA250_0<=BXOR)||(LA250_0>=LT && LA250_0<=GE)||(LA250_0>=MINUS && LA250_0<=MOD)||(LA250_0>=EVAL_IS_GROUP_EXPR && LA250_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt250=1;
                }


                switch (alt250) {
            	case 1 :
            	    // EsperEPL2Ast.g:706:35: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_distinctExpressions5018);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt250 >= 1 ) break loop250;
                        EarlyExitException eee =
                            new EarlyExitException(250, input);
                        throw eee;
                }
                cnt250++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "distinctExpressions"


    // $ANTLR start "patternOp"
    // EsperEPL2Ast.g:709:1: patternOp : ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) );
    public final void patternOp() throws RecognitionException {
        CommonTree f=null;
        CommonTree o=null;
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:710:2: ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) )
            int alt254=3;
            switch ( input.LA(1) ) {
            case FOLLOWED_BY_EXPR:
                {
                alt254=1;
                }
                break;
            case OR_EXPR:
                {
                alt254=2;
                }
                break;
            case AND_EXPR:
                {
                alt254=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 254, 0, input);

                throw nvae;
            }

            switch (alt254) {
                case 1 :
                    // EsperEPL2Ast.g:710:4: ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* )
                    {
                    f=(CommonTree)match(input,FOLLOWED_BY_EXPR,FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5037); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_followedByItem_in_patternOp5039);
                    followedByItem();

                    state._fsp--;

                    pushFollow(FOLLOW_followedByItem_in_patternOp5041);
                    followedByItem();

                    state._fsp--;

                    // EsperEPL2Ast.g:710:56: ( followedByItem )*
                    loop251:
                    do {
                        int alt251=2;
                        int LA251_0 = input.LA(1);

                        if ( (LA251_0==FOLLOWED_BY_ITEM) ) {
                            alt251=1;
                        }


                        switch (alt251) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:710:57: followedByItem
                    	    {
                    	    pushFollow(FOLLOW_followedByItem_in_patternOp5044);
                    	    followedByItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop251;
                        }
                    } while (true);

                     leaveNode(f); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:711:5: ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    o=(CommonTree)match(input,OR_EXPR,FOLLOW_OR_EXPR_in_patternOp5060); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5062);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5064);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:711:40: ( exprChoice )*
                    loop252:
                    do {
                        int alt252=2;
                        int LA252_0 = input.LA(1);

                        if ( ((LA252_0>=OR_EXPR && LA252_0<=AND_EXPR)||(LA252_0>=EVERY_EXPR && LA252_0<=EVERY_DISTINCT_EXPR)||LA252_0==FOLLOWED_BY_EXPR||(LA252_0>=PATTERN_FILTER_EXPR && LA252_0<=PATTERN_NOT_EXPR)||(LA252_0>=GUARD_EXPR && LA252_0<=OBSERVER_EXPR)||LA252_0==MATCH_UNTIL_EXPR) ) {
                            alt252=1;
                        }


                        switch (alt252) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:711:41: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5067);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop252;
                        }
                    } while (true);

                     leaveNode(o); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:712:5: ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    a=(CommonTree)match(input,AND_EXPR,FOLLOW_AND_EXPR_in_patternOp5083); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5085);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5087);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:712:41: ( exprChoice )*
                    loop253:
                    do {
                        int alt253=2;
                        int LA253_0 = input.LA(1);

                        if ( ((LA253_0>=OR_EXPR && LA253_0<=AND_EXPR)||(LA253_0>=EVERY_EXPR && LA253_0<=EVERY_DISTINCT_EXPR)||LA253_0==FOLLOWED_BY_EXPR||(LA253_0>=PATTERN_FILTER_EXPR && LA253_0<=PATTERN_NOT_EXPR)||(LA253_0>=GUARD_EXPR && LA253_0<=OBSERVER_EXPR)||LA253_0==MATCH_UNTIL_EXPR) ) {
                            alt253=1;
                        }


                        switch (alt253) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:712:42: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5090);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop253;
                        }
                    } while (true);

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternOp"


    // $ANTLR start "followedByItem"
    // EsperEPL2Ast.g:715:1: followedByItem : ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) ;
    public final void followedByItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:716:2: ( ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) )
            // EsperEPL2Ast.g:716:4: ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice )
            {
            match(input,FOLLOWED_BY_ITEM,FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5111); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:716:24: ( valueExpr )?
            int alt255=2;
            int LA255_0 = input.LA(1);

            if ( ((LA255_0>=IN_SET && LA255_0<=REGEXP)||LA255_0==NOT_EXPR||(LA255_0>=SUM && LA255_0<=AVG)||(LA255_0>=COALESCE && LA255_0<=COUNT)||(LA255_0>=CASE && LA255_0<=CASE2)||(LA255_0>=PREVIOUS && LA255_0<=EXISTS)||(LA255_0>=INSTANCEOF && LA255_0<=CURRENT_TIMESTAMP)||LA255_0==NEWKW||(LA255_0>=EVAL_AND_EXPR && LA255_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA255_0==EVENT_PROP_EXPR||LA255_0==CONCAT||(LA255_0>=LIB_FUNC_CHAIN && LA255_0<=DOT_EXPR)||LA255_0==ARRAY_EXPR||(LA255_0>=NOT_IN_SET && LA255_0<=NOT_REGEXP)||(LA255_0>=IN_RANGE && LA255_0<=SUBSELECT_EXPR)||(LA255_0>=EXISTS_SUBSELECT_EXPR && LA255_0<=NOT_IN_SUBSELECT_EXPR)||LA255_0==SUBSTITUTION||(LA255_0>=FIRST_AGGREG && LA255_0<=WINDOW_AGGREG)||(LA255_0>=INT_TYPE && LA255_0<=NULL_TYPE)||(LA255_0>=STAR && LA255_0<=PLUS)||(LA255_0>=BAND && LA255_0<=BXOR)||(LA255_0>=LT && LA255_0<=GE)||(LA255_0>=MINUS && LA255_0<=MOD)||(LA255_0>=EVAL_IS_GROUP_EXPR && LA255_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt255=1;
            }
            switch (alt255) {
                case 1 :
                    // EsperEPL2Ast.g:716:24: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_followedByItem5113);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_exprChoice_in_followedByItem5116);
            exprChoice();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "followedByItem"


    // $ANTLR start "atomicExpr"
    // EsperEPL2Ast.g:719:1: atomicExpr : ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) );
    public final void atomicExpr() throws RecognitionException {
        CommonTree ac=null;

        try {
            // EsperEPL2Ast.g:720:2: ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            int alt257=2;
            int LA257_0 = input.LA(1);

            if ( (LA257_0==PATTERN_FILTER_EXPR) ) {
                alt257=1;
            }
            else if ( (LA257_0==OBSERVER_EXPR) ) {
                alt257=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 257, 0, input);

                throw nvae;
            }
            switch (alt257) {
                case 1 :
                    // EsperEPL2Ast.g:720:4: patternFilterExpr
                    {
                    pushFollow(FOLLOW_patternFilterExpr_in_atomicExpr5130);
                    patternFilterExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:721:7: ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* )
                    {
                    ac=(CommonTree)match(input,OBSERVER_EXPR,FOLLOW_OBSERVER_EXPR_in_atomicExpr5142); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5144); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5146); 
                    // EsperEPL2Ast.g:721:39: ( valueExprWithTime )*
                    loop256:
                    do {
                        int alt256=2;
                        int LA256_0 = input.LA(1);

                        if ( ((LA256_0>=IN_SET && LA256_0<=REGEXP)||LA256_0==NOT_EXPR||(LA256_0>=SUM && LA256_0<=AVG)||(LA256_0>=COALESCE && LA256_0<=COUNT)||(LA256_0>=CASE && LA256_0<=CASE2)||LA256_0==LAST||(LA256_0>=PREVIOUS && LA256_0<=EXISTS)||(LA256_0>=LW && LA256_0<=CURRENT_TIMESTAMP)||LA256_0==NEWKW||(LA256_0>=NUMERIC_PARAM_RANGE && LA256_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA256_0>=EVAL_AND_EXPR && LA256_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA256_0==EVENT_PROP_EXPR||LA256_0==CONCAT||(LA256_0>=LIB_FUNC_CHAIN && LA256_0<=DOT_EXPR)||(LA256_0>=TIME_PERIOD && LA256_0<=ARRAY_EXPR)||(LA256_0>=NOT_IN_SET && LA256_0<=NOT_REGEXP)||(LA256_0>=IN_RANGE && LA256_0<=SUBSELECT_EXPR)||(LA256_0>=EXISTS_SUBSELECT_EXPR && LA256_0<=NOT_IN_SUBSELECT_EXPR)||(LA256_0>=LAST_OPERATOR && LA256_0<=SUBSTITUTION)||LA256_0==NUMBERSETSTAR||(LA256_0>=FIRST_AGGREG && LA256_0<=WINDOW_AGGREG)||(LA256_0>=INT_TYPE && LA256_0<=NULL_TYPE)||(LA256_0>=STAR && LA256_0<=PLUS)||(LA256_0>=BAND && LA256_0<=BXOR)||(LA256_0>=LT && LA256_0<=GE)||(LA256_0>=MINUS && LA256_0<=MOD)||(LA256_0>=EVAL_IS_GROUP_EXPR && LA256_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt256=1;
                        }


                        switch (alt256) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:721:39: valueExprWithTime
                    	    {
                    	    pushFollow(FOLLOW_valueExprWithTime_in_atomicExpr5148);
                    	    valueExprWithTime();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop256;
                        }
                    } while (true);

                     leaveNode(ac); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "atomicExpr"


    // $ANTLR start "patternFilterExpr"
    // EsperEPL2Ast.g:724:1: patternFilterExpr : ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) ;
    public final void patternFilterExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:725:2: ( ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:725:4: ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,PATTERN_FILTER_EXPR,FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5168); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:725:29: ( IDENT )?
            int alt258=2;
            int LA258_0 = input.LA(1);

            if ( (LA258_0==IDENT) ) {
                alt258=1;
            }
            switch (alt258) {
                case 1 :
                    // EsperEPL2Ast.g:725:29: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_patternFilterExpr5170); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_patternFilterExpr5173); 
            // EsperEPL2Ast.g:725:48: ( propertyExpression )?
            int alt259=2;
            int LA259_0 = input.LA(1);

            if ( (LA259_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt259=1;
            }
            switch (alt259) {
                case 1 :
                    // EsperEPL2Ast.g:725:48: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_patternFilterExpr5175);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:725:68: ( patternFilterAnno )?
            int alt260=2;
            int LA260_0 = input.LA(1);

            if ( (LA260_0==ATCHAR) ) {
                alt260=1;
            }
            switch (alt260) {
                case 1 :
                    // EsperEPL2Ast.g:725:68: patternFilterAnno
                    {
                    pushFollow(FOLLOW_patternFilterAnno_in_patternFilterExpr5178);
                    patternFilterAnno();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:725:87: ( valueExpr )*
            loop261:
            do {
                int alt261=2;
                int LA261_0 = input.LA(1);

                if ( ((LA261_0>=IN_SET && LA261_0<=REGEXP)||LA261_0==NOT_EXPR||(LA261_0>=SUM && LA261_0<=AVG)||(LA261_0>=COALESCE && LA261_0<=COUNT)||(LA261_0>=CASE && LA261_0<=CASE2)||(LA261_0>=PREVIOUS && LA261_0<=EXISTS)||(LA261_0>=INSTANCEOF && LA261_0<=CURRENT_TIMESTAMP)||LA261_0==NEWKW||(LA261_0>=EVAL_AND_EXPR && LA261_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA261_0==EVENT_PROP_EXPR||LA261_0==CONCAT||(LA261_0>=LIB_FUNC_CHAIN && LA261_0<=DOT_EXPR)||LA261_0==ARRAY_EXPR||(LA261_0>=NOT_IN_SET && LA261_0<=NOT_REGEXP)||(LA261_0>=IN_RANGE && LA261_0<=SUBSELECT_EXPR)||(LA261_0>=EXISTS_SUBSELECT_EXPR && LA261_0<=NOT_IN_SUBSELECT_EXPR)||LA261_0==SUBSTITUTION||(LA261_0>=FIRST_AGGREG && LA261_0<=WINDOW_AGGREG)||(LA261_0>=INT_TYPE && LA261_0<=NULL_TYPE)||(LA261_0>=STAR && LA261_0<=PLUS)||(LA261_0>=BAND && LA261_0<=BXOR)||(LA261_0>=LT && LA261_0<=GE)||(LA261_0>=MINUS && LA261_0<=MOD)||(LA261_0>=EVAL_IS_GROUP_EXPR && LA261_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt261=1;
                }


                switch (alt261) {
            	case 1 :
            	    // EsperEPL2Ast.g:725:88: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_patternFilterExpr5182);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop261;
                }
            } while (true);

             leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternFilterExpr"


    // $ANTLR start "patternFilterAnno"
    // EsperEPL2Ast.g:728:1: patternFilterAnno : ^( ATCHAR IDENT ( number )? ) ;
    public final void patternFilterAnno() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:729:2: ( ^( ATCHAR IDENT ( number )? ) )
            // EsperEPL2Ast.g:729:4: ^( ATCHAR IDENT ( number )? )
            {
            match(input,ATCHAR,FOLLOW_ATCHAR_in_patternFilterAnno5202); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_patternFilterAnno5204); 
            // EsperEPL2Ast.g:729:20: ( number )?
            int alt262=2;
            int LA262_0 = input.LA(1);

            if ( ((LA262_0>=INT_TYPE && LA262_0<=DOUBLE_TYPE)) ) {
                alt262=1;
            }
            switch (alt262) {
                case 1 :
                    // EsperEPL2Ast.g:729:20: number
                    {
                    pushFollow(FOLLOW_number_in_patternFilterAnno5206);
                    number();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternFilterAnno"


    // $ANTLR start "matchUntilRange"
    // EsperEPL2Ast.g:732:1: matchUntilRange : ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) );
    public final void matchUntilRange() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:733:2: ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) )
            int alt263=4;
            switch ( input.LA(1) ) {
            case MATCH_UNTIL_RANGE_CLOSED:
                {
                alt263=1;
                }
                break;
            case MATCH_UNTIL_RANGE_BOUNDED:
                {
                alt263=2;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFCLOSED:
                {
                alt263=3;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFOPEN:
                {
                alt263=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 263, 0, input);

                throw nvae;
            }

            switch (alt263) {
                case 1 :
                    // EsperEPL2Ast.g:733:4: ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_CLOSED,FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5221); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5223);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5225);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:734:5: ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_BOUNDED,FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5233); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5235);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:735:5: ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFCLOSED,FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5243); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5245);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:736:4: ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFOPEN,FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5252); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5254);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchUntilRange"


    // $ANTLR start "filterParam"
    // EsperEPL2Ast.g:739:1: filterParam : ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) ;
    public final void filterParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:740:2: ( ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:740:4: ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* )
            {
            match(input,EVENT_FILTER_PARAM,FOLLOW_EVENT_FILTER_PARAM_in_filterParam5267); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_filterParam5269);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:740:35: ( valueExpr )*
            loop264:
            do {
                int alt264=2;
                int LA264_0 = input.LA(1);

                if ( ((LA264_0>=IN_SET && LA264_0<=REGEXP)||LA264_0==NOT_EXPR||(LA264_0>=SUM && LA264_0<=AVG)||(LA264_0>=COALESCE && LA264_0<=COUNT)||(LA264_0>=CASE && LA264_0<=CASE2)||(LA264_0>=PREVIOUS && LA264_0<=EXISTS)||(LA264_0>=INSTANCEOF && LA264_0<=CURRENT_TIMESTAMP)||LA264_0==NEWKW||(LA264_0>=EVAL_AND_EXPR && LA264_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA264_0==EVENT_PROP_EXPR||LA264_0==CONCAT||(LA264_0>=LIB_FUNC_CHAIN && LA264_0<=DOT_EXPR)||LA264_0==ARRAY_EXPR||(LA264_0>=NOT_IN_SET && LA264_0<=NOT_REGEXP)||(LA264_0>=IN_RANGE && LA264_0<=SUBSELECT_EXPR)||(LA264_0>=EXISTS_SUBSELECT_EXPR && LA264_0<=NOT_IN_SUBSELECT_EXPR)||LA264_0==SUBSTITUTION||(LA264_0>=FIRST_AGGREG && LA264_0<=WINDOW_AGGREG)||(LA264_0>=INT_TYPE && LA264_0<=NULL_TYPE)||(LA264_0>=STAR && LA264_0<=PLUS)||(LA264_0>=BAND && LA264_0<=BXOR)||(LA264_0>=LT && LA264_0<=GE)||(LA264_0>=MINUS && LA264_0<=MOD)||(LA264_0>=EVAL_IS_GROUP_EXPR && LA264_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt264=1;
                }


                switch (alt264) {
            	case 1 :
            	    // EsperEPL2Ast.g:740:36: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_filterParam5272);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop264;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterParam"


    // $ANTLR start "filterParamComparator"
    // EsperEPL2Ast.g:743:1: filterParamComparator : ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) );
    public final void filterParamComparator() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:744:2: ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) )
            int alt277=12;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt277=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt277=2;
                }
                break;
            case LT:
                {
                alt277=3;
                }
                break;
            case LE:
                {
                alt277=4;
                }
                break;
            case GT:
                {
                alt277=5;
                }
                break;
            case GE:
                {
                alt277=6;
                }
                break;
            case EVENT_FILTER_RANGE:
                {
                alt277=7;
                }
                break;
            case EVENT_FILTER_NOT_RANGE:
                {
                alt277=8;
                }
                break;
            case EVENT_FILTER_IN:
                {
                alt277=9;
                }
                break;
            case EVENT_FILTER_NOT_IN:
                {
                alt277=10;
                }
                break;
            case EVENT_FILTER_BETWEEN:
                {
                alt277=11;
                }
                break;
            case EVENT_FILTER_NOT_BETWEEN:
                {
                alt277=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 277, 0, input);

                throw nvae;
            }

            switch (alt277) {
                case 1 :
                    // EsperEPL2Ast.g:744:4: ^( EQUALS filterAtom )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_filterParamComparator5288); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5290);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:745:4: ^( NOT_EQUAL filterAtom )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_filterParamComparator5297); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5299);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:746:4: ^( LT filterAtom )
                    {
                    match(input,LT,FOLLOW_LT_in_filterParamComparator5306); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5308);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:747:4: ^( LE filterAtom )
                    {
                    match(input,LE,FOLLOW_LE_in_filterParamComparator5315); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5317);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:748:4: ^( GT filterAtom )
                    {
                    match(input,GT,FOLLOW_GT_in_filterParamComparator5324); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5326);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:749:4: ^( GE filterAtom )
                    {
                    match(input,GE,FOLLOW_GE_in_filterParamComparator5333); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5335);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:750:4: ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_RANGE,FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5342); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:750:41: ( constant[false] | filterIdentifier )
                    int alt265=2;
                    int LA265_0 = input.LA(1);

                    if ( ((LA265_0>=INT_TYPE && LA265_0<=NULL_TYPE)) ) {
                        alt265=1;
                    }
                    else if ( (LA265_0==EVENT_FILTER_IDENT) ) {
                        alt265=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 265, 0, input);

                        throw nvae;
                    }
                    switch (alt265) {
                        case 1 :
                            // EsperEPL2Ast.g:750:42: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5351);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:750:58: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5354);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:750:76: ( constant[false] | filterIdentifier )
                    int alt266=2;
                    int LA266_0 = input.LA(1);

                    if ( ((LA266_0>=INT_TYPE && LA266_0<=NULL_TYPE)) ) {
                        alt266=1;
                    }
                    else if ( (LA266_0==EVENT_FILTER_IDENT) ) {
                        alt266=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 266, 0, input);

                        throw nvae;
                    }
                    switch (alt266) {
                        case 1 :
                            // EsperEPL2Ast.g:750:77: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5358);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:750:93: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5361);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:751:4: ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_RANGE,FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5375); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:751:45: ( constant[false] | filterIdentifier )
                    int alt267=2;
                    int LA267_0 = input.LA(1);

                    if ( ((LA267_0>=INT_TYPE && LA267_0<=NULL_TYPE)) ) {
                        alt267=1;
                    }
                    else if ( (LA267_0==EVENT_FILTER_IDENT) ) {
                        alt267=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 267, 0, input);

                        throw nvae;
                    }
                    switch (alt267) {
                        case 1 :
                            // EsperEPL2Ast.g:751:46: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5384);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:751:62: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5387);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:751:80: ( constant[false] | filterIdentifier )
                    int alt268=2;
                    int LA268_0 = input.LA(1);

                    if ( ((LA268_0>=INT_TYPE && LA268_0<=NULL_TYPE)) ) {
                        alt268=1;
                    }
                    else if ( (LA268_0==EVENT_FILTER_IDENT) ) {
                        alt268=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 268, 0, input);

                        throw nvae;
                    }
                    switch (alt268) {
                        case 1 :
                            // EsperEPL2Ast.g:751:81: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5391);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:751:97: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5394);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:752:4: ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_IN,FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5408); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:752:38: ( constant[false] | filterIdentifier )
                    int alt269=2;
                    int LA269_0 = input.LA(1);

                    if ( ((LA269_0>=INT_TYPE && LA269_0<=NULL_TYPE)) ) {
                        alt269=1;
                    }
                    else if ( (LA269_0==EVENT_FILTER_IDENT) ) {
                        alt269=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 269, 0, input);

                        throw nvae;
                    }
                    switch (alt269) {
                        case 1 :
                            // EsperEPL2Ast.g:752:39: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5417);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:752:55: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5420);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:752:73: ( constant[false] | filterIdentifier )*
                    loop270:
                    do {
                        int alt270=3;
                        int LA270_0 = input.LA(1);

                        if ( ((LA270_0>=INT_TYPE && LA270_0<=NULL_TYPE)) ) {
                            alt270=1;
                        }
                        else if ( (LA270_0==EVENT_FILTER_IDENT) ) {
                            alt270=2;
                        }


                        switch (alt270) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:752:74: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5424);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:752:90: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5427);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop270;
                        }
                    } while (true);

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:753:4: ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_IN,FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5442); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LPAREN||input.LA(1)==LBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:753:42: ( constant[false] | filterIdentifier )
                    int alt271=2;
                    int LA271_0 = input.LA(1);

                    if ( ((LA271_0>=INT_TYPE && LA271_0<=NULL_TYPE)) ) {
                        alt271=1;
                    }
                    else if ( (LA271_0==EVENT_FILTER_IDENT) ) {
                        alt271=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 271, 0, input);

                        throw nvae;
                    }
                    switch (alt271) {
                        case 1 :
                            // EsperEPL2Ast.g:753:43: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5451);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:753:59: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5454);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:753:77: ( constant[false] | filterIdentifier )*
                    loop272:
                    do {
                        int alt272=3;
                        int LA272_0 = input.LA(1);

                        if ( ((LA272_0>=INT_TYPE && LA272_0<=NULL_TYPE)) ) {
                            alt272=1;
                        }
                        else if ( (LA272_0==EVENT_FILTER_IDENT) ) {
                            alt272=2;
                        }


                        switch (alt272) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:753:78: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5458);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:753:94: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5461);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop272;
                        }
                    } while (true);

                    if ( input.LA(1)==RPAREN||input.LA(1)==RBRACK ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:754:4: ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_BETWEEN,FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator5476); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:754:27: ( constant[false] | filterIdentifier )
                    int alt273=2;
                    int LA273_0 = input.LA(1);

                    if ( ((LA273_0>=INT_TYPE && LA273_0<=NULL_TYPE)) ) {
                        alt273=1;
                    }
                    else if ( (LA273_0==EVENT_FILTER_IDENT) ) {
                        alt273=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 273, 0, input);

                        throw nvae;
                    }
                    switch (alt273) {
                        case 1 :
                            // EsperEPL2Ast.g:754:28: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5479);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:754:44: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5482);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:754:62: ( constant[false] | filterIdentifier )
                    int alt274=2;
                    int LA274_0 = input.LA(1);

                    if ( ((LA274_0>=INT_TYPE && LA274_0<=NULL_TYPE)) ) {
                        alt274=1;
                    }
                    else if ( (LA274_0==EVENT_FILTER_IDENT) ) {
                        alt274=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 274, 0, input);

                        throw nvae;
                    }
                    switch (alt274) {
                        case 1 :
                            // EsperEPL2Ast.g:754:63: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5486);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:754:79: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5489);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:755:4: ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_NOT_BETWEEN,FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator5497); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:755:31: ( constant[false] | filterIdentifier )
                    int alt275=2;
                    int LA275_0 = input.LA(1);

                    if ( ((LA275_0>=INT_TYPE && LA275_0<=NULL_TYPE)) ) {
                        alt275=1;
                    }
                    else if ( (LA275_0==EVENT_FILTER_IDENT) ) {
                        alt275=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 275, 0, input);

                        throw nvae;
                    }
                    switch (alt275) {
                        case 1 :
                            // EsperEPL2Ast.g:755:32: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5500);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:755:48: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5503);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:755:66: ( constant[false] | filterIdentifier )
                    int alt276=2;
                    int LA276_0 = input.LA(1);

                    if ( ((LA276_0>=INT_TYPE && LA276_0<=NULL_TYPE)) ) {
                        alt276=1;
                    }
                    else if ( (LA276_0==EVENT_FILTER_IDENT) ) {
                        alt276=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 276, 0, input);

                        throw nvae;
                    }
                    switch (alt276) {
                        case 1 :
                            // EsperEPL2Ast.g:755:67: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5507);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:755:83: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5510);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterParamComparator"


    // $ANTLR start "filterAtom"
    // EsperEPL2Ast.g:758:1: filterAtom : ( constant[false] | filterIdentifier );
    public final void filterAtom() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:759:2: ( constant[false] | filterIdentifier )
            int alt278=2;
            int LA278_0 = input.LA(1);

            if ( ((LA278_0>=INT_TYPE && LA278_0<=NULL_TYPE)) ) {
                alt278=1;
            }
            else if ( (LA278_0==EVENT_FILTER_IDENT) ) {
                alt278=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 278, 0, input);

                throw nvae;
            }
            switch (alt278) {
                case 1 :
                    // EsperEPL2Ast.g:759:4: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_filterAtom5524);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:760:4: filterIdentifier
                    {
                    pushFollow(FOLLOW_filterIdentifier_in_filterAtom5530);
                    filterIdentifier();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterAtom"


    // $ANTLR start "filterIdentifier"
    // EsperEPL2Ast.g:762:1: filterIdentifier : ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) ;
    public final void filterIdentifier() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:763:2: ( ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) )
            // EsperEPL2Ast.g:763:4: ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] )
            {
            match(input,EVENT_FILTER_IDENT,FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier5541); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_filterIdentifier5543); 
            pushFollow(FOLLOW_eventPropertyExpr_in_filterIdentifier5545);
            eventPropertyExpr(true);

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterIdentifier"


    // $ANTLR start "eventPropertyExpr"
    // EsperEPL2Ast.g:766:1: eventPropertyExpr[boolean isLeaveNode] : ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) ;
    public final void eventPropertyExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:767:2: ( ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) )
            // EsperEPL2Ast.g:767:4: ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* )
            {
            p=(CommonTree)match(input,EVENT_PROP_EXPR,FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr5564); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5566);
            eventPropertyAtomic();

            state._fsp--;

            // EsperEPL2Ast.g:767:44: ( eventPropertyAtomic )*
            loop279:
            do {
                int alt279=2;
                int LA279_0 = input.LA(1);

                if ( ((LA279_0>=EVENT_PROP_SIMPLE && LA279_0<=EVENT_PROP_DYNAMIC_MAPPED)) ) {
                    alt279=1;
                }


                switch (alt279) {
            	case 1 :
            	    // EsperEPL2Ast.g:767:45: eventPropertyAtomic
            	    {
            	    pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5569);
            	    eventPropertyAtomic();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop279;
                }
            } while (true);


            match(input, Token.UP, null); 
             if (isLeaveNode) leaveNode(p); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eventPropertyExpr"


    // $ANTLR start "eventPropertyAtomic"
    // EsperEPL2Ast.g:770:1: eventPropertyAtomic : ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) );
    public final void eventPropertyAtomic() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:771:2: ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) )
            int alt280=6;
            switch ( input.LA(1) ) {
            case EVENT_PROP_SIMPLE:
                {
                alt280=1;
                }
                break;
            case EVENT_PROP_INDEXED:
                {
                alt280=2;
                }
                break;
            case EVENT_PROP_MAPPED:
                {
                alt280=3;
                }
                break;
            case EVENT_PROP_DYNAMIC_SIMPLE:
                {
                alt280=4;
                }
                break;
            case EVENT_PROP_DYNAMIC_INDEXED:
                {
                alt280=5;
                }
                break;
            case EVENT_PROP_DYNAMIC_MAPPED:
                {
                alt280=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 280, 0, input);

                throw nvae;
            }

            switch (alt280) {
                case 1 :
                    // EsperEPL2Ast.g:771:4: ^( EVENT_PROP_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_SIMPLE,FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic5588); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5590); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:772:4: ^( EVENT_PROP_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_INDEXED,FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic5597); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5599); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic5601); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:773:4: ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_MAPPED,FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic5608); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5610); 
                    if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:774:4: ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_SIMPLE,FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic5625); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5627); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:775:4: ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_INDEXED,FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic5634); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5636); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic5638); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:776:4: ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_DYNAMIC_MAPPED,FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic5645); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5647); 
                    if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eventPropertyAtomic"


    // $ANTLR start "timePeriod"
    // EsperEPL2Ast.g:779:1: timePeriod : ^(t= TIME_PERIOD timePeriodDef ) ;
    public final void timePeriod() throws RecognitionException {
        CommonTree t=null;

        try {
            // EsperEPL2Ast.g:780:2: ( ^(t= TIME_PERIOD timePeriodDef ) )
            // EsperEPL2Ast.g:780:5: ^(t= TIME_PERIOD timePeriodDef )
            {
            t=(CommonTree)match(input,TIME_PERIOD,FOLLOW_TIME_PERIOD_in_timePeriod5674); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_timePeriodDef_in_timePeriod5676);
            timePeriodDef();

            state._fsp--;

             leaveNode(t); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "timePeriod"


    // $ANTLR start "timePeriodDef"
    // EsperEPL2Ast.g:783:1: timePeriodDef : ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart );
    public final void timePeriodDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:784:2: ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart )
            int alt309=8;
            switch ( input.LA(1) ) {
            case YEAR_PART:
                {
                alt309=1;
                }
                break;
            case MONTH_PART:
                {
                alt309=2;
                }
                break;
            case WEEK_PART:
                {
                alt309=3;
                }
                break;
            case DAY_PART:
                {
                alt309=4;
                }
                break;
            case HOUR_PART:
                {
                alt309=5;
                }
                break;
            case MINUTE_PART:
                {
                alt309=6;
                }
                break;
            case SECOND_PART:
                {
                alt309=7;
                }
                break;
            case MILLISECOND_PART:
                {
                alt309=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 309, 0, input);

                throw nvae;
            }

            switch (alt309) {
                case 1 :
                    // EsperEPL2Ast.g:784:5: yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_yearPart_in_timePeriodDef5692);
                    yearPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:784:14: ( monthPart )?
                    int alt281=2;
                    int LA281_0 = input.LA(1);

                    if ( (LA281_0==MONTH_PART) ) {
                        alt281=1;
                    }
                    switch (alt281) {
                        case 1 :
                            // EsperEPL2Ast.g:784:15: monthPart
                            {
                            pushFollow(FOLLOW_monthPart_in_timePeriodDef5695);
                            monthPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:784:27: ( weekPart )?
                    int alt282=2;
                    int LA282_0 = input.LA(1);

                    if ( (LA282_0==WEEK_PART) ) {
                        alt282=1;
                    }
                    switch (alt282) {
                        case 1 :
                            // EsperEPL2Ast.g:784:28: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef5700);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:784:39: ( dayPart )?
                    int alt283=2;
                    int LA283_0 = input.LA(1);

                    if ( (LA283_0==DAY_PART) ) {
                        alt283=1;
                    }
                    switch (alt283) {
                        case 1 :
                            // EsperEPL2Ast.g:784:40: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5705);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:784:50: ( hourPart )?
                    int alt284=2;
                    int LA284_0 = input.LA(1);

                    if ( (LA284_0==HOUR_PART) ) {
                        alt284=1;
                    }
                    switch (alt284) {
                        case 1 :
                            // EsperEPL2Ast.g:784:51: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5710);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:784:62: ( minutePart )?
                    int alt285=2;
                    int LA285_0 = input.LA(1);

                    if ( (LA285_0==MINUTE_PART) ) {
                        alt285=1;
                    }
                    switch (alt285) {
                        case 1 :
                            // EsperEPL2Ast.g:784:63: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5715);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:784:76: ( secondPart )?
                    int alt286=2;
                    int LA286_0 = input.LA(1);

                    if ( (LA286_0==SECOND_PART) ) {
                        alt286=1;
                    }
                    switch (alt286) {
                        case 1 :
                            // EsperEPL2Ast.g:784:77: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5720);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:784:90: ( millisecondPart )?
                    int alt287=2;
                    int LA287_0 = input.LA(1);

                    if ( (LA287_0==MILLISECOND_PART) ) {
                        alt287=1;
                    }
                    switch (alt287) {
                        case 1 :
                            // EsperEPL2Ast.g:784:91: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5725);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:785:5: monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_monthPart_in_timePeriodDef5733);
                    monthPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:785:15: ( weekPart )?
                    int alt288=2;
                    int LA288_0 = input.LA(1);

                    if ( (LA288_0==WEEK_PART) ) {
                        alt288=1;
                    }
                    switch (alt288) {
                        case 1 :
                            // EsperEPL2Ast.g:785:16: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef5736);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:785:27: ( dayPart )?
                    int alt289=2;
                    int LA289_0 = input.LA(1);

                    if ( (LA289_0==DAY_PART) ) {
                        alt289=1;
                    }
                    switch (alt289) {
                        case 1 :
                            // EsperEPL2Ast.g:785:28: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5741);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:785:38: ( hourPart )?
                    int alt290=2;
                    int LA290_0 = input.LA(1);

                    if ( (LA290_0==HOUR_PART) ) {
                        alt290=1;
                    }
                    switch (alt290) {
                        case 1 :
                            // EsperEPL2Ast.g:785:39: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5746);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:785:50: ( minutePart )?
                    int alt291=2;
                    int LA291_0 = input.LA(1);

                    if ( (LA291_0==MINUTE_PART) ) {
                        alt291=1;
                    }
                    switch (alt291) {
                        case 1 :
                            // EsperEPL2Ast.g:785:51: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5751);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:785:64: ( secondPart )?
                    int alt292=2;
                    int LA292_0 = input.LA(1);

                    if ( (LA292_0==SECOND_PART) ) {
                        alt292=1;
                    }
                    switch (alt292) {
                        case 1 :
                            // EsperEPL2Ast.g:785:65: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5756);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:785:78: ( millisecondPart )?
                    int alt293=2;
                    int LA293_0 = input.LA(1);

                    if ( (LA293_0==MILLISECOND_PART) ) {
                        alt293=1;
                    }
                    switch (alt293) {
                        case 1 :
                            // EsperEPL2Ast.g:785:79: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5761);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:786:5: weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_weekPart_in_timePeriodDef5769);
                    weekPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:786:14: ( dayPart )?
                    int alt294=2;
                    int LA294_0 = input.LA(1);

                    if ( (LA294_0==DAY_PART) ) {
                        alt294=1;
                    }
                    switch (alt294) {
                        case 1 :
                            // EsperEPL2Ast.g:786:15: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5772);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:786:25: ( hourPart )?
                    int alt295=2;
                    int LA295_0 = input.LA(1);

                    if ( (LA295_0==HOUR_PART) ) {
                        alt295=1;
                    }
                    switch (alt295) {
                        case 1 :
                            // EsperEPL2Ast.g:786:26: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5777);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:786:37: ( minutePart )?
                    int alt296=2;
                    int LA296_0 = input.LA(1);

                    if ( (LA296_0==MINUTE_PART) ) {
                        alt296=1;
                    }
                    switch (alt296) {
                        case 1 :
                            // EsperEPL2Ast.g:786:38: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5782);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:786:51: ( secondPart )?
                    int alt297=2;
                    int LA297_0 = input.LA(1);

                    if ( (LA297_0==SECOND_PART) ) {
                        alt297=1;
                    }
                    switch (alt297) {
                        case 1 :
                            // EsperEPL2Ast.g:786:52: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5787);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:786:65: ( millisecondPart )?
                    int alt298=2;
                    int LA298_0 = input.LA(1);

                    if ( (LA298_0==MILLISECOND_PART) ) {
                        alt298=1;
                    }
                    switch (alt298) {
                        case 1 :
                            // EsperEPL2Ast.g:786:66: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5792);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:787:5: dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_dayPart_in_timePeriodDef5800);
                    dayPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:787:13: ( hourPart )?
                    int alt299=2;
                    int LA299_0 = input.LA(1);

                    if ( (LA299_0==HOUR_PART) ) {
                        alt299=1;
                    }
                    switch (alt299) {
                        case 1 :
                            // EsperEPL2Ast.g:787:14: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5803);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:787:25: ( minutePart )?
                    int alt300=2;
                    int LA300_0 = input.LA(1);

                    if ( (LA300_0==MINUTE_PART) ) {
                        alt300=1;
                    }
                    switch (alt300) {
                        case 1 :
                            // EsperEPL2Ast.g:787:26: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5808);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:787:39: ( secondPart )?
                    int alt301=2;
                    int LA301_0 = input.LA(1);

                    if ( (LA301_0==SECOND_PART) ) {
                        alt301=1;
                    }
                    switch (alt301) {
                        case 1 :
                            // EsperEPL2Ast.g:787:40: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5813);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:787:53: ( millisecondPart )?
                    int alt302=2;
                    int LA302_0 = input.LA(1);

                    if ( (LA302_0==MILLISECOND_PART) ) {
                        alt302=1;
                    }
                    switch (alt302) {
                        case 1 :
                            // EsperEPL2Ast.g:787:54: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5818);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:788:4: hourPart ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_hourPart_in_timePeriodDef5825);
                    hourPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:788:13: ( minutePart )?
                    int alt303=2;
                    int LA303_0 = input.LA(1);

                    if ( (LA303_0==MINUTE_PART) ) {
                        alt303=1;
                    }
                    switch (alt303) {
                        case 1 :
                            // EsperEPL2Ast.g:788:14: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5828);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:788:27: ( secondPart )?
                    int alt304=2;
                    int LA304_0 = input.LA(1);

                    if ( (LA304_0==SECOND_PART) ) {
                        alt304=1;
                    }
                    switch (alt304) {
                        case 1 :
                            // EsperEPL2Ast.g:788:28: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5833);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:788:41: ( millisecondPart )?
                    int alt305=2;
                    int LA305_0 = input.LA(1);

                    if ( (LA305_0==MILLISECOND_PART) ) {
                        alt305=1;
                    }
                    switch (alt305) {
                        case 1 :
                            // EsperEPL2Ast.g:788:42: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5838);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:789:4: minutePart ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_minutePart_in_timePeriodDef5845);
                    minutePart();

                    state._fsp--;

                    // EsperEPL2Ast.g:789:15: ( secondPart )?
                    int alt306=2;
                    int LA306_0 = input.LA(1);

                    if ( (LA306_0==SECOND_PART) ) {
                        alt306=1;
                    }
                    switch (alt306) {
                        case 1 :
                            // EsperEPL2Ast.g:789:16: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5848);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:789:29: ( millisecondPart )?
                    int alt307=2;
                    int LA307_0 = input.LA(1);

                    if ( (LA307_0==MILLISECOND_PART) ) {
                        alt307=1;
                    }
                    switch (alt307) {
                        case 1 :
                            // EsperEPL2Ast.g:789:30: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5853);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:790:4: secondPart ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_secondPart_in_timePeriodDef5860);
                    secondPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:790:15: ( millisecondPart )?
                    int alt308=2;
                    int LA308_0 = input.LA(1);

                    if ( (LA308_0==MILLISECOND_PART) ) {
                        alt308=1;
                    }
                    switch (alt308) {
                        case 1 :
                            // EsperEPL2Ast.g:790:16: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5863);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:791:4: millisecondPart
                    {
                    pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5870);
                    millisecondPart();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "timePeriodDef"


    // $ANTLR start "yearPart"
    // EsperEPL2Ast.g:794:1: yearPart : ^( YEAR_PART valueExpr ) ;
    public final void yearPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:795:2: ( ^( YEAR_PART valueExpr ) )
            // EsperEPL2Ast.g:795:4: ^( YEAR_PART valueExpr )
            {
            match(input,YEAR_PART,FOLLOW_YEAR_PART_in_yearPart5884); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_yearPart5886);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "yearPart"


    // $ANTLR start "monthPart"
    // EsperEPL2Ast.g:798:1: monthPart : ^( MONTH_PART valueExpr ) ;
    public final void monthPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:799:2: ( ^( MONTH_PART valueExpr ) )
            // EsperEPL2Ast.g:799:4: ^( MONTH_PART valueExpr )
            {
            match(input,MONTH_PART,FOLLOW_MONTH_PART_in_monthPart5901); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_monthPart5903);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "monthPart"


    // $ANTLR start "weekPart"
    // EsperEPL2Ast.g:802:1: weekPart : ^( WEEK_PART valueExpr ) ;
    public final void weekPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:803:2: ( ^( WEEK_PART valueExpr ) )
            // EsperEPL2Ast.g:803:4: ^( WEEK_PART valueExpr )
            {
            match(input,WEEK_PART,FOLLOW_WEEK_PART_in_weekPart5918); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_weekPart5920);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "weekPart"


    // $ANTLR start "dayPart"
    // EsperEPL2Ast.g:806:1: dayPart : ^( DAY_PART valueExpr ) ;
    public final void dayPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:807:2: ( ^( DAY_PART valueExpr ) )
            // EsperEPL2Ast.g:807:4: ^( DAY_PART valueExpr )
            {
            match(input,DAY_PART,FOLLOW_DAY_PART_in_dayPart5935); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dayPart5937);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "dayPart"


    // $ANTLR start "hourPart"
    // EsperEPL2Ast.g:810:1: hourPart : ^( HOUR_PART valueExpr ) ;
    public final void hourPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:811:2: ( ^( HOUR_PART valueExpr ) )
            // EsperEPL2Ast.g:811:4: ^( HOUR_PART valueExpr )
            {
            match(input,HOUR_PART,FOLLOW_HOUR_PART_in_hourPart5952); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_hourPart5954);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "hourPart"


    // $ANTLR start "minutePart"
    // EsperEPL2Ast.g:814:1: minutePart : ^( MINUTE_PART valueExpr ) ;
    public final void minutePart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:815:2: ( ^( MINUTE_PART valueExpr ) )
            // EsperEPL2Ast.g:815:4: ^( MINUTE_PART valueExpr )
            {
            match(input,MINUTE_PART,FOLLOW_MINUTE_PART_in_minutePart5969); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_minutePart5971);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "minutePart"


    // $ANTLR start "secondPart"
    // EsperEPL2Ast.g:818:1: secondPart : ^( SECOND_PART valueExpr ) ;
    public final void secondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:819:2: ( ^( SECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:819:4: ^( SECOND_PART valueExpr )
            {
            match(input,SECOND_PART,FOLLOW_SECOND_PART_in_secondPart5986); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_secondPart5988);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "secondPart"


    // $ANTLR start "millisecondPart"
    // EsperEPL2Ast.g:822:1: millisecondPart : ^( MILLISECOND_PART valueExpr ) ;
    public final void millisecondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:823:2: ( ^( MILLISECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:823:4: ^( MILLISECOND_PART valueExpr )
            {
            match(input,MILLISECOND_PART,FOLLOW_MILLISECOND_PART_in_millisecondPart6003); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_millisecondPart6005);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "millisecondPart"


    // $ANTLR start "substitution"
    // EsperEPL2Ast.g:826:1: substitution : s= SUBSTITUTION ;
    public final void substitution() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:827:2: (s= SUBSTITUTION )
            // EsperEPL2Ast.g:827:4: s= SUBSTITUTION
            {
            s=(CommonTree)match(input,SUBSTITUTION,FOLLOW_SUBSTITUTION_in_substitution6020); 
             leaveNode(s); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "substitution"


    // $ANTLR start "constant"
    // EsperEPL2Ast.g:830:1: constant[boolean isLeaveNode] : (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE );
    public final void constant(boolean isLeaveNode) throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:831:2: (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE )
            int alt310=7;
            switch ( input.LA(1) ) {
            case INT_TYPE:
                {
                alt310=1;
                }
                break;
            case LONG_TYPE:
                {
                alt310=2;
                }
                break;
            case FLOAT_TYPE:
                {
                alt310=3;
                }
                break;
            case DOUBLE_TYPE:
                {
                alt310=4;
                }
                break;
            case STRING_TYPE:
                {
                alt310=5;
                }
                break;
            case BOOL_TYPE:
                {
                alt310=6;
                }
                break;
            case NULL_TYPE:
                {
                alt310=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 310, 0, input);

                throw nvae;
            }

            switch (alt310) {
                case 1 :
                    // EsperEPL2Ast.g:831:4: c= INT_TYPE
                    {
                    c=(CommonTree)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_constant6036); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:832:4: c= LONG_TYPE
                    {
                    c=(CommonTree)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_constant6045); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:833:4: c= FLOAT_TYPE
                    {
                    c=(CommonTree)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_constant6054); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:834:4: c= DOUBLE_TYPE
                    {
                    c=(CommonTree)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_constant6063); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:835:11: c= STRING_TYPE
                    {
                    c=(CommonTree)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_constant6079); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:836:11: c= BOOL_TYPE
                    {
                    c=(CommonTree)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_constant6095); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:837:8: c= NULL_TYPE
                    {
                    c=(CommonTree)match(input,NULL_TYPE,FOLLOW_NULL_TYPE_in_constant6108); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant"


    // $ANTLR start "number"
    // EsperEPL2Ast.g:840:1: number : ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE );
    public final void number() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:841:2: ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE )
            // EsperEPL2Ast.g:
            {
            if ( (input.LA(1)>=INT_TYPE && input.LA(1)<=DOUBLE_TYPE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_ANNOTATION_in_annotation92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_annotation94 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000000FE000001CL});
    public static final BitSet FOLLOW_elementValuePair_in_annotation96 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000000FE000001CL});
    public static final BitSet FOLLOW_elementValue_in_annotation99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_VALUE_in_elementValuePair117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_elementValuePair119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000000FE000000CL});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_in_elementValue148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_ARRAY_in_elementValue156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elementValue_in_elementValue158 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000000FE000000CL});
    public static final BitSet FOLLOW_constant_in_elementValue169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_elementValue179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDecl204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl206 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_expressionDecl208 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_expressionDecl210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionLambdaDecl227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionLambdaDecl230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_exprCol_in_expressionLambdaDecl234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EPL_EXPR_in_startEPLExpressionRule251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_startEPLExpressionRule254 = new BitSet(new long[]{0x0000000000000000L,0x4800000000000000L,0x0000040000000000L,0x0100580000000010L,0x0000000000400A04L});
    public static final BitSet FOLLOW_expressionDecl_in_startEPLExpressionRule259 = new BitSet(new long[]{0x0000000000000000L,0x4800000000000000L,0x0000040000000000L,0x0100580000000010L,0x0000000000400A04L});
    public static final BitSet FOLLOW_eplExpressionRule_in_startEPLExpressionRule263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_contextExpr_in_eplExpressionRule280 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000040000000000L,0x0100580000000010L,0x0000000000000A00L});
    public static final BitSet FOLLOW_selectExpr_in_eplExpressionRule284 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createWindowExpr_in_eplExpressionRule288 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createIndexExpr_in_eplExpressionRule292 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createVariableExpr_in_eplExpressionRule296 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createSchemaExpr_in_eplExpressionRule300 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_onExpr_in_eplExpressionRule304 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_updateExpr_in_eplExpressionRule308 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_forExpr_in_eplExpressionRule311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createContextExpr_in_eplExpressionRule318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTEXT_in_contextExpr333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_contextExpr335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_in_onExpr354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onStreamExpr_in_onExpr356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x008F000000000000L});
    public static final BitSet FOLLOW_onDeleteExpr_in_onExpr361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onUpdateExpr_in_onExpr365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSelectExpr_in_onExpr369 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_onSelectInsertExpr_in_onExpr372 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_onSelectInsertOutput_in_onExpr375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSetExpr_in_onExpr382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onMergeExpr_in_onExpr386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_STREAM_in_onStreamExpr408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_onStreamExpr411 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_onStreamExpr416 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_onStreamExpr419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_MERGE_EXPR_in_onMergeExpr437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000018000L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000018000L});
    public static final BitSet FOLLOW_mergeItem_in_onMergeExpr444 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0002000000018000L});
    public static final BitSet FOLLOW_whereClause_in_onMergeExpr447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeMatched_in_mergeItem463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mergeUnmatched_in_mergeItem467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_MAT_in_mergeMatched482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeMatchedItem_in_mergeMatched484 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00E00E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_mergeMatched487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_UPD_in_mergeMatchedItem505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_mergeMatchedItem507 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_DEL_in_mergeMatchedItem523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_INT_TYPE_in_mergeMatchedItem529 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeMatchedItem537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_UNM_in_mergeUnmatched551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeUnmatched553 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00E00E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_mergeUnmatched556 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_INS_in_mergeInsert575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectionList_in_mergeInsert577 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000041000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_mergeInsert579 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_mergeInsert582 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_mergeInsert585 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_EXPR_in_updateExpr605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_updateExpr607 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0002000000000400L});
    public static final BitSet FOLLOW_IDENT_in_updateExpr609 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_onSetAssignment_in_updateExpr612 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_updateExpr615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onDeleteExpr634 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_onDeleteExpr637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_EXPR_in_onSelectExpr657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectExpr659 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DISTINCT_in_onSelectExpr662 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectExpr665 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x00180000C0000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_onExprFrom_in_onSelectExpr667 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x00180000C0000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectExpr670 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0018000080000000L});
    public static final BitSet FOLLOW_groupByClause_in_onSelectExpr674 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0010000080000000L});
    public static final BitSet FOLLOW_havingClause_in_onSelectExpr677 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_onSelectExpr680 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_onSelectExpr683 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectInsertExpr705 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectInsertExpr707 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectInsertExpr709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_onSelectInsertOutput728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_in_onSetExpr746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr748 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr751 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_onSetExpr755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr770 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onUpdateExpr772 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_onSetAssignment_in_onUpdateExpr774 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_onUpdateExpr777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_onSetAssignment794 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_onSetAssignment797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_FROM_in_onExprFrom811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom813 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createWindowExpr836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_createWindowExpr839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_RETAINUNION_in_createWindowExpr843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_createWindowExpr846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_createSelectionList_in_createWindowExpr860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createWindowExpr863 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createColTypeList_in_createWindowExpr892 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createWindowExprInsert_in_createWindowExpr903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_indexColList_in_createIndexExpr929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexColList944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexCol_in_indexColList946 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexCol961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_indexCol963 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_indexCol965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_createWindowExprInsert979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createWindowExprInsert981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1000 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1003 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1024 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1027 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1042 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1046 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_createColTypeListElement1048 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createSelectionListElement1093 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_createSelectionListElement1119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createVariableExpr1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1162 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_createVariableExpr1165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextExpr1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextExpr1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextExpr1189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_createContextDetail1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_createContextDetail1209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_PART_in_createContextDetail1216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextPartitionItem_in_createContextDetail1218 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_CREATE_CTX_CAT_in_createContextDetail1226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCategoryItem_in_createContextDetail1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextDetail1231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_INIT_in_createContextDetail1239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextFilter_in_createContextDetail1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_createContextDetail1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_timePeriod_in_createContextDetail1249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_createContextFilter1263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextFilter1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextFilter1268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_createContextPartitionItem1283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextPartitionItem1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createContextPartitionItem1288 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createContextCategoryItem1307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextCategoryItem1309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1328 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_variantList_in_createSchemaExpr1331 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_createColTypeList_in_createSchemaExpr1333 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_VAR_in_createSchemaExpr1339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createSchemaQual_in_createSchemaExpr1346 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaQual1366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_createSchemaQual1368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIANT_LIST_in_variantList1384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_variantList1386 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_insertIntoExpr_in_selectExpr1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_selectClause_in_selectExpr1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fromClause_in_selectExpr1415 = new BitSet(new long[]{0x0000000000000002L,0x0001200000000000L,0xE0180000C0000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_matchRecogClause_in_selectExpr1420 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE0180000C0000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_whereClause_in_selectExpr1427 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE018000080000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_groupByClause_in_selectExpr1435 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE010000080000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_havingClause_in_selectExpr1442 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE010000000000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_outputLimitExpr_in_selectExpr1449 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_selectExpr1456 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_selectExpr1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_insertIntoExpr1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_insertIntoExpr1491 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_insertIntoExpr1494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRCOL_in_exprCol1513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_exprCol1515 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_exprCol1518 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_SELECTION_EXPR_in_selectClause1536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_selectClause1538 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause1551 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_selectClause1554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause1568 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause1571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0007A00000000000L});
    public static final BitSet FOLLOW_outerJoin_in_fromClause1574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0007A00000000000L});
    public static final BitSet FOLLOW_FOR_in_forExpr1594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_forExpr1596 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_forExpr1598 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause1617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPartitionBy_in_matchRecogClause1619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_matchRecogMeasures_in_matchRecogClause1626 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_ALL_in_matchRecogClause1632 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause1638 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_matchRecogPattern_in_matchRecogClause1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesInterval_in_matchRecogClause1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_matchRecogDefine_in_matchRecogClause1656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy1674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogPartitionBy1676 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip1693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1699 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_set_in_matchRecogMatchesAfterSkip1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval1722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesInterval1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_timePeriod_in_matchRecogMatchesInterval1726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures1742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures1744 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement1761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogMeasureListElement1763 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMeasureListElement1765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern1785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern1787 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration1810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1814 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat1832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat1834 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000048000000000L});
    public static final BitSet FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested1869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested1871 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xD000000000000000L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternNested1873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom1902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogPatternAtom1904 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xD000000000000000L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternAtom1908 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_QUESTION_in_matchRecogPatternAtom1920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine1942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogDefineItem_in_matchRecogDefine1944 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem1961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogDefineItem1963 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogDefineItem1965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList1982 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList1985 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_selectionListElement2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_selectionListElement2013 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECTION_STREAM_in_selectionListElement2030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2032 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoinIdent2068 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2073 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2080 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoinIdent2095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2100 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2107 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoinIdent2122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2127 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2134 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_INNERJOIN_EXPR_in_outerJoinIdent2149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2154 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2161 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_streamExpression2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_streamExpression2185 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_streamExpression2190 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_databaseJoinExpression_in_streamExpression2194 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_methodJoinExpression_in_streamExpression2198 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_streamExpression2202 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_streamExpression2207 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_UNIDIRECTIONAL_in_streamExpression2212 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_streamExpression2216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventFilterExpr2243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_eventFilterExpr2246 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000800L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_propertyExpression_in_eventFilterExpr2248 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_eventFilterExpr2252 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertyExpressionAtom_in_propertyExpression2274 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x004000000000E000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_propertyExpressionAtom2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertySelectionListElement2339 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2358 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternInclusionExpression2384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_databaseJoinExpression2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2405 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_methodJoinExpression2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_methodJoinExpression2438 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_methodJoinExpression2441 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_VIEW_EXPR_in_viewExpr2475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2479 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_viewExpr2482 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_whereClause2504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_whereClause2506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_EXPR_in_groupByClause2524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause2526 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause2529 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_ORDER_BY_EXPR_in_orderByClause2547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause2549 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause2552 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement2572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_orderByElement2574 = new BitSet(new long[]{0x0600000000000008L});
    public static final BitSet FOLLOW_set_in_orderByElement2576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_EXPR_in_havingClause2599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_havingClause2601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr2619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00020001E0000000L});
    public static final BitSet FOLLOW_number_in_outputLimitExpr2633 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_outputLimitExpr2635 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2638 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitExpr2641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr2658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitExpr2671 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2673 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitExpr2676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr2692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_outputLimitExpr2705 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2707 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitExpr2710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr2726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2728 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitExpr2739 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0080000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr2741 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2744 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitExpr2747 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr2763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2765 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2776 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitExpr2779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr2792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2794 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitExpr2796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_in_outputLimitAfter2812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitAfter2814 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_number_in_outputLimitAfter2817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause2833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_rowLimitClause2836 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x00820001E0000000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause2838 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x00820001E0000000L});
    public static final BitSet FOLLOW_number_in_rowLimitClause2842 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause2844 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_rowLimitClause2848 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L});
    public static final BitSet FOLLOW_OFFSET_in_rowLimitClause2851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet2869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2871 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2873 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2875 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2877 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2879 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet2881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_relationalExpr2898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr2900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_relationalExpr2913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr2915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_relationalExpr2928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr2930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_relationalExpr2942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr2944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue2966 = new BitSet(new long[]{0x0003800037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExprValue2991 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023F83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3000 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_relationalExprValue3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3033 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3035 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3038 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3054 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3056 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3059 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3075 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3091 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3107 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3123 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXPR_in_evalExprChoice3193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpr_in_evalExprChoice3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3217 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_set_in_equalsSubquery3219 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023F83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3228 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_equalsSubquery3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpr3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_substitution_in_valueExpr3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticExpr_in_valueExpr3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_valueExpr3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalExprChoice_in_valueExpr3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinFunc_in_valueExpr3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFuncChain_in_valueExpr3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpr_in_valueExpr3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inExpr_in_valueExpr3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenExpr_in_valueExpr3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeExpr_in_valueExpr3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regExpExpr_in_valueExpr3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpr_in_valueExpr3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectInExpr_in_valueExpr3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectRowExpr_in_valueExpr3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectExistsExpr_in_valueExpr3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpr_in_valueExpr3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_valueExpr3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_valueExprWithTime3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LW_in_valueExprWithTime3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3386 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_valueExprWithTime3388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rangeOperator_in_valueExprWithTime3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_valueExprWithTime3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lastOperator_in_valueExprWithTime3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekDayOperator_in_valueExprWithTime3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericParameterList_in_valueExprWithTime3429 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timePeriod_in_valueExprWithTime3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_numericParameterList3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeOperator_in_numericParameterList3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_numericParameterList3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator3489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_rangeOperator3492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator3495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator3498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_rangeOperator3502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator3505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator3508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator3529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_frequencyOperator3532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_frequencyOperator3535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_frequencyOperator3538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_OPERATOR_in_lastOperator3557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_lastOperator3560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_lastOperator3563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_lastOperator3566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator3585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_weekDayOperator3588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_weekDayOperator3591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_weekDayOperator3594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr3615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectGroupExpr3617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr3636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectRowExpr3638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr3657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectExistsExpr3659 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr3678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr3694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr3717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectInQueryExpr3719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTINCT_in_subQueryExpr3735 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_subQueryExpr3738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_subSelectFilterExpr_in_subQueryExpr3740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_subQueryExpr3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_subSelectFilterExpr3761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_subSelectFilterExpr3763 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_subSelectFilterExpr3767 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_subSelectFilterExpr3772 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_RETAINUNION_in_subSelectFilterExpr3776 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr3779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_in_caseExpr3799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr3802 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_CASE2_in_caseExpr3815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr3818 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_IN_SET_in_inExpr3838 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr3842 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3848 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7820000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3851 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7820000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_set_in_inExpr3855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SET_in_inExpr3870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr3874 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3880 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7820000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3883 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7820000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_set_in_inExpr3887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_RANGE_in_inExpr3902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr3906 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3912 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0820000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr3916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_RANGE_in_inExpr3931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr3935 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3941 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0820000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr3945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenExpr3968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr3970 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr3972 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr3974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenExpr3985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr3987 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr3989 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr3992 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_LIKE_in_likeExpr4012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4014 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4016 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeExpr4032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4034 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4036 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4039 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEXP_in_regExpExpr4058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4060 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4062 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_REGEXP_in_regExpExpr4073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4075 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_builtinFunc4096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4099 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4103 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_builtinFunc4117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4120 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4124 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_builtinFunc4138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4142 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4146 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIAN_in_builtinFunc4162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4165 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4169 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STDDEV_in_builtinFunc4183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4186 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4190 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVEDEV_in_builtinFunc4204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4207 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4211 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_AGGREG_in_builtinFunc4225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4228 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00001E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4232 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIRST_AGGREG_in_builtinFunc4247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4250 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00001E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4254 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_AGGREG_in_builtinFunc4269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4272 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtinFunc4289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4291 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4293 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4296 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_PREVIOUS_in_builtinFunc4311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4313 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSTAIL_in_builtinFunc4328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4330 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSCOUNT_in_builtinFunc4345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSWINDOW_in_builtinFunc4359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRIOR_in_builtinFunc4373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_INT_in_builtinFunc4377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_builtinFunc4392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4396 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4399 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TYPEOF_in_builtinFunc4413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_builtinFunc4427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_builtinFunc4443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr4474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_aggregationFilterExpr4476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_AGG_in_accessValueExpr4490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessValueExprChoice_in_accessValueExpr4492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice4514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice4516 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice4518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_accessValueExprChoice4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_EXPR_in_arrayExpr4540 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arrayExpr4543 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_PLUS_in_arithmeticExpr4564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4566 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arithmeticExpr4580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4582 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_arithmeticExpr4596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4598 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_arithmeticExpr4611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4613 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_arithmeticExpr4627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4629 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_arithmeticExpr4642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4644 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4646 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_arithmeticExpr4657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4659 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_arithmeticExpr4672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4674 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_arithmeticExpr4688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4690 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4692 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4695 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_DOT_EXPR_in_dotExpr4715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dotExpr4717 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_dotExpr4719 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWKW_in_newExpr4737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_newAssign_in_newExpr4739 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_NEW_ITEM_in_newAssign4755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_newAssign4757 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_newAssign4760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain4778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libFuncChain4780 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_libOrPropFunction_in_libFuncChain4782 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LIB_FUNCTION_in_libFunctionWithClass4802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_libFunctionWithClass4805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_libFunctionWithClass4809 = new BitSet(new long[]{0x0020400037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7050000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_DISTINCT_in_libFunctionWithClass4812 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7050000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_libFunctionArgItem_in_libFunctionWithClass4816 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7050000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_LPAREN_in_libFunctionWithClass4819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_libFunctionArgItem4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExprWithTime_in_libFunctionArgItem4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_libOrPropFunction4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libOrPropFunction4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_startPatternExpressionRule4877 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_startPatternExpressionRule4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicExpr_in_exprChoice4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternOp_in_exprChoice4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_EXPR_in_exprChoice4910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice4912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice4926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distinctExpressions_in_exprChoice4928 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice4930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_NOT_EXPR_in_exprChoice4944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice4946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_EXPR_in_exprChoice4960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice4962 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7002000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice4965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice4967 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_exprChoice4969 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_exprChoice4974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice4988 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchUntilRange_in_exprChoice4990 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice4993 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice4995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_distinctExpressions5018 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5041 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5044 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_OR_EXPR_in_patternOp5060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5062 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5064 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5067 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_AND_EXPR_in_patternOp5083 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5085 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5087 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5090 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_followedByItem5113 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_followedByItem5116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternFilterExpr_in_atomicExpr5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSERVER_EXPR_in_atomicExpr5142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5146 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExprWithTime_in_atomicExpr5148 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x7000000FE00000E2L,0x00C0000000007798L});
    public static final BitSet FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterExpr5170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_patternFilterExpr5173 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000800L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000087798L});
    public static final BitSet FOLLOW_propertyExpression_in_patternFilterExpr5175 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000087798L});
    public static final BitSet FOLLOW_patternFilterAnno_in_patternFilterExpr5178 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_patternFilterExpr5182 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_ATCHAR_in_patternFilterAnno5202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterAnno5204 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_number_in_patternFilterAnno5206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5223 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_PARAM_in_filterParam5267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5269 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5272 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x7000000FE00000E0L,0x00C0000000007798L});
    public static final BitSet FOLLOW_EQUALS_in_filterParamComparator5288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_filterParamComparator5297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_filterParamComparator5306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_filterParamComparator5315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_filterParamComparator5324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_filterParamComparator5333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0820000000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0820000000000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0820000000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0820000000000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0820000FE0000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5465 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator5476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator5497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000FE0000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_filterAtom5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterAtom5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier5541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_filterIdentifier5543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_filterIdentifier5545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr5564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5566 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5569 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic5588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic5597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic5601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic5608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic5612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic5625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic5634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic5638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic5645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic5649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_PERIOD_in_timePeriod5674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriodDef_in_timePeriod5676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_yearPart_in_timePeriodDef5692 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef5695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5705 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef5733 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5746 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5751 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5756 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5782 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5828 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5848 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_PART_in_yearPart5884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_yearPart5886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_PART_in_monthPart5901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_monthPart5903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEK_PART_in_weekPart5918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_weekPart5920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_PART_in_dayPart5935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dayPart5937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOUR_PART_in_hourPart5952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_hourPart5954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTE_PART_in_minutePart5969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_minutePart5971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_PART_in_secondPart5986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_secondPart5988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MILLISECOND_PART_in_millisecondPart6003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_millisecondPart6005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTITUTION_in_substitution6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_constant6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_constant6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_constant6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_constant6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_constant6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_constant6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_TYPE_in_constant6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_number0 = new BitSet(new long[]{0x0000000000000002L});

}