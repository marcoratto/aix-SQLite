---
layout: documentation
title: Extension
---

[&laquo; Back to index](index.html)
# Extension

Table of Contents:

* [SQLite](#SQLite)

## SQLite  {#SQLite}

Component for SQLite



### Properties  {#SQLite-Properties}

{:.properties}

{:id="SQLite.DBName" .text} *DBName*
: Name of the database.

{:id="SQLite.DBVersion" .number} *DBVersion*
: Version of the database.

{:id="SQLite.DebugDialog" .boolean} *DebugDialog*
: Display debugging messages as alerts.

{:id="SQLite.DebugToast" .boolean} *DebugToast*
: Display debugging messages as toast messages.

{:id="SQLite.ReturnColumnNames" .boolean} *ReturnColumnNames*
: Should result lists contain column names.

### Events  {#SQLite-Events}

{:.events}

{:id="SQLite.AfterDelete"} AfterDelete(*tag*{:.text},*rowCount*{:.number})
: This event fires after an asynchronous Delete call. The tag specified in the original call and the number of deleted rows are provided.

{:id="SQLite.AfterExecute"} AfterExecute(*tag*{:.text},*result*{:.boolean})
: This event fires after an ExecuteSQLAsync call. The tag specified in the original call and the result of the execution are provided.

{:id="SQLite.AfterExecuteFile"} AfterExecuteFile(*tag*{:.text},*execCount*{:.number})
: This event fires after an ExecuteFileAsync. The tag specified in the original call and the result of the execution are provided.

{:id="SQLite.AfterInsert"} AfterInsert(*tag*{:.text},*rowId*{:.number})
: This event fires after an asynchronous Insert call. The tag specified in the original call and the row ID of the new row are provided.

{:id="SQLite.AfterInsertFile"} AfterInsertFile(*tag*{:.text},*rowCount*{:.number})
: This event fires after an asynchronous InsertFile call. The tag specified in the original call and the count of inserted rows are provided.

{:id="SQLite.AfterReplace"} AfterReplace(*tag*{:.text},*rowId*{:.number})
: This event fires after an asynchronous Replace call. The tag specified in the original call and the row ID of the new or updated row are provided.

{:id="SQLite.AfterSelect"} AfterSelect(*tag*{:.text},*rowCount*{:.number},*rows*{:.list})
: This event fires after an asynchronous Select call. The tag specified in the original call, the number of returned rows, and the result rows are provided.

{:id="SQLite.AfterUpdate"} AfterUpdate(*tag*{:.text},*rowCount*{:.number})
: This event fires after an asynchronous Update call. The tag specified in the original call and the number of changed rows are provided.

{:id="SQLite.DatabaseClosed"} DatabaseClosed()
: This event fires when the database is closed.

{:id="SQLite.DatabaseCreated"} DatabaseCreated()
: This event fires when the database is created.

{:id="SQLite.DatabaseDowngrade"} DatabaseDowngrade(*oldVersion*{:.number},*newVersion*{:.number})
: This event fires when the database is downgraded. The previous and new version numbers are provided. Use this event to modify the database as required by the version change.

{:id="SQLite.DatabaseOpened"} DatabaseOpened()
: This event fires when the database is opened.

{:id="SQLite.DatabaseUpgrade"} DatabaseUpgrade(*oldVersion*{:.number},*newVersion*{:.number})
: This event fires when the database is upgraded. The previous and new version numbers are provided. Use this event to modify the database as required by the version change.

{:id="SQLite.Imported"} Imported(*successful*{:.boolean},*response*{:.text})
: Event indicating that import of the DB filename has finished.

{:id="SQLite.SQLError"} SQLError(*message*{:.text})
: This event fires when a SQL error occurs. The error message is provided.

### Methods  {#SQLite-Methods}

{:.methods}

{:id="SQLite.BeginTransaction" class="method"} <i/> BeginTransaction()
: Begin a transaction.

{:id="SQLite.CloseDatabase" class="method"} <i/> CloseDatabase()
: Closes the database.

{:id="SQLite.CommitTransaction" class="method"} <i/> CommitTransaction()
: Commit a transaction.

{:id="SQLite.DatabaseExists" class="method returns boolean"} <i/> DatabaseExists()
: Returns true if the database file exists, false otherwise.

{:id="SQLite.DatabasePath" class="method returns text"} <i/> DatabasePath()
: Returns the path to the database.

{:id="SQLite.Delete" class="method returns number"} <i/> Delete(*table*{:.text},*whereClause*{:.text},*bindParams*{:.list})
: Executes a SQL DELETE statement.

{:id="SQLite.DeleteAsync" class="method"} <i/> DeleteAsync(*tag*{:.text},*table*{:.text},*whereClause*{:.text},*bindParams*{:.list})
: Executes a SQL DELETE statement, asynchronously.

{:id="SQLite.DeleteDatabase" class="method"} <i/> DeleteDatabase()
: Delete the database.

{:id="SQLite.Execute" class="method returns boolean"} <i/> Execute(*sql*{:.text},*bindParams*{:.list})
: Execute a single, parameterized SQL statement that is NOT a SELECT.

{:id="SQLite.ExecuteAsync" class="method"} <i/> ExecuteAsync(*tag*{:.text},*sql*{:.text},*bindParams*{:.list})
: Execute a single, parameterized SQL statement that is NOT a SELECT, asynchronously.

{:id="SQLite.ExecuteFile" class="method returns number"} <i/> ExecuteFile(*fileName*{:.text})
: Execute multiple SQL statements from a file.

{:id="SQLite.ExecuteFileAsync" class="method"} <i/> ExecuteFileAsync(*tag*{:.text},*fileName*{:.text})
: Execute multiple SQL statements from a file, asynchronously.

{:id="SQLite.ExportDatabase" class="method returns boolean"} <i/> ExportDatabase(*fileName*{:.text})
: Exports the database.
 This is probably not best done on the main thread.

{:id="SQLite.ImportDatabase" class="method returns boolean"} <i/> ImportDatabase(*fileName*{:.text})
: Import a SQLite database file.
 This is probably not best done on the main thread.

{:id="SQLite.ImportDatabaseASync" class="method"} <i/> ImportDatabaseASync(*fileName*{:.text})
: Import a SQLite database file.
 This is probably not best done on the main thread.

{:id="SQLite.Insert" class="method returns number"} <i/> Insert(*table*{:.text},*columns*{:.list},*values*{:.list})
: Executes a SQL INSERT statement.

{:id="SQLite.InsertAsync" class="method"} <i/> InsertAsync(*tag*{:.text},*table*{:.text},*columns*{:.list},*values*{:.list})
: Executes a SQL INSERT statement, asynchronously.

{:id="SQLite.InsertFile" class="method returns number"} <i/> InsertFile(*table*{:.text},*fileName*{:.text})
: Inserts rows from a file.

{:id="SQLite.InsertFileAsync" class="method"} <i/> InsertFileAsync(*tag*{:.text},*table*{:.text},*fileName*{:.text})
: Inserts rows from a file, asynchronously.

{:id="SQLite.IsDatabaseOpen" class="method returns boolean"} <i/> IsDatabaseOpen()
: Indicates if the database has been opened or not.

{:id="SQLite.ListFixer" class="method returns any"} <i/> ListFixer(*aList*{:.list})
: fixes multi-column lists from SELECT

{:id="SQLite.OpenDatabase" class="method"} <i/> OpenDatabase()
: Opens the database.

{:id="SQLite.Replace" class="method returns number"} <i/> Replace(*table*{:.text},*columns*{:.list},*values*{:.list})
: Executes a SQL REPLACE statement.

{:id="SQLite.ReplaceAsync" class="method"} <i/> ReplaceAsync(*tag*{:.text},*table*{:.text},*columns*{:.list},*values*{:.list})
: Executes a SQL REPLACE statement, asynchronously.

{:id="SQLite.RollbackTransaction" class="method"} <i/> RollbackTransaction()
: Rollback a transaction.

{:id="SQLite.Select" class="method returns list"} <i/> Select(*table*{:.text},*distinct*{:.boolean},*columns*{:.list},*whereClause*{:.text},*bindParams*{:.list},*groupBy*{:.text},*having*{:.text},*orderBy*{:.text},*limit*{:.text})
: Executes a SQL SELECT statement.

{:id="SQLite.SelectAsync" class="method"} <i/> SelectAsync(*tag*{:.text},*table*{:.text},*distinct*{:.boolean},*columns*{:.list},*whereClause*{:.text},*bindParams*{:.list},*groupBy*{:.text},*having*{:.text},*orderBy*{:.text},*limit*{:.text})
: Executes a SQL SELECT statement, asynchronously.

{:id="SQLite.SelectSQL" class="method returns list"} <i/> SelectSQL(*sql*{:.text},*bindParams*{:.list})
: Execute a single, parameterized SQL SELECT statement and returns a list of records.

{:id="SQLite.SelectSQLAsync" class="method"} <i/> SelectSQLAsync(*tag*{:.text},*sql*{:.text},*bindParams*{:.list})
: Execute a single, parameterized SQL SELECT statement, asynchronously.

{:id="SQLite.TableCount" class="method returns number"} <i/> TableCount()
: Returns the number of tables in the database.

{:id="SQLite.TableExists" class="method returns boolean"} <i/> TableExists(*table*{:.text})
: Returns true if the table exists in the database, false otherwise.

{:id="SQLite.TableNames" class="method returns list"} <i/> TableNames()
: Returns a list of names of the tables in the the database.

{:id="SQLite.TableRowCount" class="method returns number"} <i/> TableRowCount(*table*{:.text})
: Returns the number of records in a table.

{:id="SQLite.Update" class="method returns number"} <i/> Update(*table*{:.text},*columns*{:.list},*values*{:.list},*whereClause*{:.text},*bindParams*{:.list})
: Executes a SQL UPDATE statement.

{:id="SQLite.UpdateAsync" class="method"} <i/> UpdateAsync(*tag*{:.text},*table*{:.text},*columns*{:.list},*values*{:.list},*whereClause*{:.text},*bindParams*{:.list})
: Executes a SQL UPDATE statement, asynchronously.
