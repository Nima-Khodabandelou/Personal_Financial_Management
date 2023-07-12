# Personal_Financial_Management
PFM project using Spring Boot, RDBMS, REST API, and Docker

# Directory Structure
AssetAccount
	Adapter
		in
			Web
		out	
			Persistence			
	Core
		Domain
			Model		
				Account
					CashAccount
					ChequeAccount
					JointAccountWithPartner
					JointAccountWithBrother
					CryptoAccount
					InterestAccount
					LoanAccount
					StockAccount
				Label	
					CategoryLabel 
					TagLabel
			Service
				DepositTransactionService
				TransferTransactionService
				WithdrawTransactionService
				CategoryReportService
				TagReportService
				TransactionReportService
		Port
			in
				DepositTransaction
				TransferTransaction
				WithdrawTransaction
				CategoryReport
				TagReport
				TransactionReport		
			out
				UserRepository extends CrudRepository<Account, Integer>  {}
				LoadAccount
				UpdateAccount
	Shared
		Validation
		‍SpringConfig
		
- entity (what gets stored in DB) and repository (class interacting with DB to perform DB operations like get id, find name, ...) be in driven adapter
- models and business logic be in core
- work with spring data JPA: ex ->
EmployeeRepo extends CrudRepository<Employeeentity, Integer>
	
	
