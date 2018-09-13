package com.sbabenko.lc.t657;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        int x, y;
        x = y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char moveTo = moves.charAt(i);

            switch (moveTo) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
