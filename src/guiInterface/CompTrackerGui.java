package guiInterface;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Apr 26, 2022
 */

/**
 * @author Caleb
 *
 */
public class CompTrackerGui {

	protected Shell shell;
	private Text characterInput;
	private Text itemsInput;
	private Text augmentsInput;
	private Text placementInput;
	private Text usernameInput;
	private Text averagePlacementInput;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CompTrackerGui window = new CompTrackerGui();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(895, 528);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(2, false));
		
		Label lblTftTracker = new Label(shell, SWT.NONE);
		lblTftTracker.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblTftTracker.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
		lblTftTracker.setText("TFT Tracker");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblNewLabel.setText("Composition");
		new Label(shell, SWT.NONE);
		
		Label lblCharacter = new Label(shell, SWT.NONE);
		lblCharacter.setText("Character:");
		
		characterInput = new Text(shell, SWT.BORDER);
		characterInput.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label lblItems = new Label(shell, SWT.NONE);
		lblItems.setText("Items:");
		
		itemsInput = new Text(shell, SWT.BORDER);
		itemsInput.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label lblAugments = new Label(shell, SWT.NONE);
		lblAugments.setText("Augments:");
		
		augmentsInput = new Text(shell, SWT.BORDER);
		augmentsInput.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label lblPlacement = new Label(shell, SWT.NONE);
		lblPlacement.setText("Placement: ");
		
		placementInput = new Text(shell, SWT.BORDER);
		placementInput.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblAccount = new Label(shell, SWT.NONE);
		lblAccount.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblAccount.setText("Account");
		new Label(shell, SWT.NONE);
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setText("Username:");
		
		usernameInput = new Text(shell, SWT.BORDER);
		usernameInput.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label lblAveragePlacement = new Label(shell, SWT.NONE);
		lblAveragePlacement.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblAveragePlacement.setText("Average Placement:");
		
		averagePlacementInput = new Text(shell, SWT.BORDER);
		averagePlacementInput.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnSubmitAccount = new Button(shell, SWT.NONE);
		
		btnSubmitAccount.setText("Submit Account");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblEnteredComp = new Label(shell, SWT.NONE);
		lblEnteredComp.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblEnteredComp.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblEnteredComp.setText("Entered Comp:");
		
		Label lblCompString = new Label(shell, SWT.NONE);
		lblCompString.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblAccount_1 = new Label(shell, SWT.NONE);
		lblAccount_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblAccount_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblAccount_1.setText("Account: ");
		
		Label lblAccountString = new Label(shell, SWT.NONE);
		GridData gd_lblAccountString = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblAccountString.widthHint = 733;
		gd_lblAccountString.heightHint = 42;
		lblAccountString.setLayoutData(gd_lblAccountString);
		
		// ** Submit Event Listener **
		btnSubmitAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String character = characterInput.getText();
				String items = itemsInput.getText();
				String augments = augmentsInput.getText();
				int placement = Integer.parseInt(placementInput.getText());
				
				String username = usernameInput.getText();
				int averagePlacement = Integer.parseInt(averagePlacementInput.getText());
				
				
				String compString = "Character: " + character + " Items: " + items + " Augments: " + augments  + " Placement: " + Integer.toString(placement);
				String accountString = "Username: " + username + " Average Placement: " + Integer.toString(averagePlacement) + " " + compString;
				System.out.println("Comp String: " + compString);
				System.out.println("Account String: " + accountString);
				lblCompString.setText(compString);
				lblAccountString.setText(accountString);
			}
		});
		// ** End Event Listener **

	}

}
