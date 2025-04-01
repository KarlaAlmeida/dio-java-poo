

public non-sealed class BRLCLock extends Clock {

    @Override
    public Clock convert(final Clock clock){
        
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock){
            case USClock usClock -> this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour()+12 : usClock.getHour();
    
            case BRLCLock brlClock -> this.hour = brlClock.getHour();
        }
        return this;
    }

}

