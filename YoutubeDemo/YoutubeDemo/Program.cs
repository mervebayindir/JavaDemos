using System;

namespace YoutubeDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();

            //CreditManager creditManager = new CreditManager();
            //creditManager.Calculate();
            //creditManager.Save();

            //Customer customer = new Customer();// örneğini oluşturmak, instance oluşturmak
            //customer.Id = 1;
            //customer.City = "Antalya";


            //CustomerManager customerManager = new CustomerManager(customer);
            //customerManager.Save();
            //customerManager.Delete();

            //Company company = new Company();
            //company.TaxNumber = "10000888";
            //company.CompanyName = "Arçelik";
            //company.Id = 100;

            //CustomerManager customerManager2 = new CustomerManager(new Company());


            //Person person = new Person();
            //person.FirstName = "Zümra";
            //person.NationalIdentity = "13456";

            //Customer c1 = new Customer();
            //Customer c2 = new Person();
            //Customer c3 = new Company();


            Console.ReadLine();
        }

    }
    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
    }
    interface ICreditManager
    {
        void Calculate();
        void Save();
    }
    abstract class BasecreditManager : ICreditManager
    {
        public abstract void Calculate();

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }
    class TeacherCreditManager : BasecreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        }
        public override void Save()
        {
            base.Save();
        }
    }
    class MilitaryCreditManager : BasecreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }
    }
    class CarCreditManager : BasecreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }

    }
    class Customer
    {
        public Customer()
        {
            Console.WriteLine("müşteri nesnesi baslatıldı");
        }
        public int Id { get; set; }
        public string City { get; set; }
    }
    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }
    class Company : Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }
    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri kaydedildi: ");

        }
        public void Delete()
        {
            Console.WriteLine("Müşteri silindi: ");

        }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }
    }

}
