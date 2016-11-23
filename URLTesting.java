import java.util.ArrayList;

import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.PatternCompiler;
import org.apache.oro.text.regex.PatternMatcher;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;

public class URLTesting {

	public static boolean validateUrl(String url, Object[] webPatterns) {
		if ((url == null) || (url.length() == 0)) {
			return true;
		}

		PatternCompiler compiler = new Perl5Compiler();
		PatternMatcher matcher = new Perl5Matcher();

		for (int i = 0; i < webPatterns.length; i++) {
			Pattern pattern = null;

			try {
				pattern = compiler.compile((String) webPatterns[i], Perl5Compiler.CASE_INSENSITIVE_MASK);
			} catch (MalformedPatternException e) {
				e.printStackTrace();
			}

			if (matcher.contains(url, pattern)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String url = "com.rsa.ui.jsp.taglibs.html.TOKEN=39c67707d1a8ac2438a8fff3e9522217&ptoken=480Y0MFRJM28P8TM&action=updateUser&originalForward=null&listIdentitySource=ims.000000000000000000001000d0011000&listSecurityDomain=ims.000000000000000000001000e0011000&textFieldFirstName=&textFieldMiddleName=&textFieldLastName=user30058%3C%3E&textFieldUserID=user30058%3C%3E&textFieldEmail=&textFieldCertificateDN=&textAreaNotes=&textFieldPassword=deRSAPwd&textFieldPasswordConf=deRSAPwd&pwdEdit=&dataTimeAccountStart.month=9&dataTimeAccountStart.day=19&dataTimeAccountStart.year=2016&dataTimeAccountStart.hour=15&dataTimeAccountStart.minute=23&radioAccountExpire=0&customattrs(ims_000000000000000000001000f0014007)=&guid=0&hiddenFieldFocused=&_dc=1478589137255";
		
		ArrayList patternList = new ArrayList();
		patternList.add("(\\%3C|<)[^\\n]+(\\%3E|>)");
		patternList.add("exec(\\s|\\+)+(s|x)p\\w+");
		
		System.out.println(validateUrl(url,patternList.toArray()));

	}

}
