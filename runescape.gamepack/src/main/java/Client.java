import com.jagex.oldscape.pub.*;
import io.runebox.ObfInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@ObfInfo(name = "client")
public final class Client extends Class45 implements Class464, OAuthApi, Class333 {
	@ObfInfo(name = "em", desc = "Ldz;")
	public static Class104 field561;
	@ObfInfo(owner = "rc", name = "ic", desc = "Lea;")
	public static Class105 field4823;
	@ObfInfo(owner = "oz", name = "rj", desc = "Leb;")
	public static Class106 field4564;
	@ObfInfo(name = "gs", desc = "Lef;")
	public static Class110 field568;
	@ObfInfo(name = "eh", desc = "Lei;")
	public static Class113 field791;
	@ObfInfo(name = "ej", desc = "Lei;")
	public static Class113 field818;
	@ObfInfo(owner = "gg", name = "ad", desc = "[Lgg;")
	public static Class163[] field1771;
	@ObfInfo(owner = "ki", name = "tj", desc = "Lgj;")
	public static Class166 field2773;
	@ObfInfo(name = "tb", desc = "[Lgj;")
	public static Class166[] field772;
	@ObfInfo(owner = "ft", name = "sb", desc = "Lgk;")
	public static Class167 field1685;
	@ObfInfo(name = "sr", desc = "[Lgk;")
	public static Class167[] field771;
	@ObfInfo(owner = "bj", name = "et", desc = "Lig;")
	public static Class215 field193;
	@ObfInfo(owner = "jj", name = "io", desc = "Lig;")
	public static Class215 field2563;
	@ObfInfo(name = "sw", desc = "Lij;")
	public static Class218 field754;
	@ObfInfo(owner = "bs", name = "aq", desc = "Lik;")
	public static Class219 field249;
	@ObfInfo(name = "sy", desc = "Lit;")
	public static Class228 field766;
	@ObfInfo(owner = "dn", name = "rk", desc = "Liv;")
	public static Class230 field1140;
	@ObfInfo(owner = "es", name = "mn", desc = "Lli;")
	public static Class295 field1475;
	@ObfInfo(owner = "cj", name = "ah", desc = "Lbf;")
	public static Class32 field479;
	@ObfInfo(name = "wg", desc = "Lmo;")
	public static Class327 field822;
	@ObfInfo(name = "wy", desc = "Lmo;")
	public static Class327 field823;
	@ObfInfo(owner = "pl", name = "ew", desc = "Lnc;")
	public static Class341 field4644;
	@ObfInfo(name = "vo", desc = "Lne;")
	public static Class343 field815;
	@ObfInfo(owner = "gy", name = "oc", desc = "Lnx;")
	public static Class362 field1905;
	@ObfInfo(name = "pc", desc = "Lnx;")
	public static Class362 field607;
	@ObfInfo(name = "pr", desc = "Lnx;")
	public static Class362 field708;
	@ObfInfo(name = "pi", desc = "Lnx;")
	public static Class362 field710;
	@ObfInfo(name = "pt", desc = "Lnx;")
	public static Class362 field716;
	@ObfInfo(name = "pg", desc = "Lnx;")
	public static Class362 field761;
	@ObfInfo(owner = "cs", name = "os", desc = "Lnx;")
	public static Class362 field879;
	@ObfInfo(owner = "qk", name = "qs", desc = "[Lnx;")
	public static Class362[] field4718;
	@ObfInfo(owner = "iz", name = "wq", desc = "Loe;")
	public static Class369 field2487;
	@ObfInfo(owner = "ej", name = "cg", desc = "Lof;")
	public static Class370 field1425;
	@ObfInfo(owner = "kx", name = "cl", desc = "Loi;")
	public static Class373 field2988;
	@ObfInfo(owner = "je", name = "we", desc = "Loj;")
	public static Class374 field2533;
	@ObfInfo(owner = "gg", name = "aq", desc = "Lok;")
	public static Class375 field1790;
	@ObfInfo(owner = "gt", name = "aq", desc = "Lok;")
	public static Class375 field1887;
	@ObfInfo(owner = "hb", name = "ag", desc = "Lok;")
	public static Class375 field1938;
	@ObfInfo(owner = "hc", name = "aq", desc = "Lok;")
	public static Class375 field1990;
	@ObfInfo(owner = "hk", name = "aq", desc = "Lok;")
	public static Class375 field2111;
	@ObfInfo(owner = "ho", name = "ad", desc = "Lok;")
	public static Class375 field2125;
	@ObfInfo(owner = "ho", name = "ag", desc = "Lok;")
	public static Class375 field2139;
	@ObfInfo(owner = "hq", name = "ad", desc = "Lok;")
	public static Class375 field2189;
	@ObfInfo(owner = "hq", name = "aq", desc = "Lok;")
	public static Class375 field2190;
	@ObfInfo(owner = "hw", name = "aq", desc = "Lok;")
	public static Class375 field2234;
	@ObfInfo(owner = "hy", name = "aq", desc = "Lok;")
	public static Class375 field2248;
	@ObfInfo(owner = "hy", name = "ad", desc = "Lok;")
	public static Class375 field2249;
	@ObfInfo(owner = "ie", name = "aq", desc = "Lok;")
	public static Class375 field2318;
	@ObfInfo(owner = "mw", name = "aq", desc = "Lok;")
	public static Class375 field3658;
	@ObfInfo(owner = "qb", name = "ad", desc = "Lok;")
	public static Class375 field4682;
	@ObfInfo(owner = "ut", name = "aq", desc = "Lok;")
	public static Class375 field5309;
	@ObfInfo(owner = "oq", name = "aq", desc = "Lon;")
	public static Class378 field4507;
	@ObfInfo(owner = "dj", name = "ff", desc = "Loz;")
	public static Class390 field1117;
	@ObfInfo(owner = "av", name = "fd", desc = "Loz;")
	public static Class390 field112;
	@ObfInfo(owner = "dn", name = "fl", desc = "Loz;")
	public static Class390 field1137;
	@ObfInfo(owner = "fc", name = "fr", desc = "Loz;")
	public static Class390 field1558;
	@ObfInfo(owner = "fq", name = "fk", desc = "Loz;")
	public static Class390 field1666;
	@ObfInfo(owner = "gq", name = "fv", desc = "Loz;")
	public static Class390 field1869;
	@ObfInfo(owner = "gt", name = "fu", desc = "Loz;")
	public static Class390 field1890;
	@ObfInfo(owner = "hn", name = "fi", desc = "Loz;")
	public static Class390 field2122;
	@ObfInfo(owner = "hu", name = "fh", desc = "Loz;")
	public static Class390 field2221;
	@ObfInfo(owner = "jk", name = "fs", desc = "Loz;")
	public static Class390 field2574;
	@ObfInfo(owner = "jt", name = "fg", desc = "Loz;")
	public static Class390 field2664;
	@ObfInfo(owner = "ju", name = "fz", desc = "Loz;")
	public static Class390 field2669;
	@ObfInfo(owner = "ki", name = "ft", desc = "Loz;")
	public static Class390 field2777;
	@ObfInfo(owner = "kw", name = "fb", desc = "Loz;")
	public static Class390 field2983;
	@ObfInfo(owner = "ne", name = "fc", desc = "Loz;")
	public static Class390 field3730;
	@ObfInfo(owner = "cc", name = "fm", desc = "Loz;")
	public static Class390 field410;
	@ObfInfo(owner = "oe", name = "fp", desc = "Loz;")
	public static Class390 field4372;
	@ObfInfo(owner = "qg", name = "fw", desc = "Loz;")
	public static Class390 field4697;
	@ObfInfo(owner = "so", name = "fe", desc = "Loz;")
	public static Class390 field5007;
	@ObfInfo(owner = "tg", name = "ef", desc = "Loz;")
	public static Class390 field5070;
	@ObfInfo(owner = "cq", name = "el", desc = "Loz;")
	public static Class390 field857;
	@ObfInfo(owner = "cy", name = "ey", desc = "Loz;")
	public static Class390 field949;
	@ObfInfo(owner = "sj", name = "ws", desc = "Lpb;")
	public static Class392 field4980;
	@ObfInfo(owner = "ee", name = "co", desc = "Lpe;")
	public static Class395 field1376;
	@ObfInfo(owner = "bv", name = "ai", desc = "Lbn;")
	public static Class40 field291;
	@ObfInfo(name = "rc", desc = "Lpr;")
	public static Class408 field740;
	@ObfInfo(name = "rs", desc = "Lpr;")
	public static Class408 field741;
	@ObfInfo(name = "ri", desc = "Lpr;")
	public static Class408 field742;
	@ObfInfo(name = "rx", desc = "Lpr;")
	public static Class408 field743;
	@ObfInfo(name = "wf", desc = "[Lps;")
	public static Class409[] field819;
	@ObfInfo(owner = "hd", name = "iy", desc = "Lqh;")
	public static Class424 field2002;
	@ObfInfo(owner = "hi", name = "ib", desc = "Lqh;")
	public static Class424 field2102;
	@ObfInfo(owner = "cs", name = "ih", desc = "Lqh;")
	public static Class424 field881;
	@ObfInfo(name = "wx", desc = "Lrb;")
	public static Class444 field821;
	@ObfInfo(name = "iw", desc = "Lri;")
	public static Class451 field595;
	@ObfInfo(owner = "cu", name = "st", desc = "Lrm;")
	public static Class455 field883;
	@ObfInfo(owner = "dy", name = "rq", desc = "Lse;")
	public static Class473 field1315;
	@ObfInfo(owner = "df", name = "tw", desc = "Lbv;")
	public static Class48 field1052;
	@ObfInfo(owner = "ax", name = "ec", desc = "Lsp;")
	public static Class484 field119;
	@ObfInfo(owner = "oh", name = "is", desc = "Lsp;")
	public static Class484 field4428;
	@ObfInfo(owner = "bp", name = "wm", desc = "Lsq;")
	public static Class485 field232;
	@ObfInfo(owner = "jv", name = "fn", desc = "Lsy;")
	public static Class493 field2675;
	@ObfInfo(owner = "bu", name = "iv", desc = "Lte;")
	public static Class499 field288;
	@ObfInfo(name = "uj", desc = "[Lbw;")
	public static Class49[] field788;
	@ObfInfo(name = "wj", desc = "Ltk;")
	public static Class505 field682;
	@ObfInfo(name = "uh", desc = "Ltm;")
	public static Class507 field793;
	@ObfInfo(owner = "jb", name = "tp", desc = "Lby;")
	public static Class51 field2506;
	@ObfInfo(owner = "be", name = "vf", desc = "Ltr;")
	public static Class512 field157;
	@ObfInfo(name = "ut", desc = "Ltt;")
	public static Class514 field794;
	@ObfInfo(name = "uo", desc = "Ltt;")
	public static Class514 field795;
	@ObfInfo(owner = "lm", name = "wp", desc = "Ltw;")
	public static Class517 field3069;
	@ObfInfo(owner = "ga", name = "ax", desc = "[Luf;")
	public static Class526[] field1750;
	@ObfInfo(name = "pn", desc = "Lup;")
	public static Class536 field698;
	@ObfInfo(name = "rt", desc = "Lup;")
	public static Class536 field769;
	@ObfInfo(owner = "gv", name = "rz", desc = "Lur;")
	public static Class538 field1895;
	@ObfInfo(owner = "oa", name = "ro", desc = "Lur;")
	public static Class538 field3998;
	@ObfInfo(owner = "df", name = "cu", desc = "Luu;")
	public static Class541 field1066;
	@ObfInfo(owner = "uj", name = "sl", desc = "Lvc;")
	public static Class549 field5281;
	@ObfInfo(owner = "ht", name = "tz", desc = "Lvg;")
	public static Class553 field2209;
	@ObfInfo(owner = "cw", name = "jy", desc = "Lvg;")
	public static Class553 field894;
	@ObfInfo(owner = "cz", name = "jg", desc = "Lvg;")
	public static Class553 field961;
	@ObfInfo(owner = "eh", name = "kh", desc = "[Lvg;")
	public static Class553[] field1406;
	@ObfInfo(owner = "lk", name = "kg", desc = "[Lvg;")
	public static Class553[] field3059;
	@ObfInfo(owner = "mf", name = "ks", desc = "[Lvg;")
	public static Class553[] field3331;
	@ObfInfo(owner = "ou", name = "ke", desc = "[Lvg;")
	public static Class553[] field4535;
	@ObfInfo(owner = "rk", name = "kf", desc = "[Lvg;")
	public static Class553[] field4871;
	@ObfInfo(name = "tc", desc = "[Lvg;")
	public static Class553[] field580;
	@ObfInfo(owner = "ar", name = "kw", desc = "[Lvg;")
	public static Class553[] field90;
	@ObfInfo(name = "gq", desc = "Lvj;")
	public static Class556 field702;
	@ObfInfo(name = "rh", desc = "Lvn;")
	public static Class560 field739;
	@ObfInfo(owner = "ez", name = "kd", desc = "[Lvv;")
	public static Class568[] field1526;
	@ObfInfo(owner = "jz", name = "kl", desc = "[Lvv;")
	public static Class568[] field2698;
	@ObfInfo(owner = "qe", name = "km", desc = "[Lvv;")
	public static Class568[] field4690;
	@ObfInfo(owner = "qz", name = "ae", desc = "[Lvv;")
	public static Class568[] field4791;
	@ObfInfo(owner = "qf", name = "bw", desc = "Lvx;")
	public static Class570 field4695;
	@ObfInfo(owner = "fd", name = "vm", desc = "Lci;")
	public static Class61 field1585;
	@ObfInfo(owner = "hm", name = "oo", desc = "Lcj;")
	public static Class62 field2115;
	@ObfInfo(owner = "of", name = "mg", desc = "Lcp;")
	public static Class68 field4407;
	@ObfInfo(name = "wd", desc = "Lcs;")
	public static Class71 field834;
	@ObfInfo(owner = "gb", name = "uk", desc = "Lcu;")
	public static Class73 field1751;
	@ObfInfo(owner = "fg", name = "fo", desc = "Lcy;")
	public static Class77 field1603;
	@ObfInfo(owner = "bh", name = "mc", desc = "Ldb;")
	public static Class80 field170;
	@ObfInfo(name = "ht", desc = "Ldd;")
	public static Class82 field584;
	@ObfInfo(owner = "gl", name = "jt", desc = "Lde;")
	public static Class83 field1849;
	@ObfInfo(owner = "tm", name = "jc", desc = "Lde;")
	public static Class83 field5093;
	@ObfInfo(owner = "as", name = "jl", desc = "Lde;")
	public static Class83 field94;
	@ObfInfo(name = "dz", desc = "Ldi;")
	public static Class87 field544;
	@ObfInfo(owner = "es", name = "wh", desc = "Ldq;")
	public static Class95 field1474;
	@ObfInfo(owner = "pw", name = "br", desc = "Lclient;")
	public static Client field4671;
	@ObfInfo(owner = "dd", name = "an", desc = "Z")
	public static boolean field1012;
	@ObfInfo(owner = "dn", name = "dk", desc = "Z")
	public static boolean field1139;
	@ObfInfo(owner = "ec", name = "du", desc = "Z")
	public static boolean field1369;
	@ObfInfo(owner = "fo", name = "dv", desc = "Z")
	public static boolean field1660;
	@ObfInfo(owner = "gf", name = "su", desc = "Z")
	public static boolean field1770;
	@ObfInfo(owner = "hi", name = "fq", desc = "Z")
	public static boolean field2103;
	@ObfInfo(owner = "oj", name = "ti", desc = "Z")
	public static boolean field4443;
	@ObfInfo(owner = "pa", name = "dp", desc = "Z")
	public static boolean field4580;
	@ObfInfo(owner = "tg", name = "bn", desc = "Z")
	public static boolean field5071;
	@ObfInfo(name = "cn", desc = "Z")
	public static boolean field528;
	@ObfInfo(name = "cp", desc = "Z")
	public static boolean field533;
	@ObfInfo(name = "dg", desc = "Z")
	public static boolean field535;
	@ObfInfo(name = "dr", desc = "Z")
	public static boolean field536;
	@ObfInfo(name = "di", desc = "Z")
	public static boolean field540;
	@ObfInfo(name = "dh", desc = "Z")
	public static boolean field548;
	@ObfInfo(name = "mu", desc = "Z")
	public static boolean field577;
	@ObfInfo(name = "uv", desc = "Z")
	public static boolean field579;
	@ObfInfo(name = "hn", desc = "Z")
	public static boolean field583;
	@ObfInfo(name = "ua", desc = "Z")
	public static boolean field593;
	@ObfInfo(name = "ik", desc = "Z")
	public static boolean field594;
	@ObfInfo(name = "jq", desc = "Z")
	public static boolean field603;
	@ObfInfo(name = "kk", desc = "Z")
	public static boolean field612;
	@ObfInfo(name = "of", desc = "Z")
	public static boolean field621;
	@ObfInfo(name = "bf", desc = "Z")
	public static boolean field628;
	@ObfInfo(name = "lh", desc = "Z")
	public static boolean field630;
	@ObfInfo(name = "mp", desc = "Z")
	public static boolean field650;
	@ObfInfo(name = "mh", desc = "Z")
	public static boolean field652;
	@ObfInfo(name = "ne", desc = "Z")
	public static boolean field672;
	@ObfInfo(name = "ot", desc = "Z")
	public static boolean field683;
	@ObfInfo(name = "oi", desc = "Z")
	public static boolean field684;
	@ObfInfo(name = "ce", desc = "Z")
	public static boolean field687;
	@ObfInfo(name = "oz", desc = "Z")
	public static boolean field692;
	@ObfInfo(name = "ds", desc = "Z")
	public static boolean field701;
	@ObfInfo(name = "pz", desc = "Z")
	public static boolean field707;
	@ObfInfo(name = "pq", desc = "Z")
	public static boolean field714;
	@ObfInfo(name = "pw", desc = "Z")
	public static boolean field717;
	@ObfInfo(name = "qe", desc = "Z")
	public static boolean field720;
	@ObfInfo(name = "lb", desc = "Z")
	public static boolean field738;
	@ObfInfo(name = "rm", desc = "Z")
	public static boolean field756;
	@ObfInfo(name = "do", desc = "Z")
	public static boolean field765;
	@ObfInfo(owner = "ap", name = "dm", desc = "Z")
	public static boolean field77;
	@ObfInfo(name = "tm", desc = "Z")
	public static boolean field787;
	@ObfInfo(name = "uc", desc = "Z")
	public static boolean field790;
	@ObfInfo(name = "uu", desc = "Z")
	public static boolean field792;
	@ObfInfo(name = "nd", desc = "Z")
	public static boolean field806;
	@ObfInfo(name = "eb", desc = "Z")
	public static boolean field817;
	@ObfInfo(name = "ub", desc = "Z")
	public static boolean field830;
	@ObfInfo(owner = "cw", name = "ex", desc = "Z")
	public static boolean field911;
	@ObfInfo(name = "or", desc = "[Z")
	public static boolean[] field554;
	@ObfInfo(name = "nl", desc = "[Z")
	public static boolean[] field664;
	@ObfInfo(name = "rw", desc = "[Z")
	public static boolean[] field747;
	@ObfInfo(name = "ra", desc = "[Z")
	public static boolean[] field748;
	@ObfInfo(name = "rd", desc = "[Z")
	public static boolean[] field749;
	@ObfInfo(name = "vb", desc = "[Z")
	public static boolean[] field797;
	@ObfInfo(name = "hd", desc = "[B")
	public static byte[] field589;
	@ObfInfo(owner = "kj", name = "ju", desc = "[[B")
	public static byte[][] field2780;
	@ObfInfo(owner = "ov", name = "jo", desc = "[[B")
	public static byte[][] field4542;
	@ObfInfo(owner = "pl", name = "jz", desc = "[[B")
	public static byte[][] field4633;
	@ObfInfo(owner = "sb", name = "jh", desc = "[[B")
	public static byte[][] field4946;
	@ObfInfo(owner = "vh", name = "ab", desc = "[[B")
	public static byte[][] field5434;
	@ObfInfo(owner = "dv", name = "wz", desc = "I", intMultiplier = -104451399)
	public static int field1226;
	@ObfInfo(owner = "dx", name = "jr", desc = "I", intMultiplier = -982531667)
	public static int field1312;
	@ObfInfo(owner = "dy", name = "ue", desc = "I", intMultiplier = -197255023)
	public static int field1332;
	@ObfInfo(owner = "eg", name = "um", desc = "I", intMultiplier = 1988012483)
	public static int field1388;
	@ObfInfo(owner = "eh", name = "il", desc = "I", intMultiplier = -1135168521)
	public static int field1416;
	@ObfInfo(owner = "bd", name = "kn", desc = "I", intMultiplier = -1951368845)
	public static int field144;
	@ObfInfo(owner = "ep", name = "ns", desc = "I", intMultiplier = -1236472029)
	public static int field1453;
	@ObfInfo(owner = "bd", name = "me", desc = "I", intMultiplier = 1043320483)
	public static int field146;
	@ObfInfo(owner = "es", name = "ny", desc = "I", intMultiplier = 336627821)
	public static int field1473;
	@ObfInfo(owner = "ad", name = "at", desc = "I", intMultiplier = -836714351)
	public static int field15;
	@ObfInfo(owner = "fb", name = "ui", desc = "I", intMultiplier = 459245751)
	public static int field1551;
	@ObfInfo(owner = "fc", name = "je", desc = "I", intMultiplier = 1778310617)
	public static int field1556;
	@ObfInfo(owner = "bg", name = "gr", desc = "I", intMultiplier = 2046874205)
	public static int field159;
	@ObfInfo(owner = "fh", name = "uq", desc = "I", intMultiplier = -1524882693)
	public static int field1606;
	@ObfInfo(owner = "fr", name = "qo", desc = "I", intMultiplier = 1820594211)
	public static int field1679;
	@ObfInfo(owner = "ge", name = "gi", desc = "I", intMultiplier = 957518491)
	public static int field1767;
	@ObfInfo(owner = "gg", name = "ag", desc = "I", intMultiplier = -731625705)
	public static int field1772;
	@ObfInfo(owner = "gi", name = "ce", desc = "I", intMultiplier = -592304533)
	public static int field1805;
	@ObfInfo(owner = "gm", name = "gu", desc = "I", intMultiplier = 139559131)
	public static int field1853;
	@ObfInfo(owner = "gt", name = "ad", desc = "I", intMultiplier = 1552410659)
	public static int field1883;
	@ObfInfo(owner = "gt", name = "un", desc = "I", intMultiplier = -436943581)
	public static int field1888;
	@ObfInfo(owner = "hb", name = "ge", desc = "I", intMultiplier = -1562550201)
	public static int field1939;
	@ObfInfo(owner = "hc", name = "us", desc = "I", intMultiplier = 1654877821)
	public static int field1988;
	@ObfInfo(owner = "bo", name = "iz", desc = "I", intMultiplier = 1323524365)
	public static int field205;
	@ObfInfo(owner = "hf", name = "cd", desc = "I", intMultiplier = -354932627)
	public static int field2080;
	@ObfInfo(owner = "hf", name = "gn", desc = "I", intMultiplier = -2012746525)
	public static int field2081;
	@ObfInfo(owner = "hh", name = "ur", desc = "I", intMultiplier = -724193621)
	public static int field2093;
	@ObfInfo(owner = "jt", name = "uy", desc = "I", intMultiplier = 561283007)
	public static int field2665;
	@ObfInfo(owner = "jx", name = "uw", desc = "I", intMultiplier = 967349357)
	public static int field2681;
	@ObfInfo(owner = "jx", name = "ug", desc = "I", intMultiplier = -407252155)
	public static int field2691;
	@ObfInfo(owner = "kc", name = "ng", desc = "I", intMultiplier = 1244909991)
	public static int field2727;
	@ObfInfo(owner = "kk", name = "qy", desc = "I", intMultiplier = 2105549815)
	public static int field2790;
	@ObfInfo(owner = "ko", name = "ia", desc = "I", intMultiplier = -104959579)
	public static int field2818;
	@ObfInfo(owner = "bv", name = "ap", desc = "I", intMultiplier = 228258009)
	public static int field293;
	@ObfInfo(owner = "la", name = "lw", desc = "I", intMultiplier = 48501363)
	public static int field3024;
	@ObfInfo(owner = "mb", name = "lr", desc = "I", intMultiplier = 1010826727)
	public static int field3275;
	@ObfInfo(owner = "mf", name = "ko", desc = "I", intMultiplier = 1819061313)
	public static int field3333;
	@ObfInfo(owner = "mk", name = "nx", desc = "I", intMultiplier = -311136091)
	public static int field3474;
	@ObfInfo(owner = "mw", name = "ag", desc = "I", intMultiplier = -359790385)
	public static int field3659;
	@ObfInfo(owner = "mx", name = "ul", desc = "I", intMultiplier = 2065572541)
	public static int field3660;
	@ObfInfo(owner = "my", name = "ou", desc = "I", intMultiplier = 1489005223)
	public static int field3662;
	@ObfInfo(owner = "my", name = "kc", desc = "I", intMultiplier = 1411387951)
	public static int field3664;
	@ObfInfo(owner = "my", name = "vp", desc = "I", intMultiplier = 130012625)
	public static int field3667;
	@ObfInfo(owner = "aa", name = "mv", desc = "I", intMultiplier = 653926627)
	public static int field4;
	@ObfInfo(owner = "cc", name = "ud", desc = "I", intMultiplier = -1235649789)
	public static int field407;
	@ObfInfo(owner = "os", name = "ab", desc = "I", intMultiplier = -2095821695)
	public static int field4521;
	@ObfInfo(owner = "ot", name = "ln", desc = "I", intMultiplier = -45085545)
	public static int field4526;
	@ObfInfo(owner = "pe", name = "ky", desc = "I", intMultiplier = -1010949943)
	public static int field4606;
	@ObfInfo(owner = "pl", name = "gc", desc = "I", intMultiplier = 1699003429)
	public static int field4635;
	@ObfInfo(owner = "pn", name = "uf", desc = "I", intMultiplier = -1059193651)
	public static int field4656;
	@ObfInfo(owner = "cj", name = "wu", desc = "I", intMultiplier = -363728951)
	public static int field477;
	@ObfInfo(owner = "rt", name = "ap", desc = "I", intMultiplier = 331279603)
	public static int field4903;
	@ObfInfo(owner = "ck", name = "ol", desc = "I", intMultiplier = 756865827)
	public static int field491;
	@ObfInfo(owner = "tj", name = "qa", desc = "I", intMultiplier = 1349223169)
	public static int field5084;
	@ObfInfo(name = "cf", desc = "I", intMultiplier = 1545207573)
	public static int field525;
	@ObfInfo(name = "oa", desc = "I", intMultiplier = -690678063)
	public static int field526;
	@ObfInfo(name = "cm", desc = "I", intMultiplier = -939925291)
	public static int field527;
	@ObfInfo(name = "mw", desc = "I", intMultiplier = 686350733)
	public static int field529;
	@ObfInfo(owner = "aj", name = "ux", desc = "I", intMultiplier = -251261135)
	public static int field53;
	@ObfInfo(name = "pb", desc = "I", intMultiplier = 2114293145)
	public static int field530;
	@ObfInfo(name = "pa", desc = "I", intMultiplier = 857685933)
	public static int field531;
	@ObfInfo(name = "cs", desc = "I", intMultiplier = 1264463859)
	public static int field532;
	@ObfInfo(name = "cy", desc = "I", intMultiplier = 1081073917)
	public static int field534;
	@ObfInfo(name = "dn", desc = "I", intMultiplier = 383910097)
	public static int field537;
	@ObfInfo(name = "tg", desc = "I", intMultiplier = -1261127601)
	public static int field538;
	@ObfInfo(name = "wk", desc = "I", intMultiplier = 1393048613)
	public static int field539;
	@ObfInfo(name = "dt", desc = "I", intMultiplier = 271071563)
	public static int field541;
	@ObfInfo(name = "da", desc = "I", intMultiplier = -2144931763)
	public static int field542;
	@ObfInfo(owner = "vh", name = "ad", desc = "I", intMultiplier = 432701269)
	public static int field5433;
	@ObfInfo(owner = "vh", name = "aq", desc = "I", intMultiplier = -1853843341)
	public static int field5437;
	@ObfInfo(owner = "vh", name = "ag", desc = "I", intMultiplier = 596356767)
	public static int field5438;
	@ObfInfo(name = "dc", desc = "I", intMultiplier = -1099081089)
	public static int field545;
	@ObfInfo(name = "dj", desc = "I", intMultiplier = -792048985)
	public static int field549;
	@ObfInfo(name = "dq", desc = "I", intMultiplier = 1949011067)
	public static int field550;
	@ObfInfo(name = "ms", desc = "I", intMultiplier = -1694544311)
	public static int field551;
	@ObfInfo(name = "dl", desc = "I", intMultiplier = -2002022847)
	public static int field552;
	@ObfInfo(name = "dx", desc = "I", intMultiplier = -1793171387)
	public static int field553;
	@ObfInfo(name = "rp", desc = "I", intMultiplier = -101179887)
	public static int field555;
	@ObfInfo(name = "nc", desc = "I", intMultiplier = 1913368221)
	public static int field556;
	@ObfInfo(name = "eo", desc = "I", intMultiplier = -1120647239)
	public static int field557;
	@ObfInfo(name = "ip", desc = "I", intMultiplier = 1263456409)
	public static int field560;
	@ObfInfo(name = "lk", desc = "I", intMultiplier = 2122058543)
	public static int field562;
	@ObfInfo(name = "ed", desc = "I", intMultiplier = 289554243)
	public static int field563;
	@ObfInfo(name = "fa", desc = "I", intMultiplier = -1296877745)
	public static int field564;
	@ObfInfo(name = "fy", desc = "I", intMultiplier = -548733073)
	public static int field565;
	@ObfInfo(name = "es", desc = "I", intMultiplier = -1718909683)
	public static int field569;
	@ObfInfo(owner = "aj", name = "cj", desc = "I", intMultiplier = 957914991)
	public static int field57;
	@ObfInfo(name = "og", desc = "I", intMultiplier = -17675013)
	public static int field576;
	@ObfInfo(name = "fx", desc = "I", intMultiplier = -1552879491)
	public static int field586;
	@ObfInfo(name = "ho", desc = "I", intMultiplier = -1148233249)
	public static int field590;
	@ObfInfo(name = "pv", desc = "I", intMultiplier = 17753643)
	public static int field592;
	@ObfInfo(name = "ij", desc = "I", intMultiplier = 517985415)
	public static int field599;
	@ObfInfo(name = "ww", desc = "I", intMultiplier = 266342933)
	public static int field600;
	@ObfInfo(name = "jp", desc = "I", intMultiplier = 1576916745)
	public static int field601;
	@ObfInfo(name = "nr", desc = "I", intMultiplier = -1361024685)
	public static int field602;
	@ObfInfo(name = "jk", desc = "I", intMultiplier = 2061659125)
	public static int field606;
	@ObfInfo(name = "rv", desc = "I", intMultiplier = 552032687)
	public static int field608;
	@ObfInfo(name = "ku", desc = "I", intMultiplier = 1732969453)
	public static int field609;
	@ObfInfo(name = "kb", desc = "I", intMultiplier = 1145616963)
	public static int field610;
	@ObfInfo(name = "mj", desc = "I", intMultiplier = -2146996983)
	public static int field611;
	@ObfInfo(name = "ok", desc = "I", intMultiplier = 307705673)
	public static int field613;
	@ObfInfo(name = "ow", desc = "I", intMultiplier = -583841881)
	public static int field614;
	@ObfInfo(name = "kx", desc = "I", intMultiplier = -781326059)
	public static int field615;
	@ObfInfo(name = "ka", desc = "I", intMultiplier = 2040069139)
	public static int field616;
	@ObfInfo(name = "kt", desc = "I", intMultiplier = -811041119)
	public static int field617;
	@ObfInfo(name = "lf", desc = "I", intMultiplier = -329091845)
	public static int field619;
	@ObfInfo(name = "lq", desc = "I", intMultiplier = -1880847825)
	public static int field620;
	@ObfInfo(name = "lv", desc = "I", intMultiplier = 1816031723)
	public static int field622;
	@ObfInfo(name = "lj", desc = "I", intMultiplier = -1496220751)
	public static int field623;
	@ObfInfo(name = "lm", desc = "I", intMultiplier = 1891084203)
	public static int field624;
	@ObfInfo(name = "ld", desc = "I", intMultiplier = -834414311)
	public static int field625;
	@ObfInfo(name = "ei", desc = "I", intMultiplier = -1228994625)
	public static int field626;
	@ObfInfo(name = "lz", desc = "I", intMultiplier = -1292359005)
	public static int field627;
	@ObfInfo(name = "lu", desc = "I", intMultiplier = -676006897)
	public static int field631;
	@ObfInfo(name = "lp", desc = "I", intMultiplier = -804657147)
	public static int field632;
	@ObfInfo(name = "ll", desc = "I", intMultiplier = -460372189)
	public static int field633;
	@ObfInfo(name = "ph", desc = "I", intMultiplier = -1109325709)
	public static int field637;
	@ObfInfo(name = "mm", desc = "I", intMultiplier = 2005252973)
	public static int field643;
	@ObfInfo(name = "mt", desc = "I", intMultiplier = -1922466759)
	public static int field644;
	@ObfInfo(name = "qc", desc = "I", intMultiplier = -1480906373)
	public static int field646;
	@ObfInfo(name = "mi", desc = "I", intMultiplier = 2147270251)
	public static int field647;
	@ObfInfo(name = "md", desc = "I", intMultiplier = -224401479)
	public static int field648;
	@ObfInfo(name = "iu", desc = "I", intMultiplier = 1498709847)
	public static int field649;
	@ObfInfo(name = "ma", desc = "I", intMultiplier = 1760374075)
	public static int field651;
	@ObfInfo(name = "pd", desc = "I", intMultiplier = -1867510069)
	public static int field653;
	@ObfInfo(name = "my", desc = "I", intMultiplier = 1106664327)
	public static int field654;
	@ObfInfo(name = "kq", desc = "I", intMultiplier = 575410377)
	public static int field657;
	@ObfInfo(name = "tx", desc = "I", intMultiplier = -1888012179)
	public static int field658;
	@ObfInfo(name = "nv", desc = "I", intMultiplier = -44084715)
	public static int field659;
	@ObfInfo(name = "cq", desc = "I", intMultiplier = 483342745)
	public static int field660;
	@ObfInfo(name = "kz", desc = "I", intMultiplier = -1310205335)
	public static int field661;
	@ObfInfo(name = "ck", desc = "I", intMultiplier = 1602400867)
	public static int field663;
	@ObfInfo(name = "nm", desc = "I", intMultiplier = 605542881)
	public static int field665;
	@ObfInfo(name = "rg", desc = "I", intMultiplier = -1895328209)
	public static int field666;
	@ObfInfo(name = "qf", desc = "I", intMultiplier = 831135969)
	public static int field673;
	@ObfInfo(name = "la", desc = "I", intMultiplier = 1700159481)
	public static int field676;
	@ObfInfo(name = "qr", desc = "I", intMultiplier = -1526215277)
	public static int field685;
	@ObfInfo(name = "om", desc = "I", intMultiplier = 1682068127)
	public static int field686;
	@ObfInfo(name = "ox", desc = "I", intMultiplier = 1814579321)
	public static int field688;
	@ObfInfo(name = "qj", desc = "I", intMultiplier = 1246106715)
	public static int field689;
	@ObfInfo(name = "vd", desc = "I", intMultiplier = 1026081245)
	public static int field691;
	@ObfInfo(name = "px", desc = "I", intMultiplier = 292950689)
	public static int field699;
	@ObfInfo(name = "mb", desc = "I", intMultiplier = -889216765)
	public static int field700;
	@ObfInfo(name = "pp", desc = "I", intMultiplier = 964069107)
	public static int field703;
	@ObfInfo(name = "pe", desc = "I", intMultiplier = 1047853455)
	public static int field704;
	@ObfInfo(name = "pl", desc = "I", intMultiplier = -1441000797)
	public static int field705;
	@ObfInfo(name = "po", desc = "I", intMultiplier = 958782045)
	public static int field706;
	@ObfInfo(name = "li", desc = "I", intMultiplier = -1684016557)
	public static int field711;
	@ObfInfo(name = "pu", desc = "I", intMultiplier = -979253241)
	public static int field715;
	@ObfInfo(name = "qb", desc = "I", intMultiplier = 1196179167)
	public static int field718;
	@ObfInfo(name = "kp", desc = "I", intMultiplier = -877751007)
	public static int field719;
	@ObfInfo(name = "qi", desc = "I", intMultiplier = 206872803)
	public static int field721;
	@ObfInfo(name = "qm", desc = "I", intMultiplier = -239936169)
	public static int field723;
	@ObfInfo(name = "pf", desc = "I", intMultiplier = 85940377)
	public static int field725;
	@ObfInfo(name = "vc", desc = "I", intMultiplier = 1941814151)
	public static int field726;
	@ObfInfo(name = "qh", desc = "I", intMultiplier = -1410318385)
	public static int field727;
	@ObfInfo(name = "ep", desc = "I", intMultiplier = 1967717801)
	public static int field728;
	@ObfInfo(name = "qz", desc = "I", intMultiplier = -1457616349)
	public static int field731;
	@ObfInfo(name = "mx", desc = "I", intMultiplier = 1043322835)
	public static int field732;
	@ObfInfo(name = "qd", desc = "I", intMultiplier = -1432015157)
	public static int field733;
	@ObfInfo(name = "fj", desc = "I", intMultiplier = -915603301)
	public static int field734;
	@ObfInfo(name = "qt", desc = "I", intMultiplier = -1248782159)
	public static int field735;
	@ObfInfo(name = "qp", desc = "I", intMultiplier = 1233496723)
	public static int field737;
	@ObfInfo(name = "qk", desc = "I", intMultiplier = -579475639)
	public static int field745;
	@ObfInfo(name = "rr", desc = "I", intMultiplier = -800310153)
	public static int field746;
	@ObfInfo(name = "qv", desc = "I", intMultiplier = 401730143)
	public static int field753;
	@ObfInfo(name = "sn", desc = "I", intMultiplier = -1592891773)
	public static int field757;
	@ObfInfo(name = "sh", desc = "I", intMultiplier = -747562771)
	public static int field758;
	@ObfInfo(name = "so", desc = "I", intMultiplier = 1055182343)
	public static int field760;
	@ObfInfo(name = "sq", desc = "I", intMultiplier = 668387317)
	public static int field764;
	@ObfInfo(name = "se", desc = "I", intMultiplier = 1939911287)
	public static int field767;
	@ObfInfo(name = "kr", desc = "I", intMultiplier = -464481199)
	public static int field773;
	@ObfInfo(name = "lo", desc = "I", intMultiplier = 1539316607)
	public static int field774;
	@ObfInfo(name = "td", desc = "I", intMultiplier = 2100059549)
	public static int field778;
	@ObfInfo(name = "tn", desc = "I", intMultiplier = -1879112413)
	public static int field779;
	@ObfInfo(name = "tt", desc = "I", intMultiplier = 419900219)
	public static int field780;
	@ObfInfo(name = "ir", desc = "I", intMultiplier = 1599197695)
	public static int field781;
	@ObfInfo(name = "ty", desc = "I", intMultiplier = 395295339)
	public static int field782;
	@ObfInfo(name = "cv", desc = "I", intMultiplier = -420267913)
	public static int field796;
	@ObfInfo(name = "sp", desc = "I", intMultiplier = -814861539)
	public static int field799;
	@ObfInfo(name = "im", desc = "I", intMultiplier = -1563699817)
	public static int field804;
	@ObfInfo(name = "va", desc = "I", intMultiplier = -1428310161)
	public static int field810;
	@ObfInfo(name = "vs", desc = "I", intMultiplier = 1351329335)
	public static int field811;
	@ObfInfo(name = "vn", desc = "I", intMultiplier = -769669001)
	public static int field812;
	@ObfInfo(name = "eg", desc = "I", intMultiplier = 1114391019)
	public static int field813;
	@ObfInfo(name = "vl", desc = "I", intMultiplier = -736483307)
	public static int field814;
	@ObfInfo(name = "vz", desc = "I", intMultiplier = 1197048315)
	public static int field816;
	@ObfInfo(name = "de", desc = "I", intMultiplier = 72526637)
	public static int field820;
	@ObfInfo(name = "wt", desc = "I", intMultiplier = 571114373)
	public static int field824;
	@ObfInfo(name = "wb", desc = "I", intMultiplier = 1890787249)
	public static int field825;
	@ObfInfo(name = "oh", desc = "I", intMultiplier = 531417221)
	public static int field827;
	@ObfInfo(name = "qw", desc = "I", intMultiplier = -971069201)
	public static int field829;
	@ObfInfo(name = "js", desc = "I", intMultiplier = 805610763)
	public static int field831;
	@ObfInfo(name = "dy", desc = "I", intMultiplier = 1934712737)
	public static int field833;
	@ObfInfo(owner = "co", name = "kj", desc = "I", intMultiplier = 1983512085)
	public static int field850;
	@ObfInfo(owner = "cx", name = "ab", desc = "I", intMultiplier = 1059024585)
	public static int field918;
	@ObfInfo(owner = "cy", name = "ga", desc = "I", intMultiplier = -2061426685)
	public static int field929;
	@ObfInfo(owner = "cz", name = "aw", desc = "I", intMultiplier = 1184752429)
	public static int field954;
	@ObfInfo(owner = "da", name = "oe", desc = "I", intMultiplier = 1157769719)
	public static int field969;
	@ObfInfo(owner = "as", name = "ix", desc = "I", intMultiplier = -1291198787)
	public static int field97;
	@ObfInfo(owner = "eq", name = "ak", desc = "[I")
	public static int[] field1454;
	@ObfInfo(owner = "ez", name = "jv", desc = "[I")
	public static int[] field1524;
	@ObfInfo(owner = "fc", name = "ap", desc = "[I")
	public static int[] field1561;
	@ObfInfo(owner = "fs", name = "jj", desc = "[I")
	public static int[] field1684;
	@ObfInfo(owner = "fw", name = "jf", desc = "[I")
	public static int[] field1722;
	@ObfInfo(owner = "bo", name = "jn", desc = "[I")
	public static int[] field209;
	@ObfInfo(owner = "ka", name = "ji", desc = "[I")
	public static int[] field2708;
	@ObfInfo(owner = "mm", name = "aj", desc = "[I")
	public static int[] field3491;
	@ObfInfo(name = "vr", desc = "[I")
	public static int[] field524;
	@ObfInfo(owner = "vh", name = "av", desc = "[I")
	public static int[] field5432;
	@ObfInfo(owner = "vh", name = "an", desc = "[I")
	public static int[] field5435;
	@ObfInfo(name = "tu", desc = "[I")
	public static int[] field574;
	@ObfInfo(name = "hi", desc = "[I")
	public static int[] field585;
	@ObfInfo(name = "he", desc = "[I")
	public static int[] field591;
	@ObfInfo(name = "ql", desc = "[I")
	public static int[] field597;
	@ObfInfo(name = "rl", desc = "[I")
	public static int[] field598;
	@ObfInfo(name = "si", desc = "[I")
	public static int[] field618;
	@ObfInfo(name = "nu", desc = "[I")
	public static int[] field629;
	@ObfInfo(name = "ls", desc = "[I")
	public static int[] field634;
	@ObfInfo(name = "le", desc = "[I")
	public static int[] field635;
	@ObfInfo(name = "ly", desc = "[I")
	public static int[] field636;
	@ObfInfo(name = "lx", desc = "[I")
	public static int[] field638;
	@ObfInfo(name = "lc", desc = "[I")
	public static int[] field639;
	@ObfInfo(name = "mr", desc = "[I")
	public static int[] field641;
	@ObfInfo(name = "xb", desc = "[I")
	public static int[] field667;
	@ObfInfo(name = "nq", desc = "[I")
	public static int[] field669;
	@ObfInfo(name = "ni", desc = "[I")
	public static int[] field670;
	@ObfInfo(name = "nb", desc = "[I")
	public static int[] field674;
	@ObfInfo(name = "oq", desc = "[I")
	public static int[] field677;
	@ObfInfo(name = "od", desc = "[I")
	public static int[] field679;
	@ObfInfo(name = "vj", desc = "[I")
	public static int[] field690;
	@ObfInfo(name = "lg", desc = "[I")
	public static int[] field693;
	@ObfInfo(name = "uz", desc = "[I")
	public static int[] field694;
	@ObfInfo(name = "xs", desc = "[I")
	public static int[] field697;
	@ObfInfo(name = "qq", desc = "[I")
	public static int[] field713;
	@ObfInfo(name = "qu", desc = "[I")
	public static int[] field722;
	@ObfInfo(name = "qn", desc = "[I")
	public static int[] field724;
	@ObfInfo(name = "nj", desc = "[I")
	public static int[] field729;
	@ObfInfo(name = "nh", desc = "[I")
	public static int[] field730;
	@ObfInfo(name = "rf", desc = "[I")
	public static int[] field750;
	@ObfInfo(name = "rb", desc = "[I")
	public static int[] field751;
	@ObfInfo(name = "re", desc = "[I")
	public static int[] field752;
	@ObfInfo(name = "sv", desc = "[I")
	public static int[] field759;
	@ObfInfo(name = "ss", desc = "[I")
	public static int[] field768;
	@ObfInfo(name = "tf", desc = "[I")
	public static int[] field775;
	@ObfInfo(name = "tv", desc = "[I")
	public static int[] field776;
	@ObfInfo(name = "on", desc = "[I")
	public static int[] field783;
	@ObfInfo(name = "to", desc = "[I")
	public static int[] field784;
	@ObfInfo(name = "th", desc = "[I")
	public static int[] field785;
	@ObfInfo(name = "up", desc = "[I")
	public static int[] field786;
	@ObfInfo(name = "ov", desc = "[I")
	public static int[] field789;
	@ObfInfo(name = "vk", desc = "[I")
	public static int[] field798;
	@ObfInfo(name = "vy", desc = "[I")
	public static int[] field800;
	@ObfInfo(name = "nf", desc = "[I")
	public static int[] field801;
	@ObfInfo(name = "nk", desc = "[I")
	public static int[] field832;
	@ObfInfo(owner = "cx", name = "jd", desc = "[I")
	public static int[] field917;
	@ObfInfo(owner = "ed", name = "jb", desc = "[[I")
	public static int[][] field1372;
	@ObfInfo(name = "mo", desc = "[[I")
	public static int[][] field566;
	@ObfInfo(owner = "cq", name = "jx", desc = "[[I")
	public static int[][] field856;
	@ObfInfo(name = "jw", desc = "[[[I")
	public static int[][][] field604;
	@ObfInfo(name = "jm", desc = "[[[I")
	public static int[][][] field709;
	@ObfInfo(owner = "ft", name = "gm", desc = "Ljava/lang/String;")
	public static String field1698;
	@ObfInfo(owner = "gv", name = "hr", desc = "Ljava/lang/String;")
	public static String field1896;
	@ObfInfo(owner = "bx", name = "gj", desc = "Ljava/lang/String;")
	public static String field319;
	@ObfInfo(owner = "af", name = "gh", desc = "Ljava/lang/String;")
	public static String field32;
	@ObfInfo(owner = "mt", name = "hq", desc = "Ljava/lang/String;")
	public static String field3642;
	@ObfInfo(owner = "oz", name = "ch", desc = "Ljava/lang/String;")
	public static String field4577;
	@ObfInfo(owner = "pp", name = "hy", desc = "Ljava/lang/String;")
	public static String field4657;
	@ObfInfo(owner = "qo", name = "gp", desc = "Ljava/lang/String;")
	public static String field4745;
	@ObfInfo(name = "it", desc = "Ljava/lang/String;")
	public static String field668;
	@ObfInfo(name = "oj", desc = "Ljava/lang/String;")
	public static String field695;
	@ObfInfo(name = "pj", desc = "Ljava/lang/String;")
	public static String field696;
	@ObfInfo(owner = "ao", name = "ct", desc = "Ljava/lang/String;")
	public static String field74;
	@ObfInfo(name = "sf", desc = "Ljava/lang/String;")
	public static String field762;
	@ObfInfo(owner = "as", name = "gk", desc = "Ljava/lang/String;")
	public static String field95;
	@ObfInfo(name = "mz", desc = "[Ljava/lang/String;")
	public static String[] field642;
	@ObfInfo(name = "op", desc = "[Ljava/lang/String;")
	public static String[] field680;
	@ObfInfo(name = "ob", desc = "[Ljava/lang/String;")
	public static String[] field681;
	@ObfInfo(name = "no", desc = "[Ljava/lang/String;")
	public static String[] field712;
	@ObfInfo(owner = "fn", name = "hf", desc = "Ljava/security/SecureRandom;")
	public static SecureRandom field1652;
	@ObfInfo(name = "wc", desc = "Ljava/util/ArrayList;")
	public static ArrayList field828;
	@ObfInfo(name = "in", desc = "Ljava/util/HashMap;")
	public static HashMap field596;
	@ObfInfo(name = "wr", desc = "Ljava/util/List;")
	public static List field826;
	@ObfInfo(owner = "bv", name = "av", desc = "Ljava/util/concurrent/ScheduledExecutorService;")
	public static ScheduledExecutorService field298;
	@ObfInfo(owner = "bj", name = "id", desc = "J", longMultiplier = 7494969623625651721L)
	public static long field191;
	@ObfInfo(owner = "kx", name = "ee", desc = "J", longMultiplier = 8680667411493769319L)
	public static long field2990;
	@ObfInfo(owner = "sf", name = "wl", desc = "J", longMultiplier = 5766865719620340809L)
	public static long field4967;
	@ObfInfo(name = "db", desc = "J", longMultiplier = 7092568847167099497L)
	public static long field543;
	@ObfInfo(name = "dw", desc = "J", longMultiplier = 4483791798509325765L)
	public static long field547;
	@ObfInfo(name = "ml", desc = "J", longMultiplier = -1069174027776292633L)
	public static long field655;
	@ObfInfo(name = "mk", desc = "J", longMultiplier = 5654752889437794873L)
	public static long field656;
	@ObfInfo(name = "ry", desc = "J", longMultiplier = 7837883151600069321L)
	public static long field755;
	@ObfInfo(name = "sm", desc = "J", longMultiplier = -6366518147636730365L)
	public static long field770;
	@ObfInfo(name = "sa", desc = "[J")
	public static long[] field763;
	@ObfInfo(name = "vw", desc = "S")
	public static short field675;
	@ObfInfo(name = "vq", desc = "S")
	public static short field777;
	@ObfInfo(name = "vu", desc = "S")
	public static short field802;
	@ObfInfo(name = "vt", desc = "S")
	public static short field803;
	@ObfInfo(name = "vx", desc = "S")
	public static short field805;
	@ObfInfo(name = "vv", desc = "S")
	public static short field807;
	@ObfInfo(name = "vg", desc = "S")
	public static short field808;
	@ObfInfo(name = "vh", desc = "S")
	public static short field809;
	@ObfInfo(owner = "jx", name = "wv", desc = "[S")
	public static short[] field2687;
	@ObfInfo(owner = "ci", name = "ah", desc = "[S")
	public static short[] field458;
	@ObfInfo(owner = "rx", name = "ae", desc = "[S")
	public static short[] field4920;
	@ObfInfo(owner = "di", name = "az", desc = "[[S")
	public static short[][] field1095;
	@ObfInfo(owner = "es", name = "au", desc = "[[S")
	public static short[][] field1467;
	@ObfInfo(name = "iq", desc = "Lev;")
	public static final Class126 field678;
	@ObfInfo(name = "wn", desc = "Ljz;")
	public static final Class260 field546;
	@ObfInfo(name = "xh", desc = "Lcq;")
	public static final Class69 field671;
	@ObfInfo(name = "ja", desc = "[I")
	public static final int[] field605;
	@ObfInfo(name = "nw", desc = "[I")
	public static final int[] field662;
	@ObfInfo(name = "gg", desc = "Ljava/lang/String;")
	public static final String field581;
	@ObfInfo(name = "gy", desc = "Ljava/lang/String;")
	public static final String field645;
	@ObfInfo(name = "gz", desc = "Lao;")
	public Class15 field572;
	@ObfInfo(name = "gb", desc = "Lao;")
	public Class15 field640;
	@ObfInfo(name = "hc", desc = "Lav;")
	public Class22 field587;
	@ObfInfo(name = "gf", desc = "Lax;")
	public Class24 field571;
	@ObfInfo(name = "hu", desc = "Lvp;")
	public Class562 field559;
	@ObfInfo(name = "gd", desc = "Z")
	public boolean field575;
	@ObfInfo(name = "go", desc = "Lcom/jagex/oldscape/pub/OtlTokenRequester;")
	public OtlTokenRequester field573;
	@ObfInfo(name = "gw", desc = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;")
	public RefreshAccessTokenRequester field578;
	@ObfInfo(name = "gv", desc = "I", intMultiplier = -1672003813)
	public int field558;
	@ObfInfo(name = "gl", desc = "Ljava/lang/String;")
	public String field570;
	@ObfInfo(name = "gt", desc = "Ljava/util/concurrent/Future;")
	public Future field567;
	@ObfInfo(name = "gx", desc = "Ljava/util/concurrent/Future;")
	public Future field736;
	@ObfInfo(name = "hl", desc = "J", longMultiplier = -7067965715940361021L)
	public long field588;

	static {
		field628 = true;
		field525 = 1;
		field796 = 0;
		field527 = 0;
		field528 = false;
		field687 = false;
		field663 = -1;
		field660 = -1;
		field532 = -1;
		field533 = false;
		field534 = 223;
		field535 = false;
		field536 = false;
		field537 = 0;
		field701 = false;
		field765 = false;
		field540 = true;
		field541 = 0;
		field542 = 0;
		field543 = -1L;
		field545 = -1;
		field833 = -1;
		field547 = -1L;
		field548 = true;
		field549 = 0;
		field550 = 0;
		field820 = 0;
		field552 = 0;
		field553 = 0;
		field813 = 0;
		field569 = 0;
		field626 = 0;
		field557 = 0;
		field818 = Class113.field1420;
		field791 = Class113.field1420;
		field817 = false;
		field561 = Class104.field1343;
		field728 = 0;
		field563 = 0;
		field564 = 0;
		field565 = 0;
		field586 = 0;
		field734 = 0;
		field568 = Class110.field1380;
		field702 = Class556.field5444;
		byte[] var1 = Class407.method3539("com_jagex_auth_desktop_osrs:public");
		int var3 = var1.length;
		StringBuilder var4 = new StringBuilder();

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < var3 + 0; var5 += 3) {
			var6 = var1[var5] & 255;
			var4.append(Class391.field4579[var6 >>> 2]);
			if (var5 < var3 - 1) {
				var7 = var1[var5 + 1] & 255;
				var4.append(Class391.field4579[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					var8 = var1[var5 + 2] & 255;
					var4.append(Class391.field4579[(var7 & 15) << 2 | var8 >>> 6]).append(Class391.field4579[var8 & 63]);
				} else {
					var4.append(Class391.field4579[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(Class391.field4579[(var6 & 3) << 4]).append("==");
			}
		}

		String var2 = var4.toString();
		field645 = var2;
		int var10 = "com_jagex_auth_desktop_runelite:public".length();
		byte[] var11 = new byte[var10];

		int var13;
		for (var13 = 0; var13 < var10; ++var13) {
			char var14 = "com_jagex_auth_desktop_runelite:public".charAt(var13);
			if (var14 > 127) {
				var11[var13] = 63;
			} else {
				var11[var13] = (byte)var14;
			}
		}

		var1 = var11;
		var13 = var11.length;
		StringBuilder var15 = new StringBuilder();

		for (var6 = 0; var6 < var13 + 0; var6 += 3) {
			var7 = var1[var6] & 255;
			var15.append(Class391.field4579[var7 >>> 2]);
			if (var6 < var13 - 1) {
				var8 = var1[var6 + 1] & 255;
				var15.append(Class391.field4579[(var7 & 3) << 4 | var8 >>> 4]);
				if (var6 < var13 - 2) {
					int var9 = var1[var6 + 2] & 255;
					var15.append(Class391.field4579[(var8 & 15) << 2 | var9 >>> 6]).append(Class391.field4579[var9 & 63]);
				} else {
					var15.append(Class391.field4579[(var8 & 15) << 2]).append("=");
				}
			} else {
				var15.append(Class391.field4579[(var7 & 3) << 4]).append("==");
			}
		}

		String var12 = var15.toString();
		field581 = var12;
		field583 = false;
		field584 = new Class82();
		field585 = new int[4];
		field589 = null;
		field590 = 0;
		field591 = new int[250];
		field678 = new Class126();
		field649 = 0;
		field594 = false;
		field595 = new Class451();
		field596 = new HashMap();
		field804 = 0;
		field781 = 1;
		field599 = 0;
		field560 = 1;
		field601 = 0;
		field709 = new int[4][13][13];
		field603 = false;
		field604 = new int[4][13][13];
		field605 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field606 = -1;
		field831 = 0;
		field719 = 2301979;
		field609 = 5063219;
		field610 = 3353893;
		field773 = 7759444;
		field612 = false;
		field661 = 0;
		field657 = 128;
		field615 = 0;
		field616 = 0;
		field617 = 0;
		field562 = 0;
		field619 = 0;
		field620 = 0;
		field711 = 50;
		field622 = 0;
		field623 = 0;
		field624 = 0;
		field625 = 12;
		field774 = 6;
		field627 = 0;
		field738 = false;
		field676 = 0;
		field630 = false;
		field631 = 0;
		field632 = 0;
		field633 = 50;
		field634 = new int[field633];
		field635 = new int[field633];
		field636 = new int[field633];
		field693 = new int[field633];
		field638 = new int[field633];
		field639 = new int[field633];
		field566 = new int[field633][];
		field641 = new int[field633];
		field642 = new String[field633];
		field643 = 0;
		field644 = -1;
		field611 = -1;
		field551 = 0;
		field647 = 0;
		field648 = 0;
		field700 = 0;
		field650 = true;
		field651 = 0;
		field652 = true;
		field732 = -1;
		field654 = 0;
		field655 = -1L;
		field656 = -1L;
		field529 = -1;
		field577 = true;
		field659 = 0;
		field665 = 0;
		field670 = new int[1000];
		field662 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field712 = new String[8];
		field664 = new boolean[8];
		field729 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field556 = -1;
		field629 = new int[25];
		field730 = new int[25];
		field669 = new int[25];
		field801 = new int[25];
		field806 = false;
		field672 = false;
		field602 = 0;
		field674 = new int[500];
		field832 = new int[500];
		field783 = new int[500];
		field677 = new int[500];
		field789 = new int[500];
		field679 = new int[500];
		field680 = new String[500];
		field681 = new String[500];
		field554 = new boolean[500];
		field683 = false;
		field684 = false;
		field621 = true;
		field686 = -1;
		field576 = -1;
		field688 = 0;
		field526 = 50;
		field614 = 0;
		field668 = null;
		field692 = false;
		field827 = -1;
		field613 = -1;
		field695 = null;
		field696 = null;
		field592 = -1;
		field698 = new Class536(8);
		field699 = 0;
		field530 = -1;
		field637 = 0;
		field607 = null;
		field703 = 0;
		field704 = 0;
		field705 = 0;
		field706 = -1;
		field707 = false;
		field708 = null;
		field761 = null;
		field710 = null;
		field653 = 0;
		field725 = 0;
		field716 = null;
		field714 = false;
		field715 = -1;
		field531 = -1;
		field717 = false;
		field718 = -1;
		field689 = -1;
		field720 = false;
		field721 = 1;
		field722 = new int[32];
		field723 = 0;
		field724 = new int[32];
		field646 = 0;
		field713 = new int[32];
		field727 = 0;
		field597 = new int[32];
		field745 = 0;
		field673 = 0;
		field731 = 0;
		field829 = 0;
		field733 = 0;
		field685 = 0;
		field735 = 0;
		field753 = 0;
		field737 = 0;
		field555 = 0;
		field739 = new Class560();
		field740 = new Class408();
		field741 = new Class408();
		field742 = new Class408();
		field743 = new Class408();
		field769 = new Class536(512);
		field666 = 0;
		field746 = -2;
		field747 = new boolean[100];
		field748 = new boolean[100];
		field749 = new boolean[100];
		field750 = new int[100];
		field751 = new int[100];
		field752 = new int[100];
		field598 = new int[100];
		field608 = 0;
		field755 = 0L;
		field756 = true;
		field757 = 600;
		field758 = field757 / Class45.field254;
		field759 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field760 = 0;
		field799 = 0;
		field762 = "";
		field763 = new long[100];
		field764 = 0;
		field754 = new Class218();
		field766 = new Class228();
		field767 = 0;
		field768 = new int[128];
		field618 = new int[128];
		field770 = -1L;
		field771 = new Class167[4];
		field772 = new Class166[4];
		field658 = -1;
		field538 = 0;
		field775 = new int[1000];
		field776 = new int[1000];
		field580 = new Class553[1000];
		field778 = 0;
		field779 = 0;
		field780 = 0;
		field787 = false;
		field782 = 0;
		field574 = new int[50];
		field784 = new int[50];
		field785 = new int[50];
		field786 = new int[50];
		field694 = new int[50];
		field788 = new Class49[50];
		field792 = false;
		field790 = false;
		field579 = false;
		field830 = false;
		field793 = null;
		field794 = null;
		field795 = null;
		field593 = false;
		field797 = new boolean[5];
		field798 = new int[5];
		field690 = new int[5];
		field800 = new int[5];
		field524 = new int[5];
		field802 = 256;
		field803 = 205;
		field675 = 256;
		field805 = 320;
		field777 = 1;
		field807 = 32767;
		field808 = 1;
		field809 = 32767;
		field810 = 0;
		field811 = 0;
		field812 = 0;
		field726 = 0;
		field814 = 0;
		field815 = new Class343();
		field816 = -1;
		field691 = -1;
		field682 = new Class495();
		field819 = new Class409[8];
		field834 = new Class71();
		field821 = new Class444(8, Class446.field4834);
		field822 = new Class327(64);
		field823 = new Class327(64);
		field824 = -1;
		field825 = -1;
		field826 = new ArrayList();
		field546 = new Class260();
		field828 = new ArrayList(10);
		field539 = 0;
		field600 = 0;
		field671 = new Class69();
		field667 = new int[50];
		field697 = new int[50];
	}

	public Client() {
		this.field575 = false;
		this.field558 = 0;
		this.field588 = -1L;
	}

	@ObfInfo(name = "bk", desc = "(I)V")
	public final void method663() {
	}

	public final void init() {
		if (this.method644()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (var2 != null) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(Class111.field1399)) {
							field528 = true;
						} else {
							field528 = false;
						}
						break;
					case 4:
						if (-1 == field660) {
							field660 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field796 = Integer.parseInt(var2);
						break;
					case 6:
						field1376 = Class395.method7367(Integer.parseInt(var2));
						break;
					case 7:
						field2988 = Class373.method6284(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase(Class111.field1399)) {
						}
						break;
					case 9:
						field74 = var2;
						break;
					case 10:
						field1425 = (Class370)Class406.method4071(Class370.method5102(), Integer.parseInt(var2));
						if (field1425 == Class370.field4404) {
							field1066 = Class541.field5320;
						} else {
							field1066 = Class541.field5322;
						}
						break;
					case 11:
						field1896 = var2;
						break;
					case 12:
						field525 = Integer.parseInt(var2);
					case 13:
					case 16:
					case 18:
					case 19:
					case 20:
					case 23:
					case 24:
					default:
						break;
					case 14:
						field2080 = Integer.parseInt(var2);
						break;
					case 15:
						field527 = Integer.parseInt(var2);
						break;
					case 17:
						field4577 = var2;
						break;
					case 21:
						field663 = Integer.parseInt(var2);
						break;
					case 22:
						field3642 = var2;
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							field534 = Integer.parseInt(var2);
						} else {
							field534 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			Class277.field2827 = false;
			field687 = false;
			field95 = this.getCodeBase().getHost();
			field2487 = new Class369();
			String var5 = field2988.field4437;
			byte var6 = 0;
			if ((field796 & Class545.field5342.method129()) != 0) {
				field4657 = "beta";
			}

			try {
				Class211.method4429("oldschool", field4657, var5, var6, 23);
			} catch (Exception var4) {
				Class552.method8390((String)null, var4);
			}

			field4671 = this;
			field4903 = field660;
			field4745 = System.getenv("JX_ACCESS_TOKEN");
			field319 = System.getenv("JX_REFRESH_TOKEN");
			field32 = System.getenv("JX_SESSION_ID");
			field1698 = System.getenv("JX_CHARACTER_ID");
			Class53.method5020(System.getenv("JX_DISPLAY_NAME"));
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field575 = true;
			}

			if (field532 == -1) {
				if (!this.method1897() && !this.method1327()) {
					field532 = 0;
				} else {
					field532 = 5;
				}
			}

			this.method641(765, 503, 223, 1);
		}
	}

	public void finalize() throws Throwable {
		Class323.field3468.remove(this);
		super.finalize();
	}

	@ObfInfo(name = "gw", desc = "(I)Z", opaque = "-1040171340")
	public boolean method1323() {
		return this.field558 == 1;
	}

	public void setClient(int var1) {
		this.field558 = var1;
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field573 = var1;
			Class53.method3344(10);
		}
	}

	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field578 = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return 10 == field537;
	}

	public long getAccountHash() {
		return this.field588;
	}

	@ObfInfo(name = "gt", desc = "(B)Z", opaque = "1")
	public boolean method1897() {
		return field4745 != null && !field4745.trim().isEmpty() && field319 != null && !field319.trim().isEmpty();
	}

	@ObfInfo(name = "gy", desc = "(S)Z", opaque = "6618")
	public boolean method1327() {
		return field32 != null && !field32.trim().isEmpty() && field1698 != null && !field1698.trim().isEmpty();
	}

	@ObfInfo(name = "gg", desc = "(I)Z", opaque = "664447524")
	public boolean method1369() {
		return this.field573 != null;
	}

	@ObfInfo(name = "hr", desc = "(Ljava/lang/String;I)V", opaque = "308555287")
	public void method1551(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(field1896 + "shield/oauth/token" + (new Class496(var3)).method8875());
		Class465 var5 = new Class465();
		if (this.method1323()) {
			var5.method8511(field581);
		} else {
			var5.method8511(field645);
		}

		var5.method8494("Host", (new URL(field1896)).getHost());
		var5.method8483(Class470.field4947);
		Class9 var6 = Class9.field44;
		RefreshAccessTokenRequester var7 = this.field578;
		if (var7 != null) {
			this.field567 = var7.request(var6.method130(), var4, var5.method8491(), "");
		} else {
			Class5 var8 = new Class5(var4, var6, var5, this.field575);
			this.field640 = this.field571.method322(var8);
		}
	}

	@ObfInfo(name = "hq", desc = "(Ljava/lang/String;I)V", opaque = "-1811960319")
	public void method1330(String var1) throws IOException {
		URL var3 = new URL(field1896 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		Class465 var4 = new Class465();
		var4.method8499(var1);
		Class9 var5 = Class9.field52;
		OtlTokenRequester var6 = this.field573;
		if (var6 != null) {
			this.field736 = var6.request(var5.method130(), var3, var4.method8491(), "");
		} else {
			Class5 var7 = new Class5(var3, var5, var4, this.field575);
			this.field572 = this.field571.method322(var7);
		}
	}

	@ObfInfo(name = "hy", desc = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public void method1331(String var1, String var2) throws IOException, JSONException {
		URL var4 = new URL(field3642 + "game-session/v1/tokens");
		Class5 var5 = new Class5(var4, Class9.field44, this.field575);
		var5.method43().method8499(var1);
		var5.method43().method8483(Class470.field4947);
		JSONObject var6 = new JSONObject();
		var6.put("accountId", (Object)var2);
		var5.method44(new Class504(var6));
		this.field572 = this.field571.method322(var5);
	}

	@ObfInfo(name = "by", desc = "(I)V", opaque = "1553138178")
	public final void method653() {
		Class445.method2630(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		field77 = Class524.method3838(field796, Class545.field5342);
		field1939 = 0 == field527 ? 43594 : field525 + 40000;
		field159 = field527 == 0 ? 443 : field525 + 50000;
		field1853 = field1939;
		field4920 = Class357.field3779;
		field1467 = Class357.field3780;
		field458 = Class357.field3781;
		field1095 = Class357.field3777;
		field4823 = new Class118(this.field575, 223);
		this.method633();
		this.method636();
		field1140 = this.method678();
		this.method635(field766, 0);
		this.method635(field754, 1);
		this.method630();
		field232 = new Class485(255, Class211.field2286, Class211.field2287, 500000);
		Class539 var3 = null;
		Class95 var4 = new Class95();

		try {
			var3 = Class211.method2856("", field1425.field4406, false);
			byte[] var5 = new byte[(int)var3.method9483()];

			int var7;
			for (int var6 = 0; var6 < var5.length; var6 += var7) {
				var7 = var3.method9499(var5, var6, var5.length - var6);
				if (var7 == -1) {
					throw new IOException();
				}
			}

			var4 = new Class95(new Class562(var5));
		} catch (Exception var9) {
		}

		try {
			if (var3 != null) {
				var3.method9481();
			}
		} catch (Exception var8) {
		}

		field1474 = var4;
		String var10 = Class241.field2546;
		Class35.field182 = this;
		if (var10 != null) {
			Class35.field178 = var10;
		}

		Class209.method4042(field1474.method2513());
		field1585 = new Class61(field1066);
		this.field571 = new Class24("tokenRequest", 1, 1);
		Class98.method2632(this);
		field546.method5012();
	}

	@ObfInfo(name = "bw", desc = "(B)V", opaque = "24")
	public final void method626() {
		++field541;
		this.method1769();
		Class385.method3193();
		boolean var3 = false;
		boolean var4 = false;
		if (!Class323.field3461.isEmpty()) {
			Class457 var5 = (Class457)Class323.field3461.get(0);
			if (var5 == null) {
				Class323.field3461.remove(0);
			} else if (var5.method7710()) {
				if (var5.method8402()) {
					System.out.println("Error in midimanager.service: " + var5.method8404());
					var3 = true;
				} else {
					if (var5.method8407() != null) {
						Class323.field3461.add(1, var5.method8407());
					}

					var4 = var5.method8403();
				}

				Class323.field3461.remove(0);
			} else {
				var4 = var5.method8403();
			}
		}

		if (var3) {
			Class323.field3461.clear();
			Iterator var11 = Class323.field3464.iterator();

			label116:
			while (true) {
				Class351 var6;
				do {
					if (!var11.hasNext()) {
						Class323.field3464.clear();
						break label116;
					}

					var6 = (Class351)var11.next();
				} while(var6 == null);

				var6.field3761.method6129();
				var6.field3761.method6094();
				var6.field3761.method6090(0);
				var6.field3761.field3309 = 0;
				int var7 = var6.field3764;
				int var8 = var6.field3753;
				Iterator var9 = Class323.field3468.iterator();

				while (var9.hasNext()) {
					Class333 var10 = (Class333)var9.next();
					var10.method1324(var7, var8);
				}
			}
		}

		if (var4 && field787 && field1052 != null) {
			field1052.method836();
		}

		method3564();
		field754.method4213();
		this.method634();
		Class42.method3061();
		if (field1140 != null) {
			int var12 = field1140.method310();
			field555 = var12;
		}

		if (field537 == 0) {
			method6554();
			Class45.method8829();
		} else if (5 == field537) {
			Class53.method5808(this, field881, field2102);
			method6554();
			Class45.method8829();
		} else if (field537 != 10 && 11 != field537) {
			if (field537 == 20) {
				Class53.method5808(this, field881, field2102);
				this.method1339();
			} else if (50 == field537) {
				Class53.method5808(this, field881, field2102);
				this.method1339();
			} else if (field537 == 25) {
				if (field535) {
					method6578();
				}

				if (field536) {
					Class194.method3886(field1849);
				}

				if (!field536 && !field535) {
					Class131.method3063(30);
				}
			}
		} else {
			Class53.method5808(this, field881, field2102);
		}

		if (field537 == 30) {
			this.method1340();
		} else if (40 == field537 || field537 == 45) {
			this.method1339();
		}

	}

	@ObfInfo(name = "bl", desc = "(ZI)V", opaque = "-733838811")
	public final void method655(boolean var1) {
		if ((field537 == 10 || 20 == field537 || 30 == field537) && field755 != 0L && Class329.method4953() > field755) {
			Class209.method4042(method2130());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field747[var3] = true;
			}
		}

		if (0 == field537) {
			this.method688(Class53.field349, Class53.field350, var1, field2103);
		} else if (field537 == 5) {
			Class53.method3166(field2002, field881, field2102);
		} else if (10 != field537 && 11 != field537) {
			if (20 == field537) {
				Class53.method3166(field2002, field881, field2102);
			} else if (50 == field537) {
				Class53.method3166(field2002, field881, field2102);
			} else if (25 == field537) {
				if (field601 == 1) {
					if (field804 > field781) {
						field781 = field804;
					}

					var3 = (field781 * 50 - field804 * 50) / field781;
					method1172(Class367.field4154 + Class111.field1393 + Class111.field1390 + var3 + "%" + Class111.field1391, false);
				} else if (field601 == 2) {
					if (field599 > field560) {
						field560 = field599;
					}

					var3 = (field560 * 50 - field599 * 50) / field560 + 50;
					method1172(Class367.field4154 + Class111.field1393 + Class111.field1390 + var3 + "%" + Class111.field1391, false);
				} else {
					method1172(Class367.field4154, false);
				}
			} else if (30 == field537) {
				this.method1344();
			} else if (40 == field537) {
				method1172(Class367.field4079 + Class111.field1393 + Class367.field4149, false);
			} else if (45 == field537) {
				method1172(Class367.field4207, false);
			}
		} else {
			Class53.method3166(field2002, field881, field2102);
		}

		if (field537 == 30 && field608 == 0 && !var1 && !field756) {
			for (var3 = 0; var3 < field666; ++var3) {
				if (field748[var3]) {
					field4695.method389(field750[var3], field751[var3], field752[var3], field598[var3]);
					field748[var3] = false;
				}
			}
		} else if (field537 > 0) {
			field4695.method391(0, 0);

			for (var3 = 0; var3 < field666; ++var3) {
				field748[var3] = false;
			}
		}

	}

	@ObfInfo(name = "bc", desc = "(I)V", opaque = "1962294751")
	public final void method691() {
		if (field4564 != null && field4564.method2811()) {
			field4564.method2808();
		}

		if (field544 != null) {
			field544.field1089 = false;
		}

		field544 = null;
		field678.method3015();
		Class42.method3327();
		field1140 = null;
		if (field1052 != null) {
			field1052.method809();
		}

		field2487.method7079();
		Class385.method7266();
		if (field4823 != null) {
			field4823.method2784();
			field4823 = null;
		}

		Class211.method2369();
		this.field571.method317();
	}

	@ObfInfo(name = "hs", desc = "(I)V", opaque = "1655211493")
	public void method1769() {
		if (1000 != field537) {
			boolean var2 = field2487.method7067();
			if (!var2) {
				this.method1337();
			}

		}
	}

	@ObfInfo(name = "hp", desc = "(I)V", opaque = "308977212")
	public void method1337() {
		if (field2487.field4396 >= 4) {
			this.method773("js5crc");
			Class131.method3063(1000);
		} else {
			if (field2487.field4397 >= 4) {
				if (field537 <= 5) {
					this.method773("js5io");
					Class131.method3063(1000);
					return;
				}

				field563 = 3000;
				field2487.field4397 = 3;
			}

			if (--field563 + 1 <= 0) {
				try {
					if (field728 == 0) {
						field193 = field249.method4220(field95, field1853);
						++field728;
					}

					if (1 == field728) {
						if (field193.field2334 == 2) {
							this.method1338(-1);
							return;
						}

						if (field193.field2334 == 1) {
							++field728;
						}
					}

					if (2 == field728) {
						Socket var3 = (Socket)field193.field2340;
						Class474 var2 = new Class474(var3, 40000, 5000);
						field119 = var2;
						Class562 var4;
						if (field534 >= 223) {
							var4 = new Class562(1 + Class313.field3260.field3266);
							var4.method9809(Class313.field3260.field3257);
							var4.method9812(223);
							var4.method9812(field585[0]);
							var4.method9812(field585[1]);
							var4.method9812(field585[2]);
							var4.method9812(field585[3]);
							field119.method8648(var4.field5472, 0, 1 + Class313.field3260.field3266);
						} else {
							var4 = new Class562(5);
							var4.method9809(Class313.field3260.field3257);
							var4.method9812(223);
							field119.method8648(var4.field5472, 0, 5);
						}

						++field728;
						field2990 = Class329.method4953();
					}

					if (field728 == 3) {
						if (field119.method8656() > 0) {
							int var6 = field119.method8646();
							if (var6 != 0) {
								this.method1338(var6);
								return;
							}

							++field728;
						} else if (Class329.method4953() - field2990 > 30000L) {
							this.method1338(-2);
							return;
						}
					}

					if (4 == field728) {
						field2487.method7069(field119, field537 > 20);
						field193 = null;
						field119 = null;
						field728 = 0;
						field564 = 0;
					}
				} catch (IOException var5) {
					this.method1338(-3);
				}

			}
		}
	}

	@ObfInfo(name = "hh", desc = "(II)V", opaque = "2142617510")
	public void method1338(int var1) {
		field193 = null;
		field119 = null;
		field728 = 0;
		if (field1853 == field1939) {
			field1853 = field159;
		} else {
			field1853 = field1939;
		}

		++field564;
		if (field564 >= 2 && (var1 == 7 || var1 == 9)) {
			if (field537 <= 5) {
				this.method773("js5connect_full");
				Class131.method3063(1000);
			} else {
				field563 = 3000;
			}
		} else if (field564 >= 2 && var1 == 6) {
			this.method773("js5connect_outofdate");
			Class131.method3063(1000);
		} else if (field564 >= 4) {
			if (field537 <= 5) {
				this.method773("js5connect");
				Class131.method3063(1000);
			} else {
				field563 = 3000;
			}
		}

	}

	@ObfInfo(name = "hl", desc = "(B)V", opaque = "-1")
	public final void method1339() {
		Object var2 = field678.method3017();
		Class527 var3 = field678.field1487;

		try {
			if (Class77.field932 == field1603) {
				if (field1652 == null && (field584.method2311() || field565 > 250)) {
					field1652 = field584.method2308();
					field584.method2304();
					field584 = null;
				}

				if (field1652 != null) {
					if (var2 != null) {
						((Class484)var2).method8644();
						var2 = null;
					}

					field2563 = null;
					field594 = false;
					field565 = 0;
					if (field702.method9764()) {
						if (this.method1897()) {
							try {
								this.method1551(field319);
								method439(Class77.field943);
							} catch (Throwable var20) {
								Class552.method8390((String)null, var20);
								method4236(65);
								return;
							}
						} else {
							if (!this.method1327()) {
								method4236(65);
								return;
							}

							try {
								this.method1331(field32, field1698);
								method439(Class77.field942);
							} catch (Exception var19) {
								Class552.method8390((String)null, var19);
								method4236(65);
								return;
							}
						}
					} else {
						method439(Class77.field921);
					}
				}
			}

			Class19 var22;
			if (field1603 == Class77.field943) {
				if (this.field567 != null) {
					if (!this.field567.isDone()) {
						return;
					}

					if (this.field567.isCancelled()) {
						method4236(65);
						this.field567 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field567.get();
						if (!var4.isSuccess()) {
							method4236(65);
							this.field567 = null;
							return;
						}

						field4745 = var4.getAccessToken();
						field319 = var4.getRefreshToken();
						this.field567 = null;
					} catch (Exception var18) {
						Class552.method8390((String)null, var18);
						method4236(65);
						this.field567 = null;
						return;
					}
				} else {
					if (this.field640 == null) {
						method4236(65);
						return;
					}

					if (!this.field640.method213()) {
						return;
					}

					if (this.field640.method197()) {
						Class552.method8390(this.field640.method202(), (Throwable)null);
						method4236(65);
						this.field640 = null;
						return;
					}

					var22 = this.field640.method204();
					if (var22.method265() != 200) {
						method4236(65);
						this.field640 = null;
						return;
					}

					field565 = 0;
					Class504 var5 = new Class504(var22.method264());

					try {
						field4745 = var5.method8935().getString("access_token");
						field319 = var5.method8935().getString("refresh_token");
					} catch (Exception var17) {
						Class552.method8390("Error parsing tokens", var17);
						method4236(65);
						this.field640 = null;
						return;
					}
				}

				this.method1330(field4745);
				method439(Class77.field942);
			}

			if (field1603 == Class77.field942) {
				if (this.field736 != null) {
					if (!this.field736.isDone()) {
						return;
					}

					if (this.field736.isCancelled()) {
						method4236(65);
						this.field736 = null;
						return;
					}

					try {
						OtlTokenResponse var23 = (OtlTokenResponse)this.field736.get();
						if (!var23.isSuccess()) {
							method4236(65);
							this.field736 = null;
							return;
						}

						this.field570 = var23.getToken();
						this.field736 = null;
					} catch (Exception var16) {
						Class552.method8390((String)null, var16);
						method4236(65);
						this.field736 = null;
						return;
					}
				} else {
					if (this.field572 == null) {
						method4236(65);
						return;
					}

					if (!this.field572.method213()) {
						return;
					}

					if (this.field572.method197()) {
						Class552.method8390(this.field572.method202(), (Throwable)null);
						method4236(65);
						this.field572 = null;
						return;
					}

					var22 = this.field572.method204();
					if (var22.method265() != 200) {
						Class552.method8390("Response code: " + var22.method265() + "Response body: " + var22.method264(), (Throwable)null);
						method4236(65);
						this.field572 = null;
						return;
					}

					List var25 = (List)var22.method273().get("Content-Type");
					if (var25 != null && var25.contains(Class470.field4947.method8549())) {
						try {
							JSONObject var6 = new JSONObject(var22.method264());
							this.field570 = var6.getString("token");
						} catch (JSONException var15) {
							Class552.method8390((String)null, var15);
							method4236(65);
							this.field572 = null;
							return;
						}
					} else {
						this.field570 = var22.method264();
					}

					this.field572 = null;
				}

				field565 = 0;
				method439(Class77.field921);
			}

			if (field1603 == Class77.field921) {
				if (field2563 == null) {
					field2563 = field249.method4220(field95, field1853);
				}

				if (field2563.field2334 == 2) {
					throw new IOException();
				}

				if (field2563.field2334 == 1) {
					Socket var27 = (Socket)field2563.field2340;
					Class474 var24 = new Class474(var27, 40000, 5000);
					var2 = var24;
					field678.method3029(var24);
					field2563 = null;
					method439(Class77.field923);
				}
			}

			Class314 var26;
			if (field1603 == Class77.field923) {
				field678.method3021();
				var26 = Class314.method4937();
				var26.field3270.method9809(Class313.field3265.field3257);
				field678.method3013(var26);
				field678.method3012();
				var3.field5471 = 0;
				method439(Class77.field924);
			}

			int var28;
			if (Class77.field924 == field1603) {
				if (field1052 != null) {
					field1052.method851();
				}

				if (((Class484)var2).method8651(1)) {
					var28 = ((Class484)var2).method8646();
					if (field1052 != null) {
						field1052.method851();
					}

					if (var28 != 0) {
						method4236(var28);
						return;
					}

					var3.field5471 = 0;
					method439(Class77.field925);
				}
			}

			if (Class77.field925 == field1603) {
				if (var3.field5471 < 8) {
					var28 = ((Class484)var2).method8656();
					if (var28 > 8 - var3.field5471) {
						var28 = 8 - var3.field5471;
					}

					if (var28 > 0) {
						((Class484)var2).method8647(var3.field5472, var3.field5471, var28);
						var3.field5471 += var28;
					}
				}

				if (var3.field5471 == 8) {
					var3.field5471 = 0;
					field191 = var3.method9833();
					method439(Class77.field926);
				}
			}

			if (Class77.field926 == field1603) {
				field678.field1487.field5471 = 0;
				field678.method3021();
				Class527 var36 = new Class527(500);
				int[] var29 = new int[]{field1652.nextInt(), field1652.nextInt(), field1652.nextInt(), field1652.nextInt()};
				var36.field5471 = 0;
				var36.method9809(1);
				var36.method9812(var29[0]);
				var36.method9812(var29[1]);
				var36.method9812(var29[2]);
				var36.method9812(var29[3]);
				var36.method10034(field191);
				if (40 == field537) {
					var36.method9812(field585[0]);
					var36.method9812(field585[1]);
					var36.method9812(field585[2]);
					var36.method9812(field585[3]);
				} else {
					if (50 == field537) {
						var36.method9809(Class110.field1382.method129());
						var36.method9812(field1805);
					} else {
						var36.method9809(field568.method129());
						switch(field568.field1383) {
						case 0:
							var36.method9812(field1474.method2489(Class53.field358));
						case 1:
						default:
							break;
						case 2:
							var36.field5471 += 4;
							break;
						case 3:
						case 4:
							var36.method9811(field57);
							++var36.field5471;
						}
					}

					if (field702.method9764()) {
						var36.method9809(Class556.field5442.method129());
						var36.method9816(this.field570);
					} else {
						var36.method9809(Class556.field5444.method129());
						var36.method9816(Class53.field359);
					}
				}

				var36.method9853(Class76.field915, Class76.field914);
				field585 = var29;
				Class314 var30 = Class314.method4937();
				var30.field3270.field5471 = 0;
				if (field537 == 40) {
					var30.field3270.method9809(Class313.field3258.field3257);
				} else {
					var30.field3270.method9809(Class313.field3259.field3257);
				}

				var30.field3270.method9810(0);
				int var7 = var30.field3270.field5471;
				var30.field3270.method9812(223);
				var30.field3270.method9812(1);
				var30.field3270.method9809(field660);
				var30.field3270.method9809(field532);
				byte var8 = 0;
				var30.field3270.method9809(var8);
				var30.field3270.method9819(var36.field5472, 0, var36.field5471);
				int var9 = var30.field3270.field5471;
				var30.field3270.method9816(Class53.field358);
				var30.field3270.method9809((field756 ? 1 : 0) << 1 | (field687 ? 1 : 0));
				var30.field3270.method9810(field954);
				var30.field3270.method9810(field15);
				method570(var30.field3270);
				var30.field3270.method9816(field74);
				var30.field3270.method9812(field2080);
				var30.field3270.method9809(0);
				Class562 var10 = new Class562(field157.method9019());
				field157.method9014(var10);
				var30.field3270.method9819(var10.field5472, 0, var10.field5472.length);
				var30.field3270.method9809(field660);
				var30.field3270.method9812(0);
				if (field77) {
					var30.field3270.method9812(field2221.field4449);
					var30.field3270.method9807(field2669.field4449);
					var30.field3270.method9880(field1137.field4449);
					var30.field3270.method9880(field112.field4449);
					var30.field3270.method9880(field2983.field4449);
					var30.field3270.method9878(field4697.field4449);
					var30.field3270.method9878(field2777.field4449);
				} else {
					var30.field3270.method9812(field2669.field4449);
					var30.field3270.method9878(field1137.field4449);
					var30.field3270.method9878(field1869.field4449);
					var30.field3270.method9807(field5070.field4449);
					var30.field3270.method9812(field4697.field4449);
					var30.field3270.method9807(field3730.field4449);
					var30.field3270.method9807(field1558.field4449);
					var30.field3270.method9878(0);
					var30.field3270.method9812(field857.field4449);
					var30.field3270.method9880(field5007.field4449);
					var30.field3270.method9812(field1666.field4449);
					var30.field3270.method9812(field1890.field4449);
					var30.field3270.method9812(field2664.field4449);
					var30.field3270.method9812(field2221.field4449);
					var30.field3270.method9880(field2777.field4449);
					var30.field3270.method9878(field4372.field4449);
					var30.field3270.method9878(field1117.field4449);
					var30.field3270.method9880(field949.field4449);
					var30.field3270.method9807(field2122.field4449);
					var30.field3270.method9807(field2983.field4449);
					var30.field3270.method9878(field112.field4449);
				}

				var30.field3270.method9851(var29, var9, var30.field3270.field5471);
				var30.field3270.method10019(var30.field3270.field5471 - var7);
				field678.method3013(var30);
				field678.method3012();
				field678.field1482 = new Class565(var29);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = 50 + var29[var12];
				}

				var3.method9339(var11);
				method439(Class77.field948);
			}

			int var31;
			if (field1603 == Class77.field948 && ((Class484)var2).method8656() > 0) {
				var28 = ((Class484)var2).method8646();
				if (var28 == 61) {
					var31 = ((Class484)var2).method8656();
					field1369 = var31 == 1 && ((Class484)var2).method8646() == 1;
					method439(Class77.field926);
				}

				if (var28 == 21 && 20 == field537) {
					method439(Class77.field933);
				} else if (var28 == 2) {
					if (field77) {
						method439(Class77.field944);
					} else {
						method439(Class77.field930);
					}
				} else if (var28 == 15 && field537 == 40) {
					field678.field1485 = -1;
					method439(Class77.field941);
				} else if (var28 == 64) {
					method439(Class77.field931);
				} else if (var28 == 23 && field586 < 1) {
					++field586;
					method439(Class77.field932);
				} else if (var28 == 29) {
					method439(Class77.field927);
				} else {
					if (var28 != 69) {
						method4236(var28);
						return;
					}

					method439(Class77.field928);
				}
			}

			if (Class77.field944 == field1603) {
				field2103 = true;
				method2948(Class104.field1334);
				Class131.method3063(0);
			}

			if (Class77.field928 == field1603 && ((Class484)var2).method8656() >= 2) {
				((Class484)var2).method8647(var3.field5472, 0, 2);
				var3.field5471 = 0;
				field2081 = var3.method9997();
				method439(Class77.field939);
			}

			if (field1603 == Class77.field939 && ((Class484)var2).method8656() >= field2081) {
				var3.field5471 = 0;
				((Class484)var2).method8647(var3.field5472, var3.field5471, field2081);
				Class10[] var38 = new Class10[]{Class10.field56};
				Class10 var32 = var38[var3.method9902()];

				try {
					switch(var32.field54) {
					case 0:
						Class17 var33 = new Class17();
						this.field587 = new Class22(var3, var33);
						method439(Class77.field922);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var14) {
					method4236(22);
					return;
				}
			}

			if (field1603 == Class77.field922 && this.field587.method288()) {
				this.field559 = this.field587.method290();
				this.field587.method289();
				this.field587 = null;
				if (this.field559 == null) {
					method4236(22);
					return;
				}

				field678.method3021();
				var26 = Class314.method4937();
				var26.field3270.method9809(Class313.field3261.field3257);
				var26.field3270.method9810(this.field559.field5471);
				var26.field3270.method10056(this.field559);
				field678.method3013(var26);
				field678.method3012();
				this.field559 = null;
				method439(Class77.field948);
			}

			if (field1603 == Class77.field931 && ((Class484)var2).method8656() > 0) {
				field929 = ((Class484)var2).method8646();
				method439(Class77.field940);
			}

			if (field1603 == Class77.field940 && ((Class484)var2).method8656() >= field929) {
				((Class484)var2).method8647(var3.field5472, 0, field929);
				var3.field5471 = 0;
				method439(Class77.field948);
			}

			if (field1603 == Class77.field933 && ((Class484)var2).method8656() > 0) {
				field734 = (((Class484)var2).method8646() + 3) * 60;
				method439(Class77.field934);
			}

			if (field1603 == Class77.field934) {
				field565 = 0;
				Class53.method4018(Class367.field4075, Class367.field4222, field734 / 60 + Class367.field4038);
				if (--field734 <= 0) {
					method439(Class77.field932);
				}

			} else if (field1603 == Class77.field945) {
				var26 = Class314.method4937();
				var26.field3270.method9809(Class313.field3262.field3257);
				var26.field3270.method9810(Class313.field3262.field3266);
				method5809(var26);
				field678.method3013(var26);
				field678.method3012();
				method439(Class77.field930);
			} else {
				if (Class77.field930 == field1603 && ((Class484)var2).method8656() >= 1) {
					field4635 = ((Class484)var2).method8646();
					if (Class313.field3263.field3266 != field4635) {
						method4236(field4635);
						return;
					}

					method439(Class77.field936);
				}

				if (Class77.field936 == field1603 && ((Class484)var2).method8656() >= field4635) {
					boolean var39 = ((Class484)var2).method8646() == 1;
					((Class484)var2).method8647(var3.field5472, 0, 4);
					var3.field5471 = 0;
					boolean var34 = false;
					if (var39) {
						var31 = var3.method9372() << 24;
						var31 |= var3.method9372() << 16;
						var31 |= var3.method9372() << 8;
						var31 |= var3.method9372();
						field1474.method2487(Class53.field358, var31);
					}

					if (field583) {
						field1474.method2481(Class53.field358);
					} else {
						field1474.method2481((String)null);
					}

					Class95.method3133();
					field705 = ((Class484)var2).method8646();
					field707 = ((Class484)var2).method8646() == 1;
					field732 = ((Class484)var2).method8646();
					field732 <<= 8;
					field732 += ((Class484)var2).method8646();
					field654 = ((Class484)var2).method8646();
					((Class484)var2).method8647(var3.field5472, 0, 8);
					var3.field5471 = 0;
					this.field588 = var3.method9833();
					((Class484)var2).method8647(var3.field5472, 0, 8);
					var3.field5471 = 0;
					field655 = var3.method9833();
					((Class484)var2).method8647(var3.field5472, 0, 8);
					var3.field5471 = 0;
					field656 = var3.method9833();
					Class222.method7869().method4292(this.field575);
					method439(Class77.field937);
				}

				if (Class77.field937 == field1603 && ((Class484)var2).method8656() >= field678.field1485) {
					((Class484)var2).method8647(var3.field5472, 0, 1);
					var3.field5471 = 0;
					if (var3.method9344()) {
						((Class484)var2).method8647(var3.field5472, 1, 1);
						var3.field5471 = 0;
					}

					ServerPacket[] var40 = ServerPacket.method3181();
					var31 = var3.method9361();
					if (var31 < 0 || var31 >= var40.length) {
						throw new IOException("Invalid ServerProt: " + var31 + " at " + var3.field5471);
					}

					field678.field1490 = var40[var31];
					field678.field1485 = field678.field1490.length;
					((Class484)var2).method8647(var3.field5472, 0, 2);
					var3.field5471 = 0;
					field678.field1485 = var3.method9997();

					try {
						Client var35 = field4671;
						Object var10000 = null;
					} catch (Throwable var13) {
					}

					method439(Class77.field938);
				}

				if (field1603 == Class77.field938) {
					if (((Class484)var2).method8656() >= field678.field1485) {
						var3.field5471 = 0;
						((Class484)var2).method8647(var3.field5472, 0, field678.field1485);
						field595.method8314();
						method3398();
						field5093.field1017.method2878(var3, true);
						field4407 = field170;
						field2818 = -1;
						Class320.method6279(false, var3);
						field678.field1490 = null;
						field701 = false;
					}

				} else {
					if (field1603 == Class77.field927 && ((Class484)var2).method8656() >= 2) {
						var3.field5471 = 0;
						((Class484)var2).method8647(var3.field5472, 0, 2);
						var3.field5471 = 0;
						field1767 = var3.method9997();
						method439(Class77.field935);
					}

					if (Class77.field935 == field1603 && ((Class484)var2).method8656() >= field1767) {
						var3.field5471 = 0;
						((Class484)var2).method8647(var3.field5472, 0, field1767);
						var3.field5471 = 0;
						String var42 = var3.method9837();
						String var41 = var3.method9837();
						String var37 = var3.method9837();
						Class53.method4018(var42, var41, var37);
						Class131.method3063(10);
						if (field702.method9764()) {
							Class53.method3344(9);
						}
					}

					if (field1603 != Class77.field941) {
						++field565;
						if (field565 > 2000) {
							if (field586 < 1) {
								if (field1939 == field1853) {
									field1853 = field159;
								} else {
									field1853 = field1939;
								}

								++field586;
								method439(Class77.field932);
							} else {
								method4236(-3);
							}
						}
					} else {
						if (field678.field1485 == -1) {
							if (((Class484)var2).method8656() < 2) {
								return;
							}

							((Class484)var2).method8647(var3.field5472, 0, 2);
							var3.field5471 = 0;
							field678.field1485 = var3.method9997();
						}

						if (((Class484)var2).method8656() >= field678.field1485) {
							((Class484)var2).method8647(var3.field5472, 0, field678.field1485);
							var3.field5471 = 0;
							var28 = field678.field1485;
							field595.method8316();
							field678.method3021();
							field678.field1487.field5471 = 0;
							field678.field1490 = null;
							field678.field1489 = null;
							field678.field1486 = null;
							field678.field1491 = null;
							field678.field1485 = 0;
							field678.field1484 = 0;
							field549 = 0;
							field602 = 0;
							field672 = false;
							field780 = 0;
							field778 = 0;
							field5093.method2319();
							Class89.field1120 = new Class536(32);
							Class131.method3063(30);

							for (var31 = 0; var31 < 100; ++var31) {
								field747[var31] = true;
							}

							method6362();
							field5093.field1017.method2878(var3, true);
							if (var3.field5471 != var28) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var21) {
			if (field586 < 1) {
				if (field1853 == field1939) {
					field1853 = field159;
				} else {
					field1853 = field1939;
				}

				++field586;
				method439(Class77.field932);
			} else {
				method4236(-2);
			}
		}
	}

	@ObfInfo(name = "is", desc = "(I)V", opaque = "1062139349")
	public final void method1340() {
		if (field549 > 1) {
			--field549;
		}

		if (field649 > 0) {
			--field649;
		}

		if (field594) {
			field594 = false;
			method3313();
		} else {
			if (!field672) {
				method566();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method1347(field678); ++var2) {
			}

			if (30 == field537) {
				while (true) {
					Class47 var3 = (Class47)Class50.field318.method7401();
					boolean var21;
					if (var3 == null) {
						var21 = false;
					} else {
						var21 = true;
					}

					int var4;
					Class314 var22;
					if (!var21) {
						Class314 var23;
						int var24;
						if (field595.field4863) {
							var23 = Class168.method3523(ClientPacket.field3395, field678.field1482);
							var23.field3270.method9809(0);
							var24 = var23.field3270.field5471;
							field595.method8319(var23.field3270);
							var23.field3270.method9874(var23.field3270.field5471 - var24);
							field678.method3013(var23);
							field595.method8315();
						}

						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						int var13;
						synchronized(field544.field1090) {
							if (!field628) {
								field544.field1091 = 0;
							} else if (0 != Class42.field227 || field544.field1091 >= 40) {
								var22 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								var7 = 0;

								for (var8 = 0; var8 < field544.field1091 && (var22 == null || var22.field3270.field5471 - var4 < 246); ++var8) {
									var5 = var8;
									var9 = field544.field1094[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									var10 = field544.field1093[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (var10 != field545 || field833 != var9) {
										if (var22 == null) {
											var22 = Class168.method3523(ClientPacket.field3389, field678.field1482);
											var22.field3270.method9809(0);
											var4 = var22.field3270.field5471;
											Class527 var10000 = var22.field3270;
											var10000.field5471 += 2;
											var6 = 0;
											var7 = 0;
										}

										if (-1L != field547) {
											var11 = var10 - field545;
											var12 = var9 - field833;
											var13 = (int)((field544.field1092[var8] - field547) / 20L);
											var6 = (int)((long)var6 + (field544.field1092[var8] - field547) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field545 = var10;
										field833 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var22.field3270.method9810(var12 + (var11 << 6) + (var13 << 12));
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var22.field3270.method9809(var13 + 128);
											var22.field3270.method9810((var11 << 8) + var12);
										} else if (var13 < 32) {
											var22.field3270.method9809(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var22.field3270.method9812(var10 | var9 << 16);
											} else {
												var22.field3270.method9812(Integer.MIN_VALUE);
											}
										} else {
											var22.field3270.method9810(57344 + (var13 & 8191));
											if (var10 != -1 && var9 != -1) {
												var22.field3270.method9812(var10 | var9 << 16);
											} else {
												var22.field3270.method9812(Integer.MIN_VALUE);
											}
										}

										++var7;
										field547 = field544.field1092[var8];
									}
								}

								if (var22 != null) {
									var22.field3270.method9874(var22.field3270.field5471 - var4);
									var8 = var22.field3270.field5471;
									var22.field3270.field5471 = var4;
									var22.field3270.method9809(var6 / var7);
									var22.field3270.method9809(var6 % var7);
									var22.field3270.field5471 = var8;
									field678.method3013(var22);
								}

								if (var5 >= field544.field1091) {
									field544.field1091 = 0;
								} else {
									Class87 var61 = field544;
									var61.field1091 -= var5;
									System.arraycopy(field544.field1093, var5, field544.field1093, 0, field544.field1091);
									System.arraycopy(field544.field1094, var5, field544.field1094, 0, field544.field1091);
									System.arraycopy(field544.field1092, var5, field544.field1092, 0, field544.field1091);
								}
							}
						}

						if (1 == Class42.field227 || !field911 && Class42.field227 == 4 || 2 == Class42.field227) {
							long var25 = Class42.field217 - field543;
							if (var25 > 32767L) {
								var25 = 32767L;
							}

							field543 = Class42.field217;
							var4 = Class42.field222;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > field15) {
								var4 = field15;
							}

							var5 = Class42.field230;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > field954) {
								var5 = field954;
							}

							var6 = (int)var25;
							Class314 var30 = Class168.method3523(ClientPacket.field3371, field678.field1482);
							var30.field3270.method9810((var6 << 1) + (2 == Class42.field227 ? 1 : 0));
							var30.field3270.method9810(var5);
							var30.field3270.method9810(var4);
							field678.method3013(var30);
						}

						if (field555 != 0) {
							var23 = Class168.method3523(ClientPacket.field3432, field678.field1482);
							var23.field3270.method9810(field555);
							field678.method3013(var23);
						}

						if (field754.field2374 > 0) {
							var23 = Class168.method3523(ClientPacket.field3354, field678.field1482);
							var23.field3270.method9810(0);
							var24 = var23.field3270.field5471;
							long var26 = Class329.method4953();

							for (var6 = 0; var6 < field754.field2374; ++var6) {
								long var31 = var26 - field770;
								if (var31 > 16777215L) {
									var31 = 16777215L;
								}

								field770 = var26;
								var23.field3270.method10025(field754.field2381[var6]);
								var23.field3270.method9811((int)var31);
							}

							var23.field3270.method10019(var23.field3270.field5471 - var24);
							field678.method3013(var23);
						}

						if (field676 > 0) {
							--field676;
						}

						if (field754.method4191(96) || field754.method4191(97) || field754.method4191(98) || field754.method4191(99)) {
							field630 = true;
						}

						if (field630 && field676 <= 0) {
							field676 = 20;
							field630 = false;
							var23 = Class168.method3523(ClientPacket.field3439, field678.field1482);
							var23.field3270.method9866(field615);
							var23.field3270.method10036(field657);
							field678.method3013(var23);
						}

						if (field5071 && !field548) {
							field548 = true;
							var23 = Class168.method3523(ClientPacket.field3428, field678.field1482);
							var23.field3270.method9809(1);
							field678.method3013(var23);
						}

						if (!field5071 && field548) {
							field548 = false;
							var23 = Class168.method3523(ClientPacket.field3428, field678.field1482);
							var23.field3270.method9809(0);
							field678.method3013(var23);
						}

						if (field3069 != null) {
							field3069.method9050();
						}

						Class395.method7373();
						method4942();
						if (field658 != field5093.field1016) {
							field658 = field5093.field1016;
							var2 = field5093.field1016;
							int[] var27 = field2209.field5429;
							var4 = var27.length;

							for (var5 = 0; var5 < var4; ++var5) {
								var27[var5] = 0;
							}

							for (var5 = 1; var5 < 103; ++var5) {
								var6 = (103 - var5) * 2048 + 24628;

								for (var7 = 1; var7 < 103; ++var7) {
									if ((field5093.field1023[var2][var7][var5] & 24) == 0) {
										field5093.field1014.method5264(var27, var6, 512, var2, var7, var5);
									}

									if (var2 < 3 && (field5093.field1023[var2 + 1][var7][var5] & 8) != 0) {
										field5093.field1014.method5264(var27, var6, 512, var2 + 1, var7, var5);
									}

									var6 += 4;
								}
							}

							var5 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var6 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							field2209.method9597();

							for (var7 = 1; var7 < 103; ++var7) {
								for (var8 = 1; var8 < 103; ++var8) {
									if ((field5093.field1023[var2][var8][var7] & 24) == 0) {
										method6402(var2, var8, var7, var5, var6);
									}

									if (var2 < 3 && (field5093.field1023[var2 + 1][var8][var7] & 8) != 0) {
										method6402(var2 + 1, var8, var7, var5, var6);
									}
								}
							}

							field538 = 0;

							for (var7 = 0; var7 < 104; ++var7) {
								for (var8 = 0; var8 < 104; ++var8) {
									long var39 = field5093.field1014.method5384(field5093.field1016, var7, var8);
									if (0L != var39) {
										var11 = Class296.method4404(var39);
										var12 = Class197.method61(var11).field2153;
										if (var12 >= 0 && Class163.method3540(var12).field1786) {
											field580[field538] = Class163.method3540(var12).method3388(false);
											field775[field538] = var7;
											field776[field538] = var8;
											++field538;
										}
									}
								}
							}

							field4695.method10205();
						}

						if (30 != field537) {
							return;
						}

						method3709(field5093);
						method6369();
						++field678.field1484;
						if (field678.field1484 > 750) {
							method3313();
							return;
						}

						method471(field5093);
						Class83 var28 = field5093;

						for (var24 = 0; var24 < var28.field1027; ++var24) {
							var4 = var28.field1028[var24];
							Class102 var32 = var28.field1013[var4];
							if (var32 != null) {
								method4345(var28, var32, var32.field1309.field1943);
							}
						}

						Class83 var29 = field5093;

						for (var4 = 0; var4 < var29.field1020; ++var4) {
							var5 = var29.field1031[var4];
							Class483 var34 = var29.field1029[var5];
							if (var34 != null) {
								var34.method8745();
							}
						}

						Class139.method3147(field5093);

						for (var4 = 0; var4 < field5093.field1020; ++var4) {
							Class483 var35 = field5093.field1029[field5093.field1031[var4]];
							if (var35 != null) {
								method3709(var35.field5001);
								method471(var35.field5001);
								Class83 var37 = var35.field5001;

								for (var7 = 0; var7 < var37.field1027; ++var7) {
									var8 = var37.field1028[var7];
									Class102 var40 = var37.field1013[var8];
									if (var40 != null) {
										method4345(var37, var40, var40.field1309.field1943);
									}
								}

								Class139.method3147(var35.field5001);
							}
						}

						++field831;
						if (field700 != 0) {
							field648 += 20;
							if (field648 >= 400) {
								field700 = 0;
							}
						}

						Class362 var33 = field1905;
						Class362 var36 = field879;
						field1905 = null;
						field879 = null;
						field716 = null;
						field717 = false;
						field714 = false;
						field767 = 0;

						while (field754.method4189() && field767 < 128) {
							if (field705 >= 2 && field754.method4191(82) && field754.field2384 == 66) {
								String var38 = Class115.method2940();
								field4671.method698(var38);
							} else if (1 != field620 || field754.field2383 <= 0) {
								field618[field767] = field754.field2384;
								field768[field767] = field754.field2383;
								++field767;
							}
						}

						if (method2866() && field754.method4191(82) && field754.method4191(81) && field555 != 0) {
							var6 = field170.field982 - field555;
							if (var6 < 0) {
								var6 = 0;
							} else if (var6 > 3) {
								var6 = 3;
							}

							if (var6 != field170.field982) {
								method2715(field5093.field1019 + field170.field1242[0], field170.field1284[0] + field5093.field1021, var6, false);
							}

							field555 = 0;
						}

						if (-1 != field592) {
							method1944(field592, 0, 0, field954, field15, 0, 0);
						}

						++field721;

						while (true) {
							Class362 var41;
							Class99 var44;
							Class362 var48;
							do {
								var44 = (Class99)field741.method7507();
								if (var44 == null) {
									while (true) {
										do {
											var44 = (Class99)field742.method7507();
											if (var44 == null) {
												while (true) {
													do {
														var44 = (Class99)field740.method7507();
														if (var44 == null) {
															boolean var51 = false;

															while (true) {
																Class226 var52 = (Class226)field743.method7507();
																if (var52 == null) {
																	if (!var51 && 1 == Class42.field227) {
																		field766.method4400();
																	}

																	this.method1348();
																	Class71.method2124();
																	if (field761 != null) {
																		this.method1353();
																	}

																	boolean var54 = false;

																	for (var8 = 0; var8 < field5093.field1020; ++var8) {
																		Class483 var42 = field5093.field1029[field5093.field1031[var8]];
																		Class83 var45 = var42.field5001;
																		Class277 var55 = var45.field1014;
																		if (var42 != null && var55.method5455()) {
																			if (!var54) {
																				var12 = var55.field2843;
																				var13 = var55.field2876;
																				Class314 var14 = Class168.method3523(ClientPacket.field3365, field678.field1482);
																				var14.field3270.method9809(5);
																				var14.field3270.method10010(var13 + var45.field1021);
																				var14.field3270.method9809(field754.method4191(82) ? (field754.method4191(81) ? 2 : 1) : 0);
																				var14.field3270.method9866(var45.field1019 + var12);
																				field678.method3013(var14);
																				var54 = true;
																				field551 = Class42.field230;
																				field647 = Class42.field222;
																				field700 = 1;
																				field648 = 0;
																				field778 = var12;
																				field779 = var13;
																			}

																			var55.method5369();
																		}
																	}

																	Class314 var46;
																	if (!var54 && field5093.field1014.method5455()) {
																		var8 = field5093.field1014.field2843;
																		var9 = field5093.field1014.field2876;
																		var46 = Class168.method3523(ClientPacket.field3365, field678.field1482);
																		var46.field3270.method9809(5);
																		var46.field3270.method10010(field5093.field1021 + var9);
																		var46.field3270.method9809(field754.method4191(82) ? (field754.method4191(81) ? 2 : 1) : 0);
																		var46.field3270.method9866(var8 + field5093.field1019);
																		field678.method3013(var46);
																		field5093.field1014.method5369();
																		field551 = Class42.field230;
																		field647 = Class42.field222;
																		field700 = 1;
																		field648 = 0;
																		field778 = var8;
																		field779 = var9;
																	}

																	if (var54) {
																		field5093.field1014.method5369();
																	}

																	if (field1905 != var33) {
																		if (var33 != null) {
																			Class490.method8827(var33);
																		}

																		if (field1905 != null) {
																			Class490.method8827(field1905);
																		}
																	}

																	if (field879 != var36 && field688 == field526) {
																		if (var36 != null) {
																			Class490.method8827(var36);
																		}

																		if (field879 != null) {
																			Class490.method8827(field879);
																		}
																	}

																	if (field879 != null) {
																		if (field688 < field526) {
																			++field688;
																			if (field526 == field688) {
																				Class490.method8827(field879);
																			}
																		}
																	} else if (field688 > 0) {
																		--field688;
																	}

																	int var15;
																	int var16;
																	int var58;
																	if (0 == field620) {
																		var8 = field4407.method1959();
																		var9 = field4407.method1966();
																		if (field529 != -1) {
																			Class80 var50 = field170.field1002.field1024[field529];
																			if (var50 != null) {
																				Class350 var57 = var50.method2661(field170.field1002);
																				var8 = var57.field3748;
																				var9 = var57.field3750;
																			}
																		}

																		var10 = field4407.method1957();
																		if (field4526 - var8 < -500 || field4526 - var8 > 500 || field3275 - var9 < -500 || field3275 - var9 > 500) {
																			field4526 = var8;
																			field3275 = var9;
																		}

																		if (var8 != field4526) {
																			field4526 += (var8 - field4526) / 16;
																		}

																		if (var9 != field3275) {
																			field3275 += (var9 - field3275) / 16;
																		}

																		var11 = field4526 >> 7;
																		var12 = field3275 >> 7;
																		var13 = method3531(field5093, field4526, field3275, var10);
																		var58 = 0;
																		if (var11 > 3 && var12 > 3 && var11 < 100 && var12 < 100) {
																			for (var15 = var11 - 4; var15 <= var11 + 4; ++var15) {
																				for (var16 = var12 - 4; var16 <= var12 + 4; ++var16) {
																					int var17 = var10;
																					if (var10 < 3 && 2 == (field5093.field1023[1][var15][var16] & 2)) {
																						var17 = var10 + 1;
																					}

																					int var18 = var13 - field5093.field1025[var17][var15][var16];
																					if (var18 > var58) {
																						var58 = var18;
																					}
																				}
																			}
																		}

																		var15 = var58 * 192;
																		if (var15 > 98048) {
																			var15 = 98048;
																		}

																		if (var15 < 32768) {
																			var15 = 32768;
																		}

																		if (var15 > field631) {
																			field631 += (var15 - field631) / 24;
																		} else if (var15 < field631) {
																			field631 += (var15 - field631) / 80;
																		}

																		field3024 = method3531(field5093, var8, var9, var10) - field711;
																	} else if (1 == field620) {
																		if (field738 && field170 != null) {
																			var8 = field170.field1242[0];
																			var9 = field170.field1284[0];
																			if (var8 >= 0 && 104 > var8 && var9 >= 0 && 104 > var9) {
																				field4526 = field170.field1266;
																				var10 = method3531(field5093, field170.field1266, field170.field1229, field5093.field1016) - field711;
																				if (var10 < field3024) {
																					field3024 = var10;
																				}

																				field3275 = field170.field1229;
																				field738 = false;
																			}
																		}

																		short var59 = -1;
																		if (field754.method4191(33)) {
																			var59 = 0;
																		} else if (field754.method4191(49)) {
																			var59 = 1024;
																		}

																		if (field754.method4191(48)) {
																			if (var59 == 0) {
																				var59 = 1792;
																			} else if (var59 == 1024) {
																				var59 = 1280;
																			} else {
																				var59 = 1536;
																			}
																		} else if (field754.method4191(50)) {
																			if (var59 == 0) {
																				var59 = 256;
																			} else if (var59 == 1024) {
																				var59 = 768;
																			} else {
																				var59 = 512;
																			}
																		}

																		byte var56 = 0;
																		if (field754.method4191(35)) {
																			var56 = -1;
																		} else if (field754.method4191(51)) {
																			var56 = 1;
																		}

																		var10 = 0;
																		if (var59 >= 0 || var56 != 0) {
																			var10 = field754.method4191(81) ? field774 : field625;
																			var10 *= 16;
																			field623 = var59;
																			field624 = var56;
																		}

																		if (field622 < var10) {
																			field622 += var10 / 8;
																			if (field622 > var10) {
																				field622 = var10;
																			}
																		} else if (field622 > var10) {
																			field622 = field622 * 9 / 10;
																		}

																		if (field622 > 0) {
																			var11 = field622 / 16;
																			if (field623 >= 0) {
																				var8 = field623 - field3333 & 2047;
																				var12 = Class274.field2804[var8];
																				var13 = Class274.field2805[var8];
																				field4526 += var12 * var11 / 65536;
																				field3275 += var13 * var11 / 65536;
																			}

																			if (field624 != 0) {
																				field3024 += var11 * field624;
																				if (field3024 > 0) {
																					field3024 = 0;
																				}
																			}
																		} else {
																			field623 = -1;
																			field624 = -1;
																		}

																		if (field754.method4191(13)) {
																			method3182();
																		}
																	}

																	if (4 == Class42.field219 && field911) {
																		var8 = Class42.field221 - field619;
																		field617 = var8 * 2;
																		field619 = var8 != -1 && var8 != 1 ? (field619 + Class42.field221) / 2 : Class42.field221;
																		var9 = field562 - Class42.field231;
																		field616 = var9 * 2;
																		field562 = var9 != -1 && var9 != 1 ? (field562 + Class42.field231) / 2 : Class42.field231;
																	} else {
																		if (field754.method4191(96)) {
																			field616 += (-24 - field616) / 2;
																		} else if (field754.method4191(97)) {
																			field616 += (24 - field616) / 2;
																		} else {
																			field616 /= 2;
																		}

																		if (field754.method4191(98)) {
																			field617 += (12 - field617) / 2;
																		} else if (field754.method4191(99)) {
																			field617 += (-12 - field617) / 2;
																		} else {
																			field617 /= 2;
																		}

																		field619 = Class42.field221;
																		field562 = Class42.field231;
																	}

																	field615 = field615 + field616 / 2 & 2047;
																	field657 += field617 / 2;
																	if (field657 < 128) {
																		field657 = 128;
																	}

																	if (field657 > 383) {
																		field657 = 383;
																	}

																	if (field593) {
																		method7065(field2665, field407, field1551);
																		method4606(field3667, field2691);
																		if (field2665 == field144 && field3664 == field407 && field1551 == field850 && field4606 == field3667 && field3333 == field2691) {
																			field593 = false;
																			field792 = false;
																			field790 = false;
																			field579 = false;
																			field3660 = 0;
																			field1332 = 0;
																			field53 = 0;
																			field1606 = 0;
																			field1388 = 0;
																			field2093 = 0;
																			field1888 = 0;
																			field2681 = 0;
																			field1988 = 0;
																			field4656 = 0;
																			field793 = null;
																			field795 = null;
																			field794 = null;
																		}
																	} else if (field792) {
																		if (!field790) {
																			var8 = Class371.method7108(field2681);
																			var9 = Class371.method7108(field1988);
																			var10 = method3531(field5093, var8, var9, field5093.field1016) - field4656;
																			method7065(var8, var10, var9);
																		} else if (field793 != null) {
																			field144 = field793.method8957();
																			field850 = field793.method8958();
																			if (field830) {
																				field3664 = field793.method8956();
																			} else {
																				field3664 = method3531(field5093, field144, field850, field5093.field1016) - field793.method8956();
																			}

																			field793.method9006();
																		}

																		if (!field579) {
																			var8 = Class371.method7108(field3660);
																			var9 = Class371.method7108(field1332);
																			var10 = method3531(field5093, var8, var9, field5093.field1016) - field53;
																			var11 = var8 - field144;
																			var12 = var10 - field3664;
																			var13 = var9 - field850;
																			var58 = (int)Math.sqrt((double)(var13 * var13 + var11 * var11));
																			var15 = (int)(Math.atan2((double)var12, (double)var58) * 325.9490051269531D) & 2047;
																			var16 = (int)(Math.atan2((double)var11, (double)var13) * -325.9490051269531D) & 2047;
																			method4606(var15, var16);
																		} else {
																			if (field795 != null) {
																				field4606 = field795.method9032();
																				field4606 = Math.min(Math.max(field4606, 128), 383);
																				field795.method9006();
																			}

																			if (field794 != null) {
																				field3333 = field794.method9032() & 2047;
																				field794.method9006();
																			}
																		}
																	}

																	for (var8 = 0; var8 < 5; ++var8) {
																		int var10002 = field524[var8]++;
																	}

																	field4564.method2810();
																	var8 = Class42.method207();
																	var9 = Class45.method2227();
																	if (var8 > 15000 && var9 > 15000) {
																		field649 = 250;
																		Class42.field214 = 14500;
																		var46 = Class168.method3523(ClientPacket.field3386, field678.field1482);
																		field678.method3013(var46);
																	}

																	field1585.method1221();

																	for (var10 = 0; var10 < field826.size(); ++var10) {
																		var12 = (Integer)field826.get(var10);
																		Class150 var60 = Class217.method3191(var12);
																		if (var60 == null) {
																			var11 = 2;
																		} else {
																			var11 = var60.method3242() ? 0 : 1;
																		}

																		if (var11 != 2) {
																			field826.remove(var10);
																			--var10;
																		}
																	}

																	++field678.field1483;
																	if (field678.field1483 > 50) {
																		var46 = Class168.method3523(ClientPacket.field3442, field678.field1482);
																		field678.method3013(var46);
																	}

																	try {
																		field678.method3012();
																	} catch (IOException var19) {
																		method3313();
																	}

																	Class222.method7869().method4285();
																	return;
																}

																if (12 == var52.field2443.field3815) {
																	var51 = true;
																}

																if (var52 != null && var52.field2443 != null) {
																	if (var52.field2443.field3851 >= 0) {
																		var41 = field4644.method6417(var52.field2443.field3832);
																		if (var41 == null || var41.field3950 == null || 0 == var41.field3950.length || var52.field2443.field3851 >= var41.field3950.length || var52.field2443 != var41.field3950[var52.field2443.field3851]) {
																			continue;
																		}
																	}

																	if (11 == var52.field2443.field3815 && 0 == var52.field2439) {
																		if (var52.field2443.method6643(var52.field2444, var52.field2442, 0, 0)) {
																			var52.field2443.method6685().method4348().method4268(1, var52.field2443.method6685().method4360());
																			switch(var52.field2443.method6646()) {
																			case 0:
																				Class35.method8133(var52.field2443.method6632(), true, false);
																				break;
																			case 1:
																				var9 = method3446(var52.field2443);
																				boolean var49 = 0 != (var9 >> 22 & 1);
																				if (var49) {
																					int[] var43 = var52.field2443.method6628();
																					if (var43 != null) {
																						Class314 var53 = Class168.method3523(ClientPacket.field3441, field678.field1482);
																						var53.field3270.method9878(var52.field2443.field3812);
																						var53.field3270.method10010(var52.field2443.field3851);
																						var53.field3270.method9880(var43[1]);
																						var53.field3270.method9880(var52.field2443.method6647());
																						var53.field3270.method9878(var43[0]);
																						var53.field3270.method9878(var43[2]);
																						field678.method3013(var53);
																					}
																				}
																			}
																		}
																	} else if (var52.field2443.field3815 == 12) {
																		Class363 var47 = var52.field2443.method6756();
																		if (var47 != null && var47.method6826()) {
																			switch(var52.field2439) {
																			case 0:
																				field766.method4398(var52.field2443);
																				var47.method6953(true);
																				var47.method6813(var52.field2444, var52.field2442, field754.method4191(82), field754.method4191(81));
																				break;
																			case 1:
																				var47.method6814(var52.field2444, var52.field2442);
																			}
																		}
																	}
																}
															}
														}

														var48 = var44.field1215;
														if (var48.field3851 < 0) {
															break;
														}

														var41 = field4644.method6417(var48.field3832);
													} while(var41 == null || var41.field3950 == null || var48.field3851 >= var41.field3950.length || var41.field3950[var48.field3851] != var48);

													Class70.method2344(var44);
												}
											}

											var48 = var44.field1215;
											if (var48.field3851 < 0) {
												break;
											}

											var41 = field4644.method6417(var48.field3832);
										} while(var41 == null || var41.field3950 == null || var48.field3851 >= var41.field3950.length || var48 != var41.field3950[var48.field3851]);

										Class70.method2344(var44);
									}
								}

								var48 = var44.field1215;
								if (var48.field3851 < 0) {
									break;
								}

								var41 = field4644.method6417(var48.field3832);
							} while(var41 == null || var41.field3950 == null || var48.field3851 >= var41.field3950.length || var48 != var41.field3950[var48.field3851]);

							Class70.method2344(var44);
						}
					}

					var22 = Class168.method3523(ClientPacket.field3416, field678.field1482);
					var22.field3270.method9809(0);
					var4 = var22.field3270.field5471;
					Class50.method59(var22.field3270);
					var22.field3270.method9874(var22.field3270.field5471 - var4);
					field678.method3013(var22);
				}
			}
		}
	}

	@ObfInfo(name = "ig", desc = "(IIB)V", opaque = "20")
	public void method1324(int var1, int var2) {
		if (field678 != null && field678.field1482 != null) {
			if (var1 > -1 && field1474.method2544() > 0 && !field787) {
				Class314 var4 = Class168.method3523(ClientPacket.field3357, field678.field1482);
				var4.field3270.method9812(var1);
				field678.method3013(var4);
			}

		}
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	public final void method638() {
		field755 = Class329.method4953() + 500L;
		this.method1583();
		if (-1 != field592) {
			this.method1487(true);
		}

	}

	@ObfInfo(name = "jj", desc = "(I)V", opaque = "957518491")
	public void method1583() {
		int var2 = field954;
		int var3 = field15;
		if (super.field256 < var2) {
			var2 = super.field256;
		}

		if (super.field273 < var3) {
			var3 = super.field273;
		}

		if (field1474 != null) {
			try {
				Class46.method800(field4671, "resize", new Object[]{method2130()});
			} catch (Throwable var5) {
			}
		}

	}

	@ObfInfo(name = "jx", desc = "(B)V", opaque = "-1")
	public final void method1344() {
		if (-1 != field592) {
			Class225.method4334(field592);
		}

		int var2;
		for (var2 = 0; var2 < field666; ++var2) {
			if (field747[var2]) {
				field748[var2] = true;
			}

			field749[var2] = field747[var2];
			field747[var2] = false;
		}

		field746 = field541;
		field686 = -1;
		field576 = -1;
		if (-1 != field592) {
			field666 = 0;
			method2768(field592, 0, 0, field954, field15, 0, 0, -1);
		}

		Class569.method10129();
		if (field650) {
			if (field700 == 1) {
				field1406[field648 / 100].method9628(field551 - 8, field647 - 8);
			}

			if (field700 == 2) {
				field1406[field648 / 100 + 4].method9628(field551 - 8, field647 - 8);
			}
		}

		if (!field672) {
			if (-1 != field686) {
				method4723(field686, field576);
			}
		} else {
			method2985();
		}

		if (field608 == 3) {
			for (var2 = 0; var2 < field666; ++var2) {
				if (field749[var2]) {
					Class569.method10157(field750[var2], field751[var2], field752[var2], field598[var2], 16711935, 128);
				} else if (field748[var2]) {
					Class569.method10157(field750[var2], field751[var2], field752[var2], field598[var2], 16711680, 128);
				}
			}
		}

		Class55.method4251(field5093.field1016, field170.field1266, field170.field1229, field831);
		field831 = 0;
	}

	@ObfInfo(name = "ku", desc = "(Lev;II)Z", opaque = "496029700")
	public boolean method1345(Class126 var1, int var2) {
		if (0 == var1.field1485) {
			field883 = null;
		} else {
			if (field883 == null) {
				field883 = new Class455(field1066, field4671);
			}

			field883.method8358(var1.field1487, var2);
		}

		method8513();
		var1.field1490 = null;
		return true;
	}

	@ObfInfo(name = "kb", desc = "(Lev;I)Z", opaque = "453523124")
	public boolean method1346(Class126 var1) {
		if (field883 != null) {
			field883.method8359(var1.field1487);
		}

		method8513();
		var1.field1490 = null;
		return true;
	}

	@ObfInfo(name = "kr", desc = "(Lev;I)Z", opaque = "-659118293")
	public final boolean method1347(Class126 var1) {
		Class484 var3 = var1.method3017();
		Class527 var4 = var1.field1487;
		if (var3 == null) {
			return false;
		} else {
			String var6;
			int var7;
			try {
				int var24;
				if (var1.field1490 == null) {
					if (var1.field1488) {
						if (!var3.method8651(1)) {
							return false;
						}

						var3.method8647(var1.field1487.field5472, 0, 1);
						var1.field1484 = 0;
						var1.field1488 = false;
					}

					var4.field5471 = 0;
					if (var4.method9344()) {
						if (!var3.method8651(1)) {
							return false;
						}

						var3.method8647(var1.field1487.field5472, 1, 1);
						var1.field1484 = 0;
					}

					var1.field1488 = true;
					ServerPacket[] var5 = ServerPacket.method3181();
					var24 = var4.method9361();
					if (var24 < 0 || var24 >= var5.length) {
						throw new IOException(var24 + " " + var4.field5471);
					}

					var1.field1490 = var5[var24];
					var1.field1485 = var1.field1490.length;
				}

				if (-1 == var1.field1485) {
					if (!var3.method8651(1)) {
						return false;
					}

					var1.method3017().method8647(var4.field5472, 0, 1);
					var1.field1485 = var4.field5472[0] & 255;
				}

				if (var1.field1485 == -2) {
					if (!var3.method8651(2)) {
						return false;
					}

					var1.method3017().method8647(var4.field5472, 0, 2);
					var4.field5471 = 0;
					var1.field1485 = var4.method9997();
				}

				if (!var3.method8651(var1.field1485)) {
					return false;
				}

				var4.field5471 = 0;
				var3.method8647(var4.field5472, 0, var1.field1485);
				var1.field1484 = 0;
				field595.method8311();
				var1.field1491 = var1.field1486;
				var1.field1486 = var1.field1489;
				var1.field1489 = var1.field1490;
				if (ServerPacket.field3516 == var1.field1490) {
					field1315 = null;
					var1.field1490 = null;
					return true;
				}

				int var23;
				Class362 var31;
				if (ServerPacket.field3506 == var1.field1490) {
					var23 = var4.method9882();
					var24 = var4.method9860();
					var7 = var4.method9860();
					var31 = field4644.method6417(var23);
					Class362.method2302(var31, var24, var7);
					Class490.method8827(var31);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3564 == var1.field1490) {
					Class155.method3334(Class316.field3320);
					var1.field1490 = null;
					return true;
				}

				int var8;
				int var9;
				int var11;
				int var36;
				if (ServerPacket.field3600 == var1.field1490) {
					field792 = true;
					field593 = false;
					field579 = false;
					field3660 = var4.method9902();
					field1332 = var4.method9902();
					field53 = var4.method9997();
					field1606 = var4.method9902();
					field1388 = var4.method9902();
					if (field1388 >= 100) {
						var23 = Class371.method7108(field3660);
						var24 = Class371.method7108(field1332);
						var7 = method3531(field5093, var23, var24, field5093.field1016) - field53;
						var8 = var23 - field144;
						var9 = var7 - field3664;
						var36 = var24 - field850;
						var11 = (int)Math.sqrt((double)(var36 * var36 + var8 * var8));
						field4606 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
						field3333 = (int)(Math.atan2((double)var8, (double)var36) * -325.9490051269531D) & 2047;
						if (field4606 < 128) {
							field4606 = 128;
						}

						if (field4606 > 383) {
							field4606 = 383;
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3631 == var1.field1490) {
					var23 = var4.method9902();
					var24 = var4.method9997();
					var7 = var4.method9902();
					if (var23 == 0) {
						field5093.field1016 = var7;
						field94 = field5093;
					} else {
						if (var23 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						Class483 var86 = field5093.field1029[var24];
						var86.field5001.field1016 = var7;
						field94 = var86.field5001;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3634 == var1.field1490) {
					field1556 = var4.method9860();
					field606 = var4.method9861();
					field1312 = var4.method9859();

					for (var23 = field1556; var23 < field1556 + 8; ++var23) {
						for (var24 = field1312; var24 < 8 + field1312; ++var24) {
							if (field94.field1032[field606][var23][var24] != null) {
								field94.field1032[field606][var23][var24] = null;
								method4907(field606, var23, var24);
							}
						}
					}

					for (Class103 var89 = (Class103)field94.field1033.method7526(); var89 != null; var89 = (Class103)field94.field1033.method7511()) {
						if (var89.field1322 >= field1556 && var89.field1322 < 8 + field1556 && var89.field1321 >= field1312 && var89.field1321 < 8 + field1312 && field606 == var89.field1318) {
							var89.field1317 = 0;
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3551 == var1.field1490) {
					var23 = var4.method9868();
					var24 = var4.method9869();
					var7 = var4.method9855();
					var31 = field4644.method6417(var7);
					var31.field3925 = var23 + (var24 << 16);
					var1.field1490 = null;
					return true;
				}

				Class362 var27;
				if (ServerPacket.field3601 == var1.field1490) {
					var23 = var4.method9883();
					var24 = var4.method9861();
					var27 = field4644.method6417(var23);
					Class209.method4041(var27, field170.field1001.field3720, var24);
					Class490.method8827(var27);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3543 == var1.field1490) {
					Class155.method3334(Class316.field3315);
					var1.field1490 = null;
					return true;
				}

				boolean var42;
				if (ServerPacket.field3582 == var1.field1490) {
					var42 = var4.method9902() == 1;
					if (var42) {
						field4967 = Class329.method4953() - var4.method9833();
						field2533 = new Class374(var4, true);
					} else {
						field2533 = null;
					}

					field753 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3554 == var1.field1490) {
					var24 = var4.method9981();
					var23 = var4.method9997();
					var7 = var4.method9861();
					if (var24 == 65535) {
						var24 = -1;
					}

					Class102 var84 = field94.field1013[var23];
					if (var84 != null) {
						if (var24 == var84.field1273 && var24 != -1) {
							var9 = Class344.method6474(var24).field2370;
							if (var9 == 1) {
								var84.field1274 = 0;
								var84.field1275 = 0;
								var84.field1276 = var7;
								var84.field1252 = 0;
							} else if (var9 == 2) {
								var84.field1252 = 0;
							}
						} else if (var24 == -1 || -1 == var84.field1273 || Class344.method6474(var24).field2363 >= Class344.method6474(var84.field1273).field2363) {
							var84.field1273 = var24;
							var84.field1274 = 0;
							var84.field1275 = 0;
							var84.field1276 = var7;
							var84.field1252 = 0;
							var84.field1303 = var84.field1267;
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3558 == var1.field1490) {
					var23 = var4.method9969();
					var24 = var4.method9855();
					var7 = var4.method9872();
					var31 = field4644.method6417(var24);
					if (var7 != var31.field3888 || var31.field3823 != var23 || var31.field3818 != 0 || var31.field3878 != 0) {
						var31.field3888 = var7;
						var31.field3823 = var23;
						var31.field3818 = 0;
						var31.field3878 = 0;
						Class490.method8827(var31);
						this.method1352(var31);
						if (0 == var31.field3815) {
							method4491(field4644.field3698[var24 >> 16], var31, false);
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3597 == var1.field1490) {
					var23 = var4.method9832();
					Class100 var88 = (Class100)field698.method9439((long)var23);
					if (var88 != null) {
						method7260(var88, true);
					}

					if (field607 != null) {
						Class490.method8827(field607);
						field607 = null;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3566 == var1.field1490) {
					method483();
					var23 = var4.method9861();
					var24 = var4.method9902();
					var7 = var4.method9882();
					var8 = var4.method9861();
					field669[var23] = var7;
					field629[var23] = var8;
					field730[var23] = 1;
					field801[var23] = var24;

					for (var9 = 0; var9 < 98; ++var9) {
						if (var7 >= Class380.field4505[var9]) {
							field730[var23] = var9 + 2;
						}
					}

					field713[++field727 - 1 & 31] = var23;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3626 == var1.field1490) {
					var23 = var4.method9902();
					var24 = var4.method9997();
					var7 = field534 >= 223 ? var4.method9829() : -1;
					this.method643(false);
					if (var23 == 0) {
						field4407 = field5093.field1024[var24];
						field529 = -1;
						field170.field1002 = field5093;
					} else if (var23 == 1) {
						field529 = -1;
						field4407 = field5093.field1013[var24];
					} else if (var23 == 2) {
						field529 = var7;
						field4407 = field5093.field1029[var24];
						this.method643(true);
						field170.field1002 = field5093.field1029[var24].field5001;
					}

					if (field4407 == null) {
						field529 = -1;
						field4407 = field170;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3512 == var1.field1490) {
					field1312 = var4.method9902();
					field606 = var4.method9859();
					field1556 = var4.method9902();
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3570 == var1.field1490) {
					var23 = var4.method9902();
					method2120(var23);
					var1.field1490 = null;
					return false;
				}

				if (ServerPacket.field3624 == var1.field1490) {
					var23 = var4.method9868();
					if (var23 == 65535) {
						var23 = -1;
					}

					field592 = var23;
					this.method1487(false);
					Class132.method3064(var23);
					Class70.method302(field592);

					for (var24 = 0; var24 < 100; ++var24) {
						field747[var24] = true;
					}

					var1.field1490 = null;
					return true;
				}

				byte var25;
				if (ServerPacket.field3513 == var1.field1490) {
					field685 = field721;
					var25 = var4.method9955();
					if (1 == var1.field1485) {
						if (var25 >= 0) {
							field772[var25] = null;
						} else {
							field2773 = null;
						}

						var1.field1490 = null;
						return true;
					}

					if (var25 >= 0) {
						field772[var25] = new Class166(var4);
					} else {
						field2773 = new Class166(var4);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3598 == var1.field1490) {
					for (var23 = 0; var23 < field94.field1024.length; ++var23) {
						if (null != field94.field1024[var23]) {
							field94.field1024[var23].field1273 = -1;
						}
					}

					for (var23 = 0; var23 < field94.field1013.length; ++var23) {
						if (field94.field1013[var23] != null) {
							field94.field1013[var23].field1273 = -1;
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3617 == var1.field1490) {
					field549 = var4.method9981() * 30;
					field737 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3501 == var1.field1490) {
					field792 = true;
					field593 = false;
					field790 = false;
					field2681 = var4.method9902();
					field1988 = var4.method9902();
					field4656 = var4.method9997();
					field1888 = var4.method9902();
					field2093 = var4.method9902();
					if (field2093 >= 100) {
						field144 = Class371.method7108(field2681);
						field850 = Class371.method7108(field1988);
						field3664 = method3531(field5093, field144, field850, field5093.field1016) - field4656;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3595 == var1.field1490 && field792) {
					field593 = true;
					field579 = false;
					field790 = false;

					for (var23 = 0; var23 < 5; ++var23) {
						field797[var23] = false;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3633 == var1.field1490) {
					field4580 = var4.method9835();
					var1.field1490 = null;
					return true;
				}

				String var37;
				if (ServerPacket.field3519 == var1.field1490) {
					var37 = var4.method9837();
					var6 = Class442.method8142(Class413.method2000(Class381.method3835(var4)));
					Class115.method3716(6, var37, var6);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3540 == var1.field1490) {
					var23 = var4.method9902();
					var24 = var4.method9902();
					var7 = var4.method9902();
					var8 = var4.method9902();
					field797[var23] = true;
					field798[var23] = var24;
					field690[var23] = var7;
					field800[var23] = var8;
					field524[var23] = 0;
					var1.field1490 = null;
					return true;
				}

				String var59;
				if (ServerPacket.field3576 == var1.field1490) {
					var23 = var4.method9859();
					var24 = var4.method9861();
					var59 = var4.method9837();
					if (var23 >= 1 && var23 <= 8) {
						if (var59.equalsIgnoreCase(Class367.field4306)) {
							var59 = null;
						}

						field712[var23 - 1] = var59;
						field664[var23 - 1] = var24 == 0;
					}

					var1.field1490 = null;
					return true;
				}

				int var16;
				int var17;
				int var18;
				int var19;
				Class84 var20;
				int var48;
				byte var51;
				int var53;
				byte var54;
				int var64;
				int var72;
				if (ServerPacket.field3619 == var1.field1490) {
					var18 = var4.method9902();
					var48 = var4.method9862();
					var51 = var4.method10018();
					var17 = var4.method9868();
					var72 = var4.method9860() * 4;
					var54 = var4.method9864();
					var64 = var4.method9861() * 4;
					var53 = var4.method9868();
					var19 = var4.method9981();
					var16 = var4.method9869();
					var7 = var4.method9830();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var8 = var23 + (var7 >> 4 & 7);
					var9 = var24 + (var7 & 7);
					var36 = var54 + var8;
					var11 = var51 + var9;
					if (0 <= var8 && var8 < 104 && 0 <= var9 && var9 < 104 && 0 <= var36 && var36 < 104 && 0 <= var11 && var11 < 104 && var53 != 65535) {
						var8 = Class371.method7108(var8);
						var9 = Class371.method7108(var9);
						var36 = Class371.method7108(var36);
						var11 = Class371.method7108(var11);
						var20 = new Class84(var53, field94.field1016, var8, var9, method3531(field94, var8, var9, field94.field1016) - var64, var16 + field541, var17 + field541, var18, var19, var48, var72);
						var20.method2329(var36, var11, method3531(field94, var36, var11, field94.field1016) - var72, var16 + field541);
						field94.field1022.method7506(var20);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3505 == var1.field1490) {
					field1585.method1210();
					field731 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3518 == var1.field1490) {
					field1312 = var4.method9859();
					field1556 = var4.method9902();
					field606 = var4.method9860();

					while (var4.field5471 < var1.field1485) {
						var23 = var4.method9902();
						Class316 var87 = Class316.method266()[var23];
						Class155.method3334(var87);
					}

					var1.field1490 = null;
					return true;
				}

				Class362 var35;
				if (ServerPacket.field3555 == var1.field1490) {
					var23 = var4.method9855();
					var35 = field4644.method6417(var23);

					for (var7 = 0; var7 < var35.field3944.length; ++var7) {
						var35.field3944[var7] = -1;
						var35.field3944[var7] = 0;
					}

					Class490.method8827(var35);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3535 == var1.field1490) {
					var23 = var4.method9832();
					if (var23 != field627) {
						field627 = var23;
						method4346();
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3553 == var1.field1490) {
					field593 = false;
					field792 = false;
					field790 = false;
					field579 = false;
					field3660 = 0;
					field1332 = 0;
					field53 = 0;
					field830 = false;
					field1606 = 0;
					field1388 = 0;
					field2093 = 0;
					field1888 = 0;
					field2681 = 0;
					field1988 = 0;
					field4656 = 0;
					field793 = null;
					field795 = null;
					field794 = null;

					for (var23 = 0; var23 < 5; ++var23) {
						field797[var23] = false;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3602 == var1.field1490) {
					Class50.method3572(var4, var1.field1485);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3599 == var1.field1490) {
					var23 = var4.method9981();
					var24 = var4.method9882();
					Class353.field3767[var23] = var24;
					if (Class353.field3769[var23] != var24) {
						Class353.field3769[var23] = var24;
					}

					Class82.method2313(var23);
					field722[++field723 - 1 & 31] = var23;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3575 == var1.field1490) {
					var8 = var4.method9861();
					var24 = var4.method9997();
					var23 = var4.method9981();
					Class80 var79;
					if (field732 == var23) {
						var79 = field170;
					} else {
						var79 = field94.field1024[var23];
					}

					var7 = var4.method9855();
					if (var79 != null) {
						var79.method2654(var8, var24, var7 >> 16, var7 & 65535);
					}

					var1.field1490 = null;
					return true;
				}

				long var46;
				if (ServerPacket.field3510 == var1.field1490) {
					var23 = var4.method9869();
					if (var23 == 65535) {
						var23 = -1;
					}

					var24 = var4.method9981();
					if (var24 == 65535) {
						var24 = -1;
					}

					var7 = var4.method9855();
					var8 = var4.method9855();

					for (var9 = var24; var9 <= var23; ++var9) {
						var46 = ((long)var8 << 32) + (long)var9;
						Class520 var74 = field769.method9439(var46);
						if (var74 != null) {
							var74.method9267();
						}

						field769.method9445(new Class508(var7), var46);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3618 == var1.field1490) {
					var23 = var4.method9902();
					if (var4.method9902() == 0) {
						field819[var23] = new Class409();
						var4.field5471 += 18;
					} else {
						--var4.field5471;
						field819[var23] = new Class409(var4, false);
					}

					field735 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3632 == var1.field1490) {
					field1660 = var4.method9835();
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3610 == var1.field1490) {
					field799 = var4.method9861();
					field760 = var4.method9902();
					var1.field1490 = null;
					return true;
				}

				Class362 var38;
				if (ServerPacket.field3552 == var1.field1490) {
					var23 = var4.method9832();
					var24 = var4.method9981();
					var7 = var4.method9997();
					var8 = var4.method9997();
					var38 = field4644.method6417(var23);
					if (var24 != var38.field3865 || var38.field3866 != var7 || var38.field3868 != var8) {
						var38.field3865 = var24;
						var38.field3866 = var7;
						var38.field3868 = var8;
						Class490.method8827(var38);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3590 == var1.field1490) {
					var23 = var4.method9855();
					var24 = var4.method9883();
					var27 = field4644.method6417(var23);
					Class362.method4456(var27, var24);
					Class490.method8827(var27);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3608 == var1.field1490) {
					method483();
					field703 = var4.method9997();
					field737 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3539 == var1.field1490) {
					Class155.method3334(Class316.field3313);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3542 == var1.field1490) {
					method3118();
					var1.field1490 = null;
					return false;
				}

				if (ServerPacket.field3528 == var1.field1490) {
					method7474();
					var25 = var4.method9955();
					if (var1.field1485 == 1) {
						if (var25 >= 0) {
							field771[var25] = null;
						} else {
							field1685 = null;
						}

						var1.field1490 = null;
						return true;
					}

					if (var25 >= 0) {
						field771[var25] = new Class167(var4);
					} else {
						field1685 = new Class167(var4);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3567 == var1.field1490) {
					field792 = true;
					field593 = false;
					field790 = true;
					field2681 = var4.method9902();
					field1988 = var4.method9902();
					var23 = var4.method9997();
					var24 = var4.method9997();
					field830 = var4.method9835();
					var7 = var4.method9902();
					var8 = Class371.method7108(field2681);
					var9 = Class371.method7108(field1988);
					boolean var78 = false;
					boolean var70 = false;
					if (field830) {
						var36 = field3664;
						var11 = method3531(field5093, var8, var9, field5093.field1016) - var23;
					} else {
						var36 = method3531(field5093, field144, field850, field5093.field1016) - field3664;
						var11 = var23;
					}

					field793 = new Class513(field144, field850, var36, var8, var9, var11, var24, var7);
					var1.field1490 = null;
					return true;
				}

				long var34;
				long var43;
				String var68;
				long var73;
				if (ServerPacket.field3517 == var1.field1490) {
					var37 = var4.method9837();
					var43 = var4.method9833();
					var34 = (long)var4.method9997();
					var46 = (long)var4.method9830();
					Class365 var69 = (Class365)Class406.method4071(Class365.method3148(), var4.method9902());
					var73 = (var34 << 32) + var46;
					boolean var77 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (field763[var16] == var73) {
							var77 = true;
							break;
						}
					}

					if (var69.field4015 && field1585.method1232(new Class561(var37, field1066))) {
						var77 = true;
					}

					if (!var77 && 0 == field651) {
						field763[field764] = var73;
						field764 = (1 + field764) % 100;
						var68 = Class442.method8142(Class413.method2000(Class381.method3835(var4)));
						if (var69.field4006 != -1) {
							Class387.method7265(9, Class111.method7220(var69.field4006) + var37, var68, Class240.method4650(var43));
						} else {
							Class387.method7265(9, var37, var68, Class240.method4650(var43));
						}
					}

					var1.field1490 = null;
					return true;
				}

				Class102 var52;
				if (ServerPacket.field3504 == var1.field1490) {
					var7 = var4.method9869();
					var23 = var4.method9868();
					var52 = field94.field1013[var23];
					var8 = var4.method9861();
					var24 = var4.method9832();
					if (var52 != null) {
						var52.method2654(var8, var7, var24 >> 16, var24 & 65535);
					}

					var1.field1490 = null;
					return true;
				}

				Class100 var30;
				if (ServerPacket.field3586 == var1.field1490) {
					var23 = var4.method9861();
					var24 = var4.method9868();
					var7 = var4.method9832();
					var30 = (Class100)field698.method9439((long)var7);
					if (var30 != null) {
						method7260(var30, var30.field1225 != var24);
					}

					method7468(var7, var24, var23);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3544 == var1.field1490) {
					Class155.method3334(Class316.field3319);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3593 == var1.field1490) {
					var23 = var4.method9859();
					var24 = var4.method9997();
					if (var24 == 65535) {
						var24 = -1;
					}

					Class6.method71(field170, var24, var23);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3524 == var1.field1490) {
					method219(field94, var4);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3615 == var1.field1490) {
					return this.method1345(var1, 1);
				}

				if (ServerPacket.field3549 == var1.field1490) {
					var23 = var1.field1485 + var4.field5471;
					var24 = var4.method9997();
					if (var24 == 65535) {
						var24 = -1;
					}

					var7 = var4.method9997();
					if (field592 != var24) {
						field592 = var24;
						this.method1487(false);
						Class132.method3064(field592);
						Class70.method302(field592);

						for (var8 = 0; var8 < 100; ++var8) {
							field747[var8] = true;
						}
					}

					Class100 var58;
					for (; var7-- > 0; var58.field1224 = true) {
						var8 = var4.method9832();
						var9 = var4.method9997();
						var36 = var4.method9902();
						var58 = (Class100)field698.method9439((long)var8);
						if (var58 != null && var58.field1225 != var9) {
							method7260(var58, true);
							var58 = null;
						}

						if (var58 == null) {
							var58 = method7468(var8, var9, var36);
						}
					}

					for (var30 = (Class100)field698.method9442(); var30 != null; var30 = (Class100)field698.method9446()) {
						if (var30.field1224) {
							var30.field1224 = false;
						} else {
							method7260(var30, true);
						}
					}

					field769 = new Class536(512);

					while (var4.field5471 < var23) {
						var8 = var4.method9832();
						var9 = var4.method9997();
						var36 = var4.method9997();
						var11 = var4.method9832();

						for (var48 = var9; var48 <= var36; ++var48) {
							var73 = ((long)var8 << 32) + (long)var48;
							field769.method9445(new Class508(var11), var73);
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3563 == var1.field1490) {
					for (var23 = 0; var23 < Class353.field3769.length; ++var23) {
						if (Class353.field3769[var23] != Class353.field3767[var23]) {
							Class353.field3769[var23] = Class353.field3767[var23];
							Class82.method2313(var23);
							field722[++field723 - 1 & 31] = var23;
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3613 == var1.field1490) {
					return this.method1345(var1, 2);
				}

				if (ServerPacket.field3537 == var1.field1490) {
					field792 = true;
					field593 = false;
					field579 = true;
					field3660 = var4.method9902();
					field1332 = var4.method9902();
					field53 = var4.method9997();
					var23 = var4.method9997();
					var24 = var4.method9902();
					var7 = Class371.method7108(field3660);
					var8 = Class371.method7108(field1332);
					var9 = method3531(field5093, var7, var8, field5093.field1016) - field53;
					var36 = var7 - field144;
					var11 = var9 - field3664;
					var48 = var8 - field850;
					double var71 = Math.sqrt((double)(var36 * var36 + var48 * var48));
					var72 = method3198((int)(Math.atan2((double)var11, var71) * 325.9490051269531D) & 2047);
					var16 = method4984((int)(Math.atan2((double)var36, (double)var48) * -325.9490051269531D) & 2047);
					field795 = new Class514(field4606, var72, var23, var24);
					field794 = new Class514(field3333, var16, var23, var24);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3627 == var1.field1490) {
					field550 = var4.method9902();
					if (field550 == 1) {
						field820 = var4.method9997();
					}

					if (field550 >= 2 && field550 <= 6) {
						if (2 == field550) {
							field626 = 64;
							field557 = 64;
						}

						if (3 == field550) {
							field626 = 0;
							field557 = 64;
						}

						if (field550 == 4) {
							field626 = 128;
							field557 = 64;
						}

						if (5 == field550) {
							field626 = 64;
							field557 = 0;
						}

						if (6 == field550) {
							field626 = 64;
							field557 = 128;
						}

						field550 = 2;
						field553 = var4.method9997();
						field813 = var4.method9997();
						field569 = var4.method9902();
					}

					if (field550 == 10) {
						field552 = var4.method9997();
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3520 == var1.field1490) {
					field778 = var4.method9902();
					if (field778 == 255) {
						field778 = 0;
					}

					field779 = var4.method9902();
					if (255 == field779) {
						field779 = 0;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3525 == var1.field1490) {
					var4.field5471 += 28;
					if (var4.method10046()) {
						method3849(var4, var4.field5471 - 28);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3502 == var1.field1490) {
					for (var23 = 0; var23 < field1883; ++var23) {
						Class176 var85 = Class176.method4047(var23);
						if (var85 != null) {
							Class353.field3767[var23] = 0;
							Class353.field3769[var23] = 0;
						}
					}

					method483();
					field723 += 32;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3603 == var1.field1490) {
					var23 = var4.method9969();
					var24 = var4.method9855();
					var27 = field4644.method6417(var24);
					if (var23 != var27.field3861 || var23 == -1) {
						var27.field3861 = var23;
						var27.field3853 = 0;
						var27.field3926 = 0;
						Class490.method8827(var27);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3623 == var1.field1490) {
					var23 = var4.method9832();
					var24 = var4.method9997();
					if (var23 < -70000) {
						var24 += 32768;
					}

					if (var23 >= 0) {
						var27 = field4644.method6417(var23);
					} else {
						var27 = null;
					}

					for (; var4.field5471 < var1.field1485; Class89.method4234(var24, var8, var9 - 1, var36)) {
						var8 = var4.method9842();
						var9 = var4.method9997();
						var36 = 0;
						if (var9 != 0) {
							var36 = var4.method9902();
							if (var36 == 255) {
								var36 = var4.method9832();
							}
						}

						if (var27 != null && var8 >= 0 && var8 < var27.field3944.length) {
							var27.field3944[var8] = var9;
							var27.field3945[var8] = var36;
						}
					}

					if (var27 != null) {
						Class490.method8827(var27);
					}

					method483();
					field724[++field646 - 1 & 31] = var24 & 32767;
					var1.field1490 = null;
					return true;
				}

				boolean var26;
				if (ServerPacket.field3580 == var1.field1490) {
					var23 = var4.method9842();
					var26 = var4.method9902() == 1;
					var59 = "";
					boolean var60 = false;
					if (var26) {
						var59 = var4.method9837();
						if (field1585.method1232(new Class561(var59, field1066))) {
							var60 = true;
						}
					}

					String var57 = var4.method9837();
					if (!var60) {
						Class115.method3716(var23, var59, var57);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3614 == var1.field1490) {
					var23 = var4.method9868();
					var24 = var4.method9855();
					var27 = field4644.method6417(var24);
					if (var27.field3891 != 2 || var27.field3858 != var23) {
						var27.field3891 = 2;
						var27.field3858 = var23;
						Class490.method8827(var27);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3531 == var1.field1490) {
					var37 = var4.method9837();
					Object[] var83 = new Object[var37.length() + 1];

					for (var7 = var37.length() - 1; var7 >= 0; --var7) {
						if (var37.charAt(var7) == 's') {
							var83[var7 + 1] = var4.method9837();
						} else {
							var83[var7 + 1] = new Integer(var4.method9832());
						}
					}

					var83[0] = new Integer(var4.method9832());
					Class99 var80 = new Class99();
					var80.field1217 = var83;
					Class70.method2344(var80);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3509 == var1.field1490) {
					Class155.method3334(Class316.field3316);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3573 == var1.field1490) {
					field792 = true;
					field593 = false;
					field579 = true;
					var23 = var4.method9829();
					var24 = var4.method9829();
					var7 = method3198(var24 + field4606 & 2027);
					var8 = field3333 + var23;
					var9 = var4.method9997();
					var36 = var4.method9902();
					field795 = new Class514(field4606, var7, var9, var36);
					field794 = new Class514(field3333, var8, var9, var36);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3561 == var1.field1490) {
					method7474();
					var25 = var4.method9955();
					Class144 var82 = new Class144(var4);
					Class167 var75;
					if (var25 >= 0) {
						var75 = field771[var25];
					} else {
						var75 = field1685;
					}

					if (var75 == null) {
						this.method1472(var25);
						var1.field1490 = null;
						return true;
					}

					if (var82.field1648 > var75.field1820) {
						this.method1472(var25);
						var1.field1490 = null;
						return true;
					}

					if (var82.field1648 < var75.field1820) {
						var1.field1490 = null;
						return true;
					}

					var82.method3180(var75);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3622 == var1.field1490) {
					Class320.method6279(true, var1.field1487);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3587 == var1.field1490) {
					var23 = var4.method9869();
					var24 = var4.method9855();
					var7 = var23 >> 10 & 31;
					var8 = var23 >> 5 & 31;
					var9 = var23 & 31;
					var36 = (var8 << 11) + (var7 << 19) + (var9 << 3);
					Class362 var55 = field4644.method6417(var24);
					if (var36 != var55.field3894) {
						var55.field3894 = var36;
						Class490.method8827(var55);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3565 == var1.field1490) {
					var23 = var4.method9997();
					var24 = var4.method9882();
					var27 = field4644.method6417(var24);
					if (var27 != null && 0 == var27.field3815) {
						if (var23 > var27.field3837 - var27.field3829) {
							var23 = var27.field3837 - var27.field3829;
						}

						if (var23 < 0) {
							var23 = 0;
						}

						if (var23 != var27.field3835) {
							var27.field3835 = var23;
							Class490.method8827(var27);
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3578 == var1.field1490) {
					var24 = var4.method9981();
					var23 = var4.method9868();
					Class323.method3075(var23, var24);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3557 == var1.field1490) {
					var53 = var4.method9981();
					var72 = var4.method9860() * 4;
					var17 = var4.method9868();
					var48 = var4.method9876();
					var18 = var4.method9861();
					var54 = var4.method9955();
					var19 = var4.method9859();
					var7 = var4.method10029();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var8 = (var7 >> 4 & 7) + var23;
					var9 = var24 + (var7 & 7);
					var51 = var4.method9864();
					var64 = var4.method9861() * 4;
					var16 = var4.method9997();
					var36 = var54 + var8;
					var11 = var51 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < field94.field1030 && var9 < field94.field1018 && var36 >= 0 && var11 >= 0 && var36 < field94.field1030 && var11 < field94.field1018 && var53 != 65535) {
						var8 = Class371.method7108(var8);
						var9 = Class371.method7108(var9);
						var36 = Class371.method7108(var36);
						var11 = Class371.method7108(var11);
						var20 = new Class84(var53, field94.field1016, var8, var9, method3531(field94, var8, var9, field94.field1016) - var64, var16 + field541, field541 + var17, var18, var19, var48, var72);
						var20.method2329(var36, var11, method3531(field94, var36, var11, field94.field1016) - var72, field541 + var16);
						field94.field1022.method7506(var20);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3503 == var1.field1490) {
					Class302.method5842(field94, var4);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3546 == var1.field1490) {
					field94.field1017.method2884(var4, var1.field1485);
					Class240.method4635();
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3583 == var1.field1490) {
					field5281 = Class549.method145(var4.method9902());
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3550 == var1.field1490) {
					var23 = var4.method9981();
					var24 = var4.method9883();
					var27 = field4644.method6417(var24);
					if (6 != var27.field3891 || var23 != var27.field3858) {
						var27.field3891 = 6;
						var27.field3858 = var23;
						Class490.method8827(var27);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3538 == var1.field1490) {
					var23 = var4.method9869();
					var24 = var4.method9855();
					short var61 = (short)var4.method9872();
					var8 = var4.method9859();
					var52 = field94.field1013[var23];
					if (var52 != null) {
						var52.method2711(var8, var24, var61);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3591 == var1.field1490) {
					byte[] var81 = new byte[var1.field1485];
					var4.method9345(var81, 0, var81.length);
					Class562 var76 = new Class562(var81);
					var59 = var76.method9837();
					Class35.method8133(var59, true, false);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3588 == var1.field1490) {
					Class155.method3334(Class316.field3311);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3625 == var1.field1490) {
					field1315 = new Class473(field3998);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3581 == var1.field1490) {
					var7 = var4.method9997();
					var24 = var4.method9869();
					if (var24 == 65535) {
						var24 = -1;
					}

					var8 = var4.method9981();
					var36 = var4.method9997();
					var9 = var4.method9981();
					var23 = var4.method9869();
					if (var23 == 65535) {
						var23 = -1;
					}

					ArrayList var49 = new ArrayList();
					var49.add(var23);
					var49.add(var24);
					method8897(var49, var7, var8, var9, var36);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3514 == var1.field1490) {
					var23 = var4.method9883();
					var6 = var4.method9837();
					var27 = field4644.method6417(var23);
					if (!var6.equals(var27.field3876)) {
						var27.field3876 = var6;
						Class490.method8827(var27);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3605 == var1.field1490) {
					var23 = var4.method9883();
					var24 = var4.method9869();
					var27 = field4644.method6417(var23);
					if (var27.field3891 != 1 || var24 != var27.field3858) {
						var27.field3891 = 1;
						var27.field3858 = var24;
						Class490.method8827(var27);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3547 == var1.field1490) {
					var7 = var4.method10054();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var8 = var23 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var24;
					var36 = var4.method9860();
					var11 = var36 >> 2;
					var48 = var36 & 3;
					var53 = field605[var11];
					var64 = var4.method9981();
					if (0 <= var8 && var8 < 103 && 0 <= var9 && var9 < 103) {
						method881(var8, var9, var11, var48, var53, var64);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3533 == var1.field1490) {
					method5045(field94, true, var4);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3604 == var1.field1490) {
					Class155.method3334(Class316.field3321);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3594 == var1.field1490) {
					field685 = field721;
					var25 = var4.method9955();
					Class165 var62 = new Class165(var4);
					Class166 var50;
					if (var25 >= 0) {
						var50 = field772[var25];
					} else {
						var50 = field2773;
					}

					if (var50 == null) {
						this.method1355(var25);
						var1.field1490 = null;
						return true;
					}

					if (var62.field1801 > var50.field1810) {
						this.method1355(var25);
						var1.field1490 = null;
						return true;
					}

					if (var62.field1801 < var50.field1810) {
						var1.field1490 = null;
						return true;
					}

					var62.method3417(var50);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3532 == var1.field1490) {
					field1585.field463.method8344(var4, var1.field1485);
					method3335();
					field731 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3621 == var1.field1490) {
					method5045(field94, false, var4);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3560 == var1.field1490) {
					method483();
					var23 = var4.method9832();
					var24 = var4.method9861();
					var7 = var4.method9861();
					field669[var7] = var23;
					field629[var7] = var24;
					field730[var7] = 1;
					field801[var7] = var24;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var23 >= Class380.field4505[var8]) {
							field730[var7] = var8 + 2;
						}
					}

					field713[++field727 - 1 & 31] = var7;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3526 == var1.field1490) {
					var25 = var4.method9864();
					var24 = var4.method9981();
					Class353.field3767[var24] = var25;
					if (Class353.field3769[var24] != var25) {
						Class353.field3769[var24] = var25;
					}

					Class82.method2313(var24);
					field722[++field723 - 1 & 31] = var24;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3636 == var1.field1490) {
					field1139 = var4.method9835();
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3607 == var1.field1490) {
					++field542;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3577 == var1.field1490) {
					var36 = var4.method9981();
					var48 = var4.method9868();
					var7 = var4.method10054();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var8 = var23 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var24;
					var11 = var4.method9861();
					if (var8 >= 0 && var9 >= 0 && var8 < field94.field1030 && var9 < field94.field1018) {
						var8 = Class371.method7108(var8);
						var9 = Class371.method7108(var9);
						Class54 var66 = new Class54(var36, field94.field1016, var8, var9, method3531(field94, var8, var9, field94.field1016) - var11, var48, field541);
						field94.field1035.method7506(var66);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3559 == var1.field1490) {
					field1585.method1211(var4, var1.field1485);
					field731 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3585 == var1.field1490) {
					var42 = var4.method9859() == 1;
					var24 = var4.method9832();
					var27 = field4644.method6417(var24);
					Class362.method6603(var27, field170.field1001, var42);
					Class490.method8827(var27);
					var1.field1490 = null;
					return true;
				}

				boolean var47;
				String var67;
				if (ServerPacket.field3589 == var1.field1490) {
					var25 = var4.method9955();
					var43 = (long)var4.method9997();
					var34 = (long)var4.method9830();
					var46 = var34 + (var43 << 32);
					var47 = false;
					Class166 var63 = var25 >= 0 ? field772[var25] : field2773;
					if (var63 == null) {
						var47 = true;
					} else {
						for (var64 = 0; var64 < 100; ++var64) {
							if (field763[var64] == var46) {
								var47 = true;
								break;
							}
						}
					}

					if (!var47) {
						field763[field764] = var46;
						field764 = (1 + field764) % 100;
						var67 = Class381.method3835(var4);
						var72 = var25 >= 0 ? 43 : 46;
						Class387.method7265(var72, "", var67, var63.field1813);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3548 == var1.field1490) {
					field792 = true;
					field593 = false;
					field579 = true;
					var23 = method4984(var4.method9829() & 2027);
					var24 = method3198(var4.method9829() & 2027);
					var7 = var4.method9997();
					var8 = var4.method9902();
					field795 = new Class514(field4606, var24, var7, var8);
					field794 = new Class514(field3333, var23, var7, var8);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3568 == var1.field1490) {
					Class320.method6279(false, var1.field1487);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3523 == var1.field1490) {
					Class155.method3334(Class316.field3317);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3571 == var1.field1490) {
					if (field1315 == null) {
						field1315 = new Class473(field3998);
					}

					Class566 var56 = field3998.method8816(var4);
					field1315.field4961.method9391(var56.field5491, var56.field5492);
					field597[++field745 - 1 & 31] = var56.field5491;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3572 == var1.field1490) {
					var23 = var4.method9902();
					method3998(var23);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3556 == var1.field1490) {
					field780 = var4.method9902();
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3611 == var1.field1490) {
					var23 = var4.method9869();
					if (var23 == 65535) {
						var23 = -1;
					}

					method3722(var23);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3508 == var1.field1490) {
					var23 = var4.method9981();
					if (var23 == 65535) {
						var23 = -1;
					}

					var24 = var4.method9977();
					Class88.method2389(var23, var24);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3579 == var1.field1490) {
					method2942(var4.method9837());
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3511 == var1.field1490) {
					var23 = var4.method9869();
					Class89.method3882(var23);
					field724[++field646 - 1 & 31] = var23 & 32767;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3534 == var1.field1490) {
					var42 = var4.method9835();
					if (var42) {
						if (field4980 == null) {
							field4980 = new Class392();
						}
					} else {
						field4980 = null;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3609 == var1.field1490) {
					var23 = var4.method9832();
					var24 = var4.method9832();
					var7 = Class45.method4006();
					Class314 var39 = Class168.method3523(ClientPacket.field3435, field678.field1482);
					var39.field3270.method10025(var7);
					var39.field3270.method9878(var23);
					var39.field3270.method9812(var24);
					var39.field3270.method9856(Class45.field252);
					field678.method3013(var39);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3507 == var1.field1490) {
					var23 = var4.method9997();
					var24 = var4.method9902();
					var7 = var4.method9997();
					method469(var23, var24, var7);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3515 == var1.field1490) {
					var7 = var4.method9997();
					var8 = var4.method9869();
					var24 = var4.method9997();
					var23 = var4.method9997();
					Class323.method3040(var23, var24, var7, var8);
					var1.field1490 = null;
					return true;
				}

				boolean var13;
				if (ServerPacket.field3521 == var1.field1490) {
					var37 = var4.method9837();
					var43 = (long)var4.method9997();
					var34 = (long)var4.method9830();
					Class365 var44 = (Class365)Class406.method4071(Class365.method3148(), var4.method9902());
					long var45 = var34 + (var43 << 32);
					var13 = false;

					for (var64 = 0; var64 < 100; ++var64) {
						if (field763[var64] == var45) {
							var13 = true;
							break;
						}
					}

					if (field1585.method1232(new Class561(var37, field1066))) {
						var13 = true;
					}

					if (!var13 && field651 == 0) {
						field763[field764] = var45;
						field764 = (1 + field764) % 100;
						var67 = Class442.method8142(Class413.method2000(Class381.method3835(var4)));
						byte var65;
						if (var44.field4014) {
							var65 = 7;
						} else {
							var65 = 3;
						}

						if (-1 != var44.field4006) {
							Class115.method3716(var65, Class111.method7220(var44.field4006) + var37, var67);
						} else {
							Class115.method3716(var65, var37, var67);
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3606 == var1.field1490) {
					var23 = var4.method9832();
					var24 = var4.method9981();
					if (var24 == 65535) {
						var24 = -1;
					}

					var7 = var4.method9832();
					var31 = field4644.method6417(var7);
					Class187 var40;
					if (!var31.field3896) {
						if (var24 == -1) {
							var31.field3891 = 0;
							var1.field1490 = null;
							return true;
						}

						var40 = Class187.method3421(var24).method3787(var23);
						var31.field3891 = 4;
						var31.field3858 = var24;
						var31.field3865 = var40.field2031;
						var31.field3866 = var40.field2042;
						var31.field3868 = var40.field2019 * 100 / var23;
						Class490.method8827(var31);
					} else {
						var31.field3946 = var24;
						var31.field3919 = var23;
						var40 = Class187.method3421(var24).method3787(var23);
						var31.field3865 = var40.field2031;
						var31.field3866 = var40.field2042;
						var31.field3867 = var40.field2022;
						var31.field3863 = var40.field2023;
						var31.field3864 = var40.field2024;
						var31.field3868 = var40.field2019;
						if (1 == var40.field2025) {
							var31.field3874 = 1;
						} else {
							var31.field3874 = 2;
						}

						if (var31.field3869 > 0) {
							var31.field3868 = var31.field3868 * 32 / var31.field3869;
						} else if (var31.field3928 > 0) {
							var31.field3868 = var31.field3868 * 32 / var31.field3928;
						}

						Class490.method8827(var31);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3596 == var1.field1490) {
					return this.method1346(var1);
				}

				if (ServerPacket.field3562 == var1.field1490) {
					var23 = var4.method9832();
					var35 = field4644.method6417(var23);
					var35.field3891 = 3;
					var35.field3858 = field170.field1001.method6437();
					Class490.method8827(var35);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3628 == var1.field1490) {
					var23 = var4.method9902();
					var24 = var4.method9997();
					this.method643(false);
					if (var23 == 0) {
						field4407 = field5093.field1024[var24];
					} else if (var23 == 1) {
						field4407 = field5093.field1013[var24];
					} else if (var23 == 2) {
						field4407 = field5093.field1029[var24];
						this.method643(true);
					}

					if (field4407 == null) {
						field4407 = field170;
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3584 == var1.field1490) {
					Class75 var28 = new Class75();
					var28.field905 = var4.method9837();
					var28.field902 = var4.method9997();
					var24 = var4.method9832();
					var28.field912 = var24;
					if (var28.method2188()) {
						var28.field903 = "beta";
						field77 = true;
					} else {
						field77 = false;
					}

					Class131.method3063(45);
					var3.method8644();
					var3 = null;
					Class99.method2639(var28);
					var1.field1490 = null;
					return false;
				}

				if (ServerPacket.field3536 == var1.field1490) {
					var23 = var4.method9855();
					var24 = var4.method9855();
					Class100 var32 = (Class100)field698.method9439((long)var24);
					var30 = (Class100)field698.method9439((long)var23);
					if (var30 != null) {
						method7260(var30, var32 == null || var30.field1225 != var32.field1225);
					}

					if (var32 != null) {
						var32.method9267();
						field698.method9445(var32, (long)var23);
					}

					var38 = field4644.method6417(var24);
					if (var38 != null) {
						Class490.method8827(var38);
					}

					var38 = field4644.method6417(var23);
					if (var38 != null) {
						Class490.method8827(var38);
						method4491(field4644.field3698[var38.field3812 >>> 16], var38, true);
					}

					if (field592 != -1) {
						method2865(field592, 1);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3545 == var1.field1490) {
					field792 = true;
					field593 = false;
					field790 = true;
					field2681 = var4.method9902();
					field1988 = var4.method9902();
					var23 = var4.method9997();
					var24 = Class371.method7108(var4.method9902());
					var7 = Class371.method7108(var4.method9902());
					var8 = var4.method9997();
					field830 = var4.method9835();
					var9 = var4.method9902();
					var36 = Class371.method7108(field2681);
					var11 = Class371.method7108(field1988);
					var47 = false;
					var13 = false;
					if (field830) {
						var48 = field3664;
						var53 = method3531(field5093, var36, var11, field5093.field1016) - var23;
					} else {
						var48 = method3531(field5093, field144, field850, field5093.field1016) - field3664;
						var53 = var23;
					}

					field793 = new Class506(field144, field850, var48, var36, var11, var53, var24, var7, var8, var9);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3529 == var1.field1490) {
					field146 = var4.method9902();
					field4 = var4.method9902();
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3616 == var1.field1490) {
					if (field592 != -1) {
						method2865(field592, 0);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3630 == var1.field1490) {
					Class155.method3334(Class316.field3314);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3629 == var1.field1490) {
					field94.field1027 = 0;
					field94.field1020 = 0;

					for (var23 = 0; var23 < 65536; ++var23) {
						field94.field1013[var23] = null;
					}

					for (var23 = 0; var23 < 2048; ++var23) {
						field94.field1029[var23] = null;
					}

					field170.field1002 = field5093;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3541 == var1.field1490) {
					var25 = var4.method9955();
					var6 = var4.method9837();
					long var29 = (long)var4.method9997();
					long var33 = (long)var4.method9830();
					Class365 var41 = (Class365)Class406.method4071(Class365.method3148(), var4.method9902());
					long var12 = var33 + (var29 << 32);
					boolean var14 = false;
					Class166 var15 = null;
					var15 = var25 >= 0 ? field772[var25] : field2773;
					if (var15 == null) {
						var14 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var41.field4015 && field1585.method1232(new Class561(var6, field1066))) {
									var14 = true;
								}
								break;
							}

							if (field763[var16] == var12) {
								var14 = true;
								break;
							}

							++var16;
						}
					}

					if (!var14) {
						field763[field764] = var12;
						field764 = (1 + field764) % 100;
						var68 = Class442.method8142(Class381.method3835(var4));
						var17 = var25 >= 0 ? 41 : 44;
						if (-1 != var41.field4006) {
							Class387.method7265(var17, Class111.method7220(var41.field4006) + var6, var68, var15.field1813);
						} else {
							Class387.method7265(var17, var6, var68, var15.field1813);
						}
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3527 == var1.field1490) {
					var23 = var4.method9832();
					var24 = var4.method9997();
					if (var23 < -70000) {
						var24 += 32768;
					}

					if (var23 >= 0) {
						var27 = field4644.method6417(var23);
					} else {
						var27 = null;
					}

					if (var27 != null) {
						for (var8 = 0; var8 < var27.field3944.length; ++var8) {
							var27.field3944[var8] = 0;
							var27.field3945[var8] = 0;
						}
					}

					Class525.method9309(var24);
					var8 = var4.method9997();

					for (var9 = 0; var9 < var8; ++var9) {
						var36 = var4.method9860();
						if (var36 == 255) {
							var36 = var4.method9883();
						}

						var11 = var4.method9997();
						if (var27 != null && var9 < var27.field3944.length) {
							var27.field3944[var9] = var11;
							var27.field3945[var9] = var36;
						}

						Class89.method4234(var24, var9, var11 - 1, var36);
					}

					if (var27 != null) {
						Class490.method8827(var27);
					}

					method483();
					field724[++field646 - 1 & 31] = var24 & 32767;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3612 == var1.field1490) {
					var23 = var4.method9883();
					var26 = var4.method9902() == 1;
					var27 = field4644.method6417(var23);
					if (var27.field3833 != var26) {
						var27.field3833 = var26;
						Class490.method8827(var27);
					}

					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3530 == var1.field1490) {
					var23 = var4.method9868();
					var8 = var4.method9997();
					var24 = var4.method9868();
					var7 = var4.method9981();
					var9 = var4.method9981();
					if (var23 == 65535) {
						var23 = -1;
					}

					ArrayList var10 = new ArrayList();
					var10.add(var23);
					method8897(var10, var24, var7, var8, var9);
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3569 == var1.field1490) {
					method483();
					field704 = var4.method9829();
					field737 = field721;
					var1.field1490 = null;
					return true;
				}

				if (ServerPacket.field3620 == var1.field1490) {
					Class155.method3334(Class316.field3318);
					var1.field1490 = null;
					return true;
				}

				Class552.method8390("" + (var1.field1490 != null ? var1.field1490.opcode : -1) + Class111.field1396 + (var1.field1486 != null ? var1.field1486.opcode : -1) + Class111.field1396 + (var1.field1491 != null ? var1.field1491.opcode : -1) + Class111.field1396 + var1.field1485, (Throwable)null);
				method3118();
			} catch (IOException var21) {
				method3313();
			} catch (Exception var22) {
				var6 = "" + (var1.field1490 != null ? var1.field1490.opcode : -1) + Class111.field1396 + (var1.field1486 != null ? var1.field1486.opcode : -1) + Class111.field1396 + (var1.field1491 != null ? var1.field1491.opcode : -1) + Class111.field1396 + var1.field1485 + Class111.field1396 + (field170.field1242[0] + field5093.field1019) + Class111.field1396 + (field170.field1284[0] + field5093.field1021) + Class111.field1396;

				for (var7 = 0; var7 < var1.field1485 && var7 < 50; ++var7) {
					var6 = var6 + var4.field5472[var7] + Class111.field1396;
				}

				Class552.method8390(var6, var22);
				method3118();
			}

			return true;
		}
	}

	@ObfInfo(name = "lu", desc = "(I)V", opaque = "1168129225")
	public final void method1348() {
		boolean var2 = false;

		int var3;
		int var6;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < field602 - 1; ++var3) {
				if (field783[var3] < 1000 && field783[var3 + 1] > 1000) {
					String var4 = field681[var3];
					field681[var3] = field681[var3 + 1];
					field681[var3 + 1] = var4;
					String var5 = field680[var3];
					field680[var3] = field680[var3 + 1];
					field680[var3 + 1] = var5;
					var6 = field783[var3];
					field783[var3] = field783[var3 + 1];
					field783[var3 + 1] = var6;
					var6 = field674[var3];
					field674[var3] = field674[var3 + 1];
					field674[var3 + 1] = var6;
					var6 = field832[var3];
					field832[var3] = field832[var3 + 1];
					field832[var3 + 1] = var6;
					var6 = field677[var3];
					field677[var3] = field677[var3 + 1];
					field677[var3 + 1] = var6;
					var6 = field789[var3];
					field789[var3] = field789[var3 + 1];
					field789[var3 + 1] = var6;
					var6 = field679[var3];
					field679[var3] = field679[var3 + 1];
					field679[var3 + 1] = var6;
					boolean var7 = field554[var3];
					field554[var3] = field554[var3 + 1];
					field554[var3 + 1] = var7;
					var2 = false;
				}
			}
		}

		if (field761 == null) {
			int var17 = Class42.field227;
			int var8;
			int var9;
			int var10;
			int var19;
			int var20;
			if (field672) {
				int var18;
				if (var17 != 1 && (field911 || var17 != 4)) {
					var3 = Class42.field231;
					var18 = Class42.field221;
					if (var3 < field1473 - 10 || var3 > field3474 + field1473 + 10 || var18 < field1453 - 10 || var18 > 10 + field2727 + field1453) {
						field672 = false;
						method3076(field1473, field1453, field3474, field2727);
					}
				}

				if (var17 == 1 || !field911 && var17 == 4) {
					var3 = field1473;
					var18 = field1453;
					var19 = field3474;
					var6 = Class42.field230;
					var20 = Class42.field222;
					var8 = -1;

					for (var9 = 0; var9 < field602; ++var9) {
						var10 = (field602 - 1 - var9) * 15 + var18 + 31;
						if (var6 > var3 && var6 < var19 + var3 && var20 > var10 - 13 && var20 < var10 + 3) {
							var8 = var9;
						}
					}

					if (var8 != -1 && var8 >= 0) {
						var9 = field674[var8];
						var10 = field832[var8];
						int var11 = field783[var8];
						int var12 = field677[var8];
						int var13 = field679[var8];
						int var14 = field789[var8];
						String var15 = field680[var8];
						String var16 = field681[var8];
						method1274(var9, var10, var11, var12, var14, var13, var15, var16, Class42.field230, Class42.field222);
					}

					field672 = false;
					method3076(field1473, field1453, field3474, field2727);
				}
			} else {
				var3 = field602 - 1;
				if ((var17 == 1 || !field911 && var17 == 4) && this.method1449()) {
					var17 = 2;
				}

				if ((var17 == 1 || !field911 && var17 == 4) && field602 > 0 && var3 >= 0) {
					var19 = field674[var3];
					var6 = field832[var3];
					var20 = field783[var3];
					var8 = field677[var3];
					var9 = field679[var3];
					var10 = field789[var3];
					String var21 = field680[var3];
					String var22 = field681[var3];
					method1274(var19, var6, var20, var8, var10, var9, var21, var22, Class42.field230, Class42.field222);
				}

				if (var17 == 2 && field602 > 0) {
					this.method1350(Class42.field230, Class42.field222);
				}
			}

		}
	}

	@ObfInfo(name = "lp", desc = "(I)Z", opaque = "165069595")
	public final boolean method1449() {
		int var2 = field602 - 1;
		return (field806 && field602 > 2 || method6318(var2)) && !field554[var2];
	}

	@ObfInfo(name = "ll", desc = "(IIB)V", opaque = "0")
	public final void method1350(int var1, int var2) {
		ClientPacket.method6285(var1, var2);
		var1 -= field810;
		var2 -= field811;
		field5093.field1014.method5307(field5093.field1016, var1, var2, false);

		for (int var4 = 0; var4 < field5093.field1020; ++var4) {
			Class483 var5 = field5093.field1029[field5093.field1031[var4]];
			if (var5 != null) {
				var5.field5001.field1014.method5307(var5.field5001.field1016, var1, var2, false);
			}
		}

		field672 = true;
	}

	@ObfInfo(name = "my", desc = "(ZB)V")
	public final void method1487(boolean var1) {
		method3432(field592, field954, field15, var1);
	}

	@ObfInfo(name = "ml", desc = "(Lnx;I)V")
	public void method1352(Class362 var1) {
		Class362 var3 = var1.field3832 == -1 ? null : field4644.method6417(var1.field3832);
		int var4;
		int var5;
		if (var3 == null) {
			var4 = field954;
			var5 = field15;
		} else {
			var4 = var3.field3828;
			var5 = var3.field3829;
		}

		method4714(var1, var4, var5, false);
		Class93.method2450(var1, var4, var5);
	}

	@ObfInfo(name = "nj", desc = "(I)V", opaque = "-705159912")
	public final void method1353() {
		Class490.method8827(field761);
		++field5084;
		int var2;
		int var3;
		if (field717 && field714) {
			var2 = Class42.field231;
			var3 = Class42.field221;
			var2 -= field653;
			var3 -= field725;
			if (var2 < field715) {
				var2 = field715;
			}

			if (var2 + field761.field3828 > field715 + field710.field3828) {
				var2 = field715 + field710.field3828 - field761.field3828;
			}

			if (var3 < field531) {
				var3 = field531;
			}

			if (field761.field3829 + var3 > field710.field3829 + field531) {
				var3 = field531 + field710.field3829 - field761.field3829;
			}

			int var4 = var2 - field718;
			int var5 = var3 - field689;
			int var6 = field761.field3870;
			if (field5084 > field761.field3873 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
				field720 = true;
			}

			int var7 = field710.field3958 + (var2 - field715);
			int var8 = var3 - field531 + field710.field3835;
			Class99 var9;
			if (field761.field3890 != null && field720) {
				var9 = new Class99();
				var9.field1215 = field761;
				var9.field1212 = var7;
				var9.field1214 = var8;
				var9.field1217 = field761.field3890;
				Class70.method2344(var9);
			}

			if (0 == Class42.field219) {
				if (field720) {
					if (field761.field3910 != null) {
						var9 = new Class99();
						var9.field1215 = field761;
						var9.field1212 = var7;
						var9.field1214 = var8;
						var9.field1216 = field716;
						var9.field1217 = field761.field3910;
						Class70.method2344(var9);
					}

					if (field716 != null && Class55.method1148(field761) != null) {
						Class314 var11 = Class168.method3523(ClientPacket.field3436, field678.field1482);
						var11.field3270.method10010(field716.field3851);
						var11.field3270.method9807(field761.field3812);
						var11.field3270.method10036(field761.field3851);
						var11.field3270.method9866(field716.field3946);
						var11.field3270.method9812(field716.field3812);
						var11.field3270.method10010(field761.field3946);
						field678.method3013(var11);
					}
				} else if (this.method1449()) {
					this.method1350(field718 + field653, field689 + field725);
				} else if (field602 > 0) {
					int var12 = field718 + field653;
					int var10 = field689 + field725;
					method4691(field2115, var12, var10);
					field2115 = null;
				}

				field761 = null;
			}

		} else {
			if (field5084 > 1) {
				if (!field720 && field602 > 0) {
					var2 = field653 + field718;
					var3 = field725 + field689;
					method4691(field2115, var2, var3);
					field2115 = null;
				}

				field761 = null;
			}

		}
	}

	@ObfInfo(name = "pn", desc = "(I)Lvo;", opaque = "41907730")
	public Class561 method1354() {
		return field170 != null ? field170.field991 : null;
	}

	@ObfInfo(name = "pr", desc = "(II)V")
	public void method1355(int var1) {
		Class314 var3 = Class168.method3523(ClientPacket.field3355, field678.field1482);
		var3.field3270.method9809(var1);
		field678.method3013(var3);
	}

	@ObfInfo(name = "pg", desc = "(IS)V")
	public void method1472(int var1) {
		Class314 var3 = Class168.method3523(ClientPacket.field3405, field678.field1482);
		var3.field3270.method9809(var1);
		field678.method3013(var3);
	}

	@ObfInfo(owner = "rk", name = "gd", desc = "(B)Ltr;")
	public static Class512 method8337() {
		return field157;
	}

	@ObfInfo(owner = "al", name = "gv", desc = "(I)Ltw;")
	public static Class517 method150() {
		return field3069;
	}

	@ObfInfo(owner = "fg", name = "hz", desc = "(I)Lij;")
	public static Class218 method3132() {
		return field754;
	}

	@ObfInfo(owner = "bx", name = "hj", desc = "(I)V", opaque = "1962817262")
	public static void method887() {
		field765 = true;
		if (field4564 != null && field4564.method2811()) {
			field4564.method2808();
		}

		method3280();
		method3398();
		if (field544 != null) {
			field544.field1089 = false;
		}

		field544 = null;
		field678.method3015();
		if (field249 != null) {
			try {
				field249.method4233();
			} catch (Exception var3) {
			}
		}

		field249 = null;
		method2771();
		method4075();
		field94.method2316();

		for (int var1 = 0; var1 < 4; ++var1) {
			if (field94.field1015[var1] != null) {
				field94.field1015[var1].method4304();
			}
		}

		field3069 = null;
		Class323.method3075(0, 0);
		Class323.method4662();
		field787 = false;
		Class55.method1936();
		if (field1052 != null) {
			field1052.method809();
		}

		field2487.method7079();
		Class385.method7266();
		if (field4823 != null) {
			field4823.method2784();
		}

		Class211.method2369();
		Class211.field2286 = null;
		Class211.field2287 = null;
		field1750 = null;
		Class216.method3599();
		field232 = null;
		field828.clear();
		field600 = 0;
		field2487 = new Class369();
		field4823 = new Class118(field4671.field575, 223);

		try {
			Class211.method4429("oldschool", field4657, field2988.field4437, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		field232 = new Class485(255, Class211.field2286, Class211.field2287, 500000);
		field249 = new Class219();
		field4671.method647();
		method2948(Class104.field1343);
		Class131.method3063(0);
	}

	@ObfInfo(owner = "ie", name = "hw", desc = "(I)V")
	public static void method4075() {
		field894 = null;
		field961 = null;
		field4690 = null;
		field3059 = null;
		field4535 = null;
		field3331 = null;
		field90 = null;
		field1406 = null;
		field4871 = null;
		field1526 = null;
		field2698 = null;
	}

	@ObfInfo(owner = "ed", name = "hb", desc = "(Loz;Ljava/lang/String;I)V")
	public static void method2853(Class390 var0, String var1) {
		Class91 var3 = new Class91(var0, var1);
		field828.add(var3);
		field600 += var3.field1128;
	}

	@ObfInfo(owner = "eo", name = "hv", desc = "(I)Z", opaque = "-1609375983")
	public static boolean method2971() {
		if (field828 != null && field539 < field828.size()) {
			while (field539 < field828.size()) {
				Class91 var1 = (Class91)field828.get(field539);
				if (!var1.method2430()) {
					return false;
				}

				++field539;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfInfo(owner = "ss", name = "hx", desc = "(B)I", opaque = "0")
	public static int method8826() {
		if (field828 != null && field539 < field828.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= field539; ++var2) {
				var1 += ((Class91)field828.get(var2)).field1129;
			}

			return var1 * 10000 / field600;
		} else {
			return 10000;
		}
	}

	@ObfInfo(owner = "hv", name = "hn", desc = "(III)V", opaque = "-1444316638")
	public static void method4004(int var0, int var1) {
		int[] var3 = new int[9];

		for (int var4 = 0; var4 < var3.length; ++var4) {
			int var5 = 15 + var4 * 32 + 128;
			int var6 = var5 * 3 + 600;
			int var8 = Class274.field2804[var5];
			int var10 = var1 - 334;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 100) {
				var10 = 100;
			}

			int var11 = (field805 - field675) * var10 / 100 + field675;
			int var9 = var11 * var6 / 256;
			var3[var4] = var8 * var9 >> 16;
		}

		field5093.field1014.method5302(var3, 500, 800, var0 * 334 / var1, 334);
	}

	@ObfInfo(owner = "no", name = "ht", desc = "(I)V", opaque = "-124417800")
	public static void method6554() {
		if (field561 == Class104.field1343) {
			field4697 = method4449(Class376.field4483.field4485, false, true, true, false);
			field2221 = method4449(Class376.field4486.field4485, true, true, true, false);
			field112 = method4449(Class376.field4467.field4485, false, true, true, false);
			field2983 = method4449(Class376.field4473.field4485, false, true, true, false);
			field1137 = method4449(Class376.field4479.field4485, true, false, true, false);
			field2669 = method4449(Class376.field4476.field4485, false, true, true, false);
			field2777 = method4449(Class376.field4469.field4485, false, true, true, false);
			Class53.method1102(20, Class367.field4138);
			method2948(Class104.field1337);
		} else {
			int var23;
			byte var42;
			if (Class104.field1337 == field561) {
				var42 = 0;
				var23 = var42 + field4697.method7276() * 53 / 100;
				var23 += field2221.method7276() * 5 / 100;
				var23 += field112.method7276() * 36 / 100;
				var23 += field2983.method7276() / 100;
				var23 += field1137.method7276() / 100;
				var23 += field2669.method7276() * 3 / 100;
				var23 += field2777.method7276() / 100;
				if (var23 != 100) {
					if (var23 != 0) {
						Class53.method1102(30, Class367.field4049 + var23 + "%");
					}

				} else {
					method2853(field4697, "Sound FX");
					method2853(field2221, "Music Tracks");
					method2853(field112, "Sprites");
					method2853(field2669, "Music Samples");
					method2853(field2777, "Music Patches");
					Class53.method1102(40, Class367.field4050);
					method2948(Class104.field1339);
				}
			} else {
				int var34;
				if (field561 == Class104.field1339) {
					Class48.method3951(22050, !field687, 2);
					ArrayList var43 = new ArrayList(3);
					Class219 var27 = field249;
					short var32 = 2048;
					if (0 == field293) {
						throw new IllegalStateException();
					} else {
						if (var32 < 256) {
							var32 = 256;
						}

						Class48 var28;
						try {
							Class48 var35 = field479.method278();
							var35.field295 = new int[256 * (field1012 ? 2 : 1)];
							var35.field300 = var32;
							var35.method154();
							var35.field299 = 1024 + (var32 & -1024);
							if (var35.field299 > 16384) {
								var35.field299 = 16384;
							}

							var35.method169(var35.field299);
							if (field4521 > 0 && field291 == null) {
								field291 = new Class40();
								field298 = Executors.newScheduledThreadPool(1);
								field298.scheduleAtFixedRate(field291, 0L, 10L, TimeUnit.MILLISECONDS);
							}

							if (field291 != null) {
								if (field291.field203[0] != null) {
									throw new IllegalArgumentException();
								}

								field291.field203[0] = var35;
							}

							var28 = var35;
						} catch (Throwable var21) {
							var28 = new Class48();
						}

						field1052 = var28;
						field2506 = new Class51();
						Class51 var36 = new Class51();
						var36.method892(field2506);

						for (var34 = 0; var34 < 3; ++var34) {
							Class315 var40 = new Class315(field1052);
							var40.method6099(9, 128);
							var36.method892(var40);
							var43.add(var40);
						}

						field1052.method857(var36);
						Class323.method7257(field2777, field2669, field4697, var43);
						field1751 = new Class73(22050, field293);
						Class53.method1102(60, Class367.field4051);
						method2948(Class104.field1340);
					}
				} else if (Class104.field1340 == field561) {
					if (field288 == null) {
						field288 = new Class499(field112, field1137);
					}

					var23 = Class519.method9262().length;
					field596 = field288.method8882(Class519.method9262());
					if (field596.size() < var23) {
						Class53.method1102(80, Class367.field4052 + field596.size() * 100 / var23 + "%");
					} else {
						field881 = (Class424)field596.get(Class519.field5226);
						field2102 = (Class424)field596.get(Class519.field5227);
						field2002 = (Class424)field596.get(Class519.field5228);
						field157 = field682.method8863();
						Class53.method1102(80, Class367.field4299);
						method2948(Class104.field1346);
					}
				} else {
					Class390 var3;
					int var4;
					int var5;
					Class390 var26;
					if (Class104.field1346 == field561) {
						var26 = field2983;
						var3 = field112;
						var4 = 0;
						String[] var31 = Class53.field375;

						String var38;
						for (var34 = 0; var34 < var31.length; ++var34) {
							var38 = var31[var34];
							if (var26.method7171(var38, "")) {
								++var4;
							}
						}

						var31 = Class53.field360;

						for (var34 = 0; var34 < var31.length; ++var34) {
							var38 = var31[var34];
							if (var3.method7171(var38, "")) {
								++var4;
							}
						}

						var31 = Class53.field362;

						for (var34 = 0; var34 < var31.length; ++var34) {
							var38 = var31[var34];
							if (var3.method7150(var38) != -1 && var3.method7171(var38, "")) {
								++var4;
							}
						}

						var5 = Class53.method4692(field112);
						if (var4 < var5) {
							Class53.method1102(90, Class367.field4256 + var4 * 100 / var5 + "%");
						} else {
							Class53.method1102(100, Class367.field4055);
							if (field77) {
								Class131.method3063(5);
								method2948(Class104.field1350);
							} else {
								method2948(Class104.field1334);
							}

						}
					} else if (Class104.field1350 == field561) {
						Class131.method3063(10);
					} else if (Class104.field1334 == field561) {
						field949 = method4449(Class376.field4463.field4485, false, true, true, false);
						field5070 = method4449(Class376.field4464.field4485, false, true, true, false);
						field857 = method4449(Class376.field4465.field4485, true, false, true, false);
						field1117 = method4449(Class376.field4466.field4485, false, true, true, false);
						field1869 = method4449(Class376.field4478.field4485, true, true, true, false);
						field2664 = method4449(Class376.field4470.field4485, false, true, true, false);
						field2122 = method4449(Class376.field4472.field4485, false, true, true, false);
						field4372 = method4449(Class376.field4474.field4485, false, true, true, false);
						field5007 = method4449(Class376.field4475.field4485, false, true, true, false);
						field1890 = method4449(Class376.field4471.field4485, true, true, true, false);
						field1666 = method4449(Class376.field4477.field4485, false, true, true, false);
						field1558 = method4449(Class376.field4481.field4485, false, true, true, false);
						field3730 = method4449(Class376.field4482.field4485, false, true, true, false);
						field2574 = method4449(Class376.field4462.field4485, false, true, true, false);
						field410 = Class225.method4344(Class376.field4484.field4485, false, true, true, true, true);
						Class53.method1102(20, Class367.field4138);
						method2948(Class104.field1341);
					} else if (Class104.field1341 == field561) {
						var42 = 0;
						var23 = var42 + field949.method7276() * 5 / 100;
						var23 += field5070.method7276() * 2 / 100;
						var23 += field857.method7276() / 100;
						var23 += field1117.method7276() / 100;
						var23 += field1869.method7276() * 10 / 100;
						var23 += field2664.method7276() * 65 / 100;
						var23 += field2122.method7276() / 100;
						var23 += field4372.method7276() / 100;
						var23 += field5007.method7276() * 6 / 100;
						var23 += field1558.method7276() / 100;
						var23 += field1666.method7276() * 2 / 100;
						var23 += field3730.method7276() * 2 / 100;
						var23 += field2574.method7276() / 100;
						var23 += field410.method7276() / 100;
						var23 += field1890.method7275() && field1890.method7154() ? 1 : 0;
						if (var23 != 100) {
							if (var23 != 0) {
								Class53.method1102(30, Class367.field4049 + var23 + "%");
							}

						} else {
							method2853(field949, "Animations");
							method2853(field5070, "Skeletons");
							method2853(field1869, "Maps");
							method2853(field2664, "Models");
							method2853(field4372, "Music Jingles");
							method2853(field1558, "World Map");
							method2853(field1666, "World Map Geography");
							method2853(field3730, "World Map Ground");
							field2675 = new Class493();
							field2675.method8831(field1890);
							Class53.method1102(30, Class367.field4050);
							method2948(Class104.field1345);
						}
					} else if (Class104.field1345 == field561) {
						field5093 = new Class83(-1, 104, 104, field1474.method2459());
						field94 = field5093;
						field2209 = new Class553(512, 512);
						Class53.method1102(30, Class367.field4047);
						method2948(Class104.field1342);
					} else if (field561 == Class104.field1342) {
						if (!field857.method7154()) {
							Class53.method1102(40, Class367.field4308 + field857.method7286() + "%");
						} else if (!field2574.method7154()) {
							Class53.method1102(40, Class367.field4308 + (80 + field5007.method7286() / 6) + "%");
						} else {
							Class390 var41 = field857;
							field2318 = var41;
							Class191.method3571(field857);
							var26 = field857;
							var3 = field2664;
							field2190 = var26;
							field2189 = var3;
							field3659 = field2190.method7144(3);
							Class390 var29 = field857;
							Class390 var30 = field2664;
							boolean var33 = field687;
							field2125 = var29;
							field2139 = var30;
							Class197.field2157 = var33;
							Class390 var37 = field857;
							Class390 var39 = field2664;
							field4682 = var37;
							field1938 = var39;
							Class390 var9 = field857;
							field2111 = var9;
							Class109.method2859(field857, field2664, field528, field881);
							Class217.method2431(field857, field949, field5070);
							Class188.method7377(field857, field2664);
							Class390 var10 = field857;
							field1990 = var10;
							Class390 var11 = field857;
							field1887 = var11;
							field1883 = field1887.method7144(16);
							field4644 = new Class341(field1117, field2664, field112, field1137, field410);
							Class180.method3340(field857);
							Class390 var12 = field857;
							field2234 = var12;
							Class390 var13 = field857;
							field3658 = var13;
							Class203.method2230(field857);
							Class186.method865(field857);
							Class533.method2458(field857);
							Class390 var14 = field857;
							field5309 = var14;
							field1895 = new Class538(field1425, 54, field1376, field857);
							field3998 = new Class538(field1425, 47, field1376, field857);
							field4564 = new Class106();
							Class183.method7264(field857, field112, field1137);
							Class390 var15 = field857;
							Class390 var16 = field112;
							field2248 = var15;
							field2249 = var16;
							Class390 var17 = field857;
							Class390 var18 = field112;
							field1790 = var18;
							if (var17.method7154()) {
								field1772 = var17.method7144(35);
								field1771 = new Class163[field1772];

								for (int var19 = 0; var19 < field1772; ++var19) {
									byte[] var20 = var17.method7132(35, var19);
									field1771[var19] = new Class163(var19);
									if (var20 != null) {
										field1771[var19].method3393(new Class562(var20));
										field1771[var19].method3387();
									}
								}
							}

							Class53.method1102(50, Class367.field4199);
							method2948(Class104.field1335);
						}
					} else if (Class104.field1335 == field561) {
						var23 = 0;
						if (field894 == null) {
							field894 = Class554.method7253(field112, field2675.field5036, 0);
						} else {
							++var23;
						}

						if (field961 == null) {
							field961 = Class554.method7253(field112, field2675.field5028, 0);
						} else {
							++var23;
						}

						Class568[] var2;
						Class568[] var6;
						int var7;
						Class568 var8;
						if (field4690 == null) {
							var3 = field112;
							var4 = field2675.field5029;
							if (!Class554.method3253(var3, var4, 0)) {
								var2 = null;
							} else {
								var6 = new Class568[field5437];

								for (var7 = 0; var7 < field5437; ++var7) {
									var8 = var6[var7] = new Class568();
									var8.field5499 = field5433;
									var8.field5498 = field5438;
									var8.field5494 = field1454[var7];
									var8.field5493 = field1561[var7];
									var8.field5495 = field5435[var7];
									var8.field5496 = field3491[var7];
									var8.field5500 = field5432;
									var8.field5497 = field5434[var7];
								}

								Class554.method6571();
								var2 = var6;
							}

							field4690 = var2;
						} else {
							++var23;
						}

						if (field3059 == null) {
							field3059 = Class554.method8633(field112, field2675.field5030, 0);
						} else {
							++var23;
						}

						if (field4535 == null) {
							field4535 = Class554.method8633(field112, field2675.field5027, 0);
						} else {
							++var23;
						}

						if (field3331 == null) {
							field3331 = Class554.method8633(field112, field2675.field5032, 0);
						} else {
							++var23;
						}

						if (field90 == null) {
							field90 = Class554.method8633(field112, field2675.field5033, 0);
						} else {
							++var23;
						}

						if (field1406 == null) {
							field1406 = Class554.method8633(field112, field2675.field5034, 0);
						} else {
							++var23;
						}

						if (field4871 == null) {
							field4871 = Class554.method8633(field112, field2675.field5031, 0);
						} else {
							++var23;
						}

						if (field1526 == null) {
							var3 = field112;
							var4 = field2675.field5035;
							if (!Class554.method3253(var3, var4, 0)) {
								var2 = null;
							} else {
								var6 = new Class568[field5437];

								for (var7 = 0; var7 < field5437; ++var7) {
									var8 = var6[var7] = new Class568();
									var8.field5499 = field5433;
									var8.field5498 = field5438;
									var8.field5494 = field1454[var7];
									var8.field5493 = field1561[var7];
									var8.field5495 = field5435[var7];
									var8.field5496 = field3491[var7];
									var8.field5500 = field5432;
									var8.field5497 = field5434[var7];
								}

								Class554.method6571();
								var2 = var6;
							}

							field1526 = var2;
						} else {
							++var23;
						}

						if (field2698 == null) {
							field2698 = Class323.method6308(field112, field2675.field5037, 0);
						} else {
							++var23;
						}

						if (var23 < 11) {
							Class53.method1102(70, Class367.field4058 + var23 * 100 / 12 + "%");
						} else {
							field4791 = field2698;
							field961.method9598();
							int var25 = (int)(Math.random() * 21.0D) - 10;
							int var24 = (int)(Math.random() * 21.0D) - 10;
							var4 = (int)(Math.random() * 21.0D) - 10;
							var5 = (int)(Math.random() * 41.0D) - 20;
							field4690[0].method10112(var5 + var25, var5 + var24, var5 + var4);
							Class53.method1102(60, Class367.field4059);
							method2948(Class104.field1344);
						}
					} else if (Class104.field1344 == field561) {
						if (!field2122.method7154()) {
							Class53.method1102(70, Class367.field4060 + "0%");
						} else {
							field1475 = new Class295(field2122, field112, 20, field1474.method2468(), field687 ? 64 : 128);
							Class274.method5178(field1475);
							Class274.method5117(field1474.method2468());
							method2948(Class104.field1336);
						}
					} else if (field561 == Class104.field1336) {
						var23 = field1475.method5753();
						if (var23 < 100) {
							Class53.method1102(80, Class367.field4060 + var23 + "%");
						} else {
							Class53.method1102(90, Class367.field4227);
							method2948(Class104.field1338);
						}
					} else if (Class104.field1338 == field561) {
						field544 = new Class87();
						field249.method4229(field544, 10);
						Class53.method1102(92, Class367.field4271);
						method2948(Class104.field1347);
					} else if (Class104.field1347 == field561) {
						if (!field2983.method7171("huffman", "")) {
							Class53.method1102(94, Class367.field4063 + 0 + "%");
						} else {
							Class378 var22 = new Class378(field2983.method7153("huffman", ""));
							field4507 = var22;
							Class53.method1102(94, Class367.field4064);
							method2948(Class104.field1348);
						}
					} else if (Class104.field1348 == field561) {
						if (!field1117.method7154()) {
							Class53.method1102(96, Class367.field4326 + field1117.method7286() * 4 / 5 + "%");
						} else if (!field410.method7154()) {
							Class53.method1102(96, Class367.field4326 + field410.method7286() * 4 / 5 + "%");
						} else if (!field5007.method7154()) {
							Class53.method1102(96, Class367.field4326 + (80 + field5007.method7286() / 6) + "%");
						} else if (!field1137.method7154()) {
							Class53.method1102(96, Class367.field4326 + (96 + field1137.method7286() / 50) + "%");
						} else {
							Class53.method1102(98, Class367.field4066);
							if (field5007.method7137("version.dat", "")) {
								Class562 var1 = new Class562(field5007.method7153("version.dat", ""));
								var1.method9997();
							}

							method2948(Class104.field1349);
						}
					} else if (field561 == Class104.field1349) {
						if (field1558.method7156() > 0 && !field1558.method7155(Class266.field2736.field2733)) {
							Class53.method1102(100, Class367.field4213 + field1558.method7213(Class266.field2736.field2733) / 10 + "%");
						} else {
							if (field3069 == null) {
								field3069 = new Class517();
								field3069.method9099(field1558, field1666, field3730, field2002, field596, field4690);
							}

							Class53.method1102(100, Class367.field4068);
							if (field77) {
								method2948(Class104.field1351);
							} else {
								method2948(Class104.field1350);
							}

							field765 = false;
						}
					} else {
						if (Class104.field1351 == field561) {
							field2103 = false;
							Class131.method3063(20);
							method439(Class77.field945);
						}

					}
				}
			}
		}
	}

	@ObfInfo(owner = "jm", name = "hf", desc = "(B)V")
	public static void method4830() {
		if (field5093 != null) {
			field5093.field1014.method5289(field1474.method2459());
		}

	}

	@ObfInfo(owner = "em", name = "hi", desc = "(Ldz;B)V")
	public static void method2948(Class104 var0) {
		if (field561 != var0) {
			field561 = var0;
		}
	}

	@ObfInfo(owner = "iy", name = "hu", desc = "(IZZZZI)Loz;", opaque = "-12218183")
	public static Class390 method4449(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		Class485 var6 = null;
		if (Class211.field2286 != null) {
			var6 = new Class485(var0, Class211.field2286, field1750[var0], 1000000);
		}

		return new Class390(var6, field232, field2487, var0, var1, var2, var3, var4, false);
	}

	@ObfInfo(owner = "lm", name = "hd", desc = "(Lmb;I)V")
	public static void method5809(Class314 var0) {
		var0.field3270.method9878(field2664.field4449);
		var0.field3270.method9878(field4372.field4449);
		var0.field3270.method9807(field2122.field4449);
		var0.field3270.method9812(field857.field4449);
		var0.field3270.method9880(field1558.field4449);
		var0.field3270.method9878(field1890.field4449);
		var0.field3270.method9807(field3730.field4449);
		var0.field3270.method9807(field1869.field4449);
		var0.field3270.method9807(field5007.field4449);
		var0.field3270.method9812(0);
		var0.field3270.method9880(field1666.field4449);
		var0.field3270.method9812(field5070.field4449);
		var0.field3270.method9880(field1117.field4449);
		var0.field3270.method9807(field949.field4449);
	}

	@ObfInfo(owner = "gg", name = "hk", desc = "(I)V", opaque = "49151")
	public static void method3398() {
		field543 = -1L;
		if (field544 != null) {
			field544.field1091 = 0;
		}

		field5071 = true;
		field548 = true;
		field770 = -1L;
		Class50.field318 = new Class399();
		field678.method3021();
		field678.field1487.field5471 = 0;
		field678.field1490 = null;
		field678.field1489 = null;
		field678.field1486 = null;
		field678.field1491 = null;
		field678.field1485 = 0;
		field678.field1484 = 0;
		field549 = 0;
		field649 = 0;
		field550 = 0;
		field602 = 0;
		field672 = false;
		Class42.field214 = 0;
		Class115.method2362();
		field614 = 0;
		field692 = false;
		field782 = 0;
		field615 = 0;
		field620 = 0;
		field4980 = null;
		field780 = 0;
		field658 = -1;
		field778 = 0;
		field779 = 0;
		field818 = Class113.field1420;
		field791 = Class113.field1420;
		field5093.method2316();
		field1585.method1262();
		if (field1883 > 5000) {
		}

		int var1;
		if (field765) {
			Arrays.fill(Class353.field3767, 0);
			Arrays.fill(Class353.field3769, 0);
		} else {
			for (var1 = 0; var1 < field1883; ++var1) {
				Class176 var2 = Class176.method4047(var1);
				if (var2 != null) {
					Class353.field3767[var1] = 0;
					Class353.field3769[var1] = 0;
				}
			}
		}

		if (field4564 != null) {
			field4564.method2806();
		}

		field706 = -1;
		if (field592 != -1) {
			field4644.method6410(field592);
		}

		for (Class100 var3 = (Class100)field698.method9442(); var3 != null; var3 = (Class100)field698.method9446()) {
			method7260(var3, true);
		}

		field592 = -1;
		field698 = new Class536(8);
		field607 = null;
		field602 = 0;
		field672 = false;
		field815.method6428((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var1 = 0; var1 < 8; ++var1) {
			field712[var1] = null;
			field664[var1] = false;
		}

		Class89.field1120 = new Class536(32);
		field540 = true;

		for (var1 = 0; var1 < 100; ++var1) {
			field747[var1] = true;
		}

		method6362();
		field883 = null;
		field1685 = null;
		Arrays.fill(field771, (Object)null);
		field2773 = null;
		Arrays.fill(field772, (Object)null);

		for (var1 = 0; var1 < 8; ++var1) {
			field819[var1] = new Class409();
		}

		field2533 = null;
	}

	@ObfInfo(owner = "ik", name = "ha", desc = "(II)V", opaque = "1403501364")
	public static void method4236(int var0) {
		int var2 = Class53.field353;
		if (var0 == -3) {
			Class53.method4018(Class367.field4344, Class367.field4095, Class367.field4080);
		} else if (var0 == -2) {
			Class53.method4018(Class367.field4081, Class367.field4082, Class367.field4133);
		} else if (var0 == -1) {
			Class53.method4018(Class367.field4343, Class367.field4085, Class367.field4309);
		} else if (var0 == 3) {
			Class53.method3344(3);
			Class53.field352 = 1;
		} else if (var0 == 4) {
			Class53.method3344(14);
			Class53.field351 = 0;
		} else if (var0 == 5) {
			Class53.field352 = 2;
			Class53.method4018(Class367.field4090, Class367.field4091, Class367.field4092);
		} else if (var0 == 68) {
			if (!field701) {
				field701 = true;
				method887();
				return;
			}

			Class53.method4018(Class367.field4201, Class367.field4094, Class367.field4061);
		} else if (!field533 && var0 == 6) {
			Class53.method4018(Class367.field4201, Class367.field4094, Class367.field4061);
		} else if (var0 == 7) {
			Class53.method4018(Class367.field4096, Class367.field4097, Class367.field4098);
		} else if (var0 == 8) {
			Class53.method4018(Class367.field4235, Class367.field4100, Class367.field4101);
		} else if (var0 == 9) {
			Class53.method4018(Class367.field4102, Class367.field4103, Class367.field4041);
		} else if (var0 == 10) {
			Class53.method4018(Class367.field4105, Class367.field4076, Class367.field4053);
		} else if (var0 == 11) {
			Class53.method4018(Class367.field4108, Class367.field4109, Class367.field4174);
		} else if (var0 == 12) {
			Class53.method4018(Class367.field4111, Class367.field4112, Class367.field4113);
		} else if (var0 == 13) {
			Class53.method4018(Class367.field4067, Class367.field4115, Class367.field4116);
		} else if (var0 == 14) {
			Class53.method4018(Class367.field4117, Class367.field4217, Class367.field4119);
		} else if (var0 == 16) {
			Class53.method4018(Class367.field4120, Class367.field4121, Class367.field4193);
			Class53.method3344(33);
		} else if (var0 == 17) {
			Class53.method4018(Class367.field4123, Class367.field4124, Class367.field4057);
		} else if (var0 == 18) {
			Class53.method3344(14);
			Class53.field351 = 1;
		} else if (var0 == 19) {
			Class53.method4018(Class367.field4129, Class367.field4130, Class367.field4131);
		} else if (var0 == 20) {
			Class53.method4018(Class367.field4135, Class367.field4313, Class367.field4134);
		} else if (var0 == 22) {
			Class53.method4018(Class367.field4173, Class367.field4136, Class367.field4137);
		} else if (var0 == 23) {
			Class53.method4018(Class367.field4084, Class367.field4287, Class367.field4140);
		} else if (var0 == 24) {
			Class53.method4018(Class367.field4209, Class367.field4142, Class367.field4143);
		} else if (var0 == 25) {
			Class53.method4018(Class367.field4048, Class367.field4145, Class367.field4146);
		} else if (var0 == 26) {
			Class53.method4018(Class367.field4298, Class367.field4168, Class367.field4132);
		} else if (var0 == 27) {
			Class53.method4018(Class367.field4278, Class367.field4151, Class367.field4152);
		} else if (var0 == 31) {
			Class53.method4018(Class367.field4077, Class367.field4160, Class367.field4161);
		} else if (var0 == 32) {
			Class53.method3344(14);
			Class53.field351 = 2;
		} else if (var0 == 37) {
			Class53.method4018(Class367.field4165, Class367.field4107, Class367.field4167);
		} else if (var0 == 38) {
			Class53.method4018(Class367.field4338, Class367.field4169, Class367.field4275);
		} else if (var0 == 74) {
			Class53.method4018(Class367.field4171, Class367.field4172, Class367.field4036);
		} else if (var0 == 55) {
			Class53.method3344(8);
		} else {
			if (var0 == 56) {
				Class53.method4018(Class367.field4178, Class367.field4248, Class367.field4180);
				Class131.method3063(11);
				return;
			}

			if (var0 == 57) {
				Class53.method4018(Class367.field4181, Class367.field4062, Class367.field4183);
				Class131.method3063(11);
				return;
			}

			if (var0 == 61) {
				Class53.method4018("", "Please enter your date of birth (DD/MM/YYYY)", "");
				Class53.method3344(7);
			} else {
				if (var0 == 62) {
					Class131.method3063(10);
					Class53.method3344(9);
					Class53.method4018(Class367.field4184, Class367.field4185, Class367.field4186);
					return;
				}

				if (var0 == 63) {
					Class131.method3063(10);
					Class53.method3344(9);
					Class53.method4018(Class367.field4345, Class367.field4188, Class367.field4189);
					return;
				}

				if (var0 == 65 || var0 == 67) {
					Class131.method3063(10);
					Class53.method3344(9);
					Class53.method4018(Class367.field4190, Class367.field4191, Class367.field4192);
					return;
				}

				if (var0 == 71) {
					Class131.method3063(10);
					Class53.method3344(7);
					Class53.method4018("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					Class131.method3063(10);
					Class53.method3344(6);
					Class53.method4018(Class367.field4321, Class367.field4110, Class367.field4323);
				} else if (var0 == 72) {
					Class131.method3063(10);
					Class53.method3344(32);
				} else {
					Class53.method4018(Class367.field4144, Class367.field4093, Class367.field4195);
				}
			}
		}

		Class131.method3063(10);
		int var5 = Class53.field353;
		boolean var6 = var5 != var2;
		if (!var6 && field702.method9764()) {
			Class53.method3344(9);
		}

	}

	@ObfInfo(owner = "fd", name = "hg", desc = "(B)V")
	public static void method3118() {
		field678.method3015();
		method2771();
		field5093.method2316();
		field766.method4400();
		System.gc();
		Class323.method3075(0, 0);
		Class323.method4662();
		field787 = false;
		Class55.method1936();
		Class131.method3063(10);
		field542 = 0;
		Class222.method7869().method4271();
		Class222.method7869().method4272();
	}

	@ObfInfo(owner = "cr", name = "ho", desc = "(IB)V")
	public static void method2120(int var0) {
		method3118();
		switch(var0) {
		case 1:
			Class53.method434();
			break;
		case 2:
			Class53.method3344(24);
			Class53.method4018(Class367.field4104, Class367.field4147, Class367.field4267);
		}

	}

	@ObfInfo(owner = "rx", name = "he", desc = "(B)J")
	public static long method8516() {
		return field655;
	}

	@ObfInfo(owner = "it", name = "ie", desc = "(I)J")
	public static long method4423() {
		return field656;
	}

	@ObfInfo(owner = "dy", name = "ii", desc = "(I)V", opaque = "1398426166")
	public static void method2771() {
		Class192.field2107.method6332();
		Class195.method4015();
		Class158.method2939();
		Class540.method5844();
		Class533.field5287.method6332();
		Class205.field2232.method6332();
		Class213.field2312.method6332();
		Class191.field2094.method6332();
		Class207.field2252.method6332();
		Class207.field2251.method6332();
		Class183.field1916.method6332();
		Class183.field1917.method6332();
		Class183.field1918.method6332();
		Class178.field1897.method6332();
		Class199.field2194.method6332();
		Class180.method6423();
		Class197.method8689();
		Class163.method5();
		Class201.method3032();
		Class184.field1947.method6332();
		Class184.field1940.method6332();
		Class187.field2011.method6332();
		Class187.field2016.method6332();
		Class187.field2010.method6332();
		Class186.field2001.method6332();
		Class217.field2367.method6332();
		Class217.field2357.method6332();
		Class217.field2358.method6332();
		Class188.method4891();
		Class193.field2110.method6332();
		Class185.method3164();
		if (field1895 != null) {
			field1895.method9467();
		}

		if (field3998 != null) {
			field3998.method9467();
		}

		Class204.field2224.method6332();
		Class196.field2121.method6332();
		Class200.method214();
		Class181.field1904.method6332();
		Class160.method8788();
		Class179.field1900.method6332();
		Class194.field2113.method6332();
		Class176.method2636();
		Class203.field2220.method6332();
		field822.method6332();
		field823.method6332();
		Class343.method1147();
		if (field4644 != null) {
			field4644.method6414();
		}

		if (Class274.field2803.field3081 != null) {
			((Class295)Class274.field2803.field3081).method5759();
		}

		Class85.field1075.method6332();
		field821.method8264();
		if (field949 != null) {
			field949.method7194();
		}

		if (field5070 != null) {
			field5070.method7194();
		}

		if (field2983 != null) {
			field2983.method7194();
		}

		if (field5007 != null) {
			field5007.method7194();
		}

		if (field857 != null) {
			field857.method7194();
		}

		if (field2574 != null) {
			field2574.method7194();
		}

		if (field1890 != null) {
			field1890.method7194();
		}

		if (field1137 != null) {
			field1137.method7194();
		}

		if (field1117 != null) {
			field1117.method7194();
		}

		if (field410 != null) {
			field410.method7194();
		}

		if (field4697 != null) {
			field4697.method7194();
		}

		if (field4372 != null) {
			field4372.method7194();
		}

		if (field1869 != null) {
			field1869.method7194();
		}

		if (field2221 != null) {
			field2221.method7194();
		}

		if (field2664 != null) {
			field2664.method7194();
		}

		if (field2777 != null) {
			field2777.method7194();
		}

		if (field112 != null) {
			field112.method7194();
		}

		if (field2122 != null) {
			field2122.method7194();
		}

		if (field2669 != null) {
			field2669.method7194();
		}

		if (field3730 != null) {
			field3730.method7194();
		}

		if (field1666 != null) {
			field1666.method7194();
		}

		if (field1558 != null) {
			field1558.method7194();
		}

	}

	@ObfInfo(owner = "fv", name = "id", desc = "(I)V")
	public static void method3280() {
		field2190 = null;
		field2189 = null;
		field3659 = 0;
	}

	@ObfInfo(owner = "fw", name = "io", desc = "(I)V", opaque = "1587651118")
	public static void method3313() {
		if (field649 > 0) {
			method3118();
		} else {
			field595.method8321();
			Class131.method3063(40);
			field4428 = field678.method3017();
			field678.method3016();
		}
	}

	@ObfInfo(owner = "is", name = "iq", desc = "(ZS)V", opaque = "201")
	public static void method4362(boolean var0) {
		if (var0) {
			field568 = Class53.field344 ? Class110.field1381 : Class110.field1386;
		} else {
			field568 = field1474.method2488(Class53.field358) ? Class110.field1385 : Class110.field1380;
		}

	}

	@ObfInfo(owner = "gq", name = "iu", desc = "(I)V")
	public static void method3564() {
		if (field1052 != null) {
			field1052.method806();
		}

	}

	@ObfInfo(owner = "mx", name = "ik", desc = "(B)V", opaque = "46")
	public static void method6369() {
		int var2;
		for (int var1 = 0; var1 < field782; ++var1) {
			int var10002 = field785[var1]--;
			if (field785[var1] >= -10) {
				Class49 var13 = field788[var1];
				if (var13 == null) {
					Class49 var10000 = (Class49)null;
					var13 = Class49.method880(field4697, field574[var1], 0);
					if (var13 == null) {
						continue;
					}

					int[] var19 = field785;
					var19[var1] += var13.method870();
					field788[var1] = var13;
				}

				if (field785[var1] < 0) {
					int var3;
					if (field786[var1] != 0) {
						int var4 = (field786[var1] & 255) * 128;
						int var5 = field786[var1] >> 16 & 255;
						int var6 = Math.abs(Class371.method7108(var5) - field170.field1266);
						int var7 = field786[var1] >> 8 & 255;
						int var8 = Math.abs(Class371.method7108(var7) - field170.field1229);
						int var9 = Math.max(var8 + var6 - 128, 0);
						int var10 = Math.max(128 * ((field694[var1] & 31) - 1), 0);
						if (var9 >= var4) {
							field785[var1] = -100;
							continue;
						}

						float var11 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
						var3 = (int)(var11 * (float)field1474.method2508());
					} else {
						var3 = field1474.method2478();
					}

					if (var3 > 0) {
						Class38 var15 = var13.method869().method549(field1751);
						Class52 var17 = Class52.method1008(var15, 100, var3);
						var17.method1040(field784[var1] - 1);
						field2506.method892(var17);
					}

					field785[var1] = -100;
				}
			} else {
				--field782;

				for (var2 = var1; var2 < field782; ++var2) {
					field574[var2] = field574[var2 + 1];
					field788[var2] = field788[var2 + 1];
					field784[var2] = field784[var2 + 1];
					field785[var2] = field785[var2 + 1];
					field786[var2] = field786[var2 + 1];
					field694[var2] = field694[var2 + 1];
				}

				--var1;
			}
		}

		if (field787 && !Class323.method3450()) {
			if (field1474.method2544() != 0 && Class323.method4690()) {
				Class390 var12 = field2221;
				var2 = field1474.method2544();
				if (!Class323.field3465.isEmpty()) {
					ArrayList var14 = new ArrayList();
					Iterator var16 = Class323.field3465.iterator();

					while (var16.hasNext()) {
						Class351 var18 = (Class351)var16.next();
						var18.field3758 = false;
						var18.field3757 = false;
						var18.field3763 = false;
						var18.field3760 = false;
						var18.field3756 = var12;
						var18.field3754 = var2;
						var18.field3752 = 0.0F;
						var14.add(var18);
					}

					Class323.method9265(var14, Class323.field3460, Class323.field3469, Class323.field3470, Class323.field3466, false);
				}
			}

			field787 = false;
		}

	}

	@ObfInfo(owner = "hm", name = "iw", desc = "(Lii;IIIZI)V", opaque = "-1439392813")
	public static void method3891(Class217 var0, int var1, int var2, int var3, boolean var4) {
		if (field782 < 50) {
			if (var0.field2360 != null && var1 < var0.field2360.length && var0.field2360[var1] != null) {
				int var6 = var0.field2360[var1].field2085 & 31;
				if ((var6 <= 0 || field1474.method2508() != 0) && (var6 != 0 || field1474.method2478() != 0)) {
					Class466.method8517(var0.field2360[var1], var2, var3, var4);
				}
			}
		}
	}

	@ObfInfo(owner = "jx", name = "ic", desc = "(Lii;IIIZI)V", opaque = "165232393")
	public static void method4983(Class217 var0, int var1, int var2, int var3, boolean var4) {
		if (field782 < 50) {
			if (var0.field2352 != null && var0.field2352.containsKey(var1)) {
				Class189 var6 = (Class189)var0.field2352.get(var1);
				if (var6 != null) {
					int var7 = var6.field2085 & 31;
					if ((var7 <= 0 || field1474.method2508() != 0) && (var7 != 0 || field1474.method2478() != 0)) {
						Class466.method8517(var6, var2, var3, var4);
					}
				}
			}
		}
	}

	@ObfInfo(owner = "bh", name = "ih", desc = "(IIII)V", opaque = "-1511322149")
	public static void method469(int var0, int var1, int var2) {
		if (field1474.method2478() != 0 && var1 != 0 && field782 < 50) {
			field574[field782] = var0;
			field784[field782] = var1;
			field785[field782] = var2;
			field788[field782] = null;
			field786[field782] = 0;
			field694[field782] = 0;
			++field782;
		}

	}

	@ObfInfo(owner = "hc", name = "ib", desc = "(II)V", opaque = "1143251562")
	public static void method3722(int var0) {
		if (var0 == -1 && !field787) {
			Class323.method3075(0, 0);
		} else if (var0 != -1 && !Class323.method4622(var0) && field1474.method2544() != 0) {
			ArrayList var2 = new ArrayList();
			var2.add(new Class351(field2221, var0, 0, field1474.method2544(), false));
			if (field787) {
				Class323.method3560(var2, 0, 100, 100, 0);
			} else {
				Class323.method9265(var2, 0, 100, 100, 0, false);
			}
		}

	}

	@ObfInfo(owner = "tg", name = "iy", desc = "(Ljava/util/ArrayList;IIIII)V", opaque = "1228470484")
	public static void method8897(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var6 = (Integer)var0.get(0);
			if (var6 == -1 && !field787) {
				Class323.method3075(0, 0);
			} else if (var6 != -1) {
				boolean var7;
				if (Class323.field3465.isEmpty()) {
					var7 = false;
				} else {
					Class351 var8 = (Class351)Class323.field3465.get(0);
					var7 = var8 != null && var6 == var8.field3764;
				}

				if (!var7 && field1474.method2544() != 0) {
					ArrayList var10 = new ArrayList();

					for (int var9 = 0; var9 < var0.size(); ++var9) {
						var10.add(new Class351(field2221, (Integer)var0.get(var9), 0, field1474.method2544(), false));
					}

					if (field787) {
						Class323.method3560(var10, var1, var2, var3, var4);
					} else {
						Class323.method9265(var10, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}

	@ObfInfo(owner = "jt", name = "ia", desc = "(B)V", opaque = "2")
	public static void method4942() {
		if (field4443) {
			for (int var1 = 0; var1 < field5093.field1017.field1402; ++var1) {
				Class80 var2 = field5093.field1024[field5093.field1017.field1407[var1]];
				var2.method2247();
			}

			field4443 = false;
		}

	}

	@ObfInfo(owner = "gi", name = "ix", desc = "(Ljava/lang/String;I)V", opaque = "-693831415")
	public static void method3419(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			field1474.method2462(!field1474.method2554());
			if (field1474.method2554()) {
				Class115.method3716(99, "", "Roofs are now all hidden");
			} else {
				Class115.method3716(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var2 = Class413.method7482(var0.substring(5).trim()) == 1;
			field4671.method643(var2);
			Class274.method5194(var2);
		}

		if (var0.equalsIgnoreCase("z")) {
			field817 = !field817;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			field1474.method2469();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			field577 = !field577;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			field621 = !field621;
		}

		if (var0.startsWith("setdrawdistance")) {
			String[] var5 = var0.split(" ");

			try {
				int var3 = Integer.parseInt(var5[1]);
				field1474.method2491(var3);
			} catch (NumberFormatException var4) {
				Class115.method3716(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var5[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			Class115.method3716(99, "", String.format("%d", field1474.method2459()));
		}

		if (field705 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				field3069.field5196 = !field3069.field5196;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				field1474.method2532(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				field1474.method2532(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				method3313();
			}
		}

		Class314 var6 = Class168.method3523(ClientPacket.field3360, field678.field1482);
		var6.field3270.method9809(var0.length() + 1);
		var6.field3270.method9816(var0);
		field678.method3013(var6);
	}

	@ObfInfo(owner = "fq", name = "it", desc = "(IB)I")
	public static int method3198(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	@ObfInfo(owner = "jx", name = "ir", desc = "(IB)I", opaque = "2")
	public static int method4984(int var0) {
		return Math.abs(var0 - field3333) > 1024 ? var0 + 2048 * (var0 < field3333 ? 1 : -1) : var0;
	}

	@ObfInfo(owner = "od", name = "ij", desc = "(IIII)V", opaque = "1931953071")
	public static void method7065(int var0, int var1, int var2) {
		if (field144 < var0) {
			field144 += field1888 + field2093 * (var0 - field144) / 1000;
			if (field144 > var0) {
				field144 = var0;
			}
		}

		if (field144 > var0) {
			field144 -= field2093 * (field144 - var0) / 1000 + field1888;
			if (field144 < var0) {
				field144 = var0;
			}
		}

		if (field3664 < var1) {
			field3664 += field1888 + field2093 * (var1 - field3664) / 1000;
			if (field3664 > var1) {
				field3664 = var1;
			}
		}

		if (field3664 > var1) {
			field3664 -= (field3664 - var1) * field2093 / 1000 + field1888;
			if (field3664 < var1) {
				field3664 = var1;
			}
		}

		if (field850 < var2) {
			field850 += field1888 + (var2 - field850) * field2093 / 1000;
			if (field850 > var2) {
				field850 = var2;
			}
		}

		if (field850 > var2) {
			field850 -= field1888 + (field850 - var2) * field2093 / 1000;
			if (field850 < var2) {
				field850 = var2;
			}
		}

	}

	@ObfInfo(owner = "je", name = "ip", desc = "(IIB)V", opaque = "10")
	public static void method4606(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (field4606 < var0) {
			field4606 += field1388 * (var0 - field4606) / 1000 + field1606;
			if (field4606 > var0) {
				field4606 = var0;
			}
		} else if (field4606 > var0) {
			field4606 -= field1606 + (field4606 - var0) * field1388 / 1000;
			if (field4606 < var0) {
				field4606 = var0;
			}
		}

		var1 &= 2047;
		int var3 = var1 - field3333;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			field3333 += var3 * field1388 / 1000 + field1606;
			field3333 &= 2047;
		} else if (var3 < 0) {
			field3333 -= field1606 + field1388 * -var3 / 1000;
			field3333 &= 2047;
		}

		int var4 = var1 - field3333;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			field3333 = var1;
		}

	}

	@ObfInfo(owner = "bh", name = "iz", desc = "(Lde;I)V", opaque = "1218672038")
	public static void method471(Class83 var0) {
		int var2 = var0.field1017.field1402;
		int[] var3 = var0.field1017.field1407;

		for (int var4 = 0; var4 < var2; ++var4) {
			Class80 var5 = var0.field1024[var3[var4]];
			if (var5 != null) {
				method4345(var0, var5, 1);
			}
		}

	}

	@ObfInfo(owner = "ir", name = "jp", desc = "(Lde;Ldw;IB)V", opaque = "74")
	public static void method4345(Class83 var0, Class101 var1, int var2) {
		if (var1.field1291 >= field541) {
			method5250(var1);
		} else {
			int var6;
			int var7;
			int var9;
			int var10;
			int var14;
			if (var1.field1298 >= field541) {
				boolean var4 = var1.field1298 == field541 || var1.field1273 == -1 || 0 != var1.field1276;
				if (!var4) {
					Class217 var5 = Class344.method6474(var1.field1273);
					if (var5 != null && !var5.method4132()) {
						var4 = 1 + var1.field1275 > var5.field2349[var1.field1274];
					} else {
						var4 = true;
					}
				}

				if (var4) {
					var14 = var1.field1298 - var1.field1291;
					var6 = field541 - var1.field1291;
					var7 = var1.field1232 * 64 + var1.field1280 * 128;
					int var8 = var1.field1232 * 64 + var1.field1282 * 128;
					var9 = var1.field1281 * 128 + var1.field1232 * 64;
					var10 = var1.field1232 * 64 + var1.field1283 * 128;
					var1.field1266 = ((var14 - var6) * var7 + var9 * var6) / var14;
					var1.field1229 = ((var14 - var6) * var8 + var10 * var6) / var14;
				}

				var1.field1302 = 0;
				var1.field1295 = var1.field1286;
				var1.field1230 = var1.field1295;
			} else {
				var1.field1236 = var1.field1234;
				if (0 == var1.field1267) {
					var1.field1302 = 0;
				} else {
					label336: {
						if (var1.field1273 != -1 && var1.field1276 == 0) {
							Class217 var13 = Class344.method6474(var1.field1273);
							if (var1.field1303 > 0 && 0 == var13.field2368) {
								++var1.field1302;
								break label336;
							}

							if (var1.field1303 <= 0 && var13.field2348 == 0) {
								++var1.field1302;
								break label336;
							}
						}

						int var15 = var1.field1266;
						var14 = var1.field1229;
						var6 = 128 * var1.field1242[var1.field1267 - 1] + var1.field1232 * 64;
						var7 = var1.field1284[var1.field1267 - 1] * 128 + var1.field1232 * 64;
						if (var15 < var6) {
							if (var14 < var7) {
								var1.field1295 = 1280;
							} else if (var14 > var7) {
								var1.field1295 = 1792;
							} else {
								var1.field1295 = 1536;
							}
						} else if (var15 > var6) {
							if (var14 < var7) {
								var1.field1295 = 768;
							} else if (var14 > var7) {
								var1.field1295 = 256;
							} else {
								var1.field1295 = 512;
							}
						} else if (var14 < var7) {
							var1.field1295 = 1024;
						} else if (var14 > var7) {
							var1.field1295 = 0;
						}

						Class236 var16 = var1.field1301[var1.field1267 - 1];
						if (var6 - var15 <= 256 && var6 - var15 >= -256 && var7 - var14 <= 256 && var7 - var14 >= -256) {
							var9 = var1.field1295 - var1.field1230 & 2047;
							if (var9 > 1024) {
								var9 -= 2048;
							}

							var10 = var1.field1238;
							if (var9 >= -256 && var9 <= 256) {
								var10 = var1.field1237;
							} else if (var9 >= 256 && var9 < 768) {
								var10 = var1.field1260;
							} else if (var9 >= -768 && var9 <= -256) {
								var10 = var1.field1239;
							}

							if (var10 == -1) {
								var10 = var1.field1237;
							}

							var1.field1236 = var10;
							int var11 = 4;
							boolean var12 = true;
							if (var1 instanceof Class102) {
								var12 = ((Class102)var1).field1309.field1978;
							}

							if (var12) {
								if (var1.field1230 != var1.field1295 && var1.field1228 == -1 && var1.field1297 != 0) {
									var11 = 2;
								}

								if (var1.field1267 > 2) {
									var11 = 6;
								}

								if (var1.field1267 > 3) {
									var11 = 8;
								}

								if (var1.field1302 > 0 && var1.field1267 > 1) {
									var11 = 8;
									--var1.field1302;
								}
							} else {
								if (var1.field1267 > 1) {
									var11 = 6;
								}

								if (var1.field1267 > 2) {
									var11 = 8;
								}

								if (var1.field1302 > 0 && var1.field1267 > 1) {
									var11 = 8;
									--var1.field1302;
								}
							}

							if (Class236.field2501 == var16) {
								var11 <<= 1;
							} else if (Class236.field2512 == var16) {
								var11 >>= 1;
							}

							if (var11 >= 8) {
								if (var1.field1237 == var1.field1236 && var1.field1241 != -1) {
									var1.field1236 = var1.field1241;
								} else if (var1.field1238 == var1.field1236 && var1.field1300 != -1) {
									var1.field1236 = var1.field1300;
								} else if (var1.field1236 == var1.field1239 && var1.field1257 != -1) {
									var1.field1236 = var1.field1257;
								} else if (var1.field1260 == var1.field1236 && var1.field1240 != -1) {
									var1.field1236 = var1.field1240;
								}
							} else if (var11 <= 2) {
								if (var1.field1236 == var1.field1237 && -1 != var1.field1243) {
									var1.field1236 = var1.field1243;
								} else if (var1.field1238 == var1.field1236 && -1 != var1.field1246) {
									var1.field1236 = var1.field1246;
								} else if (var1.field1239 == var1.field1236 && -1 != var1.field1287) {
									var1.field1236 = var1.field1287;
								} else if (var1.field1236 == var1.field1260 && var1.field1248 != -1) {
									var1.field1236 = var1.field1248;
								}
							}

							if (var6 != var15 || var7 != var14) {
								if (var15 < var6) {
									var1.field1266 += var11;
									if (var1.field1266 > var6) {
										var1.field1266 = var6;
									}
								} else if (var15 > var6) {
									var1.field1266 -= var11;
									if (var1.field1266 < var6) {
										var1.field1266 = var6;
									}
								}

								if (var14 < var7) {
									var1.field1229 += var11;
									if (var1.field1229 > var7) {
										var1.field1229 = var7;
									}
								} else if (var14 > var7) {
									var1.field1229 -= var11;
									if (var1.field1229 < var7) {
										var1.field1229 = var7;
									}
								}
							}

							if (var6 == var1.field1266 && var1.field1229 == var7) {
								--var1.field1267;
								if (var1.field1303 > 0) {
									--var1.field1303;
								}
							}
						} else {
							var1.field1266 = var6;
							var1.field1229 = var7;
							--var1.field1267;
							if (var1.field1303 > 0) {
								--var1.field1303;
							}
						}
					}
				}
			}
		}

		if (var1.field1266 < 128 || 13184 <= var1.field1266 || var1.field1229 < 128 || 13184 <= var1.field1229) {
			var1.field1273 = -1;
			var1.field1291 = 0;
			var1.field1298 = 0;
			var1.method2699();
			var1.field1266 = var1.field1242[0] * 128 + var1.field1232 * 64;
			var1.field1229 = var1.field1232 * 64 + var1.field1284[0] * 128;
			var1.method2656();
		}

		if (field170 == var1 && (var1.field1266 < 1536 || 11776 <= var1.field1266 || var1.field1229 < 1536 || 11776 <= var1.field1229)) {
			var1.field1273 = -1;
			var1.field1291 = 0;
			var1.field1298 = 0;
			var1.method2699();
			var1.field1266 = var1.field1242[0] * 128 + var1.field1232 * 64;
			var1.field1229 = var1.field1232 * 64 + 128 * var1.field1284[0];
			var1.method2656();
		}

		method3590(var0, var1);
		method7113(var1);
	}

	@ObfInfo(owner = "kp", name = "jd", desc = "(Ldw;B)V")
	public static void method5250(Class101 var0) {
		int var2 = Math.max(1, var0.field1291 - field541);
		int var3 = var0.field1280 * 128 + var0.field1232 * 64;
		int var4 = var0.field1232 * 64 + var0.field1282 * 128;
		var0.field1266 += (var3 - var0.field1266) / var2;
		var0.field1229 += (var4 - var0.field1229) / var2;
		var0.field1302 = 0;
		var0.field1295 = var0.field1286;
	}

	@ObfInfo(owner = "gu", name = "jv", desc = "(Lde;Ldw;I)V", opaque = "1321297831")
	public static void method3590(Class83 var0, Class101 var1) {
		int var4;
		int var5;
		int var6;
		if (-1 != var1.field1228) {
			Object var3 = null;
			var4 = 65536;
			if (var1.field1228 < var4) {
				var3 = var0.field1013[var1.field1228];
			} else {
				var3 = var0.field1024[var1.field1228 - var4];
			}

			if (var3 != null) {
				var5 = var1.field1266 - ((Class101)var3).field1266;
				var6 = var1.field1229 - ((Class101)var3).field1229;
				if (var5 != 0 || var6 != 0) {
					var1.field1295 = Class441.method7724(var5, var6);
				}
			} else if (var1.field1247) {
				var1.field1228 = -1;
				var1.field1247 = false;
			}
		}

		int var9;
		if (var1.field1267 == 0 || var1.field1302 > 0) {
			var9 = -1;
			if (-1 != var1.field1290 && var1.field1263 != -1) {
				var4 = Class371.method7108(var1.field1290 - field5093.field1019);
				var5 = Class371.method7108(var1.field1263 - field5093.field1021);
				var6 = var1.field1266 - var4;
				int var7 = var1.field1229 - var5;
				if (var6 != 0 || var7 != 0) {
					var9 = Class441.method7724(var6, var7);
				}
			} else if (-1 != var1.field1265) {
				var9 = var1.field1265;
			}

			if (var9 != -1) {
				var1.field1295 = var9;
				if (var1.field1268) {
					var1.field1230 = var1.field1295;
				}
			}

			var1.method2658();
		}

		var9 = var1.field1295 - var1.field1230 & 2047;
		if (var9 != 0) {
			boolean var10 = true;
			boolean var11 = true;
			++var1.field1296;
			var6 = var9 > 1024 ? -1 : 1;
			var1.field1230 += var1.field1297 * var6;
			boolean var12 = true;
			if (var9 < var1.field1297 || var9 > 2048 - var1.field1297) {
				var1.field1230 = var1.field1295;
				var12 = false;
			}

			if (var1.field1297 > 0 && var1.field1234 == var1.field1236 && (var1.field1296 > 25 || var12)) {
				if (var6 == -1 && var1.field1235 != -1) {
					var1.field1236 = var1.field1235;
				} else if (var6 == 1 && -1 != var1.field1245) {
					var1.field1236 = var1.field1245;
				} else {
					var1.field1236 = var1.field1237;
				}
			}

			var1.field1230 &= 2047;
		} else {
			if (var1.field1247) {
				var1.field1228 = -1;
				var1.field1247 = false;
			}

			var1.field1296 = 0;
		}

	}

	@ObfInfo(owner = "oh", name = "jf", desc = "(Ldw;B)V", opaque = "87")
	public static void method7113(Class101 var0) {
		var0.field1231 = false;
		if (var0.field1236 != -1) {
			Class217 var2 = Class344.method6474(var0.field1236);
			if (var2 != null) {
				if (!var2.method4132() && var2.field2355 != null) {
					++var0.field1271;
					if (var0.field1270 < var2.field2355.length && var0.field1271 > var2.field2349[var0.field1270]) {
						var0.field1271 = 1;
						++var0.field1270;
						method3891(var2, var0.field1270, var0.field1266, var0.field1229, field170 == var0);
					}

					if (var0.field1270 >= var2.field2355.length) {
						if (var2.field2359 > 0) {
							var0.field1270 -= var2.field2359;
							if (var2.field2369) {
								++var0.field1272;
							}

							if (var0.field1270 < 0 || var0.field1270 >= var2.field2355.length || var2.field2369 && var0.field1272 >= var2.field2345) {
								var0.field1271 = 0;
								var0.field1270 = 0;
								var0.field1272 = 0;
							}
						} else {
							var0.field1271 = 0;
							var0.field1270 = 0;
						}

						method3891(var2, var0.field1270, var0.field1266, var0.field1229, field170 == var0);
					}
				} else if (var2.method4132()) {
					++var0.field1270;
					int var3 = var2.method4141();
					if (var0.field1270 < var3) {
						method4983(var2, var0.field1270, var0.field1266, var0.field1229, field170 == var0);
					} else {
						if (var2.field2359 > 0) {
							var0.field1270 -= var2.field2359;
							if (var2.field2369) {
								++var0.field1272;
							}

							if (var0.field1270 < 0 || var0.field1270 >= var3 || var2.field2369 && var0.field1272 >= var2.field2345) {
								var0.field1270 = 0;
								var0.field1271 = 0;
								var0.field1272 = 0;
							}
						} else {
							var0.field1271 = 0;
							var0.field1270 = 0;
						}

						method4983(var2, var0.field1270, var0.field1266, var0.field1229, field170 == var0);
					}
				} else {
					var0.field1236 = -1;
				}
			} else {
				var0.field1236 = -1;
			}
		}

		Class509 var7 = new Class509(var0.method2655());

		int var4;
		for (Class480 var8 = (Class480)var7.method8974(); var8 != null; var8 = (Class480)var7.next()) {
			if (var8.field4985 != -1 && field541 >= var8.field4987) {
				var4 = Class188.method3600(var8.field4985).field2077;
				if (var4 == -1) {
					var8.method9267();
					--var0.field1279;
				} else {
					var8.field4989 = Math.max(var8.field4989, 0);
					Class217 var5 = Class344.method6474(var4);
					if (var5.field2355 != null && !var5.method4132()) {
						++var8.field4986;
						if (var8.field4989 < var5.field2355.length && var8.field4986 > var5.field2349[var8.field4989]) {
							var8.field4986 = 1;
							++var8.field4989;
							method3891(var5, var8.field4989, var0.field1266, var0.field1229, field170 == var0);
						}

						if (var8.field4989 >= var5.field2355.length) {
							var8.method9267();
							--var0.field1279;
						}
					} else if (var5.method4132()) {
						++var8.field4989;
						int var6 = var5.method4141();
						if (var8.field4989 < var6) {
							method4983(var5, var8.field4989, var0.field1266, var0.field1229, field170 == var0);
						} else {
							var8.method9267();
							--var0.field1279;
						}
					} else {
						var8.method9267();
						--var0.field1279;
					}
				}
			}
		}

		Class217 var9;
		if (-1 != var0.field1273 && var0.field1276 <= 1) {
			var9 = Class344.method6474(var0.field1273);
			if (var9.field2368 == 1 && var0.field1303 > 0 && var0.field1291 <= field541 && var0.field1298 < field541) {
				var0.field1276 = 1;
				return;
			}
		}

		if (var0.field1273 != -1 && 0 == var0.field1276) {
			var9 = Class344.method6474(var0.field1273);
			if (var9 != null) {
				if (!var9.method4132() && var9.field2355 != null) {
					++var0.field1275;
					if (var0.field1274 < var9.field2355.length && var0.field1275 > var9.field2349[var0.field1274]) {
						var0.field1275 = 1;
						++var0.field1274;
						method3891(var9, var0.field1274, var0.field1266, var0.field1229, field170 == var0);
					}

					if (var0.field1274 >= var9.field2355.length) {
						var0.field1274 -= var9.field2359;
						++var0.field1252;
						if (var0.field1252 >= var9.field2345) {
							var0.field1273 = -1;
						} else if (var0.field1274 >= 0 && var0.field1274 < var9.field2355.length) {
							method3891(var9, var0.field1274, var0.field1266, var0.field1229, field170 == var0);
						} else {
							var0.field1273 = -1;
						}
					}

					var0.field1231 = var9.field2362;
				} else if (var9.method4132()) {
					++var0.field1274;
					var4 = var9.method4141();
					if (var0.field1274 < var4) {
						method4983(var9, var0.field1274, var0.field1266, var0.field1229, field170 == var0);
					} else {
						var0.field1274 -= var9.field2359;
						++var0.field1252;
						if (var0.field1252 >= var9.field2345) {
							var0.field1273 = -1;
						} else if (var0.field1274 >= 0 && var0.field1274 < var4) {
							method4983(var9, var0.field1274, var0.field1266, var0.field1229, field170 == var0);
						} else {
							var0.field1273 = -1;
						}
					}
				} else {
					var0.field1273 = -1;
				}
			} else {
				var0.field1273 = -1;
			}
		}

		if (var0.field1276 > 0) {
			--var0.field1276;
		}

	}

	@ObfInfo(owner = "cs", name = "jz", desc = "(B)I", opaque = "1")
	public static int method2130() {
		return field756 ? 2 : 1;
	}

	@ObfInfo(owner = "mw", name = "jn", desc = "(I)V", opaque = "1187126899")
	public static void method6362() {
		if (field678 != null && field678.field1482 != null) {
			Class314 var1 = Class168.method3523(ClientPacket.field3375, field678.field1482);
			var1.field3270.method9809(method2130());
			var1.field3270.method9810(field954);
			var1.field3270.method9810(field15);
			field678.method3013(var1);
		}
	}

	@ObfInfo(owner = "ce", name = "jh", desc = "(Ljava/lang/String;ZB)V", opaque = "53")
	public static void method1172(String var0, boolean var1) {
		if (field652) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = var3 + 6;
			int var6 = field2102.method8140(var0, 250);
			int var7 = field2102.method8141(var0, 250) * 13;
			Class569.method10138(var4 - var3, var5 - var3, var3 + var6 + var3, var7 + var3 + var3, 0);
			Class569.method10142(var4 - var3, var5 - var3, var3 + var6 + var3, var7 + var3 + var3, 16777215);
			field2102.method8148(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			method3076(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3);
			if (var1) {
				field4695.method391(0, 0);
			} else {
				method2323(var4, var5, var6, var7);
			}

		}
	}

	@ObfInfo(owner = "nv", name = "jq", desc = "(Lde;IZI)V", opaque = "528326967")
	public static void method6615(Class83 var0, int var1, boolean var2) {
		Class80 var4 = var0.field1024[var1];
		if (var4 != null && var4.method2254() && !var4.field993) {
			var4.field980 = false;
			if ((field687 && var0.field1017.field1402 > 50 || var0.field1017.field1402 > 200) && var2 && var4.field1234 == var4.field1236) {
				var4.field980 = true;
			}

			int var5 = var4.field1266 >> 7;
			int var6 = var4.field1229 >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = Class296.method4129(0, 0, 0, false, var4.field995, var0.field1026);
				if (var4.field986 != null && field541 >= var4.field974 && field541 < var4.field973) {
					var4.field980 = false;
					var4.field978 = method3531(var0, var4.field1266, var4.field1229, var0.field1016);
					var4.field1233 = field541;
					var0.field1014.method5499(var0.field1016, var4.field1266, var4.field1229, var4.field978, 60, var4, var4.field1230, var7, var4.field987, var4.field981, var4.field989, var4.field994);
				} else {
					if (64 == (var4.field1266 & 127) && (var4.field1229 & 127) == 64) {
						if (field643 == var0.field1036[var5][var6]) {
							return;
						}

						var0.field1036[var5][var6] = field643;
					}

					var4.field978 = method3531(var0, var4.field1266, var4.field1229, var0.field1016);
					var4.field1233 = field541;
					var0.field1014.method5263(var0.field1016, var4.field1266, var4.field1229, var4.field978, 60, var4, var4.field1230, var7, var4.field1231);
				}
			}
		}

	}

	@ObfInfo(owner = "kw", name = "ja", desc = "(Lde;B)V", opaque = "3")
	public static void method5627(Class83 var0) {
		for (Class84 var2 = (Class84)var0.field1022.method7526(); var2 != null; var2 = (Class84)var0.field1022.method7511()) {
			if (var2.field1037 == var0.field1016 && field541 <= var2.field1047) {
				if (field541 >= var2.field1044) {
					Class102 var3;
					int var4;
					Class80 var5;
					if (!var2.field1067 && var2.field1050 != 0) {
						if (var2.field1050 > 0) {
							var3 = field94.field1013[var2.field1050 - 1];
							if (var3 != null && 0 <= var3.field1266 && var3.field1266 < 13312 && 0 <= var3.field1229 && var3.field1229 < 13312) {
								var2.field1039 = var3.field1266;
								var2.field1040 = var3.field1229;
								var2.method2329(var2.field1043, var2.field1060, var2.field1045, field541);
							}
						} else {
							var4 = -var2.field1050 - 1;
							if (var4 == field732) {
								var5 = field170;
							} else {
								var5 = field94.field1024[var4];
							}

							if (var5 != null && 0 <= var5.field1266 && var5.field1266 < 13312 && 0 <= var5.field1229 && var5.field1229 < 13312) {
								var2.field1039 = var5.field1266;
								var2.field1040 = var5.field1229;
								var2.method2329(var2.field1043, var2.field1060, var2.field1045, field541);
							}
						}
					}

					if (var2.field1063 > 0) {
						var3 = var0.field1013[var2.field1063 - 1];
						if (var3 != null && 0 <= var3.field1266 && var3.field1266 < 13312 && 0 <= var3.field1229 && var3.field1229 < 13312) {
							var2.method2329(var3.field1266, var3.field1229, method3531(var0, var3.field1266, var3.field1229, var2.field1037) - var2.field1051, field541);
						}
					}

					if (var2.field1063 < 0) {
						var4 = -var2.field1063 - 1;
						if (field732 == var4) {
							var5 = field170;
						} else {
							var5 = var0.field1024[var4];
						}

						if (var5 != null && 0 <= var5.field1266 && var5.field1266 < 13312 && 0 <= var5.field1229 && var5.field1229 < 13312) {
							var2.method2329(var5.field1266, var5.field1229, method3531(var0, var5.field1266, var5.field1229, var2.field1037) - var2.field1051, field541);
						}
					}

					var2.method2330(field831);
					var0.field1014.method5263(var0.field1016, (int)var2.field1053, (int)var2.field1054, (int)var2.field1055, 60, var2, var2.field1061, -1L, false);
				}
			} else {
				var2.method9267();
			}
		}

	}

	@ObfInfo(owner = "no", name = "je", desc = "(I)Lpr;")
	public static Class408 method6545() {
		return field740;
	}

	@ObfInfo(owner = "fa", name = "jr", desc = "(B)V", opaque = "-1")
	public static void method3062() {
		for (Class226 var1 = (Class226)field743.method7526(); var1 != null; var1 = (Class226)field743.method7511()) {
			var1.method9267();
		}

	}

	@ObfInfo(owner = "af", name = "jl", desc = "(I)Z", opaque = "-701813729")
	public static boolean method67() {
		return (field659 & 4) != 0;
	}

	@ObfInfo(owner = "mh", name = "jt", desc = "(I)Z", opaque = "-1088804478")
	public static boolean method6280() {
		return (field659 & 1) != 0;
	}

	@ObfInfo(owner = "od", name = "jk", desc = "(Ldb;I)Z", opaque = "590374019")
	public static boolean method7063(Class80 var0) {
		if (field659 == 0) {
			return false;
		} else {
			boolean var2;
			if (field170 == var0) {
				var2 = (field659 & 8) != 0;
				return var2;
			} else {
				var2 = method67() || method6280() && var0.method2240();
				if (!var2) {
					boolean var3 = 0 != (field659 & 2);
					var2 = var3 && var0.method2243();
				}

				return var2;
			}
		}
	}

	@ObfInfo(owner = "ed", name = "js", desc = "(Lde;Ldw;IIIIIB)V", opaque = "0")
	public static void method2854(Class83 var0, Class101 var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null && var1.method2254()) {
			if (var1 instanceof Class102) {
				Class184 var8 = ((Class102)var1).field1309;
				if (var8.field1966 != null) {
					var8 = var8.method3661();
				}

				if (var8 == null) {
					return;
				}
			}

			int var77 = var0.field1017.field1402;
			int[] var9 = var0.field1017.field1407;
			boolean var10 = var2 < var77;
			int var11 = -2;
			if (var1.field1249 != null && (!var10 || !var1.field1251 && (4 == field760 || !var1.field1250 && (field760 == 0 || field760 == 3 || 1 == field760 && ((Class80)var1).method2240())))) {
				method7597(var0, var1, var1.method2697());
				if (field644 > -1 && field632 < field633) {
					field693[field632] = field2002.method8139(var1.field1249) / 2;
					field636[field632] = field2002.field4784;
					field634[field632] = field644;
					field635[field632] = field611 - var11;
					field638[field632] = var1.field1264;
					field639[field632] = var1.field1254;
					field641[field632] = var1.field1244;
					field566[field632] = var1.field1255;
					field642[field632] = var1.field1249;
					++field632;
					var11 += 12;
				}
			}

			int var17;
			int var24;
			int var25;
			if (!var1.field1262.method7398()) {
				method7597(var0, var1, var1.method2697() + 15);

				for (Class90 var12 = (Class90)var1.field1262.method7401(); var12 != null; var12 = (Class90)var1.field1262.method7403()) {
					Class86 var13 = var12.method2420(field541);
					if (var13 == null) {
						if (var12.method2421()) {
							var12.method9267();
						}
					} else {
						Class207 var14 = var12.field1125;
						Class553 var15 = var14.method4027();
						Class553 var16 = var14.method4026();
						int var18 = 0;
						if (var15 != null && var16 != null) {
							if (var14.field2262 * 2 < var16.field5421) {
								var18 = var14.field2262;
							}

							var17 = var16.field5421 - var18 * 2;
						} else {
							var17 = var14.field2260;
						}

						int var19 = 255;
						boolean var20 = true;
						int var21 = field541 - var13.field1088;
						int var22 = var17 * var13.field1085 / var14.field2260;
						int var23;
						int var92;
						if (var13.field1083 > var21) {
							var23 = var14.field2256 == 0 ? 0 : var14.field2256 * (var21 / var14.field2256);
							var24 = var13.field1082 * var17 / var14.field2260;
							var92 = var23 * (var22 - var24) / var13.field1083 + var24;
						} else {
							var92 = var22;
							var23 = var14.field2257 + var13.field1083 - var21;
							if (var14.field2255 >= 0) {
								var19 = (var23 << 8) / (var14.field2257 - var14.field2255);
							}
						}

						if (var13.field1085 > 0 && var92 < 1) {
							var92 = 1;
						}

						if (var15 != null && var16 != null) {
							if (var92 == var17) {
								var92 += var18 * 2;
							} else {
								var92 += var18;
							}

							var23 = var15.field5424;
							var11 += var23;
							var24 = field644 + var3 - (var17 >> 1);
							var25 = field611 + var4 - var11;
							var24 -= var18;
							if (var19 >= 0 && var19 < 255) {
								var15.method9625(var24, var25, var19);
								Class569.method10137(var24, var25, var24 + var92, var25 + var23);
								var16.method9625(var24, var25, var19);
							} else {
								var15.method9628(var24, var25);
								Class569.method10137(var24, var25, var24 + var92, var25 + var23);
								var16.method9628(var24, var25);
							}

							Class569.method10183(var3, var4, var5 + var3, var6 + var4);
							var11 += 2;
						} else {
							var11 += 5;
							if (field644 > -1) {
								var23 = field644 + var3 - (var17 >> 1);
								var24 = var4 + field611 - var11;
								Class569.method10138(var23, var24, var92, 5, 65280);
								Class569.method10138(var23 + var92, var24, var17 - var92, 5, 16711680);
							}

							var11 += 2;
						}
					}
				}
			}

			if (var11 == -2) {
				var11 += 7;
			}

			Class80 var78;
			if (var10 && field541 == var1.field1233 && method7063((Class80)var1)) {
				var78 = (Class80)var1;
				if (var10) {
					method7597(var0, var1, var1.method2697() + 15);
					Class442 var79 = (Class442)field596.get(Class519.field5227);
					var11 += 4;
					var79.method8147(var78.field991.method9789(), var3 + field644, var4 + field611 - var11, 16777215, 0);
					var11 += 18;
				}
			}

			if (var10) {
				var78 = (Class80)var1;
				if (var78.field993) {
					return;
				}

				if (-1 != var78.field975 || -1 != var78.field992) {
					method7597(var0, var1, 15 + var1.field1288);
					if (field644 > -1) {
						if (-1 != var78.field975) {
							var11 += 25;
							field3059[var78.field975].method9628(field644 + var3 - 12, field611 + var4 - var11);
						}

						if (-1 != var78.field992) {
							var11 += 25;
							field4535[var78.field992].method9628(var3 + field644 - 12, field611 + var4 - var11);
						}
					}
				}

				if (var2 >= 0 && 10 == field550 && var9[var2] == field552) {
					method7597(var0, var1, var1.field1288 + 15);
					if (field644 > -1) {
						var11 += field3331[1].field5424;
						field3331[1].method9628(var3 + field644 - 12, var4 + field611 - var11);
					}
				}
			} else {
				Class102 var80 = (Class102)var1;
				int[] var81 = var80.method2709();
				short[] var84 = var80.method2722();
				if (var84 != null && var81 != null) {
					for (int var86 = 0; var86 < var84.length; ++var86) {
						if (var84[var86] >= 0 && var81[var86] >= 0) {
							long var88 = (long)var81[var86] << 8 | (long)var84[var86];
							Class553 var90 = (Class553)field821.method8261(var88);
							if (var90 == null) {
								Class553[] var91 = Class554.method8633(field112, var81[var86], 0);
								if (var91 != null && var84[var86] < var91.length) {
									var90 = var91[var84[var86]];
									field821.method8262(var88, var90);
								}
							}

							if (var90 != null) {
								method7597(var0, var1, var1.method2697() + 15);
								if (field644 > -1) {
									var90.method9628(field644 + var3 - (var90.field5421 >> 1), field611 + ((var4 - var90.field5424 - 2) * (var86 + 1) - var90.field5424) - 4);
								}
							}
						}
					}
				}

				if (field550 == 1 && field820 == var0.field1028[var2 - var77] && field541 % 20 < 10) {
					method7597(var0, var1, var1.method2697() + 15);
					if (field644 > -1) {
						field3331[0].method9628(field644 + var3 - 12, var4 + field611 - 28);
					}
				}
			}

			for (int var82 = 0; var82 < 4; ++var82) {
				int var83 = var1.field1259[var82];
				int var85 = var1.field1294[var82];
				Class183 var87 = null;
				int var89 = 0;
				if (var85 >= 0) {
					if (var83 <= field541) {
						continue;
					}

					var87 = Class254.method4941(var1.field1294[var82]);
					var89 = var87.field1922;
					if (var87 != null && var87.field1924 != null) {
						var87 = var87.method3646();
						if (var87 == null) {
							var1.field1259[var82] = -1;
							continue;
						}
					}
				} else if (var83 < 0) {
					continue;
				}

				var17 = var1.field1299[var82];
				Class183 var94 = null;
				if (var17 >= 0) {
					var94 = Class254.method4941(var17);
					if (var94 != null && var94.field1924 != null) {
						var94 = var94.method3646();
					}
				}

				if (var83 - var89 <= field541) {
					if (var87 == null) {
						var1.field1259[var82] = -1;
					} else {
						method7597(var0, var1, var1.method2697() / 2);
						if (field644 > -1) {
							boolean var93 = true;
							if (var82 == 1) {
								field611 -= 20;
							}

							if (var82 == 2) {
								field644 -= 15;
								field611 -= 10;
							}

							if (var82 == 3) {
								field644 += 15;
								field611 -= 10;
							}

							Class553 var97 = null;
							Class553 var95 = null;
							Class553 var96 = null;
							Class553 var98 = null;
							var24 = 0;
							var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							int var31 = 0;
							Class553 var32 = null;
							Class553 var33 = null;
							Class553 var34 = null;
							Class553 var35 = null;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							int var44 = 0;
							var97 = var87.method3625();
							int var45;
							if (var97 != null) {
								var24 = var97.field5421;
								var45 = var97.field5424;
								if (var45 > var44) {
									var44 = var45;
								}

								var28 = var97.field5423;
							}

							var95 = var87.method3626();
							if (var95 != null) {
								var25 = var95.field5421;
								var45 = var95.field5424;
								if (var45 > var44) {
									var44 = var45;
								}

								var29 = var95.field5423;
							}

							var96 = var87.method3627();
							if (var96 != null) {
								var26 = var96.field5421;
								var45 = var96.field5424;
								if (var45 > var44) {
									var44 = var45;
								}

								var30 = var96.field5423;
							}

							var98 = var87.method3628();
							if (var98 != null) {
								var27 = var98.field5421;
								var45 = var98.field5424;
								if (var45 > var44) {
									var44 = var45;
								}

								var31 = var98.field5423;
							}

							if (var94 != null) {
								var32 = var94.method3625();
								if (var32 != null) {
									var36 = var32.field5421;
									var45 = var32.field5424;
									if (var45 > var44) {
										var44 = var45;
									}

									var40 = var32.field5423;
								}

								var33 = var94.method3626();
								if (var33 != null) {
									var37 = var33.field5421;
									var45 = var33.field5424;
									if (var45 > var44) {
										var44 = var45;
									}

									var41 = var33.field5423;
								}

								var34 = var94.method3627();
								if (var34 != null) {
									var38 = var34.field5421;
									var45 = var34.field5424;
									if (var45 > var44) {
										var44 = var45;
									}

									var42 = var34.field5423;
								}

								var35 = var94.method3628();
								if (var35 != null) {
									var39 = var35.field5421;
									var45 = var35.field5424;
									if (var45 > var44) {
										var44 = var45;
									}

									var43 = var35.field5423;
								}
							}

							Class424 var99 = var87.method3629();
							if (var99 == null) {
								var99 = field881;
							}

							Class424 var46;
							if (var94 != null) {
								var46 = var94.method3629();
								if (var46 == null) {
									var46 = field881;
								}
							} else {
								var46 = field881;
							}

							String var47 = null;
							String var48 = null;
							boolean var49 = false;
							int var50 = 0;
							var47 = var87.method3624(var1.field1258[var82]);
							int var100 = var99.method8139(var47);
							if (var94 != null) {
								var48 = var94.method3624(var1.field1269[var82]);
								var50 = var46.method8139(var48);
							}

							int var51 = 0;
							int var52 = 0;
							if (var25 > 0) {
								if (var96 == null && var98 == null) {
									var51 = 1;
								} else {
									var51 = 1 + var100 / var25;
								}
							}

							if (var94 != null && var37 > 0) {
								if (var34 == null && var35 == null) {
									var52 = 1;
								} else {
									var52 = var50 / var37 + 1;
								}
							}

							int var53 = 0;
							int var54 = var53;
							if (var24 > 0) {
								var53 += var24;
							}

							var53 += 2;
							int var55 = var53;
							if (var26 > 0) {
								var53 += var26;
							}

							int var56 = var53;
							int var57 = var53;
							int var58;
							if (var25 > 0) {
								var58 = var51 * var25;
								var53 += var58;
								var57 += (var58 - var100) / 2;
							} else {
								var53 += var100;
							}

							var58 = var53;
							if (var27 > 0) {
								var53 += var27;
							}

							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63 = 0;
							int var64;
							if (var94 != null) {
								var53 += 2;
								var59 = var53;
								if (var36 > 0) {
									var53 += var36;
								}

								var53 += 2;
								var60 = var53;
								if (var38 > 0) {
									var53 += var38;
								}

								var61 = var53;
								var63 = var53;
								if (var37 > 0) {
									var64 = var52 * var37;
									var53 += var64;
									var63 += (var64 - var50) / 2;
								} else {
									var53 += var50;
								}

								var62 = var53;
								if (var39 > 0) {
									var53 += var39;
								}
							}

							var64 = var1.field1259[var82] - field541;
							int var65 = var87.field1919 - var87.field1919 * var64 / var87.field1922;
							int var66 = var87.field1928 * var64 / var87.field1922 + -var87.field1928;
							int var67 = var65 + (field644 + var3 - (var53 >> 1));
							int var68 = var4 + field611 - 12 + var66;
							int var69 = var68;
							int var70 = var68 + var44;
							int var71 = var87.field1932 + var68 + 15;
							int var72 = var71 - var99.field4792;
							int var73 = var99.field4793 + var71;
							if (var72 < var68) {
								var69 = var72;
							}

							if (var73 > var70) {
								var70 = var73;
							}

							int var74 = 0;
							int var75;
							int var76;
							if (var94 != null) {
								var74 = var94.field1932 + var68 + 15;
								var75 = var74 - var46.field4792;
								var76 = var46.field4793 + var74;
								if (var75 < var69) {
									;
								}

								if (var76 > var70) {
									;
								}
							}

							var75 = 255;
							if (var87.field1929 >= 0) {
								var75 = (var64 << 8) / (var87.field1922 - var87.field1929);
							}

							if (var75 >= 0 && var75 < 255) {
								if (var97 != null) {
									var97.method9625(var67 + var54 - var28, var68, var75);
								}

								if (var96 != null) {
									var96.method9625(var67 + var55 - var30, var68, var75);
								}

								if (var95 != null) {
									for (var76 = 0; var76 < var51; ++var76) {
										var95.method9625(var76 * var25 + (var67 + var56 - var29), var68, var75);
									}
								}

								if (var98 != null) {
									var98.method9625(var67 + var58 - var31, var68, var75);
								}

								var99.method8145(var47, var67 + var57, var71, var87.field1921, 0, var75);
								if (var94 != null) {
									if (var32 != null) {
										var32.method9625(var67 + var59 - var40, var68, var75);
									}

									if (var34 != null) {
										var34.method9625(var67 + var60 - var42, var68, var75);
									}

									if (var33 != null) {
										for (var76 = 0; var76 < var52; ++var76) {
											var33.method9625(var76 * var37 + (var67 + var61 - var41), var68, var75);
										}
									}

									if (var35 != null) {
										var35.method9625(var67 + var62 - var43, var68, var75);
									}

									var46.method8145(var48, var67 + var63, var74, var94.field1921, 0, var75);
								}
							} else {
								if (var97 != null) {
									var97.method9628(var67 + var54 - var28, var68);
								}

								if (var96 != null) {
									var96.method9628(var67 + var55 - var30, var68);
								}

								if (var95 != null) {
									for (var76 = 0; var76 < var51; ++var76) {
										var95.method9628(var76 * var25 + (var67 + var56 - var29), var68);
									}
								}

								if (var98 != null) {
									var98.method9628(var67 + var58 - var31, var68);
								}

								var99.method8248(var47, var67 + var57, var71, var87.field1921 | -16777216, 0);
								if (var94 != null) {
									if (var32 != null) {
										var32.method9628(var67 + var59 - var40, var68);
									}

									if (var34 != null) {
										var34.method9628(var67 + var60 - var42, var68);
									}

									if (var33 != null) {
										for (var76 = 0; var76 < var52; ++var76) {
											var33.method9628(var76 * var37 + (var67 + var61 - var41), var68);
										}
									}

									if (var35 != null) {
										var35.method9628(var67 + var62 - var43, var68);
									}

									var46.method8248(var48, var67 + var63, var74, var94.field1921 | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	@ObfInfo(owner = "mm", name = "jg", desc = "(IIIII)V", opaque = "-1949596511")
	public static void method6321(int var0, int var1, int var2, int var3) {
		field651 = 0;
		int var5 = (field170.field1266 >> 7) + field5093.field1019;
		int var6 = field5093.field1021 + (field170.field1229 >> 7);
		if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
			field651 = 1;
		}

		if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
			field651 = 1;
		}

		if (1 == field651 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
			field651 = 0;
		}

	}

	@ObfInfo(owner = "pv", name = "km", desc = "(Lde;Ldw;IB)V")
	public static void method7597(Class83 var0, Class101 var1, int var2) {
		Class350 var4 = var1.method2661(var0);
		method8077(var0, var4.field3748, var4.field3750, var1.field1266, var1.field1229, var2);
	}

	@ObfInfo(owner = "qu", name = "kg", desc = "(Lde;IIIIII)V", opaque = "488311101")
	public static void method8077(Class83 var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var7 = method3531(var0, var3, var4, var0.field1016) - var5;
			var1 -= field144;
			var7 -= field3664;
			var2 -= field850;
			int var8 = Class274.field2804[field4606];
			int var9 = Class274.field2805[field4606];
			int var10 = Class274.field2804[field3333];
			int var11 = Class274.field2805[field3333];
			int var12 = var11 * var1 + var10 * var2 >> 16;
			var2 = var11 * var2 - var10 * var1 >> 16;
			var1 = var12;
			var12 = var9 * var7 - var8 * var2 >> 16;
			var2 = var9 * var2 + var8 * var7 >> 16;
			if (var2 >= 50) {
				field644 = var1 * field814 / var2 + field812 / 2;
				field611 = field726 / 2 + field814 * var12 / var2;
			} else {
				field644 = -1;
				field611 = -1;
			}

		} else {
			field644 = -1;
			field611 = -1;
		}
	}

	@ObfInfo(owner = "gm", name = "ke", desc = "(Lde;IIIB)I", opaque = "3")
	public static int method3531(Class83 var0, int var1, int var2, int var3) {
		int var5 = var1 >> 7;
		int var6 = var2 >> 7;
		if (var5 >= 0 && var6 >= 0 && var5 < var0.field1023[0].length && var6 < var0.field1023[0][0].length) {
			int var7 = var3;
			if (var3 < 3 && 2 == (var0.field1023[1][var5][var6] & 2)) {
				var7 = var3 + 1;
			}

			int var8 = var1 & 127;
			int var9 = var2 & 127;
			int var10 = var0.field1025[var7][var5 + 1][var6] * var8 + var0.field1025[var7][var5][var6] * (128 - var8) >> 7;
			int var11 = (128 - var8) * var0.field1025[var7][var5][var6 + 1] + var8 * var0.field1025[var7][var5 + 1][var6 + 1] >> 7;
			return var10 * (128 - var9) + var11 * var9 >> 7;
		} else {
			return 0;
		}
	}

	@ObfInfo(owner = "du", name = "kh", desc = "(IIZI)V", opaque = "414622425")
	public static void method2648(int var0, int var1, boolean var2) {
		if (!var2 || var0 != field2818 || field1416 != var1) {
			field2818 = var0;
			field1416 = var1;
			Class131.method3063(25);
			field535 = true;
			method1172(Class367.field4154, true);
			int var4 = field5093.field1019;
			int var5 = field5093.field1021;
			field5093.field1019 = 8 * (var0 - 6);
			field5093.field1021 = 8 * (var1 - 6);
			int var6 = field5093.field1019 - var4;
			int var7 = field5093.field1021 - var5;
			var4 = field5093.field1019;
			var5 = field5093.field1021;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				Class102 var9 = field5093.field1013[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field1242;
						var10000[var10] -= var6;
						var10000 = var9.field1284;
						var10000[var10] -= var7;
					}

					var9.field1266 -= var6 * 128;
					var9.field1229 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				Class80 var19 = field5093.field1024[var8];
				if (var19 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var19.field1242;
						var10000[var10] -= var6;
						var10000 = var19.field1284;
						var10000[var10] -= var7;
					}

					var19.field1266 -= var6 * 128;
					var19.field1229 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				Class483 var20 = field5093.field1029[var8];
				if (var20 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var20.field5004;
						var10000[var10] -= var6;
						var10000 = var20.field4995;
						var10000[var10] -= var7;
					}

					var20.field4997 -= var6 * 128;
					var20.field4999 -= var7 * 128;
				}
			}

			byte var21 = 0;
			byte var22 = 104;
			byte var23 = 1;
			if (var6 < 0) {
				var21 = 103;
				var22 = -1;
				var23 = -1;
			}

			byte var11 = 0;
			byte var12 = 104;
			byte var13 = 1;
			if (var7 < 0) {
				var11 = 103;
				var12 = -1;
				var13 = -1;
			}

			int var15;
			for (int var14 = var21; var14 != var22; var14 += var23) {
				for (var15 = var11; var15 != var12; var15 += var13) {
					int var16 = var14 + var6;
					int var17 = var15 + var7;

					for (int var18 = 0; var18 < 4; ++var18) {
						if (0 <= var16 && var16 < 104 && 0 <= var17 && var17 < 104) {
							field5093.field1032[var18][var14][var15] = field5093.field1032[var18][var16][var17];
						} else {
							field5093.field1032[var18][var14][var15] = null;
						}
					}
				}
			}

			for (Class103 var24 = (Class103)field5093.field1033.method7526(); var24 != null; var24 = (Class103)field5093.field1033.method7511()) {
				var24.field1322 -= var6;
				var24.field1321 -= var7;
				if (var24.field1322 < 0 || 104 <= var24.field1322 || var24.field1321 < 0 || 104 <= var24.field1321) {
					var24.method9267();
				}
			}

			if (field778 != 0) {
				field778 -= var6;
				field779 -= var7;
			}

			field782 = 0;
			field792 = false;
			field144 -= var6 << 7;
			field850 -= var7 << 7;
			field4526 -= var6 << 7;
			field3275 -= var7 << 7;
			field658 = -1;
			field5093.field1035.method7518();
			field5093.field1022.method7518();

			for (var15 = 0; var15 < 4; ++var15) {
				field5093.field1015[var15].method4304();
			}

		}
	}

	@ObfInfo(owner = "av", name = "kf", desc = "(ZB)V", opaque = "13")
	public static void method301(boolean var0) {
		method3564();
		++field678.field1483;
		if (field678.field1483 >= 50 || var0) {
			field678.field1483 = 0;
			if (!field594 && field678.method3017() != null) {
				Class314 var2 = Class168.method3523(ClientPacket.field3442, field678.field1482);
				field678.method3013(var2);

				try {
					field678.method3012();
				} catch (IOException var4) {
					field594 = true;
				}
			}

		}
	}

	@ObfInfo(owner = "nt", name = "kd", desc = "(B)V", opaque = "-1")
	public static void method6578() {
		method301(false);
		field804 = 0;
		boolean var1 = true;

		int var2;
		for (var2 = 0; var2 < field2780.length; ++var2) {
			if (-1 != field1524[var2] && null == field2780[var2]) {
				field2780[var2] = field1869.method7132(field1524[var2], 0);
				if (field2780[var2] == null) {
					var1 = false;
					++field804;
				}
			}

			if (field1722[var2] != -1 && field4633[var2] == null) {
				field4633[var2] = field1869.method7170(field1722[var2], 0, field1372[var2]);
				if (field4633[var2] == null) {
					var1 = false;
					++field804;
				}
			}
		}

		if (!var1) {
			field601 = 1;
		} else {
			field599 = 0;
			var1 = true;

			int var4;
			int var5;
			for (var2 = 0; var2 < field2780.length; ++var2) {
				byte[] var3 = field4633[var2];
				if (var3 != null) {
					var4 = (field917[var2] >> 8) * 64 - field5093.field1019;
					var5 = (field917[var2] & 255) * 64 - field5093.field1021;
					if (field603) {
						var4 = 10;
						var5 = 10;
					}

					var1 &= Class16.method217(var3, var4, var5);
				}
			}

			if (!var1) {
				field601 = 2;
			} else {
				if (field601 != 0) {
					method1172(Class367.field4154 + Class111.field1393 + Class111.field1390 + 100 + "%" + Class111.field1391, true);
				}

				method3564();
				field5093.field1014.method5252();

				for (var2 = 0; var2 < 4; ++var2) {
					field5093.field1015[var2].method4304();
				}

				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							field5093.field1023[var2][var16][var4] = 0;
						}
					}
				}

				method3564();
				Class97.method4118();
				var2 = field2780.length;
				Class55.method1936();
				method301(true);
				int var18;
				if (!field603) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (field917[var16] >> 8) * 64 - field5093.field1019;
						var5 = 64 * (field917[var16] & 255) - field5093.field1021;
						var6 = field2780[var16];
						if (var6 != null) {
							method3564();
							Class97.method1137(field5093, var6, var4, var5, field2818 * 8 - 48, field1416 * 8 - 48);
						}
					}

					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (field917[var16] >> 8) * 64 - field5093.field1019;
						var5 = (field917[var16] & 255) * 64 - field5093.field1021;
						var6 = field2780[var16];
						if (var6 == null && field1416 < 800) {
							method3564();
							Class97.method5780(field5093, var4, var5, 64, 64);
						}
					}

					method301(true);

					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = field4633[var16];
						if (var17 != null) {
							var5 = (field917[var16] >> 8) * 64 - field5093.field1019;
							var18 = (field917[var16] & 255) * 64 - field5093.field1021;
							method3564();
							Class238.method4605(field5093, var17, var5, var18);
						}
					}
				}

				int var7;
				int var8;
				int var9;
				if (field603) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						method3564();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var19 = false;
								var7 = field604[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = var11 / 8 + (var10 / 8 << 8);

									for (int var13 = 0; var13 < field917.length; ++var13) {
										if (field917[var13] == var12 && field2780[var13] != null) {
											int var14 = 8 * (var10 - var4);
											int var15 = (var11 - var5) * 8;
											Class97.method4130(field5093, field2780[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, 8 * (var11 & 7), var9, var14, var15);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									Class97.method1170(field5093.field1025, var16, var4 * 8, var5 * 8);
								}
							}
						}
					}

					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = field604[0][var16][var4];
							if (var5 == -1) {
								Class97.method5780(field5093, var16 * 8, var4 * 8, 8, 8);
							}
						}
					}

					method301(true);

					for (var16 = 0; var16 < 4; ++var16) {
						method3564();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = field604[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = var10 / 8 + (var9 / 8 << 8);

									for (var12 = 0; var12 < field917.length; ++var12) {
										if (field917[var12] == var11 && null != field4633[var12]) {
											Class97.method2572(field5093, field4633[var12], var16, var4 * 8, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8);
											break;
										}
									}
								}
							}
						}
					}
				}

				method301(true);
				method3564();
				Class97.method888(field5093);
				method301(true);
				var16 = Class97.field1197;
				if (var16 > field5093.field1016) {
					var16 = field5093.field1016;
				}

				if (var16 < field5093.field1016 - 1) {
					var16 = field5093.field1016 - 1;
				}

				if (field687) {
					field5093.field1014.method5491(Class97.field1197);
				} else {
					field5093.field1014.method5491(0);
				}

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						method4651(field5093, var4, var5);
					}
				}

				method3564();
				method8899();
				Class197.field2128.method6332();
				Class314 var20;
				if (field4671.method629()) {
					var20 = Class168.method3523(ClientPacket.field3378, field678.field1482);
					var20.field3270.method9812(1057001181);
					field678.method3013(var20);
				}

				if (!field603) {
					var4 = (field2818 - 6) / 8;
					var5 = (field2818 + 6) / 8;
					var18 = (field1416 - 6) / 8;
					var7 = (field1416 + 6) / 8;

					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								field1869.method7179("m" + var8 + "_" + var9);
								field1869.method7179("l" + var8 + "_" + var9);
							}
						}
					}
				}

				method3564();
				Class337.method6392();
				var20 = Class168.method3523(ClientPacket.field3392, field678.field1482);
				field678.method3013(var20);
				Class45.method8829();
				field535 = false;
			}
		}
	}

	@ObfInfo(owner = "na", name = "kp", desc = "(IIIIII)V", opaque = "630338116")
	public static void method6402(int var0, int var1, int var2, int var3, int var4) {
		Class277 var6 = field5093.field1014;
		long var7 = var6.method5278(var0, var1, var2);
		int var9;
		int var10;
		int var11;
		int var12;
		int var16;
		int var25;
		if (0L != var7) {
			var9 = var6.method5282(var0, var1, var2, var7);
			var10 = var9 >> 6 & 3;
			var11 = var9 & 31;
			var12 = var3;
			boolean var14 = 0L != var7;
			if (var14) {
				boolean var15 = 1 == (int)(var7 >>> 16 & 1L);
				var14 = !var15;
			}

			if (var14) {
				var12 = var4;
			}

			int[] var24 = field2209.field5429;
			var25 = (103 - var2) * 2048 + 24624 + var1 * 4;
			var16 = Class296.method4404(var7);
			Class197 var17 = Class197.method61(var16);
			if (-1 != var17.field2130) {
				Class568 var18 = field4690[var17.field2130];
				if (var18 != null) {
					int var19 = (var17.field2140 * 4 - var18.field5495) / 2;
					int var20 = (var17.field2141 * 4 - var18.field5496) / 2;
					var18.method10122(var1 * 4 + 48 + var19, 48 + 4 * (104 - var2 - var17.field2141) + var20);
				}
			} else {
				if (var11 == 0 || var11 == 2) {
					if (var10 == 0) {
						var24[var25] = var12;
						var24[var25 + 512] = var12;
						var24[var25 + 1024] = var12;
						var24[var25 + 1536] = var12;
					} else if (var10 == 1) {
						var24[var25] = var12;
						var24[var25 + 1] = var12;
						var24[var25 + 2] = var12;
						var24[var25 + 3] = var12;
					} else if (var10 == 2) {
						var24[var25 + 3] = var12;
						var24[512 + var25 + 3] = var12;
						var24[1024 + var25 + 3] = var12;
						var24[var25 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var24[var25 + 1536] = var12;
						var24[var25 + 1536 + 1] = var12;
						var24[var25 + 1536 + 2] = var12;
						var24[3 + var25 + 1536] = var12;
					}
				}

				if (var11 == 3) {
					if (var10 == 0) {
						var24[var25] = var12;
					} else if (var10 == 1) {
						var24[var25 + 3] = var12;
					} else if (var10 == 2) {
						var24[var25 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var24[var25 + 1536] = var12;
					}
				}

				if (var11 == 2) {
					if (var10 == 3) {
						var24[var25] = var12;
						var24[var25 + 512] = var12;
						var24[var25 + 1024] = var12;
						var24[var25 + 1536] = var12;
					} else if (var10 == 0) {
						var24[var25] = var12;
						var24[var25 + 1] = var12;
						var24[var25 + 2] = var12;
						var24[var25 + 3] = var12;
					} else if (var10 == 1) {
						var24[var25 + 3] = var12;
						var24[512 + var25 + 3] = var12;
						var24[var25 + 3 + 1024] = var12;
						var24[var25 + 3 + 1536] = var12;
					} else if (var10 == 2) {
						var24[var25 + 1536] = var12;
						var24[1 + var25 + 1536] = var12;
						var24[var25 + 1536 + 2] = var12;
						var24[var25 + 1536 + 3] = var12;
					}
				}
			}
		}

		var7 = var6.method5280(var0, var1, var2);
		if (0L != var7) {
			var9 = var6.method5282(var0, var1, var2, var7);
			var10 = var9 >> 6 & 3;
			var11 = var9 & 31;
			var12 = Class296.method4404(var7);
			Class197 var13 = Class197.method61(var12);
			if (-1 != var13.field2130) {
				Class568 var26 = field4690[var13.field2130];
				if (var26 != null) {
					var25 = (var13.field2140 * 4 - var26.field5495) / 2;
					var16 = (var13.field2141 * 4 - var26.field5496) / 2;
					var26.method10122(var25 + 48 + var1 * 4, 4 * (104 - var2 - var13.field2141) + 48 + var16);
				}
			} else if (var11 == 9) {
				int var27 = 15658734;
				boolean var28 = 0L != var7;
				if (var28) {
					boolean var29 = 1 == (int)(var7 >>> 16 & 1L);
					var28 = !var29;
				}

				if (var28) {
					var27 = 15597568;
				}

				int[] var30 = field2209.field5429;
				int var31 = 24624 + var1 * 4 + 2048 * (103 - var2);
				if (var10 != 0 && var10 != 2) {
					var30[var31] = var27;
					var30[1 + var31 + 512] = var27;
					var30[var31 + 1024 + 2] = var27;
					var30[3 + var31 + 1536] = var27;
				} else {
					var30[var31 + 1536] = var27;
					var30[1 + var31 + 1024] = var27;
					var30[2 + var31 + 512] = var27;
					var30[var31 + 3] = var27;
				}
			}
		}

		var7 = var6.method5384(var0, var1, var2);
		if (0L != var7) {
			var9 = Class296.method4404(var7);
			Class197 var21 = Class197.method61(var9);
			if (-1 != var21.field2130) {
				Class568 var22 = field4690[var21.field2130];
				if (var22 != null) {
					var12 = (var21.field2140 * 4 - var22.field5495) / 2;
					int var23 = (var21.field2141 * 4 - var22.field5496) / 2;
					var22.method10122(var12 + var1 * 4 + 48, 48 + (104 - var2 - var21.field2141) * 4 + var23);
				}
			}
		}

	}

	@ObfInfo(owner = "lk", name = "kz", desc = "(IIIIIB)V", opaque = "1")
	public static void method5807(int var0, int var1, int var2, int var3, int var4) {
		Class408 var6 = field94.field1032[var0][var1][var2];
		if (var6 != null) {
			for (Class119 var7 = (Class119)var6.method7526(); var7 != null; var7 = (Class119)var6.method7511()) {
				if ((var3 & 32767) == var7.field1439) {
					var7.method2960(var4);
					break;
				}
			}
		}

	}

	@ObfInfo(owner = "il", name = "kn", desc = "(IIIIIIIIIIIIIII)V")
	public static void method4248(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = 64 + var2 * 128;
		var3 = 64 + var3 * 128;
		var4 = var4 * 128 + 64;
		Class84 var15 = new Class84(var6, var0, var1, var2, method3531(field94, var1, var2, var0) - var7, var9 + field541, var10 + field541, var11, var12, var13, var5, var8);
		var15.method2329(var3, var4, method3531(field94, var3, var4, var0) - var8, field541 + var9);
		field94.field1022.method7506(var15);
	}

	@ObfInfo(owner = "kj", name = "kc", desc = "(IIIIIB)V", opaque = "64")
	public static void method5101(int var0, int var1, int var2, int var3, int var4) {
		Class408 var6 = field94.field1032[var0][var1][var2];
		if (var6 != null) {
			for (Class119 var7 = (Class119)var6.method7526(); var7 != null; var7 = (Class119)var6.method7511()) {
				if (var7.field1439 == (var3 & 32767) && var4 == var7.field1443) {
					var7.method9267();
					break;
				}
			}

			if (var6.method7526() == null) {
				field94.field1032[var0][var1][var2] = null;
			}

			method4907(var0, var1, var2);
		}

	}

	@ObfInfo(owner = "bv", name = "kj", desc = "(IIIIIIIIIZI)V")
	public static void method804(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		Class119 var11 = new Class119();
		var11.field1439 = var3;
		var11.field1443 = var4;
		var11.method2960(var5);
		var11.field1441 = var6 + field542;
		var11.field1442 = field542 + var7;
		var11.field1440 = var8;
		var11.field1444 = var9;
		if (field94.field1032[var0][var1][var2] == null) {
			field94.field1032[var0][var1][var2] = new Class408();
		}

		field94.field1032[var0][var1][var2].method7506(var11);
		method4907(var0, var1, var2);
	}

	@ObfInfo(owner = "bx", name = "ky", desc = "(IIIIIII)Z")
	public static boolean method881(int var0, int var1, int var2, int var3, int var4, int var5) {
		return Class127.method3033(field94.field1016, var0, var1, var2, var3, var4, var5);
	}

	@ObfInfo(owner = "be", name = "kq", desc = "(Lde;IIIIIIIIIII)V", opaque = "-759023511")
	public static void method438(Class83 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		Class408 var12 = var0.field1033;
		Class103 var13 = null;

		for (Class103 var14 = (Class103)var12.method7526(); var14 != null; var14 = (Class103)var12.method7511()) {
			if (var14.field1318 == var1 && var2 == var14.field1322 && var14.field1321 == var3 && var14.field1316 == var4) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new Class103();
			var13.field1318 = var1;
			var13.field1316 = var4;
			var13.field1322 = var2;
			var13.field1321 = var3;
			var13.field1325 = -1;
			method3077(var0, var13);
			var12.method7506(var13);
		}

		var13.field1319 = var5;
		var13.field1330 = var6;
		var13.field1323 = var7;
		var13.field1328 = var9;
		var13.field1317 = var10;
		var13.method2774(var8);
	}

	@ObfInfo(owner = "rt", name = "kx", desc = "(Lde;IIIIB)Ldy;", opaque = "-1")
	public static Class103 method8467(Class83 var0, int var1, int var2, int var3, int var4) {
		for (Class103 var6 = (Class103)var0.field1033.method7526(); var6 != null; var6 = (Class103)var0.field1033.method7511()) {
			if (var1 == var6.field1318 && var6.field1322 == var2 && var3 == var6.field1321 && var6.field1316 == var4) {
				return var6;
			}
		}

		return null;
	}

	@ObfInfo(owner = "tg", name = "ka", desc = "(B)V", opaque = "30")
	public static void method8899() {
		for (Class103 var1 = (Class103)field5093.field1033.method7526(); var1 != null; var1 = (Class103)field5093.field1033.method7511()) {
			if (var1.field1317 == -1) {
				var1.field1328 = 0;
				method3077(field5093, var1);
			} else {
				var1.method9267();
			}
		}

	}

	@ObfInfo(owner = "fb", name = "kt", desc = "(Lde;Ldy;I)V", opaque = "-2090450700")
	public static void method3077(Class83 var0, Class103 var1) {
		Class277 var3 = var0.field1014;
		long var4 = 0L;
		int var6 = -1;
		int var7 = 0;
		int var8 = 0;
		if (var1.field1316 == 0) {
			var4 = var3.method5278(var1.field1318, var1.field1322, var1.field1321);
		}

		if (var1.field1316 == 1) {
			var4 = var3.method5279(var1.field1318, var1.field1322, var1.field1321);
		}

		if (var1.field1316 == 2) {
			var4 = var3.method5280(var1.field1318, var1.field1322, var1.field1321);
		}

		if (var1.field1316 == 3) {
			var4 = var3.method5384(var1.field1318, var1.field1322, var1.field1321);
		}

		if (var4 != 0L) {
			int var9 = var3.method5282(var1.field1318, var1.field1322, var1.field1321, var4);
			var6 = Class296.method4404(var4);
			var7 = var9 & 31;
			var8 = var9 >> 6 & 3;
		}

		var1.field1324 = var6;
		var1.field1329 = var7;
		var1.field1320 = var8;
	}

	@ObfInfo(owner = "hb", name = "lk", desc = "(Lde;B)V", opaque = "2")
	public static void method3709(Class83 var0) {
		for (Class103 var2 = (Class103)var0.field1033.method7526(); var2 != null; var2 = (Class103)var0.field1033.method7511()) {
			if (var2.field1317 > 0) {
				--var2.field1317;
			}

			boolean var3;
			int var4;
			int var5;
			Class197 var6;
			if (var2.field1317 == 0) {
				if (var2.field1324 >= 0) {
					var4 = var2.field1324;
					var5 = var2.field1329;
					var6 = Class197.method61(var4);
					if (var5 == 11) {
						var5 = 10;
					}

					if (var5 >= 5 && var5 <= 8) {
						var5 = 4;
					}

					var3 = var6.method3900(var5);
					if (!var3) {
						continue;
					}
				}

				method7697(var0, var2.field1318, var2.field1316, var2.field1322, var2.field1321, var2.field1324, var2.field1320, var2.field1329, var2.field1325);
				var2.method9267();
			} else {
				if (var2.field1328 > 0) {
					--var2.field1328;
				}

				if (0 == var2.field1328 && var2.field1322 >= 1 && var2.field1321 >= 1 && var2.field1322 <= 102 && var2.field1321 <= 102) {
					if (var2.field1319 >= 0) {
						var4 = var2.field1319;
						var5 = var2.field1330;
						var6 = Class197.method61(var4);
						if (var5 == 11) {
							var5 = 10;
						}

						if (var5 >= 5 && var5 <= 8) {
							var5 = 4;
						}

						var3 = var6.method3900(var5);
						if (!var3) {
							continue;
						}
					}

					method7697(var0, var2.field1318, var2.field1316, var2.field1322, var2.field1321, var2.field1319, var2.field1323, var2.field1330, var2.field1325);
					var2.field1328 = -1;
					if (var2.field1319 == var2.field1324 && var2.field1324 == -1) {
						var2.method9267();
					} else if (var2.field1319 == var2.field1324 && var2.field1320 == var2.field1323 && var2.field1329 == var2.field1330) {
						var2.method9267();
					}
				}
			}
		}

	}

	@ObfInfo(owner = "qa", name = "lf", desc = "(Lde;IIIIIIIII)V", opaque = "-1453069211")
	public static void method7697(Class83 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Class277 var10 = var0.field1014;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.field1030 - 1 && var4 <= var0.field1018 - 1) {
			if (field687 && var1 != var0.field1016) {
				return;
			}

			long var11 = 0L;
			boolean var13 = true;
			boolean var14 = false;
			boolean var15 = false;
			if (var2 == 0) {
				var11 = var10.method5278(var1, var3, var4);
			}

			if (var2 == 1) {
				var11 = var10.method5279(var1, var3, var4);
			}

			if (var2 == 2) {
				var11 = var10.method5280(var1, var3, var4);
			}

			if (var2 == 3) {
				var11 = var10.method5384(var1, var3, var4);
			}

			int var16;
			Class197 var17;
			if (var11 != 0L) {
				var16 = var10.method5282(var1, var3, var4, var11);
				int var18 = Class296.method4404(var11);
				int var19 = var16 & 31;
				int var20 = var16 >> 6 & 3;
				var17 = Class197.method61(var18);
				Class34.method470(var1, var3, var4, var17, var20);
				if (var2 == 0) {
					var10.method5389(var1, var3, var4);
					if (0 != var17.field2126) {
						var0.field1015[var1].method4333(var3, var4, var19, var20, var17.field2143);
					}
				}

				if (var2 == 1) {
					var10.method5270(var1, var3, var4);
				}

				if (var2 == 2) {
					var10.method5500(var1, var3, var4);
					if (var17.field2140 + var3 > var0.field1030 - 1 || var4 + var17.field2140 > var0.field1018 - 1 || var17.field2141 + var3 > var0.field1030 - 1 || var17.field2141 + var4 > var0.field1018 - 1) {
						return;
					}

					if (0 != var17.field2126) {
						var0.field1015[var1].method4310(var3, var4, var17.field2140, var17.field2141, var20, var17.field2143);
					}
				}

				if (var2 == 3) {
					var10.method5272(var1, var3, var4);
					if (1 == var17.field2126) {
						var0.field1015[var1].method4312(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var16 = var1;
				if (var1 < 3 && (var0.field1023[1][var3][var4] & 2) == 2) {
					var16 = var1 + 1;
				}

				Class53.method1123(var0, var1, var16, var3, var4, var5, var6, var7, var8, var0.field1015[var1]);
				var17 = Class197.method61(var5);
				if (var17 != null && var17.method3908()) {
					Class55.method3129(var16, var3, var4, var17, var6);
				}
			}
		}

	}

	@ObfInfo(owner = "jf", name = "lq", desc = "(Lde;III)V")
	public static void method4651(Class83 var0, int var1, int var2) {
		Class306.method5852(var0, var0.field1016, var1, var2);
	}

	@ObfInfo(owner = "jq", name = "li", desc = "(IIII)V")
	public static void method4907(int var0, int var1, int var2) {
		Class306.method5852(field94, var0, var1, var2);
	}

	@ObfInfo(owner = "ap", name = "lr", desc = "(Lde;Lug;I)V", opaque = "505511409")
	public static void method219(Class83 var0, Class527 var1) {
		int var3 = var1.method9997();
		Class483 var4 = var0.field1029[var3];
		Class83 var5 = var4.field5001;
		var5.field1019 = var1.method9997();
		var5.field1021 = var1.method9997();
		var5.field1017.method2878(var1, false);
		int var6 = var5.field1030 / 8;
		int var7 = var5.field1018 / 8;
		int var8 = var1.method9997();
		var1.method9346();

		int var9;
		int var10;
		int var11;
		int var12;
		for (var9 = 0; var9 < 4; ++var9) {
			for (var10 = 0; var10 < var6; ++var10) {
				for (var11 = 0; var11 < var7; ++var11) {
					var12 = var1.method9347(1);
					if (var12 == 1) {
						field709[var9][var10][var11] = var1.method9347(26);
					} else {
						field709[var9][var10][var11] = -1;
					}
				}
			}
		}

		var1.method9348();
		field856 = new int[var8][4];

		for (var9 = 0; var9 < var8; ++var9) {
			for (var10 = 0; var10 < 4; ++var10) {
				field856[var9][var10] = var1.method9832();
			}
		}

		field2708 = new int[var8];
		field209 = new int[var8];
		field1684 = new int[var8];
		field4946 = new byte[var8][];
		field4542 = new byte[var8][];
		var8 = 0;

		for (var9 = 0; var9 < 4; ++var9) {
			for (var10 = 0; var10 < var6; ++var10) {
				for (var11 = 0; var11 < var7; ++var11) {
					var12 = field709[var9][var10][var11];
					if (var12 != -1) {
						int var13 = var12 >> 14 & 1023;
						int var14 = var12 >> 3 & 2047;
						int var15 = (var13 / 8 << 8) + var14 / 8;

						int var16;
						for (var16 = 0; var16 < var8; ++var16) {
							if (var15 == field2708[var16]) {
								var15 = -1;
								break;
							}
						}

						if (var15 != -1) {
							field2708[var8] = var15;
							var16 = var15 >> 8 & 255;
							int var17 = var15 & 255;
							field209[var8] = field1869.method7150("m" + var16 + "_" + var17);
							field1684[var8] = field1869.method7150("l" + var16 + "_" + var17);
							++var8;
						}
					}
				}
			}
		}

		Class131.method3063(25);
		field536 = true;
		field1849 = var5;
		Class194.method3886(var5);
	}

	@ObfInfo(owner = "ke", name = "lv", desc = "(Lde;ZLug;I)V", opaque = "126231503")
	public static void method5045(Class83 var0, boolean var1, Class527 var2) {
		field665 = 0;
		field590 = 0;
		var2.method9346();
		int var4 = var2.method9347(8);
		int var5;
		if (var4 < var0.field1027) {
			for (var5 = var4; var5 < var0.field1027; ++var5) {
				field670[++field665 - 1] = var0.field1028[var5];
			}
		}

		if (var4 > var0.field1027) {
			throw new RuntimeException("");
		} else {
			var0.field1027 = 0;

			int var8;
			int var9;
			int var10;
			int var11;
			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var0.field1028[var5];
				Class102 var7 = var0.field1013[var6];
				var8 = var2.method9347(1);
				if (var8 == 0) {
					var0.field1028[++var0.field1027 - 1] = var6;
					var7.field1278 = field541;
				} else {
					var9 = var2.method9347(2);
					if (var9 == 0) {
						var0.field1028[++var0.field1027 - 1] = var6;
						var7.field1278 = field541;
						field591[++field590 - 1] = var6;
					} else if (var9 == 1) {
						var0.field1028[++var0.field1027 - 1] = var6;
						var7.field1278 = field541;
						var10 = var2.method9347(3);
						var7.method2705(var10, Class236.field2511);
						var11 = var2.method9347(1);
						if (var11 == 1) {
							field591[++field590 - 1] = var6;
						}
					} else if (var9 == 2) {
						var0.field1028[++var0.field1027 - 1] = var6;
						var7.field1278 = field541;
						if (var2.method9347(1) == 1) {
							var10 = var2.method9347(3);
							var7.method2705(var10, Class236.field2501);
							var11 = var2.method9347(3);
							var7.method2705(var11, Class236.field2501);
						} else {
							var10 = var2.method9347(3);
							var7.method2705(var10, Class236.field2512);
						}

						var10 = var2.method9347(1);
						if (var10 == 1) {
							field591[++field590 - 1] = var6;
						}
					} else if (var9 == 3) {
						field670[++field665 - 1] = var6;
					}
				}
			}

			Class36.method523(var0, var1, var2);

			for (var4 = 0; var4 < field590; ++var4) {
				var5 = field591[var4];
				Class102 var16 = var0.field1013[var5];
				int var17 = var2.method9902();
				if ((var17 & 128) != 0) {
					var8 = var2.method9902();
					var17 += var8 << 8;
				}

				if (0 != (var17 & 512)) {
					var8 = var2.method9902();
					var17 += var8 << 16;
				}

				if ((var17 & 65536) != 0) {
					var8 = var2.method9882();
					var16.field1235 = 0 != (var8 & 1) ? var2.method9997() : var16.field1309.field1937;
					var16.field1245 = (var8 & 2) != 0 ? var2.method9981() : var16.field1309.field1948;
					var16.field1237 = (var8 & 4) != 0 ? var2.method9868() : var16.field1309.field1949;
					var16.field1238 = (var8 & 8) != 0 ? var2.method9869() : var16.field1309.field1944;
					var16.field1239 = 0 != (var8 & 16) ? var2.method9868() : var16.field1309.field1951;
					var16.field1260 = 0 != (var8 & 32) ? var2.method9869() : var16.field1309.field1952;
					var16.field1241 = 0 != (var8 & 64) ? var2.method9868() : var16.field1309.field1953;
					var16.field1300 = (var8 & 128) != 0 ? var2.method9869() : var16.field1309.field1959;
					var16.field1257 = 0 != (var8 & 256) ? var2.method9868() : var16.field1309.field1955;
					var16.field1240 = (var8 & 512) != 0 ? var2.method9981() : var16.field1309.field1982;
					var16.field1243 = 0 != (var8 & 1024) ? var2.method9981() : var16.field1309.field1957;
					var16.field1246 = (var8 & 2048) != 0 ? var2.method9997() : var16.field1309.field1958;
					var16.field1287 = 0 != (var8 & 4096) ? var2.method9869() : var16.field1309.field1964;
					var16.field1248 = (var8 & 8192) != 0 ? var2.method9997() : var16.field1309.field1960;
					var16.field1234 = 0 != (var8 & 16384) ? var2.method9981() : var16.field1309.field1946;
				}

				int var12;
				int var13;
				if ((var17 & 1) != 0) {
					var8 = var2.method9902();
					int var14;
					if (var8 > 0) {
						for (var9 = 0; var9 < var8; ++var9) {
							var11 = -1;
							var12 = -1;
							var13 = -1;
							var10 = var2.method9842();
							if (var10 == 32767) {
								var10 = var2.method9842();
								var12 = var2.method9842();
								var11 = var2.method9842();
								var13 = var2.method9842();
							} else if (var10 != 32766) {
								var12 = var2.method9842();
							} else {
								var10 = -1;
							}

							var14 = var2.method9842();
							var16.method2674(var10, var12, var11, var13, field541, var14);
						}
					}

					var9 = var2.method9860();
					if (var9 > 0) {
						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var2.method9842();
							var12 = var2.method9842();
							if (var12 != 32767) {
								var13 = var2.method9842();
								var14 = var2.method9860();
								int var15 = var12 > 0 ? var2.method9859() : var14;
								var16.method2653(var11, field541, var12, var13, var14, var15);
							} else {
								var16.method2670(var11);
							}
						}
					}
				}

				if ((var17 & 262144) != 0) {
					var8 = var2.method9902();

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var2.method9902();
						var11 = var2.method9868();
						var12 = var2.method9882();
						var16.method2654(var10, var11, var12 >> 16, var12 & 65535);
					}
				}

				if ((var17 & 8) != 0) {
					var8 = var2.method9869();
					if (var8 == 65535) {
						var8 = -1;
					}

					var9 = var2.method9861();
					if (var8 == var16.field1273 && var8 != -1) {
						var10 = Class344.method6474(var8).field2370;
						if (var10 == 1) {
							var16.field1274 = 0;
							var16.field1275 = 0;
							var16.field1276 = var9;
							var16.field1252 = 0;
						}

						if (var10 == 2) {
							var16.field1252 = 0;
						}
					} else if (var8 == -1 || -1 == var16.field1273 || Class344.method6474(var8).field2363 >= Class344.method6474(var16.field1273).field2363) {
						var16.field1273 = var8;
						var16.field1274 = 0;
						var16.field1275 = 0;
						var16.field1276 = var9;
						var16.field1252 = 0;
						var16.field1303 = var16.field1267;
					}
				}

				if ((var17 & 8192) != 0) {
					var16.field1304 = var2.method9832();
				}

				if ((var17 & 2048) != 0) {
					var16.field1289 = field541 + var2.method9997();
					var16.field1253 = field541 + var2.method9981();
					var16.field1261 = var2.method9864();
					var16.field1292 = var2.method10018();
					var16.field1293 = var2.method10018();
					var16.field1277 = (byte)var2.method9861();
				}

				if (0 != (var17 & 16)) {
					var16.field1309 = Class184.method2222(var2.method9868());
					method8727(var16);
					var16.method2725();
				}

				if (0 != (var17 & 4096)) {
					var16.method2702(var2.method9861());
				}

				if ((var17 & 32) != 0) {
					var16.field1228 = var2.method9997();
					var16.field1228 += var2.method9902() << 16;
					var8 = 16777215;
					if (var8 == var16.field1228) {
						var16.field1228 = -1;
					}
				}

				int[] var18;
				short[] var19;
				short[] var20;
				long var21;
				boolean var22;
				if ((var17 & 32768) != 0) {
					var8 = var2.method9861();
					if ((var8 & 1) == 1) {
						var16.method2731();
					} else {
						var18 = null;
						if ((var8 & 2) == 2) {
							var10 = var2.method9902();
							var18 = new int[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var12 = var2.method9981();
								var12 = var12 == 65535 ? -1 : var12;
								var18[var11] = var12;
							}
						}

						var19 = null;
						if ((var8 & 4) == 4) {
							var11 = 0;
							if (var16.field1309.field1986 != null) {
								var11 = var16.field1309.field1986.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var2.method9981();
							}
						}

						var20 = null;
						if (8 == (var8 & 8)) {
							var12 = 0;
							if (var16.field1309.field1950 != null) {
								var12 = var16.field1309.field1950.length;
							}

							var20 = new short[var12];

							for (var13 = 0; var13 < var12; ++var13) {
								var20[var13] = (short)var2.method9868();
							}
						}

						var22 = false;
						if ((var8 & 16) != 0) {
							var22 = var2.method9902() == 1;
						}

						var21 = (long)(++Class102.field1311 - 1);
						var16.method2716(new Class190(var21, var18, var19, var20, var22));
					}
				}

				if ((var17 & 16384) != 0) {
					var8 = var2.method9860();
					if ((var8 & 1) == 1) {
						var16.method2717();
					} else {
						var18 = null;
						if (2 == (var8 & 2)) {
							var10 = var2.method9859();
							var18 = new int[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var12 = var2.method9997();
								var12 = var12 == 65535 ? -1 : var12;
								var18[var11] = var12;
							}
						}

						var19 = null;
						if ((var8 & 4) == 4) {
							var11 = 0;
							if (var16.field1309.field1986 != null) {
								var11 = var16.field1309.field1986.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var2.method9868();
							}
						}

						var20 = null;
						if ((var8 & 8) == 8) {
							var12 = 0;
							if (var16.field1309.field1950 != null) {
								var12 = var16.field1309.field1950.length;
							}

							var20 = new short[var12];

							for (var13 = 0; var13 < var12; ++var13) {
								var20[var13] = (short)var2.method9997();
							}
						}

						var22 = false;
						if (0 != (var8 & 16)) {
							var22 = var2.method9859() == 1;
						}

						var21 = (long)(++Class102.field1313 - 1);
						var16.method2714(new Class190(var21, var18, var19, var20, var22));
					}
				}

				if ((var17 & 4) != 0) {
					var16.field1249 = var2.method9837();
					var16.field1244 = 100;
				}

				if ((var17 & 1024) != 0) {
					var16.field1280 = var2.method9863();
					var16.field1282 = var2.method10018();
					var16.field1281 = var2.method9863();
					var16.field1283 = var2.method9863();
					var16.field1291 = var2.method9997() + field541;
					var16.field1298 = var2.method9997() + field541;
					var16.field1286 = var2.method9868();
					var16.field1267 = 1;
					var16.field1303 = 0;
					var16.field1280 += var16.field1242[0];
					var16.field1282 += var16.field1284[0];
					var16.field1281 += var16.field1242[0];
					var16.field1283 += var16.field1284[0];
				}

				if (0 != (var17 & 256)) {
					var16.method2700(var2.method9837());
				}

				if ((var17 & 2) != 0) {
					var2.method9869();
					var2.method9855();
				}

				if (0 != (var17 & 131072)) {
					var8 = var2.method9859();
					var18 = new int[8];
					var19 = new short[8];

					for (var11 = 0; var11 < 8; ++var11) {
						if ((var8 & 1 << var11) != 0) {
							var18[var11] = var2.method9871();
							var19[var11] = (short)var2.method9843();
						} else {
							var18[var11] = -1;
							var19[var11] = -1;
						}
					}

					var16.method2712(var18, var19);
				}

				if (0 != (var17 & 64)) {
					var8 = var2.method9981();
					var9 = var2.method9997();
					var16.field1268 = var2.method9859() == 1;
					var16.field1290 = var8;
					var16.field1263 = var9;
				}
			}

			for (var4 = 0; var4 < field665; ++var4) {
				var5 = field670[var4];
				if (var0.field1013[var5].field1278 != field541) {
					var0.field1013[var5].field1309 = null;
					var0.field1013[var5] = null;
				}
			}

			if (field678.field1485 != var2.field5471) {
				throw new RuntimeException(var2.field5471 + Class111.field1396 + field678.field1485);
			} else {
				for (var4 = 0; var4 < var0.field1027; ++var4) {
					if (var0.field1013[var0.field1028[var4]] == null) {
						throw new RuntimeException(var4 + Class111.field1396 + var0.field1027);
					}
				}

			}
		}
	}

	@ObfInfo(owner = "sm", name = "lm", desc = "(Ldx;I)V")
	public static void method8727(Class102 var0) {
		var0.field1232 = var0.field1309.field1943;
		var0.field1297 = var0.field1309.field1973;
		var0.field1237 = var0.field1309.field1949;
		var0.field1238 = var0.field1309.field1944;
		var0.field1239 = var0.field1309.field1951;
		var0.field1260 = var0.field1309.field1952;
		var0.field1234 = var0.field1309.field1946;
		var0.field1235 = var0.field1309.field1937;
		var0.field1245 = var0.field1309.field1948;
		var0.field1241 = var0.field1309.field1953;
		var0.field1300 = var0.field1309.field1959;
		var0.field1257 = var0.field1309.field1955;
		var0.field1240 = var0.field1309.field1982;
		var0.field1243 = var0.field1309.field1957;
		var0.field1246 = var0.field1309.field1958;
		var0.field1287 = var0.field1309.field1964;
		var0.field1248 = var0.field1309.field1960;
	}

	@ObfInfo(owner = "ri", name = "lt", desc = "(III)Ljv;")
	public static Class256 method8331(int var0, int var1) {
		field671.field2674 = var0;
		field671.field2671 = var1;
		field671.field2672 = 1;
		field671.field2670 = 1;
		return field671;
	}

	@ObfInfo(owner = "bn", name = "ld", desc = "(B)V")
	public static void method566() {
		field602 = 0;
		field672 = false;
		field679[0] = -1;
		field680[0] = Class367.field4139;
		field681[0] = "";
		field783[0] = 1006;
		field554[0] = false;
		field602 = 1;
	}

	@ObfInfo(owner = "jk", name = "lo", desc = "(III)V", opaque = "-79094764")
	public static void method4723(int var0, int var1) {
		if (field602 >= 2 || 0 != field614 || field692) {
			if (field621) {
				int var3 = field602 - 1;
				String var5;
				if (field614 == 1 && field602 < 2) {
					var5 = Class367.field4035 + Class367.field4253 + field668 + " " + Class111.field1392;
				} else if (field692 && field602 < 2) {
					var5 = field695 + Class367.field4253 + field696 + " " + Class111.field1392;
				} else {
					var5 = method4664(var3);
				}

				if (field602 > 2) {
					var5 = var5 + Class111.method3839(16777215) + " " + '/' + " " + (field602 - 2) + Class367.field4214;
				}

				field2002.method8157(var5, var0 + 4, var1 + 15, 16777215, 0, field541 / 1000);
			}
		}
	}

	@ObfInfo(owner = "eq", name = "lz", desc = "(I)V", opaque = "1975017004")
	public static void method2985() {
		int var1 = field1473;
		int var2 = field1453;
		int var3 = field3474;
		int var4 = field2727;
		int var5 = 6116423;
		Class569.method10138(var1, var2, var3, var4, var5);
		Class569.method10138(var1 + 1, var2 + 1, var3 - 2, 16, 0);
		Class569.method10142(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
		field2002.method8248(Class367.field4202, var1 + 3, var2 + 14, var5, -1);
		int var6 = Class42.field231;
		int var7 = Class42.field221;

		for (int var8 = 0; var8 < field602; ++var8) {
			int var9 = 15 * (field602 - 1 - var8) + var2 + 31;
			int var10 = 16777215;
			if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 16776960;
			}

			field2002.method8248(method4664(var8), var1 + 3, var9, var10, 0);
		}

		method2323(field1473, field1453, field3474, field2727);
	}

	@ObfInfo(owner = "ei", name = "lb", desc = "(B)Z")
	public static boolean method2906() {
		return field672;
	}

	@ObfInfo(owner = "fb", name = "la", desc = "(IIIII)V", opaque = "-974049480")
	public static void method3076(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < field666; ++var5) {
			if (field750[var5] + field752[var5] > var0 && field750[var5] < var2 + var0 && field751[var5] + field598[var5] > var1 && field751[var5] < var3 + var1) {
				field747[var5] = true;
			}
		}

	}

	@ObfInfo(owner = "de", name = "lh", desc = "(IIIII)V", opaque = "592473380")
	public static void method2323(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < field666; ++var5) {
			if (field752[var5] + field750[var5] > var0 && field750[var5] < var2 + var0 && field598[var5] + field751[var5] > var1 && field751[var5] < var3 + var1) {
				field748[var5] = true;
			}
		}

	}

	@ObfInfo(owner = "mk", name = "le", desc = "(II)Z", opaque = "-1234876312")
	public static boolean method6318(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = field783[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}

	@ObfInfo(owner = "jj", name = "ly", desc = "(Lcj;III)V", opaque = "1850523621")
	public static void method4691(Class62 var0, int var1, int var2) {
		if (var0 != null) {
			method1274(var0.field470, var0.field469, var0.field472, var0.field471, var0.field474, var0.field473, var0.field468, var0.field475, var1, var2);
		}

	}

	@ObfInfo(owner = "cj", name = "lg", desc = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V", opaque = "0")
	public static void method1274(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		Class83 var11 = null;
		if (var5 >= 0 && field5093.field1029[var5] != null) {
			var11 = field5093.field1029[var5].field5001;
		} else if (var5 == -1) {
			var11 = field5093;
		}

		if (var11 != null) {
			int var12 = var11.field1019;
			int var13 = var11.field1021;
			Class102[] var14 = var11.field1013;
			Class80[] var15 = var11.field1024;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			Class314 var16;
			if (var2 == 1002) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				var16 = Class168.method3523(ClientPacket.field3401, field678.field1482);
				var16.field3270.method10036(var3);
				field678.method3013(var16);
			}

			Class314 var17;
			Class102 var19;
			if (var2 == 7) {
				var19 = var14[var3];
				if (var19 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3370, field678.field1482);
					var17.field3270.method9812(field97);
					var17.field3270.method9866(var3);
					var17.field3270.method9809(field754.method4191(82) ? 1 : 0);
					var17.field3270.method9810(field3662);
					var17.field3270.method10036(field205);
					field678.method3013(var17);
				}
			}

			if (var2 == 17) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3363, field678.field1482);
				var16.field3270.method10036(var3);
				var16.field3270.method9810(var13 + var1);
				var16.field3270.method10036(field827);
				var16.field3270.method9809(field754.method4191(82) ? 1 : 0);
				var16.field3270.method9812(field491);
				var16.field3270.method9866(field613);
				var16.field3270.method9810(var12 + var0);
				field678.method3013(var16);
			}

			Class80 var20;
			if (var2 == 50) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3403, field678.field1482);
					var17.field3270.method9866(var3);
					var17.field3270.method9856(field754.method4191(82) ? 1 : 0);
					field678.method3013(var17);
				}
			}

			if (var2 == 23) {
				if (field672) {
					field5093.field1014.method5308();
				} else {
					field5093.field1014.method5307(field5093.field1016, var0, var1, true);
				}

				for (int var21 = 0; var21 < field5093.field1020; ++var21) {
					Class483 var22 = field5093.field1029[field5093.field1031[var21]];
					if (var22 != null) {
						if (field672) {
							var22.field5001.field1014.method5308();
						} else {
							var22.field5001.field1014.method5307(var22.field5001.field1016, var0, var1, true);
						}
					}
				}
			}

			if (var2 == 5) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3372, field678.field1482);
				var16.field3270.method9856(field754.method4191(82) ? 1 : 0);
				var16.field3270.method10010(var13 + var1);
				var16.field3270.method10036(var3);
				var16.field3270.method10036(var12 + var0);
				field678.method3013(var16);
			}

			if (var2 == 9) {
				var19 = var14[var3];
				if (var19 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3385, field678.field1482);
					var17.field3270.method9866(var3);
					var17.field3270.method9809(field754.method4191(82) ? 1 : 0);
					field678.method3013(var17);
				}
			}

			if (var2 == 6) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3444, field678.field1482);
				var16.field3270.method10036(var13 + var1);
				var16.field3270.method9866(var12 + var0);
				var16.field3270.method9866(var3);
				var16.field3270.method9856(field754.method4191(82) ? 1 : 0);
				field678.method3013(var16);
			}

			if (var2 == 44) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3420, field678.field1482);
					var17.field3270.method10025(field754.method4191(82) ? 1 : 0);
					var17.field3270.method10036(var3);
					field678.method3013(var17);
				}
			}

			if (var2 == 22) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3367, field678.field1482);
				var16.field3270.method9856(field754.method4191(82) ? 1 : 0);
				var16.field3270.method10036(var3);
				var16.field3270.method9810(var13 + var1);
				var16.field3270.method10010(var12 + var0);
				field678.method3013(var16);
			}

			if (var2 == 48) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3364, field678.field1482);
					var17.field3270.method9857(field754.method4191(82) ? 1 : 0);
					var17.field3270.method10036(var3);
					field678.method3013(var17);
				}
			}

			if (var2 == 15) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3397, field678.field1482);
					var17.field3270.method9810(field613);
					var17.field3270.method10036(field827);
					var17.field3270.method9810(var3);
					var17.field3270.method9880(field491);
					var17.field3270.method9856(field754.method4191(82) ? 1 : 0);
					field678.method3013(var17);
				}
			}

			if (var2 == 4) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3425, field678.field1482);
				var16.field3270.method9809(field754.method4191(82) ? 1 : 0);
				var16.field3270.method9866(var3);
				var16.field3270.method10036(var12 + var0);
				var16.field3270.method9810(var13 + var1);
				field678.method3013(var16);
			}

			if (var2 == 1) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3438, field678.field1482);
				var16.field3270.method9810(var12 + var0);
				var16.field3270.method10010(field205);
				var16.field3270.method9812(field97);
				var16.field3270.method9856(field754.method4191(82) ? 1 : 0);
				var16.field3270.method10010(var13 + var1);
				var16.field3270.method10010(var3);
				var16.field3270.method10036(field3662);
				field678.method3013(var16);
			}

			if (var2 == 51) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3376, field678.field1482);
					var17.field3270.method10010(var3);
					var17.field3270.method9857(field754.method4191(82) ? 1 : 0);
					field678.method3013(var17);
				}
			}

			if (var2 == 1004) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				var16 = Class168.method3523(ClientPacket.field3422, field678.field1482);
				var16.field3270.method9866(var12 + var0);
				var16.field3270.method9810(var3);
				var16.field3270.method9810(var13 + var1);
				field678.method3013(var16);
			}

			if (var2 == 47) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3447, field678.field1482);
					var17.field3270.method10025(field754.method4191(82) ? 1 : 0);
					var17.field3270.method9810(var3);
					field678.method3013(var17);
				}
			}

			if (var2 == 14) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3393, field678.field1482);
					var17.field3270.method9810(field205);
					var17.field3270.method9810(field3662);
					var17.field3270.method9812(field97);
					var17.field3270.method10036(var3);
					var17.field3270.method9857(field754.method4191(82) ? 1 : 0);
					field678.method3013(var17);
				}
			}

			int var18;
			Class362 var24;
			if (var2 == 29) {
				var16 = Class168.method3523(ClientPacket.field3426, field678.field1482);
				var16.field3270.method9812(var1);
				field678.method3013(var16);
				var24 = field4644.method6417(var1);
				if (var24 != null && var24.field3938 != null && 5 == var24.field3938[0][0]) {
					var18 = var24.field3938[0][1];
					if (Class353.field3769[var18] != var24.field3943[0]) {
						Class353.field3769[var18] = var24.field3943[0];
						Class82.method2313(var18);
					}
				}
			}

			if (var2 == 20) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3390, field678.field1482);
				var16.field3270.method9866(var13 + var1);
				var16.field3270.method9856(field754.method4191(82) ? 1 : 0);
				var16.field3270.method9866(var12 + var0);
				var16.field3270.method9866(var3);
				field678.method3013(var16);
			}

			if (var2 == 49) {
				var20 = var15[var3];
				if (var20 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3394, field678.field1482);
					var17.field3270.method9866(var3);
					var17.field3270.method9856(field754.method4191(82) ? 1 : 0);
					field678.method3013(var17);
				}
			}

			if (var2 == 13) {
				var19 = var14[var3];
				if (var19 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3445, field678.field1482);
					var17.field3270.method9866(var3);
					var17.field3270.method9856(field754.method4191(82) ? 1 : 0);
					field678.method3013(var17);
				}
			}

			if (var2 == 19) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3380, field678.field1482);
				var16.field3270.method10036(var3);
				var16.field3270.method9857(field754.method4191(82) ? 1 : 0);
				var16.field3270.method10036(var12 + var0);
				var16.field3270.method10010(var13 + var1);
				field678.method3013(var16);
			}

			Class362 var28;
			if (var2 == 57 || var2 == 1007) {
				var28 = field4644.method6411(var1, var0);
				if (var28 != null) {
					method8423(var3, var1, var0, var4, var7);
				}
			}

			if (var2 == 58) {
				var28 = field4644.method6411(var1, var0);
				if (var28 != null) {
					if (var28.field3921 != null) {
						Class99 var25 = new Class99();
						var25.field1215 = var28;
						var25.field1211 = var3;
						var25.field1219 = var7;
						var25.field1217 = var28.field3921;
						Class70.method2344(var25);
					}

					var17 = Class168.method3523(ClientPacket.field3368, field678.field1482);
					var17.field3270.method9807(field491);
					var17.field3270.method9880(var1);
					var17.field3270.method10036(field613);
					var17.field3270.method10010(field827);
					var17.field3270.method9866(var0);
					var17.field3270.method10036(var4);
					field678.method3013(var17);
				}
			}

			if (var2 == 18) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3421, field678.field1482);
				var16.field3270.method10010(var3);
				var16.field3270.method10036(var13 + var1);
				var16.field3270.method9856(field754.method4191(82) ? 1 : 0);
				var16.field3270.method10010(var12 + var0);
				field678.method3013(var16);
			}

			if (var2 == 3) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3391, field678.field1482);
				var16.field3270.method9810(var3);
				var16.field3270.method10010(var12 + var0);
				var16.field3270.method10036(var13 + var1);
				var16.field3270.method9809(field754.method4191(82) ? 1 : 0);
				field678.method3013(var16);
			}

			if (var2 == 1001) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3410, field678.field1482);
				var16.field3270.method10036(var13 + var1);
				var16.field3270.method9866(var3);
				var16.field3270.method9866(var12 + var0);
				var16.field3270.method9857(field754.method4191(82) ? 1 : 0);
				field678.method3013(var16);
			}

			Class314 var23;
			if (var2 == 24) {
				var28 = field4644.method6417(var1);
				if (var28 != null) {
					boolean var26 = true;
					if (var28.field3817 > 0) {
						var26 = method3157(var28);
					}

					if (var26) {
						var23 = Class168.method3523(ClientPacket.field3426, field678.field1482);
						var23.field3270.method9812(var1);
						field678.method3013(var23);
					}
				}
			}

			if (var2 == 1003) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				var19 = var14[var3];
				if (var19 != null) {
					Class184 var27 = var19.field1309;
					if (var27.field1966 != null) {
						var27 = var27.method3661();
					}

					if (var27 != null) {
						var23 = Class168.method3523(ClientPacket.field3358, field678.field1482);
						var23.field3270.method10036(var27.field1941);
						field678.method3013(var23);
					}
				}
			}

			if (var2 == 12) {
				var19 = var14[var3];
				if (var19 != null) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var17 = Class168.method3523(ClientPacket.field3437, field678.field1482);
					var17.field3270.method9856(field754.method4191(82) ? 1 : 0);
					var17.field3270.method10010(var3);
					field678.method3013(var17);
				}
			}

			if (var2 == 16) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3381, field678.field1482);
				var16.field3270.method9866(field205);
				var16.field3270.method10036(var12 + var0);
				var16.field3270.method9866(var13 + var1);
				var16.field3270.method9856(field754.method4191(82) ? 1 : 0);
				var16.field3270.method9812(field97);
				var16.field3270.method9866(var3);
				var16.field3270.method10010(field3662);
				field678.method3013(var16);
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
				field3069.method9216(var2, var3, new Class350(var0), new Class350(var1));
			}

			if (var2 == 26) {
				method2918();
			}

			if (var2 == 2) {
				field551 = var8;
				field647 = var9;
				field700 = 2;
				field648 = 0;
				field778 = var0;
				field779 = var1;
				var16 = Class168.method3523(ClientPacket.field3399, field678.field1482);
				var16.field3270.method10010(field827);
				var16.field3270.method10036(field613);
				var16.field3270.method9810(var13 + var1);
				var16.field3270.method9857(field754.method4191(82) ? 1 : 0);
				var16.field3270.method9866(var12 + var0);
				var16.field3270.method9878(field491);
				var16.field3270.method10010(var3);
				field678.method3013(var16);
			}

			if (var2 == 25) {
				var28 = field4644.method6411(var1, var0);
				if (var28 != null) {
					method69();
					method5831(var1, var0, Class345.method5695(method3446(var28)), var4);
					field614 = 0;
					field695 = method3214(var28);
					if (field695 == null) {
						field695 = Class367.field4306;
					}

					if (var28.field3896) {
						field696 = var28.field3940 + Class111.method3839(16777215);
					} else {
						field696 = Class111.method3839(65280) + var28.field3942 + Class111.method3839(16777215);
					}
				}

			} else {
				if (var2 == 45) {
					var20 = var15[var3];
					if (var20 != null) {
						field551 = var8;
						field647 = var9;
						field700 = 2;
						field648 = 0;
						field778 = var0;
						field779 = var1;
						var17 = Class168.method3523(ClientPacket.field3398, field678.field1482);
						var17.field3270.method10036(var3);
						var17.field3270.method9857(field754.method4191(82) ? 1 : 0);
						field678.method3013(var17);
					}
				}

				if (var2 == 21) {
					field551 = var8;
					field647 = var9;
					field700 = 2;
					field648 = 0;
					field778 = var0;
					field779 = var1;
					var16 = Class168.method3523(ClientPacket.field3400, field678.field1482);
					var16.field3270.method10025(field754.method4191(82) ? 1 : 0);
					var16.field3270.method10036(var12 + var0);
					var16.field3270.method10036(var13 + var1);
					var16.field3270.method9866(var3);
					field678.method3013(var16);
				}

				if (var2 == 8) {
					var19 = var14[var3];
					if (var19 != null) {
						field551 = var8;
						field647 = var9;
						field700 = 2;
						field648 = 0;
						field778 = var0;
						field779 = var1;
						var17 = Class168.method3523(ClientPacket.field3408, field678.field1482);
						var17.field3270.method9812(field491);
						var17.field3270.method9856(field754.method4191(82) ? 1 : 0);
						var17.field3270.method10010(field827);
						var17.field3270.method10010(field613);
						var17.field3270.method9866(var3);
						field678.method3013(var17);
					}
				}

				if (var2 == 10) {
					var19 = var14[var3];
					if (var19 != null) {
						field551 = var8;
						field647 = var9;
						field700 = 2;
						field648 = 0;
						field778 = var0;
						field779 = var1;
						var17 = Class168.method3523(ClientPacket.field3353, field678.field1482);
						var17.field3270.method10036(var3);
						var17.field3270.method9809(field754.method4191(82) ? 1 : 0);
						field678.method3013(var17);
					}
				}

				if (var2 == 28) {
					var16 = Class168.method3523(ClientPacket.field3426, field678.field1482);
					var16.field3270.method9812(var1);
					field678.method3013(var16);
					var24 = field4644.method6417(var1);
					if (var24 != null && var24.field3938 != null && 5 == var24.field3938[0][0]) {
						var18 = var24.field3938[0][1];
						Class353.field3769[var18] = 1 - Class353.field3769[var18];
						Class82.method2313(var18);
					}
				}

				if (var2 == 30 && field607 == null) {
					method3516(var1, var0);
					field607 = field4644.method6411(var1, var0);
					Class490.method8827(field607);
				}

				if (var2 == 11) {
					var19 = var14[var3];
					if (var19 != null) {
						field551 = var8;
						field647 = var9;
						field700 = 2;
						field648 = 0;
						field778 = var0;
						field779 = var1;
						var17 = Class168.method3523(ClientPacket.field3387, field678.field1482);
						var17.field3270.method10036(var3);
						var17.field3270.method10025(field754.method4191(82) ? 1 : 0);
						field678.method3013(var17);
					}
				}

				if (var2 == 46) {
					var20 = var15[var3];
					if (var20 != null) {
						field551 = var8;
						field647 = var9;
						field700 = 2;
						field648 = 0;
						field778 = var0;
						field779 = var1;
						var17 = Class168.method3523(ClientPacket.field3446, field678.field1482);
						var17.field3270.method9856(field754.method4191(82) ? 1 : 0);
						var17.field3270.method9866(var3);
						field678.method3013(var17);
					}
				}

				if (field614 != 0) {
					field614 = 0;
					Class490.method8827(field4644.method6417(field97));
				}

				if (field692) {
					method69();
				}

			}
		}
	}

	@ObfInfo(owner = "ln", name = "lc", desc = "(IIIIB)V", opaque = "0")
	public static void method5831(int var0, int var1, int var2, int var3) {
		Class362 var5 = field4644.method6411(var0, var1);
		if (var5 != null && var5.field3871 != null) {
			Class99 var6 = new Class99();
			var6.field1215 = var5;
			var6.field1217 = var5.field3871;
			Class70.method2344(var6);
		}

		field613 = var3;
		field692 = true;
		field491 = var0;
		field827 = var1;
		field969 = var2;
		Class490.method8827(var5);
	}

	@ObfInfo(owner = "af", name = "mo", desc = "(I)V", opaque = "-505680381")
	public static void method69() {
		if (field692) {
			Class362 var1 = field4644.method6411(field491, field827);
			if (var1 != null && var1.field3912 != null) {
				Class99 var2 = new Class99();
				var2.field1215 = var1;
				var2.field1217 = var1.field3912;
				Class70.method2344(var2);
			}

			field613 = -1;
			field692 = false;
			Class490.method8827(var1);
		}
	}

	@ObfInfo(owner = "gk", name = "mr", desc = "(III)V")
	public static void method3516(int var0, int var1) {
		Class314 var3 = Class168.method3523(ClientPacket.field3369, field678.field1482);
		var3.field3270.method9807(var0);
		var3.field3270.method9866(var1);
		field678.method3013(var3);
	}

	@ObfInfo(owner = "ro", name = "mz", desc = "(IIIILjava/lang/String;B)V", opaque = "14")
	public static void method8423(int var0, int var1, int var2, int var3, String var4) {
		Class362 var6 = field4644.method6411(var1, var2);
		if (var6 != null) {
			if (var6.field3920 != null) {
				Class99 var7 = new Class99();
				var7.field1215 = var6;
				var7.field1211 = var0;
				var7.field1219 = var4;
				var7.field1217 = var6.field3920;
				Class70.method2344(var7);
			}

			boolean var9 = true;
			if (var6.field3817 > 0) {
				var9 = method3157(var6);
			}

			if (var9) {
				if (Class345.method6550(method3446(var6), var0 - 1)) {
					Class314 var8;
					if (var0 == 1) {
						var8 = Class168.method3523(ClientPacket.field3382, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 2) {
						var8 = Class168.method3523(ClientPacket.field3379, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 3) {
						var8 = Class168.method3523(ClientPacket.field3449, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 4) {
						var8 = Class168.method3523(ClientPacket.field3419, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 5) {
						var8 = Class168.method3523(ClientPacket.field3383, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 6) {
						var8 = Class168.method3523(ClientPacket.field3409, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 7) {
						var8 = Class168.method3523(ClientPacket.field3411, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 8) {
						var8 = Class168.method3523(ClientPacket.field3406, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 9) {
						var8 = Class168.method3523(ClientPacket.field3430, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

					if (var0 == 10) {
						var8 = Class168.method3523(ClientPacket.field3418, field678.field1482);
						var8.field3270.method9812(var1);
						var8.field3270.method9810(var2);
						var8.field3270.method9810(var3);
						field678.method3013(var8);
					}

				}
			}
		}
	}

	@ObfInfo(owner = "ea", name = "mm", desc = "(Ljava/lang/String;Ljava/lang/String;IIIII)V")
	public static void method2780(String var0, String var1, int var2, int var3, int var4, int var5) {
		Class247.method4829(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}

	@ObfInfo(owner = "hq", name = "mt", desc = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V")
	public static void method3961(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		Class247.method4829(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}

	@ObfInfo(owner = "jh", name = "ms", desc = "(II)Ljava/lang/String;", opaque = "-970371887")
	public static String method4664(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return field681[var0].length() > 0 ? field680[var0] + Class367.field4253 + field681[var0] : field680[var0];
		}
	}

	@ObfInfo(owner = "kg", name = "md", desc = "(Ldx;IIIIB)V", opaque = "99")
	public static void method5047(Class102 var0, int var1, int var2, int var3, int var4) {
		Class184 var6 = var0.field1309;
		if (field602 < 400) {
			if (var6.field1966 != null) {
				var6 = var6.method3661();
			}

			if (var6 != null) {
				if (var6.field1974) {
					if (!var6.field1979 || field706 == var1) {
						String var7 = var0.method2704();
						int var8;
						if (0 != var6.field1967 && 0 != var0.field1304) {
							var8 = -1 != var0.field1304 ? var0.field1304 : var6.field1967;
							var7 = var7 + method3836(var8, field170.field976) + " " + Class111.field1390 + Class367.field4205 + var8 + Class111.field1391;
						}

						if (var6.field1980 && field683) {
							Class247.method4829(Class367.field4314, Class111.method3839(16776960) + var7, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!field1139 && 1 == field614) {
							Class247.method4829(Class367.field4035, field668 + " " + Class111.field1392 + " " + Class111.method3839(16776960) + var7, 7, var1, var2, var3, -1, false, var4);
						} else if (field692) {
							if (!field1139 && (field969 & 2) == 2) {
								Class247.method4829(field695, field696 + " " + Class111.field1392 + " " + Class111.method3839(16776960) + var7, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var8 = var6.field1980 && field683 ? 2000 : 0;
							String[] var9 = var6.field1972;
							int var10;
							int var11;
							if (var9 != null) {
								for (var10 = 4; var10 >= 0; --var10) {
									if (!field1139 && var0.method2754(var10) && var9[var10] != null && !var9[var10].equalsIgnoreCase(Class367.field4046)) {
										var11 = 0;
										if (var10 == 0) {
											var11 = var8 + 9;
										}

										if (var10 == 1) {
											var11 = var8 + 10;
										}

										if (var10 == 2) {
											var11 = var8 + 11;
										}

										if (var10 == 3) {
											var11 = var8 + 12;
										}

										if (var10 == 4) {
											var11 = var8 + 13;
										}

										Class247.method4829(var9[var10], Class111.method3839(16776960) + var7, var11, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var9 != null) {
								for (var10 = 4; var10 >= 0; --var10) {
									if (!field1139 && var0.method2754(var10) && var9[var10] != null && var9[var10].equalsIgnoreCase(Class367.field4046)) {
										short var12 = 0;
										if (Class113.field1420 != field791) {
											if (field791 == Class113.field1419 || field791 == Class113.field1418 && var6.field1967 > field170.field976) {
												var12 = 2000;
											}

											var11 = 0;
											if (var10 == 0) {
												var11 = var12 + 9;
											}

											if (var10 == 1) {
												var11 = var12 + 10;
											}

											if (var10 == 2) {
												var11 = var12 + 11;
											}

											if (var10 == 3) {
												var11 = var12 + 12;
											}

											if (var10 == 4) {
												var11 = var12 + 13;
											}

											Class247.method4829(var9[var10], Class111.method3839(16776960) + var7, var11, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var6.field1980 || !field683) {
								Class247.method4829(Class367.field4314, Class111.method3839(16776960) + var7, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}

	@ObfInfo(owner = "hg", name = "mp", desc = "(III)Ljava/lang/String;", opaque = "-750381170")
	public static String method3836(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return Class111.method3839(16711680);
		} else if (var3 < -6) {
			return Class111.method3839(16723968);
		} else if (var3 < -3) {
			return Class111.method3839(16740352);
		} else if (var3 < 0) {
			return Class111.method3839(16756736);
		} else if (var3 > 9) {
			return Class111.method3839(65280);
		} else if (var3 > 6) {
			return Class111.method3839(4259584);
		} else if (var3 > 3) {
			return Class111.method3839(8453888);
		} else {
			return var3 > 0 ? Class111.method3839(12648192) : Class111.method3839(16776960);
		}
	}

	@ObfInfo(owner = "dy", name = "ma", desc = "(IIIIIIIII)V", opaque = "959769644")
	public static void method2768(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field4644.method6412(var0)) {
			field4718 = null;
			Class259.method4985(field4644.field3698[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (field4718 != null) {
				Class259.method4985(field4718, -1412584499, var1, var2, var3, var4, field2790, field1679, var7);
				field4718 = null;
			}

		} else {
			if (var7 != -1) {
				field747[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; ++var9) {
					field747[var9] = true;
				}
			}

		}
	}

	@ObfInfo(owner = "ji", name = "mh", desc = "(IIIIIII)V", opaque = "1419590177")
	public static void method4684(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var7 = var2 - var0;
		int var8 = var3 - var1;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8 >= 0 ? var8 : -var8;
		int var11 = var9;
		if (var9 < var10) {
			var11 = var10;
		}

		if (var11 != 0) {
			int var12 = (var7 << 16) / var11;
			int var13 = (var8 << 16) / var11;
			if (var13 <= var12) {
				var12 = -var12;
			} else {
				var13 = -var13;
			}

			int var14 = var13 * var5 >> 17;
			int var15 = 1 + var13 * var5 >> 17;
			int var16 = var12 * var5 >> 17;
			int var17 = 1 + var12 * var5 >> 17;
			var0 -= Class569.field5508;
			var1 -= Class569.field5505;
			int var18 = var14 + var0;
			int var19 = var0 - var15;
			int var20 = var7 + var0 - var15;
			int var21 = var7 + var0 + var14;
			int var22 = var16 + var1;
			int var23 = var1 - var17;
			int var24 = var8 + var1 - var17;
			int var25 = var16 + var8 + var1;
			Class274.method5195(var18, var19, var20);
			Class274.method5135(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
			Class274.method5195(var18, var20, var21);
			Class274.method5135(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfInfo(owner = "nx", name = "mq", desc = "(Ljava/lang/String;Lnx;B)Ljava/lang/String;", opaque = "1")
	public static String method6771(String var0, Class362 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					String var5 = var0.substring(0, var4);
					int var7 = method72(var1, var3 - 1);
					String var6;
					if (var7 < 999999999) {
						var6 = Integer.toString(var7);
					} else {
						var6 = "*";
					}

					var0 = var5 + var6 + var0.substring(var4 + 2);
				}
			}
		}

		return var0;
	}

	@ObfInfo(owner = "jb", name = "mx", desc = "(II)Ljava/lang/String;", opaque = "-920420952")
	public static String method4482(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + Class111.field1396 + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + Class111.method3839(65408) + var2.substring(0, var2.length() - 8) + Class367.field4200 + " " + Class111.field1390 + var2 + Class111.field1391 + Class111.field1394;
		} else {
			return var2.length() > 6 ? " " + Class111.method3839(16777215) + var2.substring(0, var2.length() - 4) + Class367.field4054 + " " + Class111.field1390 + var2 + Class111.field1391 + Class111.field1394 : " " + Class111.method3839(16776960) + var2 + Class111.field1394;
		}
	}

	@ObfInfo(owner = "jb", name = "mk", desc = "([Lnx;Lnx;ZI)V", opaque = "-1365784760")
	public static void method4491(Class362[] var0, Class362 var1, boolean var2) {
		int var4 = 0 != var1.field3836 ? var1.field3836 : var1.field3828;
		int var5 = 0 != var1.field3837 ? var1.field3837 : var1.field3829;
		Class91.method2432(var0, var1.field3812, var4, var5, var2);
		if (var1.field3950 != null) {
			Class91.method2432(var1.field3950, var1.field3812, var4, var5, var2);
		}

		Class100 var6 = (Class100)field698.method9439((long)var1.field3812);
		if (var6 != null) {
			method3432(var6.field1225, var4, var5, var2);
		}

		if (var1.field3817 == 1337) {
		}

	}

	@ObfInfo(owner = "gj", name = "mc", desc = "(IIIZB)V", opaque = "5")
	public static void method3432(int var0, int var1, int var2, boolean var3) {
		if (field4644.method6412(var0)) {
			Class91.method2432(field4644.field3698[var0], -1, var1, var2, var3);
		}
	}

	@ObfInfo(owner = "jk", name = "mw", desc = "(Lnx;IIZI)V", opaque = "-684547650")
	public static void method4714(Class362 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field3828;
		int var6 = var0.field3829;
		if (var0.field3898 == 0) {
			var0.field3828 = var0.field3928;
		} else if (1 == var0.field3898) {
			var0.field3828 = var1 - var0.field3928;
		} else if (2 == var0.field3898) {
			var0.field3828 = var0.field3928 * var1 >> 14;
		}

		if (var0.field3902 == 0) {
			var0.field3829 = var0.field3825;
		} else if (var0.field3902 == 1) {
			var0.field3829 = var2 - var0.field3825;
		} else if (2 == var0.field3902) {
			var0.field3829 = var2 * var0.field3825 >> 14;
		}

		if (var0.field3898 == 4) {
			var0.field3828 = var0.field3830 * var0.field3829 / var0.field3831;
		}

		if (4 == var0.field3902) {
			var0.field3829 = var0.field3828 * var0.field3831 / var0.field3830;
		}

		if (var0.field3817 == 1337) {
			field708 = var0;
		}

		if (12 == var0.field3815) {
			var0.method6756().method6827(var0.field3828, var0.field3829);
		}

		if (var3 && var0.field3934 != null && (var5 != var0.field3828 || var0.field3829 != var6)) {
			Class99 var7 = new Class99();
			var7.field1215 = var0;
			var7.field1217 = var0.field3934;
			field740.method7506(var7);
		}

	}

	@ObfInfo(owner = "pl", name = "mv", desc = "(Lnx;IIIIIIB)V", opaque = "0")
	public static void method7471(Class362 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field612) {
			field661 = 32;
		} else {
			field661 = 0;
		}

		field612 = false;
		int var8;
		if (1 == Class42.field219 || !field911 && 4 == Class42.field219) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field3835 -= 4;
				Class490.method8827(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.field3835 += 4;
				Class490.method8827(var0);
			} else if (var5 >= var1 - field661 && var5 < var1 + 16 + field661 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var8 = (var3 - 32) * var3 / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field3835 = (var4 - var3) * var9 / var10;
				Class490.method8827(var0);
				field612 = true;
			}
		}

		if (field555 != 0) {
			var8 = var0.field3828;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field3835 += field555 * 45;
				Class490.method8827(var0);
			}
		}

	}

	@ObfInfo(owner = "bo", name = "mu", desc = "(IIIIII)V", opaque = "-32447736")
	public static void method576(int var0, int var1, int var2, int var3, int var4) {
		field1526[0].method10122(var0, var1);
		field1526[1].method10122(var0, var3 + var1 - 16);
		Class569.method10138(var0, var1 + 16, 16, var3 - 32, field719);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
		Class569.method10138(var0, var1 + 16 + var7, 16, var6, field609);
		Class569.method10182(var0, var1 + 16 + var7, var6, field773);
		Class569.method10182(var0 + 1, var7 + var1 + 16, var6, field773);
		Class569.method10128(var0, var1 + 16 + var7, 16, field773);
		Class569.method10128(var0, var7 + var1 + 17, 16, field773);
		Class569.method10182(var0 + 15, var7 + var1 + 16, var6, field610);
		Class569.method10182(var0 + 14, var7 + var1 + 17, var6 - 1, field610);
		Class569.method10128(var0, var6 + var1 + 15 + var7, 16, field610);
		Class569.method10128(var0 + 1, var7 + var1 + 14 + var6, 15, field610);
	}

	@ObfInfo(owner = "ue", name = "mf", desc = "(Lnx;I)Z", opaque = "-103871202")
	public static boolean method9305(Class362 var0) {
		if (var0.field3911 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field3911.length; ++var2) {
				int var3 = method72(var0, var2);
				int var4 = var0.field3943[var2];
				if (2 == var0.field3911[var2]) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field3911[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var0.field3911[var2] == 4) {
					if (var4 == var3) {
						return false;
					}
				} else if (var4 != var3) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(owner = "af", name = "nt", desc = "(Lnx;II)I", opaque = "-1345409835")
	public static int method72(Class362 var0, int var1) {
		if (var0.field3938 != null && var1 < var0.field3938.length) {
			try {
				int[] var3 = var0.field3938[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}

					if (var7 == 1) {
						var8 = field629[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = field730[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = field669[var3[var5++]];
					}

					int var10;
					Class362 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = field4644.method6417(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!Class187.method3421(var12).field2030 || field528)) {
							for (var13 = 0; var13 < var11.field3944.length; ++var13) {
								if (var11.field3944[var13] == var12 + 1) {
									var8 += var11.field3945[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = Class353.field3769[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = Class380.field4505[field730[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = Class353.field3769[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = field170.field976;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (Class380.field4502[var10]) {
								var8 += field730[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = field4644.method6417(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!Class187.method3421(var12).field2030 || field528)) {
							for (var13 = 0; var13 < var11.field3944.length; ++var13) {
								if (var12 + 1 == var11.field3944[var13]) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = field703;
					}

					if (var7 == 12) {
						var8 = field704;
					}

					if (var7 == 13) {
						var10 = Class353.field3769[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = Class353.method3359(var10);
					}

					if (var7 == 15) {
						var9 = 1;
					}

					if (var7 == 16) {
						var9 = 2;
					}

					if (var7 == 17) {
						var9 = 3;
					}

					if (var7 == 18) {
						var8 = field5093.field1019 + (field170.field1266 >> 7);
					}

					if (var7 == 19) {
						var8 = (field170.field1229 >> 7) + field5093.field1021;
					}

					if (var7 == 20) {
						var8 = var3[var5++];
					}

					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 = var8 * var4;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfInfo(owner = "sc", name = "nz", desc = "(Lnx;I)V", opaque = "-1178642139")
	public static void method8551(Class362 var0) {
		if (var0.field3816 == 1) {
			method3961(var0.field3952, "", 24, 0, 0, var0.field3812, var0.field3946);
		}

		String var2;
		if (var0.field3816 == 2 && !field692) {
			var2 = method3214(var0);
			if (var2 != null) {
				method3961(var2, Class111.method3839(65280) + var0.field3942, 25, 0, -1, var0.field3812, var0.field3946);
			}
		}

		if (var0.field3816 == 3) {
			method2780(Class367.field4208, "", 26, 0, 0, var0.field3812);
		}

		if (4 == var0.field3816) {
			method2780(var0.field3952, "", 28, 0, 0, var0.field3812);
		}

		if (var0.field3816 == 5) {
			method2780(var0.field3952, "", 29, 0, 0, var0.field3812);
		}

		if (var0.field3816 == 6 && field607 == null) {
			method2780(var0.field3952, "", 30, 0, -1, var0.field3812);
		}

		if (var0.field3896) {
			int var3;
			if (field692) {
				var3 = method3446(var0);
				boolean var6 = (var3 >> 21 & 1) != 0;
				if (var6 && (field969 & 32) == 32) {
					method3961(field695, field696 + " " + Class111.field1392 + " " + var0.field3940, 58, 0, var0.field3851, var0.field3812, var0.field3946);
				}
			} else {
				for (int var7 = 9; var7 >= 5; --var7) {
					String var8;
					if (!Class345.method6550(method3446(var0), var7) && var0.field3920 == null) {
						var8 = null;
					} else if (var0.field3909 != null && var0.field3909.length > var7 && var0.field3909[var7] != null && var0.field3909[var7].trim().length() != 0) {
						var8 = var0.field3909[var7];
					} else {
						var8 = null;
					}

					if (var8 != null) {
						method3961(var8, var0.field3940, 1007, var7 + 1, var0.field3851, var0.field3812, var0.field3946);
					}
				}

				var2 = method3214(var0);
				if (var2 != null) {
					method3961(var2, var0.field3940, 25, 0, var0.field3851, var0.field3812, var0.field3946);
				}

				for (var3 = 4; var3 >= 0; --var3) {
					String var4;
					if (!Class345.method6550(method3446(var0), var3) && var0.field3920 == null) {
						var4 = null;
					} else if (var0.field3909 != null && var0.field3909.length > var3 && var0.field3909[var3] != null && var0.field3909[var3].trim().length() != 0) {
						var4 = var0.field3909[var3];
					} else {
						var4 = null;
					}

					if (var4 != null) {
						Class247.method4829(var4, var0.field3940, 57, var3 + 1, var0.field3851, var0.field3812, var0.field3946, var0.field3949, -1);
					}
				}

				int var9 = method3446(var0);
				boolean var10 = (var9 & 1) != 0;
				if (var10) {
					method2780(Class367.field4039, "", 30, 0, var0.field3851, var0.field3812);
				}
			}
		}

	}

	@ObfInfo(owner = "as", name = "nv", desc = "(I)Z")
	public static boolean method276() {
		return field684;
	}

	@ObfInfo(owner = "co", name = "nm", desc = "(IIIIIIII)V")
	public static void method1944(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field4644.method6412(var0)) {
			method194(field4644.field3698[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfInfo(owner = "ao", name = "ni", desc = "([Lnx;IIIIIIIB)V", opaque = "16")
	public static void method194(Class362[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			Class362 var10 = var0[var9];
			if (var10 != null && var1 == var10.field3832 && (var10.method6635() || method3446(var10) != 0 || field710 == var10)) {
				if (var10.field3896) {
					if (method3365(var10)) {
						continue;
					}
				} else if (0 == var10.field3815 && field1905 != var10 && method3365(var10)) {
					continue;
				}

				if (11 == var10.field3815) {
					if (var10.method6760(field4644, field4823)) {
						if (var10.method6714()) {
							Class490.method8827(var10);
							method4491(var10.field3950, var10, true);
							var10.method6685().method4348().method4268(3, var10.method6685().method4360());
						}

						if (var10.field3937 != null) {
							Class99 var11 = new Class99();
							var11.field1215 = var10;
							var11.field1217 = var10.field3937;
							field740.method7506(var11);
						}
					}
				} else if (var10.field3815 == 12 && var10.method6659(field4644)) {
					Class490.method8827(var10);
				}

				int var27 = var10.field3826 + var6;
				int var12 = var10.field3827 + var7;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var10.field3815 == 9) {
					var17 = var27;
					var18 = var12;
					var19 = var27 + var10.field3828;
					int var20 = var12 + var10.field3829;
					if (var19 < var27) {
						var17 = var19;
						var19 = var27;
					}

					if (var20 < var12) {
						var18 = var20;
						var20 = var12;
					}

					++var19;
					++var20;
					var13 = var17 > var2 ? var17 : var2;
					var14 = var18 > var3 ? var18 : var3;
					var15 = var19 < var4 ? var19 : var4;
					var16 = var20 < var5 ? var20 : var5;
				} else {
					var17 = var27 + var10.field3828;
					var18 = var10.field3829 + var12;
					var13 = var27 > var2 ? var27 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var17 < var4 ? var17 : var4;
					var16 = var18 < var5 ? var18 : var5;
				}

				if (field761 == var10) {
					field717 = true;
					field718 = var27;
					field689 = var12;
				}

				boolean var28 = false;
				if (var10.field3897) {
					switch(field699) {
					case 0:
						var28 = true;
					case 1:
					default:
						break;
					case 2:
						if (field530 == var10.field3812 >>> 16) {
							var28 = true;
						}
						break;
					case 3:
						if (var10.field3812 == field530) {
							var28 = true;
						}
					}
				}

				if (var28 || !var10.field3896 || var13 < var15 && var14 < var16) {
					if (var10.field3896) {
						Class99 var29;
						if (var10.field3960) {
							if (Class42.field231 >= var13 && Class42.field221 >= var14 && Class42.field231 < var15 && Class42.field221 < var16) {
								for (var29 = (Class99)field740.method7526(); var29 != null; var29 = (Class99)field740.method7511()) {
									if (var29.field1213) {
										var29.method9267();
										var29.field1215.field3951 = false;
									}
								}

								method3062();
								if (0 == field5084) {
									field761 = null;
									field710 = null;
								}

								if (!field672) {
									method566();
								}
							}
						} else if (var10.field3961 && Class42.field231 >= var13 && Class42.field221 >= var14 && Class42.field231 < var15 && Class42.field221 < var16) {
							for (var29 = (Class99)field740.method7526(); var29 != null; var29 = (Class99)field740.method7511()) {
								if (var29.field1213 && var29.field1215.field3922 == var29.field1217) {
									var29.method9267();
								}
							}
						}
					}

					var18 = Class42.field231;
					var19 = Class42.field221;
					if (Class42.field227 != 0) {
						var18 = Class42.field230;
						var19 = Class42.field222;
					}

					boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
					if (1337 == var10.field3817) {
						if (!field540 && !field672 && var30) {
							Class404.method7493(var18, var19, var13, var14);
						}
					} else if (var10.field3817 == 1338) {
						Class466.method8515(var10, var27, var12);
					} else {
						if (var10.field3817 == 1400) {
							field3069.method9051(Class42.field231, Class42.field221, var30, var27, var12, var10.field3828, var10.field3829);
						}

						if (!field672 && var30) {
							if (var10.field3817 == 1400) {
								field3069.method9096(var27, var12, var10.field3828, var10.field3829, var18, var19);
							} else {
								method8551(var10);
							}
						}

						boolean var22;
						int var24;
						if (var28) {
							for (int var21 = 0; var21 < var10.field3889.length; ++var21) {
								var22 = false;
								boolean var23 = false;
								if (!var22 && var10.field3889[var21] != null) {
									for (var24 = 0; var24 < var10.field3889[var21].length; ++var24) {
										boolean var25 = false;
										if (var10.field3959 != null) {
											var25 = field754.method4191(var10.field3889[var21][var24]);
										}

										if (Class45.method798(var10.field3889[var21][var24]) || var25) {
											var22 = true;
											if (var10.field3959 != null && var10.field3959[var21] > field541) {
												break;
											}

											byte var26 = var10.field3962[var21][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !field754.method4191(86) && !field754.method4191(82) && !field754.method4191(81)) && ((var26 & 2) == 0 || field754.method4191(86)) && ((var26 & 1) == 0 || field754.method4191(82)) && ((var26 & 4) == 0 || field754.method4191(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var21 < 10) {
										method8423(var21 + 1, var10.field3812, var10.field3851, var10.field3946, "");
									} else if (var21 == 10) {
										method69();
										method5831(var10.field3812, var10.field3851, Class345.method5695(method3446(var10)), var10.field3946);
										field695 = method3214(var10);
										if (field695 == null) {
											field695 = Class367.field4306;
										}

										field696 = var10.field3940 + Class111.method3839(16777215);
									}

									var24 = var10.field3948[var21];
									if (var10.field3959 == null) {
										var10.field3959 = new int[var10.field3889.length];
									}

									if (var10.field3892 == null) {
										var10.field3892 = new int[var10.field3889.length];
									}

									if (var24 != 0) {
										if (var10.field3959[var21] == 0) {
											var10.field3959[var21] = var10.field3892[var21] + field541 + var24;
										} else {
											var10.field3959[var21] = var24 + field541;
										}
									} else {
										var10.field3959[var21] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && var10.field3959 != null) {
									var10.field3959[var21] = 0;
								}
							}
						}

						if (var10.field3896) {
							if (Class42.field231 >= var13 && Class42.field221 >= var14 && Class42.field231 < var15 && Class42.field221 < var16) {
								var30 = true;
							} else {
								var30 = false;
							}

							boolean var31 = false;
							if ((Class42.field219 == 1 || !field911 && Class42.field219 == 4) && var30) {
								var31 = true;
							}

							var22 = false;
							if ((1 == Class42.field227 || !field911 && Class42.field227 == 4) && Class42.field230 >= var13 && Class42.field222 >= var14 && Class42.field230 < var15 && Class42.field222 < var16) {
								var22 = true;
							}

							if (var22) {
								Class42.method596(var10, Class42.field230 - var27, Class42.field222 - var12);
							}

							if (var10.method6636()) {
								if (var22) {
									field743.method7506(new Class226(0, Class42.field231 - var27, Class42.field221 - var12, var10));
								}

								if (var31) {
									field743.method7506(new Class226(1, Class42.field231 - var27, Class42.field221 - var12, var10));
								}
							}

							if (1400 == var10.field3817) {
								field3069.method9052(var18, var19, var30 & var31, var30 & var22);
							}

							if (field761 != null && field761 != var10 && var30 && Class345.method2855(method3446(var10))) {
								field716 = var10;
							}

							if (field710 == var10) {
								field714 = true;
								field715 = var27;
								field531 = var12;
							}

							if (var10.field3900) {
								Class99 var32;
								if (var30 && field555 != 0 && var10.field3922 != null) {
									var32 = new Class99();
									var32.field1213 = true;
									var32.field1215 = var10;
									var32.field1214 = field555;
									var32.field1217 = var10.field3922;
									field740.method7506(var32);
								}

								if (field761 != null || field672) {
									var22 = false;
									var31 = false;
									var30 = false;
								}

								if (!var10.field3824 && var22) {
									var10.field3824 = true;
									if (var10.field3933 != null) {
										var32 = new Class99();
										var32.field1213 = true;
										var32.field1215 = var10;
										var32.field1212 = Class42.field230 - var27;
										var32.field1214 = Class42.field222 - var12;
										var32.field1217 = var10.field3933;
										field740.method7506(var32);
									}
								}

								if (var10.field3824 && var31 && var10.field3903 != null) {
									var32 = new Class99();
									var32.field1213 = true;
									var32.field1215 = var10;
									var32.field1212 = Class42.field231 - var27;
									var32.field1214 = Class42.field221 - var12;
									var32.field1217 = var10.field3903;
									field740.method7506(var32);
								}

								if (var10.field3824 && !var31) {
									var10.field3824 = false;
									if (var10.field3904 != null) {
										var32 = new Class99();
										var32.field1213 = true;
										var32.field1215 = var10;
										var32.field1212 = Class42.field231 - var27;
										var32.field1214 = Class42.field221 - var12;
										var32.field1217 = var10.field3904;
										field742.method7506(var32);
									}
								}

								if (var31 && var10.field3905 != null) {
									var32 = new Class99();
									var32.field1213 = true;
									var32.field1215 = var10;
									var32.field1212 = Class42.field231 - var27;
									var32.field1214 = Class42.field221 - var12;
									var32.field1217 = var10.field3905;
									field740.method7506(var32);
								}

								if (!var10.field3951 && var30) {
									var10.field3951 = true;
									if (var10.field3939 != null) {
										var32 = new Class99();
										var32.field1213 = true;
										var32.field1215 = var10;
										var32.field1212 = Class42.field231 - var27;
										var32.field1214 = Class42.field221 - var12;
										var32.field1217 = var10.field3939;
										field740.method7506(var32);
									}
								}

								if (var10.field3951 && var30 && var10.field3819 != null) {
									var32 = new Class99();
									var32.field1213 = true;
									var32.field1215 = var10;
									var32.field1212 = Class42.field231 - var27;
									var32.field1214 = Class42.field221 - var12;
									var32.field1217 = var10.field3819;
									field740.method7506(var32);
								}

								if (var10.field3951 && !var30) {
									var10.field3951 = false;
									if (var10.field3908 != null) {
										var32 = new Class99();
										var32.field1213 = true;
										var32.field1215 = var10;
										var32.field1212 = Class42.field231 - var27;
										var32.field1214 = Class42.field221 - var12;
										var32.field1217 = var10.field3908;
										field742.method7506(var32);
									}
								}

								if (var10.field3947 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3947;
									field741.method7506(var32);
								}

								int var35;
								Class99 var37;
								int var38;
								if (var10.field3913 != null && field723 > var10.field3881) {
									if (var10.field3885 != null && field723 - var10.field3881 <= 32) {
										label716:
										for (var38 = var10.field3881; var38 < field723; ++var38) {
											var24 = field722[var38 & 31];

											for (var35 = 0; var35 < var10.field3885.length; ++var35) {
												if (var10.field3885[var35] == var24) {
													var37 = new Class99();
													var37.field1215 = var10;
													var37.field1217 = var10.field3913;
													field740.method7506(var37);
													break label716;
												}
											}
										}
									} else {
										var32 = new Class99();
										var32.field1215 = var10;
										var32.field1217 = var10.field3913;
										field740.method7506(var32);
									}

									var10.field3881 = field723;
								}

								if (var10.field3915 != null && field646 > var10.field3893) {
									if (var10.field3916 != null && field646 - var10.field3893 <= 32) {
										label692:
										for (var38 = var10.field3893; var38 < field646; ++var38) {
											var24 = field724[var38 & 31];

											for (var35 = 0; var35 < var10.field3916.length; ++var35) {
												if (var10.field3916[var35] == var24) {
													var37 = new Class99();
													var37.field1215 = var10;
													var37.field1217 = var10.field3915;
													field740.method7506(var37);
													break label692;
												}
											}
										}
									} else {
										var32 = new Class99();
										var32.field1215 = var10;
										var32.field1217 = var10.field3915;
										field740.method7506(var32);
									}

									var10.field3893 = field646;
								}

								if (var10.field3917 != null && field727 > var10.field3956) {
									if (var10.field3954 != null && field727 - var10.field3956 <= 32) {
										label668:
										for (var38 = var10.field3956; var38 < field727; ++var38) {
											var24 = field713[var38 & 31];

											for (var35 = 0; var35 < var10.field3954.length; ++var35) {
												if (var24 == var10.field3954[var35]) {
													var37 = new Class99();
													var37.field1215 = var10;
													var37.field1217 = var10.field3917;
													field740.method7506(var37);
													break label668;
												}
											}
										}
									} else {
										var32 = new Class99();
										var32.field1215 = var10;
										var32.field1217 = var10.field3917;
										field740.method7506(var32);
									}

									var10.field3956 = field727;
								}

								if (field673 > var10.field3953 && var10.field3923 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3923;
									field740.method7506(var32);
								}

								if (field731 > var10.field3953 && var10.field3927 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3927;
									field740.method7506(var32);
								}

								if (field829 > var10.field3953 && var10.field3884 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3884;
									field740.method7506(var32);
								}

								if (field733 > var10.field3953 && var10.field3929 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3929;
									field740.method7506(var32);
								}

								if (field685 > var10.field3953 && var10.field3847 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3847;
									field740.method7506(var32);
								}

								if (field735 > var10.field3953 && var10.field3935 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3935;
									field740.method7506(var32);
								}

								if (field753 > var10.field3953 && var10.field3936 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3936;
									field740.method7506(var32);
								}

								if (field737 > var10.field3953 && var10.field3931 != null) {
									var32 = new Class99();
									var32.field1215 = var10;
									var32.field1217 = var10.field3931;
									field740.method7506(var32);
								}

								var10.field3953 = field721;
								if (var10.field3813 != null) {
									for (var38 = 0; var38 < field767; ++var38) {
										Class99 var36 = new Class99();
										var36.field1215 = var10;
										var36.field1210 = field618[var38];
										var36.field1218 = field768[var38];
										var36.field1217 = var10.field3813;
										field740.method7506(var36);
									}
								}

								Class99 var39;
								int[] var40;
								if (var10.field3822 != null) {
									var40 = field754.method4193();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new Class99();
										var39.field1215 = var10;
										var39.field1210 = var40[var24];
										var39.field1217 = var10.field3822;
										field740.method7506(var39);
									}
								}

								if (var10.field3811 != null) {
									var40 = field754.method4194();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new Class99();
										var39.field1215 = var10;
										var39.field1210 = var40[var24];
										var39.field1217 = var10.field3811;
										field740.method7506(var39);
									}
								}
							}
						}

						if (!var10.field3896) {
							if (field761 != null || field672) {
								continue;
							}

							if ((var10.field3941 >= 0 || 0 != var10.field3840) && Class42.field231 >= var13 && Class42.field221 >= var14 && Class42.field231 < var15 && Class42.field221 < var16) {
								if (var10.field3941 >= 0) {
									field1905 = var0[var10.field3941];
								} else {
									field1905 = var10;
								}
							}

							if (8 == var10.field3815 && Class42.field231 >= var13 && Class42.field221 >= var14 && Class42.field231 < var15 && Class42.field221 < var16) {
								field879 = var10;
							}

							if (var10.field3837 > var10.field3829) {
								method7471(var10, var27 + var10.field3828, var12, var10.field3829, var10.field3837, Class42.field231, Class42.field221);
							}
						}

						if (var10.field3815 == 0) {
							method194(var0, var10.field3812, var13, var14, var15, var16, var27 - var10.field3958, var12 - var10.field3835);
							if (var10.field3950 != null) {
								method194(var10.field3950, var10.field3812, var13, var14, var15, var16, var27 - var10.field3958, var12 - var10.field3835);
							}

							Class100 var33 = (Class100)field698.method9439((long)var10.field3812);
							if (var33 != null) {
								if (var33.field1223 == 0 && Class42.field231 >= var13 && Class42.field221 >= var14 && Class42.field231 < var15 && Class42.field221 < var16 && !field672) {
									for (Class99 var34 = (Class99)field740.method7526(); var34 != null; var34 = (Class99)field740.method7511()) {
										if (var34.field1213) {
											var34.method9267();
											var34.field1215.field3951 = false;
										}
									}

									if (field5084 == 0) {
										field761 = null;
										field710 = null;
									}

									if (!field672) {
										method566();
									}
								}

								method1944(var33.field1225, var13, var14, var15, var16, var27, var12);
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(owner = "ee", name = "nw", desc = "(III)V", opaque = "-408274122")
	public static void method2865(int var0, int var1) {
		if (field4644.method6412(var0)) {
			method4424(field4644.field3698[var0], var1);
		}
	}

	@ObfInfo(owner = "iu", name = "no", desc = "([Lnx;IB)V", opaque = "2")
	public static void method4424(Class362[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			Class362 var4 = var0[var3];
			if (var4 != null) {
				if (0 == var4.field3815) {
					if (var4.field3950 != null) {
						method4424(var4.field3950, var1);
					}

					Class100 var5 = (Class100)field698.method9439((long)var4.field3812);
					if (var5 != null) {
						method2865(var5.field1225, var1);
					}
				}

				Class99 var6;
				if (var1 == 0 && var4.field3932 != null) {
					var6 = new Class99();
					var6.field1215 = var4;
					var6.field1217 = var4.field3932;
					Class70.method2344(var6);
				}

				if (var1 == 1 && var4.field3834 != null) {
					if (var4.field3851 >= 0) {
						Class362 var7 = field4644.method6417(var4.field3812);
						if (var7 == null || var7.field3950 == null || var4.field3851 >= var7.field3950.length || var4 != var7.field3950[var4.field3851]) {
							continue;
						}
					}

					var6 = new Class99();
					var6.field1215 = var4;
					var6.field1217 = var4.field3834;
					Class70.method2344(var6);
				}
			}
		}

	}

	@ObfInfo(owner = "bi", name = "nh", desc = "(I)V", opaque = "1932459491")
	public static void method483() {
		for (Class100 var1 = (Class100)field698.method9442(); var1 != null; var1 = (Class100)field698.method9446()) {
			int var2 = var1.field1225;
			if (field4644.method6412(var2)) {
				boolean var3 = true;
				Class362[] var4 = field4644.field3698[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (null != var4[var5]) {
						var3 = var4[var5].field3896;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field5234;
					Class362 var6 = field4644.method6417(var5);
					if (var6 != null) {
						Class490.method8827(var6);
					}
				}
			}
		}

	}

	@ObfInfo(owner = "gp", name = "ne", desc = "(II)V")
	public static void method3553(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = 0.5F + (float)var0 / 200.0F;
		method3613((double)var2);
	}

	@ObfInfo(owner = "jm", name = "ny", desc = "(I)I")
	public static int method4783() {
		float var1 = 200.0F * ((float)field1474.method2468() - 0.5F);
		return 100 - Math.round(var1);
	}

	@ObfInfo(owner = "gx", name = "ns", desc = "(D)V")
	public static void method3613(double var0) {
		Class274.method5117(var0);
		((Class295)Class274.field2803.field3081).method5754(var0);
		if (field3069 != null) {
			field3069.method9115();
		}

		Class187.field2010.method6332();
		field1474.method2528(var0);
	}

	@ObfInfo(owner = "dg", name = "nx", desc = "(IB)V", opaque = "0")
	public static void method2360(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (field1474.method2544() != var0) {
			if (field1474.method2544() == 0 && Class323.method4690()) {
				Class390 var2 = field2221;
				if (!Class323.field3465.isEmpty()) {
					ArrayList var3 = new ArrayList();
					Iterator var4 = Class323.field3465.iterator();

					while (var4.hasNext()) {
						Class351 var5 = (Class351)var4.next();
						var5.field3758 = false;
						var5.field3757 = false;
						var5.field3763 = false;
						var5.field3760 = false;
						var5.field3756 = var2;
						var5.field3754 = var0;
						var5.field3752 = 0.0F;
						var3.add(var5);
					}

					Class323.method9265(var3, Class323.field3460, Class323.field3469, Class323.field3470, Class323.field3466, false);
				}

				field787 = false;
			} else if (var0 == 0) {
				Class323.method3075(0, 0);
				field787 = false;
			} else {
				Class323.method277(var0);
			}

			field1474.method2480(var0);
		}

	}

	@ObfInfo(owner = "es", name = "ng", desc = "(IB)V")
	public static void method3006(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		field1474.method2477(var0);
	}

	@ObfInfo(owner = "fm", name = "np", desc = "(II)V")
	public static void method3175(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		field1474.method2479(var0);
	}

	@ObfInfo(owner = "ej", name = "nk", desc = "(B)V", opaque = "-1")
	public static void method2918() {
		Class314 var1 = Class168.method3523(ClientPacket.field3433, field678.field1482);
		field678.method3013(var1);
		Class70.field873 = true;

		for (Class100 var2 = (Class100)field698.method9442(); var2 != null; var2 = (Class100)field698.method9446()) {
			if (0 == var2.field1223 || var2.field1223 == 3) {
				method7260(var2, true);
			}
		}

		if (field607 != null) {
			Class490.method8827(field607);
			field607 = null;
		}

		Class70.field873 = false;
	}

	@ObfInfo(owner = "pk", name = "on", desc = "(IIII)Ldv;", opaque = "1426009214")
	public static Class100 method7468(int var0, int var1, int var2) {
		Class100 var4 = new Class100();
		var4.field1225 = var1;
		var4.field1223 = var2;
		field698.method9445(var4, (long)var0);
		Class132.method3064(var1);
		Class362 var5 = field4644.method6417(var0);
		Class490.method8827(var5);
		if (field607 != null) {
			Class490.method8827(field607);
			field607 = null;
		}

		method4491(field4644.field3698[var0 >> 16], var5, false);
		Class70.method302(var1);
		if (-1 != field592) {
			method2865(field592, 1);
		}

		return var4;
	}

	@ObfInfo(owner = "ou", name = "oq", desc = "(Ldv;ZI)V", opaque = "-1980057961")
	public static void method7260(Class100 var0, boolean var1) {
		int var3 = var0.field1225;
		int var4 = (int)var0.field5234;
		var0.method9267();
		if (var1) {
			field4644.method6410(var3);
		}

		method9013(var3);
		Class362 var5 = field4644.method6417(var4);
		if (var5 != null) {
			Class490.method8827(var5);
		}

		if (-1 != field592) {
			method2865(field592, 1);
		}

	}

	@ObfInfo(owner = "fj", name = "ov", desc = "(Lnx;I)Z", opaque = "844315967")
	public static boolean method3157(Class362 var0) {
		int var2 = var0.field3817;
		if (var2 == 205) {
			field649 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				field815.method6426(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				field815.method6445(var3, var4 == 1);
			}

			if (var2 == 324) {
				field815.method6431(0);
			}

			if (var2 == 325) {
				field815.method6431(1);
			}

			if (var2 == 326) {
				Class314 var5 = Class168.method3523(ClientPacket.field3374, field678.field1482);
				field815.method6432(var5.field3270);
				field678.method3013(var5);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfInfo(owner = "ru", name = "od", desc = "(Lnx;IIIB)V", opaque = "1")
	public static void method8468(Class362 var0, int var1, int var2, int var3) {
		method3564();
		Class361 var5 = var0.method6708(field4644, false);
		if (var5 != null) {
			Class569.method10183(var1, var2, var5.field3798 + var1, var5.field3799 + var2);
			if (field780 != 2 && 5 != field780) {
				int var6 = field615 & 2047;
				int var7 = 48 + field4407.method1959() / 32;
				int var8 = 464 - field4407.method1966() / 32;
				field2209.method9660(var1, var2, var5.field3798, var5.field3799, var7, var8, var6, 256, var5.field3797, var5.field3800);

				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < field538; ++var9) {
					var10 = 2 + field775[var9] * 4 - field4407.method1959() / 32;
					var11 = 2 + 4 * field776[var9] - field4407.method1966() / 32;
					method7321(var1, var2, var10, var11, field580[var9], var5);
				}

				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						Class408 var17 = field5093.field1032[field5093.field1016][var9][var10];
						if (var17 != null) {
							var12 = var9 * 4 + 2 - field4407.method1959() / 32;
							var13 = var10 * 4 + 2 - field4407.method1966() / 32;
							method7321(var1, var2, var12, var13, field4871[0], var5);
						}
					}
				}

				for (var9 = 0; var9 < field5093.field1027; ++var9) {
					Class102 var15 = field5093.field1013[field5093.field1028[var9]];
					if (var15 != null && var15.method2254()) {
						Class184 var18 = var15.field1309;
						if (var18 != null && var18.field1966 != null) {
							var18 = var18.method3661();
						}

						if (var18 != null && var18.field1977 && var18.field1974) {
							var12 = var15.field1266 / 32 - field4407.method1959() / 32;
							var13 = var15.field1229 / 32 - field4407.method1966() / 32;
							method7321(var1, var2, var12, var13, field4871[1], var5);
						}
					}
				}

				var9 = field5093.field1017.field1402;
				int[] var16 = field5093.field1017.field1407;

				for (var11 = 0; var11 < var9; ++var11) {
					Class80 var19 = field5093.field1024[var16[var11]];
					if (var19 != null && var19.method2254() && !var19.field993 && field170 != var19) {
						var13 = var19.field1266 / 32 - field4407.method1959() / 32;
						int var14 = var19.field1229 / 32 - field4407.method1966() / 32;
						if (var19.method2240()) {
							method7321(var1, var2, var13, var14, field4871[3], var5);
						} else if (field170.field998 != 0 && 0 != var19.field998 && field170.field998 == var19.field998) {
							method7321(var1, var2, var13, var14, field4871[4], var5);
						} else if (var19.method2243()) {
							method7321(var1, var2, var13, var14, field4871[5], var5);
						} else if (var19.method2248()) {
							method7321(var1, var2, var13, var14, field4871[6], var5);
						} else {
							method7321(var1, var2, var13, var14, field4871[2], var5);
						}
					}
				}

				if (field550 != 0 && field541 % 20 < 10) {
					if (field550 == 1 && field820 >= 0 && field820 < field5093.field1013.length) {
						Class102 var20 = field5093.field1013[field820];
						if (var20 != null) {
							var12 = var20.field1266 / 32 - field4407.method1959() / 32;
							var13 = var20.field1229 / 32 - field4407.method1966() / 32;
							Class24.method323(var1, var2, var12, var13, field90[1], var5);
						}
					}

					if (2 == field550) {
						var11 = 2 + (field553 * 4 - field5093.field1019 * 4) - field4407.method1959() / 32;
						var12 = 2 + (field813 * 4 - field5093.field1021 * 4) - field4407.method1966() / 32;
						Class24.method323(var1, var2, var11, var12, field90[1], var5);
					}

					if (10 == field550 && field552 >= 0 && field552 < field5093.field1024.length) {
						Class80 var21 = field5093.field1024[field552];
						if (var21 != null) {
							var12 = var21.field1266 / 32 - field4407.method1959() / 32;
							var13 = var21.field1229 / 32 - field4407.method1966() / 32;
							Class24.method323(var1, var2, var12, var13, field90[1], var5);
						}
					}
				}

				if (field778 != 0) {
					var11 = 2 + field778 * 4 - field4407.method1959() / 32;
					var12 = field779 * 4 + 2 - field4407.method1966() / 32;
					method7321(var1, var2, var11, var12, field90[0], var5);
				}

				if (!field170.field993) {
					Class569.method10138(var5.field3798 / 2 + var1 - 1, var2 + var5.field3799 / 2 - 1, 3, 3, 16777215);
				}
			} else {
				Class569.method10149(var1, var2, 0, var5.field3797, var5.field3800);
			}

			field748[var3] = true;
		}
	}

	@ObfInfo(owner = "ik", name = "op", desc = "(Lnx;IIII)V", opaque = "269553664")
	public static void method4226(Class362 var0, int var1, int var2, int var3) {
		Class361 var5 = var0.method6708(field4644, false);
		if (var5 != null) {
			if (field780 < 3) {
				field894.method9660(var1, var2, var5.field3798, var5.field3799, 25, 25, field615, 256, var5.field3797, var5.field3800);
			} else {
				Class569.method10149(var1, var2, 0, var5.field3797, var5.field3800);
			}

		}
	}

	@ObfInfo(owner = "oz", name = "or", desc = "(IIIILvg;Lnw;I)V", opaque = "117021980")
	public static void method7321(int var0, int var1, int var2, int var3, Class553 var4, Class361 var5) {
		if (var4 != null) {
			int var7 = field615 & 2047;
			int var8 = var2 * var2 + var3 * var3;
			if (var8 <= 6400) {
				int var9 = Class274.field2804[var7];
				int var10 = Class274.field2805[var7];
				int var11 = var10 * var2 + var9 * var3 >> 16;
				int var12 = var10 * var3 - var9 * var2 >> 16;
				if (var8 > 2500) {
					var4.method9676(var5.field3798 / 2 + var11 - var4.field5425 / 2, var5.field3799 / 2 - var12 - var4.field5426 / 2, var0, var1, var5.field3798, var5.field3799, var5.field3797, var5.field3800);
				} else {
					var4.method9628(var0 + var5.field3798 / 2 + var11 - var4.field5425 / 2, var5.field3799 / 2 + var1 - var12 - var4.field5426 / 2);
				}

			}
		}
	}

	@ObfInfo(owner = "fy", name = "oy", desc = "(I)V", opaque = "663953354")
	public static void method3335() {
		Iterator var1 = Class115.field1428.iterator();

		while (var1.hasNext()) {
			Class63 var2 = (Class63)var1.next();
			var2.method1280();
		}

		if (field883 != null) {
			field883.method8370();
		}

	}

	@ObfInfo(owner = "tg", name = "oi", desc = "(I)V")
	public static void method8898() {
		field731 = field721;
	}

	@ObfInfo(owner = "rw", name = "of", desc = "(I)V")
	public static void method8513() {
		field829 = field721;
		field1770 = true;
	}

	@ObfInfo(owner = "pl", name = "om", desc = "(I)V")
	public static void method7474() {
		field733 = field721;
		field4443 = true;
	}

	@ObfInfo(owner = "ek", name = "og", desc = "(Ljava/lang/String;B)V", opaque = "2")
	public static void method2938(String var0) {
		if (field883 != null) {
			Class314 var2 = Class168.method3523(ClientPacket.field3434, field678.field1482);
			var2.field3270.method9809(Class562.method2698(var0));
			var2.field3270.method9816(var0);
			field678.method3013(var2);
		}
	}

	@ObfInfo(owner = "ek", name = "oc", desc = "(I)V")
	public static void method2941() {
		Class314 var1 = Class168.method3523(ClientPacket.field3440, field678.field1482);
		var1.field3270.method9809(0);
		field678.method3013(var1);
	}

	@ObfInfo(owner = "ex", name = "os", desc = "(III)V", opaque = "1621732562")
	public static void method3039(int var0, int var1) {
		Class166 var3 = var0 >= 0 ? field772[var0] : field2773;
		if (var3 != null && var1 >= 0 && var1 < var3.method3445()) {
			Class131 var4 = (Class131)var3.field1808.get(var1);
			if (var4.field1530 == -1) {
				String var5 = var4.field1528.method9789();
				Class314 var6 = Class168.method3523(ClientPacket.field3450, field678.field1482);
				var6.field3270.method9809(Class562.method2698(var5) + 3);
				var6.field3270.method9809(var0);
				var6.field3270.method9810(var1);
				var6.field3270.method9816(var5);
				field678.method3013(var6);
			}
		}
	}

	@ObfInfo(owner = "ln", name = "ox", desc = "(III)V", opaque = "219899573")
	public static void method5833(int var0, int var1) {
		if (null != field772[var0]) {
			if (var1 >= 0 && var1 < field772[var0].method3445()) {
				Class131 var3 = (Class131)field772[var0].field1808.get(var1);
				if (var3.field1530 == -1) {
					Class314 var4 = Class168.method3523(ClientPacket.field3361, field678.field1482);
					var4.field3270.method9809(Class562.method2698(var3.field1528.method9789()) + 3);
					var4.field3270.method9809(var0);
					var4.field3270.method9810(var1);
					var4.field3270.method9816(var3.field1528.method9789());
					field678.method3013(var4);
				}
			}
		}
	}

	@ObfInfo(owner = "ez", name = "oa", desc = "(IIZI)V", opaque = "1960568988")
	public static void method3060(int var0, int var1, boolean var2) {
		if (null != field772[var0]) {
			if (var1 >= 0 && var1 < field772[var0].method3445()) {
				Class131 var4 = (Class131)field772[var0].field1808.get(var1);
				Class314 var5 = Class168.method3523(ClientPacket.field3423, field678.field1482);
				var5.field3270.method9809(Class562.method2698(var4.field1528.method9789()) + 4);
				var5.field3270.method9809(var0);
				var5.field3270.method9810(var1);
				var5.field3270.method9827(var2);
				var5.field3270.method9816(var4.field1528.method9789());
				field678.method3013(var5);
			}
		}
	}

	@ObfInfo(owner = "tq", name = "ow", desc = "(IB)V", opaque = "1")
	public static void method9013(int var0) {
		for (Class508 var2 = (Class508)field769.method9442(); var2 != null; var2 = (Class508)field769.method9446()) {
			if ((var2.field5234 >> 48 & 65535L) == (long)var0) {
				var2.method9267();
			}
		}

	}

	@ObfInfo(owner = "gj", name = "ou", desc = "(Lnx;I)I", opaque = "-1815013130")
	public static int method3446(Class362 var0) {
		Class508 var2 = (Class508)field769.method9439((long)var0.field3851 + ((long)var0.field3812 << 32));
		return var2 != null ? var2.field5094 : var0.field3887;
	}

	@ObfInfo(owner = "gd", name = "ol", desc = "(Lnx;I)Z")
	public static boolean method3365(Class362 var0) {
		return var0.field3833;
	}

	@ObfInfo(owner = "ft", name = "oh", desc = "(Lnx;I)Ljava/lang/String;", opaque = "-85173996")
	public static String method3214(Class362 var0) {
		if (Class345.method5695(method3446(var0)) == 0) {
			return null;
		} else {
			return var0.field3899 != null && var0.field3899.trim().length() != 0 ? var0.field3899 : null;
		}
	}

	@ObfInfo(owner = "em", name = "oe", desc = "(Ljava/lang/String;I)V")
	public static void method2942(String var0) {
		field74 = var0;

		try {
			String var2 = field4671.getParameter(Integer.toString(18));
			String var3 = field4671.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var4 = var4 + "; Expires=" + Class356.method3185(Class329.method4953() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Client var5 = field4671;
			String var6 = "document.cookie=\"" + var4 + "\"";
		} catch (Throwable var7) {
		}

	}

	@ObfInfo(owner = "aj", name = "oj", desc = "(Ljava/lang/String;ZI)V", opaque = "1930833559")
	public static void method143(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < field918; ++var5) {
			Class187 var6 = Class187.method3421(var5);
			if ((!var1 || var6.field2058) && -1 == var6.field2049 && var6.field2013.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					field1226 = -1;
					field2687 = null;
					return;
				}

				if (var4 >= var3.length) {
					short[] var7 = new short[2 * var3.length];

					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}

					var3 = var7;
				}

				var3[var4++] = (short)var5;
			}
		}

		field2687 = var3;
		field477 = 0;
		field1226 = var4;
		String[] var9 = new String[field1226];

		for (int var10 = 0; var10 < field1226; ++var10) {
			var9[var10] = Class187.method3421(var3[var10]).field2013;
		}

		Class521.method3362(var9, field2687);
	}

	@ObfInfo(owner = "hi", name = "pj", desc = "(Lvp;IB)V", opaque = "8")
	public static void method3849(Class562 var0, int var1) {
		byte[] var3 = var0.field5472;
		if (field589 == null) {
			field589 = new byte[24];
		}

		Class458.method8430(var3, var1, field589, 0, 24);
		Class211.method4175(var0, var1);
	}

	@ObfInfo(owner = "bn", name = "pv", desc = "(Lvp;I)V", opaque = "-1378548013")
	public static void method570(Class562 var0) {
		if (field589 != null) {
			var0.method9819(field589, 0, field589.length);
		} else {
			byte[] var3 = new byte[24];

			try {
				Class211.field2285.method9313(0L);
				Class211.field2285.method9329(var3);

				int var4;
				for (var4 = 0; var4 < 24 && 0 == var3[var4]; ++var4) {
				}

				if (var4 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var5 = 0; var5 < 24; ++var5) {
					var3[var5] = -1;
				}
			}

			var0.method9819(var3, 0, var3.length);
		}
	}

	@ObfInfo(owner = "dx", name = "pk", desc = "(IIIZI)V", opaque = "-688446228")
	public static void method2715(int var0, int var1, int var2, boolean var3) {
		Class314 var5 = Class168.method3523(ClientPacket.field3413, field678.field1482);
		var5.field3270.method10010(var0);
		var5.field3270.method10036(var1);
		var5.field3270.method9857(var2);
		var5.field3270.method9878(var3 ? field627 : 0);
		field678.method3013(var5);
	}

	@ObfInfo(owner = "ee", name = "py", desc = "(I)Z", opaque = "266307720")
	public static boolean method2866() {
		return field705 >= 2;
	}

	@ObfInfo(owner = "hu", name = "pm", desc = "(II)V")
	public static void method3998(int var0) {
		field620 = var0;
	}

	@ObfInfo(owner = "fn", name = "ps", desc = "(B)V")
	public static void method3182() {
		field678.method3013(Class168.method3523(ClientPacket.field3427, field678.field1482));
		field620 = 0;
	}

	@ObfInfo(owner = "ir", name = "px", desc = "(B)V")
	public static void method4346() {
		if (field620 == 1) {
			field738 = true;
		}

	}

	@ObfInfo(owner = "ty", name = "pb", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaque = "-1361976443")
	public static String method9264(String var0) {
		Class365[] var2 = Class365.method3148();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class365 var4 = var2[var3];
			if (var4.field4006 != -1 && var0.startsWith(Class111.method7220(var4.field4006))) {
				var0 = var0.substring(Integer.toString(var4.field4006).length() + 6);
				break;
			}
		}

		return var0;
	}

	@ObfInfo(owner = "be", name = "pc", desc = "(Lcy;I)V", opaque = "1368012792")
	public static void method439(Class77 var0) {
		if (field1603 != var0) {
			field1603 = var0;
		}
	}

	@ObfInfo(owner = "gh", name = "pp", desc = "(ZS)V")
	public static void method3413(boolean var0) {
		field806 = var0;
	}

	@ObfInfo(owner = "os", name = "pe", desc = "(II)Luh;", opaque = "-103845045")
	public static Class528 method7236(int var0) {
		Class528 var2 = (Class528)field822.method6327((long)var0);
		if (var2 == null) {
			var2 = new Class528(field2574, Class535.method3352(var0), Class535.method7324(var0));
			field822.method6330(var2, (long)var0);
		}

		return var2;
	}

	@ObfInfo(owner = "gy", name = "po", desc = "(II)V")
	public static void method3615(int var0) {
		Class217 var2 = Class344.method6474(var0);
		if (var2.method4132()) {
			if (Class217.method6286(var2.field2351) == 2) {
				field826.add(var2.field2351);
			}

		}
	}

	@ObfInfo(owner = "fs", name = "pz", desc = "(I)Loe;")
	public static Class369 method3213() {
		return field2487;
	}
}
