// $ANTLR 3.2 Sep 23, 2009 12:02:23 EsperEPL2Ast.g 2012-01-12 15:39:20

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CREATE", "WINDOW", "IN_SET", "BETWEEN", "LIKE", "REGEXP", "ESCAPE", "OR_EXPR", "AND_EXPR", "NOT_EXPR", "EVERY_EXPR", "EVERY_DISTINCT_EXPR", "WHERE", "AS", "SUM", "AVG", "MAX", "MIN", "COALESCE", "MEDIAN", "STDDEV", "AVEDEV", "COUNT", "SELECT", "CASE", "CASE2", "ELSE", "WHEN", "THEN", "END", "FROM", "OUTER", "INNER", "JOIN", "LEFT", "RIGHT", "FULL", "ON", "IS", "BY", "GROUP", "HAVING", "DISTINCT", "ALL", "ANY", "SOME", "OUTPUT", "EVENTS", "FIRST", "LAST", "INSERT", "INTO", "ORDER", "ASC", "DESC", "RSTREAM", "ISTREAM", "IRSTREAM", "SCHEMA", "UNIDIRECTIONAL", "RETAINUNION", "RETAININTERSECTION", "PATTERN", "SQL", "METADATASQL", "PREVIOUS", "PREVIOUSTAIL", "PREVIOUSCOUNT", "PREVIOUSWINDOW", "PRIOR", "EXISTS", "WEEKDAY", "LW", "INSTANCEOF", "TYPEOF", "CAST", "CURRENT_TIMESTAMP", "DELETE", "SNAPSHOT", "SET", "VARIABLE", "UNTIL", "AT", "INDEX", "TIMEPERIOD_YEAR", "TIMEPERIOD_YEARS", "TIMEPERIOD_MONTH", "TIMEPERIOD_MONTHS", "TIMEPERIOD_WEEK", "TIMEPERIOD_WEEKS", "TIMEPERIOD_DAY", "TIMEPERIOD_DAYS", "TIMEPERIOD_HOUR", "TIMEPERIOD_HOURS", "TIMEPERIOD_MINUTE", "TIMEPERIOD_MINUTES", "TIMEPERIOD_SEC", "TIMEPERIOD_SECOND", "TIMEPERIOD_SECONDS", "TIMEPERIOD_MILLISEC", "TIMEPERIOD_MILLISECOND", "TIMEPERIOD_MILLISECONDS", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "VALUE_NULL", "ROW_LIMIT_EXPR", "OFFSET", "UPDATE", "MATCH_RECOGNIZE", "MEASURES", "DEFINE", "PARTITION", "MATCHES", "AFTER", "FOR", "WHILE", "USING", "MERGE", "MATCHED", "EXPRESSIONDECL", "NEWKW", "START", "CONTEXT", "INITIATED", "TERMINATED", "NUMERIC_PARAM_RANGE", "NUMERIC_PARAM_LIST", "NUMERIC_PARAM_FREQUENCY", "OBJECT_PARAM_ORDERED_EXPR", "FOLLOWED_BY_EXPR", "FOLLOWED_BY_ITEM", "PATTERN_FILTER_EXPR", "PATTERN_NOT_EXPR", "PATTERN_EVERY_DISTINCT_EXPR", "EVENT_FILTER_EXPR", "EVENT_FILTER_PROPERTY_EXPR", "EVENT_FILTER_PROPERTY_EXPR_ATOM", "PROPERTY_SELECTION_ELEMENT_EXPR", "PROPERTY_SELECTION_STREAM", "PROPERTY_WILDCARD_SELECT", "EVENT_FILTER_IDENT", "EVENT_FILTER_PARAM", "EVENT_FILTER_RANGE", "EVENT_FILTER_NOT_RANGE", "EVENT_FILTER_IN", "EVENT_FILTER_NOT_IN", "EVENT_FILTER_BETWEEN", "EVENT_FILTER_NOT_BETWEEN", "CLASS_IDENT", "GUARD_EXPR", "OBSERVER_EXPR", "VIEW_EXPR", "PATTERN_INCL_EXPR", "DATABASE_JOIN_EXPR", "WHERE_EXPR", "HAVING_EXPR", "EVAL_BITWISE_EXPR", "EVAL_AND_EXPR", "EVAL_OR_EXPR", "EVAL_EQUALS_EXPR", "EVAL_NOTEQUALS_EXPR", "EVAL_IS_EXPR", "EVAL_ISNOT_EXPR", "EVAL_EQUALS_GROUP_EXPR", "EVAL_NOTEQUALS_GROUP_EXPR", "EVAL_IDENT", "SELECTION_EXPR", "SELECTION_ELEMENT_EXPR", "SELECTION_STREAM", "STREAM_EXPR", "OUTERJOIN_EXPR", "INNERJOIN_EXPR", "LEFT_OUTERJOIN_EXPR", "RIGHT_OUTERJOIN_EXPR", "FULL_OUTERJOIN_EXPR", "GROUP_BY_EXPR", "ORDER_BY_EXPR", "ORDER_ELEMENT_EXPR", "EVENT_PROP_EXPR", "EVENT_PROP_SIMPLE", "EVENT_PROP_MAPPED", "EVENT_PROP_INDEXED", "EVENT_PROP_DYNAMIC_SIMPLE", "EVENT_PROP_DYNAMIC_INDEXED", "EVENT_PROP_DYNAMIC_MAPPED", "EVENT_LIMIT_EXPR", "TIMEPERIOD_LIMIT_EXPR", "AFTER_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR_PARAM", "WHEN_LIMIT_EXPR", "TERM_LIMIT_EXPR", "INSERTINTO_EXPR", "EXPRCOL", "INDEXCOL", "CONCAT", "LIB_FUNCTION", "LIB_FUNC_CHAIN", "DOT_EXPR", "UNARY_MINUS", "TIME_PERIOD", "ARRAY_EXPR", "YEAR_PART", "MONTH_PART", "WEEK_PART", "DAY_PART", "HOUR_PART", "MINUTE_PART", "SECOND_PART", "MILLISECOND_PART", "NOT_IN_SET", "NOT_BETWEEN", "NOT_LIKE", "NOT_REGEXP", "DBSELECT_EXPR", "DBFROM_CLAUSE", "DBWHERE_CLAUSE", "WILDCARD_SELECT", "INSERTINTO_STREAM_NAME", "IN_RANGE", "NOT_IN_RANGE", "SUBSELECT_EXPR", "SUBSELECT_GROUP_EXPR", "EXISTS_SUBSELECT_EXPR", "IN_SUBSELECT_EXPR", "NOT_IN_SUBSELECT_EXPR", "IN_SUBSELECT_QUERY_EXPR", "LAST_OPERATOR", "WEEKDAY_OPERATOR", "SUBSTITUTION", "CAST_EXPR", "CREATE_INDEX_EXPR", "CREATE_WINDOW_EXPR", "CREATE_WINDOW_SELECT_EXPR", "ON_EXPR", "ON_STREAM", "ON_DELETE_EXPR", "ON_SELECT_EXPR", "ON_UPDATE_EXPR", "ON_MERGE_EXPR", "ON_SELECT_INSERT_EXPR", "ON_SELECT_INSERT_OUTPUT", "ON_EXPR_FROM", "ON_SET_EXPR", "CREATE_VARIABLE_EXPR", "METHOD_JOIN_EXPR", "MATCH_UNTIL_EXPR", "MATCH_UNTIL_RANGE_HALFOPEN", "MATCH_UNTIL_RANGE_HALFCLOSED", "MATCH_UNTIL_RANGE_CLOSED", "MATCH_UNTIL_RANGE_BOUNDED", "CREATE_COL_TYPE_LIST", "CREATE_COL_TYPE", "NUMBERSETSTAR", "ANNOTATION", "ANNOTATION_ARRAY", "ANNOTATION_VALUE", "FIRST_AGGREG", "LAST_AGGREG", "WINDOW_AGGREG", "ACCESS_AGG", "UPDATE_EXPR", "ON_SET_EXPR_ITEM", "CREATE_SCHEMA_EXPR", "CREATE_SCHEMA_EXPR_QUAL", "CREATE_SCHEMA_EXPR_VAR", "VARIANT_LIST", "MERGE_UNM", "MERGE_MAT", "MERGE_UPD", "MERGE_INS", "MERGE_DEL", "NEW_ITEM", "AGG_FILTER_EXPR", "CREATE_CTX", "CREATE_CTX_FIXED", "CREATE_CTX_PART", "CREATE_CTX_COAL", "CREATE_CTX_CAT", "CREATE_CTX_INIT", "CREATE_CTX_CATITEM", "CREATE_CTX_NESTED", "CREATE_CTX_PATTERN", "PARTITIONITEM", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "BOOL_TYPE", "NULL_TYPE", "NUM_DOUBLE", "EPL_EXPR", "MATCHREC_PATTERN", "MATCHREC_PATTERN_ATOM", "MATCHREC_PATTERN_CONCAT", "MATCHREC_PATTERN_ALTER", "MATCHREC_PATTERN_NESTED", "MATCHREC_AFTER_SKIP", "MATCHREC_INTERVAL", "MATCHREC_DEFINE", "MATCHREC_DEFINE_ITEM", "MATCHREC_MEASURES", "MATCHREC_MEASURE_ITEM", "LBRACK", "RBRACK", "IDENT", "LPAREN", "RPAREN", "COLON", "LCURLY", "RCURLY", "GOES", "COMMA", "EQUALS", "DOT", "STAR", "ATCHAR", "BOR", "PLUS", "QUESTION", "STRING_LITERAL", "QUOTED_STRING_LITERAL", "BAND", "BXOR", "SQL_NE", "NOT_EQUAL", "LT", "GT", "LE", "GE", "LOR", "MINUS", "DIV", "MOD", "NUM_INT", "FOLLOWED_BY", "FOLLOWMAX_BEGIN", "FOLLOWMAX_END", "ESCAPECHAR", "TICKED_STRING_LITERAL", "NUM_LONG", "NUM_FLOAT", "EQUAL", "LNOT", "BNOT", "DIV_ASSIGN", "PLUS_ASSIGN", "INC", "MINUS_ASSIGN", "DEC", "STAR_ASSIGN", "MOD_ASSIGN", "SR", "SR_ASSIGN", "BSR", "BSR_ASSIGN", "SL", "SL_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LAND", "SEMI", "WS", "SL_COMMENT", "ML_COMMENT", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "EXPONENT", "FLOAT_SUFFIX", "EVAL_IS_GROUP_EXPR", "EVAL_ISNOT_GROUP_EXPR"
    };
    public static final int CRONTAB_LIMIT_EXPR=192;
    public static final int FLOAT_SUFFIX=376;
    public static final int STAR=320;
    public static final int DOT_EXPR=202;
    public static final int NUMERIC_PARAM_LIST=130;
    public static final int ISTREAM=60;
    public static final int MOD=338;
    public static final int OUTERJOIN_EXPR=174;
    public static final int LIB_FUNC_CHAIN=201;
    public static final int EVAL_ISNOT_GROUP_EXPR=378;
    public static final int CREATE_COL_TYPE_LIST=255;
    public static final int MONTH_PART=207;
    public static final int MERGE_INS=274;
    public static final int BSR=359;
    public static final int LIB_FUNCTION=200;
    public static final int EOF=-1;
    public static final int TIMEPERIOD_MILLISECONDS=105;
    public static final int FULL_OUTERJOIN_EXPR=178;
    public static final int CREATE_CTX_NESTED=285;
    public static final int CREATE_CTX_FIXED=279;
    public static final int MATCHREC_PATTERN_CONCAT=299;
    public static final int INC=352;
    public static final int LNOT=348;
    public static final int RPAREN=312;
    public static final int CREATE=4;
    public static final int STRING_LITERAL=325;
    public static final int BSR_ASSIGN=360;
    public static final int CAST_EXPR=234;
    public static final int MATCHES=116;
    public static final int USING=120;
    public static final int STREAM_EXPR=173;
    public static final int TIMEPERIOD_SECONDS=102;
    public static final int NOT_EQUAL=330;
    public static final int METADATASQL=68;
    public static final int EVENT_FILTER_PROPERTY_EXPR=139;
    public static final int LAST_AGGREG=262;
    public static final int GOES=316;
    public static final int REGEXP=9;
    public static final int MATCHED=122;
    public static final int INITIATED=127;
    public static final int FOLLOWED_BY_EXPR=133;
    public static final int NEWKW=124;
    public static final int HOUR_PART=210;
    public static final int FOLLOWED_BY=340;
    public static final int MATCH_UNTIL_RANGE_CLOSED=253;
    public static final int MATCHREC_PATTERN_NESTED=301;
    public static final int RBRACK=309;
    public static final int GE=334;
    public static final int METHOD_JOIN_EXPR=249;
    public static final int ASC=57;
    public static final int IN_SET=6;
    public static final int CREATE_CTX_PART=280;
    public static final int EVENT_FILTER_EXPR=138;
    public static final int PATTERN_EVERY_DISTINCT_EXPR=137;
    public static final int CREATE_CTX_COAL=281;
    public static final int ELSE=30;
    public static final int MINUS_ASSIGN=353;
    public static final int EVENT_FILTER_NOT_IN=149;
    public static final int INSERTINTO_STREAM_NAME=222;
    public static final int NUM_DOUBLE=295;
    public static final int TIMEPERIOD_MILLISEC=103;
    public static final int UNARY_MINUS=203;
    public static final int LCURLY=314;
    public static final int RETAINUNION=64;
    public static final int DBWHERE_CLAUSE=220;
    public static final int MEDIAN=23;
    public static final int EVENTS=51;
    public static final int AND_EXPR=12;
    public static final int EVENT_FILTER_NOT_RANGE=147;
    public static final int GROUP=44;
    public static final int WS=368;
    public static final int SUBSELECT_GROUP_EXPR=226;
    public static final int FOLLOWED_BY_ITEM=134;
    public static final int YEAR_PART=206;
    public static final int ON_SELECT_INSERT_EXPR=244;
    public static final int TYPEOF=78;
    public static final int ESCAPECHAR=343;
    public static final int EXPRCOL=197;
    public static final int SL_COMMENT=369;
    public static final int NULL_TYPE=294;
    public static final int MATCH_UNTIL_RANGE_HALFOPEN=251;
    public static final int GT=332;
    public static final int BNOT=349;
    public static final int EVAL_IS_EXPR=165;
    public static final int WHERE_EXPR=158;
    public static final int END=33;
    public static final int INNERJOIN_EXPR=175;
    public static final int LAND=366;
    public static final int TERM_LIMIT_EXPR=195;
    public static final int NOT_REGEXP=217;
    public static final int MATCH_UNTIL_EXPR=250;
    public static final int EVENT_PROP_EXPR=182;
    public static final int LBRACK=308;
    public static final int MERGE_UPD=273;
    public static final int VIEW_EXPR=155;
    public static final int ANNOTATION=258;
    public static final int LONG_TYPE=289;
    public static final int EVENT_FILTER_PROPERTY_EXPR_ATOM=140;
    public static final int MATCHREC_PATTERN=297;
    public static final int ON_MERGE_EXPR=243;
    public static final int ATCHAR=321;
    public static final int TIMEPERIOD_SEC=100;
    public static final int TICKED_STRING_LITERAL=344;
    public static final int ON_SELECT_EXPR=241;
    public static final int MINUTE_PART=211;
    public static final int PATTERN_NOT_EXPR=136;
    public static final int SQL_NE=329;
    public static final int SUM=18;
    public static final int HexDigit=374;
    public static final int UPDATE_EXPR=265;
    public static final int LPAREN=311;
    public static final int IN_SUBSELECT_EXPR=228;
    public static final int AT=86;
    public static final int AS=17;
    public static final int OR_EXPR=11;
    public static final int BOOLEAN_TRUE=106;
    public static final int THEN=32;
    public static final int MATCHREC_INTERVAL=303;
    public static final int NOT_IN_RANGE=224;
    public static final int TIMEPERIOD_MONTH=90;
    public static final int OFFSET=110;
    public static final int AVG=19;
    public static final int LEFT=38;
    public static final int SECOND_PART=212;
    public static final int PREVIOUS=69;
    public static final int PREVIOUSWINDOW=72;
    public static final int MATCH_RECOGNIZE=112;
    public static final int PARTITIONITEM=287;
    public static final int IDENT=310;
    public static final int DATABASE_JOIN_EXPR=157;
    public static final int BXOR=328;
    public static final int PLUS=323;
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
    public static final int MATCHREC_DEFINE=304;
    public static final int BY=43;
    public static final int RIGHT_OUTERJOIN_EXPR=177;
    public static final int NUMBERSETSTAR=257;
    public static final int LAST_OPERATOR=231;
    public static final int PATTERN_FILTER_EXPR=135;
    public static final int MERGE=121;
    public static final int FOLLOWMAX_END=342;
    public static final int MERGE_UNM=271;
    public static final int EVAL_AND_EXPR=161;
    public static final int LEFT_OUTERJOIN_EXPR=176;
    public static final int EPL_EXPR=296;
    public static final int GROUP_BY_EXPR=179;
    public static final int SET=83;
    public static final int RIGHT=39;
    public static final int HAVING=45;
    public static final int INSTANCEOF=77;
    public static final int MIN=21;
    public static final int EVENT_PROP_SIMPLE=183;
    public static final int MINUS=336;
    public static final int SEMI=367;
    public static final int INDEXCOL=198;
    public static final int STAR_ASSIGN=355;
    public static final int PREVIOUSCOUNT=71;
    public static final int VARIANT_LIST=270;
    public static final int FIRST_AGGREG=261;
    public static final int COLON=313;
    public static final int EVAL_EQUALS_GROUP_EXPR=167;
    public static final int BAND_ASSIGN=365;
    public static final int PREVIOUSTAIL=70;
    public static final int SCHEMA=62;
    public static final int CRONTAB_LIMIT_EXPR_PARAM=193;
    public static final int NOT_IN_SET=214;
    public static final int VALUE_NULL=108;
    public static final int EVENT_PROP_DYNAMIC_SIMPLE=186;
    public static final int SL=361;
    public static final int NOT_IN_SUBSELECT_EXPR=229;
    public static final int WHEN=31;
    public static final int GUARD_EXPR=153;
    public static final int RCURLY=315;
    public static final int SR=357;
    public static final int PLUS_ASSIGN=351;
    public static final int DAY_PART=209;
    public static final int EXISTS_SUBSELECT_EXPR=227;
    public static final int START=125;
    public static final int EVENT_FILTER_IN=148;
    public static final int DIV=337;
    public static final int OBJECT_PARAM_ORDERED_EXPR=132;
    public static final int EXPRESSIONDECL=123;
    public static final int WEEK_PART=208;
    public static final int BETWEEN=7;
    public static final int MILLISECOND_PART=213;
    public static final int OctalEscape=373;
    public static final int ROW_LIMIT_EXPR=109;
    public static final int FIRST=52;
    public static final int PRIOR=73;
    public static final int SELECTION_EXPR=170;
    public static final int EVAL_IS_GROUP_EXPR=377;
    public static final int LW=76;
    public static final int CAST=79;
    public static final int LOR=335;
    public static final int WILDCARD_SELECT=221;
    public static final int LT=331;
    public static final int EXPONENT=375;
    public static final int PATTERN_INCL_EXPR=156;
    public static final int CREATE_CTX=278;
    public static final int WHILE=119;
    public static final int ORDER_BY_EXPR=180;
    public static final int NEW_ITEM=276;
    public static final int BOOL_TYPE=293;
    public static final int ANNOTATION_ARRAY=259;
    public static final int MOD_ASSIGN=356;
    public static final int CASE=28;
    public static final int IN_SUBSELECT_QUERY_EXPR=230;
    public static final int COUNT=26;
    public static final int EQUALS=318;
    public static final int RETAININTERSECTION=65;
    public static final int TERMINATED=128;
    public static final int WINDOW_AGGREG=263;
    public static final int DIV_ASSIGN=350;
    public static final int SL_ASSIGN=362;
    public static final int TIMEPERIOD_WEEKS=93;
    public static final int PATTERN=66;
    public static final int CREATE_CTX_INIT=283;
    public static final int SQL=67;
    public static final int FULL=40;
    public static final int WEEKDAY=75;
    public static final int MATCHREC_AFTER_SKIP=302;
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
    public static final int FLOAT_TYPE=290;
    public static final int SUBSELECT_EXPR=225;
    public static final int ANNOTATION_VALUE=260;
    public static final int NUMERIC_PARAM_RANGE=129;
    public static final int CONCAT=199;
    public static final int CLASS_IDENT=152;
    public static final int MATCHREC_PATTERN_ALTER=300;
    public static final int ON_EXPR=238;
    public static final int CREATE_WINDOW_EXPR=236;
    public static final int PROPERTY_SELECTION_STREAM=142;
    public static final int ON_DELETE_EXPR=240;
    public static final int ON=41;
    public static final int NUM_LONG=345;
    public static final int TIME_PERIOD=204;
    public static final int DOUBLE_TYPE=291;
    public static final int DELETE=81;
    public static final int INT_TYPE=288;
    public static final int EVAL_BITWISE_EXPR=160;
    public static final int EVERY_EXPR=14;
    public static final int ORDER_ELEMENT_EXPR=181;
    public static final int TIMEPERIOD_HOURS=97;
    public static final int VARIABLE=84;
    public static final int SUBSTITUTION=233;
    public static final int UNTIL=85;
    public static final int STRING_TYPE=292;
    public static final int ON_SET_EXPR=247;
    public static final int MATCHREC_DEFINE_ITEM=305;
    public static final int NUM_INT=339;
    public static final int STDDEV=24;
    public static final int ON_EXPR_FROM=246;
    public static final int NUM_FLOAT=346;
    public static final int FROM=34;
    public static final int DISTINCT=46;
    public static final int PROPERTY_SELECTION_ELEMENT_EXPR=141;
    public static final int OUTPUT=50;
    public static final int EscapeSequence=371;
    public static final int WEEKDAY_OPERATOR=232;
    public static final int WHERE=16;
    public static final int DEC=354;
    public static final int INNER=36;
    public static final int NUMERIC_PARAM_FREQUENCY=131;
    public static final int BXOR_ASSIGN=363;
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
    public static final int ML_COMMENT=370;
    public static final int CREATE_CTX_CAT=282;
    public static final int EVENT_PROP_DYNAMIC_INDEXED=187;
    public static final int BOR_ASSIGN=364;
    public static final int COMMA=317;
    public static final int PARTITION=115;
    public static final int IS=42;
    public static final int WHEN_LIMIT_EXPR=194;
    public static final int TIMEPERIOD_LIMIT_EXPR=190;
    public static final int SOME=49;
    public static final int TIMEPERIOD_HOUR=96;
    public static final int ALL=47;
    public static final int MATCHREC_MEASURE_ITEM=307;
    public static final int BOR=322;
    public static final int EQUAL=347;
    public static final int CREATE_SCHEMA_EXPR_VAR=269;
    public static final int EVENT_FILTER_NOT_BETWEEN=151;
    public static final int IN_RANGE=223;
    public static final int DOT=319;
    public static final int CURRENT_TIMESTAMP=80;
    public static final int MATCHREC_MEASURES=306;
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
    public static final int MATCHREC_PATTERN_ATOM=298;
    public static final int BAND=327;
    public static final int CREATE_CTX_PATTERN=286;
    public static final int QUOTED_STRING_LITERAL=326;
    public static final int JOIN=37;
    public static final int ANY=48;
    public static final int NOT_EXPR=13;
    public static final int QUESTION=324;
    public static final int OBSERVER_EXPR=154;
    public static final int EVENT_FILTER_IDENT=144;
    public static final int CREATE_SCHEMA_EXPR_QUAL=268;
    public static final int EVENT_PROP_MAPPED=184;
    public static final int UnicodeEscape=372;
    public static final int TIMEPERIOD_YEAR=88;
    public static final int AVEDEV=25;
    public static final int DBSELECT_EXPR=218;
    public static final int TIMEPERIOD_MONTHS=91;
    public static final int FOLLOWMAX_BEGIN=341;
    public static final int SELECTION_ELEMENT_EXPR=171;
    public static final int CREATE_WINDOW_SELECT_EXPR=237;
    public static final int WINDOW=5;
    public static final int ON_SET_EXPR_ITEM=266;
    public static final int DESC=58;
    public static final int SELECTION_STREAM=172;
    public static final int SR_ASSIGN=358;
    public static final int DBFROM_CLAUSE=219;
    public static final int LE=333;
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

            if ( ((LA28_0>=IN_SET && LA28_0<=REGEXP)||LA28_0==NOT_EXPR||(LA28_0>=SUM && LA28_0<=AVG)||(LA28_0>=COALESCE && LA28_0<=COUNT)||(LA28_0>=CASE && LA28_0<=CASE2)||(LA28_0>=PREVIOUS && LA28_0<=EXISTS)||(LA28_0>=INSTANCEOF && LA28_0<=CURRENT_TIMESTAMP)||LA28_0==NEWKW||(LA28_0>=EVAL_AND_EXPR && LA28_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA28_0==EVENT_PROP_EXPR||LA28_0==CONCAT||(LA28_0>=LIB_FUNC_CHAIN && LA28_0<=DOT_EXPR)||LA28_0==ARRAY_EXPR||(LA28_0>=NOT_IN_SET && LA28_0<=NOT_REGEXP)||(LA28_0>=IN_RANGE && LA28_0<=SUBSELECT_EXPR)||(LA28_0>=EXISTS_SUBSELECT_EXPR && LA28_0<=NOT_IN_SUBSELECT_EXPR)||LA28_0==SUBSTITUTION||(LA28_0>=FIRST_AGGREG && LA28_0<=WINDOW_AGGREG)||(LA28_0>=INT_TYPE && LA28_0<=NULL_TYPE)||LA28_0==STAR||(LA28_0>=BOR && LA28_0<=PLUS)||(LA28_0>=BAND && LA28_0<=BXOR)||(LA28_0>=LT && LA28_0<=GE)||(LA28_0>=MINUS && LA28_0<=MOD)||(LA28_0>=EVAL_IS_GROUP_EXPR && LA28_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
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

            if ( ((LA34_0>=IN_SET && LA34_0<=REGEXP)||LA34_0==NOT_EXPR||(LA34_0>=SUM && LA34_0<=AVG)||(LA34_0>=COALESCE && LA34_0<=COUNT)||(LA34_0>=CASE && LA34_0<=CASE2)||(LA34_0>=PREVIOUS && LA34_0<=EXISTS)||(LA34_0>=INSTANCEOF && LA34_0<=CURRENT_TIMESTAMP)||LA34_0==NEWKW||(LA34_0>=EVAL_AND_EXPR && LA34_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA34_0==EVENT_PROP_EXPR||LA34_0==CONCAT||(LA34_0>=LIB_FUNC_CHAIN && LA34_0<=DOT_EXPR)||LA34_0==ARRAY_EXPR||(LA34_0>=NOT_IN_SET && LA34_0<=NOT_REGEXP)||(LA34_0>=IN_RANGE && LA34_0<=SUBSELECT_EXPR)||(LA34_0>=EXISTS_SUBSELECT_EXPR && LA34_0<=NOT_IN_SUBSELECT_EXPR)||LA34_0==SUBSTITUTION||(LA34_0>=FIRST_AGGREG && LA34_0<=WINDOW_AGGREG)||(LA34_0>=INT_TYPE && LA34_0<=NULL_TYPE)||LA34_0==STAR||(LA34_0>=BOR && LA34_0<=PLUS)||(LA34_0>=BAND && LA34_0<=BXOR)||(LA34_0>=LT && LA34_0<=GE)||(LA34_0>=MINUS && LA34_0<=MOD)||(LA34_0>=EVAL_IS_GROUP_EXPR && LA34_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
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

                if ( ((LA64_0>=IN_SET && LA64_0<=REGEXP)||LA64_0==NOT_EXPR||(LA64_0>=SUM && LA64_0<=AVG)||(LA64_0>=COALESCE && LA64_0<=COUNT)||(LA64_0>=CASE && LA64_0<=CASE2)||(LA64_0>=PREVIOUS && LA64_0<=EXISTS)||(LA64_0>=INSTANCEOF && LA64_0<=CURRENT_TIMESTAMP)||LA64_0==NEWKW||(LA64_0>=EVAL_AND_EXPR && LA64_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA64_0==EVENT_PROP_EXPR||LA64_0==CONCAT||(LA64_0>=LIB_FUNC_CHAIN && LA64_0<=DOT_EXPR)||LA64_0==ARRAY_EXPR||(LA64_0>=NOT_IN_SET && LA64_0<=NOT_REGEXP)||(LA64_0>=IN_RANGE && LA64_0<=SUBSELECT_EXPR)||(LA64_0>=EXISTS_SUBSELECT_EXPR && LA64_0<=NOT_IN_SUBSELECT_EXPR)||LA64_0==SUBSTITUTION||(LA64_0>=FIRST_AGGREG && LA64_0<=WINDOW_AGGREG)||(LA64_0>=INT_TYPE && LA64_0<=NULL_TYPE)||LA64_0==STAR||(LA64_0>=BOR && LA64_0<=PLUS)||(LA64_0>=BAND && LA64_0<=BXOR)||(LA64_0>=LT && LA64_0<=GE)||(LA64_0>=MINUS && LA64_0<=MOD)||(LA64_0>=EVAL_IS_GROUP_EXPR && LA64_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
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

            if ( ((LA72_0>=IN_SET && LA72_0<=REGEXP)||LA72_0==NOT_EXPR||(LA72_0>=SUM && LA72_0<=AVG)||(LA72_0>=COALESCE && LA72_0<=COUNT)||(LA72_0>=CASE && LA72_0<=CASE2)||(LA72_0>=PREVIOUS && LA72_0<=EXISTS)||(LA72_0>=INSTANCEOF && LA72_0<=CURRENT_TIMESTAMP)||LA72_0==NEWKW||(LA72_0>=EVAL_AND_EXPR && LA72_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA72_0==EVENT_PROP_EXPR||LA72_0==CONCAT||(LA72_0>=LIB_FUNC_CHAIN && LA72_0<=DOT_EXPR)||LA72_0==ARRAY_EXPR||(LA72_0>=NOT_IN_SET && LA72_0<=NOT_REGEXP)||(LA72_0>=IN_RANGE && LA72_0<=SUBSELECT_EXPR)||(LA72_0>=EXISTS_SUBSELECT_EXPR && LA72_0<=NOT_IN_SUBSELECT_EXPR)||LA72_0==SUBSTITUTION||(LA72_0>=FIRST_AGGREG && LA72_0<=WINDOW_AGGREG)||(LA72_0>=INT_TYPE && LA72_0<=NULL_TYPE)||LA72_0==STAR||(LA72_0>=BOR && LA72_0<=PLUS)||(LA72_0>=BAND && LA72_0<=BXOR)||(LA72_0>=LT && LA72_0<=GE)||(LA72_0>=MINUS && LA72_0<=MOD)||(LA72_0>=EVAL_IS_GROUP_EXPR && LA72_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
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
    // EsperEPL2Ast.g:240:1: createContextRangePoint : ( createContextFilter | ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? ) | crontabLimitParameterSet | ^( AFTER timePeriod ) );
    public final void createContextRangePoint() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:241:2: ( createContextFilter | ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? ) | crontabLimitParameterSet | ^( AFTER timePeriod ) )
            int alt80=4;
            switch ( input.LA(1) ) {
            case STREAM_EXPR:
                {
                alt80=1;
                }
                break;
            case CREATE_CTX_PATTERN:
                {
                alt80=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR_PARAM:
                {
                alt80=3;
                }
                break;
            case AFTER:
                {
                alt80=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // EsperEPL2Ast.g:241:4: createContextFilter
                    {
                    pushFollow(FOLLOW_createContextFilter_in_createContextRangePoint1328);
                    createContextFilter();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:242:5: ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? )
                    {
                    match(input,CREATE_CTX_PATTERN,FOLLOW_CREATE_CTX_PATTERN_in_createContextRangePoint1336); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_patternInclusionExpression_in_createContextRangePoint1338);
                    patternInclusionExpression();

                    state._fsp--;

                    // EsperEPL2Ast.g:242:53: ( IDENT )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==IDENT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // EsperEPL2Ast.g:242:53: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextRangePoint1340); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:243:4: crontabLimitParameterSet
                    {
                    pushFollow(FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1347);
                    crontabLimitParameterSet();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:244:4: ^( AFTER timePeriod )
                    {
                    match(input,AFTER,FOLLOW_AFTER_in_createContextRangePoint1353); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_timePeriod_in_createContextRangePoint1355);
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
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextNested1371); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextNested1373); 
            pushFollow(FOLLOW_createContextDetail_in_createContextNested1375);
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
            match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_createContextFilter1388); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextFilter1390);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:252:41: ( IDENT )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IDENT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // EsperEPL2Ast.g:252:41: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createContextFilter1393); 

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
            match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_createContextPartitionItem1409); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextPartitionItem1411);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:256:43: ( eventPropertyExpr[false] )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==EVENT_PROP_EXPR) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // EsperEPL2Ast.g:256:43: eventPropertyExpr[false]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_createContextPartitionItem1414);
            	    eventPropertyExpr(false);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
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
            match(input,COALESCE,FOLLOW_COALESCE_in_createContextCoalesceItem1431); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1433);
            libFunctionWithClass();

            state._fsp--;

            pushFollow(FOLLOW_eventFilterExpr_in_createContextCoalesceItem1435);
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
            match(input,CREATE_CTX_CATITEM,FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1451); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_createContextCategoryItem1453);
            valueExpr();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_createContextCategoryItem1455); 

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
            s=(CommonTree)match(input,CREATE_SCHEMA_EXPR,FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1472); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1474); 
            // EsperEPL2Ast.g:268:33: ( variantList | ( createColTypeList )? )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==VARIANT_LIST) ) {
                alt84=1;
            }
            else if ( (LA84_0==UP||LA84_0==CREATE_COL_TYPE_LIST||(LA84_0>=CREATE_SCHEMA_EXPR_QUAL && LA84_0<=CREATE_SCHEMA_EXPR_VAR)) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // EsperEPL2Ast.g:268:34: variantList
                    {
                    pushFollow(FOLLOW_variantList_in_createSchemaExpr1477);
                    variantList();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:268:46: ( createColTypeList )?
                    {
                    // EsperEPL2Ast.g:268:46: ( createColTypeList )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==CREATE_COL_TYPE_LIST) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // EsperEPL2Ast.g:268:46: createColTypeList
                            {
                            pushFollow(FOLLOW_createColTypeList_in_createSchemaExpr1479);
                            createColTypeList();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:268:66: ( ^( CREATE_SCHEMA_EXPR_VAR IDENT ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==CREATE_SCHEMA_EXPR_VAR) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // EsperEPL2Ast.g:268:67: ^( CREATE_SCHEMA_EXPR_VAR IDENT )
                    {
                    match(input,CREATE_SCHEMA_EXPR_VAR,FOLLOW_CREATE_SCHEMA_EXPR_VAR_in_createSchemaExpr1485); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1487); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:268:101: ( createSchemaQual )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==CREATE_SCHEMA_EXPR_QUAL) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // EsperEPL2Ast.g:268:101: createSchemaQual
            	    {
            	    pushFollow(FOLLOW_createSchemaQual_in_createSchemaExpr1492);
            	    createSchemaQual();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop86;
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
            match(input,CREATE_SCHEMA_EXPR_QUAL,FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1510); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaQual1512); 
            pushFollow(FOLLOW_exprCol_in_createSchemaQual1514);
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
            match(input,VARIANT_LIST,FOLLOW_VARIANT_LIST_in_variantList1530); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:276:19: ( STAR | CLASS_IDENT )+
            int cnt87=0;
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==CLASS_IDENT||LA87_0==STAR) ) {
                    alt87=1;
                }


                switch (alt87) {
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
            	    if ( cnt87 >= 1 ) break loop87;
                        EarlyExitException eee =
                            new EarlyExitException(87, input);
                        throw eee;
                }
                cnt87++;
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
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==INSERTINTO_EXPR) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // EsperEPL2Ast.g:280:5: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_selectExpr1550);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_selectClause_in_selectExpr1556);
            selectClause();

            state._fsp--;

            pushFollow(FOLLOW_fromClause_in_selectExpr1561);
            fromClause();

            state._fsp--;

            // EsperEPL2Ast.g:283:3: ( matchRecogClause )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==MATCH_RECOGNIZE) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // EsperEPL2Ast.g:283:4: matchRecogClause
                    {
                    pushFollow(FOLLOW_matchRecogClause_in_selectExpr1566);
                    matchRecogClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:284:3: ( whereClause[true] )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==WHERE_EXPR) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // EsperEPL2Ast.g:284:4: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr1573);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:285:3: ( groupByClause )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==GROUP_BY_EXPR) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // EsperEPL2Ast.g:285:4: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_selectExpr1581);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:286:3: ( havingClause )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==HAVING_EXPR) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // EsperEPL2Ast.g:286:4: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_selectExpr1588);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:287:3: ( outputLimitExpr )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=EVENT_LIMIT_EXPR && LA93_0<=CRONTAB_LIMIT_EXPR)||(LA93_0>=WHEN_LIMIT_EXPR && LA93_0<=TERM_LIMIT_EXPR)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // EsperEPL2Ast.g:287:4: outputLimitExpr
                    {
                    pushFollow(FOLLOW_outputLimitExpr_in_selectExpr1595);
                    outputLimitExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:288:3: ( orderByClause )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ORDER_BY_EXPR) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // EsperEPL2Ast.g:288:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_selectExpr1602);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:289:3: ( rowLimitClause )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==ROW_LIMIT_EXPR) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // EsperEPL2Ast.g:289:4: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_selectExpr1609);
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
            i=(CommonTree)match(input,INSERTINTO_EXPR,FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1626); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:293:24: ( ISTREAM | RSTREAM )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RSTREAM && LA96_0<=ISTREAM)) ) {
                alt96=1;
            }
            switch (alt96) {
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

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_insertIntoExpr1637); 
            // EsperEPL2Ast.g:293:57: ( exprCol )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==EXPRCOL) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // EsperEPL2Ast.g:293:58: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_insertIntoExpr1640);
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
            match(input,EXPRCOL,FOLLOW_EXPRCOL_in_exprCol1659); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_exprCol1661); 
            // EsperEPL2Ast.g:297:20: ( IDENT )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==IDENT) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // EsperEPL2Ast.g:297:21: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_exprCol1664); 

            	    }
            	    break;

            	default :
            	    break loop98;
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
            s=(CommonTree)match(input,SELECTION_EXPR,FOLLOW_SELECTION_EXPR_in_selectClause1682); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:301:23: ( RSTREAM | ISTREAM | IRSTREAM )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=RSTREAM && LA99_0<=IRSTREAM)) ) {
                alt99=1;
            }
            switch (alt99) {
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
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==DISTINCT) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // EsperEPL2Ast.g:301:55: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause1697); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_selectClause1700);
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
            pushFollow(FOLLOW_streamExpression_in_fromClause1714);
            streamExpression();

            state._fsp--;

            // EsperEPL2Ast.g:305:21: ( streamExpression ( outerJoin )* )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==STREAM_EXPR) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // EsperEPL2Ast.g:305:22: streamExpression ( outerJoin )*
            	    {
            	    pushFollow(FOLLOW_streamExpression_in_fromClause1717);
            	    streamExpression();

            	    state._fsp--;

            	    // EsperEPL2Ast.g:305:39: ( outerJoin )*
            	    loop101:
            	    do {
            	        int alt101=2;
            	        int LA101_0 = input.LA(1);

            	        if ( ((LA101_0>=INNERJOIN_EXPR && LA101_0<=FULL_OUTERJOIN_EXPR)) ) {
            	            alt101=1;
            	        }


            	        switch (alt101) {
            	    	case 1 :
            	    	    // EsperEPL2Ast.g:305:40: outerJoin
            	    	    {
            	    	    pushFollow(FOLLOW_outerJoin_in_fromClause1720);
            	    	    outerJoin();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop101;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop102;
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
            f=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forExpr1740); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_forExpr1742); 
            // EsperEPL2Ast.g:309:18: ( valueExpr )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( ((LA103_0>=IN_SET && LA103_0<=REGEXP)||LA103_0==NOT_EXPR||(LA103_0>=SUM && LA103_0<=AVG)||(LA103_0>=COALESCE && LA103_0<=COUNT)||(LA103_0>=CASE && LA103_0<=CASE2)||(LA103_0>=PREVIOUS && LA103_0<=EXISTS)||(LA103_0>=INSTANCEOF && LA103_0<=CURRENT_TIMESTAMP)||LA103_0==NEWKW||(LA103_0>=EVAL_AND_EXPR && LA103_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA103_0==EVENT_PROP_EXPR||LA103_0==CONCAT||(LA103_0>=LIB_FUNC_CHAIN && LA103_0<=DOT_EXPR)||LA103_0==ARRAY_EXPR||(LA103_0>=NOT_IN_SET && LA103_0<=NOT_REGEXP)||(LA103_0>=IN_RANGE && LA103_0<=SUBSELECT_EXPR)||(LA103_0>=EXISTS_SUBSELECT_EXPR && LA103_0<=NOT_IN_SUBSELECT_EXPR)||LA103_0==SUBSTITUTION||(LA103_0>=FIRST_AGGREG && LA103_0<=WINDOW_AGGREG)||(LA103_0>=INT_TYPE && LA103_0<=NULL_TYPE)||LA103_0==STAR||(LA103_0>=BOR && LA103_0<=PLUS)||(LA103_0>=BAND && LA103_0<=BXOR)||(LA103_0>=LT && LA103_0<=GE)||(LA103_0>=MINUS && LA103_0<=MOD)||(LA103_0>=EVAL_IS_GROUP_EXPR && LA103_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // EsperEPL2Ast.g:309:18: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_forExpr1744);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop103;
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
            m=(CommonTree)match(input,MATCH_RECOGNIZE,FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause1763); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:313:24: ( matchRecogPartitionBy )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==PARTITIONITEM) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // EsperEPL2Ast.g:313:24: matchRecogPartitionBy
                    {
                    pushFollow(FOLLOW_matchRecogPartitionBy_in_matchRecogClause1765);
                    matchRecogPartitionBy();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogMeasures_in_matchRecogClause1772);
            matchRecogMeasures();

            state._fsp--;

            // EsperEPL2Ast.g:315:4: ( ALL )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==ALL) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // EsperEPL2Ast.g:315:4: ALL
                    {
                    match(input,ALL,FOLLOW_ALL_in_matchRecogClause1778); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:316:4: ( matchRecogMatchesAfterSkip )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==MATCHREC_AFTER_SKIP) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // EsperEPL2Ast.g:316:4: matchRecogMatchesAfterSkip
                    {
                    pushFollow(FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause1784);
                    matchRecogMatchesAfterSkip();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogPattern_in_matchRecogClause1790);
            matchRecogPattern();

            state._fsp--;

            // EsperEPL2Ast.g:318:4: ( matchRecogMatchesInterval )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==MATCHREC_INTERVAL) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // EsperEPL2Ast.g:318:4: matchRecogMatchesInterval
                    {
                    pushFollow(FOLLOW_matchRecogMatchesInterval_in_matchRecogClause1796);
                    matchRecogMatchesInterval();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogDefine_in_matchRecogClause1802);
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
            p=(CommonTree)match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy1820); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:323:22: ( valueExpr )+
            int cnt108=0;
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=IN_SET && LA108_0<=REGEXP)||LA108_0==NOT_EXPR||(LA108_0>=SUM && LA108_0<=AVG)||(LA108_0>=COALESCE && LA108_0<=COUNT)||(LA108_0>=CASE && LA108_0<=CASE2)||(LA108_0>=PREVIOUS && LA108_0<=EXISTS)||(LA108_0>=INSTANCEOF && LA108_0<=CURRENT_TIMESTAMP)||LA108_0==NEWKW||(LA108_0>=EVAL_AND_EXPR && LA108_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA108_0==EVENT_PROP_EXPR||LA108_0==CONCAT||(LA108_0>=LIB_FUNC_CHAIN && LA108_0<=DOT_EXPR)||LA108_0==ARRAY_EXPR||(LA108_0>=NOT_IN_SET && LA108_0<=NOT_REGEXP)||(LA108_0>=IN_RANGE && LA108_0<=SUBSELECT_EXPR)||(LA108_0>=EXISTS_SUBSELECT_EXPR && LA108_0<=NOT_IN_SUBSELECT_EXPR)||LA108_0==SUBSTITUTION||(LA108_0>=FIRST_AGGREG && LA108_0<=WINDOW_AGGREG)||(LA108_0>=INT_TYPE && LA108_0<=NULL_TYPE)||LA108_0==STAR||(LA108_0>=BOR && LA108_0<=PLUS)||(LA108_0>=BAND && LA108_0<=BXOR)||(LA108_0>=LT && LA108_0<=GE)||(LA108_0>=MINUS && LA108_0<=MOD)||(LA108_0>=EVAL_IS_GROUP_EXPR && LA108_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // EsperEPL2Ast.g:323:22: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_matchRecogPartitionBy1822);
            	    valueExpr();

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
            match(input,MATCHREC_AFTER_SKIP,FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip1839); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1841); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1843); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1845); 
            if ( input.LA(1)==LAST||input.LA(1)==IDENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1853); 

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
            match(input,MATCHREC_INTERVAL,FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval1868); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesInterval1870); 
            pushFollow(FOLLOW_timePeriod_in_matchRecogMatchesInterval1872);
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
            m=(CommonTree)match(input,MATCHREC_MEASURES,FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures1888); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:335:26: ( matchRecogMeasureListElement )*
                loop109:
                do {
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==MATCHREC_MEASURE_ITEM) ) {
                        alt109=1;
                    }


                    switch (alt109) {
                	case 1 :
                	    // EsperEPL2Ast.g:335:26: matchRecogMeasureListElement
                	    {
                	    pushFollow(FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures1890);
                	    matchRecogMeasureListElement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop109;
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
            m=(CommonTree)match(input,MATCHREC_MEASURE_ITEM,FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement1907); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogMeasureListElement1909);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:339:40: ( IDENT )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==IDENT) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // EsperEPL2Ast.g:339:40: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_matchRecogMeasureListElement1911); 

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
            p=(CommonTree)match(input,MATCHREC_PATTERN,FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern1931); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:343:25: ( matchRecogPatternAlteration )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=MATCHREC_PATTERN_CONCAT && LA111_0<=MATCHREC_PATTERN_ALTER)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // EsperEPL2Ast.g:343:25: matchRecogPatternAlteration
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern1933);
            	    matchRecogPatternAlteration();

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
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==MATCHREC_PATTERN_CONCAT) ) {
                alt113=1;
            }
            else if ( (LA113_0==MATCHREC_PATTERN_ALTER) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // EsperEPL2Ast.g:347:4: matchRecogPatternConcat
                    {
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1948);
                    matchRecogPatternConcat();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:348:4: ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ )
                    {
                    o=(CommonTree)match(input,MATCHREC_PATTERN_ALTER,FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration1956); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1958);
                    matchRecogPatternConcat();

                    state._fsp--;

                    // EsperEPL2Ast.g:348:55: ( matchRecogPatternConcat )+
                    int cnt112=0;
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==MATCHREC_PATTERN_CONCAT) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:348:55: matchRecogPatternConcat
                    	    {
                    	    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1960);
                    	    matchRecogPatternConcat();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt112 >= 1 ) break loop112;
                                EarlyExitException eee =
                                    new EarlyExitException(112, input);
                                throw eee;
                        }
                        cnt112++;
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
            p=(CommonTree)match(input,MATCHREC_PATTERN_CONCAT,FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat1978); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:352:32: ( matchRecogPatternUnary )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==MATCHREC_PATTERN_ATOM||LA114_0==MATCHREC_PATTERN_NESTED) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // EsperEPL2Ast.g:352:32: matchRecogPatternUnary
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat1980);
            	    matchRecogPatternUnary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
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
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==MATCHREC_PATTERN_NESTED) ) {
                alt115=1;
            }
            else if ( (LA115_0==MATCHREC_PATTERN_ATOM) ) {
                alt115=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // EsperEPL2Ast.g:356:4: matchRecogPatternNested
                    {
                    pushFollow(FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary1995);
                    matchRecogPatternNested();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:357:4: matchRecogPatternAtom
                    {
                    pushFollow(FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary2000);
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
            p=(CommonTree)match(input,MATCHREC_PATTERN_NESTED,FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2015); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2017);
            matchRecogPatternAlteration();

            state._fsp--;

            // EsperEPL2Ast.g:361:60: ( PLUS | STAR | QUESTION )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==STAR||(LA116_0>=PLUS && LA116_0<=QUESTION)) ) {
                alt116=1;
            }
            switch (alt116) {
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
            p=(CommonTree)match(input,MATCHREC_PATTERN_ATOM,FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2048); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogPatternAtom2050); 
            // EsperEPL2Ast.g:365:36: ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==STAR||(LA118_0>=PLUS && LA118_0<=QUESTION)) ) {
                alt118=1;
            }
            switch (alt118) {
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
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==QUESTION) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // EsperEPL2Ast.g:365:63: QUESTION
                            {
                            match(input,QUESTION,FOLLOW_QUESTION_in_matchRecogPatternAtom2066); 

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
            p=(CommonTree)match(input,MATCHREC_DEFINE,FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2088); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:369:24: ( matchRecogDefineItem )+
            int cnt119=0;
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==MATCHREC_DEFINE_ITEM) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // EsperEPL2Ast.g:369:24: matchRecogDefineItem
            	    {
            	    pushFollow(FOLLOW_matchRecogDefineItem_in_matchRecogDefine2090);
            	    matchRecogDefineItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt119 >= 1 ) break loop119;
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
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
            d=(CommonTree)match(input,MATCHREC_DEFINE_ITEM,FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2107); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogDefineItem2109); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogDefineItem2111);
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
            pushFollow(FOLLOW_selectionListElement_in_selectionList2128);
            selectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:378:25: ( selectionListElement )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( ((LA120_0>=SELECTION_ELEMENT_EXPR && LA120_0<=SELECTION_STREAM)||LA120_0==WILDCARD_SELECT) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // EsperEPL2Ast.g:378:26: selectionListElement
            	    {
            	    pushFollow(FOLLOW_selectionListElement_in_selectionList2131);
            	    selectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop120;
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
            int alt123=3;
            switch ( input.LA(1) ) {
            case WILDCARD_SELECT:
                {
                alt123=1;
                }
                break;
            case SELECTION_ELEMENT_EXPR:
                {
                alt123=2;
                }
                break;
            case SELECTION_STREAM:
                {
                alt123=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // EsperEPL2Ast.g:382:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_selectionListElement2147); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:383:4: ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2157); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_selectionListElement2159);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:383:41: ( IDENT )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==IDENT) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // EsperEPL2Ast.g:383:42: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2162); 

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
                    s=(CommonTree)match(input,SELECTION_STREAM,FOLLOW_SELECTION_STREAM_in_selectionListElement2176); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2178); 
                    // EsperEPL2Ast.g:384:31: ( IDENT )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==IDENT) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // EsperEPL2Ast.g:384:32: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2181); 

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
            int alt128=4;
            switch ( input.LA(1) ) {
            case LEFT_OUTERJOIN_EXPR:
                {
                alt128=1;
                }
                break;
            case RIGHT_OUTERJOIN_EXPR:
                {
                alt128=2;
                }
                break;
            case FULL_OUTERJOIN_EXPR:
                {
                alt128=3;
                }
                break;
            case INNERJOIN_EXPR:
                {
                alt128=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // EsperEPL2Ast.g:388:4: ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tl=(CommonTree)match(input,LEFT_OUTERJOIN_EXPR,FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2203); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2205); 
                    // EsperEPL2Ast.g:388:32: ( outerJoinIdent )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==EVENT_PROP_EXPR) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // EsperEPL2Ast.g:388:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2207);
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
                    tr=(CommonTree)match(input,RIGHT_OUTERJOIN_EXPR,FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2220); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2222); 
                    // EsperEPL2Ast.g:389:33: ( outerJoinIdent )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==EVENT_PROP_EXPR) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // EsperEPL2Ast.g:389:33: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2224);
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
                    tf=(CommonTree)match(input,FULL_OUTERJOIN_EXPR,FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2237); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2239); 
                    // EsperEPL2Ast.g:390:32: ( outerJoinIdent )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==EVENT_PROP_EXPR) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // EsperEPL2Ast.g:390:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2241);
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
                    i=(CommonTree)match(input,INNERJOIN_EXPR,FOLLOW_INNERJOIN_EXPR_in_outerJoin2254); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2256); 
                    // EsperEPL2Ast.g:391:26: ( outerJoinIdent )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==EVENT_PROP_EXPR) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // EsperEPL2Ast.g:391:26: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2258);
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
            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2274);
            eventPropertyExpr(true);

            state._fsp--;

            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2277);
            eventPropertyExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:395:52: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==EVENT_PROP_EXPR) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // EsperEPL2Ast.g:395:53: eventPropertyExpr[true] eventPropertyExpr[true]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2281);
            	    eventPropertyExpr(true);

            	    state._fsp--;

            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2284);
            	    eventPropertyExpr(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop129;
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
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_streamExpression2301); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:399:20: ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression )
            int alt130=4;
            switch ( input.LA(1) ) {
            case EVENT_FILTER_EXPR:
                {
                alt130=1;
                }
                break;
            case PATTERN_INCL_EXPR:
                {
                alt130=2;
                }
                break;
            case DATABASE_JOIN_EXPR:
                {
                alt130=3;
                }
                break;
            case METHOD_JOIN_EXPR:
                {
                alt130=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // EsperEPL2Ast.g:399:21: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_streamExpression2304);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:399:45: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_streamExpression2309);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:399:74: databaseJoinExpression
                    {
                    pushFollow(FOLLOW_databaseJoinExpression_in_streamExpression2313);
                    databaseJoinExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:399:99: methodJoinExpression
                    {
                    pushFollow(FOLLOW_methodJoinExpression_in_streamExpression2317);
                    methodJoinExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:399:121: ( viewListExpr )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==VIEW_EXPR) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // EsperEPL2Ast.g:399:122: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_streamExpression2321);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:399:137: ( IDENT )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==IDENT) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // EsperEPL2Ast.g:399:138: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_streamExpression2326); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:399:146: ( UNIDIRECTIONAL )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==UNIDIRECTIONAL) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // EsperEPL2Ast.g:399:147: UNIDIRECTIONAL
                    {
                    match(input,UNIDIRECTIONAL,FOLLOW_UNIDIRECTIONAL_in_streamExpression2331); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:399:164: ( RETAINUNION | RETAININTERSECTION )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=RETAINUNION && LA134_0<=RETAININTERSECTION)) ) {
                alt134=1;
            }
            switch (alt134) {
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
            f=(CommonTree)match(input,EVENT_FILTER_EXPR,FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2360); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:403:27: ( IDENT )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==IDENT) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // EsperEPL2Ast.g:403:27: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_eventFilterExpr2362); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_eventFilterExpr2365); 
            // EsperEPL2Ast.g:403:46: ( propertyExpression )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // EsperEPL2Ast.g:403:46: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_eventFilterExpr2367);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:403:66: ( valueExpr )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( ((LA137_0>=IN_SET && LA137_0<=REGEXP)||LA137_0==NOT_EXPR||(LA137_0>=SUM && LA137_0<=AVG)||(LA137_0>=COALESCE && LA137_0<=COUNT)||(LA137_0>=CASE && LA137_0<=CASE2)||(LA137_0>=PREVIOUS && LA137_0<=EXISTS)||(LA137_0>=INSTANCEOF && LA137_0<=CURRENT_TIMESTAMP)||LA137_0==NEWKW||(LA137_0>=EVAL_AND_EXPR && LA137_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA137_0==EVENT_PROP_EXPR||LA137_0==CONCAT||(LA137_0>=LIB_FUNC_CHAIN && LA137_0<=DOT_EXPR)||LA137_0==ARRAY_EXPR||(LA137_0>=NOT_IN_SET && LA137_0<=NOT_REGEXP)||(LA137_0>=IN_RANGE && LA137_0<=SUBSELECT_EXPR)||(LA137_0>=EXISTS_SUBSELECT_EXPR && LA137_0<=NOT_IN_SUBSELECT_EXPR)||LA137_0==SUBSTITUTION||(LA137_0>=FIRST_AGGREG && LA137_0<=WINDOW_AGGREG)||(LA137_0>=INT_TYPE && LA137_0<=NULL_TYPE)||LA137_0==STAR||(LA137_0>=BOR && LA137_0<=PLUS)||(LA137_0>=BAND && LA137_0<=BXOR)||(LA137_0>=LT && LA137_0<=GE)||(LA137_0>=MINUS && LA137_0<=MOD)||(LA137_0>=EVAL_IS_GROUP_EXPR && LA137_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // EsperEPL2Ast.g:403:67: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_eventFilterExpr2371);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop137;
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
            match(input,EVENT_FILTER_PROPERTY_EXPR,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2391); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:407:34: ( propertyExpressionAtom )*
                loop138:
                do {
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==EVENT_FILTER_PROPERTY_EXPR_ATOM) ) {
                        alt138=1;
                    }


                    switch (alt138) {
                	case 1 :
                	    // EsperEPL2Ast.g:407:34: propertyExpressionAtom
                	    {
                	    pushFollow(FOLLOW_propertyExpressionAtom_in_propertyExpression2393);
                	    propertyExpressionAtom();

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
            a=(CommonTree)match(input,EVENT_FILTER_PROPERTY_EXPR_ATOM,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2412); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:411:41: ( ^( SELECT ( propertySelectionListElement )+ ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==SELECT) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // EsperEPL2Ast.g:411:42: ^( SELECT ( propertySelectionListElement )+ )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_propertyExpressionAtom2416); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:411:51: ( propertySelectionListElement )+
                    int cnt139=0;
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( ((LA139_0>=PROPERTY_SELECTION_ELEMENT_EXPR && LA139_0<=PROPERTY_WILDCARD_SELECT)) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:411:51: propertySelectionListElement
                    	    {
                    	    pushFollow(FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2418);
                    	    propertySelectionListElement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt139 >= 1 ) break loop139;
                                EarlyExitException eee =
                                    new EarlyExitException(139, input);
                                throw eee;
                        }
                        cnt139++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2424);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:411:94: ( ^( ATCHAR IDENT IDENT ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==ATCHAR) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // EsperEPL2Ast.g:411:95: ^( ATCHAR IDENT IDENT )
                    {
                    match(input,ATCHAR,FOLLOW_ATCHAR_in_propertyExpressionAtom2428); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2430); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2432); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:411:119: ( IDENT )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==IDENT) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // EsperEPL2Ast.g:411:119: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2437); 

                    }
                    break;

            }

            match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2441); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:411:139: ( valueExpr )?
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( ((LA143_0>=IN_SET && LA143_0<=REGEXP)||LA143_0==NOT_EXPR||(LA143_0>=SUM && LA143_0<=AVG)||(LA143_0>=COALESCE && LA143_0<=COUNT)||(LA143_0>=CASE && LA143_0<=CASE2)||(LA143_0>=PREVIOUS && LA143_0<=EXISTS)||(LA143_0>=INSTANCEOF && LA143_0<=CURRENT_TIMESTAMP)||LA143_0==NEWKW||(LA143_0>=EVAL_AND_EXPR && LA143_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA143_0==EVENT_PROP_EXPR||LA143_0==CONCAT||(LA143_0>=LIB_FUNC_CHAIN && LA143_0<=DOT_EXPR)||LA143_0==ARRAY_EXPR||(LA143_0>=NOT_IN_SET && LA143_0<=NOT_REGEXP)||(LA143_0>=IN_RANGE && LA143_0<=SUBSELECT_EXPR)||(LA143_0>=EXISTS_SUBSELECT_EXPR && LA143_0<=NOT_IN_SUBSELECT_EXPR)||LA143_0==SUBSTITUTION||(LA143_0>=FIRST_AGGREG && LA143_0<=WINDOW_AGGREG)||(LA143_0>=INT_TYPE && LA143_0<=NULL_TYPE)||LA143_0==STAR||(LA143_0>=BOR && LA143_0<=PLUS)||(LA143_0>=BAND && LA143_0<=BXOR)||(LA143_0>=LT && LA143_0<=GE)||(LA143_0>=MINUS && LA143_0<=MOD)||(LA143_0>=EVAL_IS_GROUP_EXPR && LA143_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt143=1;
                }
                switch (alt143) {
                    case 1 :
                        // EsperEPL2Ast.g:411:139: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2443);
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
            int alt146=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt146=1;
                }
                break;
            case PROPERTY_SELECTION_ELEMENT_EXPR:
                {
                alt146=2;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt146=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }

            switch (alt146) {
                case 1 :
                    // EsperEPL2Ast.g:415:4: w= PROPERTY_WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2463); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:416:4: ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,PROPERTY_SELECTION_ELEMENT_EXPR,FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2473); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_propertySelectionListElement2475);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:416:50: ( IDENT )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==IDENT) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // EsperEPL2Ast.g:416:51: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2478); 

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
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2492); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2494); 
                    // EsperEPL2Ast.g:417:40: ( IDENT )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==IDENT) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // EsperEPL2Ast.g:417:41: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2497); 

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
            p=(CommonTree)match(input,PATTERN_INCL_EXPR,FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2518); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_exprChoice_in_patternInclusionExpression2520);
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
            match(input,DATABASE_JOIN_EXPR,FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2537); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_databaseJoinExpression2539); 
            if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // EsperEPL2Ast.g:425:72: ( STRING_LITERAL | QUOTED_STRING_LITERAL )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( ((LA147_0>=STRING_LITERAL && LA147_0<=QUOTED_STRING_LITERAL)) ) {
                alt147=1;
            }
            switch (alt147) {
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
            match(input,METHOD_JOIN_EXPR,FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2570); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_methodJoinExpression2572); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_methodJoinExpression2574); 
            // EsperEPL2Ast.g:429:41: ( valueExpr )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( ((LA148_0>=IN_SET && LA148_0<=REGEXP)||LA148_0==NOT_EXPR||(LA148_0>=SUM && LA148_0<=AVG)||(LA148_0>=COALESCE && LA148_0<=COUNT)||(LA148_0>=CASE && LA148_0<=CASE2)||(LA148_0>=PREVIOUS && LA148_0<=EXISTS)||(LA148_0>=INSTANCEOF && LA148_0<=CURRENT_TIMESTAMP)||LA148_0==NEWKW||(LA148_0>=EVAL_AND_EXPR && LA148_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA148_0==EVENT_PROP_EXPR||LA148_0==CONCAT||(LA148_0>=LIB_FUNC_CHAIN && LA148_0<=DOT_EXPR)||LA148_0==ARRAY_EXPR||(LA148_0>=NOT_IN_SET && LA148_0<=NOT_REGEXP)||(LA148_0>=IN_RANGE && LA148_0<=SUBSELECT_EXPR)||(LA148_0>=EXISTS_SUBSELECT_EXPR && LA148_0<=NOT_IN_SUBSELECT_EXPR)||LA148_0==SUBSTITUTION||(LA148_0>=FIRST_AGGREG && LA148_0<=WINDOW_AGGREG)||(LA148_0>=INT_TYPE && LA148_0<=NULL_TYPE)||LA148_0==STAR||(LA148_0>=BOR && LA148_0<=PLUS)||(LA148_0>=BAND && LA148_0<=BXOR)||(LA148_0>=LT && LA148_0<=GE)||(LA148_0>=MINUS && LA148_0<=MOD)||(LA148_0>=EVAL_IS_GROUP_EXPR && LA148_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // EsperEPL2Ast.g:429:42: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_methodJoinExpression2577);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop148;
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
            pushFollow(FOLLOW_viewExpr_in_viewListExpr2591);
            viewExpr();

            state._fsp--;

            // EsperEPL2Ast.g:433:13: ( viewExpr )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==VIEW_EXPR) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // EsperEPL2Ast.g:433:14: viewExpr
            	    {
            	    pushFollow(FOLLOW_viewExpr_in_viewListExpr2594);
            	    viewExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop149;
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
            n=(CommonTree)match(input,VIEW_EXPR,FOLLOW_VIEW_EXPR_in_viewExpr2611); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2613); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2615); 
            // EsperEPL2Ast.g:437:30: ( valueExprWithTime )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( ((LA150_0>=IN_SET && LA150_0<=REGEXP)||LA150_0==NOT_EXPR||(LA150_0>=SUM && LA150_0<=AVG)||(LA150_0>=COALESCE && LA150_0<=COUNT)||(LA150_0>=CASE && LA150_0<=CASE2)||LA150_0==LAST||(LA150_0>=PREVIOUS && LA150_0<=EXISTS)||(LA150_0>=LW && LA150_0<=CURRENT_TIMESTAMP)||LA150_0==NEWKW||(LA150_0>=NUMERIC_PARAM_RANGE && LA150_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA150_0>=EVAL_AND_EXPR && LA150_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA150_0==EVENT_PROP_EXPR||LA150_0==CONCAT||(LA150_0>=LIB_FUNC_CHAIN && LA150_0<=DOT_EXPR)||(LA150_0>=TIME_PERIOD && LA150_0<=ARRAY_EXPR)||(LA150_0>=NOT_IN_SET && LA150_0<=NOT_REGEXP)||(LA150_0>=IN_RANGE && LA150_0<=SUBSELECT_EXPR)||(LA150_0>=EXISTS_SUBSELECT_EXPR && LA150_0<=NOT_IN_SUBSELECT_EXPR)||(LA150_0>=LAST_OPERATOR && LA150_0<=SUBSTITUTION)||LA150_0==NUMBERSETSTAR||(LA150_0>=FIRST_AGGREG && LA150_0<=WINDOW_AGGREG)||(LA150_0>=INT_TYPE && LA150_0<=NULL_TYPE)||LA150_0==STAR||(LA150_0>=BOR && LA150_0<=PLUS)||(LA150_0>=BAND && LA150_0<=BXOR)||(LA150_0>=LT && LA150_0<=GE)||(LA150_0>=MINUS && LA150_0<=MOD)||(LA150_0>=EVAL_IS_GROUP_EXPR && LA150_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // EsperEPL2Ast.g:437:31: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_viewExpr2618);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop150;
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
            n=(CommonTree)match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_whereClause2640); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_whereClause2642);
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
            g=(CommonTree)match(input,GROUP_BY_EXPR,FOLLOW_GROUP_BY_EXPR_in_groupByClause2660); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_groupByClause2662);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:445:32: ( valueExpr )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( ((LA151_0>=IN_SET && LA151_0<=REGEXP)||LA151_0==NOT_EXPR||(LA151_0>=SUM && LA151_0<=AVG)||(LA151_0>=COALESCE && LA151_0<=COUNT)||(LA151_0>=CASE && LA151_0<=CASE2)||(LA151_0>=PREVIOUS && LA151_0<=EXISTS)||(LA151_0>=INSTANCEOF && LA151_0<=CURRENT_TIMESTAMP)||LA151_0==NEWKW||(LA151_0>=EVAL_AND_EXPR && LA151_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA151_0==EVENT_PROP_EXPR||LA151_0==CONCAT||(LA151_0>=LIB_FUNC_CHAIN && LA151_0<=DOT_EXPR)||LA151_0==ARRAY_EXPR||(LA151_0>=NOT_IN_SET && LA151_0<=NOT_REGEXP)||(LA151_0>=IN_RANGE && LA151_0<=SUBSELECT_EXPR)||(LA151_0>=EXISTS_SUBSELECT_EXPR && LA151_0<=NOT_IN_SUBSELECT_EXPR)||LA151_0==SUBSTITUTION||(LA151_0>=FIRST_AGGREG && LA151_0<=WINDOW_AGGREG)||(LA151_0>=INT_TYPE && LA151_0<=NULL_TYPE)||LA151_0==STAR||(LA151_0>=BOR && LA151_0<=PLUS)||(LA151_0>=BAND && LA151_0<=BXOR)||(LA151_0>=LT && LA151_0<=GE)||(LA151_0>=MINUS && LA151_0<=MOD)||(LA151_0>=EVAL_IS_GROUP_EXPR && LA151_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // EsperEPL2Ast.g:445:33: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_groupByClause2665);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop151;
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
            match(input,ORDER_BY_EXPR,FOLLOW_ORDER_BY_EXPR_in_orderByClause2683); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_orderByElement_in_orderByClause2685);
            orderByElement();

            state._fsp--;

            // EsperEPL2Ast.g:449:35: ( orderByElement )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==ORDER_ELEMENT_EXPR) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // EsperEPL2Ast.g:449:36: orderByElement
            	    {
            	    pushFollow(FOLLOW_orderByElement_in_orderByClause2688);
            	    orderByElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop152;
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
            e=(CommonTree)match(input,ORDER_ELEMENT_EXPR,FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement2708); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_orderByElement2710);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:453:38: ( ASC | DESC )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=ASC && LA153_0<=DESC)) ) {
                alt153=1;
            }
            switch (alt153) {
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
            n=(CommonTree)match(input,HAVING_EXPR,FOLLOW_HAVING_EXPR_in_havingClause2735); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_havingClause2737);
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
            int alt173=6;
            switch ( input.LA(1) ) {
            case EVENT_LIMIT_EXPR:
                {
                alt173=1;
                }
                break;
            case TIMEPERIOD_LIMIT_EXPR:
                {
                alt173=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR:
                {
                alt173=3;
                }
                break;
            case WHEN_LIMIT_EXPR:
                {
                alt173=4;
                }
                break;
            case TERM_LIMIT_EXPR:
                {
                alt173=5;
                }
                break;
            case AFTER_LIMIT_EXPR:
                {
                alt173=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 173, 0, input);

                throw nvae;
            }

            switch (alt173) {
                case 1 :
                    // EsperEPL2Ast.g:461:4: ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    e=(CommonTree)match(input,EVENT_LIMIT_EXPR,FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr2755); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:461:25: ( ALL | FIRST | LAST | SNAPSHOT )?
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

                    // EsperEPL2Ast.g:461:52: ( number | IDENT )
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( ((LA155_0>=INT_TYPE && LA155_0<=DOUBLE_TYPE)) ) {
                        alt155=1;
                    }
                    else if ( (LA155_0==IDENT) ) {
                        alt155=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 155, 0, input);

                        throw nvae;
                    }
                    switch (alt155) {
                        case 1 :
                            // EsperEPL2Ast.g:461:53: number
                            {
                            pushFollow(FOLLOW_number_in_outputLimitExpr2769);
                            number();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:461:60: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_outputLimitExpr2771); 

                            }
                            break;

                    }

                    // EsperEPL2Ast.g:461:67: ( outputLimitAfter )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==AFTER) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // EsperEPL2Ast.g:461:67: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2774);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:461:85: ( outputLimitAndTerm )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==TERMINATED) ) {
                        alt157=1;
                    }
                    switch (alt157) {
                        case 1 :
                            // EsperEPL2Ast.g:461:85: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2777);
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
                    tp=(CommonTree)match(input,TIMEPERIOD_LIMIT_EXPR,FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr2794); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:462:34: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==ALL||(LA158_0>=FIRST && LA158_0<=LAST)||LA158_0==SNAPSHOT) ) {
                        alt158=1;
                    }
                    switch (alt158) {
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

                    pushFollow(FOLLOW_timePeriod_in_outputLimitExpr2807);
                    timePeriod();

                    state._fsp--;

                    // EsperEPL2Ast.g:462:72: ( outputLimitAfter )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==AFTER) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // EsperEPL2Ast.g:462:72: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2809);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:462:90: ( outputLimitAndTerm )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==TERMINATED) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // EsperEPL2Ast.g:462:90: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2812);
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
                    cron=(CommonTree)match(input,CRONTAB_LIMIT_EXPR,FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr2828); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:463:33: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==ALL||(LA161_0>=FIRST && LA161_0<=LAST)||LA161_0==SNAPSHOT) ) {
                        alt161=1;
                    }
                    switch (alt161) {
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

                    pushFollow(FOLLOW_crontabLimitParameterSet_in_outputLimitExpr2841);
                    crontabLimitParameterSet();

                    state._fsp--;

                    // EsperEPL2Ast.g:463:85: ( outputLimitAfter )?
                    int alt162=2;
                    int LA162_0 = input.LA(1);

                    if ( (LA162_0==AFTER) ) {
                        alt162=1;
                    }
                    switch (alt162) {
                        case 1 :
                            // EsperEPL2Ast.g:463:85: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2843);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:463:103: ( outputLimitAndTerm )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==TERMINATED) ) {
                        alt163=1;
                    }
                    switch (alt163) {
                        case 1 :
                            // EsperEPL2Ast.g:463:103: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2846);
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
                    when=(CommonTree)match(input,WHEN_LIMIT_EXPR,FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr2862); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:464:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==ALL||(LA164_0>=FIRST && LA164_0<=LAST)||LA164_0==SNAPSHOT) ) {
                        alt164=1;
                    }
                    switch (alt164) {
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

                    pushFollow(FOLLOW_valueExpr_in_outputLimitExpr2875);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:464:67: ( onSetExpr )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==ON_SET_EXPR) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // EsperEPL2Ast.g:464:67: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr2877);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:464:78: ( outputLimitAfter )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==AFTER) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // EsperEPL2Ast.g:464:78: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2880);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:464:96: ( outputLimitAndTerm )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==TERMINATED) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // EsperEPL2Ast.g:464:96: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2883);
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
                    term=(CommonTree)match(input,TERM_LIMIT_EXPR,FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr2899); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:465:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==ALL||(LA168_0>=FIRST && LA168_0<=LAST)||LA168_0==SNAPSHOT) ) {
                        alt168=1;
                    }
                    switch (alt168) {
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

                    pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2912);
                    outputLimitAndTerm();

                    state._fsp--;

                    // EsperEPL2Ast.g:465:76: ( onSetExpr )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==ON_SET_EXPR) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // EsperEPL2Ast.g:465:76: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr2914);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:465:87: ( outputLimitAfter )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==AFTER) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // EsperEPL2Ast.g:465:87: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2917);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:465:105: ( outputLimitAndTerm )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==TERMINATED) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // EsperEPL2Ast.g:465:105: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2920);
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
                    after=(CommonTree)match(input,AFTER_LIMIT_EXPR,FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr2933); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr2935);
                    outputLimitAfter();

                    state._fsp--;

                    // EsperEPL2Ast.g:466:46: ( outputLimitAndTerm )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==TERMINATED) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // EsperEPL2Ast.g:466:46: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr2937);
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
            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitAndTerm2954); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:470:18: ( valueExpr )?
                int alt174=2;
                int LA174_0 = input.LA(1);

                if ( ((LA174_0>=IN_SET && LA174_0<=REGEXP)||LA174_0==NOT_EXPR||(LA174_0>=SUM && LA174_0<=AVG)||(LA174_0>=COALESCE && LA174_0<=COUNT)||(LA174_0>=CASE && LA174_0<=CASE2)||(LA174_0>=PREVIOUS && LA174_0<=EXISTS)||(LA174_0>=INSTANCEOF && LA174_0<=CURRENT_TIMESTAMP)||LA174_0==NEWKW||(LA174_0>=EVAL_AND_EXPR && LA174_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA174_0==EVENT_PROP_EXPR||LA174_0==CONCAT||(LA174_0>=LIB_FUNC_CHAIN && LA174_0<=DOT_EXPR)||LA174_0==ARRAY_EXPR||(LA174_0>=NOT_IN_SET && LA174_0<=NOT_REGEXP)||(LA174_0>=IN_RANGE && LA174_0<=SUBSELECT_EXPR)||(LA174_0>=EXISTS_SUBSELECT_EXPR && LA174_0<=NOT_IN_SUBSELECT_EXPR)||LA174_0==SUBSTITUTION||(LA174_0>=FIRST_AGGREG && LA174_0<=WINDOW_AGGREG)||(LA174_0>=INT_TYPE && LA174_0<=NULL_TYPE)||LA174_0==STAR||(LA174_0>=BOR && LA174_0<=PLUS)||(LA174_0>=BAND && LA174_0<=BXOR)||(LA174_0>=LT && LA174_0<=GE)||(LA174_0>=MINUS && LA174_0<=MOD)||(LA174_0>=EVAL_IS_GROUP_EXPR && LA174_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt174=1;
                }
                switch (alt174) {
                    case 1 :
                        // EsperEPL2Ast.g:470:18: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_outputLimitAndTerm2956);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:470:29: ( onSetExpr )?
                int alt175=2;
                int LA175_0 = input.LA(1);

                if ( (LA175_0==ON_SET_EXPR) ) {
                    alt175=1;
                }
                switch (alt175) {
                    case 1 :
                        // EsperEPL2Ast.g:470:29: onSetExpr
                        {
                        pushFollow(FOLLOW_onSetExpr_in_outputLimitAndTerm2959);
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
            match(input,AFTER,FOLLOW_AFTER_in_outputLimitAfter2973); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:474:12: ( timePeriod )?
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( (LA176_0==TIME_PERIOD) ) {
                    alt176=1;
                }
                switch (alt176) {
                    case 1 :
                        // EsperEPL2Ast.g:474:12: timePeriod
                        {
                        pushFollow(FOLLOW_timePeriod_in_outputLimitAfter2975);
                        timePeriod();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:474:24: ( number )?
                int alt177=2;
                int LA177_0 = input.LA(1);

                if ( ((LA177_0>=INT_TYPE && LA177_0<=DOUBLE_TYPE)) ) {
                    alt177=1;
                }
                switch (alt177) {
                    case 1 :
                        // EsperEPL2Ast.g:474:24: number
                        {
                        pushFollow(FOLLOW_number_in_outputLimitAfter2978);
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
            e=(CommonTree)match(input,ROW_LIMIT_EXPR,FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause2994); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:478:23: ( number | IDENT )
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( ((LA178_0>=INT_TYPE && LA178_0<=DOUBLE_TYPE)) ) {
                alt178=1;
            }
            else if ( (LA178_0==IDENT) ) {
                alt178=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 178, 0, input);

                throw nvae;
            }
            switch (alt178) {
                case 1 :
                    // EsperEPL2Ast.g:478:24: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause2997);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:478:31: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause2999); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:478:38: ( number | IDENT )?
            int alt179=3;
            int LA179_0 = input.LA(1);

            if ( ((LA179_0>=INT_TYPE && LA179_0<=DOUBLE_TYPE)) ) {
                alt179=1;
            }
            else if ( (LA179_0==IDENT) ) {
                alt179=2;
            }
            switch (alt179) {
                case 1 :
                    // EsperEPL2Ast.g:478:39: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause3003);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:478:46: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause3005); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:478:54: ( COMMA )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==COMMA) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // EsperEPL2Ast.g:478:54: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_rowLimitClause3009); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:478:61: ( OFFSET )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==OFFSET) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // EsperEPL2Ast.g:478:61: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_rowLimitClause3012); 

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
            match(input,CRONTAB_LIMIT_EXPR_PARAM,FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3030); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3032);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3034);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3036);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3038);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3040);
            valueExprWithTime();

            state._fsp--;

            // EsperEPL2Ast.g:482:121: ( valueExprWithTime )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( ((LA182_0>=IN_SET && LA182_0<=REGEXP)||LA182_0==NOT_EXPR||(LA182_0>=SUM && LA182_0<=AVG)||(LA182_0>=COALESCE && LA182_0<=COUNT)||(LA182_0>=CASE && LA182_0<=CASE2)||LA182_0==LAST||(LA182_0>=PREVIOUS && LA182_0<=EXISTS)||(LA182_0>=LW && LA182_0<=CURRENT_TIMESTAMP)||LA182_0==NEWKW||(LA182_0>=NUMERIC_PARAM_RANGE && LA182_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA182_0>=EVAL_AND_EXPR && LA182_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA182_0==EVENT_PROP_EXPR||LA182_0==CONCAT||(LA182_0>=LIB_FUNC_CHAIN && LA182_0<=DOT_EXPR)||(LA182_0>=TIME_PERIOD && LA182_0<=ARRAY_EXPR)||(LA182_0>=NOT_IN_SET && LA182_0<=NOT_REGEXP)||(LA182_0>=IN_RANGE && LA182_0<=SUBSELECT_EXPR)||(LA182_0>=EXISTS_SUBSELECT_EXPR && LA182_0<=NOT_IN_SUBSELECT_EXPR)||(LA182_0>=LAST_OPERATOR && LA182_0<=SUBSTITUTION)||LA182_0==NUMBERSETSTAR||(LA182_0>=FIRST_AGGREG && LA182_0<=WINDOW_AGGREG)||(LA182_0>=INT_TYPE && LA182_0<=NULL_TYPE)||LA182_0==STAR||(LA182_0>=BOR && LA182_0<=PLUS)||(LA182_0>=BAND && LA182_0<=BXOR)||(LA182_0>=LT && LA182_0<=GE)||(LA182_0>=MINUS && LA182_0<=MOD)||(LA182_0>=EVAL_IS_GROUP_EXPR && LA182_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // EsperEPL2Ast.g:482:121: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3042);
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
            int alt183=4;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt183=1;
                }
                break;
            case GT:
                {
                alt183=2;
                }
                break;
            case LE:
                {
                alt183=3;
                }
                break;
            case GE:
                {
                alt183=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;
            }

            switch (alt183) {
                case 1 :
                    // EsperEPL2Ast.g:486:5: ^(n= LT relationalExprValue )
                    {
                    n=(CommonTree)match(input,LT,FOLLOW_LT_in_relationalExpr3059); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3061);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:487:5: ^(n= GT relationalExprValue )
                    {
                    n=(CommonTree)match(input,GT,FOLLOW_GT_in_relationalExpr3074); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3076);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:488:5: ^(n= LE relationalExprValue )
                    {
                    n=(CommonTree)match(input,LE,FOLLOW_LE_in_relationalExpr3089); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3091);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:489:4: ^(n= GE relationalExprValue )
                    {
                    n=(CommonTree)match(input,GE,FOLLOW_GE_in_relationalExpr3103); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3105);
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
            pushFollow(FOLLOW_valueExpr_in_relationalExprValue3127);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:495:6: ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( ((LA186_0>=IN_SET && LA186_0<=REGEXP)||LA186_0==NOT_EXPR||(LA186_0>=SUM && LA186_0<=AVG)||(LA186_0>=COALESCE && LA186_0<=COUNT)||(LA186_0>=CASE && LA186_0<=CASE2)||(LA186_0>=PREVIOUS && LA186_0<=EXISTS)||(LA186_0>=INSTANCEOF && LA186_0<=CURRENT_TIMESTAMP)||LA186_0==NEWKW||(LA186_0>=EVAL_AND_EXPR && LA186_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA186_0==EVENT_PROP_EXPR||LA186_0==CONCAT||(LA186_0>=LIB_FUNC_CHAIN && LA186_0<=DOT_EXPR)||LA186_0==ARRAY_EXPR||(LA186_0>=NOT_IN_SET && LA186_0<=NOT_REGEXP)||(LA186_0>=IN_RANGE && LA186_0<=SUBSELECT_EXPR)||(LA186_0>=EXISTS_SUBSELECT_EXPR && LA186_0<=NOT_IN_SUBSELECT_EXPR)||LA186_0==SUBSTITUTION||(LA186_0>=FIRST_AGGREG && LA186_0<=WINDOW_AGGREG)||(LA186_0>=INT_TYPE && LA186_0<=NULL_TYPE)||LA186_0==STAR||(LA186_0>=BOR && LA186_0<=PLUS)||(LA186_0>=BAND && LA186_0<=BXOR)||(LA186_0>=LT && LA186_0<=GE)||(LA186_0>=MINUS && LA186_0<=MOD)||(LA186_0>=EVAL_IS_GROUP_EXPR && LA186_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt186=1;
            }
            else if ( ((LA186_0>=ALL && LA186_0<=SOME)) ) {
                alt186=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 186, 0, input);

                throw nvae;
            }
            switch (alt186) {
                case 1 :
                    // EsperEPL2Ast.g:495:8: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3137);
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
                    int alt185=2;
                    int LA185_0 = input.LA(1);

                    if ( (LA185_0==UP||(LA185_0>=IN_SET && LA185_0<=REGEXP)||LA185_0==NOT_EXPR||(LA185_0>=SUM && LA185_0<=AVG)||(LA185_0>=COALESCE && LA185_0<=COUNT)||(LA185_0>=CASE && LA185_0<=CASE2)||(LA185_0>=PREVIOUS && LA185_0<=EXISTS)||(LA185_0>=INSTANCEOF && LA185_0<=CURRENT_TIMESTAMP)||LA185_0==NEWKW||(LA185_0>=EVAL_AND_EXPR && LA185_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA185_0==EVENT_PROP_EXPR||LA185_0==CONCAT||(LA185_0>=LIB_FUNC_CHAIN && LA185_0<=DOT_EXPR)||LA185_0==ARRAY_EXPR||(LA185_0>=NOT_IN_SET && LA185_0<=NOT_REGEXP)||(LA185_0>=IN_RANGE && LA185_0<=SUBSELECT_EXPR)||(LA185_0>=EXISTS_SUBSELECT_EXPR && LA185_0<=NOT_IN_SUBSELECT_EXPR)||LA185_0==SUBSTITUTION||(LA185_0>=FIRST_AGGREG && LA185_0<=WINDOW_AGGREG)||(LA185_0>=INT_TYPE && LA185_0<=NULL_TYPE)||LA185_0==STAR||(LA185_0>=BOR && LA185_0<=PLUS)||(LA185_0>=BAND && LA185_0<=BXOR)||(LA185_0>=LT && LA185_0<=GE)||(LA185_0>=MINUS && LA185_0<=MOD)||(LA185_0>=EVAL_IS_GROUP_EXPR && LA185_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt185=1;
                    }
                    else if ( (LA185_0==SUBSELECT_GROUP_EXPR) ) {
                        alt185=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 185, 0, input);

                        throw nvae;
                    }
                    switch (alt185) {
                        case 1 :
                            // EsperEPL2Ast.g:497:22: ( valueExpr )*
                            {
                            // EsperEPL2Ast.g:497:22: ( valueExpr )*
                            loop184:
                            do {
                                int alt184=2;
                                int LA184_0 = input.LA(1);

                                if ( ((LA184_0>=IN_SET && LA184_0<=REGEXP)||LA184_0==NOT_EXPR||(LA184_0>=SUM && LA184_0<=AVG)||(LA184_0>=COALESCE && LA184_0<=COUNT)||(LA184_0>=CASE && LA184_0<=CASE2)||(LA184_0>=PREVIOUS && LA184_0<=EXISTS)||(LA184_0>=INSTANCEOF && LA184_0<=CURRENT_TIMESTAMP)||LA184_0==NEWKW||(LA184_0>=EVAL_AND_EXPR && LA184_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA184_0==EVENT_PROP_EXPR||LA184_0==CONCAT||(LA184_0>=LIB_FUNC_CHAIN && LA184_0<=DOT_EXPR)||LA184_0==ARRAY_EXPR||(LA184_0>=NOT_IN_SET && LA184_0<=NOT_REGEXP)||(LA184_0>=IN_RANGE && LA184_0<=SUBSELECT_EXPR)||(LA184_0>=EXISTS_SUBSELECT_EXPR && LA184_0<=NOT_IN_SUBSELECT_EXPR)||LA184_0==SUBSTITUTION||(LA184_0>=FIRST_AGGREG && LA184_0<=WINDOW_AGGREG)||(LA184_0>=INT_TYPE && LA184_0<=NULL_TYPE)||LA184_0==STAR||(LA184_0>=BOR && LA184_0<=PLUS)||(LA184_0>=BAND && LA184_0<=BXOR)||(LA184_0>=LT && LA184_0<=GE)||(LA184_0>=MINUS && LA184_0<=MOD)||(LA184_0>=EVAL_IS_GROUP_EXPR && LA184_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt184=1;
                                }


                                switch (alt184) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:497:22: valueExpr
                            	    {
                            	    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3161);
                            	    valueExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop184;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:497:35: subSelectGroupExpr
                            {
                            pushFollow(FOLLOW_subSelectGroupExpr_in_relationalExprValue3166);
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
            int alt189=12;
            switch ( input.LA(1) ) {
            case EVAL_OR_EXPR:
                {
                alt189=1;
                }
                break;
            case EVAL_AND_EXPR:
                {
                alt189=2;
                }
                break;
            case EVAL_EQUALS_EXPR:
                {
                alt189=3;
                }
                break;
            case EVAL_IS_EXPR:
                {
                alt189=4;
                }
                break;
            case EVAL_NOTEQUALS_EXPR:
                {
                alt189=5;
                }
                break;
            case EVAL_ISNOT_EXPR:
                {
                alt189=6;
                }
                break;
            case EVAL_EQUALS_GROUP_EXPR:
                {
                alt189=7;
                }
                break;
            case EVAL_IS_GROUP_EXPR:
                {
                alt189=8;
                }
                break;
            case EVAL_NOTEQUALS_GROUP_EXPR:
                {
                alt189=9;
                }
                break;
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt189=10;
                }
                break;
            case NOT_EXPR:
                {
                alt189=11;
                }
                break;
            case LT:
            case GT:
            case LE:
            case GE:
                {
                alt189=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;
            }

            switch (alt189) {
                case 1 :
                    // EsperEPL2Ast.g:503:4: ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    jo=(CommonTree)match(input,EVAL_OR_EXPR,FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3192); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3194);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3196);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:503:42: ( valueExpr )*
                    loop187:
                    do {
                        int alt187=2;
                        int LA187_0 = input.LA(1);

                        if ( ((LA187_0>=IN_SET && LA187_0<=REGEXP)||LA187_0==NOT_EXPR||(LA187_0>=SUM && LA187_0<=AVG)||(LA187_0>=COALESCE && LA187_0<=COUNT)||(LA187_0>=CASE && LA187_0<=CASE2)||(LA187_0>=PREVIOUS && LA187_0<=EXISTS)||(LA187_0>=INSTANCEOF && LA187_0<=CURRENT_TIMESTAMP)||LA187_0==NEWKW||(LA187_0>=EVAL_AND_EXPR && LA187_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA187_0==EVENT_PROP_EXPR||LA187_0==CONCAT||(LA187_0>=LIB_FUNC_CHAIN && LA187_0<=DOT_EXPR)||LA187_0==ARRAY_EXPR||(LA187_0>=NOT_IN_SET && LA187_0<=NOT_REGEXP)||(LA187_0>=IN_RANGE && LA187_0<=SUBSELECT_EXPR)||(LA187_0>=EXISTS_SUBSELECT_EXPR && LA187_0<=NOT_IN_SUBSELECT_EXPR)||LA187_0==SUBSTITUTION||(LA187_0>=FIRST_AGGREG && LA187_0<=WINDOW_AGGREG)||(LA187_0>=INT_TYPE && LA187_0<=NULL_TYPE)||LA187_0==STAR||(LA187_0>=BOR && LA187_0<=PLUS)||(LA187_0>=BAND && LA187_0<=BXOR)||(LA187_0>=LT && LA187_0<=GE)||(LA187_0>=MINUS && LA187_0<=MOD)||(LA187_0>=EVAL_IS_GROUP_EXPR && LA187_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt187=1;
                        }


                        switch (alt187) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:503:43: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3199);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop187;
                        }
                    } while (true);

                     leaveNode(jo); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:504:4: ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    ja=(CommonTree)match(input,EVAL_AND_EXPR,FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3213); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3215);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3217);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:504:43: ( valueExpr )*
                    loop188:
                    do {
                        int alt188=2;
                        int LA188_0 = input.LA(1);

                        if ( ((LA188_0>=IN_SET && LA188_0<=REGEXP)||LA188_0==NOT_EXPR||(LA188_0>=SUM && LA188_0<=AVG)||(LA188_0>=COALESCE && LA188_0<=COUNT)||(LA188_0>=CASE && LA188_0<=CASE2)||(LA188_0>=PREVIOUS && LA188_0<=EXISTS)||(LA188_0>=INSTANCEOF && LA188_0<=CURRENT_TIMESTAMP)||LA188_0==NEWKW||(LA188_0>=EVAL_AND_EXPR && LA188_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA188_0==EVENT_PROP_EXPR||LA188_0==CONCAT||(LA188_0>=LIB_FUNC_CHAIN && LA188_0<=DOT_EXPR)||LA188_0==ARRAY_EXPR||(LA188_0>=NOT_IN_SET && LA188_0<=NOT_REGEXP)||(LA188_0>=IN_RANGE && LA188_0<=SUBSELECT_EXPR)||(LA188_0>=EXISTS_SUBSELECT_EXPR && LA188_0<=NOT_IN_SUBSELECT_EXPR)||LA188_0==SUBSTITUTION||(LA188_0>=FIRST_AGGREG && LA188_0<=WINDOW_AGGREG)||(LA188_0>=INT_TYPE && LA188_0<=NULL_TYPE)||LA188_0==STAR||(LA188_0>=BOR && LA188_0<=PLUS)||(LA188_0>=BAND && LA188_0<=BXOR)||(LA188_0>=LT && LA188_0<=GE)||(LA188_0>=MINUS && LA188_0<=MOD)||(LA188_0>=EVAL_IS_GROUP_EXPR && LA188_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt188=1;
                        }


                        switch (alt188) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:504:44: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3220);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop188;
                        }
                    } while (true);

                     leaveNode(ja); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:505:4: ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr )
                    {
                    je=(CommonTree)match(input,EVAL_EQUALS_EXPR,FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3234); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3236);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3238);
                    valueExpr();

                    state._fsp--;

                     leaveNode(je); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:506:4: ^(ji= EVAL_IS_EXPR valueExpr valueExpr )
                    {
                    ji=(CommonTree)match(input,EVAL_IS_EXPR,FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3250); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3252);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3254);
                    valueExpr();

                    state._fsp--;

                     leaveNode(ji); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:507:4: ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr )
                    {
                    jne=(CommonTree)match(input,EVAL_NOTEQUALS_EXPR,FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3268);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3270);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:508:4: ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr )
                    {
                    jis=(CommonTree)match(input,EVAL_ISNOT_EXPR,FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3282); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3284);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3286);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jis); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:509:4: ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jge=(CommonTree)match(input,EVAL_EQUALS_GROUP_EXPR,FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3298); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3300);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jge); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:510:4: ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery )
                    {
                    jgi=(CommonTree)match(input,EVAL_IS_GROUP_EXPR,FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3312); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3314);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgi); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:511:4: ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jgne=(CommonTree)match(input,EVAL_NOTEQUALS_GROUP_EXPR,FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3326); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3328);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:512:4: ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery )
                    {
                    jgni=(CommonTree)match(input,EVAL_ISNOT_GROUP_EXPR,FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3340); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3342);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgni); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:513:4: ^(n= NOT_EXPR valueExpr )
                    {
                    n=(CommonTree)match(input,NOT_EXPR,FOLLOW_NOT_EXPR_in_evalExprChoice3354); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3356);
                    valueExpr();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:514:4: r= relationalExpr
                    {
                    pushFollow(FOLLOW_relationalExpr_in_evalExprChoice3367);
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
            pushFollow(FOLLOW_valueExpr_in_equalsSubquery3378);
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
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==UP||(LA191_0>=IN_SET && LA191_0<=REGEXP)||LA191_0==NOT_EXPR||(LA191_0>=SUM && LA191_0<=AVG)||(LA191_0>=COALESCE && LA191_0<=COUNT)||(LA191_0>=CASE && LA191_0<=CASE2)||(LA191_0>=PREVIOUS && LA191_0<=EXISTS)||(LA191_0>=INSTANCEOF && LA191_0<=CURRENT_TIMESTAMP)||LA191_0==NEWKW||(LA191_0>=EVAL_AND_EXPR && LA191_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA191_0==EVENT_PROP_EXPR||LA191_0==CONCAT||(LA191_0>=LIB_FUNC_CHAIN && LA191_0<=DOT_EXPR)||LA191_0==ARRAY_EXPR||(LA191_0>=NOT_IN_SET && LA191_0<=NOT_REGEXP)||(LA191_0>=IN_RANGE && LA191_0<=SUBSELECT_EXPR)||(LA191_0>=EXISTS_SUBSELECT_EXPR && LA191_0<=NOT_IN_SUBSELECT_EXPR)||LA191_0==SUBSTITUTION||(LA191_0>=FIRST_AGGREG && LA191_0<=WINDOW_AGGREG)||(LA191_0>=INT_TYPE && LA191_0<=NULL_TYPE)||LA191_0==STAR||(LA191_0>=BOR && LA191_0<=PLUS)||(LA191_0>=BAND && LA191_0<=BXOR)||(LA191_0>=LT && LA191_0<=GE)||(LA191_0>=MINUS && LA191_0<=MOD)||(LA191_0>=EVAL_IS_GROUP_EXPR && LA191_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt191=1;
            }
            else if ( (LA191_0==SUBSELECT_GROUP_EXPR) ) {
                alt191=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 191, 0, input);

                throw nvae;
            }
            switch (alt191) {
                case 1 :
                    // EsperEPL2Ast.g:518:30: ( valueExpr )*
                    {
                    // EsperEPL2Ast.g:518:30: ( valueExpr )*
                    loop190:
                    do {
                        int alt190=2;
                        int LA190_0 = input.LA(1);

                        if ( ((LA190_0>=IN_SET && LA190_0<=REGEXP)||LA190_0==NOT_EXPR||(LA190_0>=SUM && LA190_0<=AVG)||(LA190_0>=COALESCE && LA190_0<=COUNT)||(LA190_0>=CASE && LA190_0<=CASE2)||(LA190_0>=PREVIOUS && LA190_0<=EXISTS)||(LA190_0>=INSTANCEOF && LA190_0<=CURRENT_TIMESTAMP)||LA190_0==NEWKW||(LA190_0>=EVAL_AND_EXPR && LA190_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA190_0==EVENT_PROP_EXPR||LA190_0==CONCAT||(LA190_0>=LIB_FUNC_CHAIN && LA190_0<=DOT_EXPR)||LA190_0==ARRAY_EXPR||(LA190_0>=NOT_IN_SET && LA190_0<=NOT_REGEXP)||(LA190_0>=IN_RANGE && LA190_0<=SUBSELECT_EXPR)||(LA190_0>=EXISTS_SUBSELECT_EXPR && LA190_0<=NOT_IN_SUBSELECT_EXPR)||LA190_0==SUBSTITUTION||(LA190_0>=FIRST_AGGREG && LA190_0<=WINDOW_AGGREG)||(LA190_0>=INT_TYPE && LA190_0<=NULL_TYPE)||LA190_0==STAR||(LA190_0>=BOR && LA190_0<=PLUS)||(LA190_0>=BAND && LA190_0<=BXOR)||(LA190_0>=LT && LA190_0<=GE)||(LA190_0>=MINUS && LA190_0<=MOD)||(LA190_0>=EVAL_IS_GROUP_EXPR && LA190_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt190=1;
                        }


                        switch (alt190) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:518:30: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_equalsSubquery3389);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop190;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:518:43: subSelectGroupExpr
                    {
                    pushFollow(FOLLOW_subSelectGroupExpr_in_equalsSubquery3394);
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
            int alt192=18;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt192=1;
                }
                break;
            case SUBSTITUTION:
                {
                alt192=2;
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
                alt192=3;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt192=4;
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
                alt192=5;
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
                alt192=6;
                }
                break;
            case LIB_FUNC_CHAIN:
                {
                alt192=7;
                }
                break;
            case CASE:
            case CASE2:
                {
                alt192=8;
                }
                break;
            case IN_SET:
            case NOT_IN_SET:
            case IN_RANGE:
            case NOT_IN_RANGE:
                {
                alt192=9;
                }
                break;
            case BETWEEN:
            case NOT_BETWEEN:
                {
                alt192=10;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt192=11;
                }
                break;
            case REGEXP:
            case NOT_REGEXP:
                {
                alt192=12;
                }
                break;
            case ARRAY_EXPR:
                {
                alt192=13;
                }
                break;
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
                {
                alt192=14;
                }
                break;
            case SUBSELECT_EXPR:
                {
                alt192=15;
                }
                break;
            case EXISTS_SUBSELECT_EXPR:
                {
                alt192=16;
                }
                break;
            case DOT_EXPR:
                {
                alt192=17;
                }
                break;
            case NEWKW:
                {
                alt192=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 192, 0, input);

                throw nvae;
            }

            switch (alt192) {
                case 1 :
                    // EsperEPL2Ast.g:522:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_valueExpr3408);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:523:4: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_valueExpr3414);
                    substitution();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:524:5: arithmeticExpr
                    {
                    pushFollow(FOLLOW_arithmeticExpr_in_valueExpr3420);
                    arithmeticExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:525:5: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_valueExpr3427);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:526:7: evalExprChoice
                    {
                    pushFollow(FOLLOW_evalExprChoice_in_valueExpr3436);
                    evalExprChoice();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:527:4: builtinFunc
                    {
                    pushFollow(FOLLOW_builtinFunc_in_valueExpr3441);
                    builtinFunc();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:528:7: libFuncChain
                    {
                    pushFollow(FOLLOW_libFuncChain_in_valueExpr3449);
                    libFuncChain();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:529:4: caseExpr
                    {
                    pushFollow(FOLLOW_caseExpr_in_valueExpr3454);
                    caseExpr();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:530:4: inExpr
                    {
                    pushFollow(FOLLOW_inExpr_in_valueExpr3459);
                    inExpr();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:531:4: betweenExpr
                    {
                    pushFollow(FOLLOW_betweenExpr_in_valueExpr3465);
                    betweenExpr();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:532:4: likeExpr
                    {
                    pushFollow(FOLLOW_likeExpr_in_valueExpr3470);
                    likeExpr();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:533:4: regExpExpr
                    {
                    pushFollow(FOLLOW_regExpExpr_in_valueExpr3475);
                    regExpExpr();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // EsperEPL2Ast.g:534:4: arrayExpr
                    {
                    pushFollow(FOLLOW_arrayExpr_in_valueExpr3480);
                    arrayExpr();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:535:4: subSelectInExpr
                    {
                    pushFollow(FOLLOW_subSelectInExpr_in_valueExpr3485);
                    subSelectInExpr();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:536:5: subSelectRowExpr
                    {
                    pushFollow(FOLLOW_subSelectRowExpr_in_valueExpr3491);
                    subSelectRowExpr();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:537:5: subSelectExistsExpr
                    {
                    pushFollow(FOLLOW_subSelectExistsExpr_in_valueExpr3498);
                    subSelectExistsExpr();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:538:4: dotExpr
                    {
                    pushFollow(FOLLOW_dotExpr_in_valueExpr3503);
                    dotExpr();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:539:4: newExpr
                    {
                    pushFollow(FOLLOW_newExpr_in_valueExpr3508);
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
            int alt194=11;
            switch ( input.LA(1) ) {
            case LAST:
                {
                alt194=1;
                }
                break;
            case LW:
                {
                alt194=2;
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
                alt194=3;
                }
                break;
            case OBJECT_PARAM_ORDERED_EXPR:
                {
                alt194=4;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt194=5;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt194=6;
                }
                break;
            case LAST_OPERATOR:
                {
                alt194=7;
                }
                break;
            case WEEKDAY_OPERATOR:
                {
                alt194=8;
                }
                break;
            case NUMERIC_PARAM_LIST:
                {
                alt194=9;
                }
                break;
            case NUMBERSETSTAR:
                {
                alt194=10;
                }
                break;
            case TIME_PERIOD:
                {
                alt194=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 194, 0, input);

                throw nvae;
            }

            switch (alt194) {
                case 1 :
                    // EsperEPL2Ast.g:543:4: l= LAST
                    {
                    l=(CommonTree)match(input,LAST,FOLLOW_LAST_in_valueExprWithTime3521); 
                     leaveNode(l); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:544:4: lw= LW
                    {
                    lw=(CommonTree)match(input,LW,FOLLOW_LW_in_valueExprWithTime3530); 
                     leaveNode(lw); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:545:4: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3537);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:546:4: ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) )
                    {
                    ordered=(CommonTree)match(input,OBJECT_PARAM_ORDERED_EXPR,FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3545); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3547);
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
                    pushFollow(FOLLOW_rangeOperator_in_valueExprWithTime3562);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:548:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_valueExprWithTime3568);
                    frequencyOperator();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:549:4: lastOperator
                    {
                    pushFollow(FOLLOW_lastOperator_in_valueExprWithTime3573);
                    lastOperator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:550:4: weekDayOperator
                    {
                    pushFollow(FOLLOW_weekDayOperator_in_valueExprWithTime3578);
                    weekDayOperator();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:551:5: ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ )
                    {
                    l=(CommonTree)match(input,NUMERIC_PARAM_LIST,FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3588); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:551:29: ( numericParameterList )+
                    int cnt193=0;
                    loop193:
                    do {
                        int alt193=2;
                        int LA193_0 = input.LA(1);

                        if ( (LA193_0==NUMERIC_PARAM_RANGE||LA193_0==NUMERIC_PARAM_FREQUENCY||(LA193_0>=INT_TYPE && LA193_0<=NULL_TYPE)) ) {
                            alt193=1;
                        }


                        switch (alt193) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:551:29: numericParameterList
                    	    {
                    	    pushFollow(FOLLOW_numericParameterList_in_valueExprWithTime3590);
                    	    numericParameterList();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt193 >= 1 ) break loop193;
                                EarlyExitException eee =
                                    new EarlyExitException(193, input);
                                throw eee;
                        }
                        cnt193++;
                    } while (true);

                     leaveNode(l); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:552:4: s= NUMBERSETSTAR
                    {
                    s=(CommonTree)match(input,NUMBERSETSTAR,FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3601); 
                     leaveNode(s); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:553:4: timePeriod
                    {
                    pushFollow(FOLLOW_timePeriod_in_valueExprWithTime3608);
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
            case NUMERIC_PARAM_RANGE:
                {
                alt195=2;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
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
                    // EsperEPL2Ast.g:557:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_numericParameterList3621);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:558:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_numericParameterList3628);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:559:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_numericParameterList3634);
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
            r=(CommonTree)match(input,NUMERIC_PARAM_RANGE,FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator3650); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:563:29: ( constant[true] | eventPropertyExpr[true] | substitution )
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
                    // EsperEPL2Ast.g:563:30: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator3653);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:563:45: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator3656);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:563:69: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator3659);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:563:83: ( constant[true] | eventPropertyExpr[true] | substitution )
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
                    // EsperEPL2Ast.g:563:84: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator3663);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:563:99: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator3666);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:563:123: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator3669);
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
            f=(CommonTree)match(input,NUMERIC_PARAM_FREQUENCY,FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator3690); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:567:33: ( constant[true] | eventPropertyExpr[true] | substitution )
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
                    // EsperEPL2Ast.g:567:34: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_frequencyOperator3693);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:567:49: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_frequencyOperator3696);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:567:73: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_frequencyOperator3699);
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
            l=(CommonTree)match(input,LAST_OPERATOR,FOLLOW_LAST_OPERATOR_in_lastOperator3718); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:571:23: ( constant[true] | eventPropertyExpr[true] | substitution )
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
                    // EsperEPL2Ast.g:571:24: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_lastOperator3721);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:571:39: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_lastOperator3724);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:571:63: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_lastOperator3727);
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
            w=(CommonTree)match(input,WEEKDAY_OPERATOR,FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator3746); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:575:26: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt200=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt200=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt200=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt200=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 200, 0, input);

                throw nvae;
            }

            switch (alt200) {
                case 1 :
                    // EsperEPL2Ast.g:575:27: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_weekDayOperator3749);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:575:42: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_weekDayOperator3752);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:575:66: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_weekDayOperator3755);
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
            s=(CommonTree)match(input,SUBSELECT_GROUP_EXPR,FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr3776); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectGroupExpr3778);
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
            s=(CommonTree)match(input,SUBSELECT_EXPR,FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr3797); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectRowExpr3799);
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
            e=(CommonTree)match(input,EXISTS_SUBSELECT_EXPR,FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr3818); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectExistsExpr3820);
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
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==IN_SUBSELECT_EXPR) ) {
                alt201=1;
            }
            else if ( (LA201_0==NOT_IN_SUBSELECT_EXPR) ) {
                alt201=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 201, 0, input);

                throw nvae;
            }
            switch (alt201) {
                case 1 :
                    // EsperEPL2Ast.g:591:5: ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,IN_SUBSELECT_EXPR,FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr3839); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr3841);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3843);
                    subSelectInQueryExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(s); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:592:5: ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,NOT_IN_SUBSELECT_EXPR,FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr3855); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr3857);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3859);
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
            i=(CommonTree)match(input,IN_SUBSELECT_QUERY_EXPR,FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr3878); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectInQueryExpr3880);
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
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==DISTINCT) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // EsperEPL2Ast.g:600:4: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_subQueryExpr3896); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_subQueryExpr3899);
            selectionList();

            state._fsp--;

            pushFollow(FOLLOW_subSelectFilterExpr_in_subQueryExpr3901);
            subSelectFilterExpr();

            state._fsp--;

            // EsperEPL2Ast.g:600:48: ( whereClause[true] )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==WHERE_EXPR) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // EsperEPL2Ast.g:600:49: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_subQueryExpr3904);
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
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_subSelectFilterExpr3922); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_subSelectFilterExpr3924);
            eventFilterExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:604:42: ( viewListExpr )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==VIEW_EXPR) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // EsperEPL2Ast.g:604:43: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_subSelectFilterExpr3928);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:604:58: ( IDENT )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==IDENT) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // EsperEPL2Ast.g:604:59: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_subSelectFilterExpr3933); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:604:67: ( RETAINUNION )?
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==RETAINUNION) ) {
                alt206=1;
            }
            switch (alt206) {
                case 1 :
                    // EsperEPL2Ast.g:604:67: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_subSelectFilterExpr3937); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:604:80: ( RETAININTERSECTION )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==RETAININTERSECTION) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // EsperEPL2Ast.g:604:80: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr3940); 

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
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==CASE) ) {
                alt210=1;
            }
            else if ( (LA210_0==CASE2) ) {
                alt210=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 210, 0, input);

                throw nvae;
            }
            switch (alt210) {
                case 1 :
                    // EsperEPL2Ast.g:608:4: ^(c= CASE ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE,FOLLOW_CASE_in_caseExpr3960); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:608:13: ( valueExpr )*
                        loop208:
                        do {
                            int alt208=2;
                            int LA208_0 = input.LA(1);

                            if ( ((LA208_0>=IN_SET && LA208_0<=REGEXP)||LA208_0==NOT_EXPR||(LA208_0>=SUM && LA208_0<=AVG)||(LA208_0>=COALESCE && LA208_0<=COUNT)||(LA208_0>=CASE && LA208_0<=CASE2)||(LA208_0>=PREVIOUS && LA208_0<=EXISTS)||(LA208_0>=INSTANCEOF && LA208_0<=CURRENT_TIMESTAMP)||LA208_0==NEWKW||(LA208_0>=EVAL_AND_EXPR && LA208_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA208_0==EVENT_PROP_EXPR||LA208_0==CONCAT||(LA208_0>=LIB_FUNC_CHAIN && LA208_0<=DOT_EXPR)||LA208_0==ARRAY_EXPR||(LA208_0>=NOT_IN_SET && LA208_0<=NOT_REGEXP)||(LA208_0>=IN_RANGE && LA208_0<=SUBSELECT_EXPR)||(LA208_0>=EXISTS_SUBSELECT_EXPR && LA208_0<=NOT_IN_SUBSELECT_EXPR)||LA208_0==SUBSTITUTION||(LA208_0>=FIRST_AGGREG && LA208_0<=WINDOW_AGGREG)||(LA208_0>=INT_TYPE && LA208_0<=NULL_TYPE)||LA208_0==STAR||(LA208_0>=BOR && LA208_0<=PLUS)||(LA208_0>=BAND && LA208_0<=BXOR)||(LA208_0>=LT && LA208_0<=GE)||(LA208_0>=MINUS && LA208_0<=MOD)||(LA208_0>=EVAL_IS_GROUP_EXPR && LA208_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt208=1;
                            }


                            switch (alt208) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:608:14: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr3963);
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
                case 2 :
                    // EsperEPL2Ast.g:609:4: ^(c= CASE2 ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE2,FOLLOW_CASE2_in_caseExpr3976); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:609:14: ( valueExpr )*
                        loop209:
                        do {
                            int alt209=2;
                            int LA209_0 = input.LA(1);

                            if ( ((LA209_0>=IN_SET && LA209_0<=REGEXP)||LA209_0==NOT_EXPR||(LA209_0>=SUM && LA209_0<=AVG)||(LA209_0>=COALESCE && LA209_0<=COUNT)||(LA209_0>=CASE && LA209_0<=CASE2)||(LA209_0>=PREVIOUS && LA209_0<=EXISTS)||(LA209_0>=INSTANCEOF && LA209_0<=CURRENT_TIMESTAMP)||LA209_0==NEWKW||(LA209_0>=EVAL_AND_EXPR && LA209_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA209_0==EVENT_PROP_EXPR||LA209_0==CONCAT||(LA209_0>=LIB_FUNC_CHAIN && LA209_0<=DOT_EXPR)||LA209_0==ARRAY_EXPR||(LA209_0>=NOT_IN_SET && LA209_0<=NOT_REGEXP)||(LA209_0>=IN_RANGE && LA209_0<=SUBSELECT_EXPR)||(LA209_0>=EXISTS_SUBSELECT_EXPR && LA209_0<=NOT_IN_SUBSELECT_EXPR)||LA209_0==SUBSTITUTION||(LA209_0>=FIRST_AGGREG && LA209_0<=WINDOW_AGGREG)||(LA209_0>=INT_TYPE && LA209_0<=NULL_TYPE)||LA209_0==STAR||(LA209_0>=BOR && LA209_0<=PLUS)||(LA209_0>=BAND && LA209_0<=BXOR)||(LA209_0>=LT && LA209_0<=GE)||(LA209_0>=MINUS && LA209_0<=MOD)||(LA209_0>=EVAL_IS_GROUP_EXPR && LA209_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt209=1;
                            }


                            switch (alt209) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:609:15: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr3979);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop209;
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
            int alt213=4;
            switch ( input.LA(1) ) {
            case IN_SET:
                {
                alt213=1;
                }
                break;
            case NOT_IN_SET:
                {
                alt213=2;
                }
                break;
            case IN_RANGE:
                {
                alt213=3;
                }
                break;
            case NOT_IN_RANGE:
                {
                alt213=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 213, 0, input);

                throw nvae;
            }

            switch (alt213) {
                case 1 :
                    // EsperEPL2Ast.g:613:4: ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_SET,FOLLOW_IN_SET_in_inExpr3999); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4001);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4009);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:613:51: ( valueExpr )*
                    loop211:
                    do {
                        int alt211=2;
                        int LA211_0 = input.LA(1);

                        if ( ((LA211_0>=IN_SET && LA211_0<=REGEXP)||LA211_0==NOT_EXPR||(LA211_0>=SUM && LA211_0<=AVG)||(LA211_0>=COALESCE && LA211_0<=COUNT)||(LA211_0>=CASE && LA211_0<=CASE2)||(LA211_0>=PREVIOUS && LA211_0<=EXISTS)||(LA211_0>=INSTANCEOF && LA211_0<=CURRENT_TIMESTAMP)||LA211_0==NEWKW||(LA211_0>=EVAL_AND_EXPR && LA211_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA211_0==EVENT_PROP_EXPR||LA211_0==CONCAT||(LA211_0>=LIB_FUNC_CHAIN && LA211_0<=DOT_EXPR)||LA211_0==ARRAY_EXPR||(LA211_0>=NOT_IN_SET && LA211_0<=NOT_REGEXP)||(LA211_0>=IN_RANGE && LA211_0<=SUBSELECT_EXPR)||(LA211_0>=EXISTS_SUBSELECT_EXPR && LA211_0<=NOT_IN_SUBSELECT_EXPR)||LA211_0==SUBSTITUTION||(LA211_0>=FIRST_AGGREG && LA211_0<=WINDOW_AGGREG)||(LA211_0>=INT_TYPE && LA211_0<=NULL_TYPE)||LA211_0==STAR||(LA211_0>=BOR && LA211_0<=PLUS)||(LA211_0>=BAND && LA211_0<=BXOR)||(LA211_0>=LT && LA211_0<=GE)||(LA211_0>=MINUS && LA211_0<=MOD)||(LA211_0>=EVAL_IS_GROUP_EXPR && LA211_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt211=1;
                        }


                        switch (alt211) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:613:52: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4012);
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
                case 2 :
                    // EsperEPL2Ast.g:614:4: ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_SET,FOLLOW_NOT_IN_SET_in_inExpr4031); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4033);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4041);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:614:55: ( valueExpr )*
                    loop212:
                    do {
                        int alt212=2;
                        int LA212_0 = input.LA(1);

                        if ( ((LA212_0>=IN_SET && LA212_0<=REGEXP)||LA212_0==NOT_EXPR||(LA212_0>=SUM && LA212_0<=AVG)||(LA212_0>=COALESCE && LA212_0<=COUNT)||(LA212_0>=CASE && LA212_0<=CASE2)||(LA212_0>=PREVIOUS && LA212_0<=EXISTS)||(LA212_0>=INSTANCEOF && LA212_0<=CURRENT_TIMESTAMP)||LA212_0==NEWKW||(LA212_0>=EVAL_AND_EXPR && LA212_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA212_0==EVENT_PROP_EXPR||LA212_0==CONCAT||(LA212_0>=LIB_FUNC_CHAIN && LA212_0<=DOT_EXPR)||LA212_0==ARRAY_EXPR||(LA212_0>=NOT_IN_SET && LA212_0<=NOT_REGEXP)||(LA212_0>=IN_RANGE && LA212_0<=SUBSELECT_EXPR)||(LA212_0>=EXISTS_SUBSELECT_EXPR && LA212_0<=NOT_IN_SUBSELECT_EXPR)||LA212_0==SUBSTITUTION||(LA212_0>=FIRST_AGGREG && LA212_0<=WINDOW_AGGREG)||(LA212_0>=INT_TYPE && LA212_0<=NULL_TYPE)||LA212_0==STAR||(LA212_0>=BOR && LA212_0<=PLUS)||(LA212_0>=BAND && LA212_0<=BXOR)||(LA212_0>=LT && LA212_0<=GE)||(LA212_0>=MINUS && LA212_0<=MOD)||(LA212_0>=EVAL_IS_GROUP_EXPR && LA212_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt212=1;
                        }


                        switch (alt212) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:614:56: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4044);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop212;
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
                    i=(CommonTree)match(input,IN_RANGE,FOLLOW_IN_RANGE_in_inExpr4063); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4065);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4073);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4075);
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
                    i=(CommonTree)match(input,NOT_IN_RANGE,FOLLOW_NOT_IN_RANGE_in_inExpr4092); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4094);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4102);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4104);
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
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==BETWEEN) ) {
                alt215=1;
            }
            else if ( (LA215_0==NOT_BETWEEN) ) {
                alt215=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 215, 0, input);

                throw nvae;
            }
            switch (alt215) {
                case 1 :
                    // EsperEPL2Ast.g:620:4: ^(b= BETWEEN valueExpr valueExpr valueExpr )
                    {
                    b=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenExpr4129); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4131);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4133);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4135);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(b); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:621:4: ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* )
                    {
                    b=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenExpr4146); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4148);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4150);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:621:40: ( valueExpr )*
                    loop214:
                    do {
                        int alt214=2;
                        int LA214_0 = input.LA(1);

                        if ( ((LA214_0>=IN_SET && LA214_0<=REGEXP)||LA214_0==NOT_EXPR||(LA214_0>=SUM && LA214_0<=AVG)||(LA214_0>=COALESCE && LA214_0<=COUNT)||(LA214_0>=CASE && LA214_0<=CASE2)||(LA214_0>=PREVIOUS && LA214_0<=EXISTS)||(LA214_0>=INSTANCEOF && LA214_0<=CURRENT_TIMESTAMP)||LA214_0==NEWKW||(LA214_0>=EVAL_AND_EXPR && LA214_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA214_0==EVENT_PROP_EXPR||LA214_0==CONCAT||(LA214_0>=LIB_FUNC_CHAIN && LA214_0<=DOT_EXPR)||LA214_0==ARRAY_EXPR||(LA214_0>=NOT_IN_SET && LA214_0<=NOT_REGEXP)||(LA214_0>=IN_RANGE && LA214_0<=SUBSELECT_EXPR)||(LA214_0>=EXISTS_SUBSELECT_EXPR && LA214_0<=NOT_IN_SUBSELECT_EXPR)||LA214_0==SUBSTITUTION||(LA214_0>=FIRST_AGGREG && LA214_0<=WINDOW_AGGREG)||(LA214_0>=INT_TYPE && LA214_0<=NULL_TYPE)||LA214_0==STAR||(LA214_0>=BOR && LA214_0<=PLUS)||(LA214_0>=BAND && LA214_0<=BXOR)||(LA214_0>=LT && LA214_0<=GE)||(LA214_0>=MINUS && LA214_0<=MOD)||(LA214_0>=EVAL_IS_GROUP_EXPR && LA214_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt214=1;
                        }


                        switch (alt214) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:621:41: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_betweenExpr4153);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop214;
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
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==LIKE) ) {
                alt218=1;
            }
            else if ( (LA218_0==NOT_LIKE) ) {
                alt218=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;
            }
            switch (alt218) {
                case 1 :
                    // EsperEPL2Ast.g:625:4: ^(l= LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeExpr4173); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4175);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4177);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:625:33: ( valueExpr )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( ((LA216_0>=IN_SET && LA216_0<=REGEXP)||LA216_0==NOT_EXPR||(LA216_0>=SUM && LA216_0<=AVG)||(LA216_0>=COALESCE && LA216_0<=COUNT)||(LA216_0>=CASE && LA216_0<=CASE2)||(LA216_0>=PREVIOUS && LA216_0<=EXISTS)||(LA216_0>=INSTANCEOF && LA216_0<=CURRENT_TIMESTAMP)||LA216_0==NEWKW||(LA216_0>=EVAL_AND_EXPR && LA216_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA216_0==EVENT_PROP_EXPR||LA216_0==CONCAT||(LA216_0>=LIB_FUNC_CHAIN && LA216_0<=DOT_EXPR)||LA216_0==ARRAY_EXPR||(LA216_0>=NOT_IN_SET && LA216_0<=NOT_REGEXP)||(LA216_0>=IN_RANGE && LA216_0<=SUBSELECT_EXPR)||(LA216_0>=EXISTS_SUBSELECT_EXPR && LA216_0<=NOT_IN_SUBSELECT_EXPR)||LA216_0==SUBSTITUTION||(LA216_0>=FIRST_AGGREG && LA216_0<=WINDOW_AGGREG)||(LA216_0>=INT_TYPE && LA216_0<=NULL_TYPE)||LA216_0==STAR||(LA216_0>=BOR && LA216_0<=PLUS)||(LA216_0>=BAND && LA216_0<=BXOR)||(LA216_0>=LT && LA216_0<=GE)||(LA216_0>=MINUS && LA216_0<=MOD)||(LA216_0>=EVAL_IS_GROUP_EXPR && LA216_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // EsperEPL2Ast.g:625:34: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4180);
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
                    l=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeExpr4193); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4195);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4197);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:626:37: ( valueExpr )?
                    int alt217=2;
                    int LA217_0 = input.LA(1);

                    if ( ((LA217_0>=IN_SET && LA217_0<=REGEXP)||LA217_0==NOT_EXPR||(LA217_0>=SUM && LA217_0<=AVG)||(LA217_0>=COALESCE && LA217_0<=COUNT)||(LA217_0>=CASE && LA217_0<=CASE2)||(LA217_0>=PREVIOUS && LA217_0<=EXISTS)||(LA217_0>=INSTANCEOF && LA217_0<=CURRENT_TIMESTAMP)||LA217_0==NEWKW||(LA217_0>=EVAL_AND_EXPR && LA217_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA217_0==EVENT_PROP_EXPR||LA217_0==CONCAT||(LA217_0>=LIB_FUNC_CHAIN && LA217_0<=DOT_EXPR)||LA217_0==ARRAY_EXPR||(LA217_0>=NOT_IN_SET && LA217_0<=NOT_REGEXP)||(LA217_0>=IN_RANGE && LA217_0<=SUBSELECT_EXPR)||(LA217_0>=EXISTS_SUBSELECT_EXPR && LA217_0<=NOT_IN_SUBSELECT_EXPR)||LA217_0==SUBSTITUTION||(LA217_0>=FIRST_AGGREG && LA217_0<=WINDOW_AGGREG)||(LA217_0>=INT_TYPE && LA217_0<=NULL_TYPE)||LA217_0==STAR||(LA217_0>=BOR && LA217_0<=PLUS)||(LA217_0>=BAND && LA217_0<=BXOR)||(LA217_0>=LT && LA217_0<=GE)||(LA217_0>=MINUS && LA217_0<=MOD)||(LA217_0>=EVAL_IS_GROUP_EXPR && LA217_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt217=1;
                    }
                    switch (alt217) {
                        case 1 :
                            // EsperEPL2Ast.g:626:38: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4200);
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
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==REGEXP) ) {
                alt219=1;
            }
            else if ( (LA219_0==NOT_REGEXP) ) {
                alt219=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 219, 0, input);

                throw nvae;
            }
            switch (alt219) {
                case 1 :
                    // EsperEPL2Ast.g:630:4: ^(r= REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,REGEXP,FOLLOW_REGEXP_in_regExpExpr4219); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4221);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4223);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(r); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:631:4: ^(r= NOT_REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,NOT_REGEXP,FOLLOW_NOT_REGEXP_in_regExpExpr4234); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4236);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4238);
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
            int alt245=20;
            switch ( input.LA(1) ) {
            case SUM:
                {
                alt245=1;
                }
                break;
            case AVG:
                {
                alt245=2;
                }
                break;
            case COUNT:
                {
                alt245=3;
                }
                break;
            case MEDIAN:
                {
                alt245=4;
                }
                break;
            case STDDEV:
                {
                alt245=5;
                }
                break;
            case AVEDEV:
                {
                alt245=6;
                }
                break;
            case LAST_AGGREG:
                {
                alt245=7;
                }
                break;
            case FIRST_AGGREG:
                {
                alt245=8;
                }
                break;
            case WINDOW_AGGREG:
                {
                alt245=9;
                }
                break;
            case COALESCE:
                {
                alt245=10;
                }
                break;
            case PREVIOUS:
                {
                alt245=11;
                }
                break;
            case PREVIOUSTAIL:
                {
                alt245=12;
                }
                break;
            case PREVIOUSCOUNT:
                {
                alt245=13;
                }
                break;
            case PREVIOUSWINDOW:
                {
                alt245=14;
                }
                break;
            case PRIOR:
                {
                alt245=15;
                }
                break;
            case INSTANCEOF:
                {
                alt245=16;
                }
                break;
            case TYPEOF:
                {
                alt245=17;
                }
                break;
            case CAST:
                {
                alt245=18;
                }
                break;
            case EXISTS:
                {
                alt245=19;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt245=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 245, 0, input);

                throw nvae;
            }

            switch (alt245) {
                case 1 :
                    // EsperEPL2Ast.g:635:5: ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,SUM,FOLLOW_SUM_in_builtinFunc4257); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:635:13: ( DISTINCT )?
                    int alt220=2;
                    int LA220_0 = input.LA(1);

                    if ( (LA220_0==DISTINCT) ) {
                        alt220=1;
                    }
                    switch (alt220) {
                        case 1 :
                            // EsperEPL2Ast.g:635:14: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4260); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4264);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:635:35: ( aggregationFilterExpr )?
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( (LA221_0==AGG_FILTER_EXPR) ) {
                        alt221=1;
                    }
                    switch (alt221) {
                        case 1 :
                            // EsperEPL2Ast.g:635:35: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4266);
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
                    f=(CommonTree)match(input,AVG,FOLLOW_AVG_in_builtinFunc4278); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:636:12: ( DISTINCT )?
                    int alt222=2;
                    int LA222_0 = input.LA(1);

                    if ( (LA222_0==DISTINCT) ) {
                        alt222=1;
                    }
                    switch (alt222) {
                        case 1 :
                            // EsperEPL2Ast.g:636:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4281); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4285);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:636:34: ( aggregationFilterExpr )?
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==AGG_FILTER_EXPR) ) {
                        alt223=1;
                    }
                    switch (alt223) {
                        case 1 :
                            // EsperEPL2Ast.g:636:34: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4287);
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
                    f=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_builtinFunc4299); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:637:14: ( ( DISTINCT )? valueExpr )?
                        int alt225=2;
                        int LA225_0 = input.LA(1);

                        if ( ((LA225_0>=IN_SET && LA225_0<=REGEXP)||LA225_0==NOT_EXPR||(LA225_0>=SUM && LA225_0<=AVG)||(LA225_0>=COALESCE && LA225_0<=COUNT)||(LA225_0>=CASE && LA225_0<=CASE2)||LA225_0==DISTINCT||(LA225_0>=PREVIOUS && LA225_0<=EXISTS)||(LA225_0>=INSTANCEOF && LA225_0<=CURRENT_TIMESTAMP)||LA225_0==NEWKW||(LA225_0>=EVAL_AND_EXPR && LA225_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA225_0==EVENT_PROP_EXPR||LA225_0==CONCAT||(LA225_0>=LIB_FUNC_CHAIN && LA225_0<=DOT_EXPR)||LA225_0==ARRAY_EXPR||(LA225_0>=NOT_IN_SET && LA225_0<=NOT_REGEXP)||(LA225_0>=IN_RANGE && LA225_0<=SUBSELECT_EXPR)||(LA225_0>=EXISTS_SUBSELECT_EXPR && LA225_0<=NOT_IN_SUBSELECT_EXPR)||LA225_0==SUBSTITUTION||(LA225_0>=FIRST_AGGREG && LA225_0<=WINDOW_AGGREG)||(LA225_0>=INT_TYPE && LA225_0<=NULL_TYPE)||LA225_0==STAR||(LA225_0>=BOR && LA225_0<=PLUS)||(LA225_0>=BAND && LA225_0<=BXOR)||(LA225_0>=LT && LA225_0<=GE)||(LA225_0>=MINUS && LA225_0<=MOD)||(LA225_0>=EVAL_IS_GROUP_EXPR && LA225_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt225=1;
                        }
                        switch (alt225) {
                            case 1 :
                                // EsperEPL2Ast.g:637:15: ( DISTINCT )? valueExpr
                                {
                                // EsperEPL2Ast.g:637:15: ( DISTINCT )?
                                int alt224=2;
                                int LA224_0 = input.LA(1);

                                if ( (LA224_0==DISTINCT) ) {
                                    alt224=1;
                                }
                                switch (alt224) {
                                    case 1 :
                                        // EsperEPL2Ast.g:637:16: DISTINCT
                                        {
                                        match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4303); 

                                        }
                                        break;

                                }

                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4307);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:637:39: ( aggregationFilterExpr )?
                        int alt226=2;
                        int LA226_0 = input.LA(1);

                        if ( (LA226_0==AGG_FILTER_EXPR) ) {
                            alt226=1;
                        }
                        switch (alt226) {
                            case 1 :
                                // EsperEPL2Ast.g:637:39: aggregationFilterExpr
                                {
                                pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4311);
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
                    f=(CommonTree)match(input,MEDIAN,FOLLOW_MEDIAN_in_builtinFunc4323); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:638:15: ( DISTINCT )?
                    int alt227=2;
                    int LA227_0 = input.LA(1);

                    if ( (LA227_0==DISTINCT) ) {
                        alt227=1;
                    }
                    switch (alt227) {
                        case 1 :
                            // EsperEPL2Ast.g:638:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4326); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4330);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:638:37: ( aggregationFilterExpr )?
                    int alt228=2;
                    int LA228_0 = input.LA(1);

                    if ( (LA228_0==AGG_FILTER_EXPR) ) {
                        alt228=1;
                    }
                    switch (alt228) {
                        case 1 :
                            // EsperEPL2Ast.g:638:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4332);
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
                    f=(CommonTree)match(input,STDDEV,FOLLOW_STDDEV_in_builtinFunc4344); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:639:15: ( DISTINCT )?
                    int alt229=2;
                    int LA229_0 = input.LA(1);

                    if ( (LA229_0==DISTINCT) ) {
                        alt229=1;
                    }
                    switch (alt229) {
                        case 1 :
                            // EsperEPL2Ast.g:639:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4347); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4351);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:639:37: ( aggregationFilterExpr )?
                    int alt230=2;
                    int LA230_0 = input.LA(1);

                    if ( (LA230_0==AGG_FILTER_EXPR) ) {
                        alt230=1;
                    }
                    switch (alt230) {
                        case 1 :
                            // EsperEPL2Ast.g:639:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4353);
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
                    f=(CommonTree)match(input,AVEDEV,FOLLOW_AVEDEV_in_builtinFunc4365); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:640:15: ( DISTINCT )?
                    int alt231=2;
                    int LA231_0 = input.LA(1);

                    if ( (LA231_0==DISTINCT) ) {
                        alt231=1;
                    }
                    switch (alt231) {
                        case 1 :
                            // EsperEPL2Ast.g:640:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4368); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4372);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:640:37: ( aggregationFilterExpr )?
                    int alt232=2;
                    int LA232_0 = input.LA(1);

                    if ( (LA232_0==AGG_FILTER_EXPR) ) {
                        alt232=1;
                    }
                    switch (alt232) {
                        case 1 :
                            // EsperEPL2Ast.g:640:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4374);
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
                    f=(CommonTree)match(input,LAST_AGGREG,FOLLOW_LAST_AGGREG_in_builtinFunc4386); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:641:20: ( DISTINCT )?
                        int alt233=2;
                        int LA233_0 = input.LA(1);

                        if ( (LA233_0==DISTINCT) ) {
                            alt233=1;
                        }
                        switch (alt233) {
                            case 1 :
                                // EsperEPL2Ast.g:641:21: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4389); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:641:32: ( accessValueExpr )?
                        int alt234=2;
                        int LA234_0 = input.LA(1);

                        if ( (LA234_0==ACCESS_AGG) ) {
                            alt234=1;
                        }
                        switch (alt234) {
                            case 1 :
                                // EsperEPL2Ast.g:641:32: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4393);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:641:49: ( valueExpr )?
                        int alt235=2;
                        int LA235_0 = input.LA(1);

                        if ( ((LA235_0>=IN_SET && LA235_0<=REGEXP)||LA235_0==NOT_EXPR||(LA235_0>=SUM && LA235_0<=AVG)||(LA235_0>=COALESCE && LA235_0<=COUNT)||(LA235_0>=CASE && LA235_0<=CASE2)||(LA235_0>=PREVIOUS && LA235_0<=EXISTS)||(LA235_0>=INSTANCEOF && LA235_0<=CURRENT_TIMESTAMP)||LA235_0==NEWKW||(LA235_0>=EVAL_AND_EXPR && LA235_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA235_0==EVENT_PROP_EXPR||LA235_0==CONCAT||(LA235_0>=LIB_FUNC_CHAIN && LA235_0<=DOT_EXPR)||LA235_0==ARRAY_EXPR||(LA235_0>=NOT_IN_SET && LA235_0<=NOT_REGEXP)||(LA235_0>=IN_RANGE && LA235_0<=SUBSELECT_EXPR)||(LA235_0>=EXISTS_SUBSELECT_EXPR && LA235_0<=NOT_IN_SUBSELECT_EXPR)||LA235_0==SUBSTITUTION||(LA235_0>=FIRST_AGGREG && LA235_0<=WINDOW_AGGREG)||(LA235_0>=INT_TYPE && LA235_0<=NULL_TYPE)||LA235_0==STAR||(LA235_0>=BOR && LA235_0<=PLUS)||(LA235_0>=BAND && LA235_0<=BXOR)||(LA235_0>=LT && LA235_0<=GE)||(LA235_0>=MINUS && LA235_0<=MOD)||(LA235_0>=EVAL_IS_GROUP_EXPR && LA235_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt235=1;
                        }
                        switch (alt235) {
                            case 1 :
                                // EsperEPL2Ast.g:641:49: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4396);
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
                    f=(CommonTree)match(input,FIRST_AGGREG,FOLLOW_FIRST_AGGREG_in_builtinFunc4408); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:642:21: ( DISTINCT )?
                        int alt236=2;
                        int LA236_0 = input.LA(1);

                        if ( (LA236_0==DISTINCT) ) {
                            alt236=1;
                        }
                        switch (alt236) {
                            case 1 :
                                // EsperEPL2Ast.g:642:22: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4411); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:642:33: ( accessValueExpr )?
                        int alt237=2;
                        int LA237_0 = input.LA(1);

                        if ( (LA237_0==ACCESS_AGG) ) {
                            alt237=1;
                        }
                        switch (alt237) {
                            case 1 :
                                // EsperEPL2Ast.g:642:33: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4415);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:642:50: ( valueExpr )?
                        int alt238=2;
                        int LA238_0 = input.LA(1);

                        if ( ((LA238_0>=IN_SET && LA238_0<=REGEXP)||LA238_0==NOT_EXPR||(LA238_0>=SUM && LA238_0<=AVG)||(LA238_0>=COALESCE && LA238_0<=COUNT)||(LA238_0>=CASE && LA238_0<=CASE2)||(LA238_0>=PREVIOUS && LA238_0<=EXISTS)||(LA238_0>=INSTANCEOF && LA238_0<=CURRENT_TIMESTAMP)||LA238_0==NEWKW||(LA238_0>=EVAL_AND_EXPR && LA238_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA238_0==EVENT_PROP_EXPR||LA238_0==CONCAT||(LA238_0>=LIB_FUNC_CHAIN && LA238_0<=DOT_EXPR)||LA238_0==ARRAY_EXPR||(LA238_0>=NOT_IN_SET && LA238_0<=NOT_REGEXP)||(LA238_0>=IN_RANGE && LA238_0<=SUBSELECT_EXPR)||(LA238_0>=EXISTS_SUBSELECT_EXPR && LA238_0<=NOT_IN_SUBSELECT_EXPR)||LA238_0==SUBSTITUTION||(LA238_0>=FIRST_AGGREG && LA238_0<=WINDOW_AGGREG)||(LA238_0>=INT_TYPE && LA238_0<=NULL_TYPE)||LA238_0==STAR||(LA238_0>=BOR && LA238_0<=PLUS)||(LA238_0>=BAND && LA238_0<=BXOR)||(LA238_0>=LT && LA238_0<=GE)||(LA238_0>=MINUS && LA238_0<=MOD)||(LA238_0>=EVAL_IS_GROUP_EXPR && LA238_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt238=1;
                        }
                        switch (alt238) {
                            case 1 :
                                // EsperEPL2Ast.g:642:50: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4418);
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
                    f=(CommonTree)match(input,WINDOW_AGGREG,FOLLOW_WINDOW_AGGREG_in_builtinFunc4430); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:643:22: ( DISTINCT )?
                        int alt239=2;
                        int LA239_0 = input.LA(1);

                        if ( (LA239_0==DISTINCT) ) {
                            alt239=1;
                        }
                        switch (alt239) {
                            case 1 :
                                // EsperEPL2Ast.g:643:23: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4433); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:643:34: ( accessValueExpr )?
                        int alt240=2;
                        int LA240_0 = input.LA(1);

                        if ( (LA240_0==ACCESS_AGG) ) {
                            alt240=1;
                        }
                        switch (alt240) {
                            case 1 :
                                // EsperEPL2Ast.g:643:34: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4437);
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
                    f=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtinFunc4450); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4452);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4454);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:644:38: ( valueExpr )*
                    loop241:
                    do {
                        int alt241=2;
                        int LA241_0 = input.LA(1);

                        if ( ((LA241_0>=IN_SET && LA241_0<=REGEXP)||LA241_0==NOT_EXPR||(LA241_0>=SUM && LA241_0<=AVG)||(LA241_0>=COALESCE && LA241_0<=COUNT)||(LA241_0>=CASE && LA241_0<=CASE2)||(LA241_0>=PREVIOUS && LA241_0<=EXISTS)||(LA241_0>=INSTANCEOF && LA241_0<=CURRENT_TIMESTAMP)||LA241_0==NEWKW||(LA241_0>=EVAL_AND_EXPR && LA241_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA241_0==EVENT_PROP_EXPR||LA241_0==CONCAT||(LA241_0>=LIB_FUNC_CHAIN && LA241_0<=DOT_EXPR)||LA241_0==ARRAY_EXPR||(LA241_0>=NOT_IN_SET && LA241_0<=NOT_REGEXP)||(LA241_0>=IN_RANGE && LA241_0<=SUBSELECT_EXPR)||(LA241_0>=EXISTS_SUBSELECT_EXPR && LA241_0<=NOT_IN_SUBSELECT_EXPR)||LA241_0==SUBSTITUTION||(LA241_0>=FIRST_AGGREG && LA241_0<=WINDOW_AGGREG)||(LA241_0>=INT_TYPE && LA241_0<=NULL_TYPE)||LA241_0==STAR||(LA241_0>=BOR && LA241_0<=PLUS)||(LA241_0>=BAND && LA241_0<=BXOR)||(LA241_0>=LT && LA241_0<=GE)||(LA241_0>=MINUS && LA241_0<=MOD)||(LA241_0>=EVAL_IS_GROUP_EXPR && LA241_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt241=1;
                        }


                        switch (alt241) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:644:39: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_builtinFunc4457);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop241;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:645:5: ^(f= PREVIOUS valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_builtinFunc4472); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4474);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:645:28: ( valueExpr )?
                    int alt242=2;
                    int LA242_0 = input.LA(1);

                    if ( ((LA242_0>=IN_SET && LA242_0<=REGEXP)||LA242_0==NOT_EXPR||(LA242_0>=SUM && LA242_0<=AVG)||(LA242_0>=COALESCE && LA242_0<=COUNT)||(LA242_0>=CASE && LA242_0<=CASE2)||(LA242_0>=PREVIOUS && LA242_0<=EXISTS)||(LA242_0>=INSTANCEOF && LA242_0<=CURRENT_TIMESTAMP)||LA242_0==NEWKW||(LA242_0>=EVAL_AND_EXPR && LA242_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA242_0==EVENT_PROP_EXPR||LA242_0==CONCAT||(LA242_0>=LIB_FUNC_CHAIN && LA242_0<=DOT_EXPR)||LA242_0==ARRAY_EXPR||(LA242_0>=NOT_IN_SET && LA242_0<=NOT_REGEXP)||(LA242_0>=IN_RANGE && LA242_0<=SUBSELECT_EXPR)||(LA242_0>=EXISTS_SUBSELECT_EXPR && LA242_0<=NOT_IN_SUBSELECT_EXPR)||LA242_0==SUBSTITUTION||(LA242_0>=FIRST_AGGREG && LA242_0<=WINDOW_AGGREG)||(LA242_0>=INT_TYPE && LA242_0<=NULL_TYPE)||LA242_0==STAR||(LA242_0>=BOR && LA242_0<=PLUS)||(LA242_0>=BAND && LA242_0<=BXOR)||(LA242_0>=LT && LA242_0<=GE)||(LA242_0>=MINUS && LA242_0<=MOD)||(LA242_0>=EVAL_IS_GROUP_EXPR && LA242_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt242=1;
                    }
                    switch (alt242) {
                        case 1 :
                            // EsperEPL2Ast.g:645:28: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4476);
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
                    f=(CommonTree)match(input,PREVIOUSTAIL,FOLLOW_PREVIOUSTAIL_in_builtinFunc4489); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4491);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:646:32: ( valueExpr )?
                    int alt243=2;
                    int LA243_0 = input.LA(1);

                    if ( ((LA243_0>=IN_SET && LA243_0<=REGEXP)||LA243_0==NOT_EXPR||(LA243_0>=SUM && LA243_0<=AVG)||(LA243_0>=COALESCE && LA243_0<=COUNT)||(LA243_0>=CASE && LA243_0<=CASE2)||(LA243_0>=PREVIOUS && LA243_0<=EXISTS)||(LA243_0>=INSTANCEOF && LA243_0<=CURRENT_TIMESTAMP)||LA243_0==NEWKW||(LA243_0>=EVAL_AND_EXPR && LA243_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA243_0==EVENT_PROP_EXPR||LA243_0==CONCAT||(LA243_0>=LIB_FUNC_CHAIN && LA243_0<=DOT_EXPR)||LA243_0==ARRAY_EXPR||(LA243_0>=NOT_IN_SET && LA243_0<=NOT_REGEXP)||(LA243_0>=IN_RANGE && LA243_0<=SUBSELECT_EXPR)||(LA243_0>=EXISTS_SUBSELECT_EXPR && LA243_0<=NOT_IN_SUBSELECT_EXPR)||LA243_0==SUBSTITUTION||(LA243_0>=FIRST_AGGREG && LA243_0<=WINDOW_AGGREG)||(LA243_0>=INT_TYPE && LA243_0<=NULL_TYPE)||LA243_0==STAR||(LA243_0>=BOR && LA243_0<=PLUS)||(LA243_0>=BAND && LA243_0<=BXOR)||(LA243_0>=LT && LA243_0<=GE)||(LA243_0>=MINUS && LA243_0<=MOD)||(LA243_0>=EVAL_IS_GROUP_EXPR && LA243_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt243=1;
                    }
                    switch (alt243) {
                        case 1 :
                            // EsperEPL2Ast.g:646:32: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4493);
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
                    f=(CommonTree)match(input,PREVIOUSCOUNT,FOLLOW_PREVIOUSCOUNT_in_builtinFunc4506); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4508);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:648:5: ^(f= PREVIOUSWINDOW valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSWINDOW,FOLLOW_PREVIOUSWINDOW_in_builtinFunc4520); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4522);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:649:5: ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,PRIOR,FOLLOW_PRIOR_in_builtinFunc4534); 

                    match(input, Token.DOWN, null); 
                    c=(CommonTree)match(input,NUM_INT,FOLLOW_NUM_INT_in_builtinFunc4538); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4540);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    leaveNode(c); leaveNode(f);

                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:650:5: ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* )
                    {
                    f=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_builtinFunc4553); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4555);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4557); 
                    // EsperEPL2Ast.g:650:42: ( CLASS_IDENT )*
                    loop244:
                    do {
                        int alt244=2;
                        int LA244_0 = input.LA(1);

                        if ( (LA244_0==CLASS_IDENT) ) {
                            alt244=1;
                        }


                        switch (alt244) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:650:43: CLASS_IDENT
                    	    {
                    	    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4560); 

                    	    }
                    	    break;

                    	default :
                    	    break loop244;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:651:5: ^(f= TYPEOF valueExpr )
                    {
                    f=(CommonTree)match(input,TYPEOF,FOLLOW_TYPEOF_in_builtinFunc4574); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4576);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:652:5: ^(f= CAST valueExpr CLASS_IDENT )
                    {
                    f=(CommonTree)match(input,CAST,FOLLOW_CAST_in_builtinFunc4588); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4590);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4592); 

                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 19 :
                    // EsperEPL2Ast.g:653:5: ^(f= EXISTS eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_builtinFunc4604); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4606);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 20 :
                    // EsperEPL2Ast.g:654:4: ^(f= CURRENT_TIMESTAMP )
                    {
                    f=(CommonTree)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4618); 



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
            match(input,AGG_FILTER_EXPR,FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr4635); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_aggregationFilterExpr4637);
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
            match(input,ACCESS_AGG,FOLLOW_ACCESS_AGG_in_accessValueExpr4651); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accessValueExprChoice_in_accessValueExpr4653);
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
            int alt247=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt247=1;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt247=2;
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
                alt247=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 247, 0, input);

                throw nvae;
            }

            switch (alt247) {
                case 1 :
                    // EsperEPL2Ast.g:666:4: PROPERTY_WILDCARD_SELECT
                    {
                    match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice4668); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:666:31: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice4675); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice4677); 
                    // EsperEPL2Ast.g:666:67: ( IDENT )?
                    int alt246=2;
                    int LA246_0 = input.LA(1);

                    if ( (LA246_0==IDENT) ) {
                        alt246=1;
                    }
                    switch (alt246) {
                        case 1 :
                            // EsperEPL2Ast.g:666:67: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice4679); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:666:77: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_accessValueExprChoice4685);
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
            a=(CommonTree)match(input,ARRAY_EXPR,FOLLOW_ARRAY_EXPR_in_arrayExpr4701); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:670:19: ( valueExpr )*
                loop248:
                do {
                    int alt248=2;
                    int LA248_0 = input.LA(1);

                    if ( ((LA248_0>=IN_SET && LA248_0<=REGEXP)||LA248_0==NOT_EXPR||(LA248_0>=SUM && LA248_0<=AVG)||(LA248_0>=COALESCE && LA248_0<=COUNT)||(LA248_0>=CASE && LA248_0<=CASE2)||(LA248_0>=PREVIOUS && LA248_0<=EXISTS)||(LA248_0>=INSTANCEOF && LA248_0<=CURRENT_TIMESTAMP)||LA248_0==NEWKW||(LA248_0>=EVAL_AND_EXPR && LA248_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA248_0==EVENT_PROP_EXPR||LA248_0==CONCAT||(LA248_0>=LIB_FUNC_CHAIN && LA248_0<=DOT_EXPR)||LA248_0==ARRAY_EXPR||(LA248_0>=NOT_IN_SET && LA248_0<=NOT_REGEXP)||(LA248_0>=IN_RANGE && LA248_0<=SUBSELECT_EXPR)||(LA248_0>=EXISTS_SUBSELECT_EXPR && LA248_0<=NOT_IN_SUBSELECT_EXPR)||LA248_0==SUBSTITUTION||(LA248_0>=FIRST_AGGREG && LA248_0<=WINDOW_AGGREG)||(LA248_0>=INT_TYPE && LA248_0<=NULL_TYPE)||LA248_0==STAR||(LA248_0>=BOR && LA248_0<=PLUS)||(LA248_0>=BAND && LA248_0<=BXOR)||(LA248_0>=LT && LA248_0<=GE)||(LA248_0>=MINUS && LA248_0<=MOD)||(LA248_0>=EVAL_IS_GROUP_EXPR && LA248_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt248=1;
                    }


                    switch (alt248) {
                	case 1 :
                	    // EsperEPL2Ast.g:670:20: valueExpr
                	    {
                	    pushFollow(FOLLOW_valueExpr_in_arrayExpr4704);
                	    valueExpr();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop248;
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
            int alt250=9;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt250=1;
                }
                break;
            case MINUS:
                {
                alt250=2;
                }
                break;
            case DIV:
                {
                alt250=3;
                }
                break;
            case STAR:
                {
                alt250=4;
                }
                break;
            case MOD:
                {
                alt250=5;
                }
                break;
            case BAND:
                {
                alt250=6;
                }
                break;
            case BOR:
                {
                alt250=7;
                }
                break;
            case BXOR:
                {
                alt250=8;
                }
                break;
            case CONCAT:
                {
                alt250=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 250, 0, input);

                throw nvae;
            }

            switch (alt250) {
                case 1 :
                    // EsperEPL2Ast.g:674:5: ^(a= PLUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_arithmeticExpr4725); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4727);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4729);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:675:5: ^(a= MINUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_arithmeticExpr4741); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4743);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4745);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:676:5: ^(a= DIV valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,DIV,FOLLOW_DIV_in_arithmeticExpr4757); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4759);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4761);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:677:4: ^(a= STAR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,STAR,FOLLOW_STAR_in_arithmeticExpr4772); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4774);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4776);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:678:5: ^(a= MOD valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MOD,FOLLOW_MOD_in_arithmeticExpr4788); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4790);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4792);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:679:4: ^(a= BAND valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BAND,FOLLOW_BAND_in_arithmeticExpr4803); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4805);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4807);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:680:4: ^(a= BOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BOR,FOLLOW_BOR_in_arithmeticExpr4818); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4820);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4822);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:681:4: ^(a= BXOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BXOR,FOLLOW_BXOR_in_arithmeticExpr4833); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4835);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4837);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:682:5: ^(a= CONCAT valueExpr valueExpr ( valueExpr )* )
                    {
                    a=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_arithmeticExpr4849); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4851);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4853);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:682:36: ( valueExpr )*
                    loop249:
                    do {
                        int alt249=2;
                        int LA249_0 = input.LA(1);

                        if ( ((LA249_0>=IN_SET && LA249_0<=REGEXP)||LA249_0==NOT_EXPR||(LA249_0>=SUM && LA249_0<=AVG)||(LA249_0>=COALESCE && LA249_0<=COUNT)||(LA249_0>=CASE && LA249_0<=CASE2)||(LA249_0>=PREVIOUS && LA249_0<=EXISTS)||(LA249_0>=INSTANCEOF && LA249_0<=CURRENT_TIMESTAMP)||LA249_0==NEWKW||(LA249_0>=EVAL_AND_EXPR && LA249_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA249_0==EVENT_PROP_EXPR||LA249_0==CONCAT||(LA249_0>=LIB_FUNC_CHAIN && LA249_0<=DOT_EXPR)||LA249_0==ARRAY_EXPR||(LA249_0>=NOT_IN_SET && LA249_0<=NOT_REGEXP)||(LA249_0>=IN_RANGE && LA249_0<=SUBSELECT_EXPR)||(LA249_0>=EXISTS_SUBSELECT_EXPR && LA249_0<=NOT_IN_SUBSELECT_EXPR)||LA249_0==SUBSTITUTION||(LA249_0>=FIRST_AGGREG && LA249_0<=WINDOW_AGGREG)||(LA249_0>=INT_TYPE && LA249_0<=NULL_TYPE)||LA249_0==STAR||(LA249_0>=BOR && LA249_0<=PLUS)||(LA249_0>=BAND && LA249_0<=BXOR)||(LA249_0>=LT && LA249_0<=GE)||(LA249_0>=MINUS && LA249_0<=MOD)||(LA249_0>=EVAL_IS_GROUP_EXPR && LA249_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt249=1;
                        }


                        switch (alt249) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:682:37: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr4856);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop249;
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
            d=(CommonTree)match(input,DOT_EXPR,FOLLOW_DOT_EXPR_in_dotExpr4876); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dotExpr4878);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:686:27: ( libFunctionWithClass )*
            loop251:
            do {
                int alt251=2;
                int LA251_0 = input.LA(1);

                if ( (LA251_0==LIB_FUNCTION) ) {
                    alt251=1;
                }


                switch (alt251) {
            	case 1 :
            	    // EsperEPL2Ast.g:686:27: libFunctionWithClass
            	    {
            	    pushFollow(FOLLOW_libFunctionWithClass_in_dotExpr4880);
            	    libFunctionWithClass();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop251;
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
            n=(CommonTree)match(input,NEWKW,FOLLOW_NEWKW_in_newExpr4898); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:689:21: ( newAssign )*
                loop252:
                do {
                    int alt252=2;
                    int LA252_0 = input.LA(1);

                    if ( (LA252_0==NEW_ITEM) ) {
                        alt252=1;
                    }


                    switch (alt252) {
                	case 1 :
                	    // EsperEPL2Ast.g:689:21: newAssign
                	    {
                	    pushFollow(FOLLOW_newAssign_in_newExpr4900);
                	    newAssign();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop252;
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
            match(input,NEW_ITEM,FOLLOW_NEW_ITEM_in_newAssign4916); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_newAssign4918);
            eventPropertyExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:693:40: ( valueExpr )?
            int alt253=2;
            int LA253_0 = input.LA(1);

            if ( ((LA253_0>=IN_SET && LA253_0<=REGEXP)||LA253_0==NOT_EXPR||(LA253_0>=SUM && LA253_0<=AVG)||(LA253_0>=COALESCE && LA253_0<=COUNT)||(LA253_0>=CASE && LA253_0<=CASE2)||(LA253_0>=PREVIOUS && LA253_0<=EXISTS)||(LA253_0>=INSTANCEOF && LA253_0<=CURRENT_TIMESTAMP)||LA253_0==NEWKW||(LA253_0>=EVAL_AND_EXPR && LA253_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA253_0==EVENT_PROP_EXPR||LA253_0==CONCAT||(LA253_0>=LIB_FUNC_CHAIN && LA253_0<=DOT_EXPR)||LA253_0==ARRAY_EXPR||(LA253_0>=NOT_IN_SET && LA253_0<=NOT_REGEXP)||(LA253_0>=IN_RANGE && LA253_0<=SUBSELECT_EXPR)||(LA253_0>=EXISTS_SUBSELECT_EXPR && LA253_0<=NOT_IN_SUBSELECT_EXPR)||LA253_0==SUBSTITUTION||(LA253_0>=FIRST_AGGREG && LA253_0<=WINDOW_AGGREG)||(LA253_0>=INT_TYPE && LA253_0<=NULL_TYPE)||LA253_0==STAR||(LA253_0>=BOR && LA253_0<=PLUS)||(LA253_0>=BAND && LA253_0<=BXOR)||(LA253_0>=LT && LA253_0<=GE)||(LA253_0>=MINUS && LA253_0<=MOD)||(LA253_0>=EVAL_IS_GROUP_EXPR && LA253_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt253=1;
            }
            switch (alt253) {
                case 1 :
                    // EsperEPL2Ast.g:693:40: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_newAssign4921);
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
            l=(CommonTree)match(input,LIB_FUNC_CHAIN,FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain4939); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_libFuncChain4941);
            libFunctionWithClass();

            state._fsp--;

            // EsperEPL2Ast.g:697:46: ( libOrPropFunction )*
            loop254:
            do {
                int alt254=2;
                int LA254_0 = input.LA(1);

                if ( (LA254_0==EVENT_PROP_EXPR||LA254_0==LIB_FUNCTION) ) {
                    alt254=1;
                }


                switch (alt254) {
            	case 1 :
            	    // EsperEPL2Ast.g:697:46: libOrPropFunction
            	    {
            	    pushFollow(FOLLOW_libOrPropFunction_in_libFuncChain4943);
            	    libOrPropFunction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop254;
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
            l=(CommonTree)match(input,LIB_FUNCTION,FOLLOW_LIB_FUNCTION_in_libFunctionWithClass4963); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:701:23: ( CLASS_IDENT )?
            int alt255=2;
            int LA255_0 = input.LA(1);

            if ( (LA255_0==CLASS_IDENT) ) {
                alt255=1;
            }
            switch (alt255) {
                case 1 :
                    // EsperEPL2Ast.g:701:24: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_libFunctionWithClass4966); 

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_libFunctionWithClass4970); 
            // EsperEPL2Ast.g:701:44: ( DISTINCT )?
            int alt256=2;
            int LA256_0 = input.LA(1);

            if ( (LA256_0==DISTINCT) ) {
                alt256=1;
            }
            switch (alt256) {
                case 1 :
                    // EsperEPL2Ast.g:701:45: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_libFunctionWithClass4973); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:701:56: ( libFunctionArgItem )*
            loop257:
            do {
                int alt257=2;
                int LA257_0 = input.LA(1);

                if ( ((LA257_0>=IN_SET && LA257_0<=REGEXP)||LA257_0==NOT_EXPR||(LA257_0>=SUM && LA257_0<=AVG)||(LA257_0>=COALESCE && LA257_0<=COUNT)||(LA257_0>=CASE && LA257_0<=CASE2)||LA257_0==LAST||(LA257_0>=PREVIOUS && LA257_0<=EXISTS)||(LA257_0>=LW && LA257_0<=CURRENT_TIMESTAMP)||LA257_0==NEWKW||(LA257_0>=NUMERIC_PARAM_RANGE && LA257_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA257_0>=EVAL_AND_EXPR && LA257_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA257_0==EVENT_PROP_EXPR||LA257_0==CONCAT||(LA257_0>=LIB_FUNC_CHAIN && LA257_0<=DOT_EXPR)||(LA257_0>=TIME_PERIOD && LA257_0<=ARRAY_EXPR)||(LA257_0>=NOT_IN_SET && LA257_0<=NOT_REGEXP)||(LA257_0>=IN_RANGE && LA257_0<=SUBSELECT_EXPR)||(LA257_0>=EXISTS_SUBSELECT_EXPR && LA257_0<=NOT_IN_SUBSELECT_EXPR)||(LA257_0>=LAST_OPERATOR && LA257_0<=SUBSTITUTION)||LA257_0==NUMBERSETSTAR||(LA257_0>=FIRST_AGGREG && LA257_0<=WINDOW_AGGREG)||(LA257_0>=INT_TYPE && LA257_0<=NULL_TYPE)||LA257_0==GOES||LA257_0==STAR||(LA257_0>=BOR && LA257_0<=PLUS)||(LA257_0>=BAND && LA257_0<=BXOR)||(LA257_0>=LT && LA257_0<=GE)||(LA257_0>=MINUS && LA257_0<=MOD)||(LA257_0>=EVAL_IS_GROUP_EXPR && LA257_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt257=1;
                }


                switch (alt257) {
            	case 1 :
            	    // EsperEPL2Ast.g:701:56: libFunctionArgItem
            	    {
            	    pushFollow(FOLLOW_libFunctionArgItem_in_libFunctionWithClass4977);
            	    libFunctionArgItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop257;
                }
            } while (true);

            // EsperEPL2Ast.g:701:76: ( LPAREN )?
            int alt258=2;
            int LA258_0 = input.LA(1);

            if ( (LA258_0==LPAREN) ) {
                alt258=1;
            }
            switch (alt258) {
                case 1 :
                    // EsperEPL2Ast.g:701:76: LPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_libFunctionWithClass4980); 

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
            int alt259=2;
            int LA259_0 = input.LA(1);

            if ( (LA259_0==GOES) ) {
                alt259=1;
            }
            else if ( ((LA259_0>=IN_SET && LA259_0<=REGEXP)||LA259_0==NOT_EXPR||(LA259_0>=SUM && LA259_0<=AVG)||(LA259_0>=COALESCE && LA259_0<=COUNT)||(LA259_0>=CASE && LA259_0<=CASE2)||LA259_0==LAST||(LA259_0>=PREVIOUS && LA259_0<=EXISTS)||(LA259_0>=LW && LA259_0<=CURRENT_TIMESTAMP)||LA259_0==NEWKW||(LA259_0>=NUMERIC_PARAM_RANGE && LA259_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA259_0>=EVAL_AND_EXPR && LA259_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA259_0==EVENT_PROP_EXPR||LA259_0==CONCAT||(LA259_0>=LIB_FUNC_CHAIN && LA259_0<=DOT_EXPR)||(LA259_0>=TIME_PERIOD && LA259_0<=ARRAY_EXPR)||(LA259_0>=NOT_IN_SET && LA259_0<=NOT_REGEXP)||(LA259_0>=IN_RANGE && LA259_0<=SUBSELECT_EXPR)||(LA259_0>=EXISTS_SUBSELECT_EXPR && LA259_0<=NOT_IN_SUBSELECT_EXPR)||(LA259_0>=LAST_OPERATOR && LA259_0<=SUBSTITUTION)||LA259_0==NUMBERSETSTAR||(LA259_0>=FIRST_AGGREG && LA259_0<=WINDOW_AGGREG)||(LA259_0>=INT_TYPE && LA259_0<=NULL_TYPE)||LA259_0==STAR||(LA259_0>=BOR && LA259_0<=PLUS)||(LA259_0>=BAND && LA259_0<=BXOR)||(LA259_0>=LT && LA259_0<=GE)||(LA259_0>=MINUS && LA259_0<=MOD)||(LA259_0>=EVAL_IS_GROUP_EXPR && LA259_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt259=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 259, 0, input);

                throw nvae;
            }
            switch (alt259) {
                case 1 :
                    // EsperEPL2Ast.g:705:4: expressionLambdaDecl
                    {
                    pushFollow(FOLLOW_expressionLambdaDecl_in_libFunctionArgItem4994);
                    expressionLambdaDecl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:705:27: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_libFunctionArgItem4998);
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
            int alt260=2;
            int LA260_0 = input.LA(1);

            if ( (LA260_0==EVENT_PROP_EXPR) ) {
                alt260=1;
            }
            else if ( (LA260_0==LIB_FUNCTION) ) {
                alt260=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 260, 0, input);

                throw nvae;
            }
            switch (alt260) {
                case 1 :
                    // EsperEPL2Ast.g:709:7: eventPropertyExpr[false]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_libOrPropFunction5013);
                    eventPropertyExpr(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:710:7: libFunctionWithClass
                    {
                    pushFollow(FOLLOW_libFunctionWithClass_in_libOrPropFunction5023);
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
            loop261:
            do {
                int alt261=2;
                int LA261_0 = input.LA(1);

                if ( (LA261_0==ANNOTATION) ) {
                    alt261=1;
                }


                switch (alt261) {
            	case 1 :
            	    // EsperEPL2Ast.g:717:4: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startPatternExpressionRule5038);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop261;
                }
            } while (true);

            pushFollow(FOLLOW_exprChoice_in_startPatternExpressionRule5042);
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
            int alt266=7;
            switch ( input.LA(1) ) {
            case PATTERN_FILTER_EXPR:
            case OBSERVER_EXPR:
                {
                alt266=1;
                }
                break;
            case OR_EXPR:
            case AND_EXPR:
            case FOLLOWED_BY_EXPR:
                {
                alt266=2;
                }
                break;
            case EVERY_EXPR:
                {
                alt266=3;
                }
                break;
            case EVERY_DISTINCT_EXPR:
                {
                alt266=4;
                }
                break;
            case PATTERN_NOT_EXPR:
                {
                alt266=5;
                }
                break;
            case GUARD_EXPR:
                {
                alt266=6;
                }
                break;
            case MATCH_UNTIL_EXPR:
                {
                alt266=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 266, 0, input);

                throw nvae;
            }

            switch (alt266) {
                case 1 :
                    // EsperEPL2Ast.g:721:5: atomicExpr
                    {
                    pushFollow(FOLLOW_atomicExpr_in_exprChoice5056);
                    atomicExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:722:4: patternOp
                    {
                    pushFollow(FOLLOW_patternOp_in_exprChoice5061);
                    patternOp();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:723:5: ^(a= EVERY_EXPR exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_EXPR,FOLLOW_EVERY_EXPR_in_exprChoice5071); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5073);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:724:5: ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_DISTINCT_EXPR,FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5087); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distinctExpressions_in_exprChoice5089);
                    distinctExpressions();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5091);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:725:5: ^(n= PATTERN_NOT_EXPR exprChoice )
                    {
                    n=(CommonTree)match(input,PATTERN_NOT_EXPR,FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5105); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5107);
                    exprChoice();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:726:5: ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) )
                    {
                    g=(CommonTree)match(input,GUARD_EXPR,FOLLOW_GUARD_EXPR_in_exprChoice5121); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5123);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:726:32: ( IDENT IDENT ( valueExprWithTime )* | valueExpr )
                    int alt263=2;
                    int LA263_0 = input.LA(1);

                    if ( (LA263_0==IDENT) ) {
                        alt263=1;
                    }
                    else if ( ((LA263_0>=IN_SET && LA263_0<=REGEXP)||LA263_0==NOT_EXPR||(LA263_0>=SUM && LA263_0<=AVG)||(LA263_0>=COALESCE && LA263_0<=COUNT)||(LA263_0>=CASE && LA263_0<=CASE2)||(LA263_0>=PREVIOUS && LA263_0<=EXISTS)||(LA263_0>=INSTANCEOF && LA263_0<=CURRENT_TIMESTAMP)||LA263_0==NEWKW||(LA263_0>=EVAL_AND_EXPR && LA263_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA263_0==EVENT_PROP_EXPR||LA263_0==CONCAT||(LA263_0>=LIB_FUNC_CHAIN && LA263_0<=DOT_EXPR)||LA263_0==ARRAY_EXPR||(LA263_0>=NOT_IN_SET && LA263_0<=NOT_REGEXP)||(LA263_0>=IN_RANGE && LA263_0<=SUBSELECT_EXPR)||(LA263_0>=EXISTS_SUBSELECT_EXPR && LA263_0<=NOT_IN_SUBSELECT_EXPR)||LA263_0==SUBSTITUTION||(LA263_0>=FIRST_AGGREG && LA263_0<=WINDOW_AGGREG)||(LA263_0>=INT_TYPE && LA263_0<=NULL_TYPE)||LA263_0==STAR||(LA263_0>=BOR && LA263_0<=PLUS)||(LA263_0>=BAND && LA263_0<=BXOR)||(LA263_0>=LT && LA263_0<=GE)||(LA263_0>=MINUS && LA263_0<=MOD)||(LA263_0>=EVAL_IS_GROUP_EXPR && LA263_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt263=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 263, 0, input);

                        throw nvae;
                    }
                    switch (alt263) {
                        case 1 :
                            // EsperEPL2Ast.g:726:33: IDENT IDENT ( valueExprWithTime )*
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5126); 
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5128); 
                            // EsperEPL2Ast.g:726:45: ( valueExprWithTime )*
                            loop262:
                            do {
                                int alt262=2;
                                int LA262_0 = input.LA(1);

                                if ( ((LA262_0>=IN_SET && LA262_0<=REGEXP)||LA262_0==NOT_EXPR||(LA262_0>=SUM && LA262_0<=AVG)||(LA262_0>=COALESCE && LA262_0<=COUNT)||(LA262_0>=CASE && LA262_0<=CASE2)||LA262_0==LAST||(LA262_0>=PREVIOUS && LA262_0<=EXISTS)||(LA262_0>=LW && LA262_0<=CURRENT_TIMESTAMP)||LA262_0==NEWKW||(LA262_0>=NUMERIC_PARAM_RANGE && LA262_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA262_0>=EVAL_AND_EXPR && LA262_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA262_0==EVENT_PROP_EXPR||LA262_0==CONCAT||(LA262_0>=LIB_FUNC_CHAIN && LA262_0<=DOT_EXPR)||(LA262_0>=TIME_PERIOD && LA262_0<=ARRAY_EXPR)||(LA262_0>=NOT_IN_SET && LA262_0<=NOT_REGEXP)||(LA262_0>=IN_RANGE && LA262_0<=SUBSELECT_EXPR)||(LA262_0>=EXISTS_SUBSELECT_EXPR && LA262_0<=NOT_IN_SUBSELECT_EXPR)||(LA262_0>=LAST_OPERATOR && LA262_0<=SUBSTITUTION)||LA262_0==NUMBERSETSTAR||(LA262_0>=FIRST_AGGREG && LA262_0<=WINDOW_AGGREG)||(LA262_0>=INT_TYPE && LA262_0<=NULL_TYPE)||LA262_0==STAR||(LA262_0>=BOR && LA262_0<=PLUS)||(LA262_0>=BAND && LA262_0<=BXOR)||(LA262_0>=LT && LA262_0<=GE)||(LA262_0>=MINUS && LA262_0<=MOD)||(LA262_0>=EVAL_IS_GROUP_EXPR && LA262_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt262=1;
                                }


                                switch (alt262) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:726:45: valueExprWithTime
                            	    {
                            	    pushFollow(FOLLOW_valueExprWithTime_in_exprChoice5130);
                            	    valueExprWithTime();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop262;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:726:66: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_exprChoice5135);
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
                    m=(CommonTree)match(input,MATCH_UNTIL_EXPR,FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5149); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:727:26: ( matchUntilRange )?
                    int alt264=2;
                    int LA264_0 = input.LA(1);

                    if ( ((LA264_0>=MATCH_UNTIL_RANGE_HALFOPEN && LA264_0<=MATCH_UNTIL_RANGE_BOUNDED)) ) {
                        alt264=1;
                    }
                    switch (alt264) {
                        case 1 :
                            // EsperEPL2Ast.g:727:26: matchUntilRange
                            {
                            pushFollow(FOLLOW_matchUntilRange_in_exprChoice5151);
                            matchUntilRange();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5154);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:727:54: ( exprChoice )?
                    int alt265=2;
                    int LA265_0 = input.LA(1);

                    if ( ((LA265_0>=OR_EXPR && LA265_0<=AND_EXPR)||(LA265_0>=EVERY_EXPR && LA265_0<=EVERY_DISTINCT_EXPR)||LA265_0==FOLLOWED_BY_EXPR||(LA265_0>=PATTERN_FILTER_EXPR && LA265_0<=PATTERN_NOT_EXPR)||(LA265_0>=GUARD_EXPR && LA265_0<=OBSERVER_EXPR)||LA265_0==MATCH_UNTIL_EXPR) ) {
                        alt265=1;
                    }
                    switch (alt265) {
                        case 1 :
                            // EsperEPL2Ast.g:727:54: exprChoice
                            {
                            pushFollow(FOLLOW_exprChoice_in_exprChoice5156);
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
            match(input,PATTERN_EVERY_DISTINCT_EXPR,FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5177); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:732:35: ( valueExprWithTime )+
            int cnt267=0;
            loop267:
            do {
                int alt267=2;
                int LA267_0 = input.LA(1);

                if ( ((LA267_0>=IN_SET && LA267_0<=REGEXP)||LA267_0==NOT_EXPR||(LA267_0>=SUM && LA267_0<=AVG)||(LA267_0>=COALESCE && LA267_0<=COUNT)||(LA267_0>=CASE && LA267_0<=CASE2)||LA267_0==LAST||(LA267_0>=PREVIOUS && LA267_0<=EXISTS)||(LA267_0>=LW && LA267_0<=CURRENT_TIMESTAMP)||LA267_0==NEWKW||(LA267_0>=NUMERIC_PARAM_RANGE && LA267_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA267_0>=EVAL_AND_EXPR && LA267_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA267_0==EVENT_PROP_EXPR||LA267_0==CONCAT||(LA267_0>=LIB_FUNC_CHAIN && LA267_0<=DOT_EXPR)||(LA267_0>=TIME_PERIOD && LA267_0<=ARRAY_EXPR)||(LA267_0>=NOT_IN_SET && LA267_0<=NOT_REGEXP)||(LA267_0>=IN_RANGE && LA267_0<=SUBSELECT_EXPR)||(LA267_0>=EXISTS_SUBSELECT_EXPR && LA267_0<=NOT_IN_SUBSELECT_EXPR)||(LA267_0>=LAST_OPERATOR && LA267_0<=SUBSTITUTION)||LA267_0==NUMBERSETSTAR||(LA267_0>=FIRST_AGGREG && LA267_0<=WINDOW_AGGREG)||(LA267_0>=INT_TYPE && LA267_0<=NULL_TYPE)||LA267_0==STAR||(LA267_0>=BOR && LA267_0<=PLUS)||(LA267_0>=BAND && LA267_0<=BXOR)||(LA267_0>=LT && LA267_0<=GE)||(LA267_0>=MINUS && LA267_0<=MOD)||(LA267_0>=EVAL_IS_GROUP_EXPR && LA267_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt267=1;
                }


                switch (alt267) {
            	case 1 :
            	    // EsperEPL2Ast.g:732:35: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_distinctExpressions5179);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt267 >= 1 ) break loop267;
                        EarlyExitException eee =
                            new EarlyExitException(267, input);
                        throw eee;
                }
                cnt267++;
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
            int alt271=3;
            switch ( input.LA(1) ) {
            case FOLLOWED_BY_EXPR:
                {
                alt271=1;
                }
                break;
            case OR_EXPR:
                {
                alt271=2;
                }
                break;
            case AND_EXPR:
                {
                alt271=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 271, 0, input);

                throw nvae;
            }

            switch (alt271) {
                case 1 :
                    // EsperEPL2Ast.g:736:4: ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* )
                    {
                    f=(CommonTree)match(input,FOLLOWED_BY_EXPR,FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5198); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_followedByItem_in_patternOp5200);
                    followedByItem();

                    state._fsp--;

                    pushFollow(FOLLOW_followedByItem_in_patternOp5202);
                    followedByItem();

                    state._fsp--;

                    // EsperEPL2Ast.g:736:56: ( followedByItem )*
                    loop268:
                    do {
                        int alt268=2;
                        int LA268_0 = input.LA(1);

                        if ( (LA268_0==FOLLOWED_BY_ITEM) ) {
                            alt268=1;
                        }


                        switch (alt268) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:736:57: followedByItem
                    	    {
                    	    pushFollow(FOLLOW_followedByItem_in_patternOp5205);
                    	    followedByItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop268;
                        }
                    } while (true);

                     leaveNode(f); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:737:5: ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    o=(CommonTree)match(input,OR_EXPR,FOLLOW_OR_EXPR_in_patternOp5221); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5223);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5225);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:737:40: ( exprChoice )*
                    loop269:
                    do {
                        int alt269=2;
                        int LA269_0 = input.LA(1);

                        if ( ((LA269_0>=OR_EXPR && LA269_0<=AND_EXPR)||(LA269_0>=EVERY_EXPR && LA269_0<=EVERY_DISTINCT_EXPR)||LA269_0==FOLLOWED_BY_EXPR||(LA269_0>=PATTERN_FILTER_EXPR && LA269_0<=PATTERN_NOT_EXPR)||(LA269_0>=GUARD_EXPR && LA269_0<=OBSERVER_EXPR)||LA269_0==MATCH_UNTIL_EXPR) ) {
                            alt269=1;
                        }


                        switch (alt269) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:737:41: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5228);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop269;
                        }
                    } while (true);

                     leaveNode(o); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:738:5: ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    a=(CommonTree)match(input,AND_EXPR,FOLLOW_AND_EXPR_in_patternOp5244); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5246);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5248);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:738:41: ( exprChoice )*
                    loop270:
                    do {
                        int alt270=2;
                        int LA270_0 = input.LA(1);

                        if ( ((LA270_0>=OR_EXPR && LA270_0<=AND_EXPR)||(LA270_0>=EVERY_EXPR && LA270_0<=EVERY_DISTINCT_EXPR)||LA270_0==FOLLOWED_BY_EXPR||(LA270_0>=PATTERN_FILTER_EXPR && LA270_0<=PATTERN_NOT_EXPR)||(LA270_0>=GUARD_EXPR && LA270_0<=OBSERVER_EXPR)||LA270_0==MATCH_UNTIL_EXPR) ) {
                            alt270=1;
                        }


                        switch (alt270) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:738:42: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5251);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop270;
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
            match(input,FOLLOWED_BY_ITEM,FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5272); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:742:24: ( valueExpr )?
            int alt272=2;
            int LA272_0 = input.LA(1);

            if ( ((LA272_0>=IN_SET && LA272_0<=REGEXP)||LA272_0==NOT_EXPR||(LA272_0>=SUM && LA272_0<=AVG)||(LA272_0>=COALESCE && LA272_0<=COUNT)||(LA272_0>=CASE && LA272_0<=CASE2)||(LA272_0>=PREVIOUS && LA272_0<=EXISTS)||(LA272_0>=INSTANCEOF && LA272_0<=CURRENT_TIMESTAMP)||LA272_0==NEWKW||(LA272_0>=EVAL_AND_EXPR && LA272_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA272_0==EVENT_PROP_EXPR||LA272_0==CONCAT||(LA272_0>=LIB_FUNC_CHAIN && LA272_0<=DOT_EXPR)||LA272_0==ARRAY_EXPR||(LA272_0>=NOT_IN_SET && LA272_0<=NOT_REGEXP)||(LA272_0>=IN_RANGE && LA272_0<=SUBSELECT_EXPR)||(LA272_0>=EXISTS_SUBSELECT_EXPR && LA272_0<=NOT_IN_SUBSELECT_EXPR)||LA272_0==SUBSTITUTION||(LA272_0>=FIRST_AGGREG && LA272_0<=WINDOW_AGGREG)||(LA272_0>=INT_TYPE && LA272_0<=NULL_TYPE)||LA272_0==STAR||(LA272_0>=BOR && LA272_0<=PLUS)||(LA272_0>=BAND && LA272_0<=BXOR)||(LA272_0>=LT && LA272_0<=GE)||(LA272_0>=MINUS && LA272_0<=MOD)||(LA272_0>=EVAL_IS_GROUP_EXPR && LA272_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt272=1;
            }
            switch (alt272) {
                case 1 :
                    // EsperEPL2Ast.g:742:24: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_followedByItem5274);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_exprChoice_in_followedByItem5277);
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
            int alt274=2;
            int LA274_0 = input.LA(1);

            if ( (LA274_0==PATTERN_FILTER_EXPR) ) {
                alt274=1;
            }
            else if ( (LA274_0==OBSERVER_EXPR) ) {
                alt274=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 274, 0, input);

                throw nvae;
            }
            switch (alt274) {
                case 1 :
                    // EsperEPL2Ast.g:746:4: patternFilterExpr
                    {
                    pushFollow(FOLLOW_patternFilterExpr_in_atomicExpr5291);
                    patternFilterExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:747:7: ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* )
                    {
                    ac=(CommonTree)match(input,OBSERVER_EXPR,FOLLOW_OBSERVER_EXPR_in_atomicExpr5303); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5305); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5307); 
                    // EsperEPL2Ast.g:747:39: ( valueExprWithTime )*
                    loop273:
                    do {
                        int alt273=2;
                        int LA273_0 = input.LA(1);

                        if ( ((LA273_0>=IN_SET && LA273_0<=REGEXP)||LA273_0==NOT_EXPR||(LA273_0>=SUM && LA273_0<=AVG)||(LA273_0>=COALESCE && LA273_0<=COUNT)||(LA273_0>=CASE && LA273_0<=CASE2)||LA273_0==LAST||(LA273_0>=PREVIOUS && LA273_0<=EXISTS)||(LA273_0>=LW && LA273_0<=CURRENT_TIMESTAMP)||LA273_0==NEWKW||(LA273_0>=NUMERIC_PARAM_RANGE && LA273_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA273_0>=EVAL_AND_EXPR && LA273_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA273_0==EVENT_PROP_EXPR||LA273_0==CONCAT||(LA273_0>=LIB_FUNC_CHAIN && LA273_0<=DOT_EXPR)||(LA273_0>=TIME_PERIOD && LA273_0<=ARRAY_EXPR)||(LA273_0>=NOT_IN_SET && LA273_0<=NOT_REGEXP)||(LA273_0>=IN_RANGE && LA273_0<=SUBSELECT_EXPR)||(LA273_0>=EXISTS_SUBSELECT_EXPR && LA273_0<=NOT_IN_SUBSELECT_EXPR)||(LA273_0>=LAST_OPERATOR && LA273_0<=SUBSTITUTION)||LA273_0==NUMBERSETSTAR||(LA273_0>=FIRST_AGGREG && LA273_0<=WINDOW_AGGREG)||(LA273_0>=INT_TYPE && LA273_0<=NULL_TYPE)||LA273_0==STAR||(LA273_0>=BOR && LA273_0<=PLUS)||(LA273_0>=BAND && LA273_0<=BXOR)||(LA273_0>=LT && LA273_0<=GE)||(LA273_0>=MINUS && LA273_0<=MOD)||(LA273_0>=EVAL_IS_GROUP_EXPR && LA273_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt273=1;
                        }


                        switch (alt273) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:747:39: valueExprWithTime
                    	    {
                    	    pushFollow(FOLLOW_valueExprWithTime_in_atomicExpr5309);
                    	    valueExprWithTime();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop273;
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
            f=(CommonTree)match(input,PATTERN_FILTER_EXPR,FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5329); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:751:29: ( IDENT )?
            int alt275=2;
            int LA275_0 = input.LA(1);

            if ( (LA275_0==IDENT) ) {
                alt275=1;
            }
            switch (alt275) {
                case 1 :
                    // EsperEPL2Ast.g:751:29: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_patternFilterExpr5331); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_patternFilterExpr5334); 
            // EsperEPL2Ast.g:751:48: ( propertyExpression )?
            int alt276=2;
            int LA276_0 = input.LA(1);

            if ( (LA276_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt276=1;
            }
            switch (alt276) {
                case 1 :
                    // EsperEPL2Ast.g:751:48: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_patternFilterExpr5336);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:751:68: ( patternFilterAnno )?
            int alt277=2;
            int LA277_0 = input.LA(1);

            if ( (LA277_0==ATCHAR) ) {
                alt277=1;
            }
            switch (alt277) {
                case 1 :
                    // EsperEPL2Ast.g:751:68: patternFilterAnno
                    {
                    pushFollow(FOLLOW_patternFilterAnno_in_patternFilterExpr5339);
                    patternFilterAnno();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:751:87: ( valueExpr )*
            loop278:
            do {
                int alt278=2;
                int LA278_0 = input.LA(1);

                if ( ((LA278_0>=IN_SET && LA278_0<=REGEXP)||LA278_0==NOT_EXPR||(LA278_0>=SUM && LA278_0<=AVG)||(LA278_0>=COALESCE && LA278_0<=COUNT)||(LA278_0>=CASE && LA278_0<=CASE2)||(LA278_0>=PREVIOUS && LA278_0<=EXISTS)||(LA278_0>=INSTANCEOF && LA278_0<=CURRENT_TIMESTAMP)||LA278_0==NEWKW||(LA278_0>=EVAL_AND_EXPR && LA278_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA278_0==EVENT_PROP_EXPR||LA278_0==CONCAT||(LA278_0>=LIB_FUNC_CHAIN && LA278_0<=DOT_EXPR)||LA278_0==ARRAY_EXPR||(LA278_0>=NOT_IN_SET && LA278_0<=NOT_REGEXP)||(LA278_0>=IN_RANGE && LA278_0<=SUBSELECT_EXPR)||(LA278_0>=EXISTS_SUBSELECT_EXPR && LA278_0<=NOT_IN_SUBSELECT_EXPR)||LA278_0==SUBSTITUTION||(LA278_0>=FIRST_AGGREG && LA278_0<=WINDOW_AGGREG)||(LA278_0>=INT_TYPE && LA278_0<=NULL_TYPE)||LA278_0==STAR||(LA278_0>=BOR && LA278_0<=PLUS)||(LA278_0>=BAND && LA278_0<=BXOR)||(LA278_0>=LT && LA278_0<=GE)||(LA278_0>=MINUS && LA278_0<=MOD)||(LA278_0>=EVAL_IS_GROUP_EXPR && LA278_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt278=1;
                }


                switch (alt278) {
            	case 1 :
            	    // EsperEPL2Ast.g:751:88: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_patternFilterExpr5343);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop278;
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
            match(input,ATCHAR,FOLLOW_ATCHAR_in_patternFilterAnno5363); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_patternFilterAnno5365); 
            // EsperEPL2Ast.g:755:20: ( number )?
            int alt279=2;
            int LA279_0 = input.LA(1);

            if ( ((LA279_0>=INT_TYPE && LA279_0<=DOUBLE_TYPE)) ) {
                alt279=1;
            }
            switch (alt279) {
                case 1 :
                    // EsperEPL2Ast.g:755:20: number
                    {
                    pushFollow(FOLLOW_number_in_patternFilterAnno5367);
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
            int alt280=4;
            switch ( input.LA(1) ) {
            case MATCH_UNTIL_RANGE_CLOSED:
                {
                alt280=1;
                }
                break;
            case MATCH_UNTIL_RANGE_BOUNDED:
                {
                alt280=2;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFCLOSED:
                {
                alt280=3;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFOPEN:
                {
                alt280=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 280, 0, input);

                throw nvae;
            }

            switch (alt280) {
                case 1 :
                    // EsperEPL2Ast.g:759:4: ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_CLOSED,FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5382); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5384);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5386);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:760:5: ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_BOUNDED,FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5394); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5396);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:761:5: ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFCLOSED,FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5404); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5406);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:762:4: ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFOPEN,FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5413); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5415);
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
            match(input,EVENT_FILTER_PARAM,FOLLOW_EVENT_FILTER_PARAM_in_filterParam5428); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_filterParam5430);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:766:35: ( valueExpr )*
            loop281:
            do {
                int alt281=2;
                int LA281_0 = input.LA(1);

                if ( ((LA281_0>=IN_SET && LA281_0<=REGEXP)||LA281_0==NOT_EXPR||(LA281_0>=SUM && LA281_0<=AVG)||(LA281_0>=COALESCE && LA281_0<=COUNT)||(LA281_0>=CASE && LA281_0<=CASE2)||(LA281_0>=PREVIOUS && LA281_0<=EXISTS)||(LA281_0>=INSTANCEOF && LA281_0<=CURRENT_TIMESTAMP)||LA281_0==NEWKW||(LA281_0>=EVAL_AND_EXPR && LA281_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA281_0==EVENT_PROP_EXPR||LA281_0==CONCAT||(LA281_0>=LIB_FUNC_CHAIN && LA281_0<=DOT_EXPR)||LA281_0==ARRAY_EXPR||(LA281_0>=NOT_IN_SET && LA281_0<=NOT_REGEXP)||(LA281_0>=IN_RANGE && LA281_0<=SUBSELECT_EXPR)||(LA281_0>=EXISTS_SUBSELECT_EXPR && LA281_0<=NOT_IN_SUBSELECT_EXPR)||LA281_0==SUBSTITUTION||(LA281_0>=FIRST_AGGREG && LA281_0<=WINDOW_AGGREG)||(LA281_0>=INT_TYPE && LA281_0<=NULL_TYPE)||LA281_0==STAR||(LA281_0>=BOR && LA281_0<=PLUS)||(LA281_0>=BAND && LA281_0<=BXOR)||(LA281_0>=LT && LA281_0<=GE)||(LA281_0>=MINUS && LA281_0<=MOD)||(LA281_0>=EVAL_IS_GROUP_EXPR && LA281_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt281=1;
                }


                switch (alt281) {
            	case 1 :
            	    // EsperEPL2Ast.g:766:36: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_filterParam5433);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop281;
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
            int alt294=12;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt294=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt294=2;
                }
                break;
            case LT:
                {
                alt294=3;
                }
                break;
            case LE:
                {
                alt294=4;
                }
                break;
            case GT:
                {
                alt294=5;
                }
                break;
            case GE:
                {
                alt294=6;
                }
                break;
            case EVENT_FILTER_RANGE:
                {
                alt294=7;
                }
                break;
            case EVENT_FILTER_NOT_RANGE:
                {
                alt294=8;
                }
                break;
            case EVENT_FILTER_IN:
                {
                alt294=9;
                }
                break;
            case EVENT_FILTER_NOT_IN:
                {
                alt294=10;
                }
                break;
            case EVENT_FILTER_BETWEEN:
                {
                alt294=11;
                }
                break;
            case EVENT_FILTER_NOT_BETWEEN:
                {
                alt294=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 294, 0, input);

                throw nvae;
            }

            switch (alt294) {
                case 1 :
                    // EsperEPL2Ast.g:770:4: ^( EQUALS filterAtom )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_filterParamComparator5449); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5451);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:771:4: ^( NOT_EQUAL filterAtom )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_filterParamComparator5458); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5460);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:772:4: ^( LT filterAtom )
                    {
                    match(input,LT,FOLLOW_LT_in_filterParamComparator5467); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5469);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:773:4: ^( LE filterAtom )
                    {
                    match(input,LE,FOLLOW_LE_in_filterParamComparator5476); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5478);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:774:4: ^( GT filterAtom )
                    {
                    match(input,GT,FOLLOW_GT_in_filterParamComparator5485); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5487);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:775:4: ^( GE filterAtom )
                    {
                    match(input,GE,FOLLOW_GE_in_filterParamComparator5494); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5496);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:776:4: ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_RANGE,FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5503); 

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
                            // EsperEPL2Ast.g:776:42: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5512);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:776:58: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5515);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:776:76: ( constant[false] | filterIdentifier )
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
                            // EsperEPL2Ast.g:776:77: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5519);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:776:93: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5522);
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
                    match(input,EVENT_FILTER_NOT_RANGE,FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5536); 

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
                            // EsperEPL2Ast.g:777:46: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5545);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:777:62: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5548);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:777:80: ( constant[false] | filterIdentifier )
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
                            // EsperEPL2Ast.g:777:81: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5552);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:777:97: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5555);
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
                    match(input,EVENT_FILTER_IN,FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5569); 

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
                    int alt286=2;
                    int LA286_0 = input.LA(1);

                    if ( ((LA286_0>=INT_TYPE && LA286_0<=NULL_TYPE)) ) {
                        alt286=1;
                    }
                    else if ( (LA286_0==EVENT_FILTER_IDENT) ) {
                        alt286=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 286, 0, input);

                        throw nvae;
                    }
                    switch (alt286) {
                        case 1 :
                            // EsperEPL2Ast.g:778:39: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5578);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:778:55: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5581);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:778:73: ( constant[false] | filterIdentifier )*
                    loop287:
                    do {
                        int alt287=3;
                        int LA287_0 = input.LA(1);

                        if ( ((LA287_0>=INT_TYPE && LA287_0<=NULL_TYPE)) ) {
                            alt287=1;
                        }
                        else if ( (LA287_0==EVENT_FILTER_IDENT) ) {
                            alt287=2;
                        }


                        switch (alt287) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:778:74: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5585);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:778:90: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5588);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop287;
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
                    match(input,EVENT_FILTER_NOT_IN,FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5603); 

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
                    int alt288=2;
                    int LA288_0 = input.LA(1);

                    if ( ((LA288_0>=INT_TYPE && LA288_0<=NULL_TYPE)) ) {
                        alt288=1;
                    }
                    else if ( (LA288_0==EVENT_FILTER_IDENT) ) {
                        alt288=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 288, 0, input);

                        throw nvae;
                    }
                    switch (alt288) {
                        case 1 :
                            // EsperEPL2Ast.g:779:43: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5612);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:779:59: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5615);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:779:77: ( constant[false] | filterIdentifier )*
                    loop289:
                    do {
                        int alt289=3;
                        int LA289_0 = input.LA(1);

                        if ( ((LA289_0>=INT_TYPE && LA289_0<=NULL_TYPE)) ) {
                            alt289=1;
                        }
                        else if ( (LA289_0==EVENT_FILTER_IDENT) ) {
                            alt289=2;
                        }


                        switch (alt289) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:779:78: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5619);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:779:94: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5622);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop289;
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
                    match(input,EVENT_FILTER_BETWEEN,FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator5637); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:780:27: ( constant[false] | filterIdentifier )
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
                            // EsperEPL2Ast.g:780:28: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5640);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:780:44: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5643);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:780:62: ( constant[false] | filterIdentifier )
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
                            // EsperEPL2Ast.g:780:63: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5647);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:780:79: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5650);
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
                    match(input,EVENT_FILTER_NOT_BETWEEN,FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator5658); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:781:31: ( constant[false] | filterIdentifier )
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
                            // EsperEPL2Ast.g:781:32: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5661);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:781:48: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5664);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:781:66: ( constant[false] | filterIdentifier )
                    int alt293=2;
                    int LA293_0 = input.LA(1);

                    if ( ((LA293_0>=INT_TYPE && LA293_0<=NULL_TYPE)) ) {
                        alt293=1;
                    }
                    else if ( (LA293_0==EVENT_FILTER_IDENT) ) {
                        alt293=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 293, 0, input);

                        throw nvae;
                    }
                    switch (alt293) {
                        case 1 :
                            // EsperEPL2Ast.g:781:67: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5668);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:781:83: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5671);
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
            int alt295=2;
            int LA295_0 = input.LA(1);

            if ( ((LA295_0>=INT_TYPE && LA295_0<=NULL_TYPE)) ) {
                alt295=1;
            }
            else if ( (LA295_0==EVENT_FILTER_IDENT) ) {
                alt295=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 295, 0, input);

                throw nvae;
            }
            switch (alt295) {
                case 1 :
                    // EsperEPL2Ast.g:785:4: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_filterAtom5685);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:786:4: filterIdentifier
                    {
                    pushFollow(FOLLOW_filterIdentifier_in_filterAtom5691);
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
            match(input,EVENT_FILTER_IDENT,FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier5702); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_filterIdentifier5704); 
            pushFollow(FOLLOW_eventPropertyExpr_in_filterIdentifier5706);
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
            p=(CommonTree)match(input,EVENT_PROP_EXPR,FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr5725); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5727);
            eventPropertyAtomic();

            state._fsp--;

            // EsperEPL2Ast.g:793:44: ( eventPropertyAtomic )*
            loop296:
            do {
                int alt296=2;
                int LA296_0 = input.LA(1);

                if ( ((LA296_0>=EVENT_PROP_SIMPLE && LA296_0<=EVENT_PROP_DYNAMIC_MAPPED)) ) {
                    alt296=1;
                }


                switch (alt296) {
            	case 1 :
            	    // EsperEPL2Ast.g:793:45: eventPropertyAtomic
            	    {
            	    pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5730);
            	    eventPropertyAtomic();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop296;
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
            int alt297=6;
            switch ( input.LA(1) ) {
            case EVENT_PROP_SIMPLE:
                {
                alt297=1;
                }
                break;
            case EVENT_PROP_INDEXED:
                {
                alt297=2;
                }
                break;
            case EVENT_PROP_MAPPED:
                {
                alt297=3;
                }
                break;
            case EVENT_PROP_DYNAMIC_SIMPLE:
                {
                alt297=4;
                }
                break;
            case EVENT_PROP_DYNAMIC_INDEXED:
                {
                alt297=5;
                }
                break;
            case EVENT_PROP_DYNAMIC_MAPPED:
                {
                alt297=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 297, 0, input);

                throw nvae;
            }

            switch (alt297) {
                case 1 :
                    // EsperEPL2Ast.g:797:4: ^( EVENT_PROP_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_SIMPLE,FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic5749); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5751); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:798:4: ^( EVENT_PROP_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_INDEXED,FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic5758); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5760); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic5762); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:799:4: ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_MAPPED,FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic5769); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5771); 
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
                    match(input,EVENT_PROP_DYNAMIC_SIMPLE,FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic5786); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5788); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:801:4: ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_INDEXED,FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic5795); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5797); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic5799); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:802:4: ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_DYNAMIC_MAPPED,FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic5806); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic5808); 
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
            t=(CommonTree)match(input,TIME_PERIOD,FOLLOW_TIME_PERIOD_in_timePeriod5835); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_timePeriodDef_in_timePeriod5837);
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
            int alt326=8;
            switch ( input.LA(1) ) {
            case YEAR_PART:
                {
                alt326=1;
                }
                break;
            case MONTH_PART:
                {
                alt326=2;
                }
                break;
            case WEEK_PART:
                {
                alt326=3;
                }
                break;
            case DAY_PART:
                {
                alt326=4;
                }
                break;
            case HOUR_PART:
                {
                alt326=5;
                }
                break;
            case MINUTE_PART:
                {
                alt326=6;
                }
                break;
            case SECOND_PART:
                {
                alt326=7;
                }
                break;
            case MILLISECOND_PART:
                {
                alt326=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 326, 0, input);

                throw nvae;
            }

            switch (alt326) {
                case 1 :
                    // EsperEPL2Ast.g:810:5: yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_yearPart_in_timePeriodDef5853);
                    yearPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:810:14: ( monthPart )?
                    int alt298=2;
                    int LA298_0 = input.LA(1);

                    if ( (LA298_0==MONTH_PART) ) {
                        alt298=1;
                    }
                    switch (alt298) {
                        case 1 :
                            // EsperEPL2Ast.g:810:15: monthPart
                            {
                            pushFollow(FOLLOW_monthPart_in_timePeriodDef5856);
                            monthPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:27: ( weekPart )?
                    int alt299=2;
                    int LA299_0 = input.LA(1);

                    if ( (LA299_0==WEEK_PART) ) {
                        alt299=1;
                    }
                    switch (alt299) {
                        case 1 :
                            // EsperEPL2Ast.g:810:28: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef5861);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:39: ( dayPart )?
                    int alt300=2;
                    int LA300_0 = input.LA(1);

                    if ( (LA300_0==DAY_PART) ) {
                        alt300=1;
                    }
                    switch (alt300) {
                        case 1 :
                            // EsperEPL2Ast.g:810:40: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5866);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:50: ( hourPart )?
                    int alt301=2;
                    int LA301_0 = input.LA(1);

                    if ( (LA301_0==HOUR_PART) ) {
                        alt301=1;
                    }
                    switch (alt301) {
                        case 1 :
                            // EsperEPL2Ast.g:810:51: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5871);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:62: ( minutePart )?
                    int alt302=2;
                    int LA302_0 = input.LA(1);

                    if ( (LA302_0==MINUTE_PART) ) {
                        alt302=1;
                    }
                    switch (alt302) {
                        case 1 :
                            // EsperEPL2Ast.g:810:63: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5876);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:76: ( secondPart )?
                    int alt303=2;
                    int LA303_0 = input.LA(1);

                    if ( (LA303_0==SECOND_PART) ) {
                        alt303=1;
                    }
                    switch (alt303) {
                        case 1 :
                            // EsperEPL2Ast.g:810:77: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5881);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:810:90: ( millisecondPart )?
                    int alt304=2;
                    int LA304_0 = input.LA(1);

                    if ( (LA304_0==MILLISECOND_PART) ) {
                        alt304=1;
                    }
                    switch (alt304) {
                        case 1 :
                            // EsperEPL2Ast.g:810:91: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5886);
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
                    pushFollow(FOLLOW_monthPart_in_timePeriodDef5894);
                    monthPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:811:15: ( weekPart )?
                    int alt305=2;
                    int LA305_0 = input.LA(1);

                    if ( (LA305_0==WEEK_PART) ) {
                        alt305=1;
                    }
                    switch (alt305) {
                        case 1 :
                            // EsperEPL2Ast.g:811:16: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef5897);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:27: ( dayPart )?
                    int alt306=2;
                    int LA306_0 = input.LA(1);

                    if ( (LA306_0==DAY_PART) ) {
                        alt306=1;
                    }
                    switch (alt306) {
                        case 1 :
                            // EsperEPL2Ast.g:811:28: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5902);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:38: ( hourPart )?
                    int alt307=2;
                    int LA307_0 = input.LA(1);

                    if ( (LA307_0==HOUR_PART) ) {
                        alt307=1;
                    }
                    switch (alt307) {
                        case 1 :
                            // EsperEPL2Ast.g:811:39: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5907);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:50: ( minutePart )?
                    int alt308=2;
                    int LA308_0 = input.LA(1);

                    if ( (LA308_0==MINUTE_PART) ) {
                        alt308=1;
                    }
                    switch (alt308) {
                        case 1 :
                            // EsperEPL2Ast.g:811:51: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5912);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:64: ( secondPart )?
                    int alt309=2;
                    int LA309_0 = input.LA(1);

                    if ( (LA309_0==SECOND_PART) ) {
                        alt309=1;
                    }
                    switch (alt309) {
                        case 1 :
                            // EsperEPL2Ast.g:811:65: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5917);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:811:78: ( millisecondPart )?
                    int alt310=2;
                    int LA310_0 = input.LA(1);

                    if ( (LA310_0==MILLISECOND_PART) ) {
                        alt310=1;
                    }
                    switch (alt310) {
                        case 1 :
                            // EsperEPL2Ast.g:811:79: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5922);
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
                    pushFollow(FOLLOW_weekPart_in_timePeriodDef5930);
                    weekPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:812:14: ( dayPart )?
                    int alt311=2;
                    int LA311_0 = input.LA(1);

                    if ( (LA311_0==DAY_PART) ) {
                        alt311=1;
                    }
                    switch (alt311) {
                        case 1 :
                            // EsperEPL2Ast.g:812:15: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef5933);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:25: ( hourPart )?
                    int alt312=2;
                    int LA312_0 = input.LA(1);

                    if ( (LA312_0==HOUR_PART) ) {
                        alt312=1;
                    }
                    switch (alt312) {
                        case 1 :
                            // EsperEPL2Ast.g:812:26: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5938);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:37: ( minutePart )?
                    int alt313=2;
                    int LA313_0 = input.LA(1);

                    if ( (LA313_0==MINUTE_PART) ) {
                        alt313=1;
                    }
                    switch (alt313) {
                        case 1 :
                            // EsperEPL2Ast.g:812:38: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5943);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:51: ( secondPart )?
                    int alt314=2;
                    int LA314_0 = input.LA(1);

                    if ( (LA314_0==SECOND_PART) ) {
                        alt314=1;
                    }
                    switch (alt314) {
                        case 1 :
                            // EsperEPL2Ast.g:812:52: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5948);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:812:65: ( millisecondPart )?
                    int alt315=2;
                    int LA315_0 = input.LA(1);

                    if ( (LA315_0==MILLISECOND_PART) ) {
                        alt315=1;
                    }
                    switch (alt315) {
                        case 1 :
                            // EsperEPL2Ast.g:812:66: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5953);
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
                    pushFollow(FOLLOW_dayPart_in_timePeriodDef5961);
                    dayPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:813:13: ( hourPart )?
                    int alt316=2;
                    int LA316_0 = input.LA(1);

                    if ( (LA316_0==HOUR_PART) ) {
                        alt316=1;
                    }
                    switch (alt316) {
                        case 1 :
                            // EsperEPL2Ast.g:813:14: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef5964);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:813:25: ( minutePart )?
                    int alt317=2;
                    int LA317_0 = input.LA(1);

                    if ( (LA317_0==MINUTE_PART) ) {
                        alt317=1;
                    }
                    switch (alt317) {
                        case 1 :
                            // EsperEPL2Ast.g:813:26: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5969);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:813:39: ( secondPart )?
                    int alt318=2;
                    int LA318_0 = input.LA(1);

                    if ( (LA318_0==SECOND_PART) ) {
                        alt318=1;
                    }
                    switch (alt318) {
                        case 1 :
                            // EsperEPL2Ast.g:813:40: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5974);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:813:53: ( millisecondPart )?
                    int alt319=2;
                    int LA319_0 = input.LA(1);

                    if ( (LA319_0==MILLISECOND_PART) ) {
                        alt319=1;
                    }
                    switch (alt319) {
                        case 1 :
                            // EsperEPL2Ast.g:813:54: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5979);
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
                    pushFollow(FOLLOW_hourPart_in_timePeriodDef5986);
                    hourPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:814:13: ( minutePart )?
                    int alt320=2;
                    int LA320_0 = input.LA(1);

                    if ( (LA320_0==MINUTE_PART) ) {
                        alt320=1;
                    }
                    switch (alt320) {
                        case 1 :
                            // EsperEPL2Ast.g:814:14: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef5989);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:814:27: ( secondPart )?
                    int alt321=2;
                    int LA321_0 = input.LA(1);

                    if ( (LA321_0==SECOND_PART) ) {
                        alt321=1;
                    }
                    switch (alt321) {
                        case 1 :
                            // EsperEPL2Ast.g:814:28: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef5994);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:814:41: ( millisecondPart )?
                    int alt322=2;
                    int LA322_0 = input.LA(1);

                    if ( (LA322_0==MILLISECOND_PART) ) {
                        alt322=1;
                    }
                    switch (alt322) {
                        case 1 :
                            // EsperEPL2Ast.g:814:42: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef5999);
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
                    pushFollow(FOLLOW_minutePart_in_timePeriodDef6006);
                    minutePart();

                    state._fsp--;

                    // EsperEPL2Ast.g:815:15: ( secondPart )?
                    int alt323=2;
                    int LA323_0 = input.LA(1);

                    if ( (LA323_0==SECOND_PART) ) {
                        alt323=1;
                    }
                    switch (alt323) {
                        case 1 :
                            // EsperEPL2Ast.g:815:16: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6009);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:815:29: ( millisecondPart )?
                    int alt324=2;
                    int LA324_0 = input.LA(1);

                    if ( (LA324_0==MILLISECOND_PART) ) {
                        alt324=1;
                    }
                    switch (alt324) {
                        case 1 :
                            // EsperEPL2Ast.g:815:30: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6014);
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
                    pushFollow(FOLLOW_secondPart_in_timePeriodDef6021);
                    secondPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:816:15: ( millisecondPart )?
                    int alt325=2;
                    int LA325_0 = input.LA(1);

                    if ( (LA325_0==MILLISECOND_PART) ) {
                        alt325=1;
                    }
                    switch (alt325) {
                        case 1 :
                            // EsperEPL2Ast.g:816:16: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6024);
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
                    pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6031);
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
            match(input,YEAR_PART,FOLLOW_YEAR_PART_in_yearPart6045); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_yearPart6047);
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
            match(input,MONTH_PART,FOLLOW_MONTH_PART_in_monthPart6062); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_monthPart6064);
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
            match(input,WEEK_PART,FOLLOW_WEEK_PART_in_weekPart6079); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_weekPart6081);
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
            match(input,DAY_PART,FOLLOW_DAY_PART_in_dayPart6096); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dayPart6098);
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
            match(input,HOUR_PART,FOLLOW_HOUR_PART_in_hourPart6113); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_hourPart6115);
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
            match(input,MINUTE_PART,FOLLOW_MINUTE_PART_in_minutePart6130); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_minutePart6132);
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
            match(input,SECOND_PART,FOLLOW_SECOND_PART_in_secondPart6147); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_secondPart6149);
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
            match(input,MILLISECOND_PART,FOLLOW_MILLISECOND_PART_in_millisecondPart6164); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_millisecondPart6166);
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
            s=(CommonTree)match(input,SUBSTITUTION,FOLLOW_SUBSTITUTION_in_substitution6181); 
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
            int alt327=7;
            switch ( input.LA(1) ) {
            case INT_TYPE:
                {
                alt327=1;
                }
                break;
            case LONG_TYPE:
                {
                alt327=2;
                }
                break;
            case FLOAT_TYPE:
                {
                alt327=3;
                }
                break;
            case DOUBLE_TYPE:
                {
                alt327=4;
                }
                break;
            case STRING_TYPE:
                {
                alt327=5;
                }
                break;
            case BOOL_TYPE:
                {
                alt327=6;
                }
                break;
            case NULL_TYPE:
                {
                alt327=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 327, 0, input);

                throw nvae;
            }

            switch (alt327) {
                case 1 :
                    // EsperEPL2Ast.g:857:4: c= INT_TYPE
                    {
                    c=(CommonTree)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_constant6197); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:858:4: c= LONG_TYPE
                    {
                    c=(CommonTree)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_constant6206); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:859:4: c= FLOAT_TYPE
                    {
                    c=(CommonTree)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_constant6215); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:860:4: c= DOUBLE_TYPE
                    {
                    c=(CommonTree)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_constant6224); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:861:11: c= STRING_TYPE
                    {
                    c=(CommonTree)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_constant6240); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:862:11: c= BOOL_TYPE
                    {
                    c=(CommonTree)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_constant6256); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:863:8: c= NULL_TYPE
                    {
                    c=(CommonTree)match(input,NULL_TYPE,FOLLOW_NULL_TYPE_in_constant6269); 
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
    public static final BitSet FOLLOW_CLASS_IDENT_in_annotation94 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000007F0000001CL});
    public static final BitSet FOLLOW_elementValuePair_in_annotation96 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000007F0000001CL});
    public static final BitSet FOLLOW_elementValue_in_annotation99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_VALUE_in_elementValuePair117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_elementValuePair119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000007F0000000CL});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_in_elementValue148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_ARRAY_in_elementValue156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elementValue_in_elementValue158 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000007F0000000CL});
    public static final BitSet FOLLOW_constant_in_elementValue169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_elementValue179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDecl204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl206 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_expressionDef_in_expressionDecl208 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000020L,0x0210000000000000L});
    public static final BitSet FOLLOW_exprCol_in_expressionDecl210 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0210000000000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_expressionDecl213 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0210000000000000L});
    public static final BitSet FOLLOW_COLON_in_expressionDecl218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LBRACK_in_expressionDecl225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionDef242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_expressionDef244 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
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
    public static final BitSet FOLLOW_eventFilterExpr_in_onStreamExpr454 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_onStreamExpr459 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_onStreamExpr462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_MERGE_EXPR_in_onMergeExpr480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000018000L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000018000L});
    public static final BitSet FOLLOW_mergeItem_in_onMergeExpr487 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0040000000018000L});
    public static final BitSet FOLLOW_whereClause_in_onMergeExpr490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeMatched_in_mergeItem506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mergeUnmatched_in_mergeItem510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_MAT_in_mergeMatched525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeMatchedItem_in_mergeMatched527 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000E00E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_mergeMatched530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_UPD_in_mergeMatchedItem548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_mergeMatchedItem550 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_DEL_in_mergeMatchedItem566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_INT_TYPE_in_mergeMatchedItem572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeMatchedItem580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_UNM_in_mergeUnmatched594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeUnmatched596 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000E00E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_mergeUnmatched599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_INS_in_mergeInsert618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectionList_in_mergeInsert620 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000041000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_mergeInsert622 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_mergeInsert625 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_mergeInsert628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_EXPR_in_updateExpr648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_updateExpr650 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0040000000000400L});
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
    public static final BitSet FOLLOW_eventPropertyExpr_in_onSetAssignment837 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_onSetAssignment840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_FROM_in_onExprFrom854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom856 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
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
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_indexColList_in_createIndexExpr972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexColList987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexCol_in_indexColList989 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexCol1004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_indexCol1006 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
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
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1089 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_createColTypeListElement1091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createSelectionListElement1136 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_createSelectionListElement1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createVariableExpr1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1205 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0040007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1207 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_createVariableExpr1210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextExpr1229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextExpr1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000002F800000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextExpr1233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1251 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000200000000000L,0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_INIT_in_createContextDetail1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1262 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000200000000000L,0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_PART_in_createContextDetail1271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextPartitionItem_in_createContextDetail1273 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_CREATE_CTX_CAT_in_createContextDetail1281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCategoryItem_in_createContextDetail1283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextDetail1286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_COAL_in_createContextDetail1294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCoalesceItem_in_createContextDetail1296 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_number_in_createContextDetail1301 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_NESTED_in_createContextDetail1311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1315 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_createContextFilter_in_createContextRangePoint1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_CTX_PATTERN_in_createContextRangePoint1336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_createContextRangePoint1338 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextRangePoint1340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_createContextRangePoint1353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_createContextRangePoint1355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextNested1371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextNested1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000002F800000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextNested1375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_createContextFilter1388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextFilter1390 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextFilter1393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_createContextPartitionItem1409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextPartitionItem1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createContextPartitionItem1414 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_COALESCE_in_createContextCoalesceItem1431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextCoalesceItem1435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createContextCategoryItem1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createContextCategoryItem1455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1474 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000009000000L,0x8000200000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_variantList_in_createSchemaExpr1477 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_createColTypeList_in_createSchemaExpr1479 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_VAR_in_createSchemaExpr1485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_createSchemaQual_in_createSchemaExpr1492 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaQual1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_createSchemaQual1514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIANT_LIST_in_variantList1530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_variantList1532 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_insertIntoExpr_in_selectExpr1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_selectClause_in_selectExpr1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fromClause_in_selectExpr1561 = new BitSet(new long[]{0x0000000000000002L,0x0001200000000000L,0xE0180000C0000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_matchRecogClause_in_selectExpr1566 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE0180000C0000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_whereClause_in_selectExpr1573 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE018000080000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_groupByClause_in_selectExpr1581 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE010000080000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_havingClause_in_selectExpr1588 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xE010000000000000L,0x000000000000000DL});
    public static final BitSet FOLLOW_outputLimitExpr_in_selectExpr1595 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_selectExpr1602 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_selectExpr1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_insertIntoExpr1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_insertIntoExpr1637 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprCol_in_insertIntoExpr1640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRCOL_in_exprCol1659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_exprCol1661 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_exprCol1664 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SELECTION_EXPR_in_selectClause1682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_selectClause1684 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause1697 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_selectClause1700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause1714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause1717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0007A00000000000L});
    public static final BitSet FOLLOW_outerJoin_in_fromClause1720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0007A00000000000L});
    public static final BitSet FOLLOW_FOR_in_forExpr1740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_forExpr1742 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_forExpr1744 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause1763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPartitionBy_in_matchRecogClause1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_matchRecogMeasures_in_matchRecogClause1772 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_ALL_in_matchRecogClause1778 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause1784 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000420000000000L});
    public static final BitSet FOLLOW_matchRecogPattern_in_matchRecogClause1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesInterval_in_matchRecogClause1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_matchRecogDefine_in_matchRecogClause1802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy1820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogPartitionBy1822 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip1839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1845 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_set_in_matchRecogMatchesAfterSkip1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip1853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval1868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesInterval1870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_timePeriod_in_matchRecogMatchesInterval1872 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures1888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures1890 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement1907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogMeasureListElement1909 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMeasureListElement1911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern1931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern1933 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration1956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration1960 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat1978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat1980 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000240000000000L});
    public static final BitSet FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2017 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternNested2019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogPatternAtom2050 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternAtom2054 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_QUESTION_in_matchRecogPatternAtom2066 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogDefineItem_in_matchRecogDefine2090 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogDefineItem2109 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogDefineItem2111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2128 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2131 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_selectionListElement2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_selectionListElement2159 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECTION_STREAM_in_selectionListElement2176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2178 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2205 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2222 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2239 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNERJOIN_EXPR_in_outerJoin2254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2256 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_streamExpression2301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_streamExpression2304 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_streamExpression2309 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_databaseJoinExpression_in_streamExpression2313 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_methodJoinExpression_in_streamExpression2317 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_streamExpression2321 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_streamExpression2326 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_UNIDIRECTIONAL_in_streamExpression2331 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_streamExpression2335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventFilterExpr2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_eventFilterExpr2365 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000800L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_propertyExpression_in_eventFilterExpr2367 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_eventFilterExpr2371 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertyExpressionAtom_in_propertyExpression2393 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SELECT_in_propertyExpressionAtom2416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2418 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ATCHAR_in_propertyExpressionAtom2428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertySelectionListElement2475 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2494 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternInclusionExpression2520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_databaseJoinExpression2539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2541 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_methodJoinExpression2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_methodJoinExpression2574 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_methodJoinExpression2577 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_VIEW_EXPR_in_viewExpr2611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2615 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_viewExpr2618 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_WHERE_EXPR_in_whereClause2640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_whereClause2642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_EXPR_in_groupByClause2660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause2662 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause2665 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_ORDER_BY_EXPR_in_orderByClause2683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause2685 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause2688 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement2708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_orderByElement2710 = new BitSet(new long[]{0x0600000000000008L});
    public static final BitSet FOLLOW_set_in_orderByElement2712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_EXPR_in_havingClause2735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_havingClause2737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr2755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000F00000000L});
    public static final BitSet FOLLOW_number_in_outputLimitExpr2769 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_outputLimitExpr2771 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2774 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr2794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitExpr2807 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2809 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr2828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_outputLimitExpr2841 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2843 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2846 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr2862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2864 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitExpr2875 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0080000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr2877 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2880 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2883 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr2899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr2901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2912 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0080000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr2914 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2917 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr2933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr2935 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr2937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitAndTerm2954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitAndTerm2956 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitAndTerm2959 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_in_outputLimitAfter2973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitAfter2975 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_number_in_outputLimitAfter2978 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause2994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_rowLimitClause2997 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x2040000F00000000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause2999 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x2040000F00000000L});
    public static final BitSet FOLLOW_number_in_rowLimitClause3003 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause3005 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_rowLimitClause3009 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L});
    public static final BitSet FOLLOW_OFFSET_in_rowLimitClause3012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3032 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3034 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3036 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3038 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3040 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_relationalExpr3059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_relationalExpr3074 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3076 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_relationalExpr3089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_relationalExpr3103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3127 = new BitSet(new long[]{0x0003800037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExprValue3152 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023F83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3161 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_relationalExprValue3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3194 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3196 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3199 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3215 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3217 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3220 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3236 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3252 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3268 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3284 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXPR_in_evalExprChoice3354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpr_in_evalExprChoice3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3378 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_set_in_equalsSubquery3380 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023F83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3389 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_equalsSubquery3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpr3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_substitution_in_valueExpr3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticExpr_in_valueExpr3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_valueExpr3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalExprChoice_in_valueExpr3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinFunc_in_valueExpr3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFuncChain_in_valueExpr3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpr_in_valueExpr3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inExpr_in_valueExpr3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenExpr_in_valueExpr3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeExpr_in_valueExpr3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regExpExpr_in_valueExpr3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpr_in_valueExpr3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectInExpr_in_valueExpr3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectRowExpr_in_valueExpr3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectExistsExpr_in_valueExpr3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpr_in_valueExpr3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_valueExpr3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_valueExprWithTime3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LW_in_valueExprWithTime3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3547 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_valueExprWithTime3549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rangeOperator_in_valueExprWithTime3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_valueExprWithTime3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lastOperator_in_valueExprWithTime3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekDayOperator_in_valueExprWithTime3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericParameterList_in_valueExprWithTime3590 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000000000AL,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timePeriod_in_valueExprWithTime3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_numericParameterList3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeOperator_in_numericParameterList3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_numericParameterList3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator3650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_rangeOperator3653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator3656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator3659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000020000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_rangeOperator3663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator3666 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator3669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator3690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_frequencyOperator3693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_frequencyOperator3696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_frequencyOperator3699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_OPERATOR_in_lastOperator3718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_lastOperator3721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_lastOperator3724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_lastOperator3727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator3746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_weekDayOperator3749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_weekDayOperator3752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_weekDayOperator3755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr3776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectGroupExpr3778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr3797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectRowExpr3799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr3818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectExistsExpr3820 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr3839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr3855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr3859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr3878 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectInQueryExpr3880 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTINCT_in_subQueryExpr3896 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000180000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_selectionList_in_subQueryExpr3899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_subSelectFilterExpr_in_subQueryExpr3901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_whereClause_in_subQueryExpr3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_subSelectFilterExpr3922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_subSelectFilterExpr3924 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000008000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_viewListExpr_in_subSelectFilterExpr3928 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_subSelectFilterExpr3933 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_RETAINUNION_in_subSelectFilterExpr3937 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr3940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_in_caseExpr3960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr3963 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_CASE2_in_caseExpr3976 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr3979 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_IN_SET_in_inExpr3999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4003 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4009 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0120007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4012 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0120007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_set_in_inExpr4016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SET_in_inExpr4031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4035 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4041 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0120007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4044 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0120007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_set_in_inExpr4048 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_RANGE_in_inExpr4063 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4067 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4073 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0120000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_RANGE_in_inExpr4092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4096 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4102 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0120000000000000L});
    public static final BitSet FOLLOW_set_in_inExpr4106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenExpr4129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4131 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4133 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenExpr4146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4148 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4150 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4153 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_LIKE_in_likeExpr4173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4175 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4177 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeExpr4193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4195 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4197 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEXP_in_regExpExpr4219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4221 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_REGEXP_in_regExpExpr4234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4236 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_builtinFunc4257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4260 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4264 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_builtinFunc4278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4281 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4285 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_builtinFunc4299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4303 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4307 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIAN_in_builtinFunc4323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4326 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4330 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STDDEV_in_builtinFunc4344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4347 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4351 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVEDEV_in_builtinFunc4365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4368 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4372 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_AGGREG_in_builtinFunc4386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4389 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000001E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4393 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIRST_AGGREG_in_builtinFunc4408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4411 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000001E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4415 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_AGGREG_in_builtinFunc4430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4433 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtinFunc4450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4452 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4454 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4457 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_PREVIOUS_in_builtinFunc4472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4474 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSTAIL_in_builtinFunc4489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4491 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSCOUNT_in_builtinFunc4506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSWINDOW_in_builtinFunc4520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRIOR_in_builtinFunc4534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_INT_in_builtinFunc4538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_builtinFunc4553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4557 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4560 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TYPEOF_in_builtinFunc4574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_builtinFunc4588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_builtinFunc4604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr4635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_aggregationFilterExpr4637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_AGG_in_accessValueExpr4651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessValueExprChoice_in_accessValueExpr4653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice4675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice4677 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice4679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_accessValueExprChoice4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_EXPR_in_arrayExpr4701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arrayExpr4704 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_PLUS_in_arithmeticExpr4725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4727 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arithmeticExpr4741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4743 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_arithmeticExpr4757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4759 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_arithmeticExpr4772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4774 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_arithmeticExpr4788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4790 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_arithmeticExpr4803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4805 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_arithmeticExpr4818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4820 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_arithmeticExpr4833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4835 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_arithmeticExpr4849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4851 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4853 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr4856 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_DOT_EXPR_in_dotExpr4876 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dotExpr4878 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_dotExpr4880 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NEWKW_in_newExpr4898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_newAssign_in_newExpr4900 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_NEW_ITEM_in_newAssign4916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_newAssign4918 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_newAssign4921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain4939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libFuncChain4941 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_libOrPropFunction_in_libFuncChain4943 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LIB_FUNCTION_in_libFunctionWithClass4963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_libFunctionWithClass4966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_libFunctionWithClass4970 = new BitSet(new long[]{0x0020400037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x1080007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_DISTINCT_in_libFunctionWithClass4973 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x1080007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_libFunctionArgItem_in_libFunctionWithClass4977 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x1080007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_LPAREN_in_libFunctionWithClass4980 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_libFunctionArgItem4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExprWithTime_in_libFunctionArgItem4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_libOrPropFunction5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libOrPropFunction5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_startPatternExpressionRule5038 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_startPatternExpressionRule5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicExpr_in_exprChoice5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternOp_in_exprChoice5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_EXPR_in_exprChoice5071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distinctExpressions_in_exprChoice5089 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_EXPR_in_exprChoice5121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5123 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0040007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5128 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_exprChoice5130 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_exprChoice5135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchUntilRange_in_exprChoice5151 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5154 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_distinctExpressions5179 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5202 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5205 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_OR_EXPR_in_patternOp5221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5223 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5225 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5228 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_AND_EXPR_in_patternOp5244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5246 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5248 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5251 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_followedByItem5274 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x00000000060001A0L,0x0400000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_followedByItem5277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternFilterExpr_in_atomicExpr5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSERVER_EXPR_in_atomicExpr5303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5307 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExprWithTime_in_atomicExpr5309 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x004001FE0000001EL,0x000003BB83C03680L,0x0000007F000000E2L,0x060000000007798DL});
    public static final BitSet FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterExpr5331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_patternFilterExpr5334 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000800L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798FL});
    public static final BitSet FOLLOW_propertyExpression_in_patternFilterExpr5336 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798FL});
    public static final BitSet FOLLOW_patternFilterAnno_in_patternFilterExpr5339 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_patternFilterExpr5343 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_ATCHAR_in_patternFilterAnno5363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterAnno5365 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_number_in_patternFilterAnno5367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5384 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5406 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_PARAM_in_filterParam5428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5430 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5433 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x004001FE00000000L,0x0000023B83C02680L,0x0000007F000000E0L,0x060000000007798DL});
    public static final BitSet FOLLOW_EQUALS_in_filterParamComparator5449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_filterParamComparator5458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_filterParamComparator5467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_filterParamComparator5476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_filterParamComparator5485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_filterParamComparator5494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0120000000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0120000000000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0120000000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0120000000000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0120007F00000000L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator5637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator5658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_filterAtom5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterAtom5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier5702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_filterIdentifier5704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_filterIdentifier5706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr5725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5727 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr5730 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic5749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic5758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic5762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic5769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic5773 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic5786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic5795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic5799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic5806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic5808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic5810 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_PERIOD_in_timePeriod5835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriodDef_in_timePeriod5837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_yearPart_in_timePeriodDef5853 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef5856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5881 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef5894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5897 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5912 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef5930 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5933 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5938 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef5961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5974 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef5986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef5989 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef5994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_PART_in_yearPart6045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_yearPart6047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_PART_in_monthPart6062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_monthPart6064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEK_PART_in_weekPart6079 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_weekPart6081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_PART_in_dayPart6096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dayPart6098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOUR_PART_in_hourPart6113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_hourPart6115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTE_PART_in_minutePart6130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_minutePart6132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_PART_in_secondPart6147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_secondPart6149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MILLISECOND_PART_in_millisecondPart6164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_millisecondPart6166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTITUTION_in_substitution6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_constant6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_constant6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_constant6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_constant6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_constant6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_constant6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_TYPE_in_constant6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_number0 = new BitSet(new long[]{0x0000000000000002L});

}