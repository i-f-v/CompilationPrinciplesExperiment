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
    static {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            K_MODULE = 1, K_STRUCT = 2, K_BOOLEAN = 3, K_SHORT = 4, K_LONG = 5, K_UNSIGNED = 6,
            K_INT8 = 7, K_INT16 = 8, K_INT32 = 9, K_INT64 = 10, K_UINT8 = 11, K_UINT16 = 12, K_UINT32 = 13,
            K_UINT64 = 14, K_CHAR = 15, K_STRING = 16, K_FLOAT = 17, K_DOUBLE = 18, K_TRUE = 19,
            K_FALSE = 20, LEFT_BRACE = 21, LEFT_SQUARE_BRACKET = 22, RIGHT_BRACE = 23, RIGHT_SQUARE_BRACKET = 24,
            SEMI_COLON = 25, COMMAS = 26, PLUS = 27, MINUS = 28, SLASH = 29, STAR = 30, PERCENT = 31,
            GT2 = 32, LT2 = 33, EQUAL = 34, AMP = 35, OR = 36, WAVE = 37, POWER = 38, COLON = 39,
            COLON_2 = 40, FORMATER = 41, LETTER = 42, DIGIT = 43, UNDERLINE = 44, INTEGER_TYPE_SUFFIX = 45,
            INTEGER = 46, EXPONENT = 47, FLOAT_TYPE_SUFFIX = 48, FLOATING_PT = 49, ESCAPE_SEQUENCE = 50,
            CHAR = 51, STRING = 52, BOOLEAN = 53, ID = 54;
    public static final int
            RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_type_decl = 3,
            RULE_struct_type = 4, RULE_member_list = 5, RULE_declarators = 6, RULE_declarator = 7,
            RULE_array_declarator = 8, RULE_or_expr = 9, RULE_xor_expr = 10, RULE_and_expr = 11,
            RULE_shift_expr = 12, RULE_add_expr = 13, RULE_multi_expr = 14, RULE_unary_expr = 15,
            RULE_literal = 16, RULE_exp_list = 17, RULE_simple_declarator = 18, RULE_type_spec = 19,
            RULE_base_type_spec = 20, RULE_integer_type = 21, RULE_unsigned_int = 22,
            RULE_signed_int = 23, RULE_float_pt_type = 24, RULE_scoped_name = 25;

    private static String[] makeRuleNames() {
        return new String[]{
                "specification", "definition", "module", "type_decl", "struct_type",
                "member_list", "declarators", "declarator", "array_declarator", "or_expr",
                "xor_expr", "and_expr", "shift_expr", "add_expr", "multi_expr", "unary_expr",
                "literal", "exp_list", "simple_declarator", "type_spec", "base_type_spec",
                "integer_type", "unsigned_int", "signed_int", "float_pt_type", "scoped_name"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, "'{'", "'['", "'}'",
                "']'", "';'", "','", "'+'", "'-'", "'/'", "'*'", "'%'", null, null, "'='",
                "'&'", "'|'", "'~'", "'^'", "':'", null, null, null, null, "'_'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
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
    public String getGrammarFileName() {
        return "MIDLParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public MIDLParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class SpecificationContext extends ParserRuleContext {
        public List<DefinitionContext> definition() {
            return getRuleContexts(DefinitionContext.class);
        }

        public DefinitionContext definition(int i) {
            return getRuleContext(DefinitionContext.class, i);
        }

        public SpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_specification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterSpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitSpecification(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitSpecification(this);
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
                setState(53);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(52);
                            definition();
                        }
                    }
                    setState(55);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == K_MODULE || _la == K_STRUCT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DefinitionContext extends ParserRuleContext {
        public Type_declContext type_decl() {
            return getRuleContext(Type_declContext.class, 0);
        }

        public TerminalNode SEMI_COLON() {
            return getToken(MIDLParser.SEMI_COLON, 0);
        }

        public ModuleContext module() {
            return getRuleContext(ModuleContext.class, 0);
        }

        public DefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitDefinition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefinitionContext definition() throws RecognitionException {
        DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_definition);
        try {
            setState(63);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case K_STRUCT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(57);
                    type_decl();
                    setState(58);
                    match(SEMI_COLON);
                }
                break;
                case K_MODULE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(60);
                    module();
                    setState(61);
                    match(SEMI_COLON);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ModuleContext extends ParserRuleContext {
        public TerminalNode K_MODULE() {
            return getToken(MIDLParser.K_MODULE, 0);
        }

        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode LEFT_BRACE() {
            return getToken(MIDLParser.LEFT_BRACE, 0);
        }

        public TerminalNode RIGHT_BRACE() {
            return getToken(MIDLParser.RIGHT_BRACE, 0);
        }

        public List<DefinitionContext> definition() {
            return getRuleContexts(DefinitionContext.class);
        }

        public DefinitionContext definition(int i) {
            return getRuleContext(DefinitionContext.class, i);
        }

        public ModuleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_module;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterModule(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitModule(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitModule(this);
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
                setState(65);
                match(K_MODULE);
                setState(66);
                match(ID);
                setState(67);
                match(LEFT_BRACE);
                setState(69);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(68);
                            definition();
                        }
                    }
                    setState(71);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == K_MODULE || _la == K_STRUCT);
                setState(73);
                match(RIGHT_BRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_declContext extends ParserRuleContext {
        public Struct_typeContext struct_type() {
            return getRuleContext(Struct_typeContext.class, 0);
        }

        public TerminalNode K_STRUCT() {
            return getToken(MIDLParser.K_STRUCT, 0);
        }

        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public Type_declContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_decl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterType_decl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitType_decl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitType_decl(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Type_declContext type_decl() throws RecognitionException {
        Type_declContext _localctx = new Type_declContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_type_decl);
        try {
            setState(78);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(75);
                    struct_type();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(76);
                    match(K_STRUCT);
                    setState(77);
                    match(ID);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Struct_typeContext extends ParserRuleContext {
        public TerminalNode K_STRUCT() {
            return getToken(MIDLParser.K_STRUCT, 0);
        }

        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode LEFT_BRACE() {
            return getToken(MIDLParser.LEFT_BRACE, 0);
        }

        public Member_listContext member_list() {
            return getRuleContext(Member_listContext.class, 0);
        }

        public TerminalNode RIGHT_BRACE() {
            return getToken(MIDLParser.RIGHT_BRACE, 0);
        }

        public Struct_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_struct_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterStruct_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitStruct_type(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitStruct_type(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Struct_typeContext struct_type() throws RecognitionException {
        Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_struct_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(80);
                match(K_STRUCT);
                setState(81);
                match(ID);
                setState(82);
                match(LEFT_BRACE);
                setState(83);
                member_list();
                setState(84);
                match(RIGHT_BRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Member_listContext extends ParserRuleContext {
        public List<Type_specContext> type_spec() {
            return getRuleContexts(Type_specContext.class);
        }

        public Type_specContext type_spec(int i) {
            return getRuleContext(Type_specContext.class, i);
        }

        public List<DeclaratorsContext> declarators() {
            return getRuleContexts(DeclaratorsContext.class);
        }

        public DeclaratorsContext declarators(int i) {
            return getRuleContext(DeclaratorsContext.class, i);
        }

        public List<TerminalNode> SEMI_COLON() {
            return getTokens(MIDLParser.SEMI_COLON);
        }

        public TerminalNode SEMI_COLON(int i) {
            return getToken(MIDLParser.SEMI_COLON, i);
        }

        public Member_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_member_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterMember_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitMember_list(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitMember_list(this);
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
                setState(92);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_STRUCT) | (1L << K_BOOLEAN) | (1L << K_SHORT) | (1L << K_LONG) | (1L << K_UNSIGNED) | (1L << K_INT8) | (1L << K_INT16) | (1L << K_INT32) | (1L << K_INT64) | (1L << K_UINT8) | (1L << K_UINT16) | (1L << K_UINT32) | (1L << K_UINT64) | (1L << K_CHAR) | (1L << K_STRING) | (1L << K_FLOAT) | (1L << K_DOUBLE) | (1L << COLON_2) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(86);
                            type_spec();
                            setState(87);
                            declarators();
                            setState(88);
                            match(SEMI_COLON);
                        }
                    }
                    setState(94);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclaratorsContext extends ParserRuleContext {
        public List<DeclaratorContext> declarator() {
            return getRuleContexts(DeclaratorContext.class);
        }

        public DeclaratorContext declarator(int i) {
            return getRuleContext(DeclaratorContext.class, i);
        }

        public List<TerminalNode> COMMAS() {
            return getTokens(MIDLParser.COMMAS);
        }

        public TerminalNode COMMAS(int i) {
            return getToken(MIDLParser.COMMAS, i);
        }

        public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterDeclarators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitDeclarators(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitDeclarators(this);
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
                setState(95);
                declarator();
                setState(100);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMAS) {
                    {
                        {
                            setState(96);
                            match(COMMAS);
                            setState(97);
                            declarator();
                        }
                    }
                    setState(102);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclaratorContext extends ParserRuleContext {
        public Simple_declaratorContext simple_declarator() {
            return getRuleContext(Simple_declaratorContext.class, 0);
        }

        public Array_declaratorContext array_declarator() {
            return getRuleContext(Array_declaratorContext.class, 0);
        }

        public DeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitDeclarator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitDeclarator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DeclaratorContext declarator() throws RecognitionException {
        DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_declarator);
        try {
            setState(105);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(103);
                    simple_declarator();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(104);
                    array_declarator();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Array_declaratorContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode LEFT_SQUARE_BRACKET() {
            return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0);
        }

        public Or_exprContext or_expr() {
            return getRuleContext(Or_exprContext.class, 0);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET() {
            return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(MIDLParser.EQUAL, 0);
        }

        public Exp_listContext exp_list() {
            return getRuleContext(Exp_listContext.class, 0);
        }

        public Array_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterArray_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitArray_declarator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitArray_declarator(this);
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
                setState(107);
                match(ID);
                setState(108);
                match(LEFT_SQUARE_BRACKET);
                setState(109);
                or_expr();
                setState(110);
                match(RIGHT_SQUARE_BRACKET);
                setState(113);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQUAL) {
                    {
                        setState(111);
                        match(EQUAL);
                        setState(112);
                        exp_list();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Or_exprContext extends ParserRuleContext {
        public List<Xor_exprContext> xor_expr() {
            return getRuleContexts(Xor_exprContext.class);
        }

        public Xor_exprContext xor_expr(int i) {
            return getRuleContext(Xor_exprContext.class, i);
        }

        public List<TerminalNode> OR() {
            return getTokens(MIDLParser.OR);
        }

        public TerminalNode OR(int i) {
            return getToken(MIDLParser.OR, i);
        }

        public Or_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_or_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterOr_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitOr_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitOr_expr(this);
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
                setState(115);
                xor_expr();
                setState(120);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OR) {
                    {
                        {
                            setState(116);
                            match(OR);
                            setState(117);
                            xor_expr();
                        }
                    }
                    setState(122);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xor_exprContext extends ParserRuleContext {
        public List<And_exprContext> and_expr() {
            return getRuleContexts(And_exprContext.class);
        }

        public And_exprContext and_expr(int i) {
            return getRuleContext(And_exprContext.class, i);
        }

        public List<TerminalNode> POWER() {
            return getTokens(MIDLParser.POWER);
        }

        public TerminalNode POWER(int i) {
            return getToken(MIDLParser.POWER, i);
        }

        public Xor_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_xor_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterXor_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitXor_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitXor_expr(this);
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
                setState(123);
                and_expr();
                setState(128);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == POWER) {
                    {
                        {
                            setState(124);
                            match(POWER);
                            setState(125);
                            and_expr();
                        }
                    }
                    setState(130);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class And_exprContext extends ParserRuleContext {
        public List<Shift_exprContext> shift_expr() {
            return getRuleContexts(Shift_exprContext.class);
        }

        public Shift_exprContext shift_expr(int i) {
            return getRuleContext(Shift_exprContext.class, i);
        }

        public List<TerminalNode> AMP() {
            return getTokens(MIDLParser.AMP);
        }

        public TerminalNode AMP(int i) {
            return getToken(MIDLParser.AMP, i);
        }

        public And_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_and_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterAnd_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitAnd_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitAnd_expr(this);
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
                setState(131);
                shift_expr();
                setState(136);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AMP) {
                    {
                        {
                            setState(132);
                            match(AMP);
                            setState(133);
                            shift_expr();
                        }
                    }
                    setState(138);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Shift_exprContext extends ParserRuleContext {
        public List<Add_exprContext> add_expr() {
            return getRuleContexts(Add_exprContext.class);
        }

        public Add_exprContext add_expr(int i) {
            return getRuleContext(Add_exprContext.class, i);
        }

        public List<TerminalNode> GT2() {
            return getTokens(MIDLParser.GT2);
        }

        public TerminalNode GT2(int i) {
            return getToken(MIDLParser.GT2, i);
        }

        public List<TerminalNode> LT2() {
            return getTokens(MIDLParser.LT2);
        }

        public TerminalNode LT2(int i) {
            return getToken(MIDLParser.LT2, i);
        }

        public Shift_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_shift_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterShift_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitShift_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitShift_expr(this);
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
                setState(139);
                add_expr();
                setState(144);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == GT2 || _la == LT2) {
                    {
                        {
                            setState(140);
                            _la = _input.LA(1);
                            if (!(_la == GT2 || _la == LT2)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(141);
                            add_expr();
                        }
                    }
                    setState(146);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Add_exprContext extends ParserRuleContext {
        public List<Multi_exprContext> multi_expr() {
            return getRuleContexts(Multi_exprContext.class);
        }

        public Multi_exprContext multi_expr(int i) {
            return getRuleContext(Multi_exprContext.class, i);
        }

        public List<TerminalNode> PLUS() {
            return getTokens(MIDLParser.PLUS);
        }

        public TerminalNode PLUS(int i) {
            return getToken(MIDLParser.PLUS, i);
        }

        public List<TerminalNode> MINUS() {
            return getTokens(MIDLParser.MINUS);
        }

        public TerminalNode MINUS(int i) {
            return getToken(MIDLParser.MINUS, i);
        }

        public Add_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_add_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterAdd_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitAdd_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitAdd_expr(this);
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
                setState(147);
                multi_expr();
                setState(152);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PLUS || _la == MINUS) {
                    {
                        {
                            setState(148);
                            _la = _input.LA(1);
                            if (!(_la == PLUS || _la == MINUS)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(149);
                            multi_expr();
                        }
                    }
                    setState(154);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Multi_exprContext extends ParserRuleContext {
        public List<Unary_exprContext> unary_expr() {
            return getRuleContexts(Unary_exprContext.class);
        }

        public Unary_exprContext unary_expr(int i) {
            return getRuleContext(Unary_exprContext.class, i);
        }

        public List<TerminalNode> STAR() {
            return getTokens(MIDLParser.STAR);
        }

        public TerminalNode STAR(int i) {
            return getToken(MIDLParser.STAR, i);
        }

        public List<TerminalNode> SLASH() {
            return getTokens(MIDLParser.SLASH);
        }

        public TerminalNode SLASH(int i) {
            return getToken(MIDLParser.SLASH, i);
        }

        public List<TerminalNode> PERCENT() {
            return getTokens(MIDLParser.PERCENT);
        }

        public TerminalNode PERCENT(int i) {
            return getToken(MIDLParser.PERCENT, i);
        }

        public Multi_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multi_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterMulti_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitMulti_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitMulti_expr(this);
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
                setState(155);
                unary_expr();
                setState(160);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) {
                    {
                        {
                            setState(156);
                            _la = _input.LA(1);
                            if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0))) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(157);
                            unary_expr();
                        }
                    }
                    setState(162);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unary_exprContext extends ParserRuleContext {
        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode MINUS() {
            return getToken(MIDLParser.MINUS, 0);
        }

        public TerminalNode PLUS() {
            return getToken(MIDLParser.PLUS, 0);
        }

        public TerminalNode WAVE() {
            return getToken(MIDLParser.WAVE, 0);
        }

        public Unary_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unary_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterUnary_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitUnary_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitUnary_expr(this);
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
                setState(164);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << WAVE))) != 0)) {
                    {
                        setState(163);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << WAVE))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(166);
                literal();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LiteralContext extends ParserRuleContext {
        public TerminalNode INTEGER() {
            return getToken(MIDLParser.INTEGER, 0);
        }

        public TerminalNode FLOATING_PT() {
            return getToken(MIDLParser.FLOATING_PT, 0);
        }

        public TerminalNode CHAR() {
            return getToken(MIDLParser.CHAR, 0);
        }

        public TerminalNode STRING() {
            return getToken(MIDLParser.STRING, 0);
        }

        public TerminalNode BOOLEAN() {
            return getToken(MIDLParser.BOOLEAN, 0);
        }

        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitLiteral(this);
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
                setState(168);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING_PT) | (1L << CHAR) | (1L << STRING) | (1L << BOOLEAN))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Exp_listContext extends ParserRuleContext {
        public TerminalNode LEFT_SQUARE_BRACKET() {
            return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0);
        }

        public List<Or_exprContext> or_expr() {
            return getRuleContexts(Or_exprContext.class);
        }

        public Or_exprContext or_expr(int i) {
            return getRuleContext(Or_exprContext.class, i);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET() {
            return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0);
        }

        public List<TerminalNode> COMMAS() {
            return getTokens(MIDLParser.COMMAS);
        }

        public TerminalNode COMMAS(int i) {
            return getToken(MIDLParser.COMMAS, i);
        }

        public Exp_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exp_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterExp_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitExp_list(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitExp_list(this);
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
                setState(170);
                match(LEFT_SQUARE_BRACKET);
                setState(171);
                or_expr();
                setState(176);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMAS) {
                    {
                        {
                            setState(172);
                            match(COMMAS);
                            setState(173);
                            or_expr();
                        }
                    }
                    setState(178);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(179);
                match(RIGHT_SQUARE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Simple_declaratorContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(MIDLParser.ID, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(MIDLParser.EQUAL, 0);
        }

        public Or_exprContext or_expr() {
            return getRuleContext(Or_exprContext.class, 0);
        }

        public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simple_declarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterSimple_declarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitSimple_declarator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitSimple_declarator(this);
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
                setState(181);
                match(ID);
                setState(184);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQUAL) {
                    {
                        setState(182);
                        match(EQUAL);
                        setState(183);
                        or_expr();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_specContext extends ParserRuleContext {
        public Scoped_nameContext scoped_name() {
            return getRuleContext(Scoped_nameContext.class, 0);
        }

        public Base_type_specContext base_type_spec() {
            return getRuleContext(Base_type_specContext.class, 0);
        }

        public Struct_typeContext struct_type() {
            return getRuleContext(Struct_typeContext.class, 0);
        }

        public Type_specContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type_spec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterType_spec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitType_spec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitType_spec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Type_specContext type_spec() throws RecognitionException {
        Type_specContext _localctx = new Type_specContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_type_spec);
        try {
            setState(189);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case COLON_2:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(186);
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
                    setState(187);
                    base_type_spec();
                }
                break;
                case K_STRUCT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(188);
                    struct_type();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Base_type_specContext extends ParserRuleContext {
        public Float_pt_typeContext float_pt_type() {
            return getRuleContext(Float_pt_typeContext.class, 0);
        }

        public Integer_typeContext integer_type() {
            return getRuleContext(Integer_typeContext.class, 0);
        }

        public TerminalNode K_CHAR() {
            return getToken(MIDLParser.K_CHAR, 0);
        }

        public TerminalNode K_STRING() {
            return getToken(MIDLParser.K_STRING, 0);
        }

        public TerminalNode K_BOOLEAN() {
            return getToken(MIDLParser.K_BOOLEAN, 0);
        }

        public Base_type_specContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_base_type_spec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterBase_type_spec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitBase_type_spec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitBase_type_spec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Base_type_specContext base_type_spec() throws RecognitionException {
        Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_base_type_spec);
        try {
            setState(196);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(191);
                    float_pt_type();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(192);
                    integer_type();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(193);
                    match(K_CHAR);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(194);
                    match(K_STRING);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(195);
                    match(K_BOOLEAN);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Integer_typeContext extends ParserRuleContext {
        public Signed_intContext signed_int() {
            return getRuleContext(Signed_intContext.class, 0);
        }

        public Unsigned_intContext unsigned_int() {
            return getRuleContext(Unsigned_intContext.class, 0);
        }

        public Integer_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_integer_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterInteger_type(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitInteger_type(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitInteger_type(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Integer_typeContext integer_type() throws RecognitionException {
        Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_integer_type);
        try {
            setState(200);
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
                    setState(198);
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
                    setState(199);
                    unsigned_int();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Unsigned_intContext extends ParserRuleContext {
        public Unsigned_intContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unsigned_int;
        }

        public Unsigned_intContext() {
        }

        public void copyFrom(Unsigned_intContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class Uint64Context extends Unsigned_intContext {
        public TerminalNode K_UNSIGNED() {
            return getToken(MIDLParser.K_UNSIGNED, 0);
        }

        public List<TerminalNode> K_LONG() {
            return getTokens(MIDLParser.K_LONG);
        }

        public TerminalNode K_LONG(int i) {
            return getToken(MIDLParser.K_LONG, i);
        }

        public TerminalNode K_UINT64() {
            return getToken(MIDLParser.K_UINT64, 0);
        }

        public Uint64Context(Unsigned_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterUint64(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitUint64(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitUint64(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Uint32Context extends Unsigned_intContext {
        public TerminalNode K_UNSIGNED() {
            return getToken(MIDLParser.K_UNSIGNED, 0);
        }

        public TerminalNode K_LONG() {
            return getToken(MIDLParser.K_LONG, 0);
        }

        public TerminalNode K_UINT32() {
            return getToken(MIDLParser.K_UINT32, 0);
        }

        public Uint32Context(Unsigned_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterUint32(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitUint32(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitUint32(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Uint8Context extends Unsigned_intContext {
        public TerminalNode K_UINT8() {
            return getToken(MIDLParser.K_UINT8, 0);
        }

        public Uint8Context(Unsigned_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterUint8(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitUint8(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitUint8(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Uint16Context extends Unsigned_intContext {
        public TerminalNode K_UNSIGNED() {
            return getToken(MIDLParser.K_UNSIGNED, 0);
        }

        public TerminalNode K_SHORT() {
            return getToken(MIDLParser.K_SHORT, 0);
        }

        public TerminalNode K_UINT16() {
            return getToken(MIDLParser.K_UINT16, 0);
        }

        public Uint16Context(Unsigned_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterUint16(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitUint16(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitUint16(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Unsigned_intContext unsigned_int() throws RecognitionException {
        Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_unsigned_int);
        try {
            setState(219);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                    _localctx = new Uint16Context(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(205);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case K_UNSIGNED: {
                            setState(202);
                            match(K_UNSIGNED);
                            setState(203);
                            match(K_SHORT);
                        }
                        break;
                        case K_UINT16: {
                            setState(204);
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
                    setState(210);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case K_UNSIGNED: {
                            setState(207);
                            match(K_UNSIGNED);
                            setState(208);
                            match(K_LONG);
                        }
                        break;
                        case K_UINT32: {
                            setState(209);
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
                    setState(216);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case K_UNSIGNED: {
                            setState(212);
                            match(K_UNSIGNED);
                            setState(213);
                            match(K_LONG);
                            setState(214);
                            match(K_LONG);
                        }
                        break;
                        case K_UINT64: {
                            setState(215);
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
                    setState(218);
                    match(K_UINT8);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Signed_intContext extends ParserRuleContext {
        public Signed_intContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_signed_int;
        }

        public Signed_intContext() {
        }

        public void copyFrom(Signed_intContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class Int32Context extends Signed_intContext {
        public TerminalNode K_LONG() {
            return getToken(MIDLParser.K_LONG, 0);
        }

        public TerminalNode K_INT32() {
            return getToken(MIDLParser.K_INT32, 0);
        }

        public Int32Context(Signed_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterInt32(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitInt32(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitInt32(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Int64Context extends Signed_intContext {
        public List<TerminalNode> K_LONG() {
            return getTokens(MIDLParser.K_LONG);
        }

        public TerminalNode K_LONG(int i) {
            return getToken(MIDLParser.K_LONG, i);
        }

        public TerminalNode K_INT64() {
            return getToken(MIDLParser.K_INT64, 0);
        }

        public Int64Context(Signed_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterInt64(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitInt64(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitInt64(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Int8Context extends Signed_intContext {
        public TerminalNode K_INT8() {
            return getToken(MIDLParser.K_INT8, 0);
        }

        public Int8Context(Signed_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterInt8(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitInt8(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor) return ((MIDLParserVisitor<? extends T>) visitor).visitInt8(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Int16Context extends Signed_intContext {
        public TerminalNode K_SHORT() {
            return getToken(MIDLParser.K_SHORT, 0);
        }

        public TerminalNode K_INT16() {
            return getToken(MIDLParser.K_INT16, 0);
        }

        public Int16Context(Signed_intContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterInt16(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitInt16(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitInt16(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Signed_intContext signed_int() throws RecognitionException {
        Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_signed_int);
        int _la;
        try {
            setState(229);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1:
                    _localctx = new Int16Context(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(221);
                    _la = _input.LA(1);
                    if (!(_la == K_SHORT || _la == K_INT16)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 2:
                    _localctx = new Int32Context(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(222);
                    _la = _input.LA(1);
                    if (!(_la == K_LONG || _la == K_INT32)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 3:
                    _localctx = new Int64Context(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(226);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case K_LONG: {
                            setState(223);
                            match(K_LONG);
                            setState(224);
                            match(K_LONG);
                        }
                        break;
                        case K_INT64: {
                            setState(225);
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
                    setState(228);
                    match(K_INT8);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Float_pt_typeContext extends ParserRuleContext {
        public Float_pt_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_float_pt_type;
        }

        public Float_pt_typeContext() {
        }

        public void copyFrom(Float_pt_typeContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DoubleContext extends Float_pt_typeContext {
        public TerminalNode K_DOUBLE() {
            return getToken(MIDLParser.K_DOUBLE, 0);
        }

        public DoubleContext(Float_pt_typeContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterDouble(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitDouble(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitDouble(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LongDoubleContext extends Float_pt_typeContext {
        public TerminalNode K_LONG() {
            return getToken(MIDLParser.K_LONG, 0);
        }

        public TerminalNode K_DOUBLE() {
            return getToken(MIDLParser.K_DOUBLE, 0);
        }

        public LongDoubleContext(Float_pt_typeContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterLongDouble(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitLongDouble(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitLongDouble(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FloatContext extends Float_pt_typeContext {
        public TerminalNode K_FLOAT() {
            return getToken(MIDLParser.K_FLOAT, 0);
        }

        public FloatContext(Float_pt_typeContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterFloat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitFloat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitFloat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Float_pt_typeContext float_pt_type() throws RecognitionException {
        Float_pt_typeContext _localctx = new Float_pt_typeContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_float_pt_type);
        try {
            setState(235);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case K_FLOAT:
                    _localctx = new FloatContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(231);
                    match(K_FLOAT);
                }
                break;
                case K_DOUBLE:
                    _localctx = new DoubleContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(232);
                    match(K_DOUBLE);
                }
                break;
                case K_LONG:
                    _localctx = new LongDoubleContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(233);
                    match(K_LONG);
                    setState(234);
                    match(K_DOUBLE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Scoped_nameContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(MIDLParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(MIDLParser.ID, i);
        }

        public List<TerminalNode> COLON_2() {
            return getTokens(MIDLParser.COLON_2);
        }

        public TerminalNode COLON_2(int i) {
            return getToken(MIDLParser.COLON_2, i);
        }

        public Scoped_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_scoped_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).enterScoped_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MIDLParserListener) ((MIDLParserListener) listener).exitScoped_name(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MIDLParserVisitor)
                return ((MIDLParserVisitor<? extends T>) visitor).visitScoped_name(this);
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
                setState(238);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COLON_2) {
                    {
                        setState(237);
                        match(COLON_2);
                    }
                }

                setState(240);
                match(ID);
                setState(245);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COLON_2) {
                    {
                        {
                            {
                                setState(241);
                                match(COLON_2);
                            }
                            setState(242);
                            match(ID);
                        }
                    }
                    setState(247);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u00016\u00f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
                    "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
                    "\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000" +
                    "\f\u00007\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001\u0002\u0001" +
                    "\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005" +
                    "\f\u0005^\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006c\b\u0006" +
                    "\n\u0006\f\u0006f\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007j\b\u0007" +
                    "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\br\b\b\u0001\t" +
                    "\u0001\t\u0001\t\u0005\tw\b\t\n\t\f\tz\t\t\u0001\n\u0001\n\u0001\n\u0005" +
                    "\n\u007f\b\n\n\n\f\n\u0082\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005" +
                    "\u000b\u0087\b\u000b\n\u000b\f\u000b\u008a\t\u000b\u0001\f\u0001\f\u0001" +
                    "\f\u0005\f\u008f\b\f\n\f\f\f\u0092\t\f\u0001\r\u0001\r\u0001\r\u0005\r" +
                    "\u0097\b\r\n\r\f\r\u009a\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005" +
                    "\u000e\u009f\b\u000e\n\u000e\f\u000e\u00a2\t\u000e\u0001\u000f\u0003\u000f" +
                    "\u00a5\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00af\b\u0011\n\u0011" +
                    "\f\u0011\u00b2\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0003\u0012\u00b9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0003\u0013\u00be\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014" +
                    "\u0001\u0014\u0003\u0014\u00c5\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015" +
                    "\u00c9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00ce\b" +
                    "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00d3\b\u0016\u0001" +
                    "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00d9\b\u0016\u0001" +
                    "\u0016\u0003\u0016\u00dc\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001" +
                    "\u0017\u0001\u0017\u0003\u0017\u00e3\b\u0017\u0001\u0017\u0003\u0017\u00e6" +
                    "\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00ec" +
                    "\b\u0018\u0001\u0019\u0003\u0019\u00ef\b\u0019\u0001\u0019\u0001\u0019" +
                    "\u0001\u0019\u0005\u0019\u00f4\b\u0019\n\u0019\f\u0019\u00f7\t\u0019\u0001" +
                    "\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012" +
                    "\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0007\u0001\u0000" +
                    " !\u0001\u0000\u001b\u001c\u0001\u0000\u001d\u001f\u0002\u0000\u001b\u001c" +
                    "%%\u0003\u0000..1135\u0002\u0000\u0004\u0004\b\b\u0002\u0000\u0005\u0005" +
                    "\t\t\u0104\u00005\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000" +
                    "\u0004A\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bP\u0001" +
                    "\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000" +
                    "\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012s" +
                    "\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u0083\u0001" +
                    "\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u0093\u0001" +
                    "\u0000\u0000\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e\u00a4\u0001" +
                    "\u0000\u0000\u0000 \u00a8\u0001\u0000\u0000\u0000\"\u00aa\u0001\u0000" +
                    "\u0000\u0000$\u00b5\u0001\u0000\u0000\u0000&\u00bd\u0001\u0000\u0000\u0000" +
                    "(\u00c4\u0001\u0000\u0000\u0000*\u00c8\u0001\u0000\u0000\u0000,\u00db" +
                    "\u0001\u0000\u0000\u0000.\u00e5\u0001\u0000\u0000\u00000\u00eb\u0001\u0000" +
                    "\u0000\u00002\u00ee\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u0000" +
                    "54\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000" +
                    "\u000078\u0001\u0000\u0000\u00008\u0001\u0001\u0000\u0000\u00009:\u0003" +
                    "\u0006\u0003\u0000:;\u0005\u0019\u0000\u0000;@\u0001\u0000\u0000\u0000" +
                    "<=\u0003\u0004\u0002\u0000=>\u0005\u0019\u0000\u0000>@\u0001\u0000\u0000" +
                    "\u0000?9\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0003\u0001" +
                    "\u0000\u0000\u0000AB\u0005\u0001\u0000\u0000BC\u00056\u0000\u0000CE\u0005" +
                    "\u0015\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000" +
                    "FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000" +
                    "\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\u0017\u0000\u0000J\u0005\u0001" +
                    "\u0000\u0000\u0000KO\u0003\b\u0004\u0000LM\u0005\u0002\u0000\u0000MO\u0005" +
                    "6\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000O\u0007" +
                    "\u0001\u0000\u0000\u0000PQ\u0005\u0002\u0000\u0000QR\u00056\u0000\u0000" +
                    "RS\u0005\u0015\u0000\u0000ST\u0003\n\u0005\u0000TU\u0005\u0017\u0000\u0000" +
                    "U\t\u0001\u0000\u0000\u0000VW\u0003&\u0013\u0000WX\u0003\f\u0006\u0000" +
                    "XY\u0005\u0019\u0000\u0000Y[\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000" +
                    "\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000" +
                    "\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000" +
                    "_d\u0003\u000e\u0007\u0000`a\u0005\u001a\u0000\u0000ac\u0003\u000e\u0007" +
                    "\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000" +
                    "\u0000\u0000de\u0001\u0000\u0000\u0000e\r\u0001\u0000\u0000\u0000fd\u0001" +
                    "\u0000\u0000\u0000gj\u0003$\u0012\u0000hj\u0003\u0010\b\u0000ig\u0001" +
                    "\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u000f\u0001\u0000\u0000" +
                    "\u0000kl\u00056\u0000\u0000lm\u0005\u0016\u0000\u0000mn\u0003\u0012\t" +
                    "\u0000nq\u0005\u0018\u0000\u0000op\u0005\"\u0000\u0000pr\u0003\"\u0011" +
                    "\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0011\u0001" +
                    "\u0000\u0000\u0000sx\u0003\u0014\n\u0000tu\u0005$\u0000\u0000uw\u0003" +
                    "\u0014\n\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001" +
                    "\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0013\u0001\u0000\u0000" +
                    "\u0000zx\u0001\u0000\u0000\u0000{\u0080\u0003\u0016\u000b\u0000|}\u0005" +
                    "&\u0000\u0000}\u007f\u0003\u0016\u000b\u0000~|\u0001\u0000\u0000\u0000" +
                    "\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080" +
                    "\u0081\u0001\u0000\u0000\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082" +
                    "\u0080\u0001\u0000\u0000\u0000\u0083\u0088\u0003\u0018\f\u0000\u0084\u0085" +
                    "\u0005#\u0000\u0000\u0085\u0087\u0003\u0018\f\u0000\u0086\u0084\u0001" +
                    "\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001" +
                    "\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0017\u0001" +
                    "\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0090\u0003" +
                    "\u001a\r\u0000\u008c\u008d\u0007\u0000\u0000\u0000\u008d\u008f\u0003\u001a" +
                    "\r\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000" +
                    "\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000" +
                    "\u0000\u0091\u0019\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000" +
                    "\u0000\u0093\u0098\u0003\u001c\u000e\u0000\u0094\u0095\u0007\u0001\u0000" +
                    "\u0000\u0095\u0097\u0003\u001c\u000e\u0000\u0096\u0094\u0001\u0000\u0000" +
                    "\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000" +
                    "\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u001b\u0001\u0000\u0000" +
                    "\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u00a0\u0003\u001e\u000f" +
                    "\u0000\u009c\u009d\u0007\u0002\u0000\u0000\u009d\u009f\u0003\u001e\u000f" +
                    "\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000" +
                    "\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000" +
                    "\u0000\u00a1\u001d\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000" +
                    "\u0000\u00a3\u00a5\u0007\u0003\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000" +
                    "\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000" +
                    "\u0000\u00a6\u00a7\u0003 \u0010\u0000\u00a7\u001f\u0001\u0000\u0000\u0000" +
                    "\u00a8\u00a9\u0007\u0004\u0000\u0000\u00a9!\u0001\u0000\u0000\u0000\u00aa" +
                    "\u00ab\u0005\u0016\u0000\u0000\u00ab\u00b0\u0003\u0012\t\u0000\u00ac\u00ad" +
                    "\u0005\u001a\u0000\u0000\u00ad\u00af\u0003\u0012\t\u0000\u00ae\u00ac\u0001" +
                    "\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001" +
                    "\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001" +
                    "\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005" +
                    "\u0018\u0000\u0000\u00b4#\u0001\u0000\u0000\u0000\u00b5\u00b8\u00056\u0000" +
                    "\u0000\u00b6\u00b7\u0005\"\u0000\u0000\u00b7\u00b9\u0003\u0012\t\u0000" +
                    "\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000" +
                    "\u00b9%\u0001\u0000\u0000\u0000\u00ba\u00be\u00032\u0019\u0000\u00bb\u00be" +
                    "\u0003(\u0014\u0000\u00bc\u00be\u0003\b\u0004\u0000\u00bd\u00ba\u0001" +
                    "\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001" +
                    "\u0000\u0000\u0000\u00be\'\u0001\u0000\u0000\u0000\u00bf\u00c5\u00030" +
                    "\u0018\u0000\u00c0\u00c5\u0003*\u0015\u0000\u00c1\u00c5\u0005\u000f\u0000" +
                    "\u0000\u00c2\u00c5\u0005\u0010\u0000\u0000\u00c3\u00c5\u0005\u0003\u0000" +
                    "\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5)\u0001\u0000\u0000\u0000" +
                    "\u00c6\u00c9\u0003.\u0017\u0000\u00c7\u00c9\u0003,\u0016\u0000\u00c8\u00c6" +
                    "\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9+\u0001" +
                    "\u0000\u0000\u0000\u00ca\u00cb\u0005\u0006\u0000\u0000\u00cb\u00ce\u0005" +
                    "\u0004\u0000\u0000\u00cc\u00ce\u0005\f\u0000\u0000\u00cd\u00ca\u0001\u0000" +
                    "\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00dc\u0001\u0000" +
                    "\u0000\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000\u00d0\u00d3\u0005\u0005" +
                    "\u0000\u0000\u00d1\u00d3\u0005\r\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000" +
                    "\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00dc\u0001\u0000\u0000" +
                    "\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5\u00d6\u0005\u0005\u0000" +
                    "\u0000\u00d6\u00d9\u0005\u0005\u0000\u0000\u00d7\u00d9\u0005\u000e\u0000" +
                    "\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000" +
                    "\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00dc\u0005\u000b\u0000" +
                    "\u0000\u00db\u00cd\u0001\u0000\u0000\u0000\u00db\u00d2\u0001\u0000\u0000" +
                    "\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000" +
                    "\u0000\u00dc-\u0001\u0000\u0000\u0000\u00dd\u00e6\u0007\u0005\u0000\u0000" +
                    "\u00de\u00e6\u0007\u0006\u0000\u0000\u00df\u00e0\u0005\u0005\u0000\u0000" +
                    "\u00e0\u00e3\u0005\u0005\u0000\u0000\u00e1\u00e3\u0005\n\u0000\u0000\u00e2" +
                    "\u00df\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3" +
                    "\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005\u0007\u0000\u0000\u00e5" +
                    "\u00dd\u0001\u0000\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000\u00e5" +
                    "\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6" +
                    "/\u0001\u0000\u0000\u0000\u00e7\u00ec\u0005\u0011\u0000\u0000\u00e8\u00ec" +
                    "\u0005\u0012\u0000\u0000\u00e9\u00ea\u0005\u0005\u0000\u0000\u00ea\u00ec" +
                    "\u0005\u0012\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00e8" +
                    "\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec1\u0001" +
                    "\u0000\u0000\u0000\u00ed\u00ef\u0005(\u0000\u0000\u00ee\u00ed\u0001\u0000" +
                    "\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000" +
                    "\u0000\u0000\u00f0\u00f5\u00056\u0000\u0000\u00f1\u00f2\u0005(\u0000\u0000" +
                    "\u00f2\u00f4\u00056\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4" +
                    "\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5" +
                    "\u00f6\u0001\u0000\u0000\u0000\u00f63\u0001\u0000\u0000\u0000\u00f7\u00f5" +
                    "\u0001\u0000\u0000\u0000\u001d7?GN\\diqx\u0080\u0088\u0090\u0098\u00a0" +
                    "\u00a4\u00b0\u00b8\u00bd\u00c4\u00c8\u00cd\u00d2\u00d8\u00db\u00e2\u00e5" +
                    "\u00eb\u00ee\u00f5";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}