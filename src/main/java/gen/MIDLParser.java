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
		K_UINT64=14, K_CHAR=15, K_STRING=16, K_FLOAT=17, K_DOUBLE=18, K_TRUE=19, 
		K_FALSE=20, LEFT_BRACE=21, LEFT_SQUARE_BRACKET=22, RIGHT_BRACE=23, RIGHT_SQUARE_BRACKET=24, 
		SEMI_COLON=25, COMMAS=26, PLUS=27, MINUS=28, SLASH=29, STAR=30, PERCENT=31, 
		GT2=32, LT2=33, EQUAL=34, AMP=35, OR=36, WAVE=37, POWER=38, COLON=39, 
		COLON_2=40, FORMATER=41, LETTER=42, DIGIT=43, UNDERLINE=44, INTEGER_TYPE_SUFFIX=45, 
		INTEGER=46, EXPONENT=47, FLOAT_TYPE_SUFFIX=48, FLOATING_PT=49, ESCAPE_SEQUENCE=50, 
		CHAR=51, STRING=52, BOOLEAN=53, ID=54;
	public static final int
		RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_type_decl = 3, 
		RULE_struct_type = 4, RULE_member_list = 5, RULE_declarators = 6, RULE_declarator = 7, 
		RULE_array_declarator = 8, RULE_or_expr = 9, RULE_xor_expr = 10, RULE_and_expr = 11, 
		RULE_shift_expr = 12, RULE_add_expr = 13, RULE_multi_expr = 14, RULE_unary_expr = 15, 
		RULE_literal = 16, RULE_exp_list = 17, RULE_simple_declarator = 18, RULE_type_spec = 19, 
		RULE_base_type_spec = 20, RULE_integer_type = 21, RULE_unsigned_int = 22, 
		RULE_signed_int = 23, RULE_float_pt_type = 24, RULE_scoped_name = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "definition", "module", "type_decl", "struct_type", 
			"member_list", "declarators", "declarator", "array_declarator", "or_expr", 
			"xor_expr", "and_expr", "shift_expr", "add_expr", "multi_expr", "unary_expr", 
			"literal", "exp_list", "simple_declarator", "type_spec", "base_type_spec", 
			"integer_type", "unsigned_int", "signed_int", "float_pt_type", "scoped_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'{'", "'['", "'}'", 
			"']'", "';'", "','", "'+'", "'-'", "'/'", "'*'", "'%'", null, null, "'='", 
			"'&'", "'|'", "'~'", "'^'", "':'", null, null, null, null, "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "K_MODULE", "K_STRUCT", "K_BOOLEAN", "K_SHORT", "K_LONG", "K_UNSIGNED", 
			"K_INT8", "K_INT16", "K_INT32", "K_INT64", "K_UINT8", "K_UINT16", "K_UINT32", 
			"K_UINT64", "K_CHAR", "K_STRING", "K_FLOAT", "K_DOUBLE", "K_TRUE", "K_FALSE", 
			"LEFT_BRACE", "LEFT_SQUARE_BRACKET", "RIGHT_BRACE", "RIGHT_SQUARE_BRACKET", 
			"SEMI_COLON", "COMMAS", "PLUS", "MINUS", "SLASH", "STAR", "PERCENT", 
			"GT2", "LT2", "EQUAL", "AMP", "OR", "WAVE", "POWER", "COLON", "COLON_2", 
			"FORMATER", "LETTER", "DIGIT", "UNDERLINE", "INTEGER_TYPE_SUFFIX", "INTEGER", 
			"EXPONENT", "FLOAT_TYPE_SUFFIX", "FLOATING_PT", "ESCAPE_SEQUENCE", "CHAR", 
			"STRING", "BOOLEAN", "ID"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			definition();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MODULE || _la==K_STRUCT) {
				{
				{
				setState(53);
				definition();
				}
				}
				setState(58);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
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
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(MIDLParser.RIGHT_BRACE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
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
			setState(70);
			definition();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MODULE || _la==K_STRUCT) {
				{
				{
				setState(71);
				definition();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
	 
		public Type_declContext() { }
		public void copyFrom(Type_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStructContext extends Type_declContext {
		public TerminalNode K_STRUCT() { return getToken(MIDLParser.K_STRUCT, 0); }
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public EmptyStructContext(Type_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterEmptyStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitEmptyStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitEmptyStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexStructContext extends Type_declContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public ComplexStructContext(Type_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterComplexStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitComplexStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitComplexStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_decl);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ComplexStructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				struct_type();
				}
				break;
			case 2:
				_localctx = new EmptyStructContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(K_STRUCT);
				setState(81);
				match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(K_STRUCT);
			setState(85);
			match(ID);
			setState(86);
			match(LEFT_BRACE);
			setState(87);
			member_list();
			setState(88);
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
		public List<Type_specContext> type_spec() {
			return getRuleContexts(Type_specContext.class);
		}
		public Type_specContext type_spec(int i) {
			return getRuleContext(Type_specContext.class,i);
		}
		public List<DeclaratorsContext> declarators() {
			return getRuleContexts(DeclaratorsContext.class);
		}
		public DeclaratorsContext declarators(int i) {
			return getRuleContext(DeclaratorsContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MIDLParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MIDLParser.SEMI_COLON, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitMember_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_STRUCT) | (1L << K_BOOLEAN) | (1L << K_SHORT) | (1L << K_LONG) | (1L << K_UNSIGNED) | (1L << K_INT8) | (1L << K_INT16) | (1L << K_INT32) | (1L << K_INT64) | (1L << K_UINT8) | (1L << K_UINT16) | (1L << K_UINT32) | (1L << K_UINT64) | (1L << K_CHAR) | (1L << K_STRING) | (1L << K_FLOAT) | (1L << K_DOUBLE) | (1L << COLON_2) | (1L << ID))) != 0)) {
				{
				{
				setState(90);
				type_spec();
				setState(91);
				declarators();
				setState(92);
				match(SEMI_COLON);
				}
				}
				setState(98);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorsContext declarators() throws RecognitionException {
		DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			declarator();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAS) {
				{
				{
				setState(100);
				match(COMMAS);
				setState(101);
				declarator();
				}
				}
				setState(106);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarator);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				simple_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitArray_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declaratorContext array_declarator() throws RecognitionException {
		Array_declaratorContext _localctx = new Array_declaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(LEFT_SQUARE_BRACKET);
			setState(113);
			or_expr();
			setState(114);
			match(RIGHT_SQUARE_BRACKET);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(115);
				match(EQUAL);
				setState(116);
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
		public List<TerminalNode> OR() { return getTokens(MIDLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MIDLParser.OR, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitOr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_or_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			xor_expr();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(120);
				match(OR);
				setState(121);
				xor_expr();
				}
				}
				setState(126);
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

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> POWER() { return getTokens(MIDLParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(MIDLParser.POWER, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			and_expr();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POWER) {
				{
				{
				setState(128);
				match(POWER);
				setState(129);
				and_expr();
				}
				}
				setState(134);
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(MIDLParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(MIDLParser.AMP, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			shift_expr();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(136);
				match(AMP);
				setState(137);
				shift_expr();
				}
				}
				setState(142);
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

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Add_exprContext> add_expr() {
			return getRuleContexts(Add_exprContext.class);
		}
		public Add_exprContext add_expr(int i) {
			return getRuleContext(Add_exprContext.class,i);
		}
		public List<TerminalNode> GT2() { return getTokens(MIDLParser.GT2); }
		public TerminalNode GT2(int i) {
			return getToken(MIDLParser.GT2, i);
		}
		public List<TerminalNode> LT2() { return getTokens(MIDLParser.LT2); }
		public TerminalNode LT2(int i) {
			return getToken(MIDLParser.LT2, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			add_expr();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT2 || _la==LT2) {
				{
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==GT2 || _la==LT2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				add_expr();
				}
				}
				setState(150);
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

	public static class Add_exprContext extends ParserRuleContext {
		public List<Multi_exprContext> multi_expr() {
			return getRuleContexts(Multi_exprContext.class);
		}
		public Multi_exprContext multi_expr(int i) {
			return getRuleContext(Multi_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MIDLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MIDLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MIDLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MIDLParser.MINUS, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_add_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			multi_expr();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				multi_expr();
				}
				}
				setState(158);
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

	public static class Multi_exprContext extends ParserRuleContext {
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(MIDLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(MIDLParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(MIDLParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MIDLParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(MIDLParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(MIDLParser.PERCENT, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitMulti_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_exprContext multi_expr() throws RecognitionException {
		Multi_exprContext _localctx = new Multi_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multi_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			unary_expr();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(160);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				unary_expr();
				}
				}
				setState(166);
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

	public static class Unary_exprContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << WAVE))) != 0)) {
				{
				setState(167);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << WAVE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(170);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_PT) | (1L << CHAR) | (1L << STRING) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitExp_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LEFT_SQUARE_BRACKET);
			setState(175);
			or_expr();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAS) {
				{
				{
				setState(176);
				match(COMMAS);
				setState(177);
				or_expr();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitSimple_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(186);
				match(EQUAL);
				setState(187);
				or_expr();
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

	public static class Type_specContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitType_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type_spec);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON_2:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				scoped_name();
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
				setState(191);
				base_type_spec();
				}
				break;
			case K_STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				struct_type();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitBase_type_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_type_specContext base_type_spec() throws RecognitionException {
		Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_base_type_spec);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				float_pt_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				integer_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(K_CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(K_STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(K_BOOLEAN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitInteger_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_integer_type);
		try {
			setState(204);
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
				setState(202);
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
				setState(203);
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
	public static class Uint64Context extends Unsigned_intContext {
		public TerminalNode K_UNSIGNED() { return getToken(MIDLParser.K_UNSIGNED, 0); }
		public List<TerminalNode> K_LONG() { return getTokens(MIDLParser.K_LONG); }
		public TerminalNode K_LONG(int i) {
			return getToken(MIDLParser.K_LONG, i);
		}
		public TerminalNode K_UINT64() { return getToken(MIDLParser.K_UINT64, 0); }
		public Uint64Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUint64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUint64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitUint64(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint32Context extends Unsigned_intContext {
		public TerminalNode K_UNSIGNED() { return getToken(MIDLParser.K_UNSIGNED, 0); }
		public TerminalNode K_LONG() { return getToken(MIDLParser.K_LONG, 0); }
		public TerminalNode K_UINT32() { return getToken(MIDLParser.K_UINT32, 0); }
		public Uint32Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUint32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUint32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitUint32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint8Context extends Unsigned_intContext {
		public TerminalNode K_UINT8() { return getToken(MIDLParser.K_UINT8, 0); }
		public Uint8Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUint8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUint8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitUint8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint16Context extends Unsigned_intContext {
		public TerminalNode K_UNSIGNED() { return getToken(MIDLParser.K_UNSIGNED, 0); }
		public TerminalNode K_SHORT() { return getToken(MIDLParser.K_SHORT, 0); }
		public TerminalNode K_UINT16() { return getToken(MIDLParser.K_UINT16, 0); }
		public Uint16Context(Unsigned_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterUint16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitUint16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitUint16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_intContext unsigned_int() throws RecognitionException {
		Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unsigned_int);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Uint16Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNSIGNED:
					{
					setState(206);
					match(K_UNSIGNED);
					setState(207);
					match(K_SHORT);
					}
					break;
				case K_UINT16:
					{
					setState(208);
					match(K_UINT16);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new Uint32Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNSIGNED:
					{
					setState(211);
					match(K_UNSIGNED);
					setState(212);
					match(K_LONG);
					}
					break;
				case K_UINT32:
					{
					setState(213);
					match(K_UINT32);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new Uint64Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNSIGNED:
					{
					setState(216);
					match(K_UNSIGNED);
					setState(217);
					match(K_LONG);
					setState(218);
					match(K_LONG);
					}
					break;
				case K_UINT64:
					{
					setState(219);
					match(K_UINT64);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new Uint8Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
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
	public static class Int32Context extends Signed_intContext {
		public TerminalNode K_LONG() { return getToken(MIDLParser.K_LONG, 0); }
		public TerminalNode K_INT32() { return getToken(MIDLParser.K_INT32, 0); }
		public Int32Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterInt32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitInt32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitInt32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int64Context extends Signed_intContext {
		public List<TerminalNode> K_LONG() { return getTokens(MIDLParser.K_LONG); }
		public TerminalNode K_LONG(int i) {
			return getToken(MIDLParser.K_LONG, i);
		}
		public TerminalNode K_INT64() { return getToken(MIDLParser.K_INT64, 0); }
		public Int64Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterInt64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitInt64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitInt64(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int8Context extends Signed_intContext {
		public TerminalNode K_INT8() { return getToken(MIDLParser.K_INT8, 0); }
		public Int8Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterInt8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitInt8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitInt8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int16Context extends Signed_intContext {
		public TerminalNode K_SHORT() { return getToken(MIDLParser.K_SHORT, 0); }
		public TerminalNode K_INT16() { return getToken(MIDLParser.K_INT16, 0); }
		public Int16Context(Signed_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterInt16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitInt16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitInt16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_intContext signed_int() throws RecognitionException {
		Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signed_int);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Int16Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
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
				_localctx = new Int32Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
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
				_localctx = new Int64Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LONG:
					{
					setState(227);
					match(K_LONG);
					setState(228);
					match(K_LONG);
					}
					break;
				case K_INT64:
					{
					setState(229);
					match(K_INT64);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new Int8Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
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
		public Float_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_pt_type; }
	 
		public Float_pt_typeContext() { }
		public void copyFrom(Float_pt_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleContext extends Float_pt_typeContext {
		public TerminalNode K_DOUBLE() { return getToken(MIDLParser.K_DOUBLE, 0); }
		public DoubleContext(Float_pt_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongDoubleContext extends Float_pt_typeContext {
		public TerminalNode K_LONG() { return getToken(MIDLParser.K_LONG, 0); }
		public TerminalNode K_DOUBLE() { return getToken(MIDLParser.K_DOUBLE, 0); }
		public LongDoubleContext(Float_pt_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterLongDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitLongDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitLongDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends Float_pt_typeContext {
		public TerminalNode K_FLOAT() { return getToken(MIDLParser.K_FLOAT, 0); }
		public FloatContext(Float_pt_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLParserListener ) ((MIDLParserListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_pt_typeContext float_pt_type() throws RecognitionException {
		Float_pt_typeContext _localctx = new Float_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_float_pt_type);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(K_FLOAT);
				}
				break;
			case K_DOUBLE:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(K_DOUBLE);
				}
				break;
			case K_LONG:
				_localctx = new LongDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(K_LONG);
				setState(238);
				match(K_DOUBLE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLParserVisitor ) return ((MIDLParserVisitor<? extends T>)visitor).visitScoped_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scoped_nameContext scoped_name() throws RecognitionException {
		Scoped_nameContext _localctx = new Scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scoped_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON_2) {
				{
				setState(241);
				match(COLON_2);
				}
			}

			setState(244);
			match(ID);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON_2) {
				{
				{
				{
				setState(245);
				match(COLON_2);
				}
				setState(246);
				match(ID);
				}
				}
				setState(251);
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

	public static final String _serializedATN =
		"\u0004\u00016\u00fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002"+
		"L\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003S\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006g\b\u0006\n\u0006\f\u0006j\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bv\b\b\u0001\t\u0001\t\u0001\t\u0005\t{\b\t\n\t\f\t~"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u0083\b\n\n\n\f\n\u0086\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008b\b\u000b\n\u000b\f\u000b"+
		"\u008e\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0093\b\f\n\f\f\f\u0096"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u009b\b\r\n\r\f\r\u009e\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a3\b\u000e\n\u000e\f\u000e"+
		"\u00a6\t\u000e\u0001\u000f\u0003\u000f\u00a9\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00b3\b\u0011\n\u0011\f\u0011\u00b6\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bd\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c2\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c9\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00cd\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00d2\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00d7\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00dd\b\u0016\u0001\u0016\u0003\u0016\u00e0\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00e7"+
		"\b\u0017\u0001\u0017\u0003\u0017\u00ea\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u00f0\b\u0018\u0001\u0019\u0003\u0019"+
		"\u00f3\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00f8\b"+
		"\u0019\n\u0019\f\u0019\u00fb\t\u0019\u0001\u0019\u0000\u0000\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0007\u0001\u0000 !\u0001\u0000\u001b\u001c\u0001"+
		"\u0000\u001d\u001f\u0002\u0000\u001b\u001c%%\u0003\u0000..1135\u0002\u0000"+
		"\u0004\u0004\b\b\u0002\u0000\u0005\u0005\t\t\u0108\u00004\u0001\u0000"+
		"\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000"+
		"\u0006R\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\n`\u0001\u0000"+
		"\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000"+
		"\u0010o\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014\u007f"+
		"\u0001\u0000\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u008f"+
		"\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u009f"+
		"\u0001\u0000\u0000\u0000\u001e\u00a8\u0001\u0000\u0000\u0000 \u00ac\u0001"+
		"\u0000\u0000\u0000\"\u00ae\u0001\u0000\u0000\u0000$\u00b9\u0001\u0000"+
		"\u0000\u0000&\u00c1\u0001\u0000\u0000\u0000(\u00c8\u0001\u0000\u0000\u0000"+
		"*\u00cc\u0001\u0000\u0000\u0000,\u00df\u0001\u0000\u0000\u0000.\u00e9"+
		"\u0001\u0000\u0000\u00000\u00ef\u0001\u0000\u0000\u00002\u00f2\u0001\u0000"+
		"\u0000\u000048\u0003\u0002\u0001\u000057\u0003\u0002\u0001\u000065\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009\u0001\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u0019\u0000\u0000=B\u0001"+
		"\u0000\u0000\u0000>?\u0003\u0004\u0002\u0000?@\u0005\u0019\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000"+
		"\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0005"+
		"6\u0000\u0000EF\u0005\u0015\u0000\u0000FJ\u0003\u0002\u0001\u0000GI\u0003"+
		"\u0002\u0001\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0017\u0000\u0000N\u0005\u0001"+
		"\u0000\u0000\u0000OS\u0003\b\u0004\u0000PQ\u0005\u0002\u0000\u0000QS\u0005"+
		"6\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\u0007"+
		"\u0001\u0000\u0000\u0000TU\u0005\u0002\u0000\u0000UV\u00056\u0000\u0000"+
		"VW\u0005\u0015\u0000\u0000WX\u0003\n\u0005\u0000XY\u0005\u0017\u0000\u0000"+
		"Y\t\u0001\u0000\u0000\u0000Z[\u0003&\u0013\u0000[\\\u0003\f\u0006\u0000"+
		"\\]\u0005\u0019\u0000\u0000]_\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a\u000b\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"ch\u0003\u000e\u0007\u0000de\u0005\u001a\u0000\u0000eg\u0003\u000e\u0007"+
		"\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\r\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000kn\u0003$\u0012\u0000ln\u0003\u0010\b\u0000mk\u0001"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u000f\u0001\u0000\u0000"+
		"\u0000op\u00056\u0000\u0000pq\u0005\u0016\u0000\u0000qr\u0003\u0012\t"+
		"\u0000ru\u0005\u0018\u0000\u0000st\u0005\"\u0000\u0000tv\u0003\"\u0011"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0011\u0001"+
		"\u0000\u0000\u0000w|\u0003\u0014\n\u0000xy\u0005$\u0000\u0000y{\u0003"+
		"\u0014\n\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0013\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0084\u0003\u0016\u000b\u0000\u0080"+
		"\u0081\u0005&\u0000\u0000\u0081\u0083\u0003\u0016\u000b\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0015"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008c"+
		"\u0003\u0018\f\u0000\u0088\u0089\u0005#\u0000\u0000\u0089\u008b\u0003"+
		"\u0018\f\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0094\u0003\u001a\r\u0000\u0090\u0091\u0007\u0000\u0000"+
		"\u0000\u0091\u0093\u0003\u001a\r\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009c\u0003\u001c\u000e\u0000"+
		"\u0098\u0099\u0007\u0001\u0000\u0000\u0099\u009b\u0003\u001c\u000e\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u001b\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a4\u0003\u001e\u000f\u0000\u00a0\u00a1\u0007\u0002\u0000\u0000"+
		"\u00a1\u00a3\u0003\u001e\u000f\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u001d\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0007\u0003\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003 \u0010\u0000\u00ab"+
		"\u001f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0004\u0000\u0000\u00ad"+
		"!\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0016\u0000\u0000\u00af\u00b4"+
		"\u0003\u0012\t\u0000\u00b0\u00b1\u0005\u001a\u0000\u0000\u00b1\u00b3\u0003"+
		"\u0012\t\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0018\u0000\u0000\u00b8#\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u00056\u0000\u0000\u00ba\u00bb\u0005\"\u0000\u0000"+
		"\u00bb\u00bd\u0003\u0012\t\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd%\u0001\u0000\u0000\u0000\u00be\u00c2"+
		"\u00032\u0019\u0000\u00bf\u00c2\u0003(\u0014\u0000\u00c0\u00c2\u0003\b"+
		"\u0004\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\'\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c9\u00030\u0018\u0000\u00c4\u00c9\u0003*\u0015\u0000\u00c5"+
		"\u00c9\u0005\u000f\u0000\u0000\u00c6\u00c9\u0005\u0010\u0000\u0000\u00c7"+
		"\u00c9\u0005\u0003\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		")\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003.\u0017\u0000\u00cb\u00cd\u0003"+
		",\u0016\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd+\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0006\u0000"+
		"\u0000\u00cf\u00d2\u0005\u0004\u0000\u0000\u00d0\u00d2\u0005\f\u0000\u0000"+
		"\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00e0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0006\u0000\u0000"+
		"\u00d4\u00d7\u0005\u0005\u0000\u0000\u00d5\u00d7\u0005\r\u0000\u0000\u00d6"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00e0\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0006\u0000\u0000\u00d9"+
		"\u00da\u0005\u0005\u0000\u0000\u00da\u00dd\u0005\u0005\u0000\u0000\u00db"+
		"\u00dd\u0005\u000e\u0000\u0000\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0005\u000b\u0000\u0000\u00df\u00d1\u0001\u0000\u0000\u0000\u00df"+
		"\u00d6\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0-\u0001\u0000\u0000\u0000\u00e1\u00ea"+
		"\u0007\u0005\u0000\u0000\u00e2\u00ea\u0007\u0006\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0005\u0000\u0000\u00e4\u00e7\u0005\u0005\u0000\u0000\u00e5\u00e7"+
		"\u0005\n\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005"+
		"\u0007\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000\u0000\u00e9\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea/\u0001\u0000\u0000\u0000\u00eb\u00f0\u0005\u0011"+
		"\u0000\u0000\u00ec\u00f0\u0005\u0012\u0000\u0000\u00ed\u00ee\u0005\u0005"+
		"\u0000\u0000\u00ee\u00f0\u0005\u0012\u0000\u0000\u00ef\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f01\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005(\u0000\u0000"+
		"\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f9\u00056\u0000\u0000\u00f5"+
		"\u00f6\u0005(\u0000\u0000\u00f6\u00f8\u00056\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa3\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u001d8AJR`hmu|\u0084"+
		"\u008c\u0094\u009c\u00a4\u00a8\u00b4\u00bc\u00c1\u00c8\u00cc\u00d1\u00d6"+
		"\u00dc\u00df\u00e6\u00e9\u00ef\u00f2\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}