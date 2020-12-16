/*
  Utility class to make snippets and coding shorter
*/
class Align
{
  //added in part 33 scaling images
  static scaleToGameW(obj,per)
  {
    obj.displayWidth=game.config.width * per;
    obj.scaleY= obj.scaleX;
  }

  //added in part 33 scaling images
  static center(obj)
  {
    obj.x = game.config.width / 2;
    obj.y = game.config.height / 2;
  }

  static centerH(obj)
  {
    obj.x = game.config.width / 2;
  }

  static centerV(obj)
  {
    obj.y = game.config.height / 2;
  }
}
