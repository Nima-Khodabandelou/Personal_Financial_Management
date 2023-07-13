# Personal_Financial_Management
PFM project using Spring Boot, RDBMS, REST API, and Docker

# Directory Structure
AssetAccount
	Adapter
		in
			UI
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
				LoadAccount
				UpdateAccount
	Shared
		Validation
		SpringConfig		
