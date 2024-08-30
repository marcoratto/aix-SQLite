package com.google.appinventor.client;

import java.util.HashMap;
import java.util.Map;

import static com.google.appinventor.client.Ode.MESSAGES;

public class ComponentsTranslation {
  public static Map<String, String> myMap = map();

  private static String getName(String key) {
    String value = myMap.get(key);
    if (key == null) {
      return "**Missing key in ComponentsTranslations**";
    } else {
      return value;
    }
  }

  public static String getPropertyName(String key) {
    String value = getName("PROPERTY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getPropertyDescription(String key) {
    String value = getName("PROPDESC-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getMethodName(String key) {
    String value = getName("METHOD-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getEventName(String key) {
    String value = getName("EVENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentName(String key) {
    String value = getName("COMPONENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getCategoryName(String key) {
    String value = getName("CATEGORY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentHelpString(String key) {
    String value = getName(key + "-helpString");
    if(value == null) return key;
    return value;
  }
  public static HashMap<String, String> map() {
    HashMap<String, String> map = new HashMap<String, String>();


    /* Descriptions */

    map.put("EVENTDESC-AfterDeleteEventDescriptions", MESSAGES.AfterDeleteEventDescriptions());
    map.put("EVENTDESC-AfterExecuteEventDescriptions", MESSAGES.AfterExecuteEventDescriptions());
    map.put("EVENTDESC-AfterExecuteFileEventDescriptions", MESSAGES.AfterExecuteFileEventDescriptions());
    map.put("EVENTDESC-AfterInsertEventDescriptions", MESSAGES.AfterInsertEventDescriptions());
    map.put("EVENTDESC-AfterInsertFileEventDescriptions", MESSAGES.AfterInsertFileEventDescriptions());
    map.put("EVENTDESC-AfterReplaceEventDescriptions", MESSAGES.AfterReplaceEventDescriptions());
    map.put("EVENTDESC-AfterSelectEventDescriptions", MESSAGES.AfterSelectEventDescriptions());
    map.put("EVENTDESC-AfterUpdateEventDescriptions", MESSAGES.AfterUpdateEventDescriptions());
    map.put("METHODDESC-BeginTransactionMethodDescriptions", MESSAGES.BeginTransactionMethodDescriptions());
    map.put("METHODDESC-CloseDatabaseMethodDescriptions", MESSAGES.CloseDatabaseMethodDescriptions());
    map.put("METHODDESC-CommitTransactionMethodDescriptions", MESSAGES.CommitTransactionMethodDescriptions());
    map.put("PROPDESC-DBNamePropertyDescriptions", MESSAGES.DBNamePropertyDescriptions());
    map.put("PROPDESC-DBVersionPropertyDescriptions", MESSAGES.DBVersionPropertyDescriptions());
    map.put("EVENTDESC-DatabaseClosedEventDescriptions", MESSAGES.DatabaseClosedEventDescriptions());
    map.put("EVENTDESC-DatabaseCreatedEventDescriptions", MESSAGES.DatabaseCreatedEventDescriptions());
    map.put("EVENTDESC-DatabaseDowngradeEventDescriptions", MESSAGES.DatabaseDowngradeEventDescriptions());
    map.put("METHODDESC-DatabaseExistsMethodDescriptions", MESSAGES.DatabaseExistsMethodDescriptions());
    map.put("EVENTDESC-DatabaseOpenedEventDescriptions", MESSAGES.DatabaseOpenedEventDescriptions());
    map.put("METHODDESC-DatabasePathMethodDescriptions", MESSAGES.DatabasePathMethodDescriptions());
    map.put("EVENTDESC-DatabaseUpgradeEventDescriptions", MESSAGES.DatabaseUpgradeEventDescriptions());
    map.put("PROPDESC-DebugDialogPropertyDescriptions", MESSAGES.DebugDialogPropertyDescriptions());
    map.put("PROPDESC-DebugToastPropertyDescriptions", MESSAGES.DebugToastPropertyDescriptions());
    map.put("METHODDESC-DeleteAsyncMethodDescriptions", MESSAGES.DeleteAsyncMethodDescriptions());
    map.put("METHODDESC-DeleteDatabaseMethodDescriptions", MESSAGES.DeleteDatabaseMethodDescriptions());
    map.put("METHODDESC-DeleteMethodDescriptions", MESSAGES.DeleteMethodDescriptions());
    map.put("METHODDESC-ExecuteAsyncMethodDescriptions", MESSAGES.ExecuteAsyncMethodDescriptions());
    map.put("METHODDESC-ExecuteFileAsyncMethodDescriptions", MESSAGES.ExecuteFileAsyncMethodDescriptions());
    map.put("METHODDESC-ExecuteFileMethodDescriptions", MESSAGES.ExecuteFileMethodDescriptions());
    map.put("METHODDESC-ExecuteMethodDescriptions", MESSAGES.ExecuteMethodDescriptions());
    map.put("METHODDESC-ExportDatabaseMethodDescriptions", MESSAGES.ExportDatabaseMethodDescriptions());
    map.put("METHODDESC-ImportDatabaseASyncMethodDescriptions", MESSAGES.ImportDatabaseASyncMethodDescriptions());
    map.put("METHODDESC-ImportDatabaseMethodDescriptions", MESSAGES.ImportDatabaseMethodDescriptions());
    map.put("EVENTDESC-ImportedEventDescriptions", MESSAGES.ImportedEventDescriptions());
    map.put("METHODDESC-InsertAsyncMethodDescriptions", MESSAGES.InsertAsyncMethodDescriptions());
    map.put("METHODDESC-InsertFileAsyncMethodDescriptions", MESSAGES.InsertFileAsyncMethodDescriptions());
    map.put("METHODDESC-InsertFileMethodDescriptions", MESSAGES.InsertFileMethodDescriptions());
    map.put("METHODDESC-InsertMethodDescriptions", MESSAGES.InsertMethodDescriptions());
    map.put("METHODDESC-IsDatabaseOpenMethodDescriptions", MESSAGES.IsDatabaseOpenMethodDescriptions());
    map.put("METHODDESC-ListFixerMethodDescriptions", MESSAGES.ListFixerMethodDescriptions());
    map.put("METHODDESC-OpenDatabaseMethodDescriptions", MESSAGES.OpenDatabaseMethodDescriptions());
    map.put("METHODDESC-ReplaceAsyncMethodDescriptions", MESSAGES.ReplaceAsyncMethodDescriptions());
    map.put("METHODDESC-ReplaceMethodDescriptions", MESSAGES.ReplaceMethodDescriptions());
    map.put("PROPDESC-ReturnColumnNamesPropertyDescriptions", MESSAGES.ReturnColumnNamesPropertyDescriptions());
    map.put("METHODDESC-RollbackTransactionMethodDescriptions", MESSAGES.RollbackTransactionMethodDescriptions());
    map.put("EVENTDESC-SQLErrorEventDescriptions", MESSAGES.SQLErrorEventDescriptions());
    map.put("METHODDESC-SelectAsyncMethodDescriptions", MESSAGES.SelectAsyncMethodDescriptions());
    map.put("METHODDESC-SelectMethodDescriptions", MESSAGES.SelectMethodDescriptions());
    map.put("METHODDESC-SelectSQLAsyncMethodDescriptions", MESSAGES.SelectSQLAsyncMethodDescriptions());
    map.put("METHODDESC-SelectSQLMethodDescriptions", MESSAGES.SelectSQLMethodDescriptions());
    map.put("METHODDESC-TableCountMethodDescriptions", MESSAGES.TableCountMethodDescriptions());
    map.put("METHODDESC-TableExistsMethodDescriptions", MESSAGES.TableExistsMethodDescriptions());
    map.put("METHODDESC-TableNamesMethodDescriptions", MESSAGES.TableNamesMethodDescriptions());
    map.put("METHODDESC-TableRowCountMethodDescriptions", MESSAGES.TableRowCountMethodDescriptions());
    map.put("METHODDESC-UpdateAsyncMethodDescriptions", MESSAGES.UpdateAsyncMethodDescriptions());
    map.put("METHODDESC-UpdateMethodDescriptions", MESSAGES.UpdateMethodDescriptions());


    /* Categories */

    map.put("CATEGORY-Extension", MESSAGES.extensionComponentPallette());
  return map;
  }
}
