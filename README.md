
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2

countYZ("fez day") → 2	2	OK	
countYZ("day fez") → 2	2	OK	
countYZ("day fyyyz") → 2	2	OK	
countYZ("day yak") → 1	1	OK	
countYZ("day:yak") → 1	1	OK	
countYZ("!!day--yaz!!") → 2	2	OK	
countYZ("yak zak") → 0	0	OK	
countYZ("DAY abc XYZ") → 2	2	OK	
countYZ("aaz yyz my") → 3	3	OK	
countYZ("y2bz") → 2	2	OK	
countYZ("zxyx") → 0	0	OK

[String 3 -- CountYZ](https://codingbat.com/prob/p199171)