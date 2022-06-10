// Generated from C:/Users/IFV/Desktop/programming projects/Idea/CompilationPrinciplesExperiment/g4\MIDLParser.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MIDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_MODULE=1, K_STRUCT=2, K_BOOLEAN=3, K_SHORT=4, K_LONG=5, K_UNSIGNED=6, 
		K_INT8=7, K_INT16=8, K_INT32=9, K_INT64=10, K_UINT8=11, K_UINT16=12, K_UINT32=13, 
		K_UINT64=14, K_CHAR=15, K_STRING=16, K_FLOAT=17, K_DOUBLE=18, LEFT_BRACE=19, 
		LEFT_SQUARE_BRACKET=20, RIGHT_BRACE=21, RIGHT_SQUARE_BRACKET=22, SEMI_COLON=23, 
		COMMAS=24, PLUS=25, MINUS=26, SLASH=27, STAR=28, PERCENT=29, GT2=30, LT2=31, 
		EQUAL=32, AMP=33, OR=34, WAVE=35, POWER=36, COLON_2=37, COLON=38, FORMATER=39, 
		INTEGER=40, CHAR=41, STRING=42, BOOLEAN=43, ID=44, FLOATING_PT=45;
	public static final int
		RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_type_decl = 3, 
		RULE_struct_type = 4, RULE_member_list = 5, RULE_member = 6, RULE_declarators = 7, 
		RULE_declarator = 8, RULE_simple_declarator = 9, RULE_array_declarator = 10, 
		RULE_or_expr = 11, RULE_xor_expr = 12, RULE_and_expr = 13, RULE_shift_expr = 14, 
		RULE_add_expr = 15, RULE_multi_expr = 16, RULE_unary_expr = 17, RULE_literal = 18, 
		RULE_exp_list = 19, RULE_type_spec = 20, RULE_base_type_spec = 21, RULE_integer_type = 22, 
		RULE_unsigned_int = 23, RULE_signed_int = 24, RULE_float_pt_type = 25, 
		RULE_scoped_name = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "definition", "module", "type_decl", "struct_type", 
			"member_list", "member", "declarators", "declarator", "simple_declarator", 
			"array_declarator", "or_expr", "xor_expr", "and_expr", "shift_expr", 
			"add_expr", "multi_expr", "unary_expr", "literal", "exp_list", "type_spec", 
			"base_type_spec", "integer_type", "unsigned_int", "signed_int", "float_pt_type", 
			"scoped_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'{'", "'['", "'}'", "']'", 
			"';'", "','", "'+'", "'-'", "'/'", "'*'", "'%'", null, null, "'='", "'&'", 
			"'|'", "'~'", "'^'", null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "K_MODULE", "K_STRUCT", "K_BOOLEAN", "K_SHORT", "K_LONG", "K_UNSIGNED", 
			"K_INT8", "K_INT16", "K_INT32", "K_INT64", "K_UINT8", "K_UINT16", "K_UINT32", 
			"K_UINT64", "K_CHAR", "K_STRING", "K_FLOAT", "K_DOUBLE", "LEFT_BRACE", 
			"LEFT_SQUARE_BRACKET", "RIGHT_BRACE", "RIGHT_SQUARE_BRACKET", "SEMI_COLON", 
			"COMMAS", "PLUS", "MINUS", "SLASH", "STAR", "PERCENT", "GT2", "LT2", 
			"EQUAL", "AMP", "OR", "WAVE", "POWER", "COLON_2", "COLON", "FORMATER", 
			"INTEGER", "CHAR", "STRING", "BOOLEAN", "ID", "FLOATING_PT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MIDLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MIDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				definition();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_MODULE || _la==K_STRUCT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MIDLParser.SEMI_COLON, 0); }
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				type_decl();
				setState(60);
				match(SEMI_COLON);
				}
				break;
			case K_MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				module();
				setState(63);
				match(SEMI_COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode K_MODULE() { return getToken(MIDLParser.K_MODULE, 0); }
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MIDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MIDLParser.RIGHT_BRACE, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(K_MODULE);
			setState(68);
			match(ID);
			setState(69);
			match(LEFT_BRACE);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				definition();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_MODULE || _la==K_STRUCT );
			setState(75);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TerminalNode K_STRUCT() { return getToken(MIDLParser.K_STRUCT, 0); }
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitType_decl(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_decl);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				struct_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78);
				match(K_STRUCT);
				setState(79);
				match(ID);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode K_STRUCT() { return getToken(MIDLParser.K_STRUCT, 0); }
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MIDLParser.LEFT_BRACE, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(MIDLParser.RIGHT_BRACE, 0); }
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterStruct_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitStruct_type(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(K_STRUCT);
			setState(83);
			match(ID);
			setState(84);
			match(LEFT_BRACE);
			setState(85);
			member_list();
			setState(86);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_listContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterMember_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitMember_list(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_STRUCT) | (1L << K_BOOLEAN) | (1L << K_SHORT) | (1L << K_LONG) | (1L << K_UNSIGNED) | (1L << K_INT8) | (1L << K_INT16) | (1L << K_INT32) | (1L << K_INT64) | (1L << K_UINT8) | (1L << K_UINT16) | (1L << K_UINT32) | (1L << K_UINT64) | (1L << K_CHAR) | (1L << K_STRING) | (1L << K_FLOAT) | (1L << K_DOUBLE) | (1L << COLON_2) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				member();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(MIDLParser.SEMI_COLON, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type_spec();
			setState(95);
			declarators();
			setState(96);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorsContext extends ParserRuleContext {
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMAS() { return getTokens(MIDLParser.COMMAS); }
		public TerminalNode COMMAS(int i) {
			return getToken(MIDLParser.COMMAS, i);
		}
		public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitDeclarators(this);
		}
	}

	public final DeclaratorsContext declarators() throws RecognitionException {
		DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			declarator();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAS) {
				{
				{
				setState(99);
				match(COMMAS);
				setState(100);
				declarator();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Array_declaratorContext array_declarator() {
			return getRuleContext(Array_declaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarator);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				simple_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				array_declarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MIDLParser.EQUAL, 0); }
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterSimple_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitSimple_declarator(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(111);
				match(EQUAL);
				setState(112);
				or_expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0); }
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(MIDLParser.EQUAL, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public Array_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterArray_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitArray_declarator(this);
		}
	}

	public final Array_declaratorContext array_declarator() throws RecognitionException {
		Array_declaratorContext _localctx = new Array_declaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(LEFT_SQUARE_BRACKET);
			setState(117);
			or_expr(0);
			setState(118);
			match(RIGHT_SQUARE_BRACKET);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(119);
				match(EQUAL);
				setState(120);
				exp_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_exprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(MIDLParser.OR, 0); }
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterOr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitOr_expr(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		return or_expr(0);
	}

	private Or_exprContext or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Or_exprContext _localctx = new Or_exprContext(_ctx, _parentState);
		Or_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(124);
			xor_expr(0);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(125);
				match(OR);
				setState(126);
				xor_expr(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_or_expr);
					setState(129);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(130);
					match(OR);
					setState(131);
					xor_expr(0);
					}
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(MIDLParser.POWER, 0); }
		public Xor_exprContext xor_expr() {
			return getRuleContext(Xor_exprContext.class,0);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitXor_expr(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		return xor_expr(0);
	}

	private Xor_exprContext xor_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, _parentState);
		Xor_exprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_xor_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			and_expr(0);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(139);
				match(POWER);
				setState(140);
				and_expr(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Xor_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_xor_expr);
					setState(143);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(144);
					match(POWER);
					setState(145);
					and_expr(0);
					}
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public TerminalNode AMP() { return getToken(MIDLParser.AMP, 0); }
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitAnd_expr(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		return and_expr(0);
	}

	private And_exprContext and_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_exprContext _localctx = new And_exprContext(_ctx, _parentState);
		And_exprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			shift_expr(0);
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(153);
				match(AMP);
				setState(154);
				shift_expr(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and_expr);
					setState(157);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(158);
					match(AMP);
					setState(159);
					shift_expr(0);
					}
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Add_exprContext> add_expr() {
			return getRuleContexts(Add_exprContext.class);
		}
		public Add_exprContext add_expr(int i) {
			return getRuleContext(Add_exprContext.class,i);
		}
		public TerminalNode GT2() { return getToken(MIDLParser.GT2, 0); }
		public TerminalNode LT2() { return getToken(MIDLParser.LT2, 0); }
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitShift_expr(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		return shift_expr(0);
	}

	private Shift_exprContext shift_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, _parentState);
		Shift_exprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_shift_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			add_expr(0);
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==GT2 || _la==LT2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				add_expr(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Shift_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
					setState(171);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(172);
					_la = _input.LA(1);
					if ( !(_la==GT2 || _la==LT2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(173);
					add_expr(0);
					}
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Add_exprContext extends ParserRuleContext {
		public List<Multi_exprContext> multi_expr() {
			return getRuleContexts(Multi_exprContext.class);
		}
		public Multi_exprContext multi_expr(int i) {
			return getRuleContext(Multi_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MIDLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MIDLParser.MINUS, 0); }
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitAdd_expr(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		return add_expr(0);
	}

	private Add_exprContext add_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Add_exprContext _localctx = new Add_exprContext(_ctx, _parentState);
		Add_exprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_add_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			multi_expr(0);
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				multi_expr(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Add_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_add_expr);
					setState(185);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(186);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(187);
					multi_expr(0);
					}
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Multi_exprContext extends ParserRuleContext {
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(MIDLParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(MIDLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(MIDLParser.PERCENT, 0); }
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public Multi_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterMulti_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitMulti_expr(this);
		}
	}

	public final Multi_exprContext multi_expr() throws RecognitionException {
		return multi_expr(0);
	}

	private Multi_exprContext multi_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multi_exprContext _localctx = new Multi_exprContext(_ctx, _parentState);
		Multi_exprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_multi_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			unary_expr();
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(195);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				unary_expr();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Multi_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multi_expr);
					setState(199);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(200);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(201);
					unary_expr();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_exprContext extends ParserRuleContext {
		public Token op;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(MIDLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(MIDLParser.PLUS, 0); }
		public TerminalNode WAVE() { return getToken(MIDLParser.WAVE, 0); }
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUnary_expr(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << WAVE))) != 0)) {
				{
				setState(207);
				((Unary_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << WAVE))) != 0)) ) {
					((Unary_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(210);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Token type;
		public TerminalNode INTEGER() { return getToken(MIDLParser.INTEGER, 0); }
		public TerminalNode FLOATING_PT() { return getToken(MIDLParser.FLOATING_PT, 0); }
		public TerminalNode CHAR() { return getToken(MIDLParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(MIDLParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(MIDLParser.BOOLEAN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((LiteralContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << CHAR) | (1L << STRING) | (1L << BOOLEAN) | (1L << FLOATING_PT))) != 0)) ) {
				((LiteralContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_listContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0); }
		public List<Or_exprContext> or_expr() {
			return getRuleContexts(Or_exprContext.class);
		}
		public Or_exprContext or_expr(int i) {
			return getRuleContext(Or_exprContext.class,i);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMAS() { return getTokens(MIDLParser.COMMAS); }
		public TerminalNode COMMAS(int i) {
			return getToken(MIDLParser.COMMAS, i);
		}
		public Exp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterExp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitExp_list(this);
		}
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(LEFT_SQUARE_BRACKET);
			setState(215);
			or_expr(0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAS) {
				{
				{
				setState(216);
				match(COMMAS);
				setState(217);
				or_expr(0);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(RIGHT_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_spec);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				struct_type();
				}
				break;
			case K_BOOLEAN:
			case K_SHORT:
			case K_LONG:
			case K_UNSIGNED:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_UINT8:
			case K_UINT16:
			case K_UINT32:
			case K_UINT64:
			case K_CHAR:
			case K_STRING:
			case K_FLOAT:
			case K_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				base_type_spec();
				}
				break;
			case COLON_2:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				scoped_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_type_specContext extends ParserRuleContext {
		public Token type;
		public Float_pt_typeContext float_pt_type() {
			return getRuleContext(Float_pt_typeContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public TerminalNode K_CHAR() { return getToken(MIDLParser.K_CHAR, 0); }
		public TerminalNode K_STRING() { return getToken(MIDLParser.K_STRING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(MIDLParser.K_BOOLEAN, 0); }
		public Base_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterBase_type_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitBase_type_spec(this);
		}
	}

	public final Base_type_specContext base_type_spec() throws RecognitionException {
		Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_base_type_spec);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				float_pt_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				integer_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				((Base_type_specContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_BOOLEAN) | (1L << K_CHAR) | (1L << K_STRING))) != 0)) ) {
					((Base_type_specContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typeContext extends ParserRuleContext {
		public Signed_intContext signed_int() {
			return getRuleContext(Signed_intContext.class,0);
		}
		public Unsigned_intContext unsigned_int() {
			return getRuleContext(Unsigned_intContext.class,0);
		}
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterInteger_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitInteger_type(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_integer_type);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SHORT:
			case K_LONG:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				signed_int();
				}
				break;
			case K_UNSIGNED:
			case K_UINT8:
			case K_UINT16:
			case K_UINT32:
			case K_UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				unsigned_int();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_intContext extends ParserRuleContext {
		public Unsigned_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_int; }
	 
		public Unsigned_intContext() { }
		public void copyFrom(Unsigned_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UINT16Context extends Unsigned_intContext {
		public TerminalNode K_UNSIGNED() { return getToken(MIDLParser.K_UNSIGNED, 0); }
		public TerminalNode K_SHORT() { return getToken(MIDLParser.K_SHORT, 0); }
		public TerminalNode K_UINT16() { return getToken(MIDLParser.K_UINT16, 0); }
		public UINT16Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUINT16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUINT16(this);
		}
	}
	public static class UINT32Context extends Unsigned_intContext {
		public TerminalNode K_UNSIGNED() { return getToken(MIDLParser.K_UNSIGNED, 0); }
		public TerminalNode K_LONG() { return getToken(MIDLParser.K_LONG, 0); }
		public TerminalNode K_UINT32() { return getToken(MIDLParser.K_UINT32, 0); }
		public UINT32Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUINT32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUINT32(this);
		}
	}
	public static class UINT64Context extends Unsigned_intContext {
		public TerminalNode K_UNSIGNED() { return getToken(MIDLParser.K_UNSIGNED, 0); }
		public List<TerminalNode> K_LONG() { return getTokens(MIDLParser.K_LONG); }
		public TerminalNode K_LONG(int i) {
			return getToken(MIDLParser.K_LONG, i);
		}
		public TerminalNode K_UINT64() { return getToken(MIDLParser.K_UINT64, 0); }
		public UINT64Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUINT64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUINT64(this);
		}
	}
	public static class UINT8Context extends Unsigned_intContext {
		public TerminalNode K_UINT8() { return getToken(MIDLParser.K_UINT8, 0); }
		public UINT8Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUINT8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUINT8(this);
		}
	}

	public final Unsigned_intContext unsigned_int() throws RecognitionException {
		Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unsigned_int);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new UINT16Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNSIGNED:
					{
					setState(239);
					match(K_UNSIGNED);
					setState(240);
					match(K_SHORT);
					}
					break;
				case K_UINT16:
					{
					setState(241);
					match(K_UINT16);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new UINT32Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNSIGNED:
					{
					setState(244);
					match(K_UNSIGNED);
					setState(245);
					match(K_LONG);
					}
					break;
				case K_UINT32:
					{
					setState(246);
					match(K_UINT32);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new UINT64Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNSIGNED:
					{
					setState(249);
					match(K_UNSIGNED);
					setState(250);
					match(K_LONG);
					setState(251);
					match(K_LONG);
					}
					break;
				case K_UINT64:
					{
					setState(252);
					match(K_UINT64);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new UINT8Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(K_UINT8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_intContext extends ParserRuleContext {
		public Signed_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int; }
	 
		public Signed_intContext() { }
		public void copyFrom(Signed_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class INT64Context extends Signed_intContext {
		public List<TerminalNode> K_LONG() { return getTokens(MIDLParser.K_LONG); }
		public TerminalNode K_LONG(int i) {
			return getToken(MIDLParser.K_LONG, i);
		}
		public TerminalNode K_INT64() { return getToken(MIDLParser.K_INT64, 0); }
		public INT64Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterINT64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitINT64(this);
		}
	}
	public static class INT32Context extends Signed_intContext {
		public TerminalNode K_LONG() { return getToken(MIDLParser.K_LONG, 0); }
		public TerminalNode K_INT32() { return getToken(MIDLParser.K_INT32, 0); }
		public INT32Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterINT32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitINT32(this);
		}
	}
	public static class INT8Context extends Signed_intContext {
		public TerminalNode K_INT8() { return getToken(MIDLParser.K_INT8, 0); }
		public INT8Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterINT8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitINT8(this);
		}
	}
	public static class INT16Context extends Signed_intContext {
		public TerminalNode K_SHORT() { return getToken(MIDLParser.K_SHORT, 0); }
		public TerminalNode K_INT16() { return getToken(MIDLParser.K_INT16, 0); }
		public INT16Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterINT16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitINT16(this);
		}
	}

	public final Signed_intContext signed_int() throws RecognitionException {
		Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_signed_int);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new INT16Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				_la = _input.LA(1);
				if ( !(_la==K_SHORT || _la==K_INT16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new INT32Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==K_LONG || _la==K_INT32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new INT64Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LONG:
					{
					setState(260);
					match(K_LONG);
					setState(261);
					match(K_LONG);
					}
					break;
				case K_INT64:
					{
					setState(262);
					match(K_INT64);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new INT8Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(K_INT8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_pt_typeContext extends ParserRuleContext {
		public TerminalNode K_FLOAT() { return getToken(MIDLParser.K_FLOAT, 0); }
		public TerminalNode K_DOUBLE() { return getToken(MIDLParser.K_DOUBLE, 0); }
		public TerminalNode K_LONG() { return getToken(MIDLParser.K_LONG, 0); }
		public Float_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_pt_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterFloat_pt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitFloat_pt_type(this);
		}
	}

	public final Float_pt_typeContext float_pt_type() throws RecognitionException {
		Float_pt_typeContext _localctx = new Float_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_float_pt_type);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(K_FLOAT);
				}
				break;
			case K_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(K_DOUBLE);
				}
				break;
			case K_LONG:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(270);
				match(K_LONG);
				setState(271);
				match(K_DOUBLE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scoped_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MIDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MIDLParser.ID, i);
		}
		public List<TerminalNode> COLON_2() { return getTokens(MIDLParser.COLON_2); }
		public TerminalNode COLON_2(int i) {
			return getToken(MIDLParser.COLON_2, i);
		}
		public Scoped_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterScoped_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitScoped_name(this);
		}
	}

	public final Scoped_nameContext scoped_name() throws RecognitionException {
		Scoped_nameContext _localctx = new Scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_scoped_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON_2) {
				{
				setState(274);
				match(COLON_2);
				}
			}

			setState(277);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON_2) {
				{
				{
				{
				setState(278);
				match(COLON_2);
				}
				setState(279);
				match(ID);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return or_expr_sempred((Or_exprContext)_localctx, predIndex);
		case 12:
			return xor_expr_sempred((Xor_exprContext)_localctx, predIndex);
		case 13:
			return and_expr_sempred((And_exprContext)_localctx, predIndex);
		case 14:
			return shift_expr_sempred((Shift_exprContext)_localctx, predIndex);
		case 15:
			return add_expr_sempred((Add_exprContext)_localctx, predIndex);
		case 16:
			return multi_expr_sempred((Multi_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean or_expr_sempred(Or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean xor_expr_sempred(Xor_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean and_expr_sempred(And_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shift_expr_sempred(Shift_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean add_expr_sempred(Add_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multi_expr_sempred(Multi_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0004\u0000"+
		"8\b\u0000\u000b\u0000\f\u00009\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002H\b\u0002\u000b\u0002\f\u0002"+
		"I\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Q\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0005\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007f\b\u0007\n\u0007\f\u0007i\t\u0007\u0001\b\u0001"+
		"\b\u0003\bm\b\b\u0001\t\u0001\t\u0001\t\u0003\tr\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nz\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0080\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0085\b\u000b\n\u000b\f\u000b\u0088\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u008e\b\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0093\b\f\n\f\f\f\u0096\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u009c\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a1\b\r\n\r\f\r\u00a4\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00aa\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00af\b\u000e\n\u000e"+
		"\f\u000e\u00b2\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b8\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00bd\b\u000f\n\u000f\f\u000f\u00c0\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c6\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00cb\b\u0010\n\u0010\f\u0010\u00ce\t\u0010\u0001\u0011"+
		"\u0003\u0011\u00d1\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00db\b\u0013"+
		"\n\u0013\f\u0013\u00de\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00e5\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00ea\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00ee"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f3\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f8\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00fe\b\u0017\u0001\u0017"+
		"\u0003\u0017\u0101\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0108\b\u0018\u0001\u0018\u0003\u0018\u010b\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0111"+
		"\b\u0019\u0001\u001a\u0003\u001a\u0114\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0119\b\u001a\n\u001a\f\u001a\u011c\t\u001a\u0001"+
		"\u001a\u0000\u0006\u0016\u0018\u001a\u001c\u001e \u001b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.024\u0000\b\u0001\u0000\u001e\u001f\u0001\u0000\u0019\u001a\u0001"+
		"\u0000\u001b\u001d\u0002\u0000\u0019\u001a##\u0002\u0000(+--\u0002\u0000"+
		"\u0003\u0003\u000f\u0010\u0002\u0000\u0004\u0004\b\b\u0002\u0000\u0005"+
		"\u0005\t\t\u012c\u00007\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000"+
		"\u0000\u0004C\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\b"+
		"R\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000"+
		"\u0000\u000eb\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012"+
		"n\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016{\u0001"+
		"\u0000\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u0097\u0001"+
		"\u0000\u0000\u0000\u001c\u00a5\u0001\u0000\u0000\u0000\u001e\u00b3\u0001"+
		"\u0000\u0000\u0000 \u00c1\u0001\u0000\u0000\u0000\"\u00d0\u0001\u0000"+
		"\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000&\u00d6\u0001\u0000\u0000\u0000"+
		"(\u00e4\u0001\u0000\u0000\u0000*\u00e9\u0001\u0000\u0000\u0000,\u00ed"+
		"\u0001\u0000\u0000\u0000.\u0100\u0001\u0000\u0000\u00000\u010a\u0001\u0000"+
		"\u0000\u00002\u0110\u0001\u0000\u0000\u00004\u0113\u0001\u0000\u0000\u0000"+
		"68\u0003\u0002\u0001\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0001\u0001"+
		"\u0000\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u0017\u0000\u0000"+
		"=B\u0001\u0000\u0000\u0000>?\u0003\u0004\u0002\u0000?@\u0005\u0017\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A>\u0001\u0000"+
		"\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005\u0001\u0000\u0000"+
		"DE\u0005,\u0000\u0000EG\u0005\u0013\u0000\u0000FH\u0003\u0002\u0001\u0000"+
		"GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0015"+
		"\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MQ\u0003\b\u0004\u0000NO\u0005"+
		"\u0002\u0000\u0000OQ\u0005,\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0005\u0002\u0000"+
		"\u0000ST\u0005,\u0000\u0000TU\u0005\u0013\u0000\u0000UV\u0003\n\u0005"+
		"\u0000VW\u0005\u0015\u0000\u0000W\t\u0001\u0000\u0000\u0000XZ\u0003\f"+
		"\u0006\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^_\u0003(\u0014\u0000_`\u0003\u000e\u0007"+
		"\u0000`a\u0005\u0017\u0000\u0000a\r\u0001\u0000\u0000\u0000bg\u0003\u0010"+
		"\b\u0000cd\u0005\u0018\u0000\u0000df\u0003\u0010\b\u0000ec\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h\u000f\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jm\u0003\u0012\t\u0000km\u0003\u0014\n\u0000lj\u0001\u0000\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000m\u0011\u0001\u0000\u0000\u0000nq\u0005"+
		",\u0000\u0000op\u0005 \u0000\u0000pr\u0003\u0016\u000b\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0013\u0001\u0000\u0000\u0000"+
		"st\u0005,\u0000\u0000tu\u0005\u0014\u0000\u0000uv\u0003\u0016\u000b\u0000"+
		"vy\u0005\u0016\u0000\u0000wx\u0005 \u0000\u0000xz\u0003&\u0013\u0000y"+
		"w\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0015\u0001\u0000"+
		"\u0000\u0000{|\u0006\u000b\uffff\uffff\u0000|\u007f\u0003\u0018\f\u0000"+
		"}~\u0005\"\u0000\u0000~\u0080\u0003\u0018\f\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0086\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\n\u0001\u0000\u0000\u0082\u0083\u0005\"\u0000\u0000"+
		"\u0083\u0085\u0003\u0018\f\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085"+
		"\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0017\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0006\f\uffff\uffff\u0000\u008a"+
		"\u008d\u0003\u001a\r\u0000\u008b\u008c\u0005$\u0000\u0000\u008c\u008e"+
		"\u0003\u001a\r\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0094\u0001\u0000\u0000\u0000\u008f\u0090\n\u0001"+
		"\u0000\u0000\u0090\u0091\u0005$\u0000\u0000\u0091\u0093\u0003\u001a\r"+
		"\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0006\r\uffff\uffff\u0000\u0098\u009b\u0003\u001c\u000e"+
		"\u0000\u0099\u009a\u0005!\u0000\u0000\u009a\u009c\u0003\u001c\u000e\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u00a2\u0001\u0000\u0000\u0000\u009d\u009e\n\u0001\u0000\u0000\u009e"+
		"\u009f\u0005!\u0000\u0000\u009f\u00a1\u0003\u001c\u000e\u0000\u00a0\u009d"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u001b"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0006\u000e\uffff\uffff\u0000\u00a6\u00a9\u0003\u001e\u000f\u0000\u00a7"+
		"\u00a8\u0007\u0000\u0000\u0000\u00a8\u00aa\u0003\u001e\u000f\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ab\u00ac\n\u0001\u0000\u0000\u00ac\u00ad"+
		"\u0007\u0000\u0000\u0000\u00ad\u00af\u0003\u001e\u000f\u0000\u00ae\u00ab"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u001d"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0006\u000f\uffff\uffff\u0000\u00b4\u00b7\u0003 \u0010\u0000\u00b5\u00b6"+
		"\u0007\u0001\u0000\u0000\u00b6\u00b8\u0003 \u0010\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00be\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\n\u0001\u0000\u0000\u00ba\u00bb\u0007\u0001"+
		"\u0000\u0000\u00bb\u00bd\u0003 \u0010\u0000\u00bc\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u001f\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u0010\uffff"+
		"\uffff\u0000\u00c2\u00c5\u0003\"\u0011\u0000\u00c3\u00c4\u0007\u0002\u0000"+
		"\u0000\u00c4\u00c6\u0003\"\u0011\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00cc\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\n\u0001\u0000\u0000\u00c8\u00c9\u0007\u0002\u0000\u0000\u00c9"+
		"\u00cb\u0003\"\u0011\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd!\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0007\u0003\u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0003$\u0012\u0000\u00d3#\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0007\u0004\u0000\u0000\u00d5%\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\u0014\u0000\u0000\u00d7\u00dc\u0003\u0016\u000b\u0000"+
		"\u00d8\u00d9\u0005\u0018\u0000\u0000\u00d9\u00db\u0003\u0016\u000b\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005\u0016\u0000\u0000\u00e0\'\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e5\u0003\b\u0004\u0000\u00e2\u00e5\u0003*\u0015\u0000\u00e3\u00e5"+
		"\u00034\u001a\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5)\u0001\u0000"+
		"\u0000\u0000\u00e6\u00ea\u00032\u0019\u0000\u00e7\u00ea\u0003,\u0016\u0000"+
		"\u00e8\u00ea\u0007\u0005\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea+\u0001\u0000\u0000\u0000\u00eb\u00ee\u00030\u0018\u0000\u00ec\u00ee"+
		"\u0003.\u0017\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee-\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0006"+
		"\u0000\u0000\u00f0\u00f3\u0005\u0004\u0000\u0000\u00f1\u00f3\u0005\f\u0000"+
		"\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u0101\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0006\u0000"+
		"\u0000\u00f5\u00f8\u0005\u0005\u0000\u0000\u00f6\u00f8\u0005\r\u0000\u0000"+
		"\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u0101\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0006\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0005\u0000\u0000\u00fb\u00fe\u0005\u0005\u0000\u0000"+
		"\u00fc\u00fe\u0005\u000e\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0005\u000b\u0000\u0000\u0100\u00f2\u0001\u0000\u0000\u0000"+
		"\u0100\u00f7\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101/\u0001\u0000\u0000\u0000\u0102"+
		"\u010b\u0007\u0006\u0000\u0000\u0103\u010b\u0007\u0007\u0000\u0000\u0104"+
		"\u0105\u0005\u0005\u0000\u0000\u0105\u0108\u0005\u0005\u0000\u0000\u0106"+
		"\u0108\u0005\n\u0000\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u010b"+
		"\u0005\u0007\u0000\u0000\u010a\u0102\u0001\u0000\u0000\u0000\u010a\u0103"+
		"\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b1\u0001\u0000\u0000\u0000\u010c\u0111\u0005"+
		"\u0011\u0000\u0000\u010d\u0111\u0005\u0012\u0000\u0000\u010e\u010f\u0005"+
		"\u0005\u0000\u0000\u010f\u0111\u0005\u0012\u0000\u0000\u0110\u010c\u0001"+
		"\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u01113\u0001\u0000\u0000\u0000\u0112\u0114\u0005%\u0000"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u011a\u0005,\u0000\u0000"+
		"\u0116\u0117\u0005%\u0000\u0000\u0117\u0119\u0005,\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b5\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000#9AIP[glqy\u007f"+
		"\u0086\u008d\u0094\u009b\u00a2\u00a9\u00b0\u00b7\u00be\u00c5\u00cc\u00d0"+
		"\u00dc\u00e4\u00e9\u00ed\u00f2\u00f7\u00fd\u0100\u0107\u010a\u0110\u0113"+
		"\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}