// Generated from D:/Users/cesar/Documents/GitHub/Lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
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
		T__38=39, T__39=40, COMENTARIO_MULTIPLE=41, COMENTARIO_SENCILLO=42, ID=43, 
		Num=44, BOOLE=45, OPS=46, IGAULDADES=47, TOKENS=48, ESP=49, STRING=50;
	public static final int
		RULE_inicio = 0, RULE_funcion = 1, RULE_funcion_principal = 2, RULE_estructura = 3, 
		RULE_entero = 4, RULE_real = 5, RULE_caracter = 6, RULE_asignacion = 7, 
		RULE_declarar_instancia = 8, RULE_instanciar = 9, RULE_comentario = 10, 
		RULE_llamar_funcion = 11, RULE_cadena = 12, RULE_booleano = 13, RULE_leer = 14, 
		RULE_imprimir = 15, RULE_cond_si = 16, RULE_mientras = 17, RULE_para = 18, 
		RULE_hacer_mientras = 19, RULE_seleccionar = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "funcion", "funcion_principal", "estructura", "entero", "real", 
			"caracter", "asignacion", "declarar_instancia", "instanciar", "comentario", 
			"llamar_funcion", "cadena", "booleano", "leer", "imprimir", "cond_si", 
			"mientras", "para", "hacer_mientras", "seleccionar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'entero'", "'real'", "'caracter'", "'cadena'", "'booleano'", 
			"'('", "','", "')'", "'hacer'", "'retornar'", "';'", "'fin_funcion'", 
			"'funcion_principal'", "'fin_principal'", "'estructura'", "'fin_estructura'", 
			"'='", "'''", "'_'", "'verdadero'", "'falso'", "'.'", "'leer'", "'imprimir'", 
			"'si'", "'entonces'", "'fin_si'", "'si_no'", "'mientras'", "'fin_mientras'", 
			"'para'", "'fin_para'", "'seleccionar'", "'entre'", "'caso'", "'defecto'", 
			"':'", "'romper;'", "'fin_seleccionar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COMENTARIO_MULTIPLE", "COMENTARIO_SENCILLO", 
			"ID", "Num", "BOOLE", "OPS", "IGAULDADES", "TOKENS", "ESP", "STRING"
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
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__15) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(42);
					funcion();
					}
					break;
				case T__15:
					{
					setState(43);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			funcion_principal();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__15) {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(50);
					funcion();
					}
					break;
				case T__15:
					{
					setState(51);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
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
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
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
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
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
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
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
			setState(57);
			match(T__0);
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			match(ID);
			setState(60);
			match(T__6);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(61);
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
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__8);
			setState(68);
			match(T__9);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << COMENTARIO_MULTIPLE) | (1L << COMENTARIO_SENCILLO) | (1L << ID))) != 0)) {
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(69);
					comentario();
					}
					break;
				case 2:
					{
					setState(70);
					caracter();
					}
					break;
				case 3:
					{
					setState(71);
					cadena();
					}
					break;
				case 4:
					{
					setState(72);
					seleccionar();
					}
					break;
				case 5:
					{
					setState(73);
					hacer_mientras();
					}
					break;
				case 6:
					{
					setState(74);
					mientras();
					}
					break;
				case 7:
					{
					setState(75);
					para();
					}
					break;
				case 8:
					{
					setState(76);
					leer();
					}
					break;
				case 9:
					{
					setState(77);
					booleano();
					}
					break;
				case 10:
					{
					setState(78);
					entero();
					}
					break;
				case 11:
					{
					setState(79);
					real();
					}
					break;
				case 12:
					{
					setState(80);
					imprimir();
					}
					break;
				case 13:
					{
					setState(81);
					cond_si();
					}
					break;
				case 14:
					{
					setState(82);
					declarar_instancia();
					}
					break;
				case 15:
					{
					setState(83);
					instanciar();
					}
					break;
				case 16:
					{
					setState(84);
					asignacion();
					}
					break;
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__10);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num) | (1L << OPS))) != 0)) {
				{
				{
				setState(91);
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
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__11);
			setState(98);
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
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
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
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
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
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
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
			setState(100);
			match(T__13);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << COMENTARIO_MULTIPLE) | (1L << COMENTARIO_SENCILLO) | (1L << ID))) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(101);
					comentario();
					}
					break;
				case 2:
					{
					setState(102);
					caracter();
					}
					break;
				case 3:
					{
					setState(103);
					cadena();
					}
					break;
				case 4:
					{
					setState(104);
					seleccionar();
					}
					break;
				case 5:
					{
					setState(105);
					hacer_mientras();
					}
					break;
				case 6:
					{
					setState(106);
					mientras();
					}
					break;
				case 7:
					{
					setState(107);
					para();
					}
					break;
				case 8:
					{
					setState(108);
					leer();
					}
					break;
				case 9:
					{
					setState(109);
					booleano();
					}
					break;
				case 10:
					{
					setState(110);
					entero();
					}
					break;
				case 11:
					{
					setState(111);
					real();
					}
					break;
				case 12:
					{
					setState(112);
					imprimir();
					}
					break;
				case 13:
					{
					setState(113);
					cond_si();
					}
					break;
				case 14:
					{
					setState(114);
					declarar_instancia();
					}
					break;
				case 15:
					{
					setState(115);
					instanciar();
					}
					break;
				case 16:
					{
					setState(116);
					asignacion();
					}
					break;
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
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
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
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
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
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
			setState(124);
			match(T__15);
			setState(125);
			match(ID);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__24) | (1L << ID))) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(126);
					entero();
					}
					break;
				case 2:
					{
					setState(127);
					real();
					}
					break;
				case 3:
					{
					setState(128);
					caracter();
					}
					break;
				case 4:
					{
					setState(129);
					cadena();
					}
					break;
				case 5:
					{
					setState(130);
					booleano();
					}
					break;
				case 6:
					{
					setState(131);
					imprimir();
					}
					break;
				case 7:
					{
					setState(132);
					declarar_instancia();
					}
					break;
				case 8:
					{
					setState(133);
					instanciar();
					}
					break;
				case 9:
					{
					setState(134);
					asignacion();
					}
					break;
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
			setState(142);
			match(T__1);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
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
				}
				break;
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(149);
				match(T__7);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(150);
					match(ID);
					}
					break;
				case 2:
					{
					setState(151);
					match(ID);
					setState(152);
					match(T__17);
					setState(153);
					match(Num);
					}
					break;
				}
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
			setState(163);
			match(T__2);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(164);
				match(ID);
				}
				break;
			case 2:
				{
				setState(165);
				match(ID);
				setState(166);
				match(T__17);
				setState(167);
				match(Num);
				}
				break;
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(170);
				match(T__7);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(171);
					match(ID);
					}
					break;
				case 2:
					{
					setState(172);
					match(ID);
					setState(173);
					match(T__17);
					setState(174);
					match(Num);
					}
					break;
				}
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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
			setState(184);
			match(T__3);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(185);
				match(ID);
				}
				break;
			case 2:
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__17);
				setState(188);
				match(T__18);
				setState(189);
				match(ID);
				setState(190);
				match(T__18);
				}
				break;
			case 3:
				{
				setState(191);
				match(ID);
				setState(192);
				match(T__17);
				setState(193);
				match(T__18);
				setState(194);
				match(T__18);
				}
				break;
			case 4:
				{
				setState(195);
				match(ID);
				setState(196);
				match(T__17);
				setState(197);
				match(T__18);
				setState(198);
				match(T__19);
				setState(199);
				match(T__18);
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(202);
				match(T__7);
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(203);
					match(ID);
					}
					break;
				case 2:
					{
					setState(204);
					match(ID);
					setState(205);
					match(T__17);
					setState(206);
					match(T__18);
					setState(207);
					match(ID);
					setState(208);
					match(T__18);
					}
					break;
				case 3:
					{
					setState(209);
					match(ID);
					setState(210);
					match(T__17);
					setState(211);
					match(T__18);
					setState(212);
					match(T__18);
					}
					break;
				case 4:
					{
					setState(213);
					match(ID);
					setState(214);
					match(T__17);
					setState(215);
					match(T__18);
					setState(216);
					match(T__19);
					setState(217);
					match(T__18);
					}
					break;
				}
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
			setState(227);
			match(ID);
			setState(228);
			match(T__17);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(229);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID) | (1L << Num))) != 0)) ) {
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
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==Num) {
					{
					{
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(231);
					match(OPS);
					setState(232);
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
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(238);
				match(ID);
				setState(239);
				match(T__6);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num))) != 0)) {
					{
					{
					setState(240);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__8);
				}
				break;
			}
			}
			setState(249);
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
			setState(251);
			match(ID);
			setState(252);
			match(ID);
			setState(253);
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
			setState(255);
			match(ID);
			setState(256);
			match(T__22);
			setState(257);
			match(ID);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(258);
				match(T__22);
				setState(259);
				match(ID);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(265);
			match(T__17);
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_MULTIPLE() { return getToken(MiLenguajeParser.COMENTARIO_MULTIPLE, 0); }
		public TerminalNode COMENTARIO_SENCILLO() { return getToken(MiLenguajeParser.COMENTARIO_SENCILLO, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==COMENTARIO_MULTIPLE || _la==COMENTARIO_SENCILLO) ) {
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

	public static class Llamar_funcionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public List<TerminalNode> Num() { return getTokens(MiLenguajeParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(MiLenguajeParser.Num, i);
		}
		public Llamar_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamar_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterLlamar_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitLlamar_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLlamar_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamar_funcionContext llamar_funcion() throws RecognitionException {
		Llamar_funcionContext _localctx = new Llamar_funcionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_llamar_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ID);
			setState(272);
			match(T__6);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num))) != 0)) {
				{
				{
				setState(273);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(T__8);
			setState(280);
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
		public List<TerminalNode> STRING() { return getTokens(MiLenguajeParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MiLenguajeParser.STRING, i);
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
		enterRule(_localctx, 24, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__4);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(283);
				match(ID);
				}
				break;
			case 2:
				{
				setState(284);
				match(ID);
				setState(285);
				match(T__17);
				setState(286);
				match(STRING);
				}
				break;
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(289);
				match(T__7);
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(290);
					match(ID);
					}
					break;
				case 2:
					{
					setState(291);
					match(ID);
					setState(292);
					match(T__17);
					setState(293);
					match(STRING);
					}
					break;
				}
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
		enterRule(_localctx, 26, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__5);
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(304);
				match(ID);
				}
				break;
			case 2:
				{
				setState(305);
				match(ID);
				setState(306);
				match(T__17);
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
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
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(310);
				match(T__7);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(311);
					match(ID);
					}
					break;
				case 2:
					{
					setState(312);
					match(ID);
					setState(313);
					match(T__17);
					setState(314);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
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
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
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
		enterRule(_localctx, 28, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__23);
			setState(325);
			match(T__6);
			setState(326);
			match(ID);
			setState(327);
			match(T__8);
			setState(328);
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
		enterRule(_localctx, 30, RULE_imprimir);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__24);
			setState(331);
			match(T__6);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
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
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(338);
				match(T__7);
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(339);
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
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(T__8);
			setState(351);
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
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
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
		enterRule(_localctx, 32, RULE_cond_si);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__25);
			setState(354);
			match(T__6);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(362);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case Num:
						{
						setState(355);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==Num) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(356);
						_la = _input.LA(1);
						if ( !(_la==OPS || _la==IGAULDADES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(357);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID) | (1L << Num))) != 0)) ) {
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
						setState(358);
						match(IGAULDADES);
						setState(359);
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
						setState(360);
						match(T__6);
						}
						break;
					case T__8:
						{
						setState(361);
						match(T__8);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(367);
			match(T__8);
			setState(368);
			match(T__26);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(369);
					match(ID);
					}
					break;
				case 2:
					{
					setState(370);
					match(Num);
					}
					break;
				case 3:
					{
					setState(371);
					asignacion();
					}
					break;
				case 4:
					{
					setState(372);
					entero();
					}
					break;
				case 5:
					{
					setState(373);
					real();
					}
					break;
				case 6:
					{
					setState(374);
					caracter();
					}
					break;
				case 7:
					{
					setState(375);
					cadena();
					}
					break;
				case 8:
					{
					setState(376);
					booleano();
					}
					break;
				case 9:
					{
					setState(377);
					leer();
					}
					break;
				case 10:
					{
					setState(378);
					booleano();
					}
					break;
				case 11:
					{
					setState(379);
					imprimir();
					}
					break;
				case 12:
					{
					setState(380);
					cond_si();
					}
					break;
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(386);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(387);
				match(T__28);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
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
				match(T__27);
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
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
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
		enterRule(_localctx, 34, RULE_mientras);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__29);
			setState(409);
			match(T__6);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(417);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case Num:
						{
						setState(410);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==Num) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(411);
						_la = _input.LA(1);
						if ( !(_la==OPS || _la==IGAULDADES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(412);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID) | (1L << Num))) != 0)) ) {
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
						setState(413);
						match(IGAULDADES);
						setState(414);
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
						setState(415);
						match(T__6);
						}
						break;
					case T__8:
						{
						setState(416);
						match(T__8);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(422);
			match(T__8);
			setState(423);
			match(T__9);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(424);
					match(ID);
					}
					break;
				case 2:
					{
					setState(425);
					match(Num);
					}
					break;
				case 3:
					{
					setState(426);
					asignacion();
					}
					break;
				case 4:
					{
					setState(427);
					entero();
					}
					break;
				case 5:
					{
					setState(428);
					real();
					}
					break;
				case 6:
					{
					setState(429);
					caracter();
					}
					break;
				case 7:
					{
					setState(430);
					cadena();
					}
					break;
				case 8:
					{
					setState(431);
					booleano();
					}
					break;
				case 9:
					{
					setState(432);
					leer();
					}
					break;
				case 10:
					{
					setState(433);
					booleano();
					}
					break;
				case 11:
					{
					setState(434);
					imprimir();
					}
					break;
				case 12:
					{
					setState(435);
					cond_si();
					}
					break;
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(T__30);
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
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
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
		enterRule(_localctx, 36, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__31);
			setState(444);
			match(T__6);
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(445);
				entero();
				}
				break;
			case ID:
				{
				setState(446);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << IGAULDADES))) != 0)) {
				{
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case Num:
					{
					setState(449);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(450);
					_la = _input.LA(1);
					if ( !(_la==OPS || _la==IGAULDADES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(451);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID) | (1L << Num))) != 0)) ) {
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
					setState(452);
					match(IGAULDADES);
					setState(453);
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
					setState(454);
					match(T__6);
					}
					break;
				case T__8:
					{
					setState(455);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			match(T__11);
			setState(462);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(463);
			match(T__8);
			setState(464);
			match(T__9);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(465);
					match(ID);
					}
					break;
				case 2:
					{
					setState(466);
					match(Num);
					}
					break;
				case 3:
					{
					setState(467);
					asignacion();
					}
					break;
				case 4:
					{
					setState(468);
					entero();
					}
					break;
				case 5:
					{
					setState(469);
					real();
					}
					break;
				case 6:
					{
					setState(470);
					caracter();
					}
					break;
				case 7:
					{
					setState(471);
					cadena();
					}
					break;
				case 8:
					{
					setState(472);
					booleano();
					}
					break;
				case 9:
					{
					setState(473);
					leer();
					}
					break;
				case 10:
					{
					setState(474);
					booleano();
					}
					break;
				case 11:
					{
					setState(475);
					imprimir();
					}
					break;
				case 12:
					{
					setState(476);
					cond_si();
					}
					break;
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(T__32);
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
		public List<SeleccionarContext> seleccionar() {
			return getRuleContexts(SeleccionarContext.class);
		}
		public SeleccionarContext seleccionar(int i) {
			return getRuleContext(SeleccionarContext.class,i);
		}
		public List<TerminalNode> IGAULDADES() { return getTokens(MiLenguajeParser.IGAULDADES); }
		public TerminalNode IGAULDADES(int i) {
			return getToken(MiLenguajeParser.IGAULDADES, i);
		}
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
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
		enterRule(_localctx, 38, RULE_hacer_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__9);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(485);
					match(ID);
					}
					break;
				case 2:
					{
					setState(486);
					match(Num);
					}
					break;
				case 3:
					{
					setState(487);
					asignacion();
					}
					break;
				case 4:
					{
					setState(488);
					entero();
					}
					break;
				case 5:
					{
					setState(489);
					real();
					}
					break;
				case 6:
					{
					setState(490);
					caracter();
					}
					break;
				case 7:
					{
					setState(491);
					cadena();
					}
					break;
				case 8:
					{
					setState(492);
					booleano();
					}
					break;
				case 9:
					{
					setState(493);
					leer();
					}
					break;
				case 10:
					{
					setState(494);
					booleano();
					}
					break;
				case 11:
					{
					setState(495);
					imprimir();
					}
					break;
				case 12:
					{
					setState(496);
					cond_si();
					}
					break;
				case 13:
					{
					setState(497);
					seleccionar();
					}
					break;
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
			match(T__29);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << IGAULDADES))) != 0)) {
				{
				setState(511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case Num:
					{
					setState(504);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(505);
					_la = _input.LA(1);
					if ( !(_la==OPS || _la==IGAULDADES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(506);
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
					setState(507);
					match(IGAULDADES);
					setState(508);
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
					setState(509);
					match(T__6);
					}
					break;
				case T__8:
					{
					setState(510);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
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
		public List<SeleccionarContext> seleccionar() {
			return getRuleContexts(SeleccionarContext.class);
		}
		public SeleccionarContext seleccionar(int i) {
			return getRuleContext(SeleccionarContext.class,i);
		}
		public List<Llamar_funcionContext> llamar_funcion() {
			return getRuleContexts(Llamar_funcionContext.class);
		}
		public Llamar_funcionContext llamar_funcion(int i) {
			return getRuleContext(Llamar_funcionContext.class,i);
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
		enterRule(_localctx, 40, RULE_seleccionar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__33);
			setState(519);
			match(T__6);
			setState(520);
			match(ID);
			setState(521);
			match(T__8);
			setState(522);
			match(T__34);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__36) {
				{
				{
				setState(526);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(523);
					match(T__35);
					setState(524);
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
				case T__36:
					{
					setState(525);
					match(T__36);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(528);
				match(T__37);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__33) | (1L << T__38) | (1L << ID) | (1L << Num))) != 0)) {
					{
					setState(544);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(529);
						match(ID);
						}
						break;
					case 2:
						{
						setState(530);
						match(Num);
						}
						break;
					case 3:
						{
						setState(531);
						asignacion();
						}
						break;
					case 4:
						{
						setState(532);
						entero();
						}
						break;
					case 5:
						{
						setState(533);
						real();
						}
						break;
					case 6:
						{
						setState(534);
						caracter();
						}
						break;
					case 7:
						{
						setState(535);
						cadena();
						}
						break;
					case 8:
						{
						setState(536);
						booleano();
						}
						break;
					case 9:
						{
						setState(537);
						leer();
						}
						break;
					case 10:
						{
						setState(538);
						booleano();
						}
						break;
					case 11:
						{
						setState(539);
						imprimir();
						}
						break;
					case 12:
						{
						setState(540);
						cond_si();
						}
						break;
					case 13:
						{
						setState(541);
						seleccionar();
						}
						break;
					case 14:
						{
						setState(542);
						llamar_funcion();
						}
						break;
					case 15:
						{
						setState(543);
						match(T__38);
						}
						break;
					}
					}
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(T__39);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u022f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\3\3\3\3\3\3\7\3A\n"+
		"\3\f\3\16\3D\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\7\3_\n\3\f\3\16\3"+
		"b\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4x\n\4\f\4\16\4{\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0096\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u009d\n\6\7\6\u009f"+
		"\n\6\f\6\16\6\u00a2\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00ab\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u00b2\n\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00cb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00dd\n\b\7\b\u00df\n\b\f\b\16\b\u00e2\13\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u00ec\n\t\f\t\16\t\u00ef\13\t\3\t\3\t\3\t\7\t\u00f4"+
		"\n\t\f\t\16\t\u00f7\13\t\3\t\5\t\u00fa\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0107\n\13\f\13\16\13\u010a\13\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\u0115\n\r\f\r\16\r\u0118\13\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0122\n\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0129\n\16\7\16\u012b\n\16\f\16\16\16\u012e\13\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0137\n\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u013e\n\17\7\17\u0140\n\17\f\17\16\17\u0143\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0150\n\21\f\21\16\21\u0153\13"+
		"\21\3\21\3\21\7\21\u0157\n\21\f\21\16\21\u015a\13\21\7\21\u015c\n\21\f"+
		"\21\16\21\u015f\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u016d\n\22\f\22\16\22\u0170\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0180\n\22\f\22"+
		"\16\22\u0183\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u0193\n\22\f\22\16\22\u0196\13\22\3\22\5\22\u0199"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01a4\n\23\f\23"+
		"\16\23\u01a7\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u01b7\n\23\f\23\16\23\u01ba\13\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\5\24\u01c2\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u01cb\n\24\f\24\16\24\u01ce\13\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01e0\n\24\f\24"+
		"\16\24\u01e3\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u01f5\n\25\f\25\16\25\u01f8\13\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0202\n\25\f\25\16\25\u0205"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0211\n"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u0223\n\26\f\26\16\26\u0226\13\26\7\26\u0228\n\26\f"+
		"\26\16\26\u022b\13\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\r\4\2\4\b--\5\2\4\b\n\n--\5\2\n\n-.\60\60\4\2\27"+
		"\30-.\3\2-.\4\2\n\n-.\3\2+,\3\2\27\30\7\2\t\t\13\13-.\60\60\64\64\3\2"+
		"\60\61\4\2\t\t-.\2\u02c4\2\60\3\2\2\2\4;\3\2\2\2\6f\3\2\2\2\b~\3\2\2\2"+
		"\n\u0090\3\2\2\2\f\u00a5\3\2\2\2\16\u00ba\3\2\2\2\20\u00e5\3\2\2\2\22"+
		"\u00fd\3\2\2\2\24\u0101\3\2\2\2\26\u010f\3\2\2\2\30\u0111\3\2\2\2\32\u011c"+
		"\3\2\2\2\34\u0131\3\2\2\2\36\u0146\3\2\2\2 \u014c\3\2\2\2\"\u0163\3\2"+
		"\2\2$\u019a\3\2\2\2&\u01bd\3\2\2\2(\u01e6\3\2\2\2*\u0208\3\2\2\2,/\5\4"+
		"\3\2-/\5\b\5\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2"+
		"\2\61\63\3\2\2\2\62\60\3\2\2\2\638\5\6\4\2\64\67\5\4\3\2\65\67\5\b\5\2"+
		"\66\64\3\2\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2"+
		"\2\2:8\3\2\2\2;<\7\3\2\2<=\t\2\2\2=>\7-\2\2>B\7\t\2\2?A\t\3\2\2@?\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\13\2\2FY\7"+
		"\f\2\2GX\5\26\f\2HX\5\16\b\2IX\5\32\16\2JX\5*\26\2KX\5(\25\2LX\5$\23\2"+
		"MX\5&\24\2NX\5\36\20\2OX\5\34\17\2PX\5\n\6\2QX\5\f\7\2RX\5 \21\2SX\5\""+
		"\22\2TX\5\22\n\2UX\5\24\13\2VX\5\20\t\2WG\3\2\2\2WH\3\2\2\2WI\3\2\2\2"+
		"WJ\3\2\2\2WK\3\2\2\2WL\3\2\2\2WM\3\2\2\2WN\3\2\2\2WO\3\2\2\2WP\3\2\2\2"+
		"WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\7\r\2\2]_\t\4\2\2^]\3\2\2"+
		"\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\16\2\2de\7\17"+
		"\2\2e\5\3\2\2\2fy\7\20\2\2gx\5\26\f\2hx\5\16\b\2ix\5\32\16\2jx\5*\26\2"+
		"kx\5(\25\2lx\5$\23\2mx\5&\24\2nx\5\36\20\2ox\5\34\17\2px\5\n\6\2qx\5\f"+
		"\7\2rx\5 \21\2sx\5\"\22\2tx\5\22\n\2ux\5\24\13\2vx\5\20\t\2wg\3\2\2\2"+
		"wh\3\2\2\2wi\3\2\2\2wj\3\2\2\2wk\3\2\2\2wl\3\2\2\2wm\3\2\2\2wn\3\2\2\2"+
		"wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2"+
		"wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\21\2"+
		"\2}\7\3\2\2\2~\177\7\22\2\2\177\u008b\7-\2\2\u0080\u008a\5\n\6\2\u0081"+
		"\u008a\5\f\7\2\u0082\u008a\5\16\b\2\u0083\u008a\5\32\16\2\u0084\u008a"+
		"\5\34\17\2\u0085\u008a\5 \21\2\u0086\u008a\5\22\n\2\u0087\u008a\5\24\13"+
		"\2\u0088\u008a\5\20\t\2\u0089\u0080\3\2\2\2\u0089\u0081\3\2\2\2\u0089"+
		"\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2"+
		"\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\23\2\2\u008f\t\3\2\2\2\u0090\u0095"+
		"\7\4\2\2\u0091\u0096\7-\2\2\u0092\u0093\7-\2\2\u0093\u0094\7\24\2\2\u0094"+
		"\u0096\7.\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u00a0\3\2"+
		"\2\2\u0097\u009c\7\n\2\2\u0098\u009d\7-\2\2\u0099\u009a\7-\2\2\u009a\u009b"+
		"\7\24\2\2\u009b\u009d\7.\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u0097\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a4\7\16\2\2\u00a4\13\3\2\2\2\u00a5\u00aa\7\5\2\2\u00a6\u00ab\7-\2"+
		"\2\u00a7\u00a8\7-\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00ab\7.\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00b5\3\2\2\2\u00ac\u00b1\7\n\2\2\u00ad"+
		"\u00b2\7-\2\2\u00ae\u00af\7-\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b2\7.\2"+
		"\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\16\2\2\u00b9\r\3\2\2"+
		"\2\u00ba\u00ca\7\6\2\2\u00bb\u00cb\7-\2\2\u00bc\u00bd\7-\2\2\u00bd\u00be"+
		"\7\24\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7-\2\2\u00c0\u00cb\7\25\2\2"+
		"\u00c1\u00c2\7-\2\2\u00c2\u00c3\7\24\2\2\u00c3\u00c4\7\25\2\2\u00c4\u00cb"+
		"\7\25\2\2\u00c5\u00c6\7-\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8\7\25\2\2"+
		"\u00c8\u00c9\7\26\2\2\u00c9\u00cb\7\25\2\2\u00ca\u00bb\3\2\2\2\u00ca\u00bc"+
		"\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\u00e0\3\2\2\2\u00cc"+
		"\u00dc\7\n\2\2\u00cd\u00dd\7-\2\2\u00ce\u00cf\7-\2\2\u00cf\u00d0\7\24"+
		"\2\2\u00d0\u00d1\7\25\2\2\u00d1\u00d2\7-\2\2\u00d2\u00dd\7\25\2\2\u00d3"+
		"\u00d4\7-\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\7\25\2\2\u00d6\u00dd\7"+
		"\25\2\2\u00d7\u00d8\7-\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\7\25\2\2\u00da"+
		"\u00db\7\26\2\2\u00db\u00dd\7\25\2\2\u00dc\u00cd\3\2\2\2\u00dc\u00ce\3"+
		"\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00cc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\16\2\2\u00e4"+
		"\17\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6\u00f9\7\24\2\2\u00e7\u00fa\t\5\2"+
		"\2\u00e8\u00e9\t\6\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00ec\t\6\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00fa\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1"+
		"\u00f5\7\t\2\2\u00f2\u00f4\t\7\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\7\13\2\2\u00f9\u00e7\3\2\2\2\u00f9\u00ed\3"+
		"\2\2\2\u00f9\u00f0\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fc"+
		"\21\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\u00ff\7-\2\2\u00ff\u0100\7\16\2\2"+
		"\u0100\23\3\2\2\2\u0101\u0102\7-\2\2\u0102\u0103\7\31\2\2\u0103\u0108"+
		"\7-\2\2\u0104\u0105\7\31\2\2\u0105\u0107\7-\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\24\2\2\u010c\u010d\t\6\2\2\u010d"+
		"\u010e\7\16\2\2\u010e\25\3\2\2\2\u010f\u0110\t\b\2\2\u0110\27\3\2\2\2"+
		"\u0111\u0112\7-\2\2\u0112\u0116\7\t\2\2\u0113\u0115\t\7\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\13\2\2\u011a\u011b\7"+
		"\16\2\2\u011b\31\3\2\2\2\u011c\u0121\7\7\2\2\u011d\u0122\7-\2\2\u011e"+
		"\u011f\7-\2\2\u011f\u0120\7\24\2\2\u0120\u0122\7\64\2\2\u0121\u011d\3"+
		"\2\2\2\u0121\u011e\3\2\2\2\u0122\u012c\3\2\2\2\u0123\u0128\7\n\2\2\u0124"+
		"\u0129\7-\2\2\u0125\u0126\7-\2\2\u0126\u0127\7\24\2\2\u0127\u0129\7\64"+
		"\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0123\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\16\2\2\u0130"+
		"\33\3\2\2\2\u0131\u0136\7\b\2\2\u0132\u0137\7-\2\2\u0133\u0134\7-\2\2"+
		"\u0134\u0135\7\24\2\2\u0135\u0137\t\t\2\2\u0136\u0132\3\2\2\2\u0136\u0133"+
		"\3\2\2\2\u0137\u0141\3\2\2\2\u0138\u013d\7\n\2\2\u0139\u013e\7-\2\2\u013a"+
		"\u013b\7-\2\2\u013b\u013c\7\24\2\2\u013c\u013e\t\t\2\2\u013d\u0139\3\2"+
		"\2\2\u013d\u013a\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0138\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\16\2\2\u0145\35\3\2\2\2\u0146\u0147"+
		"\7\32\2\2\u0147\u0148\7\t\2\2\u0148\u0149\7-\2\2\u0149\u014a\7\13\2\2"+
		"\u014a\u014b\7\16\2\2\u014b\37\3\2\2\2\u014c\u014d\7\33\2\2\u014d\u0151"+
		"\7\t\2\2\u014e\u0150\t\n\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u015d\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0158\7\n\2\2\u0155\u0157\t\n\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u0154\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0161\7\13\2\2\u0161\u0162\7\16\2\2\u0162!\3\2\2\2\u0163\u0164"+
		"\7\34\2\2\u0164\u016e\7\t\2\2\u0165\u0166\t\6\2\2\u0166\u0167\t\13\2\2"+
		"\u0167\u016d\t\5\2\2\u0168\u0169\7\61\2\2\u0169\u016d\t\f\2\2\u016a\u016d"+
		"\7\t\2\2\u016b\u016d\7\13\2\2\u016c\u0165\3\2\2\2\u016c\u0168\3\2\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0172\7\13\2\2\u0172\u0181\7\35\2\2\u0173\u0180\7-\2\2\u0174\u0180\7"+
		".\2\2\u0175\u0180\5\20\t\2\u0176\u0180\5\n\6\2\u0177\u0180\5\f\7\2\u0178"+
		"\u0180\5\16\b\2\u0179\u0180\5\32\16\2\u017a\u0180\5\34\17\2\u017b\u0180"+
		"\5\36\20\2\u017c\u0180\5\34\17\2\u017d\u0180\5 \21\2\u017e\u0180\5\"\22"+
		"\2\u017f\u0173\3\2\2\2\u017f\u0174\3\2\2\2\u017f\u0175\3\2\2\2\u017f\u0176"+
		"\3\2\2\2\u017f\u0177\3\2\2\2\u017f\u0178\3\2\2\2\u017f\u0179\3\2\2\2\u017f"+
		"\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0198\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0199\7\36"+
		"\2\2\u0185\u0194\7\37\2\2\u0186\u0193\7-\2\2\u0187\u0193\7.\2\2\u0188"+
		"\u0193\5\20\t\2\u0189\u0193\5\n\6\2\u018a\u0193\5\f\7\2\u018b\u0193\5"+
		"\16\b\2\u018c\u0193\5\32\16\2\u018d\u0193\5\34\17\2\u018e\u0193\5\36\20"+
		"\2\u018f\u0193\5\34\17\2\u0190\u0193\5 \21\2\u0191\u0193\5\"\22\2\u0192"+
		"\u0186\3\2\2\2\u0192\u0187\3\2\2\2\u0192\u0188\3\2\2\2\u0192\u0189\3\2"+
		"\2\2\u0192\u018a\3\2\2\2\u0192\u018b\3\2\2\2\u0192\u018c\3\2\2\2\u0192"+
		"\u018d\3\2\2\2\u0192\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\7\36"+
		"\2\2\u0198\u0184\3\2\2\2\u0198\u0185\3\2\2\2\u0199#\3\2\2\2\u019a\u019b"+
		"\7 \2\2\u019b\u01a5\7\t\2\2\u019c\u019d\t\6\2\2\u019d\u019e\t\13\2\2\u019e"+
		"\u01a4\t\5\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a4\t\f\2\2\u01a1\u01a4\7"+
		"\t\2\2\u01a2\u01a4\7\13\2\2\u01a3\u019c\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01a9\7\13\2\2\u01a9\u01b8\7\f\2\2\u01aa\u01b7\7-\2\2\u01ab\u01b7\7."+
		"\2\2\u01ac\u01b7\5\20\t\2\u01ad\u01b7\5\n\6\2\u01ae\u01b7\5\f\7\2\u01af"+
		"\u01b7\5\16\b\2\u01b0\u01b7\5\32\16\2\u01b1\u01b7\5\34\17\2\u01b2\u01b7"+
		"\5\36\20\2\u01b3\u01b7\5\34\17\2\u01b4\u01b7\5 \21\2\u01b5\u01b7\5\"\22"+
		"\2\u01b6\u01aa\3\2\2\2\u01b6\u01ab\3\2\2\2\u01b6\u01ac\3\2\2\2\u01b6\u01ad"+
		"\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01af\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6"+
		"\u01b1\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7!"+
		"\2\2\u01bc%\3\2\2\2\u01bd\u01be\7\"\2\2\u01be\u01c1\7\t\2\2\u01bf\u01c2"+
		"\5\n\6\2\u01c0\u01c2\5\20\t\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2"+
		"\u01c2\u01cc\3\2\2\2\u01c3\u01c4\t\6\2\2\u01c4\u01c5\t\13\2\2\u01c5\u01cb"+
		"\t\5\2\2\u01c6\u01c7\7\61\2\2\u01c7\u01cb\t\f\2\2\u01c8\u01cb\7\t\2\2"+
		"\u01c9\u01cb\7\13\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c6\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\16"+
		"\2\2\u01d0\u01d1\t\6\2\2\u01d1\u01d2\7\13\2\2\u01d2\u01e1\7\f\2\2\u01d3"+
		"\u01e0\7-\2\2\u01d4\u01e0\7.\2\2\u01d5\u01e0\5\20\t\2\u01d6\u01e0\5\n"+
		"\6\2\u01d7\u01e0\5\f\7\2\u01d8\u01e0\5\16\b\2\u01d9\u01e0\5\32\16\2\u01da"+
		"\u01e0\5\34\17\2\u01db\u01e0\5\36\20\2\u01dc\u01e0\5\34\17\2\u01dd\u01e0"+
		"\5 \21\2\u01de\u01e0\5\"\22\2\u01df\u01d3\3\2\2\2\u01df\u01d4\3\2\2\2"+
		"\u01df\u01d5\3\2\2\2\u01df\u01d6\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01d8"+
		"\3\2\2\2\u01df\u01d9\3\2\2\2\u01df\u01da\3\2\2\2\u01df\u01db\3\2\2\2\u01df"+
		"\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e5\7#\2\2\u01e5\'\3\2\2\2\u01e6\u01f6\7\f\2\2"+
		"\u01e7\u01f5\7-\2\2\u01e8\u01f5\7.\2\2\u01e9\u01f5\5\20\t\2\u01ea\u01f5"+
		"\5\n\6\2\u01eb\u01f5\5\f\7\2\u01ec\u01f5\5\16\b\2\u01ed\u01f5\5\32\16"+
		"\2\u01ee\u01f5\5\34\17\2\u01ef\u01f5\5\36\20\2\u01f0\u01f5\5\34\17\2\u01f1"+
		"\u01f5\5 \21\2\u01f2\u01f5\5\"\22\2\u01f3\u01f5\5*\26\2\u01f4\u01e7\3"+
		"\2\2\2\u01f4\u01e8\3\2\2\2\u01f4\u01e9\3\2\2\2\u01f4\u01ea\3\2\2\2\u01f4"+
		"\u01eb\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4\u01ed\3\2\2\2\u01f4\u01ee\3\2"+
		"\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u0203\7 \2\2\u01fa\u01fb\t\6\2\2\u01fb\u01fc\t\13\2\2\u01fc\u0202\t\6"+
		"\2\2\u01fd\u01fe\7\61\2\2\u01fe\u0202\t\f\2\2\u01ff\u0202\7\t\2\2\u0200"+
		"\u0202\7\13\2\2\u0201\u01fa\3\2\2\2\u0201\u01fd\3\2\2\2\u0201\u01ff\3"+
		"\2\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\16"+
		"\2\2\u0207)\3\2\2\2\u0208\u0209\7$\2\2\u0209\u020a\7\t\2\2\u020a\u020b"+
		"\7-\2\2\u020b\u020c\7\13\2\2\u020c\u0229\7%\2\2\u020d\u020e\7&\2\2\u020e"+
		"\u0211\t\6\2\2\u020f\u0211\7\'\2\2\u0210\u020d\3\2\2\2\u0210\u020f\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0224\7(\2\2\u0213\u0223\7-\2\2\u0214\u0223"+
		"\7.\2\2\u0215\u0223\5\20\t\2\u0216\u0223\5\n\6\2\u0217\u0223\5\f\7\2\u0218"+
		"\u0223\5\16\b\2\u0219\u0223\5\32\16\2\u021a\u0223\5\34\17\2\u021b\u0223"+
		"\5\36\20\2\u021c\u0223\5\34\17\2\u021d\u0223\5 \21\2\u021e\u0223\5\"\22"+
		"\2\u021f\u0223\5*\26\2\u0220\u0223\5\30\r\2\u0221\u0223\7)\2\2\u0222\u0213"+
		"\3\2\2\2\u0222\u0214\3\2\2\2\u0222\u0215\3\2\2\2\u0222\u0216\3\2\2\2\u0222"+
		"\u0217\3\2\2\2\u0222\u0218\3\2\2\2\u0222\u0219\3\2\2\2\u0222\u021a\3\2"+
		"\2\2\u0222\u021b\3\2\2\2\u0222\u021c\3\2\2\2\u0222\u021d\3\2\2\2\u0222"+
		"\u021e\3\2\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2"+
		"\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0210\3\2\2\2\u0228\u022b\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\7*\2\2\u022d+\3\2\2\2=.\60\668BWY`wy\u0089"+
		"\u008b\u0095\u009c\u00a0\u00aa\u00b1\u00b5\u00ca\u00dc\u00e0\u00ed\u00f5"+
		"\u00f9\u0108\u0116\u0121\u0128\u012c\u0136\u013d\u0141\u0151\u0158\u015d"+
		"\u016c\u016e\u017f\u0181\u0192\u0194\u0198\u01a3\u01a5\u01b6\u01b8\u01c1"+
		"\u01ca\u01cc\u01df\u01e1\u01f4\u01f6\u0201\u0203\u0210\u0222\u0224\u0229";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}