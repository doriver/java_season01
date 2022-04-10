package note;

public class Note02 {
	// 1초당 가장 많은 경험치를 주는 몬스터의 이름을 return	
    public String solution(String character, String[] monsters) {
        String answer = "";

        String[] chrt = character.split(" ");
         
        // offense defense health
        int chrtHealth = Integer.parseInt(chrt[0]);
        int chrtOffense = Integer.parseInt(chrt[1]);
        int chrtDefense = Integer.parseInt(chrt[2]);
        
    	// 몬스터로부터 1초당 얻는 경험치를 구해야해
    	// 몬스터로부터 1초당 얻는 경험치 -> 비교해서 max를 구해야지
    	// 몬스터로부터 언제 경험치를 얻냐
    	// 몬스터로부터 입는 피해 < 캐릭터 체력 -> if 문으로
    	// 죽이는데 몇초 걸리는지 알아야지 , 몇초걸리는지 알아서 그걸로 경험치를 나눈다
    	// 이게 바로 몬스터로부터 1초당 얻는 경험치        
        for (int i = 0; i < monsters.length; i++) {
        	String monster = monsters[i];
            String[] mst = monster.split(" ");
            
            String mstName = mst[0];
            int mstExperience = Integer.parseInt(mst[1]);
            int mstHealth = Integer.parseInt(mst[2]);
            int mstOffense = Integer.parseInt(mst[3]);
            int mstDefense = Integer.parseInt(mst[4]);
            
            int chrtAlive = chrtHealth - (mstOffense - chrtDefense);

            
            if (chrtAlive > 0) {
            	
            }

        }
        
        
        // character = "a b c"   ,   monsters = {"Knight 3 10 10 3","Wizard 5 10 15 1"}
        // character = "체력 공격력 방어력"  monsters ={"이름 경험치 체력 공격력 방어력"}
        return answer;

    }
	
}
