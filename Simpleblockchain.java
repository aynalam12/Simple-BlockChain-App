public class Simpleblockchain {
    public static void main(String[] args) {
        BlockChain blockchain = new BlockChain(); 

        // Add blocks with transactions
        blockchain.addBlock(new String[]{"Transaction 1: User A pays User B"});
        blockchain.addBlock(new String[]{"Transaction 2: User C pays User D"});

        // Display the entire blockchain
        blockchain.displayChain();
    }
}
