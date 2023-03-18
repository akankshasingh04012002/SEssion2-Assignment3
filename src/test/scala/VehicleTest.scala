
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec


class VehicleTest extends AnyWordSpec with Matchers {

  "A Car" should {
    "be driven" in {
      val car = new Car("Car")
      car.move shouldEqual "Car can be driven"
    }
  }


  "A Boat" should {
    "be sailed" in {
      val boat = new Boat("Boat")
      boat.move shouldEqual "Boat can be sailed"
    }
  }

  "An Aeroplane" should {
    "be flown" in {
      val aeroplane = new Aeroplane("Aeroplane")
      aeroplane.move shouldEqual "Aeroplane can be flown"
    }
  }

  "A FlyingCar" should {
    "can be driven and flown" in {
      val flyingCar = new FlyingCar
      flyingCar.move shouldEqual "FlyingCar can be driven and flown"
    }
  }

  "A Hovercraft" should {
    "be sailed and driven" in {
      val hovercraft = new Hovercraft
      hovercraft.move shouldEqual "Hovercraft can be sailed and Hovercraft can be driven"
    }
  }
}

