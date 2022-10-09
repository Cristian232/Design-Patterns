




            Decorator design pattern

       Example: How_to

            Step 1: Interface SatelliteTv with abstract methods show(int) / (int)price
            Step 2: Concrete class SkyTv implements SatelliteTV
            Step 3: Abstract class ChannelDecorator implements SatelliteTv with member satelliteTV and constructor(satelliteTV)
            Step 4: Concrete class Espn extends ChannelDecorator
            Step 5: Concrete class Hulu extends ChannelDecorator


        In main:
