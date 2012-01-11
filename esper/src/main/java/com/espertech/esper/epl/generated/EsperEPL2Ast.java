// $ANTLR 3.2 Sep 23, 2009 12:02:23 EsperEPL2Ast.g 2012-01-10 20:19:49

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CREATE", "WINDOW", "IN_SET", "BETWEEN", "LIKE", "REGEXP", "ESCAPE", "OR_EXPR", "AND_EXPR", "NOT_EXPR", "EVERY_EXPR", "EVERY_DISTINCT_EXPR", "WHERE", "AS", "SUM", "AVG", "MAX", "MIN", "COALESCE", "MEDIAN", "STDDEV", "AVEDEV", "COUNT", "SELECT", "CASE", "CASE2", "ELSE", "WHEN", "THEN", "END", "FROM", "OUTER", "INNER", "JOIN", "LEFT", "RIGHT", "FULL", "ON", "IS", "BY", "GROUP", "HAVING", "DISTINCT", "ALL", "ANY", "SOME", "OUTPUT", "EVENTS", "FIRST", "LAST", "INSERT", "INTO", "ORDER", "ASC", "DESC", "RSTREAM", "ISTREAM", "IRSTREAM", "SCHEMA", "UNIDIRECTIONAL", "RETAINUNION", "RETAININTERSECTION", "PATTERN", "SQL", "METADATASQL", "PREVIOUS", "PREVIOUSTAIL", "PREVIOUSCOUNT", "PREVIOUSWINDOW", "PRIOR", "EXISTS", "WEEKDAY", "LW", "INSTANCEOF", "TYPEOF", "CAST", "CURRENT_TIMESTAMP", "DELETE", "SNAPSHOT", "SET", "VARIABLE", "UNTIL", "AT", "INDEX", "TIMEPERIOD_YEAR", "TIMEPERIOD_YEARS", "TIMEPERIOD_MONTH", "TIMEPERIOD_MONTHS", "TIMEPERIOD_WEEK", "TIMEPERIOD_WEEKS", "TIMEPERIOD_DAY", "TIMEPERIOD_DAYS", "TIMEPERIOD_HOUR", "TIMEPERIOD_HOURS", "TIMEPERIOD_MINUTE", "TIMEPERIOD_MINUTES", "TIMEPERIOD_SEC", "TIMEPERIOD_SECOND", "TIMEPERIOD_SECONDS", "TIMEPERIOD_MILLISEC", "TIMEPERIOD_MILLISECOND", "TIMEPERIOD_MILLISECONDS", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "VALUE_NULL", "ROW_LIMIT_EXPR", "OFFSET", "UPDATE", "MATCH_RECOGNIZE", "MEASURES", "DEFINE", "PARTITION", "MATCHES", "AFTER", "FOR", "WHILE", "USING", "MERGE", "MATCHED", "EXPRESSIONDECL", "NEWKW", "START", "CONTEXT", "INITIATED", "TERMINATED", "NUMERIC_PARAM_RANGE", "NUMERIC_PARAM_LIST", "NUMERIC_PARAM_FREQUENCY", "OBJECT_PARAM_ORDERED_EXPR", "FOLLOWED_BY_EXPR", "FOLLOWED_BY_ITEM", "PATTERN_FILTER_EXPR", "PATTERN_NOT_EXPR", "PATTERN_EVERY_DISTINCT_EXPR", "EVENT_FILTER_EXPR", "EVENT_FILTER_PROPERTY_EXPR", "EVENT_FILTER_PROPERTY_EXPR_ATOM", "PROPERTY_SELECTION_ELEMENT_EXPR", "PROPERTY_SELECTION_STREAM", "PROPERTY_WILDCARD_SELECT", "EVENT_FILTER_IDENT", "EVENT_FILTER_PARAM", "EVENT_FILTER_RANGE", "EVENT_FILTER_NOT_RANGE", "EVENT_FILTER_IN", "EVENT_FILTER_NOT_IN", "EVENT_FILTER_BETWEEN", "EVENT_FILTER_NOT_BETWEEN", "CLASS_IDENT", "GUARD_EXPR", "OBSERVER_EXPR", "VIEW_EXPR", "PATTERN_INCL_EXPR", "DATABASE_JOIN_EXPR", "WHERE_EXPR", "HAVING_EXPR", "EVAL_BITWISE_EXPR", "EVAL_AND_EXPR", "EVAL_OR_EXPR", "EVAL_EQUALS_EXPR", "EVAL_NOTEQUALS_EXPR", "EVAL_IS_EXPR", "EVAL_ISNOT_EXPR", "EVAL_EQUALS_GROUP_EXPR", "EVAL_NOTEQUALS_GROUP_EXPR", "EVAL_IDENT", "SELECTION_EXPR", "SELECTION_ELEMENT_EXPR", "SELECTION_STREAM", "STREAM_EXPR", "OUTERJOIN_EXPR", "INNERJOIN_EXPR", "LEFT_OUTERJOIN_EXPR", "RIGHT_OUTERJOIN_EXPR", "FULL_OUTERJOIN_EXPR", "GROUP_BY_EXPR", "ORDER_BY_EXPR", "ORDER_ELEMENT_EXPR", "EVENT_PROP_EXPR", "EVENT_PROP_SIMPLE", "EVENT_PROP_MAPPED", "EVENT_PROP_INDEXED", "EVENT_PROP_DYNAMIC_SIMPLE", "EVENT_PROP_DYNAMIC_INDEXED", "EVENT_PROP_DYNAMIC_MAPPED", "EVENT_LIMIT_EXPR", "TIMEPERIOD_LIMIT_EXPR", "AFTER_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR_PARAM", "WHEN_LIMIT_EXPR", "TERM_LIMIT_EXPR", "INSERTINTO_EXPR", "EXPRCOL", "INDEXCOL", "CONCAT", "LIB_FUNCTION", "LIB_FUNC_CHAIN", "DOT_EXPR", "UNARY_MINUS", "TIME_PERIOD", "ARRAY_EXPR", "YEAR_PART", "MONTH_PART", "WEEK_PART", "DAY_PART", "HOUR_PART", "MINUTE_PART", "SECOND_PART", "MILLISECOND_PART", "NOT_IN_SET", "NOT_BETWEEN", "NOT_LIKE", "NOT_REGEXP", "DBSELECT_EXPR", "DBFROM_CLAUSE", "DBWHERE_CLAUSE", "WILDCARD_SELECT", "INSERTINTO_STREAM_NAME", "IN_RANGE", "NOT_IN_RANGE", "SUBSELECT_EXPR", "SUBSELECT_GROUP_EXPR", "EXISTS_SUBSELECT_EXPR", "IN_SUBSELECT_EXPR", "NOT_IN_SUBSELECT_EXPR", "IN_SUBSELECT_QUERY_EXPR", "LAST_OPERATOR", "WEEKDAY_OPERATOR", "SUBSTITUTION", "CAST_EXPR", "CREATE_INDEX_EXPR", "CREATE_WINDOW_EXPR", "CREATE_WINDOW_SELECT_EXPR", "ON_EXPR", "ON_STREAM", "ON_DELETE_EXPR", "ON_SELECT_EXPR", "ON_UPDATE_EXPR", "ON_MERGE_EXPR", "ON_SELECT_INSERT_EXPR", "ON_SELECT_INSERT_OUTPUT", "ON_EXPR_FROM", "ON_SET_EXPR", "CREATE_VARIABLE_EXPR", "METHOD_JOIN_EXPR", "MATCH_UNTIL_EXPR", "MATCH_UNTIL_RANGE_HALFOPEN", "MATCH_UNTIL_RANGE_HALFCLOSED", "MATCH_UNTIL_RANGE_CLOSED", "MATCH_UNTIL_RANGE_BOUNDED", "CREATE_COL_TYPE_LIST", "CREATE_COL_TYPE", "NUMBERSETSTAR", "ANNOTATION", "ANNOTATION_ARRAY", "ANNOTATION_VALUE", "FIRST_AGGREG", "LAST_AGGREG", "WINDOW_AGGREG", "ACCESS_AGG", "UPDATE_EXPR", "ON_SET_EXPR_ITEM", "CREATE_SCHEMA_EXPR", "CREATE_SCHEMA_EXPR_QUAL", "CREATE_SCHEMA_EXPR_VAR", "VARIANT_LIST", "MERGE_UNM", "MERGE_MAT", "MERGE_UPD", "MERGE_INS", "MERGE_DEL", "NEW_ITEM", "AGG_FILTER_EXPR", "CREATE_CTX", "CREATE_CTX_FIXED", "CREATE_CTX_PART", "CREATE_CTX_COAL", "CREATE_CTX_CAT", "CREATE_CTX_INIT", "CREATE_CTX_CATITEM", "CREATE_CTX_NESTED", "PARTITIONITEM", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "BOOL_TYPE", "NULL_TYPE", "NUM_DOUBLE", "EPL_EXPR", "MATCHREC_PATTERN", "MATCHREC_PATTERN_ATOM", "MATCHREC_PATTERN_CONCAT", "MATCHREC_PATTERN_ALTER", "MATCHREC_PATTERN_NESTED", "MATCHREC_AFTER_SKIP", "MATCHREC_INTERVAL", "MATCHREC_DEFINE", "MATCHREC_DEFINE_ITEM", "MATCHREC_MEASURES", "MATCHREC_MEASURE_ITEM", "LBRACK", "RBRACK", "IDENT", "LPAREN", "RPAREN", "COLON", "LCURLY", "RCURLY", "GOES", "COMMA", "EQUALS", "DOT", "STAR", "BOR", "PLUS", "QUESTION", "STRING_LITERAL", "QUOTED_STRING_LITERAL", "BAND", "BXOR", "SQL_NE", "NOT_EQUAL", "LT", "GT", "LE", "GE", "LOR", "MINUS", "DIV", "MOD", "NUM_INT", "FOLLOWED_BY", "FOLLOWMAX_BEGIN", "FOLLOWMAX_END", "ATCHAR", "ESCAPECHAR", "TICKED_STRING_LITERAL", "NUM_LONG", "NUM_FLOAT", "EQUAL", "LNOT", "BNOT", "DIV_ASSIGN", "PLUS_ASSIGN", "INC", "MINUS_ASSIGN", "DEC", "STAR_ASSIGN", "MOD_ASSIGN", "SR", "SR_ASSIGN", "BSR", "BSR_ASSIGN", "SL", "SL_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LAND", "SEMI", "WS", "SL_COMMENT", "ML_COMMENT", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "EXPONENT", "FLOAT_SUFFIX", "EVAL_IS_GROUP_EXPR", "EVAL_ISNOT_GROUP_EXPR"
    };
    public static final int CRONTAB_LIMIT_EXPR=192;
    public static final int FLOAT_SUFFIX=375;
    public static final int STAR=319;
    public static final int DOT_EXPR=202;
    public static final int NUMERIC_PARAM_LIST=130;
    public static final int ISTREAM=60;
    public static final int MOD=336;
    public static final int OUTERJOIN_EXPR=174;
    public static final int LIB_FUNC_CHAIN=201;
    public static final int EVAL_ISNOT_GROUP_EXPR=377;
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
    public static final int EVAL_IS_GROUP_EXPR=376;
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
    // EsperEPL2Ast.g:75:1: expressionDecl : ^(e= EXPRESSIONDECL IDENT expressionDef ( exprCol )? ( CLASS_IDENT )? ( ^( COLON IDENT ) )? ( LBRACK )? ) ;
    public final void expressionDecl() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:76:2: ( ^(e= EXPRESSIONDECL IDENT expressionDef ( exprCol )? ( CLASS_IDENT )? ( ^( COLON IDENT ) )? ( LBRACK )? ) )
            // EsperEPL2Ast.g:76:4: ^(e= EXPRESSIONDECL IDENT expressionDef ( exprCol )? ( CLASS_IDENT )? ( ^( COLON IDENT ) )? ( LBRACK )? )
            {
            e=(CommonTree)match(input,EXPRESSIONDECL,FOLLOW_EXPRESSIONDECL_in_expressionDecl204); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_expressionDecl206); 
            pushFollow(FOLLOW_expressionDef_in_expressionDecl208);
            expressionDef();

            state._fsp--;

            // EsperEPL2Ast.g:76:43: ( exprCol )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EXPRCOL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EsperEPL2Ast.g:76:43: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_expressionDecl210);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:76:52: ( CLASS_IDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CLASS_IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // EsperEPL2Ast.g:76:52: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_expressionDecl213); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:76:65: ( ^( COLON IDENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // EsperEPL2Ast.g:76:66: ^( COLON IDENT )
                    {
                    match(input,COLON,FOLLOW_COLON_in_expressionDecl218); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_expressionDecl220); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:76:83: ( LBRACK )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LBRACK) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // EsperEPL2Ast.g:76:83: LBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_expressionDecl225); 

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


    // $ANTLR start "expressionDef"
    // EsperEPL2Ast.g:79:1: expressionDef : ( ^( GOES valueExpr ( expressionLambdaDecl )? ) | ^( EXPRESSIONDECL constant[false] ) );
    public final void expressionDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:80:2: ( ^( GOES valueExpr ( expressionLambdaDecl )? ) | ^( EXPRESSIONDECL constant[false] ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==GOES) ) {
                alt10=1;
            }
            else if ( (LA10_0==EXPRESSIONDECL) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // EsperEPL2Ast.g:80:4: ^( GOES valueExpr ( expressionLambdaDecl )? )
                    {
                    match(input,GOES,FOLLOW_GOES_in_expressionDef242); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_expressionDef244);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:80:21: ( expressionLambdaDecl )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GOES) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // EsperEPL2Ast.g:80:21: expressionLambdaDecl
                            {
                            pushFollow(FOLLOW_expressionLambdaDecl_in_expressionDef246);
                            expressionLambdaDecl();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:81:4: ^( EXPRESSIONDECL constant[false] )
                    {
                    match(input,EXPRESSIONDECL,FOLLOW_EXPRESSIONDECL_in_expressionDef254); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_constant_in_expressionDef256);
                    constant(false);

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
    // $ANTLR end "expressionDef"


    // $ANTLR start "expressionLambdaDecl"
    // EsperEPL2Ast.g:84:1: expressionLambdaDecl : ^( GOES ( IDENT | exprCol ) ) ;
    public final void expressionLambdaDecl() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:85:2: ( ^( GOES ( IDENT | exprCol ) ) )
            // EsperEPL2Ast.g:85:4: ^( GOES ( IDENT | exprCol ) )
            {
            match(input,GOES,FOLLOW_GOES_in_expressionLambdaDecl270); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:85:11: ( IDENT | exprCol )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==EXPRCOL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // EsperEPL2Ast.g:85:12: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_expressionLambdaDecl273); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:85:20: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_expressionLambdaDecl277);
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
    // EsperEPL2Ast.g:91:1: startEPLExpressionRule : ^( EPL_EXPR ( annotation[true] | expressionDecl )* eplExpressionRule ) ;
    public final void startEPLExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:92:2: ( ^( EPL_EXPR ( annotation[true] | expressionDecl )* eplExpressionRule ) )
            // EsperEPL2Ast.g:92:4: ^( EPL_EXPR ( annotation[true] | expressionDecl )* eplExpressionRule )
            {
            match(input,EPL_EXPR,FOLLOW_EPL_EXPR_in_startEPLExpressionRule294); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:92:15: ( annotation[true] | expressionDecl )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ANNOTATION) ) {
                    alt12=1;
                }
                else if ( (LA12_0==EXPRESSIONDECL) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // EsperEPL2Ast.g:92:16: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startEPLExpressionRule297);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // EsperEPL2Ast.g:92:35: expressionDecl
            	    {
            	    pushFollow(FOLLOW_expressionDecl_in_startEPLExpressionRule302);
            	    expressionDecl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_eplExpressionRule_in_startEPLExpressionRule306);
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
    // EsperEPL2Ast.g:95:1: eplExpressionRule : ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? ) | createContextExpr );
    public final void eplExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:96:2: ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? ) | createContextExpr )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CONTEXT||LA16_0==SELECTION_EXPR||LA16_0==INSERTINTO_EXPR||(LA16_0>=CREATE_INDEX_EXPR && LA16_0<=CREATE_WINDOW_EXPR)||LA16_0==ON_EXPR||LA16_0==CREATE_VARIABLE_EXPR||LA16_0==UPDATE_EXPR||LA16_0==CREATE_SCHEMA_EXPR) ) {
                alt16=1;
            }
            else if ( (LA16_0==CREATE_CTX) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // EsperEPL2Ast.g:96:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? )
                    {
                    // EsperEPL2Ast.g:96:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )? )
                    // EsperEPL2Ast.g:96:5: ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr ) ( forExpr )?
                    {
                    // EsperEPL2Ast.g:96:5: ( contextExpr )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==CONTEXT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // EsperEPL2Ast.g:96:5: contextExpr
                            {
                            pushFollow(FOLLOW_contextExpr_in_eplExpressionRule323);
                            contextExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:96:18: ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr | onExpr | updateExpr )
                    int alt14=7;
                    switch ( input.LA(1) ) {
                    case SELECTION_EXPR:
                    case INSERTINTO_EXPR:
                        {
                        alt14=1;
                        }
                        break;
                    case CREATE_WINDOW_EXPR:
                        {
                        alt14=2;
                        }
                        break;
                    case CREATE_INDEX_EXPR:
                        {
                        alt14=3;
                        }
                        break;
                    case CREATE_VARIABLE_EXPR:
                        {
                        alt14=4;
                        }
                        break;
                    case CREATE_SCHEMA_EXPR:
                        {
                        alt14=5;
                        }
                        break;
                    case ON_EXPR:
                        {
                        alt14=6;
                        }
                        break;
                    case UPDATE_EXPR:
                        {
                        alt14=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // EsperEPL2Ast.g:96:19: selectExpr
                            {
                            pushFollow(FOLLOW_selectExpr_in_eplExpressionRule327);
                            selectExpr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:96:32: createWindowExpr
                            {
                            pushFollow(FOLLOW_createWindowExpr_in_eplExpressionRule331);
                            createWindowExpr();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // EsperEPL2Ast.g:96:51: createIndexExpr
                            {
                            pushFollow(FOLLOW_createIndexExpr_in_eplExpressionRule335);
                            createIndexExpr();

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // EsperEPL2Ast.g:96:69: createVariableExpr
                            {
                            pushFollow(FOLLOW_createVariableExpr_in_eplExpressionRule339);
                            createVariableExpr();

                            state._fsp--;


                            }
                            break;
                        case 5 :
                            // EsperEPL2Ast.g:96:90: createSchemaExpr
                            {
                            pushFollow(FOLLOW_createSchemaExpr_in_eplExpressionRule343);
                            createSchemaExpr();

                            state._fsp--;


                            }
                            break;
                        case 6 :
                            // EsperEPL2Ast.g:96:109: onExpr
                            {
                            pushFollow(FOLLOW_onExpr_in_eplExpressionRule347);
                            onExpr();

                            state._fsp--;


                            }
                            break;
                        case 7 :
                            // EsperEPL2Ast.g:96:118: updateExpr
                            {
                            pushFollow(FOLLOW_updateExpr_in_eplExpressionRule351);
                            updateExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:96:130: ( forExpr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==FOR) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // EsperEPL2Ast.g:96:130: forExpr
                            {
                            pushFollow(FOLLOW_forExpr_in_eplExpressionRule354);
                            forExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:97:4: createContextExpr
                    {
                    pushFollow(FOLLOW_createContextExpr_in_eplExpressionRule361);
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
    // EsperEPL2Ast.g:100:1: contextExpr : ^(i= CONTEXT IDENT ) ;
    public final void contextExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:101:2: ( ^(i= CONTEXT IDENT ) )
            // EsperEPL2Ast.g:101:4: ^(i= CONTEXT IDENT )
            {
            i=(CommonTree)match(input,CONTEXT,FOLLOW_CONTEXT_in_contextExpr376); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_contextExpr378); 
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
    // EsperEPL2Ast.g:104:1: onExpr : ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) ) ;
    public final void onExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:105:2: ( ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) ) )
            // EsperEPL2Ast.g:105:4: ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) )
            {
            i=(CommonTree)match(input,ON_EXPR,FOLLOW_ON_EXPR_in_onExpr397); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onStreamExpr_in_onExpr399);
            onStreamExpr();

            state._fsp--;

            // EsperEPL2Ast.g:106:3: ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr )
            int alt20=5;
            switch ( input.LA(1) ) {
            case ON_DELETE_EXPR:
                {
                alt20=1;
                }
                break;
            case ON_UPDATE_EXPR:
                {
                alt20=2;
                }
                break;
            case ON_SELECT_EXPR:
                {
                alt20=3;
                }
                break;
            case ON_SET_EXPR:
                {
                alt20=4;
                }
                break;
            case ON_MERGE_EXPR:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // EsperEPL2Ast.g:106:4: onDeleteExpr
                    {
                    pushFollow(FOLLOW_onDeleteExpr_in_onExpr404);
                    onDeleteExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:106:19: onUpdateExpr
                    {
                    pushFollow(FOLLOW_onUpdateExpr_in_onExpr408);
                    onUpdateExpr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:106:34: onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )?
                    {
                    pushFollow(FOLLOW_onSelectExpr_in_onExpr412);
                    onSelectExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:106:47: ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ON_SELECT_INSERT_EXPR) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // EsperEPL2Ast.g:106:48: ( onSelectInsertExpr )+ ( onSelectInsertOutput )?
                            {
                            // EsperEPL2Ast.g:106:48: ( onSelectInsertExpr )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==ON_SELECT_INSERT_EXPR) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:106:48: onSelectInsertExpr
                            	    {
                            	    pushFollow(FOLLOW_onSelectInsertExpr_in_onExpr415);
                            	    onSelectInsertExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt17 >= 1 ) break loop17;
                                        EarlyExitException eee =
                                            new EarlyExitException(17, input);
                                        throw eee;
                                }
                                cnt17++;
                            } while (true);

                            // EsperEPL2Ast.g:106:68: ( onSelectInsertOutput )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==ON_SELECT_INSERT_OUTPUT) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // EsperEPL2Ast.g:106:68: onSelectInsertOutput
                                    {
                                    pushFollow(FOLLOW_onSelectInsertOutput_in_onExpr418);
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
                    // EsperEPL2Ast.g:106:94: onSetExpr
                    {
                    pushFollow(FOLLOW_onSetExpr_in_onExpr425);
                    onSetExpr();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:106:106: onMergeExpr
                    {
                    pushFollow(FOLLOW_onMergeExpr_in_onExpr429);
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
    // EsperEPL2Ast.g:110:1: onStreamExpr : ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? ) ;
    public final void onStreamExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:111:2: ( ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? ) )
            // EsperEPL2Ast.g:111:4: ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? )
            {
            s=(CommonTree)match(input,ON_STREAM,FOLLOW_ON_STREAM_in_onStreamExpr451); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:111:18: ( eventFilterExpr[true] | patternInclusionExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EVENT_FILTER_EXPR) ) {
                alt21=1;
            }
            else if ( (LA21_0==PATTERN_INCL_EXPR) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // EsperEPL2Ast.g:111:19: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_onStreamExpr454);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:111:43: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_onStreamExpr459);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:111:71: ( IDENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // EsperEPL2Ast.g:111:71: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onStreamExpr462); 

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
    // EsperEPL2Ast.g:114:1: onMergeExpr : ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? ) ;
    public final void onMergeExpr() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:115:2: ( ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:115:4: ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? )
            {
            m=(CommonTree)match(input,ON_MERGE_EXPR,FOLLOW_ON_MERGE_EXPR_in_onMergeExpr480); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr482); 
            // EsperEPL2Ast.g:115:28: ( IDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // EsperEPL2Ast.g:115:28: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr484); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:115:35: ( mergeItem )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=MERGE_UNM && LA24_0<=MERGE_MAT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // EsperEPL2Ast.g:115:35: mergeItem
            	    {
            	    pushFollow(FOLLOW_mergeItem_in_onMergeExpr487);
            	    mergeItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // EsperEPL2Ast.g:115:46: ( whereClause[true] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==WHERE_EXPR) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // EsperEPL2Ast.g:115:46: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onMergeExpr490);
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
    // EsperEPL2Ast.g:118:1: mergeItem : ( mergeMatched | mergeUnmatched ) ;
    public final void mergeItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:119:2: ( ( mergeMatched | mergeUnmatched ) )
            // EsperEPL2Ast.g:119:4: ( mergeMatched | mergeUnmatched )
            {
            // EsperEPL2Ast.g:119:4: ( mergeMatched | mergeUnmatched )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==MERGE_MAT) ) {
                alt26=1;
            }
            else if ( (LA26_0==MERGE_UNM) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // EsperEPL2Ast.g:119:5: mergeMatched
                    {
                    pushFollow(FOLLOW_mergeMatched_in_mergeItem506);
                    mergeMatched();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:119:20: mergeUnmatched
                    {
                    pushFollow(FOLLOW_mergeUnmatched_in_mergeItem510);
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
    // EsperEPL2Ast.g:122:1: mergeMatched : ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? ) ;
    public final void mergeMatched() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:123:2: ( ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? ) )
            // EsperEPL2Ast.g:123:4: ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? )
            {
            m=(CommonTree)match(input,MERGE_MAT,FOLLOW_MERGE_MAT_in_mergeMatched525); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:123:18: ( mergeMatchedItem )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=MERGE_UPD && LA27_0<=MERGE_DEL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // EsperEPL2Ast.g:123:18: mergeMatchedItem
            	    {
            	    pushFollow(FOLLOW_mergeMatchedItem_in_mergeMatched527);
            	    mergeMatchedItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // EsperEPL2Ast.g:123:36: ( valueExpr )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IN_SET && LA28_0<=REGEXP)||LA28_0==NOT_EXPR||(LA28_0>=SUM && LA28_0<=AVG)||(LA28_0>=COALESCE && LA28_0<=COUNT)||(LA28_0>=CASE && LA28_0<=CASE2)||(LA28_0>=PREVIOUS && LA28_0<=EXISTS)||(LA28_0>=INSTANCEOF && LA28_0<=CURRENT_TIMESTAMP)||LA28_0==NEWKW||(LA28_0>=EVAL_AND_EXPR && LA28_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA28_0==EVENT_PROP_EXPR||LA28_0==CONCAT||(LA28_0>=LIB_FUNC_CHAIN && LA28_0<=DOT_EXPR)||LA28_0==ARRAY_EXPR||(LA28_0>=NOT_IN_SET && LA28_0<=NOT_REGEXP)||(LA28_0>=IN_RANGE && LA28_0<=SUBSELECT_EXPR)||(LA28_0>=EXISTS_SUBSELECT_EXPR && LA28_0<=NOT_IN_SUBSELECT_EXPR)||LA28_0==SUBSTITUTION||(LA28_0>=FIRST_AGGREG && LA28_0<=WINDOW_AGGREG)||(LA28_0>=INT_TYPE && LA28_0<=NULL_TYPE)||(LA28_0>=STAR && LA28_0<=PLUS)||(LA28_0>=BAND && LA28_0<=BXOR)||(LA28_0>=LT && LA28_0<=GE)||(LA28_0>=MINUS && LA28_0<=MOD)||(LA28_0>=EVAL_IS_GROUP_EXPR && LA28_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // EsperEPL2Ast.g:123:36: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeMatched530);
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
    // EsperEPL2Ast.g:126:1: mergeMatchedItem : ( ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? ) | ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE ) | mergeInsert );
    public final void mergeMatchedItem() throws RecognitionException {
        CommonTree m=null;
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:127:2: ( ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? ) | ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE ) | mergeInsert )
            int alt32=3;
            switch ( input.LA(1) ) {
            case MERGE_UPD:
                {
                alt32=1;
                }
                break;
            case MERGE_DEL:
                {
                alt32=2;
                }
                break;
            case MERGE_INS:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // EsperEPL2Ast.g:127:4: ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? )
                    {
                    m=(CommonTree)match(input,MERGE_UPD,FOLLOW_MERGE_UPD_in_mergeMatchedItem548); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:127:18: ( onSetAssignment )*
                        loop29:
                        do {
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==ON_SET_EXPR_ITEM) ) {
                                alt29=1;
                            }


                            switch (alt29) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:127:18: onSetAssignment
                        	    {
                        	    pushFollow(FOLLOW_onSetAssignment_in_mergeMatchedItem550);
                        	    onSetAssignment();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop29;
                            }
                        } while (true);

                        // EsperEPL2Ast.g:127:35: ( whereClause[false] )?
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==WHERE_EXPR) ) {
                            alt30=1;
                        }
                        switch (alt30) {
                            case 1 :
                                // EsperEPL2Ast.g:127:35: whereClause[false]
                                {
                                pushFollow(FOLLOW_whereClause_in_mergeMatchedItem553);
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
                    // EsperEPL2Ast.g:128:4: ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE )
                    {
                    d=(CommonTree)match(input,MERGE_DEL,FOLLOW_MERGE_DEL_in_mergeMatchedItem566); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:128:18: ( whereClause[false] )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==WHERE_EXPR) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // EsperEPL2Ast.g:128:18: whereClause[false]
                            {
                            pushFollow(FOLLOW_whereClause_in_mergeMatchedItem568);
                            whereClause(false);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,INT_TYPE,FOLLOW_INT_TYPE_in_mergeMatchedItem572); 
                     leaveNode(d); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:129:4: mergeInsert
                    {
                    pushFollow(FOLLOW_mergeInsert_in_mergeMatchedItem580);
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
    // EsperEPL2Ast.g:132:1: mergeUnmatched : ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? ) ;
    public final void mergeUnmatched() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:133:2: ( ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? ) )
            // EsperEPL2Ast.g:133:4: ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? )
            {
            m=(CommonTree)match(input,MERGE_UNM,FOLLOW_MERGE_UNM_in_mergeUnmatched594); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:133:18: ( mergeInsert )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MERGE_INS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // EsperEPL2Ast.g:133:18: mergeInsert
            	    {
            	    pushFollow(FOLLOW_mergeInsert_in_mergeUnmatched596);
            	    mergeInsert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            // EsperEPL2Ast.g:133:31: ( valueExpr )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=IN_SET && LA34_0<=REGEXP)||LA34_0==NOT_EXPR||(LA34_0>=SUM && LA34_0<=AVG)||(LA34_0>=COALESCE && LA34_0<=COUNT)||(LA34_0>=CASE && LA34_0<=CASE2)||(LA34_0>=PREVIOUS && LA34_0<=EXISTS)||(LA34_0>=INSTANCEOF && LA34_0<=CURRENT_TIMESTAMP)||LA34_0==NEWKW||(LA34_0>=EVAL_AND_EXPR && LA34_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA34_0==EVENT_PROP_EXPR||LA34_0==CONCAT||(LA34_0>=LIB_FUNC_CHAIN && LA34_0<=DOT_EXPR)||LA34_0==ARRAY_EXPR||(LA34_0>=NOT_IN_SET && LA34_0<=NOT_REGEXP)||(LA34_0>=IN_RANGE && LA34_0<=SUBSELECT_EXPR)||(LA34_0>=EXISTS_SUBSELECT_EXPR && LA34_0<=NOT_IN_SUBSELECT_EXPR)||LA34_0==SUBSTITUTION||(LA34_0>=FIRST_AGGREG && LA34_0<=WINDOW_AGGREG)||(LA34_0>=INT_TYPE && LA34_0<=NULL_TYPE)||(LA34_0>=STAR && LA34_0<=PLUS)||(LA34_0>=BAND && LA34_0<=BXOR)||(LA34_0>=LT && LA34_0<=GE)||(LA34_0>=MINUS && LA34_0<=MOD)||(LA34_0>=EVAL_IS_GROUP_EXPR && LA34_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // EsperEPL2Ast.g:133:31: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeUnmatched599);
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
    // EsperEPL2Ast.g:136:1: mergeInsert : ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? ) ;
    public final void mergeInsert() throws RecognitionException {
        CommonTree um=null;

        try {
            // EsperEPL2Ast.g:137:2: ( ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:137:4: ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? )
            {
            um=(CommonTree)match(input,MERGE_INS,FOLLOW_MERGE_INS_in_mergeInsert618); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_selectionList_in_mergeInsert620);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:137:33: ( CLASS_IDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==CLASS_IDENT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // EsperEPL2Ast.g:137:33: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_mergeInsert622); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:137:46: ( exprCol )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EXPRCOL) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // EsperEPL2Ast.g:137:46: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_mergeInsert625);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:137:55: ( whereClause[false] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==WHERE_EXPR) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // EsperEPL2Ast.g:137:55: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_mergeInsert628);
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
    // EsperEPL2Ast.g:140:1: updateExpr : ^(u= UPDATE_EXPR CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? ) ;
    public final void updateExpr() throws RecognitionException {
        CommonTree u=null;

        try {
            // EsperEPL2Ast.g:141:2: ( ^(u= UPDATE_EXPR CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:141:4: ^(u= UPDATE_EXPR CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? )
            {
            u=(CommonTree)match(input,UPDATE_EXPR,FOLLOW_UPDATE_EXPR_in_updateExpr648); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_updateExpr650); 
            // EsperEPL2Ast.g:141:32: ( IDENT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IDENT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // EsperEPL2Ast.g:141:32: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_updateExpr652); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:141:39: ( onSetAssignment )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ON_SET_EXPR_ITEM) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // EsperEPL2Ast.g:141:39: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_updateExpr655);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // EsperEPL2Ast.g:141:56: ( whereClause[false] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==WHERE_EXPR) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // EsperEPL2Ast.g:141:56: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_updateExpr658);
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
    // EsperEPL2Ast.g:144:1: onDeleteExpr : ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? ) ;
    public final void onDeleteExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:145:2: ( ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:145:4: ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? )
            {
            match(input,ON_DELETE_EXPR,FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr675); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onDeleteExpr677);
            onExprFrom();

            state._fsp--;

            // EsperEPL2Ast.g:145:32: ( whereClause[true] )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE_EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // EsperEPL2Ast.g:145:33: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onDeleteExpr680);
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
    // EsperEPL2Ast.g:148:1: onSelectExpr : ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? ) ;
    public final void onSelectExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:149:2: ( ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? ) )
            // EsperEPL2Ast.g:149:4: ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? )
            {
            s=(CommonTree)match(input,ON_SELECT_EXPR,FOLLOW_ON_SELECT_EXPR_in_onSelectExpr700); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:149:23: ( insertIntoExpr )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==INSERTINTO_EXPR) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // EsperEPL2Ast.g:149:23: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_onSelectExpr702);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:149:39: ( DISTINCT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==DISTINCT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // EsperEPL2Ast.g:149:39: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_onSelectExpr705); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_onSelectExpr708);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:149:63: ( onExprFrom )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ON_EXPR_FROM) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // EsperEPL2Ast.g:149:63: onExprFrom
                    {
                    pushFollow(FOLLOW_onExprFrom_in_onSelectExpr710);
                    onExprFrom();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:149:75: ( whereClause[true] )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WHERE_EXPR) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // EsperEPL2Ast.g:149:75: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSelectExpr713);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:149:94: ( groupByClause )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==GROUP_BY_EXPR) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // EsperEPL2Ast.g:149:94: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_onSelectExpr717);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:149:109: ( havingClause )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==HAVING_EXPR) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // EsperEPL2Ast.g:149:109: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_onSelectExpr720);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:149:123: ( orderByClause )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ORDER_BY_EXPR) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // EsperEPL2Ast.g:149:123: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_onSelectExpr723);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:149:138: ( rowLimitClause )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ROW_LIMIT_EXPR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // EsperEPL2Ast.g:149:138: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_onSelectExpr726);
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
    // EsperEPL2Ast.g:152:1: onSelectInsertExpr : ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? ) ;
    public final void onSelectInsertExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:153:2: ( ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:153:4: ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? )
            {
            pushStmtContext();
            match(input,ON_SELECT_INSERT_EXPR,FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr746); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_insertIntoExpr_in_onSelectInsertExpr748);
            insertIntoExpr();

            state._fsp--;

            pushFollow(FOLLOW_selectionList_in_onSelectInsertExpr750);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:153:78: ( whereClause[true] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==WHERE_EXPR) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // EsperEPL2Ast.g:153:78: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSelectInsertExpr752);
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
    // EsperEPL2Ast.g:156:1: onSelectInsertOutput : ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) ) ;
    public final void onSelectInsertOutput() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:157:2: ( ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) ) )
            // EsperEPL2Ast.g:157:4: ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) )
            {
            match(input,ON_SELECT_INSERT_OUTPUT,FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput769); 

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
    // EsperEPL2Ast.g:160:1: onSetExpr : ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? ) ;
    public final void onSetExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:161:2: ( ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:161:4: ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? )
            {
            match(input,ON_SET_EXPR,FOLLOW_ON_SET_EXPR_in_onSetExpr789); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onSetAssignment_in_onSetExpr791);
            onSetAssignment();

            state._fsp--;

            // EsperEPL2Ast.g:161:34: ( onSetAssignment )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==ON_SET_EXPR_ITEM) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // EsperEPL2Ast.g:161:35: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_onSetExpr794);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // EsperEPL2Ast.g:161:53: ( whereClause[false] )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==WHERE_EXPR) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // EsperEPL2Ast.g:161:53: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSetExpr798);
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
    // EsperEPL2Ast.g:164:1: onUpdateExpr : ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? ) ;
    public final void onUpdateExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:165:2: ( ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:165:4: ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? )
            {
            match(input,ON_UPDATE_EXPR,FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr813); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onUpdateExpr815);
            onExprFrom();

            state._fsp--;

            // EsperEPL2Ast.g:165:32: ( onSetAssignment )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==ON_SET_EXPR_ITEM) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // EsperEPL2Ast.g:165:32: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_onUpdateExpr817);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            // EsperEPL2Ast.g:165:49: ( whereClause[false] )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==WHERE_EXPR) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // EsperEPL2Ast.g:165:49: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_onUpdateExpr820);
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
    // EsperEPL2Ast.g:168:1: onSetAssignment : ^( ON_SET_EXPR_ITEM eventPropertyExpr[false] valueExpr ) ;
    public final void onSetAssignment() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:169:2: ( ^( ON_SET_EXPR_ITEM eventPropertyExpr[false] valueExpr ) )
            // EsperEPL2Ast.g:169:4: ^( ON_SET_EXPR_ITEM eventPropertyExpr[false] valueExpr )
            {
            match(input,ON_SET_EXPR_ITEM,FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment835); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_onSetAssignment837);
            eventPropertyExpr(false);

            state._fsp--;

            pushFollow(FOLLOW_valueExpr_in_onSetAssignment840);
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
    // EsperEPL2Ast.g:172:1: onExprFrom : ^( ON_EXPR_FROM IDENT ( IDENT )? ) ;
    public final void onExprFrom() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:173:2: ( ^( ON_EXPR_FROM IDENT ( IDENT )? ) )
            // EsperEPL2Ast.g:173:4: ^( ON_EXPR_FROM IDENT ( IDENT )? )
            {
            match(input,ON_EXPR_FROM,FOLLOW_ON_EXPR_FROM_in_onExprFrom854); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onExprFrom856); 
            // EsperEPL2Ast.g:173:25: ( IDENT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // EsperEPL2Ast.g:173:26: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onExprFrom859); 

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
    // EsperEPL2Ast.g:176:1: createWindowExpr : ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? ) ;
    public final void createWindowExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:177:2: ( ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? ) )
            // EsperEPL2Ast.g:177:4: ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? )
            {
            i=(CommonTree)match(input,CREATE_WINDOW_EXPR,FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr877); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createWindowExpr879); 
            // EsperEPL2Ast.g:177:33: ( viewListExpr )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==VIEW_EXPR) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // EsperEPL2Ast.g:177:34: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_createWindowExpr882);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:177:49: ( RETAINUNION )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RETAINUNION) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // EsperEPL2Ast.g:177:49: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_createWindowExpr886); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:177:62: ( RETAININTERSECTION )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RETAININTERSECTION) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // EsperEPL2Ast.g:177:62: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_createWindowExpr889); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:178:4: ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==CLASS_IDENT||LA60_0==CREATE_WINDOW_SELECT_EXPR) ) {
                alt60=1;
            }
            else if ( (LA60_0==CREATE_COL_TYPE_LIST) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // EsperEPL2Ast.g:179:5: ( ( createSelectionList )? CLASS_IDENT )
                    {
                    // EsperEPL2Ast.g:179:5: ( ( createSelectionList )? CLASS_IDENT )
                    // EsperEPL2Ast.g:179:6: ( createSelectionList )? CLASS_IDENT
                    {
                    // EsperEPL2Ast.g:179:6: ( createSelectionList )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==CREATE_WINDOW_SELECT_EXPR) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // EsperEPL2Ast.g:179:6: createSelectionList
                            {
                            pushFollow(FOLLOW_createSelectionList_in_createWindowExpr903);
                            createSelectionList();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createWindowExpr906); 

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:181:12: ( createColTypeList )
                    {
                    // EsperEPL2Ast.g:181:12: ( createColTypeList )
                    // EsperEPL2Ast.g:181:13: createColTypeList
                    {
                    pushFollow(FOLLOW_createColTypeList_in_createWindowExpr935);
                    createColTypeList();

                    state._fsp--;


                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:183:4: ( createWindowExprInsert )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==INSERT) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // EsperEPL2Ast.g:183:4: createWindowExprInsert
                    {
                    pushFollow(FOLLOW_createWindowExprInsert_in_createWindowExpr946);
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
    // EsperEPL2Ast.g:187:1: createIndexExpr : ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList ) ;
    public final void createIndexExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:188:2: ( ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList ) )
            // EsperEPL2Ast.g:188:4: ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList )
            {
            i=(CommonTree)match(input,CREATE_INDEX_EXPR,FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr966); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr968); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr970); 
            pushFollow(FOLLOW_indexColList_in_createIndexExpr972);
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
    // EsperEPL2Ast.g:191:1: indexColList : ^( INDEXCOL ( indexCol )+ ) ;
    public final void indexColList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:192:2: ( ^( INDEXCOL ( indexCol )+ ) )
            // EsperEPL2Ast.g:192:4: ^( INDEXCOL ( indexCol )+ )
            {
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexColList987); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:192:15: ( indexCol )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==INDEXCOL) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // EsperEPL2Ast.g:192:15: indexCol
            	    {
            	    pushFollow(FOLLOW_indexCol_in_indexColList989);
            	    indexCol();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // EsperEPL2Ast.g:195:1: indexCol : ^( INDEXCOL IDENT ( IDENT )? ) ;
    public final void indexCol() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:196:2: ( ^( INDEXCOL IDENT ( IDENT )? ) )
            // EsperEPL2Ast.g:196:4: ^( INDEXCOL IDENT ( IDENT )? )
            {
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexCol1004); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_indexCol1006); 
            // EsperEPL2Ast.g:196:21: ( IDENT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDENT) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // EsperEPL2Ast.g:196:21: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_indexCol1008); 

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
    // EsperEPL2Ast.g:199:1: createWindowExprInsert : ^( INSERT ( valueExpr )? ) ;
    public final void createWindowExprInsert() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:200:2: ( ^( INSERT ( valueExpr )? ) )
            // EsperEPL2Ast.g:200:4: ^( INSERT ( valueExpr )? )
            {
            match(input,INSERT,FOLLOW_INSERT_in_createWindowExprInsert1022); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:200:13: ( valueExpr )?
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=IN_SET && LA64_0<=REGEXP)||LA64_0==NOT_EXPR||(LA64_0>=SUM && LA64_0<=AVG)||(LA64_0>=COALESCE && LA64_0<=COUNT)||(LA64_0>=CASE && LA64_0<=CASE2)||(LA64_0>=PREVIOUS && LA64_0<=EXISTS)||(LA64_0>=INSTANCEOF && LA64_0<=CURRENT_TIMESTAMP)||LA64_0==NEWKW||(LA64_0>=EVAL_AND_EXPR && LA64_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA64_0==EVENT_PROP_EXPR||LA64_0==CONCAT||(LA64_0>=LIB_FUNC_CHAIN && LA64_0<=DOT_EXPR)||LA64_0==ARRAY_EXPR||(LA64_0>=NOT_IN_SET && LA64_0<=NOT_REGEXP)||(LA64_0>=IN_RANGE && LA64_0<=SUBSELECT_EXPR)||(LA64_0>=EXISTS_SUBSELECT_EXPR && LA64_0<=NOT_IN_SUBSELECT_EXPR)||LA64_0==SUBSTITUTION||(LA64_0>=FIRST_AGGREG && LA64_0<=WINDOW_AGGREG)||(LA64_0>=INT_TYPE && LA64_0<=NULL_TYPE)||(LA64_0>=STAR && LA64_0<=PLUS)||(LA64_0>=BAND && LA64_0<=BXOR)||(LA64_0>=LT && LA64_0<=GE)||(LA64_0>=MINUS && LA64_0<=MOD)||(LA64_0>=EVAL_IS_GROUP_EXPR && LA64_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt64=1;
                }
                switch (alt64) {
                    case 1 :
                        // EsperEPL2Ast.g:200:13: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_createWindowExprInsert1024);
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
    // EsperEPL2Ast.g:203:1: createSelectionList : ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* ) ;
    public final void createSelectionList() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:204:2: ( ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* ) )
            // EsperEPL2Ast.g:204:4: ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* )
            {
            s=(CommonTree)match(input,CREATE_WINDOW_SELECT_EXPR,FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList1041); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1043);
            createSelectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:204:61: ( createSelectionListElement )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==SELECTION_ELEMENT_EXPR||LA65_0==WILDCARD_SELECT) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // EsperEPL2Ast.g:204:62: createSelectionListElement
            	    {
            	    pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1046);
            	    createSelectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // EsperEPL2Ast.g:207:1: createColTypeList : ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* ) ;
    public final void createColTypeList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:208:2: ( ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* ) )
            // EsperEPL2Ast.g:208:4: ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* )
            {
            match(input,CREATE_COL_TYPE_LIST,FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1065); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1067);
            createColTypeListElement();

            state._fsp--;

            // EsperEPL2Ast.g:208:52: ( createColTypeListElement )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==CREATE_COL_TYPE) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // EsperEPL2Ast.g:208:53: createColTypeListElement
            	    {
            	    pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1070);
            	    createColTypeListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // EsperEPL2Ast.g:211:1: createColTypeListElement : ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? ) ;
    public final void createColTypeListElement() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:212:2: ( ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? ) )
            // EsperEPL2Ast.g:212:4: ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? )
            {
            match(input,CREATE_COL_TYPE,FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1085); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1087); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1089); 
            // EsperEPL2Ast.g:212:46: ( LBRACK )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==LBRACK) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // EsperEPL2Ast.g:212:46: LBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_createColTypeListElement1091); 

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
    // EsperEPL2Ast.g:215:1: createSelectionListElement : (w= WILDCARD_SELECT | ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) ) );
    public final void createSelectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:216:2: (w= WILDCARD_SELECT | ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==WILDCARD_SELECT) ) {
                alt70=1;
            }
            else if ( (LA70_0==SELECTION_ELEMENT_EXPR) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // EsperEPL2Ast.g:216:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1106); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:217:4: ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) )
                    {
                    s=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1116); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:217:31: ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==EVENT_PROP_EXPR) ) {
                        alt69=1;
                    }
                    else if ( ((LA69_0>=INT_TYPE && LA69_0<=NULL_TYPE)) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // EsperEPL2Ast.g:218:16: ( eventPropertyExpr[true] ( IDENT )? )
                            {
                            // EsperEPL2Ast.g:218:16: ( eventPropertyExpr[true] ( IDENT )? )
                            // EsperEPL2Ast.g:218:17: eventPropertyExpr[true] ( IDENT )?
                            {
                            pushFollow(FOLLOW_eventPropertyExpr_in_createSelectionListElement1136);
                            eventPropertyExpr(true);

                            state._fsp--;

                            // EsperEPL2Ast.g:218:41: ( IDENT )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==IDENT) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // EsperEPL2Ast.g:218:42: IDENT
                                    {
                                    match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1140); 

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:219:16: ( constant[true] IDENT )
                            {
                            // EsperEPL2Ast.g:219:16: ( constant[true] IDENT )
                            // EsperEPL2Ast.g:219:17: constant[true] IDENT
                            {
                            pushFollow(FOLLOW_constant_in_createSelectionListElement1162);
                            constant(true);

                            state._fsp--;

                            match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1165); 

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
    // EsperEPL2Ast.g:223:1: createVariableExpr : ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( IDENT )? ( valueExpr )? ) ;
    public final void createVariableExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:224:2: ( ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( IDENT )? ( valueExpr )? ) )
            // EsperEPL2Ast.g:224:4: ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( IDENT )? ( valueExpr )? )
            {
            i=(CommonTree)match(input,CREATE_VARIABLE_EXPR,FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1201); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createVariableExpr1203); 
            match(input,IDENT,FOLLOW_IDENT_in_createVariableExpr1205); 
            // EsperEPL2Ast.g:224:47: ( IDENT )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==IDENT) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // EsperEPL2Ast.g:224:47: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createVariableExpr1207); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:224:54: ( valueExpr )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=IN_SET && LA72_0<=REGEXP)||LA72_0==NOT_EXPR||(LA72_0>=SUM && LA72_0<=AVG)||(LA72_0>=COALESCE && LA72_0<=COUNT)||(LA72_0>=CASE && LA72_0<=CASE2)||(LA72_0>=PREVIOUS && LA72_0<=EXISTS)||(LA72_0>=INSTANCEOF && LA72_0<=CURRENT_TIMESTAMP)||LA72_0==NEWKW||(LA72_0>=EVAL_AND_EXPR && LA72_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA72_0==EVENT_PROP_EXPR||LA72_0==CONCAT||(LA72_0>=LIB_FUNC_CHAIN && LA72_0<=DOT_EXPR)||LA72_0==ARRAY_EXPR||(LA72_0>=NOT_IN_SET && LA72_0<=NOT_REGEXP)||(LA72_0>=IN_RANGE && LA72_0<=SUBSELECT_EXPR)||(LA72_0>=EXISTS_SUBSELECT_EXPR && LA72_0<=NOT_IN_SUBSELECT_EXPR)||LA72_0==SUBSTITUTION||(LA72_0>=FIRST_AGGREG && LA72_0<=WINDOW_AGGREG)||(LA72_0>=INT_TYPE && LA72_0<=NULL_TYPE)||(LA72_0>=STAR && LA72_0<=PLUS)||(LA72_0>=BAND && LA72_0<=BXOR)||(LA72_0>=LT && LA72_0<=GE)||(LA72_0>=MINUS && LA72_0<=MOD)||(LA72_0>=EVAL_IS_GROUP_EXPR && LA72_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // EsperEPL2Ast.g:224:54: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_createVariableExpr1210);
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
    // EsperEPL2Ast.g:227:1: createContextExpr : ^(s= CREATE_CTX IDENT createContextDetail ) ;
    public final void createContextExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:228:2: ( ^(s= CREATE_CTX IDENT createContextDetail ) )
            // EsperEPL2Ast.g:228:4: ^(s= CREATE_CTX IDENT createContextDetail )
            {
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextExpr1229); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextExpr1231); 
            pushFollow(FOLLOW_createContextDetail_in_createContextExpr1233);
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
    // EsperEPL2Ast.g:231:1: createContextDetail : ( ^( CREATE_CTX_FIXED createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? ) | ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ ) );
    public final void createContextDetail() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:232:2: ( ^( CREATE_CTX_FIXED createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? ) | ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ ) )
            int alt78=6;
            switch ( input.LA(1) ) {
            case CREATE_CTX_FIXED:
                {
                alt78=1;
                }
                break;
            case CREATE_CTX_INIT:
                {
                alt78=2;
                }
                break;
            case CREATE_CTX_PART:
                {
                alt78=3;
                }
                break;
            case CREATE_CTX_CAT:
                {
                alt78=4;
                }
                break;
            case CREATE_CTX_COAL:
                {
                alt78=5;
                }
                break;
            case CREATE_CTX_NESTED:
                {
                alt78=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // EsperEPL2Ast.g:232:4: ^( CREATE_CTX_FIXED createContextRangePoint createContextRangePoint )
                    {
                    match(input,CREATE_CTX_FIXED,FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1249); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1251);
                    createContextRangePoint();

                    state._fsp--;

                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1253);
                    createContextRangePoint();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:233:4: ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint )
                    {
                    match(input,CREATE_CTX_INIT,FOLLOW_CREATE_CTX_INIT_in_createContextDetail1260); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1262);
                    createContextRangePoint();

                    state._fsp--;

                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1264);
                    createContextRangePoint();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:234:4: ^( CREATE_CTX_PART ( createContextPartitionItem )+ )
                    {
                    match(input,CREATE_CTX_PART,FOLLOW_CREATE_CTX_PART_in_createContextDetail1271); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:234:22: ( createContextPartitionItem )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==PARTITIONITEM) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:234:22: createContextPartitionItem
                    	    {
                    	    pushFollow(FOLLOW_createContextPartitionItem_in_createContextDetail1273);
                    	    createContextPartitionItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:235:4: ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] )
                    {
                    match(input,CREATE_CTX_CAT,FOLLOW_CREATE_CTX_CAT_in_createContextDetail1281); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:235:21: ( createContextCategoryItem )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==CREATE_CTX_CATITEM) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:235:21: createContextCategoryItem
                    	    {
                    	    pushFollow(FOLLOW_createContextCategoryItem_in_createContextDetail1283);
                    	    createContextCategoryItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt74 >= 1 ) break loop74;
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);

                    pushFollow(FOLLOW_eventFilterExpr_in_createContextDetail1286);
                    eventFilterExpr(false);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:236:4: ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? )
                    {
                    match(input,CREATE_CTX_COAL,FOLLOW_CREATE_CTX_COAL_in_createContextDetail1294); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:236:22: ( createContextCoalesceItem )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==COALESCE) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:236:22: createContextCoalesceItem
                    	    {
                    	    pushFollow(FOLLOW_createContextCoalesceItem_in_createContextDetail1296);
                    	    createContextCoalesceItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1299); 
                    pushFollow(FOLLOW_number_in_createContextDetail1301);
                    number();

                    state._fsp--;

                    // EsperEPL2Ast.g:236:62: ( IDENT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==IDENT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // EsperEPL2Ast.g:236:62: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1303); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:237:4: ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ )
                    {
                    match(input,CREATE_CTX_NESTED,FOLLOW_CREATE_CTX_NESTED_in_createContextDetail1311); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextNested_in_createContextDetail1313);
                    createContextNested();

                    state._fsp--;

                    // EsperEPL2Ast.g:237:44: ( createContextNested )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==CREATE_CTX) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:237:44: createContextNested
                    	    {
                    	    pushFollow(FOLLOW_createContextNested_in_createContextDetail1315);
                    	    createContextNested();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);


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


    // $ANTLR start "createContextRangePoint"
    // EsperEPL2Ast.g:240:1: createContextRangePoint : ( createContextFilter | patternInclusionExpression | crontabLimitParameterSet | ^( AFTER timePeriod ) );
    public final void createContextRangePoint() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:241:2: ( createContextFilter | patternInclusionExpression | crontabLimitParameterSet | ^( AFTER timePeriod ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case STREAM_EXPR:
                {
                alt79=1;
                }
                break;
            case PATTERN_INCL_EXPR:
                {
                alt79=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR_PARAM:
                {
                alt79=3;
                }
                break;
            case AFTER:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // EsperEPL2Ast.g:241:4: createContextFilter
                    {
                    pushFollow(FOLLOW_createContextFilter_in_createContextRangePoint1328);
                    createContextFilter();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:242:5: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_createContextRangePoint1335);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:243:4: crontabLimitParameterSet
                    {
                    pushFollow(FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1340);
                    crontabLimitParameterSet();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:244:4: ^( AFTER timePeriod )
                    {
                    match(input,AFTER,FOLLOW_AFTER_in_createContextRangePoint1346); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_timePeriod_in_createContextRangePoint1348);
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
    // $ANTLR end "createContextRangePoint"


    // $ANTLR start "createContextNested"
    // EsperEPL2Ast.g:247:1: createContextNested : ^(s= CREATE_CTX IDENT createContextDetail ) ;
    public final void createContextNested() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:248:2: ( ^(s= CREATE_CTX IDENT createContextDetail ) )
            // EsperEPL2Ast.g:248:4: ^(s= CREATE_CTX IDENT createContextDetail )
            {
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextNested1364); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextNested1366); 
            pushFollow(FOLLOW_createContextDetail_in_createContextNested1368);
            createContextDetail();

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
    // $ANTLR end "createContextNested"


    // $ANTLR start "createContextFilter"
    // EsperEPL2Ast.g:251:1: createContextFilter : ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? ) ;
    public final void createContextFilter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:252:2: ( ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? ) )
            // EsperEPL2Ast.g:252:4: ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? )
            {
            match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_createContextFilter1381); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextFilter1383);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:252:41: ( IDENT )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==IDENT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // EsperEPL2Ast.g:252:41: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createContextFilter1386); 

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
    // $ANTLR end "createContextFilter"


    // $ANTLR start "createContextPartitionItem"
    // EsperEPL2Ast.g:255:1: createContextPartitionItem : ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) ;
    public final void createContextPartitionItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:256:2: ( ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) )
            // EsperEPL2Ast.g:256:4: ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ )
            {
            match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_createContextPartitionItem1402); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextPartitionItem1404);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:256:43: ( eventPropertyExpr[false] )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==EVENT_PROP_EXPR) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // EsperEPL2Ast.g:256:43: eventPropertyExpr[false]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_createContextPartitionItem1407);
            	    eventPropertyExpr(false);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
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


    // $ANTLR start "createContextCoalesceItem"
    // EsperEPL2Ast.g:259:1: createContextCoalesceItem : ^( COALESCE libFunctionWithClass eventFilterExpr[false] ) ;
    public final void createContextCoalesceItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:260:2: ( ^( COALESCE libFunctionWithClass eventFilterExpr[false] ) )
            // EsperEPL2Ast.g:260:4: ^( COALESCE libFunctionWithClass eventFilterExpr[false] )
            {
            match(input,COALESCE,FOLLOW_COALESCE_in_createContextCoalesceItem1424); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1426);
            libFunctionWithClass();

            state._fsp--;

            pushFollow(FOLLOW_eventFilterExpr_in_createContextCoalesceItem1428);
            eventFilterExpr(false);

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
    // $ANTLR end "createContextCoalesceItem"


    // $ANTLR start "createContextCategoryItem"
    // EsperEPL2Ast.g:263:1: createContextCategoryItem : ^( CREATE_CTX_CATITEM valueExpr IDENT ) ;
    public final void createContextCategoryItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:264:2: ( ^( CREATE_CTX_CATITEM valueExpr IDENT ) )
            // EsperEPL2Ast.g:264:4: ^( CREATE_CTX_CATITEM valueExpr IDENT )
            {
            match(input,CREATE_CTX_CATITEM,FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1444); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_createContextCategoryItem1446);
            valueExpr();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_createContextCategoryItem1448); 

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
    // EsperEPL2Ast.g:267:1: createSchemaExpr : ^(s= CREATE_SCHEMA_EXPR IDENT ( variantList | ( createColTypeList )? ) ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )? ( createSchemaQual )* ) ;
    public final void createSchemaExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:268:2: ( ^(s= CREATE_SCHEMA_EXPR IDENT ( variantList | ( createColTypeList )? ) ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )? ( createSchemaQual )* ) )
            // EsperEPL2Ast.g:268:4: ^(s= CREATE_SCHEMA_EXPR IDENT ( variantList | ( createColTypeList )? ) ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )? ( createSchemaQual )* )
            {
            s=(CommonTree)match(input,CREATE_SCHEMA_EXPR,FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1465); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1467); 
            // EsperEPL2Ast.g:268:33: ( variantList | ( createColTypeList )? )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==VARIANT_LIST) ) {
                alt83=1;
            }
            else if ( (LA83_0==UP||LA83_0==CREATE_COL_TYPE_LIST||(LA83_0>=CREATE_SCHEMA_EXPR_QUAL && LA83_0<=CREATE_SCHEMA_EXPR_VAR)) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // EsperEPL2Ast.g:268:34: variantList
                    {
                    pushFollow(FOLLOW_variantList_in_createSchemaExpr1470);
                    variantList();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:268:46: ( createColTypeList )?
                    {
                    // EsperEPL2Ast.g:268:46: ( createColTypeList )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==CREATE_COL_TYPE_LIST) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // EsperEPL2Ast.g:268:46: createColTypeList
                            {
                            pushFollow(FOLLOW_createColTypeList_in_createSchemaExpr1472);
                            createColTypeList();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:268:66: ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==CREATE_SCHEMA_EXPR_VAR) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // EsperEPL2Ast.g:268:67: ^( CREATE_SCHEMA_EXPR_VAR IDENT )
                    {
                    match(input,CREATE_SCHEMA_EXPR_VAR,FOLLOW_CREATE_SCHEMA_EXPR_VAR_in_createSchemaExpr1478); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1480); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:268:101: ( createSchemaQual )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==CREATE_SCHEMA_EXPR_QUAL) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // EsperEPL2Ast.g:268:101: createSchemaQual
            	    {
            	    pushFollow(FOLLOW_createSchemaQual_in_createSchemaExpr1485);
            	    createSchemaQual();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop85;
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
    // EsperEPL2Ast.g:271:1: createSchemaQual : ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) ;
    public final void createSchemaQual() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:272:2: ( ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) )
            // EsperEPL2Ast.g:272:4: ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol )
            {
            match(input,CREATE_SCHEMA_EXPR_QUAL,FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1503); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaQual1505); 
            pushFollow(FOLLOW_exprCol_in_createSchemaQual1507);
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
    // EsperEPL2Ast.g:275:1: variantList : ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) ;
    public final void variantList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:276:2: ( ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) )
            // EsperEPL2Ast.g:276:4: ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ )
            {
            match(input,VARIANT_LIST,FOLLOW_VARIANT_LIST_in_variantList1523); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:276:19: ( STAR | CLASS_IDENT )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==CLASS_IDENT||LA86_0==STAR) ) {
                    alt86=1;
                }


                switch (alt86) {
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
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
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
    // EsperEPL2Ast.g:279:1: selectExpr : ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? ;
    public final void selectExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:280:2: ( ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? )
            // EsperEPL2Ast.g:280:4: ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )?
            {
            // EsperEPL2Ast.g:280:4: ( insertIntoExpr )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==INSERTINTO_EXPR) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // EsperEPL2Ast.g:280:5: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_selectExpr1543);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_selectClause_in_selectExpr1549);
            selectClause();

            state._fsp--;

            pushFollow(FOLLOW_fromClause_in_selectExpr1554);
            fromClause();

            state._fsp--;

            // EsperEPL2Ast.g:283:3: ( matchRecogClause )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==MATCH_RECOGNIZE) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // EsperEPL2Ast.g:283:4: matchRecogClause
                    {
                    pushFollow(FOLLOW_matchRecogClause_in_selectExpr1559);
                    matchRecogClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:284:3: ( whereClause[true] )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==WHERE_EXPR) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // EsperEPL2Ast.g:284:4: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr1566);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:285:3: ( groupByClause )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==GROUP_BY_EXPR) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // EsperEPL2Ast.g:285:4: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_selectExpr1574);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:286:3: ( havingClause )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==HAVING_EXPR) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // EsperEPL2Ast.g:286:4: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_selectExpr1581);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:287:3: ( outputLimitExpr )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=EVENT_LIMIT_EXPR && LA92_0<=CRONTAB_LIMIT_EXPR)||(LA92_0>=WHEN_LIMIT_EXPR && LA92_0<=TERM_LIMIT_EXPR)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // EsperEPL2Ast.g:287:4: outputLimitExpr
                    {
                    pushFollow(FOLLOW_outputLimitExpr_in_selectExpr1588);
                    outputLimitExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:288:3: ( orderByClause )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ORDER_BY_EXPR) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // EsperEPL2Ast.g:288:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_selectExpr1595);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:289:3: ( rowLimitClause )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ROW_LIMIT_EXPR) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // EsperEPL2Ast.g:289:4: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_selectExpr1602);
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
    // EsperEPL2Ast.g:292:1: insertIntoExpr : ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? ) ;
    public final void insertIntoExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:293:2: ( ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? ) )
            // EsperEPL2Ast.g:293:4: ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? )
            {
            i=(CommonTree)match(input,INSERTINTO_EXPR,FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1619); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:293:24: ( ISTREAM | RSTREAM )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=RSTREAM && LA95_0<=ISTREAM)) ) {
                alt95=1;
            }
            switch (alt95) {
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

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_insertIntoExpr1630); 
            // EsperEPL2Ast.g:293:57: ( exprCol )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==EXPRCOL) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // EsperEPL2Ast.g:293:58: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_insertIntoExpr1633);
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
    // EsperEPL2Ast.g:296:1: exprCol : ^( EXPRCOL IDENT ( IDENT )* ) ;
    public final void exprCol() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:297:2: ( ^( EXPRCOL IDENT ( IDENT )* ) )
            // EsperEPL2Ast.g:297:4: ^( EXPRCOL IDENT ( IDENT )* )
            {
            match(input,EXPRCOL,FOLLOW_EXPRCOL_in_exprCol1652); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_exprCol1654); 
            // EsperEPL2Ast.g:297:20: ( IDENT )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==IDENT) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // EsperEPL2Ast.g:297:21: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_exprCol1657); 

            	    }
            	    break;

            	default :
            	    break loop97;
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
    // EsperEPL2Ast.g:300:1: selectClause : ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) ;
    public final void selectClause() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:301:2: ( ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) )
            // EsperEPL2Ast.g:301:4: ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList )
            {
            s=(CommonTree)match(input,SELECTION_EXPR,FOLLOW_SELECTION_EXPR_in_selectClause1675); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:301:23: ( RSTREAM | ISTREAM | IRSTREAM )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=RSTREAM && LA98_0<=IRSTREAM)) ) {
                alt98=1;
            }
            switch (alt98) {
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

            // EsperEPL2Ast.g:301:55: ( DISTINCT )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==DISTINCT) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // EsperEPL2Ast.g:301:55: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause1690); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_selectClause1693);
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
    // EsperEPL2Ast.g:304:1: fromClause : streamExpression ( streamExpression ( outerJoin )* )* ;
    public final void fromClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:305:2: ( streamExpression ( streamExpression ( outerJoin )* )* )
            // EsperEPL2Ast.g:305:4: streamExpression ( streamExpression ( outerJoin )* )*
            {
            pushFollow(FOLLOW_streamExpression_in_fromClause1707);
            streamExpression();

            state._fsp--;

            // EsperEPL2Ast.g:305:21: ( streamExpression ( outerJoin )* )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==STREAM_EXPR) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // EsperEPL2Ast.g:305:22: streamExpression ( outerJoin )*
            	    {
            	    pushFollow(FOLLOW_streamExpression_in_fromClause1710);
            	    streamExpression();

            	    state._fsp--;

            	    // EsperEPL2Ast.g:305:39: ( outerJoin )*
            	    loop100:
            	    do {
            	        int alt100=2;
            	        int LA100_0 = input.LA(1);

            	        if ( ((LA100_0>=INNERJOIN_EXPR && LA100_0<=FULL_OUTERJOIN_EXPR)) ) {
            	            alt100=1;
            	        }


            	        switch (alt100) {
            	    	case 1 :
            	    	    // EsperEPL2Ast.g:305:40: outerJoin
            	    	    {
            	    	    pushFollow(FOLLOW_outerJoin_in_fromClause1713);
            	    	    outerJoin();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop100;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop101;
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
    // EsperEPL2Ast.g:308:1: forExpr : ^(f= FOR IDENT ( valueExpr )* ) ;
    public final void forExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:309:2: ( ^(f= FOR IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:309:4: ^(f= FOR IDENT ( valueExpr )* )
            {
            f=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forExpr1733); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_forExpr1735); 
            // EsperEPL2Ast.g:309:18: ( valueExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=IN_SET && LA102_0<=REGEXP)||LA102_0==NOT_EXPR||(LA102_0>=SUM && LA102_0<=AVG)||(LA102_0>=COALESCE && LA102_0<=COUNT)||(LA102_0>=CASE && LA102_0<=CASE2)||(LA102_0>=PREVIOUS && LA102_0<=EXISTS)||(LA102_0>=INSTANCEOF && LA102_0<=CURRENT_TIMESTAMP)||LA102_0==NEWKW||(LA102_0>=EVAL_AND_EXPR && LA102_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA102_0==EVENT_PROP_EXPR||LA102_0==CONCAT||(LA102_0>=LIB_FUNC_CHAIN && LA102_0<=DOT_EXPR)||LA102_0==ARRAY_EXPR||(LA102_0>=NOT_IN_SET && LA102_0<=NOT_REGEXP)||(LA102_0>=IN_RANGE && LA102_0<=SUBSELECT_EXPR)||(LA102_0>=EXISTS_SUBSELECT_EXPR && LA102_0<=NOT_IN_SUBSELECT_EXPR)||LA102_0==SUBSTITUTION||(LA102_0>=FIRST_AGGREG && LA102_0<=WINDOW_AGGREG)||(LA102_0>=INT_TYPE && LA102_0<=NULL_TYPE)||(LA102_0>=STAR && LA102_0<=PLUS)||(LA102_0>=BAND && LA102_0<=BXOR)||(LA102_0>=LT && LA102_0<=GE)||(LA102_0>=MINUS && LA102_0<=MOD)||(LA102_0>=EVAL_IS_GROUP_EXPR && LA102_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // EsperEPL2Ast.g:309:18: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_forExpr1737);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop102;
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
    // EsperEPL2Ast.g:312:1: matchRecogClause : ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) ;
    public final void matchRecogClause() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:313:2: ( ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) )
            // EsperEPL2Ast.g:313:4: ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine )
            {
            m=(CommonTree)match(input,MATCH_RECOGNIZE,FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause1756); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:313:24: ( matchRecogPartitionBy )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==PARTITIONITEM) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // EsperEPL2Ast.g:313:24: matchRecogPartitionBy
                    {
                    pushFollow(FOLLOW_matchRecogPartitionBy_in_matchRecogClause1758);
                    matchRecogPartitionBy();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogMeasures_in_matchRecogClause1765);
            matchRecogMeasures();

            state._fsp--;

            // EsperEPL2Ast.g:315:4: ( ALL )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ALL) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // EsperEPL2Ast.g:315:4: ALL
                    {
                    match(input,ALL,FOLLOW_ALL_in_matchRecogClause1771); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:316:4: ( matchRecogMatchesAfterSkip )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==MATCHREC_AFTER_SKIP) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // EsperEPL2Ast.g:316:4: matchRecogMatchesAfterSkip
                    {
                    pushFollow(FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause1777);
                    matchRecogMatchesAfterSkip();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogPattern_in_matchRecogClause1783);
            matchRecogPattern();

            state._fsp--;

            // EsperEPL2Ast.g:318:4: ( matchRecogMatchesInterval )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==MATCHREC_INTERVAL) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // EsperEPL2Ast.g:318:4: matchRecogMatchesInterval
                    {
                    pushFollow(FOLLOW_matchRecogMatchesInterval_in_matchRecogClause1789);
                    matchRecogMatchesInterval();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogDefine_in_matchRecogClause1795);
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
    // EsperEPL2Ast.g:322:1: matchRecogPartitionBy : ^(p= PARTITIONITEM ( valueExpr )+ ) ;
    public final void matchRecogPartitionBy() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:323:2: ( ^(p= PARTITIONITEM ( valueExpr )+ ) )
            // EsperEPL2Ast.g:323:4: ^(p= PARTITIONITEM ( valueExpr )+ )
            {
            p=(CommonTree)match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy1813); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:323:22: ( valueExpr )+
            int cnt107=0;
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( ((LA107_0>=IN_SET && LA107_0<=REGEXP)||LA107_0==NOT_EXPR||(LA107_0>=SUM && LA107_0<=AVG)||(LA107_0>=COALESCE && LA107_0<=COUNT)||(LA107_0>=CASE && LA107_0<=CASE2)||(LA107_0>=PREVIOUS && LA107_0<=EXISTS)||(LA107_0>=INSTANCEOF && LA107_0<=CURRENT_TIMESTAMP)||LA107_0==NEWKW||(LA107_0>=EVAL_AND_EXPR && LA107_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA107_0==EVENT_PROP_EXPR||LA107_0==CONCAT||(LA107_0>=LIB_FUNC_CHAIN && LA107_0<=DOT_EXPR)||LA107_0==ARRAY_EXPR||(LA107_0>=NOT_IN_SET && LA107_0<=NOT_REGEXP)||(LA107_0>=IN_RANGE && LA107_0<=SUBSELECT_EXPR)||(LA107_0>=EXISTS_SUBSELECT_EXPR && LA107_0<=NOT_IN_SUBSELECT_EXPR)||LA107_0==SUBSTITUTION||(LA107_0>=FIRST_AGGREG && LA107_0<=WINDOW_AGGREG)||(LA107_0>=INT_TYPE && LA107_0<=NULL_TYPE)||(LA107_0>=STAR && LA107_0<=PLUS)||(LA107_0>=BAND && LA107_0<=BXOR)||(LA107_0>=LT && LA107_0<=GE)||(LA107_0>=MINUS && LA107_0<=MOD)||(LA107_0>=EVAL_IS_GROUP_EXPR && LA107_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // EsperEPL2Ast.g:323:22: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_matchRecogPartitionBy1815);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt107 >= 1 ) break loop107;
                        EarlyExitException eee =
                            new EarlyExitException(107, input);
                        throw eee;
                }
                cnt107++;
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
    // EsperEPL2Ast.g:326:1: matchRecogMatchesAfterSkip : ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) ;
    public final void matchRecogMatchesAfterSkip() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:327:2: ( ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) )
            // EsperEPL2Ast.g:327:4: ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT )
            {
            match(input,MATCHREC_AFTER_SKIP,FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip1832); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1834); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1836); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1838); 
            if ( input.LA(1)==LAST||input.LA(1)==IDENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1846); 

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
    // EsperEPL2Ast.g:330:1: matchRecogMatchesInterval : ^( MATCHREC_INTERVAL IDENT timePeriod ) ;
    public final void matchRecogMatchesInterval() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:331:2: ( ^( MATCHREC_INTERVAL IDENT timePeriod ) )
            // EsperEPL2Ast.g:331:4: ^( MATCHREC_INTERVAL IDENT timePeriod )
            {
            match(input,MATCHREC_INTERVAL,FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval1861); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesInterval1863); 
            pushFollow(FOLLOW_timePeriod_in_matchRecogMatchesInterval1865);
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
    // EsperEPL2Ast.g:334:1: matchRecogMeasures : ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) ;
    public final void matchRecogMeasures() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:335:2: ( ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) )
            // EsperEPL2Ast.g:335:4: ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURES,FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures1881); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:335:26: ( matchRecogMeasureListElement )*
                loop108:
                do {
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==MATCHREC_MEASURE_ITEM) ) {
                        alt108=1;
                    }


                    switch (alt108) {
                	case 1 :
                	    // EsperEPL2Ast.g:335:26: matchRecogMeasureListElement
                	    {
                	    pushFollow(FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures1883);
                	    matchRecogMeasureListElement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop108;
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
    // EsperEPL2Ast.g:338:1: matchRecogMeasureListElement : ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) ;
    public final void matchRecogMeasureListElement() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:339:2: ( ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) )
            // EsperEPL2Ast.g:339:4: ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURE_ITEM,FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement1900); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogMeasureListElement1902);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:339:40: ( IDENT )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==IDENT) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // EsperEPL2Ast.g:339:40: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_matchRecogMeasureListElement1904); 

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
    // EsperEPL2Ast.g:342:1: matchRecogPattern : ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) ;
    public final void matchRecogPattern() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:343:2: ( ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) )
            // EsperEPL2Ast.g:343:4: ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN,FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern1924); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:343:25: ( matchRecogPatternAlteration )+
            int cnt110=0;
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( ((LA110_0>=MATCHREC_PATTERN_CONCAT && LA110_0<=MATCHREC_PATTERN_ALTER)) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // EsperEPL2Ast.g:343:25: matchRecogPatternAlteration
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern1926);
            	    matchRecogPatternAlteration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt110 >= 1 ) break loop110;
                        EarlyExitException eee =
                            new EarlyExitException(110, input);
                        throw eee;
                }
                cnt110++;
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
    // EsperEPL2Ast.g:346:1: matchRecogPatternAlteration : ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) );
    public final void matchRecogPatternAlteration() throws RecognitionException {
        CommonTree o=null;

        try {
            // EsperEPL2Ast.g:347:2: ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==MATCHREC_PATTERN_CONCAT) ) {
                alt112=1;
            }
            else if ( (LA112_0==MATCHREC_PATTERN_ALTER) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // EsperEPL2Ast.g:347:4: matchRecogPatternConcat
                    {
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1941);
                    matchRecogPatternConcat();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:348:4: ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ )
                    {
                    o=(CommonTree)match(input,MATCHREC_PATTERN_ALTER,FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration1949); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1951);
                    matchRecogPatternConcat();

                    state._fsp--;

                    // EsperEPL2Ast.g:348:55: ( matchRecogPatternConcat )+
                    int cnt111=0;
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==MATCHREC_PATTERN_CONCAT) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:348:55: matchRecogPatternConcat
                    	    {
                    	    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1953);
                    	    matchRecogPatternConcat();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt111 >= 1 ) break loop111;
                                EarlyExitException eee =
                                    new EarlyExitException(111, input);
                                throw eee;
                        }
                        cnt111++;
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
    // EsperEPL2Ast.g:351:1: matchRecogPatternConcat : ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) ;
    public final void matchRecogPatternConcat() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:352:2: ( ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) )
            // EsperEPL2Ast.g:352:4: ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_CONCAT,FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat1971); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:352:32: ( matchRecogPatternUnary )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==MATCHREC_PATTERN_ATOM||LA113_0==MATCHREC_PATTERN_NESTED) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // EsperEPL2Ast.g:352:32: matchRecogPatternUnary
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat1973);
            	    matchRecogPatternUnary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
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
    // EsperEPL2Ast.g:355:1: matchRecogPatternUnary : ( matchRecogPatternNested | matchRecogPatternAtom );
    public final void matchRecogPatternUnary() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:356:2: ( matchRecogPatternNested | matchRecogPatternAtom )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==MATCHREC_PATTERN_NESTED) ) {
                alt114=1;
            }
            else if ( (LA114_0==MATCHREC_PATTERN_ATOM) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // EsperEPL2Ast.g:356:4: matchRecogPatternNested
                    {
                    pushFollow(FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary1988);
                    matchRecogPatternNested();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:357:4: matchRecogPatternAtom
                    {
                    pushFollow(FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary1993);
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
    // EsperEPL2Ast.g:360:1: matchRecogPatternNested : ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) ;
    public final void matchRecogPatternNested() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:361:2: ( ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) )
            // EsperEPL2Ast.g:361:4: ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_NESTED,FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2008); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2010);
            matchRecogPatternAlteration();

            state._fsp--;

            // EsperEPL2Ast.g:361:60: ( PLUS | STAR | QUESTION )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==STAR||(LA115_0>=PLUS && LA115_0<=QUESTION)) ) {
                alt115=1;
            }
            switch (alt115) {
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
    // EsperEPL2Ast.g:364:1: matchRecogPatternAtom : ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) ;
    public final void matchRecogPatternAtom() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:365:2: ( ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) )
            // EsperEPL2Ast.g:365:4: ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_ATOM,FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2041); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogPatternAtom2043); 
            // EsperEPL2Ast.g:365:36: ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==STAR||(LA117_0>=PLUS && LA117_0<=QUESTION)) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // EsperEPL2Ast.g:365:38: ( PLUS | STAR | QUESTION ) ( QUESTION )?
                    {
                    if ( input.LA(1)==STAR||(input.LA(1)>=PLUS && input.LA(1)<=QUESTION) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:365:63: ( QUESTION )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==QUESTION) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // EsperEPL2Ast.g:365:63: QUESTION
                            {
                            match(input,QUESTION,FOLLOW_QUESTION_in_matchRecogPatternAtom2059); 

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
    // EsperEPL2Ast.g:368:1: matchRecogDefine : ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) ;
    public final void matchRecogDefine() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:369:2: ( ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) )
            // EsperEPL2Ast.g:369:4: ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ )
            {
            p=(CommonTree)match(input,MATCHREC_DEFINE,FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2081); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:369:24: ( matchRecogDefineItem )+
            int cnt118=0;
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==MATCHREC_DEFINE_ITEM) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // EsperEPL2Ast.g:369:24: matchRecogDefineItem
            	    {
            	    pushFollow(FOLLOW_matchRecogDefineItem_in_matchRecogDefine2083);
            	    matchRecogDefineItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt118 >= 1 ) break loop118;
                        EarlyExitException eee =
                            new EarlyExitException(118, input);
                        throw eee;
                }
                cnt118++;
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
    // EsperEPL2Ast.g:372:1: matchRecogDefineItem : ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) ;
    public final void matchRecogDefineItem() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:373:2: ( ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) )
            // EsperEPL2Ast.g:373:4: ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr )
            {
            d=(CommonTree)match(input,MATCHREC_DEFINE_ITEM,FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2100); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogDefineItem2102); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogDefineItem2104);
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
    // EsperEPL2Ast.g:377:1: selectionList : selectionListElement ( selectionListElement )* ;
    public final void selectionList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:378:2: ( selectionListElement ( selectionListElement )* )
            // EsperEPL2Ast.g:378:4: selectionListElement ( selectionListElement )*
            {
            pushFollow(FOLLOW_selectionListElement_in_selectionList2121);
            selectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:378:25: ( selectionListElement )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( ((LA119_0>=SELECTION_ELEMENT_EXPR && LA119_0<=SELECTION_STREAM)||LA119_0==WILDCARD_SELECT) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // EsperEPL2Ast.g:378:26: selectionListElement
            	    {
            	    pushFollow(FOLLOW_selectionListElement_in_selectionList2124);
            	    selectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop119;
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
    // EsperEPL2Ast.g:381:1: selectionListElement : (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void selectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:382:2: (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt122=3;
            switch ( input.LA(1) ) {
            case WILDCARD_SELECT:
                {
                alt122=1;
                }
                break;
            case SELECTION_ELEMENT_EXPR:
                {
                alt122=2;
                }
                break;
            case SELECTION_STREAM:
                {
                alt122=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // EsperEPL2Ast.g:382:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_selectionListElement2140); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:383:4: ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2150); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_selectionListElement2152);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:383:41: ( IDENT )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==IDENT) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // EsperEPL2Ast.g:383:42: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2155); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:384:4: ^(s= SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,SELECTION_STREAM,FOLLOW_SELECTION_STREAM_in_selectionListElement2169); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2171); 
                    // EsperEPL2Ast.g:384:31: ( IDENT )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==IDENT) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // EsperEPL2Ast.g:384:32: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2174); 

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
    // EsperEPL2Ast.g:387:1: outerJoin : ( ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? ) );
    public final void outerJoin() throws RecognitionException {
        CommonTree tl=null;
        CommonTree tr=null;
        CommonTree tf=null;
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:388:2: ( ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? ) )
            int alt127=4;
            switch ( input.LA(1) ) {
            case LEFT_OUTERJOIN_EXPR:
                {
                alt127=1;
                }
                break;
            case RIGHT_OUTERJOIN_EXPR:
                {
                alt127=2;
                }
                break;
            case FULL_OUTERJOIN_EXPR:
                {
                alt127=3;
                }
                break;
            case INNERJOIN_EXPR:
                {
                alt127=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // EsperEPL2Ast.g:388:4: ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tl=(CommonTree)match(input,LEFT_OUTERJOIN_EXPR,FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2196); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2198); 
                    // EsperEPL2Ast.g:388:32: ( outerJoinIdent )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==EVENT_PROP_EXPR) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // EsperEPL2Ast.g:388:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2200);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tl); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:389:4: ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tr=(CommonTree)match(input,RIGHT_OUTERJOIN_EXPR,FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2213); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2215); 
                    // EsperEPL2Ast.g:389:33: ( outerJoinIdent )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==EVENT_PROP_EXPR) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // EsperEPL2Ast.g:389:33: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2217);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tr); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:390:4: ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tf=(CommonTree)match(input,FULL_OUTERJOIN_EXPR,FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2230); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2232); 
                    // EsperEPL2Ast.g:390:32: ( outerJoinIdent )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==EVENT_PROP_EXPR) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // EsperEPL2Ast.g:390:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2234);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tf); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:391:4: ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    i=(CommonTree)match(input,INNERJOIN_EXPR,FOLLOW_INNERJOIN_EXPR_in_outerJoin2247); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2249); 
                    // EsperEPL2Ast.g:391:26: ( outerJoinIdent )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==EVENT_PROP_EXPR) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // EsperEPL2Ast.g:391:26: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2251);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

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
    // $ANTLR end "outerJoin"


    // $ANTLR start "outerJoinIdent"
    // EsperEPL2Ast.g:394:1: outerJoinIdent : eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ;
    public final void outerJoinIdent() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:395:2: ( eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* )
            // EsperEPL2Ast.g:395:4: eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )*
            {
            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2267);
            eventPropertyExpr(true);

            state._fsp--;

            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2270);
            eventPropertyExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:395:52: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==EVENT_PROP_EXPR) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // EsperEPL2Ast.g:395:53: eventPropertyExpr[true] eventPropertyExpr[true]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2274);
            	    eventPropertyExpr(true);

            	    state._fsp--;

            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2277);
            	    eventPropertyExpr(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop128;
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
    // $ANTLR end "outerJoinIdent"


    // $ANTLR start "streamExpression"
    // EsperEPL2Ast.g:398:1: streamExpression : ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) ;
    public final void streamExpression() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:399:2: ( ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:399:4: ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_streamExpression2294); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:399:20: ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression )
            int alt129=4;
            switch ( input.LA(1) ) {
            case EVENT_FILTER_EXPR:
                {
                alt129=1;
                }
                break;
            case PATTERN_INCL_EXPR:
                {
                alt129=2;
                }
                break;
            case DATABASE_JOIN_EXPR:
                {
                alt129=3;
                }
                break;
            case METHOD_JOIN_EXPR:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // EsperEPL2Ast.g:399:21: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_streamExpression2297);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:399:45: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_streamExpression2302);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:399:74: databaseJoinExpression
                    {
                    pushFollow(FOLLOW_databaseJoinExpression_in_streamExpression2306);
                    databaseJoinExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:399:99: methodJoinExpression
                    {
                    pushFollow(FOLLOW_methodJoinExpression_in_streamExpression2310);
                    methodJoinExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:399:121: ( viewListExpr )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==VIEW_EXPR) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // EsperEPL2Ast.g:399:122: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_streamExpression2314);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:399:137: ( IDENT )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==IDENT) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // EsperEPL2Ast.g:399:138: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_streamExpression2319); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:399:146: ( UNIDIRECTIONAL )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==UNIDIRECTIONAL) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // EsperEPL2Ast.g:399:147: UNIDIRECTIONAL
                    {
                    match(input,UNIDIRECTIONAL,FOLLOW_UNIDIRECTIONAL_in_streamExpression2324); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:399:164: ( RETAINUNION | RETAININTERSECTION )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=RETAINUNION && LA133_0<=RETAININTERSECTION)) ) {
                alt133=1;
            }
            switch (alt133) {
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
    // EsperEPL2Ast.g:402:1: eventFilterExpr[boolean isLeaveNode] : ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) ;
    public final void eventFilterExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:403:2: ( ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:403:4: ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,EVENT_FILTER_EXPR,FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2353); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:403:27: ( IDENT )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==IDENT) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // EsperEPL2Ast.g:403:27: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_eventFilterExpr2355); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_eventFilterExpr2358); 
            // EsperEPL2Ast.g:403:46: ( propertyExpression )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // EsperEPL2Ast.g:403:46: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_eventFilterExpr2360);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:403:66: ( valueExpr )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( ((LA136_0>=IN_SET && LA136_0<=REGEXP)||LA136_0==NOT_EXPR||(LA136_0>=SUM && LA136_0<=AVG)||(LA136_0>=COALESCE && LA136_0<=COUNT)||(LA136_0>=CASE && LA136_0<=CASE2)||(LA136_0>=PREVIOUS && LA136_0<=EXISTS)||(LA136_0>=INSTANCEOF && LA136_0<=CURRENT_TIMESTAMP)||LA136_0==NEWKW||(LA136_0>=EVAL_AND_EXPR && LA136_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA136_0==EVENT_PROP_EXPR||LA136_0==CONCAT||(LA136_0>=LIB_FUNC_CHAIN && LA136_0<=DOT_EXPR)||LA136_0==ARRAY_EXPR||(LA136_0>=NOT_IN_SET && LA136_0<=NOT_REGEXP)||(LA136_0>=IN_RANGE && LA136_0<=SUBSELECT_EXPR)||(LA136_0>=EXISTS_SUBSELECT_EXPR && LA136_0<=NOT_IN_SUBSELECT_EXPR)||LA136_0==SUBSTITUTION||(LA136_0>=FIRST_AGGREG && LA136_0<=WINDOW_AGGREG)||(LA136_0>=INT_TYPE && LA136_0<=NULL_TYPE)||(LA136_0>=STAR && LA136_0<=PLUS)||(LA136_0>=BAND && LA136_0<=BXOR)||(LA136_0>=LT && LA136_0<=GE)||(LA136_0>=MINUS && LA136_0<=MOD)||(LA136_0>=EVAL_IS_GROUP_EXPR && LA136_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // EsperEPL2Ast.g:403:67: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_eventFilterExpr2364);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop136;
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
    // EsperEPL2Ast.g:406:1: propertyExpression : ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) ;
    public final void propertyExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:407:2: ( ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) )
            // EsperEPL2Ast.g:407:4: ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* )
            {
            match(input,EVENT_FILTER_PROPERTY_EXPR,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2384); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:407:34: ( propertyExpressionAtom )*
                loop137:
                do {
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==EVENT_FILTER_PROPERTY_EXPR_ATOM) ) {
                        alt137=1;
                    }


                    switch (alt137) {
                	case 1 :
                	    // EsperEPL2Ast.g:407:34: propertyExpressionAtom
                	    {
                	    pushFollow(FOLLOW_propertyExpressionAtom_in_propertyExpression2386);
                	    propertyExpressionAtom();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop137;
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
    // EsperEPL2Ast.g:410:1: propertyExpressionAtom : ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) ;
    public final void propertyExpressionAtom() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:411:2: ( ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) )
            // EsperEPL2Ast.g:411:4: ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) )
            {
            a=(CommonTree)match(input,EVENT_FILTER_PROPERTY_EXPR_ATOM,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2405); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:411:41: ( ^( SELECT ( propertySelectionListElement )+ ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==SELECT) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // EsperEPL2Ast.g:411:42: ^( SELECT ( propertySelectionListElement )+ )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_propertyExpressionAtom2409); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:411:51: ( propertySelectionListElement )+
                    int cnt138=0;
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( ((LA138_0>=PROPERTY_SELECTION_ELEMENT_EXPR && LA138_0<=PROPERTY_WILDCARD_SELECT)) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:411:51: propertySelectionListElement
                    	    {
                    	    pushFollow(FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2411);
                    	    propertySelectionListElement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt138 >= 1 ) break loop138;
                                EarlyExitException eee =
                                    new EarlyExitException(138, input);
                                throw eee;
                        }
                        cnt138++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2417);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:411:94: ( ^( ATCHAR IDENT IDENT ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ATCHAR) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // EsperEPL2Ast.g:411:95: ^( ATCHAR IDENT IDENT )
                    {
                    match(input,ATCHAR,FOLLOW_ATCHAR_in_propertyExpressionAtom2421); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2423); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2425); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:411:119: ( IDENT )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==IDENT) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // EsperEPL2Ast.g:411:119: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2430); 

                    }
                    break;

            }

            match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2434); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:411:139: ( valueExpr )?
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( ((LA142_0>=IN_SET && LA142_0<=REGEXP)||LA142_0==NOT_EXPR||(LA142_0>=SUM && LA142_0<=AVG)||(LA142_0>=COALESCE && LA142_0<=COUNT)||(LA142_0>=CASE && LA142_0<=CASE2)||(LA142_0>=PREVIOUS && LA142_0<=EXISTS)||(LA142_0>=INSTANCEOF && LA142_0<=CURRENT_TIMESTAMP)||LA142_0==NEWKW||(LA142_0>=EVAL_AND_EXPR && LA142_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA142_0==EVENT_PROP_EXPR||LA142_0==CONCAT||(LA142_0>=LIB_FUNC_CHAIN && LA142_0<=DOT_EXPR)||LA142_0==ARRAY_EXPR||(LA142_0>=NOT_IN_SET && LA142_0<=NOT_REGEXP)||(LA142_0>=IN_RANGE && LA142_0<=SUBSELECT_EXPR)||(LA142_0>=EXISTS_SUBSELECT_EXPR && LA142_0<=NOT_IN_SUBSELECT_EXPR)||LA142_0==SUBSTITUTION||(LA142_0>=FIRST_AGGREG && LA142_0<=WINDOW_AGGREG)||(LA142_0>=INT_TYPE && LA142_0<=NULL_TYPE)||(LA142_0>=STAR && LA142_0<=PLUS)||(LA142_0>=BAND && LA142_0<=BXOR)||(LA142_0>=LT && LA142_0<=GE)||(LA142_0>=MINUS && LA142_0<=MOD)||(LA142_0>=EVAL_IS_GROUP_EXPR && LA142_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt142=1;
                }
                switch (alt142) {
                    case 1 :
                        // EsperEPL2Ast.g:411:139: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2436);
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
    // EsperEPL2Ast.g:414:1: propertySelectionListElement : (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void propertySelectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:415:2: (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt145=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt145=1;
                }
                break;
            case PROPERTY_SELECTION_ELEMENT_EXPR:
                {
                alt145=2;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt145=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // EsperEPL2Ast.g:415:4: w= PROPERTY_WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2456); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:416:4: ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,PROPERTY_SELECTION_ELEMENT_EXPR,FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2466); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_propertySelectionListElement2468);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:416:50: ( IDENT )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==IDENT) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // EsperEPL2Ast.g:416:51: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2471); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:417:4: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2485); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2487); 
                    // EsperEPL2Ast.g:417:40: ( IDENT )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==IDENT) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // EsperEPL2Ast.g:417:41: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2490); 

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
    // EsperEPL2Ast.g:420:1: patternInclusionExpression : ^(p= PATTERN_INCL_EXPR exprChoice ) ;
    public final void patternInclusionExpression() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:421:2: ( ^(p= PATTERN_INCL_EXPR exprChoice ) )
            // EsperEPL2Ast.g:421:4: ^(p= PATTERN_INCL_EXPR exprChoice )
            {
            p=(CommonTree)match(input,PATTERN_INCL_EXPR,FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2511); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_exprChoice_in_patternInclusionExpression2513);
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
    // EsperEPL2Ast.g:424:1: databaseJoinExpression : ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) ;
    public final void databaseJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:425:2: ( ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) )
            // EsperEPL2Ast.g:425:4: ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? )
            {
            match(input,DATABASE_JOIN_EXPR,FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2530); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_databaseJoinExpression2532); 
            if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // EsperEPL2Ast.g:425:72: ( STRING_LITERAL | QUOTED_STRING_LITERAL )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=STRING_LITERAL && LA146_0<=QUOTED_STRING_LITERAL)) ) {
                alt146=1;
            }
            switch (alt146) {
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
    // EsperEPL2Ast.g:428:1: methodJoinExpression : ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) ;
    public final void methodJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:429:2: ( ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:429:4: ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* )
            {
            match(input,METHOD_JOIN_EXPR,FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2563); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_methodJoinExpression2565); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_methodJoinExpression2567); 
            // EsperEPL2Ast.g:429:41: ( valueExpr )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( ((LA147_0>=IN_SET && LA147_0<=REGEXP)||LA147_0==NOT_EXPR||(LA147_0>=SUM && LA147_0<=AVG)||(LA147_0>=COALESCE && LA147_0<=COUNT)||(LA147_0>=CASE && LA147_0<=CASE2)||(LA147_0>=PREVIOUS && LA147_0<=EXISTS)||(LA147_0>=INSTANCEOF && LA147_0<=CURRENT_TIMESTAMP)||LA147_0==NEWKW||(LA147_0>=EVAL_AND_EXPR && LA147_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA147_0==EVENT_PROP_EXPR||LA147_0==CONCAT||(LA147_0>=LIB_FUNC_CHAIN && LA147_0<=DOT_EXPR)||LA147_0==ARRAY_EXPR||(LA147_0>=NOT_IN_SET && LA147_0<=NOT_REGEXP)||(LA147_0>=IN_RANGE && LA147_0<=SUBSELECT_EXPR)||(LA147_0>=EXISTS_SUBSELECT_EXPR && LA147_0<=NOT_IN_SUBSELECT_EXPR)||LA147_0==SUBSTITUTION||(LA147_0>=FIRST_AGGREG && LA147_0<=WINDOW_AGGREG)||(LA147_0>=INT_TYPE && LA147_0<=NULL_TYPE)||(LA147_0>=STAR && LA147_0<=PLUS)||(LA147_0>=BAND && LA147_0<=BXOR)||(LA147_0>=LT && LA147_0<=GE)||(LA147_0>=MINUS && LA147_0<=MOD)||(LA147_0>=EVAL_IS_GROUP_EXPR && LA147_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // EsperEPL2Ast.g:429:42: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_methodJoinExpression2570);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop147;
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
    // EsperEPL2Ast.g:432:1: viewListExpr : viewExpr ( viewExpr )* ;
    public final void viewListExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:433:2: ( viewExpr ( viewExpr )* )
            // EsperEPL2Ast.g:433:4: viewExpr ( viewExpr )*
            {
            pushFollow(FOLLOW_viewExpr_in_viewListExpr2584);
            viewExpr();

            state._fsp--;

            // EsperEPL2Ast.g:433:13: ( viewExpr )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==VIEW_EXPR) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // EsperEPL2Ast.g:433:14: viewExpr
            	    {
            	    pushFollow(FOLLOW_viewExpr_in_viewListExpr2587);
            	    viewExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop148;
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
    // EsperEPL2Ast.g:436:1: viewExpr : ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) ;
    public final void viewExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:437:2: ( ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            // EsperEPL2Ast.g:437:4: ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* )
            {
            n=(CommonTree)match(input,VIEW_EXPR,FOLLOW_VIEW_EXPR_in_viewExpr2604); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2606); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2608); 
            // EsperEPL2Ast.g:437:30: ( valueExprWithTime )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( ((LA149_0>=IN_SET && LA149_0<=REGEXP)||LA149_0==NOT_EXPR||(LA149_0>=SUM && LA149_0<=AVG)||(LA149_0>=COALESCE && LA149_0<=COUNT)||(LA149_0>=CASE && LA149_0<=CASE2)||LA149_0==LAST||(LA149_0>=PREVIOUS && LA149_0<=EXISTS)||(LA149_0>=LW && LA149_0<=CURRENT_TIMESTAMP)||LA149_0==NEWKW||(LA149_0>=NUMERIC_PARAM_RANGE && LA149_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA149_0>=EVAL_AND_EXPR && LA149_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA149_0==EVENT_PROP_EXPR||LA149_0==CONCAT||(LA149_0>=LIB_FUNC_CHAIN && LA149_0<=DOT_EXPR)||(LA149_0>=TIME_PERIOD && LA149_0<=ARRAY_EXPR)||(LA149_0>=NOT_IN_SET && LA149_0<=NOT_REGEXP)||(LA149_0>=IN_RANGE && LA149_0<=SUBSELECT_EXPR)||(LA149_0>=EXISTS_SUBSELECT_EXPR && LA149_0<=NOT_IN_SUBSELECT_EXPR)||(LA149_0>=LAST_OPERATOR && LA149_0<=SUBSTITUTION)||LA149_0==NUMBERSETSTAR||(LA149_0>=FIRST_AGGREG && LA149_0<=WINDOW_AGGREG)||(LA149_0>=INT_TYPE && LA149_0<=NULL_TYPE)||(LA149_0>=STAR && LA149_0<=PLUS)||(LA149_0>=BAND && LA149_0<=BXOR)||(LA149_0>=LT && LA149_0<=GE)||(LA149_0>=MINUS && LA149_0<=MOD)||(LA149_0>=EVAL_IS_GROUP_EXPR && LA149_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // EsperEPL2Ast.g:437:31: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_viewExpr2611);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop149;
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
    // EsperEPL2Ast.g:440:1: whereClause[boolean isLeaveNode] : ^(n= WHERE_EXPR valueExpr ) ;
    public final void whereClause(boolean isLeaveNode) throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:441:2: ( ^(n= WHERE_EXPR valueExpr ) )
            // EsperEPL2Ast.g:441:4: ^(n= WHERE_EXPR valueExpr )
            {
            n=(CommonTree)match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_whereClause2633); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_whereClause2635);
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
    // EsperEPL2Ast.g:444:1: groupByClause : ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) ;
    public final void groupByClause() throws RecognitionException {
        CommonTree g=null;

        try {
            // EsperEPL2Ast.g:445:2: ( ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:445:4: ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* )
            {
            g=(CommonTree)match(input,GROUP_BY_EXPR,FOLLOW_GROUP_BY_EXPR_in_groupByClause2653); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_groupByClause2655);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:445:32: ( valueExpr )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( ((LA150_0>=IN_SET && LA150_0<=REGEXP)||LA150_0==NOT_EXPR||(LA150_0>=SUM && LA150_0<=AVG)||(LA150_0>=COALESCE && LA150_0<=COUNT)||(LA150_0>=CASE && LA150_0<=CASE2)||(LA150_0>=PREVIOUS && LA150_0<=EXISTS)||(LA150_0>=INSTANCEOF && LA150_0<=CURRENT_TIMESTAMP)||LA150_0==NEWKW||(LA150_0>=EVAL_AND_EXPR && LA150_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA150_0==EVENT_PROP_EXPR||LA150_0==CONCAT||(LA150_0>=LIB_FUNC_CHAIN && LA150_0<=DOT_EXPR)||LA150_0==ARRAY_EXPR||(LA150_0>=NOT_IN_SET && LA150_0<=NOT_REGEXP)||(LA150_0>=IN_RANGE && LA150_0<=SUBSELECT_EXPR)||(LA150_0>=EXISTS_SUBSELECT_EXPR && LA150_0<=NOT_IN_SUBSELECT_EXPR)||LA150_0==SUBSTITUTION||(LA150_0>=FIRST_AGGREG && LA150_0<=WINDOW_AGGREG)||(LA150_0>=INT_TYPE && LA150_0<=NULL_TYPE)||(LA150_0>=STAR && LA150_0<=PLUS)||(LA150_0>=BAND && LA150_0<=BXOR)||(LA150_0>=LT && LA150_0<=GE)||(LA150_0>=MINUS && LA150_0<=MOD)||(LA150_0>=EVAL_IS_GROUP_EXPR && LA150_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // EsperEPL2Ast.g:445:33: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_groupByClause2658);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop150;
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
    // EsperEPL2Ast.g:448:1: orderByClause : ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) ;
    public final void orderByClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:449:2: ( ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) )
            // EsperEPL2Ast.g:449:4: ^( ORDER_BY_EXPR orderByElement ( orderByElement )* )
            {
            match(input,ORDER_BY_EXPR,FOLLOW_ORDER_BY_EXPR_in_orderByClause2676); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_orderByElement_in_orderByClause2678);
            orderByElement();

            state._fsp--;

            // EsperEPL2Ast.g:449:35: ( orderByElement )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==ORDER_ELEMENT_EXPR) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // EsperEPL2Ast.g:449:36: orderByElement
            	    {
            	    pushFollow(FOLLOW_orderByElement_in_orderByClause2681);
            	    orderByElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop151;
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
    // EsperEPL2Ast.g:452:1: orderByElement : ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) ;
    public final void orderByElement() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:453:2: ( ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) )
            // EsperEPL2Ast.g:453:5: ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? )
            {
            e=(CommonTree)match(input,ORDER_ELEMENT_EXPR,FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement2701); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_orderByElement2703);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:453:38: ( ASC | DESC )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=ASC && LA152_0<=DESC)) ) {
                alt152=1;
            }
            switch (alt152) {
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
    // EsperEPL2Ast.g:456:1: havingClause : ^(n= HAVING_EXPR valueExpr ) ;
    public final void havingClause() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:457:2: ( ^(n= HAVING_EXPR valueExpr ) )
            // EsperEPL2Ast.g:457:4: ^(n= HAVING_EXPR valueExpr )
            {
            n=(CommonTree)match(input,HAVING_EXPR,FOLLOW_HAVING_EXPR_in_havingClause2728); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_havingClause2730);
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
    // EsperEPL2Ast.g:460:1: outputLimitExpr : ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? ) );
    public final void outputLimitExpr() throws RecognitionException {
        CommonTree e=null;
        CommonTree tp=null;
        CommonTree cron=null;
        CommonTree when=null;
        CommonTree term=null;
        CommonTree after=null;

        try {
            // EsperEPL2Ast.g:461:2: ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? ) )
            int alt172=6;
            switch ( input.LA(1) ) {
            case EVENT_LIMIT_EXPR:
                {
                alt172=1;
                }
                break;
            case TIMEPERIOD_LIMIT_EXPR:
                {
                alt172=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR:
                {
                alt172=3;
                }
                break;
            case WHEN_LIMIT_EXPR:
                {
                alt172=4;
                }
                break;
            case TERM_LIMIT_EXPR:
                {
                alt172=5;
                }
                break;
            case AFTER_LIMIT_EXPR:
                {
                alt172=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 172, 0, input);

                throw nvae;
            }

            switch (alt172) {
                case 1 :
                    // EsperEPL2Ast.g:461:4: ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    e=(CommonTree)match(input,EVENT_LIMIT_EXPR,FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr2748); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:461:25: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==ALL||(LA153_0>=FIRST && LA153_0<=LAST)||LA153_0==SNAPSHOT) ) {
                        alt153=1;
                    }
                    switch (alt153) {
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

                    // EsperEPL2Ast.g:461:52: ( number | IDENT )
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( ((LA154_0>=INT_TYPE && LA154_0<=DOUBLE_TYPE)) ) {
                        alt154=1;
                    }
                    else if ( (LA154_0==IDENT) ) {
                        alt154=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 154, 0, input);

                        throw nvae;
                    }
                    switch (alt154) {
                        case 1 :
                            // EsperEPL2Ast.g:461:53: number
                            {
                            pushFollow(FOLLOW_number_in_outputLimitExpr2762);
                            number();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:461:60: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_outputLimitExpr2764); 

                            }
                            break;

                    }

                    // EsperEPL2Ast.g:461:67: ( outputLimitAfter )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==AFTER) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // EsperEPL2Ast.g:461:67: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2767);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:461:85: ( outputLimitAndTerm )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==TERMINATED) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // EsperEPL2Ast.g:461:85: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2770);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:462:7: ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    tp=(CommonTree)match(input,TIMEPERIOD_LIMIT_EXPR,FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr2787); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:462:34: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==ALL||(LA157_0>=FIRST && LA157_0<=LAST)||LA157_0==SNAPSHOT) ) {
                        alt157=1;
                    }
                    switch (alt157) {
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

                    pushFollow(FOLLOW_timePeriod_in_outputLimitExpr2800);
                    timePeriod();

                    state._fsp--;

                    // EsperEPL2Ast.g:462:72: ( outputLimitAfter )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==AFTER) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // EsperEPL2Ast.g:462:72: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2802);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:462:90: ( outputLimitAndTerm )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==TERMINATED) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // EsperEPL2Ast.g:462:90: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2805);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tp); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:463:7: ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    cron=(CommonTree)match(input,CRONTAB_LIMIT_EXPR,FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr2821); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:463:33: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==ALL||(LA160_0>=FIRST && LA160_0<=LAST)||LA160_0==SNAPSHOT) ) {
                        alt160=1;
                    }
                    switch (alt160) {
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

                    pushFollow(FOLLOW_crontabLimitParameterSet_in_outputLimitExpr2834);
                    crontabLimitParameterSet();

                    state._fsp--;

                    // EsperEPL2Ast.g:463:85: ( outputLimitAfter )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==AFTER) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // EsperEPL2Ast.g:463:85: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2836);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:463:103: ( outputLimitAndTerm )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( (LA162_0==TERMINATED) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // EsperEPL2Ast.g:463:103: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2839);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(cron); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:464:7: ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    when=(CommonTree)match(input,WHEN_LIMIT_EXPR,FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr2855); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:464:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==ALL||(LA163_0>=FIRST && LA163_0<=LAST)||LA163_0==SNAPSHOT) ) {
                        alt163=1;
                    }
                    switch (alt163) {
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

                    pushFollow(FOLLOW_valueExpr_in_outputLimitExpr2868);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:464:67: ( onSetExpr )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==ON_SET_EXPR) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // EsperEPL2Ast.g:464:67: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr2870);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:464:78: ( outputLimitAfter )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==AFTER) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // EsperEPL2Ast.g:464:78: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2873);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:464:96: ( outputLimitAndTerm )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==TERMINATED) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // EsperEPL2Ast.g:464:96: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2876);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(when); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:465:7: ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    term=(CommonTree)match(input,TERM_LIMIT_EXPR,FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr2892); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:465:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==ALL||(LA167_0>=FIRST && LA167_0<=LAST)||LA167_0==SNAPSHOT) ) {
                        alt167=1;
                    }
                    switch (alt167) {
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

                    pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2905);
                    outputLimitAndTerm();

                    state._fsp--;

                    // EsperEPL2Ast.g:465:76: ( onSetExpr )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==ON_SET_EXPR) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // EsperEPL2Ast.g:465:76: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr2907);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:465:87: ( outputLimitAfter )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==AFTER) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // EsperEPL2Ast.g:465:87: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2910);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:465:105: ( outputLimitAndTerm )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==TERMINATED) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // EsperEPL2Ast.g:465:105: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2913);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(term); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:466:4: ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? )
                    {
                    after=(CommonTree)match(input,AFTER_LIMIT_EXPR,FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr2926); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2928);
                    outputLimitAfter();

                    state._fsp--;

                    // EsperEPL2Ast.g:466:46: ( outputLimitAndTerm )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==TERMINATED) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // EsperEPL2Ast.g:466:46: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2930);
                            outputLimitAndTerm();

                            state._fsp--;


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


    // $ANTLR start "outputLimitAndTerm"
    // EsperEPL2Ast.g:469:1: outputLimitAndTerm : ^( TERMINATED ( valueExpr )? ( onSetExpr )? ) ;
    public final void outputLimitAndTerm() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:470:2: ( ^( TERMINATED ( valueExpr )? ( onSetExpr )? ) )
            // EsperEPL2Ast.g:470:5: ^( TERMINATED ( valueExpr )? ( onSetExpr )? )
            {
            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitAndTerm2947); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:470:18: ( valueExpr )?
                int alt173=2;
                int LA173_0 = input.LA(1);

                if ( ((LA173_0>=IN_SET && LA173_0<=REGEXP)||LA173_0==NOT_EXPR||(LA173_0>=SUM && LA173_0<=AVG)||(LA173_0>=COALESCE && LA173_0<=COUNT)||(LA173_0>=CASE && LA173_0<=CASE2)||(LA173_0>=PREVIOUS && LA173_0<=EXISTS)||(LA173_0>=INSTANCEOF && LA173_0<=CURRENT_TIMESTAMP)||LA173_0==NEWKW||(LA173_0>=EVAL_AND_EXPR && LA173_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA173_0==EVENT_PROP_EXPR||LA173_0==CONCAT||(LA173_0>=LIB_FUNC_CHAIN && LA173_0<=DOT_EXPR)||LA173_0==ARRAY_EXPR||(LA173_0>=NOT_IN_SET && LA173_0<=NOT_REGEXP)||(LA173_0>=IN_RANGE && LA173_0<=SUBSELECT_EXPR)||(LA173_0>=EXISTS_SUBSELECT_EXPR && LA173_0<=NOT_IN_SUBSELECT_EXPR)||LA173_0==SUBSTITUTION||(LA173_0>=FIRST_AGGREG && LA173_0<=WINDOW_AGGREG)||(LA173_0>=INT_TYPE && LA173_0<=NULL_TYPE)||(LA173_0>=STAR && LA173_0<=PLUS)||(LA173_0>=BAND && LA173_0<=BXOR)||(LA173_0>=LT && LA173_0<=GE)||(LA173_0>=MINUS && LA173_0<=MOD)||(LA173_0>=EVAL_IS_GROUP_EXPR && LA173_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt173=1;
                }
                switch (alt173) {
                    case 1 :
                        // EsperEPL2Ast.g:470:18: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_outputLimitAndTerm2949);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:470:29: ( onSetExpr )?
                int alt174=2;
                int LA174_0 = input.LA(1);

                if ( (LA174_0==ON_SET_EXPR) ) {
                    alt174=1;
                }
                switch (alt174) {
                    case 1 :
                        // EsperEPL2Ast.g:470:29: onSetExpr
                        {
                        pushFollow(FOLLOW_onSetExpr_in_outputLimitAndTerm2952);
                        onSetExpr();

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
    // $ANTLR end "outputLimitAndTerm"


    // $ANTLR start "outputLimitAfter"
    // EsperEPL2Ast.g:473:1: outputLimitAfter : ^( AFTER ( timePeriod )? ( number )? ) ;
    public final void outputLimitAfter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:474:2: ( ^( AFTER ( timePeriod )? ( number )? ) )
            // EsperEPL2Ast.g:474:4: ^( AFTER ( timePeriod )? ( number )? )
            {
            match(input,AFTER,FOLLOW_AFTER_in_outputLimitAfter2966); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:474:12: ( timePeriod )?
                int alt175=2;
                int LA175_0 = input.LA(1);

                if ( (LA175_0==TIME_PERIOD) ) {
                    alt175=1;
                }
                switch (alt175) {
                    case 1 :
                        // EsperEPL2Ast.g:474:12: timePeriod
                        {
                        pushFollow(FOLLOW_timePeriod_in_outputLimitAfter2968);
                        timePeriod();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:474:24: ( number )?
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( ((LA176_0>=INT_TYPE && LA176_0<=DOUBLE_TYPE)) ) {
                    alt176=1;
                }
                switch (alt176) {
                    case 1 :
                        // EsperEPL2Ast.g:474:24: number
                        {
                        pushFollow(FOLLOW_number_in_outputLimitAfter2971);
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
    // EsperEPL2Ast.g:477:1: rowLimitClause : ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) ;
    public final void rowLimitClause() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:478:2: ( ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) )
            // EsperEPL2Ast.g:478:4: ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? )
            {
            e=(CommonTree)match(input,ROW_LIMIT_EXPR,FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause2987); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:478:23: ( number | IDENT )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( ((LA177_0>=INT_TYPE && LA177_0<=DOUBLE_TYPE)) ) {
                alt177=1;
            }
            else if ( (LA177_0==IDENT) ) {
                alt177=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // EsperEPL2Ast.g:478:24: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause2990);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:478:31: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause2992); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:478:38: ( number | IDENT )?
            int alt178=3;
            int LA178_0 = input.LA(1);

            if ( ((LA178_0>=INT_TYPE && LA178_0<=DOUBLE_TYPE)) ) {
                alt178=1;
            }
            else if ( (LA178_0==IDENT) ) {
                alt178=2;
            }
            switch (alt178) {
                case 1 :
                    // EsperEPL2Ast.g:478:39: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause2996);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:478:46: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause2998); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:478:54: ( COMMA )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==COMMA) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // EsperEPL2Ast.g:478:54: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_rowLimitClause3002); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:478:61: ( OFFSET )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==OFFSET) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // EsperEPL2Ast.g:478:61: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_rowLimitClause3005); 

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
    // EsperEPL2Ast.g:481:1: crontabLimitParameterSet : ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? ) ;
    public final void crontabLimitParameterSet() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:482:2: ( ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? ) )
            // EsperEPL2Ast.g:482:4: ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? )
            {
            match(input,CRONTAB_LIMIT_EXPR_PARAM,FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3023); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3025);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3027);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3029);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3031);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3033);
            valueExprWithTime();

            state._fsp--;

            // EsperEPL2Ast.g:482:121: ( valueExprWithTime )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( ((LA181_0>=IN_SET && LA181_0<=REGEXP)||LA181_0==NOT_EXPR||(LA181_0>=SUM && LA181_0<=AVG)||(LA181_0>=COALESCE && LA181_0<=COUNT)||(LA181_0>=CASE && LA181_0<=CASE2)||LA181_0==LAST||(LA181_0>=PREVIOUS && LA181_0<=EXISTS)||(LA181_0>=LW && LA181_0<=CURRENT_TIMESTAMP)||LA181_0==NEWKW||(LA181_0>=NUMERIC_PARAM_RANGE && LA181_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA181_0>=EVAL_AND_EXPR && LA181_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA181_0==EVENT_PROP_EXPR||LA181_0==CONCAT||(LA181_0>=LIB_FUNC_CHAIN && LA181_0<=DOT_EXPR)||(LA181_0>=TIME_PERIOD && LA181_0<=ARRAY_EXPR)||(LA181_0>=NOT_IN_SET && LA181_0<=NOT_REGEXP)||(LA181_0>=IN_RANGE && LA181_0<=SUBSELECT_EXPR)||(LA181_0>=EXISTS_SUBSELECT_EXPR && LA181_0<=NOT_IN_SUBSELECT_EXPR)||(LA181_0>=LAST_OPERATOR && LA181_0<=SUBSTITUTION)||LA181_0==NUMBERSETSTAR||(LA181_0>=FIRST_AGGREG && LA181_0<=WINDOW_AGGREG)||(LA181_0>=INT_TYPE && LA181_0<=NULL_TYPE)||(LA181_0>=STAR && LA181_0<=PLUS)||(LA181_0>=BAND && LA181_0<=BXOR)||(LA181_0>=LT && LA181_0<=GE)||(LA181_0>=MINUS && LA181_0<=MOD)||(LA181_0>=EVAL_IS_GROUP_EXPR && LA181_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // EsperEPL2Ast.g:482:121: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3035);
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
    // EsperEPL2Ast.g:485:1: relationalExpr : ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) );
    public final void relationalExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:486:2: ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) )
            int alt182=4;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt182=1;
                }
                break;
            case GT:
                {
                alt182=2;
                }
                break;
            case LE:
                {
                alt182=3;
                }
                break;
            case GE:
                {
                alt182=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;
            }

            switch (alt182) {
                case 1 :
                    // EsperEPL2Ast.g:486:5: ^(n= LT relationalExprValue )
                    {
                    n=(CommonTree)match(input,LT,FOLLOW_LT_in_relationalExpr3052); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3054);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:487:5: ^(n= GT relationalExprValue )
                    {
                    n=(CommonTree)match(input,GT,FOLLOW_GT_in_relationalExpr3067); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3069);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:488:5: ^(n= LE relationalExprValue )
                    {
                    n=(CommonTree)match(input,LE,FOLLOW_LE_in_relationalExpr3082); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3084);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:489:4: ^(n= GE relationalExprValue )
                    {
                    n=(CommonTree)match(input,GE,FOLLOW_GE_in_relationalExpr3096); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3098);
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
    // EsperEPL2Ast.g:492:1: relationalExprValue : ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) ;
    public final void relationalExprValue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:493:2: ( ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) )
            // EsperEPL2Ast.g:493:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            {
            // EsperEPL2Ast.g:493:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            // EsperEPL2Ast.g:494:5: valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            {
            pushFollow(FOLLOW_valueExpr_in_relationalExprValue3120);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:495:6: ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( ((LA185_0>=IN_SET && LA185_0<=REGEXP)||LA185_0==NOT_EXPR||(LA185_0>=SUM && LA185_0<=AVG)||(LA185_0>=COALESCE && LA185_0<=COUNT)||(LA185_0>=CASE && LA185_0<=CASE2)||(LA185_0>=PREVIOUS && LA185_0<=EXISTS)||(LA185_0>=INSTANCEOF && LA185_0<=CURRENT_TIMESTAMP)||LA185_0==NEWKW||(LA185_0>=EVAL_AND_EXPR && LA185_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA185_0==EVENT_PROP_EXPR||LA185_0==CONCAT||(LA185_0>=LIB_FUNC_CHAIN && LA185_0<=DOT_EXPR)||LA185_0==ARRAY_EXPR||(LA185_0>=NOT_IN_SET && LA185_0<=NOT_REGEXP)||(LA185_0>=IN_RANGE && LA185_0<=SUBSELECT_EXPR)||(LA185_0>=EXISTS_SUBSELECT_EXPR && LA185_0<=NOT_IN_SUBSELECT_EXPR)||LA185_0==SUBSTITUTION||(LA185_0>=FIRST_AGGREG && LA185_0<=WINDOW_AGGREG)||(LA185_0>=INT_TYPE && LA185_0<=NULL_TYPE)||(LA185_0>=STAR && LA185_0<=PLUS)||(LA185_0>=BAND && LA185_0<=BXOR)||(LA185_0>=LT && LA185_0<=GE)||(LA185_0>=MINUS && LA185_0<=MOD)||(LA185_0>=EVAL_IS_GROUP_EXPR && LA185_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt185=1;
            }
            else if ( ((LA185_0>=ALL && LA185_0<=SOME)) ) {
                alt185=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 185, 0, input);

                throw nvae;
            }
            switch (alt185) {
                case 1 :
                    // EsperEPL2Ast.g:495:8: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3130);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:497:6: ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
                    {
                    if ( (input.LA(1)>=ALL && input.LA(1)<=SOME) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:497:21: ( ( valueExpr )* | subSelectGroupExpr )
                    int alt184=2;
                    int LA184_0 = input.LA(1);

                    if ( (LA184_0==UP||(LA184_0>=IN_SET && LA184_0<=REGEXP)||LA184_0==NOT_EXPR||(LA184_0>=SUM && LA184_0<=AVG)||(LA184_0>=COALESCE && LA184_0<=COUNT)||(LA184_0>=CASE && LA184_0<=CASE2)||(LA184_0>=PREVIOUS && LA184_0<=EXISTS)||(LA184_0>=INSTANCEOF && LA184_0<=CURRENT_TIMESTAMP)||LA184_0==NEWKW||(LA184_0>=EVAL_AND_EXPR && LA184_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA184_0==EVENT_PROP_EXPR||LA184_0==CONCAT||(LA184_0>=LIB_FUNC_CHAIN && LA184_0<=DOT_EXPR)||LA184_0==ARRAY_EXPR||(LA184_0>=NOT_IN_SET && LA184_0<=NOT_REGEXP)||(LA184_0>=IN_RANGE && LA184_0<=SUBSELECT_EXPR)||(LA184_0>=EXISTS_SUBSELECT_EXPR && LA184_0<=NOT_IN_SUBSELECT_EXPR)||LA184_0==SUBSTITUTION||(LA184_0>=FIRST_AGGREG && LA184_0<=WINDOW_AGGREG)||(LA184_0>=INT_TYPE && LA184_0<=NULL_TYPE)||(LA184_0>=STAR && LA184_0<=PLUS)||(LA184_0>=BAND && LA184_0<=BXOR)||(LA184_0>=LT && LA184_0<=GE)||(LA184_0>=MINUS && LA184_0<=MOD)||(LA184_0>=EVAL_IS_GROUP_EXPR && LA184_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt184=1;
                    }
                    else if ( (LA184_0==SUBSELECT_GROUP_EXPR) ) {
                        alt184=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 184, 0, input);

                        throw nvae;
                    }
                    switch (alt184) {
                        case 1 :
                            // EsperEPL2Ast.g:497:22: ( valueExpr )*
                            {
                            // EsperEPL2Ast.g:497:22: ( valueExpr )*
                            loop183:
                            do {
                                int alt183=2;
                                int LA183_0 = input.LA(1);

                                if ( ((LA183_0>=IN_SET && LA183_0<=REGEXP)||LA183_0==NOT_EXPR||(LA183_0>=SUM && LA183_0<=AVG)||(LA183_0>=COALESCE && LA183_0<=COUNT)||(LA183_0>=CASE && LA183_0<=CASE2)||(LA183_0>=PREVIOUS && LA183_0<=EXISTS)||(LA183_0>=INSTANCEOF && LA183_0<=CURRENT_TIMESTAMP)||LA183_0==NEWKW||(LA183_0>=EVAL_AND_EXPR && LA183_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA183_0==EVENT_PROP_EXPR||LA183_0==CONCAT||(LA183_0>=LIB_FUNC_CHAIN && LA183_0<=DOT_EXPR)||LA183_0==ARRAY_EXPR||(LA183_0>=NOT_IN_SET && LA183_0<=NOT_REGEXP)||(LA183_0>=IN_RANGE && LA183_0<=SUBSELECT_EXPR)||(LA183_0>=EXISTS_SUBSELECT_EXPR && LA183_0<=NOT_IN_SUBSELECT_EXPR)||LA183_0==SUBSTITUTION||(LA183_0>=FIRST_AGGREG && LA183_0<=WINDOW_AGGREG)||(LA183_0>=INT_TYPE && LA183_0<=NULL_TYPE)||(LA183_0>=STAR && LA183_0<=PLUS)||(LA183_0>=BAND && LA183_0<=BXOR)||(LA183_0>=LT && LA183_0<=GE)||(LA183_0>=MINUS && LA183_0<=MOD)||(LA183_0>=EVAL_IS_GROUP_EXPR && LA183_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt183=1;
                                }


                                switch (alt183) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:497:22: valueExpr
                            	    {
                            	    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3154);
                            	    valueExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop183;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:497:35: subSelectGroupExpr
                            {
                            pushFollow(FOLLOW_subSelectGroupExpr_in_relationalExprValue3159);
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
    // EsperEPL2Ast.g:502:1: evalExprChoice : ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr );
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
            // EsperEPL2Ast.g:503:2: ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr )
            int alt188=12;
            switch ( input.LA(1) ) {
            case EVAL_OR_EXPR:
                {
                alt188=1;
                }
                break;
            case EVAL_AND_EXPR:
                {
                alt188=2;
                }
                break;
            case EVAL_EQUALS_EXPR:
                {
                alt188=3;
                }
                break;
            case EVAL_IS_EXPR:
                {
                alt188=4;
                }
                break;
            case EVAL_NOTEQUALS_EXPR:
                {
                alt188=5;
                }
                break;
            case EVAL_ISNOT_EXPR:
                {
                alt188=6;
                }
                break;
            case EVAL_EQUALS_GROUP_EXPR:
                {
                alt188=7;
                }
                break;
            case EVAL_IS_GROUP_EXPR:
                {
                alt188=8;
                }
                break;
            case EVAL_NOTEQUALS_GROUP_EXPR:
                {
                alt188=9;
                }
                break;
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt188=10;
                }
                break;
            case NOT_EXPR:
                {
                alt188=11;
                }
                break;
            case LT:
            case GT:
            case LE:
            case GE:
                {
                alt188=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 188, 0, input);

                throw nvae;
            }

            switch (alt188) {
                case 1 :
                    // EsperEPL2Ast.g:503:4: ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    jo=(CommonTree)match(input,EVAL_OR_EXPR,FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3185); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3187);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3189);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:503:42: ( valueExpr )*
                    loop186:
                    do {
                        int alt186=2;
                        int LA186_0 = input.LA(1);

                        if ( ((LA186_0>=IN_SET && LA186_0<=REGEXP)||LA186_0==NOT_EXPR||(LA186_0>=SUM && LA186_0<=AVG)||(LA186_0>=COALESCE && LA186_0<=COUNT)||(LA186_0>=CASE && LA186_0<=CASE2)||(LA186_0>=PREVIOUS && LA186_0<=EXISTS)||(LA186_0>=INSTANCEOF && LA186_0<=CURRENT_TIMESTAMP)||LA186_0==NEWKW||(LA186_0>=EVAL_AND_EXPR && LA186_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA186_0==EVENT_PROP_EXPR||LA186_0==CONCAT||(LA186_0>=LIB_FUNC_CHAIN && LA186_0<=DOT_EXPR)||LA186_0==ARRAY_EXPR||(LA186_0>=NOT_IN_SET && LA186_0<=NOT_REGEXP)||(LA186_0>=IN_RANGE && LA186_0<=SUBSELECT_EXPR)||(LA186_0>=EXISTS_SUBSELECT_EXPR && LA186_0<=NOT_IN_SUBSELECT_EXPR)||LA186_0==SUBSTITUTION||(LA186_0>=FIRST_AGGREG && LA186_0<=WINDOW_AGGREG)||(LA186_0>=INT_TYPE && LA186_0<=NULL_TYPE)||(LA186_0>=STAR && LA186_0<=PLUS)||(LA186_0>=BAND && LA186_0<=BXOR)||(LA186_0>=LT && LA186_0<=GE)||(LA186_0>=MINUS && LA186_0<=MOD)||(LA186_0>=EVAL_IS_GROUP_EXPR && LA186_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt186=1;
                        }


                        switch (alt186) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:503:43: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3192);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop186;
                        }
                    } while (true);

                     leaveNode(jo); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:504:4: ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    ja=(CommonTree)match(input,EVAL_AND_EXPR,FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3206); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3208);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3210);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:504:43: ( valueExpr )*
                    loop187:
                    do {
                        int alt187=2;
                        int LA187_0 = input.LA(1);

                        if ( ((LA187_0>=IN_SET && LA187_0<=REGEXP)||LA187_0==NOT_EXPR||(LA187_0>=SUM && LA187_0<=AVG)||(LA187_0>=COALESCE && LA187_0<=COUNT)||(LA187_0>=CASE && LA187_0<=CASE2)||(LA187_0>=PREVIOUS && LA187_0<=EXISTS)||(LA187_0>=INSTANCEOF && LA187_0<=CURRENT_TIMESTAMP)||LA187_0==NEWKW||(LA187_0>=EVAL_AND_EXPR && LA187_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA187_0==EVENT_PROP_EXPR||LA187_0==CONCAT||(LA187_0>=LIB_FUNC_CHAIN && LA187_0<=DOT_EXPR)||LA187_0==ARRAY_EXPR||(LA187_0>=NOT_IN_SET && LA187_0<=NOT_REGEXP)||(LA187_0>=IN_RANGE && LA187_0<=SUBSELECT_EXPR)||(LA187_0>=EXISTS_SUBSELECT_EXPR && LA187_0<=NOT_IN_SUBSELECT_EXPR)||LA187_0==SUBSTITUTION||(LA187_0>=FIRST_AGGREG && LA187_0<=WINDOW_AGGREG)||(LA187_0>=INT_TYPE && LA187_0<=NULL_TYPE)||(LA187_0>=STAR && LA187_0<=PLUS)||(LA187_0>=BAND && LA187_0<=BXOR)||(LA187_0>=LT && LA187_0<=GE)||(LA187_0>=MINUS && LA187_0<=MOD)||(LA187_0>=EVAL_IS_GROUP_EXPR && LA187_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt187=1;
                        }


                        switch (alt187) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:504:44: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3213);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop187;
                        }
                    } while (true);

                     leaveNode(ja); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:505:4: ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr )
                    {
                    je=(CommonTree)match(input,EVAL_EQUALS_EXPR,FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3227); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3229);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3231);
                    valueExpr();

                    state._fsp--;

                     leaveNode(je); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:506:4: ^(ji= EVAL_IS_EXPR valueExpr valueExpr )
                    {
                    ji=(CommonTree)match(input,EVAL_IS_EXPR,FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3243); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3245);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3247);
                    valueExpr();

                    state._fsp--;

                     leaveNode(ji); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:507:4: ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr )
                    {
                    jne=(CommonTree)match(input,EVAL_NOTEQUALS_EXPR,FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3259); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3261);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3263);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:508:4: ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr )
                    {
                    jis=(CommonTree)match(input,EVAL_ISNOT_EXPR,FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3275); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3277);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3279);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jis); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:509:4: ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jge=(CommonTree)match(input,EVAL_EQUALS_GROUP_EXPR,FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3291); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3293);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jge); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:510:4: ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery )
                    {
                    jgi=(CommonTree)match(input,EVAL_IS_GROUP_EXPR,FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3305); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3307);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgi); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:511:4: ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jgne=(CommonTree)match(input,EVAL_NOTEQUALS_GROUP_EXPR,FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3319); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3321);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:512:4: ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery )
                    {
                    jgni=(CommonTree)match(input,EVAL_ISNOT_GROUP_EXPR,FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3333); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3335);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgni); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:513:4: ^(n= NOT_EXPR valueExpr )
                    {
                    n=(CommonTree)match(input,NOT_EXPR,FOLLOW_NOT_EXPR_in_evalExprChoice3347); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3349);
                    valueExpr();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:514:4: r= relationalExpr
                    {
                    pushFollow(FOLLOW_relationalExpr_in_evalExprChoice3360);
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
    // EsperEPL2Ast.g:517:1: equalsSubquery : valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ;
    public final void equalsSubquery() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:518:2: ( valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            // EsperEPL2Ast.g:518:4: valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
            {
            pushFollow(FOLLOW_valueExpr_in_equalsSubquery3371);
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

            // EsperEPL2Ast.g:518:29: ( ( valueExpr )* | subSelectGroupExpr )
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==UP||(LA190_0>=IN_SET && LA190_0<=REGEXP)||LA190_0==NOT_EXPR||(LA190_0>=SUM && LA190_0<=AVG)||(LA190_0>=COALESCE && LA190_0<=COUNT)||(LA190_0>=CASE && LA190_0<=CASE2)||(LA190_0>=PREVIOUS && LA190_0<=EXISTS)||(LA190_0>=INSTANCEOF && LA190_0<=CURRENT_TIMESTAMP)||LA190_0==NEWKW||(LA190_0>=EVAL_AND_EXPR && LA190_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA190_0==EVENT_PROP_EXPR||LA190_0==CONCAT||(LA190_0>=LIB_FUNC_CHAIN && LA190_0<=DOT_EXPR)||LA190_0==ARRAY_EXPR||(LA190_0>=NOT_IN_SET && LA190_0<=NOT_REGEXP)||(LA190_0>=IN_RANGE && LA190_0<=SUBSELECT_EXPR)||(LA190_0>=EXISTS_SUBSELECT_EXPR && LA190_0<=NOT_IN_SUBSELECT_EXPR)||LA190_0==SUBSTITUTION||(LA190_0>=FIRST_AGGREG && LA190_0<=WINDOW_AGGREG)||(LA190_0>=INT_TYPE && LA190_0<=NULL_TYPE)||(LA190_0>=STAR && LA190_0<=PLUS)||(LA190_0>=BAND && LA190_0<=BXOR)||(LA190_0>=LT && LA190_0<=GE)||(LA190_0>=MINUS && LA190_0<=MOD)||(LA190_0>=EVAL_IS_GROUP_EXPR && LA190_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt190=1;
            }
            else if ( (LA190_0==SUBSELECT_GROUP_EXPR) ) {
                alt190=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 190, 0, input);

                throw nvae;
            }
            switch (alt190) {
                case 1 :
                    // EsperEPL2Ast.g:518:30: ( valueExpr )*
                    {
                    // EsperEPL2Ast.g:518:30: ( valueExpr )*
                    loop189:
                    do {
                        int alt189=2;
                        int LA189_0 = input.LA(1);

                        if ( ((LA189_0>=IN_SET && LA189_0<=REGEXP)||LA189_0==NOT_EXPR||(LA189_0>=SUM && LA189_0<=AVG)||(LA189_0>=COALESCE && LA189_0<=COUNT)||(LA189_0>=CASE && LA189_0<=CASE2)||(LA189_0>=PREVIOUS && LA189_0<=EXISTS)||(LA189_0>=INSTANCEOF && LA189_0<=CURRENT_TIMESTAMP)||LA189_0==NEWKW||(LA189_0>=EVAL_AND_EXPR && LA189_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA189_0==EVENT_PROP_EXPR||LA189_0==CONCAT||(LA189_0>=LIB_FUNC_CHAIN && LA189_0<=DOT_EXPR)||LA189_0==ARRAY_EXPR||(LA189_0>=NOT_IN_SET && LA189_0<=NOT_REGEXP)||(LA189_0>=IN_RANGE && LA189_0<=SUBSELECT_EXPR)||(LA189_0>=EXISTS_SUBSELECT_EXPR && LA189_0<=NOT_IN_SUBSELECT_EXPR)||LA189_0==SUBSTITUTION||(LA189_0>=FIRST_AGGREG && LA189_0<=WINDOW_AGGREG)||(LA189_0>=INT_TYPE && LA189_0<=NULL_TYPE)||(LA189_0>=STAR && LA189_0<=PLUS)||(LA189_0>=BAND && LA189_0<=BXOR)||(LA189_0>=LT && LA189_0<=GE)||(LA189_0>=MINUS && LA189_0<=MOD)||(LA189_0>=EVAL_IS_GROUP_EXPR && LA189_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt189=1;
                        }


                        switch (alt189) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:518:30: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_equalsSubquery3382);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop189;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:518:43: subSelectGroupExpr
                    {
                    pushFollow(FOLLOW_subSelectGroupExpr_in_equalsSubquery3387);
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
    // EsperEPL2Ast.g:521:1: valueExpr : ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:522:2: ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr )
            int alt191=18;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt191=1;
                }
                break;
            case SUBSTITUTION:
                {
                alt191=2;
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
                alt191=3;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt191=4;
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
                alt191=5;
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
                alt191=6;
                }
                break;
            case LIB_FUNC_CHAIN:
                {
                alt191=7;
                }
                break;
            case CASE:
            case CASE2:
                {
                alt191=8;
                }
                break;
            case IN_SET:
            case NOT_IN_SET:
            case IN_RANGE:
            case NOT_IN_RANGE:
                {
                alt191=9;
                }
                break;
            case BETWEEN:
            case NOT_BETWEEN:
                {
                alt191=10;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt191=11;
                }
                break;
            case REGEXP:
            case NOT_REGEXP:
                {
                alt191=12;
                }
                break;
            case ARRAY_EXPR:
                {
                alt191=13;
                }
                break;
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
                {
                alt191=14;
                }
                break;
            case SUBSELECT_EXPR:
                {
                alt191=15;
                }
                break;
            case EXISTS_SUBSELECT_EXPR:
                {
                alt191=16;
                }
                break;
            case DOT_EXPR:
                {
                alt191=17;
                }
                break;
            case NEWKW:
                {
                alt191=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 191, 0, input);

                throw nvae;
            }

            switch (alt191) {
                case 1 :
                    // EsperEPL2Ast.g:522:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_valueExpr3401);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:523:4: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_valueExpr3407);
                    substitution();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:524:5: arithmeticExpr
                    {
                    pushFollow(FOLLOW_arithmeticExpr_in_valueExpr3413);
                    arithmeticExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:525:5: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_valueExpr3420);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:526:7: evalExprChoice
                    {
                    pushFollow(FOLLOW_evalExprChoice_in_valueExpr3429);
                    evalExprChoice();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:527:4: builtinFunc
                    {
                    pushFollow(FOLLOW_builtinFunc_in_valueExpr3434);
                    builtinFunc();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:528:7: libFuncChain
                    {
                    pushFollow(FOLLOW_libFuncChain_in_valueExpr3442);
                    libFuncChain();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:529:4: caseExpr
                    {
                    pushFollow(FOLLOW_caseExpr_in_valueExpr3447);
                    caseExpr();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:530:4: inExpr
                    {
                    pushFollow(FOLLOW_inExpr_in_valueExpr3452);
                    inExpr();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:531:4: betweenExpr
                    {
                    pushFollow(FOLLOW_betweenExpr_in_valueExpr3458);
                    betweenExpr();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:532:4: likeExpr
                    {
                    pushFollow(FOLLOW_likeExpr_in_valueExpr3463);
                    likeExpr();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:533:4: regExpExpr
                    {
                    pushFollow(FOLLOW_regExpExpr_in_valueExpr3468);
                    regExpExpr();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // EsperEPL2Ast.g:534:4: arrayExpr
                    {
                    pushFollow(FOLLOW_arrayExpr_in_valueExpr3473);
                    arrayExpr();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:535:4: subSelectInExpr
                    {
                    pushFollow(FOLLOW_subSelectInExpr_in_valueExpr3478);
                    subSelectInExpr();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:536:5: subSelectRowExpr
                    {
                    pushFollow(FOLLOW_subSelectRowExpr_in_valueExpr3484);
                    subSelectRowExpr();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:537:5: subSelectExistsExpr
                    {
                    pushFollow(FOLLOW_subSelectExistsExpr_in_valueExpr3491);
                    subSelectExistsExpr();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:538:4: dotExpr
                    {
                    pushFollow(FOLLOW_dotExpr_in_valueExpr3496);
                    dotExpr();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:539:4: newExpr
                    {
                    pushFollow(FOLLOW_newExpr_in_valueExpr3501);
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
    // EsperEPL2Ast.g:542:1: valueExprWithTime : (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod );
    public final void valueExprWithTime() throws RecognitionException {
        CommonTree l=null;
        CommonTree lw=null;
        CommonTree ordered=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:543:2: (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod )
            int alt193=11;
            switch ( input.LA(1) ) {
            case LAST:
                {
                alt193=1;
                }
                break;
            case LW:
                {
                alt193=2;
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
                alt193=3;
                }
                break;
            case OBJECT_PARAM_ORDERED_EXPR:
                {
                alt193=4;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt193=5;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt193=6;
                }
                break;
            case LAST_OPERATOR:
                {
                alt193=7;
                }
                break;
            case WEEKDAY_OPERATOR:
                {
                alt193=8;
                }
                break;
            case NUMERIC_PARAM_LIST:
                {
                alt193=9;
                }
                break;
            case NUMBERSETSTAR:
                {
                alt193=10;
                }
                break;
            case TIME_PERIOD:
                {
                alt193=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 193, 0, input);

                throw nvae;
            }

            switch (alt193) {
                case 1 :
                    // EsperEPL2Ast.g:543:4: l= LAST
                    {
                    l=(CommonTree)match(input,LAST,FOLLOW_LAST_in_valueExprWithTime3514); 
                     leaveNode(l); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:544:4: lw= LW
                    {
                    lw=(CommonTree)match(input,LW,FOLLOW_LW_in_valueExprWithTime3523); 
                     leaveNode(lw); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:545:4: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3530);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:546:4: ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) )
                    {
                    ordered=(CommonTree)match(input,OBJECT_PARAM_ORDERED_EXPR,FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3538); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3540);
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
                    // EsperEPL2Ast.g:547:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_valueExprWithTime3555);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:548:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_valueExprWithTime3561);
                    frequencyOperator();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:549:4: lastOperator
                    {
                    pushFollow(FOLLOW_lastOperator_in_valueExprWithTime3566);
                    lastOperator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:550:4: weekDayOperator
                    {
                    pushFollow(FOLLOW_weekDayOperator_in_valueExprWithTime3571);
                    weekDayOperator();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:551:5: ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ )
                    {
                    l=(CommonTree)match(input,NUMERIC_PARAM_LIST,FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3581); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:551:29: ( numericParameterList )+
                    int cnt192=0;
                    loop192:
                    do {
                        int alt192=2;
                        int LA192_0 = input.LA(1);

                        if ( (LA192_0==NUMERIC_PARAM_RANGE||LA192_0==NUMERIC_PARAM_FREQUENCY||(LA192_0>=INT_TYPE && LA192_0<=NULL_TYPE)) ) {
                            alt192=1;
                        }


                        switch (alt192) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:551:29: numericParameterList
                    	    {
                    	    pushFollow(FOLLOW_numericParameterList_in_valueExprWithTime3583);
                    	    numericParameterList();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt192 >= 1 ) break loop192;
                                EarlyExitException eee =
                                    new EarlyExitException(192, input);
                                throw eee;
                        }
                        cnt192++;
                    } while (true);

                     leaveNode(l); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:552:4: s= NUMBERSETSTAR
                    {
                    s=(CommonTree)match(input,NUMBERSETSTAR,FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3594); 
                     leaveNode(s); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:553:4: timePeriod
                    {
                    pushFollow(FOLLOW_timePeriod_in_valueExprWithTime3601);
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
    // EsperEPL2Ast.g:556:1: numericParameterList : ( constant[true] | rangeOperator | frequencyOperator );
    public final void numericParameterList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:557:2: ( constant[true] | rangeOperator | frequencyOperator )
            int alt194=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt194=1;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt194=2;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt194=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 194, 0, input);

                throw nvae;
            }

            switch (alt194) {
                case 1 :
                    // EsperEPL2Ast.g:557:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_numericParameterList3614);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:558:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_numericParameterList3621);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:559:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_numericParameterList3627);
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
    // EsperEPL2Ast.g:562:1: rangeOperator : ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void rangeOperator() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:563:2: ( ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:563:4: ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            r=(CommonTree)match(input,NUMERIC_PARAM_RANGE,FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator3643); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:563:29: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt195=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt195=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt195=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt195=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 195, 0, input);

                throw nvae;
            }

            switch (alt195) {
                case 1 :
                    // EsperEPL2Ast.g:563:30: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator3646);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:563:45: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator3649);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:563:69: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator3652);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:563:83: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt196=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt196=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt196=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt196=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 196, 0, input);

                throw nvae;
            }

            switch (alt196) {
                case 1 :
                    // EsperEPL2Ast.g:563:84: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator3656);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:563:99: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator3659);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:563:123: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator3662);
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
    // EsperEPL2Ast.g:566:1: frequencyOperator : ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void frequencyOperator() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:567:2: ( ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:567:4: ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            f=(CommonTree)match(input,NUMERIC_PARAM_FREQUENCY,FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator3683); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:567:33: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt197=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt197=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt197=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt197=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 197, 0, input);

                throw nvae;
            }

            switch (alt197) {
                case 1 :
                    // EsperEPL2Ast.g:567:34: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_frequencyOperator3686);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:567:49: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_frequencyOperator3689);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:567:73: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_frequencyOperator3692);
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
    // EsperEPL2Ast.g:570:1: lastOperator : ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void lastOperator() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:571:2: ( ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:571:4: ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            l=(CommonTree)match(input,LAST_OPERATOR,FOLLOW_LAST_OPERATOR_in_lastOperator3711); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:571:23: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt198=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt198=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt198=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt198=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 198, 0, input);

                throw nvae;
            }

            switch (alt198) {
                case 1 :
                    // EsperEPL2Ast.g:571:24: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_lastOperator3714);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:571:39: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_lastOperator3717);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:571:63: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_lastOperator3720);
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
    // EsperEPL2Ast.g:574:1: weekDayOperator : ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void weekDayOperator() throws RecognitionException {
        CommonTree w=null;

        try {
            // EsperEPL2Ast.g:575:2: ( ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:575:4: ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            w=(CommonTree)match(input,WEEKDAY_OPERATOR,FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator3739); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:575:26: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt199=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt199=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt199=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt199=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 199, 0, input);

                throw nvae;
            }

            switch (alt199) {
                case 1 :
                    // EsperEPL2Ast.g:575:27: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_weekDayOperator3742);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:575:42: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_weekDayOperator3745);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:575:66: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_weekDayOperator3748);
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
    // EsperEPL2Ast.g:578:1: subSelectGroupExpr : ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) ;
    public final void subSelectGroupExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:579:2: ( ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:579:4: ^(s= SUBSELECT_GROUP_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_GROUP_EXPR,FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr3769); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectGroupExpr3771);
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
    // EsperEPL2Ast.g:582:1: subSelectRowExpr : ^(s= SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectRowExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:583:2: ( ^(s= SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:583:4: ^(s= SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_EXPR,FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr3790); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectRowExpr3792);
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
    // EsperEPL2Ast.g:586:1: subSelectExistsExpr : ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectExistsExpr() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:587:2: ( ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:587:4: ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            e=(CommonTree)match(input,EXISTS_SUBSELECT_EXPR,FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr3811); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectExistsExpr3813);
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
    // EsperEPL2Ast.g:590:1: subSelectInExpr : ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) );
    public final void subSelectInExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:591:2: ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) )
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==IN_SUBSELECT_EXPR) ) {
                alt200=1;
            }
            else if ( (LA200_0==NOT_IN_SUBSELECT_EXPR) ) {
                alt200=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 200, 0, input);

                throw nvae;
            }
            switch (alt200) {
                case 1 :
                    // EsperEPL2Ast.g:591:5: ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,IN_SUBSELECT_EXPR,FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr3832); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr3834);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3836);
                    subSelectInQueryExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(s); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:592:5: ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,NOT_IN_SUBSELECT_EXPR,FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr3848); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr3850);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3852);
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
    // EsperEPL2Ast.g:595:1: subSelectInQueryExpr : ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) ;
    public final void subSelectInQueryExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:596:2: ( ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:596:4: ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr )
            {
            pushStmtContext();
            i=(CommonTree)match(input,IN_SUBSELECT_QUERY_EXPR,FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr3871); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectInQueryExpr3873);
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
    // EsperEPL2Ast.g:599:1: subQueryExpr : ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? ;
    public final void subQueryExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:600:2: ( ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? )
            // EsperEPL2Ast.g:600:4: ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )?
            {
            // EsperEPL2Ast.g:600:4: ( DISTINCT )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==DISTINCT) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // EsperEPL2Ast.g:600:4: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_subQueryExpr3889); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_subQueryExpr3892);
            selectionList();

            state._fsp--;

            pushFollow(FOLLOW_subSelectFilterExpr_in_subQueryExpr3894);
            subSelectFilterExpr();

            state._fsp--;

            // EsperEPL2Ast.g:600:48: ( whereClause[true] )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==WHERE_EXPR) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // EsperEPL2Ast.g:600:49: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_subQueryExpr3897);
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
    // EsperEPL2Ast.g:603:1: subSelectFilterExpr : ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) ;
    public final void subSelectFilterExpr() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:604:2: ( ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:604:4: ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_subSelectFilterExpr3915); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_subSelectFilterExpr3917);
            eventFilterExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:604:42: ( viewListExpr )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==VIEW_EXPR) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // EsperEPL2Ast.g:604:43: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_subSelectFilterExpr3921);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:604:58: ( IDENT )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==IDENT) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // EsperEPL2Ast.g:604:59: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_subSelectFilterExpr3926); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:604:67: ( RETAINUNION )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==RETAINUNION) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // EsperEPL2Ast.g:604:67: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_subSelectFilterExpr3930); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:604:80: ( RETAININTERSECTION )?
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==RETAININTERSECTION) ) {
                alt206=1;
            }
            switch (alt206) {
                case 1 :
                    // EsperEPL2Ast.g:604:80: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr3933); 

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
    // EsperEPL2Ast.g:607:1: caseExpr : ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) );
    public final void caseExpr() throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:608:2: ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) )
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==CASE) ) {
                alt209=1;
            }
            else if ( (LA209_0==CASE2) ) {
                alt209=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 209, 0, input);

                throw nvae;
            }
            switch (alt209) {
                case 1 :
                    // EsperEPL2Ast.g:608:4: ^(c= CASE ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE,FOLLOW_CASE_in_caseExpr3953); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:608:13: ( valueExpr )*
                        loop207:
                        do {
                            int alt207=2;
                            int LA207_0 = input.LA(1);

                            if ( ((LA207_0>=IN_SET && LA207_0<=REGEXP)||LA207_0==NOT_EXPR||(LA207_0>=SUM && LA207_0<=AVG)||(LA207_0>=COALESCE && LA207_0<=COUNT)||(LA207_0>=CASE && LA207_0<=CASE2)||(LA207_0>=PREVIOUS && LA207_0<=EXISTS)||(LA207_0>=INSTANCEOF && LA207_0<=CURRENT_TIMESTAMP)||LA207_0==NEWKW||(LA207_0>=EVAL_AND_EXPR && LA207_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA207_0==EVENT_PROP_EXPR||LA207_0==CONCAT||(LA207_0>=LIB_FUNC_CHAIN && LA207_0<=DOT_EXPR)||LA207_0==ARRAY_EXPR||(LA207_0>=NOT_IN_SET && LA207_0<=NOT_REGEXP)||(LA207_0>=IN_RANGE && LA207_0<=SUBSELECT_EXPR)||(LA207_0>=EXISTS_SUBSELECT_EXPR && LA207_0<=NOT_IN_SUBSELECT_EXPR)||LA207_0==SUBSTITUTION||(LA207_0>=FIRST_AGGREG && LA207_0<=WINDOW_AGGREG)||(LA207_0>=INT_TYPE && LA207_0<=NULL_TYPE)||(LA207_0>=STAR && LA207_0<=PLUS)||(LA207_0>=BAND && LA207_0<=BXOR)||(LA207_0>=LT && LA207_0<=GE)||(LA207_0>=MINUS && LA207_0<=MOD)||(LA207_0>=EVAL_IS_GROUP_EXPR && LA207_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt207=1;
                            }


                            switch (alt207) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:608:14: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr3956);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop207;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                     leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:609:4: ^(c= CASE2 ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE2,FOLLOW_CASE2_in_caseExpr3969); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:609:14: ( valueExpr )*
                        loop208:
                        do {
                            int alt208=2;
                            int LA208_0 = input.LA(1);

                            if ( ((LA208_0>=IN_SET && LA208_0<=REGEXP)||LA208_0==NOT_EXPR||(LA208_0>=SUM && LA208_0<=AVG)||(LA208_0>=COALESCE && LA208_0<=COUNT)||(LA208_0>=CASE && LA208_0<=CASE2)||(LA208_0>=PREVIOUS && LA208_0<=EXISTS)||(LA208_0>=INSTANCEOF && LA208_0<=CURRENT_TIMESTAMP)||LA208_0==NEWKW||(LA208_0>=EVAL_AND_EXPR && LA208_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA208_0==EVENT_PROP_EXPR||LA208_0==CONCAT||(LA208_0>=LIB_FUNC_CHAIN && LA208_0<=DOT_EXPR)||LA208_0==ARRAY_EXPR||(LA208_0>=NOT_IN_SET && LA208_0<=NOT_REGEXP)||(LA208_0>=IN_RANGE && LA208_0<=SUBSELECT_EXPR)||(LA208_0>=EXISTS_SUBSELECT_EXPR && LA208_0<=NOT_IN_SUBSELECT_EXPR)||LA208_0==SUBSTITUTION||(LA208_0>=FIRST_AGGREG && LA208_0<=WINDOW_AGGREG)||(LA208_0>=INT_TYPE && LA208_0<=NULL_TYPE)||(LA208_0>=STAR && LA208_0<=PLUS)||(LA208_0>=BAND && LA208_0<=BXOR)||(LA208_0>=LT && LA208_0<=GE)||(LA208_0>=MINUS && LA208_0<=MOD)||(LA208_0>=EVAL_IS_GROUP_EXPR && LA208_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt208=1;
                            }


                            switch (alt208) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:609:15: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr3972);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop208;
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
    // EsperEPL2Ast.g:612:1: inExpr : ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) );
    public final void inExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:613:2: ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) )
            int alt212=4;
            switch ( input.LA(1) ) {
            case IN_SET:
                {
                alt212=1;
                }
                break;
            case NOT_IN_SET:
                {
                alt212=2;
                }
                break;
            case IN_RANGE:
                {
                alt212=3;
                }
                break;
            case NOT_IN_RANGE:
                {
                alt212=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 212, 0, input);

                throw nvae;
            }

            switch (alt212) {
                case 1 :
                    // EsperEPL2Ast.g:613:4: ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_SET,FOLLOW_IN_SET_in_inExpr3992); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr3994);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4002);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:613:51: ( valueExpr )*
                    loop210:
                    do {
                        int alt210=2;
                        int LA210_0 = input.LA(1);

                        if ( ((LA210_0>=IN_SET && LA210_0<=REGEXP)||LA210_0==NOT_EXPR||(LA210_0>=SUM && LA210_0<=AVG)||(LA210_0>=COALESCE && LA210_0<=COUNT)||(LA210_0>=CASE && LA210_0<=CASE2)||(LA210_0>=PREVIOUS && LA210_0<=EXISTS)||(LA210_0>=INSTANCEOF && LA210_0<=CURRENT_TIMESTAMP)||LA210_0==NEWKW||(LA210_0>=EVAL_AND_EXPR && LA210_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA210_0==EVENT_PROP_EXPR||LA210_0==CONCAT||(LA210_0>=LIB_FUNC_CHAIN && LA210_0<=DOT_EXPR)||LA210_0==ARRAY_EXPR||(LA210_0>=NOT_IN_SET && LA210_0<=NOT_REGEXP)||(LA210_0>=IN_RANGE && LA210_0<=SUBSELECT_EXPR)||(LA210_0>=EXISTS_SUBSELECT_EXPR && LA210_0<=NOT_IN_SUBSELECT_EXPR)||LA210_0==SUBSTITUTION||(LA210_0>=FIRST_AGGREG && LA210_0<=WINDOW_AGGREG)||(LA210_0>=INT_TYPE && LA210_0<=NULL_TYPE)||(LA210_0>=STAR && LA210_0<=PLUS)||(LA210_0>=BAND && LA210_0<=BXOR)||(LA210_0>=LT && LA210_0<=GE)||(LA210_0>=MINUS && LA210_0<=MOD)||(LA210_0>=EVAL_IS_GROUP_EXPR && LA210_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt210=1;
                        }


                        switch (alt210) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:613:52: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4005);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop210;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
                    // EsperEPL2Ast.g:614:4: ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_SET,FOLLOW_NOT_IN_SET_in_inExpr4024); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4026);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4034);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:614:55: ( valueExpr )*
                    loop211:
                    do {
                        int alt211=2;
                        int LA211_0 = input.LA(1);

                        if ( ((LA211_0>=IN_SET && LA211_0<=REGEXP)||LA211_0==NOT_EXPR||(LA211_0>=SUM && LA211_0<=AVG)||(LA211_0>=COALESCE && LA211_0<=COUNT)||(LA211_0>=CASE && LA211_0<=CASE2)||(LA211_0>=PREVIOUS && LA211_0<=EXISTS)||(LA211_0>=INSTANCEOF && LA211_0<=CURRENT_TIMESTAMP)||LA211_0==NEWKW||(LA211_0>=EVAL_AND_EXPR && LA211_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA211_0==EVENT_PROP_EXPR||LA211_0==CONCAT||(LA211_0>=LIB_FUNC_CHAIN && LA211_0<=DOT_EXPR)||LA211_0==ARRAY_EXPR||(LA211_0>=NOT_IN_SET && LA211_0<=NOT_REGEXP)||(LA211_0>=IN_RANGE && LA211_0<=SUBSELECT_EXPR)||(LA211_0>=EXISTS_SUBSELECT_EXPR && LA211_0<=NOT_IN_SUBSELECT_EXPR)||LA211_0==SUBSTITUTION||(LA211_0>=FIRST_AGGREG && LA211_0<=WINDOW_AGGREG)||(LA211_0>=INT_TYPE && LA211_0<=NULL_TYPE)||(LA211_0>=STAR && LA211_0<=PLUS)||(LA211_0>=BAND && LA211_0<=BXOR)||(LA211_0>=LT && LA211_0<=GE)||(LA211_0>=MINUS && LA211_0<=MOD)||(LA211_0>=EVAL_IS_GROUP_EXPR && LA211_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt211=1;
                        }


                        switch (alt211) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:614:56: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4037);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop211;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
                    // EsperEPL2Ast.g:615:4: ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_RANGE,FOLLOW_IN_RANGE_in_inExpr4056); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4058);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4066);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4068);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
                    // EsperEPL2Ast.g:616:4: ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_RANGE,FOLLOW_NOT_IN_RANGE_in_inExpr4085); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4087);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4095);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4097);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
    // EsperEPL2Ast.g:619:1: betweenExpr : ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) );
    public final void betweenExpr() throws RecognitionException {
        CommonTree b=null;

        try {
            // EsperEPL2Ast.g:620:2: ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) )
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==BETWEEN) ) {
                alt214=1;
            }
            else if ( (LA214_0==NOT_BETWEEN) ) {
                alt214=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 214, 0, input);

                throw nvae;
            }
            switch (alt214) {
                case 1 :
                    // EsperEPL2Ast.g:620:4: ^(b= BETWEEN valueExpr valueExpr valueExpr )
                    {
                    b=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenExpr4122); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4124);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4126);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4128);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(b); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:621:4: ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* )
                    {
                    b=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenExpr4139); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4141);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4143);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:621:40: ( valueExpr )*
                    loop213:
                    do {
                        int alt213=2;
                        int LA213_0 = input.LA(1);

                        if ( ((LA213_0>=IN_SET && LA213_0<=REGEXP)||LA213_0==NOT_EXPR||(LA213_0>=SUM && LA213_0<=AVG)||(LA213_0>=COALESCE && LA213_0<=COUNT)||(LA213_0>=CASE && LA213_0<=CASE2)||(LA213_0>=PREVIOUS && LA213_0<=EXISTS)||(LA213_0>=INSTANCEOF && LA213_0<=CURRENT_TIMESTAMP)||LA213_0==NEWKW||(LA213_0>=EVAL_AND_EXPR && LA213_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA213_0==EVENT_PROP_EXPR||LA213_0==CONCAT||(LA213_0>=LIB_FUNC_CHAIN && LA213_0<=DOT_EXPR)||LA213_0==ARRAY_EXPR||(LA213_0>=NOT_IN_SET && LA213_0<=NOT_REGEXP)||(LA213_0>=IN_RANGE && LA213_0<=SUBSELECT_EXPR)||(LA213_0>=EXISTS_SUBSELECT_EXPR && LA213_0<=NOT_IN_SUBSELECT_EXPR)||LA213_0==SUBSTITUTION||(LA213_0>=FIRST_AGGREG && LA213_0<=WINDOW_AGGREG)||(LA213_0>=INT_TYPE && LA213_0<=NULL_TYPE)||(LA213_0>=STAR && LA213_0<=PLUS)||(LA213_0>=BAND && LA213_0<=BXOR)||(LA213_0>=LT && LA213_0<=GE)||(LA213_0>=MINUS && LA213_0<=MOD)||(LA213_0>=EVAL_IS_GROUP_EXPR && LA213_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt213=1;
                        }


                        switch (alt213) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:621:41: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_betweenExpr4146);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop213;
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
    // EsperEPL2Ast.g:624:1: likeExpr : ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) );
    public final void likeExpr() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:625:2: ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) )
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==LIKE) ) {
                alt217=1;
            }
            else if ( (LA217_0==NOT_LIKE) ) {
                alt217=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 217, 0, input);

                throw nvae;
            }
            switch (alt217) {
                case 1 :
                    // EsperEPL2Ast.g:625:4: ^(l= LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeExpr4166); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4168);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4170);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:625:33: ( valueExpr )?
                    int alt215=2;
                    int LA215_0 = input.LA(1);

                    if ( ((LA215_0>=IN_SET && LA215_0<=REGEXP)||LA215_0==NOT_EXPR||(LA215_0>=SUM && LA215_0<=AVG)||(LA215_0>=COALESCE && LA215_0<=COUNT)||(LA215_0>=CASE && LA215_0<=CASE2)||(LA215_0>=PREVIOUS && LA215_0<=EXISTS)||(LA215_0>=INSTANCEOF && LA215_0<=CURRENT_TIMESTAMP)||LA215_0==NEWKW||(LA215_0>=EVAL_AND_EXPR && LA215_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA215_0==EVENT_PROP_EXPR||LA215_0==CONCAT||(LA215_0>=LIB_FUNC_CHAIN && LA215_0<=DOT_EXPR)||LA215_0==ARRAY_EXPR||(LA215_0>=NOT_IN_SET && LA215_0<=NOT_REGEXP)||(LA215_0>=IN_RANGE && LA215_0<=SUBSELECT_EXPR)||(LA215_0>=EXISTS_SUBSELECT_EXPR && LA215_0<=NOT_IN_SUBSELECT_EXPR)||LA215_0==SUBSTITUTION||(LA215_0>=FIRST_AGGREG && LA215_0<=WINDOW_AGGREG)||(LA215_0>=INT_TYPE && LA215_0<=NULL_TYPE)||(LA215_0>=STAR && LA215_0<=PLUS)||(LA215_0>=BAND && LA215_0<=BXOR)||(LA215_0>=LT && LA215_0<=GE)||(LA215_0>=MINUS && LA215_0<=MOD)||(LA215_0>=EVAL_IS_GROUP_EXPR && LA215_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt215=1;
                    }
                    switch (alt215) {
                        case 1 :
                            // EsperEPL2Ast.g:625:34: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4173);
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
                    // EsperEPL2Ast.g:626:4: ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeExpr4186); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4188);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4190);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:626:37: ( valueExpr )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( ((LA216_0>=IN_SET && LA216_0<=REGEXP)||LA216_0==NOT_EXPR||(LA216_0>=SUM && LA216_0<=AVG)||(LA216_0>=COALESCE && LA216_0<=COUNT)||(LA216_0>=CASE && LA216_0<=CASE2)||(LA216_0>=PREVIOUS && LA216_0<=EXISTS)||(LA216_0>=INSTANCEOF && LA216_0<=CURRENT_TIMESTAMP)||LA216_0==NEWKW||(LA216_0>=EVAL_AND_EXPR && LA216_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA216_0==EVENT_PROP_EXPR||LA216_0==CONCAT||(LA216_0>=LIB_FUNC_CHAIN && LA216_0<=DOT_EXPR)||LA216_0==ARRAY_EXPR||(LA216_0>=NOT_IN_SET && LA216_0<=NOT_REGEXP)||(LA216_0>=IN_RANGE && LA216_0<=SUBSELECT_EXPR)||(LA216_0>=EXISTS_SUBSELECT_EXPR && LA216_0<=NOT_IN_SUBSELECT_EXPR)||LA216_0==SUBSTITUTION||(LA216_0>=FIRST_AGGREG && LA216_0<=WINDOW_AGGREG)||(LA216_0>=INT_TYPE && LA216_0<=NULL_TYPE)||(LA216_0>=STAR && LA216_0<=PLUS)||(LA216_0>=BAND && LA216_0<=BXOR)||(LA216_0>=LT && LA216_0<=GE)||(LA216_0>=MINUS && LA216_0<=MOD)||(LA216_0>=EVAL_IS_GROUP_EXPR && LA216_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // EsperEPL2Ast.g:626:38: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4193);
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
    // EsperEPL2Ast.g:629:1: regExpExpr : ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) );
    public final void regExpExpr() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:630:2: ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) )
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==REGEXP) ) {
                alt218=1;
            }
            else if ( (LA218_0==NOT_REGEXP) ) {
                alt218=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;
            }
            switch (alt218) {
                case 1 :
                    // EsperEPL2Ast.g:630:4: ^(r= REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,REGEXP,FOLLOW_REGEXP_in_regExpExpr4212); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4214);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4216);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(r); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:631:4: ^(r= NOT_REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,NOT_REGEXP,FOLLOW_NOT_REGEXP_in_regExpExpr4227); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4229);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4231);
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
    // EsperEPL2Ast.g:634:1: builtinFunc : ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) );
    public final void builtinFunc() throws RecognitionException {
        CommonTree f=null;
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:635:2: ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) )
            int alt244=20;
            switch ( input.LA(1) ) {
            case SUM:
                {
                alt244=1;
                }
                break;
            case AVG:
                {
                alt244=2;
                }
                break;
            case COUNT:
                {
                alt244=3;
                }
                break;
            case MEDIAN:
                {
                alt244=4;
                }
                break;
            case STDDEV:
                {
                alt244=5;
                }
                break;
            case AVEDEV:
                {
                alt244=6;
                }
                break;
            case LAST_AGGREG:
                {
                alt244=7;
                }
                break;
            case FIRST_AGGREG:
                {
                alt244=8;
                }
                break;
            case WINDOW_AGGREG:
                {
                alt244=9;
                }
                break;
            case COALESCE:
                {
                alt244=10;
                }
                break;
            case PREVIOUS:
                {
                alt244=11;
                }
                break;
            case PREVIOUSTAIL:
                {
                alt244=12;
                }
                break;
            case PREVIOUSCOUNT:
                {
                alt244=13;
                }
                break;
            case PREVIOUSWINDOW:
                {
                alt244=14;
                }
                break;
            case PRIOR:
                {
                alt244=15;
                }
                break;
            case INSTANCEOF:
                {
                alt244=16;
                }
                break;
            case TYPEOF:
                {
                alt244=17;
                }
                break;
            case CAST:
                {
                alt244=18;
                }
                break;
            case EXISTS:
                {
                alt244=19;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt244=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 244, 0, input);

                throw nvae;
            }

            switch (alt244) {
                case 1 :
                    // EsperEPL2Ast.g:635:5: ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,SUM,FOLLOW_SUM_in_builtinFunc4250); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:635:13: ( DISTINCT )?
                    int alt219=2;
                    int LA219_0 = input.LA(1);

                    if ( (LA219_0==DISTINCT) ) {
                        alt219=1;
                    }
                    switch (alt219) {
                        case 1 :
                            // EsperEPL2Ast.g:635:14: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4253); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4257);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:635:35: ( aggregationFilterExpr )?
                    int alt220=2;
                    int LA220_0 = input.LA(1);

                    if ( (LA220_0==AGG_FILTER_EXPR) ) {
                        alt220=1;
                    }
                    switch (alt220) {
                        case 1 :
                            // EsperEPL2Ast.g:635:35: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4259);
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
                    // EsperEPL2Ast.g:636:4: ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVG,FOLLOW_AVG_in_builtinFunc4271); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:636:12: ( DISTINCT )?
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( (LA221_0==DISTINCT) ) {
                        alt221=1;
                    }
                    switch (alt221) {
                        case 1 :
                            // EsperEPL2Ast.g:636:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4274); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4278);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:636:34: ( aggregationFilterExpr )?
                    int alt222=2;
                    int LA222_0 = input.LA(1);

                    if ( (LA222_0==AGG_FILTER_EXPR) ) {
                        alt222=1;
                    }
                    switch (alt222) {
                        case 1 :
                            // EsperEPL2Ast.g:636:34: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4280);
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
                    // EsperEPL2Ast.g:637:4: ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_builtinFunc4292); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:637:14: ( ( DISTINCT )? valueExpr )?
                        int alt224=2;
                        int LA224_0 = input.LA(1);

                        if ( ((LA224_0>=IN_SET && LA224_0<=REGEXP)||LA224_0==NOT_EXPR||(LA224_0>=SUM && LA224_0<=AVG)||(LA224_0>=COALESCE && LA224_0<=COUNT)||(LA224_0>=CASE && LA224_0<=CASE2)||LA224_0==DISTINCT||(LA224_0>=PREVIOUS && LA224_0<=EXISTS)||(LA224_0>=INSTANCEOF && LA224_0<=CURRENT_TIMESTAMP)||LA224_0==NEWKW||(LA224_0>=EVAL_AND_EXPR && LA224_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA224_0==EVENT_PROP_EXPR||LA224_0==CONCAT||(LA224_0>=LIB_FUNC_CHAIN && LA224_0<=DOT_EXPR)||LA224_0==ARRAY_EXPR||(LA224_0>=NOT_IN_SET && LA224_0<=NOT_REGEXP)||(LA224_0>=IN_RANGE && LA224_0<=SUBSELECT_EXPR)||(LA224_0>=EXISTS_SUBSELECT_EXPR && LA224_0<=NOT_IN_SUBSELECT_EXPR)||LA224_0==SUBSTITUTION||(LA224_0>=FIRST_AGGREG && LA224_0<=WINDOW_AGGREG)||(LA224_0>=INT_TYPE && LA224_0<=NULL_TYPE)||(LA224_0>=STAR && LA224_0<=PLUS)||(LA224_0>=BAND && LA224_0<=BXOR)||(LA224_0>=LT && LA224_0<=GE)||(LA224_0>=MINUS && LA224_0<=MOD)||(LA224_0>=EVAL_IS_GROUP_EXPR && LA224_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt224=1;
                        }
                        switch (alt224) {
                            case 1 :
                                // EsperEPL2Ast.g:637:15: ( DISTINCT )? valueExpr
                                {
                                // EsperEPL2Ast.g:637:15: ( DISTINCT )?
                                int alt223=2;
                                int LA223_0 = input.LA(1);

                                if ( (LA223_0==DISTINCT) ) {
                                    alt223=1;
                                }
                                switch (alt223) {
                                    case 1 :
                                        // EsperEPL2Ast.g:637:16: DISTINCT
                                        {
                                        match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4296); 

                                        }
                                        break;

                                }

                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4300);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:637:39: ( aggregationFilterExpr )?
                        int alt225=2;
                        int LA225_0 = input.LA(1);

                        if ( (LA225_0==AGG_FILTER_EXPR) ) {
                            alt225=1;
                        }
                        switch (alt225) {
                            case 1 :
                                // EsperEPL2Ast.g:637:39: aggregationFilterExpr
                                {
                                pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4304);
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
                    // EsperEPL2Ast.g:638:4: ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,MEDIAN,FOLLOW_MEDIAN_in_builtinFunc4316); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:638:15: ( DISTINCT )?
                    int alt226=2;
                    int LA226_0 = input.LA(1);

                    if ( (LA226_0==DISTINCT) ) {
                        alt226=1;
                    }
                    switch (alt226) {
                        case 1 :
                            // EsperEPL2Ast.g:638:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4319); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4323);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:638:37: ( aggregationFilterExpr )?
                    int alt227=2;
                    int LA227_0 = input.LA(1);

                    if ( (LA227_0==AGG_FILTER_EXPR) ) {
                        alt227=1;
                    }
                    switch (alt227) {
                        case 1 :
                            // EsperEPL2Ast.g:638:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4325);
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
                    // EsperEPL2Ast.g:639:4: ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,STDDEV,FOLLOW_STDDEV_in_builtinFunc4337); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:639:15: ( DISTINCT )?
                    int alt228=2;
                    int LA228_0 = input.LA(1);

                    if ( (LA228_0==DISTINCT) ) {
                        alt228=1;
                    }
                    switch (alt228) {
                        case 1 :
                            // EsperEPL2Ast.g:639:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4340); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4344);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:639:37: ( aggregationFilterExpr )?
                    int alt229=2;
                    int LA229_0 = input.LA(1);

                    if ( (LA229_0==AGG_FILTER_EXPR) ) {
                        alt229=1;
                    }
                    switch (alt229) {
                        case 1 :
                            // EsperEPL2Ast.g:639:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4346);
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
                    // EsperEPL2Ast.g:640:4: ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVEDEV,FOLLOW_AVEDEV_in_builtinFunc4358); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:640:15: ( DISTINCT )?
                    int alt230=2;
                    int LA230_0 = input.LA(1);

                    if ( (LA230_0==DISTINCT) ) {
                        alt230=1;
                    }
                    switch (alt230) {
                        case 1 :
                            // EsperEPL2Ast.g:640:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4361); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4365);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:640:37: ( aggregationFilterExpr )?
                    int alt231=2;
                    int LA231_0 = input.LA(1);

                    if ( (LA231_0==AGG_FILTER_EXPR) ) {
                        alt231=1;
                    }
                    switch (alt231) {
                        case 1 :
                            // EsperEPL2Ast.g:640:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4367);
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
                    // EsperEPL2Ast.g:641:4: ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,LAST_AGGREG,FOLLOW_LAST_AGGREG_in_builtinFunc4379); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:641:20: ( DISTINCT )?
                        int alt232=2;
                        int LA232_0 = input.LA(1);

                        if ( (LA232_0==DISTINCT) ) {
                            alt232=1;
                        }
                        switch (alt232) {
                            case 1 :
                                // EsperEPL2Ast.g:641:21: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4382); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:641:32: ( accessValueExpr )?
                        int alt233=2;
                        int LA233_0 = input.LA(1);

                        if ( (LA233_0==ACCESS_AGG) ) {
                            alt233=1;
                        }
                        switch (alt233) {
                            case 1 :
                                // EsperEPL2Ast.g:641:32: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4386);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:641:49: ( valueExpr )?
                        int alt234=2;
                        int LA234_0 = input.LA(1);

                        if ( ((LA234_0>=IN_SET && LA234_0<=REGEXP)||LA234_0==NOT_EXPR||(LA234_0>=SUM && LA234_0<=AVG)||(LA234_0>=COALESCE && LA234_0<=COUNT)||(LA234_0>=CASE && LA234_0<=CASE2)||(LA234_0>=PREVIOUS && LA234_0<=EXISTS)||(LA234_0>=INSTANCEOF && LA234_0<=CURRENT_TIMESTAMP)||LA234_0==NEWKW||(LA234_0>=EVAL_AND_EXPR && LA234_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA234_0==EVENT_PROP_EXPR||LA234_0==CONCAT||(LA234_0>=LIB_FUNC_CHAIN && LA234_0<=DOT_EXPR)||LA234_0==ARRAY_EXPR||(LA234_0>=NOT_IN_SET && LA234_0<=NOT_REGEXP)||(LA234_0>=IN_RANGE && LA234_0<=SUBSELECT_EXPR)||(LA234_0>=EXISTS_SUBSELECT_EXPR && LA234_0<=NOT_IN_SUBSELECT_EXPR)||LA234_0==SUBSTITUTION||(LA234_0>=FIRST_AGGREG && LA234_0<=WINDOW_AGGREG)||(LA234_0>=INT_TYPE && LA234_0<=NULL_TYPE)||(LA234_0>=STAR && LA234_0<=PLUS)||(LA234_0>=BAND && LA234_0<=BXOR)||(LA234_0>=LT && LA234_0<=GE)||(LA234_0>=MINUS && LA234_0<=MOD)||(LA234_0>=EVAL_IS_GROUP_EXPR && LA234_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt234=1;
                        }
                        switch (alt234) {
                            case 1 :
                                // EsperEPL2Ast.g:641:49: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4389);
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
                    // EsperEPL2Ast.g:642:4: ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,FIRST_AGGREG,FOLLOW_FIRST_AGGREG_in_builtinFunc4401); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:642:21: ( DISTINCT )?
                        int alt235=2;
                        int LA235_0 = input.LA(1);

                        if ( (LA235_0==DISTINCT) ) {
                            alt235=1;
                        }
                        switch (alt235) {
                            case 1 :
                                // EsperEPL2Ast.g:642:22: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4404); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:642:33: ( accessValueExpr )?
                        int alt236=2;
                        int LA236_0 = input.LA(1);

                        if ( (LA236_0==ACCESS_AGG) ) {
                            alt236=1;
                        }
                        switch (alt236) {
                            case 1 :
                                // EsperEPL2Ast.g:642:33: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4408);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:642:50: ( valueExpr )?
                        int alt237=2;
                        int LA237_0 = input.LA(1);

                        if ( ((LA237_0>=IN_SET && LA237_0<=REGEXP)||LA237_0==NOT_EXPR||(LA237_0>=SUM && LA237_0<=AVG)||(LA237_0>=COALESCE && LA237_0<=COUNT)||(LA237_0>=CASE && LA237_0<=CASE2)||(LA237_0>=PREVIOUS && LA237_0<=EXISTS)||(LA237_0>=INSTANCEOF && LA237_0<=CURRENT_TIMESTAMP)||LA237_0==NEWKW||(LA237_0>=EVAL_AND_EXPR && LA237_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA237_0==EVENT_PROP_EXPR||LA237_0==CONCAT||(LA237_0>=LIB_FUNC_CHAIN && LA237_0<=DOT_EXPR)||LA237_0==ARRAY_EXPR||(LA237_0>=NOT_IN_SET && LA237_0<=NOT_REGEXP)||(LA237_0>=IN_RANGE && LA237_0<=SUBSELECT_EXPR)||(LA237_0>=EXISTS_SUBSELECT_EXPR && LA237_0<=NOT_IN_SUBSELECT_EXPR)||LA237_0==SUBSTITUTION||(LA237_0>=FIRST_AGGREG && LA237_0<=WINDOW_AGGREG)||(LA237_0>=INT_TYPE && LA237_0<=NULL_TYPE)||(LA237_0>=STAR && LA237_0<=PLUS)||(LA237_0>=BAND && LA237_0<=BXOR)||(LA237_0>=LT && LA237_0<=GE)||(LA237_0>=MINUS && LA237_0<=MOD)||(LA237_0>=EVAL_IS_GROUP_EXPR && LA237_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt237=1;
                        }
                        switch (alt237) {
                            case 1 :
                                // EsperEPL2Ast.g:642:50: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4411);
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
                    // EsperEPL2Ast.g:643:4: ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? )
                    {
                    f=(CommonTree)match(input,WINDOW_AGGREG,FOLLOW_WINDOW_AGGREG_in_builtinFunc4423); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:643:22: ( DISTINCT )?
                        int alt238=2;
                        int LA238_0 = input.LA(1);

                        if ( (LA238_0==DISTINCT) ) {
                            alt238=1;
                        }
                        switch (alt238) {
                            case 1 :
                                // EsperEPL2Ast.g:643:23: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4426); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:643:34: ( accessValueExpr )?
                        int alt239=2;
                        int LA239_0 = input.LA(1);

                        if ( (LA239_0==ACCESS_AGG) ) {
                            alt239=1;
                        }
                        switch (alt239) {
                            case 1 :
                                // EsperEPL2Ast.g:643:34: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4430);
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
                    // EsperEPL2Ast.g:644:5: ^(f= COALESCE valueExpr valueExpr ( valueExpr )* )
                    {
                    f=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtinFunc4443); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4445);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4447);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:644:38: ( valueExpr )*
                    loop240:
                    do {
                        int alt240=2;
                        int LA240_0 = input.LA(1);

                        if ( ((LA240_0>=IN_SET && LA240_0<=REGEXP)||LA240_0==NOT_EXPR||(LA240_0>=SUM && LA240_0<=AVG)||(LA240_0>=COALESCE && LA240_0<=COUNT)||(LA240_0>=CASE && LA240_0<=CASE2)||(LA240_0>=PREVIOUS && LA240_0<=EXISTS)||(LA240_0>=INSTANCEOF && LA240_0<=CURRENT_TIMESTAMP)||LA240_0==NEWKW||(LA240_0>=EVAL_AND_EXPR && LA240_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA240_0==EVENT_PROP_EXPR||LA240_0==CONCAT||(LA240_0>=LIB_FUNC_CHAIN && LA240_0<=DOT_EXPR)||LA240_0==ARRAY_EXPR||(LA240_0>=NOT_IN_SET && LA240_0<=NOT_REGEXP)||(LA240_0>=IN_RANGE && LA240_0<=SUBSELECT_EXPR)||(LA240_0>=EXISTS_SUBSELECT_EXPR && LA240_0<=NOT_IN_SUBSELECT_EXPR)||LA240_0==SUBSTITUTION||(LA240_0>=FIRST_AGGREG && LA240_0<=WINDOW_AGGREG)||(LA240_0>=INT_TYPE && LA240_0<=NULL_TYPE)||(LA240_0>=STAR && LA240_0<=PLUS)||(LA240_0>=BAND && LA240_0<=BXOR)||(LA240_0>=LT && LA240_0<=GE)||(LA240_0>=MINUS && LA240_0<=MOD)||(LA240_0>=EVAL_IS_GROUP_EXPR && LA240_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt240=1;
                        }


                        switch (alt240) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:644:39: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_builtinFunc4450);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop240;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:645:5: ^(f= PREVIOUS valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_builtinFunc4465); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4467);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:645:28: ( valueExpr )?
                    int alt241=2;
                    int LA241_0 = input.LA(1);

                    if ( ((LA241_0>=IN_SET && LA241_0<=REGEXP)||LA241_0==NOT_EXPR||(LA241_0>=SUM && LA241_0<=AVG)||(LA241_0>=COALESCE && LA241_0<=COUNT)||(LA241_0>=CASE && LA241_0<=CASE2)||(LA241_0>=PREVIOUS && LA241_0<=EXISTS)||(LA241_0>=INSTANCEOF && LA241_0<=CURRENT_TIMESTAMP)||LA241_0==NEWKW||(LA241_0>=EVAL_AND_EXPR && LA241_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA241_0==EVENT_PROP_EXPR||LA241_0==CONCAT||(LA241_0>=LIB_FUNC_CHAIN && LA241_0<=DOT_EXPR)||LA241_0==ARRAY_EXPR||(LA241_0>=NOT_IN_SET && LA241_0<=NOT_REGEXP)||(LA241_0>=IN_RANGE && LA241_0<=SUBSELECT_EXPR)||(LA241_0>=EXISTS_SUBSELECT_EXPR && LA241_0<=NOT_IN_SUBSELECT_EXPR)||LA241_0==SUBSTITUTION||(LA241_0>=FIRST_AGGREG && LA241_0<=WINDOW_AGGREG)||(LA241_0>=INT_TYPE && LA241_0<=NULL_TYPE)||(LA241_0>=STAR && LA241_0<=PLUS)||(LA241_0>=BAND && LA241_0<=BXOR)||(LA241_0>=LT && LA241_0<=GE)||(LA241_0>=MINUS && LA241_0<=MOD)||(LA241_0>=EVAL_IS_GROUP_EXPR && LA241_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt241=1;
                    }
                    switch (alt241) {
                        case 1 :
                            // EsperEPL2Ast.g:645:28: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4469);
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
                    // EsperEPL2Ast.g:646:5: ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUSTAIL,FOLLOW_PREVIOUSTAIL_in_builtinFunc4482); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4484);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:646:32: ( valueExpr )?
                    int alt242=2;
                    int LA242_0 = input.LA(1);

                    if ( ((LA242_0>=IN_SET && LA242_0<=REGEXP)||LA242_0==NOT_EXPR||(LA242_0>=SUM && LA242_0<=AVG)||(LA242_0>=COALESCE && LA242_0<=COUNT)||(LA242_0>=CASE && LA242_0<=CASE2)||(LA242_0>=PREVIOUS && LA242_0<=EXISTS)||(LA242_0>=INSTANCEOF && LA242_0<=CURRENT_TIMESTAMP)||LA242_0==NEWKW||(LA242_0>=EVAL_AND_EXPR && LA242_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA242_0==EVENT_PROP_EXPR||LA242_0==CONCAT||(LA242_0>=LIB_FUNC_CHAIN && LA242_0<=DOT_EXPR)||LA242_0==ARRAY_EXPR||(LA242_0>=NOT_IN_SET && LA242_0<=NOT_REGEXP)||(LA242_0>=IN_RANGE && LA242_0<=SUBSELECT_EXPR)||(LA242_0>=EXISTS_SUBSELECT_EXPR && LA242_0<=NOT_IN_SUBSELECT_EXPR)||LA242_0==SUBSTITUTION||(LA242_0>=FIRST_AGGREG && LA242_0<=WINDOW_AGGREG)||(LA242_0>=INT_TYPE && LA242_0<=NULL_TYPE)||(LA242_0>=STAR && LA242_0<=PLUS)||(LA242_0>=BAND && LA242_0<=BXOR)||(LA242_0>=LT && LA242_0<=GE)||(LA242_0>=MINUS && LA242_0<=MOD)||(LA242_0>=EVAL_IS_GROUP_EXPR && LA242_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt242=1;
                    }
                    switch (alt242) {
                        case 1 :
                            // EsperEPL2Ast.g:646:32: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4486);
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
                    // EsperEPL2Ast.g:647:5: ^(f= PREVIOUSCOUNT valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSCOUNT,FOLLOW_PREVIOUSCOUNT_in_builtinFunc4499); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4501);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:648:5: ^(f= PREVIOUSWINDOW valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSWINDOW,FOLLOW_PREVIOUSWINDOW_in_builtinFunc4513); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4515);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:649:5: ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,PRIOR,FOLLOW_PRIOR_in_builtinFunc4527); 

                    match(input, Token.DOWN, null); 
                    c=(CommonTree)match(input,NUM_INT,FOLLOW_NUM_INT_in_builtinFunc4531); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4533);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    leaveNode(c); leaveNode(f);

                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:650:5: ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* )
                    {
                    f=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_builtinFunc4546); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4548);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4550); 
                    // EsperEPL2Ast.g:650:42: ( CLASS_IDENT )*
                    loop243:
                    do {
                        int alt243=2;
                        int LA243_0 = input.LA(1);

                        if ( (LA243_0==CLASS_IDENT) ) {
                            alt243=1;
                        }


                        switch (alt243) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:650:43: CLASS_IDENT
                    	    {
                    	    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4553); 

                    	    }
                    	    break;

                    	default :
                    	    break loop243;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:651:5: ^(f= TYPEOF valueExpr )
                    {
                    f=(CommonTree)match(input,TYPEOF,FOLLOW_TYPEOF_in_builtinFunc4567); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4569);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:652:5: ^(f= CAST valueExpr CLASS_IDENT )
                    {
                    f=(CommonTree)match(input,CAST,FOLLOW_CAST_in_builtinFunc4581); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4583);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4585); 

                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 19 :
                    // EsperEPL2Ast.g:653:5: ^(f= EXISTS eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_builtinFunc4597); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4599);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 20 :
                    // EsperEPL2Ast.g:654:4: ^(f= CURRENT_TIMESTAMP )
                    {
                    f=(CommonTree)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4611); 



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
    // EsperEPL2Ast.g:657:1: aggregationFilterExpr : ^( AGG_FILTER_EXPR valueExpr ) ;
    public final void aggregationFilterExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:658:2: ( ^( AGG_FILTER_EXPR valueExpr ) )
            // EsperEPL2Ast.g:658:4: ^( AGG_FILTER_EXPR valueExpr )
            {
            match(input,AGG_FILTER_EXPR,FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr4628); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_aggregationFilterExpr4630);
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
    // EsperEPL2Ast.g:661:1: accessValueExpr : ^( ACCESS_AGG accessValueExprChoice ) ;
    public final void accessValueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:662:2: ( ^( ACCESS_AGG accessValueExprChoice ) )
            // EsperEPL2Ast.g:662:5: ^( ACCESS_AGG accessValueExprChoice )
            {
            match(input,ACCESS_AGG,FOLLOW_ACCESS_AGG_in_accessValueExpr4644); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accessValueExprChoice_in_accessValueExpr4646);
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
    // EsperEPL2Ast.g:665:1: accessValueExprChoice : ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr );
    public final void accessValueExprChoice() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:666:2: ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr )
            int alt246=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt246=1;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt246=2;
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
                alt246=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 246, 0, input);

                throw nvae;
            }

            switch (alt246) {
                case 1 :
                    // EsperEPL2Ast.g:666:4: PROPERTY_WILDCARD_SELECT
                    {
                    match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice4661); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:666:31: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice4668); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice4670); 
                    // EsperEPL2Ast.g:666:67: ( IDENT )?
                    int alt245=2;
                    int LA245_0 = input.LA(1);

                    if ( (LA245_0==IDENT) ) {
                        alt245=1;
                    }
                    switch (alt245) {
                        case 1 :
                            // EsperEPL2Ast.g:666:67: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice4672); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:666:77: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_accessValueExprChoice4678);
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
    // EsperEPL2Ast.g:669:1: arrayExpr : ^(a= ARRAY_EXPR ( valueExpr )* ) ;
    public final void arrayExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:670:2: ( ^(a= ARRAY_EXPR ( valueExpr )* ) )
            // EsperEPL2Ast.g:670:4: ^(a= ARRAY_EXPR ( valueExpr )* )
            {
            a=(CommonTree)match(input,ARRAY_EXPR,FOLLOW_ARRAY_EXPR_in_arrayExpr4694); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:670:19: ( valueExpr )*
                loop247:
                do {
                    int alt247=2;
                    int LA247_0 = input.LA(1);

                    if ( ((LA247_0>=IN_SET && LA247_0<=REGEXP)||LA247_0==NOT_EXPR||(LA247_0>=SUM && LA247_0<=AVG)||(LA247_0>=COALESCE && LA247_0<=COUNT)||(LA247_0>=CASE && LA247_0<=CASE2)||(LA247_0>=PREVIOUS && LA247_0<=EXISTS)||(LA247_0>=INSTANCEOF && LA247_0<=CURRENT_TIMESTAMP)||LA247_0==NEWKW||(LA247_0>=EVAL_AND_EXPR && LA247_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA247_0==EVENT_PROP_EXPR||LA247_0==CONCAT||(LA247_0>=LIB_FUNC_CHAIN && LA247_0<=DOT_EXPR)||LA247_0==ARRAY_EXPR||(LA247_0>=NOT_IN_SET && LA247_0<=NOT_REGEXP)||(LA247_0>=IN_RANGE && LA247_0<=SUBSELECT_EXPR)||(LA247_0>=EXISTS_SUBSELECT_EXPR && LA247_0<=NOT_IN_SUBSELECT_EXPR)||LA247_0==SUBSTITUTION||(LA247_0>=FIRST_AGGREG && LA247_0<=WINDOW_AGGREG)||(LA247_0>=INT_TYPE && LA247_0<=NULL_TYPE)||(LA247_0>=STAR && LA247_0<=PLUS)||(LA247_0>=BAND && LA247_0<=BXOR)||(LA247_0>=LT && LA247_0<=GE)||(LA247_0>=MINUS && LA247_0<=MOD)||(LA247_0>=EVAL_IS_GROUP_EXPR && LA247_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt247=1;
                    }


                    switch (alt247) {
                	case 1 :
                	    // EsperEPL2Ast.g:670:20: valueExpr
                	    {
                	    pushFollow(FOLLOW_valueExpr_in_arrayExpr4697);
                	    valueExpr();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop247;
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
    // EsperEPL2Ast.g:673:1: arithmeticExpr : ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) );
    public final void arithmeticExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:674:2: ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) )
            int alt249=9;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt249=1;
                }
                break;
            case MINUS:
                {
                alt249=2;
                }
                break;
            case DIV:
                {
                alt249=3;
                }
                break;
            case STAR:
                {
                alt249=4;
                }
                break;
            case MOD:
                {
                alt249=5;
                }
                break;
            case BAND:
                {
                alt249=6;
                }
                break;
            case BOR:
                {
                alt249=7;
                }
                break;
            case BXOR:
                {
                alt249=8;
                }
                break;
            case CONCAT:
                {
                alt249=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 249, 0, input);

                throw nvae;
            }

            switch (alt249) {
                case 1 :
                    // EsperEPL2Ast.g:674:5: ^(a= PLUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_arithmeticExpr4718); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4720);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4722);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:675:5: ^(a= MINUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_arithmeticExpr4734); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4736);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4738);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:676:5: ^(a= DIV valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,DIV,FOLLOW_DIV_in_arithmeticExpr4750); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4752);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4754);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:677:4: ^(a= STAR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,STAR,FOLLOW_STAR_in_arithmeticExpr4765); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4767);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4769);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:678:5: ^(a= MOD valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MOD,FOLLOW_MOD_in_arithmeticExpr4781); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4783);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4785);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:679:4: ^(a= BAND valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BAND,FOLLOW_BAND_in_arithmeticExpr4796); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4798);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4800);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:680:4: ^(a= BOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BOR,FOLLOW_BOR_in_arithmeticExpr4811); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4813);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4815);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:681:4: ^(a= BXOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BXOR,FOLLOW_BXOR_in_arithmeticExpr4826); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4828);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4830);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:682:5: ^(a= CONCAT valueExpr valueExpr ( valueExpr )* )
                    {
                    a=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_arithmeticExpr4842); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4844);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4846);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:682:36: ( valueExpr )*
                    loop248:
                    do {
                        int alt248=2;
                        int LA248_0 = input.LA(1);

                        if ( ((LA248_0>=IN_SET && LA248_0<=REGEXP)||LA248_0==NOT_EXPR||(LA248_0>=SUM && LA248_0<=AVG)||(LA248_0>=COALESCE && LA248_0<=COUNT)||(LA248_0>=CASE && LA248_0<=CASE2)||(LA248_0>=PREVIOUS && LA248_0<=EXISTS)||(LA248_0>=INSTANCEOF && LA248_0<=CURRENT_TIMESTAMP)||LA248_0==NEWKW||(LA248_0>=EVAL_AND_EXPR && LA248_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA248_0==EVENT_PROP_EXPR||LA248_0==CONCAT||(LA248_0>=LIB_FUNC_CHAIN && LA248_0<=DOT_EXPR)||LA248_0==ARRAY_EXPR||(LA248_0>=NOT_IN_SET && LA248_0<=NOT_REGEXP)||(LA248_0>=IN_RANGE && LA248_0<=SUBSELECT_EXPR)||(LA248_0>=EXISTS_SUBSELECT_EXPR && LA248_0<=NOT_IN_SUBSELECT_EXPR)||LA248_0==SUBSTITUTION||(LA248_0>=FIRST_AGGREG && LA248_0<=WINDOW_AGGREG)||(LA248_0>=INT_TYPE && LA248_0<=NULL_TYPE)||(LA248_0>=STAR && LA248_0<=PLUS)||(LA248_0>=BAND && LA248_0<=BXOR)||(LA248_0>=LT && LA248_0<=GE)||(LA248_0>=MINUS && LA248_0<=MOD)||(LA248_0>=EVAL_IS_GROUP_EXPR && LA248_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt248=1;
                        }


                        switch (alt248) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:682:37: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4849);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop248;
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
    // EsperEPL2Ast.g:685:1: dotExpr : ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) ;
    public final void dotExpr() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:686:2: ( ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) )
            // EsperEPL2Ast.g:686:4: ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* )
            {
            d=(CommonTree)match(input,DOT_EXPR,FOLLOW_DOT_EXPR_in_dotExpr4869); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dotExpr4871);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:686:27: ( libFunctionWithClass )*
            loop250:
            do {
                int alt250=2;
                int LA250_0 = input.LA(1);

                if ( (LA250_0==LIB_FUNCTION) ) {
                    alt250=1;
                }


                switch (alt250) {
            	case 1 :
            	    // EsperEPL2Ast.g:686:27: libFunctionWithClass
            	    {
            	    pushFollow(FOLLOW_libFunctionWithClass_in_dotExpr4873);
            	    libFunctionWithClass();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop250;
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
    // EsperEPL2Ast.g:689:1: newExpr : ^(n= NEWKW ( newAssign )* ) ;
    public final void newExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:689:9: ( ^(n= NEWKW ( newAssign )* ) )
            // EsperEPL2Ast.g:689:11: ^(n= NEWKW ( newAssign )* )
            {
            n=(CommonTree)match(input,NEWKW,FOLLOW_NEWKW_in_newExpr4891); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:689:21: ( newAssign )*
                loop251:
                do {
                    int alt251=2;
                    int LA251_0 = input.LA(1);

                    if ( (LA251_0==NEW_ITEM) ) {
                        alt251=1;
                    }


                    switch (alt251) {
                	case 1 :
                	    // EsperEPL2Ast.g:689:21: newAssign
                	    {
                	    pushFollow(FOLLOW_newAssign_in_newExpr4893);
                	    newAssign();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop251;
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
    // EsperEPL2Ast.g:692:1: newAssign : ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) ;
    public final void newAssign() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:693:2: ( ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) )
            // EsperEPL2Ast.g:693:4: ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? )
            {
            match(input,NEW_ITEM,FOLLOW_NEW_ITEM_in_newAssign4909); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_newAssign4911);
            eventPropertyExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:693:40: ( valueExpr )?
            int alt252=2;
            int LA252_0 = input.LA(1);

            if ( ((LA252_0>=IN_SET && LA252_0<=REGEXP)||LA252_0==NOT_EXPR||(LA252_0>=SUM && LA252_0<=AVG)||(LA252_0>=COALESCE && LA252_0<=COUNT)||(LA252_0>=CASE && LA252_0<=CASE2)||(LA252_0>=PREVIOUS && LA252_0<=EXISTS)||(LA252_0>=INSTANCEOF && LA252_0<=CURRENT_TIMESTAMP)||LA252_0==NEWKW||(LA252_0>=EVAL_AND_EXPR && LA252_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA252_0==EVENT_PROP_EXPR||LA252_0==CONCAT||(LA252_0>=LIB_FUNC_CHAIN && LA252_0<=DOT_EXPR)||LA252_0==ARRAY_EXPR||(LA252_0>=NOT_IN_SET && LA252_0<=NOT_REGEXP)||(LA252_0>=IN_RANGE && LA252_0<=SUBSELECT_EXPR)||(LA252_0>=EXISTS_SUBSELECT_EXPR && LA252_0<=NOT_IN_SUBSELECT_EXPR)||LA252_0==SUBSTITUTION||(LA252_0>=FIRST_AGGREG && LA252_0<=WINDOW_AGGREG)||(LA252_0>=INT_TYPE && LA252_0<=NULL_TYPE)||(LA252_0>=STAR && LA252_0<=PLUS)||(LA252_0>=BAND && LA252_0<=BXOR)||(LA252_0>=LT && LA252_0<=GE)||(LA252_0>=MINUS && LA252_0<=MOD)||(LA252_0>=EVAL_IS_GROUP_EXPR && LA252_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt252=1;
            }
            switch (alt252) {
                case 1 :
                    // EsperEPL2Ast.g:693:40: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_newAssign4914);
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
    // EsperEPL2Ast.g:696:1: libFuncChain : ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) ;
    public final void libFuncChain() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:697:2: ( ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) )
            // EsperEPL2Ast.g:697:6: ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* )
            {
            l=(CommonTree)match(input,LIB_FUNC_CHAIN,FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain4932); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_libFuncChain4934);
            libFunctionWithClass();

            state._fsp--;

            // EsperEPL2Ast.g:697:46: ( libOrPropFunction )*
            loop253:
            do {
                int alt253=2;
                int LA253_0 = input.LA(1);

                if ( (LA253_0==EVENT_PROP_EXPR||LA253_0==LIB_FUNCTION) ) {
                    alt253=1;
                }


                switch (alt253) {
            	case 1 :
            	    // EsperEPL2Ast.g:697:46: libOrPropFunction
            	    {
            	    pushFollow(FOLLOW_libOrPropFunction_in_libFuncChain4936);
            	    libOrPropFunction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop253;
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
    // EsperEPL2Ast.g:700:1: libFunctionWithClass : ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) ;
    public final void libFunctionWithClass() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:701:2: ( ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) )
            // EsperEPL2Ast.g:701:6: ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? )
            {
            l=(CommonTree)match(input,LIB_FUNCTION,FOLLOW_LIB_FUNCTION_in_libFunctionWithClass4956); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:701:23: ( CLASS_IDENT )?
            int alt254=2;
            int LA254_0 = input.LA(1);

            if ( (LA254_0==CLASS_IDENT) ) {
                alt254=1;
            }
            switch (alt254) {
                case 1 :
                    // EsperEPL2Ast.g:701:24: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_libFunctionWithClass4959); 

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_libFunctionWithClass4963); 
            // EsperEPL2Ast.g:701:44: ( DISTINCT )?
            int alt255=2;
            int LA255_0 = input.LA(1);

            if ( (LA255_0==DISTINCT) ) {
                alt255=1;
            }
            switch (alt255) {
                case 1 :
                    // EsperEPL2Ast.g:701:45: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_libFunctionWithClass4966); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:701:56: ( libFunctionArgItem )*
            loop256:
            do {
                int alt256=2;
                int LA256_0 = input.LA(1);

                if ( ((LA256_0>=IN_SET && LA256_0<=REGEXP)||LA256_0==NOT_EXPR||(LA256_0>=SUM && LA256_0<=AVG)||(LA256_0>=COALESCE && LA256_0<=COUNT)||(LA256_0>=CASE && LA256_0<=CASE2)||LA256_0==LAST||(LA256_0>=PREVIOUS && LA256_0<=EXISTS)||(LA256_0>=LW && LA256_0<=CURRENT_TIMESTAMP)||LA256_0==NEWKW||(LA256_0>=NUMERIC_PARAM_RANGE && LA256_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA256_0>=EVAL_AND_EXPR && LA256_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA256_0==EVENT_PROP_EXPR||LA256_0==CONCAT||(LA256_0>=LIB_FUNC_CHAIN && LA256_0<=DOT_EXPR)||(LA256_0>=TIME_PERIOD && LA256_0<=ARRAY_EXPR)||(LA256_0>=NOT_IN_SET && LA256_0<=NOT_REGEXP)||(LA256_0>=IN_RANGE && LA256_0<=SUBSELECT_EXPR)||(LA256_0>=EXISTS_SUBSELECT_EXPR && LA256_0<=NOT_IN_SUBSELECT_EXPR)||(LA256_0>=LAST_OPERATOR && LA256_0<=SUBSTITUTION)||LA256_0==NUMBERSETSTAR||(LA256_0>=FIRST_AGGREG && LA256_0<=WINDOW_AGGREG)||(LA256_0>=INT_TYPE && LA256_0<=NULL_TYPE)||LA256_0==GOES||(LA256_0>=STAR && LA256_0<=PLUS)||(LA256_0>=BAND && LA256_0<=BXOR)||(LA256_0>=LT && LA256_0<=GE)||(LA256_0>=MINUS && LA256_0<=MOD)||(LA256_0>=EVAL_IS_GROUP_EXPR && LA256_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt256=1;
                }


                switch (alt256) {
            	case 1 :
            	    // EsperEPL2Ast.g:701:56: libFunctionArgItem
            	    {
            	    pushFollow(FOLLOW_libFunctionArgItem_in_libFunctionWithClass4970);
            	    libFunctionArgItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop256;
                }
            } while (true);

            // EsperEPL2Ast.g:701:76: ( LPAREN )?
            int alt257=2;
            int LA257_0 = input.LA(1);

            if ( (LA257_0==LPAREN) ) {
                alt257=1;
            }
            switch (alt257) {
                case 1 :
                    // EsperEPL2Ast.g:701:76: LPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_libFunctionWithClass4973); 

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
    // EsperEPL2Ast.g:704:1: libFunctionArgItem : ( expressionLambdaDecl | valueExprWithTime );
    public final void libFunctionArgItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:705:2: ( expressionLambdaDecl | valueExprWithTime )
            int alt258=2;
            int LA258_0 = input.LA(1);

            if ( (LA258_0==GOES) ) {
                alt258=1;
            }
            else if ( ((LA258_0>=IN_SET && LA258_0<=REGEXP)||LA258_0==NOT_EXPR||(LA258_0>=SUM && LA258_0<=AVG)||(LA258_0>=COALESCE && LA258_0<=COUNT)||(LA258_0>=CASE && LA258_0<=CASE2)||LA258_0==LAST||(LA258_0>=PREVIOUS && LA258_0<=EXISTS)||(LA258_0>=LW && LA258_0<=CURRENT_TIMESTAMP)||LA258_0==NEWKW||(LA258_0>=NUMERIC_PARAM_RANGE && LA258_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA258_0>=EVAL_AND_EXPR && LA258_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA258_0==EVENT_PROP_EXPR||LA258_0==CONCAT||(LA258_0>=LIB_FUNC_CHAIN && LA258_0<=DOT_EXPR)||(LA258_0>=TIME_PERIOD && LA258_0<=ARRAY_EXPR)||(LA258_0>=NOT_IN_SET && LA258_0<=NOT_REGEXP)||(LA258_0>=IN_RANGE && LA258_0<=SUBSELECT_EXPR)||(LA258_0>=EXISTS_SUBSELECT_EXPR && LA258_0<=NOT_IN_SUBSELECT_EXPR)||(LA258_0>=LAST_OPERATOR && LA258_0<=SUBSTITUTION)||LA258_0==NUMBERSETSTAR||(LA258_0>=FIRST_AGGREG && LA258_0<=WINDOW_AGGREG)||(LA258_0>=INT_TYPE && LA258_0<=NULL_TYPE)||(LA258_0>=STAR && LA258_0<=PLUS)||(LA258_0>=BAND && LA258_0<=BXOR)||(LA258_0>=LT && LA258_0<=GE)||(LA258_0>=MINUS && LA258_0<=MOD)||(LA258_0>=EVAL_IS_GROUP_EXPR && LA258_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt258=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 258, 0, input);

                throw nvae;
            }
            switch (alt258) {
                case 1 :
                    // EsperEPL2Ast.g:705:4: expressionLambdaDecl
                    {
                    pushFollow(FOLLOW_expressionLambdaDecl_in_libFunctionArgItem4987);
                    expressionLambdaDecl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:705:27: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_libFunctionArgItem4991);
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
    // EsperEPL2Ast.g:708:1: libOrPropFunction : ( eventPropertyExpr[false] | libFunctionWithClass );
    public final void libOrPropFunction() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:709:2: ( eventPropertyExpr[false] | libFunctionWithClass )
            int alt259=2;
            int LA259_0 = input.LA(1);

            if ( (LA259_0==EVENT_PROP_EXPR) ) {
                alt259=1;
            }
            else if ( (LA259_0==LIB_FUNCTION) ) {
                alt259=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 259, 0, input);

                throw nvae;
            }
            switch (alt259) {
                case 1 :
                    // EsperEPL2Ast.g:709:7: eventPropertyExpr[false]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_libOrPropFunction5006);
                    eventPropertyExpr(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:710:7: libFunctionWithClass
                    {
                    pushFollow(FOLLOW_libFunctionWithClass_in_libOrPropFunction5016);
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
    // EsperEPL2Ast.g:716:1: startPatternExpressionRule : ( annotation[true] )* exprChoice ;
    public final void startPatternExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:717:2: ( ( annotation[true] )* exprChoice )
            // EsperEPL2Ast.g:717:4: ( annotation[true] )* exprChoice
            {
            // EsperEPL2Ast.g:717:4: ( annotation[true] )*
            loop260:
            do {
                int alt260=2;
                int LA260_0 = input.LA(1);

                if ( (LA260_0==ANNOTATION) ) {
                    alt260=1;
                }


                switch (alt260) {
            	case 1 :
            	    // EsperEPL2Ast.g:717:4: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startPatternExpressionRule5031);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop260;
                }
            } while (true);

            pushFollow(FOLLOW_exprChoice_in_startPatternExpressionRule5035);
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
    // EsperEPL2Ast.g:720:1: exprChoice : ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) );
    public final void exprChoice() throws RecognitionException {
        CommonTree a=null;
        CommonTree n=null;
        CommonTree g=null;
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:721:2: ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) )
            int alt265=7;
            switch ( input.LA(1) ) {
            case PATTERN_FILTER_EXPR:
            case OBSERVER_EXPR:
                {
                alt265=1;
                }
                break;
            case OR_EXPR:
            case AND_EXPR:
            case FOLLOWED_BY_EXPR:
                {
                alt265=2;
                }
                break;
            case EVERY_EXPR:
                {
                alt265=3;
                }
                break;
            case EVERY_DISTINCT_EXPR:
                {
                alt265=4;
                }
                break;
            case PATTERN_NOT_EXPR:
                {
                alt265=5;
                }
                break;
            case GUARD_EXPR:
                {
                alt265=6;
                }
                break;
            case MATCH_UNTIL_EXPR:
                {
                alt265=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 265, 0, input);

                throw nvae;
            }

            switch (alt265) {
                case 1 :
                    // EsperEPL2Ast.g:721:5: atomicExpr
                    {
                    pushFollow(FOLLOW_atomicExpr_in_exprChoice5049);
                    atomicExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:722:4: patternOp
                    {
                    pushFollow(FOLLOW_patternOp_in_exprChoice5054);
                    patternOp();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:723:5: ^(a= EVERY_EXPR exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_EXPR,FOLLOW_EVERY_EXPR_in_exprChoice5064); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5066);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:724:5: ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_DISTINCT_EXPR,FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5080); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distinctExpressions_in_exprChoice5082);
                    distinctExpressions();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5084);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:725:5: ^(n= PATTERN_NOT_EXPR exprChoice )
                    {
                    n=(CommonTree)match(input,PATTERN_NOT_EXPR,FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5098); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5100);
                    exprChoice();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:726:5: ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) )
                    {
                    g=(CommonTree)match(input,GUARD_EXPR,FOLLOW_GUARD_EXPR_in_exprChoice5114); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5116);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:726:32: ( IDENT IDENT ( valueExprWithTime )* | valueExpr )
                    int alt262=2;
                    int LA262_0 = input.LA(1);

                    if ( (LA262_0==IDENT) ) {
                        alt262=1;
                    }
                    else if ( ((LA262_0>=IN_SET && LA262_0<=REGEXP)||LA262_0==NOT_EXPR||(LA262_0>=SUM && LA262_0<=AVG)||(LA262_0>=COALESCE && LA262_0<=COUNT)||(LA262_0>=CASE && LA262_0<=CASE2)||(LA262_0>=PREVIOUS && LA262_0<=EXISTS)||(LA262_0>=INSTANCEOF && LA262_0<=CURRENT_TIMESTAMP)||LA262_0==NEWKW||(LA262_0>=EVAL_AND_EXPR && LA262_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA262_0==EVENT_PROP_EXPR||LA262_0==CONCAT||(LA262_0>=LIB_FUNC_CHAIN && LA262_0<=DOT_EXPR)||LA262_0==ARRAY_EXPR||(LA262_0>=NOT_IN_SET && LA262_0<=NOT_REGEXP)||(LA262_0>=IN_RANGE && LA262_0<=SUBSELECT_EXPR)||(LA262_0>=EXISTS_SUBSELECT_EXPR && LA262_0<=NOT_IN_SUBSELECT_EXPR)||LA262_0==SUBSTITUTION||(LA262_0>=FIRST_AGGREG && LA262_0<=WINDOW_AGGREG)||(LA262_0>=INT_TYPE && LA262_0<=NULL_TYPE)||(LA262_0>=STAR && LA262_0<=PLUS)||(LA262_0>=BAND && LA262_0<=BXOR)||(LA262_0>=LT && LA262_0<=GE)||(LA262_0>=MINUS && LA262_0<=MOD)||(LA262_0>=EVAL_IS_GROUP_EXPR && LA262_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt262=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 262, 0, input);

                        throw nvae;
                    }
                    switch (alt262) {
                        case 1 :
                            // EsperEPL2Ast.g:726:33: IDENT IDENT ( valueExprWithTime )*
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5119); 
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5121); 
                            // EsperEPL2Ast.g:726:45: ( valueExprWithTime )*
                            loop261:
                            do {
                                int alt261=2;
                                int LA261_0 = input.LA(1);

                                if ( ((LA261_0>=IN_SET && LA261_0<=REGEXP)||LA261_0==NOT_EXPR||(LA261_0>=SUM && LA261_0<=AVG)||(LA261_0>=COALESCE && LA261_0<=COUNT)||(LA261_0>=CASE && LA261_0<=CASE2)||LA261_0==LAST||(LA261_0>=PREVIOUS && LA261_0<=EXISTS)||(LA261_0>=LW && LA261_0<=CURRENT_TIMESTAMP)||LA261_0==NEWKW||(LA261_0>=NUMERIC_PARAM_RANGE && LA261_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA261_0>=EVAL_AND_EXPR && LA261_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA261_0==EVENT_PROP_EXPR||LA261_0==CONCAT||(LA261_0>=LIB_FUNC_CHAIN && LA261_0<=DOT_EXPR)||(LA261_0>=TIME_PERIOD && LA261_0<=ARRAY_EXPR)||(LA261_0>=NOT_IN_SET && LA261_0<=NOT_REGEXP)||(LA261_0>=IN_RANGE && LA261_0<=SUBSELECT_EXPR)||(LA261_0>=EXISTS_SUBSELECT_EXPR && LA261_0<=NOT_IN_SUBSELECT_EXPR)||(LA261_0>=LAST_OPERATOR && LA261_0<=SUBSTITUTION)||LA261_0==NUMBERSETSTAR||(LA261_0>=FIRST_AGGREG && LA261_0<=WINDOW_AGGREG)||(LA261_0>=INT_TYPE && LA261_0<=NULL_TYPE)||(LA261_0>=STAR && LA261_0<=PLUS)||(LA261_0>=BAND && LA261_0<=BXOR)||(LA261_0>=LT && LA261_0<=GE)||(LA261_0>=MINUS && LA261_0<=MOD)||(LA261_0>=EVAL_IS_GROUP_EXPR && LA261_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt261=1;
                                }


                                switch (alt261) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:726:45: valueExprWithTime
                            	    {
                            	    pushFollow(FOLLOW_valueExprWithTime_in_exprChoice5123);
                            	    valueExprWithTime();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop261;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:726:66: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_exprChoice5128);
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
                    // EsperEPL2Ast.g:727:4: ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? )
                    {
                    m=(CommonTree)match(input,MATCH_UNTIL_EXPR,FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5142); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:727:26: ( matchUntilRange )?
                    int alt263=2;
                    int LA263_0 = input.LA(1);

                    if ( ((LA263_0>=MATCH_UNTIL_RANGE_HALFOPEN && LA263_0<=MATCH_UNTIL_RANGE_BOUNDED)) ) {
                        alt263=1;
                    }
                    switch (alt263) {
                        case 1 :
                            // EsperEPL2Ast.g:727:26: matchUntilRange
                            {
                            pushFollow(FOLLOW_matchUntilRange_in_exprChoice5144);
                            matchUntilRange();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5147);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:727:54: ( exprChoice )?
                    int alt264=2;
                    int LA264_0 = input.LA(1);

                    if ( ((LA264_0>=OR_EXPR && LA264_0<=AND_EXPR)||(LA264_0>=EVERY_EXPR && LA264_0<=EVERY_DISTINCT_EXPR)||LA264_0==FOLLOWED_BY_EXPR||(LA264_0>=PATTERN_FILTER_EXPR && LA264_0<=PATTERN_NOT_EXPR)||(LA264_0>=GUARD_EXPR && LA264_0<=OBSERVER_EXPR)||LA264_0==MATCH_UNTIL_EXPR) ) {
                        alt264=1;
                    }
                    switch (alt264) {
                        case 1 :
                            // EsperEPL2Ast.g:727:54: exprChoice
                            {
                            pushFollow(FOLLOW_exprChoice_in_exprChoice5149);
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
    // EsperEPL2Ast.g:731:1: distinctExpressions : ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) ;
    public final void distinctExpressions() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:732:2: ( ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) )
            // EsperEPL2Ast.g:732:4: ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ )
            {
            match(input,PATTERN_EVERY_DISTINCT_EXPR,FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5170); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:732:35: ( valueExprWithTime )+
            int cnt266=0;
            loop266:
            do {
                int alt266=2;
                int LA266_0 = input.LA(1);

                if ( ((LA266_0>=IN_SET && LA266_0<=REGEXP)||LA266_0==NOT_EXPR||(LA266_0>=SUM && LA266_0<=AVG)||(LA266_0>=COALESCE && LA266_0<=COUNT)||(LA266_0>=CASE && LA266_0<=CASE2)||LA266_0==LAST||(LA266_0>=PREVIOUS && LA266_0<=EXISTS)||(LA266_0>=LW && LA266_0<=CURRENT_TIMESTAMP)||LA266_0==NEWKW||(LA266_0>=NUMERIC_PARAM_RANGE && LA266_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA266_0>=EVAL_AND_EXPR && LA266_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA266_0==EVENT_PROP_EXPR||LA266_0==CONCAT||(LA266_0>=LIB_FUNC_CHAIN && LA266_0<=DOT_EXPR)||(LA266_0>=TIME_PERIOD && LA266_0<=ARRAY_EXPR)||(LA266_0>=NOT_IN_SET && LA266_0<=NOT_REGEXP)||(LA266_0>=IN_RANGE && LA266_0<=SUBSELECT_EXPR)||(LA266_0>=EXISTS_SUBSELECT_EXPR && LA266_0<=NOT_IN_SUBSELECT_EXPR)||(LA266_0>=LAST_OPERATOR && LA266_0<=SUBSTITUTION)||LA266_0==NUMBERSETSTAR||(LA266_0>=FIRST_AGGREG && LA266_0<=WINDOW_AGGREG)||(LA266_0>=INT_TYPE && LA266_0<=NULL_TYPE)||(LA266_0>=STAR && LA266_0<=PLUS)||(LA266_0>=BAND && LA266_0<=BXOR)||(LA266_0>=LT && LA266_0<=GE)||(LA266_0>=MINUS && LA266_0<=MOD)||(LA266_0>=EVAL_IS_GROUP_EXPR && LA266_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt266=1;
                }


                switch (alt266) {
            	case 1 :
            	    // EsperEPL2Ast.g:732:35: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_distinctExpressions5172);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt266 >= 1 ) break loop266;
                        EarlyExitException eee =
                            new EarlyExitException(266, input);
                        throw eee;
                }
                cnt266++;
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
    // EsperEPL2Ast.g:735:1: patternOp : ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) );
    public final void patternOp() throws RecognitionException {
        CommonTree f=null;
        CommonTree o=null;
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:736:2: ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) )
            int alt270=3;
            switch ( input.LA(1) ) {
            case FOLLOWED_BY_EXPR:
                {
                alt270=1;
                }
                break;
            case OR_EXPR:
                {
                alt270=2;
                }
                break;
            case AND_EXPR:
                {
                alt270=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 270, 0, input);

                throw nvae;
            }

            switch (alt270) {
                case 1 :
                    // EsperEPL2Ast.g:736:4: ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* )
                    {
                    f=(CommonTree)match(input,FOLLOWED_BY_EXPR,FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5191); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_followedByItem_in_patternOp5193);
                    followedByItem();

                    state._fsp--;

                    pushFollow(FOLLOW_followedByItem_in_patternOp5195);
                    followedByItem();

                    state._fsp--;

                    // EsperEPL2Ast.g:736:56: ( followedByItem )*
                    loop267:
                    do {
                        int alt267=2;
                        int LA267_0 = input.LA(1);

                        if ( (LA267_0==FOLLOWED_BY_ITEM) ) {
                            alt267=1;
                        }


                        switch (alt267) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:736:57: followedByItem
                    	    {
                    	    pushFollow(FOLLOW_followedByItem_in_patternOp5198);
                    	    followedByItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop267;
                        }
                    } while (true);

                     leaveNode(f); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:737:5: ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    o=(CommonTree)match(input,OR_EXPR,FOLLOW_OR_EXPR_in_patternOp5214); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5216);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5218);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:737:40: ( exprChoice )*
                    loop268:
                    do {
                        int alt268=2;
                        int LA268_0 = input.LA(1);

                        if ( ((LA268_0>=OR_EXPR && LA268_0<=AND_EXPR)||(LA268_0>=EVERY_EXPR && LA268_0<=EVERY_DISTINCT_EXPR)||LA268_0==FOLLOWED_BY_EXPR||(LA268_0>=PATTERN_FILTER_EXPR && LA268_0<=PATTERN_NOT_EXPR)||(LA268_0>=GUARD_EXPR && LA268_0<=OBSERVER_EXPR)||LA268_0==MATCH_UNTIL_EXPR) ) {
                            alt268=1;
                        }


                        switch (alt268) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:737:41: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5221);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop268;
                        }
                    } while (true);

                     leaveNode(o); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:738:5: ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    a=(CommonTree)match(input,AND_EXPR,FOLLOW_AND_EXPR_in_patternOp5237); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5239);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5241);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:738:41: ( exprChoice )*
                    loop269:
                    do {
                        int alt269=2;
                        int LA269_0 = input.LA(1);

                        if ( ((LA269_0>=OR_EXPR && LA269_0<=AND_EXPR)||(LA269_0>=EVERY_EXPR && LA269_0<=EVERY_DISTINCT_EXPR)||LA269_0==FOLLOWED_BY_EXPR||(LA269_0>=PATTERN_FILTER_EXPR && LA269_0<=PATTERN_NOT_EXPR)||(LA269_0>=GUARD_EXPR && LA269_0<=OBSERVER_EXPR)||LA269_0==MATCH_UNTIL_EXPR) ) {
                            alt269=1;
                        }


                        switch (alt269) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:738:42: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5244);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop269;
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
    // EsperEPL2Ast.g:741:1: followedByItem : ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) ;
    public final void followedByItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:742:2: ( ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) )
            // EsperEPL2Ast.g:742:4: ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice )
            {
            match(input,FOLLOWED_BY_ITEM,FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5265); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:742:24: ( valueExpr )?
            int alt271=2;
            int LA271_0 = input.LA(1);

            if ( ((LA271_0>=IN_SET && LA271_0<=REGEXP)||LA271_0==NOT_EXPR||(LA271_0>=SUM && LA271_0<=AVG)||(LA271_0>=COALESCE && LA271_0<=COUNT)||(LA271_0>=CASE && LA271_0<=CASE2)||(LA271_0>=PREVIOUS && LA271_0<=EXISTS)||(LA271_0>=INSTANCEOF && LA271_0<=CURRENT_TIMESTAMP)||LA271_0==NEWKW||(LA271_0>=EVAL_AND_EXPR && LA271_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA271_0==EVENT_PROP_EXPR||LA271_0==CONCAT||(LA271_0>=LIB_FUNC_CHAIN && LA271_0<=DOT_EXPR)||LA271_0==ARRAY_EXPR||(LA271_0>=NOT_IN_SET && LA271_0<=NOT_REGEXP)||(LA271_0>=IN_RANGE && LA271_0<=SUBSELECT_EXPR)||(LA271_0>=EXISTS_SUBSELECT_EXPR && LA271_0<=NOT_IN_SUBSELECT_EXPR)||LA271_0==SUBSTITUTION||(LA271_0>=FIRST_AGGREG && LA271_0<=WINDOW_AGGREG)||(LA271_0>=INT_TYPE && LA271_0<=NULL_TYPE)||(LA271_0>=STAR && LA271_0<=PLUS)||(LA271_0>=BAND && LA271_0<=BXOR)||(LA271_0>=LT && LA271_0<=GE)||(LA271_0>=MINUS && LA271_0<=MOD)||(LA271_0>=EVAL_IS_GROUP_EXPR && LA271_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt271=1;
            }
            switch (alt271) {
                case 1 :
                    // EsperEPL2Ast.g:742:24: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_followedByItem5267);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_exprChoice_in_followedByItem5270);
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
    // EsperEPL2Ast.g:745:1: atomicExpr : ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) );
    public final void atomicExpr() throws RecognitionException {
        CommonTree ac=null;

        try {
            // EsperEPL2Ast.g:746:2: ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            int alt273=2;
            int LA273_0 = input.LA(1);

            if ( (LA273_0==PATTERN_FILTER_EXPR) ) {
                alt273=1;
            }
            else if ( (LA273_0==OBSERVER_EXPR) ) {
                alt273=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 273, 0, input);

                throw nvae;
            }
            switch (alt273) {
                case 1 :
                    // EsperEPL2Ast.g:746:4: patternFilterExpr
                    {
                    pushFollow(FOLLOW_patternFilterExpr_in_atomicExpr5284);
                    patternFilterExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:747:7: ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* )
                    {
                    ac=(CommonTree)match(input,OBSERVER_EXPR,FOLLOW_OBSERVER_EXPR_in_atomicExpr5296); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5298); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5300); 
                    // EsperEPL2Ast.g:747:39: ( valueExprWithTime )*
                    loop272:
                    do {
                        int alt272=2;
                        int LA272_0 = input.LA(1);

                        if ( ((LA272_0>=IN_SET && LA272_0<=REGEXP)||LA272_0==NOT_EXPR||(LA272_0>=SUM && LA272_0<=AVG)||(LA272_0>=COALESCE && LA272_0<=COUNT)||(LA272_0>=CASE && LA272_0<=CASE2)||LA272_0==LAST||(LA272_0>=PREVIOUS && LA272_0<=EXISTS)||(LA272_0>=LW && LA272_0<=CURRENT_TIMESTAMP)||LA272_0==NEWKW||(LA272_0>=NUMERIC_PARAM_RANGE && LA272_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA272_0>=EVAL_AND_EXPR && LA272_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA272_0==EVENT_PROP_EXPR||LA272_0==CONCAT||(LA272_0>=LIB_FUNC_CHAIN && LA272_0<=DOT_EXPR)||(LA272_0>=TIME_PERIOD && LA272_0<=ARRAY_EXPR)||(LA272_0>=NOT_IN_SET && LA272_0<=NOT_REGEXP)||(LA272_0>=IN_RANGE && LA272_0<=SUBSELECT_EXPR)||(LA272_0>=EXISTS_SUBSELECT_EXPR && LA272_0<=NOT_IN_SUBSELECT_EXPR)||(LA272_0>=LAST_OPERATOR && LA272_0<=SUBSTITUTION)||LA272_0==NUMBERSETSTAR||(LA272_0>=FIRST_AGGREG && LA272_0<=WINDOW_AGGREG)||(LA272_0>=INT_TYPE && LA272_0<=NULL_TYPE)||(LA272_0>=STAR && LA272_0<=PLUS)||(LA272_0>=BAND && LA272_0<=BXOR)||(LA272_0>=LT && LA272_0<=GE)||(LA272_0>=MINUS && LA272_0<=MOD)||(LA272_0>=EVAL_IS_GROUP_EXPR && LA272_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt272=1;
                        }


                        switch (alt272) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:747:39: valueExprWithTime
                    	    {
                    	    pushFollow(FOLLOW_valueExprWithTime_in_atomicExpr5302);
                    	    valueExprWithTime();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop272;
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
    // EsperEPL2Ast.g:750:1: patternFilterExpr : ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) ;
    public final void patternFilterExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:751:2: ( ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:751:4: ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,PATTERN_FILTER_EXPR,FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5322); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:751:29: ( IDENT )?
            int alt274=2;
            int LA274_0 = input.LA(1);

            if ( (LA274_0==IDENT) ) {
                alt274=1;
            }
            switch (alt274) {
                case 1 :
                    // EsperEPL2Ast.g:751:29: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_patternFilterExpr5324); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_patternFilterExpr5327); 
            // EsperEPL2Ast.g:751:48: ( propertyExpression )?
            int alt275=2;
            int LA275_0 = input.LA(1);

            if ( (LA275_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt275=1;
            }
            switch (alt275) {
                case 1 :
                    // EsperEPL2Ast.g:751:48: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_patternFilterExpr5329);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:751:68: ( patternFilterAnno )?
            int alt276=2;
            int LA276_0 = input.LA(1);

            if ( (LA276_0==ATCHAR) ) {
                alt276=1;
            }
            switch (alt276) {
                case 1 :
                    // EsperEPL2Ast.g:751:68: patternFilterAnno
                    {
                    pushFollow(FOLLOW_patternFilterAnno_in_patternFilterExpr5332);
                    patternFilterAnno();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:751:87: ( valueExpr )*
            loop277:
            do {
                int alt277=2;
                int LA277_0 = input.LA(1);

                if ( ((LA277_0>=IN_SET && LA277_0<=REGEXP)||LA277_0==NOT_EXPR||(LA277_0>=SUM && LA277_0<=AVG)||(LA277_0>=COALESCE && LA277_0<=COUNT)||(LA277_0>=CASE && LA277_0<=CASE2)||(LA277_0>=PREVIOUS && LA277_0<=EXISTS)||(LA277_0>=INSTANCEOF && LA277_0<=CURRENT_TIMESTAMP)||LA277_0==NEWKW||(LA277_0>=EVAL_AND_EXPR && LA277_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA277_0==EVENT_PROP_EXPR||LA277_0==CONCAT||(LA277_0>=LIB_FUNC_CHAIN && LA277_0<=DOT_EXPR)||LA277_0==ARRAY_EXPR||(LA277_0>=NOT_IN_SET && LA277_0<=NOT_REGEXP)||(LA277_0>=IN_RANGE && LA277_0<=SUBSELECT_EXPR)||(LA277_0>=EXISTS_SUBSELECT_EXPR && LA277_0<=NOT_IN_SUBSELECT_EXPR)||LA277_0==SUBSTITUTION||(LA277_0>=FIRST_AGGREG && LA277_0<=WINDOW_AGGREG)||(LA277_0>=INT_TYPE && LA277_0<=NULL_TYPE)||(LA277_0>=STAR && LA277_0<=PLUS)||(LA277_0>=BAND && LA277_0<=BXOR)||(LA277_0>=LT && LA277_0<=GE)||(LA277_0>=MINUS && LA277_0<=MOD)||(LA277_0>=EVAL_IS_GROUP_EXPR && LA277_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt277=1;
                }


                switch (alt277) {
            	case 1 :
            	    // EsperEPL2Ast.g:751:88: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_patternFilterExpr5336);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop277;
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
    // EsperEPL2Ast.g:754:1: patternFilterAnno : ^( ATCHAR IDENT ( number )? ) ;
    public final void patternFilterAnno() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:755:2: ( ^( ATCHAR IDENT ( number )? ) )
            // EsperEPL2Ast.g:755:4: ^( ATCHAR IDENT ( number )? )
            {
            match(input,ATCHAR,FOLLOW_ATCHAR_in_patternFilterAnno5356); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_patternFilterAnno5358); 
            // EsperEPL2Ast.g:755:20: ( number )?
            int alt278=2;
            int LA278_0 = input.LA(1);

            if ( ((LA278_0>=INT_TYPE && LA278_0<=DOUBLE_TYPE)) ) {
                alt278=1;
            }
            switch (alt278) {
                case 1 :
                    // EsperEPL2Ast.g:755:20: number
                    {
                    pushFollow(FOLLOW_number_in_patternFilterAnno5360);
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
    // EsperEPL2Ast.g:758:1: matchUntilRange : ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) );
    public final void matchUntilRange() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:759:2: ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) )
            int alt279=4;
            switch ( input.LA(1) ) {
            case MATCH_UNTIL_RANGE_CLOSED:
                {
                alt279=1;
                }
                break;
            case MATCH_UNTIL_RANGE_BOUNDED:
                {
                alt279=2;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFCLOSED:
                {
                alt279=3;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFOPEN:
                {
                alt279=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 279, 0, input);

                throw nvae;
            }

            switch (alt279) {
                case 1 :
                    // EsperEPL2Ast.g:759:4: ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_CLOSED,FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5375); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5377);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5379);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:760:5: ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_BOUNDED,FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5387); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5389);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:761:5: ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFCLOSED,FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5397); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5399);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:762:4: ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFOPEN,FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5406); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5408);
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
    // EsperEPL2Ast.g:765:1: filterParam : ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) ;
    public final void filterParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:766:2: ( ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:766:4: ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* )
            {
            match(input,EVENT_FILTER_PARAM,FOLLOW_EVENT_FILTER_PARAM_in_filterParam5421); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_filterParam5423);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:766:35: ( valueExpr )*
            loop280:
            do {
                int alt280=2;
                int LA280_0 = input.LA(1);

                if ( ((LA280_0>=IN_SET && LA280_0<=REGEXP)||LA280_0==NOT_EXPR||(LA280_0>=SUM && LA280_0<=AVG)||(LA280_0>=COALESCE && LA280_0<=COUNT)||(LA280_0>=CASE && LA280_0<=CASE2)||(LA280_0>=PREVIOUS && LA280_0<=EXISTS)||(LA280_0>=INSTANCEOF && LA280_0<=CURRENT_TIMESTAMP)||LA280_0==NEWKW||(LA280_0>=EVAL_AND_EXPR && LA280_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA280_0==EVENT_PROP_EXPR||LA280_0==CONCAT||(LA280_0>=LIB_FUNC_CHAIN && LA280_0<=DOT_EXPR)||LA280_0==ARRAY_EXPR||(LA280_0>=NOT_IN_SET && LA280_0<=NOT_REGEXP)||(LA280_0>=IN_RANGE && LA280_0<=SUBSELECT_EXPR)||(LA280_0>=EXISTS_SUBSELECT_EXPR && LA280_0<=NOT_IN_SUBSELECT_EXPR)||LA280_0==SUBSTITUTION||(LA280_0>=FIRST_AGGREG && LA280_0<=WINDOW_AGGREG)||(LA280_0>=INT_TYPE && LA280_0<=NULL_TYPE)||(LA280_0>=STAR && LA280_0<=PLUS)||(LA280_0>=BAND && LA280_0<=BXOR)||(LA280_0>=LT && LA280_0<=GE)||(LA280_0>=MINUS && LA280_0<=MOD)||(LA280_0>=EVAL_IS_GROUP_EXPR && LA280_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt280=1;
                }


                switch (alt280) {
            	case 1 :
            	    // EsperEPL2Ast.g:766:36: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_filterParam5426);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop280;
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
    // EsperEPL2Ast.g:769:1: filterParamComparator : ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) );
    public final void filterParamComparator() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:770:2: ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) )
            int alt293=12;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt293=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt293=2;
                }
                break;
            case LT:
                {
                alt293=3;
                }
                break;
            case LE:
                {
                alt293=4;
                }
                break;
            case GT:
                {
                alt293=5;
                }
                break;
            case GE:
                {
                alt293=6;
                }
                break;
            case EVENT_FILTER_RANGE:
                {
                alt293=7;
                }
                break;
            case EVENT_FILTER_NOT_RANGE:
                {
                alt293=8;
                }
                break;
            case EVENT_FILTER_IN:
                {
                alt293=9;
                }
                break;
            case EVENT_FILTER_NOT_IN:
                {
                alt293=10;
                }
                break;
            case EVENT_FILTER_BETWEEN:
                {
                alt293=11;
                }
                break;
            case EVENT_FILTER_NOT_BETWEEN:
                {
                alt293=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 293, 0, input);

                throw nvae;
            }

            switch (alt293) {
                case 1 :
                    // EsperEPL2Ast.g:770:4: ^( EQUALS filterAtom )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_filterParamComparator5442); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5444);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:771:4: ^( NOT_EQUAL filterAtom )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_filterParamComparator5451); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5453);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:772:4: ^( LT filterAtom )
                    {
                    match(input,LT,FOLLOW_LT_in_filterParamComparator5460); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5462);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:773:4: ^( LE filterAtom )
                    {
                    match(input,LE,FOLLOW_LE_in_filterParamComparator5469); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5471);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:774:4: ^( GT filterAtom )
                    {
                    match(input,GT,FOLLOW_GT_in_filterParamComparator5478); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5480);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:775:4: ^( GE filterAtom )
                    {
                    match(input,GE,FOLLOW_GE_in_filterParamComparator5487); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5489);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:776:4: ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_RANGE,FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5496); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:776:41: ( constant[false] | filterIdentifier )
                    int alt281=2;
                    int LA281_0 = input.LA(1);

                    if ( ((LA281_0>=INT_TYPE && LA281_0<=NULL_TYPE)) ) {
                        alt281=1;
                    }
                    else if ( (LA281_0==EVENT_FILTER_IDENT) ) {
                        alt281=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 281, 0, input);

                        throw nvae;
                    }
                    switch (alt281) {
                        case 1 :
                            // EsperEPL2Ast.g:776:42: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5505);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:776:58: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5508);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:776:76: ( constant[false] | filterIdentifier )
                    int alt282=2;
                    int LA282_0 = input.LA(1);

                    if ( ((LA282_0>=INT_TYPE && LA282_0<=NULL_TYPE)) ) {
                        alt282=1;
                    }
                    else if ( (LA282_0==EVENT_FILTER_IDENT) ) {
                        alt282=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 282, 0, input);

                        throw nvae;
                    }
                    switch (alt282) {
                        case 1 :
                            // EsperEPL2Ast.g:776:77: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5512);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:776:93: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5515);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
                    // EsperEPL2Ast.g:777:4: ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_RANGE,FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5529); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:777:45: ( constant[false] | filterIdentifier )
                    int alt283=2;
                    int LA283_0 = input.LA(1);

                    if ( ((LA283_0>=INT_TYPE && LA283_0<=NULL_TYPE)) ) {
                        alt283=1;
                    }
                    else if ( (LA283_0==EVENT_FILTER_IDENT) ) {
                        alt283=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 283, 0, input);

                        throw nvae;
                    }
                    switch (alt283) {
                        case 1 :
                            // EsperEPL2Ast.g:777:46: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5538);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:777:62: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5541);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:777:80: ( constant[false] | filterIdentifier )
                    int alt284=2;
                    int LA284_0 = input.LA(1);

                    if ( ((LA284_0>=INT_TYPE && LA284_0<=NULL_TYPE)) ) {
                        alt284=1;
                    }
                    else if ( (LA284_0==EVENT_FILTER_IDENT) ) {
                        alt284=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 284, 0, input);

                        throw nvae;
                    }
                    switch (alt284) {
                        case 1 :
                            // EsperEPL2Ast.g:777:81: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5545);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:777:97: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5548);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
                    // EsperEPL2Ast.g:778:4: ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_IN,FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5562); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:778:38: ( constant[false] | filterIdentifier )
                    int alt285=2;
                    int LA285_0 = input.LA(1);

                    if ( ((LA285_0>=INT_TYPE && LA285_0<=NULL_TYPE)) ) {
                        alt285=1;
                    }
                    else if ( (LA285_0==EVENT_FILTER_IDENT) ) {
                        alt285=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 285, 0, input);

                        throw nvae;
                    }
                    switch (alt285) {
                        case 1 :
                            // EsperEPL2Ast.g:778:39: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5571);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:778:55: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5574);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:778:73: ( constant[false] | filterIdentifier )*
                    loop286:
                    do {
                        int alt286=3;
                        int LA286_0 = input.LA(1);

                        if ( ((LA286_0>=INT_TYPE && LA286_0<=NULL_TYPE)) ) {
                            alt286=1;
                        }
                        else if ( (LA286_0==EVENT_FILTER_IDENT) ) {
                            alt286=2;
                        }


                        switch (alt286) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:778:74: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5578);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:778:90: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5581);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop286;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
                    // EsperEPL2Ast.g:779:4: ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_IN,FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5596); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:779:42: ( constant[false] | filterIdentifier )
                    int alt287=2;
                    int LA287_0 = input.LA(1);

                    if ( ((LA287_0>=INT_TYPE && LA287_0<=NULL_TYPE)) ) {
                        alt287=1;
                    }
                    else if ( (LA287_0==EVENT_FILTER_IDENT) ) {
                        alt287=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 287, 0, input);

                        throw nvae;
                    }
                    switch (alt287) {
                        case 1 :
                            // EsperEPL2Ast.g:779:43: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5605);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:779:59: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5608);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:779:77: ( constant[false] | filterIdentifier )*
                    loop288:
                    do {
                        int alt288=3;
                        int LA288_0 = input.LA(1);

                        if ( ((LA288_0>=INT_TYPE && LA288_0<=NULL_TYPE)) ) {
                            alt288=1;
                        }
                        else if ( (LA288_0==EVENT_FILTER_IDENT) ) {
                            alt288=2;
                        }


                        switch (alt288) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:779:78: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5612);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:779:94: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5615);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop288;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
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
                    // EsperEPL2Ast.g:780:4: ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_BETWEEN,FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator5630); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:780:27: ( constant[false] | filterIdentifier )
                    int alt289=2;
                    int LA289_0 = input.LA(1);

                    if ( ((LA289_0>=INT_TYPE && LA289_0<=NULL_TYPE)) ) {
                        alt289=1;
                    }
                    else if ( (LA289_0==EVENT_FILTER_IDENT) ) {
                        alt289=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 289, 0, input);

                        throw nvae;
                    }
                    switch (alt289) {
                        case 1 :
                            // EsperEPL2Ast.g:780:28: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5633);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:780:44: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5636);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:780:62: ( constant[false] | filterIdentifier )
                    int alt290=2;
                    int LA290_0 = input.LA(1);

                    if ( ((LA290_0>=INT_TYPE && LA290_0<=NULL_TYPE)) ) {
                        alt290=1;
                    }
                    else if ( (LA290_0==EVENT_FILTER_IDENT) ) {
                        alt290=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 290, 0, input);

                        throw nvae;
                    }
                    switch (alt290) {
                        case 1 :
                            // EsperEPL2Ast.g:780:63: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5640);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:780:79: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5643);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:781:4: ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_NOT_BETWEEN,FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator5651); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:781:31: ( constant[false] | filterIdentifier )
                    int alt291=2;
                    int LA291_0 = input.LA(1);

                    if ( ((LA291_0>=INT_TYPE && LA291_0<=NULL_TYPE)) ) {
                        alt291=1;
                    }
                    else if ( (LA291_0==EVENT_FILTER_IDENT) ) {
                        alt291=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 291, 0, input);

                        throw nvae;
                    }
                    switch (alt291) {
                        case 1 :
                            // EsperEPL2Ast.g:781:32: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5654);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:781:48: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5657);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:781:66: ( constant[false] | filterIdentifier )
                    int alt292=2;
                    int LA292_0 = input.LA(1);

                    if ( ((LA292_0>=INT_TYPE && LA292_0<=NULL_TYPE)) ) {
                        alt292=1;
                    }
                    else if ( (LA292_0==EVENT_FILTER_IDENT) ) {
                        alt292=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 292, 0, input);

                        throw nvae;
                    }
                    switch (alt292) {
                        case 1 :
                            // EsperEPL2Ast.g:781:67: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5661);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:781:83: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5664);
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
    // EsperEPL2Ast.g:784:1: filterAtom : ( constant[false] | filterIdentifier );
    public final void filterAtom() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:785:2: ( constant[false] | filterIdentifier )
            int alt294=2;
            int LA294_0 = input.LA(1);

            if ( ((LA294_0>=INT_TYPE && LA294_0<=NULL_TYPE)) ) {
                alt294=1;
            }
            else if ( (LA294_0==EVENT_FILTER_IDENT) ) {
                alt294=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 294, 0, input);

                throw nvae;
            }
            switch (alt294) {
                case 1 :
                    // EsperEPL2Ast.g:785:4: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_filterAtom5678);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:786:4: filterIdentifier
                    {
                    pushFollow(FOLLOW_filterIdentifier_in_filterAtom5684);
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
    // EsperEPL2Ast.g:788:1: filterIdentifier : ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) ;
    public final void filterIdentifier() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:789:2: ( ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) )
            // EsperEPL2Ast.g:789:4: ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] )
            {
            match(input,EVENT_FILTER_IDENT,FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier5695); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_filterIdentifier5697); 
            pushFollow(FOLLOW_eventPropertyExpr_in_filterIdentifier5699);
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
    // EsperEPL2Ast.g:792:1: eventPropertyExpr[boolean isLeaveNode] : ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) ;
    public final void eventPropertyExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:793:2: ( ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) )
            // EsperEPL2Ast.g:793:4: ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* )
            {
            p=(CommonTree)match(input,EVENT_PROP_EXPR,FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr5718); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5720);
            eventPropertyAtomic();

            state._fsp--;

            // EsperEPL2Ast.g:793:44: ( eventPropertyAtomic )*
            loop295:
            do {
                int alt295=2;
                int LA295_0 = input.LA(1);

                if ( ((LA295_0>=EVENT_PROP_SIMPLE && LA295_0<=EVENT_PROP_DYNAMIC_MAPPED)) ) {
                    alt295=1;
                }


                switch (alt295) {
            	case 1 :
            	    // EsperEPL2Ast.g:793:45: eventPropertyAtomic
            	    {
            	    pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5723);
            	    eventPropertyAtomic();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop295;
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
    // EsperEPL2Ast.g:796:1: eventPropertyAtomic : ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) );
    public final void eventPropertyAtomic() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:797:2: ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) )
            int alt296=6;
            switch ( input.LA(1) ) {
            case EVENT_PROP_SIMPLE:
                {
                alt296=1;
                }
                break;
            case EVENT_PROP_INDEXED:
                {
                alt296=2;
                }
                break;
            case EVENT_PROP_MAPPED:
                {
                alt296=3;
                }
                break;
            case EVENT_PROP_DYNAMIC_SIMPLE:
                {
                alt296=4;
                }
                break;
            case EVENT_PROP_DYNAMIC_INDEXED:
                {
                alt296=5;
                }
                break;
            case EVENT_PROP_DYNAMIC_MAPPED:
                {
                alt296=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 296, 0, input);

                throw nvae;
            }

            switch (alt296) {
                case 1 :
                    // EsperEPL2Ast.g:797:4: ^( EVENT_PROP_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_SIMPLE,FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic5742); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5744); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:798:4: ^( EVENT_PROP_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_INDEXED,FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic5751); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5753); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic5755); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:799:4: ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_MAPPED,FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic5762); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5764); 
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
                    // EsperEPL2Ast.g:800:4: ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_SIMPLE,FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic5779); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5781); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:801:4: ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_INDEXED,FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic5788); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5790); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic5792); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:802:4: ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_DYNAMIC_MAPPED,FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic5799); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5801); 
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
    // EsperEPL2Ast.g:805:1: timePeriod : ^(t= TIME_PERIOD timePeriodDef ) ;
    public final void timePeriod() throws RecognitionException {
        CommonTree t=null;

        try {
            // EsperEPL2Ast.g:806:2: ( ^(t= TIME_PERIOD timePeriodDef ) )
            // EsperEPL2Ast.g:806:5: ^(t= TIME_PERIOD timePeriodDef )
            {
            t=(CommonTree)match(input,TIME_PERIOD,FOLLOW_TIME_PERIOD_in_timePeriod5828); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_timePeriodDef_in_timePeriod5830);
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
    // EsperEPL2Ast.g:809:1: timePeriodDef : ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart );
    public final void timePeriodDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:810:2: ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart )
            int alt325=8;
            switch ( input.LA(1) ) {
            case YEAR_PART:
                {
                alt325=1;
                }
                break;
            case MONTH_PART:
                {
                alt325=2;
                }
                break;
            case WEEK_PART:
                {
                alt325=3;
                }
                break;
            case DAY_PART:
                {
                alt325=4;
                }
                break;
            case HOUR_PART:
                {
                alt325=5;
                }
                break;
            case MINUTE_PART:
                {
                alt325=6;
                }
                break;
            case SECOND_PART:
                {
                alt325=7;
                }
                break;
            case MILLISECOND_PART:
                {
                alt325=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 325, 0, input);

                throw nvae;
            }

            switch (alt325) {
                case 1 :
                    // EsperEPL2Ast.g:810:5: yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_yearPart_in_timePeriodDef5846);
                    yearPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:810:14: ( monthPart )?
                    int alt297=2;
                    int LA297_0 = input.LA(1);

                    if ( (LA297_0==MONTH_PART) ) {
                        alt297=1;
                    }
                    switch (alt297) {
                        case 1 :
                            // EsperEPL2Ast.g:810:15: monthPart
                            {
                            pushFollow(FOLLOW_monthPart_in_timePeriodDef5849);
                            monthPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:27: ( weekPart )?
                    int alt298=2;
                    int LA298_0 = input.LA(1);

                    if ( (LA298_0==WEEK_PART) ) {
                        alt298=1;
                    }
                    switch (alt298) {
                        case 1 :
                            // EsperEPL2Ast.g:810:28: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef5854);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:39: ( dayPart )?
                    int alt299=2;
                    int LA299_0 = input.LA(1);

                    if ( (LA299_0==DAY_PART) ) {
                        alt299=1;
                    }
                    switch (alt299) {
                        case 1 :
                            // EsperEPL2Ast.g:810:40: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5859);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:50: ( hourPart )?
                    int alt300=2;
                    int LA300_0 = input.LA(1);

                    if ( (LA300_0==HOUR_PART) ) {
                        alt300=1;
                    }
                    switch (alt300) {
                        case 1 :
                            // EsperEPL2Ast.g:810:51: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5864);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:62: ( minutePart )?
                    int alt301=2;
                    int LA301_0 = input.LA(1);

                    if ( (LA301_0==MINUTE_PART) ) {
                        alt301=1;
                    }
                    switch (alt301) {
                        case 1 :
                            // EsperEPL2Ast.g:810:63: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5869);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:76: ( secondPart )?
                    int alt302=2;
                    int LA302_0 = input.LA(1);

                    if ( (LA302_0==SECOND_PART) ) {
                        alt302=1;
                    }
                    switch (alt302) {
                        case 1 :
                            // EsperEPL2Ast.g:810:77: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5874);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:90: ( millisecondPart )?
                    int alt303=2;
                    int LA303_0 = input.LA(1);

                    if ( (LA303_0==MILLISECOND_PART) ) {
                        alt303=1;
                    }
                    switch (alt303) {
                        case 1 :
                            // EsperEPL2Ast.g:810:91: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5879);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:811:5: monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_monthPart_in_timePeriodDef5887);
                    monthPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:811:15: ( weekPart )?
                    int alt304=2;
                    int LA304_0 = input.LA(1);

                    if ( (LA304_0==WEEK_PART) ) {
                        alt304=1;
                    }
                    switch (alt304) {
                        case 1 :
                            // EsperEPL2Ast.g:811:16: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef5890);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:27: ( dayPart )?
                    int alt305=2;
                    int LA305_0 = input.LA(1);

                    if ( (LA305_0==DAY_PART) ) {
                        alt305=1;
                    }
                    switch (alt305) {
                        case 1 :
                            // EsperEPL2Ast.g:811:28: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5895);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:38: ( hourPart )?
                    int alt306=2;
                    int LA306_0 = input.LA(1);

                    if ( (LA306_0==HOUR_PART) ) {
                        alt306=1;
                    }
                    switch (alt306) {
                        case 1 :
                            // EsperEPL2Ast.g:811:39: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5900);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:50: ( minutePart )?
                    int alt307=2;
                    int LA307_0 = input.LA(1);

                    if ( (LA307_0==MINUTE_PART) ) {
                        alt307=1;
                    }
                    switch (alt307) {
                        case 1 :
                            // EsperEPL2Ast.g:811:51: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5905);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:64: ( secondPart )?
                    int alt308=2;
                    int LA308_0 = input.LA(1);

                    if ( (LA308_0==SECOND_PART) ) {
                        alt308=1;
                    }
                    switch (alt308) {
                        case 1 :
                            // EsperEPL2Ast.g:811:65: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5910);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:78: ( millisecondPart )?
                    int alt309=2;
                    int LA309_0 = input.LA(1);

                    if ( (LA309_0==MILLISECOND_PART) ) {
                        alt309=1;
                    }
                    switch (alt309) {
                        case 1 :
                            // EsperEPL2Ast.g:811:79: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5915);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:812:5: weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_weekPart_in_timePeriodDef5923);
                    weekPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:812:14: ( dayPart )?
                    int alt310=2;
                    int LA310_0 = input.LA(1);

                    if ( (LA310_0==DAY_PART) ) {
                        alt310=1;
                    }
                    switch (alt310) {
                        case 1 :
                            // EsperEPL2Ast.g:812:15: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5926);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:25: ( hourPart )?
                    int alt311=2;
                    int LA311_0 = input.LA(1);

                    if ( (LA311_0==HOUR_PART) ) {
                        alt311=1;
                    }
                    switch (alt311) {
                        case 1 :
                            // EsperEPL2Ast.g:812:26: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5931);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:37: ( minutePart )?
                    int alt312=2;
                    int LA312_0 = input.LA(1);

                    if ( (LA312_0==MINUTE_PART) ) {
                        alt312=1;
                    }
                    switch (alt312) {
                        case 1 :
                            // EsperEPL2Ast.g:812:38: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5936);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:51: ( secondPart )?
                    int alt313=2;
                    int LA313_0 = input.LA(1);

                    if ( (LA313_0==SECOND_PART) ) {
                        alt313=1;
                    }
                    switch (alt313) {
                        case 1 :
                            // EsperEPL2Ast.g:812:52: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5941);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:65: ( millisecondPart )?
                    int alt314=2;
                    int LA314_0 = input.LA(1);

                    if ( (LA314_0==MILLISECOND_PART) ) {
                        alt314=1;
                    }
                    switch (alt314) {
                        case 1 :
                            // EsperEPL2Ast.g:812:66: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5946);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:813:5: dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_dayPart_in_timePeriodDef5954);
                    dayPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:813:13: ( hourPart )?
                    int alt315=2;
                    int LA315_0 = input.LA(1);

                    if ( (LA315_0==HOUR_PART) ) {
                        alt315=1;
                    }
                    switch (alt315) {
                        case 1 :
                            // EsperEPL2Ast.g:813:14: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5957);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:813:25: ( minutePart )?
                    int alt316=2;
                    int LA316_0 = input.LA(1);

                    if ( (LA316_0==MINUTE_PART) ) {
                        alt316=1;
                    }
                    switch (alt316) {
                        case 1 :
                            // EsperEPL2Ast.g:813:26: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5962);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:813:39: ( secondPart )?
                    int alt317=2;
                    int LA317_0 = input.LA(1);

                    if ( (LA317_0==SECOND_PART) ) {
                        alt317=1;
                    }
                    switch (alt317) {
                        case 1 :
                            // EsperEPL2Ast.g:813:40: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5967);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:813:53: ( millisecondPart )?
                    int alt318=2;
                    int LA318_0 = input.LA(1);

                    if ( (LA318_0==MILLISECOND_PART) ) {
                        alt318=1;
                    }
                    switch (alt318) {
                        case 1 :
                            // EsperEPL2Ast.g:813:54: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5972);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:814:4: hourPart ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_hourPart_in_timePeriodDef5979);
                    hourPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:814:13: ( minutePart )?
                    int alt319=2;
                    int LA319_0 = input.LA(1);

                    if ( (LA319_0==MINUTE_PART) ) {
                        alt319=1;
                    }
                    switch (alt319) {
                        case 1 :
                            // EsperEPL2Ast.g:814:14: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5982);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:814:27: ( secondPart )?
                    int alt320=2;
                    int LA320_0 = input.LA(1);

                    if ( (LA320_0==SECOND_PART) ) {
                        alt320=1;
                    }
                    switch (alt320) {
                        case 1 :
                            // EsperEPL2Ast.g:814:28: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5987);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:814:41: ( millisecondPart )?
                    int alt321=2;
                    int LA321_0 = input.LA(1);

                    if ( (LA321_0==MILLISECOND_PART) ) {
                        alt321=1;
                    }
                    switch (alt321) {
                        case 1 :
                            // EsperEPL2Ast.g:814:42: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5992);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:815:4: minutePart ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_minutePart_in_timePeriodDef5999);
                    minutePart();

                    state._fsp--;

                    // EsperEPL2Ast.g:815:15: ( secondPart )?
                    int alt322=2;
                    int LA322_0 = input.LA(1);

                    if ( (LA322_0==SECOND_PART) ) {
                        alt322=1;
                    }
                    switch (alt322) {
                        case 1 :
                            // EsperEPL2Ast.g:815:16: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6002);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:815:29: ( millisecondPart )?
                    int alt323=2;
                    int LA323_0 = input.LA(1);

                    if ( (LA323_0==MILLISECOND_PART) ) {
                        alt323=1;
                    }
                    switch (alt323) {
                        case 1 :
                            // EsperEPL2Ast.g:815:30: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6007);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:816:4: secondPart ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_secondPart_in_timePeriodDef6014);
                    secondPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:816:15: ( millisecondPart )?
                    int alt324=2;
                    int LA324_0 = input.LA(1);

                    if ( (LA324_0==MILLISECOND_PART) ) {
                        alt324=1;
                    }
                    switch (alt324) {
                        case 1 :
                            // EsperEPL2Ast.g:816:16: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6017);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:817:4: millisecondPart
                    {
                    pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6024);
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
    // EsperEPL2Ast.g:820:1: yearPart : ^( YEAR_PART valueExpr ) ;
    public final void yearPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:821:2: ( ^( YEAR_PART valueExpr ) )
            // EsperEPL2Ast.g:821:4: ^( YEAR_PART valueExpr )
            {
            match(input,YEAR_PART,FOLLOW_YEAR_PART_in_yearPart6038); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_yearPart6040);
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
    // EsperEPL2Ast.g:824:1: monthPart : ^( MONTH_PART valueExpr ) ;
    public final void monthPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:825:2: ( ^( MONTH_PART valueExpr ) )
            // EsperEPL2Ast.g:825:4: ^( MONTH_PART valueExpr )
            {
            match(input,MONTH_PART,FOLLOW_MONTH_PART_in_monthPart6055); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_monthPart6057);
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
    // EsperEPL2Ast.g:828:1: weekPart : ^( WEEK_PART valueExpr ) ;
    public final void weekPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:829:2: ( ^( WEEK_PART valueExpr ) )
            // EsperEPL2Ast.g:829:4: ^( WEEK_PART valueExpr )
            {
            match(input,WEEK_PART,FOLLOW_WEEK_PART_in_weekPart6072); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_weekPart6074);
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
    // EsperEPL2Ast.g:832:1: dayPart : ^( DAY_PART valueExpr ) ;
    public final void dayPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:833:2: ( ^( DAY_PART valueExpr ) )
            // EsperEPL2Ast.g:833:4: ^( DAY_PART valueExpr )
            {
            match(input,DAY_PART,FOLLOW_DAY_PART_in_dayPart6089); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dayPart6091);
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
    // EsperEPL2Ast.g:836:1: hourPart : ^( HOUR_PART valueExpr ) ;
    public final void hourPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:837:2: ( ^( HOUR_PART valueExpr ) )
            // EsperEPL2Ast.g:837:4: ^( HOUR_PART valueExpr )
            {
            match(input,HOUR_PART,FOLLOW_HOUR_PART_in_hourPart6106); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_hourPart6108);
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
    // EsperEPL2Ast.g:840:1: minutePart : ^( MINUTE_PART valueExpr ) ;
    public final void minutePart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:841:2: ( ^( MINUTE_PART valueExpr ) )
            // EsperEPL2Ast.g:841:4: ^( MINUTE_PART valueExpr )
            {
            match(input,MINUTE_PART,FOLLOW_MINUTE_PART_in_minutePart6123); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_minutePart6125);
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
    // EsperEPL2Ast.g:844:1: secondPart : ^( SECOND_PART valueExpr ) ;
    public final void secondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:845:2: ( ^( SECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:845:4: ^( SECOND_PART valueExpr )
            {
            match(input,SECOND_PART,FOLLOW_SECOND_PART_in_secondPart6140); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_secondPart6142);
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
    // EsperEPL2Ast.g:848:1: millisecondPart : ^( MILLISECOND_PART valueExpr ) ;
    public final void millisecondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:849:2: ( ^( MILLISECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:849:4: ^( MILLISECOND_PART valueExpr )
            {
            match(input,MILLISECOND_PART,FOLLOW_MILLISECOND_PART_in_millisecondPart6157); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_millisecondPart6159);
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
    // EsperEPL2Ast.g:852:1: substitution : s= SUBSTITUTION ;
    public final void substitution() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:853:2: (s= SUBSTITUTION )
            // EsperEPL2Ast.g:853:4: s= SUBSTITUTION
            {
            s=(CommonTree)match(input,SUBSTITUTION,FOLLOW_SUBSTITUTION_in_substitution6174); 
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
    // EsperEPL2Ast.g:856:1: constant[boolean isLeaveNode] : (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE );
    public final void constant(boolean isLeaveNode) throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:857:2: (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE )
            int alt326=7;
            switch ( input.LA(1) ) {
            case INT_TYPE:
                {
                alt326=1;
                }
                break;
            case LONG_TYPE:
                {
                alt326=2;
                }
                break;
            case FLOAT_TYPE:
                {
                alt326=3;
                }
                break;
            case DOUBLE_TYPE:
                {
                alt326=4;
                }
                break;
            case STRING_TYPE:
                {
                alt326=5;
                }
                break;
            case BOOL_TYPE:
                {
                alt326=6;
                }
                break;
            case NULL_TYPE:
                {
                alt326=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 326, 0, input);

                throw nvae;
            }

            switch (alt326) {
                case 1 :
                    // EsperEPL2Ast.g:857:4: c= INT_TYPE
                    {
                    c=(CommonTree)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_constant6190); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:858:4: c= LONG_TYPE
                    {
                    c=(CommonTree)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_constant6199); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:859:4: c= FLOAT_TYPE
                    {
                    c=(CommonTree)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_constant6208); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:860:4: c= DOUBLE_TYPE
                    {
                    c=(CommonTree)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_constant6217); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:861:11: c= STRING_TYPE
                    {
                    c=(CommonTree)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_constant6233); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:862:11: c= BOOL_TYPE
                    {
                    c=(CommonTree)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_constant6249); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:863:8: c= NULL_TYPE
                    {
                    c=(CommonTree)match(input,NULL_TYPE,FOLLOW_NULL_TYPE_in_constant6262); 
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
    // EsperEPL2Ast.g:866:1: number : ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE );
    public final void number() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:867:2: ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE )
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
    public static final BitSet FOLLOW_CLASS_IDENT_in_annotation94 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000003F8000001CL});
    public static final BitSet FOLLOW_elementValuePair_in_annotation96 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000003F8000001CL});
    public static final BitSet FOLLOW_elementValue_in_annotation99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_VALUE_in_elementValuePair117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_elementValuePair119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000003F8000000CL});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_in_elementValue148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_ARRAY_in_elementValue156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elementValue_in_elementValue158 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000003F8000000CL});
    public static final BitSet FOLLOW_constant_in_elementValue169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_elementValue179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDecl204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl206 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_expressionDef_in_expressionDecl208 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000020L,0x0108000000000000L});
    public static final BitSet FOLLOW_exprCol_in_expressionDecl210 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0108000000000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_expressionDecl213 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0108000000000000L});
    public static final BitSet FOLLOW_COLON_in_expressionDecl218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LBRACK_in_expressionDecl225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionDef242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_expressionDef244 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_expressionDef246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDef254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_expressionDef256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionLambdaDecl270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionLambdaDecl273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_exprCol_in_expressionLambdaDecl277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EPL_EXPR_in_startEPLExpressionRule294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_startEPLExpressionRule297 = new BitSet(new long[]{0x0000000000000000L,0x4800000000000000L,0x0000040000000000L,0x0100580000000010L,0x0000000000400A04L});
    public static final BitSet FOLLOW_expressionDecl_in_startEPLExpressionRule302 = new BitSet(new long[]{0x0000000000000000L,0x4800000000000000L,0x0000040000000000L,0x0100580000000010L,0x0000000000400A04L});
    public static final BitSet FOLLOW_eplExpressionRule_in_startEPLExpressionRule306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_contextExpr_in_eplExpressionRule323 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000040000000000L,0x0100580000000010L,0x0000000000000A00L});
    public static final BitSet FOLLOW_selectExpr_in_eplExpressionRule327 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createWindowExpr_in_eplExpressionRule331 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createIndexExpr_in_eplExpressionRule335 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createVariableExpr_in_eplExpressionRule339 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createSchemaExpr_in_eplExpressionRule343 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_onExpr_in_eplExpressionRule347 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_updateExpr_in_eplExpressionRule351 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_forExpr_in_eplExpressionRule354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createContextExpr_in_eplExpressionRule361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTEXT_in_contextExpr376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_contextExpr378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_in_onExpr397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onStreamExpr_in_onExpr399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x008F000000000000L});
    public static final BitSet FOLLOW_onDeleteExpr_in_onExpr404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onUpdateExpr_in_onExpr408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSelectExpr_in_onExpr412 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_onSelectInsertExpr_in_onExpr415 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_onSelectInsertOutput_in_onExpr418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSetExpr_in_onExpr425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onMergeExpr_in_onExpr429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_STREAM_in_onStreamExpr451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_onStreamExpr454 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_onStreamExpr459 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_onStreamExpr462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_MERGE_EXPR_in_onMergeExpr480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000018000L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000018000L});
    public static final BitSet FOLLOW_mergeItem_in_onMergeExpr487 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0020000000018000L});
    public static final BitSet FOLLOW_whereClause_in_onMergeExpr490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeMatched_in_mergeItem506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mergeUnmatched_in_mergeItem510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_MAT_in_mergeMatched525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeMatchedItem_in_mergeMatched527 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800E00E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_mergeMatched530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_UPD_in_mergeMatchedItem548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_mergeMatchedItem550 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_DEL_in_mergeMatchedItem566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_INT_TYPE_in_mergeMatchedItem572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeMatchedItem580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_UNM_in_mergeUnmatched594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeUnmatched596 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800E00E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_mergeUnmatched599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_INS_in_mergeInsert618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectionList_in_mergeInsert620 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000041000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_mergeInsert622 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_mergeInsert625 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_mergeInsert628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_EXPR_in_updateExpr648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_updateExpr650 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0020000000000400L});
    public static final BitSet FOLLOW_IDENT_in_updateExpr652 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_onSetAssignment_in_updateExpr655 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_updateExpr658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onDeleteExpr677 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_onDeleteExpr680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_EXPR_in_onSelectExpr700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectExpr702 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DISTINCT_in_onSelectExpr705 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectExpr708 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x00180000C0000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_onExprFrom_in_onSelectExpr710 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x00180000C0000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectExpr713 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0018000080000000L});
    public static final BitSet FOLLOW_groupByClause_in_onSelectExpr717 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0010000080000000L});
    public static final BitSet FOLLOW_havingClause_in_onSelectExpr720 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_onSelectExpr723 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_onSelectExpr726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectInsertExpr748 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectInsertExpr750 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectInsertExpr752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_onSelectInsertOutput771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_in_onSetExpr789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr791 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr794 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_onSetExpr798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onUpdateExpr815 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_onSetAssignment_in_onUpdateExpr817 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_onUpdateExpr820 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_onSetAssignment837 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_onSetAssignment840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_FROM_in_onExprFrom854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom856 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createWindowExpr879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_createWindowExpr882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_RETAINUNION_in_createWindowExpr886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_createWindowExpr889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L});
    public static final BitSet FOLLOW_createSelectionList_in_createWindowExpr903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createWindowExpr906 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createColTypeList_in_createWindowExpr935 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createWindowExprInsert_in_createWindowExpr946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr966 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_indexColList_in_createIndexExpr972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexColList987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexCol_in_indexColList989 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexCol1004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_indexCol1006 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_indexCol1008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_createWindowExprInsert1022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createWindowExprInsert1024 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList1041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1043 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1046 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1065 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1067 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1070 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1089 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_createColTypeListElement1091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createSelectionListElement1136 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_createSelectionListElement1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createVariableExpr1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1205 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8020003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1207 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_createVariableExpr1210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextExpr1229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextExpr1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000002F800000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextExpr1233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1251 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000200010000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_INIT_in_createContextDetail1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1262 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000200010000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_PART_in_createContextDetail1271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextPartitionItem_in_createContextDetail1273 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_CREATE_CTX_CAT_in_createContextDetail1281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCategoryItem_in_createContextDetail1283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextDetail1286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_COAL_in_createContextDetail1294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCoalesceItem_in_createContextDetail1296 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_number_in_createContextDetail1301 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_NESTED_in_createContextDetail1311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1315 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_createContextFilter_in_createContextRangePoint1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_createContextRangePoint1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_createContextRangePoint1346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_createContextRangePoint1348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextNested1364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextNested1366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000002F800000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextNested1368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_createContextFilter1381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextFilter1383 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextFilter1386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_createContextPartitionItem1402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextPartitionItem1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createContextPartitionItem1407 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_COALESCE_in_createContextCoalesceItem1424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextCoalesceItem1428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createContextCategoryItem1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextCategoryItem1448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1467 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_variantList_in_createSchemaExpr1470 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_createColTypeList_in_createSchemaExpr1472 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_VAR_in_createSchemaExpr1478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createSchemaQual_in_createSchemaExpr1485 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaQual1505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_createSchemaQual1507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIANT_LIST_in_variantList1523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_variantList1525 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_insertIntoExpr_in_selectExpr1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_selectClause_in_selectExpr1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fromClause_in_selectExpr1554 = new BitSet(new long[]{0x0000000000000002L,0x0001200000000000L,0xE0180000C0000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_matchRecogClause_in_selectExpr1559 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE0180000C0000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_whereClause_in_selectExpr1566 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE018000080000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_groupByClause_in_selectExpr1574 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE010000080000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_havingClause_in_selectExpr1581 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE010000000000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_outputLimitExpr_in_selectExpr1588 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_selectExpr1595 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_selectExpr1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_insertIntoExpr1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_insertIntoExpr1630 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_insertIntoExpr1633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRCOL_in_exprCol1652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_exprCol1654 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_exprCol1657 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_SELECTION_EXPR_in_selectClause1675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_selectClause1677 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause1690 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_selectClause1693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause1707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause1710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0007A00000000000L});
    public static final BitSet FOLLOW_outerJoin_in_fromClause1713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0007A00000000000L});
    public static final BitSet FOLLOW_FOR_in_forExpr1733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_forExpr1735 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_forExpr1737 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause1756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPartitionBy_in_matchRecogClause1758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_matchRecogMeasures_in_matchRecogClause1765 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000210000000000L});
    public static final BitSet FOLLOW_ALL_in_matchRecogClause1771 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000210000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause1777 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000210000000000L});
    public static final BitSet FOLLOW_matchRecogPattern_in_matchRecogClause1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesInterval_in_matchRecogClause1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_matchRecogDefine_in_matchRecogClause1795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy1813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogPartitionBy1815 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip1832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1838 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_set_in_matchRecogMatchesAfterSkip1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1846 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval1861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesInterval1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_timePeriod_in_matchRecogMatchesInterval1865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures1881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures1883 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogMeasureListElement1902 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMeasureListElement1904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern1924 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern1926 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration1949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1953 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat1971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat1973 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000120000000000L});
    public static final BitSet FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2008 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2010 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternNested2012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogPatternAtom2043 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternAtom2047 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_QUESTION_in_matchRecogPatternAtom2059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2081 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogDefineItem_in_matchRecogDefine2083 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogDefineItem2102 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogDefineItem2104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2121 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2124 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_selectionListElement2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_selectionListElement2152 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECTION_STREAM_in_selectionListElement2169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2171 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2198 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2215 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2232 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNERJOIN_EXPR_in_outerJoin2247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2249 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_streamExpression2294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_streamExpression2297 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_streamExpression2302 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_databaseJoinExpression_in_streamExpression2306 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_methodJoinExpression_in_streamExpression2310 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_streamExpression2314 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_streamExpression2319 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_UNIDIRECTIONAL_in_streamExpression2324 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_streamExpression2328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventFilterExpr2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_eventFilterExpr2358 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000800L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_propertyExpression_in_eventFilterExpr2360 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_eventFilterExpr2364 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertyExpressionAtom_in_propertyExpression2386 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SELECT_in_propertyExpressionAtom2409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2411 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ATCHAR_in_propertyExpressionAtom2421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertySelectionListElement2468 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2487 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternInclusionExpression2513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_databaseJoinExpression2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2534 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_methodJoinExpression2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_methodJoinExpression2567 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_methodJoinExpression2570 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2584 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_VIEW_EXPR_in_viewExpr2604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2608 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_viewExpr2611 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_whereClause2633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_whereClause2635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_EXPR_in_groupByClause2653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause2655 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause2658 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_ORDER_BY_EXPR_in_orderByClause2676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause2678 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause2681 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement2701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_orderByElement2703 = new BitSet(new long[]{0x0600000000000008L});
    public static final BitSet FOLLOW_set_in_orderByElement2705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_EXPR_in_havingClause2728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_havingClause2730 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr2748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000780000000L});
    public static final BitSet FOLLOW_number_in_outputLimitExpr2762 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_outputLimitExpr2764 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2767 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr2787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitExpr2800 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2802 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr2821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_outputLimitExpr2834 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2836 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2839 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr2855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2857 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitExpr2868 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0080000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr2870 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2873 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr2892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2905 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0080000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr2907 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2910 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr2926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2928 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitAndTerm2947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitAndTerm2949 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitAndTerm2952 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_in_outputLimitAfter2966 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitAfter2968 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_number_in_outputLimitAfter2971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause2987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_rowLimitClause2990 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x1020000780000000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause2992 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x1020000780000000L});
    public static final BitSet FOLLOW_number_in_rowLimitClause2996 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause2998 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_rowLimitClause3002 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L});
    public static final BitSet FOLLOW_OFFSET_in_rowLimitClause3005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3025 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3027 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3029 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3031 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3033 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_relationalExpr3052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_relationalExpr3067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3069 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_relationalExpr3082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_relationalExpr3096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3120 = new BitSet(new long[]{0x0003800037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExprValue3145 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023F83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3154 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_relationalExprValue3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3187 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3189 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3192 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3208 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3210 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3213 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3229 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3245 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3261 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3277 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXPR_in_evalExprChoice3347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpr_in_evalExprChoice3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3371 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_set_in_equalsSubquery3373 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023F83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3382 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_equalsSubquery3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpr3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_substitution_in_valueExpr3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticExpr_in_valueExpr3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_valueExpr3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalExprChoice_in_valueExpr3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinFunc_in_valueExpr3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFuncChain_in_valueExpr3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpr_in_valueExpr3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inExpr_in_valueExpr3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenExpr_in_valueExpr3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeExpr_in_valueExpr3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regExpExpr_in_valueExpr3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpr_in_valueExpr3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectInExpr_in_valueExpr3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectRowExpr_in_valueExpr3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectExistsExpr_in_valueExpr3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpr_in_valueExpr3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_valueExpr3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_valueExprWithTime3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LW_in_valueExprWithTime3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3540 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_valueExprWithTime3542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rangeOperator_in_valueExprWithTime3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_valueExprWithTime3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lastOperator_in_valueExprWithTime3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekDayOperator_in_valueExprWithTime3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericParameterList_in_valueExprWithTime3583 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timePeriod_in_valueExprWithTime3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_numericParameterList3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeOperator_in_numericParameterList3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_numericParameterList3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator3643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_rangeOperator3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator3649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator3652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_rangeOperator3656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator3659 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator3662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator3683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_frequencyOperator3686 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_frequencyOperator3689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_frequencyOperator3692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_OPERATOR_in_lastOperator3711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_lastOperator3714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_lastOperator3717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_lastOperator3720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator3739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_weekDayOperator3742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_weekDayOperator3745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_weekDayOperator3748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr3769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectGroupExpr3771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr3790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectRowExpr3792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr3811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectExistsExpr3813 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr3832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr3834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr3848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr3850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr3871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectInQueryExpr3873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTINCT_in_subQueryExpr3889 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_subQueryExpr3892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_subSelectFilterExpr_in_subQueryExpr3894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_subQueryExpr3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_subSelectFilterExpr3915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_subSelectFilterExpr3917 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_subSelectFilterExpr3921 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_subSelectFilterExpr3926 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_RETAINUNION_in_subSelectFilterExpr3930 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr3933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_in_caseExpr3953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr3956 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_CASE2_in_caseExpr3969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr3972 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_IN_SET_in_inExpr3992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr3994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0048000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr3996 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4002 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8090003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4005 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8090003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_set_in_inExpr4009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SET_in_inExpr4024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0048000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4028 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4034 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8090003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4037 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8090003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_set_in_inExpr4041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_RANGE_in_inExpr4056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0048000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4060 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4066 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_RANGE_in_inExpr4085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0048000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4089 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4095 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenExpr4122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4124 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4126 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenExpr4139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4141 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4143 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4146 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_LIKE_in_likeExpr4166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4168 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4170 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeExpr4186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4188 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4190 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEXP_in_regExpExpr4212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4214 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_REGEXP_in_regExpExpr4227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4229 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_builtinFunc4250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4253 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4257 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_builtinFunc4271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4274 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4278 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_builtinFunc4292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4296 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4300 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIAN_in_builtinFunc4316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4319 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4323 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STDDEV_in_builtinFunc4337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4340 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4344 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVEDEV_in_builtinFunc4358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4361 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4365 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_AGGREG_in_builtinFunc4379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4382 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800001E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4386 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIRST_AGGREG_in_builtinFunc4401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4404 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800001E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4408 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4411 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_AGGREG_in_builtinFunc4423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4426 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtinFunc4443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4445 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4447 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4450 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_PREVIOUS_in_builtinFunc4465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4467 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSTAIL_in_builtinFunc4482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4484 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSCOUNT_in_builtinFunc4499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSWINDOW_in_builtinFunc4513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRIOR_in_builtinFunc4527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_INT_in_builtinFunc4531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_builtinFunc4546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4550 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4553 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TYPEOF_in_builtinFunc4567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_builtinFunc4581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4585 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_builtinFunc4597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr4628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_aggregationFilterExpr4630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_AGG_in_accessValueExpr4644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessValueExprChoice_in_accessValueExpr4646 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice4668 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice4670 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice4672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_accessValueExprChoice4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_EXPR_in_arrayExpr4694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arrayExpr4697 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_PLUS_in_arithmeticExpr4718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4720 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arithmeticExpr4734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4736 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_arithmeticExpr4750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4752 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_arithmeticExpr4765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4767 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_arithmeticExpr4781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4783 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_arithmeticExpr4796 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4798 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_arithmeticExpr4811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4813 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_arithmeticExpr4826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4828 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4830 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_arithmeticExpr4842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4844 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4846 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4849 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_DOT_EXPR_in_dotExpr4869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dotExpr4871 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_dotExpr4873 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWKW_in_newExpr4891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_newAssign_in_newExpr4893 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_NEW_ITEM_in_newAssign4909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_newAssign4911 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_newAssign4914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain4932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libFuncChain4934 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_libOrPropFunction_in_libFuncChain4936 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LIB_FUNCTION_in_libFunctionWithClass4956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_libFunctionWithClass4959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_libFunctionWithClass4963 = new BitSet(new long[]{0x0020400037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8840003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_DISTINCT_in_libFunctionWithClass4966 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8840003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_libFunctionArgItem_in_libFunctionWithClass4970 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8840003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_LPAREN_in_libFunctionWithClass4973 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_libFunctionArgItem4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExprWithTime_in_libFunctionArgItem4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_libOrPropFunction5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libOrPropFunction5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_startPatternExpressionRule5031 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_startPatternExpressionRule5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicExpr_in_exprChoice5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternOp_in_exprChoice5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_EXPR_in_exprChoice5064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distinctExpressions_in_exprChoice5082 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_EXPR_in_exprChoice5114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5116 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8020003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5121 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_exprChoice5123 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_exprChoice5128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchUntilRange_in_exprChoice5144 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5147 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_distinctExpressions5172 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5195 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5198 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_OR_EXPR_in_patternOp5214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5216 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5218 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5221 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_AND_EXPR_in_patternOp5237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5239 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5241 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5244 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_followedByItem5267 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_followedByItem5270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternFilterExpr_in_atomicExpr5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSERVER_EXPR_in_atomicExpr5296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5300 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExprWithTime_in_atomicExpr5302 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x8000003F800000E2L,0x030000000001DE63L});
    public static final BitSet FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterExpr5324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_patternFilterExpr5327 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000800L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000021DE63L});
    public static final BitSet FOLLOW_propertyExpression_in_patternFilterExpr5329 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000021DE63L});
    public static final BitSet FOLLOW_patternFilterAnno_in_patternFilterExpr5332 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_patternFilterExpr5336 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_ATCHAR_in_patternFilterAnno5356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterAnno5358 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_number_in_patternFilterAnno5360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5377 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_PARAM_in_filterParam5421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5423 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5426 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x8000003F800000E0L,0x030000000001DE63L});
    public static final BitSet FOLLOW_EQUALS_in_filterParamComparator5442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_filterParamComparator5451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_filterParamComparator5460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_filterParamComparator5469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_filterParamComparator5478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_filterParamComparator5487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5585 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0090003F80000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator5630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator5651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5664 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_filterAtom5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterAtom5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier5695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_filterIdentifier5697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_filterIdentifier5699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr5718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5720 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5723 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic5742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic5751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic5755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic5762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic5766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic5779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic5788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic5792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic5799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic5803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_PERIOD_in_timePeriod5828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriodDef_in_timePeriod5830 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_yearPart_in_timePeriodDef5846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef5849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5859 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef5887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5910 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5923 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5926 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5941 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5982 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_PART_in_yearPart6038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_yearPart6040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_PART_in_monthPart6055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_monthPart6057 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEK_PART_in_weekPart6072 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_weekPart6074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_PART_in_dayPart6089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dayPart6091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOUR_PART_in_hourPart6106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_hourPart6108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTE_PART_in_minutePart6123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_minutePart6125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_PART_in_secondPart6140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_secondPart6142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MILLISECOND_PART_in_millisecondPart6157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_millisecondPart6159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTITUTION_in_substitution6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_constant6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_constant6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_constant6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_constant6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_constant6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_constant6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_TYPE_in_constant6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_number0 = new BitSet(new long[]{0x0000000000000002L});

}