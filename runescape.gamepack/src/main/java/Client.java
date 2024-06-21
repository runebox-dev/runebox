import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import io.runebox.ObfInfo;
import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(name = "client")
public final class Client extends Class31 implements Class456, OAuthApi, Class330 {
	@ObfInfo(owner = "rm", name = "vz", desc = "Ldx;")
	public static Class102 field4851;
	@ObfInfo(owner = "md", name = "ip", desc = "Leb;")
	public static Class106 field3381;
	@ObfInfo(owner = "lv", name = "qy", desc = "Lef;")
	public static Class110 field3250;
	@ObfInfo(name = "ej", desc = "Lej;")
	public static Class114 field516;
	@ObfInfo(name = "em", desc = "Lej;")
	public static Class114 field517;
	@ObfInfo(name = "ff", desc = "Lft;")
	public static Class150 field526;
	@ObfInfo(owner = "ho", name = "sp", desc = "Lgc;")
	public static Class159 field2020;
	@ObfInfo(name = "sl", desc = "[Lgc;")
	public static Class159[] field670;
	@ObfInfo(owner = "pl", name = "sx", desc = "Lgo;")
	public static Class171 field4619;
	@ObfInfo(name = "sd", desc = "[Lgo;")
	public static Class171[] field684;
	@ObfInfo(owner = "bq", name = "rr", desc = "Lgq;")
	public static Class173 field309;
	@ObfInfo(owner = "be", name = "ak", desc = "Lgz;")
	public static Class182 field209;
	@ObfInfo(owner = "gy", name = "er", desc = "Lhe;")
	public static Class187 field1898;
	@ObfInfo(owner = "qh", name = "io", desc = "Lhe;")
	public static Class187 field4686;
	@ObfInfo(name = "sr", desc = "Lih;")
	public static Class216 field510;
	@ObfInfo(name = "se", desc = "Lis;")
	public static Class227 field721;
	@ObfInfo(owner = "hh", name = "mz", desc = "Ljj;")
	public static Class244 field1955;
	@ObfInfo(name = "wt", desc = "Llm;")
	public static Class299 field647;
	@ObfInfo(name = "wb", desc = "Llm;")
	public static Class299 field779;
	@ObfInfo(owner = "fe", name = "tt", desc = "Lbd;")
	public static Class30 field1565;
	@ObfInfo(owner = "ib", name = "ou", desc = "Lnb;")
	public static Class340 field2118;
	@ObfInfo(owner = "bg", name = "ox", desc = "Lnb;")
	public static Class340 field230;
	@ObfInfo(name = "pf", desc = "Lnb;")
	public static Class340 field533;
	@ObfInfo(name = "pe", desc = "Lnb;")
	public static Class340 field541;
	@ObfInfo(name = "pn", desc = "Lnb;")
	public static Class340 field665;
	@ObfInfo(name = "px", desc = "Lnb;")
	public static Class340 field666;
	@ObfInfo(name = "ps", desc = "Lnb;")
	public static Class340 field669;
	@ObfInfo(owner = "hd", name = "qf", desc = "[Lnb;")
	public static Class340[] field1925;
	@ObfInfo(owner = "na", name = "ak", desc = "Lnd;")
	public static Class342 field3661;
	@ObfInfo(owner = "ae", name = "eh", desc = "Lnk;")
	public static Class349 field25;
	@ObfInfo(name = "vh", desc = "Lnt;")
	public static Class358 field771;
	@ObfInfo(owner = "gj", name = "ve", desc = "Loa;")
	public static Class365 field1829;
	@ObfInfo(owner = "iv", name = "cn", desc = "Lob;")
	public static Class366 field2428;
	@ObfInfo(owner = "nz", name = "ty", desc = "Lbk;")
	public static Class37 field3984;
	@ObfInfo(owner = "ao", name = "wj", desc = "Loj;")
	public static Class374 field69;
	@ObfInfo(owner = "fp", name = "aj", desc = "Lor;")
	public static Class382 field1661;
	@ObfInfo(owner = "gf", name = "al", desc = "Lor;")
	public static Class382 field1802;
	@ObfInfo(owner = "hf", name = "ak", desc = "Lor;")
	public static Class382 field1937;
	@ObfInfo(owner = "hl", name = "ak", desc = "Lor;")
	public static Class382 field1997;
	@ObfInfo(owner = "hl", name = "al", desc = "Lor;")
	public static Class382 field1998;
	@ObfInfo(owner = "ho", name = "ak", desc = "Lor;")
	public static Class382 field2012;
	@ObfInfo(owner = "hq", name = "ak", desc = "Lor;")
	public static Class382 field2039;
	@ObfInfo(owner = "hz", name = "ak", desc = "Lor;")
	public static Class382 field2102;
	@ObfInfo(owner = "ia", name = "ak", desc = "Lor;")
	public static Class382 field2111;
	@ObfInfo(owner = "ic", name = "aa", desc = "Lor;")
	public static Class382 field2123;
	@ObfInfo(owner = "ic", name = "af", desc = "Lor;")
	public static Class382 field2127;
	@ObfInfo(owner = "ic", name = "at", desc = "Lor;")
	public static Class382 field2131;
	@ObfInfo(owner = "ij", name = "aj", desc = "Lor;")
	public static Class382 field2191;
	@ObfInfo(owner = "ij", name = "ak", desc = "Lor;")
	public static Class382 field2200;
	@ObfInfo(owner = "ip", name = "al", desc = "Lor;")
	public static Class382 field2313;
	@ObfInfo(owner = "iq", name = "al", desc = "Lor;")
	public static Class382 field2315;
	@ObfInfo(owner = "bt", name = "aj", desc = "Lor;")
	public static Class382 field319;
	@ObfInfo(owner = "ma", name = "al", desc = "Lor;")
	public static Class382 field3267;
	@ObfInfo(owner = "mt", name = "al", desc = "Lor;")
	public static Class382 field3463;
	@ObfInfo(owner = "ph", name = "ak", desc = "Lor;")
	public static Class382 field4596;
	@ObfInfo(owner = "uw", name = "ak", desc = "Lor;")
	public static Class382 field5319;
	@ObfInfo(owner = "dp", name = "fb", desc = "Lot;")
	public static Class384 field1255;
	@ObfInfo(owner = "dr", name = "fp", desc = "Lot;")
	public static Class384 field1275;
	@ObfInfo(owner = "ad", name = "fm", desc = "Lot;")
	public static Class384 field13;
	@ObfInfo(owner = "ef", name = "fk", desc = "Lot;")
	public static Class384 field1410;
	@ObfInfo(owner = "ei", name = "fe", desc = "Lot;")
	public static Class384 field1430;
	@ObfInfo(owner = "fc", name = "fr", desc = "Lot;")
	public static Class384 field1556;
	@ObfInfo(owner = "fm", name = "fx", desc = "Lot;")
	public static Class384 field1647;
	@ObfInfo(owner = "fo", name = "fv", desc = "Lot;")
	public static Class384 field1660;
	@ObfInfo(owner = "fz", name = "eo", desc = "Lot;")
	public static Class384 field1750;
	@ObfInfo(owner = "gd", name = "fy", desc = "Lot;")
	public static Class384 field1793;
	@ObfInfo(owner = "kf", name = "fh", desc = "Lot;")
	public static Class384 field2961;
	@ObfInfo(owner = "kg", name = "ez", desc = "Lot;")
	public static Class384 field2971;
	@ObfInfo(owner = "kl", name = "eq", desc = "Lot;")
	public static Class384 field3018;
	@ObfInfo(owner = "ks", name = "ek", desc = "Lot;")
	public static Class384 field3083;
	@ObfInfo(owner = "ma", name = "fc", desc = "Lot;")
	public static Class384 field3269;
	@ObfInfo(owner = "mc", name = "ft", desc = "Lot;")
	public static Class384 field3371;
	@ObfInfo(owner = "me", name = "eg", desc = "Lot;")
	public static Class384 field3386;
	@ObfInfo(owner = "mg", name = "fa", desc = "Lot;")
	public static Class384 field3392;
	@ObfInfo(owner = "my", name = "fz", desc = "Lot;")
	public static Class384 field3528;
	@ObfInfo(owner = "ca", name = "ee", desc = "Lot;")
	public static Class384 field386;
	@ObfInfo(owner = "ck", name = "fo", desc = "Lot;")
	public static Class384 field463;
	@ObfInfo(owner = "qy", name = "fg", desc = "Lot;")
	public static Class384 field4783;
	@ObfInfo(owner = "es", name = "cp", desc = "Loz;")
	public static Class390 field1497;
	@ObfInfo(name = "vb", desc = "[Lpg;")
	public static Class397[] field531;
	@ObfInfo(name = "rg", desc = "Lpk;")
	public static Class401 field523;
	@ObfInfo(name = "rz", desc = "Lpk;")
	public static Class401 field696;
	@ObfInfo(name = "rc", desc = "Lpk;")
	public static Class401 field697;
	@ObfInfo(name = "ri", desc = "Lpk;")
	public static Class401 field699;
	@ObfInfo(owner = "ht", name = "ci", desc = "Lpl;")
	public static Class402 field2071;
	@ObfInfo(owner = "cd", name = "wf", desc = "Lpr;")
	public static Class408 field422;
	@ObfInfo(owner = "ki", name = "ii", desc = "Lqb;")
	public static Class418 field3003;
	@ObfInfo(owner = "ky", name = "il", desc = "Lqb;")
	public static Class418 field3127;
	@ObfInfo(owner = "vf", name = "iy", desc = "Lqb;")
	public static Class418 field5366;
	@ObfInfo(name = "tu", desc = "[Lbp;")
	public static Class42[] field744;
	@ObfInfo(name = "ig", desc = "Lrd;")
	public static Class446 field551;
	@ObfInfo(owner = "eh", name = "sa", desc = "Lro;")
	public static Class457 field1420;
	@ObfInfo(name = "ws", desc = "Lry;")
	public static Class467 field777;
	@ObfInfo(owner = "ma", name = "wl", desc = "Lsf;")
	public static Class474 field3266;
	@ObfInfo(owner = "ck", name = "ew", desc = "Lsm;")
	public static Class481 field465;
	@ObfInfo(owner = "rt", name = "ib", desc = "Lsm;")
	public static Class481 field4879;
	@ObfInfo(owner = "ki", name = "fs", desc = "Lss;")
	public static Class487 field2997;
	@ObfInfo(owner = "bg", name = "qn", desc = "Lsz;")
	public static Class494 field242;
	@ObfInfo(owner = "at", name = "wm", desc = "Ltb;")
	public static Class496 field104;
	@ObfInfo(owner = "nu", name = "vv", desc = "Ltf;")
	public static Class500 field3963;
	@ObfInfo(name = "vn", desc = "Ltn;")
	public static Class508 field774;
	@ObfInfo(name = "uc", desc = "Ltt;")
	public static Class514 field749;
	@ObfInfo(name = "rj", desc = "Ltx;")
	public static Class518 field507;
	@ObfInfo(name = "oa", desc = "Ltx;")
	public static Class518 field654;
	@ObfInfo(name = "ub", desc = "Lty;")
	public static Class519 field750;
	@ObfInfo(name = "ut", desc = "Lty;")
	public static Class519 field751;
	@ObfInfo(owner = "oz", name = "ia", desc = "Ltz;")
	public static Class520 field4552;
	@ObfInfo(owner = "cv", name = "ae", desc = "[Luh;")
	public static Class528[] field910;
	@ObfInfo(owner = "do", name = "fj", desc = "Lca;")
	public static Class53 field1249;
	@ObfInfo(owner = "jz", name = "qj", desc = "Luj;")
	public static Class530 field2814;
	@ObfInfo(owner = "cf", name = "qu", desc = "Luj;")
	public static Class530 field431;
	@ObfInfo(owner = "ji", name = "cd", desc = "Lux;")
	public static Class544 field2627;
	@ObfInfo(owner = "au", name = "jc", desc = "Lvc;")
	public static Class549 field106;
	@ObfInfo(owner = "dy", name = "td", desc = "Lvc;")
	public static Class549 field1359;
	@ObfInfo(owner = "sn", name = "ju", desc = "Lvc;")
	public static Class549 field4958;
	@ObfInfo(owner = "ef", name = "ke", desc = "[Lvc;")
	public static Class549[] field1413;
	@ObfInfo(owner = "ic", name = "kb", desc = "[Lvc;")
	public static Class549[] field2153;
	@ObfInfo(owner = "jv", name = "kd", desc = "[Lvc;")
	public static Class549[] field2709;
	@ObfInfo(owner = "af", name = "jf", desc = "[Lvc;")
	public static Class549[] field29;
	@ObfInfo(owner = "oh", name = "kl", desc = "[Lvc;")
	public static Class549[] field4039;
	@ObfInfo(name = "tk", desc = "[Lvc;")
	public static Class549[] field575;
	@ObfInfo(owner = "ao", name = "jj", desc = "[Lvc;")
	public static Class549[] field76;
	@ObfInfo(owner = "tb", name = "so", desc = "Lvh;")
	public static Class553 field5081;
	@ObfInfo(name = "fi", desc = "Lvj;")
	public static Class555 field527;
	@ObfInfo(owner = "ea", name = "kn", desc = "[Lvl;")
	public static Class557[] field1374;
	@ObfInfo(owner = "ae", name = "jl", desc = "[Lvl;")
	public static Class557[] field23;
	@ObfInfo(owner = "bt", name = "km", desc = "[Lvl;")
	public static Class557[] field317;
	@ObfInfo(owner = "qt", name = "ah", desc = "[Lvl;")
	public static Class557[] field4733;
	@ObfInfo(owner = "dp", name = "tx", desc = "Lcd;")
	public static Class56 field1251;
	@ObfInfo(owner = "lu", name = "bp", desc = "Lvx;")
	public static Class569 field3241;
	@ObfInfo(name = "wg", desc = "Lce;")
	public static Class57 field776;
	@ObfInfo(name = "rs", desc = "Lvy;")
	public static Class570 field695;
	@ObfInfo(owner = "kr", name = "oz", desc = "Lcj;")
	public static Class62 field3069;
	@ObfInfo(owner = "bl", name = "vy", desc = "Lcq;")
	public static Class69 field274;
	@ObfInfo(owner = "ct", name = "mt", desc = "Lcz;")
	public static Class78 field894;
	@ObfInfo(owner = "au", name = "ms", desc = "Lde;")
	public static Class83 field107;
	@ObfInfo(owner = "co", name = "du", desc = "Ldg;")
	public static Class85 field830;
	@ObfInfo(owner = "jt", name = "ay", desc = "Ldi;")
	public static Class87 field2695;
	@ObfInfo(name = "ey", desc = "Ldn;")
	public static Class92 field519;
	@ObfInfo(name = "hy", desc = "Ldq;")
	public static Class95 field619;
	@ObfInfo(owner = "bt", name = "jy", desc = "Ldt;")
	public static Class98 field316;
	@ObfInfo(owner = "nf", name = "jd", desc = "Ldt;")
	public static Class98 field3857;
	@ObfInfo(owner = "pe", name = "jn", desc = "Ldt;")
	public static Class98 field4582;
	@ObfInfo(owner = "ht", name = "bb", desc = "Lclient;")
	public static Client field2077;
	@ObfInfo(owner = "en", name = "en", desc = "Z")
	public static boolean field1468;
	@ObfInfo(owner = "gw", name = "aa", desc = "Z")
	public static boolean field1887;
	@ObfInfo(owner = "jr", name = "sh", desc = "Z")
	public static boolean field2680;
	@ObfInfo(owner = "kx", name = "su", desc = "Z")
	public static boolean field3112;
	@ObfInfo(owner = "nx", name = "da", desc = "Z")
	public static boolean field3974;
	@ObfInfo(owner = "cg", name = "dd", desc = "Z")
	public static boolean field434;
	@ObfInfo(name = "dm", desc = "Z")
	public static boolean field485;
	@ObfInfo(owner = "ru", name = "bm", desc = "Z")
	public static boolean field4885;
	@ObfInfo(name = "nu", desc = "Z")
	public static boolean field494;
	@ObfInfo(name = "uv", desc = "Z")
	public static boolean field496;
	@ObfInfo(name = "do", desc = "Z")
	public static boolean field497;
	@ObfInfo(name = "ds", desc = "Z")
	public static boolean field498;
	@ObfInfo(name = "df", desc = "Z")
	public static boolean field499;
	@ObfInfo(name = "dl", desc = "Z")
	public static boolean field506;
	@ObfInfo(name = "by", desc = "Z")
	public static boolean field509;
	@ObfInfo(name = "ev", desc = "Z")
	public static boolean field518;
	@ObfInfo(owner = "ud", name = "fl", desc = "Z")
	public static boolean field5226;
	@ObfInfo(name = "cs", desc = "Z")
	public static boolean field528;
	@ObfInfo(name = "hu", desc = "Z")
	public static boolean field540;
	@ObfInfo(name = "if", desc = "Z")
	public static boolean field550;
	@ObfInfo(name = "jz", desc = "Z")
	public static boolean field560;
	@ObfInfo(name = "cz", desc = "Z")
	public static boolean field565;
	@ObfInfo(name = "ka", desc = "Z")
	public static boolean field569;
	@ObfInfo(name = "lo", desc = "Z")
	public static boolean field585;
	@ObfInfo(name = "lv", desc = "Z")
	public static boolean field587;
	@ObfInfo(name = "cm", desc = "Z")
	public static boolean field599;
	@ObfInfo(name = "mn", desc = "Z")
	public static boolean field607;
	@ObfInfo(name = "mj", desc = "Z")
	public static boolean field621;
	@ObfInfo(name = "nv", desc = "Z")
	public static boolean field628;
	@ObfInfo(name = "op", desc = "Z")
	public static boolean field639;
	@ObfInfo(name = "oh", desc = "Z")
	public static boolean field640;
	@ObfInfo(name = "oe", desc = "Z")
	public static boolean field641;
	@ObfInfo(name = "dr", desc = "Z")
	public static boolean field642;
	@ObfInfo(name = "og", desc = "Z")
	public static boolean field648;
	@ObfInfo(name = "pl", desc = "Z")
	public static boolean field663;
	@ObfInfo(name = "pi", desc = "Z")
	public static boolean field673;
	@ObfInfo(name = "pv", desc = "Z")
	public static boolean field676;
	@ObfInfo(name = "ma", desc = "Z")
	public static boolean field680;
	@ObfInfo(name = "pq", desc = "Z")
	public static boolean field692;
	@ObfInfo(name = "rw", desc = "Z")
	public static boolean field712;
	@ObfInfo(name = "tg", desc = "Z")
	public static boolean field737;
	@ObfInfo(name = "uh", desc = "Z")
	public static boolean field746;
	@ObfInfo(name = "ud", desc = "Z")
	public static boolean field747;
	@ObfInfo(name = "uj", desc = "Z")
	public static boolean field748;
	@ObfInfo(name = "um", desc = "Z")
	public static boolean field752;
	@ObfInfo(name = "ua", desc = "[Z")
	public static boolean[] field556;
	@ObfInfo(name = "nq", desc = "[Z")
	public static boolean[] field602;
	@ObfInfo(name = "rv", desc = "[Z")
	public static boolean[] field614;
	@ObfInfo(name = "oi", desc = "[Z")
	public static boolean[] field638;
	@ObfInfo(name = "rk", desc = "[Z")
	public static boolean[] field704;
	@ObfInfo(name = "ru", desc = "[Z")
	public static boolean[] field715;
	@ObfInfo(name = "hk", desc = "[B")
	public static byte[] field545;
	@ObfInfo(owner = "fa", name = "ji", desc = "[[B")
	public static byte[][] field1549;
	@ObfInfo(owner = "fz", name = "jm", desc = "[[B")
	public static byte[][] field1749;
	@ObfInfo(owner = "nw", name = "jb", desc = "[[B")
	public static byte[][] field3972;
	@ObfInfo(owner = "th", name = "jv", desc = "[[B")
	public static byte[][] field5146;
	@ObfInfo(owner = "au", name = "uz", desc = "I", intMultiplier = 926924483)
	public static int field110;
	@ObfInfo(owner = "dh", name = "kr", desc = "I", intMultiplier = -2049286697)
	public static int field1105;
	@ObfInfo(owner = "aw", name = "je", desc = "I", intMultiplier = -1372916459)
	public static int field121;
	@ObfInfo(owner = "dm", name = "cm", desc = "I", intMultiplier = 246565167)
	public static int field1215;
	@ObfInfo(owner = "ec", name = "af", desc = "I", intMultiplier = 786316707)
	public static int field1382;
	@ObfInfo(owner = "ef", name = "uo", desc = "I", intMultiplier = -464348323)
	public static int field1408;
	@ObfInfo(owner = "ef", name = "od", desc = "I", intMultiplier = 592748769)
	public static int field1414;
	@ObfInfo(owner = "eg", name = "gn", desc = "I", intMultiplier = 1565926211)
	public static int field1415;
	@ObfInfo(owner = "bc", name = "uu", desc = "I", intMultiplier = 981078451)
	public static int field148;
	@ObfInfo(owner = "ep", name = "gm", desc = "I", intMultiplier = -1360015913)
	public static int field1481;
	@ObfInfo(owner = "ew", name = "us", desc = "I", intMultiplier = -939137475)
	public static int field1523;
	@ObfInfo(owner = "ew", name = "wd", desc = "I", intMultiplier = -1566429995)
	public static int field1524;
	@ObfInfo(owner = "ew", name = "ug", desc = "I", intMultiplier = -1141587141)
	public static int field1526;
	@ObfInfo(owner = "ey", name = "kq", desc = "I", intMultiplier = 983493133)
	public static int field1538;
	@ObfInfo(owner = "fh", name = "mx", desc = "I", intMultiplier = 1642842793)
	public static int field1589;
	@ObfInfo(owner = "bd", name = "mw", desc = "I", intMultiplier = 601850613)
	public static int field172;
	@ObfInfo(owner = "ga", name = "cr", desc = "I", intMultiplier = 219921597)
	public static int field1751;
	@ObfInfo(owner = "gb", name = "kv", desc = "I", intMultiplier = 406002563)
	public static int field1760;
	@ObfInfo(owner = "gf", name = "ny", desc = "I", intMultiplier = 154647647)
	public static int field1800;
	@ObfInfo(owner = "be", name = "ai", desc = "I", intMultiplier = -1021134085)
	public static int field182;
	@ObfInfo(owner = "gt", name = "wv", desc = "I", intMultiplier = -1064170701)
	public static int field1870;
	@ObfInfo(owner = "gt", name = "ac", desc = "I", intMultiplier = -731788477)
	public static int field1874;
	@ObfInfo(owner = "hm", name = "qd", desc = "I", intMultiplier = 552008661)
	public static int field2007;
	@ObfInfo(owner = "hp", name = "kw", desc = "I", intMultiplier = 1143781377)
	public static int field2029;
	@ObfInfo(owner = "hw", name = "al", desc = "I", intMultiplier = 922606951)
	public static int field2083;
	@ObfInfo(owner = "af", name = "iz", desc = "I", intMultiplier = -148860909)
	public static int field26;
	@ObfInfo(owner = "jj", name = "lb", desc = "I", intMultiplier = -940011597)
	public static int field2629;
	@ObfInfo(owner = "jk", name = "ac", desc = "I", intMultiplier = 1852051081)
	public static int field2640;
	@ObfInfo(owner = "af", name = "qi", desc = "I", intMultiplier = 549714043)
	public static int field27;
	@ObfInfo(owner = "bl", name = "li", desc = "I", intMultiplier = 1550817359)
	public static int field271;
	@ObfInfo(owner = "jz", name = "un", desc = "I", intMultiplier = -1619357703)
	public static int field2816;
	@ObfInfo(owner = "bn", name = "ul", desc = "I", intMultiplier = 1294966735)
	public static int field283;
	@ObfInfo(owner = "jz", name = "ph", desc = "I", intMultiplier = -896049715)
	public static int field2838;
	@ObfInfo(owner = "kf", name = "uy", desc = "I", intMultiplier = -974194965)
	public static int field2960;
	@ObfInfo(owner = "kh", name = "uf", desc = "I", intMultiplier = -479904269)
	public static int field2982;
	@ObfInfo(owner = "kr", name = "gc", desc = "I", intMultiplier = -298360831)
	public static int field3071;
	@ObfInfo(owner = "kr", name = "nt", desc = "I", intMultiplier = -1507170361)
	public static int field3072;
	@ObfInfo(owner = "ks", name = "ix", desc = "I", intMultiplier = 1529251047)
	public static int field3090;
	@ObfInfo(owner = "lc", name = "af", desc = "I", intMultiplier = -1654126509)
	public static int field3152;
	@ObfInfo(owner = "lg", name = "gt", desc = "I", intMultiplier = 1892474103)
	public static int field3167;
	@ObfInfo(owner = "md", name = "gs", desc = "I", intMultiplier = -871116551)
	public static int field3372;
	@ObfInfo(owner = "mp", name = "ja", desc = "I", intMultiplier = 44592861)
	public static int field3436;
	@ObfInfo(owner = "mq", name = "ui", desc = "I", intMultiplier = -1119110507)
	public static int field3440;
	@ObfInfo(owner = "nd", name = "ue", desc = "I", intMultiplier = 888602669)
	public static int field3830;
	@ObfInfo(owner = "nm", name = "up", desc = "I", intMultiplier = -408496447)
	public static int field3887;
	@ObfInfo(owner = "nt", name = "kf", desc = "I", intMultiplier = -1994887817)
	public static int field3960;
	@ObfInfo(owner = "nu", name = "uw", desc = "I", intMultiplier = 1480863765)
	public static int field3961;
	@ObfInfo(owner = "om", name = "np", desc = "I", intMultiplier = -302371735)
	public static int field4141;
	@ObfInfo(owner = "cf", name = "gf", desc = "I", intMultiplier = -1001500755)
	public static int field429;
	@ObfInfo(owner = "on", name = "ov", desc = "I", intMultiplier = 2024379245)
	public static int field4348;
	@ObfInfo(owner = "pf", name = "ok", desc = "I", intMultiplier = -140212947)
	public static int field4587;
	@ObfInfo(owner = "pv", name = "cj", desc = "I", intMultiplier = 1729222907)
	public static int field4650;
	@ObfInfo(owner = "qj", name = "ic", desc = "I", intMultiplier = 135729133)
	public static int field4694;
	@ObfInfo(owner = "qp", name = "aj", desc = "I", intMultiplier = -898106349)
	public static int field4711;
	@ObfInfo(name = "kp", desc = "I", intMultiplier = 1152384791)
	public static int field484;
	@ObfInfo(owner = "rm", name = "ux", desc = "I", intMultiplier = -1657033645)
	public static int field4853;
	@ObfInfo(name = "mv", desc = "I", intMultiplier = 213058995)
	public static int field486;
	@ObfInfo(name = "ot", desc = "I", intMultiplier = 412502351)
	public static int field487;
	@ObfInfo(name = "pg", desc = "I", intMultiplier = -206483657)
	public static int field488;
	@ObfInfo(name = "co", desc = "I", intMultiplier = 676583951)
	public static int field489;
	@ObfInfo(name = "ce", desc = "I", intMultiplier = -171150743)
	public static int field491;
	@ObfInfo(name = "ei", desc = "I", intMultiplier = -676672631)
	public static int field492;
	@ObfInfo(name = "fu", desc = "I", intMultiplier = -860219627)
	public static int field493;
	@ObfInfo(owner = "sj", name = "nn", desc = "I", intMultiplier = 1281330719)
	public static int field4947;
	@ObfInfo(name = "sg", desc = "I", intMultiplier = 570791161)
	public static int field500;
	@ObfInfo(name = "dw", desc = "I", intMultiplier = 967009251)
	public static int field501;
	@ObfInfo(owner = "sz", name = "iv", desc = "I", intMultiplier = -190120109)
	public static int field5013;
	@ObfInfo(name = "de", desc = "I", intMultiplier = -1333263023)
	public static int field504;
	@ObfInfo(name = "dt", desc = "I", intMultiplier = -1276653507)
	public static int field512;
	@ObfInfo(name = "dp", desc = "I", intMultiplier = -1616729973)
	public static int field513;
	@ObfInfo(name = "dv", desc = "I", intMultiplier = -2146539957)
	public static int field514;
	@ObfInfo(name = "ca", desc = "I", intMultiplier = 1811237787)
	public static int field515;
	@ObfInfo(name = "eu", desc = "I", intMultiplier = 535821113)
	public static int field521;
	@ObfInfo(name = "lc", desc = "I", intMultiplier = 1095700823)
	public static int field522;
	@ObfInfo(name = "fq", desc = "I", intMultiplier = 1649979411)
	public static int field524;
	@ObfInfo(owner = "um", name = "an", desc = "I", intMultiplier = 46472907)
	public static int field5261;
	@ObfInfo(name = "ml", desc = "I", intMultiplier = -1894011999)
	public static int field530;
	@ObfInfo(name = "ch", desc = "I", intMultiplier = -995947895)
	public static int field532;
	@ObfInfo(name = "ir", desc = "I", intMultiplier = -1469562999)
	public static int field542;
	@ObfInfo(name = "hs", desc = "I", intMultiplier = -1444736081)
	public static int field546;
	@ObfInfo(name = "ie", desc = "I", intMultiplier = 58631603)
	public static int field549;
	@ObfInfo(name = "iu", desc = "I", intMultiplier = 504433759)
	public static int field553;
	@ObfInfo(name = "ih", desc = "I", intMultiplier = -840950563)
	public static int field554;
	@ObfInfo(name = "db", desc = "I", intMultiplier = -1485751769)
	public static int field555;
	@ObfInfo(name = "cw", desc = "I", intMultiplier = 2015442527)
	public static int field557;
	@ObfInfo(name = "rh", desc = "I", intMultiplier = -1774371555)
	public static int field558;
	@ObfInfo(name = "cf", desc = "I", intMultiplier = 753378011)
	public static int field561;
	@ObfInfo(name = "jo", desc = "I", intMultiplier = 700467845)
	public static int field564;
	@ObfInfo(name = "ko", desc = "I", intMultiplier = 1838715027)
	public static int field566;
	@ObfInfo(name = "dy", desc = "I", intMultiplier = 73668781)
	public static int field568;
	@ObfInfo(name = "kt", desc = "I", intMultiplier = 886127191)
	public static int field570;
	@ObfInfo(name = "ky", desc = "I", intMultiplier = 2080637623)
	public static int field571;
	@ObfInfo(name = "kz", desc = "I", intMultiplier = 171319421)
	public static int field572;
	@ObfInfo(name = "ll", desc = "I", intMultiplier = -323128913)
	public static int field573;
	@ObfInfo(name = "ki", desc = "I", intMultiplier = 886767377)
	public static int field574;
	@ObfInfo(name = "kh", desc = "I", intMultiplier = 1679308039)
	public static int field576;
	@ObfInfo(name = "kx", desc = "I", intMultiplier = -627689525)
	public static int field577;
	@ObfInfo(name = "ly", desc = "I", intMultiplier = 2012668925)
	public static int field579;
	@ObfInfo(name = "le", desc = "I", intMultiplier = -961913637)
	public static int field580;
	@ObfInfo(name = "lu", desc = "I", intMultiplier = -1846134361)
	public static int field581;
	@ObfInfo(name = "lg", desc = "I", intMultiplier = 1691905935)
	public static int field582;
	@ObfInfo(name = "ln", desc = "I", intMultiplier = 794263599)
	public static int field583;
	@ObfInfo(name = "fn", desc = "I", intMultiplier = -618272967)
	public static int field584;
	@ObfInfo(name = "ls", desc = "I", intMultiplier = 1451141151)
	public static int field586;
	@ObfInfo(name = "fd", desc = "I", intMultiplier = -1948376401)
	public static int field588;
	@ObfInfo(name = "lt", desc = "I", intMultiplier = 481094299)
	public static int field589;
	@ObfInfo(name = "lr", desc = "I", intMultiplier = 818089427)
	public static int field590;
	@ObfInfo(name = "tm", desc = "I", intMultiplier = -1468438125)
	public static int field594;
	@ObfInfo(name = "om", desc = "I", intMultiplier = 1091051327)
	public static int field595;
	@ObfInfo(name = "is", desc = "I", intMultiplier = -1952142175)
	public static int field596;
	@ObfInfo(name = "si", desc = "I", intMultiplier = -1130289429)
	public static int field597;
	@ObfInfo(owner = "an", name = "gj", desc = "I", intMultiplier = 1521460135)
	public static int field60;
	@ObfInfo(name = "mb", desc = "I", intMultiplier = -1679902223)
	public static int field600;
	@ObfInfo(name = "mh", desc = "I", intMultiplier = 1207558497)
	public static int field601;
	@ObfInfo(name = "mf", desc = "I", intMultiplier = -209186385)
	public static int field604;
	@ObfInfo(name = "mi", desc = "I", intMultiplier = -1792452175)
	public static int field605;
	@ObfInfo(name = "md", desc = "I", intMultiplier = -204153191)
	public static int field608;
	@ObfInfo(name = "qh", desc = "I", intMultiplier = 663610575)
	public static int field609;
	@ObfInfo(name = "mo", desc = "I", intMultiplier = -366864293)
	public static int field611;
	@ObfInfo(name = "ec", desc = "I", intMultiplier = -739090101)
	public static int field615;
	@ObfInfo(name = "no", desc = "I", intMultiplier = -1676534335)
	public static int field616;
	@ObfInfo(name = "kk", desc = "I", intMultiplier = -835672749)
	public static int field620;
	@ObfInfo(name = "nm", desc = "I", intMultiplier = 845393953)
	public static int field622;
	@ObfInfo(name = "ks", desc = "I", intMultiplier = 925056187)
	public static int field623;
	@ObfInfo(name = "pc", desc = "I", intMultiplier = 944647145)
	public static int field626;
	@ObfInfo(name = "nb", desc = "I", intMultiplier = 1214762271)
	public static int field629;
	@ObfInfo(name = "ob", desc = "I", intMultiplier = -1452246127)
	public static int field643;
	@ObfInfo(name = "pk", desc = "I", intMultiplier = 1935902859)
	public static int field644;
	@ObfInfo(name = "on", desc = "I", intMultiplier = 1852826997)
	public static int field645;
	@ObfInfo(name = "me", desc = "I", intMultiplier = 1560860713)
	public static int field646;
	@ObfInfo(name = "dk", desc = "I", intMultiplier = 184636729)
	public static int field649;
	@ObfInfo(name = "th", desc = "I", intMultiplier = -669537727)
	public static int field650;
	@ObfInfo(name = "pt", desc = "I", intMultiplier = -2058345993)
	public static int field655;
	@ObfInfo(name = "pm", desc = "I", intMultiplier = 1419726125)
	public static int field656;
	@ObfInfo(name = "iw", desc = "I", intMultiplier = -1696342819)
	public static int field657;
	@ObfInfo(name = "pr", desc = "I", intMultiplier = 576526631)
	public static int field659;
	@ObfInfo(name = "pa", desc = "I", intMultiplier = -1359640633)
	public static int field660;
	@ObfInfo(name = "oq", desc = "I", intMultiplier = -496775203)
	public static int field661;
	@ObfInfo(name = "py", desc = "I", intMultiplier = 655633371)
	public static int field662;
	@ObfInfo(name = "pw", desc = "I", intMultiplier = -601701583)
	public static int field668;
	@ObfInfo(name = "pj", desc = "I", intMultiplier = -405187715)
	public static int field671;
	@ObfInfo(name = "po", desc = "I", intMultiplier = -534982633)
	public static int field674;
	@ObfInfo(name = "ck", desc = "I", intMultiplier = -643724961)
	public static int field675;
	@ObfInfo(name = "qa", desc = "I", intMultiplier = -614524711)
	public static int field677;
	@ObfInfo(name = "qg", desc = "I", intMultiplier = -108515045)
	public static int field681;
	@ObfInfo(name = "qq", desc = "I", intMultiplier = 1605480393)
	public static int field683;
	@ObfInfo(name = "qc", desc = "I", intMultiplier = 1984437631)
	public static int field685;
	@ObfInfo(name = "qb", desc = "I", intMultiplier = -958874579)
	public static int field686;
	@ObfInfo(name = "qw", desc = "I", intMultiplier = -895902721)
	public static int field687;
	@ObfInfo(name = "qs", desc = "I", intMultiplier = 1772842415)
	public static int field688;
	@ObfInfo(name = "qo", desc = "I", intMultiplier = -1092809017)
	public static int field689;
	@ObfInfo(name = "qv", desc = "I", intMultiplier = 2045003501)
	public static int field691;
	@ObfInfo(name = "qk", desc = "I", intMultiplier = 1108853003)
	public static int field693;
	@ObfInfo(name = "re", desc = "I", intMultiplier = 457804249)
	public static int field694;
	@ObfInfo(name = "mq", desc = "I", intMultiplier = -1382789253)
	public static int field698;
	@ObfInfo(name = "rb", desc = "I", intMultiplier = -1213585137)
	public static int field701;
	@ObfInfo(name = "ow", desc = "I", intMultiplier = -1767500567)
	public static int field702;
	@ObfInfo(name = "qt", desc = "I", intMultiplier = -1253937119)
	public static int field703;
	@ObfInfo(name = "pz", desc = "I", intMultiplier = -103207115)
	public static int field706;
	@ObfInfo(name = "dc", desc = "I", intMultiplier = -1295160999)
	public static int field709;
	@ObfInfo(name = "ry", desc = "I", intMultiplier = 563385483)
	public static int field710;
	@ObfInfo(name = "jk", desc = "I", intMultiplier = 1850382471)
	public static int field711;
	@ObfInfo(name = "sc", desc = "I", intMultiplier = 1662378903)
	public static int field714;
	@ObfInfo(name = "sj", desc = "I", intMultiplier = -1613964547)
	public static int field716;
	@ObfInfo(name = "kg", desc = "I", intMultiplier = -819092385)
	public static int field717;
	@ObfInfo(name = "ql", desc = "I", intMultiplier = -1171404535)
	public static int field719;
	@ObfInfo(name = "sb", desc = "I", intMultiplier = 940483095)
	public static int field720;
	@ObfInfo(name = "sw", desc = "I", intMultiplier = -729682599)
	public static int field723;
	@ObfInfo(name = "dx", desc = "I", intMultiplier = -841060561)
	public static int field727;
	@ObfInfo(name = "sv", desc = "I", intMultiplier = 1325981057)
	public static int field729;
	@ObfInfo(name = "tw", desc = "I", intMultiplier = -1174915981)
	public static int field733;
	@ObfInfo(name = "tq", desc = "I", intMultiplier = 306981547)
	public static int field734;
	@ObfInfo(name = "mc", desc = "I", intMultiplier = -1072754781)
	public static int field735;
	@ObfInfo(name = "tn", desc = "I", intMultiplier = 1240587083)
	public static int field736;
	@ObfInfo(name = "oy", desc = "I", intMultiplier = 2127942889)
	public static int field738;
	@ObfInfo(name = "oj", desc = "I", intMultiplier = -1705433687)
	public static int field740;
	@ObfInfo(name = "dh", desc = "I", intMultiplier = -1765644963)
	public static int field742;
	@ObfInfo(name = "pb", desc = "I", intMultiplier = 715718325)
	public static int field753;
	@ObfInfo(name = "lf", desc = "I", intMultiplier = -1036129075)
	public static int field763;
	@ObfInfo(name = "vc", desc = "I", intMultiplier = 1122470769)
	public static int field764;
	@ObfInfo(name = "vl", desc = "I", intMultiplier = -248147819)
	public static int field766;
	@ObfInfo(name = "vi", desc = "I", intMultiplier = -1473664455)
	public static int field768;
	@ObfInfo(name = "vk", desc = "I", intMultiplier = -519264569)
	public static int field769;
	@ObfInfo(name = "vr", desc = "I", intMultiplier = 1752143465)
	public static int field770;
	@ObfInfo(name = "vu", desc = "I", intMultiplier = 1264861269)
	public static int field772;
	@ObfInfo(name = "vw", desc = "I", intMultiplier = 1840830891)
	public static int field773;
	@ObfInfo(name = "di", desc = "I", intMultiplier = 236353945)
	public static int field775;
	@ObfInfo(name = "dz", desc = "I", intMultiplier = -1456841351)
	public static int field778;
	@ObfInfo(name = "wk", desc = "I", intMultiplier = -130764561)
	public static int field780;
	@ObfInfo(name = "wh", desc = "I", intMultiplier = -1568752971)
	public static int field781;
	@ObfInfo(name = "ku", desc = "I", intMultiplier = -1020776691)
	public static int field784;
	@ObfInfo(name = "wi", desc = "I", intMultiplier = -539925881)
	public static int field785;
	@ObfInfo(name = "wr", desc = "I", intMultiplier = -1819816953)
	public static int field786;
	@ObfInfo(owner = "cu", name = "lq", desc = "I", intMultiplier = -763033945)
	public static int field897;
	@ObfInfo(owner = "cu", name = "uq", desc = "I", intMultiplier = 143254167)
	public static int field904;
	@ObfInfo(owner = "bc", name = "jq", desc = "[I")
	public static int[] field149;
	@ObfInfo(owner = "ey", name = "jr", desc = "[I")
	public static int[] field1536;
	@ObfInfo(owner = "fl", name = "jt", desc = "[I")
	public static int[] field1622;
	@ObfInfo(owner = "gt", name = "id", desc = "[I")
	public static int[] field1875;
	@ObfInfo(name = "nj", desc = "[I")
	public static int[] field495;
	@ObfInfo(name = "to", desc = "[I")
	public static int[] field511;
	@ObfInfo(owner = "tk", name = "at", desc = "[I")
	public static int[] field5165;
	@ObfInfo(owner = "ts", name = "jx", desc = "[I")
	public static int[] field5187;
	@ObfInfo(name = "lz", desc = "[I")
	public static int[] field520;
	@ObfInfo(name = "hz", desc = "[I")
	public static int[] field547;
	@ObfInfo(name = "tz", desc = "[I")
	public static int[] field563;
	@ObfInfo(name = "lw", desc = "[I")
	public static int[] field591;
	@ObfInfo(name = "lk", desc = "[I")
	public static int[] field592;
	@ObfInfo(name = "lx", desc = "[I")
	public static int[] field593;
	@ObfInfo(name = "lj", desc = "[I")
	public static int[] field598;
	@ObfInfo(name = "la", desc = "[I")
	public static int[] field606;
	@ObfInfo(name = "ne", desc = "[I")
	public static int[] field617;
	@ObfInfo(name = "nl", desc = "[I")
	public static int[] field624;
	@ObfInfo(name = "nk", desc = "[I")
	public static int[] field625;
	@ObfInfo(name = "nz", desc = "[I")
	public static int[] field627;
	@ObfInfo(name = "nf", desc = "[I")
	public static int[] field630;
	@ObfInfo(name = "nd", desc = "[I")
	public static int[] field631;
	@ObfInfo(name = "na", desc = "[I")
	public static int[] field632;
	@ObfInfo(name = "nx", desc = "[I")
	public static int[] field633;
	@ObfInfo(name = "ni", desc = "[I")
	public static int[] field634;
	@ObfInfo(name = "nc", desc = "[I")
	public static int[] field635;
	@ObfInfo(name = "qr", desc = "[I")
	public static int[] field664;
	@ObfInfo(name = "va", desc = "[I")
	public static int[] field667;
	@ObfInfo(name = "vt", desc = "[I")
	public static int[] field672;
	@ObfInfo(name = "qz", desc = "[I")
	public static int[] field678;
	@ObfInfo(name = "qm", desc = "[I")
	public static int[] field682;
	@ObfInfo(name = "im", desc = "[I")
	public static int[] field690;
	@ObfInfo(name = "lp", desc = "[I")
	public static int[] field700;
	@ObfInfo(name = "rl", desc = "[I")
	public static int[] field707;
	@ObfInfo(name = "rq", desc = "[I")
	public static int[] field708;
	@ObfInfo(name = "rt", desc = "[I")
	public static int[] field722;
	@ObfInfo(name = "ss", desc = "[I")
	public static int[] field724;
	@ObfInfo(name = "sy", desc = "[I")
	public static int[] field725;
	@ObfInfo(name = "ti", desc = "[I")
	public static int[] field731;
	@ObfInfo(name = "tj", desc = "[I")
	public static int[] field732;
	@ObfInfo(name = "tb", desc = "[I")
	public static int[] field739;
	@ObfInfo(name = "tc", desc = "[I")
	public static int[] field741;
	@ObfInfo(name = "ta", desc = "[I")
	public static int[] field743;
	@ObfInfo(name = "vs", desc = "[I")
	public static int[] field754;
	@ObfInfo(name = "qx", desc = "[I")
	public static int[] field755;
	@ObfInfo(name = "vo", desc = "[I")
	public static int[] field756;
	@ObfInfo(name = "rm", desc = "[I")
	public static int[] field757;
	@ObfInfo(name = "nw", desc = "[I")
	public static int[] field761;
	@ObfInfo(name = "sk", desc = "[I")
	public static int[] field783;
	@ObfInfo(name = "xq", desc = "[I")
	public static int[] field788;
	@ObfInfo(name = "xf", desc = "[I")
	public static int[] field789;
	@ObfInfo(owner = "cy", name = "hv", desc = "[I")
	public static int[] field970;
	@ObfInfo(owner = "au", name = "jp", desc = "[[I")
	public static int[][] field112;
	@ObfInfo(owner = "tp", name = "jh", desc = "[[I")
	public static int[][] field5183;
	@ObfInfo(name = "ld", desc = "[[I")
	public static int[][] field745;
	@ObfInfo(name = "jw", desc = "[[[I")
	public static int[][][] field559;
	@ObfInfo(name = "js", desc = "[[[I")
	public static int[][][] field567;
	@ObfInfo(owner = "av", name = "fw", desc = "Ljava/lang/String;")
	public static String field119;
	@ObfInfo(owner = "aw", name = "gy", desc = "Ljava/lang/String;")
	public static String field125;
	@ObfInfo(owner = "im", name = "gx", desc = "Ljava/lang/String;")
	public static String field2233;
	@ObfInfo(owner = "jn", name = "cc", desc = "Ljava/lang/String;")
	public static String field2657;
	@ObfInfo(owner = "mk", name = "gq", desc = "Ljava/lang/String;")
	public static String field3409;
	@ObfInfo(owner = "ah", name = "ga", desc = "Ljava/lang/String;")
	public static String field42;
	@ObfInfo(owner = "ou", name = "gp", desc = "Ljava/lang/String;")
	public static String field4509;
	@ObfInfo(owner = "ou", name = "gi", desc = "Ljava/lang/String;")
	public static String field4510;
	@ObfInfo(owner = "qs", name = "cb", desc = "Ljava/lang/String;")
	public static String field4720;
	@ObfInfo(name = "st", desc = "Ljava/lang/String;")
	public static String field483;
	@ObfInfo(name = "it", desc = "Ljava/lang/String;")
	public static String field503;
	@ObfInfo(name = "or", desc = "Ljava/lang/String;")
	public static String field578;
	@ObfInfo(name = "oc", desc = "Ljava/lang/String;")
	public static String field651;
	@ObfInfo(owner = "ct", name = "gg", desc = "Ljava/lang/String;")
	public static String field874;
	@ObfInfo(name = "of", desc = "[Ljava/lang/String;")
	public static String[] field636;
	@ObfInfo(name = "oo", desc = "[Ljava/lang/String;")
	public static String[] field637;
	@ObfInfo(name = "lm", desc = "[Ljava/lang/String;")
	public static String[] field652;
	@ObfInfo(name = "nr", desc = "[Ljava/lang/String;")
	public static String[] field679;
	@ObfInfo(owner = "am", name = "hx", desc = "Ljava/security/SecureRandom;")
	public static SecureRandom field54;
	@ObfInfo(name = "wz", desc = "Ljava/util/ArrayList;")
	public static ArrayList field713;
	@ObfInfo(name = "ij", desc = "Ljava/util/HashMap;")
	public static HashMap field552;
	@ObfInfo(name = "wc", desc = "Ljava/util/List;")
	public static List field782;
	@ObfInfo(owner = "fr", name = "et", desc = "J", longMultiplier = -1017482725618925639L)
	public static long field1681;
	@ObfInfo(owner = "hk", name = "wy", desc = "J", longMultiplier = -3325043838573669699L)
	public static long field1985;
	@ObfInfo(owner = "ml", name = "hc", desc = "J", longMultiplier = -5228586345600098271L)
	public static long field3415;
	@ObfInfo(name = "dg", desc = "J", longMultiplier = 8540685319604864889L)
	public static long field502;
	@ObfInfo(name = "dn", desc = "J", longMultiplier = -1981057678477566385L)
	public static long field505;
	@ObfInfo(name = "rp", desc = "J", longMultiplier = 4044768072575596341L)
	public static long field536;
	@ObfInfo(name = "mk", desc = "J", longMultiplier = 3453023163764971459L)
	public static long field612;
	@ObfInfo(name = "mg", desc = "J", longMultiplier = -2716180425969645215L)
	public static long field613;
	@ObfInfo(name = "sz", desc = "J", longMultiplier = 8080048737762926953L)
	public static long field726;
	@ObfInfo(name = "sm", desc = "[J")
	public static long[] field730;
	@ObfInfo(name = "vg", desc = "S")
	public static short field508;
	@ObfInfo(name = "vx", desc = "S")
	public static short field653;
	@ObfInfo(name = "vp", desc = "S")
	public static short field718;
	@ObfInfo(name = "vj", desc = "S")
	public static short field758;
	@ObfInfo(name = "vq", desc = "S")
	public static short field759;
	@ObfInfo(name = "vd", desc = "S")
	public static short field760;
	@ObfInfo(name = "vf", desc = "S")
	public static short field762;
	@ObfInfo(name = "vm", desc = "S")
	public static short field765;
	@ObfInfo(owner = "bd", name = "ah", desc = "[S")
	public static short[] field170;
	@ObfInfo(owner = "bm", name = "we", desc = "[S")
	public static short[] field277;
	@ObfInfo(owner = "ce", name = "aq", desc = "[S")
	public static short[] field423;
	@ObfInfo(owner = "ir", name = "ap", desc = "[[S")
	public static short[][] field2374;
	@ObfInfo(owner = "qh", name = "av", desc = "[[S")
	public static short[][] field4687;
	@ObfInfo(name = "iq", desc = "Lel;")
	public static final Class116 field548;
	@ObfInfo(name = "wo", desc = "Ljt;")
	public static final Class254 field728;
	@ObfInfo(name = "xw", desc = "Lcf;")
	public static final Class58 field787;
	@ObfInfo(name = "jg", desc = "[I")
	public static final int[] field562;
	@ObfInfo(name = "ns", desc = "[I")
	public static final int[] field618;
	@ObfInfo(name = "gd", desc = "Ljava/lang/String;")
	public static final String field538;
	@ObfInfo(name = "gw", desc = "Ljava/lang/String;")
	public static final String field539;
	@ObfInfo(name = "gh", desc = "Las;")
	public Class19 field535;
	@ObfInfo(name = "gk", desc = "Las;")
	public Class19 field705;
	@ObfInfo(name = "hd", desc = "Lab;")
	public Class2 field543;
	@ObfInfo(name = "gl", desc = "Lae;")
	public Class5 field529;
	@ObfInfo(name = "hw", desc = "Lua;")
	public Class521 field490;
	@ObfInfo(name = "gv", desc = "Z")
	public boolean field767;
	@ObfInfo(name = "gr", desc = "Lcom/jagex/oldscape/pub/OtlTokenRequester;")
	public OtlTokenRequester field610;
	@ObfInfo(name = "ge", desc = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;")
	public RefreshAccessTokenRequester field603;
	@ObfInfo(name = "gu", desc = "I", intMultiplier = 779277509)
	public int field534;
	@ObfInfo(name = "go", desc = "Ljava/lang/String;")
	public String field658;
	@ObfInfo(name = "gb", desc = "Ljava/util/concurrent/Future;")
	public Future field525;
	@ObfInfo(name = "gz", desc = "Ljava/util/concurrent/Future;")
	public Future field537;
	@ObfInfo(name = "hr", desc = "J", longMultiplier = 4940111494881884911L)
	public long field544;

	static {
		field509 = true;
		field557 = 1;
		field675 = 0;
		field532 = 0;
		field528 = false;
		field599 = false;
		field489 = -1;
		field561 = -1;
		field491 = -1;
		field565 = false;
		field515 = 222;
		field485 = false;
		field642 = false;
		field555 = 0;
		field497 = false;
		field498 = false;
		field499 = true;
		field778 = 0;
		field501 = 0;
		field502 = -1L;
		field709 = -1;
		field504 = -1;
		field505 = -1L;
		field506 = true;
		field649 = 0;
		field742 = 0;
		field568 = 0;
		field775 = 0;
		field727 = 0;
		field512 = 0;
		field513 = 0;
		field514 = 0;
		field492 = 0;
		field516 = Class114.field1434;
		field517 = Class114.field1434;
		field518 = false;
		field519 = Class92.field1218;
		field615 = 0;
		field521 = 0;
		field584 = 0;
		field493 = 0;
		field524 = 0;
		field588 = 0;
		field526 = Class150.field1686;
		field527 = Class555.field5389;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field538 = Class416.method3598(var2);
		int var6 = "com_jagex_auth_desktop_runelite:public".length();
		byte[] var7 = new byte[var6];

		for (int var8 = 0; var8 < var6; ++var8) {
			char var5 = "com_jagex_auth_desktop_runelite:public".charAt(var8);
			if (var5 > 127) {
				var7[var8] = 63;
			} else {
				var7[var8] = (byte)var5;
			}
		}

		String var0 = Class207.method3961(var7, 0, var7.length);
		field539 = var0;
		field540 = false;
		field619 = new Class95();
		field545 = null;
		field546 = 0;
		field547 = new int[250];
		field548 = new Class116();
		field549 = 0;
		field550 = false;
		field551 = new Class446();
		field552 = new HashMap();
		field553 = 0;
		field554 = 1;
		field657 = 0;
		field596 = 1;
		field542 = 0;
		field559 = new int[4][13][13];
		field560 = false;
		field567 = new int[4][13][13];
		field562 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field711 = -1;
		field564 = 0;
		field717 = 2301979;
		field566 = 5063219;
		field484 = 3353893;
		field620 = 7759444;
		field569 = false;
		field570 = 0;
		field571 = 128;
		field572 = 0;
		field623 = 0;
		field574 = 0;
		field784 = 0;
		field576 = 0;
		field577 = 0;
		field522 = 50;
		field579 = 0;
		field580 = 0;
		field581 = 0;
		field582 = 12;
		field583 = 6;
		field763 = 0;
		field585 = false;
		field586 = 0;
		field587 = false;
		field573 = 0;
		field589 = 0;
		field590 = 50;
		field591 = new int[field590];
		field592 = new int[field590];
		field593 = new int[field590];
		field520 = new int[field590];
		field606 = new int[field590];
		field700 = new int[field590];
		field745 = new int[field590][];
		field598 = new int[field590];
		field652 = new String[field590];
		field600 = 0;
		field601 = -1;
		field486 = -1;
		field698 = 0;
		field604 = 0;
		field605 = 0;
		field735 = 0;
		field607 = true;
		field608 = 0;
		field621 = true;
		field646 = -1;
		field611 = 0;
		field612 = -1L;
		field613 = -1L;
		field680 = true;
		field530 = 0;
		field616 = 0;
		field617 = new int[1000];
		field618 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field679 = new String[8];
		field602 = new boolean[8];
		field761 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field622 = -1;
		field495 = new int[25];
		field624 = new int[25];
		field625 = new int[25];
		field627 = new int[25];
		field494 = false;
		field628 = false;
		field629 = 0;
		field630 = new int[500];
		field631 = new int[500];
		field632 = new int[500];
		field633 = new int[500];
		field634 = new int[500];
		field635 = new int[500];
		field636 = new String[500];
		field637 = new String[500];
		field638 = new boolean[500];
		field639 = false;
		field640 = false;
		field641 = true;
		field661 = -1;
		field643 = -1;
		field738 = 0;
		field645 = 50;
		field702 = 0;
		field503 = null;
		field648 = false;
		field595 = -1;
		field487 = -1;
		field651 = null;
		field578 = null;
		field740 = -1;
		field654 = new Class518(8);
		field655 = 0;
		field656 = -1;
		field488 = 0;
		field533 = null;
		field659 = 0;
		field660 = 0;
		field626 = 0;
		field662 = -1;
		field663 = false;
		field541 = null;
		field665 = null;
		field666 = null;
		field644 = 0;
		field668 = 0;
		field669 = null;
		field692 = false;
		field671 = -1;
		field753 = -32669 * 715718325;
		field673 = false;
		field674 = -1;
		field706 = -1;
		field676 = false;
		field677 = 1;
		field678 = new int[32];
		field719 = 0;
		field755 = new int[32];
		field681 = 0;
		field682 = new int[32];
		field683 = 0;
		field664 = new int[32];
		field685 = 0;
		field686 = 0;
		field687 = 0;
		field688 = 0;
		field689 = 0;
		field703 = 0;
		field691 = 0;
		field609 = 0;
		field693 = 0;
		field694 = 0;
		field695 = new Class570();
		field696 = new Class401();
		field697 = new Class401();
		field523 = new Class401();
		field699 = new Class401();
		field507 = new Class518(512);
		field701 = 0;
		field558 = -2;
		field614 = new boolean[100];
		field704 = new boolean[100];
		field715 = new boolean[100];
		field722 = new int[100];
		field707 = new int[100];
		field708 = new int[100];
		field757 = new int[100];
		field710 = 0;
		field536 = 0L;
		field712 = true;
		field500 = 600;
		field714 = field500 / Class31.field181;
		field783 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field716 = 0;
		field597 = 0;
		field483 = "";
		field730 = new long[100];
		field720 = 0;
		field721 = new Class227();
		field510 = new Class216();
		field723 = 0;
		field724 = new int[128];
		field725 = new int[128];
		field726 = -1L;
		field670 = new Class159[4];
		field684 = new Class171[4];
		field729 = -1;
		field733 = 0;
		field731 = new int[1000];
		field732 = new int[1000];
		field575 = new Class549[1000];
		field734 = 0;
		field594 = 0;
		field736 = 0;
		field737 = false;
		field650 = 0;
		field739 = new int[50];
		field563 = new int[50];
		field741 = new int[50];
		field511 = new int[50];
		field743 = new int[50];
		field744 = new Class42[50];
		field496 = false;
		field746 = false;
		field747 = false;
		field748 = false;
		field749 = null;
		field750 = null;
		field751 = null;
		field752 = false;
		field556 = new boolean[5];
		field754 = new int[5];
		field672 = new int[5];
		field756 = new int[5];
		field667 = new int[5];
		field758 = 256;
		field759 = 205;
		field760 = 256;
		field508 = 320;
		field762 = 1;
		field718 = 32767;
		field653 = 1;
		field765 = 32767;
		field766 = 0;
		field764 = 0;
		field768 = 0;
		field769 = 0;
		field770 = 0;
		field771 = new Class358();
		field772 = -1;
		field773 = -1;
		field774 = new Class513();
		field531 = new Class397[8];
		field776 = new Class57();
		field777 = new Class467(8, Class459.field4870);
		field647 = new Class299(64);
		field779 = new Class299(64);
		field780 = -1;
		field781 = -1;
		field782 = new ArrayList();
		field728 = new Class254();
		field713 = new ArrayList(10);
		field785 = 0;
		field786 = 0;
		field787 = new Class58();
		field788 = new int[50];
		field789 = new int[50];
	}

	public Client() {
		this.field767 = false;
		this.field534 = 0;
		this.field544 = -1L;
	}

	@ObfInfo(name = "ba", desc = "(I)V")
	public final void method503() {
	}

	public final void init() {
		if (this.method481()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (var2 != null) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(Class113.field1429)) {
							field528 = true;
						} else {
							field528 = false;
						}
						break;
					case 4:
						if (-1 == field561) {
							field561 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field675 = Integer.parseInt(var2);
						break;
					case 6:
						field2071 = Class402.method7514(Integer.parseInt(var2));
						break;
					case 7:
						field2428 = Class366.method1136(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase(Class113.field1429)) {
						}
						break;
					case 9:
						field4720 = var2;
						break;
					case 10:
						field1497 = (Class390)Class62.method1112(Class390.method6653(), Integer.parseInt(var2));
						if (Class390.field4549 == field1497) {
							field2627 = Class544.field5324;
						} else {
							field2627 = Class544.field5330;
						}
						break;
					case 11:
						field3409 = var2;
						break;
					case 12:
						field557 = Integer.parseInt(var2);
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
						field1751 = Integer.parseInt(var2);
						break;
					case 15:
						field532 = Integer.parseInt(var2);
						break;
					case 17:
						field2657 = var2;
						break;
					case 21:
						field489 = Integer.parseInt(var2);
						break;
					case 22:
						field4510 = var2;
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							field515 = Integer.parseInt(var2);
						} else {
							field515 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			Class259.field2782 = false;
			field599 = false;
			field119 = this.getCodeBase().getHost();
			field69 = new Class374();
			String var5 = field2428.field3996;
			byte var6 = 0;
			if ((field675 & Class534.field5281.method175()) != 0) {
				field4509 = "beta";
			}

			try {
				Class179.method2405("oldschool", field4509, var5, var6, 23);
			} catch (Exception var4) {
				Class548.method8904((String)null, var4);
			}

			field2077 = this;
			field3152 = field561;
			field125 = System.getenv("JX_ACCESS_TOKEN");
			field2233 = System.getenv("JX_REFRESH_TOKEN");
			field42 = System.getenv("JX_SESSION_ID");
			field874 = System.getenv("JX_CHARACTER_ID");
			Class76.method3004(System.getenv("JX_DISPLAY_NAME"));
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field767 = true;
			}

			if (field491 == -1) {
				if (!this.method1198() && !this.method1737()) {
					field491 = 0;
				} else {
					field491 = 5;
				}
			}

			this.method478(765, 503, 222, 1);
		}
	}

	public void finalize() throws Throwable {
		Class332.field3459.remove(this);
		super.finalize();
	}

	@ObfInfo(name = "he", desc = "(I)Z")
	public boolean method1745() {
		return this.field534 == 1;
	}

	public void setClient(int var1) {
		this.field534 = var1;
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field610 = var1;
			Class76.method4120(10);
		}
	}

	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field603 = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return 10 == field555;
	}

	public long getAccountHash() {
		return this.field544;
	}

	@ObfInfo(name = "hj", desc = "(I)Z", opaque = "-1558399709")
	public boolean method1198() {
		return field125 != null && !field125.trim().isEmpty() && field2233 != null && !field2233.trim().isEmpty();
	}

	@ObfInfo(name = "hg", desc = "(I)Z", opaque = "631452313")
	public boolean method1737() {
		return field42 != null && !field42.trim().isEmpty() && field874 != null && !field874.trim().isEmpty();
	}

	@ObfInfo(name = "hb", desc = "(I)Z", opaque = "-1494226453")
	public boolean method1291() {
		return this.field610 != null;
	}

	@ObfInfo(name = "ht", desc = "(Ljava/lang/String;B)V", opaque = "0")
	public void method1201(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(field3409 + "shield/oauth/token" + (new Class517(var3)).method9346());
		Class462 var5 = new Class462();
		if (this.method1745()) {
			var5.method8513(field539);
		} else {
			var5.method8513(field538);
		}

		var5.method8544("Host", (new URL(field3409)).getHost());
		var5.method8517(Class472.field4924);
		Class15 var6 = Class15.field72;
		RefreshAccessTokenRequester var7 = this.field603;
		if (var7 != null) {
			this.field537 = var7.request(var6.method173(), var4, var5.method8509(), "");
		} else {
			Class8 var8 = new Class8(var4, var6, var5, this.field767);
			this.field535 = this.field529.method57(var8);
		}
	}

	@ObfInfo(name = "hh", desc = "(Ljava/lang/String;I)V", opaque = "-1302873064")
	public void method1202(String var1) throws IOException {
		URL var3 = new URL(field3409 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		Class462 var4 = new Class462();
		var4.method8514(var1);
		Class15 var5 = Class15.field66;
		OtlTokenRequester var6 = this.field610;
		if (var6 != null) {
			this.field525 = var6.request(var5.method173(), var3, var4.method8509(), "");
		} else {
			Class8 var7 = new Class8(var3, var5, var4, this.field767);
			this.field705 = this.field529.method57(var7);
		}
	}

	@ObfInfo(name = "ha", desc = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public void method1203(String var1, String var2) throws IOException, JSONException {
		URL var4 = new URL(field4510 + "game-session/v1/tokens");
		Class8 var5 = new Class8(var4, Class15.field72, this.field767);
		var5.method112().method8514(var1);
		var5.method112().method8517(Class472.field4924);
		JSONObject var6 = new JSONObject();
		var6.put("accountId", (Object)var2);
		var5.method125(new Class490(var6));
		this.field705 = this.field529.method57(var5);
	}

	@ObfInfo(name = "bk", desc = "(S)V", opaque = "133")
	public final void method493() {
		Class354.method7039(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		field434 = Class541.method5694(field675, Class534.field5281);
		field429 = 0 == field532 ? 43594 : 40000 + field557;
		field3167 = field532 == 0 ? 443 : field557 + 50000;
		field3071 = field429;
		field170 = Class346.field3862;
		field4687 = Class346.field3859;
		field423 = Class346.field3861;
		field2374 = Class346.field3860;
		field3381 = new Class120(this.field767, 222);
		this.method490();
		this.method603();
		field309 = this.method467();
		this.method473(field510, 0);
		this.method473(field721, 1);
		this.method468();
		field3266 = new Class474(255, Class179.field1885, Class179.field1890, 500000);
		field4851 = Class102.method7532();
		String var3 = Class545.field5340;
		Class40.field282 = this;
		if (var3 != null) {
			Class40.field279 = var3;
		}

		method3259(field4851.method2695());
		field274 = new Class69(field2627);
		this.field529 = new Class5("tokenRequest", 1, 1);
		Class199.method3887(this);
		field728.method4868();
	}

	@ObfInfo(name = "bp", desc = "(B)V", opaque = "0")
	public final void method484() {
		++field778;
		this.method1488();

		while (true) {
			Class386 var2;
			synchronized(Class377.field4138) {
				var2 = (Class386)Class377.field4135.method7480();
			}

			if (var2 == null) {
				boolean var3 = false;
				boolean var4 = false;
				if (!Class332.field3458.isEmpty()) {
					Class447 var5 = (Class447)Class332.field3458.get(0);
					if (var5 == null) {
						Class332.field3458.remove(0);
					} else if (var5.method7832()) {
						if (var5.method8375()) {
							System.out.println("Error in midimanager.service: " + var5.method8393());
							var3 = true;
						} else {
							if (var5.method8378() != null) {
								Class332.field3458.add(1, var5.method8378());
							}

							var4 = var5.method8376();
						}

						Class332.field3458.remove(0);
					} else {
						var4 = var5.method8376();
					}
				}

				if (var3) {
					Class332.field3458.clear();
					Class332.method2354();
				}

				if (var4 && field737 && field1565 != null) {
					field1565.method432();
				}

				method4066();
				field721.method4339();
				this.method472();
				Class33.method7462();
				if (field309 != null) {
					int var7 = field309.method134();
					field694 = var7;
				}

				if (field555 == 0) {
					method718();
					Class31.method164();
				} else if (5 == field555) {
					Class76.method155(this, field5366, field3127);
					method718();
					Class31.method164();
				} else if (10 != field555 && 11 != field555) {
					if (field555 == 20) {
						Class76.method155(this, field5366, field3127);
						this.method1211();
					} else if (50 == field555) {
						Class76.method155(this, field5366, field3127);
						this.method1211();
					} else if (field555 == 25) {
						if (field485) {
							method5783();
						}

						if (field642) {
							method3293(field316);
						}

						if (!field642 && !field485) {
							Class118.method2945(30);
						}
					}
				} else {
					Class76.method155(this, field5366, field3127);
				}

				if (30 == field555) {
					this.method1436();
				} else if (40 == field555 || 45 == field555) {
					this.method1211();
				}

				return;
			}

			var2.field4516.method7337(var2.field4515, (int)var2.field5170, var2.field4514, false);
		}
	}

	@ObfInfo(name = "br", desc = "(ZI)V", opaque = "-516888372")
	public final void method495(boolean var1) {
		if ((field555 == 10 || field555 == 20 || 30 == field555) && field536 != 0L && Class130.method3047() > field536) {
			method3259(method9643());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field614[var3] = true;
			}
		}

		if (0 == field555) {
			this.method497(Class76.field928, Class76.field942, var1, field5226);
		} else if (field555 == 5) {
			Class76.method2996(field3003, field5366, field3127);
		} else if (field555 != 10 && 11 != field555) {
			if (20 == field555) {
				Class76.method2996(field3003, field5366, field3127);
			} else if (field555 == 50) {
				Class76.method2996(field3003, field5366, field3127);
			} else if (field555 == 25) {
				if (field542 == 1) {
					if (field553 > field554) {
						field554 = field553;
					}

					var3 = (field554 * 50 - field553 * 50) / field554;
					method8554(Class378.field4155 + Class113.field1427 + Class113.field1423 + var3 + "%" + Class113.field1428, false);
				} else if (field542 == 2) {
					if (field657 > field596) {
						field596 = field657;
					}

					var3 = (field596 * 50 - field657 * 50) / field596 + 50;
					method8554(Class378.field4155 + Class113.field1427 + Class113.field1423 + var3 + "%" + Class113.field1428, false);
				} else {
					method8554(Class378.field4155, false);
				}
			} else if (field555 == 30) {
				this.method1372();
			} else if (field555 == 40) {
				method8554(Class378.field4156 + Class113.field1427 + Class378.field4421, false);
			} else if (45 == field555) {
				method8554(Class378.field4318, false);
			}
		} else {
			Class76.method2996(field3003, field5366, field3127);
		}

		if (field555 == 30 && field710 == 0 && !var1 && !field712) {
			for (var3 = 0; var3 < field701; ++var3) {
				if (field704[var3]) {
					field3241.method875(field722[var3], field707[var3], field708[var3], field757[var3]);
					field704[var3] = false;
				}
			}
		} else if (field555 > 0) {
			field3241.method877(0, 0);

			for (var3 = 0; var3 < field701; ++var3) {
				field704[var3] = false;
			}
		}

	}

	@ObfInfo(name = "bx", desc = "(I)V", opaque = "-1172799332")
	public final void method496() {
		if (field3250 != null && field3250.method2848()) {
			field3250.method2821();
		}

		if (field830 != null) {
			field830.field1050 = false;
		}

		field830 = null;
		field548.method2901();
		Class33.method1133();
		field309 = null;
		if (field1565 != null) {
			field1565.method405();
		}

		field69.method7176();
		Class377.method6261();
		if (field3381 != null) {
			field3381.method2757();
			field3381 = null;
		}

		Class179.method3510();
		this.field529.method60();
	}

	@ObfInfo(name = "hv", desc = "(B)V", opaque = "2")
	public void method1488() {
		if (1000 != field555) {
			boolean var2 = field69.method7173();
			if (!var2) {
				this.method1538();
			}

		}
	}

	@ObfInfo(name = "hw", desc = "(S)V", opaque = "151")
	public void method1538() {
		if (field69.field4095 >= 4) {
			this.method499("js5crc");
			Class118.method2945(1000);
		} else {
			if (field69.field4096 >= 4) {
				if (field555 <= 5) {
					this.method499("js5io");
					Class118.method2945(1000);
					return;
				}

				field521 = 3000;
				field69.field4096 = 3;
			}

			if (--field521 + 1 <= 0) {
				try {
					if (field615 == 0) {
						field1898 = field209.method3657(field119, field3071);
						++field615;
					}

					if (field615 == 1) {
						if (field1898.field1932 == 2) {
							this.method1210(-1);
							return;
						}

						if (field1898.field1932 == 1) {
							++field615;
						}
					}

					if (field615 == 2) {
						field465 = Class481.method3074((Socket)field1898.field1929, 40000, 5000);
						Class521 var2 = new Class521(5);
						var2.method9388(Class322.field3396.field3401);
						var2.method9590(222);
						field465.method8626(var2.field5221, 0, 5);
						++field615;
						field1681 = Class130.method3047();
					}

					if (3 == field615) {
						if (field465.method8622() > 0) {
							int var4 = field465.method8623();
							if (var4 != 0) {
								this.method1210(var4);
								return;
							}

							++field615;
						} else if (Class130.method3047() - field1681 > 30000L) {
							this.method1210(-2);
							return;
						}
					}

					if (field615 == 4) {
						field69.method7154(field465, field555 > 20);
						field1898 = null;
						field465 = null;
						field615 = 0;
						field584 = 0;
					}
				} catch (IOException var3) {
					this.method1210(-3);
				}

			}
		}
	}

	@ObfInfo(name = "hd", desc = "(II)V", opaque = "-1550318688")
	public void method1210(int var1) {
		field1898 = null;
		field465 = null;
		field615 = 0;
		if (field429 == field3071) {
			field3071 = field3167;
		} else {
			field3071 = field429;
		}

		++field584;
		if (field584 >= 2 && (var1 == 7 || var1 == 9)) {
			if (field555 <= 5) {
				this.method499("js5connect_full");
				Class118.method2945(1000);
			} else {
				field521 = 3000;
			}
		} else if (field584 >= 2 && var1 == 6) {
			this.method499("js5connect_outofdate");
			Class118.method2945(1000);
		} else if (field584 >= 4) {
			if (field555 <= 5) {
				this.method499("js5connect");
				Class118.method2945(1000);
			} else {
				field521 = 3000;
			}
		}

	}

	@ObfInfo(name = "hp", desc = "(I)V", opaque = "2039123776")
	public final void method1211() {
		Class481 var2 = field548.method2900();
		Class531 var3 = field548.field1447;

		try {
			if (field1249 == Class53.field363) {
				if (field54 == null && (field619.method2481() || field493 > 250)) {
					field54 = field619.method2490();
					field619.method2480();
					field619 = null;
				}

				if (field54 != null) {
					if (var2 != null) {
						var2.method8631();
						var2 = null;
					}

					field4686 = null;
					field550 = false;
					field493 = 0;
					if (field527.method10080()) {
						if (this.method1198()) {
							try {
								this.method1201(field2233);
								method788(Class53.field382);
							} catch (Throwable var21) {
								Class548.method8904((String)null, var21);
								method3995(65);
								return;
							}
						} else {
							if (!this.method1737()) {
								method3995(65);
								return;
							}

							try {
								this.method1203(field42, field874);
								method788(Class53.field384);
							} catch (Exception var20) {
								Class548.method8904((String)null, var20);
								method3995(65);
								return;
							}
						}
					} else {
						method788(Class53.field364);
					}
				}
			}

			Class4 var23;
			if (Class53.field382 == field1249) {
				if (this.field537 != null) {
					if (!this.field537.isDone()) {
						return;
					}

					if (this.field537.isCancelled()) {
						method3995(65);
						this.field537 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field537.get();
						if (!var4.isSuccess()) {
							method3995(65);
							this.field537 = null;
							return;
						}

						field125 = var4.getAccessToken();
						field2233 = var4.getRefreshToken();
						this.field537 = null;
					} catch (Exception var19) {
						Class548.method8904((String)null, var19);
						method3995(65);
						this.field537 = null;
						return;
					}
				} else {
					if (this.field535 == null) {
						method3995(65);
						return;
					}

					if (!this.field535.method279()) {
						return;
					}

					if (this.field535.method278()) {
						Class548.method8904(this.field535.method281(), (Throwable)null);
						method3995(65);
						this.field535 = null;
						return;
					}

					var23 = this.field535.method285();
					if (var23.method46() != 200) {
						method3995(65);
						this.field535 = null;
						return;
					}

					field493 = 0;
					Class490 var5 = new Class490(var23.method48());

					try {
						field125 = var5.method8942().getString("access_token");
						field2233 = var5.method8942().getString("refresh_token");
					} catch (Exception var18) {
						Class548.method8904("Error parsing tokens", var18);
						method3995(65);
						this.field535 = null;
						return;
					}
				}

				this.method1202(field125);
				method788(Class53.field384);
			}

			if (Class53.field384 == field1249) {
				if (this.field525 != null) {
					if (!this.field525.isDone()) {
						return;
					}

					if (this.field525.isCancelled()) {
						method3995(65);
						this.field525 = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.field525.get();
						if (!var24.isSuccess()) {
							method3995(65);
							this.field525 = null;
							return;
						}

						this.field658 = var24.getToken();
						this.field525 = null;
					} catch (Exception var17) {
						Class548.method8904((String)null, var17);
						method3995(65);
						this.field525 = null;
						return;
					}
				} else {
					if (this.field705 == null) {
						method3995(65);
						return;
					}

					if (!this.field705.method279()) {
						return;
					}

					if (this.field705.method278()) {
						Class548.method8904(this.field705.method281(), (Throwable)null);
						method3995(65);
						this.field705 = null;
						return;
					}

					var23 = this.field705.method285();
					if (var23.method46() != 200) {
						Class548.method8904("Response code: " + var23.method46() + "Response body: " + var23.method48(), (Throwable)null);
						method3995(65);
						this.field705 = null;
						return;
					}

					List var25 = (List)var23.method47().get("Content-Type");
					if (var25 != null && var25.contains(Class472.field4924.method8653())) {
						try {
							JSONObject var6 = new JSONObject(var23.method48());
							this.field658 = var6.getString("token");
						} catch (JSONException var16) {
							Class548.method8904((String)null, var16);
							method3995(65);
							this.field705 = null;
							return;
						}
					} else {
						this.field658 = var23.method48();
					}

					this.field705 = null;
				}

				field493 = 0;
				method788(Class53.field364);
			}

			if (field1249 == Class53.field364) {
				if (field4686 == null) {
					field4686 = field209.method3657(field119, field3071);
				}

				if (field4686.field1932 == 2) {
					throw new IOException();
				}

				if (field4686.field1932 == 1) {
					var2 = Class481.method3074((Socket)field4686.field1929, 40000, 5000);
					field548.method2894(var2);
					field4686 = null;
					method788(Class53.field365);
				}
			}

			Class316 var27;
			if (Class53.field365 == field1249) {
				field548.method2895();
				var27 = Class316.method6159();
				var27.field3379 = null;
				var27.field3373 = 0;
				var27.field3374 = new Class531(5000);
				var27.field3374.method9388(Class322.field3398.field3401);
				field548.method2897(var27);
				field548.method2899();
				var3.field5219 = 0;
				method788(Class53.field366);
			}

			int var26;
			if (field1249 == Class53.field366) {
				if (field1565 != null) {
					field1565.method403();
				}

				if (var2.method8621(1)) {
					var26 = var2.method8623();
					if (field1565 != null) {
						field1565.method403();
					}

					if (var26 != 0) {
						method3995(var26);
						return;
					}

					var3.field5219 = 0;
					method788(Class53.field367);
				}
			}

			if (Class53.field367 == field1249) {
				if (var3.field5219 < 8) {
					var26 = var2.method8622();
					if (var26 > 8 - var3.field5219) {
						var26 = 8 - var3.field5219;
					}

					if (var26 > 0) {
						var2.method8624(var3.field5221, var3.field5219, var26);
						var3.field5219 += var26;
					}
				}

				if (var3.field5219 == 8) {
					var3.field5219 = 0;
					field3415 = var3.method9411();
					method788(Class53.field368);
				}
			}

			if (field1249 == Class53.field368) {
				field548.field1447.field5219 = 0;
				field548.method2895();
				Class531 var31 = new Class531(500);
				int[] var28 = new int[]{field54.nextInt(), field54.nextInt(), field54.nextInt(), field54.nextInt()};
				var31.field5219 = 0;
				var31.method9388(1);
				var31.method9590(var28[0]);
				var31.method9590(var28[1]);
				var31.method9590(var28[2]);
				var31.method9590(var28[3]);
				var31.method9393(field3415);
				if (40 == field555) {
					var31.method9590(field970[0]);
					var31.method9590(field970[1]);
					var31.method9590(field970[2]);
					var31.method9590(field970[3]);
				} else {
					if (field555 == 50) {
						var31.method9388(Class150.field1690.method175());
						var31.method9590(field1215);
					} else {
						var31.method9388(field526.method175());
						switch(field526.field1691) {
						case 0:
						case 3:
							var31.method9390(field4650);
							++var31.field5219;
						case 1:
						default:
							break;
						case 2:
							var31.method9590(field4851.method2636(Class76.field955));
							break;
						case 4:
							var31.field5219 += 4;
						}
					}

					if (field527.method10080()) {
						var31.method9388(Class555.field5382.method175());
						var31.method9473(this.field658);
					} else {
						var31.method9388(Class555.field5389.method175());
						var31.method9473(Class76.field938);
					}
				}

				var31.method9430(Class73.field901, Class73.field902);
				field970 = var28;
				Class316 var7 = Class316.method6159();
				var7.field3379 = null;
				var7.field3373 = 0;
				var7.field3374 = new Class531(5000);
				var7.field3374.field5219 = 0;
				if (40 == field555) {
					var7.field3374.method9388(Class322.field3397.field3401);
				} else {
					var7.field3374.method9388(Class322.field3403.field3401);
				}

				var7.field3374.method9389(0);
				int var8 = var7.field3374.field5219;
				var7.field3374.method9590(222);
				var7.field3374.method9590(1);
				var7.field3374.method9388(field561);
				var7.field3374.method9388(field491);
				byte var9 = 0;
				var7.field3374.method9388(var9);
				var7.field3374.method9548(var31.field5221, 0, var31.field5219);
				int var10 = var7.field3374.field5219;
				var7.field3374.method9473(Class76.field955);
				var7.field3374.method9388((field712 ? 1 : 0) << 1 | (field599 ? 1 : 0));
				var7.field3374.method9389(field182);
				var7.field3374.method9389(field5261);
				method2301(var7.field3374);
				var7.field3374.method9473(field4720);
				var7.field3374.method9590(field1751);
				var7.field3374.method9388(0);
				Class521 var11 = new Class521(field3963.method9217());
				field3963.method9218(var11);
				var7.field3374.method9548(var11.field5221, 0, var11.field5221.length);
				var7.field3374.method9388(field561);
				var7.field3374.method9590(0);
				if (field434) {
					method3957(var7);
				} else {
					method7121(var7);
				}

				var7.field3374.method9531(var28, var10, var7.field3374.field5219);
				var7.field3374.method9401(var7.field3374.field5219 - var8);
				field548.method2897(var7);
				field548.method2899();
				field548.field1446 = new Class563(var28);
				int[] var12 = new int[4];

				for (int var13 = 0; var13 < 4; ++var13) {
					var12[var13] = 50 + var28[var13];
				}

				var3.method9766(var12);
				method788(Class53.field373);
			}

			int var29;
			if (Class53.field373 == field1249 && var2.method8622() > 0) {
				var26 = var2.method8623();
				if (var26 == 61) {
					var29 = var2.method8622();
					field3974 = var29 == 1 && var2.method8623() == 1;
					method788(Class53.field368);
				}

				if (var26 == 21 && 20 == field555) {
					method788(Class53.field375);
				} else if (var26 == 2) {
					if (field434) {
						method788(Class53.field388);
					} else {
						method788(Class53.field377);
					}
				} else if (var26 == 15 && field555 == 40) {
					field548.field1444 = -1;
					method788(Class53.field383);
				} else if (var26 == 64) {
					method788(Class53.field385);
				} else if (var26 == 23 && field524 < 1) {
					++field524;
					method788(Class53.field363);
				} else if (var26 == 29) {
					method788(Class53.field381);
				} else {
					if (var26 != 69) {
						method3995(var26);
						return;
					}

					method788(Class53.field370);
				}
			}

			if (field1249 == Class53.field388) {
				field5226 = true;
				method2970(Class92.field1222);
				Class118.method2945(0);
			}

			if (Class53.field370 == field1249 && var2.method8622() >= 2) {
				var2.method8624(var3.field5221, 0, 2);
				var3.field5219 = 0;
				field3372 = var3.method9407();
				method788(Class53.field380);
			}

			if (field1249 == Class53.field380 && var2.method8622() >= field3372) {
				var3.field5219 = 0;
				var2.method8624(var3.field5221, var3.field5219, field3372);
				Class20[] var34 = new Class20[]{Class20.field102};
				Class20 var32 = var34[var3.method9405()];

				try {
					Class26 var30 = Class387.method7379(var32);
					this.field543 = new Class2(var3, var30);
					method788(Class53.field369);
				} catch (Exception var15) {
					method3995(22);
					return;
				}
			}

			if (field1249 == Class53.field369 && this.field543.method19()) {
				this.field490 = this.field543.method21();
				this.field543.method20();
				this.field543 = null;
				if (this.field490 == null) {
					method3995(22);
					return;
				}

				field548.method2895();
				var27 = Class316.method6159();
				var27.field3379 = null;
				var27.field3373 = 0;
				var27.field3374 = new Class531(5000);
				var27.field3374.method9388(Class322.field3395.field3401);
				var27.field3374.method9389(this.field490.field5219);
				var27.field3374.method9452(this.field490);
				field548.method2897(var27);
				field548.method2899();
				this.field490 = null;
				method788(Class53.field373);
			}

			if (field1249 == Class53.field385 && var2.method8622() > 0) {
				field60 = var2.method8623();
				method788(Class53.field372);
			}

			if (field1249 == Class53.field372 && var2.method8622() >= field60) {
				var2.method8624(var3.field5221, 0, field60);
				var3.field5219 = 0;
				method788(Class53.field373);
			}

			if (field1249 == Class53.field375 && var2.method8622() > 0) {
				field588 = (var2.method8623() + 3) * 60;
				method788(Class53.field376);
			}

			if (Class53.field376 == field1249) {
				field493 = 0;
				Class76.method5778(Class378.field4398, Class378.field4187, field588 / 60 + Class378.field4188);
				if (--field588 <= 0) {
					method788(Class53.field363);
				}

			} else if (Class53.field387 == field1249) {
				var27 = Class316.method6159();
				var27.field3379 = null;
				var27.field3373 = 0;
				var27.field3374 = new Class531(5000);
				var27.field3374.method9388(Class322.field3400.field3401);
				var27.field3374.method9389(Class322.field3400.field3399);
				var27.field3374.method9458(field386.field4486);
				var27.field3374.method9556(0);
				var27.field3374.method9459(field4783.field4486);
				var27.field3374.method9459(field3083.field4486);
				var27.field3374.method9459(field3528.field4486);
				var27.field3374.method9459(field3386.field4486);
				var27.field3374.method9458(field3392.field4486);
				var27.field3374.method9458(field13.field4486);
				var27.field3374.method9590(field3018.field4486);
				var27.field3374.method9556(field1647.field4486);
				var27.field3374.method9458(field2971.field4486);
				var27.field3374.method9556(field463.field4486);
				var27.field3374.method9458(field1410.field4486);
				var27.field3374.method9458(field3371.field4486);
				field548.method2897(var27);
				field548.method2899();
				method788(Class53.field377);
			} else {
				if (field1249 == Class53.field377 && var2.method8622() >= 1) {
					field1481 = var2.method8623();
					if (Class322.field3404.field3399 != field1481) {
						method3995(field1481);
						return;
					}

					method788(Class53.field378);
				}

				if (Class53.field378 == field1249 && var2.method8622() >= field1481) {
					boolean var36 = var2.method8623() == 1;
					var2.method8624(var3.field5221, 0, 4);
					var3.field5219 = 0;
					boolean var35 = false;
					if (var36) {
						var29 = var3.method9761() << 24;
						var29 |= var3.method9761() << 16;
						var29 |= var3.method9761() << 8;
						var29 |= var3.method9761();
						field4851.method2634(Class76.field955, var29);
					}

					if (field540) {
						field4851.method2628(Class76.field955);
					} else {
						field4851.method2628((String)null);
					}

					Class102.method3696();
					field626 = var2.method8623();
					field663 = var2.method8623() == 1;
					field646 = var2.method8623();
					field646 <<= 8;
					field646 += var2.method8623();
					field611 = var2.method8623();
					var2.method8624(var3.field5221, 0, 8);
					var3.field5219 = 0;
					this.field544 = var3.method9411();
					var2.method8624(var3.field5221, 0, 8);
					var3.field5219 = 0;
					field612 = var3.method9411();
					var2.method8624(var3.field5221, 0, 8);
					var3.field5219 = 0;
					field613 = var3.method9411();
					Class191.method3562().method3720(this.field767);
					method788(Class53.field379);
				}

				if (Class53.field379 == field1249 && var2.method8622() >= field548.field1444) {
					var2.method8624(var3.field5221, 0, 1);
					var3.field5219 = 0;
					if (var3.method9767()) {
						var2.method8624(var3.field5221, 1, 1);
						var3.field5219 = 0;
					}

					Class338[] var37 = Class46.method855();
					var29 = var3.method9791();
					if (var29 < 0 || var29 >= var37.length) {
						throw new IOException("Invalid ServerProt: " + var29 + " at " + var3.field5219);
					}

					field548.field1449 = var37[var29];
					field548.field1444 = field548.field1449.field3536;
					var2.method8624(var3.field5221, 0, 2);
					var3.field5219 = 0;
					field548.field1444 = var3.method9407();

					try {
						Class45.method850(field2077, "zap");
					} catch (Throwable var14) {
					}

					method788(Class53.field374);
				}

				if (Class53.field374 == field1249) {
					if (var2.method8622() >= field548.field1444) {
						var3.field5219 = 0;
						var2.method8624(var3.field5221, 0, field548.field1444);
						field551.method8357();
						method8429();
						field3857.field1288.method2785(var3, true);
						field894 = field107;
						field5013 = -1;
						method8270(false, var3);
						field548.field1449 = null;
						field497 = false;
					}

				} else {
					if (Class53.field381 == field1249 && var2.method8622() >= 2) {
						var3.field5219 = 0;
						var2.method8624(var3.field5221, 0, 2);
						var3.field5219 = 0;
						field1415 = var3.method9407();
						method788(Class53.field371);
					}

					if (field1249 == Class53.field371 && var2.method8622() >= field1415) {
						var3.field5219 = 0;
						var2.method8624(var3.field5221, 0, field1415);
						var3.field5219 = 0;
						String var38 = var3.method9415();
						String var39 = var3.method9415();
						String var33 = var3.method9415();
						Class76.method5778(var38, var39, var33);
						Class118.method2945(10);
						if (field527.method10080()) {
							Class76.method4120(9);
						}
					}

					if (field1249 != Class53.field383) {
						++field493;
						if (field493 > 2000) {
							if (field524 < 1) {
								if (field429 == field3071) {
									field3071 = field3167;
								} else {
									field3071 = field429;
								}

								++field524;
								method788(Class53.field363);
							} else {
								method3995(-3);
							}
						}
					} else {
						if (field548.field1444 == -1) {
							if (var2.method8622() < 2) {
								return;
							}

							var2.method8624(var3.field5221, 0, 2);
							var3.field5219 = 0;
							field548.field1444 = var3.method9407();
						}

						if (var2.method8622() >= field548.field1444) {
							var2.method8624(var3.field5221, 0, field548.field1444);
							var3.field5219 = 0;
							var26 = field548.field1444;
							field551.method8359();
							field548.method2895();
							field548.field1447.field5219 = 0;
							field548.field1449 = null;
							field548.field1454 = null;
							field548.field1455 = null;
							field548.field1456 = null;
							field548.field1444 = 0;
							field548.field1450 = 0;
							field649 = 0;
							method6662();
							field736 = 0;
							field734 = 0;
							field3857.method2506();
							Class79.method3179();
							Class118.method2945(30);

							for (var29 = 0; var29 < 100; ++var29) {
								field614[var29] = true;
							}

							if (field548 != null && field548.field1446 != null) {
								var27 = Class316.method3908(Class315.field3365, field548.field1446);
								var27.field3374.method9388(method9643());
								var27.field3374.method9389(field182);
								var27.field3374.method9389(field5261);
								field548.method2897(var27);
							}

							field3857.field1288.method2785(var3, true);
							if (var26 != var3.field5219) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field524 < 1) {
				if (field3071 == field429) {
					field3071 = field3167;
				} else {
					field3071 = field429;
				}

				++field524;
				method788(Class53.field363);
			} else {
				method3995(-2);
			}
		}
	}

	@ObfInfo(name = "ii", desc = "(I)V", opaque = "-1882812901")
	public final void method1436() {
		if (field649 > 1) {
			--field649;
		}

		if (field549 > 0) {
			--field549;
		}

		if (field550) {
			field550 = false;
			method6176();
		} else {
			if (!field628) {
				method717();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method1219(field548); ++var2) {
			}

			if (30 == field555) {
				while (true) {
					Class34 var3 = (Class34)Class47.field323.method7600();
					boolean var19;
					if (var3 == null) {
						var19 = false;
					} else {
						var19 = true;
					}

					int var4;
					Class316 var20;
					if (!var19) {
						Class316 var21;
						int var22;
						if (field551.field4799) {
							var21 = Class316.method3908(Class315.field3286, field548.field1446);
							var21.field3374.method9388(0);
							var22 = var21.field3374.field5219;
							field551.method8365(var21.field3374);
							var21.field3374.method9386(var21.field3374.field5219 - var22);
							field548.method2897(var21);
							field551.method8358();
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
						synchronized(field830.field1047) {
							if (!field509) {
								field830.field1048 = 0;
							} else if (0 != Class33.field237 || field830.field1048 >= 40) {
								var20 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								var7 = 0;

								for (var8 = 0; var8 < field830.field1048 && (var20 == null || var20.field3374.field5219 - var4 < 246); ++var8) {
									var5 = var8;
									var9 = field830.field1053[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									var10 = field830.field1049[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (field709 != var10 || var9 != field504) {
										if (var20 == null) {
											var20 = Class316.method3908(Class315.field3315, field548.field1446);
											var20.field3374.method9388(0);
											var4 = var20.field3374.field5219;
											Class531 var10000 = var20.field3374;
											var10000.field5219 += 2;
											var6 = 0;
											var7 = 0;
										}

										if (field505 != -1L) {
											var11 = var10 - field709;
											var12 = var9 - field504;
											var13 = (int)((field830.field1051[var8] - field505) / 20L);
											var6 = (int)((long)var6 + (field830.field1051[var8] - field505) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field709 = var10;
										field504 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var20.field3374.method9389((var13 << 12) + (var11 << 6) + var12);
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var20.field3374.method9388(var13 + 128);
											var20.field3374.method9389((var11 << 8) + var12);
										} else if (var13 < 32) {
											var20.field3374.method9388(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var20.field3374.method9590(var10 | var9 << 16);
											} else {
												var20.field3374.method9590(Integer.MIN_VALUE);
											}
										} else {
											var20.field3374.method9389(57344 + (var13 & 8191));
											if (var10 != -1 && var9 != -1) {
												var20.field3374.method9590(var10 | var9 << 16);
											} else {
												var20.field3374.method9590(Integer.MIN_VALUE);
											}
										}

										++var7;
										field505 = field830.field1051[var8];
									}
								}

								if (var20 != null) {
									var20.field3374.method9386(var20.field3374.field5219 - var4);
									var8 = var20.field3374.field5219;
									var20.field3374.field5219 = var4;
									var20.field3374.method9388(var6 / var7);
									var20.field3374.method9388(var6 % var7);
									var20.field3374.field5219 = var8;
									field548.method2897(var20);
								}

								if (var5 >= field830.field1048) {
									field830.field1048 = 0;
								} else {
									Class85 var54 = field830;
									var54.field1048 -= var5;
									System.arraycopy(field830.field1049, var5, field830.field1049, 0, field830.field1048);
									System.arraycopy(field830.field1053, var5, field830.field1053, 0, field830.field1048);
									System.arraycopy(field830.field1051, var5, field830.field1051, 0, field830.field1048);
								}
							}
						}

						if (1 == Class33.field237 || !field1468 && Class33.field237 == 4 || 2 == Class33.field237) {
							long var23 = Class33.field240 - field502;
							if (var23 > 32767L) {
								var23 = 32767L;
							}

							field502 = Class33.field240;
							var4 = Class33.field239;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > field5261) {
								var4 = field5261;
							}

							var5 = Class33.field238;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > field182) {
								var5 = field182;
							}

							var6 = (int)var23;
							Class316 var29 = Class316.method3908(Class315.field3319, field548.field1446);
							var29.field3374.method9389((Class33.field237 == 2 ? 1 : 0) + (var6 << 1));
							var29.field3374.method9389(var5);
							var29.field3374.method9389(var4);
							field548.method2897(var29);
						}

						if (0 != field694) {
							var21 = Class316.method3908(Class315.field3361, field548.field1446);
							var21.field3374.method9389(field694);
							field548.method2897(var21);
						}

						if (field721.field2380 > 0) {
							var21 = Class316.method3908(Class315.field3359, field548.field1446);
							var21.field3374.method9389(0);
							var22 = var21.field3374.field5219;
							long var24 = Class130.method3047();

							for (var6 = 0; var6 < field721.field2380; ++var6) {
								long var30 = var24 - field726;
								if (var30 > 16777215L) {
									var30 = 16777215L;
								}

								field726 = var24;
								var21.field3374.method9388(field721.field2386[var6]);
								var21.field3374.method9450((int)var30);
							}

							var21.field3374.method9401(var21.field3374.field5219 - var22);
							field548.method2897(var21);
						}

						if (field586 > 0) {
							--field586;
						}

						if (field721.method4342(96) || field721.method4342(97) || field721.method4342(98) || field721.method4342(99)) {
							field587 = true;
						}

						if (field587 && field586 <= 0) {
							field586 = 20;
							field587 = false;
							var21 = Class316.method3908(Class315.field3302, field548.field1446);
							var21.field3374.method9476(field571);
							var21.field3374.method9443(field572);
							field548.method2897(var21);
						}

						if (field4885 && !field506) {
							field506 = true;
							var21 = Class316.method3908(Class315.field3273, field548.field1446);
							var21.field3374.method9388(1);
							field548.method2897(var21);
						}

						if (!field4885 && field506) {
							field506 = false;
							var21 = Class316.method3908(Class315.field3273, field548.field1446);
							var21.field3374.method9388(0);
							field548.method2897(var21);
						}

						if (field104 != null) {
							field104.method9173();
						}

						method4908();
						if (field2680) {
							method8938();
							field2680 = false;
						}

						if (field3857.field1300 != field729) {
							field729 = field3857.field1300;
							var2 = field3857.field1300;
							int[] var25 = field1359.field5357;
							var4 = var25.length;

							for (var5 = 0; var5 < var4; ++var5) {
								var25[var5] = 0;
							}

							for (var5 = 1; var5 < 103; ++var5) {
								var6 = 24628 + 2048 * (103 - var5);

								for (var7 = 1; var7 < 103; ++var7) {
									if (0 == (field3857.field1292[var2][var7][var5] & 24)) {
										field3857.field1283.method4961(var25, var6, 512, var2, var7, var5);
									}

									if (var2 < 3 && (field3857.field1292[var2 + 1][var7][var5] & 8) != 0) {
										field3857.field1283.method4961(var25, var6, 512, var2 + 1, var7, var5);
									}

									var6 += 4;
								}
							}

							var5 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var6 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							field1359.method9922();

							for (var7 = 1; var7 < 103; ++var7) {
								for (var8 = 1; var8 < 103; ++var8) {
									if (0 == (field3857.field1292[var2][var8][var7] & 24)) {
										Class32.method675(var2, var8, var7, var5, var6);
									}

									if (var2 < 3 && 0 != (field3857.field1292[var2 + 1][var8][var7] & 8)) {
										Class32.method675(var2 + 1, var8, var7, var5, var6);
									}
								}
							}

							field733 = 0;

							for (var7 = 0; var7 < 104; ++var7) {
								for (var8 = 0; var8 < 104; ++var8) {
									long var37 = field3857.field1283.method4954(field3857.field1300, var7, var8);
									if (0L != var37) {
										var11 = Class274.method2942(var37);
										var12 = Class222.method4161(var11).field2272;
										if (var12 >= 0 && Class200.method3917(var12).field2056) {
											field575[field733] = Class200.method3917(var12).method3893(false);
											field731[field733] = var7;
											field732[field733] = var8;
											++field733;
										}
									}
								}
							}

							field3241.method10286();
						}

						if (field555 != 30) {
							return;
						}

						method2351(field3857);
						method676();
						++field548.field1450;
						if (field548.field1450 > 750) {
							method6176();
							return;
						}

						Class98 var26 = field3857;
						var22 = var26.field1288.field1392;
						int[] var27 = var26.field1288.field1393;

						for (var5 = 0; var5 < var22; ++var5) {
							Class83 var32 = var26.field1293[var27[var5]];
							if (var32 != null) {
								method1081(var26, var32, 1);
							}
						}

						Class231.method4409(field3857);
						Class98 var28 = field3857;

						for (var4 = 0; var4 < var28.field1286; ++var4) {
							var5 = var28.field1302[var4];
							Class488 var33 = var28.field1299[var5];
							if (var33 != null) {
								var33.method8908();
							}
						}

						Class63.method1134(field3857);

						for (var4 = 0; var4 < field3857.field1286; ++var4) {
							Class488 var34 = field3857.field1299[field3857.field1302[var4]];
							if (var34 != null) {
								method2351(var34.field4995);
								Class98 var36 = var34.field4995;
								var7 = var36.field1288.field1392;
								int[] var38 = var36.field1288.field1393;

								for (var9 = 0; var9 < var7; ++var9) {
									Class83 var41 = var36.field1293[var38[var9]];
									if (var41 != null) {
										method1081(var36, var41, 1);
									}
								}

								Class231.method4409(var34.field4995);
								Class63.method1134(var34.field4995);
							}
						}

						++field564;
						if (0 != field735) {
							field605 += 20;
							if (field605 >= 400) {
								field735 = 0;
							}
						}

						Class340 var31 = field230;
						Class340 var35 = field2118;
						field230 = null;
						field2118 = null;
						field669 = null;
						field673 = false;
						field692 = false;
						field723 = 0;

						while (field721.method4363() && field723 < 128) {
							if (field626 >= 2 && field721.method4342(82) && field721.field2389 == 66) {
								String var39 = Class340.method6646();
								field2077.method469(var39);
							} else if (1 != field577 || field721.field2377 <= 0) {
								field725[field723] = field721.field2389;
								field724[field723] = field721.field2377;
								++field723;
							}
						}

						if (Class221.method4169() && field721.method4342(82) && field721.method4342(81) && field694 != 0) {
							var6 = field107.field1023 - field694;
							if (var6 < 0) {
								var6 = 0;
							} else if (var6 > 3) {
								var6 = 3;
							}

							if (field107.field1023 != var6) {
								var7 = field3857.field1289 + field107.field1080[0];
								var8 = field107.field1127[0] + field3857.field1285;
								Class316 var42 = Class316.method3908(Class315.field3333, field548.field1446);
								var42.field3374.method9496(var6);
								var42.field3374.method9443(var8);
								var42.field3374.method9459(0);
								var42.field3374.method9389(var7);
								field548.method2897(var42);
							}

							field694 = 0;
						}

						if (-1 != field740) {
							method3689(field740, 0, 0, field182, field5261, 0, 0);
						}

						++field677;

						while (true) {
							Class340 var40;
							Class101 var45;
							Class340 var47;
							do {
								var45 = (Class101)field697.method7480();
								if (var45 == null) {
									while (true) {
										do {
											var45 = (Class101)field523.method7480();
											if (var45 == null) {
												while (true) {
													do {
														var45 = (Class101)field696.method7480();
														if (var45 == null) {
															boolean var48 = false;

															while (true) {
																Class231 var49 = (Class231)field699.method7480();
																if (var49 == null) {
																	if (!var48 && Class33.field237 == 1) {
																		field510.method4070();
																	}

																	this.method1220();
																	if (field104 != null) {
																		field104.method9001(field3857.field1300, (field894.method2199() >> 7) + field3857.field1289, (field894.method2191() >> 7) + field3857.field1285, false);
																		field104.method9005();
																	}

																	if (field665 != null) {
																		this.method1225();
																	}

																	boolean var51 = false;

																	for (var8 = 0; var8 < field3857.field1286; ++var8) {
																		Class488 var43 = field3857.field1299[field3857.field1302[var8]];
																		Class98 var44 = var43.field4995;
																		Class259 var50 = var44.field1283;
																		if (var43 != null && var50.method5089()) {
																			if (!var51) {
																				var12 = var50.field2763;
																				var13 = var50.field2764;
																				Class316 var14 = Class316.method3908(Class315.field3295, field548.field1446);
																				var14.field3374.method9388(5);
																				var14.field3374.method9443(var44.field1285 + var13);
																				var14.field3374.method9476(var44.field1289 + var12);
																				var14.field3374.method9388(field721.method4342(82) ? (field721.method4342(81) ? 2 : 1) : 0);
																				field548.method2897(var14);
																				var51 = true;
																				field698 = Class33.field238;
																				field604 = Class33.field239;
																				field735 = 1;
																				field605 = 0;
																				field734 = var12;
																				field594 = var13;
																			}

																			var50.method5060();
																		}
																	}

																	if (!var51 && field3857.field1283.method5089()) {
																		var8 = field3857.field1283.field2763;
																		var9 = field3857.field1283.field2764;
																		Class316 var46 = Class316.method3908(Class315.field3295, field548.field1446);
																		var46.field3374.method9388(5);
																		var46.field3374.method9443(var9 + field3857.field1285);
																		var46.field3374.method9476(field3857.field1289 + var8);
																		var46.field3374.method9388(field721.method4342(82) ? (field721.method4342(81) ? 2 : 1) : 0);
																		field548.method2897(var46);
																		field3857.field1283.method5060();
																		field698 = Class33.field238;
																		field604 = Class33.field239;
																		field735 = 1;
																		field605 = 0;
																		field734 = var8;
																		field594 = var9;
																	}

																	if (var51) {
																		field3857.field1283.method5060();
																	}

																	if (field230 != var31) {
																		if (var31 != null) {
																			Class317.method6187(var31);
																		}

																		if (field230 != null) {
																			Class317.method6187(field230);
																		}
																	}

																	if (field2118 != var35 && field645 == field738) {
																		if (var35 != null) {
																			Class317.method6187(var35);
																		}

																		if (field2118 != null) {
																			Class317.method6187(field2118);
																		}
																	}

																	if (field2118 != null) {
																		if (field738 < field645) {
																			++field738;
																			if (field645 == field738) {
																				Class317.method6187(field2118);
																			}
																		}
																	} else if (field738 > 0) {
																		--field738;
																	}

																	method7420();
																	if (field752) {
																		Class130.method3052();
																	} else if (field496) {
																		if (!field746) {
																			var8 = 64 + field904 * 128;
																			var9 = field3887 * 128 + 64;
																			var10 = method790(field3857, var8, var9, field3857.field1300) - field4853;
																			method2513(var8, var10, var9);
																		} else if (field749 != null) {
																			field3960 = field749.method9228();
																			field1538 = field749.method9229();
																			if (field748) {
																				field1760 = field749.method9230();
																			} else {
																				field1760 = method790(field3857, field3960, field1538, field3857.field1300) - field749.method9230();
																			}

																			field749.method9208();
																		}

																		if (!field747) {
																			var8 = 64 + field3440 * 128;
																			var9 = field2982 * 128 + 64;
																			var10 = method790(field3857, var8, var9, field3857.field1300) - field1523;
																			var11 = var8 - field3960;
																			var12 = var10 - field1760;
																			var13 = var9 - field1538;
																			int var53 = (int)Math.sqrt((double)(var13 * var13 + var11 * var11));
																			int var15 = (int)(Math.atan2((double)var12, (double)var53) * 325.9490051269531D) & 2047;
																			int var16 = (int)(Math.atan2((double)var11, (double)var13) * -325.9490051269531D) & 2047;
																			Class318.method6188(var15, var16);
																		} else {
																			if (field751 != null) {
																				field1105 = field751.method9378();
																				field1105 = Math.min(Math.max(field1105, 128), 383);
																				field751.method9208();
																			}

																			if (field750 != null) {
																				field2029 = field750.method9378() & 2047;
																				field750.method9208();
																			}
																		}
																	}

																	for (var8 = 0; var8 < 5; ++var8) {
																		int var10002 = field667[var8]++;
																	}

																	field3250.method2839();
																	var8 = Class33.method5159();
																	var9 = Class31.field208.method74();
																	Class316 var52;
																	if (var8 > 15000 && var9 > 15000) {
																		field549 = 250;
																		Class33.field241 = 14500;
																		var52 = Class316.method3908(Class315.field3324, field548.field1446);
																		field548.method2897(var52);
																	}

																	field274.method1918();
																	method9271();
																	++field548.field1443;
																	if (field548.field1443 > 50) {
																		var52 = Class316.method3908(Class315.field3354, field548.field1446);
																		field548.method2897(var52);
																	}

																	try {
																		field548.method2899();
																	} catch (IOException var17) {
																		method6176();
																	}

																	Class191.method3562().method3731();
																	return;
																}

																if (12 == var49.field2435.field3755) {
																	var48 = true;
																}

																method9901(var49);
															}
														}

														var47 = var45.field1325;
														if (var47.field3791 < 0) {
															break;
														}

														var40 = field25.method6718(var47.field3826);
													} while(var40 == null || var40.field3745 == null || var47.field3791 >= var40.field3745.length || var40.field3745[var47.field3791] != var47);

													Class72.method7210(var45);
												}
											}

											var47 = var45.field1325;
											if (var47.field3791 < 0) {
												break;
											}

											var40 = field25.method6718(var47.field3826);
										} while(var40 == null || var40.field3745 == null || var47.field3791 >= var40.field3745.length || var40.field3745[var47.field3791] != var47);

										Class72.method7210(var45);
									}
								}

								var47 = var45.field1325;
								if (var47.field3791 < 0) {
									break;
								}

								var40 = field25.method6718(var47.field3826);
							} while(var40 == null || var40.field3745 == null || var47.field3791 >= var40.field3745.length || var40.field3745[var47.field3791] != var47);

							Class72.method7210(var45);
						}
					}

					var20 = Class316.method3908(Class315.field3283, field548.field1446);
					var20.field3374.method9388(0);
					var4 = var20.field3374.field5219;
					Class201.method3922(var20.field3374);
					var20.field3374.method9386(var20.field3374.field5219 - var4);
					field548.method2897(var20);
				}
			}
		}
	}

	@ObfInfo(name = "ih", desc = "(III)V", opaque = "-717350458")
	public void method1208(int var1, int var2) {
		if (field548 != null && field548.field1446 != null) {
			if (var1 > -1 && field4851.method2637() > 0 && !field737) {
				Class316 var4 = Class316.method3908(Class315.field3274, field548.field1446);
				var4.field3374.method9590(var1);
				field548.method2897(var4);
			}

		}
	}

	@ObfInfo(name = "as", desc = "(I)V", opaque = "-1709856685")
	public final void method538() {
		field536 = Class130.method3047() + 500L;
		this.method1215();
		if (field740 != -1) {
			this.method1762(true);
		}

	}

	@ObfInfo(name = "jz", desc = "(I)V", opaque = "-487306652")
	public void method1215() {
		int var2 = field182;
		int var3 = field5261;
		if (super.field183 < var2) {
			var2 = super.field183;
		}

		if (super.field188 < var3) {
			var3 = super.field188;
		}

		if (field4851 != null) {
			try {
				Client var4 = field2077;
				Object[] var10000 = new Object[]{method9643()};
				var10000 = null;
			} catch (Throwable var6) {
			}
		}

	}

	@ObfInfo(name = "js", desc = "(I)V", opaque = "736289381")
	public final void method1372() {
		if (-1 != field740) {
			method3063(field740);
		}

		int var2;
		for (var2 = 0; var2 < field701; ++var2) {
			if (field614[var2]) {
				field704[var2] = true;
			}

			field715[var2] = field614[var2];
			field614[var2] = false;
		}

		field558 = field778;
		field661 = -1;
		field643 = -1;
		if (-1 != field740) {
			field701 = 0;
			method7206(field740, 0, 0, field182, field5261, 0, 0, -1);
		}

		Class561.method10143();
		if (field607) {
			if (field735 == 1) {
				field2709[field605 / 100].method10023(field698 - 8, field604 - 8);
			}

			if (2 == field735) {
				field2709[4 + field605 / 100].method10023(field698 - 8, field604 - 8);
			}
		}

		int var3;
		int var4;
		int var5;
		int var9;
		int var10;
		int var15;
		if (!field628) {
			if (-1 != field661) {
				var2 = field661;
				var3 = field643;
				if ((field629 >= 2 || field702 != 0 || field648) && field641) {
					var4 = field629 - 1;
					String var6;
					if (field702 == 1 && field629 < 2) {
						var6 = Class378.field4310 + Class378.field4320 + field503 + " " + Class113.field1424;
					} else if (field648 && field629 < 2) {
						var6 = field651 + Class378.field4320 + field578 + " " + Class113.field1424;
					} else {
						String var7;
						if (var4 < 0) {
							var7 = "";
						} else if (field637[var4].length() > 0) {
							var7 = field636[var4] + Class378.field4320 + field637[var4];
						} else {
							var7 = field636[var4];
						}

						var6 = var7;
					}

					if (field629 > 2) {
						var6 = var6 + Class113.method8551(16777215) + " " + '/' + " " + (field629 - 2) + Class378.field4380;
					}

					field3003.method8006(var6, var2 + 4, var3 + 15, 16777215, 0, field778 / 1000);
				}
			}
		} else {
			var2 = field1800;
			var3 = field4947;
			var4 = field3072;
			var5 = field4141;
			int var14 = 6116423;
			Class561.method10152(var2, var3, var4, var5, var14);
			Class561.method10152(var2 + 1, var3 + 1, var4 - 2, 16, 0);
			Class561.method10156(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
			field3003.method8017(Class378.field4313, var2 + 3, var3 + 14, var14, -1);
			var15 = Class33.field229;
			int var8 = Class33.field220;

			for (var9 = 0; var9 < field629; ++var9) {
				var10 = var3 + 31 + (field629 - 1 - var9) * 15;
				int var11 = 16777215;
				if (var15 > var2 && var15 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
					var11 = 16776960;
				}

				Class418 var12 = field3003;
				String var13;
				if (var9 < 0) {
					var13 = "";
				} else if (field637[var9].length() > 0) {
					var13 = field636[var9] + Class378.field4320 + field637[var9];
				} else {
					var13 = field636[var9];
				}

				var12.method8017(var13, var2 + 3, var10, var11, 0);
			}

			Class13.method163(field1800, field4947, field3072, field4141);
		}

		if (3 == field710) {
			for (var2 = 0; var2 < field701; ++var2) {
				if (field715[var2]) {
					Class561.method10151(field722[var2], field707[var2], field708[var2], field757[var2], 16711935, 128);
				} else if (field704[var2]) {
					Class561.method10151(field722[var2], field707[var2], field708[var2], field757[var2], 16711680, 128);
				}
			}
		}

		var2 = field3857.field1300;
		var3 = field107.field1065;
		var4 = field107.field1126;
		var5 = field564;

		for (Class77 var16 = (Class77)Class77.field976.method7482(); var16 != null; var16 = (Class77)Class77.field976.method7490()) {
			if (var16.field966 != -1 || var16.field964 != null) {
				var15 = 0;
				if (var3 > var16.field962) {
					var15 += var3 - var16.field962;
				} else if (var3 < var16.field973) {
					var15 += var16.field973 - var3;
				}

				if (var4 > var16.field963) {
					var15 += var4 - var16.field963;
				} else if (var4 < var16.field961) {
					var15 += var16.field961 - var4;
				}

				var15 = Math.max(var15 - 64, 0);
				if (var15 < var16.field960 && field4851.method2657() != 0 && var2 == var16.field974) {
					float var17 = var16.field959 < var16.field960 ? Math.min(Math.max((float)(var16.field960 - var15) / (float)(var16.field960 - var16.field959), 0.0F), 1.0F) : 1.0F;
					var9 = (int)(var17 * (float)field4851.method2657());
					Class42 var10000;
					if (var16.field958 == null) {
						if (var16.field966 >= 0) {
							var10000 = (Class42)null;
							Class42 var18 = Class42.method820(field1750, var16.field966, 0);
							if (var18 != null) {
								Class44 var19 = var18.method808().method849(field1251);
								Class52 var20 = Class52.method918(var19, 100, var9);
								var20.method921(-1);
								field3984.method743(var20);
								var16.field958 = var20;
							}
						}
					} else {
						var16.field958.method922(var9);
					}

					if (var16.field972 == null) {
						if (var16.field964 != null && (var16.field971 -= var5) <= 0) {
							var10 = (int)(Math.random() * (double)var16.field964.length);
							var10000 = (Class42)null;
							Class42 var21 = Class42.method820(field1750, var16.field964[var10], 0);
							if (var21 != null) {
								Class44 var22 = var21.method808().method849(field1251);
								Class52 var23 = Class52.method918(var22, 100, var9);
								var23.method921(0);
								field3984.method743(var23);
								var16.field972 = var23;
								var16.field971 = var16.field968 + (int)(Math.random() * (double)(var16.field969 - var16.field968));
							}
						}
					} else {
						var16.field972.method922(var9);
						if (!var16.field972.method9275()) {
							var16.field972 = null;
						}
					}
				} else {
					if (var16.field958 != null) {
						field3984.method755(var16.field958);
						var16.field958 = null;
					}

					if (var16.field972 != null) {
						field3984.method755(var16.field972);
						var16.field972 = null;
					}
				}
			}
		}

		field564 = 0;
	}

	@ObfInfo(name = "kv", desc = "(Lel;IB)Z", opaque = "3")
	public boolean method1256(Class116 var1, int var2) {
		if (var1.field1444 == 0) {
			field1420 = null;
		} else {
			if (field1420 == null) {
				field1420 = new Class457(field2627, field2077);
			}

			field1420.method8460(var1.field1447, var2);
		}

		field688 = field677;
		field3112 = true;
		var1.field1449 = null;
		return true;
	}

	@ObfInfo(name = "kq", desc = "(Lel;B)Z", opaque = "2")
	public boolean method1244(Class116 var1) {
		if (field1420 != null) {
			field1420.method8461(var1.field1447);
		}

		field688 = field677;
		field3112 = true;
		var1.field1449 = null;
		return true;
	}

	@ObfInfo(name = "kr", desc = "(Lel;I)Z", opaque = "-1141704173")
	public final boolean method1219(Class116 var1) {
		Class481 var3 = var1.method2900();
		Class531 var4 = var1.field1447;
		if (var3 == null) {
			return false;
		} else {
			String var6;
			int var7;
			try {
				int var24;
				if (var1.field1449 == null) {
					if (var1.field1451) {
						if (!var3.method8621(1)) {
							return false;
						}

						var3.method8624(var1.field1447.field5221, 0, 1);
						var1.field1450 = 0;
						var1.field1451 = false;
					}

					var4.field5219 = 0;
					if (var4.method9767()) {
						if (!var3.method8621(1)) {
							return false;
						}

						var3.method8624(var1.field1447.field5221, 1, 1);
						var1.field1450 = 0;
					}

					var1.field1451 = true;
					Class338[] var5 = Class46.method855();
					var24 = var4.method9791();
					if (var24 < 0 || var24 >= var5.length) {
						throw new IOException(var24 + " " + var4.field5219);
					}

					var1.field1449 = var5[var24];
					var1.field1444 = var1.field1449.field3536;
				}

				if (-1 == var1.field1444) {
					if (!var3.method8621(1)) {
						return false;
					}

					var1.method2900().method8624(var4.field5221, 0, 1);
					var1.field1444 = var4.field5221[0] & 255;
				}

				if (-2 == var1.field1444) {
					if (!var3.method8621(2)) {
						return false;
					}

					var1.method2900().method8624(var4.field5221, 0, 2);
					var4.field5219 = 0;
					var1.field1444 = var4.method9407();
				}

				if (!var3.method8621(var1.field1444)) {
					return false;
				}

				var4.field5219 = 0;
				var3.method8624(var4.field5221, 0, var1.field1444);
				var1.field1450 = 0;
				field551.method8354();
				var1.field1456 = var1.field1455;
				var1.field1455 = var1.field1454;
				var1.field1454 = var1.field1449;
				int var23;
				Class340 var53;
				if (var1.field1449 == Class338.field3564) {
					var23 = var4.method9445();
					var24 = var4.method9460();
					var53 = field25.method6718(var24);
					if (var53.field3792 != 2 || var23 != var53.field3722) {
						var53.field3792 = 2;
						var53.field3722 = var23;
						Class317.method6187(var53);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3595 == var1.field1449) {
					field752 = false;
					field496 = false;
					field746 = false;
					field747 = false;
					field3440 = 0;
					field2982 = 0;
					field1523 = 0;
					field748 = false;
					field1408 = 0;
					field2960 = 0;
					field3830 = 0;
					field1526 = 0;
					field904 = 0;
					field3887 = 0;
					field4853 = 0;
					field749 = null;
					field751 = null;
					field750 = null;

					for (var23 = 0; var23 < 5; ++var23) {
						field556[var23] = false;
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3559 == var1.field1449) {
					if (field740 != -1) {
						method2961(field740, 0);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3650) {
					var23 = var4.method9405();
					var24 = var4.method9407();
					this.method480(false);
					if (var23 == 0) {
						field894 = field3857.field1293[var24];
					} else if (var23 == 1) {
						field894 = field3857.field1295[var24];
					} else if (var23 == 2) {
						field894 = field3857.field1299[var24];
						this.method480(true);
					}

					if (field894 == null) {
						field894 = field107;
					}

					var1.field1449 = null;
					return true;
				}

				boolean var84;
				if (Class338.field3611 == var1.field1449) {
					var84 = var4.method9438() == 1;
					var24 = var4.method9555();
					var53 = field25.method6718(var24);
					Class340.method1841(var53, field107.field1029, var84);
					Class317.method6187(var53);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3622) {
					var23 = var4.method9410();
					if (var23 != field763) {
						field763 = var23;
						method2944();
					}

					var1.field1449 = null;
					return true;
				}

				int var9;
				int var27;
				if (Class338.field3615 == var1.field1449) {
					var24 = var4.method9446();
					var7 = var4.method9407();
					var9 = var4.method9407();
					var23 = var4.method9445();
					var27 = var4.method9505();
					if (var23 == 65535) {
						var23 = -1;
					}

					ArrayList var78 = new ArrayList();
					var78.add(var23);
					method160(var78, var24, var7, var27, var9);
					var1.field1449 = null;
					return true;
				}

				int var10;
				int var11;
				int var13;
				int var48;
				boolean var51;
				boolean var60;
				if (Class338.field3618 == var1.field1449) {
					field496 = true;
					field752 = false;
					field746 = true;
					field904 = var4.method9405();
					field3887 = var4.method9405();
					var23 = var4.method9407();
					var24 = var4.method9405() * 128 + 64;
					var7 = var4.method9405() * 128 + 64;
					var27 = var4.method9407();
					field748 = var4.method9413();
					var9 = var4.method9405();
					var10 = field904 * 128 + 64;
					var11 = 64 + field3887 * 128;
					var51 = false;
					var60 = false;
					if (field748) {
						var48 = field1760;
						var13 = method790(field3857, var10, var11, field3857.field1300) - var23;
					} else {
						var48 = method790(field3857, field3960, field1538, field3857.field1300) - field1760;
						var13 = var23;
					}

					field749 = new Class501(field3960, field1538, var48, var10, var11, var13, var24, var7, var27, var9);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3605 == var1.field1449) {
					field274.method1873();
					field687 = field677;
					var1.field1449 = null;
					return true;
				}

				int var16;
				int var17;
				int var18;
				int var19;
				Class88 var20;
				int var67;
				byte var70;
				byte var71;
				int var74;
				if (Class338.field3531 == var1.field1449) {
					var18 = var4.method9405();
					var67 = var4.method9438() * 4;
					var13 = var4.method9446();
					var71 = var4.method9439();
					var48 = var4.method9398();
					var7 = var4.method9585();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var27 = var23 + (var7 >> 4 & 7);
					var9 = var24 + (var7 & 7);
					var16 = var4.method9445();
					var74 = var4.method9405() * 4;
					var17 = var4.method9407();
					var70 = var4.method9574();
					var19 = var4.method9438();
					var10 = var71 + var27;
					var11 = var70 + var9;
					if (var27 >= 0 && var9 >= 0 && var27 < field4582.field1298 && var9 < field4582.field1282 && var10 >= 0 && var11 >= 0 && var10 < field4582.field1298 && var11 < field4582.field1282 && var13 != 65535) {
						var27 = var27 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						var11 = var11 * 128 + 64;
						var20 = new Class88(var13, field4582.field1300, var27, var9, method790(field4582, var27, var9, field4582.field1300) - var67, var16 + field778, field778 + var17, var18, var19, var48, var74);
						var20.method2387(var10, var11, method790(field4582, var10, var11, field4582.field1300) - var74, field778 + var16);
						field4582.field1303.method7477(var20);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3630 == var1.field1449) {
					var23 = var4.method9405();
					var24 = var4.method9405();
					var7 = var4.method9405();
					var27 = var4.method9405();
					field556[var23] = true;
					field754[var23] = var24;
					field672[var23] = var7;
					field756[var23] = var27;
					field667[var23] = 0;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3608 == var1.field1449) {
					var24 = var4.method9445();
					var23 = var4.method9407();
					var7 = var4.method9446();
					var27 = var4.method9446();
					Class332.method3992(var23, var24, var7, var27);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3624) {
					var23 = var4.method9407();
					var7 = var4.method9405();
					var24 = var4.method9446();
					if (var24 == 65535) {
						var24 = -1;
					}

					Class100 var81 = field4582.field1295[var23];
					if (var81 != null) {
						if (var24 == var81.field1074 && var24 != -1) {
							var9 = Class211.method4637(var24).field2152;
							if (var9 == 1) {
								var81.field1101 = 0;
								var81.field1102 = 0;
								var81.field1103 = var7;
								var81.field1090 = 0;
							} else if (var9 == 2) {
								var81.field1090 = 0;
							}
						} else if (var24 == -1 || -1 == var81.field1074 || Class211.method4637(var24).field2128 >= Class211.method4637(var81.field1074).field2128) {
							var81.field1074 = var24;
							var81.field1101 = 0;
							var81.field1102 = 0;
							var81.field1103 = var7;
							var81.field1090 = 0;
							var81.field1077 = var81.field1125;
						}
					}

					var1.field1449 = null;
					return true;
				}

				String var69;
				if (var1.field1449 == Class338.field3547) {
					var69 = var4.method9415();
					var6 = Class436.method7992(Class412.method7137(Class339.method6268(var4)));
					Class128.method2747(6, var69, var6);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3647) {
					var84 = var4.method9405() == 1;
					if (var84) {
						field1985 = Class130.method3047() - var4.method9411();
						field1829 = new Class365(var4, true);
					} else {
						field1829 = null;
					}

					field609 = field677;
					var1.field1449 = null;
					return true;
				}

				Class340 var45;
				if (Class338.field3588 == var1.field1449) {
					var23 = var4.method9462();
					var24 = var4.method9410();
					var7 = var4.method9445();
					if (var7 == 65535) {
						var7 = -1;
					}

					var45 = field25.method6718(var24);
					Class232 var77;
					if (!var45.field3675) {
						if (var7 == -1) {
							var45.field3792 = 0;
							var1.field1449 = null;
							return true;
						}

						var77 = Class232.method109(var7).method4419(var23);
						var45.field3792 = 4;
						var45.field3722 = var7;
						var45.field3729 = var77.field2456;
						var45.field3814 = var77.field2480;
						var45.field3732 = var77.field2455 * 100 / var23;
						Class317.method6187(var45);
					} else {
						var45.field3810 = var7;
						var45.field3811 = var23;
						var77 = Class232.method109(var7).method4419(var23);
						var45.field3729 = var77.field2456;
						var45.field3814 = var77.field2480;
						var45.field3731 = var77.field2457;
						var45.field3769 = var77.field2459;
						var45.field3784 = var77.field2442;
						var45.field3732 = var77.field2455;
						if (1 == var77.field2462) {
							var45.field3738 = 1;
						} else {
							var45.field3738 = 2;
						}

						if (var45.field3733 > 0) {
							var45.field3732 = var45.field3732 * 32 / var45.field3733;
						} else if (var45.field3728 > 0) {
							var45.field3732 = var45.field3732 * 32 / var45.field3728;
						}

						Class317.method6187(var45);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3584) {
					field496 = true;
					field752 = false;
					field747 = true;
					var23 = var4.method9535();
					var24 = var4.method9535();
					var7 = Class268.method5356(var24 + field1105 & 2027);
					var27 = var23 + field2029;
					var9 = var4.method9407();
					var10 = var4.method9405();
					field751 = new Class519(field1105, var7, var9, var10);
					field750 = new Class519(field2029, var27, var9, var10);
					var1.field1449 = null;
					return true;
				}

				Class104 var8;
				long var52;
				if (var1.field1449 == Class338.field3574) {
					var23 = var1.field1444 + var4.field5219;
					var24 = var4.method9407();
					if (var24 == 65535) {
						var24 = -1;
					}

					var7 = var4.method9407();
					if (var24 != field740) {
						field740 = var24;
						this.method1762(false);
						method3641(field740);
						Class72.method35(field740);

						for (var27 = 0; var27 < 100; ++var27) {
							field614[var27] = true;
						}
					}

					Class104 var75;
					for (; var7-- > 0; var75.field1368 = true) {
						var27 = var4.method9410();
						var9 = var4.method9407();
						var10 = var4.method9405();
						var75 = (Class104)field654.method9361((long)var27);
						if (var75 != null && var9 != var75.field1366) {
							method716(var75, true);
							var75 = null;
						}

						if (var75 == null) {
							var75 = method5559(var27, var9, var10);
						}
					}

					for (var8 = (Class104)field654.method9363(); var8 != null; var8 = (Class104)field654.method9364()) {
						if (var8.field1368) {
							var8.field1368 = false;
						} else {
							method716(var8, true);
						}
					}

					field507 = new Class518(512);

					while (var4.field5219 < var23) {
						var27 = var4.method9410();
						var9 = var4.method9407();
						var10 = var4.method9407();
						var11 = var4.method9410();

						for (var48 = var9; var48 <= var10; ++var48) {
							var52 = (long)var48 + ((long)var27 << 32);
							field507.method9360(new Class516(var11), var52);
						}
					}

					var1.field1449 = null;
					return true;
				}

				String var46;
				if (var1.field1449 == Class338.field3653) {
					var23 = var4.method9437();
					var24 = var4.method9522();
					var46 = var4.method9415();
					if (var23 >= 1 && var23 <= 8) {
						if (var46.equalsIgnoreCase(Class378.field4152)) {
							var46 = null;
						}

						field679[var23 - 1] = var46;
						field602[var23 - 1] = var24 == 0;
					}

					var1.field1449 = null;
					return true;
				}

				byte var26;
				if (Class338.field3625 == var1.field1449) {
					method7124();
					var26 = var4.method9406();
					if (1 == var1.field1444) {
						if (var26 >= 0) {
							field670[var26] = null;
						} else {
							field2020 = null;
						}

						var1.field1449 = null;
						return true;
					}

					if (var26 >= 0) {
						field670[var26] = new Class159(var4);
					} else {
						field2020 = new Class159(var4);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3599) {
					var84 = var4.method9413();
					if (var84) {
						if (field422 == null) {
							field422 = new Class408();
						}
					} else {
						field422 = null;
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3589 == var1.field1449) {
					field742 = var4.method9405();
					if (1 == field742) {
						field568 = var4.method9407();
					}

					if (field742 >= 2 && field742 <= 6) {
						if (field742 == 2) {
							field514 = 64;
							field492 = 64;
						}

						if (field742 == 3) {
							field514 = 0;
							field492 = 64;
						}

						if (4 == field742) {
							field514 = 128;
							field492 = 64;
						}

						if (field742 == 5) {
							field514 = 64;
							field492 = 0;
						}

						if (field742 == 6) {
							field514 = 64;
							field492 = 128;
						}

						field742 = 2;
						field727 = var4.method9407();
						field512 = var4.method9407();
						field513 = var4.method9405();
					}

					if (field742 == 10) {
						field775 = var4.method9407();
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3532 == var1.field1449) {
					var48 = var4.method9454();
					var13 = var4.method9446();
					var70 = var4.method9439();
					var18 = var4.method9438();
					var19 = var4.method9445();
					var71 = var4.method9574();
					var74 = var4.method9437() * 4;
					var17 = var4.method9445();
					var67 = var4.method9522() * 4;
					var16 = var4.method9505();
					var7 = var4.method9611();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var27 = (var7 >> 4 & 7) + var23;
					var9 = (var7 & 7) + var24;
					var10 = var71 + var27;
					var11 = var70 + var9;
					if (var27 >= 0 && var9 >= 0 && var27 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var13 != 65535) {
						var27 = var27 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = 64 + var10 * 128;
						var11 = 64 + var11 * 128;
						var20 = new Class88(var13, field4582.field1300, var27, var9, method790(field4582, var27, var9, field4582.field1300) - var67, field778 + var16, field778 + var17, var18, var19, var48, var74);
						var20.method2387(var10, var11, method790(field4582, var10, var11, field4582.field1300) - var74, var16 + field778);
						field4582.field1303.method7477(var20);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3593) {
					var23 = var4.method9505();
					if (var23 == 65535) {
						var23 = -1;
					}

					field740 = var23;
					this.method1762(false);
					method3641(var23);
					Class72.method35(field740);

					for (var24 = 0; var24 < 100; ++var24) {
						field614[var24] = true;
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3609 == var1.field1449) {
					Class197.method3871(Class326.field3425);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3607) {
					var23 = var4.method9555();
					var24 = var4.method9535();
					var7 = var4.method9448();
					var45 = field25.method6718(var23);
					if (var24 != var45.field3686 || var45.field3687 != var7 || 0 != var45.field3682 || 0 != var45.field3683) {
						var45.field3686 = var24;
						var45.field3687 = var7;
						var45.field3682 = 0;
						var45.field3683 = 0;
						Class317.method6187(var45);
						this.method1224(var45);
						if (0 == var45.field3755) {
							method3152(field25.field3877[var23 >> 16], var45, false);
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3573) {
					field242 = null;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3553) {
					field649 = var4.method9505() * 30;
					field693 = field677;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3538) {
					if (field242 == null) {
						field242 = new Class494(field431);
					}

					Class551 var89 = field431.method8611(var4);
					field242.field5014.method9833(var89.field5367, var89.field5369);
					field664[++field685 - 1 & 31] = var89.field5367;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3556 == var1.field1449) {
					Class197.method3871(Class326.field3426);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3572) {
					for (var23 = 0; var23 < field2083; ++var23) {
						Class205 var88 = Class205.method4659(var23);
						if (var88 != null) {
							Class351.field3888[var23] = 0;
							Class351.field3889[var23] = 0;
						}
					}

					method2384();
					field719 += 32;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3636 == var1.field1449) {
					var23 = var4.method9555();
					var24 = var4.method9522();
					var53 = field25.method6718(var23);
					Class374.method7189(var53, field107.field1029.field3946, var24);
					Class317.method6187(var53);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3635) {
					field496 = true;
					field752 = false;
					field746 = false;
					field904 = var4.method9405();
					field3887 = var4.method9405();
					field4853 = var4.method9407();
					field1526 = var4.method9405();
					field3830 = var4.method9405();
					if (field3830 >= 100) {
						field3960 = field904 * 128 + 64;
						field1538 = field3887 * 128 + 64;
						field1760 = method790(field3857, field3960, field1538, field3857.field1300) - field4853;
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3651 == var1.field1449) {
					return this.method1256(var1, 2);
				}

				if (Class338.field3623 == var1.field1449) {
					var23 = var4.method9555();
					var24 = var4.method9461();
					var53 = field25.method6718(var23);
					if (var24 != var53.field3725 || var24 == -1) {
						var53.field3725 = var24;
						var53.field3812 = 0;
						var53.field3813 = 0;
						Class317.method6187(var53);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3557 == var1.field1449) {
					method3869();
					var1.field1449 = null;
					return false;
				}

				if (var1.field1449 == Class338.field3566) {
					field4582.field1288.method2786(var4, var1.field1444);
					method3662();
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3596 == var1.field1449) {
					Class197.method3871(Class326.field3421);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3586 == var1.field1449) {
					var23 = var4.method9460();
					var24 = var4.method9462();
					var53 = field25.method6718(var24);
					Class83.method2274(var53, var23);
					Class317.method6187(var53);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3563) {
					var7 = var4.method9569();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var27 = var23 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var24;
					var48 = var4.method9505();
					var11 = var4.method9438();
					var10 = var4.method9445();
					if (var27 >= 0 && var9 >= 0 && var27 < field4582.field1298 && var9 < field4582.field1282) {
						var27 = 64 + var27 * 128;
						var9 = var9 * 128 + 64;
						Class59 var65 = new Class59(var10, field4582.field1300, var27, var9, method790(field4582, var27, var9, field4582.field1300) - var11, var48, field778);
						field4582.field1304.method7477(var65);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3638) {
					field496 = true;
					field752 = false;
					field746 = true;
					field904 = var4.method9405();
					field3887 = var4.method9405();
					var23 = var4.method9407();
					var24 = var4.method9407();
					field748 = var4.method9413();
					var7 = var4.method9405();
					var27 = field904 * 128 + 64;
					var9 = field3887 * 128 + 64;
					boolean var63 = false;
					boolean var61 = false;
					if (field748) {
						var10 = field1760;
						var11 = method790(field3857, var27, var9, field3857.field1300) - var23;
					} else {
						var10 = method790(field3857, field3960, field1538, field3857.field1300) - field1760;
						var11 = var23;
					}

					field749 = new Class510(field3960, field1538, var10, var27, var9, var11, var24, var7);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3617) {
					var23 = var4.method9405();
					if (var4.method9405() == 0) {
						field531[var23] = new Class397();
						var4.field5219 += 18;
					} else {
						--var4.field5219;
						field531[var23] = new Class397(var4, false);
					}

					field691 = field677;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3549) {
					method2384();
					var23 = var4.method9405();
					var24 = var4.method9555();
					var7 = var4.method9522();
					var27 = var4.method9522();
					field625[var27] = var24;
					field495[var27] = var7;
					field624[var27] = 1;
					field627[var27] = var23;

					for (var9 = 0; var9 < 98; ++var9) {
						if (var24 >= Class380.field4466[var9]) {
							field624[var27] = var9 + 2;
						}
					}

					field682[++field683 - 1 & 31] = var27;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3657 == var1.field1449) {
					field4582.field1296 = 0;
					field4582.field1286 = 0;

					for (var23 = 0; var23 < 65536; ++var23) {
						field4582.field1295[var23] = null;
					}

					for (var23 = 0; var23 < 2048; ++var23) {
						field4582.field1299[var23] = null;
					}

					field107.field1007 = field3857;
					var1.field1449 = null;
					return true;
				}

				Class340 var33;
				if (var1.field1449 == Class338.field3546) {
					var23 = var4.method9410();
					var24 = var4.method9460();
					Class104 var82 = (Class104)field654.method9361((long)var24);
					var8 = (Class104)field654.method9361((long)var23);
					if (var8 != null) {
						method716(var8, var82 == null || var82.field1366 != var8.field1366);
					}

					if (var82 != null) {
						var82.method9277();
						field654.method9360(var82, (long)var23);
					}

					var33 = field25.method6718(var24);
					if (var33 != null) {
						Class317.method6187(var33);
					}

					var33 = field25.method6718(var23);
					if (var33 != null) {
						Class317.method6187(var33);
						method3152(field25.field3877[var33.field3676 >>> 16], var33, true);
					}

					if (-1 != field740) {
						method2961(field740, 1);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3634) {
					for (var23 = 0; var23 < Class351.field3889.length; ++var23) {
						if (Class351.field3888[var23] != Class351.field3889[var23]) {
							Class351.field3889[var23] = Class351.field3888[var23];
							Class140.method3138(var23);
							field678[++field719 - 1 & 31] = var23;
						}
					}

					var1.field1449 = null;
					return true;
				}

				long var57;
				String var73;
				long var79;
				if (var1.field1449 == Class338.field3552) {
					var69 = var4.method9415();
					var79 = (long)var4.method9407();
					var57 = (long)var4.method9399();
					Class371 var62 = (Class371)Class62.method1112(Class371.method2873(), var4.method9405());
					long var59 = var57 + (var79 << 32);
					var60 = false;

					for (var67 = 0; var67 < 100; ++var67) {
						if (var59 == field730[var67]) {
							var60 = true;
							break;
						}
					}

					if (field274.method1878(new Class567(var69, field2627))) {
						var60 = true;
					}

					if (!var60 && field608 == 0) {
						field730[field720] = var59;
						field720 = (field720 + 1) % 100;
						var73 = Class436.method7992(Class412.method7137(Class339.method6268(var4)));
						byte var76;
						if (var62.field4031) {
							var76 = 7;
						} else {
							var76 = 3;
						}

						if (var62.field4026 != -1) {
							Class128.method2747(var76, Class113.method6223(var62.field4026) + var69, var73);
						} else {
							Class128.method2747(var76, var69, var73);
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3544) {
					field496 = true;
					field752 = false;
					field747 = true;
					field3440 = var4.method9405();
					field2982 = var4.method9405();
					field1523 = var4.method9407();
					var23 = var4.method9407();
					var24 = var4.method9405();
					var7 = 64 + field3440 * 128;
					var27 = 64 + field2982 * 128;
					var9 = method790(field3857, var7, var27, field3857.field1300) - field1523;
					var10 = var7 - field3960;
					var11 = var9 - field1760;
					var48 = var27 - field1538;
					double var56 = Math.sqrt((double)(var48 * var48 + var10 * var10));
					var74 = Class268.method5356((int)(Math.atan2((double)var11, var56) * 325.9490051269531D) & 2047);
					var16 = method192((int)(Math.atan2((double)var10, (double)var48) * -325.9490051269531D) & 2047);
					field751 = new Class519(field1105, var74, var23, var24);
					field750 = new Class519(field2029, var16, var23, var24);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3621 == var1.field1449) {
					var23 = var4.method9410();
					Class104 var86 = (Class104)field654.method9361((long)var23);
					if (var86 != null) {
						method716(var86, true);
					}

					if (field533 != null) {
						Class317.method6187(field533);
						field533 = null;
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3654 == var1.field1449) {
					field172 = var4.method9405();
					field1589 = var4.method9405();
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3658) {
					var23 = var4.method9505();
					Class83 var54;
					if (var23 == field646) {
						var54 = field107;
					} else {
						var54 = field4582.field1293[var23];
					}

					var24 = var4.method9446();
					var27 = var4.method9405();
					var7 = var4.method9462();
					if (var54 != null) {
						var54.method2331(var27, var24, var7 >> 16, var7 & 65535);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3539 == var1.field1449) {
					method7124();
					var26 = var4.method9406();
					Class151 var85 = new Class151(var4);
					Class159 var80;
					if (var26 >= 0) {
						var80 = field670[var26];
					} else {
						var80 = field2020;
					}

					if (var80 == null) {
						this.method1228(var26);
						var1.field1449 = null;
						return true;
					}

					if (var85.field1695 > var80.field1766) {
						this.method1228(var26);
						var1.field1449 = null;
						return true;
					}

					if (var85.field1695 < var80.field1766) {
						var1.field1449 = null;
						return true;
					}

					var85.method3280(var80);
					var1.field1449 = null;
					return true;
				}

				long var32;
				if (var1.field1449 == Class338.field3550) {
					var26 = var4.method9406();
					var79 = (long)var4.method9407();
					var57 = (long)var4.method9399();
					var32 = (var79 << 32) + var57;
					var51 = false;
					Class171 var55 = var26 >= 0 ? field684[var26] : field4619;
					if (var55 == null) {
						var51 = true;
					} else {
						for (var67 = 0; var67 < 100; ++var67) {
							if (field730[var67] == var32) {
								var51 = true;
								break;
							}
						}
					}

					if (!var51) {
						field730[field720] = var32;
						field720 = (1 + field720) % 100;
						var73 = Class339.method6268(var4);
						var74 = var26 >= 0 ? 43 : 46;
						Class505.method9272(var74, "", var73, var55.field1851);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3643 == var1.field1449) {
					return this.method1256(var1, 1);
				}

				if (var1.field1449 == Class338.field3529) {
					byte[] var87 = new byte[var1.field1444];
					var4.method9759(var87, 0, var87.length);
					Class521 var83 = new Class521(var87);
					var46 = var83.method9415();
					Class40.method7134(var46, true, false);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3578) {
					var23 = var4.method9405();
					method8883(var23);
					var1.field1449 = null;
					return false;
				}

				if (var1.field1449 == Class338.field3597) {
					var23 = var4.method9438();
					var24 = var4.method9555();
					var7 = var4.method9437();
					var45 = field25.method6718(var24);
					Class340.method4772(var45, var23, var7);
					Class317.method6187(var45);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3602) {
					field274.method1881(var4, var1.field1444);
					field687 = field677;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3565) {
					field496 = true;
					field752 = false;
					field747 = true;
					var23 = method192(var4.method9535() & 2027);
					var24 = Class268.method5356(var4.method9535() & 2027);
					var7 = var4.method9407();
					var27 = var4.method9405();
					field751 = new Class519(field1105, var24, var7, var27);
					field750 = new Class519(field2029, var23, var7, var27);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3614) {
					field597 = var4.method9522();
					field716 = var4.method9522();
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3592) {
					field5081 = Class113.method2877(var4.method9405());
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3579 == var1.field1449) {
					var26 = var4.method9406();
					var24 = var4.method9407();
					Class351.field3888[var24] = var26;
					if (Class351.field3889[var24] != var26) {
						Class351.field3889[var24] = var26;
					}

					Class140.method3138(var24);
					field678[++field719 - 1 & 31] = var24;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3570 == var1.field1449) {
					var23 = var4.method9410();
					var24 = var4.method9407();
					if (var23 < -70000) {
						var24 += 32768;
					}

					if (var23 >= 0) {
						var53 = field25.method6718(var23);
					} else {
						var53 = null;
					}

					if (var53 != null) {
						for (var27 = 0; var27 < var53.field3808.length; ++var27) {
							var53.field3808[var27] = 0;
							var53.field3669[var27] = 0;
						}
					}

					Class79.method51(var24);
					var27 = var4.method9407();

					for (var9 = 0; var9 < var27; ++var9) {
						var10 = var4.method9505();
						var11 = var4.method9437();
						if (var11 == 255) {
							var11 = var4.method9555();
						}

						if (var53 != null && var9 < var53.field3808.length) {
							var53.field3808[var9] = var10;
							var53.field3669[var9] = var11;
						}

						Class79.method4478(var24, var9, var10 - 1, var11);
					}

					if (var53 != null) {
						Class317.method6187(var53);
					}

					method2384();
					field755[++field681 - 1 & 31] = var24 & 32767;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3542) {
					var23 = var4.method9407();
					var24 = var4.method9405();
					var7 = var4.method9407();
					method8553(var23, var24, var7);
					var1.field1449 = null;
					return true;
				}

				String var72;
				if (Class338.field3581 == var1.field1449) {
					var69 = var4.method9415();
					var79 = var4.method9411();
					var57 = (long)var4.method9407();
					var32 = (long)var4.method9399();
					Class371 var50 = (Class371)Class62.method1112(Class371.method2873(), var4.method9405());
					var52 = (var57 << 32) + var32;
					boolean var66 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (field730[var16] == var52) {
							var66 = true;
							break;
						}
					}

					if (var50.field4021 && field274.method1878(new Class567(var69, field2627))) {
						var66 = true;
					}

					if (!var66 && field608 == 0) {
						field730[field720] = var52;
						field720 = (1 + field720) % 100;
						var72 = Class436.method7992(Class412.method7137(Class339.method6268(var4)));
						if (var50.field4026 != -1) {
							Class505.method9272(9, Class113.method6223(var50.field4026) + var69, var72, Class157.method3324(var79));
						} else {
							Class505.method9272(9, var69, var72, Class157.method3324(var79));
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3637) {
					Class197.method3871(Class326.field3428);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3540) {
					var23 = var4.method9405();
					Class281.method5712(var23);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3558 == var1.field1449) {
					var23 = var4.method9410();
					var24 = var4.method9407();
					if (var23 < -70000) {
						var24 += 32768;
					}

					if (var23 >= 0) {
						var53 = field25.method6718(var23);
					} else {
						var53 = null;
					}

					for (; var4.field5219 < var1.field1444; Class79.method4478(var24, var27, var9 - 1, var10)) {
						var27 = var4.method9419();
						var9 = var4.method9407();
						var10 = 0;
						if (var9 != 0) {
							var10 = var4.method9405();
							if (var10 == 255) {
								var10 = var4.method9410();
							}
						}

						if (var53 != null && var27 >= 0 && var27 < var53.field3808.length) {
							var53.field3808[var27] = var9;
							var53.field3669[var27] = var10;
						}
					}

					if (var53 != null) {
						Class317.method6187(var53);
					}

					method2384();
					field755[++field681 - 1 & 31] = var24 & 32767;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3646 == var1.field1449) {
					var10 = var4.method9405();
					var11 = var10 >> 2;
					var48 = var10 & 3;
					var13 = field562[var11];
					var67 = var4.method9445();
					var7 = var4.method9611();
					var23 = var7 >> 16;
					var24 = var7 >> 8 & 255;
					var27 = var23 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var24;
					if (var27 >= 0 && var9 >= 0 && var27 < 103 && var9 < 103) {
						method9204(var27, var9, var11, var48, var13, var67);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3616) {
					var23 = var4.method9446();
					var24 = var4.method9410();
					var53 = field25.method6718(var24);
					if (6 != var53.field3792 || var53.field3722 != var23) {
						var53.field3792 = 6;
						var53.field3722 = var23;
						Class317.method6187(var53);
					}

					var1.field1449 = null;
					return true;
				}

				Class100 var31;
				if (Class338.field3644 == var1.field1449) {
					var24 = var4.method9460();
					var27 = var4.method9437();
					var23 = var4.method9505();
					var31 = field4582.field1295[var23];
					var7 = var4.method9407();
					if (var31 != null) {
						var31.method2331(var27, var7, var24 >> 16, var24 & 65535);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3626) {
					method8270(false, var1.field1447);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3541) {
					var84 = var4.method9437() == 1;
					var24 = var4.method9410();
					var53 = field25.method6718(var24);
					if (var53.field3775 != var84) {
						var53.field3775 = var84;
						Class317.method6187(var53);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3613) {
					var23 = var4.method9445();
					if (var23 == 65535) {
						var23 = -1;
					}

					method110(var23);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3640) {
					var23 = var4.method9446();
					if (var23 == 65535) {
						var23 = -1;
					}

					var24 = var4.method9611();
					method674(var23, var24);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3628 == var1.field1449) {
					var23 = var4.method9505();
					var24 = var4.method9460();
					var53 = field25.method6718(var24);
					if (1 != var53.field3792 || var53.field3722 != var23) {
						var53.field3792 = 1;
						var53.field3722 = var23;
						Class317.method6187(var53);
					}

					var1.field1449 = null;
					return true;
				}

				Class340 var30;
				if (var1.field1449 == Class338.field3620) {
					var23 = var4.method9555();
					var30 = field25.method6718(var23);
					var30.field3792 = 3;
					var30.field3722 = field107.field1029.method7054();
					Class317.method6187(var30);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3568) {
					method2648(field4582, false, var4);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3639 == var1.field1449) {
					Class47.method2812(var4, var1.field1444);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3580 == var1.field1449) {
					var23 = var4.method9410();
					var24 = var4.method9410();
					var7 = Class31.method3811();
					Class316 var49 = Class316.method3908(Class315.field3282, field548.field1446);
					var49.field3374.method9496(Class31.field187);
					var49.field3374.method9590(var23);
					var49.field3374.method9458(var24);
					var49.field3374.method9388(var7);
					field548.method2897(var49);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3571) {
					var4.field5219 += 28;
					if (var4.method9545()) {
						method2417(var4, var4.field5219 - 28);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3575) {
					Class197.method3871(Class326.field3418);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3548) {
					method2384();
					field660 = var4.method9535();
					field693 = field677;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3645) {
					var69 = var4.method9415();
					Object[] var68 = new Object[var69.length() + 1];

					for (var7 = var69.length() - 1; var7 >= 0; --var7) {
						if (var69.charAt(var7) == 's') {
							var68[var7 + 1] = var4.method9415();
						} else {
							var68[var7 + 1] = new Integer(var4.method9410());
						}
					}

					var68[0] = new Integer(var4.method9410());
					Class101 var64 = new Class101();
					var64.field1333 = var68;
					Class72.method7210(var64);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3590) {
					method8270(true, var1.field1447);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3656 == var1.field1449) {
					var23 = var4.method9446();
					var24 = var4.method9460();
					var7 = var4.method9407();
					var45 = field25.method6718(var24);
					var45.field3734 = var7 + (var23 << 16);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3569 == var1.field1449) {
					var23 = var4.method9446();
					Class79.method8489(var23);
					field755[++field681 - 1 & 31] = var23 & 32767;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3619 == var1.field1449) {
					var23 = var4.method9405();
					var24 = var4.method9407();
					var7 = var4.method9405();
					if (var23 == 0) {
						field3857.field1300 = var7;
						field4582 = field3857;
					} else {
						if (var23 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						Class488 var42 = field3857.field1299[var24];
						var42.field4995.field1300 = var7;
						field4582 = var42.field4995;
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3567) {
					Class197.method3871(Class326.field3420);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3648 && field496) {
					field752 = true;
					field747 = false;
					field746 = false;

					for (var23 = 0; var23 < 5; ++var23) {
						field556[var23] = false;
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3537) {
					Class197.method3871(Class326.field3423);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3604 == var1.field1449) {
					var23 = var4.method9445();
					var24 = var4.method9410();
					var53 = field25.method6718(var24);
					if (var53 != null && var53.field3755 == 0) {
						if (var23 > var53.field3701 - var53.field3736) {
							var23 = var53.field3701 - var53.field3736;
						}

						if (var23 < 0) {
							var23 = 0;
						}

						if (var23 != var53.field3699) {
							var53.field3699 = var23;
							Class317.method6187(var53);
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3660 == var1.field1449) {
					var69 = var4.method9415();
					var24 = var4.method9462();
					var53 = field25.method6718(var24);
					if (!var69.equals(var53.field3740)) {
						var53.field3740 = var69;
						Class317.method6187(var53);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3601) {
					var23 = var4.method9407();
					var24 = var4.method9438();
					if (var23 == 65535) {
						var23 = -1;
					}

					method3578(field107, var23, var24);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3632) {
					++field501;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3655) {
					var23 = var4.method9419();
					boolean var58 = var4.method9405() == 1;
					var46 = "";
					boolean var36 = false;
					if (var58) {
						var46 = var4.method9415();
						if (field274.method1878(new Class567(var46, field2627))) {
							var36 = true;
						}
					}

					String var39 = var4.method9415();
					if (!var36) {
						Class128.method2747(var23, var46, var39);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3587 == var1.field1449) {
					var23 = var4.method9462();
					var24 = var4.method9445();
					var7 = var24 >> 10 & 31;
					var27 = var24 >> 5 & 31;
					var9 = var24 & 31;
					var10 = (var9 << 3) + (var7 << 19) + (var27 << 11);
					Class340 var43 = field25.method6718(var23);
					if (var43.field3702 != var10) {
						var43.field3702 = var10;
						Class317.method6187(var43);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3649) {
					var26 = var4.method9406();
					var6 = var4.method9415();
					long var40 = (long)var4.method9407();
					long var37 = (long)var4.method9399();
					Class371 var41 = (Class371)Class62.method1112(Class371.method2873(), var4.method9405());
					long var47 = (var40 << 32) + var37;
					boolean var14 = false;
					Class171 var15 = null;
					var15 = var26 >= 0 ? field684[var26] : field4619;
					if (var15 == null) {
						var14 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var41.field4021 && field274.method1878(new Class567(var6, field2627))) {
									var14 = true;
								}
								break;
							}

							if (field730[var16] == var47) {
								var14 = true;
								break;
							}

							++var16;
						}
					}

					if (!var14) {
						field730[field720] = var47;
						field720 = (1 + field720) % 100;
						var72 = Class436.method7992(Class339.method6268(var4));
						var17 = var26 >= 0 ? 41 : 44;
						if (var41.field4026 != -1) {
							Class505.method9272(var17, Class113.method6223(var41.field4026) + var6, var72, var15.field1851);
						} else {
							Class505.method9272(var17, var6, var72, var15.field1851);
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3585) {
					var23 = var4.method9445();
					var24 = var4.method9505();
					var7 = var4.method9407();
					var27 = var4.method9555();
					var33 = field25.method6718(var27);
					if (var7 != var33.field3729 || var33.field3814 != var24 || var33.field3732 != var23) {
						var33.field3729 = var7;
						var33.field3814 = var24;
						var33.field3732 = var23;
						Class317.method6187(var33);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3631) {
					var9 = var4.method9505();
					var7 = var4.method9445();
					var10 = var4.method9445();
					var24 = var4.method9446();
					if (var24 == 65535) {
						var24 = -1;
					}

					var23 = var4.method9445();
					if (var23 == 65535) {
						var23 = -1;
					}

					var27 = var4.method9407();
					ArrayList var38 = new ArrayList();
					var38.add(var23);
					var38.add(var24);
					method160(var38, var7, var27, var9, var10);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3582 == var1.field1449) {
					method7873(field4582, var4);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3600 == var1.field1449) {
					field121 = var4.method9522();
					field711 = var4.method9438();
					field3436 = var4.method9405();

					for (var23 = field121; var23 < 8 + field121; ++var23) {
						for (var24 = field3436; var24 < 8 + field3436; ++var24) {
							if (field4582.field1301[field711][var23][var24] != null) {
								field4582.field1301[field711][var23][var24] = null;
								method7123(field711, var23, var24);
							}
						}
					}

					for (Class89 var44 = (Class89)field4582.field1294.method7482(); var44 != null; var44 = (Class89)field4582.field1294.method7490()) {
						if (var44.field1187 >= field121 && var44.field1187 < field121 + 8 && var44.field1191 >= field3436 && var44.field1191 < 8 + field3436 && field711 == var44.field1195) {
							var44.field1198 = 0;
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3603) {
					field736 = var4.method9405();
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3551) {
					field242 = new Class494(field431);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3533 == var1.field1449) {
					var23 = var4.method9505();
					var24 = var4.method9522();
					short var34 = (short)var4.method9461();
					var27 = var4.method9410();
					var31 = field4582.field1295[var23];
					if (var31 != null) {
						var31.method2532(var24, var27, var34);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3554) {
					field121 = var4.method9438();
					field3436 = var4.method9437();
					field711 = var4.method9522();

					while (var4.field5219 < var1.field1444) {
						var23 = var4.method9405();
						Class326 var35 = Class326.method806()[var23];
						Class197.method3871(var35);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3642 == var1.field1449) {
					method2648(field4582, true, var4);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3598 == var1.field1449) {
					field274.field850.method8556(var4, var1.field1444);
					Class79.method2220();
					field687 = field677;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3561) {
					var23 = var4.method9446();
					if (var23 == 65535) {
						var23 = -1;
					}

					var24 = var4.method9445();
					if (var24 == 65535) {
						var24 = -1;
					}

					var7 = var4.method9555();
					var27 = var4.method9460();

					for (var9 = var23; var9 <= var24; ++var9) {
						var32 = ((long)var27 << 32) + (long)var9;
						Class506 var12 = field507.method9361(var32);
						if (var12 != null) {
							var12.method9277();
						}

						field507.method9360(new Class516(var7), var32);
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3543 == var1.field1449) {
					return this.method1244(var1);
				}

				if (var1.field1449 == Class338.field3659) {
					field703 = field677;
					var26 = var4.method9406();
					if (1 == var1.field1444) {
						if (var26 >= 0) {
							field684[var26] = null;
						} else {
							field4619 = null;
						}

						var1.field1449 = null;
						return true;
					}

					if (var26 >= 0) {
						field684[var26] = new Class171(var4);
					} else {
						field4619 = new Class171(var4);
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3562) {
					Class197.method3871(Class326.field3430);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3530) {
					var23 = var4.method9462();
					var30 = field25.method6718(var23);

					for (var7 = 0; var7 < var30.field3808.length; ++var7) {
						var30.field3808[var7] = -1;
						var30.field3808[var7] = 0;
					}

					Class317.method6187(var30);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3594) {
					method2384();
					field659 = var4.method9407();
					field693 = field677;
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3591 == var1.field1449) {
					var24 = var4.method9505();
					var23 = var4.method9446();
					Class380.method7208(var23, var24);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3560 == var1.field1449) {
					Class197.method3871(Class326.field3431);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3577 == var1.field1449) {
					method3033(var4.method9415());
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3535) {
					field703 = field677;
					var26 = var4.method9406();
					Class180 var28 = new Class180(var4);
					Class171 var29;
					if (var26 >= 0) {
						var29 = field684[var26];
					} else {
						var29 = field4619;
					}

					if (var29 == null) {
						this.method1227(var26);
						var1.field1449 = null;
						return true;
					}

					if (var28.field1891 > var29.field1850) {
						this.method1227(var26);
						var1.field1449 = null;
						return true;
					}

					if (var28.field1891 < var29.field1850) {
						var1.field1449 = null;
						return true;
					}

					var28.method3625(var29);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3610 == var1.field1449) {
					field496 = true;
					field752 = false;
					field747 = false;
					field3440 = var4.method9405();
					field2982 = var4.method9405();
					field1523 = var4.method9407();
					field1408 = var4.method9405();
					field2960 = var4.method9405();
					if (field2960 >= 100) {
						var23 = 64 + field3440 * 128;
						var24 = 64 + field2982 * 128;
						var7 = method790(field3857, var23, var24, field3857.field1300) - field1523;
						var27 = var23 - field3960;
						var9 = var7 - field1760;
						var10 = var24 - field1538;
						var11 = (int)Math.sqrt((double)(var10 * var10 + var27 * var27));
						field1105 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
						field2029 = (int)(Math.atan2((double)var27, (double)var10) * -325.9490051269531D) & 2047;
						if (field1105 < 128) {
							field1105 = 128;
						}

						if (field1105 > 383) {
							field1105 = 383;
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3641) {
					Class65.method1806(field4582, var4);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3633) {
					field121 = var4.method9522();
					field711 = var4.method9438();
					field3436 = var4.method9405();
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3652) {
					Class197.method3871(Class326.field3422);
					var1.field1449 = null;
					return true;
				}

				if (Class338.field3627 == var1.field1449) {
					method2384();
					var23 = var4.method9522();
					var24 = var4.method9437();
					var7 = var4.method9555();
					field625[var23] = var7;
					field495[var23] = var24;
					field624[var23] = 1;
					field627[var23] = var24;

					for (var27 = 0; var27 < 98; ++var27) {
						if (var7 >= Class380.field4466[var27]) {
							field624[var23] = var27 + 2;
						}
					}

					field682[++field683 - 1 & 31] = var23;
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3583) {
					Class64 var25 = new Class64();
					var25.field476 = var4.method9415();
					var25.field473 = var4.method9407();
					var24 = var4.method9410();
					var25.field480 = var24;
					if (var25.method1139()) {
						var25.field467 = "beta";
						field434 = true;
					} else {
						field434 = false;
					}

					Class118.method2945(45);
					var3.method8631();
					var3 = null;
					Class502.method9252(var25);
					var1.field1449 = null;
					return false;
				}

				if (Class338.field3576 == var1.field1449) {
					field734 = var4.method9405();
					if (255 == field734) {
						field734 = 0;
					}

					field594 = var4.method9405();
					if (field594 == 255) {
						field594 = 0;
					}

					var1.field1449 = null;
					return true;
				}

				if (Class338.field3606 == var1.field1449) {
					var23 = var4.method9437();
					var24 = var4.method9446();
					var7 = var4.method9555();
					var8 = (Class104)field654.method9361((long)var7);
					if (var8 != null) {
						method716(var8, var24 != var8.field1366);
					}

					method5559(var7, var24, var23);
					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3545) {
					for (var23 = 0; var23 < field4582.field1293.length; ++var23) {
						if (null != field4582.field1293[var23]) {
							field4582.field1293[var23].field1074 = -1;
						}
					}

					for (var23 = 0; var23 < field4582.field1295.length; ++var23) {
						if (field4582.field1295[var23] != null) {
							field4582.field1295[var23].field1074 = -1;
						}
					}

					var1.field1449 = null;
					return true;
				}

				if (var1.field1449 == Class338.field3612) {
					var23 = var4.method9446();
					var24 = var4.method9555();
					Class351.field3888[var23] = var24;
					if (Class351.field3889[var23] != var24) {
						Class351.field3889[var23] = var24;
					}

					Class140.method3138(var23);
					field678[++field719 - 1 & 31] = var23;
					var1.field1449 = null;
					return true;
				}

				Class548.method8904("" + (var1.field1449 != null ? var1.field1449.field3555 : -1) + Class113.field1422 + (var1.field1455 != null ? var1.field1455.field3555 : -1) + Class113.field1422 + (var1.field1456 != null ? var1.field1456.field3555 : -1) + Class113.field1422 + var1.field1444, (Throwable)null);
				method3869();
			} catch (IOException var21) {
				method6176();
			} catch (Exception var22) {
				var6 = "" + (var1.field1449 != null ? var1.field1449.field3555 : -1) + Class113.field1422 + (var1.field1455 != null ? var1.field1455.field3555 : -1) + Class113.field1422 + (var1.field1456 != null ? var1.field1456.field3555 : -1) + Class113.field1422 + var1.field1444 + Class113.field1422 + (field107.field1080[0] + field3857.field1289) + Class113.field1422 + (field107.field1127[0] + field3857.field1285) + Class113.field1422;

				for (var7 = 0; var7 < var1.field1444 && var7 < 50; ++var7) {
					var6 = var6 + var4.field5221[var7] + Class113.field1422;
				}

				Class548.method8904(var6, var22);
				method3869();
			}

			return true;
		}
	}

	@ObfInfo(name = "la", desc = "(I)V", opaque = "-601701584")
	public final void method1220() {
		Class300.method5996();
		if (field665 == null) {
			int var2 = Class33.field237;
			int var3;
			if (field628) {
				int var4;
				if (var2 != 1 && (field1468 || var2 != 4)) {
					var3 = Class33.field229;
					var4 = Class33.field220;
					if (var3 < field1800 - 10 || var3 > field3072 + field1800 + 10 || var4 < field4947 - 10 || var4 > 10 + field4947 + field4141) {
						field628 = false;
						method8613(field1800, field4947, field3072, field4141);
					}
				}

				if (var2 == 1 || !field1468 && var2 == 4) {
					var3 = field1800;
					var4 = field4947;
					int var5 = field3072;
					int var6 = Class33.field238;
					int var7 = Class33.field239;
					int var8 = -1;

					for (int var9 = 0; var9 < field629; ++var9) {
						int var10 = var4 + 31 + (field629 - 1 - var9) * 15;
						if (var6 > var3 && var6 < var5 + var3 && var7 > var10 - 13 && var7 < var10 + 3) {
							var8 = var9;
						}
					}

					if (var8 != -1) {
						method3065(var8);
					}

					field628 = false;
					method8613(field1800, field4947, field3072, field4141);
				}
			} else {
				var3 = method3634();
				if ((var2 == 1 || !field1468 && var2 == 4) && this.method1221()) {
					var2 = 2;
				}

				if ((var2 == 1 || !field1468 && var2 == 4) && field629 > 0) {
					method3065(var3);
				}

				if (var2 == 2 && field629 > 0) {
					this.method1222(Class33.field238, Class33.field239);
				}
			}

		}
	}

	@ObfInfo(name = "lp", desc = "(I)Z", opaque = "1645779678")
	public final boolean method1221() {
		int var2 = field629 - 1;
		boolean var4 = field494 && field629 > 2;
		if (!var4) {
			boolean var5;
			if (var2 < 0) {
				var5 = false;
			} else {
				int var6 = field632[var2];
				if (var6 >= 2000) {
					var6 -= 2000;
				}

				if (var6 == 1007) {
					var5 = true;
				} else {
					var5 = false;
				}
			}

			var4 = var5;
		}

		return var4 && !field638[var2];
	}

	@ObfInfo(name = "ld", desc = "(IIB)V", opaque = "15")
	public final void method1222(int var1, int var2) {
		int var4 = field3003.method8080(Class378.field4313);

		int var5;
		for (var5 = 0; var5 < field629; ++var5) {
			Class418 var6 = field3003;
			String var7;
			if (var5 < 0) {
				var7 = "";
			} else if (field637[var5].length() > 0) {
				var7 = field636[var5] + Class378.field4320 + field637[var5];
			} else {
				var7 = field636[var5];
			}

			int var8 = var6.method8080(var7);
			if (var8 > var4) {
				var4 = var8;
			}
		}

		var4 += 8;
		var5 = 22 + field629 * 15;
		int var10 = var1 - var4 / 2;
		if (var10 + var4 > field182) {
			var10 = field182 - var4;
		}

		if (var10 < 0) {
			var10 = 0;
		}

		int var11 = var2;
		if (var2 + var5 > field5261) {
			var11 = field5261 - var5;
		}

		if (var11 < 0) {
			var11 = 0;
		}

		field1800 = var10;
		field4947 = var11;
		field3072 = var4;
		field4141 = field629 * 15 + 22;
		var1 -= field766;
		var2 -= field764;
		field3857.field1283.method4980(field3857.field1300, var1, var2, false);

		for (var4 = 0; var4 < field3857.field1286; ++var4) {
			Class488 var9 = field3857.field1299[field3857.field1302[var4]];
			if (var9 != null) {
				var9.field4995.field1283.method4980(var9.field4995.field1300, var1, var2, false);
			}
		}

		field628 = true;
	}

	@ObfInfo(name = "mx", desc = "(ZB)V")
	public final void method1762(boolean var1) {
		method2209(field740, field182, field5261, var1);
	}

	@ObfInfo(name = "ma", desc = "(Lnb;I)V", opaque = "1126291948")
	public void method1224(Class340 var1) {
		Class340 var3 = var1.field3826 == -1 ? null : field25.method6718(var1.field3826);
		int var4;
		int var5;
		if (var3 == null) {
			var4 = field182;
			var5 = field5261;
		} else {
			var4 = var3.field3692;
			var5 = var3.field3736;
		}

		method7116(var1, var4, var5, false);
		method27(var1, var4, var5);
	}

	@ObfInfo(name = "nv", desc = "(S)V", opaque = "255")
	public final void method1225() {
		Class317.method6187(field665);
		++field2838;
		if (field673 && field692) {
			int var2 = Class33.field229;
			int var3 = Class33.field220;
			var2 -= field644;
			var3 -= field668;
			if (var2 < field671) {
				var2 = field671;
			}

			if (var2 + field665.field3692 > field671 + field666.field3692) {
				var2 = field666.field3692 + field671 - field665.field3692;
			}

			if (var3 < field753) {
				var3 = field753;
			}

			if (var3 + field665.field3736 > field666.field3736 + field753) {
				var3 = field666.field3736 + field753 - field665.field3736;
			}

			int var4 = var2 - field674;
			int var5 = var3 - field706;
			int var6 = field665.field3760;
			if (field2838 > field665.field3761 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
				field676 = true;
			}

			int var7 = field666.field3698 + (var2 - field671);
			int var8 = field666.field3699 + (var3 - field753);
			Class101 var9;
			if (field665.field3773 != null && field676) {
				var9 = new Class101();
				var9.field1325 = field665;
				var9.field1326 = var7;
				var9.field1329 = var8;
				var9.field1333 = field665.field3773;
				Class72.method7210(var9);
			}

			if (Class33.field227 == 0) {
				if (field676) {
					if (field665.field3774 != null) {
						var9 = new Class101();
						var9.field1325 = field665;
						var9.field1326 = var7;
						var9.field1329 = var8;
						var9.field1324 = field669;
						var9.field1333 = field665.field3774;
						Class72.method7210(var9);
					}

					if (field669 != null && Class16.method193(field665) != null) {
						Class316 var10 = Class316.method3908(Class315.field3285, field548.field1446);
						var10.field3374.method9556(field665.field3676);
						var10.field3374.method9443(field665.field3791);
						var10.field3374.method9476(field665.field3810);
						var10.field3374.method9458(field669.field3676);
						var10.field3374.method9389(field669.field3810);
						var10.field3374.method9476(field669.field3791);
						field548.method2897(var10);
					}
				} else if (this.method1221()) {
					this.method1222(field674 + field644, field668 + field706);
				} else if (field629 > 0) {
					method3706(field644 + field674, field668 + field706);
				}

				field665 = null;
			}

		} else {
			if (field2838 > 1) {
				if (!field676 && field629 > 0) {
					method3706(field644 + field674, field706 + field668);
				}

				field665 = null;
			}

		}
	}

	@ObfInfo(name = "pm", desc = "(I)Lvv;", opaque = "-1381930917")
	public Class567 method1226() {
		return field107 != null ? field107.field1025 : null;
	}

	@ObfInfo(name = "pi", desc = "(IB)V")
	public void method1227(int var1) {
		Class316 var3 = Class316.method3908(Class315.field3350, field548.field1446);
		var3.field3374.method9388(var1);
		field548.method2897(var3);
	}

	@ObfInfo(name = "po", desc = "(II)V")
	public void method1228(int var1) {
		Class316 var3 = Class316.method3908(Class315.field3346, field548.field1446);
		var3.field3374.method9388(var1);
		field548.method2897(var3);
	}

	@ObfInfo(owner = "eo", name = "gp", desc = "(B)Ltf;")
	public static Class500 method2951() {
		return field3963;
	}

	@ObfInfo(owner = "fx", name = "hm", desc = "(B)Ltb;")
	public static Class496 method3301() {
		return field104;
	}

	@ObfInfo(owner = "ot", name = "hq", desc = "(B)Lis;")
	public static Class227 method7365() {
		return field721;
	}

	@ObfInfo(owner = "ad", name = "hu", desc = "(I)V", opaque = "1594620822")
	public static void method54() {
		field498 = true;
		if (field3250 != null && field3250.method2848()) {
			field3250.method2821();
		}

		method2739();
		method8429();
		if (field830 != null) {
			field830.field1050 = false;
		}

		field830 = null;
		field548.method2901();
		if (field209 != null) {
			try {
				field209.method3658();
			} catch (Exception var3) {
			}
		}

		field209 = null;
		method191();
		method3205();
		field4582.method2501();

		for (int var1 = 0; var1 < 4; ++var1) {
			if (null != field4582.field1284[var1]) {
				field4582.field1284[var1].method4302();
			}
		}

		field104 = null;
		Class380.method7208(0, 0);
		Class332.method785();
		field737 = false;
		Class147.method3246();
		if (field1565 != null) {
			field1565.method405();
		}

		field69.method7176();
		Class377.method6261();
		if (field3381 != null) {
			field3381.method2757();
		}

		Class179.method3510();
		Class179.field1885 = null;
		Class179.field1890 = null;
		field910 = null;
		Class165.method1097();
		field3266 = null;
		field713.clear();
		field786 = 0;
		field69 = new Class374();
		field3381 = new Class120(field2077.field767, 222);

		try {
			Class179.method2405("oldschool", field4509, field2428.field3996, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		field3266 = new Class474(255, Class179.field1885, Class179.field1890, 500000);
		field209 = new Class182();
		field2077.method483();
		method2970(Class92.field1218);
		Class118.method2945(0);
	}

	@ObfInfo(owner = "fo", name = "hy", desc = "(I)V")
	public static void method3205() {
		field4958 = null;
		field106 = null;
		field23 = null;
		field29 = null;
		field76 = null;
		field4039 = null;
		field1413 = null;
		field2709 = null;
		field2153 = null;
		field1374 = null;
		field317 = null;
	}

	@ObfInfo(owner = "fw", name = "hr", desc = "(Lot;Ljava/lang/String;B)V")
	public static void method3290(Class384 var0, String var1) {
		Class82 var3 = new Class82(var0, var1);
		field713.add(var3);
		field786 += var3.field1001;
	}

	@ObfInfo(owner = "ci", name = "hl", desc = "(IIB)V", opaque = "0")
	public static void method1101(int var0, int var1) {
		int[] var3 = new int[9];

		for (int var4 = 0; var4 < var3.length; ++var4) {
			int var5 = var4 * 32 + 128 + 15;
			int var6 = 600 + var5 * 3;
			int var8 = Class253.field2683[var5];
			int var10 = var1 - 334;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 100) {
				var10 = 100;
			}

			int var11 = field760 + (field508 - field760) * var10 / 100;
			int var9 = var11 * var6 / 256;
			var3[var4] = var8 * var9 >> 16;
		}

		field3857.field1283.method4975(var3, 500, 800, var0 * 334 / var1, 334);
	}

	@ObfInfo(owner = "bh", name = "hf", desc = "(I)V", opaque = "-2122145353")
	public static void method718() {
		if (Class92.field1218 == field519) {
			field1750 = method2740(Class375.field4103.field4121, false, true, true, false);
			field2961 = method2740(Class375.field4105.field4121, true, true, true, false);
			field1793 = method2740(Class375.field4107.field4121, false, true, true, false);
			field1556 = method2740(Class375.field4109.field4121, false, true, true, false);
			field1430 = method2740(Class375.field4112.field4121, true, false, true, false);
			field3269 = method2740(Class375.field4111.field4121, false, true, true, false);
			field1660 = method2740(Class375.field4119.field4121, false, true, true, false);
			Class76.method3406(20, Class378.field4346);
			method2970(Class92.field1233);
		} else {
			byte var1;
			int var19;
			if (Class92.field1233 == field519) {
				var1 = 0;
				var19 = var1 + field1750.method7320() * 53 / 100;
				var19 += field2961.method7320() * 5 / 100;
				var19 += field1793.method7320() * 36 / 100;
				var19 += field1556.method7320() / 100;
				var19 += field1430.method7320() / 100;
				var19 += field3269.method7320() * 3 / 100;
				var19 += field1660.method7320() / 100;
				if (var19 != 100) {
					if (var19 != 0) {
						Class76.method3406(30, Class378.field4427 + var19 + "%");
					}

				} else {
					method3290(field1750, "Sound FX");
					method3290(field2961, "Music Tracks");
					method3290(field1793, "Sprites");
					method3290(field3269, "Music Samples");
					method3290(field1660, "Music Patches");
					Class76.method3406(40, Class378.field4161);
					method2970(Class92.field1235);
				}
			} else {
				int var4;
				Class384 var6;
				Class384 var25;
				Class384 var26;
				if (field519 == Class92.field1235) {
					boolean var36 = !field599;
					field1382 = 22050;
					field1887 = var36;
					field2640 = 2;
					ArrayList var21 = new ArrayList(3);
					field1565 = Class30.method126(field209, 0, 2048);
					field3984 = new Class37();
					Class37 var24 = new Class37();
					var24.method743(field3984);

					for (var4 = 0; var4 < 3; ++var4) {
						Class335 var32 = new Class335(field1565);
						var32.method6322(9, 128);
						var24.method743(var32);
						var21.add(var32);
					}

					field1565.method401(var24);
					var25 = field1660;
					var26 = field3269;
					var6 = field1750;
					field4596 = var25;
					field3463 = var26;
					field1661 = var6;
					Class332.field3454 = var21;
					field1251 = new Class56(22050, field1382);
					Class76.method3406(60, Class378.field4162);
					method2970(Class92.field1223);
				} else {
					int var2;
					if (Class92.field1223 == field519) {
						if (field4552 == null) {
							field4552 = new Class520(field1793, field1430);
						}

						Class497[] var35 = new Class497[]{Class497.field5085, Class497.field5082, Class497.field5094, Class497.field5086, Class497.field5087, Class497.field5084};
						var2 = var35.length;
						Class520 var23 = field4552;
						Class497[] var28 = new Class497[]{Class497.field5085, Class497.field5082, Class497.field5094, Class497.field5086, Class497.field5087, Class497.field5084};
						field552 = var23.method9383(var28);
						if (field552.size() < var2) {
							Class76.method3406(80, Class378.field4163 + field552.size() * 100 / var2 + "%");
						} else {
							field5366 = (Class418)field552.get(Class497.field5094);
							field3127 = (Class418)field552.get(Class497.field5084);
							field3003 = (Class418)field552.get(Class497.field5082);
							field3963 = field774.method9284();
							Class76.method3406(80, Class378.field4164);
							method2970(Class92.field1224);
						}
					} else {
						int var5;
						Class384 var20;
						Class384 var22;
						if (Class92.field1224 == field519) {
							var20 = field1556;
							var22 = field1793;
							var4 = 0;
							String[] var27 = Class76.field954;

							int var29;
							String var33;
							for (var29 = 0; var29 < var27.length; ++var29) {
								var33 = var27[var29];
								if (var20.method7253(var33, "")) {
									++var4;
								}
							}

							var27 = Class76.field936;

							for (var29 = 0; var29 < var27.length; ++var29) {
								var33 = var27[var29];
								if (var22.method7253(var33, "")) {
									++var4;
								}
							}

							var27 = Class76.field922;

							for (var29 = 0; var29 < var27.length; ++var29) {
								var33 = var27[var29];
								if (var22.method7233(var33) != -1 && var22.method7253(var33, "")) {
									++var4;
								}
							}

							var5 = Class76.method5647(field1793);
							if (var4 < var5) {
								Class76.method3406(90, Class378.field4283 + var4 * 100 / var5 + "%");
							} else {
								Class76.method3406(100, Class378.field4166);
								if (field434) {
									Class118.method2945(5);
									method2970(Class92.field1232);
								} else {
									method2970(Class92.field1222);
								}

							}
						} else if (field519 == Class92.field1232) {
							Class118.method2945(10);
						} else if (Class92.field1222 == field519) {
							field3083 = method2740(Class375.field4099.field4121, false, true, true, false);
							field3386 = method2740(Class375.field4114.field4121, false, true, true, false);
							field3018 = method2740(Class375.field4113.field4121, true, false, true, false);
							field386 = method2740(Class375.field4102.field4121, false, true, true, false);
							field2971 = method2740(Class375.field4104.field4121, true, true, true, false);
							field1410 = method2740(Class375.field4106.field4121, false, true, true, false);
							field13 = method2740(Class375.field4110.field4121, false, true, true, false);
							field3528 = method2740(Class375.field4117.field4121, false, true, true, false);
							field4783 = method2740(Class375.field4108.field4121, false, true, true, false);
							field3371 = method2740(Class375.field4115.field4121, true, true, true, false);
							field463 = method2740(Class375.field4098.field4121, false, true, true, false);
							field3392 = method2740(Class375.field4116.field4121, false, true, true, false);
							field1647 = method2740(Class375.field4118.field4121, false, true, true, false);
							field1255 = method2740(Class375.field4100.field4121, false, true, true, false);
							field1275 = method2185(Class375.field4120.field4121, false, true, true, true, true);
							Class76.method3406(20, Class378.field4346);
							method2970(Class92.field1225);
						} else if (Class92.field1225 != field519) {
							if (field519 == Class92.field1219) {
								field3857 = new Class98(-1, 104, 104, field4851.method2679());
								field4582 = field3857;
								field1359 = new Class549(512, 512);
								Class76.method3406(30, Class378.field4341);
								method2970(Class92.field1217);
							} else if (field519 == Class92.field1217) {
								if (!field3018.method7255()) {
									Class76.method3406(40, Class378.field4167 + field3018.method7331() + "%");
								} else if (!field1255.method7255()) {
									Class76.method3406(40, Class378.field4167 + (80 + field4783.method7331() / 6) + "%");
								} else {
									Class230.method3042(field3018);
									Class384 var34 = field3018;
									field2111 = var34;
									var20 = field3018;
									var22 = field1410;
									field2012 = var20;
									field1802 = var22;
									field4711 = field2012.method7237(3);
									Class222.method462(field3018, field1410, field599);
									var25 = field3018;
									var26 = field1410;
									field2315 = var25;
									field319 = var26;
									Class234.method7366(field3018);
									Class232.method2219(field3018, field1410, field528, field5366);
									var6 = field3018;
									Class384 var7 = field3083;
									Class384 var8 = field3386;
									field2127 = var6;
									field2123 = var7;
									field2131 = var8;
									Class384 var9 = field3018;
									Class384 var10 = field1410;
									field1937 = var9;
									field2313 = var10;
									Class140.method3141(field3018);
									Class205.method3880(field3018);
									field25 = new Class349(field386, field1410, field1793, field1430, field1275);
									Class384 var11 = field3018;
									field2039 = var11;
									Class384 var12 = field3018;
									field2102 = var12;
									Class193.method49(field3018);
									Class233.method4674(field3018);
									Class217.method2299(field3018);
									Class540.method6072(field3018);
									Class384 var13 = field3018;
									field5319 = var13;
									field2814 = new Class530(field1497, 54, field2071, field3018);
									field431 = new Class530(field1497, 47, field2071, field3018);
									field3250 = new Class110();
									Class384 var14 = field3018;
									Class384 var15 = field1793;
									Class384 var16 = field1430;
									field2200 = var14;
									field3267 = var15;
									field2191 = var16;
									Class384 var17 = field3018;
									Class384 var18 = field1793;
									field1997 = var17;
									field1998 = var18;
									Class200.method4891(field3018, field1793);
									Class76.method3406(50, Class378.field4288);
									method2970(Class92.field1226);
								}
							} else if (field519 == Class92.field1226) {
								var19 = 0;
								if (field4958 == null) {
									field4958 = Class554.method9868(field1793, field2997.field4985, 0);
								} else {
									++var19;
								}

								if (field106 == null) {
									field106 = Class554.method9868(field1793, field2997.field4977, 0);
								} else {
									++var19;
								}

								if (field23 == null) {
									field23 = Class554.method7961(field1793, field2997.field4976, 0);
								} else {
									++var19;
								}

								if (field29 == null) {
									field29 = Class554.method6029(field1793, field2997.field4978, 0);
								} else {
									++var19;
								}

								if (field76 == null) {
									field76 = Class554.method6029(field1793, field2997.field4980, 0);
								} else {
									++var19;
								}

								if (field4039 == null) {
									field4039 = Class554.method6029(field1793, field2997.field4981, 0);
								} else {
									++var19;
								}

								if (field1413 == null) {
									field1413 = Class554.method6029(field1793, field2997.field4982, 0);
								} else {
									++var19;
								}

								if (field2709 == null) {
									field2709 = Class554.method6029(field1793, field2997.field4979, 0);
								} else {
									++var19;
								}

								if (field2153 == null) {
									field2153 = Class554.method6029(field1793, field2997.field4984, 0);
								} else {
									++var19;
								}

								if (field1374 == null) {
									field1374 = Class554.method7961(field1793, field2997.field4983, 0);
								} else {
									++var19;
								}

								if (field317 == null) {
									field317 = Class554.method7961(field1793, field2997.field4986, 0);
								} else {
									++var19;
								}

								if (var19 < 11) {
									Class76.method3406(70, Class378.field4169 + var19 * 100 / 12 + "%");
								} else {
									field4733 = field317;
									field106.method9923();
									var2 = (int)(Math.random() * 21.0D) - 10;
									int var3 = (int)(Math.random() * 21.0D) - 10;
									var4 = (int)(Math.random() * 21.0D) - 10;
									var5 = (int)(Math.random() * 41.0D) - 20;
									field23[0].method10092(var5 + var2, var5 + var3, var5 + var4);
									Class76.method3406(60, Class378.field4411);
									method2970(Class92.field1227);
								}
							} else if (Class92.field1227 == field519) {
								if (!field13.method7255()) {
									Class76.method3406(70, Class378.field4171 + "0%");
								} else {
									field1955 = new Class244(field13, field1793, 20, field4851.method2621(), field599 ? 64 : 128);
									Class253.method4783(field1955);
									Class253.method4784(field4851.method2621());
									method2970(Class92.field1228);
								}
							} else if (Class92.field1228 == field519) {
								var19 = field1955.method4715();
								if (var19 < 100) {
									Class76.method3406(80, Class378.field4171 + var19 + "%");
								} else {
									Class76.method3406(90, Class378.field4324);
									method2970(Class92.field1229);
								}
							} else if (Class92.field1229 == field519) {
								field830 = new Class85();
								field209.method3646(field830, 10);
								Class76.method3406(92, Class378.field4173);
								method2970(Class92.field1230);
							} else if (field519 == Class92.field1230) {
								if (!field1556.method7253("huffman", "")) {
									Class76.method3406(94, Class378.field4174 + 0 + "%");
								} else {
									Class342 var31 = new Class342(field1556.method7271("huffman", ""));
									field3661 = var31;
									Class76.method3406(94, Class378.field4434);
									method2970(Class92.field1231);
								}
							} else if (field519 == Class92.field1231) {
								if (!field386.method7255()) {
									Class76.method3406(96, Class378.field4150 + field386.method7331() * 4 / 5 + "%");
								} else if (!field1275.method7255()) {
									Class76.method3406(96, Class378.field4150 + field1275.method7331() * 4 / 5 + "%");
								} else if (!field4783.method7255()) {
									Class76.method3406(96, Class378.field4150 + (80 + field4783.method7331() / 6) + "%");
								} else if (!field1430.method7255()) {
									Class76.method3406(96, Class378.field4150 + (96 + field1430.method7331() / 50) + "%");
								} else {
									Class76.method3406(98, Class378.field4177);
									if (field4783.method7235("version.dat", "")) {
										Class521 var30 = new Class521(field4783.method7271("version.dat", ""));
										var30.method9407();
									}

									method2970(Class92.field1221);
								}
							} else if (field519 == Class92.field1221) {
								if (field3392.method7228() > 0 && !field3392.method7238(Class308.field3249.field3251)) {
									Class76.method3406(100, Class378.field4192 + field3392.method7239(Class308.field3249.field3251) / 10 + "%");
								} else {
									if (field104 == null) {
										field104 = new Class496();
										field104.method8990(field3392, field463, field1647, field3003, field552, field23);
									}

									Class76.method3406(100, Class378.field4361);
									if (field434) {
										method2970(Class92.field1234);
									} else {
										method2970(Class92.field1232);
									}

									field498 = false;
								}
							} else {
								if (field519 == Class92.field1234) {
									field5226 = false;
									Class118.method2945(20);
									method788(Class53.field387);
								}

							}
						} else {
							var1 = 0;
							var19 = var1 + field3083.method7320() * 5 / 100;
							var19 += field3386.method7320() * 2 / 100;
							var19 += field3018.method7320() / 100;
							var19 += field386.method7320() / 100;
							var19 += field2971.method7320() * 10 / 100;
							var19 += field1410.method7320() * 65 / 100;
							var19 += field13.method7320() / 100;
							var19 += field3528.method7320() / 100;
							var19 += field4783.method7320() * 6 / 100;
							var19 += field3392.method7320() / 100;
							var19 += field463.method7320() * 2 / 100;
							var19 += field1647.method7320() * 2 / 100;
							var19 += field1255.method7320() / 100;
							var19 += field1275.method7320() / 100;
							var19 += field3371.method7319() && field3371.method7255() ? 1 : 0;
							if (var19 != 100) {
								if (var19 != 0) {
									Class76.method3406(30, Class378.field4427 + var19 + "%");
								}

							} else {
								method3290(field3083, "Animations");
								method3290(field3386, "Skeletons");
								method3290(field2971, "Maps");
								method3290(field1410, "Models");
								method3290(field3528, "Music Jingles");
								method3290(field3392, "World Map");
								method3290(field463, "World Map Geography");
								method3290(field1647, "World Map Ground");
								field2997 = new Class487();
								field2997.method8905(field3371);
								Class76.method3406(30, Class378.field4161);
								method2970(Class92.field1219);
							}
						}
					}
				}
			}
		}
	}

	@ObfInfo(owner = "eq", name = "hs", desc = "(Ldn;I)V", opaque = "1619567264")
	public static void method2970(Class92 var0) {
		if (field519 != var0) {
			field519 = var0;
		}
	}

	@ObfInfo(owner = "dz", name = "hz", desc = "(IZZZZI)Lot;", opaque = "1978969648")
	public static Class384 method2740(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		Class474 var6 = null;
		if (Class179.field1885 != null) {
			var6 = new Class474(var0, Class179.field1885, field910[var0], 1000000);
		}

		return new Class384(var6, field3266, field69, var0, var1, var2, var3, var4, false);
	}

	@ObfInfo(owner = "cy", name = "hn", desc = "(IZZZZZI)Lot;", opaque = "-1456841350")
	public static Class384 method2185(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		Class474 var7 = null;
		if (Class179.field1885 != null) {
			var7 = new Class474(var0, Class179.field1885, field910[var0], 1000000);
		}

		return new Class384(var7, field3266, field69, var0, var1, var2, var3, var4, var5);
	}

	@ObfInfo(owner = "ny", name = "hc", desc = "(Lmd;I)V")
	public static void method7121(Class316 var0) {
		var0.field3374.method9590(0);
		var0.field3374.method9590(field1647.field4486);
		var0.field3374.method9458(field3528.field4486);
		var0.field3374.method9556(field3269.field4486);
		var0.field3374.method9556(field3018.field4486);
		var0.field3374.method9459(field3392.field4486);
		var0.field3374.method9556(field13.field4486);
		var0.field3374.method9590(field1793.field4486);
		var0.field3374.method9590(field3371.field4486);
		var0.field3374.method9590(field1750.field4486);
		var0.field3374.method9556(field1556.field4486);
		var0.field3374.method9590(field1660.field4486);
		var0.field3374.method9556(field3386.field4486);
		var0.field3374.method9459(field386.field4486);
		var0.field3374.method9590(field1410.field4486);
		var0.field3374.method9556(field4783.field4486);
		var0.field3374.method9458(field3083.field4486);
		var0.field3374.method9556(field2971.field4486);
		var0.field3374.method9458(field2961.field4486);
		var0.field3374.method9459(field463.field4486);
		var0.field3374.method9556(field1430.field4486);
	}

	@ObfInfo(owner = "hx", name = "io", desc = "(Lmd;I)V")
	public static void method3957(Class316 var0) {
		var0.field3374.method9459(field1793.field4486);
		var0.field3374.method9458(field1660.field4486);
		var0.field3374.method9590(field3269.field4486);
		var0.field3374.method9590(field2961.field4486);
		var0.field3374.method9458(field1430.field4486);
		var0.field3374.method9556(field1750.field4486);
		var0.field3374.method9459(field1556.field4486);
	}

	@ObfInfo(owner = "rj", name = "iq", desc = "(B)V", opaque = "10")
	public static void method8429() {
		field502 = -1L;
		if (field830 != null) {
			field830.field1048 = 0;
		}

		field4885 = true;
		field506 = true;
		field726 = -1L;
		Class47.field323 = new Class409();
		field548.method2895();
		field548.field1447.field5219 = 0;
		field548.field1449 = null;
		field548.field1454 = null;
		field548.field1455 = null;
		field548.field1456 = null;
		field548.field1444 = 0;
		field548.field1450 = 0;
		field649 = 0;
		field549 = 0;
		field742 = 0;
		method6662();
		Class33.field241 = 0;
		Class128.method2508();
		field702 = 0;
		field648 = false;
		field650 = 0;
		field572 = 0;
		field577 = 0;
		field422 = null;
		field736 = 0;
		field729 = -1;
		field734 = 0;
		field594 = 0;
		field516 = Class114.field1434;
		field517 = Class114.field1434;
		field3857.method2501();
		field274.method1876();
		if (field2083 > 5000) {
		}

		int var1;
		if (field498) {
			Class351.method4380();
		} else {
			for (var1 = 0; var1 < field2083; ++var1) {
				Class205 var2 = Class205.method4659(var1);
				if (var2 != null) {
					Class351.field3888[var1] = 0;
					Class351.field3889[var1] = 0;
				}
			}
		}

		if (field3250 != null) {
			field3250.method2820();
		}

		field662 = -1;
		if (-1 != field740) {
			field25.method6722(field740);
		}

		for (Class104 var3 = (Class104)field654.method9363(); var3 != null; var3 = (Class104)field654.method9364()) {
			method716(var3, true);
		}

		field740 = -1;
		field654 = new Class518(8);
		field533 = null;
		method6662();
		field771.method7045((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var1 = 0; var1 < 8; ++var1) {
			field679[var1] = null;
			field602[var1] = false;
		}

		Class79.method3179();
		field499 = true;

		for (var1 = 0; var1 < 100; ++var1) {
			field614[var1] = true;
		}

		if (field548 != null && field548.field1446 != null) {
			Class316 var4 = Class316.method3908(Class315.field3365, field548.field1446);
			var4.field3374.method9388(method9643());
			var4.field3374.method9389(field182);
			var4.field3374.method9389(field5261);
			field548.method2897(var4);
		}

		field1420 = null;
		field2020 = null;
		Arrays.fill(field670, (Object)null);
		field4619 = null;
		Arrays.fill(field684, (Object)null);

		for (var1 = 0; var1 < 8; ++var1) {
			field531[var1] = new Class397();
		}

		field1829 = null;
	}

	@ObfInfo(owner = "ib", name = "ib", desc = "(II)V", opaque = "1512426424")
	public static void method3995(int var0) {
		int var2 = Class76.field932;
		if (var0 == -3) {
			Class76.method5778(Class378.field4189, Class378.field4190, Class378.field4293);
		} else if (var0 == -2) {
			Class76.method5778(Class378.field4179, Class378.field4193, Class378.field4237);
		} else if (var0 == -1) {
			Class76.method5778(Class378.field4195, Class378.field4196, Class378.field4197);
		} else if (var0 == 3) {
			Class76.method4120(3);
			Class76.field929 = 1;
		} else if (var0 == 4) {
			Class76.method4120(14);
			Class76.field927 = 0;
		} else if (var0 == 5) {
			Class76.field929 = 2;
			Class76.method5778(Class378.field4191, Class378.field4158, Class378.field4203);
		} else if (var0 == 68) {
			if (!field497) {
				field497 = true;
				method54();
				return;
			}

			Class76.method5778(Class378.field4204, Class378.field4205, Class378.field4206);
		} else if (!field565 && var0 == 6) {
			Class76.method5778(Class378.field4204, Class378.field4205, Class378.field4206);
		} else if (var0 == 7) {
			Class76.method5778(Class378.field4207, Class378.field4151, Class378.field4239);
		} else if (var0 == 8) {
			Class76.method5778(Class378.field4210, Class378.field4146, Class378.field4212);
		} else if (var0 == 9) {
			Class76.method5778(Class378.field4213, Class378.field4265, Class378.field4215);
		} else if (var0 == 10) {
			Class76.method5778(Class378.field4216, Class378.field4457, Class378.field4218);
		} else if (var0 == 11) {
			Class76.method5778(Class378.field4396, Class378.field4314, Class378.field4221);
		} else if (var0 == 12) {
			Class76.method5778(Class378.field4236, Class378.field4185, Class378.field4165);
		} else if (var0 == 13) {
			Class76.method5778(Class378.field4229, Class378.field4226, Class378.field4227);
		} else if (var0 == 14) {
			Class76.method5778(Class378.field4228, Class378.field4290, Class378.field4230);
		} else if (var0 == 16) {
			Class76.method5778(Class378.field4231, Class378.field4232, Class378.field4362);
			Class76.method4120(33);
		} else if (var0 == 17) {
			Class76.method5778(Class378.field4234, Class378.field4235, Class378.field4144);
		} else if (var0 == 18) {
			Class76.method4120(14);
			Class76.field927 = 1;
		} else if (var0 == 19) {
			Class76.method5778(Class378.field4240, Class378.field4241, Class378.field4242);
		} else if (var0 == 20) {
			Class76.method5778(Class378.field4223, Class378.field4244, Class378.field4243);
		} else if (var0 == 22) {
			Class76.method5778(Class378.field4209, Class378.field4247, Class378.field4233);
		} else if (var0 == 23) {
			Class76.method5778(Class378.field4312, Class378.field4298, Class378.field4251);
		} else if (var0 == 24) {
			Class76.method5778(Class378.field4252, Class378.field4254, Class378.field4371);
		} else if (var0 == 25) {
			Class76.method5778(Class378.field4255, Class378.field4256, Class378.field4186);
		} else if (var0 == 26) {
			Class76.method5778(Class378.field4258, Class378.field4259, Class378.field4260);
		} else if (var0 == 27) {
			Class76.method5778(Class378.field4397, Class378.field4262, Class378.field4263);
		} else if (var0 == 31) {
			Class76.method5778(Class378.field4270, Class378.field4271, Class378.field4272);
		} else if (var0 == 32) {
			Class76.method4120(14);
			Class76.field927 = 2;
		} else if (var0 == 37) {
			Class76.method5778(Class378.field4276, Class378.field4277, Class378.field4357);
		} else if (var0 == 38) {
			Class76.method5778(Class378.field4279, Class378.field4246, Class378.field4281);
		} else if (var0 == 74) {
			Class76.method5778(Class378.field4282, Class378.field4266, Class378.field4284);
		} else if (var0 == 55) {
			Class76.method4120(8);
		} else {
			if (var0 == 56) {
				Class76.method5778(Class378.field4289, Class378.field4280, Class378.field4299);
				Class118.method2945(11);
				return;
			}

			if (var0 == 57) {
				Class76.method5778(Class378.field4292, Class378.field4338, Class378.field4224);
				Class118.method2945(11);
				return;
			}

			if (var0 == 61) {
				Class76.method5778("", "Please enter your date of birth (DD/MM/YYYY)", "");
				Class76.method4120(7);
			} else {
				if (var0 == 62) {
					Class118.method2945(10);
					Class76.method4120(9);
					Class76.method5778(Class378.field4143, Class378.field4296, Class378.field4297);
					return;
				}

				if (var0 == 63) {
					Class118.method2945(10);
					Class76.method4120(9);
					Class76.method5778(Class378.field4175, Class378.field4446, Class378.field4300);
					return;
				}

				if (var0 == 65 || var0 == 67) {
					Class118.method2945(10);
					Class76.method4120(9);
					Class76.method5778(Class378.field4301, Class378.field4302, Class378.field4388);
					return;
				}

				if (var0 == 71) {
					Class118.method2945(10);
					Class76.method4120(7);
					Class76.method5778("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					Class118.method2945(10);
					Class76.method4120(6);
					Class76.method5778(Class378.field4432, Class378.field4250, Class378.field4450);
				} else if (var0 == 72) {
					Class118.method2945(10);
					Class76.method4120(32);
				} else {
					Class76.method5778(Class378.field4304, Class378.field4305, Class378.field4303);
				}
			}
		}

		Class118.method2945(10);
		int var5 = Class76.field932;
		boolean var6 = var5 != var2;
		if (!var6 && field527.method10080()) {
			Class76.method4120(9);
		}

	}

	@ObfInfo(owner = "ho", name = "ie", desc = "(B)V")
	public static void method3869() {
		field548.method2901();
		method191();
		field3857.method2501();
		field510.method4070();
		System.gc();
		Class380.method7208(0, 0);
		Class332.method785();
		field737 = false;
		Class147.method3246();
		Class118.method2945(10);
		field501 = 0;
		Class191.method3562().method3722();
		Class191.method3562().method3725();
	}

	@ObfInfo(owner = "sq", name = "if", desc = "(IB)V")
	public static void method8883(int var0) {
		method3869();
		switch(var0) {
		case 1:
			Class76.method5912();
			break;
		case 2:
			Class76.method4065();
		}

	}

	@ObfInfo(owner = "dc", name = "ig", desc = "(B)J")
	public static long method2242() {
		return field612;
	}

	@ObfInfo(owner = "fa", name = "ip", desc = "(I)J")
	public static long method3062() {
		return field613;
	}

	@ObfInfo(owner = "ap", name = "ia", desc = "(I)V", opaque = "709224351")
	public static void method191() {
		Class201.method4057();
		Class196.method720();
		Class206.field2090.method5995();
		Class46.method857();
		Class540.method3407();
		Class208.field2101.method5995();
		Class230.field2422.method5995();
		Class209.method3959();
		Class194.field1992.method5995();
		Class194.field1993.method5995();
		Class218.method3403();
		Class207.field2096.method5995();
		Class197.field2013.method5995();
		Class199.method2750();
		Class248.method4766();
		Class200.field2044.method5995();
		Class198.method3061();
		Class225.field2316.method5995();
		Class225.field2317.method5995();
		Class232.field2454.method5995();
		Class232.field2445.method5995();
		Class232.field2440.method5995();
		Class29.method399();
		Class211.method4923();
		Class224.field2297.method5995();
		Class224.field2298.method5995();
		Class234.field2505.method5995();
		Class228.method6158();
		if (field2814 != null) {
			field2814.method9750();
		}

		if (field431 != null) {
			field431.method9750();
		}

		Class210.field2119.method5995();
		Class214.field2168.method5995();
		Class193.method2983();
		Class186.method5517();
		Class203.field2078.method5995();
		Class204.method3266();
		Class39.method789();
		Class205.field2084.method5995();
		Class233.method2997();
		field647.method5995();
		field779.method5995();
		Class358.field3956.method5995();
		Class358.field3949.method8591();
		Class358.field3957 = 0;
		if (field25 != null) {
			field25.method6732();
		}

		if (Class253.field2688.field3043 != null) {
			((Class244)Class253.field2688.field3043).method4741();
		}

		Class91.field1206.method5995();
		field777.method8591();
		if (field3083 != null) {
			field3083.method7231();
		}

		if (field3386 != null) {
			field3386.method7231();
		}

		if (field1556 != null) {
			field1556.method7231();
		}

		if (field4783 != null) {
			field4783.method7231();
		}

		if (field3018 != null) {
			field3018.method7231();
		}

		if (field1255 != null) {
			field1255.method7231();
		}

		if (field3371 != null) {
			field3371.method7231();
		}

		if (field1430 != null) {
			field1430.method7231();
		}

		if (field386 != null) {
			field386.method7231();
		}

		if (field1275 != null) {
			field1275.method7231();
		}

		if (field1750 != null) {
			field1750.method7231();
		}

		if (field3528 != null) {
			field3528.method7231();
		}

		if (field2971 != null) {
			field2971.method7231();
		}

		if (field2961 != null) {
			field2961.method7231();
		}

		if (field1410 != null) {
			field1410.method7231();
		}

		if (field1660 != null) {
			field1660.method7231();
		}

		if (field1793 != null) {
			field1793.method7231();
		}

		if (field13 != null) {
			field13.method7231();
		}

		if (field3269 != null) {
			field3269.method7231();
		}

		if (field1647 != null) {
			field1647.method7231();
		}

		if (field463 != null) {
			field463.method7231();
		}

		if (field3392 != null) {
			field3392.method7231();
		}

	}

	@ObfInfo(owner = "dz", name = "iy", desc = "(I)V")
	public static void method2739() {
		field2012 = null;
		field1802 = null;
		field4711 = 0;
	}

	@ObfInfo(owner = "mc", name = "it", desc = "(I)V", opaque = "1804148680")
	public static void method6176() {
		if (field549 > 0) {
			method3869();
		} else {
			field551.method8353();
			Class118.method2945(40);
			field4879 = field548.method2900();
			field548.method2903();
		}
	}

	@ObfInfo(owner = "ls", name = "il", desc = "(ZI)V", opaque = "-73929866")
	public static void method6138(boolean var0) {
		if (var0) {
			field526 = Class76.field944 ? Class150.field1687 : Class150.field1689;
		} else {
			field526 = field4851.method2689(Class76.field955) ? Class150.field1688 : Class150.field1686;
		}

	}

	@ObfInfo(owner = "if", name = "iz", desc = "(I)V", opaque = "2024737063")
	public static void method4066() {
		if (field1565 != null) {
			field1565.method449();
		}

	}

	@ObfInfo(owner = "bf", name = "ij", desc = "(B)V", opaque = "1")
	public static void method676() {
		for (int var1 = 0; var1 < field650; ++var1) {
			int var10002 = field741[var1]--;
			if (field741[var1] >= -10) {
				Class42 var13 = field744[var1];
				if (var13 == null) {
					Class42 var10000 = (Class42)null;
					var13 = Class42.method820(field1750, field739[var1], 0);
					if (var13 == null) {
						continue;
					}

					int[] var17 = field741;
					var17[var1] += var13.method809();
					field744[var1] = var13;
				}

				if (field741[var1] < 0) {
					int var3;
					if (0 != field511[var1]) {
						int var4 = (field511[var1] & 255) * 128;
						int var5 = field511[var1] >> 16 & 255;
						int var6 = Math.abs(64 + var5 * 128 - field107.field1065);
						int var7 = field511[var1] >> 8 & 255;
						int var8 = Math.abs(var7 * 128 + 64 - field107.field1126);
						int var9 = Math.max(var8 + var6 - 128, 0);
						int var10 = Math.max(((field743[var1] & 31) - 1) * 128, 0);
						if (var9 >= var4) {
							field741[var1] = -100;
							continue;
						}

						float var11 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
						var3 = (int)(var11 * (float)field4851.method2657());
					} else {
						var3 = field4851.method2704();
					}

					if (var3 > 0) {
						Class44 var15 = var13.method808().method849(field1251);
						Class52 var16 = Class52.method918(var15, 100, var3);
						var16.method921(field563[var1] - 1);
						field3984.method743(var16);
					}

					field741[var1] = -100;
				}
			} else {
				--field650;

				for (int var2 = var1; var2 < field650; ++var2) {
					field739[var2] = field739[var2 + 1];
					field744[var2] = field744[var2 + 1];
					field563[var2] = field563[var2 + 1];
					field741[var2] = field741[var2 + 1];
					field511[var2] = field511[var2 + 1];
					field743[var2] = field743[var2 + 1];
				}

				--var1;
			}
		}

		if (field737) {
			boolean var12;
			if (!Class332.field3458.isEmpty()) {
				var12 = true;
			} else if (!Class332.field3455.isEmpty() && Class332.field3455.get(0) != null && ((Class357)Class332.field3455.get(0)).field3940 != null) {
				var12 = ((Class357)Class332.field3455.get(0)).field3940.method6320();
			} else {
				var12 = false;
			}

			if (!var12) {
				if (field4851.method2637() != 0) {
					boolean var14 = !Class332.field3456.isEmpty();
					if (var14) {
						Class332.method5915(field2961, field4851.method2637());
					}
				}

				field737 = false;
			}
		}

	}

	@ObfInfo(owner = "do", name = "ik", desc = "(Lic;IIILdh;I)V", opaque = "238803980")
	public static void method2455(Class211 var0, int var1, int var2, int var3, Class86 var4) {
		if (field650 < 50) {
			if (var0.field2140 != null && var1 < var0.field2140.length && var0.field2140[var1] != null) {
				int var6 = var0.field2140[var1].field2216 & 31;
				if ((var6 <= 0 || field4851.method2657() != 0) && (var6 != 0 || field4851.method2704() != 0)) {
					Class219 var7 = var0.field2140[var1];
					boolean var10 = field107 == var4;
					if (var7 != null) {
						if (0 == var7.field2216) {
							if (!var10) {
								return;
							}

							field511[field650] = 0;
						} else {
							int var11 = (var2 - 64) / 128;
							int var12 = (var3 - 64) / 128;
							field511[field650] = (var12 << 8) + (var11 << 16) + var7.field2216;
						}

						field739[field650] = var7.field2217;
						field563[field650] = var7.field2214;
						field741[field650] = 0;
						field744[field650] = null;
						field743[field650] = var7.field2218;
						++field650;
					}

				}
			}
		}
	}

	@ObfInfo(owner = "rv", name = "ix", desc = "(IIII)V", opaque = "-1999950484")
	public static void method8553(int var0, int var1, int var2) {
		if (field4851.method2704() != 0 && var1 != 0 && field650 < 50) {
			field739[field650] = var0;
			field563[field650] = var1;
			field741[field650] = var2;
			field744[field650] = null;
			field511[field650] = 0;
			field743[field650] = 0;
			++field650;
		}

	}

	@ObfInfo(owner = "ag", name = "iv", desc = "(IB)V", opaque = "-1")
	public static void method110(int var0) {
		if (var0 == -1 && !field737) {
			Class380.method7208(0, 0);
		} else if (var0 != -1) {
			boolean var2;
			if (Class332.field3456.isEmpty()) {
				var2 = false;
			} else {
				Class357 var3 = (Class357)Class332.field3456.get(0);
				var2 = var3 != null && var0 == var3.field3937;
			}

			if (!var2 && field4851.method2637() != 0) {
				ArrayList var4 = new ArrayList();
				var4.add(new Class357(field2961, var0, 0, field4851.method2637(), false));
				if (field737) {
					Class332.field3456.clear();
					Class332.field3456.addAll(var4);
					Class332.method3185(0, 100, 100, 0);
				} else {
					Class332.method1940(var4, 0, 100, 100, 0, false);
				}
			}
		}

	}

	@ObfInfo(owner = "am", name = "ic", desc = "(Ljava/util/ArrayList;IIIII)V", opaque = "-458578502")
	public static void method160(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var6 = (Integer)var0.get(0);
			if (var6 == -1 && !field737) {
				Class380.method7208(0, 0);
			} else if (var6 != -1) {
				boolean var7;
				if (Class332.field3456.isEmpty()) {
					var7 = false;
				} else {
					Class357 var8 = (Class357)Class332.field3456.get(0);
					var7 = var8 != null && var8.field3937 == var6;
				}

				if (!var7 && field4851.method2637() != 0) {
					ArrayList var10 = new ArrayList();

					for (int var9 = 0; var9 < var0.size(); ++var9) {
						var10.add(new Class357(field2961, (Integer)var0.get(var9), 0, field4851.method2637(), false));
					}

					if (field737) {
						Class332.field3456.clear();
						Class332.field3456.addAll(var10);
						Class332.method3185(var1, var2, var3, var4);
					} else {
						Class332.method1940(var10, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}

	@ObfInfo(owner = "bf", name = "iu", desc = "(III)V", opaque = "507394209")
	public static void method674(int var0, int var1) {
		if (field4851.method2637() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new Class357(field3528, var0, 0, field4851.method2637(), false));
			Class332.method1940(var3, 0, 0, 0, 0, true);
			field737 = true;
		}

	}

	@ObfInfo(owner = "jv", name = "iw", desc = "(B)V", opaque = "0")
	public static void method4908() {
		if (field3112) {
			if (field1420 != null) {
				field1420.method8742();
			}

			for (int var1 = 0; var1 < field3857.field1288.field1392; ++var1) {
				Class83 var2 = field3857.field1293[field3857.field1288.field1393[var1]];
				var2.method2254();
			}

			field3112 = false;
		}

	}

	@ObfInfo(owner = "an", name = "is", desc = "(Lnb;III)V", opaque = "-1339869163")
	public static void method168(Class340 var0, int var1, int var2) {
		if (field736 == 0 || field736 == 3) {
			if (!field628 && (Class33.field237 == 1 || !field1468 && Class33.field237 == 4)) {
				Class361 var4 = var0.method6512(field25, true);
				if (var4 == null) {
					return;
				}

				int var5 = Class33.field238 - var1;
				int var6 = Class33.field239 - var2;
				if (var4.method7100(var5, var6)) {
					var5 -= var4.field3970 / 2;
					var6 -= var4.field3968 / 2;
					int var7 = field572 & 2047;
					int var8 = Class253.field2683[var7];
					int var9 = Class253.field2687[var7];
					int var10 = var8 * var6 + var9 * var5 >> 11;
					int var11 = var9 * var6 - var8 * var5 >> 11;
					int var12 = field894.method2199() + var10 >> 7;
					int var13 = field894.method2191() - var11 >> 7;
					Class316 var14 = Class316.method3908(Class315.field3279, field548.field1446);
					var14.field3374.method9388(18);
					var14.field3374.method9443(field3857.field1285 + var13);
					var14.field3374.method9476(var12 + field3857.field1289);
					var14.field3374.method9388(field721.method4342(82) ? (field721.method4342(81) ? 2 : 1) : 0);
					var14.field3374.method9388(var5);
					var14.field3374.method9388(var6);
					var14.field3374.method9389(field572);
					var14.field3374.method9388(57);
					var14.field3374.method9388(0);
					var14.field3374.method9388(0);
					var14.field3374.method9388(89);
					var14.field3374.method9389(field107.field1065);
					var14.field3374.method9389(field107.field1126);
					var14.field3374.method9388(63);
					field548.method2897(var14);
					field734 = var12;
					field594 = var13;
				}
			}

		}
	}

	@ObfInfo(owner = "dc", name = "im", desc = "(Ljava/lang/String;I)V", opaque = "310369199")
	public static void method2236(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			field4851.method2609(!field4851.method2701());
			if (field4851.method2701()) {
				Class128.method2747(99, "", "Roofs are now all hidden");
			} else {
				Class128.method2747(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var2 = Class412.method3402(var0.substring(5).trim()) == 1;
			field2077.method480(var2);
			Class253.method4801(var2);
		}

		if (var0.equalsIgnoreCase("z")) {
			field518 = !field518;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			field4851.method2616();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			field680 = !field680;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			field641 = !field641;
		}

		if (var0.startsWith("setdrawdistance")) {
			String[] var5 = var0.split(" ");

			try {
				int var3 = Integer.parseInt(var5[1]);
				field4851.method2638(var3);
			} catch (NumberFormatException var4) {
				Class128.method2747(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var5[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			Class128.method2747(99, "", String.format("%d", field4851.method2679()));
		}

		if (field626 >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				field104.field5075 = !field104.field5075;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				field4851.method2733(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				field4851.method2733(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				method6176();
			}
		}

		Class316 var6 = Class316.method3908(Class315.field3327, field548.field1446);
		var6.field3374.method9388(var0.length() + 1);
		var6.field3374.method9473(var0);
		field548.method2897(var6);
	}

	@ObfInfo(owner = "ap", name = "jx", desc = "(II)I", opaque = "-398680228")
	public static int method192(int var0) {
		return Math.abs(var0 - field2029) > 1024 ? (var0 < field2029 ? 1 : -1) * 2048 + var0 : var0;
	}

	@ObfInfo(owner = "du", name = "ji", desc = "(IIII)V", opaque = "-1327802497")
	public static void method2513(int var0, int var1, int var2) {
		if (field3960 < var0) {
			field3960 += (var0 - field3960) * field3830 / 1000 + field1526;
			if (field3960 > var0) {
				field3960 = var0;
			}
		}

		if (field3960 > var0) {
			field3960 -= field3830 * (field3960 - var0) / 1000 + field1526;
			if (field3960 < var0) {
				field3960 = var0;
			}
		}

		if (field1760 < var1) {
			field1760 += field1526 + field3830 * (var1 - field1760) / 1000;
			if (field1760 > var1) {
				field1760 = var1;
			}
		}

		if (field1760 > var1) {
			field1760 -= field1526 + field3830 * (field1760 - var1) / 1000;
			if (field1760 < var1) {
				field1760 = var1;
			}
		}

		if (field1538 < var2) {
			field1538 += field3830 * (var2 - field1538) / 1000 + field1526;
			if (field1538 > var2) {
				field1538 = var2;
			}
		}

		if (field1538 > var2) {
			field1538 -= (field1538 - var2) * field3830 / 1000 + field1526;
			if (field1538 < var2) {
				field1538 = var2;
			}
		}

	}

	@ObfInfo(owner = "pe", name = "jr", desc = "(S)V", opaque = "2801")
	public static void method7420() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		if (field577 == 0) {
			var1 = field894.method2199();
			var2 = field894.method2191();
			var3 = field894.method2193();
			if (field271 - var1 < -500 || field271 - var1 > 500 || field897 - var2 < -500 || field897 - var2 > 500) {
				field271 = var1;
				field897 = var2;
			}

			if (field271 != var1) {
				field271 += (var1 - field271) / 16;
			}

			if (field897 != var2) {
				field897 += (var2 - field897) / 16;
			}

			var4 = field271 >> 7;
			var5 = field897 >> 7;
			var6 = method790(field3857, field271, field897, var3);
			int var7 = 0;
			int var8;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
						int var10 = var3;
						if (var3 < 3 && (field3857.field1292[1][var8][var9] & 2) == 2) {
							var10 = var3 + 1;
						}

						int var11 = var6 - field3857.field1291[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}

			var8 = var7 * 192;
			if (var8 > 98048) {
				var8 = 98048;
			}

			if (var8 < 32768) {
				var8 = 32768;
			}

			if (var8 > field573) {
				field573 += (var8 - field573) / 24;
			} else if (var8 < field573) {
				field573 += (var8 - field573) / 80;
			}

			field2629 = method790(field3857, var1, var2, var3) - field522;
		} else if (field577 == 1) {
			Class22.method340();
			short var12 = -1;
			if (field721.method4342(33)) {
				var12 = 0;
			} else if (field721.method4342(49)) {
				var12 = 1024;
			}

			if (field721.method4342(48)) {
				if (var12 == 0) {
					var12 = 1792;
				} else if (var12 == 1024) {
					var12 = 1280;
				} else {
					var12 = 1536;
				}
			} else if (field721.method4342(50)) {
				if (var12 == 0) {
					var12 = 256;
				} else if (var12 == 1024) {
					var12 = 768;
				} else {
					var12 = 512;
				}
			}

			byte var13 = 0;
			if (field721.method4342(35)) {
				var13 = -1;
			} else if (field721.method4342(51)) {
				var13 = 1;
			}

			var3 = 0;
			if (var12 >= 0 || var13 != 0) {
				var3 = field721.method4342(81) ? field583 : field582;
				var3 *= 16;
				field580 = var12;
				field581 = var13;
			}

			if (field579 < var3) {
				field579 += var3 / 8;
				if (field579 > var3) {
					field579 = var3;
				}
			} else if (field579 > var3) {
				field579 = field579 * 9 / 10;
			}

			if (field579 > 0) {
				var4 = field579 / 16;
				if (field580 >= 0) {
					var1 = field580 - field2029 & 2047;
					var5 = Class253.field2683[var1];
					var6 = Class253.field2687[var1];
					field271 += var5 * var4 / 65536;
					field897 += var6 * var4 / 65536;
				}

				if (0 != field581) {
					field2629 += field581 * var4;
					if (field2629 > 0) {
						field2629 = 0;
					}
				}
			} else {
				field580 = -1;
				field581 = -1;
			}

			if (field721.method4342(13)) {
				method5162();
			}
		}

		if (Class33.field227 == 4 && field1468) {
			var1 = Class33.field220 - field576;
			field574 = var1 * 2;
			field576 = var1 != -1 && var1 != 1 ? (Class33.field220 + field576) / 2 : Class33.field220;
			var2 = field784 - Class33.field229;
			field623 = var2 * 2;
			field784 = var2 != -1 && var2 != 1 ? (Class33.field229 + field784) / 2 : Class33.field229;
		} else {
			if (field721.method4342(96)) {
				field623 += (-24 - field623) / 2;
			} else if (field721.method4342(97)) {
				field623 += (24 - field623) / 2;
			} else {
				field623 /= 2;
			}

			if (field721.method4342(98)) {
				field574 += (12 - field574) / 2;
			} else if (field721.method4342(99)) {
				field574 += (-12 - field574) / 2;
			} else {
				field574 /= 2;
			}

			field576 = Class33.field220;
			field784 = Class33.field229;
		}

		field572 = field623 / 2 + field572 & 2047;
		field571 += field574 / 2;
		if (field571 < 128) {
			field571 = 128;
		}

		if (field571 > 383) {
			field571 = 383;
		}

	}

	@ObfInfo(owner = "ce", name = "jq", desc = "(Ldt;Ldh;IB)V", opaque = "0")
	public static void method1081(Class98 var0, Class86 var1, int var2) {
		int var5;
		int var6;
		int var8;
		Class211 var12;
		if (var1.field1111 >= field778) {
			int var4 = Math.max(1, var1.field1111 - field778);
			var5 = var1.field1059 * 64 + var1.field1107 * 128;
			var6 = var1.field1059 * 64 + var1.field1109 * 128;
			var1.field1065 += (var5 - var1.field1065) / var4;
			var1.field1126 += (var6 - var1.field1126) / var4;
			var1.field1129 = 0;
			var1.field1133 = var1.field1113;
		} else if (var1.field1112 >= field778) {
			boolean var11 = field778 == var1.field1112 || -1 == var1.field1074 || var1.field1103 != 0;
			if (!var11) {
				var12 = Class211.method4637(var1.field1074);
				if (var12 != null && !var12.method4038()) {
					var11 = 1 + var1.field1102 > var12.field2139[var1.field1101];
				} else {
					var11 = true;
				}
			}

			if (var11) {
				var5 = var1.field1112 - var1.field1111;
				var6 = field778 - var1.field1111;
				int var7 = var1.field1107 * 128 + var1.field1059 * 64;
				var8 = var1.field1109 * 128 + var1.field1059 * 64;
				int var9 = var1.field1059 * 64 + var1.field1108 * 128;
				int var10 = var1.field1059 * 64 + var1.field1110 * 128;
				var1.field1065 = (var7 * (var5 - var6) + var9 * var6) / var5;
				var1.field1126 = (var10 * var6 + (var5 - var6) * var8) / var5;
			}

			var1.field1129 = 0;
			var1.field1133 = var1.field1113;
			var1.field1060 = var1.field1133;
		} else {
			method3707(var1);
		}

		if (var1.field1065 < 128 || var1.field1126 < 128 || var1.field1065 >= 13184 || var1.field1126 >= 13184) {
			var1.field1074 = -1;
			var1.field1111 = 0;
			var1.field1112 = 0;
			var1.method2314();
			var1.field1065 = var1.field1080[0] * 128 + var1.field1059 * 64;
			var1.field1126 = var1.field1127[0] * 128 + var1.field1059 * 64;
			var1.method2307();
		}

		if (field107 == var1 && (var1.field1065 < 1536 || var1.field1126 < 1536 || var1.field1065 >= 11776 || var1.field1126 >= 11776)) {
			var1.field1074 = -1;
			var1.field1111 = 0;
			var1.field1112 = 0;
			var1.method2314();
			var1.field1065 = var1.field1059 * 64 + var1.field1080[0] * 128;
			var1.field1126 = var1.field1059 * 64 + var1.field1127[0] * 128;
			var1.method2307();
		}

		Class358.method7092(var0, var1);
		var1.field1058 = false;
		if (var1.field1096 != -1) {
			Class211 var13 = Class211.method4637(var1.field1096);
			if (var13 != null) {
				if (!var13.method4038() && var13.field2142 != null) {
					++var1.field1098;
					if (var1.field1122 < var13.field2142.length && var1.field1098 > var13.field2139[var1.field1122]) {
						var1.field1098 = 1;
						++var1.field1122;
						method2455(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					}

					if (var1.field1122 >= var13.field2142.length) {
						if (var13.field2143 > 0) {
							var1.field1122 -= var13.field2143;
							if (var13.field2149) {
								++var1.field1099;
							}

							if (var1.field1122 < 0 || var1.field1122 >= var13.field2142.length || var13.field2149 && var1.field1099 >= var13.field2145) {
								var1.field1098 = 0;
								var1.field1122 = 0;
								var1.field1099 = 0;
							}
						} else {
							var1.field1098 = 0;
							var1.field1122 = 0;
						}

						method2455(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					}
				} else if (var13.method4038()) {
					++var1.field1122;
					var5 = var13.method4005();
					if (var1.field1122 < var5) {
						Class40.method794(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					} else {
						if (var13.field2143 > 0) {
							var1.field1122 -= var13.field2143;
							if (var13.field2149) {
								++var1.field1099;
							}

							if (var1.field1122 < 0 || var1.field1122 >= var5 || var13.field2149 && var1.field1099 >= var13.field2145) {
								var1.field1122 = 0;
								var1.field1098 = 0;
								var1.field1099 = 0;
							}
						} else {
							var1.field1098 = 0;
							var1.field1122 = 0;
						}

						Class40.method794(var13, var1.field1122, var1.field1065, var1.field1126, var1);
					}
				} else {
					var1.field1096 = -1;
				}
			} else {
				var1.field1096 = -1;
			}
		}

		Class495 var14 = new Class495(var1.method2313());

		for (Class485 var15 = (Class485)var14.method8982(); var15 != null; var15 = (Class485)var14.next()) {
			if (var15.field4964 != -1 && field778 >= var15.field4966) {
				var6 = Class224.method4163(var15.field4964).field2301;
				if (var6 == -1) {
					var15.method9277();
					--var1.field1106;
				} else {
					var15.field4965 = Math.max(var15.field4965, 0);
					Class211 var16 = Class211.method4637(var6);
					if (var16.field2142 != null && !var16.method4038()) {
						++var15.field4963;
						if (var15.field4965 < var16.field2142.length && var15.field4963 > var16.field2139[var15.field4965]) {
							var15.field4963 = 1;
							++var15.field4965;
							method2455(var16, var15.field4965, var1.field1065, var1.field1126, var1);
						}

						if (var15.field4965 >= var16.field2142.length) {
							var15.method9277();
							--var1.field1106;
						}
					} else if (var16.method4038()) {
						++var15.field4965;
						var8 = var16.method4005();
						if (var15.field4965 < var8) {
							Class40.method794(var16, var15.field4965, var1.field1065, var1.field1126, var1);
						} else {
							var15.method9277();
							--var1.field1106;
						}
					} else {
						var15.method9277();
						--var1.field1106;
					}
				}
			}
		}

		if (-1 != var1.field1074 && var1.field1103 <= 1) {
			var12 = Class211.method4637(var1.field1074);
			if (var12.field2150 == 1 && var1.field1077 > 0 && var1.field1111 <= field778 && var1.field1112 < field778) {
				var1.field1103 = 1;
				return;
			}
		}

		if (var1.field1074 != -1 && var1.field1103 == 0) {
			var12 = Class211.method4637(var1.field1074);
			if (var12 == null) {
				var1.field1074 = -1;
			} else if (!var12.method4038() && var12.field2142 != null) {
				++var1.field1102;
				if (var1.field1101 < var12.field2142.length && var1.field1102 > var12.field2139[var1.field1101]) {
					var1.field1102 = 1;
					++var1.field1101;
					method2455(var12, var1.field1101, var1.field1065, var1.field1126, var1);
				}

				if (var1.field1101 >= var12.field2142.length) {
					var1.field1101 -= var12.field2143;
					++var1.field1090;
					if (var1.field1090 >= var12.field2145) {
						var1.field1074 = -1;
					} else if (var1.field1101 >= 0 && var1.field1101 < var12.field2142.length) {
						method2455(var12, var1.field1101, var1.field1065, var1.field1126, var1);
					} else {
						var1.field1074 = -1;
					}
				}

				var1.field1058 = var12.field2144;
			} else if (var12.method4038()) {
				++var1.field1101;
				var6 = var12.method4005();
				if (var1.field1101 < var6) {
					Class40.method794(var12, var1.field1101, var1.field1065, var1.field1126, var1);
				} else {
					var1.field1101 -= var12.field2143;
					++var1.field1090;
					if (var1.field1090 >= var12.field2145) {
						var1.field1074 = -1;
					} else if (var1.field1101 >= 0 && var1.field1101 < var6) {
						Class40.method794(var12, var1.field1101, var1.field1065, var1.field1126, var1);
					} else {
						var1.field1074 = -1;
					}
				}
			} else {
				var1.field1074 = -1;
			}
		}

		if (var1.field1103 > 0) {
			--var1.field1103;
		}

	}

	@ObfInfo(owner = "hg", name = "jh", desc = "(Ldh;I)V", opaque = "-1194566834")
	public static void method3707(Class86 var0) {
		var0.field1096 = var0.field1061;
		if (var0.field1125 == 0) {
			var0.field1129 = 0;
		} else {
			if (var0.field1074 != -1 && var0.field1103 == 0) {
				Class211 var2 = Class211.method4637(var0.field1074);
				if (var0.field1077 > 0 && 0 == var2.field2150) {
					++var0.field1129;
					return;
				}

				if (var0.field1077 <= 0 && var2.field2141 == 0) {
					++var0.field1129;
					return;
				}
			}

			int var11 = var0.field1065;
			int var3 = var0.field1126;
			int var4 = var0.field1059 * 64 + var0.field1080[var0.field1125 - 1] * 128;
			int var5 = var0.field1059 * 64 + var0.field1127[var0.field1125 - 1] * 128;
			if (var11 < var4) {
				if (var3 < var5) {
					var0.field1133 = 1280;
				} else if (var3 > var5) {
					var0.field1133 = 1792;
				} else {
					var0.field1133 = 1536;
				}
			} else if (var11 > var4) {
				if (var3 < var5) {
					var0.field1133 = 768;
				} else if (var3 > var5) {
					var0.field1133 = 256;
				} else {
					var0.field1133 = 512;
				}
			} else if (var3 < var5) {
				var0.field1133 = 1024;
			} else if (var3 > var5) {
				var0.field1133 = 0;
			}

			Class256 var6 = var0.field1128[var0.field1125 - 1];
			if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
				int var7 = var0.field1133 - var0.field1060 & 2047;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = var0.field1073;
				if (var7 >= -256 && var7 <= 256) {
					var8 = var0.field1064;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = var0.field1067;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = var0.field1056;
				}

				if (var8 == -1) {
					var8 = var0.field1064;
				}

				var0.field1096 = var8;
				int var9 = 4;
				boolean var10 = true;
				if (var0 instanceof Class100) {
					var10 = ((Class100)var0).field1314.field2355;
				}

				if (var10) {
					if (var0.field1060 != var0.field1133 && -1 == var0.field1070 && var0.field1089 != 0) {
						var9 = 2;
					}

					if (var0.field1125 > 2) {
						var9 = 6;
					}

					if (var0.field1125 > 3) {
						var9 = 8;
					}

					if (var0.field1129 > 0 && var0.field1125 > 1) {
						var9 = 8;
						--var0.field1129;
					}
				} else {
					if (var0.field1125 > 1) {
						var9 = 6;
					}

					if (var0.field1125 > 2) {
						var9 = 8;
					}

					if (var0.field1129 > 0 && var0.field1125 > 1) {
						var9 = 8;
						--var0.field1129;
					}
				}

				if (Class256.field2704 == var6) {
					var9 <<= 1;
				} else if (Class256.field2699 == var6) {
					var9 >>= 1;
				}

				if (var9 >= 8) {
					if (var0.field1064 == var0.field1096 && var0.field1068 != -1) {
						var0.field1096 = var0.field1068;
					} else if (var0.field1073 == var0.field1096 && -1 != var0.field1066) {
						var0.field1096 = var0.field1066;
					} else if (var0.field1096 == var0.field1056 && var0.field1076 != -1) {
						var0.field1096 = var0.field1076;
					} else if (var0.field1067 == var0.field1096 && -1 != var0.field1071) {
						var0.field1096 = var0.field1071;
					}
				} else if (var9 <= 2) {
					if (var0.field1064 == var0.field1096 && -1 != var0.field1124) {
						var0.field1096 = var0.field1124;
					} else if (var0.field1096 == var0.field1073 && -1 != var0.field1057) {
						var0.field1096 = var0.field1057;
					} else if (var0.field1056 == var0.field1096 && var0.field1132 != -1) {
						var0.field1096 = var0.field1132;
					} else if (var0.field1067 == var0.field1096 && -1 != var0.field1079) {
						var0.field1096 = var0.field1079;
					}
				}

				if (var4 != var11 || var5 != var3) {
					if (var11 < var4) {
						var0.field1065 += var9;
						if (var0.field1065 > var4) {
							var0.field1065 = var4;
						}
					} else if (var11 > var4) {
						var0.field1065 -= var9;
						if (var0.field1065 < var4) {
							var0.field1065 = var4;
						}
					}

					if (var3 < var5) {
						var0.field1126 += var9;
						if (var0.field1126 > var5) {
							var0.field1126 = var5;
						}
					} else if (var3 > var5) {
						var0.field1126 -= var9;
						if (var0.field1126 < var5) {
							var0.field1126 = var5;
						}
					}
				}

				if (var4 == var0.field1065 && var5 == var0.field1126) {
					--var0.field1125;
					if (var0.field1077 > 0) {
						--var0.field1077;
					}
				}

			} else {
				var0.field1065 = var4;
				var0.field1126 = var5;
				--var0.field1125;
				if (var0.field1077 > 0) {
					--var0.field1077;
				}

			}
		}
	}

	@ObfInfo(owner = "gs", name = "jm", desc = "(Lde;III)V", opaque = "1919227015")
	public static void method3578(Class83 var0, int var1, int var2) {
		if (var1 == var0.field1074 && var1 != -1) {
			int var4 = Class211.method4637(var1).field2152;
			if (var4 == 1) {
				var0.field1101 = 0;
				var0.field1102 = 0;
				var0.field1103 = var2;
				var0.field1090 = 0;
			}

			if (var4 == 2) {
				var0.field1090 = 0;
			}
		} else if (var1 == -1 || var0.field1074 == -1 || Class211.method4637(var1).field2128 >= Class211.method4637(var0.field1074).field2128) {
			var0.field1074 = var1;
			var0.field1101 = 0;
			var0.field1102 = 0;
			var0.field1103 = var2;
			var0.field1090 = 0;
			var0.field1077 = var0.field1125;
		}

	}

	@ObfInfo(owner = "uc", name = "jw", desc = "(I)I", opaque = "1649543160")
	public static int method9643() {
		return field712 ? 2 : 1;
	}

	@ObfInfo(owner = "fs", name = "jd", desc = "(IB)V", opaque = "0")
	public static void method3259(int var0) {
		field536 = 0L;
		if (var0 >= 2) {
			field712 = true;
		} else {
			field712 = false;
		}

		if (method9643() == 1) {
			field2077.method465(765, 503);
		} else {
			field2077.method465(7680, 2160);
		}

		if (field555 >= 25 && field548 != null && field548.field1446 != null) {
			Class316 var2 = Class316.method3908(Class315.field3365, field548.field1446);
			var2.field3374.method9388(method9643());
			var2.field3374.method9389(field182);
			var2.field3374.method9389(field5261);
			field548.method2897(var2);
		}

	}

	@ObfInfo(owner = "rw", name = "jg", desc = "(Ljava/lang/String;ZS)V", opaque = "3052")
	public static void method8554(String var0, boolean var1) {
		if (field621) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = var3 + 6;
			int var6 = field3127.method8073(var0, 250);
			int var7 = field3127.method7991(var0, 250) * 13;
			Class561.method10152(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 0);
			Class561.method10156(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
			field3127.method8011(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			method8613(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3);
			if (var1) {
				field3241.method877(0, 0);
			} else {
				for (int var12 = 0; var12 < field701; ++var12) {
					if (field708[var12] + field722[var12] > var4 && field722[var12] < var6 + var4 && field707[var12] + field757[var12] > var5 && field707[var12] < var7 + var5) {
						field704[var12] = true;
					}
				}
			}

		}
	}

	@ObfInfo(owner = "jc", name = "je", desc = "(IIIII)V", opaque = "1134802599")
	public static void method4636(int var0, int var1, int var2, int var3) {
		++field600;
		field3857.field1283.field2730 = field778;
		if (field734 == field107.field1065 >> 7 && field594 == field107.field1126 >> 7) {
			field734 = 0;
		}

		method2089(field3857);
		method3994(field3857);
		method32(field3857, true);
		Class98 var5 = field3857;
		int var6 = var5.field1288.field1392;
		int[] var7 = var5.field1288.field1393;

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			if (field622 != var7[var8] && var7[var8] != field646) {
				method7830(var5, var7[var8], true);
			}
		}

		method32(field3857, false);
		Class98 var41 = field3857;

		int var10;
		int var12;
		int var42;
		for (var42 = 0; var42 < var41.field1286; ++var42) {
			Class488 var43 = var41.field1299[var41.field1302[var42]];
			if (var43 != null) {
				var43.field4994 = method790(var41, var43.field4991, var43.field4993, var41.field1300);
				var43.field4995.field1283.field2730 = field778;
				var43.method8911();
				var41.field1283.method5129(var41.field1300, var43.field4991, var43.field4993, var43.field4994, 60, var43.field4995.field1283, var43.field4987, 0L, false);
				method2089(var43.field4995);
				method3994(var43.field4995);
				method32(var43.field4995, true);
				Class98 var9 = var43.field4995;
				var10 = var9.field1288.field1392;
				int[] var11 = var9.field1288.field1393;

				for (var12 = 0; var12 < var10; ++var12) {
					if (var11[var12] != field622 && var11[var12] != field646) {
						method7830(var9, var11[var12], true);
					}
				}

				method32(var43.field4995, false);
				method3574(var43.field4995);
				method4910(var43.field4995);
			}
		}

		method3574(field3857);
		method4910(field3857);
		method6444(var0, var1, var2, var3, true);
		var0 = field766;
		var1 = field764;
		var2 = field768;
		var3 = field769;
		Class561.method10144(var0, var1, var2 + var0, var3 + var1);
		Class253.method4851();
		Class561.method10165();
		var42 = field571;
		if (field573 / 256 > var42) {
			var42 = field573 / 256;
		}

		if (field556[4] && 128 + field672[4] > var42) {
			var42 = 128 + field672[4];
		}

		var8 = field572 & 2047;
		int var44 = field271;
		var10 = field2629;
		int var45 = field897;
		var12 = var42 * 3 + 600;
		int var15 = var3 - 334;
		if (var15 < 0) {
			var15 = 0;
		} else if (var15 > 100) {
			var15 = 100;
		}

		int var16 = field760 + (field508 - field760) * var15 / 100;
		int var14 = var16 * var12 / 256;
		var15 = 2048 - var42 & 2047;
		var16 = 2048 - var8 & 2047;
		int var17 = 0;
		int var18 = 0;
		int var19 = var14;
		int var20;
		int var21;
		int var22;
		if (var15 != 0) {
			var20 = Class253.field2683[var15];
			var21 = Class253.field2687[var15];
			var22 = var21 * var18 - var20 * var14 >> 16;
			var19 = var21 * var14 + var20 * var18 >> 16;
			var18 = var22;
		}

		if (var16 != 0) {
			var20 = Class253.field2683[var16];
			var21 = Class253.field2687[var16];
			var22 = var21 * var17 + var20 * var19 >> 16;
			var19 = var21 * var19 - var20 * var17 >> 16;
			var17 = var22;
		}

		if (field496) {
			field3961 = var44 - var17;
			field110 = var10 - var18;
			field283 = var45 - var19;
			field148 = var42;
			field2816 = var8;
		} else {
			field3960 = var44 - var17;
			field1760 = var10 - var18;
			field1538 = var45 - var19;
			field1105 = var42;
			field2029 = var8;
		}

		if (field577 == 1 && field626 >= 2 && field778 % 50 == 0 && (field107.field1065 >> 7 != field271 >> 7 || field107.field1126 >> 7 != field897 >> 7)) {
			var20 = field107.field1023;
			var21 = field3857.field1289 + (field271 >> 7);
			var22 = field3857.field1285 + (field897 >> 7);
			Class316 var23 = Class316.method3908(Class315.field3333, field548.field1446);
			var23.field3374.method9496(var20);
			var23.field3374.method9443(var22);
			var23.field3374.method9459(field763);
			var23.field3374.method9389(var21);
			field548.method2897(var23);
		}

		int var25;
		int var26;
		int var46;
		if (!field496) {
			if (field4851.method2701()) {
				var15 = field3857.field1300;
			} else {
				label610: {
					var16 = 3;
					var17 = field894.method2199() >> 7;
					var18 = field894.method2191() >> 7;
					if (field1105 < 310) {
						if (field577 == 1) {
							var19 = field271 >> 7;
							var20 = field897 >> 7;
						} else {
							var19 = var17;
							var20 = var18;
						}

						var21 = field3960 >> 7;
						var22 = field1538 >> 7;
						if (var21 < 0 || var22 < 0 || var21 >= 104 || var22 >= 104) {
							var15 = field3857.field1300;
							break label610;
						}

						if (var19 < 0 || var20 < 0 || var19 >= 104 || var20 >= 104) {
							var15 = field3857.field1300;
							break label610;
						}

						if ((field3857.field1292[field3857.field1300][var21][var22] & 4) != 0) {
							var16 = field3857.field1300;
						}

						if (var19 > var21) {
							var46 = var19 - var21;
						} else {
							var46 = var21 - var19;
						}

						int var24;
						if (var20 > var22) {
							var24 = var20 - var22;
						} else {
							var24 = var22 - var20;
						}

						if (var46 > var24) {
							var25 = var24 * 65536 / var46;
							var26 = 32768;

							while (var21 != var19) {
								if (var21 < var19) {
									++var21;
								} else if (var21 > var19) {
									--var21;
								}

								if ((field3857.field1292[field3857.field1300][var21][var22] & 4) != 0) {
									var16 = field3857.field1300;
								}

								var26 += var25;
								if (var26 >= 65536) {
									var26 -= 65536;
									if (var22 < var20) {
										++var22;
									} else if (var22 > var20) {
										--var22;
									}

									if ((field3857.field1292[field3857.field1300][var21][var22] & 4) != 0) {
										var16 = field3857.field1300;
									}
								}
							}
						} else if (var24 > 0) {
							var25 = var46 * 65536 / var24;
							var26 = 32768;

							while (var22 != var20) {
								if (var22 < var20) {
									++var22;
								} else if (var22 > var20) {
									--var22;
								}

								if ((field3857.field1292[field3857.field1300][var21][var22] & 4) != 0) {
									var16 = field3857.field1300;
								}

								var26 += var25;
								if (var26 >= 65536) {
									var26 -= 65536;
									if (var21 < var19) {
										++var21;
									} else if (var21 > var19) {
										--var21;
									}

									if (0 != (field3857.field1292[field3857.field1300][var21][var22] & 4)) {
										var16 = field3857.field1300;
									}
								}
							}
						}
					}

					if (var17 >= 0 && var18 >= 0 && var17 < 13312 && var18 < 13312) {
						if (0 != (field3857.field1292[field3857.field1300][var17][var18] & 4)) {
							var16 = field3857.field1300;
						}

						var15 = var16;
					} else {
						var15 = field3857.field1300;
					}
				}
			}

			var14 = var15;
		} else {
			var14 = method8098();
		}

		var15 = field3960;
		var16 = field1760;
		var17 = field1538;
		var18 = field1105;
		var19 = field2029;

		for (var20 = 0; var20 < 5; ++var20) {
			if (field556[var20]) {
				var21 = (int)(Math.random() * (double)(field754[var20] * 2 + 1) - (double)field754[var20] + Math.sin((double)field667[var20] * ((double)field756[var20] / 100.0D)) * (double)field672[var20]);
				if (var20 == 0) {
					field3960 += var21;
				}

				if (var20 == 1) {
					field1760 += var21;
				}

				if (var20 == 2) {
					field1538 += var21;
				}

				if (var20 == 3) {
					field2029 = field2029 + var21 & 2047;
				}

				if (var20 == 4) {
					field1105 += var21;
					if (field1105 < 128) {
						field1105 = 128;
					}

					if (field1105 > 383) {
						field1105 = 383;
					}
				}
			}
		}

		var20 = Class33.field229;
		var21 = Class33.field220;
		if (0 != Class33.field237) {
			var20 = Class33.field238;
			var21 = Class33.field239;
		}

		if (var20 >= var0 && var20 < var2 + var0 && var21 >= var1 && var21 < var3 + var1) {
			Class274.method5477(var20 - var0, var21 - var1);
		} else {
			Class274.method3295();
		}

		method4066();
		Class561.method10152(var0, var1, var2, var3, 0);
		method4066();
		var22 = Class253.method4792();
		Class253.method4801(field2077.field196);
		Class253.field2688.field3042 = field770;
		field3857.field1283.method4984(field3960, field1760, field1538, field1105, field2029, var14);
		Class253.method4801(false);
		if (field518) {
			Class561.method10166();
		}

		Class253.field2688.field3042 = var22;
		method4066();
		field3857.field1283.method4939();

		for (var46 = 0; var46 < field3857.field1286; ++var46) {
			Class488 var48 = field3857.field1299[field3857.field1302[var46]];
			if (var48 != null) {
				var48.field4995.field1283.method4939();
			}
		}

		Class98 var47 = field3857;
		field589 = 0;
		boolean var49 = false;
		var25 = -1;
		var26 = -1;
		int var27 = var47.field1288.field1392;
		int[] var28 = var47.field1288.field1393;

		int var29;
		for (var29 = 0; var29 < var27 + var47.field1296; ++var29) {
			Object var30;
			if (var29 < var27) {
				var30 = var47.field1293[var28[var29]];
				if (field622 == var28[var29]) {
					var49 = true;
					var25 = var29;
					continue;
				}

				if (field107 == var30) {
					var26 = var29;
					continue;
				}
			} else {
				var30 = var47.field1295[var47.field1297[var29 - var27]];
			}

			Class29.method397(var47, (Class86)var30, var29, var0, var1, var2, var3);
		}

		if (field680 && var26 != -1) {
			Class29.method397(var47, field107, var26, var0, var1, var2, var3);
		}

		if (var49) {
			Class29.method397(var47, var47.field1293[field622], var25, var0, var1, var2, var3);
		}

		for (var29 = 0; var29 < field589; ++var29) {
			int var50 = field591[var29];
			int var31 = field592[var29];
			int var32 = field520[var29];
			int var33 = field593[var29];
			boolean var34 = true;

			while (var34) {
				var34 = false;

				for (int var35 = 0; var35 < var29; ++var35) {
					if (var31 + 2 > field592[var35] - field593[var35] && var31 - var33 < 2 + field592[var35] && var50 - var32 < field520[var35] + field591[var35] && var32 + var50 > field591[var35] - field520[var35] && field592[var35] - field593[var35] < var31) {
						var31 = field592[var35] - field593[var35];
						var34 = true;
					}
				}
			}

			field601 = field591[var29];
			field486 = field592[var29] = var31;
			String var51 = field652[var29];
			if (0 == field488) {
				int var36 = 16776960;
				if (field606[var29] < 6) {
					var36 = field783[field606[var29]];
				}

				if (field606[var29] == 6) {
					var36 = field600 % 20 < 10 ? 16711680 : 16776960;
				}

				if (field606[var29] == 7) {
					var36 = field600 % 20 < 10 ? 255 : '\uffff';
				}

				if (field606[var29] == 8) {
					var36 = field600 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var37;
				if (9 == field606[var29]) {
					var37 = 150 - field598[var29];
					if (var37 < 50) {
						var36 = var37 * 1280 + 16711680;
					} else if (var37 < 100) {
						var36 = 16776960 - 327680 * (var37 - 50);
					} else if (var37 < 150) {
						var36 = 5 * (var37 - 100) + 65280;
					}
				}

				if (10 == field606[var29]) {
					var37 = 150 - field598[var29];
					if (var37 < 50) {
						var36 = 16711680 + var37 * 5;
					} else if (var37 < 100) {
						var36 = 16711935 - (var37 - 50) * 327680;
					} else if (var37 < 150) {
						var36 = 255 + (var37 - 100) * 327680 - (var37 - 100) * 5;
					}
				}

				if (11 == field606[var29]) {
					var37 = 150 - field598[var29];
					if (var37 < 50) {
						var36 = 16777215 - var37 * 327685;
					} else if (var37 < 100) {
						var36 = 65280 + 327685 * (var37 - 50);
					} else if (var37 < 150) {
						var36 = 16777215 - 327680 * (var37 - 100);
					}
				}

				int var38;
				if (field606[var29] == 12 && null == field745[var29]) {
					var37 = var51.length();
					field745[var29] = new int[var37];

					for (var38 = 0; var38 < var37; ++var38) {
						int var39 = (int)((float)var38 / (float)var37 * 64.0F);
						int var40 = var39 << 10 | 896 | 64;
						field745[var29][var38] = field5165[var40];
					}
				}

				if (field700[var29] == 0) {
					field3003.method8003(var51, var0 + field601, var1 + field486, var36, 0, field745[var29]);
				}

				if (1 == field700[var29]) {
					field3003.method8060(var51, var0 + field601, var1 + field486, var36, 0, field600, field745[var29]);
				}

				if (2 == field700[var29]) {
					field3003.method8042(var51, var0 + field601, field486 + var1, var36, 0, field600, field745[var29]);
				}

				if (field700[var29] == 3) {
					field3003.method8002(var51, var0 + field601, field486 + var1, var36, 0, field600, 150 - field598[var29], field745[var29]);
				}

				if (field700[var29] == 4) {
					var37 = (150 - field598[var29]) * (field3003.method8080(var51) + 100) / 150;
					Class561.method10153(field601 + var0 - 50, var1, field601 + var0 + 50, var3 + var1);
					field3003.method8004(var51, 50 + var0 + field601 - var37, field486 + var1, var36, 0, field745[var29]);
					Class561.method10144(var0, var1, var2 + var0, var3 + var1);
				}

				if (field700[var29] == 5) {
					var37 = 150 - field598[var29];
					var38 = 0;
					if (var37 < 25) {
						var38 = var37 - 25;
					} else if (var37 > 125) {
						var38 = var37 - 125;
					}

					Class561.method10153(var0, field486 + var1 - field3003.field4730 - 1, var2 + var0, 5 + field486 + var1);
					field3003.method8003(var51, field601 + var0, var38 + var1 + field486, var36, 0, field745[var29]);
					Class561.method10144(var0, var1, var2 + var0, var3 + var1);
				}
			} else {
				field3003.method7996(var51, var0 + field601, field486 + var1, 16776960, 0);
			}
		}

		method6257(field3857, var0, var1);
		((Class244)Class253.field2688.field3043).method4734(field564);
		method7207();
		field3960 = var15;
		field1760 = var16;
		field1538 = var17;
		field1105 = var18;
		field2029 = var19;
		if (field499 && field69.method7161(true, false) == 0) {
			field499 = false;
		}

		if (field499) {
			Class561.method10152(var0, var1, var2, var3, 0);
			method8554(Class378.field4155, false);
		}

	}

	@ObfInfo(owner = "mw", name = "ja", desc = "(IIIIZI)V", opaque = "-936154492")
	public static void method6444(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = field758;
		} else if (var6 >= 100) {
			var7 = field759;
		} else {
			var7 = field758 + (field759 - field758) * var6 / 100;
		}

		int var8 = var7 * var3 * 512 / (var2 * 334);
		int var9;
		int var10;
		short var11;
		if (var8 < field653) {
			var11 = field653;
			var7 = var11 * var2 * 334 / (var3 * 512);
			if (var7 > field718) {
				var7 = field718;
				var9 = 512 * var7 * var3 / (var11 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					Class561.method10143();
					Class561.method10152(var0, var1, var10, var3, -16777216);
					Class561.method10152(var2 + var0 - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > field765) {
			var11 = field765;
			var7 = 334 * var11 * var2 / (var3 * 512);
			if (var7 < field762) {
				var7 = field762;
				var9 = 334 * var11 * var2 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					Class561.method10143();
					Class561.method10152(var0, var1, var2, var10, -16777216);
					Class561.method10152(var0, var3 + var1 - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		field770 = var7 * var3 / 334;
		if (field768 != var2 || field769 != var3) {
			method1101(var2, var3);
		}

		field766 = var0;
		field764 = var1;
		field768 = var2;
		field769 = var3;
	}

	@ObfInfo(owner = "cv", name = "jn", desc = "(Ldt;I)V", opaque = "-1284123860")
	public static void method2089(Class98 var0) {
		if (field680) {
			method7830(var0, field646, false);
		}

	}

	@ObfInfo(owner = "ib", name = "jy", desc = "(Ldt;I)V")
	public static void method3994(Class98 var0) {
		if (field622 >= 0 && null != var0.field1293[field622]) {
			method7830(var0, field622, false);
		}

	}

	@ObfInfo(owner = "qg", name = "jk", desc = "(Ldt;IZI)V", opaque = "1430833460")
	public static void method7830(Class98 var0, int var1, boolean var2) {
		Class83 var4 = var0.field1293[var1];
		if (var4 != null && var4.method2264() && !var4.field1015) {
			var4.field1026 = false;
			if ((field599 && var0.field1288.field1392 > 50 || var0.field1288.field1392 > 200) && var2 && var4.field1096 == var4.field1061) {
				var4.field1026 = true;
			}

			int var5 = var4.field1065 >> 7;
			int var6 = var4.field1126 >> 7;
			if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
				long var7 = Class274.method3872(0, 0, 0, false, var4.field1030, var0.field1287);
				if (var4.field1031 != null && field778 >= var4.field1016 && field778 < var4.field1017) {
					var4.field1026 = false;
					var4.field1021 = method790(var0, var4.field1065, var4.field1126, var0.field1300);
					var4.field1115 = field778;
					var0.field1283.method4937(var0.field1300, var4.field1065, var4.field1126, var4.field1021, 60, var4, var4.field1060, var7, var4.field1022, var4.field1028, var4.field1024, var4.field1013);
				} else {
					if ((var4.field1065 & 127) == 64 && 64 == (var4.field1126 & 127)) {
						if (field600 == var0.field1290[var5][var6]) {
							return;
						}

						var0.field1290[var5][var6] = field600;
					}

					var4.field1021 = method790(var0, var4.field1065, var4.field1126, var0.field1300);
					var4.field1115 = field778;
					var0.field1283.method5129(var0.field1300, var4.field1065, var4.field1126, var4.field1021, 60, var4, var4.field1060, var7, var4.field1058);
				}
			}
		}

	}

	@ObfInfo(owner = "ab", name = "jo", desc = "(Ldt;ZB)V", opaque = "-1")
	public static void method32(Class98 var0, boolean var1) {
		for (int var3 = 0; var3 < var0.field1296; ++var3) {
			Class100 var4 = var0.field1295[var0.field1297[var3]];
			if (var4 != null && var4.method2264() && var4.field1314.field2349 == var1 && var4.field1314.method4251()) {
				int var5 = var4.field1065 >> 7;
				int var6 = var4.field1126 >> 7;
				if (var5 >= 0 && var5 < var0.field1298 && var6 >= 0 && var6 < var0.field1282) {
					if (1 == var4.field1059 && (var4.field1065 & 127) == 64 && 64 == (var4.field1126 & 127)) {
						if (field600 == var0.field1290[var5][var6]) {
							continue;
						}

						var0.field1290[var5][var6] = field600;
					}

					long var7 = Class274.method3872(0, 0, 1, !var4.field1314.field2354, var0.field1297[var3], var0.field1287);
					var4.field1115 = field778;
					var0.field1283.method5129(var0.field1300, var4.field1065, var4.field1126, method790(var0, var4.field1065 + (var4.field1059 * 64 - 64), var4.field1059 * 64 - 64 + var4.field1126, var0.field1300), 60 + (var4.field1059 * 64 - 64), var4, var4.field1060, var7, var4.field1058);
				}
			}
		}

	}

	@ObfInfo(owner = "gr", name = "ju", desc = "(Ldt;I)V", opaque = "-1250339843")
	public static void method3574(Class98 var0) {
		for (Class88 var2 = (Class88)var0.field1303.method7482(); var2 != null; var2 = (Class88)var0.field1303.method7490()) {
			if (var0.field1300 == var2.field1183 && field778 <= var2.field1165) {
				if (field778 >= var2.field1156) {
					Class100 var3;
					int var4;
					Class83 var5;
					if (!var2.field1170 && var2.field1182 != 0) {
						if (var2.field1182 > 0) {
							var3 = field4582.field1295[var2.field1182 - 1];
							if (var3 != null && var3.field1065 >= 0 && var3.field1065 < 13312 && var3.field1126 >= 0 && var3.field1126 < 13312) {
								var2.field1157 = var3.field1065;
								var2.field1180 = var3.field1126;
								var2.method2387(var2.field1161, var2.field1162, var2.field1158, field778);
							}
						} else {
							var4 = -var2.field1182 - 1;
							if (var4 == field646) {
								var5 = field107;
							} else {
								var5 = field4582.field1293[var4];
							}

							if (var5 != null && var5.field1065 >= 0 && var5.field1065 < 13312 && var5.field1126 >= 0 && var5.field1126 < 13312) {
								var2.field1157 = var5.field1065;
								var2.field1180 = var5.field1126;
								var2.method2387(var2.field1161, var2.field1162, var2.field1158, field778);
							}
						}
					}

					if (var2.field1169 > 0) {
						var3 = var0.field1295[var2.field1169 - 1];
						if (var3 != null && var3.field1065 >= 0 && var3.field1065 < 13312 && var3.field1126 >= 0 && var3.field1126 < 13312) {
							var2.method2387(var3.field1065, var3.field1126, method790(var0, var3.field1065, var3.field1126, var2.field1183) - var2.field1181, field778);
						}
					}

					if (var2.field1169 < 0) {
						var4 = -var2.field1169 - 1;
						if (var4 == field646) {
							var5 = field107;
						} else {
							var5 = var0.field1293[var4];
						}

						if (var5 != null && var5.field1065 >= 0 && var5.field1065 < 13312 && var5.field1126 >= 0 && var5.field1126 < 13312) {
							var2.method2387(var5.field1065, var5.field1126, method790(var0, var5.field1065, var5.field1126, var2.field1183) - var2.field1181, field778);
						}
					}

					var2.method2393(field564);
					var0.field1283.method5129(var0.field1300, (int)var2.field1171, (int)var2.field1172, (int)var2.field1173, 60, var2, var2.field1164, -1L, false);
				}
			} else {
				var2.method9277();
			}
		}

	}

	@ObfInfo(owner = "jv", name = "jc", desc = "(Ldt;B)V", opaque = "29")
	public static void method4910(Class98 var0) {
		for (Class59 var2 = (Class59)var0.field1304.method7482(); var2 != null; var2 = (Class59)var0.field1304.method7490()) {
			if (var2.field436 == var0.field1300 && !var2.field443) {
				if (field778 >= var2.field435) {
					var2.method1091(field564);
					if (var2.field443) {
						var2.method9277();
					} else {
						var0.field1283.method5129(var2.field436, var2.field437, var2.field441, var2.field439, 60, var2, 0, -1L, false);
					}
				}
			} else {
				var2.method9277();
			}
		}

	}

	@ObfInfo(owner = "qu", name = "jl", desc = "(B)I")
	public static int method8098() {
		if (field4851.method2701()) {
			return field3857.field1300;
		} else {
			int var1 = method790(field3857, field3960, field1538, field3857.field1300);
			return var1 - field1760 < 800 && 0 != (field3857.field1292[field3857.field1300][field3960 >> 7][field1538 >> 7] & 4) ? field3857.field1300 : 3;
		}
	}

	@ObfInfo(owner = "mn", name = "jf", desc = "(Ldt;III)V", opaque = "-1485751769")
	public static void method6257(Class98 var0, int var1, int var2) {
		if (2 == field742) {
			method1110(var0, (field727 - var0.field1289 << 7) + field514, field492 + (field512 - var0.field1285 << 7), field513 * 2);
			if (field601 > -1 && field778 % 20 < 10) {
				field4039[0].method10023(var1 + field601 - 12, field486 + var2 - 28);
			}

		}
	}

	@ObfInfo(owner = "bc", name = "jj", desc = "(B)Lpk;")
	public static Class401 method398() {
		return field696;
	}

	@ObfInfo(owner = "ny", name = "kl", desc = "(I)V", opaque = "-1243600329")
	public static void method7120() {
		for (Class231 var1 = (Class231)field699.method7482(); var1 != null; var1 = (Class231)field699.method7490()) {
			var1.method9277();
		}

	}

	@ObfInfo(owner = "uy", name = "ke", desc = "(Liw;I)V", opaque = "-433578414")
	public static void method9901(Class231 var0) {
		if (var0 != null && var0.field2435 != null) {
			if (var0.field2435.field3791 >= 0) {
				Class340 var2 = field25.method6718(var0.field2435.field3826);
				if (var2 == null || var2.field3745 == null || 0 == var2.field3745.length || var0.field2435.field3791 >= var2.field3745.length || var2.field3745[var0.field2435.field3791] != var0.field2435) {
					return;
				}
			}

			if (var0.field2435.field3755 == 11 && var0.field2434 == 0) {
				if (var0.field2435.method6518(var0.field2433, var0.field2436, 0, 0)) {
					var0.field2435.method6526().method3426().method3719(1, var0.field2435.method6526().method3438());
					switch(var0.field2435.method6522()) {
					case 0:
						Class40.method7134(var0.field2435.method6524(), true, false);
						break;
					case 1:
						int var3 = method3511(var0.field2435);
						boolean var7 = 0 != (var3 >> 22 & 1);
						if (var7) {
							int[] var4 = var0.field2435.method6525();
							if (var4 != null) {
								Class316 var5 = Class316.method3908(Class315.field3339, field548.field1446);
								var5.field3374.method9458(var0.field2435.method6640());
								var5.field3374.method9458(var4[1]);
								var5.field3374.method9459(var4[2]);
								var5.field3374.method9443(var0.field2435.field3791);
								var5.field3374.method9459(var0.field2435.field3676);
								var5.field3374.method9556(var4[0]);
								field548.method2897(var5);
							}
						}
					}
				}
			} else if (var0.field2435.field3755 == 12) {
				Class354 var6 = var0.field2435.method6530();
				if (var6 != null && var6.method6867()) {
					switch(var0.field2434) {
					case 0:
						field510.method4068(var0.field2435);
						var6.method6753(true);
						var6.method6804(var0.field2433, var0.field2436, field721.method4342(82), field721.method4342(81));
						break;
					case 1:
						var6.method6839(var0.field2433, var0.field2436);
					}
				}
			}

		}
	}

	@ObfInfo(owner = "rh", name = "kd", desc = "(B)Z")
	public static boolean method8419() {
		return 0 != (field530 & 1);
	}

	@ObfInfo(owner = "pl", name = "kb", desc = "(I)Z", opaque = "424252440")
	public static boolean method7533() {
		return (field530 & 8) != 0;
	}

	@ObfInfo(owner = "oo", name = "km", desc = "(B)V", opaque = "0")
	public static void method7207() {
		field608 = 0;
		int var1 = (field107.field1065 >> 7) + field3857.field1289;
		int var2 = (field107.field1126 >> 7) + field3857.field1285;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field608 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field608 = 1;
		}

		if (field608 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field608 = 0;
		}

	}

	@ObfInfo(owner = "ca", name = "kg", desc = "(Ldt;Ldh;IB)V")
	public static void method1053(Class98 var0, Class86 var1, int var2) {
		method1110(var0, var1.field1065, var1.field1126, var2);
	}

	@ObfInfo(owner = "cj", name = "ko", desc = "(Ldt;IIIB)V", opaque = "2")
	public static void method1110(Class98 var0, int var1, int var2, int var3) {
		if (var1 >= 128 && var2 >= 128 && var1 <= 13056 && var2 <= 13056) {
			int var5 = method790(var0, var1, var2, var0.field1300) - var3;
			var1 -= field3960;
			var5 -= field1760;
			var2 -= field1538;
			int var6 = Class253.field2683[field1105];
			int var7 = Class253.field2687[field1105];
			int var8 = Class253.field2683[field2029];
			int var9 = Class253.field2687[field2029];
			int var10 = var9 * var1 + var8 * var2 >> 16;
			var2 = var9 * var2 - var8 * var1 >> 16;
			var1 = var10;
			var10 = var7 * var5 - var6 * var2 >> 16;
			var2 = var7 * var2 + var6 * var5 >> 16;
			if (var2 >= 50) {
				field601 = field768 / 2 + var1 * field770 / var2;
				field486 = field769 / 2 + var10 * field770 / var2;
			} else {
				field601 = -1;
				field486 = -1;
			}

		} else {
			field601 = -1;
			field486 = -1;
		}
	}

	@ObfInfo(owner = "bm", name = "kp", desc = "(Ldt;IIIB)I", opaque = "5")
	public static int method790(Class98 var0, int var1, int var2, int var3) {
		int var5 = var1 >> 7;
		int var6 = var2 >> 7;
		if (var5 >= 0 && var6 >= 0 && var5 < var0.field1292[0].length && var6 < var0.field1292[0][0].length) {
			int var7 = var3;
			if (var3 < 3 && (var0.field1292[1][var5][var6] & 2) == 2) {
				var7 = var3 + 1;
			}

			int var8 = var1 & 127;
			int var9 = var2 & 127;
			int var10 = (128 - var8) * var0.field1291[var7][var5][var6] + var8 * var0.field1291[var7][var5 + 1][var6] >> 7;
			int var11 = var8 * var0.field1291[var7][var5 + 1][var6 + 1] + (128 - var8) * var0.field1291[var7][var5][var6 + 1] >> 7;
			return (128 - var9) * var10 + var11 * var9 >> 7;
		} else {
			return 0;
		}
	}

	@ObfInfo(owner = "qx", name = "kk", desc = "(ZLuk;I)V", opaque = "-1290878348")
	public static void method8270(boolean var0, Class531 var1) {
		field560 = var0;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!field560) {
			int var4 = var1.method9505();
			var1.method9461();
			var3 = var1.method9505();
			var5 = var1.method9407();
			field112 = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					field112[var6][var7] = var1.method9410();
				}
			}

			field690 = new int[var5];
			field1875 = new int[var5];
			field5187 = new int[var5];
			field1549 = new byte[var5][];
			field5146 = new byte[var5][];
			var5 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					field690[var5] = var8;
					field1875[var5] = field2971.method7233("m" + var6 + "_" + var7);
					field5187[var5] = field2971.method7233("l" + var6 + "_" + var7);
					++var5;
				}
			}

			method7452(var3, var4, true);
		} else {
			var3 = var1.method9446();
			boolean var16 = var1.method9438() == 1;
			var5 = var1.method9445();
			var6 = var1.method9407();
			var1.method9765();

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.method9770(1);
						if (var10 == 1) {
							field567[var7][var8][var9] = var1.method9770(26);
						} else {
							field567[var7][var8][var9] = -1;
						}
					}
				}
			}

			var1.method9799();
			field112 = new int[var6][4];

			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					field112[var7][var8] = var1.method9410();
				}
			}

			field690 = new int[var6];
			field1875 = new int[var6];
			field5187 = new int[var6];
			field1549 = new byte[var6][];
			field5146 = new byte[var6][];
			var6 = 0;

			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = field567[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;

							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (var13 == field690[var14]) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								field690[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								field1875[var6] = field2971.method7233("m" + var14 + "_" + var15);
								field5187[var6] = field2971.method7233("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}

			method7452(var3, var5, !var16);
		}

	}

	@ObfInfo(owner = "pg", name = "ka", desc = "(IIZI)V", opaque = "2044378456")
	public static void method7452(int var0, int var1, boolean var2) {
		if (!var2 || field5013 != var0 || var1 != field4694) {
			field5013 = var0;
			field4694 = var1;
			Class118.method2945(25);
			field485 = true;
			method8554(Class378.field4155, true);
			int var4 = field3857.field1289;
			int var5 = field3857.field1285;
			field3857.field1289 = (var0 - 6) * 8;
			field3857.field1285 = (var1 - 6) * 8;
			int var6 = field3857.field1289 - var4;
			int var7 = field3857.field1285 - var5;
			var4 = field3857.field1289;
			var5 = field3857.field1285;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				Class100 var9 = field3857.field1295[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field1080;
						var10000[var10] -= var6;
						var10000 = var9.field1127;
						var10000[var10] -= var7;
					}

					var9.field1065 -= var6 * 128;
					var9.field1126 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				Class83 var19 = field3857.field1293[var8];
				if (var19 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var19.field1080;
						var10000[var10] -= var6;
						var10000 = var19.field1127;
						var10000[var10] -= var7;
					}

					var19.field1065 -= var6 * 128;
					var19.field1126 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				Class488 var20 = field3857.field1299[var8];
				if (var20 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var20.field4990;
						var10000[var10] -= var6;
						var10000 = var20.field4998;
						var10000[var10] -= var7;
					}

					var20.field4991 -= var6 * 128;
					var20.field4993 -= var7 * 128;
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
						if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
							field3857.field1301[var18][var14][var15] = field3857.field1301[var18][var16][var17];
						} else {
							field3857.field1301[var18][var14][var15] = null;
						}
					}
				}
			}

			for (Class89 var24 = (Class89)field3857.field1294.method7482(); var24 != null; var24 = (Class89)field3857.field1294.method7490()) {
				var24.field1187 -= var6;
				var24.field1191 -= var7;
				if (var24.field1187 < 0 || var24.field1191 < 0 || var24.field1187 >= 104 || var24.field1191 >= 104) {
					var24.method9277();
				}
			}

			if (field734 != 0) {
				field734 -= var6;
				field594 -= var7;
			}

			field650 = 0;
			field496 = false;
			field3960 -= var6 << 7;
			field1538 -= var7 << 7;
			field271 -= var6 << 7;
			field897 -= var7 << 7;
			field729 = -1;
			field3857.field1304.method7476();
			field3857.field1303.method7476();

			for (var15 = 0; var15 < 4; ++var15) {
				field3857.field1284[var15].method4302();
			}

		}
	}

	@ObfInfo(owner = "ah", name = "kt", desc = "(ZB)V", opaque = "64")
	public static void method129(boolean var0) {
		method4066();
		++field548.field1443;
		if (field548.field1443 >= 50 || var0) {
			field548.field1443 = 0;
			if (!field550 && field548.method2900() != null) {
				Class316 var2 = Class316.method3908(Class315.field3354, field548.field1446);
				field548.method2897(var2);

				try {
					field548.method2899();
				} catch (IOException var4) {
					field550 = true;
				}
			}

		}
	}

	@ObfInfo(owner = "ky", name = "kc", desc = "(B)V", opaque = "1")
	public static void method5783() {
		method129(false);
		field553 = 0;
		boolean var1 = true;

		int var2;
		for (var2 = 0; var2 < field1549.length; ++var2) {
			if (-1 != field1875[var2] && field1549[var2] == null) {
				field1549[var2] = field2971.method7216(field1875[var2], 0);
				if (field1549[var2] == null) {
					var1 = false;
					++field553;
				}
			}

			if (field5187[var2] != -1 && null == field5146[var2]) {
				field5146[var2] = field2971.method7298(field5187[var2], 0, field112[var2]);
				if (null == field5146[var2]) {
					var1 = false;
					++field553;
				}
			}
		}

		if (!var1) {
			field542 = 1;
		} else {
			field657 = 0;
			var1 = true;

			int var4;
			int var5;
			for (var2 = 0; var2 < field1549.length; ++var2) {
				byte[] var3 = field5146[var2];
				if (var3 != null) {
					var4 = 64 * (field690[var2] >> 8) - field3857.field1289;
					var5 = (field690[var2] & 255) * 64 - field3857.field1285;
					if (field560) {
						var4 = 10;
						var5 = 10;
					}

					var1 &= Class93.method8829(var3, var4, var5);
				}
			}

			if (!var1) {
				field542 = 2;
			} else {
				if (field542 != 0) {
					method8554(Class378.field4155 + Class113.field1427 + Class113.field1423 + 100 + "%" + Class113.field1428, true);
				}

				method4066();
				field3857.field1283.method4925();

				for (var2 = 0; var2 < 4; ++var2) {
					field3857.field1284[var2].method4302();
				}

				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							field3857.field1292[var2][var16][var4] = 0;
						}
					}
				}

				method4066();
				Class93.method7690();
				var2 = field1549.length;
				Class147.method3246();
				method129(true);
				int var18;
				if (!field560) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (field690[var16] >> 8) * 64 - field3857.field1289;
						var5 = 64 * (field690[var16] & 255) - field3857.field1285;
						var6 = field1549[var16];
						if (var6 != null) {
							method4066();
							Class93.method8967(field3857, var6, var4, var5, field5013 * 8 - 48, field4694 * 8 - 48);
						}
					}

					for (var16 = 0; var16 < var2; ++var16) {
						var4 = 64 * (field690[var16] >> 8) - field3857.field1289;
						var5 = (field690[var16] & 255) * 64 - field3857.field1285;
						var6 = field1549[var16];
						if (var6 == null && field4694 < 800) {
							method4066();
							Class93.method4167(field3857, var4, var5, 64, 64);
						}
					}

					method129(true);

					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = field5146[var16];
						if (var17 != null) {
							var5 = (field690[var16] >> 8) * 64 - field3857.field1289;
							var18 = (field690[var16] & 255) * 64 - field3857.field1285;
							method4066();
							Class148.method3258(field3857, var17, var5, var18);
						}
					}
				}

				int var7;
				int var8;
				int var9;
				if (field560) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						method4066();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var19 = false;
								var7 = field567[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = var11 / 8 + (var10 / 8 << 8);

									for (int var13 = 0; var13 < field690.length; ++var13) {
										if (var12 == field690[var13] && field1549[var13] != null) {
											int var14 = (var10 - var4) * 8;
											int var15 = (var11 - var5) * 8;
											Class93.method2888(field3857, field1549[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									Class211.method4052(field3857.field1291, var16, var4 * 8, var5 * 8);
								}
							}
						}
					}

					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = field567[0][var16][var4];
							if (var5 == -1) {
								Class93.method4167(field3857, var16 * 8, var4 * 8, 8, 8);
							}
						}
					}

					method129(true);

					for (var16 = 0; var16 < 4; ++var16) {
						method4066();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = field567[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = var10 / 8 + (var9 / 8 << 8);

									for (var12 = 0; var12 < field690.length; ++var12) {
										if (var11 == field690[var12] && null != field5146[var12]) {
											Class93.method2432(field3857, field5146[var12], var16, var4 * 8, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8);
											break;
										}
									}
								}
							}
						}
					}
				}

				method129(true);
				method4066();
				Class93.method9902(field3857);
				method129(true);
				var16 = Class93.field1241;
				if (var16 > field3857.field1300) {
					var16 = field3857.field1300;
				}

				if (var16 < field3857.field1300 - 1) {
					var16 = field3857.field1300 - 1;
				}

				if (field599) {
					field3857.field1283.method5131(Class93.field1241);
				} else {
					field3857.field1283.method5131(0);
				}

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						method5568(field3857, var4, var5);
					}
				}

				method4066();
				Class444.method8309();
				Class222.field2276.method5995();
				Class316 var20;
				if (field2077.method502()) {
					var20 = Class316.method3908(Class315.field3360, field548.field1446);
					var20.field3374.method9590(1057001181);
					field548.method2897(var20);
				}

				if (!field560) {
					var4 = (field5013 - 6) / 8;
					var5 = (field5013 + 6) / 8;
					var18 = (field4694 - 6) / 8;
					var7 = (field4694 + 6) / 8;

					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								field2971.method7250("m" + var8 + "_" + var9);
								field2971.method7250("l" + var8 + "_" + var9);
							}
						}
					}
				}

				method4066();
				Class93.method2966();
				var20 = Class316.method3908(Class315.field3289, field548.field1446);
				field548.method2897(var20);
				Class31.method164();
				field485 = false;
			}
		}
	}

	@ObfInfo(owner = "fx", name = "kj", desc = "(Ldt;I)V", opaque = "1819707388")
	public static void method3293(Class98 var0) {
		int var2 = var0.field1298 / 8;
		int var3 = var0.field1282 / 8;
		boolean var4 = false;
		method129(false);
		var4 = true;

		int var5;
		for (var5 = 0; var5 < field3972.length; ++var5) {
			if (-1 != field1622[var5] && null == field3972[var5]) {
				field3972[var5] = field2971.method7216(field1622[var5], 0);
				if (field3972[var5] == null) {
					var4 = false;
				}
			}

			if (field149[var5] != -1 && null == field1749[var5]) {
				field1749[var5] = field2971.method7298(field149[var5], 0, field5183[var5]);
				if (null == field1749[var5]) {
					var4 = false;
				}
			}
		}

		if (var4) {
			method129(false);
			var4 = true;

			for (var5 = 0; var5 < field3972.length; ++var5) {
				byte[] var6 = field1749[var5];
				if (var6 != null) {
					byte var7 = 10;
					byte var8 = 10;
					var4 &= Class93.method8829(var6, var7, var8);
				}
			}

			if (var4) {
				int var18;
				for (var5 = 0; var5 < 4; ++var5) {
					for (var18 = 0; var18 < var0.field1292[var5].length; ++var18) {
						Arrays.fill(var0.field1292[var5][var18], (byte)0);
					}
				}

				method4066();
				Class93.method7690();
				Class147.method3246();
				method129(true);

				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var19;
				for (var5 = 0; var5 < 4; ++var5) {
					method4066();

					for (var18 = 0; var18 < var2; ++var18) {
						for (var19 = 0; var19 < var3; ++var19) {
							boolean var20 = false;
							var9 = field559[var5][var18][var19];
							if (var9 != -1) {
								var10 = var9 >> 24 & 3;
								var11 = var9 >> 1 & 3;
								var12 = var9 >> 14 & 1023;
								var13 = var9 >> 3 & 2047;
								var14 = (var12 / 8 << 8) + var13 / 8;

								for (int var15 = 0; var15 < field1536.length; ++var15) {
									if (field1536[var15] == var14 && null != field3972[var15]) {
										int var16 = (var12 - var18) * 8;
										int var17 = (var13 - var19) * 8;
										Class93.method2888(var0, field3972[var15], var5, var18 * 8, var19 * 8, var10, (var12 & 7) * 8, (var13 & 7) * 8, var11, var16, var17);
										var20 = true;
										break;
									}
								}
							}

							if (!var20) {
								Class211.method4052(var0.field1291, var5, var18 * 8, var19 * 8);
							}
						}
					}
				}

				for (var5 = 0; var5 < 13; ++var5) {
					for (var18 = 0; var18 < 13; ++var18) {
						var19 = field559[0][var5][var18];
						if (var19 == -1) {
							Class93.method4167(var0, var5 * 8, var18 * 8, 8, 8);
						}
					}
				}

				method129(true);

				for (var5 = 0; var5 < 4; ++var5) {
					method4066();

					for (var18 = 0; var18 < var2; ++var18) {
						for (var19 = 0; var19 < var3; ++var19) {
							int var21 = field559[var5][var18][var19];
							if (var21 != -1) {
								var9 = var21 >> 24 & 3;
								var10 = var21 >> 1 & 3;
								var11 = var21 >> 14 & 1023;
								var12 = var21 >> 3 & 2047;
								var13 = var12 / 8 + (var11 / 8 << 8);

								for (var14 = 0; var14 < field1536.length; ++var14) {
									if (var13 == field1536[var14] && null != field1749[var14]) {
										Class93.method2432(var0, field1749[var14], var5, var18 * 8, var19 * 8, var9, (var11 & 7) * 8, 8 * (var12 & 7), var10);
										break;
									}
								}
							}
						}
					}
				}

				method129(true);
				method4066();
				Class93.method9902(var0);
				method129(true);
				Class222.field2276.method5995();
				method4066();
				Class93.method2966();
				field642 = false;
			}
		}
	}

	@ObfInfo(owner = "fa", name = "ky", desc = "(IIIIII)V", opaque = "529388836")
	public static void method3064(int var0, int var1, int var2, int var3, int var4) {
		Class401 var6 = field4582.field1301[var0][var1][var2];
		if (var6 != null) {
			for (Class117 var7 = (Class117)var6.method7482(); var7 != null; var7 = (Class117)var6.method7490()) {
				if ((var3 & 32767) == var7.field1465) {
					var7.method2919(var4);
					break;
				}
			}
		}

	}

	@ObfInfo(owner = "lw", name = "ki", desc = "(IIIIIIIIIIIIIII)V")
	public static void method6160(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = 64 + var1 * 128;
		var2 = 64 + var2 * 128;
		var3 = 64 + var3 * 128;
		var4 = 64 + var4 * 128;
		Class88 var15 = new Class88(var6, var0, var1, var2, method790(field4582, var1, var2, var0) - var7, var9 + field778, field778 + var10, var11, var12, var13, var5, var8);
		var15.method2387(var3, var4, method790(field4582, var3, var4, var0) - var8, var9 + field778);
		field4582.field1303.method7477(var15);
	}

	@ObfInfo(owner = "nj", name = "ku", desc = "(IIIIII)V", opaque = "310369198")
	public static void method6708(int var0, int var1, int var2, int var3, int var4) {
		Class401 var6 = field4582.field1301[var0][var1][var2];
		if (var6 != null) {
			for (Class117 var7 = (Class117)var6.method7482(); var7 != null; var7 = (Class117)var6.method7490()) {
				if (var7.field1465 == (var3 & 32767) && var4 == var7.field1458) {
					var7.method9277();
					break;
				}
			}

			if (var6.method7482() == null) {
				field4582.field1301[var0][var1][var2] = null;
			}

			method7123(var0, var1, var2);
		}

	}

	@ObfInfo(owner = "ln", name = "kh", desc = "(IIIIIIIIIZB)V", opaque = "80")
	public static void method5998(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		Class117 var11 = new Class117();
		var11.field1465 = var3;
		var11.field1458 = var4;
		var11.method2919(var5);
		var11.field1459 = field501 + var6;
		var11.field1464 = var7 + field501;
		var11.field1461 = var8;
		var11.field1460 = var9;
		if (field4582.field1301[var0][var1][var2] == null) {
			field4582.field1301[var0][var1][var2] = new Class401();
		}

		field4582.field1301[var0][var1][var2].method7477(var11);
		method7123(var0, var1, var2);
	}

	@ObfInfo(owner = "tc", name = "kx", desc = "(IIIIIII)Z")
	public static boolean method9204(int var0, int var1, int var2, int var3, int var4, int var5) {
		return Class65.method1805(field4582.field1300, var0, var1, var2, var3, var4, var5);
	}

	@ObfInfo(owner = "gs", name = "li", desc = "(Ldt;IIIIIIIIIII)V", opaque = "-275262227")
	public static void method3582(Class98 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		Class401 var12 = var0.field1294;
		Class89 var13 = null;

		for (Class89 var14 = (Class89)var12.method7482(); var14 != null; var14 = (Class89)var12.method7490()) {
			if (var1 == var14.field1195 && var14.field1187 == var2 && var3 == var14.field1191 && var4 == var14.field1186) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new Class89();
			var13.field1195 = var1;
			var13.field1186 = var4;
			var13.field1187 = var2;
			var13.field1191 = var3;
			var13.field1185 = -1;
			Class59.method1094(var0, var13);
			var12.method7477(var13);
		}

		var13.field1188 = var5;
		var13.field1192 = var6;
		var13.field1193 = var7;
		var13.field1197 = var9;
		var13.field1198 = var10;
		var13.method2398(var8);
	}

	@ObfInfo(owner = "gd", name = "lb", desc = "(Ldt;IIIII)Ldk;", opaque = "1246085363")
	public static Class89 method3404(Class98 var0, int var1, int var2, int var3, int var4) {
		for (Class89 var6 = (Class89)var0.field1294.method7482(); var6 != null; var6 = (Class89)var0.field1294.method7490()) {
			if (var1 == var6.field1195 && var6.field1187 == var2 && var6.field1191 == var3 && var6.field1186 == var4) {
				return var6;
			}
		}

		return null;
	}

	@ObfInfo(owner = "dh", name = "le", desc = "(Ldt;I)V", opaque = "-747158696")
	public static void method2351(Class98 var0) {
		for (Class89 var2 = (Class89)var0.field1294.method7482(); var2 != null; var2 = (Class89)var0.field1294.method7490()) {
			if (var2.field1198 > 0) {
				--var2.field1198;
			}

			boolean var3;
			int var4;
			int var5;
			Class222 var6;
			if (var2.field1198 == 0) {
				if (var2.field1189 >= 0) {
					var4 = var2.field1189;
					var5 = var2.field1196;
					var6 = Class222.method4161(var4);
					if (var5 == 11) {
						var5 = 10;
					}

					if (var5 >= 5 && var5 <= 8) {
						var5 = 4;
					}

					var3 = var6.method4175(var5);
					if (!var3) {
						continue;
					}
				}

				Class57.method1071(var0, var2.field1195, var2.field1186, var2.field1187, var2.field1191, var2.field1189, var2.field1190, var2.field1196, var2.field1185);
				var2.method9277();
			} else {
				if (var2.field1197 > 0) {
					--var2.field1197;
				}

				if (0 == var2.field1197 && var2.field1187 >= 1 && var2.field1191 >= 1 && var2.field1187 <= 102 && var2.field1191 <= 102) {
					if (var2.field1188 >= 0) {
						var4 = var2.field1188;
						var5 = var2.field1192;
						var6 = Class222.method4161(var4);
						if (var5 == 11) {
							var5 = 10;
						}

						if (var5 >= 5 && var5 <= 8) {
							var5 = 4;
						}

						var3 = var6.method4175(var5);
						if (!var3) {
							continue;
						}
					}

					Class57.method1071(var0, var2.field1195, var2.field1186, var2.field1187, var2.field1191, var2.field1188, var2.field1193, var2.field1192, var2.field1185);
					var2.field1197 = -1;
					if (var2.field1188 == var2.field1189 && var2.field1189 == -1) {
						var2.method9277();
					} else if (var2.field1188 == var2.field1189 && var2.field1193 == var2.field1190 && var2.field1196 == var2.field1192) {
						var2.method9277();
					}
				}
			}
		}

	}

	@ObfInfo(owner = "kr", name = "lh", desc = "(Ldt;IIB)V")
	public static void method5568(Class98 var0, int var1, int var2) {
		method3416(var0, var0.field1300, var1, var2);
	}

	@ObfInfo(owner = "nz", name = "lg", desc = "(IIII)V")
	public static void method7123(int var0, int var1, int var2) {
		method3416(field4582, var0, var1, var2);
	}

	@ObfInfo(owner = "gg", name = "ln", desc = "(Ldt;IIIS)V", opaque = "188")
	public static void method3416(Class98 var0, int var1, int var2, int var3) {
		Class401 var5 = var0.field1301[var1][var2][var3];
		if (var5 == null) {
			var0.field1283.method4946(var1, var2, var3);
		} else {
			long var6 = -99999999L;
			Class117 var8 = null;

			Class117 var9;
			for (var9 = (Class117)var5.method7482(); var9 != null; var9 = (Class117)var5.method7490()) {
				Class232 var10 = Class232.method109(var9.field1465);
				long var11 = (long)var10.field2464;
				if (var10.field2462 == 1) {
					var11 *= var9.field1458 < Integer.MAX_VALUE ? (long)(1 + var9.field1458) : (long)var9.field1458;
				}

				if (var11 > var6) {
					var6 = var11;
					var8 = var9;
				}
			}

			if (var8 == null) {
				var0.field1283.method4946(var1, var2, var3);
			} else {
				var5.method7478(var8);
				Class117 var14 = null;
				Class117 var15 = null;

				for (var9 = (Class117)var5.method7482(); var9 != null; var9 = (Class117)var5.method7490()) {
					if (var9.field1465 != var8.field1465) {
						if (var14 == null) {
							var14 = var9;
						}

						if (var9.field1465 != var14.field1465 && var15 == null) {
							var15 = var9;
						}
					}
				}

				long var12 = Class274.method3872(var2, var3, 3, false, 0, var0.field1287);
				var0.field1283.method4932(var1, var2, var3, method790(var0, 64 + var2 * 128, 64 + var3 * 128, var1), var8, var12, var14, var15);
			}
		}
	}

	@ObfInfo(owner = "qj", name = "lo", desc = "(Ldt;Luk;B)V", opaque = "4")
	public static void method7873(Class98 var0, Class531 var1) {
		int var3 = var1.method9407();
		Class488 var4 = var0.field1299[var3];
		Class98 var5 = var4.field4995;
		var5.field1289 = var1.method9407();
		var5.field1285 = var1.method9407();
		var5.field1288.method2785(var1, false);
		int var6 = var5.field1298 / 8;
		int var7 = var5.field1282 / 8;
		int var8 = var1.method9407();
		var1.method9765();

		int var9;
		int var10;
		int var11;
		int var12;
		for (var9 = 0; var9 < 4; ++var9) {
			for (var10 = 0; var10 < var6; ++var10) {
				for (var11 = 0; var11 < var7; ++var11) {
					var12 = var1.method9770(1);
					if (var12 == 1) {
						field559[var9][var10][var11] = var1.method9770(26);
					} else {
						field559[var9][var10][var11] = -1;
					}
				}
			}
		}

		var1.method9799();
		field5183 = new int[var8][4];

		for (var9 = 0; var9 < var8; ++var9) {
			for (var10 = 0; var10 < 4; ++var10) {
				field5183[var9][var10] = var1.method9410();
			}
		}

		field1536 = new int[var8];
		field1622 = new int[var8];
		field149 = new int[var8];
		field3972 = new byte[var8][];
		field1749 = new byte[var8][];
		var8 = 0;

		for (var9 = 0; var9 < 4; ++var9) {
			for (var10 = 0; var10 < var6; ++var10) {
				for (var11 = 0; var11 < var7; ++var11) {
					var12 = field559[var9][var10][var11];
					if (var12 != -1) {
						int var13 = var12 >> 14 & 1023;
						int var14 = var12 >> 3 & 2047;
						int var15 = (var13 / 8 << 8) + var14 / 8;

						int var16;
						for (var16 = 0; var16 < var8; ++var16) {
							if (var15 == field1536[var16]) {
								var15 = -1;
								break;
							}
						}

						if (var15 != -1) {
							field1536[var8] = var15;
							var16 = var15 >> 8 & 255;
							int var17 = var15 & 255;
							field1622[var8] = field2971.method7233("m" + var16 + "_" + var17);
							field149[var8] = field2971.method7233("l" + var16 + "_" + var17);
							++var8;
						}
					}
				}
			}
		}

		Class118.method2945(25);
		field642 = true;
		field316 = var5;
		method3293(var5);
	}

	@ObfInfo(owner = "dx", name = "ls", desc = "(Ldt;ZLuk;I)V", opaque = "-1173900364")
	public static void method2648(Class98 var0, boolean var1, Class531 var2) {
		field616 = 0;
		field546 = 0;
		var2.method9765();
		int var4 = var2.method9770(8);
		int var5;
		if (var4 < var0.field1296) {
			for (var5 = var4; var5 < var0.field1296; ++var5) {
				field617[++field616 - 1] = var0.field1297[var5];
			}
		}

		if (var4 > var0.field1296) {
			throw new RuntimeException("");
		} else {
			var0.field1296 = 0;

			int var8;
			int var9;
			int var10;
			int var11;
			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var0.field1297[var5];
				Class100 var7 = var0.field1295[var6];
				var8 = var2.method9770(1);
				if (var8 == 0) {
					var0.field1297[++var0.field1296 - 1] = var6;
					var7.field1114 = field778;
				} else {
					var9 = var2.method9770(2);
					if (var9 == 0) {
						var0.field1297[++var0.field1296 - 1] = var6;
						var7.field1114 = field778;
						field547[++field546 - 1] = var6;
					} else if (var9 == 1) {
						var0.field1297[++var0.field1296 - 1] = var6;
						var7.field1114 = field778;
						var10 = var2.method9770(3);
						var7.method2526(var10, Class256.field2700);
						var11 = var2.method9770(1);
						if (var11 == 1) {
							field547[++field546 - 1] = var6;
						}
					} else if (var9 == 2) {
						var0.field1297[++var0.field1296 - 1] = var6;
						var7.field1114 = field778;
						if (var2.method9770(1) == 1) {
							var10 = var2.method9770(3);
							var7.method2526(var10, Class256.field2704);
							var11 = var2.method9770(3);
							var7.method2526(var11, Class256.field2704);
						} else {
							var10 = var2.method9770(3);
							var7.method2526(var10, Class256.field2699);
						}

						var10 = var2.method9770(1);
						if (var10 == 1) {
							field547[++field546 - 1] = var6;
						}
					} else if (var9 == 3) {
						field617[++field616 - 1] = var6;
					}
				}
			}

			method3282(var0, var1, var2);

			for (var4 = 0; var4 < field546; ++var4) {
				var5 = field547[var4];
				Class100 var16 = var0.field1295[var5];
				int var17 = var2.method9405();
				if (0 != (var17 & 1)) {
					var8 = var2.method9405();
					var17 += var8 << 8;
				}

				if ((var17 & 4096) != 0) {
					var8 = var2.method9405();
					var17 += var8 << 16;
				}

				if (0 != (var17 & 8)) {
					var16.field1314 = Class225.method3256(var2.method9505());
					method71(var16);
					var16.method2534();
				}

				if ((var17 & 4) != 0) {
					var8 = var2.method9505();
					if (var8 == 65535) {
						var8 = -1;
					}

					var9 = var2.method9405();
					if (var8 == var16.field1074 && var8 != -1) {
						var10 = Class211.method4637(var8).field2152;
						if (var10 == 1) {
							var16.field1101 = 0;
							var16.field1102 = 0;
							var16.field1103 = var9;
							var16.field1090 = 0;
						}

						if (var10 == 2) {
							var16.field1090 = 0;
						}
					} else if (var8 == -1 || var16.field1074 == -1 || Class211.method4637(var8).field2128 >= Class211.method4637(var16.field1074).field2128) {
						var16.field1074 = var8;
						var16.field1101 = 0;
						var16.field1102 = 0;
						var16.field1103 = var9;
						var16.field1090 = 0;
						var16.field1077 = var16.field1125;
					}
				}

				if (0 != (var17 & 2)) {
					var16.field1075 = var2.method9415();
					var16.field1069 = 100;
				}

				int var12;
				int var13;
				int[] var18;
				short[] var19;
				short[] var20;
				long var21;
				boolean var22;
				if ((var17 & 512) != 0) {
					var8 = var2.method9405();
					if ((var8 & 1) == 1) {
						var16.method2557();
					} else {
						var18 = null;
						if ((var8 & 2) == 2) {
							var10 = var2.method9522();
							var18 = new int[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var12 = var2.method9445();
								var12 = var12 == 65535 ? -1 : var12;
								var18[var11] = var12;
							}
						}

						var19 = null;
						if ((var8 & 4) == 4) {
							var11 = 0;
							if (var16.field1314.field2339 != null) {
								var11 = var16.field1314.field2339.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var2.method9446();
							}
						}

						var20 = null;
						if (8 == (var8 & 8)) {
							var12 = 0;
							if (var16.field1314.field2350 != null) {
								var12 = var16.field1314.field2350.length;
							}

							var20 = new short[var12];

							for (var13 = 0; var13 < var12; ++var13) {
								var20[var13] = (short)var2.method9407();
							}
						}

						var22 = false;
						if (0 != (var8 & 16)) {
							var22 = var2.method9437() == 1;
						}

						var21 = (long)(++Class100.field1319 - 1);
						var16.method2537(new Class223(var21, var18, var19, var20, var22));
					}
				}

				if ((var17 & 128) != 0) {
					var8 = var2.method9446();
					var9 = var2.method9407();
					var16.field1095 = var2.method9438() == 1;
					var16.field1093 = var8;
					var16.field1094 = var9;
				}

				if ((var17 & 131072) != 0) {
					var8 = var2.method9405();
					var18 = new int[8];
					var19 = new short[8];

					for (var11 = 0; var11 < 8; ++var11) {
						if ((var8 & 1 << var11) != 0) {
							var18[var11] = var2.method9423();
							var19[var11] = (short)var2.method9420();
						} else {
							var18[var11] = -1;
							var19[var11] = -1;
						}
					}

					var16.method2533(var18, var19);
				}

				if (0 != (var17 & 2048)) {
					var8 = var2.method9437();
					if (1 == (var8 & 1)) {
						var16.method2538();
					} else {
						var18 = null;
						if ((var8 & 2) == 2) {
							var10 = var2.method9522();
							var18 = new int[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var12 = var2.method9446();
								var12 = var12 == 65535 ? -1 : var12;
								var18[var11] = var12;
							}
						}

						var19 = null;
						if (4 == (var8 & 4)) {
							var11 = 0;
							if (var16.field1314.field2339 != null) {
								var11 = var16.field1314.field2339.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var2.method9505();
							}
						}

						var20 = null;
						if (8 == (var8 & 8)) {
							var12 = 0;
							if (var16.field1314.field2350 != null) {
								var12 = var16.field1314.field2350.length;
							}

							var20 = new short[var12];

							for (var13 = 0; var13 < var12; ++var13) {
								var20[var13] = (short)var2.method9446();
							}
						}

						var22 = false;
						if ((var8 & 16) != 0) {
							var22 = var2.method9405() == 1;
						}

						var21 = (long)(++Class100.field1321 - 1);
						var16.method2561(new Class223(var21, var18, var19, var20, var22));
					}
				}

				if ((var17 & 1024) != 0) {
					var16.method2522(var2.method9415());
				}

				if (0 != (var17 & 32)) {
					var8 = var2.method9438();
					int var14;
					if (var8 > 0) {
						for (var9 = 0; var9 < var8; ++var9) {
							var11 = -1;
							var12 = -1;
							var13 = -1;
							var10 = var2.method9419();
							if (var10 == 32767) {
								var10 = var2.method9419();
								var12 = var2.method9419();
								var11 = var2.method9419();
								var13 = var2.method9419();
							} else if (var10 != 32766) {
								var12 = var2.method9419();
							} else {
								var10 = -1;
							}

							var14 = var2.method9419();
							var16.method2309(var10, var12, var11, var13, field778, var14);
						}
					}

					var9 = var2.method9437();
					if (var9 > 0) {
						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var2.method9419();
							var12 = var2.method9419();
							if (var12 != 32767) {
								var13 = var2.method9419();
								var14 = var2.method9438();
								int var15 = var12 > 0 ? var2.method9522() : var14;
								var16.method2310(var11, field778, var12, var13, var14, var15);
							} else {
								var16.method2339(var11);
							}
						}
					}
				}

				if (0 != (var17 & 256)) {
					var16.field1116 = field778 + var2.method9446();
					var16.field1117 = field778 + var2.method9445();
					var16.field1118 = var2.method9440();
					var16.field1119 = var2.method9406();
					var16.field1120 = var2.method9406();
					var16.field1121 = (byte)var2.method9437();
				}

				if ((var17 & 32768) != 0) {
					var16.field1131 = var2.method9410();
				}

				if ((var17 & 64) != 0) {
					var16.field1070 = var2.method9445();
					var16.field1070 += var2.method9437() << 16;
					var8 = 16777215;
					if (var16.field1070 == var8) {
						var16.field1070 = -1;
					}
				}

				if ((var17 & 262144) != 0) {
					var8 = var2.method9460();
					var16.field1092 = (var8 & 1) != 0 ? var2.method9407() : var16.field1314.field2321;
					var16.field1063 = (var8 & 2) != 0 ? var2.method9445() : var16.field1314.field2314;
					var16.field1064 = (var8 & 4) != 0 ? var2.method9407() : var16.field1314.field2326;
					var16.field1073 = (var8 & 8) != 0 ? var2.method9446() : var16.field1314.field2347;
					var16.field1056 = (var8 & 16) != 0 ? var2.method9505() : var16.field1314.field2328;
					var16.field1067 = 0 != (var8 & 32) ? var2.method9445() : var16.field1314.field2329;
					var16.field1068 = 0 != (var8 & 64) ? var2.method9445() : var16.field1314.field2330;
					var16.field1066 = (var8 & 128) != 0 ? var2.method9445() : var16.field1314.field2331;
					var16.field1076 = 0 != (var8 & 256) ? var2.method9445() : var16.field1314.field2361;
					var16.field1071 = 0 != (var8 & 512) ? var2.method9446() : var16.field1314.field2333;
					var16.field1124 = (var8 & 1024) != 0 ? var2.method9505() : var16.field1314.field2334;
					var16.field1057 = 0 != (var8 & 2048) ? var2.method9445() : var16.field1314.field2335;
					var16.field1132 = (var8 & 4096) != 0 ? var2.method9445() : var16.field1314.field2336;
					var16.field1079 = (var8 & 8192) != 0 ? var2.method9505() : var16.field1314.field2324;
					var16.field1061 = 0 != (var8 & 16384) ? var2.method9446() : var16.field1314.field2323;
				}

				if (0 != (var17 & 16)) {
					var2.method9407();
					var2.method9555();
				}

				if ((var17 & 65536) != 0) {
					var8 = var2.method9438();

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var2.method9438();
						var11 = var2.method9445();
						var12 = var2.method9410();
						var16.method2331(var10, var11, var12 >> 16, var12 & 65535);
					}
				}

				if (0 != (var17 & 8192)) {
					var16.method2547(var2.method9522());
				}

				if ((var17 & 16384) != 0) {
					var16.field1107 = var2.method9439();
					var16.field1109 = var2.method9406();
					var16.field1108 = var2.method9574();
					var16.field1110 = var2.method9439();
					var16.field1111 = var2.method9407() + field778;
					var16.field1112 = var2.method9407() + field778;
					var16.field1113 = var2.method9445();
					var16.field1125 = 1;
					var16.field1077 = 0;
					var16.field1107 += var16.field1080[0];
					var16.field1109 += var16.field1127[0];
					var16.field1108 += var16.field1080[0];
					var16.field1110 += var16.field1127[0];
				}
			}

			for (var4 = 0; var4 < field616; ++var4) {
				var5 = field617[var4];
				if (var0.field1295[var5].field1114 != field778) {
					var0.field1295[var5].field1314 = null;
					var0.field1295[var5] = null;
				}
			}

			if (field548.field1444 != var2.field5219) {
				throw new RuntimeException(var2.field5219 + Class113.field1422 + field548.field1444);
			} else {
				for (var4 = 0; var4 < var0.field1296; ++var4) {
					if (null == var0.field1295[var0.field1297[var4]]) {
						throw new RuntimeException(var4 + Class113.field1422 + var0.field1296);
					}
				}

			}
		}
	}

	@ObfInfo(owner = "fw", name = "lv", desc = "(Ldt;ZLuk;I)V", opaque = "-885213632")
	public static void method3282(Class98 var0, boolean var1, Class531 var2) {
		while (true) {
			byte var4 = 16;
			int var5 = 1 << var4;
			if (var2.method9768(field548.field1444) >= var4 + 12) {
				int var6 = var2.method9770(var4);
				if (var5 - 1 != var6) {
					boolean var7 = false;
					if (null == var0.field1295[var6]) {
						var0.field1295[var6] = new Class100();
						var7 = true;
					}

					Class100 var8 = var0.field1295[var6];
					var0.field1297[++var0.field1296 - 1] = var6;
					var8.field1114 = field778;
					var8.field1314 = Class225.method3256(var2.method9770(14));
					int var9 = var2.method9770(1);
					int var12 = var2.method9770(1);
					if (var12 == 1) {
						field547[++field546 - 1] = var6;
					}

					int var10;
					if (var1) {
						var10 = var2.method9770(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.method9770(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					int var13 = field761[var2.method9770(3)];
					if (var7) {
						var8.field1133 = var8.field1060 = var13;
					}

					boolean var14 = var2.method9770(1) == 1;
					if (var14) {
						var2.method9770(32);
					}

					int var11;
					if (var1) {
						var11 = var2.method9770(8);
						if (var11 > 127) {
							var11 -= 256;
						}
					} else {
						var11 = var2.method9770(5);
						if (var11 > 15) {
							var11 -= 32;
						}
					}

					method71(var8);
					if (0 == var8.field1089) {
						var8.field1060 = 0;
					}

					if (field515 >= 222) {
						var8.method2527(field172 + var10, var11 + field1589, var9 == 1);
						continue;
					}

					var8.method2527(field107.field1080[0] + var10, field107.field1127[0] + var11, var9 == 1);
					continue;
				}
			}

			var2.method9799();
			return;
		}
	}

	@ObfInfo(owner = "af", name = "ll", desc = "(Ldv;B)V")
	public static void method71(Class100 var0) {
		var0.field1059 = var0.field1314.field2320;
		var0.field1089 = var0.field1314.field2332;
		var0.field1064 = var0.field1314.field2326;
		var0.field1073 = var0.field1314.field2347;
		var0.field1056 = var0.field1314.field2328;
		var0.field1067 = var0.field1314.field2329;
		var0.field1061 = var0.field1314.field2323;
		var0.field1092 = var0.field1314.field2321;
		var0.field1063 = var0.field1314.field2314;
		var0.field1068 = var0.field1314.field2330;
		var0.field1066 = var0.field1314.field2331;
		var0.field1076 = var0.field1314.field2361;
		var0.field1071 = var0.field1314.field2333;
		var0.field1124 = var0.field1314.field2334;
		var0.field1057 = var0.field1314.field2335;
		var0.field1132 = var0.field1314.field2336;
		var0.field1079 = var0.field1314.field2324;
	}

	@ObfInfo(owner = "fo", name = "lt", desc = "(Ldt;Lde;IILjv;I)V", opaque = "-1348256196")
	public static void method3225(Class98 var0, Class83 var1, int var2, int var3, Class256 var4) {
		int var6 = var1.field1080[0];
		int var7 = var1.field1127[0];
		int var8 = var1.method2258();
		if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8) {
			if (var2 >= var8 && var2 < 104 - var8 && var3 >= var8 && var3 < 104 - var8) {
				Class254 var9 = field728;
				int var12 = var1.method2258();
				field787.field2673 = var2;
				field787.field2672 = var3;
				field787.field2671 = 1;
				field787.field2674 = 1;
				Class58 var13 = field787;
				int var14 = var9.method4869(var6, var7, var12, var13, var0.field1284[var1.field1023], true, field788, field789);
				if (var14 >= 1) {
					for (int var15 = 0; var15 < var14 - 1; ++var15) {
						var1.method2263(field788[var15], field789[var15], var4);
					}

				}
			}
		}
	}

	@ObfInfo(owner = "nd", name = "lr", desc = "(S)V")
	public static void method6662() {
		field629 = 0;
		field628 = false;
	}

	@ObfInfo(owner = "bg", name = "lw", desc = "(S)V")
	public static void method717() {
		method6662();
		field635[0] = -1;
		field636[0] = Class378.field4208;
		field637[0] = "";
		field632[0] = 1006;
		field638[0] = false;
		field629 = 1;
	}

	@ObfInfo(owner = "fu", name = "lk", desc = "(S)Z")
	public static boolean method3273() {
		return field628;
	}

	@ObfInfo(owner = "sa", name = "lx", desc = "(IIIII)V", opaque = "-473293718")
	public static void method8613(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < field701; ++var5) {
			if (field708[var5] + field722[var5] > var0 && field722[var5] < var2 + var0 && field707[var5] + field757[var5] > var1 && field707[var5] < var3 + var1) {
				field614[var5] = true;
			}
		}

	}

	@ObfInfo(owner = "fb", name = "lj", desc = "(II)V")
	public static void method3065(int var0) {
		if (var0 >= 0) {
			int var2 = field630[var0];
			int var3 = field631[var0];
			int var4 = field632[var0];
			int var5 = field633[var0];
			int var6 = field635[var0];
			int var7 = field634[var0];
			String var8 = field636[var0];
			String var9 = field637[var0];
			method2917(var2, var3, var4, var5, var7, var6, var8, var9, Class33.field238, Class33.field239);
		}
	}

	@ObfInfo(owner = "fy", name = "lm", desc = "(Lcj;III)V", opaque = "-789558975")
	public static void method3306(Class62 var0, int var1, int var2) {
		if (var0 != null) {
			method2917(var0.field459, var0.field452, var0.field453, var0.field455, var0.field456, var0.field457, var0.field458, var0.field454, var1, var2);
		}

	}

	@ObfInfo(owner = "el", name = "mb", desc = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V", opaque = "0")
	public static void method2917(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		Class98 var11 = null;
		if (var5 >= 0 && null != field3857.field1299[var5]) {
			var11 = field3857.field1299[var5].field4995;
		} else if (var5 == -1) {
			var11 = field3857;
		}

		if (var11 != null) {
			int var12 = var11.field1289;
			int var13 = var11.field1285;
			Class100[] var14 = var11.field1295;
			Class83[] var15 = var11.field1293;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			Class100 var16;
			Class316 var17;
			if (var2 == 7) {
				var16 = var14[var3];
				if (var16 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3306, field548.field1446);
					var17.field3374.method9433(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9590(field3090);
					var17.field3374.method9443(field26);
					var17.field3374.method9442(field1414);
					var17.field3374.method9443(var3);
					field548.method2897(var17);
				}
			}

			Class316 var18;
			Class340 var19;
			if (var2 == 24) {
				var19 = field25.method6718(var1);
				if (var19 != null) {
					boolean var22 = true;
					if (var19.field3681 > 0) {
						var22 = method7433(var19);
					}

					if (var22) {
						var18 = Class316.method3908(Class315.field3284, field548.field1446);
						var18.field3374.method9590(var1);
						field548.method2897(var18);
					}
				}
			}

			Class83 var20;
			if (var2 == 46) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3331, field548.field1446);
					var17.field3374.method9443(var3);
					var17.field3374.method9388(field721.method4342(82) ? 1 : 0);
					field548.method2897(var17);
				}
			}

			Class316 var21;
			if (var2 == 21) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3300, field548.field1446);
				var21.field3374.method9389(var12 + var0);
				var21.field3374.method9442(var3);
				var21.field3374.method9443(var13 + var1);
				var21.field3374.method9433(field721.method4342(82) ? 1 : 0);
				field548.method2897(var21);
			}

			if (var2 == 48) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3323, field548.field1446);
					var17.field3374.method9435(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9443(var3);
					field548.method2897(var17);
				}
			}

			if (var2 == 1002) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				var21 = Class316.method3908(Class315.field3368, field548.field1446);
				var21.field3374.method9442(var3);
				field548.method2897(var21);
			}

			int var23;
			Class340 var24;
			if (var2 == 29) {
				var21 = Class316.method3908(Class315.field3284, field548.field1446);
				var21.field3374.method9590(var1);
				field548.method2897(var21);
				var24 = field25.method6718(var1);
				if (var24 != null && var24.field3717 != null && var24.field3717[0][0] == 5) {
					var23 = var24.field3717[0][1];
					if (var24.field3804[0] != Class351.field3889[var23]) {
						Class351.field3889[var23] = var24.field3804[0];
						Class140.method3138(var23);
					}
				}
			}

			if (var2 == 45) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3301, field548.field1446);
					var17.field3374.method9442(var3);
					var17.field3374.method9496(field721.method4342(82) ? 1 : 0);
					field548.method2897(var17);
				}
			}

			if (var2 == 11) {
				var16 = var14[var3];
				if (var16 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3366, field548.field1446);
					var17.field3374.method9442(var3);
					var17.field3374.method9496(field721.method4342(82) ? 1 : 0);
					field548.method2897(var17);
				}
			}

			if (var2 == 15) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3362, field548.field1446);
					var17.field3374.method9433(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9389(var3);
					var17.field3374.method9459(field4348);
					var17.field3374.method9476(field595);
					var17.field3374.method9442(field487);
					field548.method2897(var17);
				}
			}

			if (var2 == 14) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3334, field548.field1446);
					var17.field3374.method9442(field26);
					var17.field3374.method9443(var3);
					var17.field3374.method9435(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9458(field3090);
					var17.field3374.method9389(field1414);
					field548.method2897(var17);
				}
			}

			if (var2 == 10) {
				var16 = var14[var3];
				if (var16 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3290, field548.field1446);
					var17.field3374.method9443(var3);
					var17.field3374.method9388(field721.method4342(82) ? 1 : 0);
					field548.method2897(var17);
				}
			}

			if (var2 == 3) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3356, field548.field1446);
				var21.field3374.method9442(var12 + var0);
				var21.field3374.method9496(field721.method4342(82) ? 1 : 0);
				var21.field3374.method9443(var13 + var1);
				var21.field3374.method9443(var3);
				field548.method2897(var21);
			}

			if (var2 == 49) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3294, field548.field1446);
					var17.field3374.method9388(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9476(var3);
					field548.method2897(var17);
				}
			}

			if (var2 == 4) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3310, field548.field1446);
				var21.field3374.method9476(var12 + var0);
				var21.field3374.method9443(var3);
				var21.field3374.method9476(var13 + var1);
				var21.field3374.method9496(field721.method4342(82) ? 1 : 0);
				field548.method2897(var21);
			}

			if (var2 == 26) {
				Class77.method2188();
			}

			if (var2 == 13) {
				var16 = var14[var3];
				if (var16 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3287, field548.field1446);
					var17.field3374.method9476(var3);
					var17.field3374.method9388(field721.method4342(82) ? 1 : 0);
					field548.method2897(var17);
				}
			}

			if (var2 == 50) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3275, field548.field1446);
					var17.field3374.method9496(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9442(var3);
					field548.method2897(var17);
				}
			}

			if (var2 == 1) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3314, field548.field1446);
				var21.field3374.method9458(field3090);
				var21.field3374.method9433(field721.method4342(82) ? 1 : 0);
				var21.field3374.method9442(field1414);
				var21.field3374.method9442(var12 + var0);
				var21.field3374.method9476(var13 + var1);
				var21.field3374.method9443(field26);
				var21.field3374.method9389(var3);
				field548.method2897(var21);
			}

			if (var2 == 2) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3353, field548.field1446);
				var21.field3374.method9443(field487);
				var21.field3374.method9556(field4348);
				var21.field3374.method9388(field721.method4342(82) ? 1 : 0);
				var21.field3374.method9443(var13 + var1);
				var21.field3374.method9442(var12 + var0);
				var21.field3374.method9442(var3);
				var21.field3374.method9443(field595);
				field548.method2897(var21);
			}

			if (var2 == 8) {
				var16 = var14[var3];
				if (var16 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3288, field548.field1446);
					var17.field3374.method9433(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9442(field595);
					var17.field3374.method9590(field4348);
					var17.field3374.method9443(var3);
					var17.field3374.method9389(field487);
					field548.method2897(var17);
				}
			}

			if (var2 == 51) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3348, field548.field1446);
					var17.field3374.method9435(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9443(var3);
					field548.method2897(var17);
				}
			}

			if (var2 == 58) {
				var19 = field25.method6721(var1, var0);
				if (var19 != null) {
					if (var19.field3819 != null) {
						Class101 var25 = new Class101();
						var25.field1325 = var19;
						var25.field1328 = var3;
						var25.field1327 = var7;
						var25.field1333 = var19.field3819;
						Class72.method7210(var25);
					}

					var17 = Class316.method3908(Class315.field3351, field548.field1446);
					var17.field3374.method9556(var1);
					var17.field3374.method9476(field595);
					var17.field3374.method9476(var0);
					var17.field3374.method9389(field487);
					var17.field3374.method9590(field4348);
					var17.field3374.method9476(var4);
					field548.method2897(var17);
				}
			}

			if (var2 == 47) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3304, field548.field1446);
					var17.field3374.method9496(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9389(var3);
					field548.method2897(var17);
				}
			}

			if (var2 == 28) {
				var21 = Class316.method3908(Class315.field3284, field548.field1446);
				var21.field3374.method9590(var1);
				field548.method2897(var21);
				var24 = field25.method6718(var1);
				if (var24 != null && var24.field3717 != null && 5 == var24.field3717[0][0]) {
					var23 = var24.field3717[0][1];
					Class351.field3889[var23] = 1 - Class351.field3889[var23];
					Class140.method3138(var23);
				}
			}

			if (var2 == 1001) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3272, field548.field1446);
				var21.field3374.method9443(var13 + var1);
				var21.field3374.method9443(var3);
				var21.field3374.method9388(field721.method4342(82) ? 1 : 0);
				var21.field3374.method9443(var12 + var0);
				field548.method2897(var21);
			}

			if (var2 == 44) {
				var20 = var15[var3];
				if (var20 != null) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var17 = Class316.method3908(Class315.field3271, field548.field1446);
					var17.field3374.method9435(field721.method4342(82) ? 1 : 0);
					var17.field3374.method9443(var3);
					field548.method2897(var17);
				}
			}

			if (var2 == 30 && field533 == null) {
				method844(var1, var0);
				field533 = field25.method6721(var1, var0);
				Class317.method6187(field533);
			}

			if (var2 == 57 || var2 == 1007) {
				var19 = field25.method6721(var1, var0);
				if (var19 != null) {
					method7098(var3, var1, var0, var4, var7);
				}
			}

			if (var2 == 16) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3345, field548.field1446);
				var21.field3374.method9443(var13 + var1);
				var21.field3374.method9476(field1414);
				var21.field3374.method9443(field26);
				var21.field3374.method9458(field3090);
				var21.field3374.method9476(var3);
				var21.field3374.method9496(field721.method4342(82) ? 1 : 0);
				var21.field3374.method9443(var12 + var0);
				field548.method2897(var21);
			}

			if (var2 == 20) {
				field698 = var8;
				field604 = var9;
				field735 = 2;
				field605 = 0;
				field734 = var0;
				field594 = var1;
				var21 = Class316.method3908(Class315.field3325, field548.field1446);
				var21.field3374.method9433(field721.method4342(82) ? 1 : 0);
				var21.field3374.method9442(var3);
				var21.field3374.method9443(var12 + var0);
				var21.field3374.method9389(var13 + var1);
				field548.method2897(var21);
			}

			if (var2 == 25) {
				var19 = field25.method6721(var1, var0);
				if (var19 != null) {
					method2176();
					method7191(var1, var0, Class344.method3653(method3511(var19)), var4);
					field702 = 0;
					field651 = Class118.method2931(var19);
					if (field651 == null) {
						field651 = Class378.field4152;
					}

					if (var19.field3675) {
						field578 = var19.field3785 + Class113.method8551(16777215);
					} else {
						field578 = Class113.method8551(65280) + var19.field3710 + Class113.method8551(16777215);
					}
				}

			} else {
				if (var2 == 23) {
					if (field628) {
						field3857.field1283.method4981();
					} else {
						field3857.field1283.method4980(field3857.field1300, var0, var1, true);
					}

					for (int var28 = 0; var28 < field3857.field1286; ++var28) {
						Class488 var26 = field3857.field1299[field3857.field1302[var28]];
						if (var26 != null) {
							if (field628) {
								var26.field4995.field1283.method4981();
							} else {
								var26.field4995.field1283.method4980(var26.field4995.field1300, var0, var1, true);
							}
						}
					}
				}

				if (var2 == 6) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var21 = Class316.method3908(Class315.field3276, field548.field1446);
					var21.field3374.method9433(field721.method4342(82) ? 1 : 0);
					var21.field3374.method9442(var3);
					var21.field3374.method9442(var12 + var0);
					var21.field3374.method9443(var13 + var1);
					field548.method2897(var21);
				}

				if (var2 == 17) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var21 = Class316.method3908(Class315.field3367, field548.field1446);
					var21.field3374.method9442(field595);
					var21.field3374.method9442(var3);
					var21.field3374.method9443(var12 + var0);
					var21.field3374.method9442(field487);
					var21.field3374.method9433(field721.method4342(82) ? 1 : 0);
					var21.field3374.method9389(var13 + var1);
					var21.field3374.method9556(field4348);
					field548.method2897(var21);
				}

				if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
					field104.method9046(var2, var3, new Class348(var0), new Class348(var1));
				}

				if (var2 == 22) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var21 = Class316.method3908(Class315.field3296, field548.field1446);
					var21.field3374.method9476(var3);
					var21.field3374.method9476(var12 + var0);
					var21.field3374.method9496(field721.method4342(82) ? 1 : 0);
					var21.field3374.method9443(var13 + var1);
					field548.method2897(var21);
				}

				if (var2 == 12) {
					var16 = var14[var3];
					if (var16 != null) {
						field698 = var8;
						field604 = var9;
						field735 = 2;
						field605 = 0;
						field734 = var0;
						field594 = var1;
						var17 = Class316.method3908(Class315.field3358, field548.field1446);
						var17.field3374.method9435(field721.method4342(82) ? 1 : 0);
						var17.field3374.method9443(var3);
						field548.method2897(var17);
					}
				}

				if (var2 == 19) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var21 = Class316.method3908(Class315.field3297, field548.field1446);
					var21.field3374.method9389(var3);
					var21.field3374.method9433(field721.method4342(82) ? 1 : 0);
					var21.field3374.method9443(var12 + var0);
					var21.field3374.method9476(var13 + var1);
					field548.method2897(var21);
				}

				if (var2 == 5) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var21 = Class316.method3908(Class315.field3363, field548.field1446);
					var21.field3374.method9496(field721.method4342(82) ? 1 : 0);
					var21.field3374.method9476(var13 + var1);
					var21.field3374.method9442(var12 + var0);
					var21.field3374.method9389(var3);
					field548.method2897(var21);
				}

				if (var2 == 1004) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					var21 = Class316.method3908(Class315.field3299, field548.field1446);
					var21.field3374.method9476(var12 + var0);
					var21.field3374.method9442(var13 + var1);
					var21.field3374.method9389(var3);
					field548.method2897(var21);
				}

				if (var2 == 18) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					field734 = var0;
					field594 = var1;
					var21 = Class316.method3908(Class315.field3281, field548.field1446);
					var21.field3374.method9389(var12 + var0);
					var21.field3374.method9388(field721.method4342(82) ? 1 : 0);
					var21.field3374.method9442(var13 + var1);
					var21.field3374.method9476(var3);
					field548.method2897(var21);
				}

				if (var2 == 1003) {
					field698 = var8;
					field604 = var9;
					field735 = 2;
					field605 = 0;
					var16 = var14[var3];
					if (var16 != null) {
						Class225 var27 = var16.field1314;
						if (var27.field2351 != null) {
							var27 = var27.method4249();
						}

						if (var27 != null) {
							var18 = Class316.method3908(Class315.field3338, field548.field1446);
							var18.field3374.method9443(var27.field2318);
							field548.method2897(var18);
						}
					}
				}

				if (var2 == 9) {
					var16 = var14[var3];
					if (var16 != null) {
						field698 = var8;
						field604 = var9;
						field735 = 2;
						field605 = 0;
						field734 = var0;
						field594 = var1;
						var17 = Class316.method3908(Class315.field3303, field548.field1446);
						var17.field3374.method9443(var3);
						var17.field3374.method9496(field721.method4342(82) ? 1 : 0);
						field548.method2897(var17);
					}
				}

				if (0 != field702) {
					field702 = 0;
					Class317.method6187(field25.method6718(field3090));
				}

				if (field648) {
					method2176();
				}

			}
		}
	}

	@ObfInfo(owner = "db", name = "mh", desc = "(ILjava/lang/String;I)V", opaque = "1756721827")
	public static void method2223(int var0, String var1) {
		int var3 = field107.field1007.field1288.field1392;
		int[] var4 = field107.field1007.field1288.field1393;
		boolean var5 = false;
		Class567 var6 = new Class567(var1, field2627);

		for (int var7 = 0; var7 < var3; ++var7) {
			Class83 var8 = field107.field1007.field1293[var4[var7]];
			if (var8 != null && field107 != var8 && var8.field1025 != null && var8.field1025.equals(var6)) {
				Class316 var9;
				if (var0 == 1) {
					var9 = Class316.method3908(Class315.field3271, field548.field1446);
					var9.field3374.method9435(0);
					var9.field3374.method9443(var4[var7]);
					field548.method2897(var9);
				} else if (var0 == 4) {
					var9 = Class316.method3908(Class315.field3304, field548.field1446);
					var9.field3374.method9496(0);
					var9.field3374.method9389(var4[var7]);
					field548.method2897(var9);
				} else if (var0 == 6) {
					var9 = Class316.method3908(Class315.field3294, field548.field1446);
					var9.field3374.method9388(0);
					var9.field3374.method9476(var4[var7]);
					field548.method2897(var9);
				} else if (var0 == 7) {
					var9 = Class316.method3908(Class315.field3275, field548.field1446);
					var9.field3374.method9496(0);
					var9.field3374.method9442(var4[var7]);
					field548.method2897(var9);
				}

				var5 = true;
				break;
			}
		}

		if (!var5) {
			Class128.method2747(4, "", Class378.field4309 + var1);
		}

	}

	@ObfInfo(owner = "ol", name = "mv", desc = "(IIIII)V", opaque = "1569611752")
	public static void method7191(int var0, int var1, int var2, int var3) {
		Class340 var5 = field25.method6721(var0, var1);
		if (var5 != null && var5.field3688 != null) {
			Class101 var6 = new Class101();
			var6.field1325 = var5;
			var6.field1333 = var5.field3688;
			Class72.method7210(var6);
		}

		field487 = var3;
		field648 = true;
		field4348 = var0;
		field595 = var1;
		field4587 = var2;
		Class317.method6187(var5);
	}

	@ObfInfo(owner = "cy", name = "mq", desc = "(I)V", opaque = "1165354324")
	public static void method2176() {
		if (field648) {
			Class340 var1 = field25.method6721(field4348, field595);
			if (var1 != null && var1.field3776 != null) {
				Class101 var2 = new Class101();
				var2.field1325 = var1;
				var2.field1333 = var1.field3776;
				Class72.method7210(var2);
			}

			field487 = -1;
			field648 = false;
			Class317.method6187(var1);
		}
	}

	@ObfInfo(owner = "bq", name = "mf", desc = "(III)V")
	public static void method844(int var0, int var1) {
		Class316 var3 = Class316.method3908(Class315.field3321, field548.field1446);
		var3.field3374.method9459(var0);
		var3.field3374.method9476(var1);
		field548.method2897(var3);
	}

	@ObfInfo(owner = "nv", name = "mi", desc = "(IIIILjava/lang/String;I)V", opaque = "580704416")
	public static void method7098(int var0, int var1, int var2, int var3, String var4) {
		Class340 var6 = field25.method6721(var1, var2);
		if (var6 != null) {
			if (var6.field3672 != null) {
				Class101 var7 = new Class101();
				var7.field1325 = var6;
				var7.field1328 = var0;
				var7.field1327 = var4;
				var7.field1333 = var6.field3672;
				Class72.method7210(var7);
			}

			boolean var9 = true;
			if (var6.field3681 > 0) {
				var9 = method7433(var6);
			}

			if (var9) {
				if (Class344.method3212(method3511(var6), var0 - 1)) {
					Class316 var8;
					if (var0 == 1) {
						var8 = Class316.method3908(Class315.field3349, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 2) {
						var8 = Class316.method3908(Class315.field3277, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 3) {
						var8 = Class316.method3908(Class315.field3357, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 4) {
						var8 = Class316.method3908(Class315.field3336, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 5) {
						var8 = Class316.method3908(Class315.field3340, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 6) {
						var8 = Class316.method3908(Class315.field3364, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 7) {
						var8 = Class316.method3908(Class315.field3317, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 8) {
						var8 = Class316.method3908(Class315.field3322, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 9) {
						var8 = Class316.method3908(Class315.field3341, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

					if (var0 == 10) {
						var8 = Class316.method3908(Class315.field3307, field548.field1446);
						var8.field3374.method9590(var1);
						var8.field3374.method9389(var2);
						var8.field3374.method9389(var3);
						field548.method2897(var8);
					}

				}
			}
		}
	}

	@ObfInfo(owner = "hx", name = "md", desc = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)V", opaque = "33")
	public static void method3958(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (!field628) {
			if (field629 < 500) {
				field636[field629] = var0;
				field637[field629] = var1;
				field632[field629] = var2;
				field633[field629] = var3;
				field630[field629] = var4;
				field631[field629] = var5;
				field634[field629] = var6;
				field635[field629] = var8;
				field638[field629] = var7;
				++field629;
			}

		}
	}

	@ObfInfo(owner = "gy", name = "mz", desc = "(I)I")
	public static int method3634() {
		return field629 - 1;
	}

	@ObfInfo(owner = "fn", name = "mj", desc = "(IIIII)V", opaque = "634074387")
	public static void method3186(int var0, int var1, int var2, int var3) {
		if (0 == field702 && !field648) {
			Class7.method93(Class378.field4315, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		int var7 = 0;
		long var8 = -1L;

		int var10;
		for (var10 = 0; var10 < Class274.method3812(); ++var10) {
			long var11 = Class274.field3027[var10];
			if (var8 != var11) {
				var8 = var11;
				long var17 = Class274.field3027[var10];
				int var16 = (int)(var17 >>> 0 & 127L);
				int var15 = var16;
				int var32 = Class274.method6117(Class274.field3027[var10]);
				int var19 = Class274.method3001(Class274.field3027[var10]);
				int var21 = Class274.method2942(Class274.field3027[var10]);
				int var23 = Class274.method5913(var10);
				if (var23 == 2047) {
					var23 = -1;
				}

				Class98 var24 = null;
				if (var23 >= 0 && null != field3857.field1299[var23]) {
					var24 = field3857.field1299[var23].field4995;
				} else if (var23 == -1) {
					var24 = field3857;
				}

				if (var24 != null) {
					int var25 = var24.field1300;
					int var29;
					if (var19 == 2 && var24.field1283.method5003(var25, var16, var32, var11) >= 0) {
						Class222 var26 = Class222.method4161(var21);
						if (var26.field2278 != null) {
							var26 = var26.method4181();
						}

						if (var26 == null) {
							continue;
						}

						Class89 var27 = null;

						for (Class89 var28 = (Class89)var24.field1294.method7482(); var28 != null; var28 = (Class89)var24.field1294.method7490()) {
							if (var25 == var28.field1195 && var15 == var28.field1187 && var32 == var28.field1191 && var21 == var28.field1188) {
								var27 = var28;
								break;
							}
						}

						if (field702 == 1) {
							method3958(Class378.field4310, field503 + " " + Class113.field1424 + " " + Class113.method8551(65535) + var26.field2247, 1, var21, var15, var32, -1, false, var23);
						} else if (field648) {
							if (4 == (field4587 & 4)) {
								method3958(field651, field578 + " " + Class113.field1424 + " " + Class113.method8551(65535) + var26.field2247, 2, var21, var15, var32, -1, false, var23);
							}
						} else {
							String[] var37 = var26.field2264;
							if (var37 != null) {
								for (var29 = 4; var29 >= 0; --var29) {
									if ((var27 == null || var27.method2401(var29)) && var37[var29] != null) {
										short var30 = 0;
										if (var29 == 0) {
											var30 = 3;
										}

										if (var29 == 1) {
											var30 = 4;
										}

										if (var29 == 2) {
											var30 = 5;
										}

										if (var29 == 3) {
											var30 = 6;
										}

										if (var29 == 4) {
											var30 = 1001;
										}

										method3958(var37[var29], Class113.method8551(65535) + var26.field2247, var30, var21, var15, var32, -1, false, var23);
									}
								}
							}

							method3958(Class378.field4311, Class113.method8551(65535) + var26.field2247, 1002, var26.field2244, var15, var32, -1, false, var23);
						}
					}

					int var36;
					Class100 var38;
					int[] var39;
					Class83 var43;
					if (var19 == 1) {
						Class100 var33 = var24.field1295[var21];
						if (var33 == null) {
							continue;
						}

						if (1 == var33.field1314.field2320 && (var33.field1065 & 127) == 64 && (var33.field1126 & 127) == 64) {
							for (var36 = 0; var36 < var24.field1296; ++var36) {
								var38 = var24.field1295[var24.field1297[var36]];
								if (var38 != null && var38 != var33 && 1 == var38.field1314.field2320 && var38.field1065 == var33.field1065 && var33.field1126 == var38.field1126) {
									Class6.method72(var38, var24.field1297[var36], var15, var32, var23);
								}
							}

							var36 = var24.field1288.field1392;
							var39 = var24.field1288.field1393;

							for (var29 = 0; var29 < var36; ++var29) {
								var43 = var24.field1293[var39[var29]];
								if (var43 != null && var33.field1065 == var43.field1065 && var43.field1126 == var33.field1126) {
									Class41.method805(var43, var39[var29], var15, var32, var23);
								}
							}
						}

						Class6.method72(var33, var21, var15, var32, var23);
					}

					if (var19 == 0) {
						Class83 var34 = var24.field1293[var21];
						if (var34 == null) {
							continue;
						}

						if ((var34.field1065 & 127) == 64 && (var34.field1126 & 127) == 64) {
							for (var36 = 0; var36 < var24.field1296; ++var36) {
								var38 = var24.field1295[var24.field1297[var36]];
								if (var38 != null && var38.field1314.field2320 == 1 && var38.field1065 == var34.field1065 && var38.field1126 == var34.field1126) {
									Class6.method72(var38, var24.field1297[var36], var15, var32, var23);
								}
							}

							var36 = var24.field1288.field1392;
							var39 = var24.field1288.field1393;

							for (var29 = 0; var29 < var36; ++var29) {
								var43 = var24.field1293[var39[var29]];
								if (var43 != null && var43 != var34 && var34.field1065 == var43.field1065 && var34.field1126 == var43.field1126) {
									Class41.method805(var43, var39[var29], var15, var32, var23);
								}
							}
						}

						if (field622 != var21) {
							Class41.method805(var34, var21, var15, var32, var23);
						} else {
							var5 = var11;
							var7 = var23;
						}
					}

					if (var19 == 3) {
						Class401 var35 = var24.field1301[var25][var15][var32];
						if (var35 != null) {
							for (Class117 var40 = (Class117)var35.method7483(); var40 != null; var40 = (Class117)var35.method7504()) {
								Class232 var41 = Class232.method109(var40.field1465);
								if (field702 == 1) {
									method3958(Class378.field4310, field503 + " " + Class113.field1424 + " " + Class113.method8551(16748608) + var41.field2449, 16, var40.field1465, var15, var32, -1, false, var23);
								} else if (field648) {
									if ((field4587 & 1) == 1) {
										method3958(field651, field578 + " " + Class113.field1424 + " " + Class113.method8551(16748608) + var41.field2449, 17, var40.field1465, var15, var32, -1, false, var23);
									}
								} else {
									String[] var42 = var41.field2469;

									for (int var44 = 4; var44 >= 0; --var44) {
										if (var40.method2921(var44)) {
											if (var42 != null && var42[var44] != null) {
												byte var31 = 0;
												if (var44 == 0) {
													var31 = 18;
												}

												if (var44 == 1) {
													var31 = 19;
												}

												if (var44 == 2) {
													var31 = 20;
												}

												if (var44 == 3) {
													var31 = 21;
												}

												if (var44 == 4) {
													var31 = 22;
												}

												method3958(var42[var44], Class113.method8551(16748608) + var41.field2449, var31, var40.field1465, var15, var32, -1, false, var23);
											} else if (var44 == 2) {
												method3958(Class378.field4145, Class113.method8551(16748608) + var41.field2449, 20, var40.field1465, var15, var32, -1, false, var23);
											}
										}
									}

									method3958(Class378.field4311, Class113.method8551(16748608) + var41.field2449, 1004, var40.field1465, var15, var32, -1, false, var23);
								}
							}
						}
					}
				}
			}
		}

		if (-1L != var5) {
			var10 = (int)(var5 >>> 0 & 127L);
			int var12 = Class274.method6117(var5);
			Class83 var13 = field3857.field1293[field622];
			Class41.method805(var13, field622, var10, var12, var7);
		}

	}

	@ObfInfo(owner = "mq", name = "mo", desc = "(IIB)Ljava/lang/String;", opaque = "1")
	public static String method6269(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return Class113.method8551(16711680);
		} else if (var3 < -6) {
			return Class113.method8551(16723968);
		} else if (var3 < -3) {
			return Class113.method8551(16740352);
		} else if (var3 < 0) {
			return Class113.method8551(16756736);
		} else if (var3 > 9) {
			return Class113.method8551(65280);
		} else if (var3 > 6) {
			return Class113.method8551(4259584);
		} else if (var3 > 3) {
			return Class113.method8551(8453888);
		} else {
			return var3 > 0 ? Class113.method8551(12648192) : Class113.method8551(16776960);
		}
	}

	@ObfInfo(owner = "oo", name = "mk", desc = "(IIIIIIIIB)V", opaque = "0")
	public static void method7206(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field25.method6720(var0)) {
			field1925 = null;
			method7138(field25.field3877[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (field1925 != null) {
				method7138(field1925, -1412584499, var1, var2, var3, var4, field2007, field27, var7);
				field1925 = null;
			}

		} else {
			if (var7 != -1) {
				field614[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; ++var9) {
					field614[var9] = true;
				}
			}

		}
	}

	@ObfInfo(owner = "of", name = "mg", desc = "([Lnb;IIIIIIIII)V", opaque = "-697314448")
	public static void method7138(Class340[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Class561.method10144(var2, var3, var4, var5);
		Class253.method4851();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			Class340 var11 = var0[var10];
			if (var11 != null && (var1 == var11.field3826 || var1 == -1412584499 && field665 == var11)) {
				int var12;
				if (var8 == -1) {
					field722[field701] = var11.field3705 + var6;
					field707[field701] = var7 + var11.field3691;
					field708[field701] = var11.field3692;
					field757[field701] = var11.field3736;
					var12 = ++field701 - 1;
				} else {
					var12 = var8;
				}

				var11.field3821 = var12;
				var11.field3762 = field778;
				if (!var11.field3675 || !method6493(var11)) {
					if (var11.field3681 > 0) {
						Class176.method3589(var11);
					}

					int var13 = var6 + var11.field3705;
					int var14 = var11.field3691 + var7;
					int var15 = var11.field3708;
					int var16;
					int var17;
					if (field665 == var11) {
						if (var1 != -1412584499 && !var11.field3823) {
							field1925 = var0;
							field2007 = var6;
							field27 = var7;
							continue;
						}

						if (field676 && field692) {
							var16 = Class33.field229;
							var17 = Class33.field220;
							var16 -= field644;
							var17 -= field668;
							if (var16 < field671) {
								var16 = field671;
							}

							if (var16 + var11.field3692 > field671 + field666.field3692) {
								var16 = field666.field3692 + field671 - var11.field3692;
							}

							if (var17 < field753) {
								var17 = field753;
							}

							if (var17 + var11.field3736 > field753 + field666.field3736) {
								var17 = field753 + field666.field3736 - var11.field3736;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field3823) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					int var23;
					if (9 == var11.field3755) {
						var20 = var13;
						var21 = var14;
						var22 = var11.field3692 + var13;
						var23 = var11.field3736 + var14;
						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						if (var23 < var14) {
							var21 = var23;
							var23 = var14;
						}

						++var22;
						++var23;
						var16 = var20 > var2 ? var20 : var2;
						var17 = var21 > var3 ? var21 : var3;
						var18 = var22 < var4 ? var22 : var4;
						var19 = var23 < var5 ? var23 : var5;
					} else {
						var20 = var11.field3692 + var13;
						var21 = var11.field3736 + var14;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var20 < var4 ? var20 : var4;
						var19 = var21 < var5 ? var21 : var5;
					}

					if (!var11.field3675 || var16 < var18 && var17 < var19) {
						if (0 != var11.field3681) {
							if (var11.field3681 == 1336) {
								if (field4851.method2617()) {
									var14 += 15;
									field3127.method7995("Fps:" + Class31.field187, var13 + var11.field3692, var14, 16776960, -1);
									var14 += 15;
									Runtime var41 = Runtime.getRuntime();
									var21 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
									var22 = 16776960;
									if (var21 > 327680 && !field599) {
										var22 = 16711680;
									}

									field3127.method7995("Mem:" + var21 + "k", var13 + var11.field3692, var14, var22, -1);
									var14 += 15;
								}
								continue;
							}

							if (var11.field3681 == 1337) {
								field661 = var13;
								field643 = var14;
								method4636(var13, var14, var11.field3692, var11.field3736);
								field614[var11.field3821] = true;
								Class561.method10144(var2, var3, var4, var5);
								continue;
							}

							if (1338 == var11.field3681) {
								method3593(var11, var13, var14, var12);
								Class561.method10144(var2, var3, var4, var5);
								continue;
							}

							if (var11.field3681 == 1339) {
								method3145(var11, var13, var14, var12);
								Class561.method10144(var2, var3, var4, var5);
								continue;
							}

							if (1400 == var11.field3681) {
								field104.method9008(var13, var14, var11.field3692, var11.field3736, field778, field4851.method2621());
							}

							if (1401 == var11.field3681) {
								field104.method9098(var13, var14, var11.field3692, var11.field3736);
							}

							if (var11.field3681 == 1402) {
								field2695.method2366(var13, field778);
							}
						}

						if (0 == var11.field3755) {
							if (!var11.field3675 && method6493(var11) && field230 != var11) {
								continue;
							}

							if (!var11.field3675) {
								if (var11.field3699 > var11.field3701 - var11.field3736) {
									var11.field3699 = var11.field3701 - var11.field3736;
								}

								if (var11.field3699 < 0) {
									var11.field3699 = 0;
								}
							}

							method7138(var0, var11.field3676, var16, var17, var18, var19, var13 - var11.field3698, var14 - var11.field3699, var12);
							if (var11.field3745 != null) {
								method7138(var11.field3745, var11.field3676, var16, var17, var18, var19, var13 - var11.field3698, var14 - var11.field3699, var12);
							}

							Class104 var29 = (Class104)field654.method9361((long)var11.field3676);
							if (var29 != null) {
								method7206(var29.field1366, var16, var17, var18, var19, var13, var14, var12);
							}

							Class561.method10144(var2, var3, var4, var5);
							Class253.method4851();
						} else if (11 == var11.field3755) {
							if (method6493(var11) && field230 != var11) {
								continue;
							}

							if (var11.field3745 != null) {
								method7138(var11.field3745, var11.field3676, var16, var17, var18, var19, var13 - var11.field3698, var14 - var11.field3699, var12);
							}

							Class561.method10144(var2, var3, var4, var5);
							Class253.method4851();
						}

						if (field712 || field715[var12] || field710 > 1) {
							if (var11.field3755 == 0 && !var11.field3675 && var11.field3701 > var11.field3736) {
								method4745(var11.field3692 + var13, var14, var11.field3699, var11.field3736, var11.field3701);
							}

							if (1 != var11.field3755) {
								if (3 == var11.field3755) {
									if (Class252.method4780(var11)) {
										var20 = var11.field3703;
										if (field230 == var11 && var11.field3787 != 0) {
											var20 = var11.field3787;
										}
									} else {
										var20 = var11.field3702;
										if (field230 == var11 && var11.field3704 != 0) {
											var20 = var11.field3704;
										}
									}

									if (var11.field3706) {
										switch(var11.field3670.field5404) {
										case 1:
											Class561.method10221(var13, var14, var11.field3692, var11.field3736, var11.field3702, var11.field3703);
											break;
										case 2:
											Class561.method10162(var13, var14, var11.field3692, var11.field3736, var11.field3702, var11.field3703, 255 - (var11.field3708 & 255), 255 - (var11.field3709 & 255));
											break;
										default:
											if (var15 == 0) {
												Class561.method10152(var13, var14, var11.field3692, var11.field3736, var20);
											} else {
												Class561.method10151(var13, var14, var11.field3692, var11.field3736, var20, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										Class561.method10156(var13, var14, var11.field3692, var11.field3736, var20);
									} else {
										Class561.method10157(var13, var14, var11.field3692, var11.field3736, var20, 256 - (var15 & 255));
									}
								} else if (4 == var11.field3755) {
									Class418 var36 = var11.method6503(field25);
									if (var36 == null) {
										if (Class340.field3674) {
											Class317.method6187(var11);
										}
									} else {
										String var44 = var11.field3740;
										if (Class252.method4780(var11)) {
											var21 = var11.field3703;
											if (field230 == var11 && var11.field3787 != 0) {
												var21 = var11.field3787;
											}

											if (var11.field3741.length() > 0) {
												var44 = var11.field3741;
											}
										} else {
											var21 = var11.field3702;
											if (field230 == var11 && 0 != var11.field3704) {
												var21 = var11.field3704;
											}
										}

										if (var11.field3675 && -1 != var11.field3810) {
											Class232 var45 = Class232.method109(var11.field3810);
											var44 = var45.field2449;
											if (var44 == null) {
												var44 = Class378.field4152;
											}

											if ((1 == var45.field2462 || 1 != var11.field3811) && var11.field3811 != -1) {
												var44 = Class113.method8551(16748608) + var44 + Class113.field1421 + " " + 'x' + method4392(var11.field3811);
											}
										}

										if (field533 == var11) {
											var44 = Class378.field4318;
											var21 = var11.field3702;
										}

										if (!var11.field3675) {
											var44 = method9354(var44, var11);
										}

										var36.method7998(var44, var13, var14, var11.field3692, var11.field3736, var21, var11.field3751 ? 0 : -1, Class505.method9269(var11.field3708), var11.field3743, var11.field3744, var11.field3757);
									}
								} else {
									int var25;
									int var26;
									int var42;
									if (var11.field3755 == 5) {
										Class549 var32;
										if (!var11.field3675) {
											var32 = var11.method6588(field25, Class252.method4780(var11), field3381);
											if (var32 != null) {
												var32.method10023(var13, var14);
											} else if (Class340.field3674) {
												Class317.method6187(var11);
											}
										} else {
											if (-1 != var11.field3810) {
												var32 = Class232.method3405(var11.field3810, var11.field3811, var11.field3694, var11.field3718, var11.field3738, false);
											} else {
												var32 = var11.method6588(field25, false, field3381);
											}

											if (var32 == null) {
												if (Class340.field3674) {
													Class317.method6187(var11);
												}
											} else {
												var21 = var32.field5361;
												var22 = var32.field5358;
												if (!var11.field3693) {
													var23 = var11.field3692 * 4096 / var21;
													if (0 != var11.field3777) {
														var32.method9950(var11.field3692 / 2 + var13, var11.field3736 / 2 + var14, var11.field3777, var23);
													} else if (var15 != 0) {
														var32.method9939(var13, var14, var11.field3692, var11.field3736, 256 - (var15 & 255));
													} else if (var21 == var11.field3692 && var22 == var11.field3736) {
														var32.method10023(var13, var14);
													} else {
														var32.method9947(var13, var14, var11.field3692, var11.field3736);
													}
												} else {
													Class561.method10153(var13, var14, var13 + var11.field3692, var14 + var11.field3736);
													var23 = (var21 - 1 + var11.field3692) / var21;
													var42 = (var11.field3736 + (var22 - 1)) / var22;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var42; ++var26) {
															if (var11.field3777 != 0) {
																var32.method9950(var21 / 2 + var13 + var25 * var21, var22 / 2 + var26 * var22 + var14, var11.field3777, 4096);
															} else if (var15 != 0) {
																var32.method9937(var13 + var25 * var21, var26 * var22 + var14, 256 - (var15 & 255));
															} else {
																var32.method10023(var25 * var21 + var13, var14 + var26 * var22);
															}
														}
													}

													Class561.method10144(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var27;
										if (var11.field3755 == 6) {
											boolean var31 = Class252.method4780(var11);
											if (var31) {
												var21 = var11.field3726;
											} else {
												var21 = var11.field3725;
											}

											Class262 var37 = null;
											var23 = 0;
											if (-1 != var11.field3810) {
												Class232 var38 = Class232.method109(var11.field3810);
												if (var38 != null) {
													var38 = var38.method4419(var11.field3811);
													var37 = var38.method4418(1);
													if (var37 != null) {
														var37.method5173();
														var23 = var37.field2696 / 2;
													} else {
														Class317.method6187(var11);
													}
												}
											} else if (5 == var11.field3792) {
												if (0 == var11.field3722) {
													var37 = field771.method7086((Class211)null, -1, (Class211)null, -1);
												} else {
													var37 = field107.method1092();
												}
											} else if (7 == var11.field3792) {
												var37 = var11.field3764.method7086((Class211)null, -1, Class211.method4637(field107.field1061), field107.field1122);
											} else {
												Class223 var39 = null;
												if (6 == var11.field3792) {
													var25 = var11.field3722;
													if (var25 >= 0 && var25 < field3857.field1295.length) {
														Class100 var40 = field3857.field1295[var25];
														if (var40 != null && var40.field1314 != null) {
															var27 = var40.field1314.method4265();
															if (var27 != -1) {
																var11.field3722 = var27;
															}

															var39 = var40.method2536();
														}
													}
												} else if (2 == var11.field3792) {
													var25 = var11.field3722;
													var26 = Class225.method3256(var25).method4265();
													if (var26 != -1) {
														var11.field3722 = var26;
													}
												}

												Class211 var43 = null;
												var26 = -1;
												if (var21 != -1) {
													var43 = Class211.method4637(var21);
													var26 = var11.field3812;
												}

												var37 = var11.method6508(field25, var43, var26, var31, field107.field1029, var39);
												if (var37 == null && Class340.field3674) {
													Class317.method6187(var11);
												}
											}

											Class253.method4798(var11.field3692 / 2 + var13, var14 + var11.field3736 / 2);
											var42 = Class253.field2683[var11.field3729] * var11.field3732 >> 16;
											var25 = var11.field3732 * Class253.field2687[var11.field3729] >> 16;
											if (var37 != null) {
												if (!var11.field3675) {
													var37.method5288(0, var11.field3814, 0, var11.field3729, 0, var42, var25);
												} else {
													var37.method5173();
													if (var11.field3700) {
														var37.method5192(0, var11.field3814, var11.field3731, var11.field3729, var11.field3769, var11.field3784 + var42 + var23, var25 + var11.field3784, var11.field3732);
													} else {
														var37.method5288(0, var11.field3814, var11.field3731, var11.field3729, var11.field3769, var42 + var23 + var11.field3784, var25 + var11.field3784);
													}
												}
											}

											Class253.method4797();
										} else {
											Class418 var33;
											if (var11.field3755 == 8 && field2118 == var11 && field738 == field645) {
												var20 = 0;
												var21 = 0;
												var33 = field3127;
												String var35 = var11.field3740;

												String var24;
												for (var35 = method9354(var35, var11); var35.length() > 0; var21 += var33.field4730 + 1) {
													var25 = var35.indexOf(Class113.field1427);
													if (var25 != -1) {
														var24 = var35.substring(0, var25);
														var35 = var35.substring(var25 + 4);
													} else {
														var24 = var35;
														var35 = "";
													}

													var26 = var33.method8080(var24);
													if (var26 > var20) {
														var20 = var26;
													}
												}

												var20 += 6;
												var21 += 7;
												var25 = var11.field3692 + var13 - 5 - var20;
												var26 = 5 + var11.field3736 + var14;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var25 + var20 > var4) {
													var25 = var4 - var20;
												}

												if (var26 + var21 > var5) {
													var26 = var5 - var21;
												}

												Class561.method10152(var25, var26, var20, var21, 16777120);
												Class561.method10156(var25, var26, var20, var21, 0);
												var35 = var11.field3740;
												var27 = var33.field4730 + var26 + 2;

												for (var35 = method9354(var35, var11); var35.length() > 0; var27 += var33.field4730 + 1) {
													int var28 = var35.indexOf(Class113.field1427);
													if (var28 != -1) {
														var24 = var35.substring(0, var28);
														var35 = var35.substring(var28 + 4);
													} else {
														var24 = var35;
														var35 = "";
													}

													var33.method8017(var24, var25 + 3, var27, 0, -1);
												}
											}

											if (9 == var11.field3755) {
												if (var11.field3711) {
													var21 = var11.field3736 + var14;
													var22 = var13 + var11.field3692;
													var23 = var14;
												} else {
													var21 = var14;
													var22 = var13 + var11.field3692;
													var23 = var11.field3736 + var14;
												}

												if (var11.field3754 == 1) {
													Class561.method10220(var13, var21, var22, var23, var11.field3702);
												} else {
													method1111(var13, var21, var22, var23, var11.field3702, var11.field3754);
												}
											} else if (var11.field3755 == 12) {
												Class354 var30 = var11.method6530();
												Class364 var34 = var11.method6531();
												if (var30 != null && var34 != null && var30.method6809()) {
													var33 = var11.method6503(field25);
													if (var33 != null) {
														field695.method10306(var13, var14, var11.field3692, var11.field3736, var30.method6808(), var30.method6833(), var30.method6807(), var30.method6958(), var30.method6806());
														var23 = var11.field3751 ? var11.field3718 : -1;
														if (!var30.method6929() && var30.method6801().method8122()) {
															field695.method10299(var34.field3981, var23, var34.field3979, var34.field3980);
															field695.method10301(var30.method6802(), var33);
														} else {
															field695.method10299(var11.field3702, var23, var34.field3979, var34.field3980);
															field695.method10301(var30.method6801(), var33);
														}

														Class561.method10144(var2, var3, var4, var5);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(owner = "cj", name = "ms", desc = "(IIIIIII)V", opaque = "504095188")
	public static void method1111(int var0, int var1, int var2, int var3, int var4, int var5) {
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
			var0 -= Class561.field5424;
			var1 -= Class561.field5422;
			int var18 = var14 + var0;
			int var19 = var0 - var15;
			int var20 = var7 + var0 - var15;
			int var21 = var7 + var0 + var14;
			int var22 = var16 + var1;
			int var23 = var1 - var17;
			int var24 = var8 + var1 - var17;
			int var25 = var8 + var1 + var16;
			Class253.method4781(var18, var19, var20);
			Class253.method4831(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
			Class253.method4781(var18, var20, var21);
			Class253.method4831(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfInfo(owner = "tw", name = "mt", desc = "(Ljava/lang/String;Lnb;B)Ljava/lang/String;", opaque = "2")
	public static String method9354(String var0, Class340 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					String var5 = var0.substring(0, var4);
					int var7 = method9206(var1, var3 - 1);
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

	@ObfInfo(owner = "iu", name = "mw", desc = "(II)Ljava/lang/String;", opaque = "1961222206")
	public static String method4392(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + Class113.field1422 + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + Class113.method8551(65408) + var2.substring(0, var2.length() - 8) + Class378.field4321 + " " + Class113.field1423 + var2 + Class113.field1428 + Class113.field1421;
		} else {
			return var2.length() > 6 ? " " + Class113.method8551(16777215) + var2.substring(0, var2.length() - 4) + Class378.field4323 + " " + Class113.field1423 + var2 + Class113.field1428 + Class113.field1421 : " " + Class113.method8551(16776960) + var2 + Class113.field1421;
		}
	}

	@ObfInfo(owner = "fl", name = "my", desc = "([Lnb;Lnb;ZB)V", opaque = "-2")
	public static void method3152(Class340[] var0, Class340 var1, boolean var2) {
		int var4 = 0 != var1.field3800 ? var1.field3800 : var1.field3692;
		int var5 = var1.field3701 != 0 ? var1.field3701 : var1.field3736;
		method4162(var0, var1.field3676, var4, var5, var2);
		if (var1.field3745 != null) {
			method4162(var1.field3745, var1.field3676, var4, var5, var2);
		}

		Class104 var6 = (Class104)field654.method9361((long)var1.field3676);
		if (var6 != null) {
			method2209(var6.field1366, var4, var5, var2);
		}

		if (1337 == var1.field3681) {
		}

	}

	@ObfInfo(owner = "da", name = "mu", desc = "(IIIZI)V")
	public static void method2209(int var0, int var1, int var2, boolean var3) {
		if (field25.method6720(var0)) {
			method4162(field25.field3877[var0], -1, var1, var2, var3);
		}
	}

	@ObfInfo(owner = "ij", name = "mr", desc = "([Lnb;IIIZI)V", opaque = "-2085879982")
	public static void method4162(Class340[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			Class340 var7 = var0[var6];
			if (var7 != null && var7.field3826 == var1) {
				method7116(var7, var2, var3, var4);
				method27(var7, var2, var3);
				if (var7.field3698 > var7.field3800 - var7.field3692) {
					var7.field3698 = var7.field3800 - var7.field3692;
				}

				if (var7.field3698 < 0) {
					var7.field3698 = 0;
				}

				if (var7.field3699 > var7.field3701 - var7.field3736) {
					var7.field3699 = var7.field3701 - var7.field3736;
				}

				if (var7.field3699 < 0) {
					var7.field3699 = 0;
				}

				if (var7.field3755 == 0) {
					method3152(var0, var7, var4);
				}
			}
		}

	}

	@ObfInfo(owner = "ny", name = "mm", desc = "(Lnb;IIZI)V", opaque = "-1696669473")
	public static void method7116(Class340 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field3692;
		int var6 = var0.field3736;
		if (var0.field3778 == 0) {
			var0.field3692 = var0.field3728;
		} else if (1 == var0.field3778) {
			var0.field3692 = var1 - var0.field3728;
		} else if (2 == var0.field3778) {
			var0.field3692 = var1 * var0.field3728 >> 14;
		}

		if (var0.field3685 == 0) {
			var0.field3736 = var0.field3707;
		} else if (var0.field3685 == 1) {
			var0.field3736 = var2 - var0.field3707;
		} else if (var0.field3685 == 2) {
			var0.field3736 = var0.field3707 * var2 >> 14;
		}

		if (4 == var0.field3778) {
			var0.field3692 = var0.field3736 * var0.field3748 / var0.field3695;
		}

		if (4 == var0.field3685) {
			var0.field3736 = var0.field3695 * var0.field3692 / var0.field3748;
		}

		if (1337 == var0.field3681) {
			field541 = var0;
		}

		if (var0.field3755 == 12) {
			var0.method6530().method6758(var0.field3692, var0.field3736);
		}

		if (var3 && var0.field3802 != null && (var0.field3692 != var5 || var6 != var0.field3736)) {
			Class101 var7 = new Class101();
			var7.field1325 = var0;
			var7.field1333 = var0.field3802;
			field696.method7477(var7);
		}

	}

	@ObfInfo(owner = "ab", name = "ml", desc = "(Lnb;IIB)V", opaque = "0")
	public static void method27(Class340 var0, int var1, int var2) {
		if (var0.field3682 == 0) {
			var0.field3705 = var0.field3686;
		} else if (1 == var0.field3682) {
			var0.field3705 = var0.field3686 + (var1 - var0.field3692) / 2;
		} else if (2 == var0.field3682) {
			var0.field3705 = var1 - var0.field3692 - var0.field3686;
		} else if (3 == var0.field3682) {
			var0.field3705 = var1 * var0.field3686 >> 14;
		} else if (var0.field3682 == 4) {
			var0.field3705 = (var1 * var0.field3686 >> 14) + (var1 - var0.field3692) / 2;
		} else {
			var0.field3705 = var1 - var0.field3692 - (var1 * var0.field3686 >> 14);
		}

		if (0 == var0.field3683) {
			var0.field3691 = var0.field3687;
		} else if (var0.field3683 == 1) {
			var0.field3691 = (var2 - var0.field3736) / 2 + var0.field3687;
		} else if (var0.field3683 == 2) {
			var0.field3691 = var2 - var0.field3736 - var0.field3687;
		} else if (var0.field3683 == 3) {
			var0.field3691 = var2 * var0.field3687 >> 14;
		} else if (4 == var0.field3683) {
			var0.field3691 = (var2 * var0.field3687 >> 14) + (var2 - var0.field3736) / 2;
		} else {
			var0.field3691 = var2 - var0.field3736 - (var2 * var0.field3687 >> 14);
		}

	}

	@ObfInfo(owner = "an", name = "no", desc = "(Lnb;IIIIIII)V", opaque = "198415184")
	public static void method167(Class340 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field569) {
			field570 = 32;
		} else {
			field570 = 0;
		}

		field569 = false;
		int var8;
		if (1 == Class33.field227 || !field1468 && Class33.field227 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field3699 -= 4;
				Class317.method6187(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.field3699 += 4;
				Class317.method6187(var0);
			} else if (var5 >= var1 - field570 && var5 < field570 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var8 = (var3 - 32) * var3 / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field3699 = var9 * (var4 - var3) / var10;
				Class317.method6187(var0);
				field569 = true;
			}
		}

		if (field694 != 0) {
			var8 = var0.field3692;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field3699 += field694 * 45;
				Class317.method6187(var0);
			}
		}

	}

	@ObfInfo(owner = "jj", name = "ne", desc = "(IIIIII)V", opaque = "-1490857097")
	public static void method4745(int var0, int var1, int var2, int var3, int var4) {
		field1374[0].method10086(var0, var1);
		field1374[1].method10086(var0, var3 + var1 - 16);
		Class561.method10152(var0, var1 + 16, 16, var3 - 32, field717);
		int var6 = var3 * (var3 - 32) / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
		Class561.method10152(var0, var7 + var1 + 16, 16, var6, field566);
		Class561.method10185(var0, var7 + var1 + 16, var6, field620);
		Class561.method10185(var0 + 1, var7 + var1 + 16, var6, field620);
		Class561.method10200(var0, var7 + var1 + 16, 16, field620);
		Class561.method10200(var0, var1 + 17 + var7, 16, field620);
		Class561.method10185(var0 + 15, var7 + var1 + 16, var6, field484);
		Class561.method10185(var0 + 14, var1 + 17 + var7, var6 - 1, field484);
		Class561.method10200(var0, var6 + var1 + 15 + var7, 16, field484);
		Class561.method10200(var0 + 1, var6 + var1 + 14 + var7, 15, field484);
	}

	@ObfInfo(owner = "tc", name = "ns", desc = "(Lnb;IB)I", opaque = "0")
	public static int method9206(Class340 var0, int var1) {
		if (var0.field3717 != null && var1 < var0.field3717.length) {
			try {
				int[] var3 = var0.field3717[var1];
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
						var8 = field495[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = field624[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = field625[var3[var5++]];
					}

					int var10;
					Class340 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = field25.method6718(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!Class232.method109(var12).field2467 || field528)) {
							for (var13 = 0; var13 < var11.field3808.length; ++var13) {
								if (var12 + 1 == var11.field3808[var13]) {
									var8 += var11.field3669[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = Class351.field3889[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = Class380.field4466[field624[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = Class351.field3889[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = field107.field1020;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (Class380.field4464[var10]) {
								var8 += field624[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = field25.method6718(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!Class232.method109(var12).field2467 || field528)) {
							for (var13 = 0; var13 < var11.field3808.length; ++var13) {
								if (var11.field3808[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = field659;
					}

					if (var7 == 12) {
						var8 = field660;
					}

					if (var7 == 13) {
						var10 = Class351.field3889[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = Class351.method6175(var10);
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
						var8 = field3857.field1289 + (field107.field1065 >> 7);
					}

					if (var7 == 19) {
						var8 = (field107.field1126 >> 7) + field3857.field1285;
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

	@ObfInfo(owner = "an", name = "nr", desc = "(Lnb;I)V", opaque = "-520457283")
	public static void method169(Class340 var0) {
		String var2;
		int var3;
		int var4;
		if (1 == var0.field3788) {
			var2 = var0.field3807;
			var3 = var0.field3676;
			var4 = var0.field3810;
			method3958(var2, "", 24, 0, 0, var3, var4, false, -1);
		}

		int var5;
		String var11;
		if (var0.field3788 == 2 && !field648) {
			var2 = Class118.method2931(var0);
			if (var2 != null) {
				var11 = Class113.method8551(65280) + var0.field3710;
				var4 = var0.field3676;
				var5 = var0.field3810;
				method3958(var2, var11, 25, 0, -1, var4, var5, false, -1);
			}
		}

		if (3 == var0.field3788) {
			Class7.method93(Class378.field4319, "", 26, 0, 0, var0.field3676);
		}

		if (var0.field3788 == 4) {
			Class7.method93(var0.field3807, "", 28, 0, 0, var0.field3676);
		}

		if (var0.field3788 == 5) {
			Class7.method93(var0.field3807, "", 29, 0, 0, var0.field3676);
		}

		if (var0.field3788 == 6 && field533 == null) {
			Class7.method93(var0.field3807, "", 30, 0, -1, var0.field3676);
		}

		if (var0.field3675) {
			int var6;
			if (field648) {
				if (Class344.method3423(method3511(var0)) && (field4587 & 32) == 32) {
					var2 = field651;
					var11 = field578 + " " + Class113.field1424 + " " + var0.field3785;
					var4 = var0.field3791;
					var5 = var0.field3676;
					var6 = var0.field3810;
					method3958(var2, var11, 58, 0, var4, var5, var6, false, -1);
				}
			} else {
				for (int var10 = 9; var10 >= 5; --var10) {
					if (!Class344.method3212(method3511(var0), var10) && var0.field3672 == null) {
						var11 = null;
					} else if (var0.field3758 != null && var0.field3758.length > var10 && var0.field3758[var10] != null && var0.field3758[var10].trim().length() != 0) {
						var11 = var0.field3758[var10];
					} else {
						var11 = null;
					}

					if (var11 != null) {
						String var13 = var0.field3785;
						var6 = var10 + 1;
						int var7 = var0.field3791;
						int var8 = var0.field3676;
						int var9 = var0.field3810;
						method3958(var11, var13, 1007, var6, var7, var8, var9, false, -1);
					}
				}

				var2 = Class118.method2931(var0);
				if (var2 != null) {
					var11 = var0.field3785;
					var4 = var0.field3791;
					var5 = var0.field3676;
					var6 = var0.field3810;
					method3958(var2, var11, 25, 0, var4, var5, var6, false, -1);
				}

				for (var3 = 4; var3 >= 0; --var3) {
					String var12;
					if (!Class344.method3212(method3511(var0), var3) && var0.field3672 == null) {
						var12 = null;
					} else if (var0.field3758 != null && var0.field3758.length > var3 && var0.field3758[var3] != null && var0.field3758[var3].trim().length() != 0) {
						var12 = var0.field3758[var3];
					} else {
						var12 = null;
					}

					if (var12 != null) {
						method3958(var12, var0.field3785, 57, var3 + 1, var0.field3791, var0.field3676, var0.field3810, var0.field3752, -1);
					}
				}

				var4 = method3511(var0);
				boolean var14 = (var4 & 1) != 0;
				if (var14) {
					Class7.method93(Class378.field4426, "", 30, 0, var0.field3791, var0.field3676);
				}
			}
		}

	}

	@ObfInfo(owner = "hj", name = "nq", desc = "(ZI)V")
	public static void method3793(boolean var0) {
		field640 = var0;
	}

	@ObfInfo(owner = "qm", name = "nw", desc = "(I)Z")
	public static boolean method7960() {
		return field640;
	}

	@ObfInfo(owner = "hc", name = "nm", desc = "(IIIIIIII)V")
	public static void method3689(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field25.method6720(var0)) {
			method6161(field25.field3877[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfInfo(owner = "lx", name = "nj", desc = "([Lnb;IIIIIIIB)V", opaque = "1")
	public static void method6161(Class340[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			Class340 var10 = var0[var9];
			if (var10 != null && var10.field3826 == var1 && (var10.method6510() || method3511(var10) != 0 || field666 == var10)) {
				if (var10.field3675) {
					if (method6493(var10)) {
						continue;
					}
				} else if (var10.field3755 == 0 && field230 != var10 && method6493(var10)) {
					continue;
				}

				if (11 == var10.field3755) {
					if (var10.method6496(field25, field3381)) {
						if (var10.method6519()) {
							Class317.method6187(var10);
							method3152(var10.field3745, var10, true);
							var10.method6526().method3426().method3719(3, var10.method6526().method3438());
						}

						if (var10.field3801 != null) {
							Class101 var11 = new Class101();
							var11.field1325 = var10;
							var11.field1333 = var10.field3801;
							field696.method7477(var11);
						}
					}
				} else if (var10.field3755 == 12 && var10.method6535(field25)) {
					Class317.method6187(var10);
				}

				int var27 = var10.field3705 + var6;
				int var12 = var7 + var10.field3691;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (9 == var10.field3755) {
					var17 = var27;
					var18 = var12;
					var19 = var10.field3692 + var27;
					int var20 = var12 + var10.field3736;
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
					var17 = var27 + var10.field3692;
					var18 = var10.field3736 + var12;
					var13 = var27 > var2 ? var27 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var17 < var4 ? var17 : var4;
					var16 = var18 < var5 ? var18 : var5;
				}

				if (field665 == var10) {
					field673 = true;
					field674 = var27;
					field706 = var12;
				}

				boolean var28 = false;
				if (var10.field3730) {
					switch(field655) {
					case 0:
						var28 = true;
					case 1:
					default:
						break;
					case 2:
						if (var10.field3676 >>> 16 == field656) {
							var28 = true;
						}
						break;
					case 3:
						if (var10.field3676 == field656) {
							var28 = true;
						}
					}
				}

				if (var28 || !var10.field3675 || var13 < var15 && var14 < var16) {
					if (var10.field3675) {
						Class101 var29;
						if (var10.field3824) {
							if (Class33.field229 >= var13 && Class33.field220 >= var14 && Class33.field229 < var15 && Class33.field220 < var16) {
								for (var29 = (Class101)field696.method7482(); var29 != null; var29 = (Class101)field696.method7490()) {
									if (var29.field1323) {
										var29.method9277();
										var29.field1325.field3815 = false;
									}
								}

								method7120();
								if (0 == field2838) {
									field665 = null;
									field666 = null;
								}

								if (!field628) {
									method717();
								}
							}
						} else if (var10.field3825 && Class33.field229 >= var13 && Class33.field220 >= var14 && Class33.field229 < var15 && Class33.field220 < var16) {
							for (var29 = (Class101)field696.method7482(); var29 != null; var29 = (Class101)field696.method7490()) {
								if (var29.field1323 && var29.field1333 == var29.field1325.field3680) {
									var29.method9277();
								}
							}
						}
					}

					var18 = Class33.field229;
					var19 = Class33.field220;
					if (Class33.field237 != 0) {
						var18 = Class33.field238;
						var19 = Class33.field239;
					}

					boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
					if (1337 == var10.field3681) {
						if (!field499 && !field628 && var30) {
							method3186(var18, var19, var13, var14);
						}
					} else if (1338 == var10.field3681) {
						method168(var10, var27, var12);
					} else {
						if (1400 == var10.field3681) {
							field104.method9149(Class33.field229, Class33.field220, var30, var27, var12, var10.field3692, var10.field3736);
						}

						if (!field628 && var30) {
							if (var10.field3681 == 1400) {
								field104.method9044(var27, var12, var10.field3692, var10.field3736, var18, var19);
							} else {
								method169(var10);
							}
						}

						boolean var22;
						int var24;
						if (var28) {
							for (int var21 = 0; var21 < var10.field3753.length; ++var21) {
								var22 = false;
								boolean var23 = false;
								if (!var22 && null != var10.field3753[var21]) {
									for (var24 = 0; var24 < var10.field3753[var21].length; ++var24) {
										boolean var25 = false;
										if (var10.field3684 != null) {
											var25 = field721.method4342(var10.field3753[var21][var24]);
										}

										if (method3661(var10.field3753[var21][var24]) || var25) {
											var22 = true;
											if (var10.field3684 != null && var10.field3684[var21] > field778) {
												break;
											}

											byte var26 = var10.field3735[var21][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !field721.method4342(86) && !field721.method4342(82) && !field721.method4342(81)) && ((var26 & 2) == 0 || field721.method4342(86)) && (0 == (var26 & 1) || field721.method4342(82)) && (0 == (var26 & 4) || field721.method4342(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var21 < 10) {
										method7098(var21 + 1, var10.field3676, var10.field3791, var10.field3810, "");
									} else if (var21 == 10) {
										method2176();
										method7191(var10.field3676, var10.field3791, Class344.method3653(method3511(var10)), var10.field3810);
										field651 = Class118.method2931(var10);
										if (field651 == null) {
											field651 = Class378.field4152;
										}

										field578 = var10.field3785 + Class113.method8551(16777215);
									}

									var24 = var10.field3697[var21];
									if (var10.field3684 == null) {
										var10.field3684 = new int[var10.field3753.length];
									}

									if (var10.field3756 == null) {
										var10.field3756 = new int[var10.field3753.length];
									}

									if (var24 != 0) {
										if (0 == var10.field3684[var21]) {
											var10.field3684[var21] = var10.field3756[var21] + field778 + var24;
										} else {
											var10.field3684[var21] = var24 + field778;
										}
									} else {
										var10.field3684[var21] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && var10.field3684 != null) {
									var10.field3684[var21] = 0;
								}
							}
						}

						if (var10.field3675) {
							if (Class33.field229 >= var13 && Class33.field220 >= var14 && Class33.field229 < var15 && Class33.field220 < var16) {
								var30 = true;
							} else {
								var30 = false;
							}

							boolean var31 = false;
							if ((Class33.field227 == 1 || !field1468 && 4 == Class33.field227) && var30) {
								var31 = true;
							}

							var22 = false;
							if ((Class33.field237 == 1 || !field1468 && 4 == Class33.field237) && Class33.field238 >= var13 && Class33.field239 >= var14 && Class33.field238 < var15 && Class33.field239 < var16) {
								var22 = true;
							}

							if (var22) {
								method2517(var10, Class33.field238 - var27, Class33.field239 - var12);
							}

							if (var10.method6619()) {
								if (var22) {
									field699.method7477(new Class231(0, Class33.field229 - var27, Class33.field220 - var12, var10));
								}

								if (var31) {
									field699.method7477(new Class231(1, Class33.field229 - var27, Class33.field220 - var12, var10));
								}
							}

							if (var10.field3681 == 1400) {
								field104.method8993(var18, var19, var30 & var31, var30 & var22);
							}

							if (field665 != null && field665 != var10 && var30 && Class344.method345(method3511(var10))) {
								field669 = var10;
							}

							if (field666 == var10) {
								field692 = true;
								field671 = var27;
								field753 = var12 * 32669 * 715718325;
							}

							if (var10.field3822) {
								Class101 var32;
								if (var30 && 0 != field694 && var10.field3680 != null) {
									var32 = new Class101();
									var32.field1323 = true;
									var32.field1325 = var10;
									var32.field1329 = field694;
									var32.field1333 = var10.field3680;
									field696.method7477(var32);
								}

								if (field665 != null || field628) {
									var22 = false;
									var31 = false;
									var30 = false;
								}

								if (!var10.field3816 && var22) {
									var10.field3816 = true;
									if (var10.field3818 != null) {
										var32 = new Class101();
										var32.field1323 = true;
										var32.field1325 = var10;
										var32.field1326 = Class33.field238 - var27;
										var32.field1329 = Class33.field239 - var12;
										var32.field1333 = var10.field3818;
										field696.method7477(var32);
									}
								}

								if (var10.field3816 && var31 && var10.field3767 != null) {
									var32 = new Class101();
									var32.field1323 = true;
									var32.field1325 = var10;
									var32.field1326 = Class33.field229 - var27;
									var32.field1329 = Class33.field220 - var12;
									var32.field1333 = var10.field3767;
									field696.method7477(var32);
								}

								if (var10.field3816 && !var31) {
									var10.field3816 = false;
									if (var10.field3768 != null) {
										var32 = new Class101();
										var32.field1323 = true;
										var32.field1325 = var10;
										var32.field1326 = Class33.field229 - var27;
										var32.field1329 = Class33.field220 - var12;
										var32.field1333 = var10.field3768;
										field523.method7477(var32);
									}
								}

								if (var31 && var10.field3663 != null) {
									var32 = new Class101();
									var32.field1323 = true;
									var32.field1325 = var10;
									var32.field1326 = Class33.field229 - var27;
									var32.field1329 = Class33.field220 - var12;
									var32.field1333 = var10.field3663;
									field696.method7477(var32);
								}

								if (!var10.field3815 && var30) {
									var10.field3815 = true;
									if (var10.field3820 != null) {
										var32 = new Class101();
										var32.field1323 = true;
										var32.field1325 = var10;
										var32.field1326 = Class33.field229 - var27;
										var32.field1329 = Class33.field220 - var12;
										var32.field1333 = var10.field3820;
										field696.method7477(var32);
									}
								}

								if (var10.field3815 && var30 && var10.field3771 != null) {
									var32 = new Class101();
									var32.field1323 = true;
									var32.field1325 = var10;
									var32.field1326 = Class33.field229 - var27;
									var32.field1329 = Class33.field220 - var12;
									var32.field1333 = var10.field3771;
									field696.method7477(var32);
								}

								if (var10.field3815 && !var30) {
									var10.field3815 = false;
									if (var10.field3772 != null) {
										var32 = new Class101();
										var32.field1323 = true;
										var32.field1325 = var10;
										var32.field1326 = Class33.field229 - var27;
										var32.field1329 = Class33.field220 - var12;
										var32.field1333 = var10.field3772;
										field523.method7477(var32);
									}
								}

								if (var10.field3783 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3783;
									field697.method7477(var32);
								}

								int var35;
								Class101 var37;
								int var38;
								if (var10.field3827 != null && field719 > var10.field3786) {
									if (var10.field3781 != null && field719 - var10.field3786 <= 32) {
										label720:
										for (var38 = var10.field3786; var38 < field719; ++var38) {
											var24 = field678[var38 & 31];

											for (var35 = 0; var35 < var10.field3781.length; ++var35) {
												if (var10.field3781[var35] == var24) {
													var37 = new Class101();
													var37.field1325 = var10;
													var37.field1333 = var10.field3827;
													field696.method7477(var37);
													break label720;
												}
											}
										}
									} else {
										var32 = new Class101();
										var32.field1325 = var10;
										var32.field1333 = var10.field3827;
										field696.method7477(var32);
									}

									var10.field3786 = field719;
								}

								if (var10.field3779 != null && field681 > var10.field3690) {
									if (var10.field3780 != null && field681 - var10.field3690 <= 32) {
										label696:
										for (var38 = var10.field3690; var38 < field681; ++var38) {
											var24 = field755[var38 & 31];

											for (var35 = 0; var35 < var10.field3780.length; ++var35) {
												if (var10.field3780[var35] == var24) {
													var37 = new Class101();
													var37.field1325 = var10;
													var37.field1333 = var10.field3779;
													field696.method7477(var37);
													break label696;
												}
											}
										}
									} else {
										var32 = new Class101();
										var32.field1325 = var10;
										var32.field1333 = var10.field3779;
										field696.method7477(var32);
									}

									var10.field3690 = field681;
								}

								if (var10.field3715 != null && field683 > var10.field3671) {
									if (var10.field3782 != null && field683 - var10.field3671 <= 32) {
										label672:
										for (var38 = var10.field3671; var38 < field683; ++var38) {
											var24 = field682[var38 & 31];

											for (var35 = 0; var35 < var10.field3782.length; ++var35) {
												if (var24 == var10.field3782[var35]) {
													var37 = new Class101();
													var37.field1325 = var10;
													var37.field1333 = var10.field3715;
													field696.method7477(var37);
													break label672;
												}
											}
										}
									} else {
										var32 = new Class101();
										var32.field1325 = var10;
										var32.field1333 = var10.field3715;
										field696.method7477(var32);
									}

									var10.field3671 = field683;
								}

								if (field686 > var10.field3817 && var10.field3798 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3798;
									field696.method7477(var32);
								}

								if (field687 > var10.field3817 && var10.field3721 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3721;
									field696.method7477(var32);
								}

								if (field688 > var10.field3817 && var10.field3727 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3727;
									field696.method7477(var32);
								}

								if (field689 > var10.field3817 && var10.field3793 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3793;
									field696.method7477(var32);
								}

								if (field703 > var10.field3817 && var10.field3794 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3794;
									field696.method7477(var32);
								}

								if (field691 > var10.field3817 && var10.field3799 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3799;
									field696.method7477(var32);
								}

								if (field609 > var10.field3817 && var10.field3766 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3766;
									field696.method7477(var32);
								}

								if (field693 > var10.field3817 && var10.field3795 != null) {
									var32 = new Class101();
									var32.field1325 = var10;
									var32.field1333 = var10.field3795;
									field696.method7477(var32);
								}

								var10.field3817 = field677;
								if (var10.field3689 != null) {
									for (var38 = 0; var38 < field723; ++var38) {
										Class101 var36 = new Class101();
										var36.field1325 = var10;
										var36.field1330 = field725[var38];
										var36.field1332 = field724[var38];
										var36.field1333 = var10.field3689;
										field696.method7477(var36);
									}
								}

								Class101 var39;
								int[] var40;
								if (var10.field3789 != null) {
									var40 = field721.method4347();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new Class101();
										var39.field1325 = var10;
										var39.field1330 = var40[var24];
										var39.field1333 = var10.field3789;
										field696.method7477(var39);
									}
								}

								if (var10.field3790 != null) {
									var40 = field721.method4370();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new Class101();
										var39.field1325 = var10;
										var39.field1330 = var40[var24];
										var39.field1333 = var10.field3790;
										field696.method7477(var39);
									}
								}
							}
						}

						if (!var10.field3675) {
							if (field665 != null || field628) {
								continue;
							}

							if ((var10.field3805 >= 0 || 0 != var10.field3704) && Class33.field229 >= var13 && Class33.field220 >= var14 && Class33.field229 < var15 && Class33.field220 < var16) {
								if (var10.field3805 >= 0) {
									field230 = var0[var10.field3805];
								} else {
									field230 = var10;
								}
							}

							if (8 == var10.field3755 && Class33.field229 >= var13 && Class33.field220 >= var14 && Class33.field229 < var15 && Class33.field220 < var16) {
								field2118 = var10;
							}

							if (var10.field3701 > var10.field3736) {
								method167(var10, var27 + var10.field3692, var12, var10.field3736, var10.field3701, Class33.field229, Class33.field220);
							}
						}

						if (var10.field3755 == 0) {
							method6161(var0, var10.field3676, var13, var14, var15, var16, var27 - var10.field3698, var12 - var10.field3699);
							if (var10.field3745 != null) {
								method6161(var10.field3745, var10.field3676, var13, var14, var15, var16, var27 - var10.field3698, var12 - var10.field3699);
							}

							Class104 var33 = (Class104)field654.method9361((long)var10.field3676);
							if (var33 != null) {
								if (var33.field1364 == 0 && Class33.field229 >= var13 && Class33.field220 >= var14 && Class33.field229 < var15 && Class33.field220 < var16 && !field628) {
									for (Class101 var34 = (Class101)field696.method7482(); var34 != null; var34 = (Class101)field696.method7490()) {
										if (var34.field1323) {
											var34.method9277();
											var34.field1325.field3815 = false;
										}
									}

									if (field2838 == 0) {
										field665 = null;
										field666 = null;
									}

									if (!field628) {
										method717();
									}
								}

								method3689(var33.field1366, var13, var14, var15, var16, var27, var12);
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(owner = "ha", name = "nl", desc = "(II)Z", opaque = "1071137861")
	public static boolean method3661(int var0) {
		for (int var2 = 0; var2 < field723; ++var2) {
			if (field725[var2] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfInfo(owner = "ep", name = "nk", desc = "(III)V", opaque = "254301199")
	public static void method2961(int var0, int var1) {
		if (field25.method6720(var0)) {
			method2734(field25.field3877[var0], var1);
		}
	}

	@ObfInfo(owner = "dx", name = "nz", desc = "([Lnb;II)V", opaque = "774896882")
	public static void method2734(Class340[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			Class340 var4 = var0[var3];
			if (var4 != null) {
				if (var4.field3755 == 0) {
					if (var4.field3745 != null) {
						method2734(var4.field3745, var1);
					}

					Class104 var5 = (Class104)field654.method9361((long)var4.field3676);
					if (var5 != null) {
						method2961(var5.field1366, var1);
					}
				}

				Class101 var6;
				if (var1 == 0 && var4.field3796 != null) {
					var6 = new Class101();
					var6.field1325 = var4;
					var6.field1333 = var4.field3796;
					Class72.method7210(var6);
				}

				if (var1 == 1 && var4.field3797 != null) {
					if (var4.field3791 >= 0) {
						Class340 var7 = field25.method6718(var4.field3676);
						if (var7 == null || var7.field3745 == null || var4.field3791 >= var7.field3745.length || var4 != var7.field3745[var4.field3791]) {
							continue;
						}
					}

					var6 = new Class101();
					var6.field1325 = var4;
					var6.field1333 = var4.field3797;
					Class72.method7210(var6);
				}
			}
		}

	}

	@ObfInfo(owner = "du", name = "nu", desc = "(Lnb;III)V", opaque = "-1366895040")
	public static void method2517(Class340 var0, int var1, int var2) {
		if (field665 == null && !field628) {
			if (var0 != null) {
				Class340 var5 = Class16.method193(var0);
				if (var5 == null) {
					var5 = var0.field3759;
				}

				if (var5 != null) {
					field665 = var0;
					var5 = Class16.method193(var0);
					if (var5 == null) {
						var5 = var0.field3759;
					}

					field666 = var5;
					field644 = var1;
					field668 = var2;
					field2838 = 0;
					field676 = false;
					int var7 = field629 - 1;
					if (var7 != -1) {
						method1089(var7);
					}

					return;
				}
			}

		}
	}

	@ObfInfo(owner = "cf", name = "ny", desc = "(II)V")
	public static void method1089(int var0) {
		field3069 = new Class62();
		field3069.field459 = field630[var0];
		field3069.field452 = field631[var0];
		field3069.field453 = field632[var0];
		field3069.field455 = field633[var0];
		field3069.field456 = field634[var0];
		field3069.field458 = field636[var0];
		field3069.field454 = field637[var0];
		field3069.field457 = field635[var0];
	}

	@ObfInfo(owner = "hg", name = "nn", desc = "(III)V")
	public static void method3706(int var0, int var1) {
		method3306(field3069, var0, var1);
		field3069 = null;
	}

	@ObfInfo(owner = "di", name = "np", desc = "(I)V", opaque = "-1362359720")
	public static void method2384() {
		for (Class104 var1 = (Class104)field654.method9363(); var1 != null; var1 = (Class104)field654.method9364()) {
			int var2 = var1.field1366;
			if (field25.method6720(var2)) {
				boolean var3 = true;
				Class340[] var4 = field25.field3877[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (null != var4[var5]) {
						var3 = var4[var5].field3675;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field5170;
					Class340 var6 = field25.method6718(var5);
					if (var6 != null) {
						Class317.method6187(var6);
					}
				}
			}
		}

	}

	@ObfInfo(owner = "gz", name = "nh", desc = "(II)V", opaque = "203134411")
	public static void method3641(int var0) {
		if (field25.method6720(var0)) {
			Class340[] var2 = field25.field3877[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				Class340 var4 = var2[var3];
				if (var4 != null) {
					var4.field3812 = 0;
					var4.field3813 = 0;
				}
			}

		}
	}

	@ObfInfo(owner = "fa", name = "nb", desc = "(IB)V")
	public static void method3063(int var0) {
		if (field25.method6720(var0)) {
			method6310(field25.field3877[var0], -1);
		}
	}

	@ObfInfo(owner = "mv", name = "nf", desc = "([Lnb;IB)V", opaque = "-2")
	public static void method6310(Class340[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			Class340 var4 = var0[var3];
			if (var4 != null && var4.field3826 == var1 && (!var4.field3675 || !method6493(var4))) {
				if (var4.field3755 == 0) {
					if (!var4.field3675 && method6493(var4) && field230 != var4) {
						continue;
					}

					method6310(var0, var4.field3676);
					if (var4.field3745 != null) {
						method6310(var4.field3745, var4.field3676);
					}

					Class104 var5 = (Class104)field654.method9361((long)var4.field3676);
					if (var5 != null) {
						method3063(var5.field1366);
					}
				}

				if (6 == var4.field3755) {
					int var6;
					if (var4.field3725 != -1 || -1 != var4.field3726) {
						boolean var9 = Class252.method4780(var4);
						if (var9) {
							var6 = var4.field3726;
						} else {
							var6 = var4.field3725;
						}

						if (var6 != -1) {
							Class211 var7 = Class211.method4637(var6);
							if (!var7.method4038()) {
								for (var4.field3813 += field564; var4.field3813 > var7.field2139[var4.field3812]; Class317.method6187(var4)) {
									var4.field3813 -= var7.field2139[var4.field3812];
									++var4.field3812;
									if (var4.field3812 >= var7.field2142.length) {
										var4.field3812 -= var7.field2143;
										if (var4.field3812 < 0 || var4.field3812 >= var7.field2142.length) {
											var4.field3812 = 0;
										}
									}
								}
							} else {
								var4.field3812 += field564;
								int var8 = var7.method4005();
								if (var4.field3812 >= var8) {
									var4.field3812 -= var7.field2143;
									if (var4.field3812 < 0 || var4.field3812 >= var8) {
										var4.field3812 = 0;
									}
								}

								Class317.method6187(var4);
							}
						}
					}

					if (var4.field3734 != 0 && !var4.field3675) {
						int var10 = var4.field3734 >> 16;
						var6 = var4.field3734 << 16 >> 16;
						var10 *= field564;
						var6 *= field564;
						var4.field3729 = var4.field3729 + var10 & 2047;
						var4.field3814 = var6 + var4.field3814 & 2047;
						Class317.method6187(var4);
					}
				}
			}
		}

	}

	@ObfInfo(owner = "hx", name = "nd", desc = "(II)V", opaque = "1541825141")
	public static void method3956(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = (float)var0 / 200.0F + 0.5F;
		Class253.method4784((double)var2);
		((Class244)Class253.field2688.field3043).method4716((double)var2);
		if (field104 != null) {
			field104.method9134();
		}

		Class232.method3345();
		field4851.method2620((double)var2);
	}

	@ObfInfo(owner = "bg", name = "na", desc = "(I)I")
	public static int method715() {
		float var1 = 200.0F * ((float)field4851.method2621() - 0.5F);
		return 100 - Math.round(var1);
	}

	@ObfInfo(owner = "nj", name = "nx", desc = "(II)V", opaque = "1104055563")
	public static void method6714(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (field4851.method2637() != var0) {
			label54: {
				if (field4851.method2637() == 0) {
					boolean var2 = !Class332.field3456.isEmpty();
					if (var2) {
						Class332.method5915(field2961, var0);
						field737 = false;
						break label54;
					}
				}

				if (var0 == 0) {
					Class380.method7208(0, 0);
					field737 = false;
				} else if (!Class332.field3455.isEmpty()) {
					Iterator var4 = Class332.field3455.iterator();

					while (var4.hasNext()) {
						Class357 var3 = (Class357)var4.next();
						if (var3 != null) {
							var3.field3931 = var0;
						}
					}

					Class357 var5 = (Class357)Class332.field3455.get(0);
					if (var5 != null && var5.field3940 != null && var5.field3940.method6320() && !var5.field3943) {
						var5.field3940.method6400(var0);
						var5.field3935 = (float)var0;
					}
				}
			}

			field4851.method2622(var0);
		}

	}

	@ObfInfo(owner = "bn", name = "ni", desc = "(IB)V")
	public static void method795(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		field4851.method2624(var0);
	}

	@ObfInfo(name = "nc", desc = "(II)V")
	public static void method1773(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		field4851.method2626(var0);
	}

	@ObfInfo(owner = "kr", name = "op", desc = "(IIIB)Ldz;", opaque = "17")
	public static Class104 method5559(int var0, int var1, int var2) {
		Class104 var4 = new Class104();
		var4.field1366 = var1;
		var4.field1364 = var2;
		field654.method9360(var4, (long)var0);
		method3641(var1);
		Class340 var5 = field25.method6718(var0);
		Class317.method6187(var5);
		if (field533 != null) {
			Class317.method6187(field533);
			field533 = null;
		}

		method3152(field25.field3877[var0 >> 16], var5, false);
		Class72.method35(var1);
		if (-1 != field740) {
			method2961(field740, 1);
		}

		return var4;
	}

	@ObfInfo(owner = "bg", name = "ol", desc = "(Ldz;ZI)V", opaque = "-959959630")
	public static void method716(Class104 var0, boolean var1) {
		int var3 = var0.field1366;
		int var4 = (int)var0.field5170;
		var0.method9277();
		if (var1) {
			field25.method6722(var3);
		}

		method7135(var3);
		Class340 var5 = field25.method6718(var4);
		if (var5 != null) {
			Class317.method6187(var5);
		}

		if (field740 != -1) {
			method2961(field740, 1);
		}

	}

	@ObfInfo(owner = "pf", name = "oh", desc = "(Lnb;S)Z", opaque = "255")
	public static boolean method7433(Class340 var0) {
		int var2 = var0.field3681;
		if (var2 == 205) {
			field549 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				field771.method7077(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				field771.method7048(var3, var4 == 1);
			}

			if (var2 == 324) {
				field771.method7049(0);
			}

			if (var2 == 325) {
				field771.method7049(1);
			}

			if (var2 == 326) {
				Class316 var5 = Class316.method3908(Class315.field3355, field548.field1446);
				field771.method7050(var5.field3374);
				field548.method2897(var5);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfInfo(owner = "gu", name = "oe", desc = "(Lnb;IIIB)V", opaque = "8")
	public static void method3593(Class340 var0, int var1, int var2, int var3) {
		method4066();
		Class361 var5 = var0.method6512(field25, false);
		if (var5 != null) {
			Class561.method10144(var1, var2, var1 + var5.field3970, var2 + var5.field3968);
			if (field736 != 2 && 5 != field736) {
				int var6 = field572 & 2047;
				int var7 = 48 + field894.method2199() / 32;
				int var8 = 464 - field894.method2191() / 32;
				field1359.method9961(var1, var2, var5.field3970, var5.field3968, var7, var8, var6, 256, var5.field3967, var5.field3969);

				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < field733; ++var9) {
					var10 = 2 + 4 * field731[var9] - field894.method2199() / 32;
					var11 = 2 + field732[var9] * 4 - field894.method2191() / 32;
					method2418(var1, var2, var10, var11, field575[var9], var5);
				}

				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						Class401 var17 = field3857.field1301[field3857.field1300][var9][var10];
						if (var17 != null) {
							var12 = 2 + var9 * 4 - field894.method2199() / 32;
							var13 = var10 * 4 + 2 - field894.method2191() / 32;
							method2418(var1, var2, var12, var13, field2153[0], var5);
						}
					}
				}

				for (var9 = 0; var9 < field3857.field1296; ++var9) {
					Class100 var15 = field3857.field1295[field3857.field1297[var9]];
					if (var15 != null && var15.method2264()) {
						Class225 var18 = var15.field1314;
						if (var18 != null && var18.field2351 != null) {
							var18 = var18.method4249();
						}

						if (var18 != null && var18.field2343 && var18.field2354) {
							var12 = var15.field1065 / 32 - field894.method2199() / 32;
							var13 = var15.field1126 / 32 - field894.method2191() / 32;
							method2418(var1, var2, var12, var13, field2153[1], var5);
						}
					}
				}

				var9 = field3857.field1288.field1392;
				int[] var16 = field3857.field1288.field1393;

				for (var11 = 0; var11 < var9; ++var11) {
					Class83 var19 = field3857.field1293[var16[var11]];
					if (var19 != null && var19.method2264() && !var19.field1015 && field107 != var19) {
						var13 = var19.field1065 / 32 - field894.method2199() / 32;
						int var14 = var19.field1126 / 32 - field894.method2191() / 32;
						if (var19.method2250()) {
							method2418(var1, var2, var13, var14, field2153[3], var5);
						} else if (0 != field107.field1037 && 0 != var19.field1037 && field107.field1037 == var19.field1037) {
							method2418(var1, var2, var13, var14, field2153[4], var5);
						} else if (var19.method2253()) {
							method2418(var1, var2, var13, var14, field2153[5], var5);
						} else if (var19.method2293()) {
							method2418(var1, var2, var13, var14, field2153[6], var5);
						} else {
							method2418(var1, var2, var13, var14, field2153[2], var5);
						}
					}
				}

				if (0 != field742 && field778 % 20 < 10) {
					if (field742 == 1 && field568 >= 0 && field568 < field3857.field1295.length) {
						Class100 var20 = field3857.field1295[field568];
						if (var20 != null) {
							var12 = var20.field1065 / 32 - field894.method2199() / 32;
							var13 = var20.field1126 / 32 - field894.method2191() / 32;
							method2489(var1, var2, var12, var13, field1413[1], var5);
						}
					}

					if (field742 == 2) {
						var11 = 2 + (field727 * 4 - field3857.field1289 * 4) - field894.method2199() / 32;
						var12 = 2 + (field512 * 4 - field3857.field1285 * 4) - field894.method2191() / 32;
						method2489(var1, var2, var11, var12, field1413[1], var5);
					}

					if (field742 == 10 && field775 >= 0 && field775 < field3857.field1293.length) {
						Class83 var21 = field3857.field1293[field775];
						if (var21 != null) {
							var12 = var21.field1065 / 32 - field894.method2199() / 32;
							var13 = var21.field1126 / 32 - field894.method2191() / 32;
							method2489(var1, var2, var12, var13, field1413[1], var5);
						}
					}
				}

				if (field734 != 0) {
					var11 = field734 * 4 + 2 - field894.method2199() / 32;
					var12 = field594 * 4 + 2 - field894.method2191() / 32;
					method2418(var1, var2, var11, var12, field1413[0], var5);
				}

				if (!field107.field1015) {
					Class561.method10152(var1 + var5.field3970 / 2 - 1, var5.field3968 / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Class561.method10164(var1, var2, 0, var5.field3967, var5.field3969);
			}

			field704[var3] = true;
		}
	}

	@ObfInfo(owner = "fl", name = "oq", desc = "(Lnb;IIII)V", opaque = "-1592734627")
	public static void method3145(Class340 var0, int var1, int var2, int var3) {
		Class361 var5 = var0.method6512(field25, false);
		if (var5 != null) {
			if (field736 < 3) {
				field4958.method9961(var1, var2, var5.field3970, var5.field3968, 25, 25, field572, 256, var5.field3967, var5.field3969);
			} else {
				Class561.method10164(var1, var2, 0, var5.field3967, var5.field3969);
			}

		}
	}

	@ObfInfo(owner = "dq", name = "ob", desc = "(IIIILvc;Lnw;I)V", opaque = "-1021134086")
	public static void method2489(int var0, int var1, int var2, int var3, Class549 var4, Class361 var5) {
		int var7 = var2 * var2 + var3 * var3;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = field572 & 2047;
			int var9 = Class253.field2683[var8];
			int var10 = Class253.field2687[var8];
			int var11 = var10 * var2 + var9 * var3 >> 16;
			int var12 = var10 * var3 - var9 * var2 >> 16;
			double var13 = Math.atan2((double)var11, (double)var12);
			int var15 = var5.field3970 / 2 - 25;
			int var16 = (int)(Math.sin(var13) * (double)var15);
			int var17 = (int)(Math.cos(var13) * (double)var15);
			byte var18 = 20;
			field106.method10030(var5.field3970 / 2 + var0 - var18 / 2 + var16, var5.field3968 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
		} else {
			method2418(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfInfo(owner = "dn", name = "oz", desc = "(IIIILvc;Lnw;I)V", opaque = "206054039")
	public static void method2418(int var0, int var1, int var2, int var3, Class549 var4, Class361 var5) {
		if (var4 != null) {
			int var7 = field572 & 2047;
			int var8 = var2 * var2 + var3 * var3;
			if (var8 <= 6400) {
				int var9 = Class253.field2683[var7];
				int var10 = Class253.field2687[var7];
				int var11 = var10 * var2 + var9 * var3 >> 16;
				int var12 = var10 * var3 - var9 * var2 >> 16;
				if (var8 > 2500) {
					var4.method9975(var11 + var5.field3970 / 2 - var4.field5361 / 2, var5.field3968 / 2 - var12 - var4.field5358 / 2, var0, var1, var5.field3970, var5.field3968, var5.field3967, var5.field3969);
				} else {
					var4.method10023(var11 + var5.field3970 / 2 + var0 - var4.field5361 / 2, var1 + var5.field3968 / 2 - var12 - var4.field5358 / 2);
				}

			}
		}
	}

	@ObfInfo(owner = "dn", name = "ox", desc = "(B)V", opaque = "0")
	public static void method2419() {
		for (int var1 = 0; var1 < field3857.field1288.field1392; ++var1) {
			Class83 var2 = field3857.field1293[field3857.field1288.field1393[var1]];
			var2.method2251();
		}

		Iterator var3 = Class128.field1529.iterator();

		while (var3.hasNext()) {
			Class67 var4 = (Class67)var3.next();
			var4.method1826();
		}

		if (field1420 != null) {
			field1420.method8478();
		}

	}

	@ObfInfo(owner = "sv", name = "oy", desc = "(S)V", opaque = "16255")
	public static void method8938() {
		for (int var1 = 0; var1 < field3857.field1288.field1392; ++var1) {
			Class83 var2 = field3857.field1293[field3857.field1288.field1393[var1]];
			var2.method2257();
		}

	}

	@ObfInfo(owner = "oa", name = "on", desc = "(B)V")
	public static void method7124() {
		field689 = field677;
		field2680 = true;
	}

	@ObfInfo(owner = "ck", name = "ow", desc = "(Ljava/lang/String;I)V", opaque = "-450354972")
	public static void method1124(String var0) {
		if (field1420 != null) {
			Class316 var2 = Class316.method3908(Class315.field3320, field548.field1446);
			var2.field3374.method9388(Class521.method7983(var0));
			var2.field3374.method9473(var0);
			field548.method2897(var2);
		}
	}

	@ObfInfo(owner = "fu", name = "og", desc = "(I)V")
	public static void method3270() {
		Class316 var1 = Class316.method3908(Class315.field3344, field548.field1446);
		var1.field3374.method9388(0);
		field548.method2897(var1);
	}

	@ObfInfo(owner = "do", name = "ov", desc = "(IIB)V", opaque = "2")
	public static void method2452(int var0, int var1) {
		Class171 var3 = var0 >= 0 ? field684[var0] : field4619;
		if (var3 != null && var1 >= 0 && var1 < var3.method3536()) {
			Class140 var4 = (Class140)var3.field1854.get(var1);
			if (var4.field1602 == -1) {
				String var5 = var4.field1601.method10260();
				Class316 var6 = Class316.method3908(Class315.field3347, field548.field1446);
				var6.field3374.method9388(Class521.method7983(var5) + 3);
				var6.field3374.method9388(var0);
				var6.field3374.method9389(var1);
				var6.field3374.method9473(var5);
				field548.method2897(var6);
			}
		}
	}

	@ObfInfo(owner = "jo", name = "om", desc = "(IIB)V", opaque = "0")
	public static void method4767(int var0, int var1) {
		if (field684[var0] != null) {
			if (var1 >= 0 && var1 < field684[var0].method3536()) {
				Class140 var3 = (Class140)field684[var0].field1854.get(var1);
				if (var3.field1602 == -1) {
					Class316 var4 = Class316.method3908(Class315.field3308, field548.field1446);
					var4.field3374.method9388(Class521.method7983(var3.field1601.method10260()) + 3);
					var4.field3374.method9388(var0);
					var4.field3374.method9389(var1);
					var4.field3374.method9473(var3.field1601.method10260());
					field548.method2897(var4);
				}
			}
		}
	}

	@ObfInfo(owner = "ec", name = "ot", desc = "(IIZI)V", opaque = "915792532")
	public static void method2778(int var0, int var1, boolean var2) {
		if (null != field684[var0]) {
			if (var1 >= 0 && var1 < field684[var0].method3536()) {
				Class140 var4 = (Class140)field684[var0].field1854.get(var1);
				Class316 var5 = Class316.method3908(Class315.field3343, field548.field1446);
				var5.field3374.method9388(Class521.method7983(var4.field1601.method10260()) + 4);
				var5.field3374.method9388(var0);
				var5.field3374.method9389(var1);
				var5.field3374.method9394(var2);
				var5.field3374.method9473(var4.field1601.method10260());
				field548.method2897(var5);
			}
		}
	}

	@ObfInfo(owner = "od", name = "ok", desc = "(II)V", opaque = "2083108268")
	public static void method7135(int var0) {
		for (Class516 var2 = (Class516)field507.method9363(); var2 != null; var2 = (Class516)field507.method9364()) {
			if ((long)var0 == (var2.field5170 >> 48 & 65535L)) {
				var2.method9277();
			}
		}

	}

	@ObfInfo(owner = "gj", name = "oc", desc = "(Lnb;I)I")
	public static int method3511(Class340 var0) {
		Class516 var2 = (Class516)field507.method9361((long)var0.field3791 + ((long)var0.field3676 << 32));
		return var2 != null ? var2.field5199 : var0.field3679;
	}

	@ObfInfo(owner = "na", name = "oj", desc = "(Lnb;B)Z")
	public static boolean method6493(Class340 var0) {
		return var0.field3775;
	}

	@ObfInfo(owner = "ex", name = "pu", desc = "(Ljava/lang/String;I)V", opaque = "931829718")
	public static void method3033(String var0) {
		field4720 = var0;

		try {
			String var2 = field2077.getParameter(Integer.toString(18));
			String var3 = field2077.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			String var6;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var5 = var4 + "; Expires=";
				long var7 = Class130.method3047() + 94608000000L;
				Class347.field3864.setTime(new Date(var7));
				int var9 = Class347.field3864.get(7);
				int var10 = Class347.field3864.get(5);
				int var11 = Class347.field3864.get(2);
				int var12 = Class347.field3864.get(1);
				int var13 = Class347.field3864.get(11);
				int var14 = Class347.field3864.get(12);
				int var15 = Class347.field3864.get(13);
				var6 = Class347.field3863[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + Class347.field3866[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
				var4 = var5 + var6 + "; Max-Age=" + 94608000L;
			}

			Client var17 = field2077;
			var6 = "document.cookie=\"" + var4 + "\"";
		} catch (Throwable var16) {
		}

	}

	@ObfInfo(owner = "ls", name = "pp", desc = "(Ljava/lang/String;ZB)V", opaque = "10")
	public static void method6146(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < field1874; ++var5) {
			Class232 var6 = Class232.method109(var5);
			if ((!var1 || var6.field2461) && -1 == var6.field2486 && var6.field2449.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					field1870 = -1;
					field277 = null;
					return;
				}

				if (var4 >= var3.length) {
					short[] var7 = new short[var3.length * 2];

					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}

					var3 = var7;
				}

				var3[var4++] = (short)var5;
			}
		}

		field277 = var3;
		field1524 = 0;
		field1870 = var4;
		String[] var9 = new String[field1870];

		for (int var10 = 0; var10 < field1870; ++var10) {
			var9[var10] = Class232.method109(var3[var10]).field2449;
		}

		short[] var11 = field277;
		Class532.method9665(var9, var11, 0, var9.length - 1);
	}

	@ObfInfo(owner = "dm", name = "pd", desc = "(Lua;II)V", opaque = "1782054918")
	public static void method2417(Class521 var0, int var1) {
		byte[] var3 = var0.field5221;
		if (field545 == null) {
			field545 = new byte[24];
		}

		Class445.method8311(var3, var1, field545, 0, 24);
		Class179.method2751(var0, var1);
	}

	@ObfInfo(owner = "dg", name = "pt", desc = "(Lua;B)V", opaque = "0")
	public static void method2301(Class521 var0) {
		if (field545 != null) {
			var0.method9548(field545, 0, field545.length);
		} else {
			byte[] var2 = Class179.method1804();
			var0.method9548(var2, 0, var2.length);
		}
	}

	@ObfInfo(owner = "ka", name = "pr", desc = "(I)V")
	public static void method5162() {
		field548.method2897(Class316.method3908(Class315.field3311, field548.field1446));
		field577 = 0;
	}

	@ObfInfo(owner = "en", name = "pa", desc = "(B)V")
	public static void method2944() {
		if (1 == field577) {
			field585 = true;
		}

	}

	@ObfInfo(owner = "fi", name = "py", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaque = "1316147536")
	public static String method3135(String var0) {
		Class371[] var2 = Class371.method2873();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class371 var4 = var2[var3];
			if (-1 != var4.field4026 && var0.startsWith(Class113.method6223(var4.field4026))) {
				var0 = var0.substring(Integer.toString(var4.field4026).length() + 6);
				break;
			}
		}

		return var0;
	}

	@ObfInfo(owner = "ha", name = "pl", desc = "(I)V", opaque = "-792015884")
	public static void method3662() {
		if (field422 != null) {
			field781 = field778;
			field422.method7594();

			for (int var1 = 0; var1 < field3857.field1293.length; ++var1) {
				if (null != field3857.field1293[var1]) {
					field422.method7581((field3857.field1293[var1].field1065 >> 7) + field3857.field1289, field3857.field1285 + (field3857.field1293[var1].field1126 >> 7));
				}
			}
		}

	}

	@ObfInfo(owner = "aw", name = "pe", desc = "(B)Z", opaque = "0")
	public static boolean method348() {
		return field4851.method2631() >= field489;
	}

	@ObfInfo(owner = "nb", name = "pn", desc = "(I)V")
	public static void method6645() {
		field4851.method2630(field489);
	}

	@ObfInfo(owner = "bm", name = "px", desc = "(Lca;I)V")
	public static void method788(Class53 var0) {
		if (field1249 != var0) {
			field1249 = var0;
		}
	}

	@ObfInfo(owner = "an", name = "pk", desc = "(ZI)V")
	public static void method171(boolean var0) {
		field494 = var0;
	}

	@ObfInfo(owner = "bh", name = "pw", desc = "(II)Lum;")
	public static Class533 method719(int var0) {
		Class533 var2 = (Class533)field647.method5993((long)var0);
		if (var2 == null) {
			var2 = new Class533(field1255, Class546.method6654(var0), Class546.method3178(var0));
			field647.method5987(var2, (long)var0);
		}

		return var2;
	}

	@ObfInfo(owner = "ho", name = "ps", desc = "(IB)Lum;", opaque = "-96")
	public static Class533 method3870(int var0) {
		Class533 var2 = (Class533)field779.method5993((long)var0);
		if (var2 == null) {
			var2 = new Class533(field1255, var0);
		}

		return var2;
	}

	@ObfInfo(owner = "ha", name = "pq", desc = "(B)Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard method3663() {
		return field2077.method470();
	}

	@ObfInfo(owner = "rf", name = "pj", desc = "(II)V", opaque = "-317850099")
	public static void method8410(int var0) {
		Class211 var2 = Class211.method4637(var0);
		if (var2.method4038()) {
			int var4 = var2.field2133;
			Class145 var5 = Class211.method2478(var4);
			int var3;
			if (var5 == null) {
				var3 = 2;
			} else {
				var3 = var5.method3190() ? 0 : 1;
			}

			if (var3 == 2) {
				field782.add(var2.field2133);
			}

		}
	}

	@ObfInfo(owner = "tk", name = "pb", desc = "(I)V", opaque = "-2123431865")
	public static void method9271() {
		for (int var1 = 0; var1 < field782.size(); ++var1) {
			int var3 = (Integer)field782.get(var1);
			Class145 var4 = Class211.method2478(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3190() ? 0 : 1;
			}

			if (var2 != 2) {
				field782.remove(var1);
				--var1;
			}
		}

	}
}
