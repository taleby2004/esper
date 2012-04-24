// $ANTLR 3.2 Sep 23, 2009 12:02:23 EsperEPL2Ast.g 2012-04-20 16:15:45

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CREATE", "WINDOW", "IN_SET", "BETWEEN", "LIKE", "REGEXP", "ESCAPE", "OR_EXPR", "AND_EXPR", "NOT_EXPR", "EVERY_EXPR", "EVERY_DISTINCT_EXPR", "WHERE", "AS", "SUM", "AVG", "MAX", "MIN", "COALESCE", "MEDIAN", "STDDEV", "AVEDEV", "COUNT", "SELECT", "CASE", "CASE2", "ELSE", "WHEN", "THEN", "END", "FROM", "OUTER", "INNER", "JOIN", "LEFT", "RIGHT", "FULL", "ON", "IS", "BY", "GROUP", "HAVING", "DISTINCT", "ALL", "ANY", "SOME", "OUTPUT", "EVENTS", "FIRST", "LAST", "INSERT", "INTO", "ORDER", "ASC", "DESC", "RSTREAM", "ISTREAM", "IRSTREAM", "SCHEMA", "UNIDIRECTIONAL", "RETAINUNION", "RETAININTERSECTION", "PATTERN", "SQL", "METADATASQL", "PREVIOUS", "PREVIOUSTAIL", "PREVIOUSCOUNT", "PREVIOUSWINDOW", "PRIOR", "EXISTS", "WEEKDAY", "LW", "INSTANCEOF", "TYPEOF", "CAST", "CURRENT_TIMESTAMP", "DELETE", "SNAPSHOT", "SET", "VARIABLE", "UNTIL", "AT", "INDEX", "TIMEPERIOD_YEAR", "TIMEPERIOD_YEARS", "TIMEPERIOD_MONTH", "TIMEPERIOD_MONTHS", "TIMEPERIOD_WEEK", "TIMEPERIOD_WEEKS", "TIMEPERIOD_DAY", "TIMEPERIOD_DAYS", "TIMEPERIOD_HOUR", "TIMEPERIOD_HOURS", "TIMEPERIOD_MINUTE", "TIMEPERIOD_MINUTES", "TIMEPERIOD_SEC", "TIMEPERIOD_SECOND", "TIMEPERIOD_SECONDS", "TIMEPERIOD_MILLISEC", "TIMEPERIOD_MILLISECOND", "TIMEPERIOD_MILLISECONDS", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "VALUE_NULL", "ROW_LIMIT_EXPR", "OFFSET", "UPDATE", "MATCH_RECOGNIZE", "MEASURES", "DEFINE", "PARTITION", "MATCHES", "AFTER", "FOR", "WHILE", "USING", "MERGE", "MATCHED", "EXPRESSIONDECL", "NEWKW", "START", "CONTEXT", "INITIATED", "TERMINATED", "DATAFLOW", "NUMERIC_PARAM_RANGE", "NUMERIC_PARAM_LIST", "NUMERIC_PARAM_FREQUENCY", "OBJECT_PARAM_ORDERED_EXPR", "FOLLOWED_BY_EXPR", "FOLLOWED_BY_ITEM", "PATTERN_FILTER_EXPR", "PATTERN_NOT_EXPR", "PATTERN_EVERY_DISTINCT_EXPR", "EVENT_FILTER_EXPR", "EVENT_FILTER_PROPERTY_EXPR", "EVENT_FILTER_PROPERTY_EXPR_ATOM", "PROPERTY_SELECTION_ELEMENT_EXPR", "PROPERTY_SELECTION_STREAM", "PROPERTY_WILDCARD_SELECT", "EVENT_FILTER_IDENT", "EVENT_FILTER_PARAM", "EVENT_FILTER_RANGE", "EVENT_FILTER_NOT_RANGE", "EVENT_FILTER_IN", "EVENT_FILTER_NOT_IN", "EVENT_FILTER_BETWEEN", "EVENT_FILTER_NOT_BETWEEN", "CLASS_IDENT", "GUARD_EXPR", "OBSERVER_EXPR", "VIEW_EXPR", "PATTERN_INCL_EXPR", "DATABASE_JOIN_EXPR", "WHERE_EXPR", "HAVING_EXPR", "EVAL_BITWISE_EXPR", "EVAL_AND_EXPR", "EVAL_OR_EXPR", "EVAL_EQUALS_EXPR", "EVAL_NOTEQUALS_EXPR", "EVAL_IS_EXPR", "EVAL_ISNOT_EXPR", "EVAL_EQUALS_GROUP_EXPR", "EVAL_NOTEQUALS_GROUP_EXPR", "EVAL_IDENT", "SELECTION_EXPR", "SELECTION_ELEMENT_EXPR", "SELECTION_STREAM", "STREAM_EXPR", "OUTERJOIN_EXPR", "INNERJOIN_EXPR", "LEFT_OUTERJOIN_EXPR", "RIGHT_OUTERJOIN_EXPR", "FULL_OUTERJOIN_EXPR", "GROUP_BY_EXPR", "ORDER_BY_EXPR", "ORDER_ELEMENT_EXPR", "EVENT_PROP_EXPR", "EVENT_PROP_SIMPLE", "EVENT_PROP_MAPPED", "EVENT_PROP_INDEXED", "EVENT_PROP_DYNAMIC_SIMPLE", "EVENT_PROP_DYNAMIC_INDEXED", "EVENT_PROP_DYNAMIC_MAPPED", "EVENT_LIMIT_EXPR", "TIMEPERIOD_LIMIT_EXPR", "AFTER_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR_PARAM", "WHEN_LIMIT_EXPR", "TERM_LIMIT_EXPR", "INSERTINTO_EXPR", "EXPRCOL", "INDEXCOL", "CONCAT", "LIB_FUNCTION", "LIB_FUNC_CHAIN", "DOT_EXPR", "UNARY_MINUS", "TIME_PERIOD", "ARRAY_EXPR", "YEAR_PART", "MONTH_PART", "WEEK_PART", "DAY_PART", "HOUR_PART", "MINUTE_PART", "SECOND_PART", "MILLISECOND_PART", "NOT_IN_SET", "NOT_BETWEEN", "NOT_LIKE", "NOT_REGEXP", "DBSELECT_EXPR", "DBFROM_CLAUSE", "DBWHERE_CLAUSE", "WILDCARD_SELECT", "INSERTINTO_STREAM_NAME", "IN_RANGE", "NOT_IN_RANGE", "SUBSELECT_EXPR", "SUBSELECT_GROUP_EXPR", "EXISTS_SUBSELECT_EXPR", "IN_SUBSELECT_EXPR", "NOT_IN_SUBSELECT_EXPR", "IN_SUBSELECT_QUERY_EXPR", "LAST_OPERATOR", "WEEKDAY_OPERATOR", "SUBSTITUTION", "CAST_EXPR", "CREATE_INDEX_EXPR", "CREATE_WINDOW_EXPR", "CREATE_WINDOW_SELECT_EXPR", "ON_EXPR", "ON_STREAM", "ON_DELETE_EXPR", "ON_SELECT_EXPR", "ON_UPDATE_EXPR", "ON_MERGE_EXPR", "ON_SELECT_INSERT_EXPR", "ON_SELECT_INSERT_OUTPUT", "ON_EXPR_FROM", "ON_SET_EXPR", "CREATE_VARIABLE_EXPR", "METHOD_JOIN_EXPR", "MATCH_UNTIL_EXPR", "MATCH_UNTIL_RANGE_HALFOPEN", "MATCH_UNTIL_RANGE_HALFCLOSED", "MATCH_UNTIL_RANGE_CLOSED", "MATCH_UNTIL_RANGE_BOUNDED", "CREATE_COL_TYPE_LIST", "CREATE_COL_TYPE", "NUMBERSETSTAR", "ANNOTATION", "ANNOTATION_ARRAY", "ANNOTATION_VALUE", "FIRST_AGGREG", "LAST_AGGREG", "WINDOW_AGGREG", "ACCESS_AGG", "UPDATE_EXPR", "ON_SET_EXPR_ITEM", "CREATE_SCHEMA_EXPR", "CREATE_SCHEMA_EXPR_QUAL", "CREATE_SCHEMA_DEF", "VARIANT_LIST", "MERGE_UNM", "MERGE_MAT", "MERGE_UPD", "MERGE_INS", "MERGE_DEL", "NEW_ITEM", "AGG_FILTER_EXPR", "CREATE_CTX", "CREATE_CTX_FIXED", "CREATE_CTX_PART", "CREATE_CTX_COAL", "CREATE_CTX_CAT", "CREATE_CTX_INIT", "CREATE_CTX_CATITEM", "CREATE_CTX_NESTED", "CREATE_CTX_PATTERN", "CREATE_DATAFLOW", "GOP", "GOPPARAM", "GOPPARAMITM", "GOPOUT", "GOPOUTITM", "GOPOUTTYP", "GOPCFG", "GOPCFGITM", "GOPCFGEPL", "PARTITIONITEM", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "BOOL_TYPE", "NULL_TYPE", "NUM_DOUBLE", "EPL_EXPR", "MATCHREC_PATTERN", "MATCHREC_PATTERN_ATOM", "MATCHREC_PATTERN_CONCAT", "MATCHREC_PATTERN_ALTER", "MATCHREC_PATTERN_NESTED", "MATCHREC_AFTER_SKIP", "MATCHREC_INTERVAL", "MATCHREC_DEFINE", "MATCHREC_DEFINE_ITEM", "MATCHREC_MEASURES", "MATCHREC_MEASURE_ITEM", "JSON_OBJECT", "JSON_ARRAY", "JSON_FIELD", "LBRACK", "RBRACK", "IDENT", "LPAREN", "RPAREN", "COLON", "LCURLY", "RCURLY", "GOES", "ATCHAR", "COMMA", "EQUALS", "DOT", "STAR", "FOLLOWED_BY", "LT", "GT", "QUESTION", "BOR", "PLUS", "STRING_LITERAL", "QUOTED_STRING_LITERAL", "BAND", "BXOR", "SQL_NE", "NOT_EQUAL", "LE", "GE", "LOR", "MINUS", "DIV", "MOD", "NUM_INT", "FOLLOWMAX_BEGIN", "FOLLOWMAX_END", "ESCAPECHAR", "TICKED_STRING_LITERAL", "NUM_LONG", "NUM_FLOAT", "EQUAL", "LNOT", "BNOT", "DIV_ASSIGN", "PLUS_ASSIGN", "INC", "MINUS_ASSIGN", "DEC", "STAR_ASSIGN", "MOD_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LAND", "SEMI", "WS", "SL_COMMENT", "ML_COMMENT", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "EXPONENT", "FLOAT_SUFFIX", "GOPCFGEXP", "EVAL_IS_GROUP_EXPR", "EVAL_ISNOT_GROUP_EXPR"
    };
    public static final int FLOAT_SUFFIX=384;
    public static final int GOPCFGITM=296;
    public static final int NUMERIC_PARAM_LIST=131;
    public static final int OUTERJOIN_EXPR=175;
    public static final int CREATE_COL_TYPE_LIST=256;
    public static final int MERGE_INS=275;
    public static final int TIMEPERIOD_MILLISECONDS=105;
    public static final int CREATE_CTX_FIXED=280;
    public static final int RPAREN=326;
    public static final int LNOT=362;
    public static final int INC=366;
    public static final int CREATE=4;
    public static final int STRING_LITERAL=342;
    public static final int STREAM_EXPR=174;
    public static final int MATCHES=116;
    public static final int METADATASQL=68;
    public static final int EVENT_FILTER_PROPERTY_EXPR=140;
    public static final int GOES=330;
    public static final int REGEXP=9;
    public static final int MATCHED=122;
    public static final int INITIATED=127;
    public static final int FOLLOWED_BY_EXPR=134;
    public static final int RBRACK=323;
    public static final int MATCH_UNTIL_RANGE_CLOSED=254;
    public static final int GE=349;
    public static final int ASC=57;
    public static final int IN_SET=6;
    public static final int EVENT_FILTER_EXPR=139;
    public static final int EVENT_FILTER_NOT_IN=150;
    public static final int NUM_DOUBLE=306;
    public static final int TIMEPERIOD_MILLISEC=103;
    public static final int RETAINUNION=64;
    public static final int DBWHERE_CLAUSE=221;
    public static final int MEDIAN=23;
    public static final int GROUP=44;
    public static final int SUBSELECT_GROUP_EXPR=227;
    public static final int YEAR_PART=207;
    public static final int TYPEOF=78;
    public static final int ESCAPECHAR=357;
    public static final int EXPRCOL=198;
    public static final int SL_COMMENT=377;
    public static final int NULL_TYPE=305;
    public static final int MATCH_UNTIL_RANGE_HALFOPEN=252;
    public static final int GT=338;
    public static final int LAND=374;
    public static final int EVENT_PROP_EXPR=183;
    public static final int LBRACK=322;
    public static final int VIEW_EXPR=156;
    public static final int MERGE_UPD=274;
    public static final int CREATE_SCHEMA_DEF=270;
    public static final int EVENT_FILTER_PROPERTY_EXPR_ATOM=141;
    public static final int ON_MERGE_EXPR=244;
    public static final int TIMEPERIOD_SEC=100;
    public static final int ON_SELECT_EXPR=242;
    public static final int TICKED_STRING_LITERAL=358;
    public static final int SUM=18;
    public static final int JSON_ARRAY=320;
    public static final int HexDigit=382;
    public static final int AT=86;
    public static final int AS=17;
    public static final int TIMEPERIOD_MONTH=90;
    public static final int LEFT=38;
    public static final int AVG=19;
    public static final int PREVIOUS=69;
    public static final int PREVIOUSWINDOW=72;
    public static final int PARTITIONITEM=298;
    public static final int DATABASE_JOIN_EXPR=158;
    public static final int IDENT=324;
    public static final int PLUS=341;
    public static final int EVENT_PROP_INDEXED=186;
    public static final int CREATE_SCHEMA_EXPR=268;
    public static final int CREATE_INDEX_EXPR=236;
    public static final int ACCESS_AGG=265;
    public static final int LIKE=8;
    public static final int OUTER=35;
    public static final int RIGHT_OUTERJOIN_EXPR=178;
    public static final int BY=43;
    public static final int MATCHREC_DEFINE=315;
    public static final int MERGE=121;
    public static final int MERGE_UNM=272;
    public static final int FOLLOWMAX_END=356;
    public static final int LEFT_OUTERJOIN_EXPR=177;
    public static final int GROUP_BY_EXPR=180;
    public static final int EPL_EXPR=307;
    public static final int RIGHT=39;
    public static final int HAVING=45;
    public static final int GOPOUTITM=293;
    public static final int MINUS=351;
    public static final int SEMI=375;
    public static final int INDEXCOL=199;
    public static final int STAR_ASSIGN=369;
    public static final int FIRST_AGGREG=262;
    public static final int COLON=327;
    public static final int PREVIOUSTAIL=70;
    public static final int NOT_IN_SET=215;
    public static final int VALUE_NULL=108;
    public static final int EVENT_PROP_DYNAMIC_SIMPLE=187;
    public static final int NOT_IN_SUBSELECT_EXPR=230;
    public static final int GUARD_EXPR=154;
    public static final int RCURLY=329;
    public static final int EXISTS_SUBSELECT_EXPR=228;
    public static final int WEEK_PART=209;
    public static final int ROW_LIMIT_EXPR=109;
    public static final int SELECTION_EXPR=171;
    public static final int EVAL_IS_GROUP_EXPR=386;
    public static final int LW=76;
    public static final int LT=337;
    public static final int CREATE_CTX=279;
    public static final int ORDER_BY_EXPR=181;
    public static final int NEW_ITEM=277;
    public static final int MOD_ASSIGN=370;
    public static final int IN_SUBSELECT_QUERY_EXPR=231;
    public static final int JSON_FIELD=321;
    public static final int EQUALS=333;
    public static final int COUNT=26;
    public static final int RETAININTERSECTION=65;
    public static final int TERMINATED=128;
    public static final int TIMEPERIOD_WEEKS=93;
    public static final int PATTERN=66;
    public static final int MATCHREC_AFTER_SKIP=313;
    public static final int ESCAPE=10;
    public static final int EVAL_NOTEQUALS_GROUP_EXPR=169;
    public static final int SELECT=27;
    public static final int INTO=55;
    public static final int EVAL_ISNOT_EXPR=167;
    public static final int FLOAT_TYPE=301;
    public static final int COALESCE=22;
    public static final int EVENT_FILTER_BETWEEN=151;
    public static final int ANNOTATION_VALUE=261;
    public static final int CLASS_IDENT=153;
    public static final int MATCHREC_PATTERN_ALTER=311;
    public static final int CREATE_WINDOW_EXPR=237;
    public static final int PROPERTY_SELECTION_STREAM=143;
    public static final int ON_DELETE_EXPR=241;
    public static final int ON=41;
    public static final int DELETE=81;
    public static final int INT_TYPE=299;
    public static final int EVERY_EXPR=14;
    public static final int EVAL_BITWISE_EXPR=161;
    public static final int TIMEPERIOD_HOURS=97;
    public static final int STRING_TYPE=303;
    public static final int MATCHREC_DEFINE_ITEM=316;
    public static final int STDDEV=24;
    public static final int OUTPUT=50;
    public static final int WEEKDAY_OPERATOR=233;
    public static final int DEC=368;
    public static final int WHERE=16;
    public static final int GOPOUT=292;
    public static final int BXOR_ASSIGN=371;
    public static final int AFTER_LIMIT_EXPR=192;
    public static final int SNAPSHOT=82;
    public static final int MAX=20;
    public static final int DEFINE=114;
    public static final int TIMEPERIOD_YEARS=89;
    public static final int TIMEPERIOD_DAYS=95;
    public static final int CONTEXT=126;
    public static final int CREATE_CTX_CAT=283;
    public static final int EVENT_PROP_DYNAMIC_INDEXED=188;
    public static final int BOR_ASSIGN=372;
    public static final int COMMA=332;
    public static final int WHEN_LIMIT_EXPR=195;
    public static final int IS=42;
    public static final int PARTITION=115;
    public static final int SOME=49;
    public static final int EQUAL=361;
    public static final int MATCHREC_MEASURE_ITEM=318;
    public static final int EVENT_FILTER_NOT_BETWEEN=152;
    public static final int IN_RANGE=224;
    public static final int TIMEPERIOD_WEEK=92;
    public static final int PROPERTY_WILDCARD_SELECT=144;
    public static final int INSERTINTO_EXPR=197;
    public static final int UNIDIRECTIONAL=63;
    public static final int MATCH_UNTIL_RANGE_BOUNDED=255;
    public static final int TIMEPERIOD_MINUTES=99;
    public static final int RSTREAM=59;
    public static final int NOT_BETWEEN=216;
    public static final int TIMEPERIOD_MINUTE=98;
    public static final int EVAL_OR_EXPR=163;
    public static final int BAND=344;
    public static final int MATCHREC_PATTERN_ATOM=309;
    public static final int QUOTED_STRING_LITERAL=343;
    public static final int NOT_EXPR=13;
    public static final int QUESTION=339;
    public static final int EVENT_FILTER_IDENT=145;
    public static final int UnicodeEscape=380;
    public static final int DBSELECT_EXPR=219;
    public static final int FOLLOWMAX_BEGIN=355;
    public static final int WINDOW=5;
    public static final int ON_SET_EXPR_ITEM=267;
    public static final int DBFROM_CLAUSE=220;
    public static final int LE=348;
    public static final int EVAL_IDENT=170;
    public static final int CRONTAB_LIMIT_EXPR=193;
    public static final int STAR=335;
    public static final int DOT_EXPR=203;
    public static final int ISTREAM=60;
    public static final int MOD=353;
    public static final int LIB_FUNC_CHAIN=202;
    public static final int EVAL_ISNOT_GROUP_EXPR=387;
    public static final int MONTH_PART=208;
    public static final int EOF=-1;
    public static final int LIB_FUNCTION=201;
    public static final int FULL_OUTERJOIN_EXPR=179;
    public static final int CREATE_CTX_NESTED=286;
    public static final int MATCHREC_PATTERN_CONCAT=310;
    public static final int USING=120;
    public static final int CAST_EXPR=235;
    public static final int TIMEPERIOD_SECONDS=102;
    public static final int NOT_EQUAL=347;
    public static final int LAST_AGGREG=263;
    public static final int NEWKW=124;
    public static final int HOUR_PART=211;
    public static final int FOLLOWED_BY=336;
    public static final int MATCHREC_PATTERN_NESTED=312;
    public static final int GOPPARAMITM=291;
    public static final int METHOD_JOIN_EXPR=250;
    public static final int CREATE_CTX_PART=281;
    public static final int PATTERN_EVERY_DISTINCT_EXPR=138;
    public static final int CREATE_CTX_COAL=282;
    public static final int ELSE=30;
    public static final int MINUS_ASSIGN=367;
    public static final int INSERTINTO_STREAM_NAME=223;
    public static final int UNARY_MINUS=204;
    public static final int LCURLY=328;
    public static final int EVENTS=51;
    public static final int AND_EXPR=12;
    public static final int EVENT_FILTER_NOT_RANGE=148;
    public static final int WS=376;
    public static final int FOLLOWED_BY_ITEM=135;
    public static final int ON_SELECT_INSERT_EXPR=245;
    public static final int GOPPARAM=290;
    public static final int BNOT=363;
    public static final int EVAL_IS_EXPR=166;
    public static final int WHERE_EXPR=159;
    public static final int END=33;
    public static final int INNERJOIN_EXPR=176;
    public static final int TERM_LIMIT_EXPR=196;
    public static final int NOT_REGEXP=218;
    public static final int MATCH_UNTIL_EXPR=251;
    public static final int ANNOTATION=259;
    public static final int LONG_TYPE=300;
    public static final int MATCHREC_PATTERN=308;
    public static final int ATCHAR=331;
    public static final int MINUTE_PART=212;
    public static final int PATTERN_NOT_EXPR=137;
    public static final int SQL_NE=346;
    public static final int UPDATE_EXPR=266;
    public static final int LPAREN=325;
    public static final int IN_SUBSELECT_EXPR=229;
    public static final int BOOLEAN_TRUE=106;
    public static final int OR_EXPR=11;
    public static final int JSON_OBJECT=319;
    public static final int THEN=32;
    public static final int NOT_IN_RANGE=225;
    public static final int MATCHREC_INTERVAL=314;
    public static final int OFFSET=110;
    public static final int SECOND_PART=213;
    public static final int MATCH_RECOGNIZE=112;
    public static final int CASE2=29;
    public static final int BXOR=345;
    public static final int TIMEPERIOD_DAY=94;
    public static final int MERGE_MAT=273;
    public static final int EXISTS=74;
    public static final int TIMEPERIOD_MILLISECOND=104;
    public static final int EVAL_NOTEQUALS_EXPR=165;
    public static final int CREATE_CTX_CATITEM=285;
    public static final int CREATE_VARIABLE_EXPR=249;
    public static final int MATCH_UNTIL_RANGE_HALFCLOSED=253;
    public static final int PATTERN_FILTER_EXPR=136;
    public static final int LAST_OPERATOR=232;
    public static final int NUMBERSETSTAR=258;
    public static final int EVAL_AND_EXPR=162;
    public static final int SET=83;
    public static final int INSTANCEOF=77;
    public static final int EVENT_PROP_SIMPLE=184;
    public static final int MIN=21;
    public static final int PREVIOUSCOUNT=71;
    public static final int VARIANT_LIST=271;
    public static final int EVAL_EQUALS_GROUP_EXPR=168;
    public static final int SCHEMA=62;
    public static final int BAND_ASSIGN=373;
    public static final int CRONTAB_LIMIT_EXPR_PARAM=194;
    public static final int WHEN=31;
    public static final int PLUS_ASSIGN=365;
    public static final int DAY_PART=210;
    public static final int START=125;
    public static final int EVENT_FILTER_IN=149;
    public static final int DIV=352;
    public static final int GOPCFGEXP=385;
    public static final int OBJECT_PARAM_ORDERED_EXPR=133;
    public static final int EXPRESSIONDECL=123;
    public static final int OctalEscape=381;
    public static final int BETWEEN=7;
    public static final int MILLISECOND_PART=214;
    public static final int FIRST=52;
    public static final int PRIOR=73;
    public static final int CAST=79;
    public static final int LOR=350;
    public static final int WILDCARD_SELECT=222;
    public static final int EXPONENT=383;
    public static final int PATTERN_INCL_EXPR=157;
    public static final int WHILE=119;
    public static final int BOOL_TYPE=304;
    public static final int GOPCFG=295;
    public static final int ANNOTATION_ARRAY=260;
    public static final int CASE=28;
    public static final int GOP=289;
    public static final int WINDOW_AGGREG=264;
    public static final int DIV_ASSIGN=364;
    public static final int CREATE_CTX_INIT=284;
    public static final int SQL=67;
    public static final int FULL=40;
    public static final int WEEKDAY=75;
    public static final int INSERT=54;
    public static final int ON_UPDATE_EXPR=243;
    public static final int ARRAY_EXPR=206;
    public static final int CREATE_COL_TYPE=257;
    public static final int LAST=53;
    public static final int BOOLEAN_FALSE=107;
    public static final int TIMEPERIOD_SECOND=101;
    public static final int SUBSELECT_EXPR=226;
    public static final int NUMERIC_PARAM_RANGE=130;
    public static final int CONCAT=200;
    public static final int ON_EXPR=239;
    public static final int NUM_LONG=359;
    public static final int TIME_PERIOD=205;
    public static final int DOUBLE_TYPE=302;
    public static final int ORDER_ELEMENT_EXPR=182;
    public static final int VARIABLE=84;
    public static final int SUBSTITUTION=234;
    public static final int UNTIL=85;
    public static final int ON_SET_EXPR=248;
    public static final int NUM_INT=354;
    public static final int ON_EXPR_FROM=247;
    public static final int NUM_FLOAT=360;
    public static final int FROM=34;
    public static final int DISTINCT=46;
    public static final int PROPERTY_SELECTION_ELEMENT_EXPR=142;
    public static final int EscapeSequence=379;
    public static final int INNER=36;
    public static final int NUMERIC_PARAM_FREQUENCY=132;
    public static final int ORDER=56;
    public static final int EVENT_FILTER_PARAM=146;
    public static final int EVENT_PROP_DYNAMIC_MAPPED=189;
    public static final int IRSTREAM=61;
    public static final int UPDATE=111;
    public static final int FOR=118;
    public static final int ON_STREAM=240;
    public static final int EVENT_FILTER_RANGE=147;
    public static final int INDEX=87;
    public static final int ML_COMMENT=378;
    public static final int TIMEPERIOD_LIMIT_EXPR=191;
    public static final int TIMEPERIOD_HOUR=96;
    public static final int ALL=47;
    public static final int BOR=340;
    public static final int DOT=334;
    public static final int CURRENT_TIMESTAMP=80;
    public static final int MATCHREC_MEASURES=317;
    public static final int EVERY_DISTINCT_EXPR=15;
    public static final int HAVING_EXPR=160;
    public static final int MERGE_DEL=276;
    public static final int EVAL_EQUALS_EXPR=164;
    public static final int NOT_LIKE=217;
    public static final int EVENT_LIMIT_EXPR=190;
    public static final int ON_SELECT_INSERT_OUTPUT=246;
    public static final int CREATE_DATAFLOW=288;
    public static final int AFTER=117;
    public static final int MEASURES=113;
    public static final int AGG_FILTER_EXPR=278;
    public static final int CREATE_CTX_PATTERN=287;
    public static final int JOIN=37;
    public static final int GOPOUTTYP=294;
    public static final int ANY=48;
    public static final int OBSERVER_EXPR=155;
    public static final int CREATE_SCHEMA_EXPR_QUAL=269;
    public static final int EVENT_PROP_MAPPED=185;
    public static final int TIMEPERIOD_YEAR=88;
    public static final int AVEDEV=25;
    public static final int TIMEPERIOD_MONTHS=91;
    public static final int GOPCFGEPL=297;
    public static final int SELECTION_ELEMENT_EXPR=172;
    public static final int CREATE_WINDOW_SELECT_EXPR=238;
    public static final int DESC=58;
    public static final int DATAFLOW=129;
    public static final int SELECTION_STREAM=173;

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
    // EsperEPL2Ast.g:95:1: eplExpressionRule : ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow ) ( forExpr )? ) | createContextExpr );
    public final void eplExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:96:2: ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow ) ( forExpr )? ) | createContextExpr )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CONTEXT||LA16_0==SELECTION_EXPR||LA16_0==INSERTINTO_EXPR||(LA16_0>=CREATE_INDEX_EXPR && LA16_0<=CREATE_WINDOW_EXPR)||LA16_0==ON_EXPR||LA16_0==CREATE_VARIABLE_EXPR||LA16_0==UPDATE_EXPR||LA16_0==CREATE_SCHEMA_EXPR||LA16_0==CREATE_DATAFLOW) ) {
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
                    // EsperEPL2Ast.g:96:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow ) ( forExpr )? )
                    {
                    // EsperEPL2Ast.g:96:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow ) ( forExpr )? )
                    // EsperEPL2Ast.g:96:5: ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow ) ( forExpr )?
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

                    // EsperEPL2Ast.g:96:18: ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow )
                    int alt14=8;
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
                    case CREATE_DATAFLOW:
                        {
                        alt14=8;
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
                            // EsperEPL2Ast.g:96:90: createSchemaExpr[true]
                            {
                            pushFollow(FOLLOW_createSchemaExpr_in_eplExpressionRule343);
                            createSchemaExpr(true);

                            state._fsp--;


                            }
                            break;
                        case 6 :
                            // EsperEPL2Ast.g:96:115: onExpr
                            {
                            pushFollow(FOLLOW_onExpr_in_eplExpressionRule348);
                            onExpr();

                            state._fsp--;


                            }
                            break;
                        case 7 :
                            // EsperEPL2Ast.g:96:124: updateExpr
                            {
                            pushFollow(FOLLOW_updateExpr_in_eplExpressionRule352);
                            updateExpr();

                            state._fsp--;


                            }
                            break;
                        case 8 :
                            // EsperEPL2Ast.g:96:137: createDataflow
                            {
                            pushFollow(FOLLOW_createDataflow_in_eplExpressionRule356);
                            createDataflow();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:96:153: ( forExpr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==FOR) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // EsperEPL2Ast.g:96:153: forExpr
                            {
                            pushFollow(FOLLOW_forExpr_in_eplExpressionRule359);
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
                    pushFollow(FOLLOW_createContextExpr_in_eplExpressionRule366);
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
            i=(CommonTree)match(input,CONTEXT,FOLLOW_CONTEXT_in_contextExpr381); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_contextExpr383); 
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
            i=(CommonTree)match(input,ON_EXPR,FOLLOW_ON_EXPR_in_onExpr402); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onStreamExpr_in_onExpr404);
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
                    pushFollow(FOLLOW_onDeleteExpr_in_onExpr409);
                    onDeleteExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:106:19: onUpdateExpr
                    {
                    pushFollow(FOLLOW_onUpdateExpr_in_onExpr413);
                    onUpdateExpr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:106:34: onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )?
                    {
                    pushFollow(FOLLOW_onSelectExpr_in_onExpr417);
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
                            	    pushFollow(FOLLOW_onSelectInsertExpr_in_onExpr420);
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
                                    pushFollow(FOLLOW_onSelectInsertOutput_in_onExpr423);
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
                    pushFollow(FOLLOW_onSetExpr_in_onExpr430);
                    onSetExpr();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:106:106: onMergeExpr
                    {
                    pushFollow(FOLLOW_onMergeExpr_in_onExpr434);
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
            s=(CommonTree)match(input,ON_STREAM,FOLLOW_ON_STREAM_in_onStreamExpr456); 

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
                    pushFollow(FOLLOW_eventFilterExpr_in_onStreamExpr459);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:111:43: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_onStreamExpr464);
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
                    match(input,IDENT,FOLLOW_IDENT_in_onStreamExpr467); 

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
            m=(CommonTree)match(input,ON_MERGE_EXPR,FOLLOW_ON_MERGE_EXPR_in_onMergeExpr485); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr487); 
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
                    match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr489); 

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
            	    pushFollow(FOLLOW_mergeItem_in_onMergeExpr492);
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
                    pushFollow(FOLLOW_whereClause_in_onMergeExpr495);
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
                    pushFollow(FOLLOW_mergeMatched_in_mergeItem511);
                    mergeMatched();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:119:20: mergeUnmatched
                    {
                    pushFollow(FOLLOW_mergeUnmatched_in_mergeItem515);
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
            m=(CommonTree)match(input,MERGE_MAT,FOLLOW_MERGE_MAT_in_mergeMatched530); 

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
            	    pushFollow(FOLLOW_mergeMatchedItem_in_mergeMatched532);
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

            if ( ((LA28_0>=IN_SET && LA28_0<=REGEXP)||LA28_0==NOT_EXPR||(LA28_0>=SUM && LA28_0<=AVG)||(LA28_0>=COALESCE && LA28_0<=COUNT)||(LA28_0>=CASE && LA28_0<=CASE2)||(LA28_0>=PREVIOUS && LA28_0<=EXISTS)||(LA28_0>=INSTANCEOF && LA28_0<=CURRENT_TIMESTAMP)||LA28_0==NEWKW||(LA28_0>=EVAL_AND_EXPR && LA28_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA28_0==EVENT_PROP_EXPR||LA28_0==CONCAT||(LA28_0>=LIB_FUNC_CHAIN && LA28_0<=DOT_EXPR)||LA28_0==ARRAY_EXPR||(LA28_0>=NOT_IN_SET && LA28_0<=NOT_REGEXP)||(LA28_0>=IN_RANGE && LA28_0<=SUBSELECT_EXPR)||(LA28_0>=EXISTS_SUBSELECT_EXPR && LA28_0<=NOT_IN_SUBSELECT_EXPR)||LA28_0==SUBSTITUTION||(LA28_0>=FIRST_AGGREG && LA28_0<=WINDOW_AGGREG)||(LA28_0>=INT_TYPE && LA28_0<=NULL_TYPE)||(LA28_0>=JSON_OBJECT && LA28_0<=JSON_ARRAY)||LA28_0==STAR||(LA28_0>=LT && LA28_0<=GT)||(LA28_0>=BOR && LA28_0<=PLUS)||(LA28_0>=BAND && LA28_0<=BXOR)||(LA28_0>=LE && LA28_0<=GE)||(LA28_0>=MINUS && LA28_0<=MOD)||(LA28_0>=EVAL_IS_GROUP_EXPR && LA28_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // EsperEPL2Ast.g:123:36: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeMatched535);
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
                    m=(CommonTree)match(input,MERGE_UPD,FOLLOW_MERGE_UPD_in_mergeMatchedItem553); 

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
                        	    pushFollow(FOLLOW_onSetAssignment_in_mergeMatchedItem555);
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
                                pushFollow(FOLLOW_whereClause_in_mergeMatchedItem558);
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
                    d=(CommonTree)match(input,MERGE_DEL,FOLLOW_MERGE_DEL_in_mergeMatchedItem571); 

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
                            pushFollow(FOLLOW_whereClause_in_mergeMatchedItem573);
                            whereClause(false);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,INT_TYPE,FOLLOW_INT_TYPE_in_mergeMatchedItem577); 
                     leaveNode(d); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:129:4: mergeInsert
                    {
                    pushFollow(FOLLOW_mergeInsert_in_mergeMatchedItem585);
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
            m=(CommonTree)match(input,MERGE_UNM,FOLLOW_MERGE_UNM_in_mergeUnmatched599); 

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
            	    pushFollow(FOLLOW_mergeInsert_in_mergeUnmatched601);
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

            if ( ((LA34_0>=IN_SET && LA34_0<=REGEXP)||LA34_0==NOT_EXPR||(LA34_0>=SUM && LA34_0<=AVG)||(LA34_0>=COALESCE && LA34_0<=COUNT)||(LA34_0>=CASE && LA34_0<=CASE2)||(LA34_0>=PREVIOUS && LA34_0<=EXISTS)||(LA34_0>=INSTANCEOF && LA34_0<=CURRENT_TIMESTAMP)||LA34_0==NEWKW||(LA34_0>=EVAL_AND_EXPR && LA34_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA34_0==EVENT_PROP_EXPR||LA34_0==CONCAT||(LA34_0>=LIB_FUNC_CHAIN && LA34_0<=DOT_EXPR)||LA34_0==ARRAY_EXPR||(LA34_0>=NOT_IN_SET && LA34_0<=NOT_REGEXP)||(LA34_0>=IN_RANGE && LA34_0<=SUBSELECT_EXPR)||(LA34_0>=EXISTS_SUBSELECT_EXPR && LA34_0<=NOT_IN_SUBSELECT_EXPR)||LA34_0==SUBSTITUTION||(LA34_0>=FIRST_AGGREG && LA34_0<=WINDOW_AGGREG)||(LA34_0>=INT_TYPE && LA34_0<=NULL_TYPE)||(LA34_0>=JSON_OBJECT && LA34_0<=JSON_ARRAY)||LA34_0==STAR||(LA34_0>=LT && LA34_0<=GT)||(LA34_0>=BOR && LA34_0<=PLUS)||(LA34_0>=BAND && LA34_0<=BXOR)||(LA34_0>=LE && LA34_0<=GE)||(LA34_0>=MINUS && LA34_0<=MOD)||(LA34_0>=EVAL_IS_GROUP_EXPR && LA34_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // EsperEPL2Ast.g:133:31: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeUnmatched604);
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
            um=(CommonTree)match(input,MERGE_INS,FOLLOW_MERGE_INS_in_mergeInsert623); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_selectionList_in_mergeInsert625);
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
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_mergeInsert627); 

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
                    pushFollow(FOLLOW_exprCol_in_mergeInsert630);
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
                    pushFollow(FOLLOW_whereClause_in_mergeInsert633);
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
            u=(CommonTree)match(input,UPDATE_EXPR,FOLLOW_UPDATE_EXPR_in_updateExpr653); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_updateExpr655); 
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
                    match(input,IDENT,FOLLOW_IDENT_in_updateExpr657); 

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
            	    pushFollow(FOLLOW_onSetAssignment_in_updateExpr660);
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
                    pushFollow(FOLLOW_whereClause_in_updateExpr663);
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
            match(input,ON_DELETE_EXPR,FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr680); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onDeleteExpr682);
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
                    pushFollow(FOLLOW_whereClause_in_onDeleteExpr685);
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
            s=(CommonTree)match(input,ON_SELECT_EXPR,FOLLOW_ON_SELECT_EXPR_in_onSelectExpr705); 

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
                    pushFollow(FOLLOW_insertIntoExpr_in_onSelectExpr707);
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
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_onSelectExpr710); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_onSelectExpr713);
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
                    pushFollow(FOLLOW_onExprFrom_in_onSelectExpr715);
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
                    pushFollow(FOLLOW_whereClause_in_onSelectExpr718);
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
                    pushFollow(FOLLOW_groupByClause_in_onSelectExpr722);
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
                    pushFollow(FOLLOW_havingClause_in_onSelectExpr725);
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
                    pushFollow(FOLLOW_orderByClause_in_onSelectExpr728);
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
                    pushFollow(FOLLOW_rowLimitClause_in_onSelectExpr731);
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
            match(input,ON_SELECT_INSERT_EXPR,FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr751); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_insertIntoExpr_in_onSelectInsertExpr753);
            insertIntoExpr();

            state._fsp--;

            pushFollow(FOLLOW_selectionList_in_onSelectInsertExpr755);
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
                    pushFollow(FOLLOW_whereClause_in_onSelectInsertExpr757);
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
            match(input,ON_SELECT_INSERT_OUTPUT,FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput774); 

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
            match(input,ON_SET_EXPR,FOLLOW_ON_SET_EXPR_in_onSetExpr794); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onSetAssignment_in_onSetExpr796);
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
            	    pushFollow(FOLLOW_onSetAssignment_in_onSetExpr799);
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
                    pushFollow(FOLLOW_whereClause_in_onSetExpr803);
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
            match(input,ON_UPDATE_EXPR,FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr818); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onUpdateExpr820);
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
            	    pushFollow(FOLLOW_onSetAssignment_in_onUpdateExpr822);
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
                    pushFollow(FOLLOW_whereClause_in_onUpdateExpr825);
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
            match(input,ON_SET_EXPR_ITEM,FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment840); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_onSetAssignment842);
            eventPropertyExpr(false);

            state._fsp--;

            pushFollow(FOLLOW_valueExpr_in_onSetAssignment845);
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
            match(input,ON_EXPR_FROM,FOLLOW_ON_EXPR_FROM_in_onExprFrom859); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onExprFrom861); 
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
                    match(input,IDENT,FOLLOW_IDENT_in_onExprFrom864); 

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
            i=(CommonTree)match(input,CREATE_WINDOW_EXPR,FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr882); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createWindowExpr884); 
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
                    pushFollow(FOLLOW_viewListExpr_in_createWindowExpr887);
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
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_createWindowExpr891); 

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
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_createWindowExpr894); 

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
                            pushFollow(FOLLOW_createSelectionList_in_createWindowExpr908);
                            createSelectionList();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createWindowExpr911); 

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:181:12: ( createColTypeList )
                    {
                    // EsperEPL2Ast.g:181:12: ( createColTypeList )
                    // EsperEPL2Ast.g:181:13: createColTypeList
                    {
                    pushFollow(FOLLOW_createColTypeList_in_createWindowExpr940);
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
                    pushFollow(FOLLOW_createWindowExprInsert_in_createWindowExpr951);
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
            i=(CommonTree)match(input,CREATE_INDEX_EXPR,FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr971); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr973); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr975); 
            pushFollow(FOLLOW_indexColList_in_createIndexExpr977);
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
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexColList992); 

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
            	    pushFollow(FOLLOW_indexCol_in_indexColList994);
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
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexCol1009); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_indexCol1011); 
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
                    match(input,IDENT,FOLLOW_IDENT_in_indexCol1013); 

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
            match(input,INSERT,FOLLOW_INSERT_in_createWindowExprInsert1027); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:200:13: ( valueExpr )?
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=IN_SET && LA64_0<=REGEXP)||LA64_0==NOT_EXPR||(LA64_0>=SUM && LA64_0<=AVG)||(LA64_0>=COALESCE && LA64_0<=COUNT)||(LA64_0>=CASE && LA64_0<=CASE2)||(LA64_0>=PREVIOUS && LA64_0<=EXISTS)||(LA64_0>=INSTANCEOF && LA64_0<=CURRENT_TIMESTAMP)||LA64_0==NEWKW||(LA64_0>=EVAL_AND_EXPR && LA64_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA64_0==EVENT_PROP_EXPR||LA64_0==CONCAT||(LA64_0>=LIB_FUNC_CHAIN && LA64_0<=DOT_EXPR)||LA64_0==ARRAY_EXPR||(LA64_0>=NOT_IN_SET && LA64_0<=NOT_REGEXP)||(LA64_0>=IN_RANGE && LA64_0<=SUBSELECT_EXPR)||(LA64_0>=EXISTS_SUBSELECT_EXPR && LA64_0<=NOT_IN_SUBSELECT_EXPR)||LA64_0==SUBSTITUTION||(LA64_0>=FIRST_AGGREG && LA64_0<=WINDOW_AGGREG)||(LA64_0>=INT_TYPE && LA64_0<=NULL_TYPE)||(LA64_0>=JSON_OBJECT && LA64_0<=JSON_ARRAY)||LA64_0==STAR||(LA64_0>=LT && LA64_0<=GT)||(LA64_0>=BOR && LA64_0<=PLUS)||(LA64_0>=BAND && LA64_0<=BXOR)||(LA64_0>=LE && LA64_0<=GE)||(LA64_0>=MINUS && LA64_0<=MOD)||(LA64_0>=EVAL_IS_GROUP_EXPR && LA64_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt64=1;
                }
                switch (alt64) {
                    case 1 :
                        // EsperEPL2Ast.g:200:13: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_createWindowExprInsert1029);
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
            s=(CommonTree)match(input,CREATE_WINDOW_SELECT_EXPR,FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList1046); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1048);
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
            	    pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1051);
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
            match(input,CREATE_COL_TYPE_LIST,FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1070); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1072);
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
            	    pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1075);
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
            match(input,CREATE_COL_TYPE,FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1090); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1092); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1094); 
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
                    match(input,LBRACK,FOLLOW_LBRACK_in_createColTypeListElement1096); 

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
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1111); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:217:4: ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) )
                    {
                    s=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1121); 

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
                            pushFollow(FOLLOW_eventPropertyExpr_in_createSelectionListElement1141);
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
                                    match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1145); 

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
                            pushFollow(FOLLOW_constant_in_createSelectionListElement1167);
                            constant(true);

                            state._fsp--;

                            match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1170); 

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
            i=(CommonTree)match(input,CREATE_VARIABLE_EXPR,FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1206); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createVariableExpr1208); 
            match(input,IDENT,FOLLOW_IDENT_in_createVariableExpr1210); 
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
                    match(input,IDENT,FOLLOW_IDENT_in_createVariableExpr1212); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:224:54: ( valueExpr )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=IN_SET && LA72_0<=REGEXP)||LA72_0==NOT_EXPR||(LA72_0>=SUM && LA72_0<=AVG)||(LA72_0>=COALESCE && LA72_0<=COUNT)||(LA72_0>=CASE && LA72_0<=CASE2)||(LA72_0>=PREVIOUS && LA72_0<=EXISTS)||(LA72_0>=INSTANCEOF && LA72_0<=CURRENT_TIMESTAMP)||LA72_0==NEWKW||(LA72_0>=EVAL_AND_EXPR && LA72_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA72_0==EVENT_PROP_EXPR||LA72_0==CONCAT||(LA72_0>=LIB_FUNC_CHAIN && LA72_0<=DOT_EXPR)||LA72_0==ARRAY_EXPR||(LA72_0>=NOT_IN_SET && LA72_0<=NOT_REGEXP)||(LA72_0>=IN_RANGE && LA72_0<=SUBSELECT_EXPR)||(LA72_0>=EXISTS_SUBSELECT_EXPR && LA72_0<=NOT_IN_SUBSELECT_EXPR)||LA72_0==SUBSTITUTION||(LA72_0>=FIRST_AGGREG && LA72_0<=WINDOW_AGGREG)||(LA72_0>=INT_TYPE && LA72_0<=NULL_TYPE)||(LA72_0>=JSON_OBJECT && LA72_0<=JSON_ARRAY)||LA72_0==STAR||(LA72_0>=LT && LA72_0<=GT)||(LA72_0>=BOR && LA72_0<=PLUS)||(LA72_0>=BAND && LA72_0<=BXOR)||(LA72_0>=LE && LA72_0<=GE)||(LA72_0>=MINUS && LA72_0<=MOD)||(LA72_0>=EVAL_IS_GROUP_EXPR && LA72_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // EsperEPL2Ast.g:224:54: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_createVariableExpr1215);
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


    // $ANTLR start "createDataflow"
    // EsperEPL2Ast.g:230:1: createDataflow : ^(s= CREATE_DATAFLOW IDENT ( gop )+ ) ;
    public final void createDataflow() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:231:2: ( ^(s= CREATE_DATAFLOW IDENT ( gop )+ ) )
            // EsperEPL2Ast.g:231:4: ^(s= CREATE_DATAFLOW IDENT ( gop )+ )
            {
            s=(CommonTree)match(input,CREATE_DATAFLOW,FOLLOW_CREATE_DATAFLOW_in_createDataflow1240); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createDataflow1242); 
            // EsperEPL2Ast.g:231:30: ( gop )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==CREATE_SCHEMA_EXPR||LA73_0==GOP) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // EsperEPL2Ast.g:231:30: gop
            	    {
            	    pushFollow(FOLLOW_gop_in_createDataflow1244);
            	    gop();

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
    // $ANTLR end "createDataflow"


    // $ANTLR start "gop"
    // EsperEPL2Ast.g:234:1: gop : ( ^( GOP ( IDENT | SELECT ) ( gopParam )? ( gopOut )? ( gopDetail )? ( annotation[false] )* ) | createSchemaExpr[false] );
    public final void gop() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:235:2: ( ^( GOP ( IDENT | SELECT ) ( gopParam )? ( gopOut )? ( gopDetail )? ( annotation[false] )* ) | createSchemaExpr[false] )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==GOP) ) {
                alt78=1;
            }
            else if ( (LA78_0==CREATE_SCHEMA_EXPR) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // EsperEPL2Ast.g:235:4: ^( GOP ( IDENT | SELECT ) ( gopParam )? ( gopOut )? ( gopDetail )? ( annotation[false] )* )
                    {
                    match(input,GOP,FOLLOW_GOP_in_gop1261); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==SELECT||input.LA(1)==IDENT ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:235:25: ( gopParam )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==GOPPARAM) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // EsperEPL2Ast.g:235:25: gopParam
                            {
                            pushFollow(FOLLOW_gopParam_in_gop1269);
                            gopParam();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:235:35: ( gopOut )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==GOPOUT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // EsperEPL2Ast.g:235:35: gopOut
                            {
                            pushFollow(FOLLOW_gopOut_in_gop1272);
                            gopOut();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:235:43: ( gopDetail )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==GOPCFG) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // EsperEPL2Ast.g:235:43: gopDetail
                            {
                            pushFollow(FOLLOW_gopDetail_in_gop1275);
                            gopDetail();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:235:54: ( annotation[false] )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==ANNOTATION) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:235:55: annotation[false]
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_gop1279);
                    	    annotation(false);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:236:4: createSchemaExpr[false]
                    {
                    pushFollow(FOLLOW_createSchemaExpr_in_gop1288);
                    createSchemaExpr(false);

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
    // $ANTLR end "gop"


    // $ANTLR start "gopParam"
    // EsperEPL2Ast.g:239:1: gopParam : ^( GOPPARAM ( gopParamItem )* ) ;
    public final void gopParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:240:2: ( ^( GOPPARAM ( gopParamItem )* ) )
            // EsperEPL2Ast.g:240:4: ^( GOPPARAM ( gopParamItem )* )
            {
            match(input,GOPPARAM,FOLLOW_GOPPARAM_in_gopParam1303); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:240:15: ( gopParamItem )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==GOPPARAMITM) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // EsperEPL2Ast.g:240:15: gopParamItem
                	    {
                	    pushFollow(FOLLOW_gopParamItem_in_gopParam1305);
                	    gopParamItem();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop79;
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
    // $ANTLR end "gopParam"


    // $ANTLR start "gopParamItem"
    // EsperEPL2Ast.g:243:1: gopParamItem : ^( GOPPARAMITM ( CLASS_IDENT )+ ( ^( AS IDENT ) )? ) ;
    public final void gopParamItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:244:2: ( ^( GOPPARAMITM ( CLASS_IDENT )+ ( ^( AS IDENT ) )? ) )
            // EsperEPL2Ast.g:244:4: ^( GOPPARAMITM ( CLASS_IDENT )+ ( ^( AS IDENT ) )? )
            {
            match(input,GOPPARAMITM,FOLLOW_GOPPARAMITM_in_gopParamItem1319); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:244:18: ( CLASS_IDENT )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==CLASS_IDENT) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // EsperEPL2Ast.g:244:18: CLASS_IDENT
            	    {
            	    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_gopParamItem1321); 

            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            // EsperEPL2Ast.g:244:31: ( ^( AS IDENT ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==AS) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // EsperEPL2Ast.g:244:32: ^( AS IDENT )
                    {
                    match(input,AS,FOLLOW_AS_in_gopParamItem1326); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_gopParamItem1328); 

                    match(input, Token.UP, null); 

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
    // $ANTLR end "gopParamItem"


    // $ANTLR start "gopOut"
    // EsperEPL2Ast.g:247:1: gopOut : ^( GOPOUT ( gopOutItem )* ) ;
    public final void gopOut() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:248:2: ( ^( GOPOUT ( gopOutItem )* ) )
            // EsperEPL2Ast.g:248:4: ^( GOPOUT ( gopOutItem )* )
            {
            match(input,GOPOUT,FOLLOW_GOPOUT_in_gopOut1344); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:248:13: ( gopOutItem )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==GOPOUTITM) ) {
                        alt82=1;
                    }


                    switch (alt82) {
                	case 1 :
                	    // EsperEPL2Ast.g:248:13: gopOutItem
                	    {
                	    pushFollow(FOLLOW_gopOutItem_in_gopOut1346);
                	    gopOutItem();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop82;
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
    // $ANTLR end "gopOut"


    // $ANTLR start "gopOutItem"
    // EsperEPL2Ast.g:251:1: gopOutItem : ^( GOPOUTITM CLASS_IDENT ( gopOutTypeParam )* ) ;
    public final void gopOutItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:252:2: ( ^( GOPOUTITM CLASS_IDENT ( gopOutTypeParam )* ) )
            // EsperEPL2Ast.g:252:4: ^( GOPOUTITM CLASS_IDENT ( gopOutTypeParam )* )
            {
            match(input,GOPOUTITM,FOLLOW_GOPOUTITM_in_gopOutItem1360); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_gopOutItem1362); 
            // EsperEPL2Ast.g:252:28: ( gopOutTypeParam )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==GOPOUTTYP) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // EsperEPL2Ast.g:252:28: gopOutTypeParam
            	    {
            	    pushFollow(FOLLOW_gopOutTypeParam_in_gopOutItem1364);
            	    gopOutTypeParam();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop83;
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
    // $ANTLR end "gopOutItem"


    // $ANTLR start "gopOutTypeParam"
    // EsperEPL2Ast.g:255:1: gopOutTypeParam : ^( GOPOUTTYP ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION ) ) ;
    public final void gopOutTypeParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:256:2: ( ^( GOPOUTTYP ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION ) ) )
            // EsperEPL2Ast.g:256:4: ^( GOPOUTTYP ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION ) )
            {
            match(input,GOPOUTTYP,FOLLOW_GOPOUTTYP_in_gopOutTypeParam1379); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:256:16: ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==CLASS_IDENT) ) {
                alt85=1;
            }
            else if ( (LA85_0==QUESTION) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // EsperEPL2Ast.g:256:17: ( CLASS_IDENT ( gopOutTypeParam )* )
                    {
                    // EsperEPL2Ast.g:256:17: ( CLASS_IDENT ( gopOutTypeParam )* )
                    // EsperEPL2Ast.g:256:18: CLASS_IDENT ( gopOutTypeParam )*
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_gopOutTypeParam1383); 
                    // EsperEPL2Ast.g:256:30: ( gopOutTypeParam )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==GOPOUTTYP) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:256:30: gopOutTypeParam
                    	    {
                    	    pushFollow(FOLLOW_gopOutTypeParam_in_gopOutTypeParam1385);
                    	    gopOutTypeParam();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:256:50: QUESTION
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_gopOutTypeParam1391); 

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
    // $ANTLR end "gopOutTypeParam"


    // $ANTLR start "gopDetail"
    // EsperEPL2Ast.g:259:1: gopDetail : ^( GOPCFG ( gopConfig )+ ) ;
    public final void gopDetail() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:260:2: ( ^( GOPCFG ( gopConfig )+ ) )
            // EsperEPL2Ast.g:260:4: ^( GOPCFG ( gopConfig )+ )
            {
            match(input,GOPCFG,FOLLOW_GOPCFG_in_gopDetail1405); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:260:13: ( gopConfig )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=GOPCFGITM && LA86_0<=GOPCFGEPL)||LA86_0==GOPCFGEXP) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // EsperEPL2Ast.g:260:13: gopConfig
            	    {
            	    pushFollow(FOLLOW_gopConfig_in_gopDetail1407);
            	    gopConfig();

            	    state._fsp--;


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
    // $ANTLR end "gopDetail"


    // $ANTLR start "gopConfig"
    // EsperEPL2Ast.g:263:1: gopConfig : ( ^(a= GOPCFGITM IDENT valueExpr ) | ^(b= GOPCFGEXP valueExpr ) | ^(c= GOPCFGEPL selectExpr ) );
    public final void gopConfig() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:264:2: ( ^(a= GOPCFGITM IDENT valueExpr ) | ^(b= GOPCFGEXP valueExpr ) | ^(c= GOPCFGEPL selectExpr ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case GOPCFGITM:
                {
                alt87=1;
                }
                break;
            case GOPCFGEXP:
                {
                alt87=2;
                }
                break;
            case GOPCFGEPL:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // EsperEPL2Ast.g:264:4: ^(a= GOPCFGITM IDENT valueExpr )
                    {
                    a=(CommonTree)match(input,GOPCFGITM,FOLLOW_GOPCFGITM_in_gopConfig1423); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_gopConfig1425); 
                    pushFollow(FOLLOW_valueExpr_in_gopConfig1427);
                    valueExpr();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:265:4: ^(b= GOPCFGEXP valueExpr )
                    {
                    b=(CommonTree)match(input,GOPCFGEXP,FOLLOW_GOPCFGEXP_in_gopConfig1438); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_gopConfig1440);
                    valueExpr();

                    state._fsp--;

                     leaveNode(b); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:266:4: ^(c= GOPCFGEPL selectExpr )
                    {
                    c=(CommonTree)match(input,GOPCFGEPL,FOLLOW_GOPCFGEPL_in_gopConfig1451); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_selectExpr_in_gopConfig1453);
                    selectExpr();

                    state._fsp--;

                     leaveNode(c); 

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
    // $ANTLR end "gopConfig"


    // $ANTLR start "jsonvalue"
    // EsperEPL2Ast.g:269:1: jsonvalue : ( constant[false] | jsonobject[false] | jsonarray[false] );
    public final void jsonvalue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:270:2: ( constant[false] | jsonobject[false] | jsonarray[false] )
            int alt88=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt88=1;
                }
                break;
            case JSON_OBJECT:
                {
                alt88=2;
                }
                break;
            case JSON_ARRAY:
                {
                alt88=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // EsperEPL2Ast.g:270:5: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_jsonvalue1469);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:271:5: jsonobject[false]
                    {
                    pushFollow(FOLLOW_jsonobject_in_jsonvalue1476);
                    jsonobject(false);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:272:5: jsonarray[false]
                    {
                    pushFollow(FOLLOW_jsonarray_in_jsonvalue1483);
                    jsonarray(false);

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
    // $ANTLR end "jsonvalue"


    // $ANTLR start "jsonobject"
    // EsperEPL2Ast.g:275:1: jsonobject[boolean isLeaveNode] : ^(o= JSON_OBJECT ( jsonpair )* ) ;
    public final void jsonobject(boolean isLeaveNode) throws RecognitionException {
        CommonTree o=null;

        try {
            // EsperEPL2Ast.g:276:2: ( ^(o= JSON_OBJECT ( jsonpair )* ) )
            // EsperEPL2Ast.g:276:5: ^(o= JSON_OBJECT ( jsonpair )* )
            {
            o=(CommonTree)match(input,JSON_OBJECT,FOLLOW_JSON_OBJECT_in_jsonobject1500); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:276:21: ( jsonpair )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==JSON_FIELD) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // EsperEPL2Ast.g:276:21: jsonpair
                	    {
                	    pushFollow(FOLLOW_jsonpair_in_jsonobject1502);
                	    jsonpair();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);

                 if (isLeaveNode) leaveNode(o); 

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
    // $ANTLR end "jsonobject"


    // $ANTLR start "jsonarray"
    // EsperEPL2Ast.g:279:1: jsonarray[boolean isLeaveNode] : ^(a= JSON_ARRAY ( jsonvalue )* ) ;
    public final void jsonarray(boolean isLeaveNode) throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:280:9: ( ^(a= JSON_ARRAY ( jsonvalue )* ) )
            // EsperEPL2Ast.g:280:12: ^(a= JSON_ARRAY ( jsonvalue )* )
            {
            a=(CommonTree)match(input,JSON_ARRAY,FOLLOW_JSON_ARRAY_in_jsonarray1531); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:280:27: ( jsonvalue )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( ((LA90_0>=INT_TYPE && LA90_0<=NULL_TYPE)||(LA90_0>=JSON_OBJECT && LA90_0<=JSON_ARRAY)) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // EsperEPL2Ast.g:280:27: jsonvalue
                	    {
                	    pushFollow(FOLLOW_jsonvalue_in_jsonarray1533);
                	    jsonvalue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);

                 if (isLeaveNode) leaveNode(a); 

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
    // $ANTLR end "jsonarray"


    // $ANTLR start "jsonpair"
    // EsperEPL2Ast.g:283:1: jsonpair : ^( JSON_FIELD ( constant[false] | IDENT ) jsonvalue ) ;
    public final void jsonpair() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:284:2: ( ^( JSON_FIELD ( constant[false] | IDENT ) jsonvalue ) )
            // EsperEPL2Ast.g:284:5: ^( JSON_FIELD ( constant[false] | IDENT ) jsonvalue )
            {
            match(input,JSON_FIELD,FOLLOW_JSON_FIELD_in_jsonpair1551); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:284:18: ( constant[false] | IDENT )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=INT_TYPE && LA91_0<=NULL_TYPE)) ) {
                alt91=1;
            }
            else if ( (LA91_0==IDENT) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // EsperEPL2Ast.g:284:19: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_jsonpair1554);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:284:37: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_jsonpair1559); 

                    }
                    break;

            }

            pushFollow(FOLLOW_jsonvalue_in_jsonpair1562);
            jsonvalue();

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
    // $ANTLR end "jsonpair"


    // $ANTLR start "createContextExpr"
    // EsperEPL2Ast.g:290:1: createContextExpr : ^(s= CREATE_CTX IDENT createContextDetail ) ;
    public final void createContextExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:291:2: ( ^(s= CREATE_CTX IDENT createContextDetail ) )
            // EsperEPL2Ast.g:291:4: ^(s= CREATE_CTX IDENT createContextDetail )
            {
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextExpr1582); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextExpr1584); 
            pushFollow(FOLLOW_createContextDetail_in_createContextExpr1586);
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
    // EsperEPL2Ast.g:294:1: createContextDetail : ( ^( CREATE_CTX_FIXED createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? ) | ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ ) );
    public final void createContextDetail() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:295:2: ( ^( CREATE_CTX_FIXED createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? ) | ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ ) )
            int alt97=6;
            switch ( input.LA(1) ) {
            case CREATE_CTX_FIXED:
                {
                alt97=1;
                }
                break;
            case CREATE_CTX_INIT:
                {
                alt97=2;
                }
                break;
            case CREATE_CTX_PART:
                {
                alt97=3;
                }
                break;
            case CREATE_CTX_CAT:
                {
                alt97=4;
                }
                break;
            case CREATE_CTX_COAL:
                {
                alt97=5;
                }
                break;
            case CREATE_CTX_NESTED:
                {
                alt97=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // EsperEPL2Ast.g:295:4: ^( CREATE_CTX_FIXED createContextRangePoint createContextRangePoint )
                    {
                    match(input,CREATE_CTX_FIXED,FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1602); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1604);
                    createContextRangePoint();

                    state._fsp--;

                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1606);
                    createContextRangePoint();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:296:4: ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint )
                    {
                    match(input,CREATE_CTX_INIT,FOLLOW_CREATE_CTX_INIT_in_createContextDetail1613); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1615);
                    createContextRangePoint();

                    state._fsp--;

                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1617);
                    createContextRangePoint();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:297:4: ^( CREATE_CTX_PART ( createContextPartitionItem )+ )
                    {
                    match(input,CREATE_CTX_PART,FOLLOW_CREATE_CTX_PART_in_createContextDetail1624); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:297:22: ( createContextPartitionItem )+
                    int cnt92=0;
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==PARTITIONITEM) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:297:22: createContextPartitionItem
                    	    {
                    	    pushFollow(FOLLOW_createContextPartitionItem_in_createContextDetail1626);
                    	    createContextPartitionItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt92 >= 1 ) break loop92;
                                EarlyExitException eee =
                                    new EarlyExitException(92, input);
                                throw eee;
                        }
                        cnt92++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:298:4: ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] )
                    {
                    match(input,CREATE_CTX_CAT,FOLLOW_CREATE_CTX_CAT_in_createContextDetail1634); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:298:21: ( createContextCategoryItem )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==CREATE_CTX_CATITEM) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:298:21: createContextCategoryItem
                    	    {
                    	    pushFollow(FOLLOW_createContextCategoryItem_in_createContextDetail1636);
                    	    createContextCategoryItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt93 >= 1 ) break loop93;
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
                    } while (true);

                    pushFollow(FOLLOW_eventFilterExpr_in_createContextDetail1639);
                    eventFilterExpr(false);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:299:4: ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? )
                    {
                    match(input,CREATE_CTX_COAL,FOLLOW_CREATE_CTX_COAL_in_createContextDetail1647); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:299:22: ( createContextCoalesceItem )+
                    int cnt94=0;
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==COALESCE) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:299:22: createContextCoalesceItem
                    	    {
                    	    pushFollow(FOLLOW_createContextCoalesceItem_in_createContextDetail1649);
                    	    createContextCoalesceItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt94 >= 1 ) break loop94;
                                EarlyExitException eee =
                                    new EarlyExitException(94, input);
                                throw eee;
                        }
                        cnt94++;
                    } while (true);

                    match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1652); 
                    pushFollow(FOLLOW_number_in_createContextDetail1654);
                    number();

                    state._fsp--;

                    // EsperEPL2Ast.g:299:62: ( IDENT )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==IDENT) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // EsperEPL2Ast.g:299:62: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1656); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:300:4: ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ )
                    {
                    match(input,CREATE_CTX_NESTED,FOLLOW_CREATE_CTX_NESTED_in_createContextDetail1664); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextNested_in_createContextDetail1666);
                    createContextNested();

                    state._fsp--;

                    // EsperEPL2Ast.g:300:44: ( createContextNested )+
                    int cnt96=0;
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==CREATE_CTX) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:300:44: createContextNested
                    	    {
                    	    pushFollow(FOLLOW_createContextNested_in_createContextDetail1668);
                    	    createContextNested();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt96 >= 1 ) break loop96;
                                EarlyExitException eee =
                                    new EarlyExitException(96, input);
                                throw eee;
                        }
                        cnt96++;
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
    // EsperEPL2Ast.g:303:1: createContextRangePoint : ( createContextFilter | ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? ) | crontabLimitParameterSet | ^( AFTER timePeriod ) );
    public final void createContextRangePoint() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:304:2: ( createContextFilter | ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? ) | crontabLimitParameterSet | ^( AFTER timePeriod ) )
            int alt99=4;
            switch ( input.LA(1) ) {
            case STREAM_EXPR:
                {
                alt99=1;
                }
                break;
            case CREATE_CTX_PATTERN:
                {
                alt99=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR_PARAM:
                {
                alt99=3;
                }
                break;
            case AFTER:
                {
                alt99=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // EsperEPL2Ast.g:304:4: createContextFilter
                    {
                    pushFollow(FOLLOW_createContextFilter_in_createContextRangePoint1681);
                    createContextFilter();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:305:5: ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? )
                    {
                    match(input,CREATE_CTX_PATTERN,FOLLOW_CREATE_CTX_PATTERN_in_createContextRangePoint1689); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_patternInclusionExpression_in_createContextRangePoint1691);
                    patternInclusionExpression();

                    state._fsp--;

                    // EsperEPL2Ast.g:305:53: ( IDENT )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==IDENT) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // EsperEPL2Ast.g:305:53: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextRangePoint1693); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:306:4: crontabLimitParameterSet
                    {
                    pushFollow(FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1700);
                    crontabLimitParameterSet();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:307:4: ^( AFTER timePeriod )
                    {
                    match(input,AFTER,FOLLOW_AFTER_in_createContextRangePoint1706); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_timePeriod_in_createContextRangePoint1708);
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
    // EsperEPL2Ast.g:310:1: createContextNested : ^(s= CREATE_CTX IDENT createContextDetail ) ;
    public final void createContextNested() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:311:2: ( ^(s= CREATE_CTX IDENT createContextDetail ) )
            // EsperEPL2Ast.g:311:4: ^(s= CREATE_CTX IDENT createContextDetail )
            {
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextNested1724); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextNested1726); 
            pushFollow(FOLLOW_createContextDetail_in_createContextNested1728);
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
    // EsperEPL2Ast.g:314:1: createContextFilter : ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? ) ;
    public final void createContextFilter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:315:2: ( ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? ) )
            // EsperEPL2Ast.g:315:4: ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? )
            {
            match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_createContextFilter1741); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextFilter1743);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:315:41: ( IDENT )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==IDENT) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // EsperEPL2Ast.g:315:41: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createContextFilter1746); 

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
    // EsperEPL2Ast.g:318:1: createContextPartitionItem : ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) ;
    public final void createContextPartitionItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:319:2: ( ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) )
            // EsperEPL2Ast.g:319:4: ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ )
            {
            match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_createContextPartitionItem1762); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextPartitionItem1764);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:319:43: ( eventPropertyExpr[false] )+
            int cnt101=0;
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==EVENT_PROP_EXPR) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // EsperEPL2Ast.g:319:43: eventPropertyExpr[false]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_createContextPartitionItem1767);
            	    eventPropertyExpr(false);

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


            match(input, Token.UP, null); 

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
    // EsperEPL2Ast.g:322:1: createContextCoalesceItem : ^( COALESCE libFunctionWithClass eventFilterExpr[false] ) ;
    public final void createContextCoalesceItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:323:2: ( ^( COALESCE libFunctionWithClass eventFilterExpr[false] ) )
            // EsperEPL2Ast.g:323:4: ^( COALESCE libFunctionWithClass eventFilterExpr[false] )
            {
            match(input,COALESCE,FOLLOW_COALESCE_in_createContextCoalesceItem1784); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1786);
            libFunctionWithClass();

            state._fsp--;

            pushFollow(FOLLOW_eventFilterExpr_in_createContextCoalesceItem1788);
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
    // EsperEPL2Ast.g:326:1: createContextCategoryItem : ^( CREATE_CTX_CATITEM valueExpr IDENT ) ;
    public final void createContextCategoryItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:327:2: ( ^( CREATE_CTX_CATITEM valueExpr IDENT ) )
            // EsperEPL2Ast.g:327:4: ^( CREATE_CTX_CATITEM valueExpr IDENT )
            {
            match(input,CREATE_CTX_CATITEM,FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1804); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_createContextCategoryItem1806);
            valueExpr();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_createContextCategoryItem1808); 

            match(input, Token.UP, null); 

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
    // EsperEPL2Ast.g:330:1: createSchemaExpr[boolean isLeaveNode] : ^(s= CREATE_SCHEMA_EXPR createSchemaDef ( IDENT )? ) ;
    public final void createSchemaExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:331:2: ( ^(s= CREATE_SCHEMA_EXPR createSchemaDef ( IDENT )? ) )
            // EsperEPL2Ast.g:331:4: ^(s= CREATE_SCHEMA_EXPR createSchemaDef ( IDENT )? )
            {
            s=(CommonTree)match(input,CREATE_SCHEMA_EXPR,FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1826); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createSchemaDef_in_createSchemaExpr1828);
            createSchemaDef();

            state._fsp--;

            // EsperEPL2Ast.g:331:43: ( IDENT )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==IDENT) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // EsperEPL2Ast.g:331:43: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1830); 

                    }
                    break;

            }

             if (isLeaveNode) leaveNode(s); 

            match(input, Token.UP, null); 

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


    // $ANTLR start "createSchemaDef"
    // EsperEPL2Ast.g:334:1: createSchemaDef : ^( CREATE_SCHEMA_DEF IDENT ( variantList | ( createColTypeList )? ) ( createSchemaQual )* ) ;
    public final void createSchemaDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:335:2: ( ^( CREATE_SCHEMA_DEF IDENT ( variantList | ( createColTypeList )? ) ( createSchemaQual )* ) )
            // EsperEPL2Ast.g:335:4: ^( CREATE_SCHEMA_DEF IDENT ( variantList | ( createColTypeList )? ) ( createSchemaQual )* )
            {
            match(input,CREATE_SCHEMA_DEF,FOLLOW_CREATE_SCHEMA_DEF_in_createSchemaDef1847); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaDef1849); 
            // EsperEPL2Ast.g:335:30: ( variantList | ( createColTypeList )? )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==VARIANT_LIST) ) {
                alt104=1;
            }
            else if ( (LA104_0==UP||LA104_0==CREATE_COL_TYPE_LIST||LA104_0==CREATE_SCHEMA_EXPR_QUAL) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // EsperEPL2Ast.g:335:31: variantList
                    {
                    pushFollow(FOLLOW_variantList_in_createSchemaDef1852);
                    variantList();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:335:43: ( createColTypeList )?
                    {
                    // EsperEPL2Ast.g:335:43: ( createColTypeList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==CREATE_COL_TYPE_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // EsperEPL2Ast.g:335:43: createColTypeList
                            {
                            pushFollow(FOLLOW_createColTypeList_in_createSchemaDef1854);
                            createColTypeList();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:335:63: ( createSchemaQual )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==CREATE_SCHEMA_EXPR_QUAL) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // EsperEPL2Ast.g:335:63: createSchemaQual
            	    {
            	    pushFollow(FOLLOW_createSchemaQual_in_createSchemaDef1858);
            	    createSchemaQual();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop105;
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
    // $ANTLR end "createSchemaDef"


    // $ANTLR start "createSchemaQual"
    // EsperEPL2Ast.g:338:1: createSchemaQual : ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) ;
    public final void createSchemaQual() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:339:2: ( ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) )
            // EsperEPL2Ast.g:339:4: ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol )
            {
            match(input,CREATE_SCHEMA_EXPR_QUAL,FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1873); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaQual1875); 
            pushFollow(FOLLOW_exprCol_in_createSchemaQual1877);
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
    // EsperEPL2Ast.g:342:1: variantList : ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) ;
    public final void variantList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:343:2: ( ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) )
            // EsperEPL2Ast.g:343:4: ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ )
            {
            match(input,VARIANT_LIST,FOLLOW_VARIANT_LIST_in_variantList1893); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:343:19: ( STAR | CLASS_IDENT )+
            int cnt106=0;
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==CLASS_IDENT||LA106_0==STAR) ) {
                    alt106=1;
                }


                switch (alt106) {
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
            	    if ( cnt106 >= 1 ) break loop106;
                        EarlyExitException eee =
                            new EarlyExitException(106, input);
                        throw eee;
                }
                cnt106++;
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
    // EsperEPL2Ast.g:346:1: selectExpr : ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? ;
    public final void selectExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:347:2: ( ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? )
            // EsperEPL2Ast.g:347:4: ( insertIntoExpr )? selectClause fromClause ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )?
            {
            // EsperEPL2Ast.g:347:4: ( insertIntoExpr )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==INSERTINTO_EXPR) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // EsperEPL2Ast.g:347:5: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_selectExpr1913);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_selectClause_in_selectExpr1919);
            selectClause();

            state._fsp--;

            pushFollow(FOLLOW_fromClause_in_selectExpr1924);
            fromClause();

            state._fsp--;

            // EsperEPL2Ast.g:350:3: ( matchRecogClause )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==MATCH_RECOGNIZE) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // EsperEPL2Ast.g:350:4: matchRecogClause
                    {
                    pushFollow(FOLLOW_matchRecogClause_in_selectExpr1929);
                    matchRecogClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:351:3: ( whereClause[true] )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==WHERE_EXPR) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // EsperEPL2Ast.g:351:4: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr1936);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:352:3: ( groupByClause )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==GROUP_BY_EXPR) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // EsperEPL2Ast.g:352:4: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_selectExpr1944);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:353:3: ( havingClause )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==HAVING_EXPR) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // EsperEPL2Ast.g:353:4: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_selectExpr1951);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:354:3: ( outputLimitExpr )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=EVENT_LIMIT_EXPR && LA112_0<=CRONTAB_LIMIT_EXPR)||(LA112_0>=WHEN_LIMIT_EXPR && LA112_0<=TERM_LIMIT_EXPR)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // EsperEPL2Ast.g:354:4: outputLimitExpr
                    {
                    pushFollow(FOLLOW_outputLimitExpr_in_selectExpr1958);
                    outputLimitExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:355:3: ( orderByClause )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==ORDER_BY_EXPR) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // EsperEPL2Ast.g:355:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_selectExpr1965);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:356:3: ( rowLimitClause )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ROW_LIMIT_EXPR) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // EsperEPL2Ast.g:356:4: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_selectExpr1972);
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
    // EsperEPL2Ast.g:359:1: insertIntoExpr : ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? ) ;
    public final void insertIntoExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:360:2: ( ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? ) )
            // EsperEPL2Ast.g:360:4: ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM )? CLASS_IDENT ( exprCol )? )
            {
            i=(CommonTree)match(input,INSERTINTO_EXPR,FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1989); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:360:24: ( ISTREAM | RSTREAM )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=RSTREAM && LA115_0<=ISTREAM)) ) {
                alt115=1;
            }
            switch (alt115) {
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

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_insertIntoExpr2000); 
            // EsperEPL2Ast.g:360:57: ( exprCol )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==EXPRCOL) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // EsperEPL2Ast.g:360:58: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_insertIntoExpr2003);
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
    // EsperEPL2Ast.g:363:1: exprCol : ^( EXPRCOL IDENT ( IDENT )* ) ;
    public final void exprCol() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:364:2: ( ^( EXPRCOL IDENT ( IDENT )* ) )
            // EsperEPL2Ast.g:364:4: ^( EXPRCOL IDENT ( IDENT )* )
            {
            match(input,EXPRCOL,FOLLOW_EXPRCOL_in_exprCol2022); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_exprCol2024); 
            // EsperEPL2Ast.g:364:20: ( IDENT )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==IDENT) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // EsperEPL2Ast.g:364:21: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_exprCol2027); 

            	    }
            	    break;

            	default :
            	    break loop117;
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
    // EsperEPL2Ast.g:367:1: selectClause : ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) ;
    public final void selectClause() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:368:2: ( ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) )
            // EsperEPL2Ast.g:368:4: ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList )
            {
            s=(CommonTree)match(input,SELECTION_EXPR,FOLLOW_SELECTION_EXPR_in_selectClause2045); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:368:23: ( RSTREAM | ISTREAM | IRSTREAM )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=RSTREAM && LA118_0<=IRSTREAM)) ) {
                alt118=1;
            }
            switch (alt118) {
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

            // EsperEPL2Ast.g:368:55: ( DISTINCT )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==DISTINCT) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // EsperEPL2Ast.g:368:55: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause2060); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_selectClause2063);
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
    // EsperEPL2Ast.g:371:1: fromClause : streamExpression ( streamExpression ( outerJoin )* )* ;
    public final void fromClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:372:2: ( streamExpression ( streamExpression ( outerJoin )* )* )
            // EsperEPL2Ast.g:372:4: streamExpression ( streamExpression ( outerJoin )* )*
            {
            pushFollow(FOLLOW_streamExpression_in_fromClause2077);
            streamExpression();

            state._fsp--;

            // EsperEPL2Ast.g:372:21: ( streamExpression ( outerJoin )* )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==STREAM_EXPR) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // EsperEPL2Ast.g:372:22: streamExpression ( outerJoin )*
            	    {
            	    pushFollow(FOLLOW_streamExpression_in_fromClause2080);
            	    streamExpression();

            	    state._fsp--;

            	    // EsperEPL2Ast.g:372:39: ( outerJoin )*
            	    loop120:
            	    do {
            	        int alt120=2;
            	        int LA120_0 = input.LA(1);

            	        if ( ((LA120_0>=INNERJOIN_EXPR && LA120_0<=FULL_OUTERJOIN_EXPR)) ) {
            	            alt120=1;
            	        }


            	        switch (alt120) {
            	    	case 1 :
            	    	    // EsperEPL2Ast.g:372:40: outerJoin
            	    	    {
            	    	    pushFollow(FOLLOW_outerJoin_in_fromClause2083);
            	    	    outerJoin();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop120;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop121;
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
    // EsperEPL2Ast.g:375:1: forExpr : ^(f= FOR IDENT ( valueExpr )* ) ;
    public final void forExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:376:2: ( ^(f= FOR IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:376:4: ^(f= FOR IDENT ( valueExpr )* )
            {
            f=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forExpr2103); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_forExpr2105); 
            // EsperEPL2Ast.g:376:18: ( valueExpr )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( ((LA122_0>=IN_SET && LA122_0<=REGEXP)||LA122_0==NOT_EXPR||(LA122_0>=SUM && LA122_0<=AVG)||(LA122_0>=COALESCE && LA122_0<=COUNT)||(LA122_0>=CASE && LA122_0<=CASE2)||(LA122_0>=PREVIOUS && LA122_0<=EXISTS)||(LA122_0>=INSTANCEOF && LA122_0<=CURRENT_TIMESTAMP)||LA122_0==NEWKW||(LA122_0>=EVAL_AND_EXPR && LA122_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA122_0==EVENT_PROP_EXPR||LA122_0==CONCAT||(LA122_0>=LIB_FUNC_CHAIN && LA122_0<=DOT_EXPR)||LA122_0==ARRAY_EXPR||(LA122_0>=NOT_IN_SET && LA122_0<=NOT_REGEXP)||(LA122_0>=IN_RANGE && LA122_0<=SUBSELECT_EXPR)||(LA122_0>=EXISTS_SUBSELECT_EXPR && LA122_0<=NOT_IN_SUBSELECT_EXPR)||LA122_0==SUBSTITUTION||(LA122_0>=FIRST_AGGREG && LA122_0<=WINDOW_AGGREG)||(LA122_0>=INT_TYPE && LA122_0<=NULL_TYPE)||(LA122_0>=JSON_OBJECT && LA122_0<=JSON_ARRAY)||LA122_0==STAR||(LA122_0>=LT && LA122_0<=GT)||(LA122_0>=BOR && LA122_0<=PLUS)||(LA122_0>=BAND && LA122_0<=BXOR)||(LA122_0>=LE && LA122_0<=GE)||(LA122_0>=MINUS && LA122_0<=MOD)||(LA122_0>=EVAL_IS_GROUP_EXPR && LA122_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // EsperEPL2Ast.g:376:18: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_forExpr2107);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop122;
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
    // EsperEPL2Ast.g:379:1: matchRecogClause : ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) ;
    public final void matchRecogClause() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:380:2: ( ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) )
            // EsperEPL2Ast.g:380:4: ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine )
            {
            m=(CommonTree)match(input,MATCH_RECOGNIZE,FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause2126); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:380:24: ( matchRecogPartitionBy )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==PARTITIONITEM) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // EsperEPL2Ast.g:380:24: matchRecogPartitionBy
                    {
                    pushFollow(FOLLOW_matchRecogPartitionBy_in_matchRecogClause2128);
                    matchRecogPartitionBy();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogMeasures_in_matchRecogClause2135);
            matchRecogMeasures();

            state._fsp--;

            // EsperEPL2Ast.g:382:4: ( ALL )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==ALL) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // EsperEPL2Ast.g:382:4: ALL
                    {
                    match(input,ALL,FOLLOW_ALL_in_matchRecogClause2141); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:383:4: ( matchRecogMatchesAfterSkip )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==MATCHREC_AFTER_SKIP) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // EsperEPL2Ast.g:383:4: matchRecogMatchesAfterSkip
                    {
                    pushFollow(FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause2147);
                    matchRecogMatchesAfterSkip();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogPattern_in_matchRecogClause2153);
            matchRecogPattern();

            state._fsp--;

            // EsperEPL2Ast.g:385:4: ( matchRecogMatchesInterval )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==MATCHREC_INTERVAL) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // EsperEPL2Ast.g:385:4: matchRecogMatchesInterval
                    {
                    pushFollow(FOLLOW_matchRecogMatchesInterval_in_matchRecogClause2159);
                    matchRecogMatchesInterval();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogDefine_in_matchRecogClause2165);
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
    // EsperEPL2Ast.g:389:1: matchRecogPartitionBy : ^(p= PARTITIONITEM ( valueExpr )+ ) ;
    public final void matchRecogPartitionBy() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:390:2: ( ^(p= PARTITIONITEM ( valueExpr )+ ) )
            // EsperEPL2Ast.g:390:4: ^(p= PARTITIONITEM ( valueExpr )+ )
            {
            p=(CommonTree)match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy2183); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:390:22: ( valueExpr )+
            int cnt127=0;
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( ((LA127_0>=IN_SET && LA127_0<=REGEXP)||LA127_0==NOT_EXPR||(LA127_0>=SUM && LA127_0<=AVG)||(LA127_0>=COALESCE && LA127_0<=COUNT)||(LA127_0>=CASE && LA127_0<=CASE2)||(LA127_0>=PREVIOUS && LA127_0<=EXISTS)||(LA127_0>=INSTANCEOF && LA127_0<=CURRENT_TIMESTAMP)||LA127_0==NEWKW||(LA127_0>=EVAL_AND_EXPR && LA127_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA127_0==EVENT_PROP_EXPR||LA127_0==CONCAT||(LA127_0>=LIB_FUNC_CHAIN && LA127_0<=DOT_EXPR)||LA127_0==ARRAY_EXPR||(LA127_0>=NOT_IN_SET && LA127_0<=NOT_REGEXP)||(LA127_0>=IN_RANGE && LA127_0<=SUBSELECT_EXPR)||(LA127_0>=EXISTS_SUBSELECT_EXPR && LA127_0<=NOT_IN_SUBSELECT_EXPR)||LA127_0==SUBSTITUTION||(LA127_0>=FIRST_AGGREG && LA127_0<=WINDOW_AGGREG)||(LA127_0>=INT_TYPE && LA127_0<=NULL_TYPE)||(LA127_0>=JSON_OBJECT && LA127_0<=JSON_ARRAY)||LA127_0==STAR||(LA127_0>=LT && LA127_0<=GT)||(LA127_0>=BOR && LA127_0<=PLUS)||(LA127_0>=BAND && LA127_0<=BXOR)||(LA127_0>=LE && LA127_0<=GE)||(LA127_0>=MINUS && LA127_0<=MOD)||(LA127_0>=EVAL_IS_GROUP_EXPR && LA127_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // EsperEPL2Ast.g:390:22: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_matchRecogPartitionBy2185);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt127 >= 1 ) break loop127;
                        EarlyExitException eee =
                            new EarlyExitException(127, input);
                        throw eee;
                }
                cnt127++;
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
    // EsperEPL2Ast.g:393:1: matchRecogMatchesAfterSkip : ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) ;
    public final void matchRecogMatchesAfterSkip() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:394:2: ( ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) )
            // EsperEPL2Ast.g:394:4: ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT )
            {
            match(input,MATCHREC_AFTER_SKIP,FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip2202); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2204); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2206); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2208); 
            if ( input.LA(1)==LAST||input.LA(1)==IDENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2216); 

            match(input, Token.UP, null); 

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
    // EsperEPL2Ast.g:397:1: matchRecogMatchesInterval : ^( MATCHREC_INTERVAL IDENT timePeriod ) ;
    public final void matchRecogMatchesInterval() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:398:2: ( ^( MATCHREC_INTERVAL IDENT timePeriod ) )
            // EsperEPL2Ast.g:398:4: ^( MATCHREC_INTERVAL IDENT timePeriod )
            {
            match(input,MATCHREC_INTERVAL,FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval2231); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesInterval2233); 
            pushFollow(FOLLOW_timePeriod_in_matchRecogMatchesInterval2235);
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
    // EsperEPL2Ast.g:401:1: matchRecogMeasures : ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) ;
    public final void matchRecogMeasures() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:402:2: ( ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) )
            // EsperEPL2Ast.g:402:4: ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURES,FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures2251); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:402:26: ( matchRecogMeasureListElement )*
                loop128:
                do {
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==MATCHREC_MEASURE_ITEM) ) {
                        alt128=1;
                    }


                    switch (alt128) {
                	case 1 :
                	    // EsperEPL2Ast.g:402:26: matchRecogMeasureListElement
                	    {
                	    pushFollow(FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures2253);
                	    matchRecogMeasureListElement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop128;
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
    // EsperEPL2Ast.g:405:1: matchRecogMeasureListElement : ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) ;
    public final void matchRecogMeasureListElement() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:406:2: ( ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) )
            // EsperEPL2Ast.g:406:4: ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURE_ITEM,FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement2270); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogMeasureListElement2272);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:406:40: ( IDENT )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==IDENT) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // EsperEPL2Ast.g:406:40: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_matchRecogMeasureListElement2274); 

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
    // EsperEPL2Ast.g:409:1: matchRecogPattern : ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) ;
    public final void matchRecogPattern() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:410:2: ( ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) )
            // EsperEPL2Ast.g:410:4: ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN,FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern2294); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:410:25: ( matchRecogPatternAlteration )+
            int cnt130=0;
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=MATCHREC_PATTERN_CONCAT && LA130_0<=MATCHREC_PATTERN_ALTER)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // EsperEPL2Ast.g:410:25: matchRecogPatternAlteration
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern2296);
            	    matchRecogPatternAlteration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt130 >= 1 ) break loop130;
                        EarlyExitException eee =
                            new EarlyExitException(130, input);
                        throw eee;
                }
                cnt130++;
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
    // EsperEPL2Ast.g:413:1: matchRecogPatternAlteration : ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) );
    public final void matchRecogPatternAlteration() throws RecognitionException {
        CommonTree o=null;

        try {
            // EsperEPL2Ast.g:414:2: ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==MATCHREC_PATTERN_CONCAT) ) {
                alt132=1;
            }
            else if ( (LA132_0==MATCHREC_PATTERN_ALTER) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // EsperEPL2Ast.g:414:4: matchRecogPatternConcat
                    {
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2311);
                    matchRecogPatternConcat();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:415:4: ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ )
                    {
                    o=(CommonTree)match(input,MATCHREC_PATTERN_ALTER,FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration2319); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2321);
                    matchRecogPatternConcat();

                    state._fsp--;

                    // EsperEPL2Ast.g:415:55: ( matchRecogPatternConcat )+
                    int cnt131=0;
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==MATCHREC_PATTERN_CONCAT) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:415:55: matchRecogPatternConcat
                    	    {
                    	    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2323);
                    	    matchRecogPatternConcat();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt131 >= 1 ) break loop131;
                                EarlyExitException eee =
                                    new EarlyExitException(131, input);
                                throw eee;
                        }
                        cnt131++;
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
    // EsperEPL2Ast.g:418:1: matchRecogPatternConcat : ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) ;
    public final void matchRecogPatternConcat() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:419:2: ( ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) )
            // EsperEPL2Ast.g:419:4: ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_CONCAT,FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat2341); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:419:32: ( matchRecogPatternUnary )+
            int cnt133=0;
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==MATCHREC_PATTERN_ATOM||LA133_0==MATCHREC_PATTERN_NESTED) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // EsperEPL2Ast.g:419:32: matchRecogPatternUnary
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat2343);
            	    matchRecogPatternUnary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt133 >= 1 ) break loop133;
                        EarlyExitException eee =
                            new EarlyExitException(133, input);
                        throw eee;
                }
                cnt133++;
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
    // EsperEPL2Ast.g:422:1: matchRecogPatternUnary : ( matchRecogPatternNested | matchRecogPatternAtom );
    public final void matchRecogPatternUnary() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:423:2: ( matchRecogPatternNested | matchRecogPatternAtom )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==MATCHREC_PATTERN_NESTED) ) {
                alt134=1;
            }
            else if ( (LA134_0==MATCHREC_PATTERN_ATOM) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // EsperEPL2Ast.g:423:4: matchRecogPatternNested
                    {
                    pushFollow(FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary2358);
                    matchRecogPatternNested();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:424:4: matchRecogPatternAtom
                    {
                    pushFollow(FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary2363);
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
    // EsperEPL2Ast.g:427:1: matchRecogPatternNested : ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) ;
    public final void matchRecogPatternNested() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:428:2: ( ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) )
            // EsperEPL2Ast.g:428:4: ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_NESTED,FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2378); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2380);
            matchRecogPatternAlteration();

            state._fsp--;

            // EsperEPL2Ast.g:428:60: ( PLUS | STAR | QUESTION )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==STAR||LA135_0==QUESTION||LA135_0==PLUS) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( input.LA(1)==STAR||input.LA(1)==QUESTION||input.LA(1)==PLUS ) {
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
    // EsperEPL2Ast.g:431:1: matchRecogPatternAtom : ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) ;
    public final void matchRecogPatternAtom() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:432:2: ( ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) )
            // EsperEPL2Ast.g:432:4: ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_ATOM,FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2411); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogPatternAtom2413); 
            // EsperEPL2Ast.g:432:36: ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==STAR||LA137_0==QUESTION||LA137_0==PLUS) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // EsperEPL2Ast.g:432:38: ( PLUS | STAR | QUESTION ) ( QUESTION )?
                    {
                    if ( input.LA(1)==STAR||input.LA(1)==QUESTION||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:432:63: ( QUESTION )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==QUESTION) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // EsperEPL2Ast.g:432:63: QUESTION
                            {
                            match(input,QUESTION,FOLLOW_QUESTION_in_matchRecogPatternAtom2429); 

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
    // EsperEPL2Ast.g:435:1: matchRecogDefine : ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) ;
    public final void matchRecogDefine() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:436:2: ( ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) )
            // EsperEPL2Ast.g:436:4: ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ )
            {
            p=(CommonTree)match(input,MATCHREC_DEFINE,FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2451); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:436:24: ( matchRecogDefineItem )+
            int cnt138=0;
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==MATCHREC_DEFINE_ITEM) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // EsperEPL2Ast.g:436:24: matchRecogDefineItem
            	    {
            	    pushFollow(FOLLOW_matchRecogDefineItem_in_matchRecogDefine2453);
            	    matchRecogDefineItem();

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
    // EsperEPL2Ast.g:439:1: matchRecogDefineItem : ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) ;
    public final void matchRecogDefineItem() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:440:2: ( ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) )
            // EsperEPL2Ast.g:440:4: ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr )
            {
            d=(CommonTree)match(input,MATCHREC_DEFINE_ITEM,FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2470); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogDefineItem2472); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogDefineItem2474);
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
    // EsperEPL2Ast.g:444:1: selectionList : selectionListElement ( selectionListElement )* ;
    public final void selectionList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:445:2: ( selectionListElement ( selectionListElement )* )
            // EsperEPL2Ast.g:445:4: selectionListElement ( selectionListElement )*
            {
            pushFollow(FOLLOW_selectionListElement_in_selectionList2491);
            selectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:445:25: ( selectionListElement )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( ((LA139_0>=SELECTION_ELEMENT_EXPR && LA139_0<=SELECTION_STREAM)||LA139_0==WILDCARD_SELECT) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // EsperEPL2Ast.g:445:26: selectionListElement
            	    {
            	    pushFollow(FOLLOW_selectionListElement_in_selectionList2494);
            	    selectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop139;
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
    // EsperEPL2Ast.g:448:1: selectionListElement : (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void selectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:449:2: (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt142=3;
            switch ( input.LA(1) ) {
            case WILDCARD_SELECT:
                {
                alt142=1;
                }
                break;
            case SELECTION_ELEMENT_EXPR:
                {
                alt142=2;
                }
                break;
            case SELECTION_STREAM:
                {
                alt142=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // EsperEPL2Ast.g:449:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_selectionListElement2510); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:450:4: ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2520); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_selectionListElement2522);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:450:41: ( IDENT )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==IDENT) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // EsperEPL2Ast.g:450:42: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2525); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:451:4: ^(s= SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,SELECTION_STREAM,FOLLOW_SELECTION_STREAM_in_selectionListElement2539); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2541); 
                    // EsperEPL2Ast.g:451:31: ( IDENT )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==IDENT) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // EsperEPL2Ast.g:451:32: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2544); 

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
    // EsperEPL2Ast.g:454:1: outerJoin : ( ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? ) );
    public final void outerJoin() throws RecognitionException {
        CommonTree tl=null;
        CommonTree tr=null;
        CommonTree tf=null;
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:455:2: ( ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? ) )
            int alt147=4;
            switch ( input.LA(1) ) {
            case LEFT_OUTERJOIN_EXPR:
                {
                alt147=1;
                }
                break;
            case RIGHT_OUTERJOIN_EXPR:
                {
                alt147=2;
                }
                break;
            case FULL_OUTERJOIN_EXPR:
                {
                alt147=3;
                }
                break;
            case INNERJOIN_EXPR:
                {
                alt147=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // EsperEPL2Ast.g:455:4: ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tl=(CommonTree)match(input,LEFT_OUTERJOIN_EXPR,FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2566); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2568); 
                    // EsperEPL2Ast.g:455:32: ( outerJoinIdent )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==EVENT_PROP_EXPR) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // EsperEPL2Ast.g:455:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2570);
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
                    // EsperEPL2Ast.g:456:4: ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tr=(CommonTree)match(input,RIGHT_OUTERJOIN_EXPR,FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2583); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2585); 
                    // EsperEPL2Ast.g:456:33: ( outerJoinIdent )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==EVENT_PROP_EXPR) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // EsperEPL2Ast.g:456:33: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2587);
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
                    // EsperEPL2Ast.g:457:4: ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tf=(CommonTree)match(input,FULL_OUTERJOIN_EXPR,FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2600); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2602); 
                    // EsperEPL2Ast.g:457:32: ( outerJoinIdent )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==EVENT_PROP_EXPR) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // EsperEPL2Ast.g:457:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2604);
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
                    // EsperEPL2Ast.g:458:4: ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    i=(CommonTree)match(input,INNERJOIN_EXPR,FOLLOW_INNERJOIN_EXPR_in_outerJoin2617); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2619); 
                    // EsperEPL2Ast.g:458:26: ( outerJoinIdent )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==EVENT_PROP_EXPR) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // EsperEPL2Ast.g:458:26: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2621);
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
    // EsperEPL2Ast.g:461:1: outerJoinIdent : eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ;
    public final void outerJoinIdent() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:462:2: ( eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* )
            // EsperEPL2Ast.g:462:4: eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )*
            {
            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2637);
            eventPropertyExpr(true);

            state._fsp--;

            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2640);
            eventPropertyExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:462:52: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==EVENT_PROP_EXPR) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // EsperEPL2Ast.g:462:53: eventPropertyExpr[true] eventPropertyExpr[true]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2644);
            	    eventPropertyExpr(true);

            	    state._fsp--;

            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2647);
            	    eventPropertyExpr(true);

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
    // $ANTLR end "outerJoinIdent"


    // $ANTLR start "streamExpression"
    // EsperEPL2Ast.g:465:1: streamExpression : ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) ;
    public final void streamExpression() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:466:2: ( ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:466:4: ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_streamExpression2664); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:466:20: ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression )
            int alt149=4;
            switch ( input.LA(1) ) {
            case EVENT_FILTER_EXPR:
                {
                alt149=1;
                }
                break;
            case PATTERN_INCL_EXPR:
                {
                alt149=2;
                }
                break;
            case DATABASE_JOIN_EXPR:
                {
                alt149=3;
                }
                break;
            case METHOD_JOIN_EXPR:
                {
                alt149=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // EsperEPL2Ast.g:466:21: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_streamExpression2667);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:466:45: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_streamExpression2672);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:466:74: databaseJoinExpression
                    {
                    pushFollow(FOLLOW_databaseJoinExpression_in_streamExpression2676);
                    databaseJoinExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:466:99: methodJoinExpression
                    {
                    pushFollow(FOLLOW_methodJoinExpression_in_streamExpression2680);
                    methodJoinExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:466:121: ( viewListExpr )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==VIEW_EXPR) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // EsperEPL2Ast.g:466:122: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_streamExpression2684);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:466:137: ( IDENT )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==IDENT) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // EsperEPL2Ast.g:466:138: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_streamExpression2689); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:466:146: ( UNIDIRECTIONAL )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==UNIDIRECTIONAL) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // EsperEPL2Ast.g:466:147: UNIDIRECTIONAL
                    {
                    match(input,UNIDIRECTIONAL,FOLLOW_UNIDIRECTIONAL_in_streamExpression2694); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:466:164: ( RETAINUNION | RETAININTERSECTION )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=RETAINUNION && LA153_0<=RETAININTERSECTION)) ) {
                alt153=1;
            }
            switch (alt153) {
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
    // EsperEPL2Ast.g:469:1: eventFilterExpr[boolean isLeaveNode] : ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) ;
    public final void eventFilterExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:470:2: ( ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:470:4: ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,EVENT_FILTER_EXPR,FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2723); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:470:27: ( IDENT )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==IDENT) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // EsperEPL2Ast.g:470:27: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_eventFilterExpr2725); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_eventFilterExpr2728); 
            // EsperEPL2Ast.g:470:46: ( propertyExpression )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // EsperEPL2Ast.g:470:46: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_eventFilterExpr2730);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:470:66: ( valueExpr )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( ((LA156_0>=IN_SET && LA156_0<=REGEXP)||LA156_0==NOT_EXPR||(LA156_0>=SUM && LA156_0<=AVG)||(LA156_0>=COALESCE && LA156_0<=COUNT)||(LA156_0>=CASE && LA156_0<=CASE2)||(LA156_0>=PREVIOUS && LA156_0<=EXISTS)||(LA156_0>=INSTANCEOF && LA156_0<=CURRENT_TIMESTAMP)||LA156_0==NEWKW||(LA156_0>=EVAL_AND_EXPR && LA156_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA156_0==EVENT_PROP_EXPR||LA156_0==CONCAT||(LA156_0>=LIB_FUNC_CHAIN && LA156_0<=DOT_EXPR)||LA156_0==ARRAY_EXPR||(LA156_0>=NOT_IN_SET && LA156_0<=NOT_REGEXP)||(LA156_0>=IN_RANGE && LA156_0<=SUBSELECT_EXPR)||(LA156_0>=EXISTS_SUBSELECT_EXPR && LA156_0<=NOT_IN_SUBSELECT_EXPR)||LA156_0==SUBSTITUTION||(LA156_0>=FIRST_AGGREG && LA156_0<=WINDOW_AGGREG)||(LA156_0>=INT_TYPE && LA156_0<=NULL_TYPE)||(LA156_0>=JSON_OBJECT && LA156_0<=JSON_ARRAY)||LA156_0==STAR||(LA156_0>=LT && LA156_0<=GT)||(LA156_0>=BOR && LA156_0<=PLUS)||(LA156_0>=BAND && LA156_0<=BXOR)||(LA156_0>=LE && LA156_0<=GE)||(LA156_0>=MINUS && LA156_0<=MOD)||(LA156_0>=EVAL_IS_GROUP_EXPR && LA156_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // EsperEPL2Ast.g:470:67: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_eventFilterExpr2734);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop156;
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
    // EsperEPL2Ast.g:473:1: propertyExpression : ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) ;
    public final void propertyExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:474:2: ( ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) )
            // EsperEPL2Ast.g:474:4: ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* )
            {
            match(input,EVENT_FILTER_PROPERTY_EXPR,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2754); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:474:34: ( propertyExpressionAtom )*
                loop157:
                do {
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==EVENT_FILTER_PROPERTY_EXPR_ATOM) ) {
                        alt157=1;
                    }


                    switch (alt157) {
                	case 1 :
                	    // EsperEPL2Ast.g:474:34: propertyExpressionAtom
                	    {
                	    pushFollow(FOLLOW_propertyExpressionAtom_in_propertyExpression2756);
                	    propertyExpressionAtom();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop157;
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
    // EsperEPL2Ast.g:477:1: propertyExpressionAtom : ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) ;
    public final void propertyExpressionAtom() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:478:2: ( ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) )
            // EsperEPL2Ast.g:478:4: ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) )
            {
            a=(CommonTree)match(input,EVENT_FILTER_PROPERTY_EXPR_ATOM,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2775); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:478:41: ( ^( SELECT ( propertySelectionListElement )+ ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==SELECT) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // EsperEPL2Ast.g:478:42: ^( SELECT ( propertySelectionListElement )+ )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_propertyExpressionAtom2779); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:478:51: ( propertySelectionListElement )+
                    int cnt158=0;
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( ((LA158_0>=PROPERTY_SELECTION_ELEMENT_EXPR && LA158_0<=PROPERTY_WILDCARD_SELECT)) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:478:51: propertySelectionListElement
                    	    {
                    	    pushFollow(FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2781);
                    	    propertySelectionListElement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt158 >= 1 ) break loop158;
                                EarlyExitException eee =
                                    new EarlyExitException(158, input);
                                throw eee;
                        }
                        cnt158++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2787);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:478:94: ( ^( ATCHAR IDENT IDENT ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==ATCHAR) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // EsperEPL2Ast.g:478:95: ^( ATCHAR IDENT IDENT )
                    {
                    match(input,ATCHAR,FOLLOW_ATCHAR_in_propertyExpressionAtom2791); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2793); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2795); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:478:119: ( IDENT )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==IDENT) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // EsperEPL2Ast.g:478:119: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2800); 

                    }
                    break;

            }

            match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2804); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:478:139: ( valueExpr )?
                int alt162=2;
                int LA162_0 = input.LA(1);

                if ( ((LA162_0>=IN_SET && LA162_0<=REGEXP)||LA162_0==NOT_EXPR||(LA162_0>=SUM && LA162_0<=AVG)||(LA162_0>=COALESCE && LA162_0<=COUNT)||(LA162_0>=CASE && LA162_0<=CASE2)||(LA162_0>=PREVIOUS && LA162_0<=EXISTS)||(LA162_0>=INSTANCEOF && LA162_0<=CURRENT_TIMESTAMP)||LA162_0==NEWKW||(LA162_0>=EVAL_AND_EXPR && LA162_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA162_0==EVENT_PROP_EXPR||LA162_0==CONCAT||(LA162_0>=LIB_FUNC_CHAIN && LA162_0<=DOT_EXPR)||LA162_0==ARRAY_EXPR||(LA162_0>=NOT_IN_SET && LA162_0<=NOT_REGEXP)||(LA162_0>=IN_RANGE && LA162_0<=SUBSELECT_EXPR)||(LA162_0>=EXISTS_SUBSELECT_EXPR && LA162_0<=NOT_IN_SUBSELECT_EXPR)||LA162_0==SUBSTITUTION||(LA162_0>=FIRST_AGGREG && LA162_0<=WINDOW_AGGREG)||(LA162_0>=INT_TYPE && LA162_0<=NULL_TYPE)||(LA162_0>=JSON_OBJECT && LA162_0<=JSON_ARRAY)||LA162_0==STAR||(LA162_0>=LT && LA162_0<=GT)||(LA162_0>=BOR && LA162_0<=PLUS)||(LA162_0>=BAND && LA162_0<=BXOR)||(LA162_0>=LE && LA162_0<=GE)||(LA162_0>=MINUS && LA162_0<=MOD)||(LA162_0>=EVAL_IS_GROUP_EXPR && LA162_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt162=1;
                }
                switch (alt162) {
                    case 1 :
                        // EsperEPL2Ast.g:478:139: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2806);
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
    // EsperEPL2Ast.g:481:1: propertySelectionListElement : (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void propertySelectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:482:2: (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt165=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt165=1;
                }
                break;
            case PROPERTY_SELECTION_ELEMENT_EXPR:
                {
                alt165=2;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt165=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }

            switch (alt165) {
                case 1 :
                    // EsperEPL2Ast.g:482:4: w= PROPERTY_WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2826); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:483:4: ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,PROPERTY_SELECTION_ELEMENT_EXPR,FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2836); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_propertySelectionListElement2838);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:483:50: ( IDENT )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==IDENT) ) {
                        alt163=1;
                    }
                    switch (alt163) {
                        case 1 :
                            // EsperEPL2Ast.g:483:51: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2841); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:484:4: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2855); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2857); 
                    // EsperEPL2Ast.g:484:40: ( IDENT )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==IDENT) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // EsperEPL2Ast.g:484:41: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2860); 

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
    // EsperEPL2Ast.g:487:1: patternInclusionExpression : ^(p= PATTERN_INCL_EXPR exprChoice ) ;
    public final void patternInclusionExpression() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:488:2: ( ^(p= PATTERN_INCL_EXPR exprChoice ) )
            // EsperEPL2Ast.g:488:4: ^(p= PATTERN_INCL_EXPR exprChoice )
            {
            p=(CommonTree)match(input,PATTERN_INCL_EXPR,FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2881); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_exprChoice_in_patternInclusionExpression2883);
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
    // EsperEPL2Ast.g:491:1: databaseJoinExpression : ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) ;
    public final void databaseJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:492:2: ( ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) )
            // EsperEPL2Ast.g:492:4: ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? )
            {
            match(input,DATABASE_JOIN_EXPR,FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2900); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_databaseJoinExpression2902); 
            if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // EsperEPL2Ast.g:492:72: ( STRING_LITERAL | QUOTED_STRING_LITERAL )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( ((LA166_0>=STRING_LITERAL && LA166_0<=QUOTED_STRING_LITERAL)) ) {
                alt166=1;
            }
            switch (alt166) {
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
    // EsperEPL2Ast.g:495:1: methodJoinExpression : ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) ;
    public final void methodJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:496:2: ( ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:496:4: ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* )
            {
            match(input,METHOD_JOIN_EXPR,FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2933); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_methodJoinExpression2935); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_methodJoinExpression2937); 
            // EsperEPL2Ast.g:496:41: ( valueExpr )*
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( ((LA167_0>=IN_SET && LA167_0<=REGEXP)||LA167_0==NOT_EXPR||(LA167_0>=SUM && LA167_0<=AVG)||(LA167_0>=COALESCE && LA167_0<=COUNT)||(LA167_0>=CASE && LA167_0<=CASE2)||(LA167_0>=PREVIOUS && LA167_0<=EXISTS)||(LA167_0>=INSTANCEOF && LA167_0<=CURRENT_TIMESTAMP)||LA167_0==NEWKW||(LA167_0>=EVAL_AND_EXPR && LA167_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA167_0==EVENT_PROP_EXPR||LA167_0==CONCAT||(LA167_0>=LIB_FUNC_CHAIN && LA167_0<=DOT_EXPR)||LA167_0==ARRAY_EXPR||(LA167_0>=NOT_IN_SET && LA167_0<=NOT_REGEXP)||(LA167_0>=IN_RANGE && LA167_0<=SUBSELECT_EXPR)||(LA167_0>=EXISTS_SUBSELECT_EXPR && LA167_0<=NOT_IN_SUBSELECT_EXPR)||LA167_0==SUBSTITUTION||(LA167_0>=FIRST_AGGREG && LA167_0<=WINDOW_AGGREG)||(LA167_0>=INT_TYPE && LA167_0<=NULL_TYPE)||(LA167_0>=JSON_OBJECT && LA167_0<=JSON_ARRAY)||LA167_0==STAR||(LA167_0>=LT && LA167_0<=GT)||(LA167_0>=BOR && LA167_0<=PLUS)||(LA167_0>=BAND && LA167_0<=BXOR)||(LA167_0>=LE && LA167_0<=GE)||(LA167_0>=MINUS && LA167_0<=MOD)||(LA167_0>=EVAL_IS_GROUP_EXPR && LA167_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // EsperEPL2Ast.g:496:42: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_methodJoinExpression2940);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop167;
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
    // EsperEPL2Ast.g:499:1: viewListExpr : viewExpr ( viewExpr )* ;
    public final void viewListExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:500:2: ( viewExpr ( viewExpr )* )
            // EsperEPL2Ast.g:500:4: viewExpr ( viewExpr )*
            {
            pushFollow(FOLLOW_viewExpr_in_viewListExpr2954);
            viewExpr();

            state._fsp--;

            // EsperEPL2Ast.g:500:13: ( viewExpr )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==VIEW_EXPR) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // EsperEPL2Ast.g:500:14: viewExpr
            	    {
            	    pushFollow(FOLLOW_viewExpr_in_viewListExpr2957);
            	    viewExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop168;
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
    // EsperEPL2Ast.g:503:1: viewExpr : ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) ;
    public final void viewExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:504:2: ( ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            // EsperEPL2Ast.g:504:4: ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* )
            {
            n=(CommonTree)match(input,VIEW_EXPR,FOLLOW_VIEW_EXPR_in_viewExpr2974); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2976); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr2978); 
            // EsperEPL2Ast.g:504:30: ( valueExprWithTime )*
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( ((LA169_0>=IN_SET && LA169_0<=REGEXP)||LA169_0==NOT_EXPR||(LA169_0>=SUM && LA169_0<=AVG)||(LA169_0>=COALESCE && LA169_0<=COUNT)||(LA169_0>=CASE && LA169_0<=CASE2)||LA169_0==LAST||(LA169_0>=PREVIOUS && LA169_0<=EXISTS)||(LA169_0>=LW && LA169_0<=CURRENT_TIMESTAMP)||LA169_0==NEWKW||(LA169_0>=NUMERIC_PARAM_RANGE && LA169_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA169_0>=EVAL_AND_EXPR && LA169_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA169_0==EVENT_PROP_EXPR||LA169_0==CONCAT||(LA169_0>=LIB_FUNC_CHAIN && LA169_0<=DOT_EXPR)||(LA169_0>=TIME_PERIOD && LA169_0<=ARRAY_EXPR)||(LA169_0>=NOT_IN_SET && LA169_0<=NOT_REGEXP)||(LA169_0>=IN_RANGE && LA169_0<=SUBSELECT_EXPR)||(LA169_0>=EXISTS_SUBSELECT_EXPR && LA169_0<=NOT_IN_SUBSELECT_EXPR)||(LA169_0>=LAST_OPERATOR && LA169_0<=SUBSTITUTION)||LA169_0==NUMBERSETSTAR||(LA169_0>=FIRST_AGGREG && LA169_0<=WINDOW_AGGREG)||(LA169_0>=INT_TYPE && LA169_0<=NULL_TYPE)||(LA169_0>=JSON_OBJECT && LA169_0<=JSON_ARRAY)||LA169_0==STAR||(LA169_0>=LT && LA169_0<=GT)||(LA169_0>=BOR && LA169_0<=PLUS)||(LA169_0>=BAND && LA169_0<=BXOR)||(LA169_0>=LE && LA169_0<=GE)||(LA169_0>=MINUS && LA169_0<=MOD)||(LA169_0>=EVAL_IS_GROUP_EXPR && LA169_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // EsperEPL2Ast.g:504:31: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_viewExpr2981);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop169;
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
    // EsperEPL2Ast.g:507:1: whereClause[boolean isLeaveNode] : ^(n= WHERE_EXPR valueExpr ) ;
    public final void whereClause(boolean isLeaveNode) throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:508:2: ( ^(n= WHERE_EXPR valueExpr ) )
            // EsperEPL2Ast.g:508:4: ^(n= WHERE_EXPR valueExpr )
            {
            n=(CommonTree)match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_whereClause3003); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_whereClause3005);
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
    // EsperEPL2Ast.g:511:1: groupByClause : ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) ;
    public final void groupByClause() throws RecognitionException {
        CommonTree g=null;

        try {
            // EsperEPL2Ast.g:512:2: ( ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:512:4: ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* )
            {
            g=(CommonTree)match(input,GROUP_BY_EXPR,FOLLOW_GROUP_BY_EXPR_in_groupByClause3023); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_groupByClause3025);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:512:32: ( valueExpr )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( ((LA170_0>=IN_SET && LA170_0<=REGEXP)||LA170_0==NOT_EXPR||(LA170_0>=SUM && LA170_0<=AVG)||(LA170_0>=COALESCE && LA170_0<=COUNT)||(LA170_0>=CASE && LA170_0<=CASE2)||(LA170_0>=PREVIOUS && LA170_0<=EXISTS)||(LA170_0>=INSTANCEOF && LA170_0<=CURRENT_TIMESTAMP)||LA170_0==NEWKW||(LA170_0>=EVAL_AND_EXPR && LA170_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA170_0==EVENT_PROP_EXPR||LA170_0==CONCAT||(LA170_0>=LIB_FUNC_CHAIN && LA170_0<=DOT_EXPR)||LA170_0==ARRAY_EXPR||(LA170_0>=NOT_IN_SET && LA170_0<=NOT_REGEXP)||(LA170_0>=IN_RANGE && LA170_0<=SUBSELECT_EXPR)||(LA170_0>=EXISTS_SUBSELECT_EXPR && LA170_0<=NOT_IN_SUBSELECT_EXPR)||LA170_0==SUBSTITUTION||(LA170_0>=FIRST_AGGREG && LA170_0<=WINDOW_AGGREG)||(LA170_0>=INT_TYPE && LA170_0<=NULL_TYPE)||(LA170_0>=JSON_OBJECT && LA170_0<=JSON_ARRAY)||LA170_0==STAR||(LA170_0>=LT && LA170_0<=GT)||(LA170_0>=BOR && LA170_0<=PLUS)||(LA170_0>=BAND && LA170_0<=BXOR)||(LA170_0>=LE && LA170_0<=GE)||(LA170_0>=MINUS && LA170_0<=MOD)||(LA170_0>=EVAL_IS_GROUP_EXPR && LA170_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // EsperEPL2Ast.g:512:33: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_groupByClause3028);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop170;
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
    // EsperEPL2Ast.g:515:1: orderByClause : ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) ;
    public final void orderByClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:516:2: ( ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) )
            // EsperEPL2Ast.g:516:4: ^( ORDER_BY_EXPR orderByElement ( orderByElement )* )
            {
            match(input,ORDER_BY_EXPR,FOLLOW_ORDER_BY_EXPR_in_orderByClause3046); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_orderByElement_in_orderByClause3048);
            orderByElement();

            state._fsp--;

            // EsperEPL2Ast.g:516:35: ( orderByElement )*
            loop171:
            do {
                int alt171=2;
                int LA171_0 = input.LA(1);

                if ( (LA171_0==ORDER_ELEMENT_EXPR) ) {
                    alt171=1;
                }


                switch (alt171) {
            	case 1 :
            	    // EsperEPL2Ast.g:516:36: orderByElement
            	    {
            	    pushFollow(FOLLOW_orderByElement_in_orderByClause3051);
            	    orderByElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop171;
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
    // EsperEPL2Ast.g:519:1: orderByElement : ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) ;
    public final void orderByElement() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:520:2: ( ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) )
            // EsperEPL2Ast.g:520:5: ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? )
            {
            e=(CommonTree)match(input,ORDER_ELEMENT_EXPR,FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement3071); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_orderByElement3073);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:520:38: ( ASC | DESC )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( ((LA172_0>=ASC && LA172_0<=DESC)) ) {
                alt172=1;
            }
            switch (alt172) {
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
    // EsperEPL2Ast.g:523:1: havingClause : ^(n= HAVING_EXPR valueExpr ) ;
    public final void havingClause() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:524:2: ( ^(n= HAVING_EXPR valueExpr ) )
            // EsperEPL2Ast.g:524:4: ^(n= HAVING_EXPR valueExpr )
            {
            n=(CommonTree)match(input,HAVING_EXPR,FOLLOW_HAVING_EXPR_in_havingClause3098); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_havingClause3100);
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
    // EsperEPL2Ast.g:527:1: outputLimitExpr : ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? ) );
    public final void outputLimitExpr() throws RecognitionException {
        CommonTree e=null;
        CommonTree tp=null;
        CommonTree cron=null;
        CommonTree when=null;
        CommonTree term=null;
        CommonTree after=null;

        try {
            // EsperEPL2Ast.g:528:2: ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? ) )
            int alt192=6;
            switch ( input.LA(1) ) {
            case EVENT_LIMIT_EXPR:
                {
                alt192=1;
                }
                break;
            case TIMEPERIOD_LIMIT_EXPR:
                {
                alt192=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR:
                {
                alt192=3;
                }
                break;
            case WHEN_LIMIT_EXPR:
                {
                alt192=4;
                }
                break;
            case TERM_LIMIT_EXPR:
                {
                alt192=5;
                }
                break;
            case AFTER_LIMIT_EXPR:
                {
                alt192=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 192, 0, input);

                throw nvae;
            }

            switch (alt192) {
                case 1 :
                    // EsperEPL2Ast.g:528:4: ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    e=(CommonTree)match(input,EVENT_LIMIT_EXPR,FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr3118); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:528:25: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==ALL||(LA173_0>=FIRST && LA173_0<=LAST)||LA173_0==SNAPSHOT) ) {
                        alt173=1;
                    }
                    switch (alt173) {
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

                    // EsperEPL2Ast.g:528:52: ( number | IDENT )
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( ((LA174_0>=INT_TYPE && LA174_0<=DOUBLE_TYPE)) ) {
                        alt174=1;
                    }
                    else if ( (LA174_0==IDENT) ) {
                        alt174=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 174, 0, input);

                        throw nvae;
                    }
                    switch (alt174) {
                        case 1 :
                            // EsperEPL2Ast.g:528:53: number
                            {
                            pushFollow(FOLLOW_number_in_outputLimitExpr3132);
                            number();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:528:60: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_outputLimitExpr3134); 

                            }
                            break;

                    }

                    // EsperEPL2Ast.g:528:67: ( outputLimitAfter )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==AFTER) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // EsperEPL2Ast.g:528:67: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3137);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:528:85: ( outputLimitAndTerm )?
                    int alt176=2;
                    int LA176_0 = input.LA(1);

                    if ( (LA176_0==TERMINATED) ) {
                        alt176=1;
                    }
                    switch (alt176) {
                        case 1 :
                            // EsperEPL2Ast.g:528:85: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3140);
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
                    // EsperEPL2Ast.g:529:7: ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    tp=(CommonTree)match(input,TIMEPERIOD_LIMIT_EXPR,FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr3157); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:529:34: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==ALL||(LA177_0>=FIRST && LA177_0<=LAST)||LA177_0==SNAPSHOT) ) {
                        alt177=1;
                    }
                    switch (alt177) {
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

                    pushFollow(FOLLOW_timePeriod_in_outputLimitExpr3170);
                    timePeriod();

                    state._fsp--;

                    // EsperEPL2Ast.g:529:72: ( outputLimitAfter )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==AFTER) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // EsperEPL2Ast.g:529:72: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3172);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:529:90: ( outputLimitAndTerm )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==TERMINATED) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // EsperEPL2Ast.g:529:90: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3175);
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
                    // EsperEPL2Ast.g:530:7: ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    cron=(CommonTree)match(input,CRONTAB_LIMIT_EXPR,FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr3191); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:530:33: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt180=2;
                    int LA180_0 = input.LA(1);

                    if ( (LA180_0==ALL||(LA180_0>=FIRST && LA180_0<=LAST)||LA180_0==SNAPSHOT) ) {
                        alt180=1;
                    }
                    switch (alt180) {
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

                    pushFollow(FOLLOW_crontabLimitParameterSet_in_outputLimitExpr3204);
                    crontabLimitParameterSet();

                    state._fsp--;

                    // EsperEPL2Ast.g:530:85: ( outputLimitAfter )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==AFTER) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // EsperEPL2Ast.g:530:85: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3206);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:530:103: ( outputLimitAndTerm )?
                    int alt182=2;
                    int LA182_0 = input.LA(1);

                    if ( (LA182_0==TERMINATED) ) {
                        alt182=1;
                    }
                    switch (alt182) {
                        case 1 :
                            // EsperEPL2Ast.g:530:103: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3209);
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
                    // EsperEPL2Ast.g:531:7: ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    when=(CommonTree)match(input,WHEN_LIMIT_EXPR,FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr3225); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:531:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt183=2;
                    int LA183_0 = input.LA(1);

                    if ( (LA183_0==ALL||(LA183_0>=FIRST && LA183_0<=LAST)||LA183_0==SNAPSHOT) ) {
                        alt183=1;
                    }
                    switch (alt183) {
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

                    pushFollow(FOLLOW_valueExpr_in_outputLimitExpr3238);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:531:67: ( onSetExpr )?
                    int alt184=2;
                    int LA184_0 = input.LA(1);

                    if ( (LA184_0==ON_SET_EXPR) ) {
                        alt184=1;
                    }
                    switch (alt184) {
                        case 1 :
                            // EsperEPL2Ast.g:531:67: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr3240);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:531:78: ( outputLimitAfter )?
                    int alt185=2;
                    int LA185_0 = input.LA(1);

                    if ( (LA185_0==AFTER) ) {
                        alt185=1;
                    }
                    switch (alt185) {
                        case 1 :
                            // EsperEPL2Ast.g:531:78: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3243);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:531:96: ( outputLimitAndTerm )?
                    int alt186=2;
                    int LA186_0 = input.LA(1);

                    if ( (LA186_0==TERMINATED) ) {
                        alt186=1;
                    }
                    switch (alt186) {
                        case 1 :
                            // EsperEPL2Ast.g:531:96: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3246);
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
                    // EsperEPL2Ast.g:532:7: ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    term=(CommonTree)match(input,TERM_LIMIT_EXPR,FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr3262); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:532:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt187=2;
                    int LA187_0 = input.LA(1);

                    if ( (LA187_0==ALL||(LA187_0>=FIRST && LA187_0<=LAST)||LA187_0==SNAPSHOT) ) {
                        alt187=1;
                    }
                    switch (alt187) {
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

                    pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3275);
                    outputLimitAndTerm();

                    state._fsp--;

                    // EsperEPL2Ast.g:532:76: ( onSetExpr )?
                    int alt188=2;
                    int LA188_0 = input.LA(1);

                    if ( (LA188_0==ON_SET_EXPR) ) {
                        alt188=1;
                    }
                    switch (alt188) {
                        case 1 :
                            // EsperEPL2Ast.g:532:76: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr3277);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:532:87: ( outputLimitAfter )?
                    int alt189=2;
                    int LA189_0 = input.LA(1);

                    if ( (LA189_0==AFTER) ) {
                        alt189=1;
                    }
                    switch (alt189) {
                        case 1 :
                            // EsperEPL2Ast.g:532:87: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3280);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:532:105: ( outputLimitAndTerm )?
                    int alt190=2;
                    int LA190_0 = input.LA(1);

                    if ( (LA190_0==TERMINATED) ) {
                        alt190=1;
                    }
                    switch (alt190) {
                        case 1 :
                            // EsperEPL2Ast.g:532:105: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3283);
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
                    // EsperEPL2Ast.g:533:4: ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? )
                    {
                    after=(CommonTree)match(input,AFTER_LIMIT_EXPR,FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr3296); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3298);
                    outputLimitAfter();

                    state._fsp--;

                    // EsperEPL2Ast.g:533:46: ( outputLimitAndTerm )?
                    int alt191=2;
                    int LA191_0 = input.LA(1);

                    if ( (LA191_0==TERMINATED) ) {
                        alt191=1;
                    }
                    switch (alt191) {
                        case 1 :
                            // EsperEPL2Ast.g:533:46: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3300);
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
    // EsperEPL2Ast.g:536:1: outputLimitAndTerm : ^( TERMINATED ( valueExpr )? ( onSetExpr )? ) ;
    public final void outputLimitAndTerm() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:537:2: ( ^( TERMINATED ( valueExpr )? ( onSetExpr )? ) )
            // EsperEPL2Ast.g:537:5: ^( TERMINATED ( valueExpr )? ( onSetExpr )? )
            {
            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitAndTerm3317); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:537:18: ( valueExpr )?
                int alt193=2;
                int LA193_0 = input.LA(1);

                if ( ((LA193_0>=IN_SET && LA193_0<=REGEXP)||LA193_0==NOT_EXPR||(LA193_0>=SUM && LA193_0<=AVG)||(LA193_0>=COALESCE && LA193_0<=COUNT)||(LA193_0>=CASE && LA193_0<=CASE2)||(LA193_0>=PREVIOUS && LA193_0<=EXISTS)||(LA193_0>=INSTANCEOF && LA193_0<=CURRENT_TIMESTAMP)||LA193_0==NEWKW||(LA193_0>=EVAL_AND_EXPR && LA193_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA193_0==EVENT_PROP_EXPR||LA193_0==CONCAT||(LA193_0>=LIB_FUNC_CHAIN && LA193_0<=DOT_EXPR)||LA193_0==ARRAY_EXPR||(LA193_0>=NOT_IN_SET && LA193_0<=NOT_REGEXP)||(LA193_0>=IN_RANGE && LA193_0<=SUBSELECT_EXPR)||(LA193_0>=EXISTS_SUBSELECT_EXPR && LA193_0<=NOT_IN_SUBSELECT_EXPR)||LA193_0==SUBSTITUTION||(LA193_0>=FIRST_AGGREG && LA193_0<=WINDOW_AGGREG)||(LA193_0>=INT_TYPE && LA193_0<=NULL_TYPE)||(LA193_0>=JSON_OBJECT && LA193_0<=JSON_ARRAY)||LA193_0==STAR||(LA193_0>=LT && LA193_0<=GT)||(LA193_0>=BOR && LA193_0<=PLUS)||(LA193_0>=BAND && LA193_0<=BXOR)||(LA193_0>=LE && LA193_0<=GE)||(LA193_0>=MINUS && LA193_0<=MOD)||(LA193_0>=EVAL_IS_GROUP_EXPR && LA193_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt193=1;
                }
                switch (alt193) {
                    case 1 :
                        // EsperEPL2Ast.g:537:18: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_outputLimitAndTerm3319);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:537:29: ( onSetExpr )?
                int alt194=2;
                int LA194_0 = input.LA(1);

                if ( (LA194_0==ON_SET_EXPR) ) {
                    alt194=1;
                }
                switch (alt194) {
                    case 1 :
                        // EsperEPL2Ast.g:537:29: onSetExpr
                        {
                        pushFollow(FOLLOW_onSetExpr_in_outputLimitAndTerm3322);
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
    // EsperEPL2Ast.g:540:1: outputLimitAfter : ^( AFTER ( timePeriod )? ( number )? ) ;
    public final void outputLimitAfter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:541:2: ( ^( AFTER ( timePeriod )? ( number )? ) )
            // EsperEPL2Ast.g:541:4: ^( AFTER ( timePeriod )? ( number )? )
            {
            match(input,AFTER,FOLLOW_AFTER_in_outputLimitAfter3336); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:541:12: ( timePeriod )?
                int alt195=2;
                int LA195_0 = input.LA(1);

                if ( (LA195_0==TIME_PERIOD) ) {
                    alt195=1;
                }
                switch (alt195) {
                    case 1 :
                        // EsperEPL2Ast.g:541:12: timePeriod
                        {
                        pushFollow(FOLLOW_timePeriod_in_outputLimitAfter3338);
                        timePeriod();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:541:24: ( number )?
                int alt196=2;
                int LA196_0 = input.LA(1);

                if ( ((LA196_0>=INT_TYPE && LA196_0<=DOUBLE_TYPE)) ) {
                    alt196=1;
                }
                switch (alt196) {
                    case 1 :
                        // EsperEPL2Ast.g:541:24: number
                        {
                        pushFollow(FOLLOW_number_in_outputLimitAfter3341);
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
    // EsperEPL2Ast.g:544:1: rowLimitClause : ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) ;
    public final void rowLimitClause() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:545:2: ( ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) )
            // EsperEPL2Ast.g:545:4: ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? )
            {
            e=(CommonTree)match(input,ROW_LIMIT_EXPR,FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause3357); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:545:23: ( number | IDENT )
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( ((LA197_0>=INT_TYPE && LA197_0<=DOUBLE_TYPE)) ) {
                alt197=1;
            }
            else if ( (LA197_0==IDENT) ) {
                alt197=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 197, 0, input);

                throw nvae;
            }
            switch (alt197) {
                case 1 :
                    // EsperEPL2Ast.g:545:24: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause3360);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:545:31: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause3362); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:545:38: ( number | IDENT )?
            int alt198=3;
            int LA198_0 = input.LA(1);

            if ( ((LA198_0>=INT_TYPE && LA198_0<=DOUBLE_TYPE)) ) {
                alt198=1;
            }
            else if ( (LA198_0==IDENT) ) {
                alt198=2;
            }
            switch (alt198) {
                case 1 :
                    // EsperEPL2Ast.g:545:39: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause3366);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:545:46: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause3368); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:545:54: ( COMMA )?
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==COMMA) ) {
                alt199=1;
            }
            switch (alt199) {
                case 1 :
                    // EsperEPL2Ast.g:545:54: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_rowLimitClause3372); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:545:61: ( OFFSET )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==OFFSET) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // EsperEPL2Ast.g:545:61: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_rowLimitClause3375); 

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
    // EsperEPL2Ast.g:548:1: crontabLimitParameterSet : ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? ) ;
    public final void crontabLimitParameterSet() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:549:2: ( ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? ) )
            // EsperEPL2Ast.g:549:4: ^( CRONTAB_LIMIT_EXPR_PARAM valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime valueExprWithTime ( valueExprWithTime )? )
            {
            match(input,CRONTAB_LIMIT_EXPR_PARAM,FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3393); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3395);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3397);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3399);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3401);
            valueExprWithTime();

            state._fsp--;

            pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3403);
            valueExprWithTime();

            state._fsp--;

            // EsperEPL2Ast.g:549:121: ( valueExprWithTime )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( ((LA201_0>=IN_SET && LA201_0<=REGEXP)||LA201_0==NOT_EXPR||(LA201_0>=SUM && LA201_0<=AVG)||(LA201_0>=COALESCE && LA201_0<=COUNT)||(LA201_0>=CASE && LA201_0<=CASE2)||LA201_0==LAST||(LA201_0>=PREVIOUS && LA201_0<=EXISTS)||(LA201_0>=LW && LA201_0<=CURRENT_TIMESTAMP)||LA201_0==NEWKW||(LA201_0>=NUMERIC_PARAM_RANGE && LA201_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA201_0>=EVAL_AND_EXPR && LA201_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA201_0==EVENT_PROP_EXPR||LA201_0==CONCAT||(LA201_0>=LIB_FUNC_CHAIN && LA201_0<=DOT_EXPR)||(LA201_0>=TIME_PERIOD && LA201_0<=ARRAY_EXPR)||(LA201_0>=NOT_IN_SET && LA201_0<=NOT_REGEXP)||(LA201_0>=IN_RANGE && LA201_0<=SUBSELECT_EXPR)||(LA201_0>=EXISTS_SUBSELECT_EXPR && LA201_0<=NOT_IN_SUBSELECT_EXPR)||(LA201_0>=LAST_OPERATOR && LA201_0<=SUBSTITUTION)||LA201_0==NUMBERSETSTAR||(LA201_0>=FIRST_AGGREG && LA201_0<=WINDOW_AGGREG)||(LA201_0>=INT_TYPE && LA201_0<=NULL_TYPE)||(LA201_0>=JSON_OBJECT && LA201_0<=JSON_ARRAY)||LA201_0==STAR||(LA201_0>=LT && LA201_0<=GT)||(LA201_0>=BOR && LA201_0<=PLUS)||(LA201_0>=BAND && LA201_0<=BXOR)||(LA201_0>=LE && LA201_0<=GE)||(LA201_0>=MINUS && LA201_0<=MOD)||(LA201_0>=EVAL_IS_GROUP_EXPR && LA201_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // EsperEPL2Ast.g:549:121: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3405);
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
    // EsperEPL2Ast.g:552:1: relationalExpr : ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) );
    public final void relationalExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:553:2: ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) )
            int alt202=4;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt202=1;
                }
                break;
            case GT:
                {
                alt202=2;
                }
                break;
            case LE:
                {
                alt202=3;
                }
                break;
            case GE:
                {
                alt202=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 202, 0, input);

                throw nvae;
            }

            switch (alt202) {
                case 1 :
                    // EsperEPL2Ast.g:553:5: ^(n= LT relationalExprValue )
                    {
                    n=(CommonTree)match(input,LT,FOLLOW_LT_in_relationalExpr3422); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3424);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:554:5: ^(n= GT relationalExprValue )
                    {
                    n=(CommonTree)match(input,GT,FOLLOW_GT_in_relationalExpr3437); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3439);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:555:5: ^(n= LE relationalExprValue )
                    {
                    n=(CommonTree)match(input,LE,FOLLOW_LE_in_relationalExpr3452); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3454);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:556:4: ^(n= GE relationalExprValue )
                    {
                    n=(CommonTree)match(input,GE,FOLLOW_GE_in_relationalExpr3466); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3468);
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
    // EsperEPL2Ast.g:559:1: relationalExprValue : ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) ;
    public final void relationalExprValue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:560:2: ( ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) )
            // EsperEPL2Ast.g:560:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            {
            // EsperEPL2Ast.g:560:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            // EsperEPL2Ast.g:561:5: valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            {
            pushFollow(FOLLOW_valueExpr_in_relationalExprValue3490);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:562:6: ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( ((LA205_0>=IN_SET && LA205_0<=REGEXP)||LA205_0==NOT_EXPR||(LA205_0>=SUM && LA205_0<=AVG)||(LA205_0>=COALESCE && LA205_0<=COUNT)||(LA205_0>=CASE && LA205_0<=CASE2)||(LA205_0>=PREVIOUS && LA205_0<=EXISTS)||(LA205_0>=INSTANCEOF && LA205_0<=CURRENT_TIMESTAMP)||LA205_0==NEWKW||(LA205_0>=EVAL_AND_EXPR && LA205_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA205_0==EVENT_PROP_EXPR||LA205_0==CONCAT||(LA205_0>=LIB_FUNC_CHAIN && LA205_0<=DOT_EXPR)||LA205_0==ARRAY_EXPR||(LA205_0>=NOT_IN_SET && LA205_0<=NOT_REGEXP)||(LA205_0>=IN_RANGE && LA205_0<=SUBSELECT_EXPR)||(LA205_0>=EXISTS_SUBSELECT_EXPR && LA205_0<=NOT_IN_SUBSELECT_EXPR)||LA205_0==SUBSTITUTION||(LA205_0>=FIRST_AGGREG && LA205_0<=WINDOW_AGGREG)||(LA205_0>=INT_TYPE && LA205_0<=NULL_TYPE)||(LA205_0>=JSON_OBJECT && LA205_0<=JSON_ARRAY)||LA205_0==STAR||(LA205_0>=LT && LA205_0<=GT)||(LA205_0>=BOR && LA205_0<=PLUS)||(LA205_0>=BAND && LA205_0<=BXOR)||(LA205_0>=LE && LA205_0<=GE)||(LA205_0>=MINUS && LA205_0<=MOD)||(LA205_0>=EVAL_IS_GROUP_EXPR && LA205_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt205=1;
            }
            else if ( ((LA205_0>=ALL && LA205_0<=SOME)) ) {
                alt205=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 205, 0, input);

                throw nvae;
            }
            switch (alt205) {
                case 1 :
                    // EsperEPL2Ast.g:562:8: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3500);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:564:6: ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
                    {
                    if ( (input.LA(1)>=ALL && input.LA(1)<=SOME) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:564:21: ( ( valueExpr )* | subSelectGroupExpr )
                    int alt204=2;
                    int LA204_0 = input.LA(1);

                    if ( (LA204_0==UP||(LA204_0>=IN_SET && LA204_0<=REGEXP)||LA204_0==NOT_EXPR||(LA204_0>=SUM && LA204_0<=AVG)||(LA204_0>=COALESCE && LA204_0<=COUNT)||(LA204_0>=CASE && LA204_0<=CASE2)||(LA204_0>=PREVIOUS && LA204_0<=EXISTS)||(LA204_0>=INSTANCEOF && LA204_0<=CURRENT_TIMESTAMP)||LA204_0==NEWKW||(LA204_0>=EVAL_AND_EXPR && LA204_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA204_0==EVENT_PROP_EXPR||LA204_0==CONCAT||(LA204_0>=LIB_FUNC_CHAIN && LA204_0<=DOT_EXPR)||LA204_0==ARRAY_EXPR||(LA204_0>=NOT_IN_SET && LA204_0<=NOT_REGEXP)||(LA204_0>=IN_RANGE && LA204_0<=SUBSELECT_EXPR)||(LA204_0>=EXISTS_SUBSELECT_EXPR && LA204_0<=NOT_IN_SUBSELECT_EXPR)||LA204_0==SUBSTITUTION||(LA204_0>=FIRST_AGGREG && LA204_0<=WINDOW_AGGREG)||(LA204_0>=INT_TYPE && LA204_0<=NULL_TYPE)||(LA204_0>=JSON_OBJECT && LA204_0<=JSON_ARRAY)||LA204_0==STAR||(LA204_0>=LT && LA204_0<=GT)||(LA204_0>=BOR && LA204_0<=PLUS)||(LA204_0>=BAND && LA204_0<=BXOR)||(LA204_0>=LE && LA204_0<=GE)||(LA204_0>=MINUS && LA204_0<=MOD)||(LA204_0>=EVAL_IS_GROUP_EXPR && LA204_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt204=1;
                    }
                    else if ( (LA204_0==SUBSELECT_GROUP_EXPR) ) {
                        alt204=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 204, 0, input);

                        throw nvae;
                    }
                    switch (alt204) {
                        case 1 :
                            // EsperEPL2Ast.g:564:22: ( valueExpr )*
                            {
                            // EsperEPL2Ast.g:564:22: ( valueExpr )*
                            loop203:
                            do {
                                int alt203=2;
                                int LA203_0 = input.LA(1);

                                if ( ((LA203_0>=IN_SET && LA203_0<=REGEXP)||LA203_0==NOT_EXPR||(LA203_0>=SUM && LA203_0<=AVG)||(LA203_0>=COALESCE && LA203_0<=COUNT)||(LA203_0>=CASE && LA203_0<=CASE2)||(LA203_0>=PREVIOUS && LA203_0<=EXISTS)||(LA203_0>=INSTANCEOF && LA203_0<=CURRENT_TIMESTAMP)||LA203_0==NEWKW||(LA203_0>=EVAL_AND_EXPR && LA203_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA203_0==EVENT_PROP_EXPR||LA203_0==CONCAT||(LA203_0>=LIB_FUNC_CHAIN && LA203_0<=DOT_EXPR)||LA203_0==ARRAY_EXPR||(LA203_0>=NOT_IN_SET && LA203_0<=NOT_REGEXP)||(LA203_0>=IN_RANGE && LA203_0<=SUBSELECT_EXPR)||(LA203_0>=EXISTS_SUBSELECT_EXPR && LA203_0<=NOT_IN_SUBSELECT_EXPR)||LA203_0==SUBSTITUTION||(LA203_0>=FIRST_AGGREG && LA203_0<=WINDOW_AGGREG)||(LA203_0>=INT_TYPE && LA203_0<=NULL_TYPE)||(LA203_0>=JSON_OBJECT && LA203_0<=JSON_ARRAY)||LA203_0==STAR||(LA203_0>=LT && LA203_0<=GT)||(LA203_0>=BOR && LA203_0<=PLUS)||(LA203_0>=BAND && LA203_0<=BXOR)||(LA203_0>=LE && LA203_0<=GE)||(LA203_0>=MINUS && LA203_0<=MOD)||(LA203_0>=EVAL_IS_GROUP_EXPR && LA203_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt203=1;
                                }


                                switch (alt203) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:564:22: valueExpr
                            	    {
                            	    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3524);
                            	    valueExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop203;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:564:35: subSelectGroupExpr
                            {
                            pushFollow(FOLLOW_subSelectGroupExpr_in_relationalExprValue3529);
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
    // EsperEPL2Ast.g:569:1: evalExprChoice : ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr );
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
            // EsperEPL2Ast.g:570:2: ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr )
            int alt208=12;
            switch ( input.LA(1) ) {
            case EVAL_OR_EXPR:
                {
                alt208=1;
                }
                break;
            case EVAL_AND_EXPR:
                {
                alt208=2;
                }
                break;
            case EVAL_EQUALS_EXPR:
                {
                alt208=3;
                }
                break;
            case EVAL_IS_EXPR:
                {
                alt208=4;
                }
                break;
            case EVAL_NOTEQUALS_EXPR:
                {
                alt208=5;
                }
                break;
            case EVAL_ISNOT_EXPR:
                {
                alt208=6;
                }
                break;
            case EVAL_EQUALS_GROUP_EXPR:
                {
                alt208=7;
                }
                break;
            case EVAL_IS_GROUP_EXPR:
                {
                alt208=8;
                }
                break;
            case EVAL_NOTEQUALS_GROUP_EXPR:
                {
                alt208=9;
                }
                break;
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt208=10;
                }
                break;
            case NOT_EXPR:
                {
                alt208=11;
                }
                break;
            case LT:
            case GT:
            case LE:
            case GE:
                {
                alt208=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 208, 0, input);

                throw nvae;
            }

            switch (alt208) {
                case 1 :
                    // EsperEPL2Ast.g:570:4: ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    jo=(CommonTree)match(input,EVAL_OR_EXPR,FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3555); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3557);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3559);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:570:42: ( valueExpr )*
                    loop206:
                    do {
                        int alt206=2;
                        int LA206_0 = input.LA(1);

                        if ( ((LA206_0>=IN_SET && LA206_0<=REGEXP)||LA206_0==NOT_EXPR||(LA206_0>=SUM && LA206_0<=AVG)||(LA206_0>=COALESCE && LA206_0<=COUNT)||(LA206_0>=CASE && LA206_0<=CASE2)||(LA206_0>=PREVIOUS && LA206_0<=EXISTS)||(LA206_0>=INSTANCEOF && LA206_0<=CURRENT_TIMESTAMP)||LA206_0==NEWKW||(LA206_0>=EVAL_AND_EXPR && LA206_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA206_0==EVENT_PROP_EXPR||LA206_0==CONCAT||(LA206_0>=LIB_FUNC_CHAIN && LA206_0<=DOT_EXPR)||LA206_0==ARRAY_EXPR||(LA206_0>=NOT_IN_SET && LA206_0<=NOT_REGEXP)||(LA206_0>=IN_RANGE && LA206_0<=SUBSELECT_EXPR)||(LA206_0>=EXISTS_SUBSELECT_EXPR && LA206_0<=NOT_IN_SUBSELECT_EXPR)||LA206_0==SUBSTITUTION||(LA206_0>=FIRST_AGGREG && LA206_0<=WINDOW_AGGREG)||(LA206_0>=INT_TYPE && LA206_0<=NULL_TYPE)||(LA206_0>=JSON_OBJECT && LA206_0<=JSON_ARRAY)||LA206_0==STAR||(LA206_0>=LT && LA206_0<=GT)||(LA206_0>=BOR && LA206_0<=PLUS)||(LA206_0>=BAND && LA206_0<=BXOR)||(LA206_0>=LE && LA206_0<=GE)||(LA206_0>=MINUS && LA206_0<=MOD)||(LA206_0>=EVAL_IS_GROUP_EXPR && LA206_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt206=1;
                        }


                        switch (alt206) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:570:43: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3562);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop206;
                        }
                    } while (true);

                     leaveNode(jo); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:571:4: ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    ja=(CommonTree)match(input,EVAL_AND_EXPR,FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3576); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3578);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3580);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:571:43: ( valueExpr )*
                    loop207:
                    do {
                        int alt207=2;
                        int LA207_0 = input.LA(1);

                        if ( ((LA207_0>=IN_SET && LA207_0<=REGEXP)||LA207_0==NOT_EXPR||(LA207_0>=SUM && LA207_0<=AVG)||(LA207_0>=COALESCE && LA207_0<=COUNT)||(LA207_0>=CASE && LA207_0<=CASE2)||(LA207_0>=PREVIOUS && LA207_0<=EXISTS)||(LA207_0>=INSTANCEOF && LA207_0<=CURRENT_TIMESTAMP)||LA207_0==NEWKW||(LA207_0>=EVAL_AND_EXPR && LA207_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA207_0==EVENT_PROP_EXPR||LA207_0==CONCAT||(LA207_0>=LIB_FUNC_CHAIN && LA207_0<=DOT_EXPR)||LA207_0==ARRAY_EXPR||(LA207_0>=NOT_IN_SET && LA207_0<=NOT_REGEXP)||(LA207_0>=IN_RANGE && LA207_0<=SUBSELECT_EXPR)||(LA207_0>=EXISTS_SUBSELECT_EXPR && LA207_0<=NOT_IN_SUBSELECT_EXPR)||LA207_0==SUBSTITUTION||(LA207_0>=FIRST_AGGREG && LA207_0<=WINDOW_AGGREG)||(LA207_0>=INT_TYPE && LA207_0<=NULL_TYPE)||(LA207_0>=JSON_OBJECT && LA207_0<=JSON_ARRAY)||LA207_0==STAR||(LA207_0>=LT && LA207_0<=GT)||(LA207_0>=BOR && LA207_0<=PLUS)||(LA207_0>=BAND && LA207_0<=BXOR)||(LA207_0>=LE && LA207_0<=GE)||(LA207_0>=MINUS && LA207_0<=MOD)||(LA207_0>=EVAL_IS_GROUP_EXPR && LA207_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt207=1;
                        }


                        switch (alt207) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:571:44: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3583);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop207;
                        }
                    } while (true);

                     leaveNode(ja); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:572:4: ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr )
                    {
                    je=(CommonTree)match(input,EVAL_EQUALS_EXPR,FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3597); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3599);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3601);
                    valueExpr();

                    state._fsp--;

                     leaveNode(je); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:573:4: ^(ji= EVAL_IS_EXPR valueExpr valueExpr )
                    {
                    ji=(CommonTree)match(input,EVAL_IS_EXPR,FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3613); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3615);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3617);
                    valueExpr();

                    state._fsp--;

                     leaveNode(ji); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:574:4: ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr )
                    {
                    jne=(CommonTree)match(input,EVAL_NOTEQUALS_EXPR,FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3629); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3631);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3633);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:575:4: ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr )
                    {
                    jis=(CommonTree)match(input,EVAL_ISNOT_EXPR,FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3645); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3647);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3649);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jis); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:576:4: ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jge=(CommonTree)match(input,EVAL_EQUALS_GROUP_EXPR,FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3661); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3663);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jge); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:577:4: ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery )
                    {
                    jgi=(CommonTree)match(input,EVAL_IS_GROUP_EXPR,FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3675); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3677);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgi); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:578:4: ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jgne=(CommonTree)match(input,EVAL_NOTEQUALS_GROUP_EXPR,FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3689); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3691);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:579:4: ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery )
                    {
                    jgni=(CommonTree)match(input,EVAL_ISNOT_GROUP_EXPR,FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3703); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3705);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgni); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:580:4: ^(n= NOT_EXPR valueExpr )
                    {
                    n=(CommonTree)match(input,NOT_EXPR,FOLLOW_NOT_EXPR_in_evalExprChoice3717); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3719);
                    valueExpr();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:581:4: r= relationalExpr
                    {
                    pushFollow(FOLLOW_relationalExpr_in_evalExprChoice3730);
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
    // EsperEPL2Ast.g:584:1: equalsSubquery : valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ;
    public final void equalsSubquery() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:585:2: ( valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            // EsperEPL2Ast.g:585:4: valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
            {
            pushFollow(FOLLOW_valueExpr_in_equalsSubquery3741);
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

            // EsperEPL2Ast.g:585:29: ( ( valueExpr )* | subSelectGroupExpr )
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==UP||(LA210_0>=IN_SET && LA210_0<=REGEXP)||LA210_0==NOT_EXPR||(LA210_0>=SUM && LA210_0<=AVG)||(LA210_0>=COALESCE && LA210_0<=COUNT)||(LA210_0>=CASE && LA210_0<=CASE2)||(LA210_0>=PREVIOUS && LA210_0<=EXISTS)||(LA210_0>=INSTANCEOF && LA210_0<=CURRENT_TIMESTAMP)||LA210_0==NEWKW||(LA210_0>=EVAL_AND_EXPR && LA210_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA210_0==EVENT_PROP_EXPR||LA210_0==CONCAT||(LA210_0>=LIB_FUNC_CHAIN && LA210_0<=DOT_EXPR)||LA210_0==ARRAY_EXPR||(LA210_0>=NOT_IN_SET && LA210_0<=NOT_REGEXP)||(LA210_0>=IN_RANGE && LA210_0<=SUBSELECT_EXPR)||(LA210_0>=EXISTS_SUBSELECT_EXPR && LA210_0<=NOT_IN_SUBSELECT_EXPR)||LA210_0==SUBSTITUTION||(LA210_0>=FIRST_AGGREG && LA210_0<=WINDOW_AGGREG)||(LA210_0>=INT_TYPE && LA210_0<=NULL_TYPE)||(LA210_0>=JSON_OBJECT && LA210_0<=JSON_ARRAY)||LA210_0==STAR||(LA210_0>=LT && LA210_0<=GT)||(LA210_0>=BOR && LA210_0<=PLUS)||(LA210_0>=BAND && LA210_0<=BXOR)||(LA210_0>=LE && LA210_0<=GE)||(LA210_0>=MINUS && LA210_0<=MOD)||(LA210_0>=EVAL_IS_GROUP_EXPR && LA210_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt210=1;
            }
            else if ( (LA210_0==SUBSELECT_GROUP_EXPR) ) {
                alt210=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 210, 0, input);

                throw nvae;
            }
            switch (alt210) {
                case 1 :
                    // EsperEPL2Ast.g:585:30: ( valueExpr )*
                    {
                    // EsperEPL2Ast.g:585:30: ( valueExpr )*
                    loop209:
                    do {
                        int alt209=2;
                        int LA209_0 = input.LA(1);

                        if ( ((LA209_0>=IN_SET && LA209_0<=REGEXP)||LA209_0==NOT_EXPR||(LA209_0>=SUM && LA209_0<=AVG)||(LA209_0>=COALESCE && LA209_0<=COUNT)||(LA209_0>=CASE && LA209_0<=CASE2)||(LA209_0>=PREVIOUS && LA209_0<=EXISTS)||(LA209_0>=INSTANCEOF && LA209_0<=CURRENT_TIMESTAMP)||LA209_0==NEWKW||(LA209_0>=EVAL_AND_EXPR && LA209_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA209_0==EVENT_PROP_EXPR||LA209_0==CONCAT||(LA209_0>=LIB_FUNC_CHAIN && LA209_0<=DOT_EXPR)||LA209_0==ARRAY_EXPR||(LA209_0>=NOT_IN_SET && LA209_0<=NOT_REGEXP)||(LA209_0>=IN_RANGE && LA209_0<=SUBSELECT_EXPR)||(LA209_0>=EXISTS_SUBSELECT_EXPR && LA209_0<=NOT_IN_SUBSELECT_EXPR)||LA209_0==SUBSTITUTION||(LA209_0>=FIRST_AGGREG && LA209_0<=WINDOW_AGGREG)||(LA209_0>=INT_TYPE && LA209_0<=NULL_TYPE)||(LA209_0>=JSON_OBJECT && LA209_0<=JSON_ARRAY)||LA209_0==STAR||(LA209_0>=LT && LA209_0<=GT)||(LA209_0>=BOR && LA209_0<=PLUS)||(LA209_0>=BAND && LA209_0<=BXOR)||(LA209_0>=LE && LA209_0<=GE)||(LA209_0>=MINUS && LA209_0<=MOD)||(LA209_0>=EVAL_IS_GROUP_EXPR && LA209_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt209=1;
                        }


                        switch (alt209) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:585:30: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_equalsSubquery3752);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop209;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:585:43: subSelectGroupExpr
                    {
                    pushFollow(FOLLOW_subSelectGroupExpr_in_equalsSubquery3757);
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
    // EsperEPL2Ast.g:588:1: valueExpr : ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr | jsonarray[true] | jsonobject[true] );
    public final void valueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:589:2: ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr | jsonarray[true] | jsonobject[true] )
            int alt211=20;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt211=1;
                }
                break;
            case SUBSTITUTION:
                {
                alt211=2;
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
                alt211=3;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt211=4;
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
                alt211=5;
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
                alt211=6;
                }
                break;
            case LIB_FUNC_CHAIN:
                {
                alt211=7;
                }
                break;
            case CASE:
            case CASE2:
                {
                alt211=8;
                }
                break;
            case IN_SET:
            case NOT_IN_SET:
            case IN_RANGE:
            case NOT_IN_RANGE:
                {
                alt211=9;
                }
                break;
            case BETWEEN:
            case NOT_BETWEEN:
                {
                alt211=10;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt211=11;
                }
                break;
            case REGEXP:
            case NOT_REGEXP:
                {
                alt211=12;
                }
                break;
            case ARRAY_EXPR:
                {
                alt211=13;
                }
                break;
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
                {
                alt211=14;
                }
                break;
            case SUBSELECT_EXPR:
                {
                alt211=15;
                }
                break;
            case EXISTS_SUBSELECT_EXPR:
                {
                alt211=16;
                }
                break;
            case DOT_EXPR:
                {
                alt211=17;
                }
                break;
            case NEWKW:
                {
                alt211=18;
                }
                break;
            case JSON_ARRAY:
                {
                alt211=19;
                }
                break;
            case JSON_OBJECT:
                {
                alt211=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 211, 0, input);

                throw nvae;
            }

            switch (alt211) {
                case 1 :
                    // EsperEPL2Ast.g:589:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_valueExpr3771);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:590:4: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_valueExpr3777);
                    substitution();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:591:5: arithmeticExpr
                    {
                    pushFollow(FOLLOW_arithmeticExpr_in_valueExpr3783);
                    arithmeticExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:592:5: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_valueExpr3790);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:593:7: evalExprChoice
                    {
                    pushFollow(FOLLOW_evalExprChoice_in_valueExpr3799);
                    evalExprChoice();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:594:4: builtinFunc
                    {
                    pushFollow(FOLLOW_builtinFunc_in_valueExpr3804);
                    builtinFunc();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:595:7: libFuncChain
                    {
                    pushFollow(FOLLOW_libFuncChain_in_valueExpr3812);
                    libFuncChain();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:596:4: caseExpr
                    {
                    pushFollow(FOLLOW_caseExpr_in_valueExpr3817);
                    caseExpr();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:597:4: inExpr
                    {
                    pushFollow(FOLLOW_inExpr_in_valueExpr3822);
                    inExpr();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:598:4: betweenExpr
                    {
                    pushFollow(FOLLOW_betweenExpr_in_valueExpr3828);
                    betweenExpr();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:599:4: likeExpr
                    {
                    pushFollow(FOLLOW_likeExpr_in_valueExpr3833);
                    likeExpr();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:600:4: regExpExpr
                    {
                    pushFollow(FOLLOW_regExpExpr_in_valueExpr3838);
                    regExpExpr();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // EsperEPL2Ast.g:601:4: arrayExpr
                    {
                    pushFollow(FOLLOW_arrayExpr_in_valueExpr3843);
                    arrayExpr();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:602:4: subSelectInExpr
                    {
                    pushFollow(FOLLOW_subSelectInExpr_in_valueExpr3848);
                    subSelectInExpr();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:603:5: subSelectRowExpr
                    {
                    pushFollow(FOLLOW_subSelectRowExpr_in_valueExpr3854);
                    subSelectRowExpr();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:604:5: subSelectExistsExpr
                    {
                    pushFollow(FOLLOW_subSelectExistsExpr_in_valueExpr3861);
                    subSelectExistsExpr();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:605:4: dotExpr
                    {
                    pushFollow(FOLLOW_dotExpr_in_valueExpr3866);
                    dotExpr();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:606:4: newExpr
                    {
                    pushFollow(FOLLOW_newExpr_in_valueExpr3871);
                    newExpr();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // EsperEPL2Ast.g:607:4: jsonarray[true]
                    {
                    pushFollow(FOLLOW_jsonarray_in_valueExpr3876);
                    jsonarray(true);

                    state._fsp--;


                    }
                    break;
                case 20 :
                    // EsperEPL2Ast.g:608:4: jsonobject[true]
                    {
                    pushFollow(FOLLOW_jsonobject_in_valueExpr3882);
                    jsonobject(true);

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
    // EsperEPL2Ast.g:611:1: valueExprWithTime : (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod );
    public final void valueExprWithTime() throws RecognitionException {
        CommonTree l=null;
        CommonTree lw=null;
        CommonTree ordered=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:612:2: (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod )
            int alt213=11;
            switch ( input.LA(1) ) {
            case LAST:
                {
                alt213=1;
                }
                break;
            case LW:
                {
                alt213=2;
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
            case JSON_OBJECT:
            case JSON_ARRAY:
            case STAR:
            case LT:
            case GT:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case LE:
            case GE:
            case MINUS:
            case DIV:
            case MOD:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt213=3;
                }
                break;
            case OBJECT_PARAM_ORDERED_EXPR:
                {
                alt213=4;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt213=5;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt213=6;
                }
                break;
            case LAST_OPERATOR:
                {
                alt213=7;
                }
                break;
            case WEEKDAY_OPERATOR:
                {
                alt213=8;
                }
                break;
            case NUMERIC_PARAM_LIST:
                {
                alt213=9;
                }
                break;
            case NUMBERSETSTAR:
                {
                alt213=10;
                }
                break;
            case TIME_PERIOD:
                {
                alt213=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 213, 0, input);

                throw nvae;
            }

            switch (alt213) {
                case 1 :
                    // EsperEPL2Ast.g:612:4: l= LAST
                    {
                    l=(CommonTree)match(input,LAST,FOLLOW_LAST_in_valueExprWithTime3896); 
                     leaveNode(l); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:613:4: lw= LW
                    {
                    lw=(CommonTree)match(input,LW,FOLLOW_LW_in_valueExprWithTime3905); 
                     leaveNode(lw); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:614:4: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3912);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:615:4: ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) )
                    {
                    ordered=(CommonTree)match(input,OBJECT_PARAM_ORDERED_EXPR,FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3920); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime3922);
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
                    // EsperEPL2Ast.g:616:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_valueExprWithTime3937);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:617:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_valueExprWithTime3943);
                    frequencyOperator();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:618:4: lastOperator
                    {
                    pushFollow(FOLLOW_lastOperator_in_valueExprWithTime3948);
                    lastOperator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:619:4: weekDayOperator
                    {
                    pushFollow(FOLLOW_weekDayOperator_in_valueExprWithTime3953);
                    weekDayOperator();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:620:5: ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ )
                    {
                    l=(CommonTree)match(input,NUMERIC_PARAM_LIST,FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3963); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:620:29: ( numericParameterList )+
                    int cnt212=0;
                    loop212:
                    do {
                        int alt212=2;
                        int LA212_0 = input.LA(1);

                        if ( (LA212_0==NUMERIC_PARAM_RANGE||LA212_0==NUMERIC_PARAM_FREQUENCY||(LA212_0>=INT_TYPE && LA212_0<=NULL_TYPE)) ) {
                            alt212=1;
                        }


                        switch (alt212) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:620:29: numericParameterList
                    	    {
                    	    pushFollow(FOLLOW_numericParameterList_in_valueExprWithTime3965);
                    	    numericParameterList();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt212 >= 1 ) break loop212;
                                EarlyExitException eee =
                                    new EarlyExitException(212, input);
                                throw eee;
                        }
                        cnt212++;
                    } while (true);

                     leaveNode(l); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:621:4: s= NUMBERSETSTAR
                    {
                    s=(CommonTree)match(input,NUMBERSETSTAR,FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3976); 
                     leaveNode(s); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:622:4: timePeriod
                    {
                    pushFollow(FOLLOW_timePeriod_in_valueExprWithTime3983);
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
    // EsperEPL2Ast.g:625:1: numericParameterList : ( constant[true] | rangeOperator | frequencyOperator );
    public final void numericParameterList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:626:2: ( constant[true] | rangeOperator | frequencyOperator )
            int alt214=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt214=1;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt214=2;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt214=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 214, 0, input);

                throw nvae;
            }

            switch (alt214) {
                case 1 :
                    // EsperEPL2Ast.g:626:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_numericParameterList3996);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:627:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_numericParameterList4003);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:628:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_numericParameterList4009);
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
    // EsperEPL2Ast.g:631:1: rangeOperator : ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void rangeOperator() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:632:2: ( ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:632:4: ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            r=(CommonTree)match(input,NUMERIC_PARAM_RANGE,FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator4025); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:632:29: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt215=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt215=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt215=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt215=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 215, 0, input);

                throw nvae;
            }

            switch (alt215) {
                case 1 :
                    // EsperEPL2Ast.g:632:30: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator4028);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:632:45: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator4031);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:632:69: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator4034);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:632:83: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt216=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt216=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt216=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt216=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 216, 0, input);

                throw nvae;
            }

            switch (alt216) {
                case 1 :
                    // EsperEPL2Ast.g:632:84: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator4038);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:632:99: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator4041);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:632:123: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator4044);
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
    // EsperEPL2Ast.g:635:1: frequencyOperator : ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void frequencyOperator() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:636:2: ( ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:636:4: ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            f=(CommonTree)match(input,NUMERIC_PARAM_FREQUENCY,FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator4065); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:636:33: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt217=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt217=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt217=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt217=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 217, 0, input);

                throw nvae;
            }

            switch (alt217) {
                case 1 :
                    // EsperEPL2Ast.g:636:34: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_frequencyOperator4068);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:636:49: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_frequencyOperator4071);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:636:73: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_frequencyOperator4074);
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
    // EsperEPL2Ast.g:639:1: lastOperator : ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void lastOperator() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:640:2: ( ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:640:4: ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            l=(CommonTree)match(input,LAST_OPERATOR,FOLLOW_LAST_OPERATOR_in_lastOperator4093); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:640:23: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt218=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt218=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt218=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt218=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;
            }

            switch (alt218) {
                case 1 :
                    // EsperEPL2Ast.g:640:24: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_lastOperator4096);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:640:39: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_lastOperator4099);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:640:63: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_lastOperator4102);
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
    // EsperEPL2Ast.g:643:1: weekDayOperator : ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void weekDayOperator() throws RecognitionException {
        CommonTree w=null;

        try {
            // EsperEPL2Ast.g:644:2: ( ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:644:4: ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            w=(CommonTree)match(input,WEEKDAY_OPERATOR,FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator4121); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:644:26: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt219=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt219=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt219=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt219=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 219, 0, input);

                throw nvae;
            }

            switch (alt219) {
                case 1 :
                    // EsperEPL2Ast.g:644:27: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_weekDayOperator4124);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:644:42: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_weekDayOperator4127);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:644:66: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_weekDayOperator4130);
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
    // EsperEPL2Ast.g:647:1: subSelectGroupExpr : ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) ;
    public final void subSelectGroupExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:648:2: ( ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:648:4: ^(s= SUBSELECT_GROUP_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_GROUP_EXPR,FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr4151); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectGroupExpr4153);
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
    // EsperEPL2Ast.g:651:1: subSelectRowExpr : ^(s= SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectRowExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:652:2: ( ^(s= SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:652:4: ^(s= SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_EXPR,FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr4172); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectRowExpr4174);
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
    // EsperEPL2Ast.g:655:1: subSelectExistsExpr : ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectExistsExpr() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:656:2: ( ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:656:4: ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            e=(CommonTree)match(input,EXISTS_SUBSELECT_EXPR,FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr4193); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectExistsExpr4195);
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
    // EsperEPL2Ast.g:659:1: subSelectInExpr : ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) );
    public final void subSelectInExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:660:2: ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) )
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==IN_SUBSELECT_EXPR) ) {
                alt220=1;
            }
            else if ( (LA220_0==NOT_IN_SUBSELECT_EXPR) ) {
                alt220=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 220, 0, input);

                throw nvae;
            }
            switch (alt220) {
                case 1 :
                    // EsperEPL2Ast.g:660:5: ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,IN_SUBSELECT_EXPR,FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr4214); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr4216);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4218);
                    subSelectInQueryExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(s); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:661:5: ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,NOT_IN_SUBSELECT_EXPR,FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr4230); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr4232);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4234);
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
    // EsperEPL2Ast.g:664:1: subSelectInQueryExpr : ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) ;
    public final void subSelectInQueryExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:665:2: ( ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:665:4: ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr )
            {
            pushStmtContext();
            i=(CommonTree)match(input,IN_SUBSELECT_QUERY_EXPR,FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr4253); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectInQueryExpr4255);
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
    // EsperEPL2Ast.g:668:1: subQueryExpr : ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? ;
    public final void subQueryExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:669:2: ( ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? )
            // EsperEPL2Ast.g:669:4: ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )?
            {
            // EsperEPL2Ast.g:669:4: ( DISTINCT )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==DISTINCT) ) {
                alt221=1;
            }
            switch (alt221) {
                case 1 :
                    // EsperEPL2Ast.g:669:4: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_subQueryExpr4271); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_subQueryExpr4274);
            selectionList();

            state._fsp--;

            pushFollow(FOLLOW_subSelectFilterExpr_in_subQueryExpr4276);
            subSelectFilterExpr();

            state._fsp--;

            // EsperEPL2Ast.g:669:48: ( whereClause[true] )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==WHERE_EXPR) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // EsperEPL2Ast.g:669:49: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_subQueryExpr4279);
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
    // EsperEPL2Ast.g:672:1: subSelectFilterExpr : ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) ;
    public final void subSelectFilterExpr() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:673:2: ( ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:673:4: ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_subSelectFilterExpr4297); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_subSelectFilterExpr4299);
            eventFilterExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:673:42: ( viewListExpr )?
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==VIEW_EXPR) ) {
                alt223=1;
            }
            switch (alt223) {
                case 1 :
                    // EsperEPL2Ast.g:673:43: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_subSelectFilterExpr4303);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:673:58: ( IDENT )?
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==IDENT) ) {
                alt224=1;
            }
            switch (alt224) {
                case 1 :
                    // EsperEPL2Ast.g:673:59: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_subSelectFilterExpr4308); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:673:67: ( RETAINUNION )?
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==RETAINUNION) ) {
                alt225=1;
            }
            switch (alt225) {
                case 1 :
                    // EsperEPL2Ast.g:673:67: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_subSelectFilterExpr4312); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:673:80: ( RETAININTERSECTION )?
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==RETAININTERSECTION) ) {
                alt226=1;
            }
            switch (alt226) {
                case 1 :
                    // EsperEPL2Ast.g:673:80: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr4315); 

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
    // EsperEPL2Ast.g:676:1: caseExpr : ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) );
    public final void caseExpr() throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:677:2: ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) )
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==CASE) ) {
                alt229=1;
            }
            else if ( (LA229_0==CASE2) ) {
                alt229=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 0, input);

                throw nvae;
            }
            switch (alt229) {
                case 1 :
                    // EsperEPL2Ast.g:677:4: ^(c= CASE ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE,FOLLOW_CASE_in_caseExpr4335); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:677:13: ( valueExpr )*
                        loop227:
                        do {
                            int alt227=2;
                            int LA227_0 = input.LA(1);

                            if ( ((LA227_0>=IN_SET && LA227_0<=REGEXP)||LA227_0==NOT_EXPR||(LA227_0>=SUM && LA227_0<=AVG)||(LA227_0>=COALESCE && LA227_0<=COUNT)||(LA227_0>=CASE && LA227_0<=CASE2)||(LA227_0>=PREVIOUS && LA227_0<=EXISTS)||(LA227_0>=INSTANCEOF && LA227_0<=CURRENT_TIMESTAMP)||LA227_0==NEWKW||(LA227_0>=EVAL_AND_EXPR && LA227_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA227_0==EVENT_PROP_EXPR||LA227_0==CONCAT||(LA227_0>=LIB_FUNC_CHAIN && LA227_0<=DOT_EXPR)||LA227_0==ARRAY_EXPR||(LA227_0>=NOT_IN_SET && LA227_0<=NOT_REGEXP)||(LA227_0>=IN_RANGE && LA227_0<=SUBSELECT_EXPR)||(LA227_0>=EXISTS_SUBSELECT_EXPR && LA227_0<=NOT_IN_SUBSELECT_EXPR)||LA227_0==SUBSTITUTION||(LA227_0>=FIRST_AGGREG && LA227_0<=WINDOW_AGGREG)||(LA227_0>=INT_TYPE && LA227_0<=NULL_TYPE)||(LA227_0>=JSON_OBJECT && LA227_0<=JSON_ARRAY)||LA227_0==STAR||(LA227_0>=LT && LA227_0<=GT)||(LA227_0>=BOR && LA227_0<=PLUS)||(LA227_0>=BAND && LA227_0<=BXOR)||(LA227_0>=LE && LA227_0<=GE)||(LA227_0>=MINUS && LA227_0<=MOD)||(LA227_0>=EVAL_IS_GROUP_EXPR && LA227_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt227=1;
                            }


                            switch (alt227) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:677:14: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr4338);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop227;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                     leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:678:4: ^(c= CASE2 ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE2,FOLLOW_CASE2_in_caseExpr4351); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:678:14: ( valueExpr )*
                        loop228:
                        do {
                            int alt228=2;
                            int LA228_0 = input.LA(1);

                            if ( ((LA228_0>=IN_SET && LA228_0<=REGEXP)||LA228_0==NOT_EXPR||(LA228_0>=SUM && LA228_0<=AVG)||(LA228_0>=COALESCE && LA228_0<=COUNT)||(LA228_0>=CASE && LA228_0<=CASE2)||(LA228_0>=PREVIOUS && LA228_0<=EXISTS)||(LA228_0>=INSTANCEOF && LA228_0<=CURRENT_TIMESTAMP)||LA228_0==NEWKW||(LA228_0>=EVAL_AND_EXPR && LA228_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA228_0==EVENT_PROP_EXPR||LA228_0==CONCAT||(LA228_0>=LIB_FUNC_CHAIN && LA228_0<=DOT_EXPR)||LA228_0==ARRAY_EXPR||(LA228_0>=NOT_IN_SET && LA228_0<=NOT_REGEXP)||(LA228_0>=IN_RANGE && LA228_0<=SUBSELECT_EXPR)||(LA228_0>=EXISTS_SUBSELECT_EXPR && LA228_0<=NOT_IN_SUBSELECT_EXPR)||LA228_0==SUBSTITUTION||(LA228_0>=FIRST_AGGREG && LA228_0<=WINDOW_AGGREG)||(LA228_0>=INT_TYPE && LA228_0<=NULL_TYPE)||(LA228_0>=JSON_OBJECT && LA228_0<=JSON_ARRAY)||LA228_0==STAR||(LA228_0>=LT && LA228_0<=GT)||(LA228_0>=BOR && LA228_0<=PLUS)||(LA228_0>=BAND && LA228_0<=BXOR)||(LA228_0>=LE && LA228_0<=GE)||(LA228_0>=MINUS && LA228_0<=MOD)||(LA228_0>=EVAL_IS_GROUP_EXPR && LA228_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt228=1;
                            }


                            switch (alt228) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:678:15: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr4354);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop228;
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
    // EsperEPL2Ast.g:681:1: inExpr : ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) );
    public final void inExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:682:2: ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) )
            int alt232=4;
            switch ( input.LA(1) ) {
            case IN_SET:
                {
                alt232=1;
                }
                break;
            case NOT_IN_SET:
                {
                alt232=2;
                }
                break;
            case IN_RANGE:
                {
                alt232=3;
                }
                break;
            case NOT_IN_RANGE:
                {
                alt232=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 232, 0, input);

                throw nvae;
            }

            switch (alt232) {
                case 1 :
                    // EsperEPL2Ast.g:682:4: ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_SET,FOLLOW_IN_SET_in_inExpr4374); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4376);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4384);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:682:51: ( valueExpr )*
                    loop230:
                    do {
                        int alt230=2;
                        int LA230_0 = input.LA(1);

                        if ( ((LA230_0>=IN_SET && LA230_0<=REGEXP)||LA230_0==NOT_EXPR||(LA230_0>=SUM && LA230_0<=AVG)||(LA230_0>=COALESCE && LA230_0<=COUNT)||(LA230_0>=CASE && LA230_0<=CASE2)||(LA230_0>=PREVIOUS && LA230_0<=EXISTS)||(LA230_0>=INSTANCEOF && LA230_0<=CURRENT_TIMESTAMP)||LA230_0==NEWKW||(LA230_0>=EVAL_AND_EXPR && LA230_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA230_0==EVENT_PROP_EXPR||LA230_0==CONCAT||(LA230_0>=LIB_FUNC_CHAIN && LA230_0<=DOT_EXPR)||LA230_0==ARRAY_EXPR||(LA230_0>=NOT_IN_SET && LA230_0<=NOT_REGEXP)||(LA230_0>=IN_RANGE && LA230_0<=SUBSELECT_EXPR)||(LA230_0>=EXISTS_SUBSELECT_EXPR && LA230_0<=NOT_IN_SUBSELECT_EXPR)||LA230_0==SUBSTITUTION||(LA230_0>=FIRST_AGGREG && LA230_0<=WINDOW_AGGREG)||(LA230_0>=INT_TYPE && LA230_0<=NULL_TYPE)||(LA230_0>=JSON_OBJECT && LA230_0<=JSON_ARRAY)||LA230_0==STAR||(LA230_0>=LT && LA230_0<=GT)||(LA230_0>=BOR && LA230_0<=PLUS)||(LA230_0>=BAND && LA230_0<=BXOR)||(LA230_0>=LE && LA230_0<=GE)||(LA230_0>=MINUS && LA230_0<=MOD)||(LA230_0>=EVAL_IS_GROUP_EXPR && LA230_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt230=1;
                        }


                        switch (alt230) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:682:52: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4387);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop230;
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
                    // EsperEPL2Ast.g:683:4: ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_SET,FOLLOW_NOT_IN_SET_in_inExpr4406); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4408);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4416);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:683:55: ( valueExpr )*
                    loop231:
                    do {
                        int alt231=2;
                        int LA231_0 = input.LA(1);

                        if ( ((LA231_0>=IN_SET && LA231_0<=REGEXP)||LA231_0==NOT_EXPR||(LA231_0>=SUM && LA231_0<=AVG)||(LA231_0>=COALESCE && LA231_0<=COUNT)||(LA231_0>=CASE && LA231_0<=CASE2)||(LA231_0>=PREVIOUS && LA231_0<=EXISTS)||(LA231_0>=INSTANCEOF && LA231_0<=CURRENT_TIMESTAMP)||LA231_0==NEWKW||(LA231_0>=EVAL_AND_EXPR && LA231_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA231_0==EVENT_PROP_EXPR||LA231_0==CONCAT||(LA231_0>=LIB_FUNC_CHAIN && LA231_0<=DOT_EXPR)||LA231_0==ARRAY_EXPR||(LA231_0>=NOT_IN_SET && LA231_0<=NOT_REGEXP)||(LA231_0>=IN_RANGE && LA231_0<=SUBSELECT_EXPR)||(LA231_0>=EXISTS_SUBSELECT_EXPR && LA231_0<=NOT_IN_SUBSELECT_EXPR)||LA231_0==SUBSTITUTION||(LA231_0>=FIRST_AGGREG && LA231_0<=WINDOW_AGGREG)||(LA231_0>=INT_TYPE && LA231_0<=NULL_TYPE)||(LA231_0>=JSON_OBJECT && LA231_0<=JSON_ARRAY)||LA231_0==STAR||(LA231_0>=LT && LA231_0<=GT)||(LA231_0>=BOR && LA231_0<=PLUS)||(LA231_0>=BAND && LA231_0<=BXOR)||(LA231_0>=LE && LA231_0<=GE)||(LA231_0>=MINUS && LA231_0<=MOD)||(LA231_0>=EVAL_IS_GROUP_EXPR && LA231_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt231=1;
                        }


                        switch (alt231) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:683:56: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4419);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop231;
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
                    // EsperEPL2Ast.g:684:4: ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_RANGE,FOLLOW_IN_RANGE_in_inExpr4438); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4440);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4448);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4450);
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
                    // EsperEPL2Ast.g:685:4: ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_RANGE,FOLLOW_NOT_IN_RANGE_in_inExpr4467); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4469);
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

                    pushFollow(FOLLOW_valueExpr_in_inExpr4477);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4479);
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
    // EsperEPL2Ast.g:688:1: betweenExpr : ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) );
    public final void betweenExpr() throws RecognitionException {
        CommonTree b=null;

        try {
            // EsperEPL2Ast.g:689:2: ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) )
            int alt234=2;
            int LA234_0 = input.LA(1);

            if ( (LA234_0==BETWEEN) ) {
                alt234=1;
            }
            else if ( (LA234_0==NOT_BETWEEN) ) {
                alt234=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 234, 0, input);

                throw nvae;
            }
            switch (alt234) {
                case 1 :
                    // EsperEPL2Ast.g:689:4: ^(b= BETWEEN valueExpr valueExpr valueExpr )
                    {
                    b=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenExpr4504); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4506);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4508);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4510);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(b); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:690:4: ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* )
                    {
                    b=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenExpr4521); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4523);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4525);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:690:40: ( valueExpr )*
                    loop233:
                    do {
                        int alt233=2;
                        int LA233_0 = input.LA(1);

                        if ( ((LA233_0>=IN_SET && LA233_0<=REGEXP)||LA233_0==NOT_EXPR||(LA233_0>=SUM && LA233_0<=AVG)||(LA233_0>=COALESCE && LA233_0<=COUNT)||(LA233_0>=CASE && LA233_0<=CASE2)||(LA233_0>=PREVIOUS && LA233_0<=EXISTS)||(LA233_0>=INSTANCEOF && LA233_0<=CURRENT_TIMESTAMP)||LA233_0==NEWKW||(LA233_0>=EVAL_AND_EXPR && LA233_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA233_0==EVENT_PROP_EXPR||LA233_0==CONCAT||(LA233_0>=LIB_FUNC_CHAIN && LA233_0<=DOT_EXPR)||LA233_0==ARRAY_EXPR||(LA233_0>=NOT_IN_SET && LA233_0<=NOT_REGEXP)||(LA233_0>=IN_RANGE && LA233_0<=SUBSELECT_EXPR)||(LA233_0>=EXISTS_SUBSELECT_EXPR && LA233_0<=NOT_IN_SUBSELECT_EXPR)||LA233_0==SUBSTITUTION||(LA233_0>=FIRST_AGGREG && LA233_0<=WINDOW_AGGREG)||(LA233_0>=INT_TYPE && LA233_0<=NULL_TYPE)||(LA233_0>=JSON_OBJECT && LA233_0<=JSON_ARRAY)||LA233_0==STAR||(LA233_0>=LT && LA233_0<=GT)||(LA233_0>=BOR && LA233_0<=PLUS)||(LA233_0>=BAND && LA233_0<=BXOR)||(LA233_0>=LE && LA233_0<=GE)||(LA233_0>=MINUS && LA233_0<=MOD)||(LA233_0>=EVAL_IS_GROUP_EXPR && LA233_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt233=1;
                        }


                        switch (alt233) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:690:41: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_betweenExpr4528);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop233;
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
    // EsperEPL2Ast.g:693:1: likeExpr : ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) );
    public final void likeExpr() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:694:2: ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) )
            int alt237=2;
            int LA237_0 = input.LA(1);

            if ( (LA237_0==LIKE) ) {
                alt237=1;
            }
            else if ( (LA237_0==NOT_LIKE) ) {
                alt237=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 237, 0, input);

                throw nvae;
            }
            switch (alt237) {
                case 1 :
                    // EsperEPL2Ast.g:694:4: ^(l= LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeExpr4548); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4550);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4552);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:694:33: ( valueExpr )?
                    int alt235=2;
                    int LA235_0 = input.LA(1);

                    if ( ((LA235_0>=IN_SET && LA235_0<=REGEXP)||LA235_0==NOT_EXPR||(LA235_0>=SUM && LA235_0<=AVG)||(LA235_0>=COALESCE && LA235_0<=COUNT)||(LA235_0>=CASE && LA235_0<=CASE2)||(LA235_0>=PREVIOUS && LA235_0<=EXISTS)||(LA235_0>=INSTANCEOF && LA235_0<=CURRENT_TIMESTAMP)||LA235_0==NEWKW||(LA235_0>=EVAL_AND_EXPR && LA235_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA235_0==EVENT_PROP_EXPR||LA235_0==CONCAT||(LA235_0>=LIB_FUNC_CHAIN && LA235_0<=DOT_EXPR)||LA235_0==ARRAY_EXPR||(LA235_0>=NOT_IN_SET && LA235_0<=NOT_REGEXP)||(LA235_0>=IN_RANGE && LA235_0<=SUBSELECT_EXPR)||(LA235_0>=EXISTS_SUBSELECT_EXPR && LA235_0<=NOT_IN_SUBSELECT_EXPR)||LA235_0==SUBSTITUTION||(LA235_0>=FIRST_AGGREG && LA235_0<=WINDOW_AGGREG)||(LA235_0>=INT_TYPE && LA235_0<=NULL_TYPE)||(LA235_0>=JSON_OBJECT && LA235_0<=JSON_ARRAY)||LA235_0==STAR||(LA235_0>=LT && LA235_0<=GT)||(LA235_0>=BOR && LA235_0<=PLUS)||(LA235_0>=BAND && LA235_0<=BXOR)||(LA235_0>=LE && LA235_0<=GE)||(LA235_0>=MINUS && LA235_0<=MOD)||(LA235_0>=EVAL_IS_GROUP_EXPR && LA235_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt235=1;
                    }
                    switch (alt235) {
                        case 1 :
                            // EsperEPL2Ast.g:694:34: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4555);
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
                    // EsperEPL2Ast.g:695:4: ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeExpr4568); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4570);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4572);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:695:37: ( valueExpr )?
                    int alt236=2;
                    int LA236_0 = input.LA(1);

                    if ( ((LA236_0>=IN_SET && LA236_0<=REGEXP)||LA236_0==NOT_EXPR||(LA236_0>=SUM && LA236_0<=AVG)||(LA236_0>=COALESCE && LA236_0<=COUNT)||(LA236_0>=CASE && LA236_0<=CASE2)||(LA236_0>=PREVIOUS && LA236_0<=EXISTS)||(LA236_0>=INSTANCEOF && LA236_0<=CURRENT_TIMESTAMP)||LA236_0==NEWKW||(LA236_0>=EVAL_AND_EXPR && LA236_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA236_0==EVENT_PROP_EXPR||LA236_0==CONCAT||(LA236_0>=LIB_FUNC_CHAIN && LA236_0<=DOT_EXPR)||LA236_0==ARRAY_EXPR||(LA236_0>=NOT_IN_SET && LA236_0<=NOT_REGEXP)||(LA236_0>=IN_RANGE && LA236_0<=SUBSELECT_EXPR)||(LA236_0>=EXISTS_SUBSELECT_EXPR && LA236_0<=NOT_IN_SUBSELECT_EXPR)||LA236_0==SUBSTITUTION||(LA236_0>=FIRST_AGGREG && LA236_0<=WINDOW_AGGREG)||(LA236_0>=INT_TYPE && LA236_0<=NULL_TYPE)||(LA236_0>=JSON_OBJECT && LA236_0<=JSON_ARRAY)||LA236_0==STAR||(LA236_0>=LT && LA236_0<=GT)||(LA236_0>=BOR && LA236_0<=PLUS)||(LA236_0>=BAND && LA236_0<=BXOR)||(LA236_0>=LE && LA236_0<=GE)||(LA236_0>=MINUS && LA236_0<=MOD)||(LA236_0>=EVAL_IS_GROUP_EXPR && LA236_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt236=1;
                    }
                    switch (alt236) {
                        case 1 :
                            // EsperEPL2Ast.g:695:38: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4575);
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
    // EsperEPL2Ast.g:698:1: regExpExpr : ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) );
    public final void regExpExpr() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:699:2: ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) )
            int alt238=2;
            int LA238_0 = input.LA(1);

            if ( (LA238_0==REGEXP) ) {
                alt238=1;
            }
            else if ( (LA238_0==NOT_REGEXP) ) {
                alt238=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 238, 0, input);

                throw nvae;
            }
            switch (alt238) {
                case 1 :
                    // EsperEPL2Ast.g:699:4: ^(r= REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,REGEXP,FOLLOW_REGEXP_in_regExpExpr4594); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4596);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4598);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(r); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:700:4: ^(r= NOT_REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,NOT_REGEXP,FOLLOW_NOT_REGEXP_in_regExpExpr4609); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4611);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4613);
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
    // EsperEPL2Ast.g:703:1: builtinFunc : ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) );
    public final void builtinFunc() throws RecognitionException {
        CommonTree f=null;
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:704:2: ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) )
            int alt264=20;
            switch ( input.LA(1) ) {
            case SUM:
                {
                alt264=1;
                }
                break;
            case AVG:
                {
                alt264=2;
                }
                break;
            case COUNT:
                {
                alt264=3;
                }
                break;
            case MEDIAN:
                {
                alt264=4;
                }
                break;
            case STDDEV:
                {
                alt264=5;
                }
                break;
            case AVEDEV:
                {
                alt264=6;
                }
                break;
            case LAST_AGGREG:
                {
                alt264=7;
                }
                break;
            case FIRST_AGGREG:
                {
                alt264=8;
                }
                break;
            case WINDOW_AGGREG:
                {
                alt264=9;
                }
                break;
            case COALESCE:
                {
                alt264=10;
                }
                break;
            case PREVIOUS:
                {
                alt264=11;
                }
                break;
            case PREVIOUSTAIL:
                {
                alt264=12;
                }
                break;
            case PREVIOUSCOUNT:
                {
                alt264=13;
                }
                break;
            case PREVIOUSWINDOW:
                {
                alt264=14;
                }
                break;
            case PRIOR:
                {
                alt264=15;
                }
                break;
            case INSTANCEOF:
                {
                alt264=16;
                }
                break;
            case TYPEOF:
                {
                alt264=17;
                }
                break;
            case CAST:
                {
                alt264=18;
                }
                break;
            case EXISTS:
                {
                alt264=19;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt264=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 264, 0, input);

                throw nvae;
            }

            switch (alt264) {
                case 1 :
                    // EsperEPL2Ast.g:704:5: ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,SUM,FOLLOW_SUM_in_builtinFunc4632); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:704:13: ( DISTINCT )?
                    int alt239=2;
                    int LA239_0 = input.LA(1);

                    if ( (LA239_0==DISTINCT) ) {
                        alt239=1;
                    }
                    switch (alt239) {
                        case 1 :
                            // EsperEPL2Ast.g:704:14: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4635); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4639);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:704:35: ( aggregationFilterExpr )?
                    int alt240=2;
                    int LA240_0 = input.LA(1);

                    if ( (LA240_0==AGG_FILTER_EXPR) ) {
                        alt240=1;
                    }
                    switch (alt240) {
                        case 1 :
                            // EsperEPL2Ast.g:704:35: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4641);
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
                    // EsperEPL2Ast.g:705:4: ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVG,FOLLOW_AVG_in_builtinFunc4653); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:705:12: ( DISTINCT )?
                    int alt241=2;
                    int LA241_0 = input.LA(1);

                    if ( (LA241_0==DISTINCT) ) {
                        alt241=1;
                    }
                    switch (alt241) {
                        case 1 :
                            // EsperEPL2Ast.g:705:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4656); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4660);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:705:34: ( aggregationFilterExpr )?
                    int alt242=2;
                    int LA242_0 = input.LA(1);

                    if ( (LA242_0==AGG_FILTER_EXPR) ) {
                        alt242=1;
                    }
                    switch (alt242) {
                        case 1 :
                            // EsperEPL2Ast.g:705:34: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4662);
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
                    // EsperEPL2Ast.g:706:4: ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_builtinFunc4674); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:706:14: ( ( DISTINCT )? valueExpr )?
                        int alt244=2;
                        int LA244_0 = input.LA(1);

                        if ( ((LA244_0>=IN_SET && LA244_0<=REGEXP)||LA244_0==NOT_EXPR||(LA244_0>=SUM && LA244_0<=AVG)||(LA244_0>=COALESCE && LA244_0<=COUNT)||(LA244_0>=CASE && LA244_0<=CASE2)||LA244_0==DISTINCT||(LA244_0>=PREVIOUS && LA244_0<=EXISTS)||(LA244_0>=INSTANCEOF && LA244_0<=CURRENT_TIMESTAMP)||LA244_0==NEWKW||(LA244_0>=EVAL_AND_EXPR && LA244_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA244_0==EVENT_PROP_EXPR||LA244_0==CONCAT||(LA244_0>=LIB_FUNC_CHAIN && LA244_0<=DOT_EXPR)||LA244_0==ARRAY_EXPR||(LA244_0>=NOT_IN_SET && LA244_0<=NOT_REGEXP)||(LA244_0>=IN_RANGE && LA244_0<=SUBSELECT_EXPR)||(LA244_0>=EXISTS_SUBSELECT_EXPR && LA244_0<=NOT_IN_SUBSELECT_EXPR)||LA244_0==SUBSTITUTION||(LA244_0>=FIRST_AGGREG && LA244_0<=WINDOW_AGGREG)||(LA244_0>=INT_TYPE && LA244_0<=NULL_TYPE)||(LA244_0>=JSON_OBJECT && LA244_0<=JSON_ARRAY)||LA244_0==STAR||(LA244_0>=LT && LA244_0<=GT)||(LA244_0>=BOR && LA244_0<=PLUS)||(LA244_0>=BAND && LA244_0<=BXOR)||(LA244_0>=LE && LA244_0<=GE)||(LA244_0>=MINUS && LA244_0<=MOD)||(LA244_0>=EVAL_IS_GROUP_EXPR && LA244_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt244=1;
                        }
                        switch (alt244) {
                            case 1 :
                                // EsperEPL2Ast.g:706:15: ( DISTINCT )? valueExpr
                                {
                                // EsperEPL2Ast.g:706:15: ( DISTINCT )?
                                int alt243=2;
                                int LA243_0 = input.LA(1);

                                if ( (LA243_0==DISTINCT) ) {
                                    alt243=1;
                                }
                                switch (alt243) {
                                    case 1 :
                                        // EsperEPL2Ast.g:706:16: DISTINCT
                                        {
                                        match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4678); 

                                        }
                                        break;

                                }

                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4682);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:706:39: ( aggregationFilterExpr )?
                        int alt245=2;
                        int LA245_0 = input.LA(1);

                        if ( (LA245_0==AGG_FILTER_EXPR) ) {
                            alt245=1;
                        }
                        switch (alt245) {
                            case 1 :
                                // EsperEPL2Ast.g:706:39: aggregationFilterExpr
                                {
                                pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4686);
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
                    // EsperEPL2Ast.g:707:4: ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,MEDIAN,FOLLOW_MEDIAN_in_builtinFunc4698); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:707:15: ( DISTINCT )?
                    int alt246=2;
                    int LA246_0 = input.LA(1);

                    if ( (LA246_0==DISTINCT) ) {
                        alt246=1;
                    }
                    switch (alt246) {
                        case 1 :
                            // EsperEPL2Ast.g:707:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4701); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4705);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:707:37: ( aggregationFilterExpr )?
                    int alt247=2;
                    int LA247_0 = input.LA(1);

                    if ( (LA247_0==AGG_FILTER_EXPR) ) {
                        alt247=1;
                    }
                    switch (alt247) {
                        case 1 :
                            // EsperEPL2Ast.g:707:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4707);
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
                    // EsperEPL2Ast.g:708:4: ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,STDDEV,FOLLOW_STDDEV_in_builtinFunc4719); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:708:15: ( DISTINCT )?
                    int alt248=2;
                    int LA248_0 = input.LA(1);

                    if ( (LA248_0==DISTINCT) ) {
                        alt248=1;
                    }
                    switch (alt248) {
                        case 1 :
                            // EsperEPL2Ast.g:708:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4722); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4726);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:708:37: ( aggregationFilterExpr )?
                    int alt249=2;
                    int LA249_0 = input.LA(1);

                    if ( (LA249_0==AGG_FILTER_EXPR) ) {
                        alt249=1;
                    }
                    switch (alt249) {
                        case 1 :
                            // EsperEPL2Ast.g:708:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4728);
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
                    // EsperEPL2Ast.g:709:4: ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVEDEV,FOLLOW_AVEDEV_in_builtinFunc4740); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:709:15: ( DISTINCT )?
                    int alt250=2;
                    int LA250_0 = input.LA(1);

                    if ( (LA250_0==DISTINCT) ) {
                        alt250=1;
                    }
                    switch (alt250) {
                        case 1 :
                            // EsperEPL2Ast.g:709:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4743); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4747);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:709:37: ( aggregationFilterExpr )?
                    int alt251=2;
                    int LA251_0 = input.LA(1);

                    if ( (LA251_0==AGG_FILTER_EXPR) ) {
                        alt251=1;
                    }
                    switch (alt251) {
                        case 1 :
                            // EsperEPL2Ast.g:709:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4749);
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
                    // EsperEPL2Ast.g:710:4: ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,LAST_AGGREG,FOLLOW_LAST_AGGREG_in_builtinFunc4761); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:710:20: ( DISTINCT )?
                        int alt252=2;
                        int LA252_0 = input.LA(1);

                        if ( (LA252_0==DISTINCT) ) {
                            alt252=1;
                        }
                        switch (alt252) {
                            case 1 :
                                // EsperEPL2Ast.g:710:21: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4764); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:710:32: ( accessValueExpr )?
                        int alt253=2;
                        int LA253_0 = input.LA(1);

                        if ( (LA253_0==ACCESS_AGG) ) {
                            alt253=1;
                        }
                        switch (alt253) {
                            case 1 :
                                // EsperEPL2Ast.g:710:32: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4768);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:710:49: ( valueExpr )?
                        int alt254=2;
                        int LA254_0 = input.LA(1);

                        if ( ((LA254_0>=IN_SET && LA254_0<=REGEXP)||LA254_0==NOT_EXPR||(LA254_0>=SUM && LA254_0<=AVG)||(LA254_0>=COALESCE && LA254_0<=COUNT)||(LA254_0>=CASE && LA254_0<=CASE2)||(LA254_0>=PREVIOUS && LA254_0<=EXISTS)||(LA254_0>=INSTANCEOF && LA254_0<=CURRENT_TIMESTAMP)||LA254_0==NEWKW||(LA254_0>=EVAL_AND_EXPR && LA254_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA254_0==EVENT_PROP_EXPR||LA254_0==CONCAT||(LA254_0>=LIB_FUNC_CHAIN && LA254_0<=DOT_EXPR)||LA254_0==ARRAY_EXPR||(LA254_0>=NOT_IN_SET && LA254_0<=NOT_REGEXP)||(LA254_0>=IN_RANGE && LA254_0<=SUBSELECT_EXPR)||(LA254_0>=EXISTS_SUBSELECT_EXPR && LA254_0<=NOT_IN_SUBSELECT_EXPR)||LA254_0==SUBSTITUTION||(LA254_0>=FIRST_AGGREG && LA254_0<=WINDOW_AGGREG)||(LA254_0>=INT_TYPE && LA254_0<=NULL_TYPE)||(LA254_0>=JSON_OBJECT && LA254_0<=JSON_ARRAY)||LA254_0==STAR||(LA254_0>=LT && LA254_0<=GT)||(LA254_0>=BOR && LA254_0<=PLUS)||(LA254_0>=BAND && LA254_0<=BXOR)||(LA254_0>=LE && LA254_0<=GE)||(LA254_0>=MINUS && LA254_0<=MOD)||(LA254_0>=EVAL_IS_GROUP_EXPR && LA254_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt254=1;
                        }
                        switch (alt254) {
                            case 1 :
                                // EsperEPL2Ast.g:710:49: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4771);
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
                    // EsperEPL2Ast.g:711:4: ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,FIRST_AGGREG,FOLLOW_FIRST_AGGREG_in_builtinFunc4783); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:711:21: ( DISTINCT )?
                        int alt255=2;
                        int LA255_0 = input.LA(1);

                        if ( (LA255_0==DISTINCT) ) {
                            alt255=1;
                        }
                        switch (alt255) {
                            case 1 :
                                // EsperEPL2Ast.g:711:22: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4786); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:711:33: ( accessValueExpr )?
                        int alt256=2;
                        int LA256_0 = input.LA(1);

                        if ( (LA256_0==ACCESS_AGG) ) {
                            alt256=1;
                        }
                        switch (alt256) {
                            case 1 :
                                // EsperEPL2Ast.g:711:33: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4790);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:711:50: ( valueExpr )?
                        int alt257=2;
                        int LA257_0 = input.LA(1);

                        if ( ((LA257_0>=IN_SET && LA257_0<=REGEXP)||LA257_0==NOT_EXPR||(LA257_0>=SUM && LA257_0<=AVG)||(LA257_0>=COALESCE && LA257_0<=COUNT)||(LA257_0>=CASE && LA257_0<=CASE2)||(LA257_0>=PREVIOUS && LA257_0<=EXISTS)||(LA257_0>=INSTANCEOF && LA257_0<=CURRENT_TIMESTAMP)||LA257_0==NEWKW||(LA257_0>=EVAL_AND_EXPR && LA257_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA257_0==EVENT_PROP_EXPR||LA257_0==CONCAT||(LA257_0>=LIB_FUNC_CHAIN && LA257_0<=DOT_EXPR)||LA257_0==ARRAY_EXPR||(LA257_0>=NOT_IN_SET && LA257_0<=NOT_REGEXP)||(LA257_0>=IN_RANGE && LA257_0<=SUBSELECT_EXPR)||(LA257_0>=EXISTS_SUBSELECT_EXPR && LA257_0<=NOT_IN_SUBSELECT_EXPR)||LA257_0==SUBSTITUTION||(LA257_0>=FIRST_AGGREG && LA257_0<=WINDOW_AGGREG)||(LA257_0>=INT_TYPE && LA257_0<=NULL_TYPE)||(LA257_0>=JSON_OBJECT && LA257_0<=JSON_ARRAY)||LA257_0==STAR||(LA257_0>=LT && LA257_0<=GT)||(LA257_0>=BOR && LA257_0<=PLUS)||(LA257_0>=BAND && LA257_0<=BXOR)||(LA257_0>=LE && LA257_0<=GE)||(LA257_0>=MINUS && LA257_0<=MOD)||(LA257_0>=EVAL_IS_GROUP_EXPR && LA257_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt257=1;
                        }
                        switch (alt257) {
                            case 1 :
                                // EsperEPL2Ast.g:711:50: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4793);
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
                    // EsperEPL2Ast.g:712:4: ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? )
                    {
                    f=(CommonTree)match(input,WINDOW_AGGREG,FOLLOW_WINDOW_AGGREG_in_builtinFunc4805); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:712:22: ( DISTINCT )?
                        int alt258=2;
                        int LA258_0 = input.LA(1);

                        if ( (LA258_0==DISTINCT) ) {
                            alt258=1;
                        }
                        switch (alt258) {
                            case 1 :
                                // EsperEPL2Ast.g:712:23: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4808); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:712:34: ( accessValueExpr )?
                        int alt259=2;
                        int LA259_0 = input.LA(1);

                        if ( (LA259_0==ACCESS_AGG) ) {
                            alt259=1;
                        }
                        switch (alt259) {
                            case 1 :
                                // EsperEPL2Ast.g:712:34: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4812);
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
                    // EsperEPL2Ast.g:713:5: ^(f= COALESCE valueExpr valueExpr ( valueExpr )* )
                    {
                    f=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtinFunc4825); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4827);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4829);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:713:38: ( valueExpr )*
                    loop260:
                    do {
                        int alt260=2;
                        int LA260_0 = input.LA(1);

                        if ( ((LA260_0>=IN_SET && LA260_0<=REGEXP)||LA260_0==NOT_EXPR||(LA260_0>=SUM && LA260_0<=AVG)||(LA260_0>=COALESCE && LA260_0<=COUNT)||(LA260_0>=CASE && LA260_0<=CASE2)||(LA260_0>=PREVIOUS && LA260_0<=EXISTS)||(LA260_0>=INSTANCEOF && LA260_0<=CURRENT_TIMESTAMP)||LA260_0==NEWKW||(LA260_0>=EVAL_AND_EXPR && LA260_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA260_0==EVENT_PROP_EXPR||LA260_0==CONCAT||(LA260_0>=LIB_FUNC_CHAIN && LA260_0<=DOT_EXPR)||LA260_0==ARRAY_EXPR||(LA260_0>=NOT_IN_SET && LA260_0<=NOT_REGEXP)||(LA260_0>=IN_RANGE && LA260_0<=SUBSELECT_EXPR)||(LA260_0>=EXISTS_SUBSELECT_EXPR && LA260_0<=NOT_IN_SUBSELECT_EXPR)||LA260_0==SUBSTITUTION||(LA260_0>=FIRST_AGGREG && LA260_0<=WINDOW_AGGREG)||(LA260_0>=INT_TYPE && LA260_0<=NULL_TYPE)||(LA260_0>=JSON_OBJECT && LA260_0<=JSON_ARRAY)||LA260_0==STAR||(LA260_0>=LT && LA260_0<=GT)||(LA260_0>=BOR && LA260_0<=PLUS)||(LA260_0>=BAND && LA260_0<=BXOR)||(LA260_0>=LE && LA260_0<=GE)||(LA260_0>=MINUS && LA260_0<=MOD)||(LA260_0>=EVAL_IS_GROUP_EXPR && LA260_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt260=1;
                        }


                        switch (alt260) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:713:39: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_builtinFunc4832);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop260;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:714:5: ^(f= PREVIOUS valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_builtinFunc4847); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4849);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:714:28: ( valueExpr )?
                    int alt261=2;
                    int LA261_0 = input.LA(1);

                    if ( ((LA261_0>=IN_SET && LA261_0<=REGEXP)||LA261_0==NOT_EXPR||(LA261_0>=SUM && LA261_0<=AVG)||(LA261_0>=COALESCE && LA261_0<=COUNT)||(LA261_0>=CASE && LA261_0<=CASE2)||(LA261_0>=PREVIOUS && LA261_0<=EXISTS)||(LA261_0>=INSTANCEOF && LA261_0<=CURRENT_TIMESTAMP)||LA261_0==NEWKW||(LA261_0>=EVAL_AND_EXPR && LA261_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA261_0==EVENT_PROP_EXPR||LA261_0==CONCAT||(LA261_0>=LIB_FUNC_CHAIN && LA261_0<=DOT_EXPR)||LA261_0==ARRAY_EXPR||(LA261_0>=NOT_IN_SET && LA261_0<=NOT_REGEXP)||(LA261_0>=IN_RANGE && LA261_0<=SUBSELECT_EXPR)||(LA261_0>=EXISTS_SUBSELECT_EXPR && LA261_0<=NOT_IN_SUBSELECT_EXPR)||LA261_0==SUBSTITUTION||(LA261_0>=FIRST_AGGREG && LA261_0<=WINDOW_AGGREG)||(LA261_0>=INT_TYPE && LA261_0<=NULL_TYPE)||(LA261_0>=JSON_OBJECT && LA261_0<=JSON_ARRAY)||LA261_0==STAR||(LA261_0>=LT && LA261_0<=GT)||(LA261_0>=BOR && LA261_0<=PLUS)||(LA261_0>=BAND && LA261_0<=BXOR)||(LA261_0>=LE && LA261_0<=GE)||(LA261_0>=MINUS && LA261_0<=MOD)||(LA261_0>=EVAL_IS_GROUP_EXPR && LA261_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt261=1;
                    }
                    switch (alt261) {
                        case 1 :
                            // EsperEPL2Ast.g:714:28: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4851);
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
                    // EsperEPL2Ast.g:715:5: ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUSTAIL,FOLLOW_PREVIOUSTAIL_in_builtinFunc4864); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4866);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:715:32: ( valueExpr )?
                    int alt262=2;
                    int LA262_0 = input.LA(1);

                    if ( ((LA262_0>=IN_SET && LA262_0<=REGEXP)||LA262_0==NOT_EXPR||(LA262_0>=SUM && LA262_0<=AVG)||(LA262_0>=COALESCE && LA262_0<=COUNT)||(LA262_0>=CASE && LA262_0<=CASE2)||(LA262_0>=PREVIOUS && LA262_0<=EXISTS)||(LA262_0>=INSTANCEOF && LA262_0<=CURRENT_TIMESTAMP)||LA262_0==NEWKW||(LA262_0>=EVAL_AND_EXPR && LA262_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA262_0==EVENT_PROP_EXPR||LA262_0==CONCAT||(LA262_0>=LIB_FUNC_CHAIN && LA262_0<=DOT_EXPR)||LA262_0==ARRAY_EXPR||(LA262_0>=NOT_IN_SET && LA262_0<=NOT_REGEXP)||(LA262_0>=IN_RANGE && LA262_0<=SUBSELECT_EXPR)||(LA262_0>=EXISTS_SUBSELECT_EXPR && LA262_0<=NOT_IN_SUBSELECT_EXPR)||LA262_0==SUBSTITUTION||(LA262_0>=FIRST_AGGREG && LA262_0<=WINDOW_AGGREG)||(LA262_0>=INT_TYPE && LA262_0<=NULL_TYPE)||(LA262_0>=JSON_OBJECT && LA262_0<=JSON_ARRAY)||LA262_0==STAR||(LA262_0>=LT && LA262_0<=GT)||(LA262_0>=BOR && LA262_0<=PLUS)||(LA262_0>=BAND && LA262_0<=BXOR)||(LA262_0>=LE && LA262_0<=GE)||(LA262_0>=MINUS && LA262_0<=MOD)||(LA262_0>=EVAL_IS_GROUP_EXPR && LA262_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt262=1;
                    }
                    switch (alt262) {
                        case 1 :
                            // EsperEPL2Ast.g:715:32: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4868);
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
                    // EsperEPL2Ast.g:716:5: ^(f= PREVIOUSCOUNT valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSCOUNT,FOLLOW_PREVIOUSCOUNT_in_builtinFunc4881); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4883);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:717:5: ^(f= PREVIOUSWINDOW valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSWINDOW,FOLLOW_PREVIOUSWINDOW_in_builtinFunc4895); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4897);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:718:5: ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,PRIOR,FOLLOW_PRIOR_in_builtinFunc4909); 

                    match(input, Token.DOWN, null); 
                    c=(CommonTree)match(input,NUM_INT,FOLLOW_NUM_INT_in_builtinFunc4913); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4915);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    leaveNode(c); leaveNode(f);

                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:719:5: ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* )
                    {
                    f=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_builtinFunc4928); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4930);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4932); 
                    // EsperEPL2Ast.g:719:42: ( CLASS_IDENT )*
                    loop263:
                    do {
                        int alt263=2;
                        int LA263_0 = input.LA(1);

                        if ( (LA263_0==CLASS_IDENT) ) {
                            alt263=1;
                        }


                        switch (alt263) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:719:43: CLASS_IDENT
                    	    {
                    	    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4935); 

                    	    }
                    	    break;

                    	default :
                    	    break loop263;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:720:5: ^(f= TYPEOF valueExpr )
                    {
                    f=(CommonTree)match(input,TYPEOF,FOLLOW_TYPEOF_in_builtinFunc4949); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4951);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:721:5: ^(f= CAST valueExpr CLASS_IDENT )
                    {
                    f=(CommonTree)match(input,CAST,FOLLOW_CAST_in_builtinFunc4963); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4965);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc4967); 

                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 19 :
                    // EsperEPL2Ast.g:722:5: ^(f= EXISTS eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_builtinFunc4979); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc4981);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 20 :
                    // EsperEPL2Ast.g:723:4: ^(f= CURRENT_TIMESTAMP )
                    {
                    f=(CommonTree)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4993); 



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
    // EsperEPL2Ast.g:726:1: aggregationFilterExpr : ^( AGG_FILTER_EXPR valueExpr ) ;
    public final void aggregationFilterExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:727:2: ( ^( AGG_FILTER_EXPR valueExpr ) )
            // EsperEPL2Ast.g:727:4: ^( AGG_FILTER_EXPR valueExpr )
            {
            match(input,AGG_FILTER_EXPR,FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr5010); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_aggregationFilterExpr5012);
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
    // EsperEPL2Ast.g:730:1: accessValueExpr : ^( ACCESS_AGG accessValueExprChoice ) ;
    public final void accessValueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:731:2: ( ^( ACCESS_AGG accessValueExprChoice ) )
            // EsperEPL2Ast.g:731:5: ^( ACCESS_AGG accessValueExprChoice )
            {
            match(input,ACCESS_AGG,FOLLOW_ACCESS_AGG_in_accessValueExpr5026); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accessValueExprChoice_in_accessValueExpr5028);
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
    // EsperEPL2Ast.g:734:1: accessValueExprChoice : ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr );
    public final void accessValueExprChoice() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:735:2: ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr )
            int alt266=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt266=1;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt266=2;
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
            case JSON_OBJECT:
            case JSON_ARRAY:
            case STAR:
            case LT:
            case GT:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case LE:
            case GE:
            case MINUS:
            case DIV:
            case MOD:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt266=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 266, 0, input);

                throw nvae;
            }

            switch (alt266) {
                case 1 :
                    // EsperEPL2Ast.g:735:4: PROPERTY_WILDCARD_SELECT
                    {
                    match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice5043); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:735:31: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice5050); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice5052); 
                    // EsperEPL2Ast.g:735:67: ( IDENT )?
                    int alt265=2;
                    int LA265_0 = input.LA(1);

                    if ( (LA265_0==IDENT) ) {
                        alt265=1;
                    }
                    switch (alt265) {
                        case 1 :
                            // EsperEPL2Ast.g:735:67: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice5054); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:735:77: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_accessValueExprChoice5060);
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
    // EsperEPL2Ast.g:738:1: arrayExpr : ^(a= ARRAY_EXPR ( valueExpr )* ) ;
    public final void arrayExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:739:2: ( ^(a= ARRAY_EXPR ( valueExpr )* ) )
            // EsperEPL2Ast.g:739:4: ^(a= ARRAY_EXPR ( valueExpr )* )
            {
            a=(CommonTree)match(input,ARRAY_EXPR,FOLLOW_ARRAY_EXPR_in_arrayExpr5076); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:739:19: ( valueExpr )*
                loop267:
                do {
                    int alt267=2;
                    int LA267_0 = input.LA(1);

                    if ( ((LA267_0>=IN_SET && LA267_0<=REGEXP)||LA267_0==NOT_EXPR||(LA267_0>=SUM && LA267_0<=AVG)||(LA267_0>=COALESCE && LA267_0<=COUNT)||(LA267_0>=CASE && LA267_0<=CASE2)||(LA267_0>=PREVIOUS && LA267_0<=EXISTS)||(LA267_0>=INSTANCEOF && LA267_0<=CURRENT_TIMESTAMP)||LA267_0==NEWKW||(LA267_0>=EVAL_AND_EXPR && LA267_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA267_0==EVENT_PROP_EXPR||LA267_0==CONCAT||(LA267_0>=LIB_FUNC_CHAIN && LA267_0<=DOT_EXPR)||LA267_0==ARRAY_EXPR||(LA267_0>=NOT_IN_SET && LA267_0<=NOT_REGEXP)||(LA267_0>=IN_RANGE && LA267_0<=SUBSELECT_EXPR)||(LA267_0>=EXISTS_SUBSELECT_EXPR && LA267_0<=NOT_IN_SUBSELECT_EXPR)||LA267_0==SUBSTITUTION||(LA267_0>=FIRST_AGGREG && LA267_0<=WINDOW_AGGREG)||(LA267_0>=INT_TYPE && LA267_0<=NULL_TYPE)||(LA267_0>=JSON_OBJECT && LA267_0<=JSON_ARRAY)||LA267_0==STAR||(LA267_0>=LT && LA267_0<=GT)||(LA267_0>=BOR && LA267_0<=PLUS)||(LA267_0>=BAND && LA267_0<=BXOR)||(LA267_0>=LE && LA267_0<=GE)||(LA267_0>=MINUS && LA267_0<=MOD)||(LA267_0>=EVAL_IS_GROUP_EXPR && LA267_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt267=1;
                    }


                    switch (alt267) {
                	case 1 :
                	    // EsperEPL2Ast.g:739:20: valueExpr
                	    {
                	    pushFollow(FOLLOW_valueExpr_in_arrayExpr5079);
                	    valueExpr();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop267;
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
    // EsperEPL2Ast.g:742:1: arithmeticExpr : ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) );
    public final void arithmeticExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:743:2: ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) )
            int alt269=9;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt269=1;
                }
                break;
            case MINUS:
                {
                alt269=2;
                }
                break;
            case DIV:
                {
                alt269=3;
                }
                break;
            case STAR:
                {
                alt269=4;
                }
                break;
            case MOD:
                {
                alt269=5;
                }
                break;
            case BAND:
                {
                alt269=6;
                }
                break;
            case BOR:
                {
                alt269=7;
                }
                break;
            case BXOR:
                {
                alt269=8;
                }
                break;
            case CONCAT:
                {
                alt269=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 269, 0, input);

                throw nvae;
            }

            switch (alt269) {
                case 1 :
                    // EsperEPL2Ast.g:743:5: ^(a= PLUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_arithmeticExpr5100); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5102);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5104);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:744:5: ^(a= MINUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_arithmeticExpr5116); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5118);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5120);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:745:5: ^(a= DIV valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,DIV,FOLLOW_DIV_in_arithmeticExpr5132); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5134);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5136);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:746:4: ^(a= STAR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,STAR,FOLLOW_STAR_in_arithmeticExpr5147); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5149);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5151);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:747:5: ^(a= MOD valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MOD,FOLLOW_MOD_in_arithmeticExpr5163); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5165);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5167);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:748:4: ^(a= BAND valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BAND,FOLLOW_BAND_in_arithmeticExpr5178); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5180);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5182);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:749:4: ^(a= BOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BOR,FOLLOW_BOR_in_arithmeticExpr5193); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5195);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5197);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:750:4: ^(a= BXOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BXOR,FOLLOW_BXOR_in_arithmeticExpr5208); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5210);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5212);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:751:5: ^(a= CONCAT valueExpr valueExpr ( valueExpr )* )
                    {
                    a=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_arithmeticExpr5224); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5226);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5228);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:751:36: ( valueExpr )*
                    loop268:
                    do {
                        int alt268=2;
                        int LA268_0 = input.LA(1);

                        if ( ((LA268_0>=IN_SET && LA268_0<=REGEXP)||LA268_0==NOT_EXPR||(LA268_0>=SUM && LA268_0<=AVG)||(LA268_0>=COALESCE && LA268_0<=COUNT)||(LA268_0>=CASE && LA268_0<=CASE2)||(LA268_0>=PREVIOUS && LA268_0<=EXISTS)||(LA268_0>=INSTANCEOF && LA268_0<=CURRENT_TIMESTAMP)||LA268_0==NEWKW||(LA268_0>=EVAL_AND_EXPR && LA268_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA268_0==EVENT_PROP_EXPR||LA268_0==CONCAT||(LA268_0>=LIB_FUNC_CHAIN && LA268_0<=DOT_EXPR)||LA268_0==ARRAY_EXPR||(LA268_0>=NOT_IN_SET && LA268_0<=NOT_REGEXP)||(LA268_0>=IN_RANGE && LA268_0<=SUBSELECT_EXPR)||(LA268_0>=EXISTS_SUBSELECT_EXPR && LA268_0<=NOT_IN_SUBSELECT_EXPR)||LA268_0==SUBSTITUTION||(LA268_0>=FIRST_AGGREG && LA268_0<=WINDOW_AGGREG)||(LA268_0>=INT_TYPE && LA268_0<=NULL_TYPE)||(LA268_0>=JSON_OBJECT && LA268_0<=JSON_ARRAY)||LA268_0==STAR||(LA268_0>=LT && LA268_0<=GT)||(LA268_0>=BOR && LA268_0<=PLUS)||(LA268_0>=BAND && LA268_0<=BXOR)||(LA268_0>=LE && LA268_0<=GE)||(LA268_0>=MINUS && LA268_0<=MOD)||(LA268_0>=EVAL_IS_GROUP_EXPR && LA268_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt268=1;
                        }


                        switch (alt268) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:751:37: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5231);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop268;
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
    // EsperEPL2Ast.g:754:1: dotExpr : ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) ;
    public final void dotExpr() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:755:2: ( ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) )
            // EsperEPL2Ast.g:755:4: ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* )
            {
            d=(CommonTree)match(input,DOT_EXPR,FOLLOW_DOT_EXPR_in_dotExpr5251); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dotExpr5253);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:755:27: ( libFunctionWithClass )*
            loop270:
            do {
                int alt270=2;
                int LA270_0 = input.LA(1);

                if ( (LA270_0==LIB_FUNCTION) ) {
                    alt270=1;
                }


                switch (alt270) {
            	case 1 :
            	    // EsperEPL2Ast.g:755:27: libFunctionWithClass
            	    {
            	    pushFollow(FOLLOW_libFunctionWithClass_in_dotExpr5255);
            	    libFunctionWithClass();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop270;
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
    // EsperEPL2Ast.g:758:1: newExpr : ^(n= NEWKW ( newAssign )* ) ;
    public final void newExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:758:9: ( ^(n= NEWKW ( newAssign )* ) )
            // EsperEPL2Ast.g:758:11: ^(n= NEWKW ( newAssign )* )
            {
            n=(CommonTree)match(input,NEWKW,FOLLOW_NEWKW_in_newExpr5273); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:758:21: ( newAssign )*
                loop271:
                do {
                    int alt271=2;
                    int LA271_0 = input.LA(1);

                    if ( (LA271_0==NEW_ITEM) ) {
                        alt271=1;
                    }


                    switch (alt271) {
                	case 1 :
                	    // EsperEPL2Ast.g:758:21: newAssign
                	    {
                	    pushFollow(FOLLOW_newAssign_in_newExpr5275);
                	    newAssign();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop271;
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
    // EsperEPL2Ast.g:761:1: newAssign : ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) ;
    public final void newAssign() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:762:2: ( ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) )
            // EsperEPL2Ast.g:762:4: ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? )
            {
            match(input,NEW_ITEM,FOLLOW_NEW_ITEM_in_newAssign5291); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_newAssign5293);
            eventPropertyExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:762:40: ( valueExpr )?
            int alt272=2;
            int LA272_0 = input.LA(1);

            if ( ((LA272_0>=IN_SET && LA272_0<=REGEXP)||LA272_0==NOT_EXPR||(LA272_0>=SUM && LA272_0<=AVG)||(LA272_0>=COALESCE && LA272_0<=COUNT)||(LA272_0>=CASE && LA272_0<=CASE2)||(LA272_0>=PREVIOUS && LA272_0<=EXISTS)||(LA272_0>=INSTANCEOF && LA272_0<=CURRENT_TIMESTAMP)||LA272_0==NEWKW||(LA272_0>=EVAL_AND_EXPR && LA272_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA272_0==EVENT_PROP_EXPR||LA272_0==CONCAT||(LA272_0>=LIB_FUNC_CHAIN && LA272_0<=DOT_EXPR)||LA272_0==ARRAY_EXPR||(LA272_0>=NOT_IN_SET && LA272_0<=NOT_REGEXP)||(LA272_0>=IN_RANGE && LA272_0<=SUBSELECT_EXPR)||(LA272_0>=EXISTS_SUBSELECT_EXPR && LA272_0<=NOT_IN_SUBSELECT_EXPR)||LA272_0==SUBSTITUTION||(LA272_0>=FIRST_AGGREG && LA272_0<=WINDOW_AGGREG)||(LA272_0>=INT_TYPE && LA272_0<=NULL_TYPE)||(LA272_0>=JSON_OBJECT && LA272_0<=JSON_ARRAY)||LA272_0==STAR||(LA272_0>=LT && LA272_0<=GT)||(LA272_0>=BOR && LA272_0<=PLUS)||(LA272_0>=BAND && LA272_0<=BXOR)||(LA272_0>=LE && LA272_0<=GE)||(LA272_0>=MINUS && LA272_0<=MOD)||(LA272_0>=EVAL_IS_GROUP_EXPR && LA272_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt272=1;
            }
            switch (alt272) {
                case 1 :
                    // EsperEPL2Ast.g:762:40: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_newAssign5296);
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
    // EsperEPL2Ast.g:765:1: libFuncChain : ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) ;
    public final void libFuncChain() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:766:2: ( ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) )
            // EsperEPL2Ast.g:766:6: ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* )
            {
            l=(CommonTree)match(input,LIB_FUNC_CHAIN,FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain5314); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_libFuncChain5316);
            libFunctionWithClass();

            state._fsp--;

            // EsperEPL2Ast.g:766:46: ( libOrPropFunction )*
            loop273:
            do {
                int alt273=2;
                int LA273_0 = input.LA(1);

                if ( (LA273_0==EVENT_PROP_EXPR||LA273_0==LIB_FUNCTION) ) {
                    alt273=1;
                }


                switch (alt273) {
            	case 1 :
            	    // EsperEPL2Ast.g:766:46: libOrPropFunction
            	    {
            	    pushFollow(FOLLOW_libOrPropFunction_in_libFuncChain5318);
            	    libOrPropFunction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop273;
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
    // EsperEPL2Ast.g:769:1: libFunctionWithClass : ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) ;
    public final void libFunctionWithClass() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:770:2: ( ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) )
            // EsperEPL2Ast.g:770:6: ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? )
            {
            l=(CommonTree)match(input,LIB_FUNCTION,FOLLOW_LIB_FUNCTION_in_libFunctionWithClass5338); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:770:23: ( CLASS_IDENT )?
            int alt274=2;
            int LA274_0 = input.LA(1);

            if ( (LA274_0==CLASS_IDENT) ) {
                alt274=1;
            }
            switch (alt274) {
                case 1 :
                    // EsperEPL2Ast.g:770:24: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_libFunctionWithClass5341); 

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_libFunctionWithClass5345); 
            // EsperEPL2Ast.g:770:44: ( DISTINCT )?
            int alt275=2;
            int LA275_0 = input.LA(1);

            if ( (LA275_0==DISTINCT) ) {
                alt275=1;
            }
            switch (alt275) {
                case 1 :
                    // EsperEPL2Ast.g:770:45: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_libFunctionWithClass5348); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:770:56: ( libFunctionArgItem )*
            loop276:
            do {
                int alt276=2;
                int LA276_0 = input.LA(1);

                if ( ((LA276_0>=IN_SET && LA276_0<=REGEXP)||LA276_0==NOT_EXPR||(LA276_0>=SUM && LA276_0<=AVG)||(LA276_0>=COALESCE && LA276_0<=COUNT)||(LA276_0>=CASE && LA276_0<=CASE2)||LA276_0==LAST||(LA276_0>=PREVIOUS && LA276_0<=EXISTS)||(LA276_0>=LW && LA276_0<=CURRENT_TIMESTAMP)||LA276_0==NEWKW||(LA276_0>=NUMERIC_PARAM_RANGE && LA276_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA276_0>=EVAL_AND_EXPR && LA276_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA276_0==EVENT_PROP_EXPR||LA276_0==CONCAT||(LA276_0>=LIB_FUNC_CHAIN && LA276_0<=DOT_EXPR)||(LA276_0>=TIME_PERIOD && LA276_0<=ARRAY_EXPR)||(LA276_0>=NOT_IN_SET && LA276_0<=NOT_REGEXP)||(LA276_0>=IN_RANGE && LA276_0<=SUBSELECT_EXPR)||(LA276_0>=EXISTS_SUBSELECT_EXPR && LA276_0<=NOT_IN_SUBSELECT_EXPR)||(LA276_0>=LAST_OPERATOR && LA276_0<=SUBSTITUTION)||LA276_0==NUMBERSETSTAR||(LA276_0>=FIRST_AGGREG && LA276_0<=WINDOW_AGGREG)||(LA276_0>=INT_TYPE && LA276_0<=NULL_TYPE)||(LA276_0>=JSON_OBJECT && LA276_0<=JSON_ARRAY)||LA276_0==GOES||LA276_0==STAR||(LA276_0>=LT && LA276_0<=GT)||(LA276_0>=BOR && LA276_0<=PLUS)||(LA276_0>=BAND && LA276_0<=BXOR)||(LA276_0>=LE && LA276_0<=GE)||(LA276_0>=MINUS && LA276_0<=MOD)||(LA276_0>=EVAL_IS_GROUP_EXPR && LA276_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt276=1;
                }


                switch (alt276) {
            	case 1 :
            	    // EsperEPL2Ast.g:770:56: libFunctionArgItem
            	    {
            	    pushFollow(FOLLOW_libFunctionArgItem_in_libFunctionWithClass5352);
            	    libFunctionArgItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop276;
                }
            } while (true);

            // EsperEPL2Ast.g:770:76: ( LPAREN )?
            int alt277=2;
            int LA277_0 = input.LA(1);

            if ( (LA277_0==LPAREN) ) {
                alt277=1;
            }
            switch (alt277) {
                case 1 :
                    // EsperEPL2Ast.g:770:76: LPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_libFunctionWithClass5355); 

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
    // EsperEPL2Ast.g:773:1: libFunctionArgItem : ( expressionLambdaDecl | valueExprWithTime );
    public final void libFunctionArgItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:774:2: ( expressionLambdaDecl | valueExprWithTime )
            int alt278=2;
            int LA278_0 = input.LA(1);

            if ( (LA278_0==GOES) ) {
                alt278=1;
            }
            else if ( ((LA278_0>=IN_SET && LA278_0<=REGEXP)||LA278_0==NOT_EXPR||(LA278_0>=SUM && LA278_0<=AVG)||(LA278_0>=COALESCE && LA278_0<=COUNT)||(LA278_0>=CASE && LA278_0<=CASE2)||LA278_0==LAST||(LA278_0>=PREVIOUS && LA278_0<=EXISTS)||(LA278_0>=LW && LA278_0<=CURRENT_TIMESTAMP)||LA278_0==NEWKW||(LA278_0>=NUMERIC_PARAM_RANGE && LA278_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA278_0>=EVAL_AND_EXPR && LA278_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA278_0==EVENT_PROP_EXPR||LA278_0==CONCAT||(LA278_0>=LIB_FUNC_CHAIN && LA278_0<=DOT_EXPR)||(LA278_0>=TIME_PERIOD && LA278_0<=ARRAY_EXPR)||(LA278_0>=NOT_IN_SET && LA278_0<=NOT_REGEXP)||(LA278_0>=IN_RANGE && LA278_0<=SUBSELECT_EXPR)||(LA278_0>=EXISTS_SUBSELECT_EXPR && LA278_0<=NOT_IN_SUBSELECT_EXPR)||(LA278_0>=LAST_OPERATOR && LA278_0<=SUBSTITUTION)||LA278_0==NUMBERSETSTAR||(LA278_0>=FIRST_AGGREG && LA278_0<=WINDOW_AGGREG)||(LA278_0>=INT_TYPE && LA278_0<=NULL_TYPE)||(LA278_0>=JSON_OBJECT && LA278_0<=JSON_ARRAY)||LA278_0==STAR||(LA278_0>=LT && LA278_0<=GT)||(LA278_0>=BOR && LA278_0<=PLUS)||(LA278_0>=BAND && LA278_0<=BXOR)||(LA278_0>=LE && LA278_0<=GE)||(LA278_0>=MINUS && LA278_0<=MOD)||(LA278_0>=EVAL_IS_GROUP_EXPR && LA278_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt278=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 278, 0, input);

                throw nvae;
            }
            switch (alt278) {
                case 1 :
                    // EsperEPL2Ast.g:774:4: expressionLambdaDecl
                    {
                    pushFollow(FOLLOW_expressionLambdaDecl_in_libFunctionArgItem5369);
                    expressionLambdaDecl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:774:27: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_libFunctionArgItem5373);
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
    // EsperEPL2Ast.g:777:1: libOrPropFunction : ( eventPropertyExpr[false] | libFunctionWithClass );
    public final void libOrPropFunction() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:778:2: ( eventPropertyExpr[false] | libFunctionWithClass )
            int alt279=2;
            int LA279_0 = input.LA(1);

            if ( (LA279_0==EVENT_PROP_EXPR) ) {
                alt279=1;
            }
            else if ( (LA279_0==LIB_FUNCTION) ) {
                alt279=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 279, 0, input);

                throw nvae;
            }
            switch (alt279) {
                case 1 :
                    // EsperEPL2Ast.g:778:7: eventPropertyExpr[false]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_libOrPropFunction5388);
                    eventPropertyExpr(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:779:7: libFunctionWithClass
                    {
                    pushFollow(FOLLOW_libFunctionWithClass_in_libOrPropFunction5398);
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
    // EsperEPL2Ast.g:785:1: startPatternExpressionRule : ( annotation[true] )* exprChoice ;
    public final void startPatternExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:786:2: ( ( annotation[true] )* exprChoice )
            // EsperEPL2Ast.g:786:4: ( annotation[true] )* exprChoice
            {
            // EsperEPL2Ast.g:786:4: ( annotation[true] )*
            loop280:
            do {
                int alt280=2;
                int LA280_0 = input.LA(1);

                if ( (LA280_0==ANNOTATION) ) {
                    alt280=1;
                }


                switch (alt280) {
            	case 1 :
            	    // EsperEPL2Ast.g:786:4: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startPatternExpressionRule5413);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop280;
                }
            } while (true);

            pushFollow(FOLLOW_exprChoice_in_startPatternExpressionRule5417);
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
    // EsperEPL2Ast.g:789:1: exprChoice : ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) );
    public final void exprChoice() throws RecognitionException {
        CommonTree a=null;
        CommonTree n=null;
        CommonTree g=null;
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:790:2: ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) )
            int alt285=7;
            switch ( input.LA(1) ) {
            case PATTERN_FILTER_EXPR:
            case OBSERVER_EXPR:
                {
                alt285=1;
                }
                break;
            case OR_EXPR:
            case AND_EXPR:
            case FOLLOWED_BY_EXPR:
                {
                alt285=2;
                }
                break;
            case EVERY_EXPR:
                {
                alt285=3;
                }
                break;
            case EVERY_DISTINCT_EXPR:
                {
                alt285=4;
                }
                break;
            case PATTERN_NOT_EXPR:
                {
                alt285=5;
                }
                break;
            case GUARD_EXPR:
                {
                alt285=6;
                }
                break;
            case MATCH_UNTIL_EXPR:
                {
                alt285=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 285, 0, input);

                throw nvae;
            }

            switch (alt285) {
                case 1 :
                    // EsperEPL2Ast.g:790:5: atomicExpr
                    {
                    pushFollow(FOLLOW_atomicExpr_in_exprChoice5431);
                    atomicExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:791:4: patternOp
                    {
                    pushFollow(FOLLOW_patternOp_in_exprChoice5436);
                    patternOp();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:792:5: ^(a= EVERY_EXPR exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_EXPR,FOLLOW_EVERY_EXPR_in_exprChoice5446); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5448);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:793:5: ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_DISTINCT_EXPR,FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5462); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distinctExpressions_in_exprChoice5464);
                    distinctExpressions();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5466);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:794:5: ^(n= PATTERN_NOT_EXPR exprChoice )
                    {
                    n=(CommonTree)match(input,PATTERN_NOT_EXPR,FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5480); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5482);
                    exprChoice();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:795:5: ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) )
                    {
                    g=(CommonTree)match(input,GUARD_EXPR,FOLLOW_GUARD_EXPR_in_exprChoice5496); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5498);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:795:32: ( IDENT IDENT ( valueExprWithTime )* | valueExpr )
                    int alt282=2;
                    int LA282_0 = input.LA(1);

                    if ( (LA282_0==IDENT) ) {
                        alt282=1;
                    }
                    else if ( ((LA282_0>=IN_SET && LA282_0<=REGEXP)||LA282_0==NOT_EXPR||(LA282_0>=SUM && LA282_0<=AVG)||(LA282_0>=COALESCE && LA282_0<=COUNT)||(LA282_0>=CASE && LA282_0<=CASE2)||(LA282_0>=PREVIOUS && LA282_0<=EXISTS)||(LA282_0>=INSTANCEOF && LA282_0<=CURRENT_TIMESTAMP)||LA282_0==NEWKW||(LA282_0>=EVAL_AND_EXPR && LA282_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA282_0==EVENT_PROP_EXPR||LA282_0==CONCAT||(LA282_0>=LIB_FUNC_CHAIN && LA282_0<=DOT_EXPR)||LA282_0==ARRAY_EXPR||(LA282_0>=NOT_IN_SET && LA282_0<=NOT_REGEXP)||(LA282_0>=IN_RANGE && LA282_0<=SUBSELECT_EXPR)||(LA282_0>=EXISTS_SUBSELECT_EXPR && LA282_0<=NOT_IN_SUBSELECT_EXPR)||LA282_0==SUBSTITUTION||(LA282_0>=FIRST_AGGREG && LA282_0<=WINDOW_AGGREG)||(LA282_0>=INT_TYPE && LA282_0<=NULL_TYPE)||(LA282_0>=JSON_OBJECT && LA282_0<=JSON_ARRAY)||LA282_0==STAR||(LA282_0>=LT && LA282_0<=GT)||(LA282_0>=BOR && LA282_0<=PLUS)||(LA282_0>=BAND && LA282_0<=BXOR)||(LA282_0>=LE && LA282_0<=GE)||(LA282_0>=MINUS && LA282_0<=MOD)||(LA282_0>=EVAL_IS_GROUP_EXPR && LA282_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt282=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 282, 0, input);

                        throw nvae;
                    }
                    switch (alt282) {
                        case 1 :
                            // EsperEPL2Ast.g:795:33: IDENT IDENT ( valueExprWithTime )*
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5501); 
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5503); 
                            // EsperEPL2Ast.g:795:45: ( valueExprWithTime )*
                            loop281:
                            do {
                                int alt281=2;
                                int LA281_0 = input.LA(1);

                                if ( ((LA281_0>=IN_SET && LA281_0<=REGEXP)||LA281_0==NOT_EXPR||(LA281_0>=SUM && LA281_0<=AVG)||(LA281_0>=COALESCE && LA281_0<=COUNT)||(LA281_0>=CASE && LA281_0<=CASE2)||LA281_0==LAST||(LA281_0>=PREVIOUS && LA281_0<=EXISTS)||(LA281_0>=LW && LA281_0<=CURRENT_TIMESTAMP)||LA281_0==NEWKW||(LA281_0>=NUMERIC_PARAM_RANGE && LA281_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA281_0>=EVAL_AND_EXPR && LA281_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA281_0==EVENT_PROP_EXPR||LA281_0==CONCAT||(LA281_0>=LIB_FUNC_CHAIN && LA281_0<=DOT_EXPR)||(LA281_0>=TIME_PERIOD && LA281_0<=ARRAY_EXPR)||(LA281_0>=NOT_IN_SET && LA281_0<=NOT_REGEXP)||(LA281_0>=IN_RANGE && LA281_0<=SUBSELECT_EXPR)||(LA281_0>=EXISTS_SUBSELECT_EXPR && LA281_0<=NOT_IN_SUBSELECT_EXPR)||(LA281_0>=LAST_OPERATOR && LA281_0<=SUBSTITUTION)||LA281_0==NUMBERSETSTAR||(LA281_0>=FIRST_AGGREG && LA281_0<=WINDOW_AGGREG)||(LA281_0>=INT_TYPE && LA281_0<=NULL_TYPE)||(LA281_0>=JSON_OBJECT && LA281_0<=JSON_ARRAY)||LA281_0==STAR||(LA281_0>=LT && LA281_0<=GT)||(LA281_0>=BOR && LA281_0<=PLUS)||(LA281_0>=BAND && LA281_0<=BXOR)||(LA281_0>=LE && LA281_0<=GE)||(LA281_0>=MINUS && LA281_0<=MOD)||(LA281_0>=EVAL_IS_GROUP_EXPR && LA281_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt281=1;
                                }


                                switch (alt281) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:795:45: valueExprWithTime
                            	    {
                            	    pushFollow(FOLLOW_valueExprWithTime_in_exprChoice5505);
                            	    valueExprWithTime();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop281;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:795:66: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_exprChoice5510);
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
                    // EsperEPL2Ast.g:796:4: ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? )
                    {
                    m=(CommonTree)match(input,MATCH_UNTIL_EXPR,FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5524); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:796:26: ( matchUntilRange )?
                    int alt283=2;
                    int LA283_0 = input.LA(1);

                    if ( ((LA283_0>=MATCH_UNTIL_RANGE_HALFOPEN && LA283_0<=MATCH_UNTIL_RANGE_BOUNDED)) ) {
                        alt283=1;
                    }
                    switch (alt283) {
                        case 1 :
                            // EsperEPL2Ast.g:796:26: matchUntilRange
                            {
                            pushFollow(FOLLOW_matchUntilRange_in_exprChoice5526);
                            matchUntilRange();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5529);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:796:54: ( exprChoice )?
                    int alt284=2;
                    int LA284_0 = input.LA(1);

                    if ( ((LA284_0>=OR_EXPR && LA284_0<=AND_EXPR)||(LA284_0>=EVERY_EXPR && LA284_0<=EVERY_DISTINCT_EXPR)||LA284_0==FOLLOWED_BY_EXPR||(LA284_0>=PATTERN_FILTER_EXPR && LA284_0<=PATTERN_NOT_EXPR)||(LA284_0>=GUARD_EXPR && LA284_0<=OBSERVER_EXPR)||LA284_0==MATCH_UNTIL_EXPR) ) {
                        alt284=1;
                    }
                    switch (alt284) {
                        case 1 :
                            // EsperEPL2Ast.g:796:54: exprChoice
                            {
                            pushFollow(FOLLOW_exprChoice_in_exprChoice5531);
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
    // EsperEPL2Ast.g:800:1: distinctExpressions : ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) ;
    public final void distinctExpressions() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:801:2: ( ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) )
            // EsperEPL2Ast.g:801:4: ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ )
            {
            match(input,PATTERN_EVERY_DISTINCT_EXPR,FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5552); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:801:35: ( valueExprWithTime )+
            int cnt286=0;
            loop286:
            do {
                int alt286=2;
                int LA286_0 = input.LA(1);

                if ( ((LA286_0>=IN_SET && LA286_0<=REGEXP)||LA286_0==NOT_EXPR||(LA286_0>=SUM && LA286_0<=AVG)||(LA286_0>=COALESCE && LA286_0<=COUNT)||(LA286_0>=CASE && LA286_0<=CASE2)||LA286_0==LAST||(LA286_0>=PREVIOUS && LA286_0<=EXISTS)||(LA286_0>=LW && LA286_0<=CURRENT_TIMESTAMP)||LA286_0==NEWKW||(LA286_0>=NUMERIC_PARAM_RANGE && LA286_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA286_0>=EVAL_AND_EXPR && LA286_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA286_0==EVENT_PROP_EXPR||LA286_0==CONCAT||(LA286_0>=LIB_FUNC_CHAIN && LA286_0<=DOT_EXPR)||(LA286_0>=TIME_PERIOD && LA286_0<=ARRAY_EXPR)||(LA286_0>=NOT_IN_SET && LA286_0<=NOT_REGEXP)||(LA286_0>=IN_RANGE && LA286_0<=SUBSELECT_EXPR)||(LA286_0>=EXISTS_SUBSELECT_EXPR && LA286_0<=NOT_IN_SUBSELECT_EXPR)||(LA286_0>=LAST_OPERATOR && LA286_0<=SUBSTITUTION)||LA286_0==NUMBERSETSTAR||(LA286_0>=FIRST_AGGREG && LA286_0<=WINDOW_AGGREG)||(LA286_0>=INT_TYPE && LA286_0<=NULL_TYPE)||(LA286_0>=JSON_OBJECT && LA286_0<=JSON_ARRAY)||LA286_0==STAR||(LA286_0>=LT && LA286_0<=GT)||(LA286_0>=BOR && LA286_0<=PLUS)||(LA286_0>=BAND && LA286_0<=BXOR)||(LA286_0>=LE && LA286_0<=GE)||(LA286_0>=MINUS && LA286_0<=MOD)||(LA286_0>=EVAL_IS_GROUP_EXPR && LA286_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt286=1;
                }


                switch (alt286) {
            	case 1 :
            	    // EsperEPL2Ast.g:801:35: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_distinctExpressions5554);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt286 >= 1 ) break loop286;
                        EarlyExitException eee =
                            new EarlyExitException(286, input);
                        throw eee;
                }
                cnt286++;
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
    // EsperEPL2Ast.g:804:1: patternOp : ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) );
    public final void patternOp() throws RecognitionException {
        CommonTree f=null;
        CommonTree o=null;
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:805:2: ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) )
            int alt290=3;
            switch ( input.LA(1) ) {
            case FOLLOWED_BY_EXPR:
                {
                alt290=1;
                }
                break;
            case OR_EXPR:
                {
                alt290=2;
                }
                break;
            case AND_EXPR:
                {
                alt290=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 290, 0, input);

                throw nvae;
            }

            switch (alt290) {
                case 1 :
                    // EsperEPL2Ast.g:805:4: ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* )
                    {
                    f=(CommonTree)match(input,FOLLOWED_BY_EXPR,FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5573); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_followedByItem_in_patternOp5575);
                    followedByItem();

                    state._fsp--;

                    pushFollow(FOLLOW_followedByItem_in_patternOp5577);
                    followedByItem();

                    state._fsp--;

                    // EsperEPL2Ast.g:805:56: ( followedByItem )*
                    loop287:
                    do {
                        int alt287=2;
                        int LA287_0 = input.LA(1);

                        if ( (LA287_0==FOLLOWED_BY_ITEM) ) {
                            alt287=1;
                        }


                        switch (alt287) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:805:57: followedByItem
                    	    {
                    	    pushFollow(FOLLOW_followedByItem_in_patternOp5580);
                    	    followedByItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop287;
                        }
                    } while (true);

                     leaveNode(f); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:806:5: ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    o=(CommonTree)match(input,OR_EXPR,FOLLOW_OR_EXPR_in_patternOp5596); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5598);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5600);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:806:40: ( exprChoice )*
                    loop288:
                    do {
                        int alt288=2;
                        int LA288_0 = input.LA(1);

                        if ( ((LA288_0>=OR_EXPR && LA288_0<=AND_EXPR)||(LA288_0>=EVERY_EXPR && LA288_0<=EVERY_DISTINCT_EXPR)||LA288_0==FOLLOWED_BY_EXPR||(LA288_0>=PATTERN_FILTER_EXPR && LA288_0<=PATTERN_NOT_EXPR)||(LA288_0>=GUARD_EXPR && LA288_0<=OBSERVER_EXPR)||LA288_0==MATCH_UNTIL_EXPR) ) {
                            alt288=1;
                        }


                        switch (alt288) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:806:41: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5603);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop288;
                        }
                    } while (true);

                     leaveNode(o); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:807:5: ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    a=(CommonTree)match(input,AND_EXPR,FOLLOW_AND_EXPR_in_patternOp5619); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5621);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5623);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:807:41: ( exprChoice )*
                    loop289:
                    do {
                        int alt289=2;
                        int LA289_0 = input.LA(1);

                        if ( ((LA289_0>=OR_EXPR && LA289_0<=AND_EXPR)||(LA289_0>=EVERY_EXPR && LA289_0<=EVERY_DISTINCT_EXPR)||LA289_0==FOLLOWED_BY_EXPR||(LA289_0>=PATTERN_FILTER_EXPR && LA289_0<=PATTERN_NOT_EXPR)||(LA289_0>=GUARD_EXPR && LA289_0<=OBSERVER_EXPR)||LA289_0==MATCH_UNTIL_EXPR) ) {
                            alt289=1;
                        }


                        switch (alt289) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:807:42: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5626);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop289;
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
    // EsperEPL2Ast.g:810:1: followedByItem : ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) ;
    public final void followedByItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:811:2: ( ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) )
            // EsperEPL2Ast.g:811:4: ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice )
            {
            match(input,FOLLOWED_BY_ITEM,FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5647); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:811:24: ( valueExpr )?
            int alt291=2;
            int LA291_0 = input.LA(1);

            if ( ((LA291_0>=IN_SET && LA291_0<=REGEXP)||LA291_0==NOT_EXPR||(LA291_0>=SUM && LA291_0<=AVG)||(LA291_0>=COALESCE && LA291_0<=COUNT)||(LA291_0>=CASE && LA291_0<=CASE2)||(LA291_0>=PREVIOUS && LA291_0<=EXISTS)||(LA291_0>=INSTANCEOF && LA291_0<=CURRENT_TIMESTAMP)||LA291_0==NEWKW||(LA291_0>=EVAL_AND_EXPR && LA291_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA291_0==EVENT_PROP_EXPR||LA291_0==CONCAT||(LA291_0>=LIB_FUNC_CHAIN && LA291_0<=DOT_EXPR)||LA291_0==ARRAY_EXPR||(LA291_0>=NOT_IN_SET && LA291_0<=NOT_REGEXP)||(LA291_0>=IN_RANGE && LA291_0<=SUBSELECT_EXPR)||(LA291_0>=EXISTS_SUBSELECT_EXPR && LA291_0<=NOT_IN_SUBSELECT_EXPR)||LA291_0==SUBSTITUTION||(LA291_0>=FIRST_AGGREG && LA291_0<=WINDOW_AGGREG)||(LA291_0>=INT_TYPE && LA291_0<=NULL_TYPE)||(LA291_0>=JSON_OBJECT && LA291_0<=JSON_ARRAY)||LA291_0==STAR||(LA291_0>=LT && LA291_0<=GT)||(LA291_0>=BOR && LA291_0<=PLUS)||(LA291_0>=BAND && LA291_0<=BXOR)||(LA291_0>=LE && LA291_0<=GE)||(LA291_0>=MINUS && LA291_0<=MOD)||(LA291_0>=EVAL_IS_GROUP_EXPR && LA291_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt291=1;
            }
            switch (alt291) {
                case 1 :
                    // EsperEPL2Ast.g:811:24: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_followedByItem5649);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_exprChoice_in_followedByItem5652);
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
    // EsperEPL2Ast.g:814:1: atomicExpr : ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) );
    public final void atomicExpr() throws RecognitionException {
        CommonTree ac=null;

        try {
            // EsperEPL2Ast.g:815:2: ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            int alt293=2;
            int LA293_0 = input.LA(1);

            if ( (LA293_0==PATTERN_FILTER_EXPR) ) {
                alt293=1;
            }
            else if ( (LA293_0==OBSERVER_EXPR) ) {
                alt293=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 293, 0, input);

                throw nvae;
            }
            switch (alt293) {
                case 1 :
                    // EsperEPL2Ast.g:815:4: patternFilterExpr
                    {
                    pushFollow(FOLLOW_patternFilterExpr_in_atomicExpr5666);
                    patternFilterExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:816:7: ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* )
                    {
                    ac=(CommonTree)match(input,OBSERVER_EXPR,FOLLOW_OBSERVER_EXPR_in_atomicExpr5678); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5680); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5682); 
                    // EsperEPL2Ast.g:816:39: ( valueExprWithTime )*
                    loop292:
                    do {
                        int alt292=2;
                        int LA292_0 = input.LA(1);

                        if ( ((LA292_0>=IN_SET && LA292_0<=REGEXP)||LA292_0==NOT_EXPR||(LA292_0>=SUM && LA292_0<=AVG)||(LA292_0>=COALESCE && LA292_0<=COUNT)||(LA292_0>=CASE && LA292_0<=CASE2)||LA292_0==LAST||(LA292_0>=PREVIOUS && LA292_0<=EXISTS)||(LA292_0>=LW && LA292_0<=CURRENT_TIMESTAMP)||LA292_0==NEWKW||(LA292_0>=NUMERIC_PARAM_RANGE && LA292_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA292_0>=EVAL_AND_EXPR && LA292_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA292_0==EVENT_PROP_EXPR||LA292_0==CONCAT||(LA292_0>=LIB_FUNC_CHAIN && LA292_0<=DOT_EXPR)||(LA292_0>=TIME_PERIOD && LA292_0<=ARRAY_EXPR)||(LA292_0>=NOT_IN_SET && LA292_0<=NOT_REGEXP)||(LA292_0>=IN_RANGE && LA292_0<=SUBSELECT_EXPR)||(LA292_0>=EXISTS_SUBSELECT_EXPR && LA292_0<=NOT_IN_SUBSELECT_EXPR)||(LA292_0>=LAST_OPERATOR && LA292_0<=SUBSTITUTION)||LA292_0==NUMBERSETSTAR||(LA292_0>=FIRST_AGGREG && LA292_0<=WINDOW_AGGREG)||(LA292_0>=INT_TYPE && LA292_0<=NULL_TYPE)||(LA292_0>=JSON_OBJECT && LA292_0<=JSON_ARRAY)||LA292_0==STAR||(LA292_0>=LT && LA292_0<=GT)||(LA292_0>=BOR && LA292_0<=PLUS)||(LA292_0>=BAND && LA292_0<=BXOR)||(LA292_0>=LE && LA292_0<=GE)||(LA292_0>=MINUS && LA292_0<=MOD)||(LA292_0>=EVAL_IS_GROUP_EXPR && LA292_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt292=1;
                        }


                        switch (alt292) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:816:39: valueExprWithTime
                    	    {
                    	    pushFollow(FOLLOW_valueExprWithTime_in_atomicExpr5684);
                    	    valueExprWithTime();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop292;
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
    // EsperEPL2Ast.g:819:1: patternFilterExpr : ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) ;
    public final void patternFilterExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:820:2: ( ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:820:4: ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,PATTERN_FILTER_EXPR,FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5704); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:820:29: ( IDENT )?
            int alt294=2;
            int LA294_0 = input.LA(1);

            if ( (LA294_0==IDENT) ) {
                alt294=1;
            }
            switch (alt294) {
                case 1 :
                    // EsperEPL2Ast.g:820:29: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_patternFilterExpr5706); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_patternFilterExpr5709); 
            // EsperEPL2Ast.g:820:48: ( propertyExpression )?
            int alt295=2;
            int LA295_0 = input.LA(1);

            if ( (LA295_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt295=1;
            }
            switch (alt295) {
                case 1 :
                    // EsperEPL2Ast.g:820:48: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_patternFilterExpr5711);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:820:68: ( patternFilterAnno )?
            int alt296=2;
            int LA296_0 = input.LA(1);

            if ( (LA296_0==ATCHAR) ) {
                alt296=1;
            }
            switch (alt296) {
                case 1 :
                    // EsperEPL2Ast.g:820:68: patternFilterAnno
                    {
                    pushFollow(FOLLOW_patternFilterAnno_in_patternFilterExpr5714);
                    patternFilterAnno();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:820:87: ( valueExpr )*
            loop297:
            do {
                int alt297=2;
                int LA297_0 = input.LA(1);

                if ( ((LA297_0>=IN_SET && LA297_0<=REGEXP)||LA297_0==NOT_EXPR||(LA297_0>=SUM && LA297_0<=AVG)||(LA297_0>=COALESCE && LA297_0<=COUNT)||(LA297_0>=CASE && LA297_0<=CASE2)||(LA297_0>=PREVIOUS && LA297_0<=EXISTS)||(LA297_0>=INSTANCEOF && LA297_0<=CURRENT_TIMESTAMP)||LA297_0==NEWKW||(LA297_0>=EVAL_AND_EXPR && LA297_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA297_0==EVENT_PROP_EXPR||LA297_0==CONCAT||(LA297_0>=LIB_FUNC_CHAIN && LA297_0<=DOT_EXPR)||LA297_0==ARRAY_EXPR||(LA297_0>=NOT_IN_SET && LA297_0<=NOT_REGEXP)||(LA297_0>=IN_RANGE && LA297_0<=SUBSELECT_EXPR)||(LA297_0>=EXISTS_SUBSELECT_EXPR && LA297_0<=NOT_IN_SUBSELECT_EXPR)||LA297_0==SUBSTITUTION||(LA297_0>=FIRST_AGGREG && LA297_0<=WINDOW_AGGREG)||(LA297_0>=INT_TYPE && LA297_0<=NULL_TYPE)||(LA297_0>=JSON_OBJECT && LA297_0<=JSON_ARRAY)||LA297_0==STAR||(LA297_0>=LT && LA297_0<=GT)||(LA297_0>=BOR && LA297_0<=PLUS)||(LA297_0>=BAND && LA297_0<=BXOR)||(LA297_0>=LE && LA297_0<=GE)||(LA297_0>=MINUS && LA297_0<=MOD)||(LA297_0>=EVAL_IS_GROUP_EXPR && LA297_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt297=1;
                }


                switch (alt297) {
            	case 1 :
            	    // EsperEPL2Ast.g:820:88: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_patternFilterExpr5718);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop297;
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
    // EsperEPL2Ast.g:823:1: patternFilterAnno : ^( ATCHAR IDENT ( number )? ) ;
    public final void patternFilterAnno() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:824:2: ( ^( ATCHAR IDENT ( number )? ) )
            // EsperEPL2Ast.g:824:4: ^( ATCHAR IDENT ( number )? )
            {
            match(input,ATCHAR,FOLLOW_ATCHAR_in_patternFilterAnno5738); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_patternFilterAnno5740); 
            // EsperEPL2Ast.g:824:20: ( number )?
            int alt298=2;
            int LA298_0 = input.LA(1);

            if ( ((LA298_0>=INT_TYPE && LA298_0<=DOUBLE_TYPE)) ) {
                alt298=1;
            }
            switch (alt298) {
                case 1 :
                    // EsperEPL2Ast.g:824:20: number
                    {
                    pushFollow(FOLLOW_number_in_patternFilterAnno5742);
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
    // EsperEPL2Ast.g:827:1: matchUntilRange : ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) );
    public final void matchUntilRange() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:828:2: ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) )
            int alt299=4;
            switch ( input.LA(1) ) {
            case MATCH_UNTIL_RANGE_CLOSED:
                {
                alt299=1;
                }
                break;
            case MATCH_UNTIL_RANGE_BOUNDED:
                {
                alt299=2;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFCLOSED:
                {
                alt299=3;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFOPEN:
                {
                alt299=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 299, 0, input);

                throw nvae;
            }

            switch (alt299) {
                case 1 :
                    // EsperEPL2Ast.g:828:4: ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_CLOSED,FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5757); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5759);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5761);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:829:5: ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_BOUNDED,FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5769); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5771);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:830:5: ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFCLOSED,FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5779); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5781);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:831:4: ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFOPEN,FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5788); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5790);
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
    // EsperEPL2Ast.g:834:1: filterParam : ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) ;
    public final void filterParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:835:2: ( ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:835:4: ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* )
            {
            match(input,EVENT_FILTER_PARAM,FOLLOW_EVENT_FILTER_PARAM_in_filterParam5803); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_filterParam5805);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:835:35: ( valueExpr )*
            loop300:
            do {
                int alt300=2;
                int LA300_0 = input.LA(1);

                if ( ((LA300_0>=IN_SET && LA300_0<=REGEXP)||LA300_0==NOT_EXPR||(LA300_0>=SUM && LA300_0<=AVG)||(LA300_0>=COALESCE && LA300_0<=COUNT)||(LA300_0>=CASE && LA300_0<=CASE2)||(LA300_0>=PREVIOUS && LA300_0<=EXISTS)||(LA300_0>=INSTANCEOF && LA300_0<=CURRENT_TIMESTAMP)||LA300_0==NEWKW||(LA300_0>=EVAL_AND_EXPR && LA300_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA300_0==EVENT_PROP_EXPR||LA300_0==CONCAT||(LA300_0>=LIB_FUNC_CHAIN && LA300_0<=DOT_EXPR)||LA300_0==ARRAY_EXPR||(LA300_0>=NOT_IN_SET && LA300_0<=NOT_REGEXP)||(LA300_0>=IN_RANGE && LA300_0<=SUBSELECT_EXPR)||(LA300_0>=EXISTS_SUBSELECT_EXPR && LA300_0<=NOT_IN_SUBSELECT_EXPR)||LA300_0==SUBSTITUTION||(LA300_0>=FIRST_AGGREG && LA300_0<=WINDOW_AGGREG)||(LA300_0>=INT_TYPE && LA300_0<=NULL_TYPE)||(LA300_0>=JSON_OBJECT && LA300_0<=JSON_ARRAY)||LA300_0==STAR||(LA300_0>=LT && LA300_0<=GT)||(LA300_0>=BOR && LA300_0<=PLUS)||(LA300_0>=BAND && LA300_0<=BXOR)||(LA300_0>=LE && LA300_0<=GE)||(LA300_0>=MINUS && LA300_0<=MOD)||(LA300_0>=EVAL_IS_GROUP_EXPR && LA300_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt300=1;
                }


                switch (alt300) {
            	case 1 :
            	    // EsperEPL2Ast.g:835:36: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_filterParam5808);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop300;
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
    // EsperEPL2Ast.g:838:1: filterParamComparator : ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) );
    public final void filterParamComparator() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:839:2: ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) )
            int alt313=12;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt313=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt313=2;
                }
                break;
            case LT:
                {
                alt313=3;
                }
                break;
            case LE:
                {
                alt313=4;
                }
                break;
            case GT:
                {
                alt313=5;
                }
                break;
            case GE:
                {
                alt313=6;
                }
                break;
            case EVENT_FILTER_RANGE:
                {
                alt313=7;
                }
                break;
            case EVENT_FILTER_NOT_RANGE:
                {
                alt313=8;
                }
                break;
            case EVENT_FILTER_IN:
                {
                alt313=9;
                }
                break;
            case EVENT_FILTER_NOT_IN:
                {
                alt313=10;
                }
                break;
            case EVENT_FILTER_BETWEEN:
                {
                alt313=11;
                }
                break;
            case EVENT_FILTER_NOT_BETWEEN:
                {
                alt313=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 313, 0, input);

                throw nvae;
            }

            switch (alt313) {
                case 1 :
                    // EsperEPL2Ast.g:839:4: ^( EQUALS filterAtom )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_filterParamComparator5824); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5826);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:840:4: ^( NOT_EQUAL filterAtom )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_filterParamComparator5833); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5835);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:841:4: ^( LT filterAtom )
                    {
                    match(input,LT,FOLLOW_LT_in_filterParamComparator5842); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5844);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:842:4: ^( LE filterAtom )
                    {
                    match(input,LE,FOLLOW_LE_in_filterParamComparator5851); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5853);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:843:4: ^( GT filterAtom )
                    {
                    match(input,GT,FOLLOW_GT_in_filterParamComparator5860); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5862);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:844:4: ^( GE filterAtom )
                    {
                    match(input,GE,FOLLOW_GE_in_filterParamComparator5869); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5871);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:845:4: ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_RANGE,FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5878); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:845:41: ( constant[false] | filterIdentifier )
                    int alt301=2;
                    int LA301_0 = input.LA(1);

                    if ( ((LA301_0>=INT_TYPE && LA301_0<=NULL_TYPE)) ) {
                        alt301=1;
                    }
                    else if ( (LA301_0==EVENT_FILTER_IDENT) ) {
                        alt301=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 301, 0, input);

                        throw nvae;
                    }
                    switch (alt301) {
                        case 1 :
                            // EsperEPL2Ast.g:845:42: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5887);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:845:58: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5890);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:845:76: ( constant[false] | filterIdentifier )
                    int alt302=2;
                    int LA302_0 = input.LA(1);

                    if ( ((LA302_0>=INT_TYPE && LA302_0<=NULL_TYPE)) ) {
                        alt302=1;
                    }
                    else if ( (LA302_0==EVENT_FILTER_IDENT) ) {
                        alt302=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 302, 0, input);

                        throw nvae;
                    }
                    switch (alt302) {
                        case 1 :
                            // EsperEPL2Ast.g:845:77: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5894);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:845:93: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5897);
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
                    // EsperEPL2Ast.g:846:4: ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_RANGE,FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5911); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:846:45: ( constant[false] | filterIdentifier )
                    int alt303=2;
                    int LA303_0 = input.LA(1);

                    if ( ((LA303_0>=INT_TYPE && LA303_0<=NULL_TYPE)) ) {
                        alt303=1;
                    }
                    else if ( (LA303_0==EVENT_FILTER_IDENT) ) {
                        alt303=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 303, 0, input);

                        throw nvae;
                    }
                    switch (alt303) {
                        case 1 :
                            // EsperEPL2Ast.g:846:46: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5920);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:846:62: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5923);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:846:80: ( constant[false] | filterIdentifier )
                    int alt304=2;
                    int LA304_0 = input.LA(1);

                    if ( ((LA304_0>=INT_TYPE && LA304_0<=NULL_TYPE)) ) {
                        alt304=1;
                    }
                    else if ( (LA304_0==EVENT_FILTER_IDENT) ) {
                        alt304=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 304, 0, input);

                        throw nvae;
                    }
                    switch (alt304) {
                        case 1 :
                            // EsperEPL2Ast.g:846:81: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5927);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:846:97: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5930);
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
                    // EsperEPL2Ast.g:847:4: ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_IN,FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5944); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:847:38: ( constant[false] | filterIdentifier )
                    int alt305=2;
                    int LA305_0 = input.LA(1);

                    if ( ((LA305_0>=INT_TYPE && LA305_0<=NULL_TYPE)) ) {
                        alt305=1;
                    }
                    else if ( (LA305_0==EVENT_FILTER_IDENT) ) {
                        alt305=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 305, 0, input);

                        throw nvae;
                    }
                    switch (alt305) {
                        case 1 :
                            // EsperEPL2Ast.g:847:39: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5953);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:847:55: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5956);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:847:73: ( constant[false] | filterIdentifier )*
                    loop306:
                    do {
                        int alt306=3;
                        int LA306_0 = input.LA(1);

                        if ( ((LA306_0>=INT_TYPE && LA306_0<=NULL_TYPE)) ) {
                            alt306=1;
                        }
                        else if ( (LA306_0==EVENT_FILTER_IDENT) ) {
                            alt306=2;
                        }


                        switch (alt306) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:847:74: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5960);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:847:90: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5963);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop306;
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
                    // EsperEPL2Ast.g:848:4: ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_IN,FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5978); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:848:42: ( constant[false] | filterIdentifier )
                    int alt307=2;
                    int LA307_0 = input.LA(1);

                    if ( ((LA307_0>=INT_TYPE && LA307_0<=NULL_TYPE)) ) {
                        alt307=1;
                    }
                    else if ( (LA307_0==EVENT_FILTER_IDENT) ) {
                        alt307=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 307, 0, input);

                        throw nvae;
                    }
                    switch (alt307) {
                        case 1 :
                            // EsperEPL2Ast.g:848:43: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator5987);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:848:59: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5990);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:848:77: ( constant[false] | filterIdentifier )*
                    loop308:
                    do {
                        int alt308=3;
                        int LA308_0 = input.LA(1);

                        if ( ((LA308_0>=INT_TYPE && LA308_0<=NULL_TYPE)) ) {
                            alt308=1;
                        }
                        else if ( (LA308_0==EVENT_FILTER_IDENT) ) {
                            alt308=2;
                        }


                        switch (alt308) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:848:78: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator5994);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:848:94: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator5997);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop308;
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
                    // EsperEPL2Ast.g:849:4: ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_BETWEEN,FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator6012); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:849:27: ( constant[false] | filterIdentifier )
                    int alt309=2;
                    int LA309_0 = input.LA(1);

                    if ( ((LA309_0>=INT_TYPE && LA309_0<=NULL_TYPE)) ) {
                        alt309=1;
                    }
                    else if ( (LA309_0==EVENT_FILTER_IDENT) ) {
                        alt309=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 309, 0, input);

                        throw nvae;
                    }
                    switch (alt309) {
                        case 1 :
                            // EsperEPL2Ast.g:849:28: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6015);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:849:44: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6018);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:849:62: ( constant[false] | filterIdentifier )
                    int alt310=2;
                    int LA310_0 = input.LA(1);

                    if ( ((LA310_0>=INT_TYPE && LA310_0<=NULL_TYPE)) ) {
                        alt310=1;
                    }
                    else if ( (LA310_0==EVENT_FILTER_IDENT) ) {
                        alt310=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 310, 0, input);

                        throw nvae;
                    }
                    switch (alt310) {
                        case 1 :
                            // EsperEPL2Ast.g:849:63: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6022);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:849:79: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6025);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:850:4: ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_NOT_BETWEEN,FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator6033); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:850:31: ( constant[false] | filterIdentifier )
                    int alt311=2;
                    int LA311_0 = input.LA(1);

                    if ( ((LA311_0>=INT_TYPE && LA311_0<=NULL_TYPE)) ) {
                        alt311=1;
                    }
                    else if ( (LA311_0==EVENT_FILTER_IDENT) ) {
                        alt311=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 311, 0, input);

                        throw nvae;
                    }
                    switch (alt311) {
                        case 1 :
                            // EsperEPL2Ast.g:850:32: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6036);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:850:48: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6039);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:850:66: ( constant[false] | filterIdentifier )
                    int alt312=2;
                    int LA312_0 = input.LA(1);

                    if ( ((LA312_0>=INT_TYPE && LA312_0<=NULL_TYPE)) ) {
                        alt312=1;
                    }
                    else if ( (LA312_0==EVENT_FILTER_IDENT) ) {
                        alt312=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 312, 0, input);

                        throw nvae;
                    }
                    switch (alt312) {
                        case 1 :
                            // EsperEPL2Ast.g:850:67: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6043);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:850:83: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6046);
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
    // EsperEPL2Ast.g:853:1: filterAtom : ( constant[false] | filterIdentifier );
    public final void filterAtom() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:854:2: ( constant[false] | filterIdentifier )
            int alt314=2;
            int LA314_0 = input.LA(1);

            if ( ((LA314_0>=INT_TYPE && LA314_0<=NULL_TYPE)) ) {
                alt314=1;
            }
            else if ( (LA314_0==EVENT_FILTER_IDENT) ) {
                alt314=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 314, 0, input);

                throw nvae;
            }
            switch (alt314) {
                case 1 :
                    // EsperEPL2Ast.g:854:4: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_filterAtom6060);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:855:4: filterIdentifier
                    {
                    pushFollow(FOLLOW_filterIdentifier_in_filterAtom6066);
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
    // EsperEPL2Ast.g:857:1: filterIdentifier : ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) ;
    public final void filterIdentifier() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:858:2: ( ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) )
            // EsperEPL2Ast.g:858:4: ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] )
            {
            match(input,EVENT_FILTER_IDENT,FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier6077); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_filterIdentifier6079); 
            pushFollow(FOLLOW_eventPropertyExpr_in_filterIdentifier6081);
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
    // EsperEPL2Ast.g:861:1: eventPropertyExpr[boolean isLeaveNode] : ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) ;
    public final void eventPropertyExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:862:2: ( ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) )
            // EsperEPL2Ast.g:862:4: ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* )
            {
            p=(CommonTree)match(input,EVENT_PROP_EXPR,FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr6100); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6102);
            eventPropertyAtomic();

            state._fsp--;

            // EsperEPL2Ast.g:862:44: ( eventPropertyAtomic )*
            loop315:
            do {
                int alt315=2;
                int LA315_0 = input.LA(1);

                if ( ((LA315_0>=EVENT_PROP_SIMPLE && LA315_0<=EVENT_PROP_DYNAMIC_MAPPED)) ) {
                    alt315=1;
                }


                switch (alt315) {
            	case 1 :
            	    // EsperEPL2Ast.g:862:45: eventPropertyAtomic
            	    {
            	    pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6105);
            	    eventPropertyAtomic();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop315;
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
    // EsperEPL2Ast.g:865:1: eventPropertyAtomic : ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) );
    public final void eventPropertyAtomic() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:866:2: ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) )
            int alt316=6;
            switch ( input.LA(1) ) {
            case EVENT_PROP_SIMPLE:
                {
                alt316=1;
                }
                break;
            case EVENT_PROP_INDEXED:
                {
                alt316=2;
                }
                break;
            case EVENT_PROP_MAPPED:
                {
                alt316=3;
                }
                break;
            case EVENT_PROP_DYNAMIC_SIMPLE:
                {
                alt316=4;
                }
                break;
            case EVENT_PROP_DYNAMIC_INDEXED:
                {
                alt316=5;
                }
                break;
            case EVENT_PROP_DYNAMIC_MAPPED:
                {
                alt316=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 316, 0, input);

                throw nvae;
            }

            switch (alt316) {
                case 1 :
                    // EsperEPL2Ast.g:866:4: ^( EVENT_PROP_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_SIMPLE,FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic6124); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6126); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:867:4: ^( EVENT_PROP_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_INDEXED,FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic6133); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6135); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic6137); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:868:4: ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_MAPPED,FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic6144); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6146); 
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
                    // EsperEPL2Ast.g:869:4: ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_SIMPLE,FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic6161); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6163); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:870:4: ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_INDEXED,FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic6170); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6172); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic6174); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:871:4: ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_DYNAMIC_MAPPED,FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic6181); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6183); 
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
    // EsperEPL2Ast.g:874:1: timePeriod : ^(t= TIME_PERIOD timePeriodDef ) ;
    public final void timePeriod() throws RecognitionException {
        CommonTree t=null;

        try {
            // EsperEPL2Ast.g:875:2: ( ^(t= TIME_PERIOD timePeriodDef ) )
            // EsperEPL2Ast.g:875:5: ^(t= TIME_PERIOD timePeriodDef )
            {
            t=(CommonTree)match(input,TIME_PERIOD,FOLLOW_TIME_PERIOD_in_timePeriod6210); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_timePeriodDef_in_timePeriod6212);
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
    // EsperEPL2Ast.g:878:1: timePeriodDef : ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart );
    public final void timePeriodDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:879:2: ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart )
            int alt345=8;
            switch ( input.LA(1) ) {
            case YEAR_PART:
                {
                alt345=1;
                }
                break;
            case MONTH_PART:
                {
                alt345=2;
                }
                break;
            case WEEK_PART:
                {
                alt345=3;
                }
                break;
            case DAY_PART:
                {
                alt345=4;
                }
                break;
            case HOUR_PART:
                {
                alt345=5;
                }
                break;
            case MINUTE_PART:
                {
                alt345=6;
                }
                break;
            case SECOND_PART:
                {
                alt345=7;
                }
                break;
            case MILLISECOND_PART:
                {
                alt345=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 345, 0, input);

                throw nvae;
            }

            switch (alt345) {
                case 1 :
                    // EsperEPL2Ast.g:879:5: yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_yearPart_in_timePeriodDef6228);
                    yearPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:879:14: ( monthPart )?
                    int alt317=2;
                    int LA317_0 = input.LA(1);

                    if ( (LA317_0==MONTH_PART) ) {
                        alt317=1;
                    }
                    switch (alt317) {
                        case 1 :
                            // EsperEPL2Ast.g:879:15: monthPart
                            {
                            pushFollow(FOLLOW_monthPart_in_timePeriodDef6231);
                            monthPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:879:27: ( weekPart )?
                    int alt318=2;
                    int LA318_0 = input.LA(1);

                    if ( (LA318_0==WEEK_PART) ) {
                        alt318=1;
                    }
                    switch (alt318) {
                        case 1 :
                            // EsperEPL2Ast.g:879:28: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef6236);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:879:39: ( dayPart )?
                    int alt319=2;
                    int LA319_0 = input.LA(1);

                    if ( (LA319_0==DAY_PART) ) {
                        alt319=1;
                    }
                    switch (alt319) {
                        case 1 :
                            // EsperEPL2Ast.g:879:40: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef6241);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:879:50: ( hourPart )?
                    int alt320=2;
                    int LA320_0 = input.LA(1);

                    if ( (LA320_0==HOUR_PART) ) {
                        alt320=1;
                    }
                    switch (alt320) {
                        case 1 :
                            // EsperEPL2Ast.g:879:51: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6246);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:879:62: ( minutePart )?
                    int alt321=2;
                    int LA321_0 = input.LA(1);

                    if ( (LA321_0==MINUTE_PART) ) {
                        alt321=1;
                    }
                    switch (alt321) {
                        case 1 :
                            // EsperEPL2Ast.g:879:63: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6251);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:879:76: ( secondPart )?
                    int alt322=2;
                    int LA322_0 = input.LA(1);

                    if ( (LA322_0==SECOND_PART) ) {
                        alt322=1;
                    }
                    switch (alt322) {
                        case 1 :
                            // EsperEPL2Ast.g:879:77: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6256);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:879:90: ( millisecondPart )?
                    int alt323=2;
                    int LA323_0 = input.LA(1);

                    if ( (LA323_0==MILLISECOND_PART) ) {
                        alt323=1;
                    }
                    switch (alt323) {
                        case 1 :
                            // EsperEPL2Ast.g:879:91: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6261);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:880:5: monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_monthPart_in_timePeriodDef6269);
                    monthPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:880:15: ( weekPart )?
                    int alt324=2;
                    int LA324_0 = input.LA(1);

                    if ( (LA324_0==WEEK_PART) ) {
                        alt324=1;
                    }
                    switch (alt324) {
                        case 1 :
                            // EsperEPL2Ast.g:880:16: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef6272);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:880:27: ( dayPart )?
                    int alt325=2;
                    int LA325_0 = input.LA(1);

                    if ( (LA325_0==DAY_PART) ) {
                        alt325=1;
                    }
                    switch (alt325) {
                        case 1 :
                            // EsperEPL2Ast.g:880:28: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef6277);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:880:38: ( hourPart )?
                    int alt326=2;
                    int LA326_0 = input.LA(1);

                    if ( (LA326_0==HOUR_PART) ) {
                        alt326=1;
                    }
                    switch (alt326) {
                        case 1 :
                            // EsperEPL2Ast.g:880:39: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6282);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:880:50: ( minutePart )?
                    int alt327=2;
                    int LA327_0 = input.LA(1);

                    if ( (LA327_0==MINUTE_PART) ) {
                        alt327=1;
                    }
                    switch (alt327) {
                        case 1 :
                            // EsperEPL2Ast.g:880:51: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6287);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:880:64: ( secondPart )?
                    int alt328=2;
                    int LA328_0 = input.LA(1);

                    if ( (LA328_0==SECOND_PART) ) {
                        alt328=1;
                    }
                    switch (alt328) {
                        case 1 :
                            // EsperEPL2Ast.g:880:65: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6292);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:880:78: ( millisecondPart )?
                    int alt329=2;
                    int LA329_0 = input.LA(1);

                    if ( (LA329_0==MILLISECOND_PART) ) {
                        alt329=1;
                    }
                    switch (alt329) {
                        case 1 :
                            // EsperEPL2Ast.g:880:79: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6297);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:881:5: weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_weekPart_in_timePeriodDef6305);
                    weekPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:881:14: ( dayPart )?
                    int alt330=2;
                    int LA330_0 = input.LA(1);

                    if ( (LA330_0==DAY_PART) ) {
                        alt330=1;
                    }
                    switch (alt330) {
                        case 1 :
                            // EsperEPL2Ast.g:881:15: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef6308);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:881:25: ( hourPart )?
                    int alt331=2;
                    int LA331_0 = input.LA(1);

                    if ( (LA331_0==HOUR_PART) ) {
                        alt331=1;
                    }
                    switch (alt331) {
                        case 1 :
                            // EsperEPL2Ast.g:881:26: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6313);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:881:37: ( minutePart )?
                    int alt332=2;
                    int LA332_0 = input.LA(1);

                    if ( (LA332_0==MINUTE_PART) ) {
                        alt332=1;
                    }
                    switch (alt332) {
                        case 1 :
                            // EsperEPL2Ast.g:881:38: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6318);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:881:51: ( secondPart )?
                    int alt333=2;
                    int LA333_0 = input.LA(1);

                    if ( (LA333_0==SECOND_PART) ) {
                        alt333=1;
                    }
                    switch (alt333) {
                        case 1 :
                            // EsperEPL2Ast.g:881:52: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6323);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:881:65: ( millisecondPart )?
                    int alt334=2;
                    int LA334_0 = input.LA(1);

                    if ( (LA334_0==MILLISECOND_PART) ) {
                        alt334=1;
                    }
                    switch (alt334) {
                        case 1 :
                            // EsperEPL2Ast.g:881:66: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6328);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:882:5: dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_dayPart_in_timePeriodDef6336);
                    dayPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:882:13: ( hourPart )?
                    int alt335=2;
                    int LA335_0 = input.LA(1);

                    if ( (LA335_0==HOUR_PART) ) {
                        alt335=1;
                    }
                    switch (alt335) {
                        case 1 :
                            // EsperEPL2Ast.g:882:14: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6339);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:882:25: ( minutePart )?
                    int alt336=2;
                    int LA336_0 = input.LA(1);

                    if ( (LA336_0==MINUTE_PART) ) {
                        alt336=1;
                    }
                    switch (alt336) {
                        case 1 :
                            // EsperEPL2Ast.g:882:26: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6344);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:882:39: ( secondPart )?
                    int alt337=2;
                    int LA337_0 = input.LA(1);

                    if ( (LA337_0==SECOND_PART) ) {
                        alt337=1;
                    }
                    switch (alt337) {
                        case 1 :
                            // EsperEPL2Ast.g:882:40: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6349);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:882:53: ( millisecondPart )?
                    int alt338=2;
                    int LA338_0 = input.LA(1);

                    if ( (LA338_0==MILLISECOND_PART) ) {
                        alt338=1;
                    }
                    switch (alt338) {
                        case 1 :
                            // EsperEPL2Ast.g:882:54: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6354);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:883:4: hourPart ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_hourPart_in_timePeriodDef6361);
                    hourPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:883:13: ( minutePart )?
                    int alt339=2;
                    int LA339_0 = input.LA(1);

                    if ( (LA339_0==MINUTE_PART) ) {
                        alt339=1;
                    }
                    switch (alt339) {
                        case 1 :
                            // EsperEPL2Ast.g:883:14: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6364);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:883:27: ( secondPart )?
                    int alt340=2;
                    int LA340_0 = input.LA(1);

                    if ( (LA340_0==SECOND_PART) ) {
                        alt340=1;
                    }
                    switch (alt340) {
                        case 1 :
                            // EsperEPL2Ast.g:883:28: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6369);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:883:41: ( millisecondPart )?
                    int alt341=2;
                    int LA341_0 = input.LA(1);

                    if ( (LA341_0==MILLISECOND_PART) ) {
                        alt341=1;
                    }
                    switch (alt341) {
                        case 1 :
                            // EsperEPL2Ast.g:883:42: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6374);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:884:4: minutePart ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_minutePart_in_timePeriodDef6381);
                    minutePart();

                    state._fsp--;

                    // EsperEPL2Ast.g:884:15: ( secondPart )?
                    int alt342=2;
                    int LA342_0 = input.LA(1);

                    if ( (LA342_0==SECOND_PART) ) {
                        alt342=1;
                    }
                    switch (alt342) {
                        case 1 :
                            // EsperEPL2Ast.g:884:16: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6384);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:884:29: ( millisecondPart )?
                    int alt343=2;
                    int LA343_0 = input.LA(1);

                    if ( (LA343_0==MILLISECOND_PART) ) {
                        alt343=1;
                    }
                    switch (alt343) {
                        case 1 :
                            // EsperEPL2Ast.g:884:30: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6389);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:885:4: secondPart ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_secondPart_in_timePeriodDef6396);
                    secondPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:885:15: ( millisecondPart )?
                    int alt344=2;
                    int LA344_0 = input.LA(1);

                    if ( (LA344_0==MILLISECOND_PART) ) {
                        alt344=1;
                    }
                    switch (alt344) {
                        case 1 :
                            // EsperEPL2Ast.g:885:16: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6399);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:886:4: millisecondPart
                    {
                    pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6406);
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
    // EsperEPL2Ast.g:889:1: yearPart : ^( YEAR_PART valueExpr ) ;
    public final void yearPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:890:2: ( ^( YEAR_PART valueExpr ) )
            // EsperEPL2Ast.g:890:4: ^( YEAR_PART valueExpr )
            {
            match(input,YEAR_PART,FOLLOW_YEAR_PART_in_yearPart6420); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_yearPart6422);
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
    // EsperEPL2Ast.g:893:1: monthPart : ^( MONTH_PART valueExpr ) ;
    public final void monthPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:894:2: ( ^( MONTH_PART valueExpr ) )
            // EsperEPL2Ast.g:894:4: ^( MONTH_PART valueExpr )
            {
            match(input,MONTH_PART,FOLLOW_MONTH_PART_in_monthPart6437); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_monthPart6439);
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
    // EsperEPL2Ast.g:897:1: weekPart : ^( WEEK_PART valueExpr ) ;
    public final void weekPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:898:2: ( ^( WEEK_PART valueExpr ) )
            // EsperEPL2Ast.g:898:4: ^( WEEK_PART valueExpr )
            {
            match(input,WEEK_PART,FOLLOW_WEEK_PART_in_weekPart6454); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_weekPart6456);
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
    // EsperEPL2Ast.g:901:1: dayPart : ^( DAY_PART valueExpr ) ;
    public final void dayPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:902:2: ( ^( DAY_PART valueExpr ) )
            // EsperEPL2Ast.g:902:4: ^( DAY_PART valueExpr )
            {
            match(input,DAY_PART,FOLLOW_DAY_PART_in_dayPart6471); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dayPart6473);
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
    // EsperEPL2Ast.g:905:1: hourPart : ^( HOUR_PART valueExpr ) ;
    public final void hourPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:906:2: ( ^( HOUR_PART valueExpr ) )
            // EsperEPL2Ast.g:906:4: ^( HOUR_PART valueExpr )
            {
            match(input,HOUR_PART,FOLLOW_HOUR_PART_in_hourPart6488); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_hourPart6490);
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
    // EsperEPL2Ast.g:909:1: minutePart : ^( MINUTE_PART valueExpr ) ;
    public final void minutePart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:910:2: ( ^( MINUTE_PART valueExpr ) )
            // EsperEPL2Ast.g:910:4: ^( MINUTE_PART valueExpr )
            {
            match(input,MINUTE_PART,FOLLOW_MINUTE_PART_in_minutePart6505); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_minutePart6507);
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
    // EsperEPL2Ast.g:913:1: secondPart : ^( SECOND_PART valueExpr ) ;
    public final void secondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:914:2: ( ^( SECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:914:4: ^( SECOND_PART valueExpr )
            {
            match(input,SECOND_PART,FOLLOW_SECOND_PART_in_secondPart6522); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_secondPart6524);
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
    // EsperEPL2Ast.g:917:1: millisecondPart : ^( MILLISECOND_PART valueExpr ) ;
    public final void millisecondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:918:2: ( ^( MILLISECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:918:4: ^( MILLISECOND_PART valueExpr )
            {
            match(input,MILLISECOND_PART,FOLLOW_MILLISECOND_PART_in_millisecondPart6539); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_millisecondPart6541);
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
    // EsperEPL2Ast.g:921:1: substitution : s= SUBSTITUTION ;
    public final void substitution() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:922:2: (s= SUBSTITUTION )
            // EsperEPL2Ast.g:922:4: s= SUBSTITUTION
            {
            s=(CommonTree)match(input,SUBSTITUTION,FOLLOW_SUBSTITUTION_in_substitution6556); 
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
    // EsperEPL2Ast.g:925:1: constant[boolean isLeaveNode] : (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE );
    public final void constant(boolean isLeaveNode) throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:926:2: (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE )
            int alt346=7;
            switch ( input.LA(1) ) {
            case INT_TYPE:
                {
                alt346=1;
                }
                break;
            case LONG_TYPE:
                {
                alt346=2;
                }
                break;
            case FLOAT_TYPE:
                {
                alt346=3;
                }
                break;
            case DOUBLE_TYPE:
                {
                alt346=4;
                }
                break;
            case STRING_TYPE:
                {
                alt346=5;
                }
                break;
            case BOOL_TYPE:
                {
                alt346=6;
                }
                break;
            case NULL_TYPE:
                {
                alt346=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 346, 0, input);

                throw nvae;
            }

            switch (alt346) {
                case 1 :
                    // EsperEPL2Ast.g:926:4: c= INT_TYPE
                    {
                    c=(CommonTree)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_constant6572); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:927:4: c= LONG_TYPE
                    {
                    c=(CommonTree)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_constant6581); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:928:4: c= FLOAT_TYPE
                    {
                    c=(CommonTree)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_constant6590); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:929:4: c= DOUBLE_TYPE
                    {
                    c=(CommonTree)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_constant6599); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:930:11: c= STRING_TYPE
                    {
                    c=(CommonTree)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_constant6615); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:931:11: c= BOOL_TYPE
                    {
                    c=(CommonTree)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_constant6631); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:932:8: c= NULL_TYPE
                    {
                    c=(CommonTree)match(input,NULL_TYPE,FOLLOW_NULL_TYPE_in_constant6644); 
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
    // EsperEPL2Ast.g:935:1: number : ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE );
    public final void number() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:936:2: ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE )
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
    public static final BitSet FOLLOW_CLASS_IDENT_in_annotation94 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0003F80000000038L});
    public static final BitSet FOLLOW_elementValuePair_in_annotation96 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0003F80000000038L});
    public static final BitSet FOLLOW_elementValue_in_annotation99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_VALUE_in_elementValuePair117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_elementValuePair119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0003F80000000018L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_in_elementValue148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_ARRAY_in_elementValue156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elementValue_in_elementValue158 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0003F80000000018L});
    public static final BitSet FOLLOW_constant_in_elementValue169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_elementValue179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDecl204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl206 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_expressionDef_in_expressionDecl208 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_exprCol_in_expressionDecl210 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_expressionDecl213 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COLON_in_expressionDecl218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LBRACK_in_expressionDecl225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionDef242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_expressionDef244 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_expressionDef246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDef254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_expressionDef256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionLambdaDecl270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionLambdaDecl273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_exprCol_in_expressionLambdaDecl277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EPL_EXPR_in_startEPLExpressionRule294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_startEPLExpressionRule297 = new BitSet(new long[]{0x0000000000000000L,0x4800000000000000L,0x0000080000000000L,0x0200B00000000020L,0x0000000100801408L});
    public static final BitSet FOLLOW_expressionDecl_in_startEPLExpressionRule302 = new BitSet(new long[]{0x0000000000000000L,0x4800000000000000L,0x0000080000000000L,0x0200B00000000020L,0x0000000100801408L});
    public static final BitSet FOLLOW_eplExpressionRule_in_startEPLExpressionRule306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_contextExpr_in_eplExpressionRule323 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000080000000000L,0x0200B00000000020L,0x0000000100001400L});
    public static final BitSet FOLLOW_selectExpr_in_eplExpressionRule327 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createWindowExpr_in_eplExpressionRule331 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createIndexExpr_in_eplExpressionRule335 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createVariableExpr_in_eplExpressionRule339 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createSchemaExpr_in_eplExpressionRule343 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_onExpr_in_eplExpressionRule348 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_updateExpr_in_eplExpressionRule352 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createDataflow_in_eplExpressionRule356 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_forExpr_in_eplExpressionRule359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createContextExpr_in_eplExpressionRule366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTEXT_in_contextExpr381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_contextExpr383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_in_onExpr402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onStreamExpr_in_onExpr404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x011E000000000000L});
    public static final BitSet FOLLOW_onDeleteExpr_in_onExpr409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onUpdateExpr_in_onExpr413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSelectExpr_in_onExpr417 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_onSelectInsertExpr_in_onExpr420 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_onSelectInsertOutput_in_onExpr423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSetExpr_in_onExpr430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onMergeExpr_in_onExpr434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_STREAM_in_onStreamExpr456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_onStreamExpr459 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_onStreamExpr464 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_onStreamExpr467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_MERGE_EXPR_in_onMergeExpr485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000030000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000030000L,0x0000000000000010L});
    public static final BitSet FOLLOW_mergeItem_in_onMergeExpr492 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000030000L,0x0000000000000010L});
    public static final BitSet FOLLOW_whereClause_in_onMergeExpr495 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeMatched_in_mergeItem511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mergeUnmatched_in_mergeItem515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_MAT_in_mergeMatched530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeMatchedItem_in_mergeMatched532 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800001C01C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_mergeMatched535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_UPD_in_mergeMatchedItem553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_mergeMatchedItem555 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_DEL_in_mergeMatchedItem571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_INT_TYPE_in_mergeMatchedItem577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeMatchedItem585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_UNM_in_mergeUnmatched599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeUnmatched601 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800001C01C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_mergeUnmatched604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_INS_in_mergeInsert623 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectionList_in_mergeInsert625 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000082000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_mergeInsert627 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_exprCol_in_mergeInsert630 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_mergeInsert633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_EXPR_in_updateExpr653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_updateExpr655 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_updateExpr657 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_onSetAssignment_in_updateExpr660 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_updateExpr663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onDeleteExpr682 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_onDeleteExpr685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_EXPR_in_onSelectExpr705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectExpr707 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DISTINCT_in_onSelectExpr710 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectExpr713 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0030000180000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_onExprFrom_in_onSelectExpr715 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0030000180000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectExpr718 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0030000100000000L});
    public static final BitSet FOLLOW_groupByClause_in_onSelectExpr722 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0020000100000000L});
    public static final BitSet FOLLOW_havingClause_in_onSelectExpr725 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_onSelectExpr728 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_onSelectExpr731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectInsertExpr753 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectInsertExpr755 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectInsertExpr757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_onSelectInsertOutput776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_in_onSetExpr794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr796 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr799 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_onSetExpr803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onUpdateExpr820 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_onSetAssignment_in_onUpdateExpr822 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_onUpdateExpr825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_onSetAssignment842 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_onSetAssignment845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_FROM_in_onExprFrom859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom861 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom864 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createWindowExpr884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_viewListExpr_in_createWindowExpr887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RETAINUNION_in_createWindowExpr891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_createWindowExpr894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_createSelectionList_in_createWindowExpr908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createWindowExpr911 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createColTypeList_in_createWindowExpr940 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createWindowExprInsert_in_createWindowExpr951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_indexColList_in_createIndexExpr977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexColList992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexCol_in_indexColList994 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexCol1009 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_indexCol1011 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_indexCol1013 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_createWindowExprInsert1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createWindowExprInsert1029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList1046 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1048 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000100000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1051 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000100000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1072 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1075 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1094 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_createColTypeListElement1096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createSelectionListElement1141 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_createSelectionListElement1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createVariableExpr1208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1210 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368011L,0x000000000000000CL});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1212 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_createVariableExpr1215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_DATAFLOW_in_createDataflow1240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createDataflow1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200001000L});
    public static final BitSet FOLLOW_gop_in_createDataflow1244 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200001000L});
    public static final BitSet FOLLOW_GOP_in_gop1261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_gop1263 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000009400000008L});
    public static final BitSet FOLLOW_gopParam_in_gop1269 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000009000000008L});
    public static final BitSet FOLLOW_gopOut_in_gop1272 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000008L});
    public static final BitSet FOLLOW_gopDetail_in_gop1275 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_in_gop1279 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_createSchemaExpr_in_gop1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOPPARAM_in_gopParam1303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gopParamItem_in_gopParam1305 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_GOPPARAMITM_in_gopParamItem1319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_gopParamItem1321 = new BitSet(new long[]{0x0000000000020008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_AS_in_gopParamItem1326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_gopParamItem1328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPOUT_in_gopOut1344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gopOutItem_in_gopOut1346 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_GOPOUTITM_in_gopOutItem1360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_gopOutItem1362 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_gopOutTypeParam_in_gopOutItem1364 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_GOPOUTTYP_in_gopOutTypeParam1379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_gopOutTypeParam1383 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_gopOutTypeParam_in_gopOutTypeParam1385 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_QUESTION_in_gopOutTypeParam1391 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPCFG_in_gopDetail1405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gopConfig_in_gopDetail1407 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000030000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GOPCFGITM_in_gopConfig1423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_gopConfig1425 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_gopConfig1427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPCFGEXP_in_gopConfig1438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_gopConfig1440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPCFGEPL_in_gopConfig1451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectExpr_in_gopConfig1453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_jsonvalue1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonobject_in_jsonvalue1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonarray_in_jsonvalue1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSON_OBJECT_in_jsonobject1500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_jsonpair_in_jsonobject1502 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_JSON_ARRAY_in_jsonarray1531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_jsonvalue_in_jsonarray1533 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_JSON_FIELD_in_jsonpair1551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_jsonpair1554 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_IDENT_in_jsonpair1559 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_jsonvalue_in_jsonpair1562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextExpr1582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextExpr1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000005F000000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextExpr1586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1604 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000400000000000L,0x0000000000000004L,0x0000000080000000L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_INIT_in_createContextDetail1613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1615 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000400000000000L,0x0000000000000004L,0x0000000080000000L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_PART_in_createContextDetail1624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextPartitionItem_in_createContextDetail1626 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_CREATE_CTX_CAT_in_createContextDetail1634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCategoryItem_in_createContextDetail1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextDetail1639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_COAL_in_createContextDetail1647 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCoalesceItem_in_createContextDetail1649 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_number_in_createContextDetail1654 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_NESTED_in_createContextDetail1664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1668 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_createContextFilter_in_createContextRangePoint1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_CTX_PATTERN_in_createContextRangePoint1689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_createContextRangePoint1691 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createContextRangePoint1693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_createContextRangePoint1706 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_createContextRangePoint1708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextNested1724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextNested1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000005F000000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextNested1728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_createContextFilter1741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextFilter1743 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createContextFilter1746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_createContextPartitionItem1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextPartitionItem1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createContextPartitionItem1767 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COALESCE_in_createContextCoalesceItem1784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextCoalesceItem1788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createContextCategoryItem1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createContextCategoryItem1808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createSchemaDef_in_createSchemaExpr1828 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1830 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_DEF_in_createSchemaDef1847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaDef1849 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x000000000000A001L});
    public static final BitSet FOLLOW_variantList_in_createSchemaDef1852 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_createColTypeList_in_createSchemaDef1854 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_createSchemaQual_in_createSchemaDef1858 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaQual1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_exprCol_in_createSchemaQual1877 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIANT_LIST_in_variantList1893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_variantList1895 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_insertIntoExpr_in_selectExpr1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_selectClause_in_selectExpr1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_fromClause_in_selectExpr1924 = new BitSet(new long[]{0x0000000000000002L,0x0001200000000000L,0xC030000180000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_matchRecogClause_in_selectExpr1929 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC030000180000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_whereClause_in_selectExpr1936 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC030000100000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_groupByClause_in_selectExpr1944 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC020000100000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_havingClause_in_selectExpr1951 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC020000000000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_outputLimitExpr_in_selectExpr1958 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_selectExpr1965 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_selectExpr1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr1989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_insertIntoExpr1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_insertIntoExpr2000 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_exprCol_in_insertIntoExpr2003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRCOL_in_exprCol2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_exprCol2024 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_exprCol2027 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SELECTION_EXPR_in_selectClause2045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_selectClause2047 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause2060 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_selectClause2063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause2077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause2080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000F400000000000L});
    public static final BitSet FOLLOW_outerJoin_in_fromClause2083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000F400000000000L});
    public static final BitSet FOLLOW_FOR_in_forExpr2103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_forExpr2105 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_forExpr2107 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause2126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPartitionBy_in_matchRecogClause2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_matchRecogMeasures_in_matchRecogClause2135 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0210000000000000L});
    public static final BitSet FOLLOW_ALL_in_matchRecogClause2141 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0210000000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause2147 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0210000000000000L});
    public static final BitSet FOLLOW_matchRecogPattern_in_matchRecogClause2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesInterval_in_matchRecogClause2159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_matchRecogDefine_in_matchRecogClause2165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy2183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogPartitionBy2185 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip2202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2208 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_matchRecogMatchesAfterSkip2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval2231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesInterval2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_timePeriod_in_matchRecogMatchesInterval2235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures2251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures2253 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement2270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogMeasureListElement2272 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMeasureListElement2274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern2294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern2296 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration2319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2323 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat2341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat2343 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0120000000000000L});
    public static final BitSet FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2380 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000288000L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternNested2382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogPatternAtom2413 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000288000L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternAtom2417 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_QUESTION_in_matchRecogPatternAtom2429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogDefineItem_in_matchRecogDefine2453 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogDefineItem2472 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogDefineItem2474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2491 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2494 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_selectionListElement2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_selectionListElement2522 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECTION_STREAM_in_selectionListElement2539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2541 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2568 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2585 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2602 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNERJOIN_EXPR_in_outerJoin2617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2619 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_streamExpression2664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_streamExpression2667 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_streamExpression2672 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_databaseJoinExpression_in_streamExpression2676 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_methodJoinExpression_in_streamExpression2680 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_viewListExpr_in_streamExpression2684 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_streamExpression2689 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_UNIDIRECTIONAL_in_streamExpression2694 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_streamExpression2698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventFilterExpr2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_eventFilterExpr2728 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00001000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_propertyExpression_in_eventFilterExpr2730 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_eventFilterExpr2734 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertyExpressionAtom_in_propertyExpression2756 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SELECT_in_propertyExpressionAtom2779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2781 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000810L});
    public static final BitSet FOLLOW_ATCHAR_in_propertyExpressionAtom2791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertySelectionListElement2838 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2857 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression2881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternInclusionExpression2883 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression2900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_databaseJoinExpression2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2904 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression2912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression2933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_methodJoinExpression2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_methodJoinExpression2937 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_methodJoinExpression2940 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr2957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_VIEW_EXPR_in_viewExpr2974 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr2978 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_viewExpr2981 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_WHERE_EXPR_in_whereClause3003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_whereClause3005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_EXPR_in_groupByClause3023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause3025 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause3028 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_ORDER_BY_EXPR_in_orderByClause3046 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause3048 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause3051 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement3071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_orderByElement3073 = new BitSet(new long[]{0x0600000000000008L});
    public static final BitSet FOLLOW_set_in_orderByElement3075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_EXPR_in_havingClause3098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_havingClause3100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr3118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000780000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_number_in_outputLimitExpr3132 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_outputLimitExpr3134 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3137 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr3157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitExpr3170 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3172 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr3191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_outputLimitExpr3204 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3206 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr3225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3227 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitExpr3238 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0100000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr3240 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3243 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr3262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3275 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0100000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr3277 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3280 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr3296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3298 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitAndTerm3317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitAndTerm3319 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitAndTerm3322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_in_outputLimitAfter3336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitAfter3338 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_number_in_outputLimitAfter3341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause3357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_rowLimitClause3360 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000780000000000L,0x0000000000001010L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause3362 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000780000000000L,0x0000000000001010L});
    public static final BitSet FOLLOW_number_in_rowLimitClause3366 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause3368 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_rowLimitClause3372 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L});
    public static final BitSet FOLLOW_OFFSET_in_rowLimitClause3375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3395 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3397 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3399 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3401 = new BitSet(new long[]{0x0020000037CC23C0L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3403 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_relationalExpr3422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_relationalExpr3437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_relationalExpr3452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_relationalExpr3466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3490 = new BitSet(new long[]{0x0003800037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExprValue3515 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047F07804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3524 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_relationalExprValue3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3557 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3559 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3562 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3578 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3580 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3583 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3599 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3615 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3631 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3647 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXPR_in_evalExprChoice3717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpr_in_evalExprChoice3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3741 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_set_in_equalsSubquery3743 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047F07804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3752 = new BitSet(new long[]{0x0000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_equalsSubquery3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpr3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_substitution_in_valueExpr3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticExpr_in_valueExpr3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_valueExpr3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalExprChoice_in_valueExpr3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinFunc_in_valueExpr3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFuncChain_in_valueExpr3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpr_in_valueExpr3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inExpr_in_valueExpr3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenExpr_in_valueExpr3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeExpr_in_valueExpr3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regExpExpr_in_valueExpr3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpr_in_valueExpr3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectInExpr_in_valueExpr3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectRowExpr_in_valueExpr3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectExistsExpr_in_valueExpr3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpr_in_valueExpr3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_valueExpr3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonarray_in_valueExpr3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonobject_in_valueExpr3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_valueExprWithTime3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LW_in_valueExprWithTime3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime3920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime3922 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_valueExprWithTime3924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rangeOperator_in_valueExprWithTime3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_valueExprWithTime3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lastOperator_in_valueExprWithTime3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekDayOperator_in_valueExprWithTime3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime3963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericParameterList_in_valueExprWithTime3965 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000014L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_NUMBERSETSTAR_in_valueExprWithTime3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timePeriod_in_valueExprWithTime3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_numericParameterList3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeOperator_in_numericParameterList4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_numericParameterList4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator4025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_rangeOperator4028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000040000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator4031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000040000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000040000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_rangeOperator4038 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator4041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator4044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator4065 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_frequencyOperator4068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_frequencyOperator4071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_frequencyOperator4074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_OPERATOR_in_lastOperator4093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_lastOperator4096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_lastOperator4099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_lastOperator4102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator4121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_weekDayOperator4124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_weekDayOperator4127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_weekDayOperator4130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr4151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectGroupExpr4153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr4172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectRowExpr4174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr4193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectExistsExpr4195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr4214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr4216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr4230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr4232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr4253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectInQueryExpr4255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTINCT_in_subQueryExpr4271 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_subQueryExpr4274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_subSelectFilterExpr_in_subQueryExpr4276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_subQueryExpr4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_subSelectFilterExpr4297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_subSelectFilterExpr4299 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_viewListExpr_in_subSelectFilterExpr4303 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_subSelectFilterExpr4308 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_RETAINUNION_in_subSelectFilterExpr4312 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr4315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_in_caseExpr4335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr4338 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_CASE2_in_caseExpr4351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr4354 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_IN_SET_in_inExpr4374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_set_in_inExpr4378 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4384 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368049L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4387 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368049L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_inExpr4391 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SET_in_inExpr4406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_set_in_inExpr4410 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4416 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368049L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4419 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368049L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_inExpr4423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_RANGE_in_inExpr4438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_set_in_inExpr4442 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4448 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_inExpr4452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_RANGE_in_inExpr4467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_set_in_inExpr4471 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4477 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_inExpr4481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenExpr4504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4506 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4508 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenExpr4521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4523 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4525 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4528 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_LIKE_in_likeExpr4548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4550 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4552 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeExpr4568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4570 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4572 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEXP_in_regExpExpr4594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4596 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_REGEXP_in_regExpExpr4609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4611 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_builtinFunc4632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4635 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4639 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_builtinFunc4653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4656 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4660 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_builtinFunc4674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4678 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4682 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4686 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIAN_in_builtinFunc4698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4701 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4705 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STDDEV_in_builtinFunc4719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4722 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4726 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVEDEV_in_builtinFunc4740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4743 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4747 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_AGGREG_in_builtinFunc4761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4764 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000003C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4768 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIRST_AGGREG_in_builtinFunc4783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4786 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000003C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4790 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_AGGREG_in_builtinFunc4805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4808 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtinFunc4825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4827 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4829 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4832 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_PREVIOUS_in_builtinFunc4847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4849 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSTAIL_in_builtinFunc4864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4866 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSCOUNT_in_builtinFunc4881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4883 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSWINDOW_in_builtinFunc4895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRIOR_in_builtinFunc4909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_INT_in_builtinFunc4913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_builtinFunc4928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4932 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4935 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TYPEOF_in_builtinFunc4949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_builtinFunc4963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc4967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_builtinFunc4979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc4981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc4993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr5010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_aggregationFilterExpr5012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_AGG_in_accessValueExpr5026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessValueExprChoice_in_accessValueExpr5028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice5050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice5052 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice5054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_accessValueExprChoice5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_EXPR_in_arrayExpr5076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arrayExpr5079 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_PLUS_in_arithmeticExpr5100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5102 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arithmeticExpr5116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5118 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_arithmeticExpr5132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5134 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_arithmeticExpr5147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5149 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_arithmeticExpr5163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5165 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_arithmeticExpr5178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5180 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_arithmeticExpr5193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5195 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_arithmeticExpr5208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5210 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_arithmeticExpr5224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5226 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5228 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5231 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_DOT_EXPR_in_dotExpr5251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dotExpr5253 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_dotExpr5255 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NEWKW_in_newExpr5273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_newAssign_in_newExpr5275 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NEW_ITEM_in_newAssign5291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_newAssign5293 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_newAssign5296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain5314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libFuncChain5316 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_libOrPropFunction_in_libFuncChain5318 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LIB_FUNCTION_in_libFunctionWithClass5338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_libFunctionWithClass5341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_libFunctionWithClass5345 = new BitSet(new long[]{0x0020400037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368421L,0x000000000000000CL});
    public static final BitSet FOLLOW_DISTINCT_in_libFunctionWithClass5348 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368421L,0x000000000000000CL});
    public static final BitSet FOLLOW_libFunctionArgItem_in_libFunctionWithClass5352 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368421L,0x000000000000000CL});
    public static final BitSet FOLLOW_LPAREN_in_libFunctionWithClass5355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_libFunctionArgItem5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExprWithTime_in_libFunctionArgItem5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_libOrPropFunction5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libOrPropFunction5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_startPatternExpressionRule5413 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_exprChoice_in_startPatternExpressionRule5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicExpr_in_exprChoice5431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternOp_in_exprChoice5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_EXPR_in_exprChoice5446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5462 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distinctExpressions_in_exprChoice5464 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5466 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5482 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_EXPR_in_exprChoice5496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5498 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368011L,0x000000000000000CL});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5503 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_exprChoice5505 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_exprChoice5510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchUntilRange_in_exprChoice5526 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5529 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_distinctExpressions5554 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5577 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5580 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OR_EXPR_in_patternOp5596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5598 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5600 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5603 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_AND_EXPR_in_patternOp5619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5621 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5623 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5626 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5647 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_followedByItem5649 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_followedByItem5652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternFilterExpr_in_atomicExpr5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSERVER_EXPR_in_atomicExpr5678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5682 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExprWithTime_in_atomicExpr5684 = new BitSet(new long[]{0x0020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x8003F800000001C4L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterExpr5706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_patternFilterExpr5709 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00001000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368801L,0x000000000000000CL});
    public static final BitSet FOLLOW_propertyExpression_in_patternFilterExpr5711 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368801L,0x000000000000000CL});
    public static final BitSet FOLLOW_patternFilterAnno_in_patternFilterExpr5714 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_patternFilterExpr5718 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_ATCHAR_in_patternFilterAnno5738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterAnno5740 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000780000000000L});
    public static final BitSet FOLLOW_number_in_patternFilterAnno5742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5759 = new BitSet(new long[]{0x0000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_PARAM_in_filterParam5803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5805 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5808 = new BitSet(new long[]{0x0000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x8003F800000001C0L,0x00000003B3368001L,0x000000000000000CL});
    public static final BitSet FOLLOW_EQUALS_in_filterParamComparator5824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5826 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_filterParamComparator5833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5835 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_filterParamComparator5842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_filterParamComparator5851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_filterParamComparator5860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_filterParamComparator5869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator5878 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator5911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_IN_in_filterParamComparator5944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator5978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator5980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator5994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator5997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator6012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator6033 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_filterAtom6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterAtom6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier6077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_filterIdentifier6079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_filterIdentifier6081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr6100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6102 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6105 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic6124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic6133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic6137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic6144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic6148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic6161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic6170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic6174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic6181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic6185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_PERIOD_in_timePeriod6210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriodDef_in_timePeriod6212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_yearPart_in_timePeriodDef6228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007F0000L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef6231 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef6236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6246 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef6269 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef6272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef6305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6336 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6339 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6381 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_PART_in_yearPart6420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_yearPart6422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_PART_in_monthPart6437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_monthPart6439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEK_PART_in_weekPart6454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_weekPart6456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_PART_in_dayPart6471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dayPart6473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOUR_PART_in_hourPart6488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_hourPart6490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTE_PART_in_minutePart6505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_minutePart6507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_PART_in_secondPart6522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_secondPart6524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MILLISECOND_PART_in_millisecondPart6539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_millisecondPart6541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTITUTION_in_substitution6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_constant6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_constant6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_constant6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_constant6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_constant6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_constant6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_TYPE_in_constant6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_number0 = new BitSet(new long[]{0x0000000000000002L});

}