
javac -d classes src/entity/AdvancedBooking.java
javac -d classes src/entity/Ticket.java
javac -d classes src/utility/TicketUtility.java

javac -d classes src/test/TicketUtilityTest.java

@REM need to compile every src file, can do like src/entity/* to run all, but cannot src/* cuz got diff subfolders