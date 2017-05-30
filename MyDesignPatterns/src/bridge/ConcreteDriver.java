package bridge;

public class ConcreteDriver extends ProgramDriver{

	protected ConcreteDriver(InstallDriver installDriver) {
		super(installDriver);
	}

	@Override
	public void install() {
		installDriver.install();	
	}

}
