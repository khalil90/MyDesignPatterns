package bridge;

public abstract class ProgramDriver {

	protected InstallDriver installDriver;
	
	protected ProgramDriver (InstallDriver installDriver) {
		this.installDriver=installDriver;
		}
     
	public abstract void install();	
}
