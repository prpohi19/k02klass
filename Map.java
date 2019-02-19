class Map
    {
        public void ReadMap(Character player, Character playerTwo, Monster monster)
        {
            for (int mapY = 9; mapY > -10; mapY--)
            {
                for (int mapX = -9; mapX < 10; mapX++)
                {
                    if ( mapX == player.x && mapY == player.y)
                    {
                        System.out.print("1 ");
                    } else if (mapX == playerTwo.x && mapY == playerTwo.y)
                    {
                        System.out.print("2 ");
                    } else if (mapX == monster.x && mapY == monster.y)
                    {
                        System.out.print("M ");
                    } else
                    {
                        System.out.print("* ");
                        //Console.Write(mapX + " ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
// Video: https://youtu.be/zC1f4iyBAY8
