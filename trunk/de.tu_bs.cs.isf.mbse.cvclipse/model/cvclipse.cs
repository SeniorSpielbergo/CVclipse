SYNTAXDEF cv
FOR <http://www.tu-braunschweig.de/isf/cvclipse/1.0><model/cvlipse.genmodel>
START Application

TOKENS {
	DEFINE EMAIL TEXT + $'@'$ + TEXT + $'.'$ + TEXT;
	DEFINE TWITTER $'@'$ + TEXT;
}

RULES {
	Application ::= "options"
					("languages" ":" languages[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"](","languages[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"])*) 
					("style" ":" style[CASUAL : "casual", CLASSIC : "classic", OLDSTYLE : "oldstyle", BANKING : "banking"])?
					("color" ":" color[BLUE : "blue", ORANGE : "orange", GREEN : "green", RED : "red", PURPLE : "purple", GREY : "grey", BLACK : "black"])?
					("place" ":" place[TEXT])?
					("date" ":" date)
					("personal" personalInformation)
					(letter? cv);

	PersonalInformation ::= "personal"
							("firstname" ":" firstname[TEXT])
							("surname" ":" surname[TEXT])
							("birthname" ":" birthName[TEXT])?
							("birthplace" ":" birthplace[TEXT])
							("birthdate" ":" birthdate)
							("marital status" ":" maritalStatus)?
							("nationality" ":" nationality)?
							("street" ":" street[TEXT])
							("city" ":" city[TEXT])
							("country" ":" country)?
							("email" ":" email[EMAIL])?
							("phone" ":" phone[TEXT])?
							("mobile" ":" mobile[TEXT])?
							("fax" ":" fax[TEXT])?
							("website" ":" website[TEXT])?
							("github" ":" github[TEXT])?
							("linkedin" ":" linkedIn[TEXT])?
							("twitter" ":" twitter[TWITTER])?;
	Letter ::= "letter"
				"recipient"
				("company" ":" recipientCompany[TEXT])
				("street" ":" recipientStreet[TEXT])
				("city" ":" recipientCity[TEXT])
				;
	Date ::= "date";
	CV ::= "cv";
	LanguageToTextMapEntry ::= "bla";
}