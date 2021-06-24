// Generated from C:/Users/ASUS/Desktop/Lenguajes de programacion/Lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
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
		public List<TerminalNode> OPS() { return getTokens(MiLenguajeParser.OPS); }
		public TerminalNode OPS(int i) {
			return getToken(MiLenguajeParser.OPS, i);
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
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << OPS))) != 0)) {
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(170);
					match(ID);
					}
					break;
				case OPS:
					{
					setState(171);
					match(OPS);
					}
					break;
				case T__7:
					{
					setState(172);
					match(T__7);
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(173);
						match(OPS);
						}
						break;
					case 2:
						{
						setState(174);
						match(ID);
						}
						break;
					case 3:
						{
						setState(175);
						match(ID);
						setState(176);
						match(T__17);
						setState(177);
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
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
			setState(187);
			match(T__3);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(188);
				match(ID);
				}
				break;
			case 2:
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__17);
				setState(191);
				match(T__18);
				setState(192);
				match(ID);
				setState(193);
				match(T__18);
				}
				break;
			case 3:
				{
				setState(194);
				match(ID);
				setState(195);
				match(T__17);
				setState(196);
				match(T__18);
				setState(197);
				match(T__18);
				}
				break;
			case 4:
				{
				setState(198);
				match(ID);
				setState(199);
				match(T__17);
				setState(200);
				match(T__18);
				setState(201);
				match(T__19);
				setState(202);
				match(T__18);
				}
				break;
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(205);
				match(T__7);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(206);
					match(ID);
					}
					break;
				case 2:
					{
					setState(207);
					match(ID);
					setState(208);
					match(T__17);
					setState(209);
					match(T__18);
					setState(210);
					match(ID);
					setState(211);
					match(T__18);
					}
					break;
				case 3:
					{
					setState(212);
					match(ID);
					setState(213);
					match(T__17);
					setState(214);
					match(T__18);
					setState(215);
					match(T__18);
					}
					break;
				case 4:
					{
					setState(216);
					match(ID);
					setState(217);
					match(T__17);
					setState(218);
					match(T__18);
					setState(219);
					match(T__19);
					setState(220);
					match(T__18);
					}
					break;
				}
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
			setState(230);
			match(ID);
			setState(231);
			match(T__17);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(232);
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
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==Num) {
					{
					{
					setState(233);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(234);
					match(OPS);
					setState(235);
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
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(241);
				match(ID);
				setState(242);
				match(T__6);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num))) != 0)) {
					{
					{
					setState(243);
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
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__8);
				}
				break;
			}
			}
			setState(252);
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
			setState(254);
			match(ID);
			setState(255);
			match(ID);
			setState(256);
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
			setState(258);
			match(ID);
			setState(259);
			match(T__22);
			setState(260);
			match(ID);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(261);
				match(T__22);
				setState(262);
				match(ID);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(268);
			match(T__17);
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270);
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
			setState(272);
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
			setState(274);
			match(ID);
			setState(275);
			match(T__6);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID) | (1L << Num))) != 0)) {
				{
				{
				setState(276);
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
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(T__8);
			setState(283);
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
			setState(285);
			match(T__4);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(286);
				match(ID);
				}
				break;
			case 2:
				{
				setState(287);
				match(ID);
				setState(288);
				match(T__17);
				setState(289);
				match(STRING);
				}
				break;
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(292);
				match(T__7);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(293);
					match(ID);
					}
					break;
				case 2:
					{
					setState(294);
					match(ID);
					setState(295);
					match(T__17);
					setState(296);
					match(STRING);
					}
					break;
				}
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
			setState(306);
			match(T__5);
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(307);
				match(ID);
				}
				break;
			case 2:
				{
				setState(308);
				match(ID);
				setState(309);
				match(T__17);
				setState(310);
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
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(313);
				match(T__7);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(314);
					match(ID);
					}
					break;
				case 2:
					{
					setState(315);
					match(ID);
					setState(316);
					match(T__17);
					setState(317);
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
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
			setState(327);
			match(T__23);
			setState(328);
			match(T__6);
			setState(329);
			match(ID);
			setState(330);
			match(T__8);
			setState(331);
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
			setState(333);
			match(T__24);
			setState(334);
			match(T__6);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
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
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(341);
				match(T__7);
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(342);
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
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(T__8);
			setState(354);
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
			setState(356);
			match(T__25);
			setState(357);
			match(T__6);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(365);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case Num:
						{
						setState(358);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==Num) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						_la = _input.LA(1);
						if ( !(_la==OPS || _la==IGAULDADES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(360);
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
						setState(361);
						match(IGAULDADES);
						setState(362);
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
						setState(363);
						match(T__6);
						}
						break;
					case T__8:
						{
						setState(364);
						match(T__8);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(370);
			match(T__8);
			setState(371);
			match(T__26);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(372);
					match(ID);
					}
					break;
				case 2:
					{
					setState(373);
					match(Num);
					}
					break;
				case 3:
					{
					setState(374);
					asignacion();
					}
					break;
				case 4:
					{
					setState(375);
					entero();
					}
					break;
				case 5:
					{
					setState(376);
					real();
					}
					break;
				case 6:
					{
					setState(377);
					caracter();
					}
					break;
				case 7:
					{
					setState(378);
					cadena();
					}
					break;
				case 8:
					{
					setState(379);
					booleano();
					}
					break;
				case 9:
					{
					setState(380);
					leer();
					}
					break;
				case 10:
					{
					setState(381);
					booleano();
					}
					break;
				case 11:
					{
					setState(382);
					imprimir();
					}
					break;
				case 12:
					{
					setState(383);
					cond_si();
					}
					break;
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(389);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(390);
				match(T__28);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(391);
						match(ID);
						}
						break;
					case 2:
						{
						setState(392);
						match(Num);
						}
						break;
					case 3:
						{
						setState(393);
						asignacion();
						}
						break;
					case 4:
						{
						setState(394);
						entero();
						}
						break;
					case 5:
						{
						setState(395);
						real();
						}
						break;
					case 6:
						{
						setState(396);
						caracter();
						}
						break;
					case 7:
						{
						setState(397);
						cadena();
						}
						break;
					case 8:
						{
						setState(398);
						booleano();
						}
						break;
					case 9:
						{
						setState(399);
						leer();
						}
						break;
					case 10:
						{
						setState(400);
						booleano();
						}
						break;
					case 11:
						{
						setState(401);
						imprimir();
						}
						break;
					case 12:
						{
						setState(402);
						cond_si();
						}
						break;
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
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
			setState(411);
			match(T__29);
			setState(412);
			match(T__6);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
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
						_la = _input.LA(1);
						if ( !(_la==OPS || _la==IGAULDADES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(415);
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
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(425);
			match(T__8);
			setState(426);
			match(T__9);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(427);
					match(ID);
					}
					break;
				case 2:
					{
					setState(428);
					match(Num);
					}
					break;
				case 3:
					{
					setState(429);
					asignacion();
					}
					break;
				case 4:
					{
					setState(430);
					entero();
					}
					break;
				case 5:
					{
					setState(431);
					real();
					}
					break;
				case 6:
					{
					setState(432);
					caracter();
					}
					break;
				case 7:
					{
					setState(433);
					cadena();
					}
					break;
				case 8:
					{
					setState(434);
					booleano();
					}
					break;
				case 9:
					{
					setState(435);
					leer();
					}
					break;
				case 10:
					{
					setState(436);
					booleano();
					}
					break;
				case 11:
					{
					setState(437);
					imprimir();
					}
					break;
				case 12:
					{
					setState(438);
					cond_si();
					}
					break;
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
			setState(446);
			match(T__31);
			setState(447);
			match(T__6);
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(448);
				entero();
				}
				break;
			case ID:
				{
				setState(449);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << IGAULDADES))) != 0)) {
				{
				setState(459);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case Num:
					{
					setState(452);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(453);
					_la = _input.LA(1);
					if ( !(_la==OPS || _la==IGAULDADES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(454);
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
					setState(455);
					match(IGAULDADES);
					setState(456);
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
					setState(457);
					match(T__6);
					}
					break;
				case T__8:
					{
					setState(458);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(T__11);
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(466);
			match(T__8);
			setState(467);
			match(T__9);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(468);
					match(ID);
					}
					break;
				case 2:
					{
					setState(469);
					match(Num);
					}
					break;
				case 3:
					{
					setState(470);
					asignacion();
					}
					break;
				case 4:
					{
					setState(471);
					entero();
					}
					break;
				case 5:
					{
					setState(472);
					real();
					}
					break;
				case 6:
					{
					setState(473);
					caracter();
					}
					break;
				case 7:
					{
					setState(474);
					cadena();
					}
					break;
				case 8:
					{
					setState(475);
					booleano();
					}
					break;
				case 9:
					{
					setState(476);
					leer();
					}
					break;
				case 10:
					{
					setState(477);
					booleano();
					}
					break;
				case 11:
					{
					setState(478);
					imprimir();
					}
					break;
				case 12:
					{
					setState(479);
					cond_si();
					}
					break;
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
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
			setState(487);
			match(T__9);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__33) | (1L << ID) | (1L << Num))) != 0)) {
				{
				setState(501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(488);
					match(ID);
					}
					break;
				case 2:
					{
					setState(489);
					match(Num);
					}
					break;
				case 3:
					{
					setState(490);
					asignacion();
					}
					break;
				case 4:
					{
					setState(491);
					entero();
					}
					break;
				case 5:
					{
					setState(492);
					real();
					}
					break;
				case 6:
					{
					setState(493);
					caracter();
					}
					break;
				case 7:
					{
					setState(494);
					cadena();
					}
					break;
				case 8:
					{
					setState(495);
					booleano();
					}
					break;
				case 9:
					{
					setState(496);
					leer();
					}
					break;
				case 10:
					{
					setState(497);
					booleano();
					}
					break;
				case 11:
					{
					setState(498);
					imprimir();
					}
					break;
				case 12:
					{
					setState(499);
					cond_si();
					}
					break;
				case 13:
					{
					setState(500);
					seleccionar();
					}
					break;
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(T__29);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ID) | (1L << Num) | (1L << IGAULDADES))) != 0)) {
				{
				setState(514);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case Num:
					{
					setState(507);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==Num) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(508);
					_la = _input.LA(1);
					if ( !(_la==OPS || _la==IGAULDADES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(509);
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
					setState(510);
					match(IGAULDADES);
					setState(511);
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
					setState(512);
					match(T__6);
					}
					break;
				case T__8:
					{
					setState(513);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
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
			setState(521);
			match(T__33);
			setState(522);
			match(T__6);
			setState(523);
			match(ID);
			setState(524);
			match(T__8);
			setState(525);
			match(T__34);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__36) {
				{
				{
				setState(529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(526);
					match(T__35);
					setState(527);
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
					setState(528);
					match(T__36);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(531);
				match(T__37);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__33) | (1L << T__38) | (1L << ID) | (1L << Num))) != 0)) {
					{
					setState(547);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(532);
						match(ID);
						}
						break;
					case 2:
						{
						setState(533);
						match(Num);
						}
						break;
					case 3:
						{
						setState(534);
						asignacion();
						}
						break;
					case 4:
						{
						setState(535);
						entero();
						}
						break;
					case 5:
						{
						setState(536);
						real();
						}
						break;
					case 6:
						{
						setState(537);
						caracter();
						}
						break;
					case 7:
						{
						setState(538);
						cadena();
						}
						break;
					case 8:
						{
						setState(539);
						booleano();
						}
						break;
					case 9:
						{
						setState(540);
						leer();
						}
						break;
					case 10:
						{
						setState(541);
						booleano();
						}
						break;
					case 11:
						{
						setState(542);
						imprimir();
						}
						break;
					case 12:
						{
						setState(543);
						cond_si();
						}
						break;
					case 13:
						{
						setState(544);
						seleccionar();
						}
						break;
					case 14:
						{
						setState(545);
						llamar_funcion();
						}
						break;
					case 15:
						{
						setState(546);
						match(T__38);
						}
						break;
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0232\4\2\t\2"+
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
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b5\n\7\7\7\u00b7\n\7\f\7\16\7\u00ba"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00ce\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00e0\n\b\7\b\u00e2\n\b\f\b\16\b\u00e5\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ef\n\t\f\t\16\t\u00f2\13\t\3\t\3\t\3"+
		"\t\7\t\u00f7\n\t\f\t\16\t\u00fa\13\t\3\t\5\t\u00fd\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u010a\n\13\f\13\16\13\u010d\13"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\u0118\n\r\f\r\16\r\u011b"+
		"\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0125\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u012c\n\16\7\16\u012e\n\16\f\16\16\16\u0131\13\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u013a\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0141\n\17\7\17\u0143\n\17\f\17\16\17\u0146\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0153\n\21\f\21\16"+
		"\21\u0156\13\21\3\21\3\21\7\21\u015a\n\21\f\21\16\21\u015d\13\21\7\21"+
		"\u015f\n\21\f\21\16\21\u0162\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0170\n\22\f\22\16\22\u0173\13\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0183\n\22\f\22\16\22\u0186\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0196\n\22\f\22\16\22\u0199\13"+
		"\22\3\22\5\22\u019c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u01a7\n\23\f\23\16\23\u01aa\13\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01ba\n\23\f\23\16\23\u01bd"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u01c5\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u01ce\n\24\f\24\16\24\u01d1\13\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u01e3\n\24\f\24\16\24\u01e6\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01f8\n\25\f\25"+
		"\16\25\u01fb\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0205"+
		"\n\25\f\25\16\25\u0208\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0214\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0226\n\26\f\26\16\26\u0229\13"+
		"\26\7\26\u022b\n\26\f\26\16\26\u022e\13\26\3\26\3\26\3\26\2\2\27\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\r\4\2\4\b--\5\2\4\b\n\n--\5"+
		"\2\n\n-.\60\60\3\2-.\4\2\27\30-.\4\2\n\n-.\3\2+,\3\2\27\30\7\2\t\t\13"+
		"\13-.\60\60\64\64\3\2\60\61\4\2\t\t-.\2\u02ca\2\60\3\2\2\2\4;\3\2\2\2"+
		"\6f\3\2\2\2\b~\3\2\2\2\n\u0090\3\2\2\2\f\u00a5\3\2\2\2\16\u00bd\3\2\2"+
		"\2\20\u00e8\3\2\2\2\22\u0100\3\2\2\2\24\u0104\3\2\2\2\26\u0112\3\2\2\2"+
		"\30\u0114\3\2\2\2\32\u011f\3\2\2\2\34\u0134\3\2\2\2\36\u0149\3\2\2\2 "+
		"\u014f\3\2\2\2\"\u0166\3\2\2\2$\u019d\3\2\2\2&\u01c0\3\2\2\2(\u01e9\3"+
		"\2\2\2*\u020b\3\2\2\2,/\5\4\3\2-/\5\b\5\2.,\3\2\2\2.-\3\2\2\2/\62\3\2"+
		"\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\638\5\6\4\2"+
		"\64\67\5\4\3\2\65\67\5\b\5\2\66\64\3\2\2\2\66\65\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2;<\7\3\2\2<=\t\2\2\2=>\7-\2"+
		"\2>B\7\t\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2"+
		"\2DB\3\2\2\2EF\7\13\2\2FY\7\f\2\2GX\5\26\f\2HX\5\16\b\2IX\5\32\16\2JX"+
		"\5*\26\2KX\5(\25\2LX\5$\23\2MX\5&\24\2NX\5\36\20\2OX\5\34\17\2PX\5\n\6"+
		"\2QX\5\f\7\2RX\5 \21\2SX\5\"\22\2TX\5\22\n\2UX\5\24\13\2VX\5\20\t\2WG"+
		"\3\2\2\2WH\3\2\2\2WI\3\2\2\2WJ\3\2\2\2WK\3\2\2\2WL\3\2\2\2WM\3\2\2\2W"+
		"N\3\2\2\2WO\3\2\2\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2"+
		"WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2"+
		"\2\\`\7\r\2\2]_\t\4\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2"+
		"\2\2b`\3\2\2\2cd\7\16\2\2de\7\17\2\2e\5\3\2\2\2fy\7\20\2\2gx\5\26\f\2"+
		"hx\5\16\b\2ix\5\32\16\2jx\5*\26\2kx\5(\25\2lx\5$\23\2mx\5&\24\2nx\5\36"+
		"\20\2ox\5\34\17\2px\5\n\6\2qx\5\f\7\2rx\5 \21\2sx\5\"\22\2tx\5\22\n\2"+
		"ux\5\24\13\2vx\5\20\t\2wg\3\2\2\2wh\3\2\2\2wi\3\2\2\2wj\3\2\2\2wk\3\2"+
		"\2\2wl\3\2\2\2wm\3\2\2\2wn\3\2\2\2wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2"+
		"\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z|\3\2\2\2{y\3\2\2\2|}\7\21\2\2}\7\3\2\2\2~\177\7\22\2\2\177\u008b"+
		"\7-\2\2\u0080\u008a\5\n\6\2\u0081\u008a\5\f\7\2\u0082\u008a\5\16\b\2\u0083"+
		"\u008a\5\32\16\2\u0084\u008a\5\34\17\2\u0085\u008a\5 \21\2\u0086\u008a"+
		"\5\22\n\2\u0087\u008a\5\24\13\2\u0088\u008a\5\20\t\2\u0089\u0080\3\2\2"+
		"\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0084"+
		"\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\23\2\2\u008f"+
		"\t\3\2\2\2\u0090\u0095\7\4\2\2\u0091\u0096\7-\2\2\u0092\u0093\7-\2\2\u0093"+
		"\u0094\7\24\2\2\u0094\u0096\7.\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2"+
		"\2\2\u0096\u00a0\3\2\2\2\u0097\u009c\7\n\2\2\u0098\u009d\7-\2\2\u0099"+
		"\u009a\7-\2\2\u009a\u009b\7\24\2\2\u009b\u009d\7.\2\2\u009c\u0098\3\2"+
		"\2\2\u009c\u0099\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0097\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4\13\3\2\2\2\u00a5\u00aa"+
		"\7\5\2\2\u00a6\u00ab\7-\2\2\u00a7\u00a8\7-\2\2\u00a8\u00a9\7\24\2\2\u00a9"+
		"\u00ab\t\5\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00b8\3\2"+
		"\2\2\u00ac\u00b7\7-\2\2\u00ad\u00b7\7\60\2\2\u00ae\u00b4\7\n\2\2\u00af"+
		"\u00b5\7\60\2\2\u00b0\u00b5\7-\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\7\24"+
		"\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00ad\3\2"+
		"\2\2\u00b6\u00ae\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\16"+
		"\2\2\u00bc\r\3\2\2\2\u00bd\u00cd\7\6\2\2\u00be\u00ce\7-\2\2\u00bf\u00c0"+
		"\7-\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c3\7-\2\2\u00c3"+
		"\u00ce\7\25\2\2\u00c4\u00c5\7-\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\7"+
		"\25\2\2\u00c7\u00ce\7\25\2\2\u00c8\u00c9\7-\2\2\u00c9\u00ca\7\24\2\2\u00ca"+
		"\u00cb\7\25\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00ce\7\25\2\2\u00cd\u00be"+
		"\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce"+
		"\u00e3\3\2\2\2\u00cf\u00df\7\n\2\2\u00d0\u00e0\7-\2\2\u00d1\u00d2\7-\2"+
		"\2\u00d2\u00d3\7\24\2\2\u00d3\u00d4\7\25\2\2\u00d4\u00d5\7-\2\2\u00d5"+
		"\u00e0\7\25\2\2\u00d6\u00d7\7-\2\2\u00d7\u00d8\7\24\2\2\u00d8\u00d9\7"+
		"\25\2\2\u00d9\u00e0\7\25\2\2\u00da\u00db\7-\2\2\u00db\u00dc\7\24\2\2\u00dc"+
		"\u00dd\7\25\2\2\u00dd\u00de\7\26\2\2\u00de\u00e0\7\25\2\2\u00df\u00d0"+
		"\3\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00da\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00cf\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7\16\2\2\u00e7\17\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\u00fc\7\24\2"+
		"\2\u00ea\u00fd\t\6\2\2\u00eb\u00ec\t\5\2\2\u00ec\u00ed\7\60\2\2\u00ed"+
		"\u00ef\t\5\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00fd\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7-\2\2\u00f4\u00f8\7\t\2\2\u00f5\u00f7\t\7\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\13\2\2\u00fc\u00ea\3"+
		"\2\2\2\u00fc\u00f0\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\7\16\2\2\u00ff\21\3\2\2\2\u0100\u0101\7-\2\2\u0101\u0102\7-\2\2"+
		"\u0102\u0103\7\16\2\2\u0103\23\3\2\2\2\u0104\u0105\7-\2\2\u0105\u0106"+
		"\7\31\2\2\u0106\u010b\7-\2\2\u0107\u0108\7\31\2\2\u0108\u010a\7-\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\24\2\2\u010f"+
		"\u0110\t\5\2\2\u0110\u0111\7\16\2\2\u0111\25\3\2\2\2\u0112\u0113\t\b\2"+
		"\2\u0113\27\3\2\2\2\u0114\u0115\7-\2\2\u0115\u0119\7\t\2\2\u0116\u0118"+
		"\t\7\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\13"+
		"\2\2\u011d\u011e\7\16\2\2\u011e\31\3\2\2\2\u011f\u0124\7\7\2\2\u0120\u0125"+
		"\7-\2\2\u0121\u0122\7-\2\2\u0122\u0123\7\24\2\2\u0123\u0125\7\64\2\2\u0124"+
		"\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u012f\3\2\2\2\u0126\u012b\7\n"+
		"\2\2\u0127\u012c\7-\2\2\u0128\u0129\7-\2\2\u0129\u012a\7\24\2\2\u012a"+
		"\u012c\7\64\2\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012e\3"+
		"\2\2\2\u012d\u0126\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\16"+
		"\2\2\u0133\33\3\2\2\2\u0134\u0139\7\b\2\2\u0135\u013a\7-\2\2\u0136\u0137"+
		"\7-\2\2\u0137\u0138\7\24\2\2\u0138\u013a\t\t\2\2\u0139\u0135\3\2\2\2\u0139"+
		"\u0136\3\2\2\2\u013a\u0144\3\2\2\2\u013b\u0140\7\n\2\2\u013c\u0141\7-"+
		"\2\2\u013d\u013e\7-\2\2\u013e\u013f\7\24\2\2\u013f\u0141\t\t\2\2\u0140"+
		"\u013c\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u013b\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\16\2\2\u0148\35\3\2\2"+
		"\2\u0149\u014a\7\32\2\2\u014a\u014b\7\t\2\2\u014b\u014c\7-\2\2\u014c\u014d"+
		"\7\13\2\2\u014d\u014e\7\16\2\2\u014e\37\3\2\2\2\u014f\u0150\7\33\2\2\u0150"+
		"\u0154\7\t\2\2\u0151\u0153\t\n\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0160\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u015b\7\n\2\2\u0158\u015a\t\n\2\2\u0159\u0158\3\2"+
		"\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0157\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0164\7\13\2\2\u0164\u0165\7\16\2\2\u0165!\3\2\2"+
		"\2\u0166\u0167\7\34\2\2\u0167\u0171\7\t\2\2\u0168\u0169\t\5\2\2\u0169"+
		"\u016a\t\13\2\2\u016a\u0170\t\6\2\2\u016b\u016c\7\61\2\2\u016c\u0170\t"+
		"\f\2\2\u016d\u0170\7\t\2\2\u016e\u0170\7\13\2\2\u016f\u0168\3\2\2\2\u016f"+
		"\u016b\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\7\13\2\2\u0175\u0184\7\35\2\2\u0176\u0183\7"+
		"-\2\2\u0177\u0183\7.\2\2\u0178\u0183\5\20\t\2\u0179\u0183\5\n\6\2\u017a"+
		"\u0183\5\f\7\2\u017b\u0183\5\16\b\2\u017c\u0183\5\32\16\2\u017d\u0183"+
		"\5\34\17\2\u017e\u0183\5\36\20\2\u017f\u0183\5\34\17\2\u0180\u0183\5 "+
		"\21\2\u0181\u0183\5\"\22\2\u0182\u0176\3\2\2\2\u0182\u0177\3\2\2\2\u0182"+
		"\u0178\3\2\2\2\u0182\u0179\3\2\2\2\u0182\u017a\3\2\2\2\u0182\u017b\3\2"+
		"\2\2\u0182\u017c\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0182"+
		"\u017f\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u019b\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u019c\7\36\2\2\u0188\u0197\7\37\2\2\u0189\u0196\7"+
		"-\2\2\u018a\u0196\7.\2\2\u018b\u0196\5\20\t\2\u018c\u0196\5\n\6\2\u018d"+
		"\u0196\5\f\7\2\u018e\u0196\5\16\b\2\u018f\u0196\5\32\16\2\u0190\u0196"+
		"\5\34\17\2\u0191\u0196\5\36\20\2\u0192\u0196\5\34\17\2\u0193\u0196\5 "+
		"\21\2\u0194\u0196\5\"\22\2\u0195\u0189\3\2\2\2\u0195\u018a\3\2\2\2\u0195"+
		"\u018b\3\2\2\2\u0195\u018c\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u018e\3\2"+
		"\2\2\u0195\u018f\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0195"+
		"\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019c\7\36\2\2\u019b\u0187\3\2\2\2\u019b\u0188\3"+
		"\2\2\2\u019c#\3\2\2\2\u019d\u019e\7 \2\2\u019e\u01a8\7\t\2\2\u019f\u01a0"+
		"\t\5\2\2\u01a0\u01a1\t\13\2\2\u01a1\u01a7\t\6\2\2\u01a2\u01a3\7\61\2\2"+
		"\u01a3\u01a7\t\f\2\2\u01a4\u01a7\7\t\2\2\u01a5\u01a7\7\13\2\2\u01a6\u019f"+
		"\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\13\2\2\u01ac\u01bb\7\f\2\2\u01ad"+
		"\u01ba\7-\2\2\u01ae\u01ba\7.\2\2\u01af\u01ba\5\20\t\2\u01b0\u01ba\5\n"+
		"\6\2\u01b1\u01ba\5\f\7\2\u01b2\u01ba\5\16\b\2\u01b3\u01ba\5\32\16\2\u01b4"+
		"\u01ba\5\34\17\2\u01b5\u01ba\5\36\20\2\u01b6\u01ba\5\34\17\2\u01b7\u01ba"+
		"\5 \21\2\u01b8\u01ba\5\"\22\2\u01b9\u01ad\3\2\2\2\u01b9\u01ae\3\2\2\2"+
		"\u01b9\u01af\3\2\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b2"+
		"\3\2\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9"+
		"\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01bf\7!\2\2\u01bf%\3\2\2\2\u01c0\u01c1\7\"\2\2\u01c1"+
		"\u01c4\7\t\2\2\u01c2\u01c5\5\n\6\2\u01c3\u01c5\5\20\t\2\u01c4\u01c2\3"+
		"\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01cf\3\2\2\2\u01c6\u01c7\t\5\2\2\u01c7"+
		"\u01c8\t\13\2\2\u01c8\u01ce\t\6\2\2\u01c9\u01ca\7\61\2\2\u01ca\u01ce\t"+
		"\f\2\2\u01cb\u01ce\7\t\2\2\u01cc\u01ce\7\13\2\2\u01cd\u01c6\3\2\2\2\u01cd"+
		"\u01c9\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u01d3\7\16\2\2\u01d3\u01d4\t\5\2\2\u01d4\u01d5\7"+
		"\13\2\2\u01d5\u01e4\7\f\2\2\u01d6\u01e3\7-\2\2\u01d7\u01e3\7.\2\2\u01d8"+
		"\u01e3\5\20\t\2\u01d9\u01e3\5\n\6\2\u01da\u01e3\5\f\7\2\u01db\u01e3\5"+
		"\16\b\2\u01dc\u01e3\5\32\16\2\u01dd\u01e3\5\34\17\2\u01de\u01e3\5\36\20"+
		"\2\u01df\u01e3\5\34\17\2\u01e0\u01e3\5 \21\2\u01e1\u01e3\5\"\22\2\u01e2"+
		"\u01d6\3\2\2\2\u01e2\u01d7\3\2\2\2\u01e2\u01d8\3\2\2\2\u01e2\u01d9\3\2"+
		"\2\2\u01e2\u01da\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2"+
		"\u01dd\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7#"+
		"\2\2\u01e8\'\3\2\2\2\u01e9\u01f9\7\f\2\2\u01ea\u01f8\7-\2\2\u01eb\u01f8"+
		"\7.\2\2\u01ec\u01f8\5\20\t\2\u01ed\u01f8\5\n\6\2\u01ee\u01f8\5\f\7\2\u01ef"+
		"\u01f8\5\16\b\2\u01f0\u01f8\5\32\16\2\u01f1\u01f8\5\34\17\2\u01f2\u01f8"+
		"\5\36\20\2\u01f3\u01f8\5\34\17\2\u01f4\u01f8\5 \21\2\u01f5\u01f8\5\"\22"+
		"\2\u01f6\u01f8\5*\26\2\u01f7\u01ea\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01ec"+
		"\3\2\2\2\u01f7\u01ed\3\2\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7"+
		"\u01f0\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f3\3\2"+
		"\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fc\u0206\7 \2\2\u01fd\u01fe\t\5\2\2\u01fe"+
		"\u01ff\t\13\2\2\u01ff\u0205\t\5\2\2\u0200\u0201\7\61\2\2\u0201\u0205\t"+
		"\f\2\2\u0202\u0205\7\t\2\2\u0203\u0205\7\13\2\2\u0204\u01fd\3\2\2\2\u0204"+
		"\u0200\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020a\7\16\2\2\u020a)\3\2\2\2\u020b\u020c\7$\2\2"+
		"\u020c\u020d\7\t\2\2\u020d\u020e\7-\2\2\u020e\u020f\7\13\2\2\u020f\u022c"+
		"\7%\2\2\u0210\u0211\7&\2\2\u0211\u0214\t\5\2\2\u0212\u0214\7\'\2\2\u0213"+
		"\u0210\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0227\7("+
		"\2\2\u0216\u0226\7-\2\2\u0217\u0226\7.\2\2\u0218\u0226\5\20\t\2\u0219"+
		"\u0226\5\n\6\2\u021a\u0226\5\f\7\2\u021b\u0226\5\16\b\2\u021c\u0226\5"+
		"\32\16\2\u021d\u0226\5\34\17\2\u021e\u0226\5\36\20\2\u021f\u0226\5\34"+
		"\17\2\u0220\u0226\5 \21\2\u0221\u0226\5\"\22\2\u0222\u0226\5*\26\2\u0223"+
		"\u0226\5\30\r\2\u0224\u0226\7)\2\2\u0225\u0216\3\2\2\2\u0225\u0217\3\2"+
		"\2\2\u0225\u0218\3\2\2\2\u0225\u0219\3\2\2\2\u0225\u021a\3\2\2\2\u0225"+
		"\u021b\3\2\2\2\u0225\u021c\3\2\2\2\u0225\u021d\3\2\2\2\u0225\u021e\3\2"+
		"\2\2\u0225\u021f\3\2\2\2\u0225\u0220\3\2\2\2\u0225\u0221\3\2\2\2\u0225"+
		"\u0222\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u0213\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0230\7*\2\2\u0230+\3\2\2\2>.\60\668BWY`wy\u0089\u008b\u0095\u009c\u00a0"+
		"\u00aa\u00b4\u00b6\u00b8\u00cd\u00df\u00e3\u00f0\u00f8\u00fc\u010b\u0119"+
		"\u0124\u012b\u012f\u0139\u0140\u0144\u0154\u015b\u0160\u016f\u0171\u0182"+
		"\u0184\u0195\u0197\u019b\u01a6\u01a8\u01b9\u01bb\u01c4\u01cd\u01cf\u01e2"+
		"\u01e4\u01f7\u01f9\u0204\u0206\u0213\u0225\u0227\u022c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}