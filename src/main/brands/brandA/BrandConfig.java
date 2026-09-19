package com.pstconverter.config;

public final class BrandConfig {

    // Tools Data
    public static final String TOOL_NAME = "Prism IMAP to IMAP Migration";
    public static final String VERSION = java.time.LocalDate.now()
            .format(java.time.format.DateTimeFormatter.ofPattern("yyyy.MM"));
    public static final String COMPANY_NAME = "Prism Software";

    // Unique Product ID — must match the Product ID registered in the backend CRM (Admin Panel).
    public static final String PRODUCT_ID = "imap-to-imap-migration";

    // Unique Brand ID — matches the siteId in the CRM
    public static final String BRAND_ID = "brandA";

    // Webpage Links
    public static final String HOME_PAGE_URL = "https://www.prismimapmigration.com";
    public static final String SUPPORT_URL = "https://www.prismimapmigration.com/support";
    public static final String UPGRADE_URL = "https://www.prismimapmigration.com/upgrade";
    public static final String LICENSE_API_URL = System.getenv("LICENSE_API_URL") != null 
            ? System.getenv("LICENSE_API_URL") 
            : "https://api.thecrazyufo.in/api/license/activate?siteId=brandA";
    public static final String FAQ_URL = "https://www.prismimapmigration.com/faq";
    public static final String PRIVACY_POLICY_URL = "https://www.prismimapmigration.com/privacy-policy";
    public static final String TERMS_OF_SERVICE_URL = "https://www.prismimapmigration.com/terms-of-service";
    public static final String REFUND_POLICY_URL = "https://www.prismimapmigration.com/refund-policy";

    // Directories
    public static final String REPORT_DIR_NAME = COMPANY_NAME + java.io.File.separator + TOOL_NAME;
    public static final String SETTINGS_DB_DIR = (COMPANY_NAME + java.io.File.separator + TOOL_NAME).replace(" ", "-");
    public static final String HIDDEN_SETTINGS_DB_DIR = "."
            + (COMPANY_NAME + "-" + TOOL_NAME).toLowerCase().replace(" ", "-").replace("/", "-").replace("\\", "-");

    // License Key Validation Pattern
    public static final String LICENSE_KEY_PATTERN =
        "^(IMAP2IMAP|IMAP2IMAP-ELITE|IMAP2IMAP-STANDARD|IMAP2IMAP-BUSINESS|PRISM-IMAP2IMAP)-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{4}$|^IMAP2IMAP-[A-Z0-9]+-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{4}$";
    public static final String LICENSE_KEY_FORMAT_HINT = "PRISM-IMAP2IMAP-XXXX-XXXX-XXXX";

    // About Dialog Texts
    public static final String TAGLINE = "Migrate Between Any Two IMAP Servers Seamlessly";
    public static final String ABOUT_TITLE = TOOL_NAME;
    public static final String ABOUT_DESCRIPTION = "Prism IMAP to IMAP Migration is a professional desktop application to migrate emails, folders, and attachments directly between any source and destination IMAP accounts.";

    // SMTP Configuration
    public static final String SMTP_HOST = "smtp.mailgun.org";
    public static final String SMTP_PORT = "587";
    public static final String SMTP_USER = "postmaster@mg.prismimapmigration.com";
    public static final String SMTP_PASSWORD = System.getenv("SMTP_PASSWORD") != null
            ? System.getenv("SMTP_PASSWORD")
            : "mock_smtp_password_12345";
    public static final String COMPANY_EMAIL_SENDER = "notifications@prismimapmigration.com";
}
