SYNTAXDEF cv
FOR <http://www.tu-braunschweig.de/isf/cvclipse/1.0><model/cvlipse.genmodel>
START Application

TOKENS {
	DEFINE EMAIL TEXT + $'@'$ + TEXT + $'.'$ + TEXT;
	DEFINE TWITTER $'@'$ + TEXT;
	DEFINE TWO_DIGIT $('0'..'9')('0'..'9')$;
	DEFINE FOUR_DIGIT $('0'..'9')('0'..'9')('0'..'9')('0'..'9')$;
}

RULES {
	Application ::= "options"
					("languages" ":" languages[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"](","languages[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"])*) 
					("style" ":" style[CASUAL : "casual", CLASSIC : "classic", OLDSTYLE : "oldstyle", BANKING : "banking"])?
					("color" ":" color[BLUE : "blue", ORANGE : "orange", GREEN : "green", RED : "red", PURPLE : "purple", GREY : "grey", BLACK : "black"])?
					("place" ":" place[TEXT])?
					("date" ":" date)
					("personal" personalInformation)
					(letter | cv)*; // letter?

	PersonalInformation ::= "personal"
							(("firstname" ":" firstname[TEXT])
							("surname" ":" surname[TEXT])			|
							("birthname" ":" birthName[TEXT]) 		| // ?
							("birthplace" ":" birthplace[TEXT])		|
							("birthdate" ":" birthdate)				|
							("marital status" ":" maritalStatus) 	| // ?
							("nationality" ":" nationality) 		| // ?
							("street" ":" street[TEXT])				|
							("city" ":" city[TEXT])					|
							("country" ":" country) 				| // ?
							("email" ":" email[EMAIL]) 				| // ?
							("phone" ":" phone[TEXT]) 				| // ?
							("mobile" ":" mobile[TEXT]) 			| // ?
							("fax" ":" fax[TEXT])					| // ?
							("website" ":" website[TEXT])			| // ?
							("github" ":" github[TEXT])				| // ?
							("linkedin" ":" linkedIn[TEXT])			| // ?
							("twitter" ":" twitter[TWITTER]) 		  // ?
							)*;
							
	Letter ::= "letter"
				"recipient"
				(("company" ":" recipientCompany[TEXT])				|
				("street" ":" recipientStreet[TEXT])				|
				("city" ":" recipientCity[TEXT])					|
				("country" ":" recipientCountry[TEXT])				| // ?
				("attention" ":" recipientAttention[TEXT])			| // ?
				("opening" ":" opening)								| // ?
				("text" ":" text)									|
				("closing" ":" closing)								| // ?
				("enclosure" ":" enclosure)							  // ?
				)*;
				
	CV ::= "cv"
			"picture" ":" picture[TEXT]?
			blocks+;
	
	ItemBlock ::= "block"
					"title" ":" title
					(items)+;
					
	TextItem ::= ((leftContent) ("," leftContent)*)? "|" rightContent;
	DateItem ::= begin ("-" end)? "|" rightContent;
			
	Date ::= year[FOUR_DIGIT] "/" month[TWO_DIGIT] ("/" day[TWO_DIGIT])?;
	
	LanguageToTextMapEntry ::= key[GERMAN : "german", ENGLISH : "english", FRENCH : "french", SPANISH : "spanish"] ":" value;
	
	Text ::= content[TEXT];
	
}