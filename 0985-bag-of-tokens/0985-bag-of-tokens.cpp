class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(), tokens.end());
        int start = 0;
        int maxScore = 0;
        int end = tokens.size() -1;
        int score = 0;

        while(start<=end){
            if(power >= tokens[start]){
                power-=tokens[start];
                score++;
                maxScore = max(score, maxScore);
                start++;
            }

            else if(score >= 1){
                score-=1;
                power += tokens[end];
                end--;
            }
            else{
                break;
            }
           
            
        }

        return maxScore;
    }
};