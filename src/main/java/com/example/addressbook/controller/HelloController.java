package com.example.addressbook.controller;

import com.example.addressbook.HelloApplication;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.*;

import java.io.*;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea termsAndConditions;

    @FXML
    private CheckBox agreeCheckBox;
    @FXML
    private Button nextButton;


    @FXML
    public void initialize() {
        termsAndConditions.setText("""
Terms and Conditions for [App Name]

Last Updated: [Date]

Please read these Terms and Conditions ("Terms", "Terms and Conditions") carefully before using the [App Name] mobile application ("Service", "App") operated by [Your Company Name] ("us", "we", or "our").

By accessing or using our App, you agree to be bound by these Terms and Conditions. If you do not agree to any part of the terms, you may not access the Service.

1. Acceptance of Terms
By using [App Name], you agree to comply with and be bound by these Terms and all applicable laws and regulations. If you do not agree to these Terms, please do not use the App.

2. Eligibility
You must be at least [minimum age, e.g., 13 years old] to use the App. By using the App, you affirm that you meet this age requirement.

3. Account Registration
In order to access certain features of the App, you may be required to create an account. You agree to provide accurate, current, and complete information during the registration process and to update such information if it changes.

You are responsible for maintaining the confidentiality of your account credentials and for all activities that occur under your account.

4. Use of the App
You agree to use the App only for lawful purposes and in accordance with these Terms. You may not:

Violate any applicable laws or regulations.
Infringe on the intellectual property rights of others.
Use the App to transmit harmful or offensive content.
Engage in any activity that disrupts or interferes with the App's functionality.
5. Intellectual Property
The content, design, and functionality of the App are owned by [Company Name] or its licensors and are protected by intellectual property laws. You may not reproduce, distribute, or create derivative works of the App’s content without prior written permission.

6. Privacy Policy
Your use of the App is also governed by our Privacy Policy, which can be found at [link to Privacy Policy]. Please review it to understand how we collect, use, and protect your personal information.

7. Third-Party Services
The App may contain links to third-party websites or services that are not owned or controlled by [Your Company Name]. We are not responsible for the content or privacy practices of these third-party services. You access them at your own risk.

8. Termination
We may suspend or terminate your account or access to the App at any time, without notice, for conduct that violates these Terms or is harmful to other users or the App.

9. Limitation of Liability
To the fullest extent permitted by applicable law, [Your Company Name] shall not be liable for any indirect, incidental, special, or consequential damages arising from your use or inability to use the App, even if we have been advised of the possibility of such damages.

10. Indemnification
You agree to indemnify and hold harmless [Your Company Name] and its affiliates, officers, employees, and agents from any claims, liabilities, damages, and expenses arising out of your use of the App or violation of these Terms.

11. Amendments
We reserve the right to modify or replace these Terms at any time. We will notify you of any material changes to these Terms by posting the updated version on this page. Your continued use of the App after such changes constitutes acceptance of the new Terms.

12. Governing Law
These Terms shall be governed by and construed in accordance with the laws of [Your Jurisdiction], without regard to its conflict of law provisions.

13. Dispute Resolution
Any disputes arising from or relating to these Terms will be resolved through [mediation/arbitration] in [jurisdiction].

14. Contact Us
If you have any questions or concerns about these Terms and Conditions, please contact us at:

Email: [Email Address]
Address: [Company Address]""");
    }

    @FXML
    protected void onAgreeCheckBoxClick() {
        boolean accepted = agreeCheckBox.isSelected();
        nextButton.setDisable(!accepted);
    }

    @FXML
    protected void onNextButtonClick() throws IOException {
        Stage stage = (Stage) nextButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), HelloApplication.WIDTH, HelloApplication.HEIGHT);
        stage.setScene(scene);
    }

    /** Close window when click on cancel button */
    @FXML
    protected void onCancelButtonClick() {
        Stage stage = (Stage) nextButton.getScene().getWindow();
        stage.close();
    }
}