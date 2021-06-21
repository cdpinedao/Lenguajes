// Generated from D:/Users/cesar/Documents/GitHub/TraductorTest/grammar\MiLenguaje.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, ID=42, Num=43, COMENTARIO_SENCILLO=44, OPS=45, 
		IGAULDADES=46, TOKENS=47, ESP=48, STRING=49;
	public static final int
		RULE_inicio = 0, RULE_funcion = 1, RULE_funcion_principal = 2, RULE_estructura = 3, 
		RULE_entero = 4, RULE_real = 5, RULE_caracter = 6, RULE_asignacion = 7, 
		RULE_declarar_instancia = 8, RULE_instanciar = 9, RULE_cadena = 10, RULE_booleano = 11, 
		RULE_leer = 12, RULE_imprimir = 13, RULE_cond_si = 14, RULE_mientras = 15, 
		RULE_para = 16, RULE_hacer_mientras = 17, RULE_seleccionar = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "funcion", "funcion_principal", "estructura", "entero", "real", 
			"caracter", "asignacion", "declarar_instancia", "instanciar", "cadena", 
			"booleano", "leer", "imprimir", "cond_si", "mientras", "para", "hacer_mientras", 
			"seleccionar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'entero'", "'real'", "'caracter'", "'cadena'", "'booleano'", 
			"'('", "','", "')'", "'hacer'", "'retornar'", "';'", "'fin_funcion'", 
			"'funcion_principal'", "'fin_principal'", "'estructura'", "'fin_estructura'", 
			"'='", "'.'", "'''", "'_'", "'\"'", "'falso'", "'verdadero'", "'leer'", 
			"'imprimir'", "'si'", "'entonces'", "'fin_si'", "'si_no'", "'mientras'", 
			"'fin_mientras'", "'para'", "'fin_para'", "'seleccionar'", "'entre'", 
			"'caso'", "'defecto'", "':'", "'romper;'", "'fin_seleccionar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "Num", "COMENTARIO_SENCILLO", 
			"OPS", "IGAULDADES", "TOKENS", "ESP", "STRING"
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
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public Funcion_principalContext funcion_principal() {
			return getRuleContext(Funcion_principalContext.class,0);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<EstructuraContext> estructura() {
			return getRuleContexts(EstructuraContext.class);
		}
		public EstructuraContext estructura(int i) {
			return getRuleContext(EstructuraContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__15) {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(38);
					funcion();
					}
					break;
				case T__15:
					{
					setState(39);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			funcion_principal();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__15) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(46);
					funcion();
					}
					break;
				case T__15:
					{
					setState(47);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
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

	public static class FuncionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(55);
			match(ID);
			setState(56);
			match(T__6);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(57);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__8);
			setState(64);
			match(T__9);
			setState(65);
			match(T__10);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num) | (1L << OPS))) != 0)) {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num) | (1L << OPS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__11);
			setState(73);
			match(T__12);
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

	public static class Funcion_principalContext extends ParserRuleContext {
		public List<TerminalNode> COMENTARIO_SENCILLO() { return getTokens(MiLenguajeParser.COMENTARIO_SENCILLO); }
		public TerminalNode COMENTARIO_SENCILLO(int i) {
			return getToken(MiLenguajeParser.COMENTARIO_SENCILLO, i);
		}
		public List<SeleccionarContext> seleccionar() {
			return getRuleContexts(SeleccionarContext.class);
		}
		public SeleccionarContext seleccionar(int i) {
			return getRuleContext(SeleccionarContext.class,i);
		}
		public List<Hacer_mientrasContext> hacer_mientras() {
			return getRuleContexts(Hacer_mientrasContext.class);
		}
		public Hacer_mientrasContext hacer_mientras(int i) {
			return getRuleContext(Hacer_mientrasContext.class,i);
		}
		public List<MientrasContext> mientras() {
			return getRuleContexts(MientrasContext.class);
		}
		public MientrasContext mientras(int i) {
			return getRuleContext(MientrasContext.class,i);
		}
		public List<ParaContext> para() {
			return getRuleContexts(ParaContext.class);
		}
		public ParaContext para(int i) {
			return getRuleContext(ParaContext.class,i);
		}
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<Cond_siContext> cond_si() {
			return getRuleContexts(Cond_siContext.class);
		}
		public Cond_siContext cond_si(int i) {
			return getRuleContext(Cond_siContext.class,i);
		}
		public List<Declarar_instanciaContext> declarar_instancia() {
			return getRuleContexts(Declarar_instanciaContext.class);
		}
		public Declarar_instanciaContext declarar_instancia(int i) {
			return getRuleContext(Declarar_instanciaContext.class,i);
		}
		public List<InstanciarContext> instanciar() {
			return getRuleContexts(InstanciarContext.class);
		}
		public InstanciarContext instanciar(int i) {
			return getRuleContext(InstanciarContext.class,i);
		}
		public Funcion_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFuncion_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFuncion_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFuncion_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_principalContext funcion_principal() throws RecognitionException {
		Funcion_principalContext _localctx = new Funcion_principalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__13);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__9) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << COMENTARIO_SENCILLO))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(76);
					match(COMENTARIO_SENCILLO);
					}
					break;
				case 2:
					{
					setState(77);
					seleccionar();
					}
					break;
				case 3:
					{
					setState(78);
					hacer_mientras();
					}
					break;
				case 4:
					{
					setState(79);
					mientras();
					}
					break;
				case 5:
					{
					setState(80);
					para();
					}
					break;
				case 6:
					{
					setState(81);
					leer();
					}
					break;
				case 7:
					{
					setState(82);
					booleano();
					}
					break;
				case 8:
					{
					setState(83);
					entero();
					}
					break;
				case 9:
					{
					setState(84);
					imprimir();
					}
					break;
				case 10:
					{
					setState(85);
					cond_si();
					}
					break;
				case 11:
					{
					setState(86);
					declarar_instancia();
					}
					break;
				case 12:
					{
					setState(87);
					instanciar();
					}
					break;
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__14);
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

	public static class EstructuraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<CaracterContext> caracter() {
			return getRuleContexts(CaracterContext.class);
		}
		public CaracterContext caracter(int i) {
			return getRuleContext(CaracterContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__15);
			setState(96);
			match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID))) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(97);
					match(ID);
					setState(98);
					match(ID);
					setState(99);
					match(T__11);
					}
					break;
				case T__1:
					{
					setState(100);
					entero();
					}
					break;
				case T__2:
					{
					setState(101);
					real();
					}
					break;
				case T__3:
					{
					setState(102);
					caracter();
					}
					break;
				case T__4:
					{
					setState(103);
					cadena();
					}
					break;
				case T__5:
					{
					setState(104);
					booleano();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__16);
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

	public static class EnteroContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__1);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(113);
				match(ID);
				}
				break;
			case 2:
				{
				setState(114);
				match(ID);
				setState(115);
				match(T__17);
				setState(116);
				match(Num);
				}
				break;
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(119);
				match(T__7);
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(120);
					match(ID);
					}
					break;
				case 2:
					{
					setState(121);
					match(ID);
					setState(122);
					match(T__17);
					setState(123);
					match(Num);
					}
					break;
				}
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__11);
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

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__2);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(134);
				match(ID);
				}
				break;
			case 2:
				{
				setState(135);
				match(ID);
				setState(136);
				match(T__17);
				setState(137);
				match(Num);
				setState(138);
				match(T__18);
				setState(139);
				match(Num);
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(142);
				match(T__7);
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(143);
					match(ID);
					}
					break;
				case 2:
					{
					setState(144);
					match(ID);
					setState(145);
					match(T__17);
					setState(146);
					match(Num);
					setState(147);
					match(T__18);
					setState(148);
					match(Num);
					}
					break;
				}
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__11);
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

	public static class CaracterContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public CaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCaracter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCaracter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaracterContext caracter() throws RecognitionException {
		CaracterContext _localctx = new CaracterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caracter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__3);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(159);
				match(ID);
				}
				break;
			case 2:
				{
				setState(160);
				match(ID);
				setState(161);
				match(T__17);
				setState(162);
				match(T__19);
				setState(163);
				match(ID);
				setState(164);
				match(T__19);
				}
				break;
			case 3:
				{
				setState(165);
				match(ID);
				setState(166);
				match(T__17);
				setState(167);
				match(T__19);
				setState(168);
				match(T__19);
				}
				break;
			case 4:
				{
				setState(169);
				match(ID);
				setState(170);
				match(T__17);
				setState(171);
				match(T__19);
				setState(172);
				match(T__20);
				setState(173);
				match(T__19);
				}
				break;
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(176);
				match(T__7);
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(177);
					match(ID);
					}
					break;
				case 2:
					{
					setState(178);
					match(ID);
					setState(179);
					match(T__17);
					setState(180);
					match(T__19);
					setState(181);
					match(ID);
					setState(182);
					match(T__19);
					}
					break;
				case 3:
					{
					setState(183);
					match(ID);
					setState(184);
					match(T__17);
					setState(185);
					match(T__19);
					setState(186);
					match(T__19);
					}
					break;
				case 4:
					{
					setState(187);
					match(ID);
					setState(188);
					match(T__17);
					setState(189);
					match(T__19);
					setState(190);
					match(T__20);
					setState(191);
					match(T__19);
					}
					break;
				}
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__11);
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

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			match(ID);
			setState(202);
			match(T__17);
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==Num) ) {
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
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==Num) {
					{
					{
					setState(204);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(205);
					match(OPS);
					setState(206);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
			setState(214);
			match(T__11);
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

	public static class Declarar_instanciaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public Declarar_instanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_instancia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclarar_instancia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclarar_instancia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclarar_instancia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_instanciaContext declarar_instancia() throws RecognitionException {
		Declarar_instanciaContext _localctx = new Declarar_instanciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarar_instancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			match(ID);
			setState(217);
			match(ID);
			setState(218);
			match(T__11);
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

	public static class InstanciarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode Num() { return getToken(MiLenguajeParser.Num, 0); }
		public InstanciarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanciar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInstanciar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInstanciar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInstanciar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanciarContext instanciar() throws RecognitionException {
		InstanciarContext _localctx = new InstanciarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instanciar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			match(ID);
			setState(221);
			match(T__18);
			setState(222);
			match(ID);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(223);
				match(T__18);
				setState(224);
				match(ID);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(230);
			match(T__17);
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232);
			match(T__11);
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

	public static class CadenaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__4);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(235);
				match(ID);
				}
				break;
			case 2:
				{
				setState(236);
				match(ID);
				setState(237);
				match(T__17);
				setState(238);
				match(T__21);
				setState(239);
				match(ID);
				setState(240);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(241);
				match(ID);
				setState(242);
				match(T__17);
				setState(243);
				match(T__21);
				setState(244);
				match(T__21);
				}
				break;
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(247);
				match(T__7);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(248);
					match(ID);
					}
					break;
				case 2:
					{
					setState(249);
					match(ID);
					setState(250);
					match(T__17);
					setState(251);
					match(T__21);
					setState(252);
					match(ID);
					setState(253);
					match(T__21);
					}
					break;
				case 3:
					{
					setState(254);
					match(ID);
					setState(255);
					match(T__17);
					setState(256);
					match(T__21);
					setState(257);
					match(T__21);
					}
					break;
				}
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(T__11);
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

	public static class BooleanoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__5);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(268);
				match(ID);
				}
				break;
			case 2:
				{
				setState(269);
				match(ID);
				setState(270);
				match(T__17);
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(274);
				match(T__7);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(275);
					match(ID);
					}
					break;
				case 2:
					{
					setState(276);
					match(ID);
					setState(277);
					match(T__17);
					setState(278);
					_la = _input.LA(1);
					if ( !(_la==T__22 || _la==T__23) ) {
					_errHandler.recoverInline(this);
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
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(T__11);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__24);
			setState(289);
			match(T__6);
			setState(290);
			match(ID);
			setState(291);
			match(T__8);
			setState(292);
			match(T__11);
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

	public static class ImprimirContext extends ParserRuleContext {
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(MiLenguajeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MiLenguajeParser.STRING, i);
		}
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_imprimir);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__25);
			setState(295);
			match(T__6);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << OPS) | (1L << STRING))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(302);
				match(T__7);
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << OPS) | (1L << STRING))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(T__8);
			setState(315);
			match(T__11);
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

	public static class Cond_siContext extends ParserRuleContext {
		public List<TerminalNode> IGAULDADES() { return getTokens(MiLenguajeParser.IGAULDADES); }
		public TerminalNode IGAULDADES(int i) {
			return getToken(MiLenguajeParser.IGAULDADES, i);
		}
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<CaracterContext> caracter() {
			return getRuleContexts(CaracterContext.class);
		}
		public CaracterContext caracter(int i) {
			return getRuleContext(CaracterContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<Cond_siContext> cond_si() {
			return getRuleContexts(Cond_siContext.class);
		}
		public Cond_siContext cond_si(int i) {
			return getRuleContext(Cond_siContext.class,i);
		}
		public Cond_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCond_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCond_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCond_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_siContext cond_si() throws RecognitionException {
		Cond_siContext _localctx = new Cond_siContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cond_si);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__26);
			setState(318);
			match(T__6);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(326);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case Num:
						{
						setState(319);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==Num) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						match(IGAULDADES);
						setState(321);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==Num) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case IGAULDADES:
						{
						setState(322);
						match(IGAULDADES);
						setState(323);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << Num))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case T__6:
						{
						setState(324);
						match(T__6);
						}
						break;
					case T__8:
						{
						setState(325);
						match(T__8);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(331);
			match(T__8);
			setState(332);
			match(T__27);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(333);
					match(ID);
					}
					break;
				case 2:
					{
					setState(334);
					match(Num);
					}
					break;
				case 3:
					{
					setState(335);
					asignacion();
					}
					break;
				case 4:
					{
					setState(336);
					entero();
					}
					break;
				case 5:
					{
					setState(337);
					real();
					}
					break;
				case 6:
					{
					setState(338);
					caracter();
					}
					break;
				case 7:
					{
					setState(339);
					cadena();
					}
					break;
				case 8:
					{
					setState(340);
					booleano();
					}
					break;
				case 9:
					{
					setState(341);
					leer();
					}
					break;
				case 10:
					{
					setState(342);
					booleano();
					}
					break;
				case 11:
					{
					setState(343);
					imprimir();
					}
					break;
				case 12:
					{
					setState(344);
					cond_si();
					}
					break;
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(350);
				match(T__28);
				}
				break;
			case T__29:
				{
				setState(351);
				match(T__29);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << Num))) != 0)) {
					{
					setState(364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(352);
						match(ID);
						}
						break;
					case 2:
						{
						setState(353);
						match(Num);
						}
						break;
					case 3:
						{
						setState(354);
						asignacion();
						}
						break;
					case 4:
						{
						setState(355);
						entero();
						}
						break;
					case 5:
						{
						setState(356);
						real();
						}
						break;
					case 6:
						{
						setState(357);
						caracter();
						}
						break;
					case 7:
						{
						setState(358);
						cadena();
						}
						break;
					case 8:
						{
						setState(359);
						booleano();
						}
						break;
					case 9:
						{
						setState(360);
						leer();
						}
						break;
					case 10:
						{
						setState(361);
						booleano();
						}
						break;
					case 11:
						{
						setState(362);
						imprimir();
						}
						break;
					case 12:
						{
						setState(363);
						cond_si();
						}
						break;
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MientrasContext extends ParserRuleContext {
		public List<TerminalNode> IGAULDADES() { return getTokens(MiLenguajeParser.IGAULDADES); }
		public TerminalNode IGAULDADES(int i) {
			return getToken(MiLenguajeParser.IGAULDADES, i);
		}
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<CaracterContext> caracter() {
			return getRuleContexts(CaracterContext.class);
		}
		public CaracterContext caracter(int i) {
			return getRuleContext(CaracterContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<Cond_siContext> cond_si() {
			return getRuleContexts(Cond_siContext.class);
		}
		public Cond_siContext cond_si(int i) {
			return getRuleContext(Cond_siContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mientras);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__30);
			setState(373);
			match(T__6);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(381);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case Num:
						{
						setState(374);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==Num) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(375);
						match(IGAULDADES);
						setState(376);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==Num) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case IGAULDADES:
						{
						setState(377);
						match(IGAULDADES);
						setState(378);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << Num))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case T__6:
						{
						setState(379);
						match(T__6);
						}
						break;
					case T__8:
						{
						setState(380);
						match(T__8);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(386);
			match(T__8);
			setState(387);
			match(T__9);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(388);
					match(ID);
					}
					break;
				case 2:
					{
					setState(389);
					match(Num);
					}
					break;
				case 3:
					{
					setState(390);
					asignacion();
					}
					break;
				case 4:
					{
					setState(391);
					entero();
					}
					break;
				case 5:
					{
					setState(392);
					real();
					}
					break;
				case 6:
					{
					setState(393);
					caracter();
					}
					break;
				case 7:
					{
					setState(394);
					cadena();
					}
					break;
				case 8:
					{
					setState(395);
					booleano();
					}
					break;
				case 9:
					{
					setState(396);
					leer();
					}
					break;
				case 10:
					{
					setState(397);
					booleano();
					}
					break;
				case 11:
					{
					setState(398);
					imprimir();
					}
					break;
				case 12:
					{
					setState(399);
					cond_si();
					}
					break;
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(T__31);
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

	public static class ParaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> IGAULDADES() { return getTokens(MiLenguajeParser.IGAULDADES); }
		public TerminalNode IGAULDADES(int i) {
			return getToken(MiLenguajeParser.IGAULDADES, i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<CaracterContext> caracter() {
			return getRuleContexts(CaracterContext.class);
		}
		public CaracterContext caracter(int i) {
			return getRuleContext(CaracterContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<Cond_siContext> cond_si() {
			return getRuleContexts(Cond_siContext.class);
		}
		public Cond_siContext cond_si(int i) {
			return getRuleContext(Cond_siContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__32);
			setState(408);
			match(T__6);
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(409);
				entero();
				}
				break;
			case ID:
				{
				setState(410);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << IGAULDADES))) != 0)) {
				{
				setState(420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case Num:
					{
					setState(413);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(414);
					match(IGAULDADES);
					setState(415);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case IGAULDADES:
					{
					setState(416);
					match(IGAULDADES);
					setState(417);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << Num))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__6:
					{
					setState(418);
					match(T__6);
					}
					break;
				case T__8:
					{
					setState(419);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(T__11);
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(427);
			match(T__8);
			setState(428);
			match(T__9);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(429);
					match(ID);
					}
					break;
				case 2:
					{
					setState(430);
					match(Num);
					}
					break;
				case 3:
					{
					setState(431);
					asignacion();
					}
					break;
				case 4:
					{
					setState(432);
					entero();
					}
					break;
				case 5:
					{
					setState(433);
					real();
					}
					break;
				case 6:
					{
					setState(434);
					caracter();
					}
					break;
				case 7:
					{
					setState(435);
					cadena();
					}
					break;
				case 8:
					{
					setState(436);
					booleano();
					}
					break;
				case 9:
					{
					setState(437);
					leer();
					}
					break;
				case 10:
					{
					setState(438);
					booleano();
					}
					break;
				case 11:
					{
					setState(439);
					imprimir();
					}
					break;
				case 12:
					{
					setState(440);
					cond_si();
					}
					break;
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(T__33);
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

	public static class Hacer_mientrasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<CaracterContext> caracter() {
			return getRuleContexts(CaracterContext.class);
		}
		public CaracterContext caracter(int i) {
			return getRuleContext(CaracterContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<Cond_siContext> cond_si() {
			return getRuleContexts(Cond_siContext.class);
		}
		public Cond_siContext cond_si(int i) {
			return getRuleContext(Cond_siContext.class,i);
		}
		public List<TerminalNode> IGAULDADES() { return getTokens(MiLenguajeParser.IGAULDADES); }
		public TerminalNode IGAULDADES(int i) {
			return getToken(MiLenguajeParser.IGAULDADES, i);
		}
		public Hacer_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterHacer_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitHacer_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitHacer_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hacer_mientrasContext hacer_mientras() throws RecognitionException {
		Hacer_mientrasContext _localctx = new Hacer_mientrasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hacer_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__9);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(449);
					match(ID);
					}
					break;
				case 2:
					{
					setState(450);
					match(Num);
					}
					break;
				case 3:
					{
					setState(451);
					asignacion();
					}
					break;
				case 4:
					{
					setState(452);
					entero();
					}
					break;
				case 5:
					{
					setState(453);
					real();
					}
					break;
				case 6:
					{
					setState(454);
					caracter();
					}
					break;
				case 7:
					{
					setState(455);
					cadena();
					}
					break;
				case 8:
					{
					setState(456);
					booleano();
					}
					break;
				case 9:
					{
					setState(457);
					leer();
					}
					break;
				case 10:
					{
					setState(458);
					booleano();
					}
					break;
				case 11:
					{
					setState(459);
					imprimir();
					}
					break;
				case 12:
					{
					setState(460);
					cond_si();
					}
					break;
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(T__30);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << IGAULDADES))) != 0)) {
				{
				setState(474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case Num:
					{
					setState(467);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(468);
					match(IGAULDADES);
					setState(469);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case IGAULDADES:
					{
					setState(470);
					match(IGAULDADES);
					setState(471);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << Num))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__6:
					{
					setState(472);
					match(T__6);
					}
					break;
				case T__8:
					{
					setState(473);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(T__11);
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

	public static class SeleccionarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<CaracterContext> caracter() {
			return getRuleContexts(CaracterContext.class);
		}
		public CaracterContext caracter(int i) {
			return getRuleContext(CaracterContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<Cond_siContext> cond_si() {
			return getRuleContexts(Cond_siContext.class);
		}
		public Cond_siContext cond_si(int i) {
			return getRuleContext(Cond_siContext.class,i);
		}
		public SeleccionarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSeleccionar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSeleccionar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSeleccionar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionarContext seleccionar() throws RecognitionException {
		SeleccionarContext _localctx = new SeleccionarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_seleccionar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__34);
			setState(482);
			match(T__6);
			setState(483);
			match(ID);
			setState(484);
			match(T__8);
			setState(485);
			match(T__35);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36 || _la==T__37) {
				{
				{
				setState(489);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(486);
					match(T__36);
					setState(487);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__37:
					{
					setState(488);
					match(T__37);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(491);
				match(T__38);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__39) | (1L << ID) | (1L << Num))) != 0)) {
					{
					setState(505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(492);
						match(ID);
						}
						break;
					case 2:
						{
						setState(493);
						match(Num);
						}
						break;
					case 3:
						{
						setState(494);
						asignacion();
						}
						break;
					case 4:
						{
						setState(495);
						entero();
						}
						break;
					case 5:
						{
						setState(496);
						real();
						}
						break;
					case 6:
						{
						setState(497);
						caracter();
						}
						break;
					case 7:
						{
						setState(498);
						cadena();
						}
						break;
					case 8:
						{
						setState(499);
						booleano();
						}
						break;
					case 9:
						{
						setState(500);
						leer();
						}
						break;
					case 10:
						{
						setState(501);
						booleano();
						}
						break;
					case 11:
						{
						setState(502);
						imprimir();
						}
						break;
					case 12:
						{
						setState(503);
						cond_si();
						}
						break;
					case 13:
						{
						setState(504);
						match(T__39);
						}
						break;
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(T__40);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0208\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3"+
		"\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\7\6\u0081\n\6"+
		"\f\6\16\6\u0084\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0098\n\7\7\7\u009a\n\7\f\7\16\7\u009d"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00b1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00c3\n\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d2\n\t\f\t\16\t\u00d5\13\t\5\t\u00d7"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00e4\n\13"+
		"\f\13\16\13\u00e7\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0105\n\f\7\f\u0107\n\f\f\f\16\f\u010a\13\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0113\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u011a\n\r\7\r\u011c"+
		"\n\r\f\r\16\r\u011f\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u012c\n\17\f\17\16\17\u012f\13\17\3\17\3\17\7\17\u0133\n"+
		"\17\f\17\16\17\u0136\13\17\7\17\u0138\n\17\f\17\16\17\u013b\13\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0149\n\20"+
		"\f\20\16\20\u014c\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u015c\n\20\f\20\16\20\u015f\13\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u016f"+
		"\n\20\f\20\16\20\u0172\13\20\3\20\5\20\u0175\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0180\n\21\f\21\16\21\u0183\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u0193\n\21\f\21\16\21\u0196\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22"+
		"\u019e\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01a7\n\22\f\22\16"+
		"\22\u01aa\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u01bc\n\22\f\22\16\22\u01bf\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u01d0\n\23\f\23\16\23\u01d3\13\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u01dd\n\23\f\23\16\23\u01e0\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01ec\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01fc\n\24\f\24\16"+
		"\24\u01ff\13\24\7\24\u0201\n\24\f\24\16\24\u0204\13\24\3\24\3\24\3\24"+
		"\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\t\3\2\4\b\5\2\4"+
		"\b\n\n,,\5\2\n\n,-//\3\2,-\3\2\31\32\7\2\t\t\13\13,-//\63\63\4\2\t\t,"+
		"-\2\u0284\2,\3\2\2\2\4\67\3\2\2\2\6M\3\2\2\2\ba\3\2\2\2\nr\3\2\2\2\f\u0087"+
		"\3\2\2\2\16\u00a0\3\2\2\2\20\u00cb\3\2\2\2\22\u00da\3\2\2\2\24\u00de\3"+
		"\2\2\2\26\u00ec\3\2\2\2\30\u010d\3\2\2\2\32\u0122\3\2\2\2\34\u0128\3\2"+
		"\2\2\36\u013f\3\2\2\2 \u0176\3\2\2\2\"\u0199\3\2\2\2$\u01c2\3\2\2\2&\u01e3"+
		"\3\2\2\2(+\5\4\3\2)+\5\b\5\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,"+
		"-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\64\5\6\4\2\60\63\5\4\3\2\61\63\5\b\5\2"+
		"\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\3\3\2\2\2\66\64\3\2\2\2\678\7\3\2\289\t\2\2\29:\7,\2\2:>\7\t\2\2;"+
		"=\t\3\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2"+
		"AB\7\13\2\2BC\7\f\2\2CG\7\r\2\2DF\t\4\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\16\2\2KL\7\17\2\2L\5\3\2\2\2M\\\7"+
		"\20\2\2N[\7.\2\2O[\5&\24\2P[\5$\23\2Q[\5 \21\2R[\5\"\22\2S[\5\32\16\2"+
		"T[\5\30\r\2U[\5\n\6\2V[\5\34\17\2W[\5\36\20\2X[\5\22\n\2Y[\5\24\13\2Z"+
		"N\3\2\2\2ZO\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2"+
		"ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\21\2\2`\7\3\2\2\2ab\7\22\2\2bm"+
		"\7,\2\2cd\7,\2\2de\7,\2\2el\7\16\2\2fl\5\n\6\2gl\5\f\7\2hl\5\16\b\2il"+
		"\5\26\f\2jl\5\30\r\2kc\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2"+
		"kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\23\2"+
		"\2q\t\3\2\2\2rw\7\4\2\2sx\7,\2\2tu\7,\2\2uv\7\24\2\2vx\7-\2\2ws\3\2\2"+
		"\2wt\3\2\2\2x\u0082\3\2\2\2y~\7\n\2\2z\177\7,\2\2{|\7,\2\2|}\7\24\2\2"+
		"}\177\7-\2\2~z\3\2\2\2~{\3\2\2\2\177\u0081\3\2\2\2\u0080y\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\16\2\2\u0086\13\3\2\2\2\u0087\u008e"+
		"\7\5\2\2\u0088\u008f\7,\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\24\2\2\u008b"+
		"\u008c\7-\2\2\u008c\u008d\7\25\2\2\u008d\u008f\7-\2\2\u008e\u0088\3\2"+
		"\2\2\u008e\u0089\3\2\2\2\u008f\u009b\3\2\2\2\u0090\u0097\7\n\2\2\u0091"+
		"\u0098\7,\2\2\u0092\u0093\7,\2\2\u0093\u0094\7\24\2\2\u0094\u0095\7-\2"+
		"\2\u0095\u0096\7\25\2\2\u0096\u0098\7-\2\2\u0097\u0091\3\2\2\2\u0097\u0092"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0090\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u009f\7\16\2\2\u009f\r\3\2\2\2\u00a0\u00b0\7\6\2\2\u00a1\u00b1"+
		"\7,\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\7\26\2\2\u00a5"+
		"\u00a6\7,\2\2\u00a6\u00b1\7\26\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\7\24"+
		"\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00b1\7\26\2\2\u00ab\u00ac\7,\2\2\u00ac"+
		"\u00ad\7\24\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\7\27\2\2\u00af\u00b1"+
		"\7\26\2\2\u00b0\u00a1\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00a7\3\2\2\2"+
		"\u00b0\u00ab\3\2\2\2\u00b1\u00c6\3\2\2\2\u00b2\u00c2\7\n\2\2\u00b3\u00c3"+
		"\7,\2\2\u00b4\u00b5\7,\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7\7\26\2\2\u00b7"+
		"\u00b8\7,\2\2\u00b8\u00c3\7\26\2\2\u00b9\u00ba\7,\2\2\u00ba\u00bb\7\24"+
		"\2\2\u00bb\u00bc\7\26\2\2\u00bc\u00c3\7\26\2\2\u00bd\u00be\7,\2\2\u00be"+
		"\u00bf\7\24\2\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\7\27\2\2\u00c1\u00c3"+
		"\7\26\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b4\3\2\2\2\u00c2\u00b9\3\2\2\2"+
		"\u00c2\u00bd\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca\17\3\2\2\2\u00cb\u00cc\7,\2"+
		"\2\u00cc\u00d6\7\24\2\2\u00cd\u00d7\t\5\2\2\u00ce\u00cf\t\5\2\2\u00cf"+
		"\u00d0\7/\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\7\16\2\2\u00d9\21\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00dc"+
		"\7,\2\2\u00dc\u00dd\7\16\2\2\u00dd\23\3\2\2\2\u00de\u00df\7,\2\2\u00df"+
		"\u00e0\7\25\2\2\u00e0\u00e5\7,\2\2\u00e1\u00e2\7\25\2\2\u00e2\u00e4\7"+
		",\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\24"+
		"\2\2\u00e9\u00ea\t\5\2\2\u00ea\u00eb\7\16\2\2\u00eb\25\3\2\2\2\u00ec\u00f7"+
		"\7\7\2\2\u00ed\u00f8\7,\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f0\7\24\2\2\u00f0"+
		"\u00f1\7\30\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f8\7\30\2\2\u00f3\u00f4\7"+
		",\2\2\u00f4\u00f5\7\24\2\2\u00f5\u00f6\7\30\2\2\u00f6\u00f8\7\30\2\2\u00f7"+
		"\u00ed\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8\u0108\3\2"+
		"\2\2\u00f9\u0104\7\n\2\2\u00fa\u0105\7,\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fd"+
		"\7\24\2\2\u00fd\u00fe\7\30\2\2\u00fe\u00ff\7,\2\2\u00ff\u0105\7\30\2\2"+
		"\u0100\u0101\7,\2\2\u0101\u0102\7\24\2\2\u0102\u0103\7\30\2\2\u0103\u0105"+
		"\7\30\2\2\u0104\u00fa\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u0100\3\2\2\2"+
		"\u0105\u0107\3\2\2\2\u0106\u00f9\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7\16\2\2\u010c\27\3\2\2\2\u010d\u0112\7\b\2\2\u010e\u0113\7,\2"+
		"\2\u010f\u0110\7,\2\2\u0110\u0111\7\24\2\2\u0111\u0113\t\6\2\2\u0112\u010e"+
		"\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u011d\3\2\2\2\u0114\u0119\7\n\2\2\u0115"+
		"\u011a\7,\2\2\u0116\u0117\7,\2\2\u0117\u0118\7\24\2\2\u0118\u011a\t\6"+
		"\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0114\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\16\2\2\u0121"+
		"\31\3\2\2\2\u0122\u0123\7\33\2\2\u0123\u0124\7\t\2\2\u0124\u0125\7,\2"+
		"\2\u0125\u0126\7\13\2\2\u0126\u0127\7\16\2\2\u0127\33\3\2\2\2\u0128\u0129"+
		"\7\34\2\2\u0129\u012d\7\t\2\2\u012a\u012c\t\7\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0139"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0134\7\n\2\2\u0131\u0133\t\7\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0130\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\13\2\2\u013d\u013e\7\16\2\2\u013e"+
		"\35\3\2\2\2\u013f\u0140\7\35\2\2\u0140\u014a\7\t\2\2\u0141\u0142\t\5\2"+
		"\2\u0142\u0143\7\60\2\2\u0143\u0149\t\5\2\2\u0144\u0145\7\60\2\2\u0145"+
		"\u0149\t\b\2\2\u0146\u0149\7\t\2\2\u0147\u0149\7\13\2\2\u0148\u0141\3"+
		"\2\2\2\u0148\u0144\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\13\2\2\u014e\u015d\7\36\2\2\u014f"+
		"\u015c\7,\2\2\u0150\u015c\7-\2\2\u0151\u015c\5\20\t\2\u0152\u015c\5\n"+
		"\6\2\u0153\u015c\5\f\7\2\u0154\u015c\5\16\b\2\u0155\u015c\5\26\f\2\u0156"+
		"\u015c\5\30\r\2\u0157\u015c\5\32\16\2\u0158\u015c\5\30\r\2\u0159\u015c"+
		"\5\34\17\2\u015a\u015c\5\36\20\2\u015b\u014f\3\2\2\2\u015b\u0150\3\2\2"+
		"\2\u015b\u0151\3\2\2\2\u015b\u0152\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0154"+
		"\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b"+
		"\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0174\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0175\7\37\2\2\u0161\u0170\7 \2\2\u0162\u016f\7,"+
		"\2\2\u0163\u016f\7-\2\2\u0164\u016f\5\20\t\2\u0165\u016f\5\n\6\2\u0166"+
		"\u016f\5\f\7\2\u0167\u016f\5\16\b\2\u0168\u016f\5\26\f\2\u0169\u016f\5"+
		"\30\r\2\u016a\u016f\5\32\16\2\u016b\u016f\5\30\r\2\u016c\u016f\5\34\17"+
		"\2\u016d\u016f\5\36\20\2\u016e\u0162\3\2\2\2\u016e\u0163\3\2\2\2\u016e"+
		"\u0164\3\2\2\2\u016e\u0165\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u0167\3\2"+
		"\2\2\u016e\u0168\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0175\7\37\2\2\u0174\u0160\3\2\2\2\u0174\u0161\3"+
		"\2\2\2\u0175\37\3\2\2\2\u0176\u0177\7!\2\2\u0177\u0181\7\t\2\2\u0178\u0179"+
		"\t\5\2\2\u0179\u017a\7\60\2\2\u017a\u0180\t\5\2\2\u017b\u017c\7\60\2\2"+
		"\u017c\u0180\t\b\2\2\u017d\u0180\7\t\2\2\u017e\u0180\7\13\2\2\u017f\u0178"+
		"\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7\13\2\2\u0185\u0194\7\f\2\2\u0186"+
		"\u0193\7,\2\2\u0187\u0193\7-\2\2\u0188\u0193\5\20\t\2\u0189\u0193\5\n"+
		"\6\2\u018a\u0193\5\f\7\2\u018b\u0193\5\16\b\2\u018c\u0193\5\26\f\2\u018d"+
		"\u0193\5\30\r\2\u018e\u0193\5\32\16\2\u018f\u0193\5\30\r\2\u0190\u0193"+
		"\5\34\17\2\u0191\u0193\5\36\20\2\u0192\u0186\3\2\2\2\u0192\u0187\3\2\2"+
		"\2\u0192\u0188\3\2\2\2\u0192\u0189\3\2\2\2\u0192\u018a\3\2\2\2\u0192\u018b"+
		"\3\2\2\2\u0192\u018c\3\2\2\2\u0192\u018d\3\2\2\2\u0192\u018e\3\2\2\2\u0192"+
		"\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\7\"\2\2\u0198!\3\2\2\2\u0199\u019a\7#\2\2\u019a"+
		"\u019d\7\t\2\2\u019b\u019e\5\n\6\2\u019c\u019e\5\20\t\2\u019d\u019b\3"+
		"\2\2\2\u019d\u019c\3\2\2\2\u019e\u01a8\3\2\2\2\u019f\u01a0\t\5\2\2\u01a0"+
		"\u01a1\7\60\2\2\u01a1\u01a7\t\5\2\2\u01a2\u01a3\7\60\2\2\u01a3\u01a7\t"+
		"\b\2\2\u01a4\u01a7\7\t\2\2\u01a5\u01a7\7\13\2\2\u01a6\u019f\3\2\2\2\u01a6"+
		"\u01a2\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\7\16\2\2\u01ac\u01ad\t\5\2\2\u01ad\u01ae\7"+
		"\13\2\2\u01ae\u01bd\7\f\2\2\u01af\u01bc\7,\2\2\u01b0\u01bc\7-\2\2\u01b1"+
		"\u01bc\5\20\t\2\u01b2\u01bc\5\n\6\2\u01b3\u01bc\5\f\7\2\u01b4\u01bc\5"+
		"\16\b\2\u01b5\u01bc\5\26\f\2\u01b6\u01bc\5\30\r\2\u01b7\u01bc\5\32\16"+
		"\2\u01b8\u01bc\5\30\r\2\u01b9\u01bc\5\34\17\2\u01ba\u01bc\5\36\20\2\u01bb"+
		"\u01af\3\2\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01b1\3\2\2\2\u01bb\u01b2\3\2"+
		"\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bb"+
		"\u01b6\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7$"+
		"\2\2\u01c1#\3\2\2\2\u01c2\u01d1\7\f\2\2\u01c3\u01d0\7,\2\2\u01c4\u01d0"+
		"\7-\2\2\u01c5\u01d0\5\20\t\2\u01c6\u01d0\5\n\6\2\u01c7\u01d0\5\f\7\2\u01c8"+
		"\u01d0\5\16\b\2\u01c9\u01d0\5\26\f\2\u01ca\u01d0\5\30\r\2\u01cb\u01d0"+
		"\5\32\16\2\u01cc\u01d0\5\30\r\2\u01cd\u01d0\5\34\17\2\u01ce\u01d0\5\36"+
		"\20\2\u01cf\u01c3\3\2\2\2\u01cf\u01c4\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf"+
		"\u01c6\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01c8\3\2\2\2\u01cf\u01c9\3\2"+
		"\2\2\u01cf\u01ca\3\2\2\2\u01cf\u01cb\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01de\7!\2\2\u01d5\u01d6\t\5\2\2\u01d6\u01d7\7\60\2\2\u01d7\u01dd\t\5"+
		"\2\2\u01d8\u01d9\7\60\2\2\u01d9\u01dd\t\b\2\2\u01da\u01dd\7\t\2\2\u01db"+
		"\u01dd\7\13\2\2\u01dc\u01d5\3\2\2\2\u01dc\u01d8\3\2\2\2\u01dc\u01da\3"+
		"\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7\16"+
		"\2\2\u01e2%\3\2\2\2\u01e3\u01e4\7%\2\2\u01e4\u01e5\7\t\2\2\u01e5\u01e6"+
		"\7,\2\2\u01e6\u01e7\7\13\2\2\u01e7\u0202\7&\2\2\u01e8\u01e9\7\'\2\2\u01e9"+
		"\u01ec\t\5\2\2\u01ea\u01ec\7(\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01fd\7)\2\2\u01ee\u01fc\7,\2\2\u01ef\u01fc"+
		"\7-\2\2\u01f0\u01fc\5\20\t\2\u01f1\u01fc\5\n\6\2\u01f2\u01fc\5\f\7\2\u01f3"+
		"\u01fc\5\16\b\2\u01f4\u01fc\5\26\f\2\u01f5\u01fc\5\30\r\2\u01f6\u01fc"+
		"\5\32\16\2\u01f7\u01fc\5\30\r\2\u01f8\u01fc\5\34\17\2\u01f9\u01fc\5\36"+
		"\20\2\u01fa\u01fc\7*\2\2\u01fb\u01ee\3\2\2\2\u01fb\u01ef\3\2\2\2\u01fb"+
		"\u01f0\3\2\2\2\u01fb\u01f1\3\2\2\2\u01fb\u01f2\3\2\2\2\u01fb\u01f3\3\2"+
		"\2\2\u01fb\u01f4\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fb"+
		"\u01f7\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2"+
		"\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u01eb\3\2\2\2\u0201\u0204\3\2"+
		"\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0206\7+\2\2\u0206\'\3\2\2\29*,\62\64>GZ\\kmw~\u0082"+
		"\u008e\u0097\u009b\u00b0\u00c2\u00c6\u00d3\u00d6\u00e5\u00f7\u0104\u0108"+
		"\u0112\u0119\u011d\u012d\u0134\u0139\u0148\u014a\u015b\u015d\u016e\u0170"+
		"\u0174\u017f\u0181\u0192\u0194\u019d\u01a6\u01a8\u01bb\u01bd\u01cf\u01d1"+
		"\u01dc\u01de\u01eb\u01fb\u01fd\u0202";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}