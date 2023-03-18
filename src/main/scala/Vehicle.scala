trait Vehicle {
  def move: String
}

class Car(name: String) extends Vehicle {
  def drive: String = "Car can be driven"

  override def move: String = s"$name can be driven"
}

class Boat(name: String) extends Vehicle {
  def sail: String = "Boat can be sailed"

  override def move: String = s"$name can be sailed"
}

class Aeroplane(name: String) extends Vehicle {
  def fly: String = "Aeroplane can be flown"

  override def move: String = s"$name can be flown"
}

class FlyingCar extends Aeroplane("FlyingCar") with Vehicle {

  override def move: String = "FlyingCar can be driven and flown"
}

class Hovercraft extends Vehicle {
  def sail: String = "Hovercraft can be sailed"

  def drive: String = "Hovercraft can be driven"

  override def move: String = s"$sail and $drive"

}
