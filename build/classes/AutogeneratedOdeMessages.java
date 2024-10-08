// THIS FILE IS AUTOMATICALLY GENERATED DURING COMPILATION.
// DO NOT EDIT THIS FILE. ANY CHANGES WILL BE OVERWRITTEN.

package com.google.appinventor.client;

import com.google.gwt.i18n.client.Messages;

public interface AutogeneratedOdeMessages extends Messages {

  /* Components */
  @DefaultMessage("SQLite")
  @Description("")
  String sQLiteComponentPallette();

  @DefaultMessage("SQLite database interface.")
  @Description("")
  String SQLiteHelpStringComponentPallette();


  /* Properties */
  @DefaultMessage("DBName")
  @Description("")
  String DBNameProperties();

  @DefaultMessage("DBVersion")
  @Description("")
  String DBVersionProperties();

  @DefaultMessage("DebugDialog")
  @Description("")
  String DebugDialogProperties();

  @DefaultMessage("DebugToast")
  @Description("")
  String DebugToastProperties();

  @DefaultMessage("ReturnColumnNames")
  @Description("")
  String ReturnColumnNamesProperties();


  /* Methods */
  @DefaultMessage("BeginTransaction")
  @Description("")
  String BeginTransactionMethods();

  @DefaultMessage("CloseDatabase")
  @Description("")
  String CloseDatabaseMethods();

  @DefaultMessage("CommitTransaction")
  @Description("")
  String CommitTransactionMethods();

  @DefaultMessage("DatabaseExists")
  @Description("")
  String DatabaseExistsMethods();

  @DefaultMessage("DatabasePath")
  @Description("")
  String DatabasePathMethods();

  @DefaultMessage("Delete")
  @Description("")
  String DeleteMethods();

  @DefaultMessage("DeleteAsync")
  @Description("")
  String DeleteAsyncMethods();

  @DefaultMessage("DeleteDatabase")
  @Description("")
  String DeleteDatabaseMethods();

  @DefaultMessage("Execute")
  @Description("")
  String ExecuteMethods();

  @DefaultMessage("ExecuteAsync")
  @Description("")
  String ExecuteAsyncMethods();

  @DefaultMessage("ExecuteFile")
  @Description("")
  String ExecuteFileMethods();

  @DefaultMessage("ExecuteFileAsync")
  @Description("")
  String ExecuteFileAsyncMethods();

  @DefaultMessage("ExportDatabase")
  @Description("")
  String ExportDatabaseMethods();

  @DefaultMessage("ImportDatabase")
  @Description("")
  String ImportDatabaseMethods();

  @DefaultMessage("ImportDatabaseASync")
  @Description("")
  String ImportDatabaseASyncMethods();

  @DefaultMessage("Insert")
  @Description("")
  String InsertMethods();

  @DefaultMessage("InsertAsync")
  @Description("")
  String InsertAsyncMethods();

  @DefaultMessage("InsertFile")
  @Description("")
  String InsertFileMethods();

  @DefaultMessage("InsertFileAsync")
  @Description("")
  String InsertFileAsyncMethods();

  @DefaultMessage("IsDatabaseOpen")
  @Description("")
  String IsDatabaseOpenMethods();

  @DefaultMessage("ListFixer")
  @Description("")
  String ListFixerMethods();

  @DefaultMessage("OpenDatabase")
  @Description("")
  String OpenDatabaseMethods();

  @DefaultMessage("Replace")
  @Description("")
  String ReplaceMethods();

  @DefaultMessage("ReplaceAsync")
  @Description("")
  String ReplaceAsyncMethods();

  @DefaultMessage("RollbackTransaction")
  @Description("")
  String RollbackTransactionMethods();

  @DefaultMessage("Select")
  @Description("")
  String SelectMethods();

  @DefaultMessage("SelectAsync")
  @Description("")
  String SelectAsyncMethods();

  @DefaultMessage("SelectSQL")
  @Description("")
  String SelectSQLMethods();

  @DefaultMessage("SelectSQLAsync")
  @Description("")
  String SelectSQLAsyncMethods();

  @DefaultMessage("TableCount")
  @Description("")
  String TableCountMethods();

  @DefaultMessage("TableExists")
  @Description("")
  String TableExistsMethods();

  @DefaultMessage("TableNames")
  @Description("")
  String TableNamesMethods();

  @DefaultMessage("TableRowCount")
  @Description("")
  String TableRowCountMethods();

  @DefaultMessage("Update")
  @Description("")
  String UpdateMethods();

  @DefaultMessage("UpdateAsync")
  @Description("")
  String UpdateAsyncMethods();


  /* Events */
  @DefaultMessage("AfterDelete")
  @Description("")
  String AfterDeleteEvents();

  @DefaultMessage("AfterExecute")
  @Description("")
  String AfterExecuteEvents();

  @DefaultMessage("AfterExecuteFile")
  @Description("")
  String AfterExecuteFileEvents();

  @DefaultMessage("AfterInsert")
  @Description("")
  String AfterInsertEvents();

  @DefaultMessage("AfterInsertFile")
  @Description("")
  String AfterInsertFileEvents();

  @DefaultMessage("AfterReplace")
  @Description("")
  String AfterReplaceEvents();

  @DefaultMessage("AfterSelect")
  @Description("")
  String AfterSelectEvents();

  @DefaultMessage("AfterUpdate")
  @Description("")
  String AfterUpdateEvents();

  @DefaultMessage("DatabaseClosed")
  @Description("")
  String DatabaseClosedEvents();

  @DefaultMessage("DatabaseCreated")
  @Description("")
  String DatabaseCreatedEvents();

  @DefaultMessage("DatabaseDowngrade")
  @Description("")
  String DatabaseDowngradeEvents();

  @DefaultMessage("DatabaseOpened")
  @Description("")
  String DatabaseOpenedEvents();

  @DefaultMessage("DatabaseUpgrade")
  @Description("")
  String DatabaseUpgradeEvents();

  @DefaultMessage("Imported")
  @Description("")
  String ImportedEvents();

  @DefaultMessage("SQLError")
  @Description("")
  String SQLErrorEvents();

  @DefaultMessage("This event fires after an asynchronous Delete call. The tag specified in the original call and the number of deleted rows are provided.")
  @Description("")
  String AfterDeleteEventDescriptions();

  @DefaultMessage("This event fires after an ExecuteSQLAsync call. The tag specified in the original call and the result of the execution are provided.")
  @Description("")
  String AfterExecuteEventDescriptions();

  @DefaultMessage("This event fires after an ExecuteFileAsync. The tag specified in the original call and the result of the execution are provided.")
  @Description("")
  String AfterExecuteFileEventDescriptions();

  @DefaultMessage("This event fires after an asynchronous Insert call. The tag specified in the original call and the row ID of the new row are provided.")
  @Description("")
  String AfterInsertEventDescriptions();

  @DefaultMessage("This event fires after an asynchronous InsertFile call. The tag specified in the original call and the count of inserted rows are provided.")
  @Description("")
  String AfterInsertFileEventDescriptions();

  @DefaultMessage("This event fires after an asynchronous Replace call. The tag specified in the original call and the row ID of the new or updated row are provided.")
  @Description("")
  String AfterReplaceEventDescriptions();

  @DefaultMessage("This event fires after an asynchronous Select call. The tag specified in the original call, the number of returned rows, and the result rows are provided.")
  @Description("")
  String AfterSelectEventDescriptions();

  @DefaultMessage("This event fires after an asynchronous Update call. The tag specified in the original call and the number of changed rows are provided.")
  @Description("")
  String AfterUpdateEventDescriptions();

  @DefaultMessage("Begins a transaction on an open database. Nested transactions are supported.")
  @Description("")
  String BeginTransactionMethodDescriptions();

  @DefaultMessage("Closes the database. If the database is already closed, nothing happens. Any uncommited transactions will be rolled back.")
  @Description("")
  String CloseDatabaseMethodDescriptions();

  @DefaultMessage("Commits the last open transaction.")
  @Description("")
  String CommitTransactionMethodDescriptions();

  @DefaultMessage("Specifies the name of the database.")
  @Description("")
  String DBNamePropertyDescriptions();

  @DefaultMessage("Specified the version of the database.")
  @Description("")
  String DBVersionPropertyDescriptions();

  @DefaultMessage("This event fires when the database is closed.")
  @Description("")
  String DatabaseClosedEventDescriptions();

  @DefaultMessage("This event fires when the database is created.")
  @Description("")
  String DatabaseCreatedEventDescriptions();

  @DefaultMessage("This event fires when the database is downgraded. The previous and new version numbers are provided. Use this event to modify the database as required by the version change.")
  @Description("")
  String DatabaseDowngradeEventDescriptions();

  @DefaultMessage("Returns true if the database file exists, false otherwise.")
  @Description("")
  String DatabaseExistsMethodDescriptions();

  @DefaultMessage("This event fires when the database is opened.")
  @Description("")
  String DatabaseOpenedEventDescriptions();

  @DefaultMessage("Returns the full path to the database, even if it doesn''t exist yet.")
  @Description("")
  String DatabasePathMethodDescriptions();

  @DefaultMessage("This event fires when the database is upgraded. The previous and new version numbers are provided. Use this event to modify the database as required by the version change.")
  @Description("")
  String DatabaseUpgradeEventDescriptions();

  @DefaultMessage("Specifies whether debug messages should be displayed in dialogs.")
  @Description("")
  String DebugDialogPropertyDescriptions();

  @DefaultMessage("Specifies whether debug messages should be displayed as Toast messages.")
  @Description("")
  String DebugToastPropertyDescriptions();

  @DefaultMessage("Executes a SQL DELETE statement. The tag identifies the result of this call in the AfterDelete event. See Delete for more information.")
  @Description("")
  String DeleteAsyncMethodDescriptions();

  @DefaultMessage("Deletes a closed database. This deletes the database file permanently.")
  @Description("")
  String DeleteDatabaseMethodDescriptions();

  @DefaultMessage("Executes a SQL DELETE statement. There whereClause is optional. All rows in the table will be deleted if no whereClause is specified. Each bind parameter replaces the corresponding ''?'' in whereClause. Returns the number of rows affected if a whereClause is passed in, 0 otherwise.If an error occurs or the database is not open, -1 is returned.")
  @Description("")
  String DeleteMethodDescriptions();

  @DefaultMessage("Execute a single, parameterized SQL statement that is NOT a SELECT and returns whether or not it succeeded. The tag identifies the result of this call in the AfterExecute event. See ExecParamSQL for more information.")
  @Description("")
  String ExecuteAsyncMethodDescriptions();

  @DefaultMessage("Executes multiple SQL statements from a file, asynchronously. The tag identifies the result of this call in the AfterExecuteFile event. See ExecFile for more information.")
  @Description("")
  String ExecuteFileAsyncMethodDescriptions();

  @DefaultMessage("Executes multiple SQL statements from a file and returns the count of statements successfully executed. Each line of the file should be a complete non-SELECT SQL statement, optionally followed by a semicolon. Single line (--) and multiline (/*...*/) comments are ignored. Line continuation using '''' is supported. ''n'' are replaced with actual newlines. Execution stops at the first error. If the database is not open, -1 is returned. Prefix the filename with / to read from a specific file on the SD card. To read assets packaged with an application (also works for the Companion) start the filename with // (two slashes). If a filename does not start with a slash, it will be read from the applications private storage (for packaged apps) and from /sdcard/AppInventor/data for the Companion.")
  @Description("")
  String ExecuteFileMethodDescriptions();

  @DefaultMessage("Execute a single, parameterized SQL statement that is NOT a SELECT and returns whether or not it succeeded. Each bind parameter replaces the corresponding ''?'' in WHERE clause in the query. If the database is not open, false is returned.")
  @Description("")
  String ExecuteMethodDescriptions();

  @DefaultMessage("Exports the currently closed database to the specified file. The resulting file is a complete SQLite database.Returns true if the import was successful, false otherwise.")
  @Description("")
  String ExportDatabaseMethodDescriptions();

  @DefaultMessage("Imports a SQLite database completely replacing the currently closed database. Returns true if the import was successful, false otherwise.")
  @Description("")
  String ImportDatabaseASyncMethodDescriptions();

  @DefaultMessage("Imports a SQLite database completely replacing the currently closed database. Returns true if the import was successful, false otherwise.")
  @Description("")
  String ImportDatabaseMethodDescriptions();

  @DefaultMessage("Event indicating that import of the DB filename has finished.")
  @Description("")
  String ImportedEventDescriptions();

  @DefaultMessage("Executes a SQL INSERT statement, asynchronously. The tag identifies the result of this call in the AfterInsert event. See Insert for more information.")
  @Description("")
  String InsertAsyncMethodDescriptions();

  @DefaultMessage("Inserts multiple rows of data from a file into a table, asynchronously. The tag identifies the result of this call in the AfterInsertFile event. See InsertFile for more information.")
  @Description("")
  String InsertFileAsyncMethodDescriptions();

  @DefaultMessage("Inserts multiple rows of data from a file into a table. The first line of the file should be a CSV list of the column names. Each of the remaining lines should be a CSV list of values for each new row. Empty lines are ignored. Line continuation using '''' is supported. ''n'' are replaced with actual newlines. Insertion stops at the first error. If the database is not open, -1 is returned. Prefix the filename with / to read from a specific file on the SD card. To read assets packaged with an application (also works for the Companion) start the filename with // (two slashes). If a filename does not start with a slash, it will be read from the applications private storage (for packaged apps) and from /sdcard/AppInventor/data for the Companion.")
  @Description("")
  String InsertFileMethodDescriptions();

  @DefaultMessage("Executes a SQL INSERT statement. columns contains a list of column names. values contains a list of column values. Returns the row ID of the newly inserted row. If the error occurs or the database is not open, -1 is returned.")
  @Description("")
  String InsertMethodDescriptions();

  @DefaultMessage("Returns true if the database is open, false otherwise.")
  @Description("")
  String IsDatabaseOpenMethodDescriptions();

  @DefaultMessage("fixes multi-column lists from SELECT")
  @Description("")
  String ListFixerMethodDescriptions();

  @DefaultMessage("Opens the database. If the database is already open, nothing happens.")
  @Description("")
  String OpenDatabaseMethodDescriptions();

  @DefaultMessage("Executes a SQL REPLACE statement, asynchronously. The tag identifies the result of this call in the AfterReplace event. See Replace for more information.")
  @Description("")
  String ReplaceAsyncMethodDescriptions();

  @DefaultMessage("Executes a SQL REPLACE statement. columns contains a list of column names. values contains a list of column values. Returns the row ID of the newly inserted or updated row. If the error occurs or the database is not open, -1 is returned.")
  @Description("")
  String ReplaceMethodDescriptions();

  @DefaultMessage("Specifies whether lists of results will contain column names. See the query blocks for more information.")
  @Description("")
  String ReturnColumnNamesPropertyDescriptions();

  @DefaultMessage("Rolls back the last open transaction.")
  @Description("")
  String RollbackTransactionMethodDescriptions();

  @DefaultMessage("This event fires when a SQL error occurs. The error message is provided.")
  @Description("")
  String SQLErrorEventDescriptions();

  @DefaultMessage("Executes a SQL SELECT statement, asynchronously. The tag identifies the result of this call in the AfterSelect event. See Select for more information.")
  @Description("")
  String SelectAsyncMethodDescriptions();

  @DefaultMessage("Executes a SQL SELECT statement. There whereClause is optional. All rows in the table will be returned if no whereClause is specified. Each bind parameter replaces the corresponding ''?'' in whereClause. groupBy is optional. If not specified, no grouping will be performed. having is optional. If not specified, all row groups will be returned. orderBy is optional. If not specified, rows will be returned unordered. limit is optional. If not specified, all matching rows will be returned. If selecting only a single column, each element in the returned list is the value of that column for each result row. If selecting multiple columns, each element of the returned list is itself a list of values for each selected column. If the ReturnColumnNames option is true, each column value will be a two element list where the first element is the column name and the second element is the column value. See SelectRawSQL for more information on the returned list.")
  @Description("")
  String SelectMethodDescriptions();

  @DefaultMessage("Execute a single, parameterized SQL SELECT statement, asynchronously. The tag identifies the result of this call in the AfterSelect event. See SelectSQL for more information.")
  @Description("")
  String SelectSQLAsyncMethodDescriptions();

  @DefaultMessage("Execute a single, parameterized SQL SELECT statement and returns a list of records. Each bind parameter replaces the corresponding ''?'' in WHERE clause in the query. If selecting only a single column, each element in the returned list is the value of that column for each result row. If selecting multiple columns, each element of the returned list is itself a list of values for each selected column. If the ReturnColumnNames option is true, each column value will be a two element list where the first element is the column name and the second element is the column value. If the database is not open, an empty list is returned.")
  @Description("")
  String SelectSQLMethodDescriptions();

  @DefaultMessage("Returns the number of tables in the database, or -1 if an error occurs or the database is not open.")
  @Description("")
  String TableCountMethodDescriptions();

  @DefaultMessage("Returns true if the table exists in the database, or false if the table does not exist or an error occurs or the database is not open.")
  @Description("")
  String TableExistsMethodDescriptions();

  @DefaultMessage("Returns a list of names of the tables in the database, or an empty list if an error occurs or the database is not open.")
  @Description("")
  String TableNamesMethodDescriptions();

  @DefaultMessage("Returns the number of rows in a table, or -1 if an error occurs or the database is not open.")
  @Description("")
  String TableRowCountMethodDescriptions();

  @DefaultMessage("Executes a SQL UPDATE statement, asynchronously. The tag identifies the result of this call in the AfterUpdate event. See Update for more information.")
  @Description("")
  String UpdateAsyncMethodDescriptions();

  @DefaultMessage("Executes a SQL UPDATE statement. columns contains a list of column names. values contains a list of column values. There whereClause is optional. All rows in the table will be updated if no whereClause is specified. Each bind parameter replaces the corresponding ''?'' in whereClause. Returns the number of rows affected.If an error occurs or the database is not open, -1 is returned.")
  @Description("")
  String UpdateMethodDescriptions();


  /* Parameters */
  @DefaultMessage("aList")
  @Description("")
  String aListParams();

  @DefaultMessage("bindParams")
  @Description("")
  String bindParamsParams();

  @DefaultMessage("columns")
  @Description("")
  String columnsParams();

  @DefaultMessage("distinct")
  @Description("")
  String distinctParams();

  @DefaultMessage("execCount")
  @Description("")
  String execCountParams();

  @DefaultMessage("fileName")
  @Description("")
  String fileNameParams();

  @DefaultMessage("groupBy")
  @Description("")
  String groupByParams();

  @DefaultMessage("having")
  @Description("")
  String havingParams();

  @DefaultMessage("limit")
  @Description("")
  String limitParams();

  @DefaultMessage("message")
  @Description("")
  String messageParams();

  @DefaultMessage("newVersion")
  @Description("")
  String newVersionParams();

  @DefaultMessage("oldVersion")
  @Description("")
  String oldVersionParams();

  @DefaultMessage("orderBy")
  @Description("")
  String orderByParams();

  @DefaultMessage("response")
  @Description("")
  String responseParams();

  @DefaultMessage("result")
  @Description("")
  String resultParams();

  @DefaultMessage("rowCount")
  @Description("")
  String rowCountParams();

  @DefaultMessage("rowId")
  @Description("")
  String rowIdParams();

  @DefaultMessage("rows")
  @Description("")
  String rowsParams();

  @DefaultMessage("sql")
  @Description("")
  String sqlParams();

  @DefaultMessage("successful")
  @Description("")
  String successfulParams();

  @DefaultMessage("table")
  @Description("")
  String tableParams();

  @DefaultMessage("tag")
  @Description("")
  String tagParams();

  @DefaultMessage("values")
  @Description("")
  String valuesParams();

  @DefaultMessage("whereClause")
  @Description("")
  String whereClauseParams();


  /* Component Categories */
  @DefaultMessage("Extension")
  @Description("")
  String extensionComponentPallette();


  /* Property Categories */
  @DefaultMessage("Appearance")
  @Description("")
  String AppearancePropertyCategory();

  @DefaultMessage("Behavior")
  @Description("")
  String BehaviorPropertyCategory();

  @DefaultMessage("Unspecified")
  @Description("")
  String UnspecifiedPropertyCategory();

}
