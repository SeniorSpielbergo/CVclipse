SYNTAXDEF cv
FOR <http://www.tu-braunschweig.de/isf/cvclipse/1.0><model/cvlipse.genmodel>
START Application

TOKENS {
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $ ;
	DEFINE EMAIL $'"'$ + TEXT + $'@'$ + TEXT + $'.'$ + TEXT + $'"'$;
	DEFINE TWITTER $'"'$ + $'@'$ + TEXT + $'"'$;
	DEFINE TWO_DIGIT $('0'..'9')('0'..'9')$;
	DEFINE FOUR_DIGIT $('0'..'9')('0'..'9')('0'..'9')('0'..'9')$;
}

TOKENSTYLES {
	"EMAIL" COLOR #0000FF;
	"TWITTER" COLOR #0000FF;
	"SL_COMMENT" COLOR #458B74;
}

RULES {
	Application ::= "options"
					("languages" ":" languages[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"](","languages[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"])*) 
					("style" ":" style[CASUAL : "casual", CLASSIC : "classic", OLDSTYLE : "oldstyle", BANKING : "banking"])?
					("color" ":" color[BLUE : "blue", ORANGE : "orange", GREEN : "green", RED : "red", PURPLE : "purple", GREY : "grey", BLACK : "black"])?
					("place" ":" place['"','"'])?
					("date" ":" date)?
					(personalInformation)
					(letter | cv)*; // letter?

	PersonalInformation ::= "personal"
							(("firstname" ":" firstname['"','"'])		|
							("surname" ":" surname['"','"'])			|
							("birthname" ":" birthName['"','"']) 		| // ?
							("birthplace" ":" birthplace['"','"'])		|
							("birthdate" ":" birthdate)				|
							("marital status" ":" maritalStatus ("," maritalStatus)*) 	| // ?
							("nationality" ":" nationality ("," nationality)*) 		| // ?
							("street" ":" street['"','"'])				|
							("city" ":" city['"','"'])					|
							("country" ":" country ("," country)*) 	| // ?
							("email" ":" email[EMAIL]) 				| // ?
							("phone" ":" phone['"','"']) 				| // ?
							("mobile" ":" mobile['"','"']) 			| // ?
							("fax" ":" fax['"','"'])					| // ?
							("website" ":" website['"','"'])			| // ?
							("github" ":" github['"','"'])				| // ?
							("linkedin" ":" linkedIn['"','"'])			| // ?
							("twitter" ":" twitter[TWITTER]) 		  // ?
							)*;
							
	Letter ::= "letter"
				"recipient"
				(("company" ":" recipientCompany['"','"'])				|
				("street" ":" recipientStreet['"','"'])				|
				("city" ":" recipientCity['"','"'])					|
				("country" ":" recipientCountry['"','"'])				| // ?
				("attention" ":" recipientAttention['"','"'])			| // ?
				("opening" ":" opening ("," opening)*)				| // ?
				("text" ":" text ("," text)*)						|
				("closing" ":" closing("," closing)*)				| // ?
				("enclosure" ":" enclosure ("," enclosure)*)		  // ?
				)*;
				
	CV ::= "cv"
			"picture" ":" picture['"','"']?
			blocks+;
	
	ItemBlock ::= "block"
					"title" ":" title ("," title)*
					(items)+;
					
	ListBlock ::= "list"
					"title" ":" title ("," title)*
					(items)+;
					
	TextItem ::= ((leftContent) ("," leftContent)*)? "|" rightContent ("," rightContent)*;
	DateItem ::= begin ("-" end)? "|" rightContent ("," rightContent)*;
			
	Date ::= year[FOUR_DIGIT] "/" month[TWO_DIGIT] ("/" day[TWO_DIGIT])?;
	
	LanguageToTextMapEntry ::= key[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"] value;
	
	Text ::= content['"','"'];
	
}