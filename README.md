# Personal_Financial_Management
PFM project using Spring Boot, RDBMS, REST API, and Docker

# Directory Structure
Account
	Adapter
		in
		out				
	Application
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
				DepositTransactionPort
				TransferTransactionPort
				WithdrawTransactionPort
				CategoryReportPort
				TagReportPort
				TransactionReportPort			
			out
				LoadAccountPort
				UpdateAccountStatePort
	Common
		Adapter
		Service
		Validation
	
